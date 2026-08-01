package p000;

/* JADX INFO: renamed from: zi */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1059zi implements p000.a80 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13098;

    /* JADX INFO: renamed from: ζ */
    public final /* synthetic */ java.lang.String[] f13099;

    public /* synthetic */ C1059zi(java.lang.String[] r1, int r2) {
            r0 = this;
            r0.f13098 = r2
            r0.f13099 = r1
            r0.<init>()
            return
    }

    @Override // p000.a80
    public final java.lang.Object invoke(java.lang.Object r13) {
            r12 = this;
            int r0 = r12.f13098
            r1 = 3
            r2 = 4
            r3 = 0
            r4 = 1
            s62 r5 = p000.s62.f9751
            java.lang.String[] r12 = r12.f13099
            switch(r0) {
                case 0: goto Lfe;
                case 1: goto La4;
                case 2: goto L96;
                case 3: goto L73;
                case 4: goto L63;
                case 5: goto L55;
                case 6: goto L46;
                case 7: goto L2c;
                default: goto Ld;
            }
        Ld:
            r13.getClass()
            int r0 = r12.length
            r1 = r3
        L12:
            if (r1 >= r0) goto L26
            r2 = r12[r1]
            java.util.concurrent.atomic.AtomicBoolean r5 = p000.pr1.f8671
            java.lang.Class r5 = r13.getClass()
            boolean r2 = p000.pr1.m4582(r5, r2)
            if (r2 != 0) goto L23
            goto L27
        L23:
            int r1 = r1 + 1
            goto L12
        L26:
            r3 = r4
        L27:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            return r12
        L2c:
            r6 = r13
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r6
            r6.getClass()
            r10 = 6
            r11 = 0
            java.lang.String r7 = "void"
            r8 = 0
            r9 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r6, r7, r8, r9, r10, r11)
            int r13 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r13)
            java.lang.String[] r12 = (java.lang.String[]) r12
            r6.usingStrings(r12)
            return r5
        L46:
            org.luckypray.dexkit.query.FindMethod r13 = (org.luckypray.dexkit.query.FindMethod) r13
            r13.getClass()
            zi r0 = new zi
            r1 = 7
            r0.<init>(r12, r1)
            r13.matcher(r0)
            return r5
        L55:
            org.luckypray.dexkit.query.FindMethod r13 = (org.luckypray.dexkit.query.FindMethod) r13
            r13.getClass()
            zi r0 = new zi
            r0.<init>(r12, r2)
            r13.matcher(r0)
            return r5
        L63:
            org.luckypray.dexkit.query.matchers.MethodMatcher r13 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r13
            r13.getClass()
            int r0 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r0)
            java.lang.String[] r12 = (java.lang.String[]) r12
            r13.usingStrings(r12)
            return r5
        L73:
            r6 = r13
            org.luckypray.dexkit.query.matchers.MethodMatcher r6 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r6
            r6.getClass()
            r10 = 6
            r11 = 0
            java.lang.String r7 = "void"
            r8 = 0
            r9 = 0
            org.luckypray.dexkit.query.matchers.MethodMatcher.returnType$default(r6, r7, r8, r9, r10, r11)
            java.lang.String r13 = "int"
            java.lang.String[] r13 = new java.lang.String[]{r13}
            r6.paramTypes(r13)
            int r13 = r12.length
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r13)
            java.lang.String[] r12 = (java.lang.String[]) r12
            r6.usingStrings(r12)
            return r5
        L96:
            org.luckypray.dexkit.query.FindMethod r13 = (org.luckypray.dexkit.query.FindMethod) r13
            r13.getClass()
            zi r0 = new zi
            r0.<init>(r12, r1)
            r13.matcher(r0)
            return r5
        La4:
            org.luckypray.dexkit.query.matchers.MethodMatcher r13 = (org.luckypray.dexkit.query.matchers.MethodMatcher) r13
            r13.getClass()
            java.lang.String r0 = "void"
            r13.setReturnType(r0)
            int r0 = r12.length
            if (r0 == r4) goto Lf4
            r6 = 2
            if (r0 == r6) goto Le8
            if (r0 == r1) goto Lda
            if (r0 == r2) goto Lca
            r0 = r12[r3]
            r3 = r12[r4]
            r4 = r12[r6]
            r1 = r12[r1]
            r12 = r12[r2]
            java.lang.String[] r12 = new java.lang.String[]{r0, r3, r4, r1, r12}
            r13.paramTypes(r12)
            goto Lfd
        Lca:
            r0 = r12[r3]
            r2 = r12[r4]
            r3 = r12[r6]
            r12 = r12[r1]
            java.lang.String[] r12 = new java.lang.String[]{r0, r2, r3, r12}
            r13.paramTypes(r12)
            goto Lfd
        Lda:
            r0 = r12[r3]
            r1 = r12[r4]
            r12 = r12[r6]
            java.lang.String[] r12 = new java.lang.String[]{r0, r1, r12}
            r13.paramTypes(r12)
            goto Lfd
        Le8:
            r0 = r12[r3]
            r12 = r12[r4]
            java.lang.String[] r12 = new java.lang.String[]{r0, r12}
            r13.paramTypes(r12)
            goto Lfd
        Lf4:
            r12 = r12[r3]
            java.lang.String[] r12 = new java.lang.String[]{r12}
            r13.paramTypes(r12)
        Lfd:
            return r5
        Lfe:
            org.luckypray.dexkit.query.FindMethod r13 = (org.luckypray.dexkit.query.FindMethod) r13
            r13.getClass()
            zi r0 = new zi
            r0.<init>(r12, r4)
            r13.matcher(r0)
            return r5
    }
}
