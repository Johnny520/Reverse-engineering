package p357y1;

import p069f.C0966x;
import p370yf.AbstractC6038c;
import sg.C3970b;

/* JADX INFO: renamed from: y1.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5946w extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C0966x f24168g;

    /* JADX INFO: renamed from: h */
    public C3970b f24169h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f24170i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC5958z f24171j;

    /* JADX INFO: renamed from: k */
    public int f24172k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5946w(ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f24171j = viewOnAttachStateChangeListenerC5958z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f24170i = obj;
        this.f24172k |= Integer.MIN_VALUE;
        return this.f24171j.m10692e(this);
    }
}
