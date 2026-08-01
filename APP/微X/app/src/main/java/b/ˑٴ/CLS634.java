// Decompiled by JEB v5.42.0.202606242140

package b.ˑٴ;

import b.ʻˑ.CLS12;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS36.CLS35;
import b.יﹳ.CLS166;
import java.lang.reflect.Field;

public final class CLS634 implements CLS35 {
    public final int FLD569;
    public final CLS12 FLD570;
    public final CLS770 FLD571;

    public CLS634(CLS770 ٴʿ0, CLS832 ᵢʼ0, int v) {
        this.FLD569 = v;
        this.FLD571 = ٴʿ0;
        this.FLD570 = ᵢʼ0;
        super();
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS36$CLS35
    public final void MTH1102(Object[] arr_object) {
        Object object0 = null;
        CLS770 ٴʿ0 = this.FLD571;
        CLS12 ᵔʾ0 = this.FLD570;
        if(this.FLD569 == 0) {
            ٴʿ0.getClass();
            try {
                if(ٴʿ0.FLD1445.MTH938("fake_amount_enable", false) && !ٴʿ0.FLD1447.FLD1407.MTH5947("fake_amount")) {
                    Object object1 = arr_object[0];
                    try {
                        Field field0 = object1.getClass().getDeclaredField("thisObject");
                        if(field0 != null) {
                            field0.setAccessible(true);
                            object0 = field0.get(object1);
                        }
                    }
                    catch(Throwable unused_ex) {
                    }
                    ᵔʾ0.MTH791(CLS166.MTH3194(object0, CLS27.MTH897("fakeAmountField1")));
                    return;
                }
            }
            catch(Throwable throwable0) {
                CLS27.MTH893(throwable0);
            }
            return;
        }
        ٴʿ0.getClass();
        try {
            if(ٴʿ0.FLD1445.MTH938("fake_amount_enable", false) && !ٴʿ0.FLD1447.FLD1407.MTH5947("fake_amount")) {
                Object object2 = arr_object[0];
                try {
                    Field field1 = object2.getClass().getDeclaredField("thisObject");
                    if(field1 != null) {
                        field1.setAccessible(true);
                        object0 = field1.get(object2);
                    }
                }
                catch(Throwable unused_ex) {
                }
                ᵔʾ0.MTH791(CLS166.MTH3194(object0, CLS27.MTH897("fakeAmountField2")));
            }
        }
        catch(Throwable throwable1) {
            CLS27.MTH893(throwable1);
        }
    }
}

