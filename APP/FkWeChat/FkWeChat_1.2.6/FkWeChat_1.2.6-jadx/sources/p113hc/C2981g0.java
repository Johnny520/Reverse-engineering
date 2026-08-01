package p113hc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p024b9.AbstractC1061t;
import p099gc.EnumC2732a;
import p130ic.AbstractC3384b;
import p130ic.AbstractC3386d;
import p130ic.AbstractC3398p;
import p130ic.InterfaceC3395m;
import p145jc.C3801d0;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: hc.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2981g0 extends AbstractC3384b implements InterfaceC2995s, InterfaceC2972c, InterfaceC3395m {

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7864v = AtomicReferenceFieldUpdater.newUpdater(C2981g0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: u */
    public int f7865u;

    /* JADX INFO: renamed from: hc.g0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f7866q;

        /* JADX INFO: renamed from: r */
        public Object f7867r;

        /* JADX INFO: renamed from: s */
        public Object f7868s;

        /* JADX INFO: renamed from: t */
        public Object f7869t;

        /* JADX INFO: renamed from: u */
        public Object f7870u;

        /* JADX INFO: renamed from: v */
        public /* synthetic */ Object f7871v;

        /* JADX INFO: renamed from: x */
        public int f7873x;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f7871v = obj;
            this.f7873x |= Integer.MIN_VALUE;
            return C2981g0.this.mo399b(null, this);
        }
    }

    public C2981g0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // p113hc.InterfaceC2994r, p113hc.InterfaceC2974d
    /* JADX INFO: renamed from: a */
    public Object mo400a(Object obj, InterfaceC5976f interfaceC5976f) {
        setValue(obj);
        return C4700i0.f13910a;
    }

    /* JADX WARN: Path cross not found for [B:29:0x008e, B:45:0x00c4], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:33:0x009d, B:35:0x00a3], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a3, B:33:0x009d], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a3, B:43:0x00be], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:45:0x00c4, B:29:0x008e], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008e, B:31:0x0098, B:33:0x009d, B:43:0x00be, B:45:0x00c4, B:35:0x00a3, B:39:0x00aa, B:22:0x005e, B:25:0x0070, B:28:0x007f), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008e, B:31:0x0098, B:33:0x009d, B:43:0x00be, B:45:0x00c4, B:35:0x00a3, B:39:0x00aa, B:22:0x005e, B:25:0x0070, B:28:0x007f), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008e, B:31:0x0098, B:33:0x009d, B:43:0x00be, B:45:0x00c4, B:35:0x00a3, B:39:0x00aa, B:22:0x005e, B:25:0x0070, B:28:0x007f), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c2 -> B:29:0x008e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d4 -> B:29:0x008e). Please report as a decompilation issue!!! */
    @Override // p113hc.InterfaceC2998v, p113hc.InterfaceC2972c
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo399b(p113hc.InterfaceC2974d r11, p228p8.InterfaceC5976f r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p113hc.C2981g0.mo399b(hc.d, p8.f):java.lang.Object");
    }

    @Override // p113hc.InterfaceC2995s
    /* JADX INFO: renamed from: c */
    public boolean mo11003c(Object obj, Object obj2) {
        if (obj == null) {
            obj = AbstractC3398p.f9379a;
        }
        if (obj2 == null) {
            obj2 = AbstractC3398p.f9379a;
        }
        return m11011s(obj, obj2);
    }

    @Override // p113hc.InterfaceC2994r
    /* JADX INFO: renamed from: d */
    public void mo11004d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // p130ic.InterfaceC3395m
    /* JADX INFO: renamed from: e */
    public InterfaceC2972c mo11005e(InterfaceC5980j interfaceC5980j, int i10, EnumC2732a enumC2732a) {
        return AbstractC2983h0.m11017d(this, interfaceC5980j, i10, enumC2732a);
    }

    @Override // p113hc.InterfaceC2994r
    /* JADX INFO: renamed from: f */
    public boolean mo11006f(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // p113hc.InterfaceC2995s, p113hc.InterfaceC2979f0
    public Object getValue() {
        C3801d0 c3801d0 = AbstractC3398p.f9379a;
        Object obj = f7864v.get(this);
        if (obj == c3801d0) {
            return null;
        }
        return obj;
    }

    @Override // p130ic.AbstractC3384b
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C2985i0 mo11007k() {
        return new C2985i0();
    }

    @Override // p130ic.AbstractC3384b
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C2985i0[] mo11008l(int i10) {
        return new C2985i0[i10];
    }

    /* JADX INFO: renamed from: s */
    public final boolean m11011s(Object obj, Object obj2) {
        int i10;
        AbstractC3386d[] abstractC3386dArrM12723o;
        synchronized (this) {
            Object obj3 = f7864v.get(this);
            if (obj != null && !AbstractC1061t.m3842c(obj3, obj)) {
                return false;
            }
            if (AbstractC1061t.m3842c(obj3, obj2)) {
                return true;
            }
            f7864v.set(this, obj2);
            int i11 = this.f7865u;
            if ((i11 & 1) != 0) {
                this.f7865u = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f7865u = i12;
            AbstractC3386d[] abstractC3386dArrM12723o2 = m12723o();
            C4700i0 c4700i0 = C4700i0.f13910a;
            while (true) {
                C2985i0[] c2985i0Arr = (C2985i0[]) abstractC3386dArrM12723o2;
                if (c2985i0Arr != null) {
                    for (C2985i0 c2985i0 : c2985i0Arr) {
                        if (c2985i0 != null) {
                            c2985i0.m11027g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f7865u;
                    if (i10 == i12) {
                        this.f7865u = i12 + 1;
                        return true;
                    }
                    abstractC3386dArrM12723o = m12723o();
                    C4700i0 c4700i02 = C4700i0.f13910a;
                }
                abstractC3386dArrM12723o2 = abstractC3386dArrM12723o;
                i12 = i10;
            }
        }
    }

    @Override // p113hc.InterfaceC2995s
    public void setValue(Object obj) {
        if (obj == null) {
            obj = AbstractC3398p.f9379a;
        }
        m11011s(null, obj);
    }
}
