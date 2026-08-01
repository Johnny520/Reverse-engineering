package p307;

import androidx.collection.C1123;
import com.alibaba.fastjson2.util.AbstractC3670;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.C3664;
import com.alibaba.fastjson2.util.C3666;
import com.alibaba.fastjson2.util.C3668;
import com.alibaba.fastjson2.util.C3671;
import com.alibaba.fastjson2.util.C3672;
import com.alibaba.fastjson2.util.C3675;
import com.alibaba.fastjson2.util.C3683;
import com.alibaba.fastjson2.util.C3684;
import java.sql.Clob;
import p246.C8878;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9350 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C9353 f24050;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8878 f24051 = new C8878(this, 11);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9368 f24052;

    public C9350(C9368 c9368) {
        this.f24052 = c9368;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC9352 m14653(Class cls, String str) {
        switch (str) {
            case "org.joda.time.LocalDate":
                int i = AbstractC3670.f9175;
                return new C3671(cls, null);
            case "org.joda.time.chrono.GregorianChronology":
                int i2 = AbstractC3670.f9175;
                return new C3664(cls);
            case "java.sql.Time":
                return C3668.f9166;
            case "org.joda.time.chrono.ISOChronology":
                int i3 = AbstractC3670.f9175;
                return new C3675(cls);
            case "org.joda.time.DateTime":
                return new C9281(null, null, new C3683(4));
            case "java.sql.Timestamp":
                return new C3666(null, null);
            case "org.joda.time.LocalDateTime":
                int i4 = AbstractC3670.f9175;
                return new C3672(cls, null);
            default:
                if (AbstractC3693.f9326 == null && !AbstractC3693.f9327) {
                    try {
                        AbstractC3693.f9326 = Clob.class;
                    } catch (Throwable unused) {
                        AbstractC3693.f9327 = true;
                    }
                    break;
                }
                Class cls2 = AbstractC3693.f9326;
                if (cls2 != null && cls2.isAssignableFrom(cls)) {
                    C3684 c3684 = new C3684();
                    if (AbstractC3693.f9326 == null && !AbstractC3693.f9327) {
                        try {
                            AbstractC3693.f9326 = Clob.class;
                        } catch (Throwable unused2) {
                            AbstractC3693.f9327 = true;
                        }
                    }
                    if (AbstractC3693.f9326 != null) {
                        return c3684;
                    }
                    C1123.m1410("class java.sql.Clob not found");
                    break;
                }
                return null;
        }
    }
}
