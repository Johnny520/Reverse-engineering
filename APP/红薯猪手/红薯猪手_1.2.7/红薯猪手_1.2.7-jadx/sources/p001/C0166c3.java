package p001;

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
import p001.InterfaceC0160bb;

/* JADX INFO: renamed from: ۟.c3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0166c3 implements InterfaceC0160bb {

    /* JADX INFO: renamed from: ۥ */
    public final Context f730;

    /* JADX INFO: renamed from: ۥ۟ */
    public final String f731;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final InterfaceC0160bb.a f1395;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final boolean f1396;

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public final Object f1397 = new Object();

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public a f1398;

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public boolean f1399;

    /* JADX INFO: renamed from: ۟.c3$a */
    public static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: ۥ */
        public final C0152b3[] f732;

        /* JADX INFO: renamed from: ۥ۟ */
        public final InterfaceC0160bb.a f733;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean f1400;

        /* JADX INFO: renamed from: ۟.c3$a$a, reason: collision with other inner class name */
        public class C0494a implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: ۥ */
            public final /* synthetic */ InterfaceC0160bb.a f734;

            /* JADX INFO: renamed from: ۥ۟ */
            public final /* synthetic */ C0152b3[] f735;

            public C0494a(InterfaceC0160bb.a aVar, C0152b3[] c0152b3Arr) {
                this.f734 = aVar;
                this.f735 = c0152b3Arr;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
            @Override // android.database.DatabaseErrorHandler
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                InterfaceC0160bb.a aVar = this.f734;
                C0152b3[] c0152b3Arr = this.f735;
                C0152b3 c0152b3 = c0152b3Arr[0];
                if (c0152b3 == null) {
                    c0152b3Arr[0] = new C0152b3(sQLiteDatabase);
                } else {
                    if (!(c0152b3.f701 == sQLiteDatabase)) {
                    }
                }
                C0152b3 c0152b32 = c0152b3Arr[0];
                aVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + c0152b32.m1009());
                if (c0152b32.isOpen()) {
                    List<Pair<String, String>> listM1008 = null;
                    try {
                        try {
                            listM1008 = c0152b32.m1008();
                        } catch (SQLiteException unused) {
                        }
                        try {
                            c0152b32.close();
                        } catch (IOException unused2) {
                        }
                    } finally {
                        if (listM1008 != null) {
                            Iterator<Pair<String, String>> it = listM1008.iterator();
                            while (it.hasNext()) {
                                InterfaceC0160bb.a.m827((String) it.next().second);
                            }
                        } else {
                            InterfaceC0160bb.a.m827(c0152b32.m1009());
                        }
                    }
                }
            }
        }

        public a(Context context, String str, C0152b3[] c0152b3Arr, InterfaceC0160bb.a aVar) {
            super(context, str, null, aVar.f712, new C0494a(aVar, c0152b3Arr));
            this.f733 = aVar;
            this.f732 = c0152b3Arr;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final synchronized void close() {
            super.close();
            this.f732[0] = null;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            InterfaceC0160bb.a aVar = this.f733;
            m1032(sQLiteDatabase);
            aVar.mo824();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f733.mo1018(m1032(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f1400 = true;
            this.f733.mo1019(m1032(sQLiteDatabase), i, i2);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f1400) {
                return;
            }
            this.f733.mo1020(m1032(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            this.f1400 = true;
            this.f733.mo1021(m1032(sQLiteDatabase), i, i2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0010  */
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final C0152b3 m1032(SQLiteDatabase sQLiteDatabase) {
            C0152b3[] c0152b3Arr = this.f732;
            C0152b3 c0152b3 = c0152b3Arr[0];
            if (c0152b3 == null) {
                c0152b3Arr[0] = new C0152b3(sQLiteDatabase);
            } else {
                if (!(c0152b3.f701 == sQLiteDatabase)) {
                }
            }
            return c0152b3Arr[0];
        }

        /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
        public final synchronized InterfaceC0146ab m1033() {
            this.f1400 = false;
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (!this.f1400) {
                return m1032(writableDatabase);
            }
            close();
            return m1033();
        }
    }

    public C0166c3(Context context, String str, InterfaceC0160bb.a aVar, boolean z) {
        this.f730 = context;
        this.f731 = str;
        this.f1395 = aVar;
        this.f1396 = z;
    }

    @Override // p001.InterfaceC0160bb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1031().close();
    }

    @Override // p001.InterfaceC0160bb
    public final String getDatabaseName() {
        return this.f731;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0160bb
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f1397) {
            a aVar = this.f1398;
            if (aVar != null) {
                aVar.setWriteAheadLoggingEnabled(z);
            }
            this.f1399 = z;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final a m1031() {
        a aVar;
        synchronized (this.f1397) {
            if (this.f1398 == null) {
                C0152b3[] c0152b3Arr = new C0152b3[1];
                if (this.f731 == null || !this.f1396) {
                    this.f1398 = new a(this.f730, this.f731, c0152b3Arr, this.f1395);
                } else {
                    this.f1398 = new a(this.f730, new File(this.f730.getNoBackupFilesDir(), this.f731).getAbsolutePath(), c0152b3Arr, this.f1395);
                }
                this.f1398.setWriteAheadLoggingEnabled(this.f1399);
            }
            aVar = this.f1398;
        }
        return aVar;
    }

    @Override // p001.InterfaceC0160bb
    /* JADX INFO: renamed from: ۥ۠ۡ */
    public final InterfaceC0146ab mo1024() {
        return m1031().m1033();
    }
}
