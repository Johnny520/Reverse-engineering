package p007D0;

import java.util.Map;
import p040U0.AbstractC0291a;

/* JADX INFO: renamed from: D0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0095c {

    /* JADX INFO: renamed from: a */
    public int f377a;

    /* JADX INFO: renamed from: b */
    public Map f378b;

    /* JADX INFO: renamed from: c */
    public byte[] f379c;

    /* JADX INFO: renamed from: d */
    public Throwable f380d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Response(code=" + this.f377a + ", header=" + this.f378b + ", body=" + new String(this.f379c, AbstractC0291a.f663a) + ", error=" + this.f380d + ")";
    }
}
