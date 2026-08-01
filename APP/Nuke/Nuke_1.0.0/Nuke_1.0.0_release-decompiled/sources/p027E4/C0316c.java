package p027E4;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import p000A.C0066i0;
import p014C1.C0240b;
import p039G4.InterfaceC0540w;
import p056K2.C0891q;
import p118X3.AbstractC1682D;
import p118X3.AbstractC1687I;

/* JADX INFO: renamed from: E4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0316c extends AbstractC0326m {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1041a;

    public /* synthetic */ C0316c(int i5) {
        this.f1041a = i5;
    }

    @Override // p027E4.AbstractC0326m
    /* JADX INFO: renamed from: a */
    public InterfaceC0327n mo549a(Type type) {
        switch (this.f1041a) {
            case 0:
                if (AbstractC1682D.class.isAssignableFrom(AbstractC0315b0.m537h(type))) {
                    return C0314b.f1033g;
                }
                return null;
            default:
                return super.mo549a(type);
        }
    }

    @Override // p027E4.AbstractC0326m
    /* JADX INFO: renamed from: b */
    public final InterfaceC0327n mo550b(Type type, Annotation[] annotationArr, C0240b c0240b) {
        switch (this.f1041a) {
            case 0:
                if (type == AbstractC1687I.class) {
                    return AbstractC0315b0.m541l(annotationArr, InterfaceC0540w.class) ? C0314b.f1034h : C0314b.f1032f;
                }
                if (type == Void.class) {
                    return C0314b.f1036j;
                }
                if (AbstractC0315b0.f1039b && type == C0891q.class) {
                    return C0314b.f1035i;
                }
                return null;
            default:
                if (AbstractC0315b0.m537h(type) != Optional.class) {
                    return null;
                }
                return new C0066i0(3, c0240b.m440q(AbstractC0315b0.m536g(0, (ParameterizedType) type), annotationArr));
        }
    }
}
