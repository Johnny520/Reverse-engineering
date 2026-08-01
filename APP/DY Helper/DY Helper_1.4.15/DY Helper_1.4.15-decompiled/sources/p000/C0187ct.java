package p000;

/* JADX INFO: renamed from: ct */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0187ct {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicInteger f2739 = null;

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = -1
            r0.<init>(r1)
            p000.C0187ct.f2739 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m1614(p000.k01 r8, java.lang.String r9) {
            java.lang.Object[] r0 = r8.f5692
            r0.getClass()
            java.lang.Object r0 = p000.AbstractC0312g7.m2250(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            r2 = 0
            if (r1 == 0) goto L11
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L12
        L11:
            r0 = r2
        L12:
            if (r0 == 0) goto L89
            int r0 = r0.intValue()
            r1 = 6
            if (r0 == r1) goto L1c
            goto L89
        L1c:
            java.util.concurrent.atomic.AtomicInteger r0 = p000.C0187ct.f2739
            int r3 = r0.get()
            if (r3 < 0) goto L89
            if (r3 >= r1) goto L89
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            r1.getClass()
            int r4 = r1.length
            r5 = 0
        L33:
            if (r5 >= r4) goto L89
            r6 = r1[r5]
            java.lang.String r6 = r6.getClassName()
            java.lang.String r7 = "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CED5BD5ECBA8992653747B4C9D50D28D3F2E9C36E567C62E1C1AC5F4C0195F"
            java.lang.String r7 = p000.jf0.m2957(r7)
            boolean r6 = p000.ln0.m3626(r6, r7)
            if (r6 == 0) goto L86
            boolean r1 = p000.AbstractC0976x9.m6527()
            if (r1 != 0) goto L52
            r8 = -1
            r0.set(r8)
            return
        L52:
            java.lang.Object r0 = r8.f5694
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L5b
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L5c
        L5b:
            r0 = r2
        L5c:
            if (r0 == 0) goto L89
            int r0 = r0.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r8.m3107(r1)
            if (r0 == r3) goto L89
            int r0 = r0 + 1
            int r3 = r3 + 1
            java.lang.String r8 = " 拦截成功: 原始="
            java.lang.String r1 = "点 → 目标="
            java.lang.String r4 = "骰子 "
            java.lang.StringBuilder r8 = p000.AbstractC0602nx.m4135(r0, r4, r9, r8, r1)
            java.lang.String r9 = "点"
            java.lang.String r8 = p000.AbstractC0602nx.m4131(r8, r3, r9)
            r9 = 4
            java.lang.String r0 = "rf839340cfbdf7ea6"
            p000.C0888ux.m5988(r0, r8, r2, r9, r2)
            return
        L86:
            int r5 = r5 + 1
            goto L33
        L89:
            return
    }

    /* JADX INFO: renamed from: β */
    public static void m1615(int r6) {
            r0 = 1
            r1 = 4
            java.lang.String r2 = "rf839340cfbdf7ea6"
            java.util.concurrent.atomic.AtomicInteger r3 = p000.C0187ct.f2739
            r4 = 0
            if (r0 > r6) goto L30
            r0 = 7
            if (r6 >= r0) goto L30
            boolean r0 = p000.AbstractC0976x9.m6527()
            if (r0 == 0) goto L30
            int r0 = r6 + (-1)
            r3.set(r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "骰子已设定为 "
            r3.<init>(r5)
            r3.append(r6)
            java.lang.String r6 = " 点 (内部值="
            r3.append(r6)
            java.lang.String r6 = ")"
            java.lang.String r6 = p000.AbstractC0602nx.m4131(r3, r0, r6)
            p000.C0888ux.m5988(r2, r6, r4, r1, r4)
            return
        L30:
            r6 = -1
            r3.set(r6)
            java.lang.String r6 = "骰子已恢复随机模式"
            p000.C0888ux.m5988(r2, r6, r4, r1, r4)
            return
    }
}
