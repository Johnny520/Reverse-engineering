// Decompiled by JEB v5.42.0.202606242140

package b.ᵔʾ;

import android.text.TextUtils;
import b.ʾᵢ.CLS27;
import b.ˆٴ.CLS66;
import b.יᐧ.CLS147.CLS146;
import b.יᐧ.CLS147;
import b.ⁱᵔ.CLS412;
import java.util.ArrayDeque;

public final class CLS291 implements Runnable {
    public final int FLD3032;
    public final Object FLD3033;

    public CLS291(int v, Object object0) {
        this.FLD3032 = v;
        this.FLD3033 = object0;
        super();
    }

    // 此方法包含解密的字符串
    @Override
    public final void run() {
        Object object0 = this.FLD3033;
        switch(this.FLD3032) {
            case 0: {
                CLS314 ﾞᐧ0 = (CLS314)object0;
                ﾞᐧ0.getClass();
                try {
                    CLS313 ﾞᐧ$ᵔʾ0 = (CLS313)ﾞᐧ0.FLD3234.peek();
                    if(ﾞᐧ$ᵔʾ0 != null) {
                        ﾞᐧ0.MTH5001(ﾞᐧ$ᵔʾ0.FLD3227);
                        return;
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return;
            }
            case 1: {
                ArrayDeque arrayDeque0 = ((CLS295)object0).FLD3054;
                if(!arrayDeque0.isEmpty()) {
                    String s = (String)arrayDeque0.poll();
                    if(!TextUtils.isEmpty(s)) {
                        CLS66.MTH1512(s, "wx2");
                    }
                }
                return;
            }
            case 2: {
                CLS290 ˊˎ0 = (CLS290)object0;
                ˊˎ0.getClass();
                try {
                    ˊˎ0.FLD3008.poll();
                    ˊˎ0.MTH4761();
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return;
            }
            case 3: {
                CLS283 ʾˏ0 = (CLS283)object0;
                ʾˏ0.getClass();
                try {
                    switch(CLS27.MTH895().MTH927((CLS412.MTH6002() ? 3 : 0), "scan_zombie_method")) {
                        case 0: {
                            ʾˏ0.MTH4693();
                            return;
                        }
                        case 1: {
                            ʾˏ0.MTH4697();
                            return;
                        }
                        case 2: {
                            ʾˏ0.FLD2941.poll();
                            ʾˏ0.MTH4698();
                            return;
                        }
                        case 3: {
                            ʾˏ0.FLD2951.poll();
                            ʾˏ0.MTH4690();
                            return;
                        }
                        default: {
                            return;
                        }
                    }
                }
                catch(Throwable throwable3) {
                    CLS27.MTH893(throwable3);
                    return;
                }
            }
            default: {
                CLS146 ˆٴ$ˆٴ0 = (CLS146)((CLS147)object0).FLD1537.pollFirst();
                if(ˆٴ$ˆٴ0 != null) {
                    try {
                        ˆٴ$ˆٴ0.FLD1534.MTH774();
                    }
                    catch(Throwable throwable0) {
                        CLS27.MTH893(throwable0);
                    }
                }
                ((CLS147)object0).MTH3130();
            }
        }
    }
}

