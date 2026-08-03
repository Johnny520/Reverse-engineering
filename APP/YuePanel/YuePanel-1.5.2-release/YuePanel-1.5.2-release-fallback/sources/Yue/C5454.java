package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۧۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5454 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final <T> T m20584(@Yue.InterfaceC4418 android.database.sqlite.SQLiteDatabase r0, boolean r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.database.sqlite.SQLiteDatabase, ? extends T> r2) {
            if (r1 == 0) goto L6
            r0.beginTransaction()
            goto L9
        L6:
            r0.beginTransactionNonExclusive()
        L9:
            r1 = 1
            java.lang.Object r2 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L1b
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1b
            Yue.C3249.m13687(r1)
            r0.endTransaction()
            Yue.C3249.m13686(r1)
            return r2
        L1b:
            r2 = move-exception
            Yue.C3249.m13687(r1)
            r0.endTransaction()
            Yue.C3249.m13686(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ java.lang.Object m20585(android.database.sqlite.SQLiteDatabase r0, boolean r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) {
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L5
            r1 = r4
        L5:
            if (r1 == 0) goto Lb
            r0.beginTransaction()
            goto Le
        Lb:
            r0.beginTransactionNonExclusive()
        Le:
            java.lang.Object r1 = r2.invoke(r0)     // Catch: java.lang.Throwable -> L1f
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1f
            Yue.C3249.m13687(r4)
            r0.endTransaction()
            Yue.C3249.m13686(r4)
            return r1
        L1f:
            r1 = move-exception
            Yue.C3249.m13687(r4)
            r0.endTransaction()
            Yue.C3249.m13686(r4)
            throw r1
    }
}
