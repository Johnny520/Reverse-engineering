// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ⁱᵔ.CLS426;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1629.CLS548;
import b.ﾞˎ.CLS525;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class CLS1088 implements CLS39, CLS378, CLS538, CLS539, CLS548 {
    public final int FLD2359;
    public final CLS899 FLD2360;

    public CLS1088(CLS899 ʻʼ0, int v) {
        this.FLD2359 = v;
        this.FLD2360 = ʻʼ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        CLS899 ʻʼ0 = this.FLD2360;
        ʻʼ0.getClass();
        ArrayList arrayList0 = new ArrayList();
        HashSet hashSet0 = new HashSet();
        CLS371 ʻ0 = ʻʼ0.FLD1658;
        ʻ0.MTH5381(ʻʼ0.FLD2157, ʻʼ0.FLD1662);
        ʻ0.MTH5308(ʻʼ0.FLD2157, arrayList0);
        Iterator iterator0 = arrayList0.iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            ArrayList arrayList1 = ʻʼ0.FLD1659;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            CLS78 ˊﾞ0 = (CLS78)object0;
            if(!hashSet0.contains("")) {
                arrayList1.add(ˊﾞ0);
                hashSet0.add("");
            }
        }
        for(Object object1: arrayList1) {
            CLS78 ˊﾞ1 = (CLS78)object1;
            if(!CLS426.MTH6126("") && ʻ0.MTH5340(ʻʼ0.FLD2157, "")) {
                ʻʼ0.FLD1663.add(ˊﾞ1);
            }
        }
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD2360.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS899 ʻʼ0 = this.FLD2360;
        switch(this.FLD2359) {
            case 0: {
                ʻʼ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    try {
                        int v = Integer.parseInt(s);
                        ʻʼ0.FLD2151.MTH922(v, "fake_contacts_count");
                        return;
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                return;
            }
            case 1: {
                ʻʼ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    try {
                        int v1 = Integer.parseInt(s);
                        ʻʼ0.FLD2151.MTH922(v1, "fake_friendreq_amount_number");
                        return;
                    }
                    catch(Throwable throwable1) {
                        CLS27.MTH893(throwable1);
                    }
                }
                return;
            }
            case 5: {
                ʻʼ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    try {
                        Integer integer0 = Integer.parseInt(s);
                        ʻʼ0.FLD2151.MTH922(integer0, "friendreq_auto_cycle_max");
                        return;
                    }
                    catch(Throwable throwable2) {
                        CLS27.MTH893(throwable2);
                    }
                }
                return;
            }
            case 8: {
                ʻʼ0.getClass();
                try {
                    int v2 = Integer.parseInt(s);
                    ʻʼ0.FLD2151.MTH922(v2, "friendreq_limit_auto_bypass_attempts");
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                }
                return;
            }
            case 9: {
                ʻʼ0.getClass();
                try {
                    int v3 = Integer.parseInt(s);
                    ʻʼ0.FLD2151.MTH922(v3, "friendreq_max_break");
                }
                catch(Throwable throwable4) {
                    CLS27.MTH893(throwable4);
                }
                return;
            }
            case 12: {
                ʻʼ0.getClass();
                try {
                    if(!TextUtils.isEmpty(s)) {
                        int v4 = Integer.parseInt(s);
                        ʻʼ0.FLD2151.MTH922(v4, "auto_shake_friend_max");
                        return;
                    }
                }
                catch(Throwable throwable5) {
                    CLS27.MTH893(throwable5);
                }
                return;
            }
            case 15: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(s, "auto_shake_gps");
                return;
            }
            case 17: {
                ʻʼ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    ʻʼ0.FLD2151.MTH922(s, "zombie_scan_msg");
                }
                return;
            }
            case 20: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(s, "no_confirmation_remark_ext");
                return;
            }
            case 21: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(s, "auto_remark_enable_text");
                return;
            }
            case 22: {
                ʻʼ0.getClass();
                try {
                    int v5 = Integer.parseInt(s);
                    ʻʼ0.FLD2151.MTH922(v5, "nca2_cnt_max");
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 23: {
                ʻʼ0.getClass();
                try {
                    int v6 = Integer.parseInt(s);
                    ʻʼ0.FLD2151.MTH922(v6, "nca3_cnt_max");
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 24: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(s, "auto_label_new_contact_date_format");
                return;
            }
            case 25: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(s, "auto_remark_new_contact_date_format");
                return;
            }
            case 26: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(s, "auto_remark_new_contact_custom_text");
                return;
            }
            case 28: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(s, "keyword_remark");
                return;
            }
            default: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(s, "keyword_remark_newremark");
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        Integer integer0 = 2;
        CLS899 ʻʼ0 = this.FLD2360;
        if(this.FLD2359 == 6) {
            ʻʼ0.getClass();
            switch(s) {
                case "radio_female": {
                    break;
                }
                case "radio_male": {
                    integer0 = 1;
                    break;
                }
                default: {
                    integer0 = -1;
                }
            }
            ʻʼ0.FLD2151.MTH922(integer0, "auto_req_new_member_sextype");
            return;
        }
        ʻʼ0.getClass();
        switch(s) {
            case "radio_female": {
                break;
            }
            case "radio_male": {
                integer0 = 1;
                break;
            }
            default: {
                integer0 = -1;
            }
        }
        ʻʼ0.FLD2151.MTH922(integer0, "auto_shake_friend_sextype");
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        CLS899 ʻʼ0 = this.FLD2360;
        switch(this.FLD2359) {
            case 3: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(((int)v), "delete_contact_delay");
                return;
            }
            case 7: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(((int)v), "friend_request_limitbypass_delay");
                return;
            }
            case 10: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(((int)v), "friendreq_max_break_delay");
                return;
            }
            case 11: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(((int)v), "friend_request_delay");
                return;
            }
            case 14: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(((int)v), "auto_shake_delay");
                return;
            }
            case 16: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(((int)v), "friendreq_limit_auto_resume_delay");
                return;
            }
            case 18: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(((int)v), "zombie_scan_send_delay");
                return;
            }
            case 19: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(((int)v), "delete_contact_delay");
                return;
            }
            default: {
                ʻʼ0.getClass();
                ʻʼ0.FLD2151.MTH922(((int)v), "auto_accept_friend_delay");
            }
        }
    }
}

