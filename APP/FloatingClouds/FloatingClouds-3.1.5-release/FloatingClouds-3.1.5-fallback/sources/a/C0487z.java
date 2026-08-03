package a;

/* JADX INFO: renamed from: a.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0487z implements com.google.android.material.textfield.TextInputLayout.e, androidx.transition.e.g {
    public final /* synthetic */ int f;

    public /* synthetic */ C0487z(int r1) {
            r0 = this;
            r0.f = r1
            r0.<init>()
            return
    }

    public static int b(java.lang.String r0, int r1, int r2) {
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * r2
            return r0
    }

    public static java.lang.String c(int r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String d(androidx.recyclerview.widget.RecyclerView r0, java.lang.StringBuilder r1) {
            java.lang.String r0 = r0.B()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }

    public static java.lang.String e(java.lang.String r1, int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String f(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String g(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static java.lang.String h(java.lang.StringBuilder r0, java.lang.String r1, java.lang.String r2) {
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static java.lang.StringBuilder i(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            r0.append(r3)
            r0.append(r4)
            r0.append(r5)
            return r0
    }

    public static /* synthetic */ void j(java.lang.String r6, int r7) {
            if (r7 != 0) goto L57
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.Class<a.i9> r1 = a.C0193i9.class
            java.lang.String r2 = r1.getName()
            r3 = 0
        L13:
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L22
            int r3 = r3 + 1
            goto L13
        L22:
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L31
            int r3 = r3 + 1
            goto L22
        L31:
            r0 = r0[r3]
            java.lang.String r2 = r0.getClassName()
            java.lang.String r0 = r0.getMethodName()
            java.lang.String r3 = "Parameter specified as non-null is null: method "
            java.lang.String r4 = "."
            java.lang.String r5 = ", parameter "
            java.lang.StringBuilder r0 = i(r3, r2, r4, r0, r5)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            java.lang.String r6 = r1.getName()
            a.C0193i9.f(r7, r6)
            throw r7
        L57:
            return
    }

    public static java.lang.String k(java.lang.String r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @Override // androidx.transition.e.g
    public void a(androidx.transition.e.f r1, androidx.transition.e r2, boolean r3) {
            r0 = this;
            int r3 = r0.f
            switch(r3) {
                case 15: goto L15;
                case 16: goto L11;
                case 17: goto Ld;
                case 18: goto L9;
                default: goto L5;
            }
        L5:
            r1.g()
            return
        L9:
            r1.c()
            return
        Ld:
            r1.e(r2)
            return
        L11:
            r1.b(r2)
            return
        L15:
            r1.a(r2)
            return
    }
}
