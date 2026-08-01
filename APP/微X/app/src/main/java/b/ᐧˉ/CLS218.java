// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.view.View.OnClickListener;
import android.view.View;
import b.ʾᵢ.CLS27;

public final class CLS218 implements View.OnClickListener {
    public final int FLD2134;
    public final CLS997 FLD2135;

    public CLS218(CLS997 ˋ0, int v) {
        this.FLD2134 = v;
        this.FLD2135 = ˋ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.view.View$OnClickListener
    public final void onClick(View view0) {
        CLS997 ˋ0 = this.FLD2135;
        if(this.FLD2134 == 0) {
            ˋ0.FLD1997.MTH3749(CLS27.MTH889("config_moments_post_message"), "_MOMENT_POST_MESSAGE_", true);
            return;
        }
        CLS210 ˋʼ0 = ˋ0.FLD1997;
        String s = CLS27.MTH889("config_auto_comment");
        ˋʼ0.FLD2016 = true;
        ˋʼ0.MTH3749(s, "_MOMENT_COMMENT_", false);
    }
}

