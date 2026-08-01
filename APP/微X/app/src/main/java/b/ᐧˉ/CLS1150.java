// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import b.ʾᵢ.CLS27;
import b.ⁱᵔ.CLS380.CLS378;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS525;

public final class CLS1150 implements CLS378, CLS538, CLS539 {
    public final int FLD2603;
    public final CLS911 FLD2604;

    public CLS1150(CLS911 ʼ0, int v) {
        this.FLD2603 = v;
        this.FLD2604 = ʼ0;
        super();
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD2604.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS911 ʼ0 = this.FLD2604;
        switch(this.FLD2603) {
            case 0: {
                ʼ0.getClass();
                ʼ0.FLD2151.MTH922(s, "auto_label_new_contact_lbl");
                return;
            }
            case 1: {
                ʼ0.getClass();
                ʼ0.FLD2151.MTH922(s, "$mic_tag");
                return;
            }
            case 3: {
                ʼ0.getClass();
                ʼ0.FLD2151.MTH922(s, "$aam_name");
                return;
            }
            case 4: {
                ʼ0.getClass();
                ʼ0.FLD2151.MTH922(s, "$aam_tag");
                return;
            }
            case 5: {
                ʼ0.getClass();
                ʼ0.FLD2151.MTH922(s, "$aam_owner_tag");
                return;
            }
            case 6: {
                ʼ0.getClass();
                ʼ0.FLD2151.MTH922(s, "$aam_msg");
                return;
            }
            case 7: {
                ʼ0.getClass();
                ʼ0.FLD2151.MTH922(s, "$aam_tag_only");
                return;
            }
            case 8: {
                ʼ0.getClass();
                try {
                    Integer integer0 = Integer.parseInt(s);
                    ʼ0.FLD2151.MTH922(integer0, "$aam_tm");
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 9: {
                ʼ0.getClass();
                try {
                    Integer integer1 = Integer.parseInt(s);
                    ʼ0.FLD2151.MTH922(integer1, "$aam_nm");
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 11: {
                ʼ0.getClass();
                ʼ0.FLD2151.MTH922(s, "remote_recall_users");
                return;
            }
            default: {
                ʼ0.getClass();
                ʼ0.FLD2151.MTH922(s, "remote_recall_keyword");
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        CLS911 ʼ0 = this.FLD2604;
        if(this.FLD2603 == 2) {
            ʼ0.getClass();
            ʼ0.FLD2151.MTH922(((int)v), "$mass_invite_chatrooms_delay");
            return;
        }
        ʼ0.getClass();
        ʼ0.FLD2151.MTH922(((int)v), "$aam_md");
    }
}

