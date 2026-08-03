package p002a1;

import p370yf.AbstractC6038c;
import sg.C3970b;

/* JADX INFO: renamed from: a1.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0007e extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C3970b f18g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f19h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0011i f20i;

    /* JADX INFO: renamed from: j */
    public int f21j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0007e(ViewOnAttachStateChangeListenerC0011i viewOnAttachStateChangeListenerC0011i, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f20i = viewOnAttachStateChangeListenerC0011i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f19h = obj;
        this.f21j |= Integer.MIN_VALUE;
        return this.f20i.m154e(this);
    }
}
