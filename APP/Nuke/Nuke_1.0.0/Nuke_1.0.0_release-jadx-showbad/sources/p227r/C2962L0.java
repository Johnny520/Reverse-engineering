package p227r;

import p000A.C0010F;
import p000A.C0061g;
import p000A.C0075n;
import p016C3.C0244a;
import p056K2.C0891q;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1178c;
import p095T.AbstractC1385s;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p169h0.C2194c;
import p169h0.InterfaceC2208q;
import p203n.AbstractC2649d;
import p203n.C2663k;
import p203n.InterfaceC2656g0;
import p203n.InterfaceC2659i;
import p238t.AbstractC3204b;

/* JADX INFO: renamed from: r.L0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2962L0 {

    /* JADX INFO: renamed from: f */
    public static final C2663k f9375f = new C2663k(0.0f);

    /* JADX INFO: renamed from: a */
    public final InterfaceC2656g0 f9376a;

    /* JADX INFO: renamed from: b */
    public long f9377b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public C2663k f9378c = f9375f;

    /* JADX INFO: renamed from: d */
    public boolean f9379d;

    /* JADX INFO: renamed from: e */
    public float f9380e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2962L0(InterfaceC2659i interfaceC2659i) {
        this.f9376a = interfaceC2659i.mo4572a(AbstractC2649d.f8446j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d0, code lost:
    
        if (p095T.AbstractC1385s.m2626p(r14).m1209a(r15, r0) == r9) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x0035, PHI: r13 r14 r15
  0x0076: PHI (r13v4 float) = (r13v2 float), (r13v5 float) binds: [B:29:0x0070, B:37:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r14v7 W2.c) = (r14v1 W2.c), (r14v8 W2.c) binds: [B:29:0x0070, B:37:0x00a7] A[DONT_GENERATE, DONT_INLINE]
  0x0076: PHI (r15v16 W2.a) = (r15v8 W2.a), (r15v17 W2.a) binds: [B:29:0x0070, B:37:0x00a7] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:45:0x00d3, B:20:0x0048, B:36:0x00a2, B:30:0x0076, B:39:0x00aa, B:42:0x00b5, B:33:0x0085), top: B:50:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:45:0x00d3, B:20:0x0048, B:36:0x00a2, B:30:0x0076, B:39:0x00aa, B:42:0x00b5, B:33:0x0085), top: B:50:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:45:0x00d3, B:20:0x0048, B:36:0x00a2, B:30:0x0076, B:39:0x00aa, B:42:0x00b5, B:33:0x0085), top: B:50:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009f -> B:36:0x00a2). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5163a(C0075n c0075n, C0244a c0244a, AbstractC1178c abstractC1178c) {
        C2960K0 c2960k0;
        InterfaceC1601c interfaceC1601c;
        float f2;
        InterfaceC1599a interfaceC1599a;
        InterfaceC1599a interfaceC1599a2;
        if (abstractC1178c instanceof C2960K0) {
            c2960k0 = (C2960K0) abstractC1178c;
            int i5 = c2960k0.f9372l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c2960k0.f9372l = i5 - Integer.MIN_VALUE;
            } else {
                c2960k0 = new C2960K0(this, abstractC1178c);
            }
        }
        Object obj = c2960k0.f9370j;
        int i6 = c2960k0.f9372l;
        C2663k c2663k = f9375f;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        try {
            if (i6 == 0) {
                AbstractC1784a.m3205S(obj);
                if (this.f9379d) {
                    AbstractC3204b.m5477c("animateToZero called while previous animation is running");
                }
                InterfaceC1051i interfaceC1051i = c2960k0.f3866e;
                AbstractC1665j.m2982b(interfaceC1051i);
                InterfaceC2208q interfaceC2208q = (InterfaceC2208q) interfaceC1051i.mo1166C(C2194c.f7174r);
                float fMo1169r = interfaceC2208q != null ? interfaceC2208q.mo1169r() : 1.0f;
                this.f9379d = true;
                interfaceC1601c = c0075n;
                f2 = fMo1169r;
                interfaceC1599a = c0244a;
                if (Math.abs(this.f9380e) >= 0.01f) {
                    interfaceC1599a2 = interfaceC1599a;
                    if (Math.abs(this.f9380e) != 0.0f) {
                    }
                }
                return enumC1152a;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC1599a2 = (InterfaceC1599a) c2960k0.f9367g;
                AbstractC1784a.m3205S(obj);
                interfaceC1599a2.mo6a();
                this.f9377b = Long.MIN_VALUE;
                this.f9378c = c2663k;
                this.f9379d = false;
                return C0891q.f2780a;
            }
            f2 = c2960k0.f9369i;
            InterfaceC1599a interfaceC1599a3 = c2960k0.f9368h;
            InterfaceC1601c interfaceC1601c2 = (InterfaceC1601c) c2960k0.f9367g;
            AbstractC1784a.m3205S(obj);
            interfaceC1599a = interfaceC1599a3;
            interfaceC1601c = interfaceC1601c2;
            interfaceC1599a.mo6a();
            if (f2 == 0.0f) {
                if (Math.abs(this.f9380e) >= 0.01f) {
                    C0061g c0061g = new C0061g(this, f2, interfaceC1601c);
                    c2960k0.f9367g = interfaceC1601c;
                    c2960k0.f9368h = interfaceC1599a;
                    c2960k0.f9369i = f2;
                    c2960k0.f9372l = 1;
                    InterfaceC1051i interfaceC1051i2 = c2960k0.f3866e;
                    AbstractC1665j.m2982b(interfaceC1051i2);
                    if (AbstractC1385s.m2626p(interfaceC1051i2).m1209a(c0061g, c2960k0) == enumC1152a) {
                    }
                    interfaceC1599a.mo6a();
                    if (f2 == 0.0f) {
                    }
                }
                return enumC1152a;
            }
            interfaceC1599a2 = interfaceC1599a;
            if (Math.abs(this.f9380e) != 0.0f) {
                this.f9377b = Long.MIN_VALUE;
                this.f9378c = c2663k;
                this.f9379d = false;
                return C0891q.f2780a;
            }
            C0010F c0010f = new C0010F(20, this, interfaceC1601c);
            c2960k0.f9367g = interfaceC1599a2;
            c2960k0.f9368h = null;
            c2960k0.f9372l = 2;
            InterfaceC1051i interfaceC1051i3 = c2960k0.f3866e;
            AbstractC1665j.m2982b(interfaceC1051i3);
        } catch (Throwable th) {
            this.f9377b = Long.MIN_VALUE;
            this.f9378c = c2663k;
            this.f9379d = false;
            throw th;
        }
    }
}
