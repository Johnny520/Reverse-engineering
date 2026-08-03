package p058e2;

import p293u2.C4241k;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: e2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0811a extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public Object f2429g;

    /* JADX INFO: renamed from: h */
    public C4241k f2430h;

    /* JADX INFO: renamed from: i */
    public int f2431i;

    /* JADX INFO: renamed from: j */
    public int f2432j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f2433k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ScrollCaptureCallbackC0813c f2434l;

    /* JADX INFO: renamed from: m */
    public int f2435m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0811a(ScrollCaptureCallbackC0813c scrollCaptureCallbackC0813c, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f2434l = scrollCaptureCallbackC0813c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f2433k = obj;
        this.f2435m |= Integer.MIN_VALUE;
        return ScrollCaptureCallbackC0813c.m2058a(this.f2434l, null, null, this);
    }
}
