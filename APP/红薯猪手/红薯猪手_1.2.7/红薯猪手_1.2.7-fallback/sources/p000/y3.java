package p000;

/* JADX INFO: loaded from: classes.dex */
public interface y3 extends android.os.IInterface {

    public static abstract class a extends android.os.Binder implements p000.y3 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static final /* synthetic */ int f1196 = 0;

        /* JADX INFO: renamed from: ۟.y3$a$a, reason: collision with other inner class name */
        public static class C0012a implements p000.y3 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public android.os.IBinder f1197;

            public C0012a(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.f1197 = r1
                    return
            }

            @Override // android.os.IInterface
            public final android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.f1197
                    return r0
            }

            @Override // p000.y3
            /* JADX INFO: renamed from: ۥ */
            public final void mo474(java.lang.String[] r4) {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.room.IMultiInstanceInvalidationCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1c
                    r0.writeStringArray(r4)     // Catch: java.lang.Throwable -> L1c
                    android.os.IBinder r4 = r3.f1197     // Catch: java.lang.Throwable -> L1c
                    r1 = 0
                    r2 = 1
                    boolean r4 = r4.transact(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L1c
                    if (r4 != 0) goto L18
                    int r4 = ۟.y3.a.f1196     // Catch: java.lang.Throwable -> L1c
                L18:
                    r0.recycle()
                    return
                L1c:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    void mo474(java.lang.String[] r1);
}
