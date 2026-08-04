package yyds;

import java.util.Iterator;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᲀᲁᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2098 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C0805 f10388;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0082 f10389;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final String f10390;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1605 f10391;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public C0316 f10392;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final AbstractC0659 f10393;

    public C2098(C1633 c1633) {
        C0082 c0082 = (C0082) c1633.f8333;
        if (c0082 == null) {
            C0188.m800("url == null");
            throw null;
        }
        this.f10389 = c0082;
        this.f10390 = (String) c1633.f8335;
        C2135 c2135 = (C2135) c1633.f8331;
        c2135.getClass();
        this.f10391 = AbstractC0797.m1823(c2135);
        this.f10393 = (AbstractC0659) c1633.f8334;
        this.f10388 = (C0805) c1633.f8332;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.f10390);
        sb.append(", url=");
        sb.append(this.f10389);
        C1605 c1605 = this.f10391;
        if (c1605.size() != 0) {
            sb.append(", headers=[");
            Iterator it = c1605.iterator();
            int i = 0;
            while (true) {
                C0437 c0437 = (C0437) it;
                if (!c0437.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = c0437.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC2725.m4853();
                    throw null;
                }
                Pair pair = (Pair) next;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (AbstractC1429.m2922(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
        }
        C0805 c0805 = C0805.f3693;
        C0805 c08052 = this.f10388;
        if (!AbstractC1544.m3188(c08052, c0805)) {
            sb.append(", tags=");
            sb.append(c08052);
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C1633 m3994() {
        C1633 c1633 = new C1633();
        c1633.f8333 = this.f10389;
        c1633.f8335 = this.f10390;
        c1633.f8334 = this.f10393;
        c1633.f8332 = this.f10388;
        c1633.f8331 = AbstractC0797.m1839(this.f10391);
        return c1633;
    }
}
