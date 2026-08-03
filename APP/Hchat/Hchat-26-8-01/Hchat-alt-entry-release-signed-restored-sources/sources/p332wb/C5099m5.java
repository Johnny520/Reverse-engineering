package p332wb;

import java.util.List;

/* JADX INFO: renamed from: wb.m5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5099m5 {

    /* JADX INFO: renamed from: a */
    public final C5292s0 f18836a;

    /* JADX INFO: renamed from: b */
    public final EnumC5066l5 f18837b;

    /* JADX INFO: renamed from: c */
    public final List f18838c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5099m5(C5292s0 c5292s0, EnumC5066l5 enumC5066l5, List list) {
        this.f18836a = c5292s0;
        this.f18837b = enumC5066l5;
        this.f18838c = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5099m5)) {
            return false;
        }
        C5099m5 c5099m5 = (C5099m5) obj;
        return this.f18836a.equals(c5099m5.f18836a) && this.f18837b == c5099m5.f18837b && this.f18838c.equals(c5099m5.f18838c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f18838c.hashCode() + ((this.f18837b.hashCode() + (this.f18836a.hashCode() * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "MessageBlockContactOption(contact=" + this.f18836a + ", kind=" + this.f18837b + ", labelNames=" + this.f18838c + ")";
    }
}
