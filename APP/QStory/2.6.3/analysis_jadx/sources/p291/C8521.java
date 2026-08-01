package p291;

import androidx.collection.C0276;
import com.alibaba.fastjson2.util.AbstractC2837;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.C2831;
import com.alibaba.fastjson2.util.C2833;
import com.alibaba.fastjson2.util.C2835;
import com.alibaba.fastjson2.util.C2838;
import com.alibaba.fastjson2.util.C2839;
import com.alibaba.fastjson2.util.C2842;
import com.alibaba.fastjson2.util.C2850;
import com.alibaba.fastjson2.util.C2851;
import java.sql.Clob;
import p230.C8049;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8521 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C8524 f23705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8049 f23706 = new C8049(this, 11);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8539 f23707;

    public C8521(C8539 c8539) {
        this.f23707 = c8539;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC8523 m14094(Class cls, String str) {
        switch (str) {
            case "org.joda.time.LocalDate":
                int i = AbstractC2837.f8830;
                return new C2838(cls, null);
            case "org.joda.time.chrono.GregorianChronology":
                int i2 = AbstractC2837.f8830;
                return new C2831(cls);
            case "java.sql.Time":
                return C2835.f8821;
            case "org.joda.time.chrono.ISOChronology":
                int i3 = AbstractC2837.f8830;
                return new C2842(cls);
            case "org.joda.time.DateTime":
                return new C8452(null, null, new C2850(4));
            case "java.sql.Timestamp":
                return new C2833(null, null);
            case "org.joda.time.LocalDateTime":
                int i4 = AbstractC2837.f8830;
                return new C2839(cls, null);
            default:
                if (AbstractC2860.f8981 == null && !AbstractC2860.f8982) {
                    try {
                        AbstractC2860.f8981 = Clob.class;
                    } catch (Throwable unused) {
                        AbstractC2860.f8982 = true;
                    }
                    break;
                }
                Class cls2 = AbstractC2860.f8981;
                if (cls2 != null && cls2.isAssignableFrom(cls)) {
                    C2851 c2851 = new C2851();
                    if (AbstractC2860.f8981 == null && !AbstractC2860.f8982) {
                        try {
                            AbstractC2860.f8981 = Clob.class;
                        } catch (Throwable unused2) {
                            AbstractC2860.f8982 = true;
                        }
                    }
                    if (AbstractC2860.f8981 != null) {
                        return c2851;
                    }
                    C0276.m850("class java.sql.Clob not found");
                    break;
                }
                return null;
        }
    }
}
