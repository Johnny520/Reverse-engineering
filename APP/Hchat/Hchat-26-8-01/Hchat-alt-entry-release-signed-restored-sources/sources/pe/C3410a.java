package pe;

import java.util.BitSet;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;

/* JADX INFO: renamed from: pe.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3410a {

    /* JADX INFO: renamed from: e */
    public static final InterfaceC2844b f11020e = AbstractC2846d.m6274b(C3410a.class);

    /* JADX INFO: renamed from: a */
    public BitSet[] f11021a;

    /* JADX INFO: renamed from: b */
    public BitSet[] f11022b;

    /* JADX INFO: renamed from: c */
    public BitSet[] f11023c;

    /* JADX INFO: renamed from: d */
    public BitSet[] f11024d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static BitSet[] m7190a(int i9, int i10) {
        BitSet[] bitSetArr = new BitSet[i9];
        for (int i11 = 0; i11 < i9; i11++) {
            bitSetArr[i11] = new BitSet(i10);
        }
        return bitSetArr;
    }
}
