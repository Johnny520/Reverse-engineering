package p291;

import androidx.collection.C0276;
import com.alibaba.fastjson2.util.AbstractC2836;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.C2830;
import com.alibaba.fastjson2.util.C2832;
import com.alibaba.fastjson2.util.C2834;
import com.alibaba.fastjson2.util.C2837;
import com.alibaba.fastjson2.util.C2838;
import com.alibaba.fastjson2.util.C2841;
import com.alibaba.fastjson2.util.C2849;
import com.alibaba.fastjson2.util.C2850;
import java.sql.Clob;
import p230.C8048;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8529 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C8532 f23714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8048 f23715 = new C8048(this, 11);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8547 f23716;

    public C8529(C8547 c8547) {
        this.f23716 = c8547;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC8531 m14075(Class cls, String str) {
        switch (str) {
            case "org.joda.time.LocalDate":
                int i = AbstractC2836.f8828;
                return new C2837(cls, null);
            case "org.joda.time.chrono.GregorianChronology":
                int i2 = AbstractC2836.f8828;
                return new C2830(cls);
            case "java.sql.Time":
                return C2834.f8819;
            case "org.joda.time.chrono.ISOChronology":
                int i3 = AbstractC2836.f8828;
                return new C2841(cls);
            case "org.joda.time.DateTime":
                return new C8460(null, null, new C2849(4));
            case "java.sql.Timestamp":
                return new C2832(null, null);
            case "org.joda.time.LocalDateTime":
                int i4 = AbstractC2836.f8828;
                return new C2838(cls, null);
            default:
                if (AbstractC2859.f8979 == null && !AbstractC2859.f8980) {
                    try {
                        AbstractC2859.f8979 = Clob.class;
                    } catch (Throwable unused) {
                        AbstractC2859.f8980 = true;
                    }
                    break;
                }
                Class cls2 = AbstractC2859.f8979;
                if (cls2 != null && cls2.isAssignableFrom(cls)) {
                    C2850 c2850 = new C2850();
                    if (AbstractC2859.f8979 == null && !AbstractC2859.f8980) {
                        try {
                            AbstractC2859.f8979 = Clob.class;
                        } catch (Throwable unused2) {
                            AbstractC2859.f8980 = true;
                        }
                    }
                    if (AbstractC2859.f8979 != null) {
                        return c2850;
                    }
                    C0276.m849("class java.sql.Clob not found");
                    break;
                }
                return null;
        }
    }
}
