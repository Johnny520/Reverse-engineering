package p033F4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import p000A.C0066i0;
import p014C1.C0240b;
import p027E4.AbstractC0326m;
import p027E4.InterfaceC0327n;
import p213o2.C2785n;
import p252v2.C3352a;

/* JADX INFO: renamed from: F4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0454a extends AbstractC0326m {

    /* JADX INFO: renamed from: a */
    public final C2785n f1355a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0454a(C2785n c2785n) {
        this.f1355a = c2785n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.AbstractC0326m
    /* JADX INFO: renamed from: a */
    public final InterfaceC0327n mo549a(Type type) {
        C3352a c3352a = new C3352a(type);
        C2785n c2785n = this.f1355a;
        return new C0455b(c2785n, c2785n.m4973b(c3352a));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.AbstractC0326m
    /* JADX INFO: renamed from: b */
    public final InterfaceC0327n mo550b(Type type, Annotation[] annotationArr, C0240b c0240b) {
        C3352a c3352a = new C3352a(type);
        C2785n c2785n = this.f1355a;
        return new C0066i0(c2785n, c2785n.m4973b(c3352a));
    }
}
