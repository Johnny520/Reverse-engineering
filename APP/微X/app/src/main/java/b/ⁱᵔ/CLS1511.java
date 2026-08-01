// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS9;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS29;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS1629.CLS548;

public final class CLS1511 implements CLS9, CLS39, CLS538, CLS539, CLS548 {
    public final int FLD4600;

    public CLS1511(int v) {
        this.FLD4600 = v;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        for(Object object0: CLS371.FLD3470.MTH5347()) {
            String s = (String)object0;
            if(!CLS404.MTH5909(s)) {
                CLS66.MTH1408(s, null);
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        int v;
        if(this.FLD4600 == 3) {
            if(!TextUtils.isEmpty(s)) {
                try {
                    CLS27.MTH895().MTH922(Integer.parseInt(s), "friendreq_auto_cycle_max");
                    return;
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
            }
            return;
        }
        if(!TextUtils.isEmpty(s)) {
            try {
                v = Integer.parseInt(s);
            }
            catch(Throwable throwable1) {
                CLS27.MTH893(throwable1);
                v = 60;
            }
            CLS27.MTH895().MTH922(v, "audio_extract_split");
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1629$CLS548
    public final void MTH7368(String s) {
        CLS29 ˎᵢ1;
        CLS29 ˎᵢ0;
        Integer integer0 = 1;
        if(this.FLD4600 == 4) {
            switch(s) {
                case "append": {
                    ˎᵢ0 = CLS27.MTH895();
                    break;
                }
                case "prepend": {
                    ˎᵢ0 = CLS27.MTH895();
                    integer0 = 2;
                    break;
                }
                case "replace": {
                    ˎᵢ0 = CLS27.MTH895();
                    integer0 = 0;
                    break;
                }
                default: {
                    return;
                }
            }
            ˎᵢ0.MTH922(integer0, "renameRemarkType");
            return;
        }
        switch(s) {
            case "append": {
                ˎᵢ1 = CLS27.MTH895();
                integer0 = 2;
                break;
            }
            case "none": {
                ˎᵢ1 = CLS27.MTH895();
                integer0 = 0;
                break;
            }
            case "prepend": {
                ˎᵢ1 = CLS27.MTH895();
                break;
            }
            default: {
                return;
            }
        }
        ˎᵢ1.MTH922(integer0, "moment_sig_type");
    }

    @Override  // b.ʻˑ.CLS9
    public final boolean MTH787(String s) {
        return CLS27.MTH904().equals(s);
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        switch(this.FLD4600) {
            case 0: {
                CLS27.MTH895().MTH922(((int)v), "friendreq_max_break_delay");
                return;
            }
            case 1: {
                CLS27.MTH895().MTH922(((int)v), "friend_request_delay");
                return;
            }
            default: {
                CLS27.MTH895().MTH922(((int)v), "friendreq_limit_auto_resume_delay");
            }
        }
    }
}

