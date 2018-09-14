import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit {
  
  public activeBtn=true;
  public firstBtn:string;
  public secondBtn:string;
  public thirdBtn:string;
  public fourthBtn:string;
  public firstBtnValue:string;
  public secondBtnValue:string;
  public thirdBtnValue:string;
  public fourthBtnValue:string;
  public installment=1;
  public orderInfo:any=[];
  public productInstallment:number;
constructor(private http:HttpClient)
{
}
ngOnInit()
{

  this.http.get('http://localhost:8080/orderServices/rest/orderInfo/123232')
      .subscribe(data => this.orderInfo = data);
      this.installmentBtn(1);
}


installmentBtn(installment)
     {
     if(installment==1)
     {
       this.firstBtn="btn btn-success btn-sm paid-btn";
       this.secondBtn="btn btn-sm paid-btn paid-later disabled";
       this.thirdBtn="btn btn-sm paid-btn paid-later disabled";
      this.fourthBtn="btn btn-sm paid-btn paid-later disabled";
      this.firstBtnValue="Pay Now";
      this.secondBtnValue="Pay Later";
      this.thirdBtnValue="Pay Later";
      this.fourthBtnValue="Pay Later";
     } else if(installment==2)
     {
       this.firstBtn="btn btn-success btn-sm paid-btn disabled";
      this.secondBtn="btn btn-success btn-sm paid-btn";
      this.thirdBtn="btn btn-sm paid-btn paid-later disabled";
      this.fourthBtn="btn btn-sm paid-btn paid-later disabled";
      this.firstBtnValue="Paid";
      this.secondBtnValue="Pay Now";
      this.thirdBtnValue="Pay Later";
      this.fourthBtnValue="Pay Later";
     }else if(installment==3)
     {

      this.firstBtn="btn btn-success btn-sm paid-btn disabled";
      this.secondBtn="btn btn-success btn-sm paid-btn disabled";
      this.thirdBtn="btn btn-success btn-sm paid-btn";
      this.fourthBtn="btn btn-sm paid-btn paid-later disabled";
      this.firstBtnValue="Paid";
      this.secondBtnValue="Paid";
      this.thirdBtnValue="Pay Now";
      this.fourthBtnValue="Pay Later";
    }else if(installment==4)
     {
      this.firstBtn="btn btn-success btn-sm paid-btn disabled";
      this.secondBtn="btn btn-success btn-sm paid-btn disabled";
      this.thirdBtn="btn btn-success btn-sm paid-btn disabled";
      this.fourthBtn="btn btn-success btn-sm paid-btn";
      this.firstBtnValue="Paid";
      this.secondBtnValue="Paid";
      this.thirdBtnValue="Paid";
      this.fourthBtnValue="Pay Now";
     }
     else if(installment=="comp")
     {

      this.firstBtn="btn btn-success btn-sm paid-btn disabled";
      this.secondBtn="btn btn-success btn-sm paid-btn disabled";
      this.thirdBtn="btn btn-success btn-sm paid-btn disabled";
      this.fourthBtn="btn btn-success btn-sm paid-btn disabled";
      this.firstBtnValue="Paid";
      this.secondBtnValue="Paid";
      this.thirdBtnValue="Paid";
      this.fourthBtnValue="Paid";
     }
     else{
       alert("ZERO INSTALLMENT");
     }
     }
firstInstallment()
{
  this.installmentBtn(2);
}
secondInstallment()
{
  this.installmentBtn(3);
}
thirdInstallment()
{
  this.installmentBtn(4);
}
fourthInstallment()
{
  this.installmentBtn("comp");
}
 
 
}
