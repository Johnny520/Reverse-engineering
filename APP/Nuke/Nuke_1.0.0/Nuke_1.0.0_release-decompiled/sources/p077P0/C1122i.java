package p077P0;

import p112W2.InterfaceC1599a;

/* JADX INFO: renamed from: P0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1122i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1599a f3649a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1599a f3650b;

    public C1122i(InterfaceC1599a interfaceC1599a, InterfaceC1599a interfaceC1599a2) {
        this.f3649a = interfaceC1599a;
        this.f3650b = interfaceC1599a2;
    }

    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f3649a.mo6a()).floatValue() + ", maxValue=" + ((Number) this.f3650b.mo6a()).floatValue() + ", reverseScrolling=false)";
    }
}
