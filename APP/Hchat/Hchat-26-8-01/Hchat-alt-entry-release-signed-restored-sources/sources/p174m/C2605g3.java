package p174m;

import p011ab.C0045e;
import p015b0.C0153s;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p116i.AbstractC1742d;
import p116i.C1769m;
import p116i.InterfaceC1763k;
import p116i.InterfaceC1774n1;
import p117i0.AbstractC1874r;
import p136j8.C2104o;
import p201o.AbstractC3026b;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p356y0.C5840b;
import p356y0.InterfaceC5854p;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: m.g3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2605g3 {

    /* JADX INFO: renamed from: f */
    public static final C1769m f8440f = new C1769m(0.0f);

    /* JADX INFO: renamed from: a */
    public final InterfaceC1774n1 f8441a;

    /* JADX INFO: renamed from: b */
    public long f8442b = Long.MIN_VALUE;

    /* JADX INFO: renamed from: c */
    public C1769m f8443c = f8440f;

    /* JADX INFO: renamed from: d */
    public boolean f8444d;

    /* JADX INFO: renamed from: e */
    public float f8445e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2605g3(InterfaceC1763k interfaceC1763k) {
        this.f8441a = interfaceC1763k.mo4363a(AbstractC1742d.f5810j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00cc, code lost:
    
        if (p117i0.AbstractC1874r.m4637s(r0.getContext()).m4458d(r15, r0) == r9) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074 A[Catch: all -> 0x0035, PHI: r13 r14 r15
  0x0074: PHI (r13v4 float) = (r13v2 float), (r13v5 float) binds: [B:29:0x006e, B:37:0x00a5] A[DONT_GENERATE, DONT_INLINE]
  0x0074: PHI (r14v7 fg.l) = (r14v1 fg.l), (r14v8 fg.l) binds: [B:29:0x006e, B:37:0x00a5] A[DONT_GENERATE, DONT_INLINE]
  0x0074: PHI (r15v16 fg.a) = (r15v8 fg.a), (r15v17 fg.a) binds: [B:29:0x006e, B:37:0x00a5] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:45:0x00cf, B:20:0x0047, B:36:0x00a0, B:30:0x0074, B:39:0x00a8, B:42:0x00b3, B:33:0x0083), top: B:50:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:45:0x00cf, B:20:0x0047, B:36:0x00a0, B:30:0x0074, B:39:0x00a8, B:42:0x00b3, B:33:0x0083), top: B:50:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b3 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:45:0x00cf, B:20:0x0047, B:36:0x00a0, B:30:0x0074, B:39:0x00a8, B:42:0x00b3, B:33:0x0083), top: B:50:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x009d -> B:36:0x00a0). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6057a(C0153s c0153s, C0045e c0045e, AbstractC6038c abstractC6038c) {
        C2600f3 c2600f3;
        InterfaceC1231l interfaceC1231l;
        float f3;
        InterfaceC1220a interfaceC1220a;
        InterfaceC1220a interfaceC1220a2;
        if (abstractC6038c instanceof C2600f3) {
            c2600f3 = (C2600f3) abstractC6038c;
            int i9 = c2600f3.f8427l;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2600f3.f8427l = i9 - Integer.MIN_VALUE;
            } else {
                c2600f3 = new C2600f3(this, abstractC6038c);
            }
        }
        Object obj = c2600f3.f8425j;
        int i10 = c2600f3.f8427l;
        C1769m c1769m = f8440f;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        try {
            if (i10 == 0) {
                AbstractC1089i.m2732I0(obj);
                if (this.f8444d) {
                    AbstractC3026b.m6430c("animateToZero called while previous animation is running");
                }
                InterfaceC5854p interfaceC5854p = (InterfaceC5854p) c2600f3.getContext().mo2062s(C5840b.f23776v);
                float fMo2060i = interfaceC5854p != null ? interfaceC5854p.mo2060i() : 1.0f;
                this.f8444d = true;
                interfaceC1231l = c0153s;
                f3 = fMo2060i;
                interfaceC1220a = c0045e;
                if (Math.abs(this.f8445e) >= 0.01f) {
                    interfaceC1220a2 = interfaceC1220a;
                    if (Math.abs(this.f8445e) != 0.0f) {
                    }
                }
                return enumC5799a;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC1220a2 = (InterfaceC1220a) c2600f3.f8422g;
                AbstractC1089i.m2732I0(obj);
                interfaceC1220a2.invoke();
                this.f8442b = Long.MIN_VALUE;
                this.f8443c = c1769m;
                this.f8444d = false;
                return C3967n.f12976a;
            }
            f3 = c2600f3.f8424i;
            InterfaceC1220a interfaceC1220a3 = c2600f3.f8423h;
            InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) c2600f3.f8422g;
            AbstractC1089i.m2732I0(obj);
            interfaceC1220a = interfaceC1220a3;
            interfaceC1231l = interfaceC1231l2;
            interfaceC1220a.invoke();
            if (f3 == 0.0f) {
                if (Math.abs(this.f8445e) >= 0.01f) {
                    C2595e3 c2595e3 = new C2595e3(this, f3, interfaceC1231l, 0);
                    c2600f3.f8422g = interfaceC1231l;
                    c2600f3.f8423h = interfaceC1220a;
                    c2600f3.f8424i = f3;
                    c2600f3.f8427l = 1;
                    if (AbstractC1874r.m4637s(c2600f3.getContext()).m4458d(c2595e3, c2600f3) == enumC5799a) {
                    }
                    interfaceC1220a.invoke();
                    if (f3 == 0.0f) {
                    }
                }
                return enumC5799a;
            }
            interfaceC1220a2 = interfaceC1220a;
            if (Math.abs(this.f8445e) != 0.0f) {
                this.f8442b = Long.MIN_VALUE;
                this.f8443c = c1769m;
                this.f8444d = false;
                return C3967n.f12976a;
            }
            C2576b c2576b = new C2576b(this, 3, interfaceC1231l);
            c2600f3.f8422g = interfaceC1220a2;
            c2600f3.f8423h = null;
            c2600f3.f8427l = 2;
        } catch (Throwable th2) {
            this.f8442b = Long.MIN_VALUE;
            this.f8443c = c1769m;
            this.f8444d = false;
            throw th2;
        }
    }
}
