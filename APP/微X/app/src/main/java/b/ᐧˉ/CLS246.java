// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.CompoundButton;

public final class CLS246 implements CompoundButton.OnCheckedChangeListener {
    public final int FLD2588;
    public final CLS899 FLD2589;

    public CLS246(CLS899 ʻʼ0, int v) {
        this.FLD2588 = v;
        this.FLD2589 = ʻʼ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // android.widget.CompoundButton$OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton0, boolean z) {
        CLS899 ʻʼ0 = this.FLD2589;
        switch(this.FLD2588) {
            case 0: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_label_new_contact_date");
                return;
            }
            case 1: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_label_existing_label");
                return;
            }
            case 2: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_label_new_contact_chatroom");
                return;
            }
            case 3: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_remark_new_contact");
                return;
            }
            case 4: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_accept_req_enable");
                return;
            }
            case 5: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_remark_new_contact_append");
                return;
            }
            case 6: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_remark_new_contact_date");
                return;
            }
            case 7: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_remark_new_contact_custom");
                return;
            }
            case 8: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "auto_accept_neighbor_req");
                return;
            }
            case 9: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "accept_all_req_enable");
                return;
            }
            case 10: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "send_accept_reply");
                return;
            }
            case 11: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "reply_on_accept");
                return;
            }
            default: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(Boolean.valueOf(z), "no_confirmation_accept_reply");
            }
        }
    }
}

