// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView;
import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.ⁱʾ.CLS369;
import java.util.HashMap;

public final class CLS433 implements AdapterView.OnItemClickListener {
    public final int FLD4170;
    public final Object FLD4171;
    public final Activity FLD4172;
    public final CLS369 FLD4173;
    public final Object FLD4174;
    public final Object FLD4175;

    public CLS433(CLS369 ﾞᵎ0, String[] arr_s, CLS12 ᵔʾ0, String s, Activity activity0) {
        this.FLD4170 = 1;
        super();
        this.FLD4173 = ﾞᵎ0;
        this.FLD4174 = arr_s;
        this.FLD4171 = ᵔʾ0;
        this.FLD4175 = s;
        this.FLD4172 = activity0;
    }

    public CLS433(HashMap hashMap0, CLS369 ﾞᵎ0, AlertDialog[] arr_alertDialog, CLS3 ˆٴ0, Activity activity0) {
        this.FLD4170 = 0;
        super();
        this.FLD4174 = hashMap0;
        this.FLD4173 = ﾞᵎ0;
        this.FLD4171 = arr_alertDialog;
        this.FLD4175 = ˆٴ0;
        this.FLD4172 = activity0;
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.AdapterView$OnItemClickListener
    public final void onItemClick(AdapterView adapterView0, View view0, int v, long v1) {
        Object object0 = this.FLD4174;
        Activity activity0 = this.FLD4172;
        CLS369 ﾞᵎ0 = this.FLD4173;
        Object object1 = this.FLD4175;
        Object object2 = this.FLD4171;
        if(this.FLD4170 == 0) {
            String s = (String)((HashMap)object0).get(ﾞᵎ0.getItem(v));
            Intent intent0 = new Intent();
            intent0.putExtra("Chat_Mode", 1);
            intent0.putExtra("Chat_User", s);
            AlertDialog alertDialog0 = ((AlertDialog[])object2)[0];
            if(alertDialog0 != null) {
                alertDialog0.dismiss();
            }
            if(((CLS3)object1) != null) {
                ((CLS3)object1).MTH774();
            }
            if(!CLS66.MTH1502(intent0, ".ui.chatting.ChattingUI")) {
                intent0.setClassName(CLS390.MTH5619(activity0), CLS27.MTH897("ChattingUI"));
                activity0.startActivity(intent0);
            }
            return;
        }
        String[] arr_s = (String[])object0;
        CLS12 ᵔʾ0 = (CLS12)object2;
        String s1 = (String)object1;
        try {
            String s2 = (String)ﾞᵎ0.getItem(v);
            arr_s[0] = s2;
            if(ᵔʾ0 == null && TextUtils.isEmpty(s1)) {
                CLS443.MTH6309(activity0, s2);
                return;
            }
            ﾞᵎ0.FLD3463 = s2;
            ﾞᵎ0.notifyDataSetChanged();
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

