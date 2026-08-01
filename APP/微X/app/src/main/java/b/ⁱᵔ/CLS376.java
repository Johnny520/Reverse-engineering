// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;
import b.ʾᵢ.CLS27;

public final class CLS376 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD3510;

    public CLS376(int v) {
        this.FLD3510 = v;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        switch(this.FLD3510) {
            case 0: {
                CLS27.MTH895().MTH922(Boolean.valueOf(z), "chatroom_friend_req_no_verify_only");
                return;
            }
            case 1: {
                CLS27.MTH895().MTH922(Boolean.valueOf(z), "chatroom_friend_req_no_verify_priority");
                return;
            }
            case 2: {
                CLS27.MTH895().MTH922(Boolean.valueOf(z), "friendreq_remember_history");
                return;
            }
            case 3: {
                CLS27.MTH895().MTH922(Boolean.valueOf(z), "friendreq_limit_auto_resume");
                return;
            }
            case 4: {
                CLS27.MTH895().MTH922(Boolean.valueOf(z), "friendreq_auto_cycle_type");
                return;
            }
            case 5: {
                CLS27.MTH895().MTH922(Boolean.valueOf(z), "friendreq_limit_auto_bypass");
                return;
            }
            default: {
                CLS27.MTH895().MTH922(Boolean.valueOf(z), "manual_select_blocked_contact_enable");
            }
        }
    }
}

