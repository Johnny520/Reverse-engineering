package p229p9;

import p024b9.AbstractC1061t;
import p160kb.InterfaceC4230j;
import p213oa.C5695f;

/* JADX INFO: renamed from: p9.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5984a0 extends AbstractC6033q1 {

    /* JADX INFO: renamed from: a */
    public final C5695f f18921a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC4230j f18922b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5984a0(C5695f c5695f, InterfaceC4230j interfaceC4230j) {
        super(null);
        c5695f.getClass();
        interfaceC4230j.getClass();
        this.f18921a = c5695f;
        this.f18922b = interfaceC4230j;
    }

    @Override // p229p9.AbstractC6033q1
    /* JADX INFO: renamed from: a */
    public boolean mo23989a(C5695f c5695f) {
        c5695f.getClass();
        return AbstractC1061t.m3842c(this.f18921a, c5695f);
    }

    /* JADX INFO: renamed from: c */
    public final C5695f m23990c() {
        return this.f18921a;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC4230j m23991d() {
        return this.f18922b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f18921a + ", underlyingType=" + this.f18922b + ')';
    }
}
