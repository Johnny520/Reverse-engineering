package p311v4;

import p000a.AbstractC0000a;
import p326w4.C4683c;

/* JADX INFO: renamed from: v4.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4466o extends AbstractC4470s {

    /* JADX INFO: renamed from: h */
    public static final C4466o[] f14801h = new C4466o[511];

    /* JADX INFO: renamed from: i */
    public static final C4466o f14802i = m8909o(-1);

    /* JADX INFO: renamed from: j */
    public static final C4466o f14803j = m8909o(0);

    /* JADX INFO: renamed from: k */
    public static final C4466o f14804k = m8909o(1);

    /* JADX INFO: renamed from: l */
    public static final C4466o f14805l = m8909o(2);

    /* JADX INFO: renamed from: m */
    public static final C4466o f14806m = m8909o(3);

    /* JADX INFO: renamed from: n */
    public static final C4466o f14807n = m8909o(4);

    /* JADX INFO: renamed from: o */
    public static final C4466o f14808o = m8909o(5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static C4466o m8909o(int i9) {
        C4466o[] c4466oArr = f14801h;
        int length = (Integer.MAX_VALUE & i9) % c4466oArr.length;
        C4466o c4466o = c4466oArr[length];
        if (c4466o != null && c4466o.f14817g == i9) {
            return c4466o;
        }
        C4466o c4466o2 = new C4466o(i9);
        c4466oArr[length] = c4466o2;
        return c4466o2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return Integer.toString(this.f14817g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    public final C4683c getType() {
        return C4683c.f15641t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p311v4.AbstractC4446a
    /* JADX INFO: renamed from: j */
    public final String mo8898j() {
        return "int";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final int m8910n() {
        return this.f14817g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("int{0x");
        int i9 = this.f14817g;
        sb2.append(AbstractC0000a.m48Y0(i9));
        sb2.append(" / ");
        sb2.append(i9);
        sb2.append('}');
        return sb2.toString();
    }
}
