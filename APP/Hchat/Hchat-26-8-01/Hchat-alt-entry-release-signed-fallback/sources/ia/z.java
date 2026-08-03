package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends de.robv.android.xposed.XC_MethodHook {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ia.a0 f6648b;

    public /* synthetic */ z(ia.a0 r1, int r2) {
            r0 = this;
            r0.f6647a = r2
            r0.f6648b = r1
            r0.<init>()
            return
    }

    public void afterHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r2) {
            r1 = this;
            int r0 = r1.f6647a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.afterHookedMethod(r2)
            return
        L9:
            r2.getClass()
            ia.a0 r0 = r1.f6648b
            java.lang.Object r2 = r2.thisObject
            r0.i(r2)
            return
    }

    public void beforeHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            r7 = this;
            int r0 = r7.f6647a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.beforeHookedMethod(r8)
            return
        L9:
            r8.getClass()
            java.lang.Object[] r0 = r8.args
            if (r0 == 0) goto Lbb
            r1 = 0
            java.lang.Object r0 = tf.l.C0(r1, r0)
            if (r0 == 0) goto Lbb
            ia.a0 r2 = r7.f6648b
            r2.getClass()
            java.lang.String r0 = ia.a0.q(r0)
            if (r0 == 0) goto Lbb
            b5.c r3 = r2.f6539b
            ia.c r0 = r3.l(r0)
            ia.c r0 = ia.a0.g(r0)
            java.util.List r0 = r0.f6559b
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L36
            goto Lbb
        L36:
            java.lang.Object[] r3 = r8.args
            if (r3 == 0) goto Lbb
            r4 = 3
            java.lang.Object r3 = tf.l.C0(r4, r3)
            if (r3 == 0) goto Lbb
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L80
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L4c
            goto La8
        L4c:
            java.util.Iterator r0 = r0.iterator()
        L50:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto La8
            java.lang.Object r4 = r0.next()
            ia.b r4 = (ia.b) r4
            java.lang.String r4 = r4.f6553a
            java.lang.String r5 = "comment:"
            java.lang.String r4 = r5.concat(r4)
            int r4 = r4.hashCode()
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            r4 = r4 & r5
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 | r5
            r5 = r3
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r6 = 1
            if (r4 != r5) goto L7b
            r4 = r6
            goto L7c
        L7b:
            r4 = r1
        L7c:
            if (r4 == 0) goto L50
            r1 = r6
            goto La8
        L80:
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L87
            goto La8
        L87:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L90:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto La4
            java.lang.Object r4 = r0.next()
            ia.b r4 = (ia.b) r4
            ia.f r4 = ia.h.a(r4)
            r1.add(r4)
            goto L90
        La4:
            boolean r1 = ia.h.c(r3, r1)
        La8:
            if (r1 != 0) goto Lab
            goto Lbb
        Lab:
            r0 = 0
            r8.setResult(r0)
            android.os.Handler r8 = r2.f6545h
            a1.a r0 = new a1.a
            r1 = 22
            r0.<init>(r2, r1)
            r8.post(r0)
        Lbb:
            return
    }
}
