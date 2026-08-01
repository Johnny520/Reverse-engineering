package p142j9;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import na.AbstractC5529d;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p211o8.AbstractC5661b;
import p313v9.AbstractC8865f;

/* JADX INFO: renamed from: j9.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3715n {

    /* JADX INFO: renamed from: j9.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3715n {

        /* JADX INFO: renamed from: a */
        public final Class f10256a;

        /* JADX INFO: renamed from: b */
        public final List f10257b;

        /* JADX INFO: renamed from: j9.n$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10121a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC5661b.m22869d(((Method) obj).getName(), ((Method) obj2).getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Class cls) {
            super(null);
            cls.getClass();
            this.f10256a = cls;
            Method[] declaredMethods = cls.getDeclaredMethods();
            declaredMethods.getClass();
            this.f10257b = AbstractC5106t.m20693L0(declaredMethods, new C10121a());
        }

        /* JADX INFO: renamed from: c */
        public static final CharSequence m13826c(Method method) {
            Class<?> returnType = method.getReturnType();
            returnType.getClass();
            return AbstractC8865f.m34030f(returnType);
        }

        @Override // p142j9.AbstractC3715n
        /* JADX INFO: renamed from: a */
        public String mo13824a() {
            return AbstractC5081g0.m20585s0(this.f10257b, _UrlKt.FRAGMENT_ENCODE_SET, "<init>(", ")V", 0, null, C3710m.f10250q, 24, null);
        }

        /* JADX INFO: renamed from: d */
        public final List m13827d() {
            return this.f10257b;
        }
    }

    /* JADX INFO: renamed from: j9.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC3715n {

        /* JADX INFO: renamed from: a */
        public final Constructor f10258a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(null);
            constructor.getClass();
            this.f10258a = constructor;
        }

        /* JADX INFO: renamed from: c */
        public static final CharSequence m13829c(Class cls) {
            cls.getClass();
            return AbstractC8865f.m34030f(cls);
        }

        @Override // p142j9.AbstractC3715n
        /* JADX INFO: renamed from: a */
        public String mo13824a() {
            Class<?>[] parameterTypes = this.f10258a.getParameterTypes();
            parameterTypes.getClass();
            return AbstractC5106t.m20754u0(parameterTypes, _UrlKt.FRAGMENT_ENCODE_SET, "<init>(", ")V", 0, null, C3720o.f10273q, 24, null);
        }

        /* JADX INFO: renamed from: d */
        public final Constructor m13830d() {
            return this.f10258a;
        }
    }

    /* JADX INFO: renamed from: j9.n$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC3715n {

        /* JADX INFO: renamed from: a */
        public final Method f10259a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Method method) {
            super(null);
            method.getClass();
            this.f10259a = method;
        }

        @Override // p142j9.AbstractC3715n
        /* JADX INFO: renamed from: a */
        public String mo13824a() {
            return AbstractC3699j3.m13766d(this.f10259a);
        }

        /* JADX INFO: renamed from: b */
        public final Method m13831b() {
            return this.f10259a;
        }
    }

    /* JADX INFO: renamed from: j9.n$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC3715n {

        /* JADX INFO: renamed from: a */
        public final AbstractC5529d.b f10260a;

        /* JADX INFO: renamed from: b */
        public final String f10261b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC5529d.b bVar) {
            super(null);
            bVar.getClass();
            this.f10260a = bVar;
            this.f10261b = bVar.mo22533a();
        }

        @Override // p142j9.AbstractC3715n
        /* JADX INFO: renamed from: a */
        public String mo13824a() {
            return this.f10261b;
        }

        /* JADX INFO: renamed from: b */
        public final String m13832b() {
            return this.f10260a.m22540d();
        }
    }

    /* JADX INFO: renamed from: j9.n$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends AbstractC3715n {

        /* JADX INFO: renamed from: a */
        public final AbstractC5529d.b f10262a;

        /* JADX INFO: renamed from: b */
        public final String f10263b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AbstractC5529d.b bVar) {
            super(null);
            bVar.getClass();
            this.f10262a = bVar;
            this.f10263b = bVar.mo22533a();
        }

        @Override // p142j9.AbstractC3715n
        /* JADX INFO: renamed from: a */
        public String mo13824a() {
            return this.f10263b;
        }

        /* JADX INFO: renamed from: b */
        public final String m13833b() {
            return this.f10262a.m22540d();
        }

        /* JADX INFO: renamed from: c */
        public final String m13834c() {
            return this.f10262a.m22541e();
        }
    }

    public /* synthetic */ AbstractC3715n(AbstractC1043k abstractC1043k) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract String mo13824a();

    public AbstractC3715n() {
    }
}
