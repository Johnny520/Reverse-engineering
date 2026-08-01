package p313v9;

import p081fa.InterfaceC2385m;
import p213oa.C5691b;
import p213oa.C5695f;

/* JADX INFO: renamed from: v9.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8884v extends AbstractC8869h implements InterfaceC2385m {

    /* JADX INFO: renamed from: c */
    public final Enum f29465c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8884v(C5695f c5695f, Enum r32) {
        super(c5695f, null);
        r32.getClass();
        this.f29465c = r32;
    }

    @Override // p081fa.InterfaceC2385m
    /* JADX INFO: renamed from: b */
    public C5691b mo8631b() {
        Class<?> enclosingClass = this.f29465c.getClass();
        if (!enclosingClass.isEnum()) {
            enclosingClass = enclosingClass.getEnclosingClass();
        }
        enclosingClass.getClass();
        return AbstractC8865f.m34029e(enclosingClass);
    }

    @Override // p081fa.InterfaceC2385m
    /* JADX INFO: renamed from: d */
    public C5695f mo8632d() {
        return C5695f.m23027j(this.f29465c.name());
    }
}
