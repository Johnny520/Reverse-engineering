package p067N0;

import android.content.res.Resources;
import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: N0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1008b {

    /* JADX INFO: renamed from: a */
    public final Resources.Theme f3123a;

    /* JADX INFO: renamed from: b */
    public final int f3124b;

    public C1008b(Resources.Theme theme, int i5) {
        this.f3123a = theme;
        this.f3124b = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1008b)) {
            return false;
        }
        C1008b c1008b = (C1008b) obj;
        return AbstractC1665j.m2981a(this.f3123a, c1008b.f3123a) && this.f3124b == c1008b.f3124b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3124b) + (this.f3123a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Key(theme=");
        sb.append(this.f3123a);
        sb.append(", id=");
        return AbstractC3202a.m5466a(sb, this.f3124b, ')');
    }
}
