package p000;

/* JADX INFO: loaded from: classes.dex */
public interface bb extends java.io.Closeable {

    public static abstract class a {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final int f166;

        public a(int r1) {
                r0 = this;
                r0.<init>()
                r0.f166 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m85(java.lang.String r2) {
                java.lang.String r0 = ":memory:"
                boolean r0 = r2.equalsIgnoreCase(r0)
                if (r0 != 0) goto L38
                java.lang.String r0 = r2.trim()
                int r0 = r0.length()
                if (r0 != 0) goto L13
                goto L38
            L13:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "deleting the database file: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.w(r1, r0)
                java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L32
                r0.<init>(r2)     // Catch: java.lang.Exception -> L32
                android.database.sqlite.SQLiteDatabase.deleteDatabase(r0)     // Catch: java.lang.Exception -> L32
                goto L38
            L32:
                r2 = move-exception
                java.lang.String r0 = "delete failed: "
                android.util.Log.w(r1, r0, r2)
            L38:
                return
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract void mo75();

        /* JADX INFO: renamed from: ۥ۟۟ */
        public abstract void mo76(p000.b3 r1);

        /* JADX INFO: renamed from: ۥ۟۠ */
        public abstract void mo77(p000.b3 r1, int r2, int r3);

        /* JADX INFO: renamed from: ۥ۟ۡ */
        public abstract void mo78(p000.b3 r1);

        /* JADX INFO: renamed from: ۥ۟ۢ */
        public abstract void mo79(p000.b3 r1, int r2, int r3);
    }

    public interface b {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    java.lang.String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean r1);

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    p000.ab mo84();
}
