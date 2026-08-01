package ad;

import java.lang.annotation.Annotation;
import p300uc.C8658l;
import p300uc.InterfaceC8662p;
import p329wc.AbstractC9216d;
import p329wc.AbstractC9217e;
import p329wc.AbstractC9224l;
import p329wc.InterfaceC9218f;
import p361yc.AbstractC9784y0;
import p375zc.AbstractC9939c;
import p375zc.EnumC9935a;
import p375zc.InterfaceC9949h;
import p376zd.C10010p0;

/* JADX INFO: renamed from: ad.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0293v0 {

    /* JADX INFO: renamed from: ad.v0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f717a;

        static {
            int[] iArr = new int[EnumC9935a.values().length];
            try {
                iArr[EnumC9935a.f33472q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC9935a.f33474s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC9935a.f33473r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f717a = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m860b(AbstractC9224l abstractC9224l) {
        abstractC9224l.getClass();
        if (abstractC9224l instanceof AbstractC9224l.b) {
            C10010p0.m38820a("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (abstractC9224l instanceof AbstractC9217e) {
            C10010p0.m38820a("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        } else if (abstractC9224l instanceof AbstractC9216d) {
            C10010p0.m38820a("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    /* JADX INFO: renamed from: c */
    public static final String m861c(InterfaceC9218f interfaceC9218f, AbstractC9939c abstractC9939c) {
        interfaceC9218f.getClass();
        abstractC9939c.getClass();
        for (Annotation annotation : interfaceC9218f.getAnnotations()) {
            if (annotation instanceof InterfaceC9949h) {
                return ((InterfaceC9949h) annotation).discriminator();
            }
        }
        return abstractC9939c.m38514f().m38552e();
    }

    /* JADX INFO: renamed from: d */
    public static final void m862d(InterfaceC8662p interfaceC8662p, InterfaceC8662p interfaceC8662p2, String str) {
        if ((interfaceC8662p instanceof C8658l) && AbstractC9784y0.m38086a(interfaceC8662p2.mo15953a()).contains(str)) {
            String strMo35888a = ((C8658l) interfaceC8662p).mo15953a().mo35888a();
            throw new IllegalStateException(("Sealed class '" + interfaceC8662p2.mo15953a().mo35888a() + "' cannot be serialized as base class '" + strMo35888a + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
