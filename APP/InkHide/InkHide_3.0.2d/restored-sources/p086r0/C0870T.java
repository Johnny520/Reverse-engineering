package p086r0;

import java.util.Set;

/* JADX INFO: renamed from: r0.T */
/* JADX INFO: loaded from: classes.dex */
public final class C0870T {

    /* JADX INFO: renamed from: a */
    public final boolean f2995a;

    /* JADX INFO: renamed from: b */
    public final Set f2996b;

    /* JADX INFO: renamed from: c */
    public final Object f2997c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0870T(boolean z2, Set set, Set set2) {
        this.f2995a = z2;
        this.f2996b = set;
        this.f2997c = set2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0870T)) {
            return false;
        }
        C0870T c0870t = (C0870T) obj;
        return this.f2995a == c0870t.f2995a && this.f2996b.equals(c0870t.f2996b) && this.f2997c.equals(c0870t.f2997c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f2997c.hashCode() + ((this.f2996b.hashCode() + (Boolean.hashCode(this.f2995a) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "HiddenContactState(enabled=" + this.f2995a + ", hiddenIds=" + this.f2996b + ", hiddenDisplayTexts=" + this.f2997c + ")";
    }
}
