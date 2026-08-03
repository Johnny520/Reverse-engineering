package p080fb;

import gg.AbstractC1416l;
import java.util.ArrayList;
import p222p.AbstractC3199a;

/* JADX INFO: renamed from: fb.x1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1191x1 {

    /* JADX INFO: renamed from: a */
    public final Integer f4002a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f4003b;

    /* JADX INFO: renamed from: c */
    public final boolean f4004c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1191x1(Integer num, ArrayList arrayList, boolean z9) {
        this.f4002a = num;
        this.f4003b = arrayList;
        this.f4004c = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191x1)) {
            return false;
        }
        C1191x1 c1191x1 = (C1191x1) obj;
        return AbstractC1416l.m3825a(this.f4002a, c1191x1.f4002a) && this.f4003b.equals(c1191x1.f4003b) && this.f4004c == c1191x1.f4004c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Integer num = this.f4002a;
        return Boolean.hashCode(this.f4004c) + ((this.f4003b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Hunk(oldStart=");
        sb2.append(this.f4002a);
        sb2.append(", lines=");
        sb2.append(this.f4003b);
        sb2.append(", endOfFile=");
        return AbstractC3199a.m6840m(")", sb2, this.f4004c);
    }
}
