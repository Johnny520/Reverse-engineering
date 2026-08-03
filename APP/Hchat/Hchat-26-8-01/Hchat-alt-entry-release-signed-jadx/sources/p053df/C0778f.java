package p053df;

import java.util.StringJoiner;

/* JADX INFO: renamed from: df.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0778f {

    /* JADX INFO: renamed from: a */
    public final int f2342a;

    /* JADX INFO: renamed from: b */
    public final int f2343b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0778f(int i9, int i10) {
        this.f2342a = i9;
        this.f2343b = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return new StringJoiner(", ", C0778f.class.getSimpleName().concat("["), "]").add("idx=" + this.f2342a).add("offset=" + this.f2343b).toString();
    }
}
