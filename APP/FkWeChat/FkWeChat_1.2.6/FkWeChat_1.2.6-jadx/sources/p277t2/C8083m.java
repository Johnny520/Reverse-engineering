package p277t2;

import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: t2.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8083m {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0173a f26987a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0173a f26988b;

    /* JADX INFO: renamed from: c */
    public final boolean f26989c;

    public C8083m(InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2, boolean z10) {
        this.f26987a = interfaceC0173a;
        this.f26988b = interfaceC0173a2;
        this.f26989c = z10;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0173a m31214a() {
        return this.f26988b;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m31215b() {
        return this.f26989c;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0173a m31216c() {
        return this.f26987a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f26987a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f26988b.invoke()).floatValue() + ", reverseScrolling=" + this.f26989c + ')';
    }

    public /* synthetic */ C8083m(InterfaceC0173a interfaceC0173a, InterfaceC0173a interfaceC0173a2, boolean z10, int i10, AbstractC1043k abstractC1043k) {
        this(interfaceC0173a, interfaceC0173a2, (i10 & 4) != 0 ? false : z10);
    }
}
