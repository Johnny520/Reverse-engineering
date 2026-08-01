package p136b0;

import com.bumptech.glide.AbstractC1926h;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: b0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1844f {

    /* JADX INFO: renamed from: a */
    public int f6246a = 0;

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntRef(element = ");
        sb.append(this.f6246a);
        sb.append(")@");
        int iHashCode = hashCode();
        AbstractC1926h.m3565h(16);
        String string = Integer.toString(iHashCode, 16);
        AbstractC1665j.m2984d(string, "toString(...)");
        sb.append(string);
        return sb.toString();
    }
}
