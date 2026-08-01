package p313v9;

import java.lang.annotation.Annotation;
import p081fa.InterfaceC2369a;
import p081fa.InterfaceC2373c;
import p213oa.C5695f;

/* JADX INFO: renamed from: v9.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8871i extends AbstractC8869h implements InterfaceC2373c {

    /* JADX INFO: renamed from: c */
    public final Annotation f29446c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8871i(C5695f c5695f, Annotation annotation) {
        super(c5695f, null);
        annotation.getClass();
        this.f29446c = annotation;
    }

    @Override // p081fa.InterfaceC2373c
    /* JADX INFO: renamed from: a */
    public InterfaceC2369a mo8600a() {
        return new C8867g(this.f29446c);
    }
}
