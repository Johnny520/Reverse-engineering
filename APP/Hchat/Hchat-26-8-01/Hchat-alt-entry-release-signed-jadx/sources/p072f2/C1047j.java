package p072f2;

import p085fg.InterfaceC1220a;

/* JADX INFO: renamed from: f2.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1047j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1220a f3288a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1220a f3289b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1047j(InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2) {
        this.f3288a = interfaceC1220a;
        this.f3289b = interfaceC1220a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f3288a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f3289b.invoke()).floatValue() + ", reverseScrolling=false)";
    }
}
