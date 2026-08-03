package p266s0;

import p000a.AbstractC0000a;

/* JADX INFO: renamed from: s0.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3875e {

    /* JADX INFO: renamed from: a */
    public int f12724a = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.f12724a);
        sb2.append(")@");
        int iHashCode = hashCode();
        AbstractC0000a.m96w(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb2.append(string);
        return sb2.toString();
    }
}
