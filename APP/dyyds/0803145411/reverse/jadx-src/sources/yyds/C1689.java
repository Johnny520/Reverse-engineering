package yyds;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: yyds.ᛷᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1689 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public static final /* synthetic */ int f8605 = 0;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public boolean f8606;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final C1760 f8607;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final C0689 f8608;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Context f8609;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f8610;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C0052 f8611;

    public C1689(Context context, String str, final C0052 c0052, final C1760 c1760) {
        super(context, str, null, c1760.f8838, new DatabaseErrorHandler(c1760, c0052) { // from class: yyds.ᲁᛵᛴᛸ

            /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
            public final /* synthetic */ C0052 f11033;

            {
                this.f11033 = c0052;
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = C1689.f8605;
                C0052 c00522 = this.f11033;
                C0574 c0574 = (C0574) c00522.f551;
                if (c0574 == null || !AbstractC1544.m3188(c0574.f2765, sQLiteDatabase)) {
                    c0574 = new C0574(sQLiteDatabase);
                    c00522.f551 = c0574;
                }
                SQLiteDatabase sQLiteDatabase2 = c0574.f2765;
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c0574 + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        C1760.m3496(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                C1760.m3496((String) ((Pair) it.next()).second);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                C1760.m3496(path2);
                            }
                        }
                    }
                } catch (SQLiteException unused) {
                }
                try {
                    c0574.close();
                } catch (IOException unused2) {
                }
                if (attachedDbs != null) {
                    return;
                }
            }
        });
        this.f8609 = context;
        this.f8611 = c0052;
        this.f8607 = c1760;
        this.f8608 = new C0689(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C0689 c0689 = this.f8608;
        try {
            c0689.m1595(c0689.f3263);
            super.close();
            this.f8611.f551 = null;
            this.f8606 = false;
        } finally {
            c0689.m1596();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        if (!this.f8610 && this.f8607.f8838 != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            m3433(sQLiteDatabase);
        } catch (Throwable th) {
            throw new C1191(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            ((C1491) this.f8607.f8839).m3000(new C1519(m3433(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new C1191(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f8610 = true;
        try {
            this.f8607.m3502(m3433(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C1191(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.f8610) {
            try {
                C1760 c1760 = this.f8607;
                C0574 c0574M3433 = m3433(sQLiteDatabase);
                C1491 c1491 = (C1491) c1760.f8839;
                c1491.m2999(new C1519(c0574M3433));
                c1491.f7036 = c0574M3433;
            } catch (Throwable th) {
                throw new C1191(5, th);
            }
        }
        this.f8606 = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f8610 = true;
        try {
            this.f8607.m3502(m3433(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new C1191(3, th);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C0574 m3431(boolean z) {
        C0689 c0689 = this.f8608;
        try {
            c0689.m1595((this.f8606 || getDatabaseName() == null) ? false : true);
            this.f8610 = false;
            SQLiteDatabase sQLiteDatabaseM3432 = m3432(z);
            if (!this.f8610) {
                C0574 c0574M3433 = m3433(sQLiteDatabaseM3432);
                c0689.m1596();
                return c0574M3433;
            }
            close();
            C0574 c0574M3431 = m3431(z);
            c0689.m1596();
            return c0574M3431;
        } catch (Throwable th) {
            c0689.m1596();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final SQLiteDatabase m3432(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.f8606;
        if (databaseName != null && !z2 && (parentFile = this.f8609.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return z ? getWritableDatabase() : getReadableDatabase();
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return z ? getWritableDatabase() : getReadableDatabase();
            } catch (Throwable th) {
                th = th;
                if (th instanceof C1191) {
                    C1191 c1191 = (C1191) th;
                    int iM4012 = AbstractC2104.m4012(c1191.f5459);
                    th = c1191.f5460;
                    if (iM4012 == 0 || iM4012 == 1 || iM4012 == 2 || iM4012 == 3) {
                        throw th;
                    }
                    if (iM4012 != 4) {
                        C0188.m801();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C0574 m3433(SQLiteDatabase sQLiteDatabase) {
        C0052 c0052 = this.f8611;
        C0574 c0574 = (C0574) c0052.f551;
        if (c0574 != null && AbstractC1544.m3188(c0574.f2765, sQLiteDatabase)) {
            return c0574;
        }
        C0574 c05742 = new C0574(sQLiteDatabase);
        c0052.f551 = c05742;
        return c05742;
    }
}
