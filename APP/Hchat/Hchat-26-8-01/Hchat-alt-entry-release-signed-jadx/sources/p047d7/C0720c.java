package p047d7;

/* JADX INFO: renamed from: d7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0720c {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0721d f2156a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0720c(C0721d c0721d) {
        this.f2156a = c0721d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m1896a() {
        return this.f2156a.m1928O(40);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C0720c.class == obj.getClass() && m1896a() == ((C0720c) obj).m1896a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m1896a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0" + Integer.toOctalString(m1896a()));
        sb2.append(' ');
        StringBuilder sb3 = new StringBuilder("-");
        int i9 = 1;
        for (int i10 = 0; i10 < 2; i10++) {
            i9 *= 8;
        }
        int iM1896a = (m1896a() % (i9 * 8)) / i9;
        sb3.append(new String(new byte[]{(byte) ((iM1896a & 4) != 0 ? 114 : 45), (byte) ((iM1896a & 2) != 0 ? 119 : 45), (byte) ((iM1896a & 1) != 0 ? 120 : 45)}));
        int iM1896a2 = (m1896a() % 64) / 8;
        sb3.append(new String(new byte[]{(byte) ((iM1896a2 & 4) != 0 ? 114 : 45), (byte) ((iM1896a2 & 2) != 0 ? 119 : 45), (byte) ((iM1896a2 & 1) != 0 ? 120 : 45)}));
        int iM1896a3 = m1896a() % 8;
        sb3.append(new String(new byte[]{(byte) ((iM1896a3 & 4) == 0 ? 45 : 114), (byte) ((iM1896a3 & 2) == 0 ? 45 : 119), (byte) ((iM1896a3 & 1) != 0 ? 120 : 45)}));
        sb2.append(sb3.toString());
        return sb2.toString();
    }
}
