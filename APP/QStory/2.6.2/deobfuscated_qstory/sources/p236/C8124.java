package p236;

import androidx.appcompat.app.AbstractC0080;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import org.slf4j.Marker;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8124 extends AbstractC0080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C8124 f22426 = new C8124(Marker.ANY_MARKER, Marker.ANY_MARKER);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f22427;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f22428;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8124(String str, String str2, List list) {
        super(str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f22428 = str;
        this.f22427 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8124)) {
            return false;
        }
        C8124 c8124 = (C8124) obj;
        return AbstractC5138.m10130(this.f22428, c8124.f22428) && AbstractC5138.m10130(this.f22427, c8124.f22427) && AbstractC4394.m8917((List) this.f232, (List) c8124.f232);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f22428.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f22427.toLowerCase(locale);
        lowerCase2.getClass();
        int iHashCode2 = lowerCase2.hashCode();
        return (((List) this.f232).hashCode() * 31) + iHashCode2 + (iHashCode * 31) + iHashCode;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m13560(p236.C8124 r7) {
        /*
            r6 = this;
            r7.getClass()
            java.lang.String r0 = r7.f22427
            java.lang.String r1 = r7.f22428
            java.lang.String r2 = "*"
            boolean r3 = kotlin.jvm.internal.AbstractC4394.m8917(r1, r2)
            r4 = 0
            if (r3 != 0) goto L1a
            java.lang.String r3 = r6.f22428
            boolean r1 = kotlin.text.AbstractC5138.m10130(r1, r3)
            if (r1 != 0) goto L1a
            goto L89
        L1a:
            boolean r1 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r2)
            if (r1 != 0) goto L29
            java.lang.String r1 = r6.f22427
            boolean r0 = kotlin.text.AbstractC5138.m10130(r0, r1)
            if (r0 != 0) goto L29
            goto L89
        L29:
            java.lang.Object r7 = r7.f232
            java.util.List r7 = (java.util.List) r7
            java.util.Iterator r7 = r7.iterator()
        L31:
            boolean r0 = r7.hasNext()
            r1 = 1
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r7.next()
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏 r0 = (p236.C8119) r0
            java.lang.String r3 = r0.f22419
            java.lang.String r0 = r0.f22418
            boolean r5 = kotlin.jvm.internal.AbstractC4394.m8917(r3, r2)
            if (r5 == 0) goto L76
            boolean r3 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r2)
            if (r3 == 0) goto L4f
            goto L87
        L4f:
            java.lang.Object r3 = r6.f232
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L5d
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L5d
        L5b:
            r1 = r4
            goto L87
        L5d:
            java.util.Iterator r3 = r3.iterator()
        L61:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L5b
            java.lang.Object r5 = r3.next()
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏 r5 = (p236.C8119) r5
            java.lang.String r5 = r5.f22418
            boolean r5 = kotlin.text.AbstractC5138.m10130(r5, r0)
            if (r5 == 0) goto L61
            goto L87
        L76:
            java.lang.String r3 = r6.m308(r3)
            boolean r5 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r2)
            if (r5 == 0) goto L83
            if (r3 == 0) goto L5b
            goto L87
        L83:
            boolean r1 = kotlin.text.AbstractC5138.m10130(r3, r0)
        L87:
            if (r1 != 0) goto L31
        L89:
            return r4
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p236.C8124.m13560(飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰):boolean");
    }

    public C8124(String str, String str2, String str3, ArrayList arrayList) {
        super(str3, arrayList);
        this.f22428 = str;
        this.f22427 = str2;
    }

    public C8124(String str, String str2) {
        this(str, str2, EmptyList.INSTANCE);
    }
}
