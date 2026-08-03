package p001;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: renamed from: ۟.bb */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0160bb extends Closeable {

    /* JADX INFO: renamed from: ۟.bb$a */
    public static abstract class a {

        /* JADX INFO: renamed from: ۥ */
        public final int f712;

        public a(int i) {
            this.f712 = i;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: ۥ */
        public static void m827(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e) {
                Log.w("SupportSQLite", "delete failed: ", e);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public abstract void mo824();

        /* JADX INFO: renamed from: ۥ۟۟ */
        public abstract void mo1018(C0152b3 c0152b3);

        /* JADX INFO: renamed from: ۥ۟۠ */
        public abstract void mo1019(C0152b3 c0152b3, int i, int i2);

        /* JADX INFO: renamed from: ۥ۟ۡ */
        public abstract void mo1020(C0152b3 c0152b3);

        /* JADX INFO: renamed from: ۥ۟ۢ */
        public abstract void mo1021(C0152b3 c0152b3, int i, int i2);
    }

    /* JADX INFO: renamed from: ۟.bb$b */
    public interface b {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);

    /* JADX INFO: renamed from: ۥ۠ۡ, reason: contains not printable characters */
    InterfaceC0146ab mo1024();
}
