package p027E4;

import com.bumptech.glide.AbstractC1923e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import p011B4.AbstractC0231b;
import p014C1.C0240b;
import p039G4.InterfaceC0518a;
import p039G4.InterfaceC0519b;
import p039G4.InterfaceC0520c;
import p039G4.InterfaceC0521d;
import p039G4.InterfaceC0522e;
import p039G4.InterfaceC0523f;
import p039G4.InterfaceC0524g;
import p039G4.InterfaceC0525h;
import p039G4.InterfaceC0526i;
import p039G4.InterfaceC0527j;
import p039G4.InterfaceC0528k;
import p039G4.InterfaceC0529l;
import p039G4.InterfaceC0530m;
import p039G4.InterfaceC0531n;
import p039G4.InterfaceC0532o;
import p039G4.InterfaceC0533p;
import p039G4.InterfaceC0534q;
import p039G4.InterfaceC0535r;
import p039G4.InterfaceC0536s;
import p039G4.InterfaceC0537t;
import p039G4.InterfaceC0538u;
import p039G4.InterfaceC0539v;
import p039G4.InterfaceC0541x;
import p039G4.InterfaceC0542y;
import p049I2.AbstractC0797o;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p118X3.C1684F;
import p118X3.C1706p;
import p118X3.C1707q;
import p118X3.C1709s;
import p118X3.C1711u;
import p118X3.C1712v;
import p118X3.InterfaceC1694d;
import p179i4.AbstractC2352g;

/* JADX INFO: renamed from: E4.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0333t {

    /* JADX INFO: renamed from: a */
    public final C0305T f1054a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1694d f1055b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0327n f1056c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0333t(C0305T c0305t, InterfaceC1694d interfaceC1694d, InterfaceC0327n interfaceC0327n) {
        this.f1054a = c0305t;
        this.f1055b = interfaceC1694d;
        this.f1056c = interfaceC0327n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0125, code lost:
    
        throw p027E4.AbstractC0315b0.m542m(r28, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x090a A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC0333t m553b(C0240b c0240b, Class cls, Method method) {
        Type genericReturnType;
        boolean z5;
        boolean z6;
        boolean z7;
        AbstractC0315b0 abstractC0315b0;
        int i5;
        int i6;
        AbstractC0315b0[] abstractC0315b0Arr;
        int i7;
        int i8;
        String str;
        AbstractC0315b0 c0299m;
        AbstractC0315b0 c0295i;
        C0290D c0290d;
        C0290D c0290d2;
        C0304S c0304s = new C0304S(c0240b, cls, method);
        Annotation[] annotationArr = c0304s.f984d;
        int length = annotationArr.length;
        int i9 = 0;
        int i10 = 0;
        loop0: while (true) {
            String str2 = "HEAD";
            boolean z8 = true;
            AbstractC0315b0 abstractC0315b02 = null;
            if (i10 >= length) {
                if (c0304s.f995o == null) {
                    throw AbstractC0315b0.m542m(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!c0304s.f996p) {
                    if (c0304s.f998r) {
                        throw AbstractC0315b0.m542m(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (c0304s.f997q) {
                        throw AbstractC0315b0.m542m(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = c0304s.f985e;
                int length2 = annotationArr2.length;
                c0304s.f1003w = new AbstractC0315b0[length2];
                int i11 = length2 - 1;
                int i12 = 0;
                while (i12 < length2) {
                    AbstractC0315b0[] abstractC0315b0Arr2 = c0304s.f1003w;
                    Type type = c0304s.f986f[i12];
                    Annotation[] annotationArr3 = annotationArr2[i12];
                    int i13 = i12 == i11 ? 1 : i9;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        abstractC0315b0 = abstractC0315b02;
                        int i14 = i9;
                        while (i14 < length3) {
                            Annotation annotation = annotationArr3[i14];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i15 = length2;
                            if (annotation instanceof InterfaceC0542y) {
                                c0304s.m528c(i12, type);
                                if (c0304s.f994n) {
                                    throw AbstractC0315b0.m543n(method, i12, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (c0304s.f990j) {
                                    throw AbstractC0315b0.m543n(method, i12, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (c0304s.f991k) {
                                    throw AbstractC0315b0.m543n(method, i12, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (c0304s.f992l) {
                                    throw AbstractC0315b0.m543n(method, i12, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (c0304s.f993m) {
                                    throw AbstractC0315b0.m543n(method, i12, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (c0304s.f999s != null) {
                                    throw AbstractC0315b0.m543n(method, i12, "@Url cannot be used with @%s URL", c0304s.f995o);
                                }
                                c0304s.f994n = true;
                                if (type != C1709s.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw AbstractC0315b0.m543n(method, i12, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                c0299m = new C0294H(method, i12, 1);
                                str = str2;
                                i5 = i11;
                            } else {
                                i5 = i11;
                                boolean z9 = annotation instanceof InterfaceC0536s;
                                C0240b c0240b2 = c0304s.f981a;
                                if (z9) {
                                    c0304s.m528c(i12, type);
                                    if (c0304s.f991k) {
                                        throw AbstractC0315b0.m543n(method, i12, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (c0304s.f992l) {
                                        throw AbstractC0315b0.m543n(method, i12, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (c0304s.f993m) {
                                        throw AbstractC0315b0.m543n(method, i12, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (c0304s.f994n) {
                                        throw AbstractC0315b0.m543n(method, i12, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (c0304s.f999s == null) {
                                        throw AbstractC0315b0.m543n(method, i12, "@Path can only be used with relative url on @%s", c0304s.f995o);
                                    }
                                    c0304s.f990j = true;
                                    InterfaceC0536s interfaceC0536s = (InterfaceC0536s) annotation;
                                    String strValue = interfaceC0536s.value();
                                    if (!C0304S.f980z.matcher(strValue).matches()) {
                                        throw AbstractC0315b0.m543n(method, i12, "@Path parameter name must match %s. Found: %s", C0304S.f979y.pattern(), strValue);
                                    }
                                    if (!c0304s.f1002v.contains(strValue)) {
                                        throw AbstractC0315b0.m543n(method, i12, "URL \"%s\" does not contain \"{%s}\".", c0304s.f999s, strValue);
                                    }
                                    c0240b2.m442s(type, annotationArr3);
                                    c0299m = new C0296J(c0304s.f983c, i12, strValue, interfaceC0536s.encoded());
                                    str = str2;
                                } else {
                                    i6 = i14;
                                    abstractC0315b0Arr = abstractC0315b0Arr2;
                                    if (annotation instanceof InterfaceC0537t) {
                                        c0304s.m528c(i12, type);
                                        InterfaceC0537t interfaceC0537t = (InterfaceC0537t) annotation;
                                        String strValue2 = interfaceC0537t.value();
                                        boolean zEncoded = interfaceC0537t.encoded();
                                        i7 = i13;
                                        Class clsM537h = AbstractC0315b0.m537h(type);
                                        i8 = length3;
                                        c0304s.f991k = true;
                                        if (Iterable.class.isAssignableFrom(clsM537h)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw AbstractC0315b0.m543n(method, i12, clsM537h.getSimpleName() + " must include generic type (e.g., " + clsM537h.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            c0240b2.m442s(AbstractC0315b0.m536g(0, (ParameterizedType) type), annotationArr3);
                                            c0290d2 = new C0290D(new C0292F(2, strValue2, zEncoded), 0);
                                        } else if (clsM537h.isArray()) {
                                            c0240b2.m442s(C0304S.m526a(clsM537h.getComponentType()), annotationArr3);
                                            c0290d2 = new C0290D(new C0292F(2, strValue2, zEncoded), 1);
                                        } else {
                                            c0240b2.m442s(type, annotationArr3);
                                            c0299m = new C0292F(2, strValue2, zEncoded);
                                            str = str2;
                                        }
                                        c0299m = c0290d2;
                                        str = str2;
                                    } else {
                                        i7 = i13;
                                        i8 = length3;
                                        if (annotation instanceof InterfaceC0539v) {
                                            c0304s.m528c(i12, type);
                                            boolean zEncoded2 = ((InterfaceC0539v) annotation).encoded();
                                            Class clsM537h2 = AbstractC0315b0.m537h(type);
                                            c0304s.f992l = true;
                                            if (Iterable.class.isAssignableFrom(clsM537h2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw AbstractC0315b0.m543n(method, i12, clsM537h2.getSimpleName() + " must include generic type (e.g., " + clsM537h2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                c0240b2.m442s(AbstractC0315b0.m536g(0, (ParameterizedType) type), annotationArr3);
                                                c0290d2 = new C0290D(new C0297K(zEncoded2), 0);
                                            } else if (clsM537h2.isArray()) {
                                                c0240b2.m442s(C0304S.m526a(clsM537h2.getComponentType()), annotationArr3);
                                                c0290d2 = new C0290D(new C0297K(zEncoded2), 1);
                                            } else {
                                                c0240b2.m442s(type, annotationArr3);
                                                c0299m = new C0297K(zEncoded2);
                                            }
                                            c0299m = c0290d2;
                                        } else if (annotation instanceof InterfaceC0538u) {
                                            c0304s.m528c(i12, type);
                                            Class clsM537h3 = AbstractC0315b0.m537h(type);
                                            c0304s.f993m = true;
                                            if (!Map.class.isAssignableFrom(clsM537h3)) {
                                                throw AbstractC0315b0.m543n(method, i12, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeM538i = AbstractC0315b0.m538i(type, clsM537h3);
                                            if (!(typeM538i instanceof ParameterizedType)) {
                                                throw AbstractC0315b0.m543n(method, i12, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeM538i;
                                            Type typeM536g = AbstractC0315b0.m536g(0, parameterizedType);
                                            if (String.class != typeM536g) {
                                                throw AbstractC0315b0.m543n(method, i12, "@QueryMap keys must be of type String: " + typeM536g, new Object[0]);
                                            }
                                            c0240b2.m442s(AbstractC0315b0.m536g(1, parameterizedType), annotationArr3);
                                            c0299m = new C0293G(method, i12, ((InterfaceC0538u) annotation).encoded(), 2);
                                        } else {
                                            str = str2;
                                            if (annotation instanceof InterfaceC0526i) {
                                                c0304s.m528c(i12, type);
                                                InterfaceC0526i interfaceC0526i = (InterfaceC0526i) annotation;
                                                String strValue3 = interfaceC0526i.value();
                                                Class clsM537h4 = AbstractC0315b0.m537h(type);
                                                if (Iterable.class.isAssignableFrom(clsM537h4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw AbstractC0315b0.m543n(method, i12, clsM537h4.getSimpleName() + " must include generic type (e.g., " + clsM537h4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c0240b2.m442s(AbstractC0315b0.m536g(0, (ParameterizedType) type), annotationArr3);
                                                    c0295i = new C0290D(new C0292F(1, strValue3, interfaceC0526i.allowUnsafeNonAsciiValues()), 0);
                                                } else if (clsM537h4.isArray()) {
                                                    c0240b2.m442s(C0304S.m526a(clsM537h4.getComponentType()), annotationArr3);
                                                    c0295i = new C0290D(new C0292F(1, strValue3, interfaceC0526i.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    c0240b2.m442s(type, annotationArr3);
                                                    c0299m = new C0292F(1, strValue3, interfaceC0526i.allowUnsafeNonAsciiValues());
                                                }
                                                c0299m = c0295i;
                                            } else if (annotation instanceof InterfaceC0527j) {
                                                if (type == C1707q.class) {
                                                    c0299m = new C0294H(method, i12, 0);
                                                } else {
                                                    c0304s.m528c(i12, type);
                                                    Class clsM537h5 = AbstractC0315b0.m537h(type);
                                                    if (!Map.class.isAssignableFrom(clsM537h5)) {
                                                        throw AbstractC0315b0.m543n(method, i12, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeM538i2 = AbstractC0315b0.m538i(type, clsM537h5);
                                                    if (!(typeM538i2 instanceof ParameterizedType)) {
                                                        throw AbstractC0315b0.m543n(method, i12, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeM538i2;
                                                    Type typeM536g2 = AbstractC0315b0.m536g(0, parameterizedType2);
                                                    if (String.class != typeM536g2) {
                                                        throw AbstractC0315b0.m543n(method, i12, "@HeaderMap keys must be of type String: " + typeM536g2, new Object[0]);
                                                    }
                                                    c0240b2.m442s(AbstractC0315b0.m536g(1, parameterizedType2), annotationArr3);
                                                    c0299m = new C0293G(method, i12, ((InterfaceC0527j) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof InterfaceC0520c) {
                                                c0304s.m528c(i12, type);
                                                if (!c0304s.f997q) {
                                                    throw AbstractC0315b0.m543n(method, i12, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                InterfaceC0520c interfaceC0520c = (InterfaceC0520c) annotation;
                                                String strValue4 = interfaceC0520c.value();
                                                boolean zEncoded3 = interfaceC0520c.encoded();
                                                c0304s.f987g = true;
                                                Class clsM537h6 = AbstractC0315b0.m537h(type);
                                                if (Iterable.class.isAssignableFrom(clsM537h6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw AbstractC0315b0.m543n(method, i12, clsM537h6.getSimpleName() + " must include generic type (e.g., " + clsM537h6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c0240b2.m442s(AbstractC0315b0.m536g(0, (ParameterizedType) type), annotationArr3);
                                                    c0295i = new C0290D(new C0292F(0, strValue4, zEncoded3), 0);
                                                } else if (clsM537h6.isArray()) {
                                                    c0240b2.m442s(C0304S.m526a(clsM537h6.getComponentType()), annotationArr3);
                                                    c0295i = new C0290D(new C0292F(0, strValue4, zEncoded3), 1);
                                                } else {
                                                    c0240b2.m442s(type, annotationArr3);
                                                    c0299m = new C0292F(0, strValue4, zEncoded3);
                                                }
                                                c0299m = c0295i;
                                            } else if (annotation instanceof InterfaceC0521d) {
                                                c0304s.m528c(i12, type);
                                                if (!c0304s.f997q) {
                                                    throw AbstractC0315b0.m543n(method, i12, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsM537h7 = AbstractC0315b0.m537h(type);
                                                if (!Map.class.isAssignableFrom(clsM537h7)) {
                                                    throw AbstractC0315b0.m543n(method, i12, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM538i3 = AbstractC0315b0.m538i(type, clsM537h7);
                                                if (!(typeM538i3 instanceof ParameterizedType)) {
                                                    throw AbstractC0315b0.m543n(method, i12, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeM538i3;
                                                Type typeM536g3 = AbstractC0315b0.m536g(0, parameterizedType3);
                                                if (String.class != typeM536g3) {
                                                    throw AbstractC0315b0.m543n(method, i12, "@FieldMap keys must be of type String: " + typeM536g3, new Object[0]);
                                                }
                                                c0240b2.m442s(AbstractC0315b0.m536g(1, parameterizedType3), annotationArr3);
                                                c0304s.f987g = true;
                                                c0299m = new C0293G(method, i12, ((InterfaceC0521d) annotation).encoded(), 0);
                                            } else if (annotation instanceof InterfaceC0534q) {
                                                c0304s.m528c(i12, type);
                                                if (!c0304s.f998r) {
                                                    throw AbstractC0315b0.m543n(method, i12, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                InterfaceC0534q interfaceC0534q = (InterfaceC0534q) annotation;
                                                c0304s.f988h = true;
                                                String strValue5 = interfaceC0534q.value();
                                                Class clsM537h8 = AbstractC0315b0.m537h(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsM537h8);
                                                    C0298L c0298l = C0298L.f958d;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw AbstractC0315b0.m543n(method, i12, clsM537h8.getSimpleName() + " must include generic type (e.g., " + clsM537h8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!C1712v.class.isAssignableFrom(AbstractC0315b0.m537h(AbstractC0315b0.m536g(0, (ParameterizedType) type)))) {
                                                            throw AbstractC0315b0.m543n(method, i12, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        c0299m = new C0290D(c0298l, 0);
                                                    } else if (clsM537h8.isArray()) {
                                                        if (!C1712v.class.isAssignableFrom(clsM537h8.getComponentType())) {
                                                            throw AbstractC0315b0.m543n(method, i12, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        c0299m = new C0290D(c0298l, 1);
                                                    } else {
                                                        if (!C1712v.class.isAssignableFrom(clsM537h8)) {
                                                            throw AbstractC0315b0.m543n(method, i12, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        c0299m = c0298l;
                                                    }
                                                } else {
                                                    String[] strArr = {"Content-Disposition", AbstractC0231b.m400k("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", interfaceC0534q.encoding()};
                                                    C1707q c1707q = C1707q.f5858e;
                                                    C1707q c1707qM4179B = AbstractC2352g.m4179B(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsM537h8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw AbstractC0315b0.m543n(method, i12, clsM537h8.getSimpleName() + " must include generic type (e.g., " + clsM537h8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeM536g4 = AbstractC0315b0.m536g(0, (ParameterizedType) type);
                                                        if (C1712v.class.isAssignableFrom(AbstractC0315b0.m537h(typeM536g4))) {
                                                            throw AbstractC0315b0.m543n(method, i12, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c0290d = new C0290D(new C0295I(method, i12, c1707qM4179B, c0240b2.m439p(typeM536g4, annotationArr3, annotationArr)), 0);
                                                    } else if (clsM537h8.isArray()) {
                                                        Class clsM526a = C0304S.m526a(clsM537h8.getComponentType());
                                                        if (C1712v.class.isAssignableFrom(clsM526a)) {
                                                            throw AbstractC0315b0.m543n(method, i12, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c0290d = new C0290D(new C0295I(method, i12, c1707qM4179B, c0240b2.m439p(clsM526a, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (C1712v.class.isAssignableFrom(clsM537h8)) {
                                                            throw AbstractC0315b0.m543n(method, i12, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c0295i = new C0295I(method, i12, c1707qM4179B, c0240b2.m439p(type, annotationArr3, annotationArr));
                                                        c0299m = c0295i;
                                                    }
                                                    c0299m = c0290d;
                                                }
                                            } else if (annotation instanceof InterfaceC0535r) {
                                                c0304s.m528c(i12, type);
                                                if (!c0304s.f998r) {
                                                    throw AbstractC0315b0.m543n(method, i12, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                c0304s.f988h = true;
                                                Class clsM537h9 = AbstractC0315b0.m537h(type);
                                                if (!Map.class.isAssignableFrom(clsM537h9)) {
                                                    throw AbstractC0315b0.m543n(method, i12, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM538i4 = AbstractC0315b0.m538i(type, clsM537h9);
                                                if (!(typeM538i4 instanceof ParameterizedType)) {
                                                    throw AbstractC0315b0.m543n(method, i12, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeM538i4;
                                                Type typeM536g5 = AbstractC0315b0.m536g(0, parameterizedType4);
                                                if (String.class != typeM536g5) {
                                                    throw AbstractC0315b0.m543n(method, i12, "@PartMap keys must be of type String: " + typeM536g5, new Object[0]);
                                                }
                                                Type typeM536g6 = AbstractC0315b0.m536g(1, parameterizedType4);
                                                if (C1712v.class.isAssignableFrom(AbstractC0315b0.m537h(typeM536g6))) {
                                                    throw AbstractC0315b0.m543n(method, i12, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                c0299m = new C0295I(method, i12, c0240b2.m439p(typeM536g6, annotationArr3, annotationArr), ((InterfaceC0535r) annotation).encoding());
                                            } else if (annotation instanceof InterfaceC0518a) {
                                                c0304s.m528c(i12, type);
                                                if (c0304s.f997q || c0304s.f998r) {
                                                    throw AbstractC0315b0.m543n(method, i12, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (c0304s.f989i) {
                                                    throw AbstractC0315b0.m543n(method, i12, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    InterfaceC0327n interfaceC0327nM439p = c0240b2.m439p(type, annotationArr3, annotationArr);
                                                    c0304s.f989i = true;
                                                    c0299m = new C0291E(method, i12, interfaceC0327nM439p);
                                                } catch (RuntimeException e5) {
                                                    throw AbstractC0315b0.m544o(method, e5, i12, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof InterfaceC0541x) {
                                                c0304s.m528c(i12, type);
                                                Class clsM526a2 = C0304S.m526a(AbstractC0315b0.m537h(type));
                                                for (int i16 = i12 - 1; i16 >= 0; i16--) {
                                                    AbstractC0315b0 abstractC0315b03 = c0304s.f1003w[i16];
                                                    if ((abstractC0315b03 instanceof C0299M) && ((C0299M) abstractC0315b03).f959d.equals(clsM526a2)) {
                                                        throw AbstractC0315b0.m543n(method, i12, "@Tag type " + clsM526a2.getName() + " is duplicate of " + AbstractC0300N.f961b.mo516d(method, i16) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                c0299m = new C0299M(clsM526a2);
                                            } else {
                                                c0299m = null;
                                            }
                                        }
                                        str = str2;
                                    }
                                    if (c0299m != null) {
                                        if (abstractC0315b0 != null) {
                                            throw AbstractC0315b0.m543n(method, i12, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        abstractC0315b0 = c0299m;
                                    }
                                    i14 = i6 + 1;
                                    annotationArr2 = annotationArr4;
                                    i11 = i5;
                                    length2 = i15;
                                    i13 = i7;
                                    str2 = str;
                                    abstractC0315b0Arr2 = abstractC0315b0Arr;
                                    length3 = i8;
                                }
                            }
                            i6 = i14;
                            abstractC0315b0Arr = abstractC0315b0Arr2;
                            i7 = i13;
                            i8 = length3;
                            if (c0299m != null) {
                            }
                            i14 = i6 + 1;
                            annotationArr2 = annotationArr4;
                            i11 = i5;
                            length2 = i15;
                            i13 = i7;
                            str2 = str;
                            abstractC0315b0Arr2 = abstractC0315b0Arr;
                            length3 = i8;
                        }
                    } else {
                        abstractC0315b0 = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i17 = length2;
                    String str3 = str2;
                    int i18 = i11;
                    AbstractC0315b0[] abstractC0315b0Arr3 = abstractC0315b0Arr2;
                    int i19 = i13;
                    if (abstractC0315b0 == null) {
                        if (i19 != 0) {
                            try {
                                if (AbstractC0315b0.m537h(type) == InterfaceC1046d.class) {
                                    c0304s.f1004x = true;
                                    abstractC0315b0 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw AbstractC0315b0.m543n(method, i12, "No Retrofit annotation found.", new Object[0]);
                    }
                    abstractC0315b0Arr3[i12] = abstractC0315b0;
                    i12++;
                    annotationArr2 = annotationArr5;
                    i11 = i18;
                    length2 = i17;
                    str2 = str3;
                    i9 = 0;
                    abstractC0315b02 = null;
                }
                String str4 = str2;
                if (c0304s.f999s == null && !c0304s.f994n) {
                    throw AbstractC0315b0.m542m(method, null, "Missing either @%s URL or @Url parameter.", c0304s.f995o);
                }
                boolean z10 = c0304s.f997q;
                if (!z10 && !c0304s.f998r && !c0304s.f996p && c0304s.f989i) {
                    throw AbstractC0315b0.m542m(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z10 && !c0304s.f987g) {
                    throw AbstractC0315b0.m542m(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (c0304s.f998r && !c0304s.f988h) {
                    throw AbstractC0315b0.m542m(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                C0305T c0305t = new C0305T(c0304s);
                Type genericReturnType2 = method.getGenericReturnType();
                if (AbstractC0315b0.m539j(genericReturnType2)) {
                    throw AbstractC0315b0.m542m(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw AbstractC0315b0.m542m(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z11 = c0305t.f1016l;
                if (z11) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeM536g7 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeM536g7 instanceof WildcardType) {
                        typeM536g7 = ((WildcardType) typeM536g7).getLowerBounds()[0];
                    }
                    if (AbstractC0315b0.m537h(typeM536g7) == C0306U.class && (typeM536g7 instanceof ParameterizedType)) {
                        typeM536g7 = AbstractC0315b0.m536g(0, (ParameterizedType) typeM536g7);
                        z6 = true;
                        z7 = false;
                    } else {
                        if (AbstractC0315b0.m537h(typeM536g7) == InterfaceC0318e.class) {
                            throw AbstractC0315b0.m542m(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", AbstractC0315b0.m536g(0, (ParameterizedType) typeM536g7));
                        }
                        z7 = AbstractC0315b0.f1039b && typeM536g7 == C0891q.class;
                        z6 = false;
                    }
                    genericReturnType = new C0311Z(null, InterfaceC0318e.class, typeM536g7);
                    if (!AbstractC0315b0.m541l(annotations, InterfaceC0308W.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = C0309X.f1023a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z5 = z7;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z5 = false;
                    z6 = false;
                }
                try {
                    InterfaceC0320g interfaceC0320gM429f = c0240b.m429f(genericReturnType, annotations);
                    Type typeMo45n = interfaceC0320gM429f.mo45n();
                    if (typeMo45n == C1684F.class) {
                        throw AbstractC0315b0.m542m(method, null, "'" + AbstractC0315b0.m537h(typeMo45n).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeMo45n == C0306U.class) {
                        throw AbstractC0315b0.m542m(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (c0305t.f1008d.equals(str4) && !Void.class.equals(typeMo45n) && (!AbstractC0315b0.f1039b || typeMo45n != C0891q.class)) {
                        throw AbstractC0315b0.m542m(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        InterfaceC0327n interfaceC0327nM440q = c0240b.m440q(typeMo45n, method.getAnnotations());
                        InterfaceC1694d interfaceC1694d = (InterfaceC1694d) c0240b.f809b;
                        return !z11 ? new C0331r(c0305t, interfaceC1694d, interfaceC0327nM440q, interfaceC0320gM429f, 0) : z6 ? new C0331r(c0305t, interfaceC1694d, interfaceC0327nM440q, interfaceC0320gM429f, 1) : new C0332s(c0305t, interfaceC1694d, interfaceC0327nM440q, interfaceC0320gM429f, z5);
                    } catch (RuntimeException e6) {
                        throw AbstractC0315b0.m542m(method, e6, "Unable to create converter for %s", typeMo45n);
                    }
                } catch (RuntimeException e7) {
                    throw AbstractC0315b0.m542m(method, e7, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i10];
            if (annotation2 instanceof InterfaceC0519b) {
                c0304s.m527b("DELETE", ((InterfaceC0519b) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC0523f) {
                c0304s.m527b("GET", ((InterfaceC0523f) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC0524g) {
                c0304s.m527b("HEAD", ((InterfaceC0524g) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC0531n) {
                c0304s.m527b("PATCH", ((InterfaceC0531n) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC0532o) {
                c0304s.m527b("POST", ((InterfaceC0532o) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC0533p) {
                c0304s.m527b("PUT", ((InterfaceC0533p) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC0530m) {
                c0304s.m527b("OPTIONS", ((InterfaceC0530m) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC0525h) {
                InterfaceC0525h interfaceC0525h = (InterfaceC0525h) annotation2;
                c0304s.m527b(interfaceC0525h.method(), interfaceC0525h.path(), interfaceC0525h.hasBody());
            } else if (annotation2 instanceof InterfaceC0528k) {
                InterfaceC0528k interfaceC0528k = (InterfaceC0528k) annotation2;
                String[] strArrValue = interfaceC0528k.value();
                if (strArrValue.length == 0) {
                    throw AbstractC0315b0.m542m(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = interfaceC0528k.allowUnsafeNonAsciiValues();
                C1706p c1706p = new C1706p(0);
                int length4 = strArrValue.length;
                int i20 = 0;
                while (i20 < length4) {
                    String str5 = strArrValue[i20];
                    int iIndexOf = str5.indexOf(58);
                    boolean z12 = z8;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                        break loop0;
                    }
                    String strSubstring = str5.substring(0, iIndexOf);
                    String strTrim = str5.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            C1675t c1675t = C1711u.f5877d;
                            c0304s.f1001u = AbstractC0797o.m1390o(strTrim);
                        } catch (IllegalArgumentException e8) {
                            throw AbstractC0315b0.m542m(method, e8, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        AbstractC1665j.m2985e(strSubstring, "name");
                        AbstractC1665j.m2985e(strTrim, "value");
                        AbstractC1923e.m3446E(strSubstring);
                        c1706p.m3023b(strSubstring, strTrim);
                    } else {
                        c1706p.m3022a(strSubstring, strTrim);
                    }
                    i20++;
                    z8 = z12;
                }
                c0304s.f1000t = c1706p.m3024c();
            } else if (annotation2 instanceof InterfaceC0529l) {
                if (c0304s.f997q) {
                    throw AbstractC0315b0.m542m(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                c0304s.f998r = true;
            } else if (!(annotation2 instanceof InterfaceC0522e)) {
                continue;
            } else {
                if (c0304s.f998r) {
                    throw AbstractC0315b0.m542m(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                c0304s.f997q = true;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo552a(C0289C c0289c, Object[] objArr);
}
