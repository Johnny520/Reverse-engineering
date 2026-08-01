package p229p9;

import gb.AbstractC2650c1;
import gb.EnumC2691m2;
import gb.InterfaceC2716u1;
import java.util.List;
import p082fb.InterfaceC2412n;
import p213oa.C5695f;
import p243q9.InterfaceC6333h;

/* JADX INFO: renamed from: p9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5989c implements InterfaceC6018l1 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC6018l1 f18928q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC6019m f18929r;

    /* JADX INFO: renamed from: s */
    public final int f18930s;

    public C5989c(InterfaceC6018l1 interfaceC6018l1, InterfaceC6019m interfaceC6019m, int i10) {
        interfaceC6018l1.getClass();
        interfaceC6019m.getClass();
        this.f18928q = interfaceC6018l1;
        this.f18929r = interfaceC6019m;
        this.f18930s = i10;
    }

    @Override // p229p9.InterfaceC6018l1
    /* JADX INFO: renamed from: K */
    public boolean mo23993K() {
        return this.f18928q.mo23993K();
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: M0 */
    public Object mo12663M0(InterfaceC6025o interfaceC6025o, Object obj) {
        return this.f18928q.mo12663M0(interfaceC6025o, obj);
    }

    @Override // p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: a */
    public InterfaceC6018l1 mo12664a() {
        InterfaceC6018l1 interfaceC6018l1Mo12664a = this.f18928q.mo12664a();
        interfaceC6018l1Mo12664a.getClass();
        return interfaceC6018l1Mo12664a;
    }

    @Override // p229p9.InterfaceC6022n, p229p9.InterfaceC6019m
    /* JADX INFO: renamed from: b */
    public InterfaceC6019m mo7443b() {
        return this.f18929r;
    }

    @Override // p243q9.InterfaceC6326a
    public InterfaceC6333h getAnnotations() {
        return this.f18928q.getAnnotations();
    }

    @Override // p229p9.InterfaceC6018l1
    public int getIndex() {
        return this.f18930s + this.f18928q.getIndex();
    }

    @Override // p229p9.InterfaceC6011j0
    public C5695f getName() {
        C5695f name = this.f18928q.getName();
        name.getClass();
        return name;
    }

    @Override // p229p9.InterfaceC6028p
    public InterfaceC6003g1 getSource() {
        InterfaceC6003g1 source = this.f18928q.getSource();
        source.getClass();
        return source;
    }

    @Override // p229p9.InterfaceC6018l1
    public List getUpperBounds() {
        List upperBounds = this.f18928q.getUpperBounds();
        upperBounds.getClass();
        return upperBounds;
    }

    @Override // p229p9.InterfaceC6018l1
    /* JADX INFO: renamed from: m0 */
    public InterfaceC2412n mo23994m0() {
        InterfaceC2412n interfaceC2412nMo23994m0 = this.f18928q.mo23994m0();
        interfaceC2412nMo23994m0.getClass();
        return interfaceC2412nMo23994m0;
    }

    @Override // p229p9.InterfaceC6018l1, p229p9.InterfaceC6004h
    /* JADX INFO: renamed from: o */
    public InterfaceC2716u1 mo5591o() {
        InterfaceC2716u1 interfaceC2716u1Mo5591o = this.f18928q.mo5591o();
        interfaceC2716u1Mo5591o.getClass();
        return interfaceC2716u1Mo5591o;
    }

    @Override // p229p9.InterfaceC6018l1
    /* JADX INFO: renamed from: s */
    public EnumC2691m2 mo23995s() {
        EnumC2691m2 enumC2691m2Mo23995s = this.f18928q.mo23995s();
        enumC2691m2Mo23995s.getClass();
        return enumC2691m2Mo23995s;
    }

    @Override // p229p9.InterfaceC6018l1
    /* JADX INFO: renamed from: s0 */
    public boolean mo23996s0() {
        return true;
    }

    public String toString() {
        return this.f18928q + "[inner-copy]";
    }

    @Override // p229p9.InterfaceC6004h
    /* JADX INFO: renamed from: x */
    public AbstractC2650c1 mo7508x() {
        AbstractC2650c1 abstractC2650c1Mo7508x = this.f18928q.mo7508x();
        abstractC2650c1Mo7508x.getClass();
        return abstractC2650c1Mo7508x;
    }
}
