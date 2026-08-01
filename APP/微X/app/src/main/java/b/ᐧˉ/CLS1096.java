// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;

public final class CLS1096 implements CLS538, CLS539 {
    public final int FLD2381;
    public final String FLD2382;
    public final CLS1019 FLD2383;

    public CLS1096(CLS1019 ˎʻ0, String s, int v) {
        this.FLD2381 = v;
        this.FLD2383 = ˎʻ0;
        this.FLD2382 = s;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        int v = 0;
        String s1 = this.FLD2382;
        CLS1019 ˎʻ0 = this.FLD2383;
        switch(this.FLD2381) {
            case 0: {
                String s3 = CLS182.MTH3475(4100704444163609397L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s3);
                return;
            }
            case 1: {
                String s4 = CLS182.MTH3475(4100704212235375413L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s4);
                return;
            }
            case 2: {
                String s5 = CLS182.MTH3475(4100703606644986677L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s5);
                return;
            }
            case 3: {
                String s6 = CLS182.MTH3475(4100705320336937781L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s6);
                return;
            }
            case 4: {
                String s7 = CLS182.MTH3475(4100704929494913845L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s7);
                return;
            }
            case 5: {
                String s8 = CLS182.MTH3475(4100717260346020661L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s8);
                return;
            }
            case 6: {
                String s9 = CLS182.MTH3475(4100692255046423349L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s9);
                return;
            }
            case 8: {
                ˎʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                String s10 = CLS182.MTH3475(4100691816959759157L, CLS182.MTH3483(s1));
                ˎʻ0.FLD2151.MTH922(v, s10);
                return;
            }
            case 9: {
                String s11 = CLS182.MTH3475(4100691688110740277L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s11);
                return;
            }
            case 10: {
                ˎʻ0.getClass();
                try {
                    if(!TextUtils.isEmpty(s)) {
                        Integer integer0 = Integer.parseInt(s);
                        ˎʻ0.FLD2151.MTH922(integer0, s1 + "_text_max_length");
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 11: {
                String s12 = CLS182.MTH3475(4100702842140807989L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s12);
                return;
            }
            case 13: {
                String s13 = CLS182.MTH3475(4100689970123821877L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s13);
                return;
            }
            case 15: {
                ˎʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                String s14 = CLS182.MTH3475(4100689622231470901L, CLS182.MTH3483(s1));
                ˎʻ0.FLD2151.MTH922(v, s14);
                return;
            }
            case 16: {
                String s15 = CLS182.MTH3475(4100689523447223093L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s15);
                return;
            }
            case 17: {
                ˎʻ0.getClass();
                try {
                    if(!TextUtils.isEmpty(s)) {
                        Integer integer1 = Integer.parseInt(s);
                        ˎʻ0.FLD2151.MTH922(integer1, s1 + "_chatroom_repeat_max");
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 18: {
                String s16 = CLS182.MTH3475(4100702189305778997L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s16);
                return;
            }
            case 19: {
                ˎʻ0.getClass();
                try {
                    String s17 = Long.toHexString(((long)(Double.parseDouble(s) * 60000.0)));
                    ˎʻ0.FLD2151.MTH922(s17, s1 + "_repeat_max_ban_time");
                }
                catch(Throwable unused_ex) {
                }
                return;
            }
            case 20: {
                String s18 = CLS182.MTH3475(4100713377695585077L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s18);
                return;
            }
            case 22: {
                ˎʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                String s19 = CLS182.MTH3475(4100712991148528437L, CLS182.MTH3483(s1));
                ˎʻ0.FLD2151.MTH922(v, s19);
                return;
            }
            case 23: {
                String s20 = CLS182.MTH3475(4100712879479378741L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s20);
                return;
            }
            case 24: {
                String s21 = CLS182.MTH3475(4100687848409977653L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s21);
                return;
            }
            case 26: {
                ˎʻ0.getClass();
                if(!TextUtils.isEmpty(s)) {
                    v = Integer.parseInt(s);
                }
                String s22 = CLS182.MTH3475(4100686899222205237L, CLS182.MTH3483(s1));
                ˎʻ0.FLD2151.MTH922(v, s22);
                return;
            }
            case 27: {
                String s23 = CLS182.MTH3475(4100687333013902133L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s23);
                return;
            }
            case 28: {
                String s24 = CLS182.MTH3475(0x38E8AB092B3CD335L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s24);
                return;
            }
            default: {
                String s2 = CLS182.MTH3475(4100715855891714869L, CLS182.MTH3482(ˎʻ0, s1));
                ˎʻ0.FLD2151.MTH922(s, s2);
            }
        }
    }

    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        String s = this.FLD2382;
        CLS1019 ˎʻ0 = this.FLD2383;
        switch(this.FLD2381) {
            case 7: {
                String s2 = CLS182.MTH3475(4100692147672240949L, CLS182.MTH3482(ˎʻ0, s));
                ˎʻ0.FLD2151.MTH922(Long.toHexString(v), s2);
                return;
            }
            case 12: {
                String s3 = CLS182.MTH3475(4100703310292243253L, CLS182.MTH3482(ˎʻ0, s));
                ˎʻ0.FLD2151.MTH922(Long.toHexString(v), s3);
                return;
            }
            case 14: {
                String s4 = CLS182.MTH3475(4100689343058596661L, CLS182.MTH3482(ˎʻ0, s));
                ˎʻ0.FLD2151.MTH922(Long.toHexString(v), s4);
                return;
            }
            case 21: {
                String s5 = CLS182.MTH3475(4100713287501271861L, CLS182.MTH3482(ˎʻ0, s));
                ˎʻ0.FLD2151.MTH922(Long.toHexString(v), s5);
                return;
            }
            default: {
                String s1 = CLS182.MTH3475(4100687753920697141L, CLS182.MTH3482(ˎʻ0, s));
                ˎʻ0.FLD2151.MTH922(Long.toHexString(v), s1);
            }
        }
    }
}

