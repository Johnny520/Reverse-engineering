package p045;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import p034.AbstractC6347;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6471 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C6471 f17751 = new C6471(AbstractC6347.m11931(C6462.f17734, C6472.f17754, C6469.f17748, C6468.f17747));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final LinkedHashMap f17752;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final List f17753;

    public C6471(List list) {
        list.getClass();
        this.f17753 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            C4687 c4687 = ((AbstractC6473) obj).f17757;
            Object arrayList = linkedHashMap.get(c4687);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(c4687, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        this.f17752 = linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0016 A[SYNTHETIC] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p045.C6470 m11991(java.lang.String r8, kotlin.reflect.jvm.internal.impl.name.C4687 r9) {
        /*
            r7 = this;
            r9.getClass()
            r8.getClass()
            java.util.LinkedHashMap r7 = r7.f17752
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
            飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏哲兰世 r0 = (p045.AbstractC6473) r0
            java.lang.String r1 = r0.f17756
            r2 = 0
            boolean r1 = kotlin.text.AbstractC5139.m10139(r8, r1, r2)
            if (r1 == 0) goto L16
            java.lang.String r1 = r0.f17756
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
        throw new UnsupportedOperationException("Method not decompiled: p045.C6471.m11991(java.lang.String, kotlin.reflect.jvm.internal.impl.name.飘花落叶言子楪世哲苏兰):飘花落叶言世子兰哲楪苏.飘花落叶言子楪苏兰世哲");
    }
}
