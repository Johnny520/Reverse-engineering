package p352xf;

import gg.AbstractC1428x;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: xf.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5801c extends AbstractC6038c {

    /* JADX INFO: renamed from: g */
    public int f23554g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1235p f23555h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC5557c f23556i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5801c(InterfaceC5557c interfaceC5557c, InterfaceC5561g interfaceC5561g, InterfaceC1235p interfaceC1235p, InterfaceC5557c interfaceC5557c2) {
        super(interfaceC5557c, interfaceC5561g);
        this.f23555h = interfaceC1235p;
        this.f23556i = interfaceC5557c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.f23554g;
        if (i9 != 0) {
            if (i9 != 1) {
                C2104o.m5276A("This coroutine had already completed");
                return null;
            }
            this.f23554g = 2;
            AbstractC1089i.m2732I0(obj);
            return obj;
        }
        this.f23554g = 1;
        AbstractC1089i.m2732I0(obj);
        InterfaceC1235p interfaceC1235p = this.f23555h;
        interfaceC1235p.getClass();
        AbstractC1428x.m3838c(2, interfaceC1235p);
        return interfaceC1235p.invoke(this.f23556i, this);
    }
}
