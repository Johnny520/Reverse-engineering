package p357y1;

import p352xf.EnumC5799a;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: y1.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5930s extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Object f24045g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5934t f24046h;

    /* JADX INFO: renamed from: i */
    public int f24047i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5930s(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, AbstractC6038c abstractC6038c) {
        super(abstractC6038c);
        this.f24046h = viewTreeObserverOnGlobalLayoutListenerC5934t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        this.f24045g = obj;
        this.f24047i |= Integer.MIN_VALUE;
        this.f24046h.m10654M(null, this);
        return EnumC5799a.f23547g;
    }
}
