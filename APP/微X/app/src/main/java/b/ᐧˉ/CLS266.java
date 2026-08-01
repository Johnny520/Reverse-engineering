// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS266 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2806;
    public final CLS997 FLD2807;

    public CLS266(CLS997 ˋ0, int v) {
        this.FLD2806 = v;
        this.FLD2807 = ˋ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS997 ˋ0 = this.FLD2807;
        switch(this.FLD2806) {
            case 0: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "snsMenuItemAltModeEnable");
                return;
            }
            case 1: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "remove_mention_limit_enable");
                return;
            }
            case 2: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "sns_export_enable");
                return;
            }
            case 3: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_export_sns_shortcut");
                return;
            }
            case 4: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "sns_auto_export_enable");
                return;
            }
            case 5: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "moments_container_enable");
                return;
            }
            case 6: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "comment_unread");
                return;
            }
            case 7: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "moments_container_remember_selected");
                return;
            }
            case 8: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_del_sns_shortcut");
                return;
            }
            case 9: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "clear_failed_comments_shortcut");
                return;
            }
            case 10: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_like_sns_shortcut");
                return;
            }
            case 11: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_forward_sns_shortcut");
                return;
            }
            case 12: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_repeat_sns_enable");
                return;
            }
            case 13: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "sns_block_enable");
                return;
            }
            case 14: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_repeat_sns_shortcut");
                return;
            }
            case 15: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "post_auto_clean_moment_shortcut");
                return;
            }
            case 16: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "moments_post_message_enable");
                return;
            }
            case 17: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "moment_data_autoplay");
                return;
            }
            case 18: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "moment_wifi_autoplay");
                return;
            }
            case 19: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "sns_save");
                return;
            }
            case 20: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "moment_original_image");
                return;
            }
            case 21: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "fake_moment_forward_enable");
                return;
            }
            case 22: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "sns_sync_enable");
                return;
            }
            case 23: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "timeline_sync_enable");
                return;
            }
            case 24: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "enable_moment_filter");
                return;
            }
            case 25: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "enable_moment_deleted_filter");
                return;
            }
            case 26: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "enable_moment_link_filter");
                return;
            }
            case 27: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "enable_moment_link_title_filter");
                return;
            }
            case 28: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "enable_moment_comments_filter");
                return;
            }
            default: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(Boolean.valueOf(z), "enable_moment_gamescores_filter");
            }
        }
    }
}

