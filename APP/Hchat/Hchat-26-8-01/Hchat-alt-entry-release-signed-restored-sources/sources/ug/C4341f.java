package ug;

import p144k.C2160c0;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ug.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4341f extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public C2160c0 f14506g;

    /* JADX INFO: renamed from: h */
    public Object f14507h;

    /* JADX INFO: renamed from: i */
    public /* synthetic */ Object f14508i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2160c0 f14509j;

    /* JADX INFO: renamed from: k */
    public int f14510k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4341f(C2160c0 c2160c0, InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        this.f14509j = c2160c0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f14508i = obj;
        this.f14510k |= Integer.MIN_VALUE;
        return this.f14509j.mo1602e(null, this);
    }
}
