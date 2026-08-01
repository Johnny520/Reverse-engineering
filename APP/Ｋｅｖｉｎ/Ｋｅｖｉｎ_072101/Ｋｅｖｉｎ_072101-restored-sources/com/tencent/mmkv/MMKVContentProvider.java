package com.tencent.mmkv;

/* JADX INFO: loaded from: classes2.dex */
public class MMKVContentProvider extends android.content.ContentProvider {
    protected static final java.lang.String FUNCTION_NAME = "mmkvFromAshmemID";
    protected static final java.lang.String KEY = "KEY";
    protected static final java.lang.String KEY_CRYPT = "KEY_CRYPT";
    protected static final java.lang.String KEY_MODE = "KEY_MODE";
    protected static final java.lang.String KEY_SIZE = "KEY_SIZE";
    private static android.net.Uri gUri;

    public MMKVContentProvider() {
            r0 = this;
            r0.<init>()
            return
    }

    protected static android.net.Uri contentUri(android.content.Context r3) {
            android.net.Uri r0 = com.tencent.mmkv.MMKVContentProvider.gUri
            if (r0 == 0) goto L7
            android.net.Uri r0 = com.tencent.mmkv.MMKVContentProvider.gUri
            return r0
        L7:
            r0 = 0
            if (r3 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = queryAuthority(r3)
            if (r1 != 0) goto L12
            return r0
        L12:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "content://"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            com.tencent.mmkv.MMKVContentProvider.gUri = r0
            android.net.Uri r0 = com.tencent.mmkv.MMKVContentProvider.gUri
            return r0
    }

    protected static java.lang.String getProcessNameByPID(android.content.Context r4, int r5) {
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r4.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L26
            java.util.List r1 = r0.getRunningAppProcesses()
            java.util.Iterator r1 = r1.iterator()
        L12:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r3 = r2.pid
            if (r3 != r5) goto L25
            java.lang.String r1 = r2.processName
            return r1
        L25:
            goto L12
        L26:
            java.lang.String r1 = ""
            return r1
    }

    private android.os.Bundle mmkvFromAshmemID(java.lang.String r5, int r6, int r7, java.lang.String r8) throws java.lang.RuntimeException {
            r4 = this;
            android.content.Context r0 = r4.getContext()
            com.tencent.mmkv.MMKV r0 = com.tencent.mmkv.MMKV.mmkvWithAshmemID(r0, r5, r6, r7, r8)
            com.tencent.mmkv.ParcelableMMKV r1 = new com.tencent.mmkv.ParcelableMMKV
            r1.<init>(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " fd = "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r0.ashmemFD()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ", meta fd = "
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r0.ashmemMetaFD()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "MMKV"
            android.util.Log.i(r3, r2)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "KEY"
            r2.putParcelable(r3, r1)
            return r2
    }

    private static java.lang.String queryAuthority(android.content.Context r4) {
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch: java.lang.Exception -> L1c
            java.lang.Class<com.tencent.mmkv.MMKVContentProvider> r1 = com.tencent.mmkv.MMKVContentProvider.class
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L1c
            r0.<init>(r4, r1)     // Catch: java.lang.Exception -> L1c
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Exception -> L1c
            if (r1 == 0) goto L1b
            r2 = 0
            android.content.pm.ProviderInfo r2 = r1.getProviderInfo(r0, r2)     // Catch: java.lang.Exception -> L1c
            if (r2 == 0) goto L1b
            java.lang.String r3 = r2.authority     // Catch: java.lang.Exception -> L1c
            return r3
        L1b:
            goto L20
        L1c:
            r0 = move-exception
            r0.printStackTrace()
        L20:
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String r8, java.lang.String r9, android.os.Bundle r10) {
            r7 = this;
            java.lang.String r0 = "mmkvFromAshmemID"
            boolean r0 = r8.equals(r0)
            r1 = 0
            if (r0 == 0) goto L2d
            if (r10 == 0) goto L2d
            java.lang.String r0 = "KEY_SIZE"
            int r0 = r10.getInt(r0)
            java.lang.String r2 = "KEY_MODE"
            int r2 = r10.getInt(r2)
            java.lang.String r3 = "KEY_CRYPT"
            java.lang.String r3 = r10.getString(r3)
            android.os.Bundle r1 = r7.mmkvFromAshmemID(r9, r0, r2, r3)     // Catch: java.lang.Exception -> L22
            return r1
        L22:
            r4 = move-exception
            java.lang.String r5 = "MMKV"
            java.lang.String r6 = r4.getMessage()
            android.util.Log.e(r5, r6)
            return r1
        L2d:
            return r1
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri r3, java.lang.String r4, java.lang.String[] r5) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not implement in MMKV"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri r2) {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri r3, android.content.ContentValues r4) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not implement in MMKV"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r1 = 1
            return r1
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri r3, java.lang.String[] r4, java.lang.String r5, java.lang.String[] r6, java.lang.String r7) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not implement in MMKV"
            r0.<init>(r1)
            throw r0
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri r3, android.content.ContentValues r4, java.lang.String r5, java.lang.String[] r6) {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Not implement in MMKV"
            r0.<init>(r1)
            throw r0
    }
}
