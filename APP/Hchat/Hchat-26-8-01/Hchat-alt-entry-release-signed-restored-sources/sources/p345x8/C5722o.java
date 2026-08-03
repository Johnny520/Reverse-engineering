package p345x8;

import java.io.File;

/* JADX INFO: renamed from: x8.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5722o {

    /* JADX INFO: renamed from: a */
    public final File f23293a;

    /* JADX INFO: renamed from: b */
    public final int f23294b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5722o(File file, int i9) {
        this.f23293a = file;
        this.f23294b = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5722o)) {
            return false;
        }
        C5722o c5722o = (C5722o) obj;
        return this.f23293a.equals(c5722o.f23293a) && this.f23294b == c5722o.f23294b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Integer.hashCode(this.f23294b) + (this.f23293a.hashCode() * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "XiaozhiVoiceSegment(file=" + this.f23293a + ", durationMs=" + this.f23294b + ")";
    }
}
