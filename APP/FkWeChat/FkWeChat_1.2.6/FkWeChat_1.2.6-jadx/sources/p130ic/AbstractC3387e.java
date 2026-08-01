package p130ic;

import ec.AbstractC2169p0;
import ec.AbstractC2181s0;
import ec.EnumC2173q0;
import ec.InterfaceC2165o0;
import java.util.ArrayList;
import p010a9.InterfaceC0188p;
import p099gc.AbstractC2749r;
import p099gc.EnumC2732a;
import p099gc.InterfaceC2751t;
import p099gc.InterfaceC2753v;
import p113hc.AbstractC2976e;
import p113hc.InterfaceC2972c;
import p113hc.InterfaceC2974d;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6544m;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ic.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3387e implements InterfaceC3395m {

    /* JADX INFO: renamed from: q */
    public final InterfaceC5980j f9341q;

    /* JADX INFO: renamed from: r */
    public final int f9342r;

    /* JADX INFO: renamed from: s */
    public final EnumC2732a f9343s;

    /* JADX INFO: renamed from: ic.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f9344q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f9345r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC2974d f9346s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ AbstractC3387e f9347t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2974d interfaceC2974d, AbstractC3387e abstractC3387e, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.f9346s = interfaceC2974d;
            this.f9347t = abstractC3387e;
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            a aVar = new a(this.f9346s, this.f9347t, interfaceC5976f);
            aVar.f9345r = obj;
            return aVar;
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f) {
            return ((a) create(interfaceC2165o0, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f9344q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2165o0 interfaceC2165o0 = (InterfaceC2165o0) this.f9345r;
                InterfaceC2974d interfaceC2974d = this.f9346s;
                InterfaceC2753v interfaceC2753vM12731o = this.f9347t.m12731o(interfaceC2165o0);
                this.f9344q = 1;
                if (AbstractC2976e.m10982j(interfaceC2974d, interfaceC2753vM12731o, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: ic.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6544m implements InterfaceC0188p {

        /* JADX INFO: renamed from: q */
        public int f9348q;

        /* JADX INFO: renamed from: r */
        public /* synthetic */ Object f9349r;

        public b(InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
            b bVar = AbstractC3387e.this.new b(interfaceC5976f);
            bVar.f9349r = obj;
            return bVar;
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM24992g = AbstractC6325c.m24992g();
            int i10 = this.f9348q;
            if (i10 == 0) {
                AbstractC4713t.m18808b(obj);
                InterfaceC2751t interfaceC2751t = (InterfaceC2751t) this.f9349r;
                AbstractC3387e abstractC3387e = AbstractC3387e.this;
                this.f9348q = 1;
                if (abstractC3387e.mo12726i(interfaceC2751t, this) == objM24992g) {
                    return objM24992g;
                }
            } else {
                if (i10 != 1) {
                    C10010p0.m38820a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC4713t.m18808b(obj);
            }
            return C4700i0.f13910a;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2751t interfaceC2751t, InterfaceC5976f interfaceC5976f) {
            return ((b) create(interfaceC2751t, interfaceC5976f)).invokeSuspend(C4700i0.f13910a);
        }
    }

    public AbstractC3387e(InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        this.f9341q = interfaceC5980j;
        this.f9342r = i10;
        this.f9343s = enumC2732a;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m12724h(AbstractC3387e abstractC3387e, InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
        Object objM7882e = AbstractC2169p0.m7882e(new a(interfaceC2974d, abstractC3387e, null), interfaceC5976f);
        return objM7882e == AbstractC6325c.m24992g() ? objM7882e : C4700i0.f13910a;
    }

    @Override // p113hc.InterfaceC2972c
    /* JADX INFO: renamed from: b */
    public Object mo399b(InterfaceC2974d interfaceC2974d, InterfaceC5976f interfaceC5976f) {
        return m12724h(this, interfaceC2974d, interfaceC5976f);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // p130ic.InterfaceC3395m
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p113hc.InterfaceC2972c mo11005e(p228p8.InterfaceC5980j r2, int r3, p099gc.EnumC2732a r4) {
        /*
            r1 = this;
            p8.j r0 = r1.f9341q
            p8.j r2 = r2.mo1651c0(r0)
            gc.a r0 = p099gc.EnumC2732a.f7138q
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f9342r
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            gc.a r4 = r1.f9343s
        L25:
            p8.j r0 = r1.f9341q
            boolean r0 = p024b9.AbstractC1061t.m3842c(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f9342r
            if (r3 != r0) goto L36
            gc.a r0 = r1.f9343s
            if (r4 != r0) goto L36
            return r1
        L36:
            ic.e r2 = r1.mo12727k(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p130ic.AbstractC3387e.mo11005e(p8.j, int, gc.a):hc.c");
    }

    /* JADX INFO: renamed from: g */
    public String m12725g() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo12726i(InterfaceC2751t interfaceC2751t, InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: k */
    public abstract AbstractC3387e mo12727k(InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a);

    /* JADX INFO: renamed from: l */
    public InterfaceC2972c mo12728l() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC0188p m12729m() {
        return new b(null);
    }

    /* JADX INFO: renamed from: n */
    public final int m12730n() {
        int i10 = this.f9342r;
        if (i10 == -3) {
            return -2;
        }
        return i10;
    }

    /* JADX INFO: renamed from: o */
    public InterfaceC2753v m12731o(InterfaceC2165o0 interfaceC2165o0) {
        return AbstractC2749r.m9871d(interfaceC2165o0, this.f9341q, m12730n(), this.f9343s, EnumC2173q0.f6000s, null, m12729m(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strM12725g = m12725g();
        if (strM12725g != null) {
            arrayList.add(strM12725g);
        }
        if (this.f9341q != C5981k.f18917q) {
            arrayList.add("context=" + this.f9341q);
        }
        if (this.f9342r != -3) {
            arrayList.add("capacity=" + this.f9342r);
        }
        if (this.f9343s != EnumC2732a.f7138q) {
            arrayList.add("onBufferOverflow=" + this.f9343s);
        }
        return AbstractC2181s0.m7898a(this) + '[' + AbstractC5081g0.m20585s0(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
