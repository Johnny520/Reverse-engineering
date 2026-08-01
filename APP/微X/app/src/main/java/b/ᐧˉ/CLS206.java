// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS206 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1976;
    public final CLS997 FLD1977;

    public CLS206(CLS997 ˋ0, int v) {
        this.FLD1976 = v;
        this.FLD1977 = ˋ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS997 ˋ0 = this.FLD1977;
        switch(this.FLD1976) {
            case 0: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "enable_block_snsad");
                return;
            }
            case 1: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "self_like_enable");
                return;
            }
            case 2: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "fake_comments_enable");
                return;
            }
            case 3: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "fakelikes_use_all_contacts");
                return;
            }
            case 4: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "fakelikes_random_sort");
                return;
            }
            case 5: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "selflikes_autoselect_enable");
                return;
            }
            case 6: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_comment_like_filter_enable");
                return;
            }
            case 7: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "like_only_once_per_day_enable");
                return;
            }
            case 8: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "like_only_on_already_liked");
                return;
            }
            case 9: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_like_allowed_filter_enable");
                return;
            }
            case 10: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_like_timeframe_enable");
                return;
            }
            case 11: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_like_enable");
                return;
            }
            case 12: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_comment_enable");
                return;
            }
            case 13: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "comment_only_once_per_day_enable");
                return;
            }
            case 14: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "comment_only_on_already_commented");
                return;
            }
            case 15: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_comment_allowed_filter_enable");
                return;
            }
            default: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_comment_timeframe_enable");
            }
        }
    }
}

