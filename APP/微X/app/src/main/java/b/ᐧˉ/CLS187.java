// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS187 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD1788;
    public final CLS931 FLD1789;

    public CLS187(CLS931 ʼﹳ0, int v) {
        this.FLD1788 = v;
        this.FLD1789 = ʼﹳ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS931 ʼﹳ0 = this.FLD1789;
        switch(this.FLD1788) {
            case 0: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "forward_chat2sns");
                return;
            }
            case 1: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "forward_chat2chat");
                return;
            }
            case 2: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "share_chat");
                return;
            }
            case 3: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "forward_vid_audio");
                return;
            }
            case 4: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "voice_forward_enable");
                return;
            }
            case 5: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "multi_voice_forward_enable");
                return;
            }
            case 6: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "friendcard_forward_enable");
                return;
            }
            case 7: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "img_to_friend_forward_enable");
                return;
            }
            case 8: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "chat_schedule_forward");
                return;
            }
            case 9: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "broadcast_forward_enable");
                return;
            }
            case 10: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "forward_sns2sns");
                return;
            }
            case 11: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "multi_broadcast_forward_enable");
                return;
            }
            case 12: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "multi_broadcast_forward_native");
                return;
            }
            case 13: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_send_user_sel_wx");
                return;
            }
            case 14: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_send_by_one_hack");
                return;
            }
            case 15: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "mass_send_user_priority");
                return;
            }
            case 16: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "favorite_forward_enable");
                return;
            }
            case 17: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "share_sns");
                return;
            }
            case 18: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "remove_max_limit");
                return;
            }
            case 19: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "video_channel_live_forward");
                return;
            }
            case 20: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "send_raw_image");
                return;
            }
            case 21: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "fast_send");
                return;
            }
            case 22: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "multi_select");
                return;
            }
            case 23: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "contact_tags");
                return;
            }
            case 24: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "voice_manager");
                return;
            }
            case 25: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "sight_forward_large_video_enable");
                return;
            }
            case 26: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "moments_schedule_forward");
                return;
            }
            case 27: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "send_external_video_shortcut");
                return;
            }
            case 28: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "moment_img_screenshot");
                return;
            }
            default: {
                ʼﹳ0.getClass();
                ʼﹳ0.FLD2151.MTH922(Boolean.valueOf(z), "multi_image_forward_enable");
            }
        }
    }
}

