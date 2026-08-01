// Decompiled by JEB v5.42.0.202606242140

package t.ﾞᐧ;

import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.view.View;
import java.util.HashMap;
import java.util.LinkedHashMap;
import t.ʾᵢ.CLS10;
import t.ʾᵢ.CLS200;
import t.ʾᵢ.CLS216;
import t.ʾᵢ.CLS232;
import t.ˆʿ.CLS277;
import t.ˆʿ.CLS28;
import t.ˆʿ.CLS33;
import t.ˆʿ.CLS55;
import t.ˆʿ.CLS56;
import t.ˊﾞ.CLS99;
import t.ᵔʾ.CLS133;
import t.ⁱʾ.CLS141;
import t.ⁱʾ.CLS143;
import t.ﾞٴ.CLS155;
import t.ﾞٴ.CLS309;

public final class CLS165 implements View.OnClickListener {
    public final int FLD1133;
    public final Object FLD1134;
    public final Object FLD1135;

    public CLS165(Activity activity0, String s) {
        this.FLD1133 = 3;
        super();
        this.FLD1134 = activity0;
        this.FLD1135 = s;
    }

    public CLS165(Object object0, Object object1, int v) {
        this.FLD1133 = v;
        this.FLD1135 = object0;
        this.FLD1134 = object1;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        Object object0 = this.FLD1134;
        Object object1 = this.FLD1135;
        switch(this.FLD1133) {
            case 0: {
                ((CLS168)object1).getClass();
                CLS99 ˆٴ0 = new CLS99(((Activity)object0));
                LinkedHashMap linkedHashMap0 = ((CLS168)object1).FLD1179;
                for(Object object2: linkedHashMap0.keySet()) {
                    String s = (String)object2;
                    HashMap hashMap0 = ((CLS168)object1).FLD1178;
                    String s1 = hashMap0.containsKey(s) ? ((String)hashMap0.get(s)) : s;
                    CLS143 ˆٴ1 = (CLS143)linkedHashMap0.get(s);
                    ˆٴ0.FLD745.put(s1, s);
                    ˆٴ0.FLD744.put(s, ˆٴ1);
                }
                ˆٴ0.MTH1766();
                return;
            }
            case 1: {
                CLS309 ʽﹶ0 = (CLS309)object1;
                String s2 = (String)object0;
                ʽﹶ0.getClass();
                try {
                    Intent intent0 = new Intent();
                    intent0.putExtra("Chat_Mode", 1);
                    intent0.putExtra("Chat_User", s2);
                    if(!CLS33.MTH1347(intent0, ".ui.chatting.ChattingUI")) {
                        Activity activity0 = ((CLS155)ʽﹶ0).MTH2306();
                        intent0.setClassName(CLS56.MTH1484(activity0), CLS133.MTH2115("ChattingUI"));
                        activity0.startActivity(intent0);
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS133.MTH2113(throwable0);
                }
                return;
            }
            case 2: {
                ((CLS216)object1).getClass();
                CLS232 ـˋ0 = new CLS232(((CLS143)object0));
                if(((CLS216)object1).FLD236 != null) {
                    Activity activity1 = ((CLS10)(((CLS216)object1))).MTH1048();
                    String s3 = CLS133.MTH2099("SetTabLayout");
                    CLS200 ˊﾞ0 = new CLS200(((CLS216)object1), activity1, 6);
                    CLS55 ⁱˉ0 = new CLS55(activity1, s3);
                    ⁱˉ0.FLD514 = ˊﾞ0;
                    ⁱˉ0.FLD523 = null;
                    ⁱˉ0.FLD515 = new CLS277(((CLS141)ـˋ0), 0);
                    ⁱˉ0.FLD513 = ـˋ0;
                    ⁱˉ0.show();
                }
                return;
            }
            default: {
                CLS28.MTH1314(((Activity)object0), ((String)object1));
                CLS28.MTH1315(((Activity)object0), CLS133.MTH2099("copy_to_clipboard"));
            }
        }
    }
}

