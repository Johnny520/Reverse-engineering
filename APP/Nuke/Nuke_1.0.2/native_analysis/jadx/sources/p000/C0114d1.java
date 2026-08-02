package p000;

import nuke.module.wechat.p002ai.AIChatError;

/* JADX INFO: renamed from: d1 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0114d1 implements InterfaceC0187f1 {

    /* JADX INFO: renamed from: a */
    public final AIChatError f1803a;

    public C0114d1(AIChatError aIChatError) {
        this.f1803a = aIChatError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0114d1) && this.f1803a.equals(((C0114d1) obj).f1803a);
    }

    public final int hashCode() {
        return this.f1803a.hashCode();
    }

    public final String toString() {
        return "Err(error=" + this.f1803a + ")";
    }
}
