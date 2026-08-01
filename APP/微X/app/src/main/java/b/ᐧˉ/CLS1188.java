// Decompiled by JEB v5.42.0.202606242140

package b.ᐧˉ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS40.CLS39;
import b.ˈˈ.CLS78;
import b.ⁱᵔ.CLS371;
import b.ⁱᵔ.CLS380.CLS378;
import b.ﾞˎ.CLS1621.CLS538;
import b.ﾞˎ.CLS1622.CLS539;
import b.ﾞˎ.CLS525;

public final class CLS1188 implements CLS39, CLS378, CLS538, CLS539 {
    public final int FLD2781;
    public final CLS997 FLD2782;

    public CLS1188(CLS997 ˋ0, int v) {
        this.FLD2781 = v;
        this.FLD2782 = ˋ0;
        super();
    }

    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        String s = this.FLD2782.FLD2157;
        CLS78 ˊﾞ0 = new CLS78(s, CLS371.FLD3470.MTH5311(s));
        this.FLD2782.FLD1996.add(ˊﾞ0);
        CLS371.FLD3470.MTH5381(this.FLD2782.FLD2157, this.FLD2782.FLD1996);
    }

    @Override  // b.ⁱᵔ.CLS380$CLS378
    public final void MTH5452(CLS525 ʻˑ0) {
        this.FLD2782.getClass();
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1622$CLS539
    public final void MTH7273(String s) {
        CLS997 ˋ0 = this.FLD2782;
        switch(this.FLD2781) {
            case 4: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(s, "moment_filter");
                return;
            }
            case 5: {
                ˋ0.getClass();
                try {
                    if(!TextUtils.isEmpty(s)) {
                        Integer integer0 = Integer.parseInt(s);
                        ˋ0.FLD2151.MTH922(integer0, "fakelikes_autoselect_cnt");
                        return;
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return;
            }
            case 6: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(s, "sns_fakelike");
                return;
            }
            case 7: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(s, "sns_fakecomments");
                return;
            }
            case 8: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(s, "auto_comment_like_filter");
                return;
            }
            case 9: {
                ˋ0.getClass();
                try {
                    if(!TextUtils.isEmpty(s)) {
                        Integer integer1 = Integer.parseInt(s);
                        ˋ0.FLD2151.MTH922(integer1, "like_only_limited_per_day_max");
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 10: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(s, "auto_like_allowed_filter");
                return;
            }
            case 13: {
                ˋ0.getClass();
                try {
                    if(!TextUtils.isEmpty(s)) {
                        Integer integer2 = Integer.parseInt(s);
                        ˋ0.FLD2151.MTH922(integer2, "comment_only_limited_per_day_max");
                        return;
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            default: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(s, "auto_comment_allowed_filter");
            }
        }
    }

    // 此方法包含解密的字符串
    @Override  // b.ﾞˎ.CLS1621$CLS538
    public final void MTH7258(long v) {
        CLS997 ˋ0 = this.FLD2782;
        switch(this.FLD2781) {
            case 0: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(((int)v), "moments_post_message_dup_check_time");
                return;
            }
            case 3: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(((int)v), "sns_sync_rate");
                return;
            }
            case 11: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(((int)v), "auto_like_delay");
                return;
            }
            default: {
                ˋ0.getClass();
                ˋ0.FLD2151.MTH922(((int)v), "auto_comment_delay");
            }
        }
    }
}

