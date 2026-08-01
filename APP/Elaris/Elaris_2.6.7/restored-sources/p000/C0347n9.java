package p000;

import android.net.Uri;
import com.p001mr.elaris.AbstractC0169w;
import java.io.File;

/* JADX INFO: renamed from: n9 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0347n9 {

    /* JADX INFO: renamed from: a */
    public final File f592a;

    /* JADX INFO: renamed from: b */
    public final Uri f593b;

    /* JADX INFO: renamed from: c */
    public final String f594c;

    /* JADX INFO: renamed from: d */
    public final String f595d;

    /* JADX INFO: renamed from: e */
    public final String f596e;

    /* JADX INFO: renamed from: f */
    public final long f597f;

    /* JADX INFO: renamed from: g */
    public final long f598g;

    /* JADX INFO: renamed from: h */
    public final boolean f599h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0347n9(File file, Uri uri, String str, String str2, String str3, long j, long j2, boolean z) {
        this.f592a = file;
        this.f593b = uri;
        this.f594c = (str == null || str.length() == 0) ? "未命名" : str;
        this.f595d = str2 == null ? "" : str2;
        this.f596e = str3 == null ? "" : str3;
        this.f597f = Math.max(0L, j);
        this.f598g = Math.max(0L, j2);
        this.f599h = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m768a() {
        return !this.f599h && AbstractC0169w.m291d0(this.f594c, this.f596e);
    }
}
