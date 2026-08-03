package p001;

import android.database.sqlite.SQLiteProgram;
import java.util.List;

/* JADX INFO: renamed from: ۟.f8 */
/* JADX INFO: loaded from: classes.dex */
public class C0213f8 implements InterfaceC0174cb {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f790 = 1;

    /* JADX INFO: renamed from: ۥ۟ */
    public Object f791;

    public C0213f8(SQLiteProgram sQLiteProgram) {
        this.f791 = sQLiteProgram;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.f790) {
            case 0:
                break;
            default:
                ((SQLiteProgram) this.f791).close();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m1071(int i, byte[] bArr) {
        switch (this.f790) {
            case 0:
                m1073(i, bArr);
                break;
            default:
                ((SQLiteProgram) this.f791).bindBlob(i, bArr);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0174cb
    /* JADX INFO: renamed from: ۥ۟ۡ */
    public final void mo1042(int i, String str) {
        switch (this.f790) {
            case 0:
                m1073(i, str);
                break;
            default:
                ((SQLiteProgram) this.f791).bindString(i, str);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0174cb
    /* JADX INFO: renamed from: ۥ۟ۥ */
    public final void mo1043(int i) {
        switch (this.f790) {
            case 0:
                m1073(i, null);
                break;
            default:
                ((SQLiteProgram) this.f791).bindNull(i);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: ۥ۟ۦ, reason: contains not printable characters */
    public final void m1072(int i, double d) {
        switch (this.f790) {
            case 0:
                m1073(i, Double.valueOf(d));
                break;
            default:
                ((SQLiteProgram) this.f791).bindDouble(i, d);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.InterfaceC0174cb
    /* JADX INFO: renamed from: ۥ۠ */
    public final void mo838(int i, long j) {
        switch (this.f790) {
            case 0:
                m1073(i, Long.valueOf(j));
                break;
            default:
                ((SQLiteProgram) this.f791).bindLong(i, j);
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۣ۠, reason: contains not printable characters */
    public final void m1073(int i, Object obj) {
        int i2 = i - 1;
        if (i2 >= ((List) this.f791).size()) {
            for (int size = ((List) this.f791).size(); size <= i2; size++) {
                ((List) this.f791).add(null);
            }
        }
        ((List) this.f791).set(i2, obj);
    }
}
