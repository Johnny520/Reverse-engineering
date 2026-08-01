package p254r5;

import p269s5.C7188c;
import p309v5.AbstractC8826h;

/* JADX INFO: renamed from: r5.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6510o extends AbstractC6514s {

    /* JADX INFO: renamed from: r */
    public static final C6510o[] f20419r = new C6510o[511];

    /* JADX INFO: renamed from: s */
    public static final C6510o f20420s = m25781v(-1);

    /* JADX INFO: renamed from: t */
    public static final C6510o f20421t = m25781v(0);

    /* JADX INFO: renamed from: u */
    public static final C6510o f20422u = m25781v(1);

    /* JADX INFO: renamed from: v */
    public static final C6510o f20423v = m25781v(2);

    /* JADX INFO: renamed from: w */
    public static final C6510o f20424w = m25781v(3);

    /* JADX INFO: renamed from: x */
    public static final C6510o f20425x = m25781v(4);

    /* JADX INFO: renamed from: y */
    public static final C6510o f20426y = m25781v(5);

    public C6510o(int i10) {
        super(i10);
    }

    /* JADX INFO: renamed from: v */
    public static C6510o m25781v(int i10) {
        C6510o[] c6510oArr = f20419r;
        int length = (Integer.MAX_VALUE & i10) % c6510oArr.length;
        C6510o c6510o = c6510oArr[length];
        if (c6510o != null && c6510o.m25782u() == i10) {
            return c6510o;
        }
        C6510o c6510o2 = new C6510o(i10);
        c6510oArr[length] = c6510o2;
        return c6510o2;
    }

    @Override // p309v5.InterfaceC8837s
    /* JADX INFO: renamed from: g */
    public String mo6828g() {
        return Integer.toString(mo25796s());
    }

    @Override // p269s5.InterfaceC7189d
    public C7188c getType() {
        return C7188c.f23825D;
    }

    @Override // p254r5.AbstractC6487a
    /* JADX INFO: renamed from: j */
    public String mo25729j() {
        return "int";
    }

    public String toString() {
        int iMo25796s = mo25796s();
        return "int{0x" + AbstractC8826h.m33901j(iMo25796s) + " / " + iMo25796s + '}';
    }

    /* JADX INFO: renamed from: u */
    public int m25782u() {
        return mo25796s();
    }
}
