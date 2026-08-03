package a;

/* JADX INFO: renamed from: a.n8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0281n8 implements io.github.libxposed.api.XposedInterface.Hooker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f599a;
    public final /* synthetic */ a.C0335q8 b;

    public /* synthetic */ C0281n8(a.C0335q8 r1, int r2) {
            r0 = this;
            r0.f599a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    public final java.lang.Object intercept(io.github.libxposed.api.XposedInterface.Chain r7) {
            r6 = this;
            int r0 = r6.f599a
            switch(r0) {
                case 0: goto L126;
                case 1: goto Lfd;
                case 2: goto L8a;
                case 3: goto L24;
                default: goto L5;
            }
        L5:
            a.q8 r0 = r6.b
            java.lang.String r1 = "chain"
            a.C0193i9.e(r7, r1)
            java.lang.Object r1 = r7.proceed()
            boolean r2 = a.C0335q8.j()     // Catch: java.lang.Throwable -> L23
            if (r2 != 0) goto L17
            goto L23
        L17:
            java.lang.Object r7 = r7.getThisObject()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "getThisObject(...)"
            a.C0193i9.d(r7, r2)     // Catch: java.lang.Throwable -> L23
            r0.h(r7)     // Catch: java.lang.Throwable -> L23
        L23:
            return r1
        L24:
            a.q8 r0 = r6.b
            java.lang.String r1 = "MyPlugin-DexKit"
            java.lang.String r2 = "[RecentForward] SelectContactMvvmList.e filtered "
            java.lang.String r3 = "chain"
            a.C0193i9.e(r7, r3)
            java.lang.Object r7 = r7.proceed()
            boolean r3 = a.C0335q8.j()     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L3a
            goto L89
        L3a:
            boolean r3 = r7 instanceof java.util.List     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L44
            r3 = r7
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r0 = move-exception
            goto L74
        L44:
            r3 = 0
        L45:
            if (r3 != 0) goto L48
            goto L89
        L48:
            java.util.ArrayList r0 = r0.f(r3)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L89
            int r4 = r3.size()     // Catch: java.lang.Throwable -> L42
            int r5 = r0.size()     // Catch: java.lang.Throwable -> L42
            int r4 = r4 - r5
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L42
            r5.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch: java.lang.Throwable -> L42
            r5.append(r3)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L42
            android.util.Log.i(r1, r2)     // Catch: java.lang.Throwable -> L42
            r7 = r0
            goto L89
        L74:
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[RecentForward] SelectContactMvvmList.e filter err: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r1, r0)
        L89:
            return r7
        L8a:
            a.q8 r0 = r6.b
            java.lang.String r1 = "chain"
            a.C0193i9.e(r7, r1)
            java.lang.Object r1 = r7.getThisObject()
            java.util.List r2 = r7.getArgs()
            r3 = 0
            java.lang.Object r2 = r2.get(r3)
            r7.proceed()
            r7 = 1
            boolean r3 = a.C0335q8.j()     // Catch: java.lang.Throwable -> Le5
            if (r3 != 0) goto La9
            goto Lfb
        La9:
            if (r2 == 0) goto Lfb
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r4 = "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> Le5
            if (r3 != 0) goto Lbc
            goto Lfb
        Lbc:
            boolean r3 = r1 instanceof android.view.View     // Catch: java.lang.Throwable -> Le5
            if (r3 != 0) goto Lc1
            goto Lfb
        Lc1:
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.Throwable -> Le5
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> Le5
            java.lang.String r1 = a.C0335q8.a(r1)     // Catch: java.lang.Throwable -> Le5
            java.lang.String r3 = "com.tencent.mm.ui.mvvm.MvvmContactListUI"
            boolean r1 = a.C0193i9.a(r1, r3)     // Catch: java.lang.Throwable -> Le5
            if (r1 != 0) goto Ld4
            goto Lfb
        Ld4:
            java.lang.String r1 = "MyPlugin-DexKit: [RecentForward] WxRecyclerAdapter captured from RecyclerView, scheduling filter"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> Le5
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r7)     // Catch: java.lang.Throwable -> Le5
            a.C0453x1.b(r1)     // Catch: java.lang.Throwable -> Le5
            r0.m(r2)     // Catch: java.lang.Throwable -> Le5
            goto Lfb
        Le5:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = "MyPlugin-DexKit: [RecentForward] StdRv setAdapter filter err: "
            java.lang.String r0 = a.C0487z.k(r1, r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r0, r7)
            a.C0453x1.e(r7)
        Lfb:
            r7 = 0
            return r7
        Lfd:
            a.q8 r0 = r6.b
            java.lang.String r1 = "chain"
            a.C0193i9.e(r7, r1)
            java.lang.Object r7 = r7.proceed()
            boolean r1 = a.C0335q8.j()     // Catch: java.lang.Exception -> L125
            if (r1 != 0) goto L10f
            goto L125
        L10f:
            if (r7 != 0) goto L112
            goto L125
        L112:
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Exception -> L125
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L125
            java.lang.String r2 = "com.tencent.mm.ui.contact.item.q1"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Exception -> L125
            if (r1 == 0) goto L125
            r0.e(r7)     // Catch: java.lang.Exception -> L125
        L125:
            return r7
        L126:
            a.q8 r0 = r6.b
            java.lang.String r1 = "chain"
            a.C0193i9.e(r7, r1)
            java.lang.Object r1 = r7.proceed()
            r0.getClass()     // Catch: java.lang.Throwable -> L154
            boolean r2 = a.C0335q8.j()     // Catch: java.lang.Throwable -> L154
            if (r2 == 0) goto L154
            java.lang.ThreadLocal<java.lang.Boolean> r2 = r0.h     // Catch: java.lang.Throwable -> L154
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L154
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L154
            boolean r2 = a.C0193i9.a(r2, r3)     // Catch: java.lang.Throwable -> L154
            if (r2 != 0) goto L154
            java.lang.Object r7 = r7.getThisObject()     // Catch: java.lang.Throwable -> L154
            java.lang.String r2 = "getThisObject(...)"
            a.C0193i9.d(r7, r2)     // Catch: java.lang.Throwable -> L154
            r0.n(r7)     // Catch: java.lang.Throwable -> L154
        L154:
            return r1
    }
}
