package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ww0 {

    /* JADX INFO: renamed from: a */
    public final v82 f12695a;

    /* JADX INFO: renamed from: b */
    public final et1 f12696b;

    /* JADX INFO: renamed from: c */
    public final x00 f12697c;

    public ww0(v82 v82Var, et1 et1Var, x00 x00Var) {
        this.f12695a = v82Var;
        this.f12696b = et1Var;
        this.f12697c = x00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        throw p000.xe1.m6104V(r29, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:386:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0900 A[SYNTHETIC] */
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
    public static ww0 m6016b(C0093cj c0093cj, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        op0 op0Var;
        int i;
        op0[] op0VarArr;
        int i2;
        int i3;
        String str;
        op0 xw1Var;
        op0 cx1Var;
        xw1 xw1Var2;
        u82 u82Var = new u82(c0093cj, method);
        Annotation[] annotationArr = u82Var.f11134c;
        int length = annotationArr.length;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            String str2 = "HEAD";
            boolean z4 = true;
            op0 op0Var2 = null;
            if (i5 >= length) {
                if (u82Var.f11145n == null) {
                    throw xe1.m6104V(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!u82Var.f11146o) {
                    if (u82Var.f11148q) {
                        throw xe1.m6104V(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (u82Var.f11147p) {
                        throw xe1.m6104V(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = u82Var.f11135d;
                int length2 = annotationArr2.length;
                u82Var.f11153v = new op0[length2];
                int i6 = length2 - 1;
                int i7 = 0;
                while (i7 < length2) {
                    op0[] op0VarArr2 = u82Var.f11153v;
                    Type type = u82Var.f11136e[i7];
                    Annotation[] annotationArr3 = annotationArr2[i7];
                    int i8 = i7 == i6 ? 1 : i4;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        op0Var = op0Var2;
                        int i9 = i4;
                        while (i9 < length3) {
                            Annotation annotation = annotationArr3[i9];
                            Annotation[][] annotationArr4 = annotationArr2;
                            op0 gx1Var = fx1.f3162h;
                            int i10 = length2;
                            int i11 = i6;
                            if (annotation instanceof u83) {
                                u82Var.m5474c(i7, type);
                                if (u82Var.f11144m) {
                                    throw xe1.m6110a0(method, i7, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (u82Var.f11140i) {
                                    throw xe1.m6110a0(method, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (u82Var.f11141j) {
                                    throw xe1.m6110a0(method, i7, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (u82Var.f11142k) {
                                    throw xe1.m6110a0(method, i7, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (u82Var.f11143l) {
                                    throw xe1.m6110a0(method, i7, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (u82Var.f11149r != null) {
                                    throw xe1.m6110a0(method, i7, "@Url cannot be used with @%s URL", u82Var.f11145n);
                                }
                                u82Var.f11144m = true;
                                if (type != yw0.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw xe1.m6110a0(method, i7, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                xw1Var = new bx1(method, i7, 1);
                                str = str2;
                                i = i9;
                            } else {
                                i = i9;
                                boolean z5 = annotation instanceof vx1;
                                C0093cj c0093cj2 = u82Var.f11132a;
                                if (z5) {
                                    u82Var.m5474c(i7, type);
                                    if (u82Var.f11141j) {
                                        throw xe1.m6110a0(method, i7, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (u82Var.f11142k) {
                                        throw xe1.m6110a0(method, i7, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (u82Var.f11143l) {
                                        throw xe1.m6110a0(method, i7, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (u82Var.f11144m) {
                                        throw xe1.m6110a0(method, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (u82Var.f11149r == null) {
                                        throw xe1.m6110a0(method, i7, "@Path can only be used with relative url on @%s", u82Var.f11145n);
                                    }
                                    u82Var.f11140i = true;
                                    vx1 vx1Var = (vx1) annotation;
                                    String strValue = vx1Var.value();
                                    if (!u82.f11131y.matcher(strValue).matches()) {
                                        throw xe1.m6110a0(method, i7, "@Path parameter name must match %s. Found: %s", u82.f11130x.pattern(), strValue);
                                    }
                                    if (!u82Var.f11152u.contains(strValue)) {
                                        throw xe1.m6110a0(method, i7, "URL \"%s\" does not contain \"{%s}\".", u82Var.f11149r, strValue);
                                    }
                                    c0093cj2.m843r(type, annotationArr3);
                                    xw1Var = new dx1(u82Var.f11133b, i7, strValue, vx1Var.encoded());
                                    str = str2;
                                } else {
                                    op0VarArr = op0VarArr2;
                                    i2 = i8;
                                    if (annotation instanceof p42) {
                                        u82Var.m5474c(i7, type);
                                        p42 p42Var = (p42) annotation;
                                        String strValue2 = p42Var.value();
                                        boolean zEncoded = p42Var.encoded();
                                        Class clsM6086D = xe1.m6086D(type);
                                        i3 = length3;
                                        u82Var.f11141j = true;
                                        if (Iterable.class.isAssignableFrom(clsM6086D)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw xe1.m6110a0(method, i7, clsM6086D.getSimpleName() + " must include generic type (e.g., " + clsM6086D.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            c0093cj2.m843r(xe1.m6085C(0, (ParameterizedType) type), annotationArr3);
                                            xw1Var2 = new xw1(new zw1(2, strValue2, zEncoded), 0);
                                        } else if (clsM6086D.isArray()) {
                                            c0093cj2.m843r(u82.m5472a(clsM6086D.getComponentType()), annotationArr3);
                                            xw1Var2 = new xw1(new zw1(2, strValue2, zEncoded), 1);
                                        } else {
                                            c0093cj2.m843r(type, annotationArr3);
                                            xw1Var = new zw1(2, strValue2, zEncoded);
                                            str = str2;
                                        }
                                        xw1Var = xw1Var2;
                                        str = str2;
                                    } else {
                                        i3 = length3;
                                        if (annotation instanceof r42) {
                                            u82Var.m5474c(i7, type);
                                            boolean zEncoded2 = ((r42) annotation).encoded();
                                            Class clsM6086D2 = xe1.m6086D(type);
                                            u82Var.f11142k = true;
                                            if (Iterable.class.isAssignableFrom(clsM6086D2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw xe1.m6110a0(method, i7, clsM6086D2.getSimpleName() + " must include generic type (e.g., " + clsM6086D2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                c0093cj2.m843r(xe1.m6085C(0, (ParameterizedType) type), annotationArr3);
                                                xw1Var2 = new xw1(new ex1(zEncoded2), 0);
                                            } else if (clsM6086D2.isArray()) {
                                                c0093cj2.m843r(u82.m5472a(clsM6086D2.getComponentType()), annotationArr3);
                                                xw1Var2 = new xw1(new ex1(zEncoded2), 1);
                                            } else {
                                                c0093cj2.m843r(type, annotationArr3);
                                                xw1Var = new ex1(zEncoded2);
                                                str = str2;
                                            }
                                            xw1Var = xw1Var2;
                                            str = str2;
                                        } else {
                                            str = str2;
                                            if (annotation instanceof q42) {
                                                u82Var.m5474c(i7, type);
                                                Class clsM6086D3 = xe1.m6086D(type);
                                                u82Var.f11143l = true;
                                                if (!Map.class.isAssignableFrom(clsM6086D3)) {
                                                    throw xe1.m6110a0(method, i7, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM6087E = xe1.m6087E(type, clsM6086D3);
                                                if (!(typeM6087E instanceof ParameterizedType)) {
                                                    throw xe1.m6110a0(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeM6087E;
                                                Type typeM6085C = xe1.m6085C(0, parameterizedType);
                                                if (String.class != typeM6085C) {
                                                    throw xe1.m6110a0(method, i7, "@QueryMap keys must be of type String: " + typeM6085C, new Object[0]);
                                                }
                                                c0093cj2.m843r(xe1.m6085C(1, parameterizedType), annotationArr3);
                                                gx1Var = new ax1(method, i7, ((q42) annotation).encoded(), 2);
                                            } else if (annotation instanceof fs0) {
                                                u82Var.m5474c(i7, type);
                                                fs0 fs0Var = (fs0) annotation;
                                                String strValue3 = fs0Var.value();
                                                Class clsM6086D4 = xe1.m6086D(type);
                                                if (Iterable.class.isAssignableFrom(clsM6086D4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw xe1.m6110a0(method, i7, clsM6086D4.getSimpleName() + " must include generic type (e.g., " + clsM6086D4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c0093cj2.m843r(xe1.m6085C(0, (ParameterizedType) type), annotationArr3);
                                                    xw1Var = new xw1(new zw1(1, strValue3, fs0Var.allowUnsafeNonAsciiValues()), 0);
                                                } else if (clsM6086D4.isArray()) {
                                                    c0093cj2.m843r(u82.m5472a(clsM6086D4.getComponentType()), annotationArr3);
                                                    xw1Var = new xw1(new zw1(1, strValue3, fs0Var.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    c0093cj2.m843r(type, annotationArr3);
                                                    gx1Var = new zw1(1, strValue3, fs0Var.allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof is0) {
                                                if (type == js0.class) {
                                                    xw1Var = new bx1(method, i7, 0);
                                                } else {
                                                    u82Var.m5474c(i7, type);
                                                    Class clsM6086D5 = xe1.m6086D(type);
                                                    if (!Map.class.isAssignableFrom(clsM6086D5)) {
                                                        throw xe1.m6110a0(method, i7, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeM6087E2 = xe1.m6087E(type, clsM6086D5);
                                                    if (!(typeM6087E2 instanceof ParameterizedType)) {
                                                        throw xe1.m6110a0(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeM6087E2;
                                                    Type typeM6085C2 = xe1.m6085C(0, parameterizedType2);
                                                    if (String.class != typeM6085C2) {
                                                        throw xe1.m6110a0(method, i7, "@HeaderMap keys must be of type String: " + typeM6085C2, new Object[0]);
                                                    }
                                                    c0093cj2.m843r(xe1.m6085C(1, parameterizedType2), annotationArr3);
                                                    xw1Var = new ax1(method, i7, ((is0) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof fi0) {
                                                u82Var.m5474c(i7, type);
                                                if (!u82Var.f11147p) {
                                                    throw xe1.m6110a0(method, i7, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                fi0 fi0Var = (fi0) annotation;
                                                String strValue4 = fi0Var.value();
                                                boolean zEncoded3 = fi0Var.encoded();
                                                u82Var.f11137f = true;
                                                Class clsM6086D6 = xe1.m6086D(type);
                                                if (Iterable.class.isAssignableFrom(clsM6086D6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw xe1.m6110a0(method, i7, clsM6086D6.getSimpleName() + " must include generic type (e.g., " + clsM6086D6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c0093cj2.m843r(xe1.m6085C(0, (ParameterizedType) type), annotationArr3);
                                                    xw1Var = new xw1(new zw1(0, strValue4, zEncoded3), 0);
                                                } else if (clsM6086D6.isArray()) {
                                                    c0093cj2.m843r(u82.m5472a(clsM6086D6.getComponentType()), annotationArr3);
                                                    xw1Var = new xw1(new zw1(0, strValue4, zEncoded3), 1);
                                                } else {
                                                    c0093cj2.m843r(type, annotationArr3);
                                                    cx1Var = new zw1(0, strValue4, zEncoded3);
                                                    xw1Var = cx1Var;
                                                }
                                            } else if (annotation instanceof oi0) {
                                                u82Var.m5474c(i7, type);
                                                if (!u82Var.f11147p) {
                                                    throw xe1.m6110a0(method, i7, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsM6086D7 = xe1.m6086D(type);
                                                if (!Map.class.isAssignableFrom(clsM6086D7)) {
                                                    throw xe1.m6110a0(method, i7, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM6087E3 = xe1.m6087E(type, clsM6086D7);
                                                if (!(typeM6087E3 instanceof ParameterizedType)) {
                                                    throw xe1.m6110a0(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeM6087E3;
                                                int i12 = 0;
                                                Type typeM6085C3 = xe1.m6085C(0, parameterizedType3);
                                                if (String.class != typeM6085C3) {
                                                    throw xe1.m6110a0(method, i7, "@FieldMap keys must be of type String: " + typeM6085C3, new Object[0]);
                                                }
                                                c0093cj2.m843r(xe1.m6085C(1, parameterizedType3), annotationArr3);
                                                u82Var.f11137f = true;
                                                xw1Var = new ax1(method, i7, ((oi0) annotation).encoded(), i12);
                                            } else if (annotation instanceof qx1) {
                                                u82Var.m5474c(i7, type);
                                                if (!u82Var.f11148q) {
                                                    throw xe1.m6110a0(method, i7, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                qx1 qx1Var = (qx1) annotation;
                                                u82Var.f11138g = true;
                                                String strValue5 = qx1Var.value();
                                                Class clsM6086D8 = xe1.m6086D(type);
                                                if (!strValue5.isEmpty()) {
                                                    String[] strArr = {"Content-Disposition", vi0.m5691j("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qx1Var.encoding()};
                                                    js0 js0Var = js0.f5193i;
                                                    js0 js0VarM791P = ci0.m791P(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsM6086D8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw xe1.m6110a0(method, i7, clsM6086D8.getSimpleName() + " must include generic type (e.g., " + clsM6086D8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeM6085C4 = xe1.m6085C(0, (ParameterizedType) type);
                                                        if (tj1.class.isAssignableFrom(xe1.m6086D(typeM6085C4))) {
                                                            throw xe1.m6110a0(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        xw1Var = new xw1(new cx1(method, i7, js0VarM791P, c0093cj2.m840o(typeM6085C4, annotationArr3, annotationArr)), 0);
                                                    } else if (clsM6086D8.isArray()) {
                                                        Class clsM5472a = u82.m5472a(clsM6086D8.getComponentType());
                                                        if (tj1.class.isAssignableFrom(clsM5472a)) {
                                                            throw xe1.m6110a0(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        xw1Var = new xw1(new cx1(method, i7, js0VarM791P, c0093cj2.m840o(clsM5472a, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (tj1.class.isAssignableFrom(clsM6086D8)) {
                                                            throw xe1.m6110a0(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        cx1Var = new cx1(method, i7, js0VarM791P, c0093cj2.m840o(type, annotationArr3, annotationArr));
                                                        xw1Var = cx1Var;
                                                    }
                                                } else if (Iterable.class.isAssignableFrom(clsM6086D8)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw xe1.m6110a0(method, i7, clsM6086D8.getSimpleName() + " must include generic type (e.g., " + clsM6086D8.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    if (!tj1.class.isAssignableFrom(xe1.m6086D(xe1.m6085C(0, (ParameterizedType) type)))) {
                                                        throw xe1.m6110a0(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                    xw1Var = new xw1(gx1Var, 0);
                                                } else if (clsM6086D8.isArray()) {
                                                    if (!tj1.class.isAssignableFrom(clsM6086D8.getComponentType())) {
                                                        throw xe1.m6110a0(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                    xw1Var = new xw1(gx1Var, 1);
                                                } else if (!tj1.class.isAssignableFrom(clsM6086D8)) {
                                                    throw xe1.m6110a0(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                            } else if (annotation instanceof rx1) {
                                                u82Var.m5474c(i7, type);
                                                if (!u82Var.f11148q) {
                                                    throw xe1.m6110a0(method, i7, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                u82Var.f11138g = true;
                                                Class clsM6086D9 = xe1.m6086D(type);
                                                if (!Map.class.isAssignableFrom(clsM6086D9)) {
                                                    throw xe1.m6110a0(method, i7, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM6087E4 = xe1.m6087E(type, clsM6086D9);
                                                if (!(typeM6087E4 instanceof ParameterizedType)) {
                                                    throw xe1.m6110a0(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeM6087E4;
                                                Type typeM6085C5 = xe1.m6085C(0, parameterizedType4);
                                                if (String.class != typeM6085C5) {
                                                    throw xe1.m6110a0(method, i7, "@PartMap keys must be of type String: " + typeM6085C5, new Object[0]);
                                                }
                                                Type typeM6085C6 = xe1.m6085C(1, parameterizedType4);
                                                if (tj1.class.isAssignableFrom(xe1.m6086D(typeM6085C6))) {
                                                    throw xe1.m6110a0(method, i7, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                gx1Var = new cx1(method, i7, c0093cj2.m840o(typeM6085C6, annotationArr3, annotationArr), ((rx1) annotation).encoding());
                                            } else if (annotation instanceof InterfaceC0317il) {
                                                u82Var.m5474c(i7, type);
                                                if (u82Var.f11147p || u82Var.f11148q) {
                                                    throw xe1.m6110a0(method, i7, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (u82Var.f11139h) {
                                                    throw xe1.m6110a0(method, i7, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    x00 x00VarM840o = c0093cj2.m840o(type, annotationArr3, annotationArr);
                                                    u82Var.f11139h = true;
                                                    gx1Var = new yw1(method, i7, x00VarM840o);
                                                } catch (RuntimeException e) {
                                                    throw xe1.m6112b0(method, e, i7, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof px2) {
                                                u82Var.m5474c(i7, type);
                                                Class clsM5472a2 = u82.m5472a(xe1.m6086D(type));
                                                for (int i13 = i7 - 1; i13 >= 0; i13--) {
                                                    op0 op0Var3 = u82Var.f11153v[i13];
                                                    if ((op0Var3 instanceof gx1) && ((gx1) op0Var3).f3734h.equals(clsM5472a2)) {
                                                        throw xe1.m6110a0(method, i7, "@Tag type " + clsM5472a2.getName() + " is duplicate of " + yz1.f13683b.mo659l(method, i13) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                gx1Var = new gx1(clsM5472a2);
                                            } else {
                                                xw1Var = null;
                                            }
                                            xw1Var = gx1Var;
                                        }
                                    }
                                    if (xw1Var != null) {
                                        if (op0Var != null) {
                                            throw xe1.m6110a0(method, i7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        op0Var = xw1Var;
                                    }
                                    i9 = i + 1;
                                    annotationArr2 = annotationArr4;
                                    length2 = i10;
                                    i6 = i11;
                                    length3 = i3;
                                    op0VarArr2 = op0VarArr;
                                    i8 = i2;
                                    str2 = str;
                                }
                            }
                            op0VarArr = op0VarArr2;
                            i2 = i8;
                            i3 = length3;
                            if (xw1Var != null) {
                            }
                            i9 = i + 1;
                            annotationArr2 = annotationArr4;
                            length2 = i10;
                            i6 = i11;
                            length3 = i3;
                            op0VarArr2 = op0VarArr;
                            i8 = i2;
                            str2 = str;
                        }
                    } else {
                        op0Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i14 = length2;
                    String str3 = str2;
                    int i15 = i6;
                    op0[] op0VarArr3 = op0VarArr2;
                    int i16 = i8;
                    if (op0Var == null) {
                        if (i16 != 0) {
                            try {
                                if (xe1.m6086D(type) == t00.class) {
                                    u82Var.f11154w = true;
                                    op0Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw xe1.m6110a0(method, i7, "No Retrofit annotation found.", new Object[0]);
                    }
                    op0VarArr3[i7] = op0Var;
                    i7++;
                    annotationArr2 = annotationArr5;
                    length2 = i14;
                    i6 = i15;
                    str2 = str3;
                    i4 = 0;
                    op0Var2 = null;
                }
                String str4 = str2;
                if (u82Var.f11149r == null && !u82Var.f11144m) {
                    throw xe1.m6104V(method, null, "Missing either @%s URL or @Url parameter.", u82Var.f11145n);
                }
                boolean z6 = u82Var.f11147p;
                if (!z6 && !u82Var.f11148q && !u82Var.f11146o && u82Var.f11139h) {
                    throw xe1.m6104V(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !u82Var.f11137f) {
                    throw xe1.m6104V(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (u82Var.f11148q && !u82Var.f11138g) {
                    throw xe1.m6104V(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                v82 v82Var = new v82(u82Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (xe1.m6088F(genericReturnType2)) {
                    throw xe1.m6104V(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw xe1.m6104V(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = v82Var.f11843k;
                if (z7) {
                    Type typeM6085C7 = ((ParameterizedType) method.getGenericParameterTypes()[r6.length - 1]).getActualTypeArguments()[0];
                    if (typeM6085C7 instanceof WildcardType) {
                        typeM6085C7 = ((WildcardType) typeM6085C7).getLowerBounds()[0];
                    }
                    if (xe1.m6086D(typeM6085C7) == q92.class && (typeM6085C7 instanceof ParameterizedType)) {
                        typeM6085C7 = xe1.m6085C(0, (ParameterizedType) typeM6085C7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (xe1.m6086D(typeM6085C7) == InterfaceC0854wo.class) {
                            throw xe1.m6104V(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", xe1.m6085C(0, (ParameterizedType) typeM6085C7));
                        }
                        z3 = xe1.f12999h && typeM6085C7 == a83.class;
                        z2 = false;
                    }
                    genericReturnType = new e93(null, InterfaceC0854wo.class, typeM6085C7);
                    if (!xe1.m6092J(annotations, mr2.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = nr2.f7306a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    InterfaceC0930yo interfaceC0930yoM831f = c0093cj.m831f(genericReturnType, annotations);
                    Type typeMo2577e = interfaceC0930yoM831f.mo2577e();
                    if (typeMo2577e == r92.class) {
                        throw xe1.m6104V(method, null, "'" + xe1.m6086D(typeMo2577e).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeMo2577e == q92.class) {
                        throw xe1.m6104V(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (v82Var.f11835c.equals(str4) && !Void.class.equals(typeMo2577e) && (!xe1.f12999h || typeMo2577e != a83.class)) {
                        throw xe1.m6104V(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        x00 x00VarM841p = c0093cj.m841p(typeMo2577e, method.getAnnotations());
                        et1 et1Var = (et1) c0093cj.f1580b;
                        return !z7 ? new uw0(v82Var, et1Var, x00VarM841p, interfaceC0930yoM831f, 0) : z2 ? new uw0(v82Var, et1Var, x00VarM841p, interfaceC0930yoM831f, 1) : new vw0(v82Var, et1Var, x00VarM841p, interfaceC0930yoM831f, z);
                    } catch (RuntimeException e2) {
                        throw xe1.m6104V(method, e2, "Unable to create converter for %s", typeMo2577e);
                    }
                } catch (RuntimeException e3) {
                    throw xe1.m6104V(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i5];
            if (annotation2 instanceof z30) {
                u82Var.m5473b("DELETE", ((z30) annotation2).value(), false);
            } else if (annotation2 instanceof zn0) {
                u82Var.m5473b("GET", ((zn0) annotation2).value(), false);
            } else if (annotation2 instanceof pr0) {
                u82Var.m5473b("HEAD", ((pr0) annotation2).value(), false);
            } else if (annotation2 instanceof cw1) {
                u82Var.m5473b("PATCH", ((cw1) annotation2).value(), true);
            } else if (annotation2 instanceof dw1) {
                u82Var.m5473b("POST", ((dw1) annotation2).value(), true);
            } else if (annotation2 instanceof ew1) {
                u82Var.m5473b("PUT", ((ew1) annotation2).value(), true);
            } else if (annotation2 instanceof ds1) {
                u82Var.m5473b("OPTIONS", ((ds1) annotation2).value(), false);
            } else if (annotation2 instanceof qr0) {
                qr0 qr0Var = (qr0) annotation2;
                u82Var.m5473b(qr0Var.method(), qr0Var.path(), qr0Var.hasBody());
            } else if (annotation2 instanceof ks0) {
                ks0 ks0Var = (ks0) annotation2;
                String[] strArrValue = ks0Var.value();
                if (strArrValue.length == 0) {
                    throw xe1.m6104V(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = ks0Var.allowUnsafeNonAsciiValues();
                ye0 ye0Var = new ye0(1);
                int length4 = strArrValue.length;
                int i17 = 0;
                while (i17 < length4) {
                    String str5 = strArrValue[i17];
                    int iIndexOf = str5.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                        break loop0;
                    }
                    String strSubstring = str5.substring(0, iIndexOf);
                    String strTrim = str5.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            o72 o72Var = vf1.f11926d;
                            u82Var.f11151t = AbstractC0731te.m5175C(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw xe1.m6104V(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        strTrim.getClass();
                        n93.m3262c(strSubstring);
                        n93.m3260a(ye0Var, strSubstring, strTrim);
                    } else {
                        ye0Var.m6249a(strSubstring, strTrim);
                    }
                    i17++;
                    z4 = z8;
                }
                u82Var.f11150s = ye0Var.m6250b();
            } else if (annotation2 instanceof sj1) {
                if (u82Var.f11147p) {
                    throw xe1.m6104V(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                u82Var.f11148q = true;
            } else if (!(annotation2 instanceof qm0)) {
                continue;
            } else {
                if (u82Var.f11148q) {
                    throw xe1.m6104V(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                u82Var.f11147p = true;
            }
            i5++;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo5587a(ct1 ct1Var, Object[] objArr);
}
