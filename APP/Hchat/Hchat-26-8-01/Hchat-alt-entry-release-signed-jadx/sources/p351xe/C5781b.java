package p351xe;

import java.util.Objects;
import p025bc.AbstractC0255e;
import p302ud.C4320p;
import p302ud.InterfaceC4312h;

/* JADX INFO: renamed from: xe.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5781b {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4312h f23520a;

    /* JADX INFO: renamed from: b */
    public final C4320p f23521b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5781b(InterfaceC4312h interfaceC4312h, C4320p c4320p) {
        this.f23520a = interfaceC4312h;
        this.f23521b = c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5781b)) {
            return false;
        }
        C5781b c5781b = (C5781b) obj;
        return this.f23520a.equals(c5781b.f23520a) && this.f23521b.equals(c5781b.f23521b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Objects.hash(this.f23520a, this.f23521b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC0255e.m1022k("BlockInsnPair{", String.valueOf(this.f23520a), ": ", String.valueOf(this.f23521b), "}");
    }
}
