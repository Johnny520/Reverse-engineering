// Decompiled by JEB v5.42.0.202606242140

package b.ˆٴ;

import b.ʻˑ.CLS12;
import b.ʻˑ.CLS3;
import b.ʾᵢ.CLS27;
import b.יﹳ.CLS166;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public final class CLS63 implements InvocationHandler {
    public final int FLD191;
    public final Object FLD192;
    public final Object FLD193;
    public final Object FLD194;

    public CLS63(Serializable serializable0, Object object0, Object object1, int v) {
        this.FLD191 = v;
        this.FLD194 = serializable0;
        this.FLD193 = object0;
        this.FLD192 = object1;
        super();
    }

    public CLS63(Object object0, String s, CLS3 ˆٴ0) {
        this.FLD191 = 1;
        super();
        this.FLD193 = object0;
        this.FLD194 = s;
        this.FLD192 = ˆٴ0;
    }

    // 此方法包含解密的字符串
    @Override
    public final Object invoke(Object object0, Method method0, Object[] arr_object) {
        ArrayList arrayList0;
        Object object1 = this.FLD192;
        Object object2 = this.FLD193;
        Object object3 = this.FLD194;
        switch(this.FLD191) {
            case 0: {
                List list0 = (List)object3;
                CLS3 ˆٴ0 = (CLS3)object1;
                try {
                    if(method0.getReturnType().equals(Void.TYPE)) {
                        for(Object object5: list0) {
                            CLS166.MTH3195(CLS166.MTH3195(object2, CLS27.MTH897("delMethod8"), new Object[0]), CLS27.MTH897("delMethod9"), new Object[]{((String)object5)});
                        }
                        if(ˆٴ0 != null) {
                            ˆٴ0.MTH774();
                            return null;
                        }
                    }
                }
                catch(Throwable throwable1) {
                    CLS27.MTH893(throwable1);
                }
                return null;
            }
            case 1: {
                String s = (String)object3;
                CLS3 ˆٴ1 = (CLS3)object1;
                try {
                    if(method0.getReturnType().equals(Void.TYPE)) {
                        CLS166.MTH3195(CLS166.MTH3195(object2, CLS27.MTH897("delMethod8"), new Object[0]), CLS27.MTH897("delMethod9"), new Object[]{s});
                        if(ˆٴ1 != null) {
                            ˆٴ1.MTH774();
                            return null;
                        }
                    }
                }
                catch(Throwable throwable2) {
                    CLS27.MTH893(throwable2);
                }
                return null;
            }
            default: {
                Class class0 = (Class)object3;
                Class class1 = (Class)object2;
                CLS12 ᵔʾ0 = (CLS12)object1;
                if(method0.getName().equals("toString")) {
                    return "RecogQBarOfImageFile cb";
                }
                try {
                    if(method0.getName().equals(CLS27.MTH897("RecogQBarOfImageFileInterface_resultMethod"))) {
                        Object object4 = arr_object[0];
                        if(class0 == null) {
                            arrayList0 = class1 == null ? null : ((ArrayList)CLS166.MTH3192(class1, CLS27.MTH897("QBarOfImageFileResultEventDataParserClass_method1"), new Object[]{object4}));
                        }
                        else {
                            arrayList0 = (ArrayList)CLS166.MTH3195(CLS166.MTH3186(class0, CLS27.MTH897("QBarOfImageFileResultEventDataParserClass_field1")), CLS27.MTH897("QBarOfImageFileResultEventDataParserClass_method1"), new Object[]{object4});
                        }
                        if(arrayList0 != null && !arrayList0.isEmpty()) {
                            ᵔʾ0.MTH791(((String)CLS166.MTH3194(arrayList0.get(0), CLS27.MTH897("ImageQBarDataBean_field1"))));
                            return null;
                        }
                    }
                }
                catch(Throwable throwable0) {
                    CLS27.MTH893(throwable0);
                }
                return null;
            }
        }
    }
}

