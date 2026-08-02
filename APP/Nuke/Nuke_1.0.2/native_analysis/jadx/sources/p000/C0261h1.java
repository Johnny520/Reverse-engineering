package p000;

import nuke.module.wechat.p002ai.AIChatError;

/* JADX INFO: renamed from: h1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0261h1 implements InterfaceC0333j1 {

    /* JADX INFO: renamed from: a */
    public final AIChatError f3764a;

    public C0261h1(AIChatError aIChatError) {
        this.f3764a = aIChatError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0261h1) && this.f3764a.equals(((C0261h1) obj).f3764a);
    }

    public final int hashCode() {
        return this.f3764a.hashCode();
    }

    public final String toString() {
        return "Err(error=" + this.f3764a + ")";
    }
}
