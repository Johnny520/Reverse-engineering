package p072f1;

import p090g1.AbstractC2502a;
import p090g1.AbstractC2503b;
import p117i.C3082r0;

/* JADX INFO: renamed from: f1.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2225d implements InterfaceC2226e {

    /* JADX INFO: renamed from: e */
    public static final int f6068e = 8;

    /* JADX INFO: renamed from: b */
    public boolean f6070b;

    /* JADX INFO: renamed from: c */
    public boolean f6071c;

    /* JADX INFO: renamed from: a */
    public boolean f6069a = true;

    /* JADX INFO: renamed from: d */
    public final C3082r0 f6072d = AbstractC2503b.m8978c(null, 1, null);

    /* JADX INFO: renamed from: a */
    public final void m8019a() {
        this.f6069a = false;
        m8024f();
    }

    /* JADX INFO: renamed from: b */
    public final void m8020b() {
        this.f6070b = true;
        m8019a();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m8021c() {
        return this.f6069a && !this.f6071c;
    }

    /* JADX INFO: renamed from: d */
    public void m8022d() {
        if (this.f6070b) {
            return;
        }
        if (this.f6071c) {
            AbstractC2502a.m8975a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        m8024f();
        this.f6071c = true;
    }

    /* JADX INFO: renamed from: e */
    public void m8023e() {
        if (this.f6070b) {
            return;
        }
        if (!this.f6071c) {
            AbstractC2502a.m8975a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
        }
        if (!AbstractC2503b.m8979d(this.f6072d)) {
            AbstractC2502a.m8975a("Attempted to start retaining exited values with pending exited values");
        }
        this.f6071c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m8024f() {
        /*
            r14 = this;
            i.r0 r0 = r14.f6072d
            java.lang.Object[] r1 = r0.f8072c
            long[] r0 = r0.f8070a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L54
            r3 = 0
            r4 = r3
        Ld:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4f
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L27:
            if (r9 >= r7) goto L4d
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L49
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof p117i.C3076o0
            if (r11 == 0) goto L49
            i.o0 r10 = (p117i.C3076o0) r10
            java.lang.Object[] r11 = r10.f8235a
            int r10 = r10.f8236b
            r12 = r3
        L42:
            if (r12 >= r10) goto L49
            r13 = r11[r12]
            int r12 = r12 + 1
            goto L42
        L49:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L27
        L4d:
            if (r7 != r8) goto L54
        L4f:
            if (r4 == r2) goto L54
            int r4 = r4 + 1
            goto Ld
        L54:
            i.r0 r0 = r14.f6072d
            p090g1.AbstractC2503b.m8976a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p072f1.C2225d.m8024f():void");
    }
}
