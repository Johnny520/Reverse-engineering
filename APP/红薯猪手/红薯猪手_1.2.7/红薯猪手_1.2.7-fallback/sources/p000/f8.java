package p000;

/* JADX INFO: loaded from: classes.dex */
public class f8 implements p000.cb {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f360;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public java.lang.Object f361;

    public f8(android.database.sqlite.SQLiteProgram r2) {
            r1 = this;
            r0 = 1
            r1.f360 = r0
            r1.<init>()
            r1.f361 = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            int r0 = r1.f360
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L7
        L6:
            return
        L7:
            java.lang.Object r0 = r1.f361
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.close()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m159(int r2, byte[] r3) {
            r1 = this;
            int r0 = r1.f360
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto La
        L6:
            r1.m161(r2, r3)
            return
        La:
            java.lang.Object r0 = r1.f361
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.bindBlob(r2, r3)
            return
    }

    @Override // p000.cb
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final void mo113(int r2, java.lang.String r3) {
            r1 = this;
            int r0 = r1.f360
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto La
        L6:
            r1.m161(r2, r3)
            return
        La:
            java.lang.Object r0 = r1.f361
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.bindString(r2, r3)
            return
    }

    @Override // p000.cb
    /* JADX INFO: renamed from: ۥ۟ۥ */
    public final void mo114(int r2) {
            r1 = this;
            int r0 = r1.f360
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            r0 = 0
            r1.m161(r2, r0)
            return
        Lb:
            java.lang.Object r0 = r1.f361
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.bindNull(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final void m160(int r2, double r3) {
            r1 = this;
            int r0 = r1.f360
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            r1.m161(r2, r3)
            return
        Le:
            java.lang.Object r0 = r1.f361
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.bindDouble(r2, r3)
            return
    }

    @Override // p000.cb
    /* JADX INFO: renamed from: ۥ۠ */
    public final void mo116(int r2, long r3) {
            r1 = this;
            int r0 = r1.f360
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.m161(r2, r3)
            return
        Le:
            java.lang.Object r0 = r1.f361
            android.database.sqlite.SQLiteProgram r0 = (android.database.sqlite.SQLiteProgram) r0
            r0.bindLong(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final void m161(int r4, java.lang.Object r5) {
            r3 = this;
            int r4 = r4 + (-1)
            java.lang.Object r0 = r3.f361
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            if (r4 < r0) goto L21
            java.lang.Object r0 = r3.f361
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
        L14:
            if (r0 > r4) goto L21
            java.lang.Object r1 = r3.f361
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            r1.add(r2)
            int r0 = r0 + 1
            goto L14
        L21:
            java.lang.Object r0 = r3.f361
            java.util.List r0 = (java.util.List) r0
            r0.set(r4, r5)
            return
    }
}
