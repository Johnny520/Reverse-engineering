package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۟۠ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5495
public abstract class AbstractC2980<T> extends C5557 implements InterfaceC5542, InterfaceC4199<T>, InterfaceC4243 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4225 f4316;

    public AbstractC2980(@InterfaceC6399 InterfaceC4225 interfaceC4225, boolean z, boolean z2) {
        super(z2);
        if (z) {
            m17274((InterfaceC5542) interfaceC4225.get(InterfaceC5542.f13507));
        }
        this.f4316 = interfaceC4225.plus(this);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public static /* synthetic */ void m5772() {
    }

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public final InterfaceC4225 getContext() {
        return this.f4316;
    }

    @Override // Yue.InterfaceC4243
    @InterfaceC6399
    public InterfaceC4225 getCoroutineContext() {
        return this.f4316;
    }

    @Override // Yue.InterfaceC4199
    public final void resumeWith(@InterfaceC6399 Object obj) {
        Object objM17282 = m17282(C4056.m11487(obj, null, 1, null));
        if (objM17282 == C5561.f1565) {
            return;
        }
        mo5778(objM17282);
    }

    @Override // Yue.C5557, Yue.InterfaceC5542
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean mo5773() {
        return super.mo5773();
    }

    @Override // Yue.C5557
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public String mo5774() {
        return C4325.m1288(this) + " was cancelled";
    }

    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public final void mo5775(@InterfaceC6399 Throwable th) {
        C4236.m1201(this.f4316, th);
    }

    @Override // Yue.C5557
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters */
    public String mo5776() {
        String strM1196 = C4230.m1196(this.f4316);
        if (strM1196 == null) {
            return super.mo5776();
        }
        return C8039.f3212 + strM1196 + "\":" + super.mo5776();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // Yue.C5557
    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public final void mo5777(@InterfaceC6489 Object obj) {
        if (!(obj instanceof C4050)) {
            mo5780(obj);
        } else {
            C4050 c4050 = (C4050) obj;
            mo5779(c4050.f637, c4050.m1002());
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public void mo5778(@InterfaceC6489 Object obj) {
        mo9504(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public void mo5779(@InterfaceC6399 Throwable th, boolean z) {
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public void mo5780(T t) {
    }

    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters */
    public final <R> void m5781(@InterfaceC6399 EnumC4247 enumC4247, R r, @InterfaceC6399 InterfaceC5138<? super R, ? super InterfaceC4199<? super T>, ? extends Object> interfaceC5138) {
        enumC4247.m12251(interfaceC5138, r, this);
    }
}
