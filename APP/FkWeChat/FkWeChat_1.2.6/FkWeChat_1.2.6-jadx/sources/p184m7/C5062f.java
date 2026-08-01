package p184m7;

import ec.InterfaceC2125e0;
import io.ktor.util.internal.AbstractC3449a;
import p281t6.C8140d;

/* JADX INFO: renamed from: m7.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5062f extends AbstractC5059c implements InterfaceC2125e0 {

    /* JADX INFO: renamed from: q */
    public final C8140d f15370q;

    /* JADX WARN: Illegal instructions before constructor call */
    public C5062f(C8140d c8140d) {
        String str;
        if (c8140d != null) {
            str = "Content type " + c8140d + " is not supported";
        } else {
            str = "Content-Type header is required";
        }
        super(str);
        this.f15370q = c8140d;
    }

    @Override // ec.InterfaceC2125e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5062f mo5383a() {
        C5062f c5062f = new C5062f(this.f15370q);
        AbstractC3449a.m12862a(c5062f, this);
        return c5062f;
    }
}
