package io.github.libxposed.service;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class XposedProvider extends android.content.ContentProvider {
    public XposedProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.content.ContentProvider
    public final android.os.Bundle call(java.lang.String r3, java.lang.String r4, android.os.Bundle r5) {
            r2 = this;
            java.lang.String r2 = "SendBinder"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L9e
            if (r5 == 0) goto L9e
            java.lang.String r2 = "binder"
            android.os.IBinder r2 = r5.getBinder(r2)
            if (r2 == 0) goto L98
            java.lang.String r3 = "XposedProvider"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "binder received: "
            r4.<init>(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r3, r4)
            java.util.HashSet r3 = defpackage.AbstractC2338.f10091
            monitor-enter(r3)
            ᲁᛴᲈᲁ r4 = new ᲁᛴᲈᲁ     // Catch: java.lang.Throwable -> L4d
            int r5 = defpackage.AbstractBinderC1095.f4897     // Catch: java.lang.Throwable -> L4d
            java.lang.String r5 = "io.github.libxposed.service.IXposedService"
            android.os.IInterface r5 = r2.queryLocalInterface(r5)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L3b
            boolean r0 = r5 instanceof defpackage.InterfaceC0132     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L3b
            ᛱᛷᲀᛸ r5 = (defpackage.InterfaceC0132) r5     // Catch: java.lang.Throwable -> L4d
            goto L42
        L3b:
            ᲁᲇᛴᲀ r5 = new ᲁᲇᛴᲀ     // Catch: java.lang.Throwable -> L4d
            r5.<init>()     // Catch: java.lang.Throwable -> L4d
            r5.f8458 = r2     // Catch: java.lang.Throwable -> L4d
        L42:
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L4d
            com.ss.android.ugc.awemes.MainApp r5 = defpackage.AbstractC2338.f10092     // Catch: java.lang.Throwable -> L4d
            if (r5 != 0) goto L4f
            r3.add(r4)     // Catch: java.lang.Throwable -> L4d
            goto L93
        L4d:
            r2 = move-exception
            goto L8c
        L4f:
            ᲈᛱᛵᛷ r5 = new ᲈᛱᛵᛷ     // Catch: java.lang.Throwable -> L4d
            r0 = 1
            r5.<init>(r4, r0)     // Catch: java.lang.Throwable -> L4d
            r0 = 0
            r2.linkToDeath(r5, r0)     // Catch: java.lang.Throwable -> L4d
            com.ss.android.ugc.awemes.MainApp r2 = defpackage.AbstractC2338.f10092     // Catch: java.lang.Throwable -> L4d
            r2.getClass()     // Catch: java.lang.Throwable -> L4d
            r0 = -830488045854254(0xfffd0cacef0961d2, double:NaN)
            com.ss.android.ugc.awemes.MainApp.f424 = r4     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.CopyOnWriteArraySet r2 = com.ss.android.ugc.awemes.MainApp.f423     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r5 = r2.iterator()     // Catch: java.lang.Throwable -> L4d
            r0 = -830350606900782(0xfffd0cccef0961d2, double:NaN)
        L76:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L93
            java.lang.Object r0 = r5.next()     // Catch: java.lang.Throwable -> L4d
            ᛷᛲᛳᛵ r0 = (defpackage.InterfaceC1221) r0     // Catch: java.lang.Throwable -> L4d
            boolean r1 = r2.contains(r0)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L76
            r0.onServiceStateChanged(r4)     // Catch: java.lang.Throwable -> L4d
            goto L76
        L8c:
            java.lang.String r4 = "XposedServiceHelper"
            java.lang.String r5 = "onBinderReceived"
            android.util.Log.e(r4, r5, r2)     // Catch: java.lang.Throwable -> L95
        L93:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L95
            goto L98
        L95:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L95
            throw r2
        L98:
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            return r2
        L9e:
            r2 = 0
            return r2
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri r1, android.content.ContentValues r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
            r1 = this;
            android.content.Context r1 = r1.getContext()
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()
            int r1 = r1.targetSdkVersion
            r0 = 30
            if (r1 < r0) goto L10
            int r1 = defpackage.AbstractSharedPreferencesC0174.f1151
        L10:
            r1 = 1
            return r1
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri r1, android.content.ContentValues r2, java.lang.String r3, java.lang.String[] r4) {
            r0 = this;
            r0 = 0
            return r0
    }
}
