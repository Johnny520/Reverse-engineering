package p236;

import androidx.appcompat.app.AbstractC0080;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import org.slf4j.Marker;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8125 extends AbstractC0080 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C8125 f22424 = new C8125(Marker.ANY_MARKER, Marker.ANY_MARKER);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final String f22425;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f22426;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8125(String str, String str2, List list) {
        super(str + '/' + str2, list);
        str.getClass();
        str2.getClass();
        list.getClass();
        this.f22426 = str;
        this.f22425 = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8125)) {
            return false;
        }
        C8125 c8125 = (C8125) obj;
        return AbstractC5139.m10130(this.f22426, c8125.f22426) && AbstractC5139.m10130(this.f22425, c8125.f22425) && AbstractC4395.m8907((List) this.f232, (List) c8125.f232);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f22426.toLowerCase(locale);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f22425.toLowerCase(locale);
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
    public final boolean m13589(p236.C8125 r7) {
        /*
            r6 = this;
            r7.getClass()
            java.lang.String r0 = r7.f22425
            java.lang.String r1 = r7.f22426
            java.lang.String r2 = "*"
            boolean r3 = kotlin.jvm.internal.AbstractC4395.m8907(r1, r2)
            r4 = 0
            if (r3 != 0) goto L1a
            java.lang.String r3 = r6.f22426
            boolean r1 = kotlin.text.AbstractC5139.m10130(r1, r3)
            if (r1 != 0) goto L1a
            goto L89
        L1a:
            boolean r1 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r2)
            if (r1 != 0) goto L29
            java.lang.String r1 = r6.f22425
            boolean r0 = kotlin.text.AbstractC5139.m10130(r0, r1)
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
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏 r0 = (p236.C8120) r0
            java.lang.String r3 = r0.f22417
            java.lang.String r0 = r0.f22416
            boolean r5 = kotlin.jvm.internal.AbstractC4395.m8907(r3, r2)
            if (r5 == 0) goto L76
            boolean r3 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r2)
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
            飘花落叶言楪兰世哲子苏.飘花落叶言子楪哲兰世苏 r5 = (p236.C8120) r5
            java.lang.String r5 = r5.f22416
            boolean r5 = kotlin.text.AbstractC5139.m10130(r5, r0)
            if (r5 == 0) goto L61
            goto L87
        L76:
            java.lang.String r3 = r6.m309(r3)
            boolean r5 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r2)
            if (r5 == 0) goto L83
            if (r3 == 0) goto L5b
            goto L87
        L83:
            boolean r1 = kotlin.text.AbstractC5139.m10130(r3, r0)
        L87:
            if (r1 != 0) goto L31
        L89:
            return r4
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p236.C8125.m13589(飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏世哲兰):boolean");
    }

    public C8125(String str, String str2, String str3, ArrayList arrayList) {
        super(str3, arrayList);
        this.f22426 = str;
        this.f22425 = str2;
    }

    public C8125(String str, String str2) {
        this(str, str2, EmptyList.INSTANCE);
    }
}
