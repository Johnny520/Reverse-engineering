package p000;

/* JADX INFO: loaded from: classes.dex */
public final class e3 extends p000.f8 implements p000.eb {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final android.database.sqlite.SQLiteStatement f298;

    public e3(android.database.sqlite.SQLiteStatement r1) {
            r0 = this;
            r0.<init>(r1)
            r0.f298 = r1
            return
    }

    @Override // p000.eb
    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public final int mo136() {
            r1 = this;
            android.database.sqlite.SQLiteStatement r0 = r1.f298
            int r0 = r0.executeUpdateDelete()
            return r0
    }

    @Override // p000.eb
    /* JADX INFO: renamed from: ۥ۠ۢ, reason: contains not printable characters */
    public final long mo137() {
            r2 = this;
            android.database.sqlite.SQLiteStatement r0 = r2.f298
            long r0 = r0.executeInsert()
            return r0
    }
}
