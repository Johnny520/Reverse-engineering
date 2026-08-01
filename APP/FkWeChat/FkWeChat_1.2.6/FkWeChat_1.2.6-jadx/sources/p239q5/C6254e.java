package p239q5;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import p254r5.C6510o;
import p269s5.C7188c;

/* JADX INFO: renamed from: q5.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6254e implements InterfaceC6252c0 {

    /* JADX INFO: renamed from: b */
    public static final C6254e f19395b = new C6254e();

    /* JADX INFO: renamed from: c */
    public static final C6254e f19396c = new C6254e(true);

    /* JADX INFO: renamed from: a */
    public final boolean f19397a;

    public C6254e() {
        this.f19397a = false;
    }

    @Override // p239q5.InterfaceC6252c0
    /* JADX INFO: renamed from: a */
    public boolean mo24684a(C6270u c6270u, C6267r c6267r, C6267r c6267r2) {
        if (c6267r.getType() != C7188c.f23825D) {
            return false;
        }
        if (!(c6267r2.m24755u() instanceof C6510o)) {
            if ((c6267r.m24755u() instanceof C6510o) && c6270u.m24798d() == 15) {
                return ((C6510o) c6267r.m24755u()).m25798k();
            }
            return false;
        }
        C6510o c6510o = (C6510o) c6267r2.m24755u();
        switch (c6270u.m24798d()) {
            case Opcodes.DCONST_0 /* 14 */:
            case 16:
            case Opcodes.SIPUSH /* 17 */:
            case Opcodes.LDC /* 18 */:
            case 20:
            case Opcodes.ILOAD /* 21 */:
            case Opcodes.LLOAD /* 22 */:
                return c6510o.m25798k();
            case 15:
                return C6510o.m25781v(-c6510o.m25782u()).m25798k();
            case 19:
            default:
                return false;
            case Opcodes.FLOAD /* 23 */:
            case Opcodes.DLOAD /* 24 */:
            case Opcodes.ALOAD /* 25 */:
                return c6510o.m25799n();
        }
    }

    @Override // p239q5.InterfaceC6252c0
    /* JADX INFO: renamed from: b */
    public int mo24685b() {
        return 16;
    }

    @Override // p239q5.InterfaceC6252c0
    /* JADX INFO: renamed from: c */
    public boolean mo24686c(C6270u c6270u, C6268s c6268s) {
        return !this.f19397a && c6270u.m24801g() && m24689d(c6268s) >= 6;
    }

    /* JADX INFO: renamed from: d */
    public final int m24689d(C6268s c6268s) {
        int size = c6268s.size();
        int iM24751n = 0;
        for (int i10 = 0; i10 < size; i10++) {
            iM24751n += c6268s.m24769G(i10).m24751n();
        }
        return iM24751n;
    }

    public C6254e(boolean z10) {
        this.f19397a = z10;
    }
}
