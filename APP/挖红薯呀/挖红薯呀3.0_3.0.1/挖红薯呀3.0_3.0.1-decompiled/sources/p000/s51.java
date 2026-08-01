package p000;

import androidx.compose.p001ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class s51 extends oe0 implements rr0, InterfaceC0968ym, qr0 {

    /* JADX INFO: renamed from: A */
    public long f5645A;

    /* JADX INFO: renamed from: r */
    public Object f5646r;

    /* JADX INFO: renamed from: s */
    public Object f5647s;

    /* JADX INFO: renamed from: t */
    public PointerInputEventHandler f5648t;

    /* JADX INFO: renamed from: u */
    public r31 f5649u;

    /* JADX INFO: renamed from: v */
    public ir0 f5650v = o51.f4465a;

    /* JADX INFO: renamed from: w */
    public final sh0 f5651w;

    /* JADX INFO: renamed from: x */
    public final sh0 f5652x;

    /* JADX INFO: renamed from: y */
    public final sh0 f5653y;

    /* JADX INFO: renamed from: z */
    public ir0 f5654z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s51(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f5646r = obj;
        this.f5647s = obj2;
        this.f5648t = pointerInputEventHandler;
        sh0 sh0Var = new sh0(new r51[16]);
        this.f5651w = sh0Var;
        this.f5652x = sh0Var;
        this.f5653y = new sh0(new r51[16]);
        this.f5645A = 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qr0
    /* JADX INFO: renamed from: N */
    public final void mo3326N() {
        m4007x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qr0
    /* JADX INFO: renamed from: U */
    public final void mo758U() {
        ir0 ir0Var = this.f5654z;
        if (ir0Var == null) {
            return;
        }
        List list = ir0Var.f2610a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((nr0) list.get(i)).f4308d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    nr0 nr0Var = (nr0) list.get(i2);
                    long j = nr0Var.f4305a;
                    long j2 = nr0Var.f4307c;
                    long j3 = nr0Var.f4306b;
                    float f = nr0Var.f4309e;
                    boolean z = nr0Var.f4308d;
                    arrayList.add(new nr0(j, j3, j2, false, f, j3, j2, z, z, nr0Var.f4313i, 0L));
                }
                ir0 ir0Var2 = new ir0(arrayList, null);
                this.f5650v = ir0Var2;
                m4006w0(ir0Var2, jr0.f2933d);
                m4006w0(ir0Var2, jr0.f2934e);
                m4006w0(ir0Var2, jr0.f2935f);
                this.f5654z = null;
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0694rm, p000.qr0
    /* JADX INFO: renamed from: a */
    public final void mo759a() {
        m4007x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: b */
    public final float mo48b() {
        return pf1.m3039Q(this).f388B.mo48b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0968ym
    /* JADX INFO: renamed from: h */
    public final float mo49h() {
        return pf1.m3039Q(this).f388B.mo49h();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.oe0
    /* JADX INFO: renamed from: p0 */
    public final void mo657p0() {
        m4007x0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /* JADX INFO: renamed from: w0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4006w0(ir0 ir0Var, jr0 jr0Var) {
        int i;
        int i2;
        C0884wc c0884wc;
        C0884wc c0884wc2;
        synchronized (this.f5652x) {
            sh0 sh0Var = this.f5653y;
            sh0Var.m4073c(sh0Var.f5770f, this.f5651w);
        }
        try {
            int iOrdinal = jr0Var.ordinal();
            if (iOrdinal == 0) {
                sh0 sh0Var2 = this.f5653y;
                Object[] objArr = sh0Var2.f5768d;
                i = sh0Var2.f5770f;
                for (i2 = 0; i2 < i; i2++) {
                    r51 r51Var = (r51) objArr[i2];
                    if (jr0Var == r51Var.f5300g && (c0884wc = r51Var.f5299f) != null) {
                        r51Var.f5299f = null;
                        c0884wc.mo541i(ir0Var);
                    }
                }
            } else if (iOrdinal == 1) {
                sh0 sh0Var3 = this.f5653y;
                int i3 = sh0Var3.f5770f - 1;
                Object[] objArr2 = sh0Var3.f5768d;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        r51 r51Var2 = (r51) objArr2[i3];
                        if (jr0Var == r51Var2.f5300g && (c0884wc2 = r51Var2.f5299f) != null) {
                            r51Var2.f5299f = null;
                            c0884wc2.mo541i(ir0Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new C0725sg();
                }
                sh0 sh0Var22 = this.f5653y;
                Object[] objArr3 = sh0Var22.f5768d;
                i = sh0Var22.f5770f;
                while (i2 < i) {
                }
            }
            this.f5653y.m4077g();
        } catch (Throwable th) {
            this.f5653y.m4077g();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qr0
    /* JADX INFO: renamed from: x */
    public final void mo762x(ir0 ir0Var, jr0 jr0Var, long j) {
        this.f5645A = j;
        if (jr0Var == jr0.f2933d) {
            this.f5650v = ir0Var;
        }
        InterfaceC0322ik interfaceC0322ik = null;
        if (this.f5649u == null) {
            this.f5649u = AbstractC0307i4.m1547w(m2879k0(), null, new C0091cg(this, interfaceC0322ik, 7), 1);
        }
        m4006w0(ir0Var, jr0Var);
        List list = ir0Var.f2610a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ir0Var = null;
                break;
            } else if (!w60.m4904k((nr0) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.f5654z = ir0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x0 */
    public final void m4007x0() {
        r31 r31Var = this.f5649u;
        if (r31Var != null) {
            r31Var.mo1613B(new se0("Pointer input was reset", 2));
            this.f5649u = null;
        }
    }
}
