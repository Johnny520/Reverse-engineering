package p000;

import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ia */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0265ia {

    /* JADX INFO: renamed from: a */
    public final long f412a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f413b;

    /* JADX INFO: renamed from: c */
    public final String f414c;

    /* JADX INFO: renamed from: d */
    public final int f415d;

    /* JADX INFO: renamed from: e */
    public final int f416e;

    /* JADX INFO: renamed from: f */
    public final long f417f;

    /* JADX INFO: renamed from: g */
    public boolean f418g;

    /* JADX INFO: renamed from: h */
    public long f419h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0265ia(long j, EditText editText, String str, int i, int i2, long j2) {
        this.f412a = j;
        this.f413b = new WeakReference(editText);
        this.f414c = str == null ? "" : str;
        this.f415d = Math.max(0, i);
        this.f416e = i2;
        this.f417f = Math.max(1L, 1800L) + j2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized void m679a(long j) {
        if (!this.f418g) {
            long j2 = this.f417f;
            if (j <= j2) {
                this.f419h = Math.min(j2, j + Math.max(1L, 1200L));
            }
        }
    }
}
