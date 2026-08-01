// Decompiled by JEB v5.42.0.202606242140

package b.ⁱᵔ;

import android.text.TextUtils;
import b.ʻˑ.CLS0;
import b.ʾᵢ.CLS27;
import b.ʾᵢ.CLS31;
import b.ʾᵢ.CLS40.CLS39;
import b.ˆٴ.CLS66;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.HashSet;

public final class CLS1463 implements CLS39 {
    public final String FLD4343;
    public final long FLD4344;
    public final CLS0 FLD4345;
    public final long FLD4346;

    public CLS1463(long v, long v1, CLS0 ʻˑ0, String s) {
        this.FLD4343 = s;
        this.FLD4345 = ʻˑ0;
        this.FLD4344 = v;
        this.FLD4346 = v1;
    }

    // 此方法包含解密的字符串
    @Override  // b.ʾᵢ.CLS40$CLS39
    public final void run() {
        Object object2;
        try {
            String s = this.FLD4343;
            CLS0 ʻˑ0 = this.FLD4345;
            long v = this.FLD4344;
            long v1 = this.FLD4346;
            HashSet hashSet0 = CLS466.MTH6544();
            HashMap hashMap0 = CLS466.MTH6525();
            if(!hashSet0.contains(s)) {
                hashSet0.add(s);
                CLS371 ʻ0 = CLS371.FLD3470;
                String s1 = ʻ0.MTH5319(v);
                boolean z = !TextUtils.isEmpty(s1) && CLS31.MTH1021(s1);
                if(z && !CLS466.MTH6521(v, 0)) {
                    if(ʻˑ0 != null) {
                        ʻˑ0.MTH770(s1);
                    }
                }
                else if(!hashMap0.containsKey(s)) {
                    Class class0 = CLS27.MTH894("GetMsgImgInterfaceClass");
                    if(class0 != null) {
                        long v2 = ʻ0.MTH5352(v);
                        boolean z1 = ʻ0.MTH5362(v2);
                        Object object0 = Proxy.newProxyInstance(class0.getClassLoader(), new Class[]{class0}, new CLS399(v2, s1, ʻˑ0, hashMap0, s));
                        Object object1 = Proxy.newProxyInstance(class0.getClassLoader(), new Class[]{class0}, new CLS429(v2, s1, z1, v1, object0, ʻˑ0, hashMap0, s));
                        if(z) {
                            CLS66.MTH1398(v2, v1, object0, true);
                            return;
                        }
                        CLS66.MTH1398(v2, v1, object1, false);
                    }
                }
                else if(ʻˑ0 != null) {
                    object2 = hashMap0.get(s);
                    ʻˑ0.MTH770(((String)object2));
                }
            }
            else if(hashMap0.containsKey(s) && ʻˑ0 != null) {
                object2 = hashMap0.get(s);
                ʻˑ0.MTH770(((String)object2));
            }
        }
        catch(Throwable throwable0) {
            CLS27.MTH893(throwable0);
        }
    }
}

