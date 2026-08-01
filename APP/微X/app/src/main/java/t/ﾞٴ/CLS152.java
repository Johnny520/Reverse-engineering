// Decompiled by JEB v5.42.0.202606242140

package t.ﾞٴ;

import android.view.View.OnLongClickListener;
import android.view.View;
import t.ˆʿ.CLS29;
import t.ˊﾞ.CLS99;
import t.ⁱʾ.CLS143;
import t.ﾞᐧ.CLS343;

public final class CLS152 implements View.OnLongClickListener {
    public final CLS309 FLD1048;
    public final String FLD1049;

    public CLS152(CLS309 ʽﹶ0, String s) {
        this.FLD1048 = ʽﹶ0;
        this.FLD1049 = s;
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnLongClickListener
    public final boolean onLongClick(View view0) {
        CLS309 ʽﹶ0 = this.FLD1048;
        CLS99 ˆٴ0 = new CLS99(((CLS155)ʽﹶ0).MTH2306());
        String s = this.FLD1049;
        ˆٴ0.MTH1765("chat_info", ((CLS143)new CLS324(ʽﹶ0, s, 0)));
        if(!CLS29.MTH1326(s)) {
            ˆٴ0.MTH1765("moments", ((CLS143)new CLS324(ʽﹶ0, s, 1)));
        }
        ˆٴ0.MTH1765("delete_conversation_keep_history", ((CLS143)new CLS343(s, 1)));
        ˆٴ0.MTH1766();
        return true;
    }
}

