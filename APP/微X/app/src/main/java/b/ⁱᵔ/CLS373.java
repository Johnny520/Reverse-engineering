// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS29;

public final class CLS373 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD3485;
    public final CLS29 FLD3486;

    public CLS373(CLS29 ˎᵢ0, int v) {
        this.FLD3485 = v;
        this.FLD3486 = ˎᵢ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS29 ˎᵢ0 = this.FLD3486;
        switch(this.FLD3485) {
            case 0: {
                ˎᵢ0.MTH922(Boolean.valueOf(z), "tts_enable");
                return;
            }
            case 1: {
                ˎᵢ0.MTH922(Boolean.valueOf(z), "auto_tts_enable");
                return;
            }
            case 2: {
                ˎᵢ0.MTH922(Boolean.valueOf(z), "chatroom_container_round_avatar");
                return;
            }
            case 3: {
                ˎᵢ0.MTH922(Boolean.valueOf(z), "container_show_empty");
                return;
            }
            case 4: {
                ˎᵢ0.MTH922(Boolean.valueOf(z), "chatroom_friend_req_excl_owner");
                return;
            }
            case 5: {
                ˎᵢ0.MTH922(Boolean.valueOf(z), "chatroom_friend_req_excl_mod");
                return;
            }
            case 6: {
                ˎᵢ0.MTH922(Boolean.valueOf(z), "nearby_friendreq_manual");
                return;
            }
            case 7: {
                ˎᵢ0.MTH922(Boolean.valueOf(z), "send_accept_reply");
                return;
            }
            case 8: {
                ˎᵢ0.MTH922(Boolean.valueOf(z), "random_fake_comments");
                return;
            }
            default: {
                ˎᵢ0.MTH922(Boolean.valueOf(z), "save_comments");
            }
        }
    }
}

