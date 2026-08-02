package p000;

import nuke.module.wechat.p002ai.AIChatResponse;

/* JADX INFO: renamed from: e1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0150e1 implements InterfaceC0187f1 {

    /* JADX INFO: renamed from: a */
    public final AIChatResponse f2290a;

    public C0150e1(AIChatResponse aIChatResponse) {
        this.f2290a = aIChatResponse;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0150e1) && this.f2290a.equals(((C0150e1) obj).f2290a);
    }

    public final int hashCode() {
        return this.f2290a.hashCode();
    }

    public final String toString() {
        return "Ok(response=" + this.f2290a + ")";
    }
}
