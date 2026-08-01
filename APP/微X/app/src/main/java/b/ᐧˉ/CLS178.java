// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS178 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1727;
    public final CLS1065 FLD1728;

    public CLS178(CLS1065 יᴵ0, int v) {
        this.FLD1727 = v;
        this.FLD1728 = יᴵ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS1065 יᴵ0 = this.FLD1728;
        switch(this.FLD1727) {
            case 0: {
                יᴵ0.getClass();
                יᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "prevent_msg_recall");
                return;
            }
            case 1: {
                יᴵ0.getClass();
                יᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "prevent_moments_recall");
                return;
            }
            case 2: {
                יᴵ0.getClass();
                יᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "show_moment_deleted_tag");
                return;
            }
            case 3: {
                יᴵ0.getClass();
                יᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "prevent_comments_recall");
                return;
            }
            case 4: {
                יᴵ0.getClass();
                יᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "show_comment_deleted_tag");
                return;
            }
            case 5: {
                יᴵ0.getClass();
                יᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "show_recalled_hint");
                return;
            }
            case 6: {
                יᴵ0.getClass();
                יᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "show_content");
                return;
            }
            case 7: {
                יᴵ0.getClass();
                יᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "keep_self_recall");
                return;
            }
            default: {
                יᴵ0.getClass();
                יᴵ0.FLD2151.MTH922(Boolean.valueOf(z), "autorecall");
            }
        }
    }
}

