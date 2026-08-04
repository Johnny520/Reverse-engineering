package yyds;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲇᛸᲇᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2506 extends AbstractC2720 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static final C1361 f12335 = new C1361(1);

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0114 f12336;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final int f12337;

    public C2506(C0114 c0114, int i) {
        this.f12336 = c0114;
        this.f12337 = i;
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo484(C1942 c1942) {
        Object arrayList;
        Serializable arrayList2;
        int iM3744 = c1942.m3744();
        int iM4012 = AbstractC2104.m4012(iM3744);
        if (iM4012 == 0) {
            c1942.m3746();
            arrayList = new ArrayList();
        } else if (iM4012 != 2) {
            arrayList = null;
        } else {
            c1942.m3769();
            arrayList = new C1583(true);
        }
        if (arrayList == null) {
            return m4553(iM3744, c1942);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (c1942.m3753()) {
                String strM3741 = arrayList instanceof Map ? c1942.m3741() : null;
                int iM37442 = c1942.m3744();
                int iM40122 = AbstractC2104.m4012(iM37442);
                if (iM40122 == 0) {
                    c1942.m3746();
                    arrayList2 = new ArrayList();
                } else if (iM40122 != 2) {
                    arrayList2 = null;
                } else {
                    c1942.m3769();
                    arrayList2 = new C1583(true);
                }
                boolean z = arrayList2 != null;
                if (arrayList2 == null) {
                    arrayList2 = m4553(iM37442, c1942);
                }
                if (arrayList instanceof List) {
                    ((List) arrayList).add(arrayList2);
                } else {
                    ((Map) arrayList).put(strM3741, arrayList2);
                }
                if (z) {
                    arrayDeque.addLast(arrayList);
                    arrayList = arrayList2;
                }
            } else {
                if (arrayList instanceof List) {
                    c1942.m3750();
                } else {
                    c1942.m3768();
                }
                if (arrayDeque.isEmpty()) {
                    return arrayList;
                }
                arrayList = arrayDeque.removeLast();
            }
        }
    }

    @Override // yyds.AbstractC2720
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final void mo485(C1405 c1405, Object obj) {
        if (obj == null) {
            c1405.m2857();
            return;
        }
        AbstractC2720 abstractC2720M519 = this.f12336.m519(obj.getClass());
        if (!(abstractC2720M519 instanceof C2506)) {
            abstractC2720M519.mo485(c1405, obj);
        } else {
            c1405.m2858();
            c1405.m2865();
        }
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Serializable m4553(int i, C1942 c1942) {
        int iM4012 = AbstractC2104.m4012(i);
        if (iM4012 == 5) {
            return c1942.m3745();
        }
        if (iM4012 == 6) {
            return AbstractC0897.m1991(this.f12337, c1942);
        }
        if (iM4012 == 7) {
            return Boolean.valueOf(c1942.m3760());
        }
        if (iM4012 == 8) {
            c1942.m3767();
            return null;
        }
        C0188.m800("Unexpected token: ".concat(AbstractC0897.m1992(i)));
        return null;
    }
}
