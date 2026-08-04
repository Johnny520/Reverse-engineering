package yyds;

/* JADX INFO: renamed from: yyds.ᛵᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1118 extends AbstractC2017 implements InterfaceC1431, InterfaceC0274 {

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ long f5136 = AbstractC2112.f10448.objectFieldOffset(C1118.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public Object f5137;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final Object f5138;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final AbstractC1320 f5139;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final AbstractC0974 f5140;

    public C1118(AbstractC0974 abstractC0974, AbstractC1320 abstractC1320) {
        super(-1);
        this.f5140 = abstractC0974;
        this.f5139 = abstractC1320;
        this.f5137 = AbstractC0427.f2177;
        this.f5138 = abstractC1320.f6070.mo424(0, AbstractC0797.f3658);
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f5140 + ", " + AbstractC2408.m4458(this.f5139) + ']';
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final void mo812(Object obj) {
        Throwable thM4249 = C2248.m4249(obj);
        Object c0417 = thM4249 == null ? obj : new C0417(thM4249, false);
        AbstractC1320 abstractC1320 = this.f5139;
        InterfaceC2213 interfaceC2213 = abstractC1320.f6070;
        AbstractC0974 abstractC0974 = this.f5140;
        if (abstractC0974.mo2117(interfaceC2213)) {
            this.f5137 = c0417;
            this.f10086 = 0;
            abstractC0974.mo1251(interfaceC2213, this);
            return;
        }
        AbstractC0467 abstractC0467M4643 = AbstractC2567.m4643();
        if (abstractC0467M4643.f2325 >= 4294967296L) {
            this.f5137 = c0417;
            this.f10086 = 0;
            C0217 c0217 = abstractC0467M4643.f2324;
            if (c0217 == null) {
                c0217 = new C0217();
                abstractC0467M4643.f2324 = c0217;
            }
            c0217.addLast(this);
            return;
        }
        abstractC0467M4643.m1250(true);
        try {
            Object objM1832 = AbstractC0797.m1832(interfaceC2213, this.f5138);
            try {
                abstractC1320.mo812(obj);
                while (abstractC0467M4643.m1243()) {
                }
            } finally {
                AbstractC0797.m1826(interfaceC2213, objM1832);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // yyds.AbstractC2017
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ, reason: contains not printable characters */
    public final Object mo2310() {
        Object obj = this.f5137;
        this.f5137 = AbstractC0427.f2177;
        return obj;
    }

    @Override // yyds.InterfaceC0274
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final InterfaceC2213 mo733() {
        return this.f5139.f6070;
    }

    @Override // yyds.AbstractC2017
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final InterfaceC0274 mo2311() {
        return this;
    }

    @Override // yyds.InterfaceC1431
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final InterfaceC1431 mo1008() {
        return this.f5139;
    }
}
