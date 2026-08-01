package p045;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6470 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6470 f17755 = new C6470(AbstractC8189.m13659(C6461.f17738, C6471.f17758, C6468.f17752, C6467.f17751));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f17756;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f17757;

    public C6470(List list) {
        list.getClass();
        this.f17757 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C4686 c4686 = ((AbstractC6472) obj).f17761;
            Object arrayList = linkedHashMap.get(c4686);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c4686, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f17756 = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0016 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p045.C6469 m11948(java.lang.String r8, kotlin.reflect.jvm.internal.impl.name.C4686 r9) {
        /*
            r7 = this;
            r9.getClass()
            r8.getClass()
            java.util.LinkedHashMap r7 = r7.f17756
            java.lang.Object r7 = r7.get(r9)
            java.util.List r7 = (java.util.List) r7
            r9 = 0
            if (r7 != 0) goto L12
            goto L66
        L12:
            java.util.Iterator r7 = r7.iterator()
        L16:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L66
            java.lang.Object r0 = r7.next()
            飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏哲兰世 r0 = (p045.AbstractC6472) r0
            java.lang.String r1 = r0.f17760
            r2 = 0
            boolean r1 = kotlin.text.AbstractC5138.m10125(r8, r1, r2)
            if (r1 == 0) goto L16
            java.lang.String r1 = r0.f17760
            int r1 = r1.length()
            java.lang.String r1 = r8.substring(r1)
            int r3 = r1.length()
            if (r3 != 0) goto L3d
        L3b:
            r1 = r9
            goto L5a
        L3d:
            int r3 = r1.length()
            r4 = r2
        L42:
            if (r2 >= r3) goto L56
            char r5 = r1.charAt(r2)
            int r5 = r5 + (-48)
            if (r5 < 0) goto L3b
            r6 = 10
            if (r5 >= r6) goto L3b
            int r4 = r4 * 10
            int r4 = r4 + r5
            int r2 = r2 + 1
            goto L42
        L56:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
        L5a:
            if (r1 == 0) goto L16
            int r7 = r1.intValue()
            飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏兰世哲 r8 = new 飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏兰世哲
            r8.<init>(r0, r7)
            return r8
        L66:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p045.C6470.m11948(java.lang.String, kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰):飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏兰世哲");
    }
}
