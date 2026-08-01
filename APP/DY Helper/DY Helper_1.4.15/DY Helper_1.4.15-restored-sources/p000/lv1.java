package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class lv1 {

    /* JADX INFO: renamed from: α */
    public static final p000.lv1 f6813 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.atomic.AtomicBoolean f6814 = null;

    /* JADX INFO: renamed from: γ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f6815 = null;

    /* JADX INFO: renamed from: δ */
    public static final java.util.concurrent.ConcurrentHashMap.KeySetView f6816 = null;

    static {
            lv1 r0 = new lv1
            r0.<init>()
            p000.lv1.f6813 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.lv1.f6814 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.lv1.f6815 = r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            p000.lv1.f6816 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m3664(java.lang.reflect.Method r5, java.lang.Object r6, int r7, java.util.List r8, boolean r9, int r10) {
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L7
            goto L55
        L7:
            r0 = 0
            if (r6 == 0) goto Lf
            java.lang.Class r6 = r6.getClass()
            goto L10
        Lf:
            r6 = r0
        L10:
            java.lang.Class r1 = r5.getDeclaringClass()
            java.lang.String r1 = r1.getName()
            if (r6 == 0) goto L1f
            java.lang.String r2 = r6.getName()
            goto L20
        L1f:
            r2 = r0
        L20:
            java.lang.String r3 = ""
            if (r2 != 0) goto L25
            r2 = r3
        L25:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "@"
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = ":"
            r4.append(r1)
            r4.append(r7)
            java.lang.String r1 = r4.toString()
            if (r10 <= 0) goto L4a
            java.lang.String r2 = ":removed"
        L45:
            java.lang.String r1 = r1.concat(r2)
            goto L4d
        L4a:
            java.lang.String r2 = ":observed"
            goto L45
        L4d:
            java.util.concurrent.ConcurrentHashMap$KeySetView r2 = p000.lv1.f6815
            boolean r1 = r2.add(r1)
            if (r1 != 0) goto L56
        L55:
            return
        L56:
            java.util.Iterator r1 = r8.iterator()
        L5a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L67
            java.lang.Object r2 = r1.next()
            if (r2 == 0) goto L5a
            goto L68
        L67:
            r2 = r0
        L68:
            if (r2 == 0) goto L73
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getName()
            goto L75
        L73:
            java.lang.String r1 = "null"
        L75:
            java.lang.Class r5 = r5.getDeclaringClass()
            java.lang.String r5 = r5.getSimpleName()
            if (r6 == 0) goto L83
            java.lang.String r0 = r6.getSimpleName()
        L83:
            if (r0 != 0) goto L86
            goto L87
        L86:
            r3 = r0
        L87:
            int r6 = r8.size()
            java.lang.String r8 = " receiver="
            java.lang.String r0 = " index="
            java.lang.String r2 = "callback owner="
            java.lang.StringBuilder r5 = p000.lz1.m3695(r2, r5, r8, r3, r0)
            java.lang.String r8 = " source="
            java.lang.String r0 = " applicable="
            p000.AbstractC0602nx.m4117(r5, r7, r8, r6, r0)
            r5.append(r9)
            java.lang.String r6 = " removed="
            r5.append(r6)
            r5.append(r10)
            java.lang.String r6 = " sample="
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "rac25e39d95f0abcc"
            p000.C0888ux.m5975(r6, r5)
            return
    }
}
