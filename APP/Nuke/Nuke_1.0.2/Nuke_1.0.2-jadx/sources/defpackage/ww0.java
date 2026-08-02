package defpackage;

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
    public final v82 a;
    public final et1 b;
    public final x00 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ww0(v82 v82Var, et1 et1Var, x00 x00Var) {
        this.a = v82Var;
        this.b = et1Var;
        this.c = x00Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        throw defpackage.xe1.V(r29, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r14);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ww0 b(cj cjVar, Method method) {
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
        u82 u82Var = new u82(cjVar, method);
        Annotation[] annotationArr = u82Var.c;
        int length = annotationArr.length;
        int i4 = 0;
        int i5 = 0;
        loop0: while (true) {
            String str2 = "HEAD";
            boolean z4 = true;
            op0 op0Var2 = null;
            if (i5 >= length) {
                if (u82Var.n == null) {
                    throw xe1.V(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!u82Var.o) {
                    if (u82Var.q) {
                        throw xe1.V(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (u82Var.p) {
                        throw xe1.V(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = u82Var.d;
                int length2 = annotationArr2.length;
                u82Var.v = new op0[length2];
                int i6 = length2 - 1;
                int i7 = 0;
                while (i7 < length2) {
                    op0[] op0VarArr2 = u82Var.v;
                    Type type = u82Var.e[i7];
                    Annotation[] annotationArr3 = annotationArr2[i7];
                    int i8 = i7 == i6 ? 1 : i4;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        op0Var = op0Var2;
                        int i9 = i4;
                        while (i9 < length3) {
                            Annotation annotation = annotationArr3[i9];
                            Annotation[][] annotationArr4 = annotationArr2;
                            op0 gx1Var = fx1.h;
                            int i10 = length2;
                            int i11 = i6;
                            if (annotation instanceof u83) {
                                u82Var.c(i7, type);
                                if (u82Var.m) {
                                    throw xe1.a0(method, i7, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (u82Var.i) {
                                    throw xe1.a0(method, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (u82Var.j) {
                                    throw xe1.a0(method, i7, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (u82Var.k) {
                                    throw xe1.a0(method, i7, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (u82Var.l) {
                                    throw xe1.a0(method, i7, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (u82Var.r != null) {
                                    throw xe1.a0(method, i7, "@Url cannot be used with @%s URL", u82Var.n);
                                }
                                u82Var.m = true;
                                if (type != yw0.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw xe1.a0(method, i7, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                xw1Var = new bx1(method, i7, 1);
                                str = str2;
                                i = i9;
                            } else {
                                i = i9;
                                boolean z5 = annotation instanceof vx1;
                                cj cjVar2 = u82Var.a;
                                if (z5) {
                                    u82Var.c(i7, type);
                                    if (u82Var.j) {
                                        throw xe1.a0(method, i7, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (u82Var.k) {
                                        throw xe1.a0(method, i7, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (u82Var.l) {
                                        throw xe1.a0(method, i7, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (u82Var.m) {
                                        throw xe1.a0(method, i7, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (u82Var.r == null) {
                                        throw xe1.a0(method, i7, "@Path can only be used with relative url on @%s", u82Var.n);
                                    }
                                    u82Var.i = true;
                                    vx1 vx1Var = (vx1) annotation;
                                    String strValue = vx1Var.value();
                                    if (!u82.y.matcher(strValue).matches()) {
                                        throw xe1.a0(method, i7, "@Path parameter name must match %s. Found: %s", u82.x.pattern(), strValue);
                                    }
                                    if (!u82Var.u.contains(strValue)) {
                                        throw xe1.a0(method, i7, "URL \"%s\" does not contain \"{%s}\".", u82Var.r, strValue);
                                    }
                                    cjVar2.r(type, annotationArr3);
                                    xw1Var = new dx1(u82Var.b, i7, strValue, vx1Var.encoded());
                                    str = str2;
                                } else {
                                    op0VarArr = op0VarArr2;
                                    i2 = i8;
                                    if (annotation instanceof p42) {
                                        u82Var.c(i7, type);
                                        p42 p42Var = (p42) annotation;
                                        String strValue2 = p42Var.value();
                                        boolean zEncoded = p42Var.encoded();
                                        Class clsD = xe1.D(type);
                                        i3 = length3;
                                        u82Var.j = true;
                                        if (Iterable.class.isAssignableFrom(clsD)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw xe1.a0(method, i7, clsD.getSimpleName() + " must include generic type (e.g., " + clsD.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            cjVar2.r(xe1.C(0, (ParameterizedType) type), annotationArr3);
                                            xw1Var2 = new xw1(new zw1(2, strValue2, zEncoded), 0);
                                        } else if (clsD.isArray()) {
                                            cjVar2.r(u82.a(clsD.getComponentType()), annotationArr3);
                                            xw1Var2 = new xw1(new zw1(2, strValue2, zEncoded), 1);
                                        } else {
                                            cjVar2.r(type, annotationArr3);
                                            xw1Var = new zw1(2, strValue2, zEncoded);
                                            str = str2;
                                        }
                                        xw1Var = xw1Var2;
                                        str = str2;
                                    } else {
                                        i3 = length3;
                                        if (annotation instanceof r42) {
                                            u82Var.c(i7, type);
                                            boolean zEncoded2 = ((r42) annotation).encoded();
                                            Class clsD2 = xe1.D(type);
                                            u82Var.k = true;
                                            if (Iterable.class.isAssignableFrom(clsD2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw xe1.a0(method, i7, clsD2.getSimpleName() + " must include generic type (e.g., " + clsD2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                cjVar2.r(xe1.C(0, (ParameterizedType) type), annotationArr3);
                                                xw1Var2 = new xw1(new ex1(zEncoded2), 0);
                                            } else if (clsD2.isArray()) {
                                                cjVar2.r(u82.a(clsD2.getComponentType()), annotationArr3);
                                                xw1Var2 = new xw1(new ex1(zEncoded2), 1);
                                            } else {
                                                cjVar2.r(type, annotationArr3);
                                                xw1Var = new ex1(zEncoded2);
                                                str = str2;
                                            }
                                            xw1Var = xw1Var2;
                                            str = str2;
                                        } else {
                                            str = str2;
                                            if (annotation instanceof q42) {
                                                u82Var.c(i7, type);
                                                Class clsD3 = xe1.D(type);
                                                u82Var.l = true;
                                                if (!Map.class.isAssignableFrom(clsD3)) {
                                                    throw xe1.a0(method, i7, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeE = xe1.E(type, clsD3);
                                                if (!(typeE instanceof ParameterizedType)) {
                                                    throw xe1.a0(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType = (ParameterizedType) typeE;
                                                Type typeC = xe1.C(0, parameterizedType);
                                                if (String.class != typeC) {
                                                    throw xe1.a0(method, i7, "@QueryMap keys must be of type String: " + typeC, new Object[0]);
                                                }
                                                cjVar2.r(xe1.C(1, parameterizedType), annotationArr3);
                                                gx1Var = new ax1(method, i7, ((q42) annotation).encoded(), 2);
                                            } else if (annotation instanceof fs0) {
                                                u82Var.c(i7, type);
                                                fs0 fs0Var = (fs0) annotation;
                                                String strValue3 = fs0Var.value();
                                                Class clsD4 = xe1.D(type);
                                                if (Iterable.class.isAssignableFrom(clsD4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw xe1.a0(method, i7, clsD4.getSimpleName() + " must include generic type (e.g., " + clsD4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    cjVar2.r(xe1.C(0, (ParameterizedType) type), annotationArr3);
                                                    xw1Var = new xw1(new zw1(1, strValue3, fs0Var.allowUnsafeNonAsciiValues()), 0);
                                                } else if (clsD4.isArray()) {
                                                    cjVar2.r(u82.a(clsD4.getComponentType()), annotationArr3);
                                                    xw1Var = new xw1(new zw1(1, strValue3, fs0Var.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    cjVar2.r(type, annotationArr3);
                                                    gx1Var = new zw1(1, strValue3, fs0Var.allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof is0) {
                                                if (type == js0.class) {
                                                    xw1Var = new bx1(method, i7, 0);
                                                } else {
                                                    u82Var.c(i7, type);
                                                    Class clsD5 = xe1.D(type);
                                                    if (!Map.class.isAssignableFrom(clsD5)) {
                                                        throw xe1.a0(method, i7, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeE2 = xe1.E(type, clsD5);
                                                    if (!(typeE2 instanceof ParameterizedType)) {
                                                        throw xe1.a0(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeE2;
                                                    Type typeC2 = xe1.C(0, parameterizedType2);
                                                    if (String.class != typeC2) {
                                                        throw xe1.a0(method, i7, "@HeaderMap keys must be of type String: " + typeC2, new Object[0]);
                                                    }
                                                    cjVar2.r(xe1.C(1, parameterizedType2), annotationArr3);
                                                    xw1Var = new ax1(method, i7, ((is0) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof fi0) {
                                                u82Var.c(i7, type);
                                                if (!u82Var.p) {
                                                    throw xe1.a0(method, i7, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                fi0 fi0Var = (fi0) annotation;
                                                String strValue4 = fi0Var.value();
                                                boolean zEncoded3 = fi0Var.encoded();
                                                u82Var.f = true;
                                                Class clsD6 = xe1.D(type);
                                                if (Iterable.class.isAssignableFrom(clsD6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw xe1.a0(method, i7, clsD6.getSimpleName() + " must include generic type (e.g., " + clsD6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    cjVar2.r(xe1.C(0, (ParameterizedType) type), annotationArr3);
                                                    xw1Var = new xw1(new zw1(0, strValue4, zEncoded3), 0);
                                                } else if (clsD6.isArray()) {
                                                    cjVar2.r(u82.a(clsD6.getComponentType()), annotationArr3);
                                                    xw1Var = new xw1(new zw1(0, strValue4, zEncoded3), 1);
                                                } else {
                                                    cjVar2.r(type, annotationArr3);
                                                    cx1Var = new zw1(0, strValue4, zEncoded3);
                                                    xw1Var = cx1Var;
                                                }
                                            } else if (annotation instanceof oi0) {
                                                u82Var.c(i7, type);
                                                if (!u82Var.p) {
                                                    throw xe1.a0(method, i7, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsD7 = xe1.D(type);
                                                if (!Map.class.isAssignableFrom(clsD7)) {
                                                    throw xe1.a0(method, i7, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeE3 = xe1.E(type, clsD7);
                                                if (!(typeE3 instanceof ParameterizedType)) {
                                                    throw xe1.a0(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeE3;
                                                int i12 = 0;
                                                Type typeC3 = xe1.C(0, parameterizedType3);
                                                if (String.class != typeC3) {
                                                    throw xe1.a0(method, i7, "@FieldMap keys must be of type String: " + typeC3, new Object[0]);
                                                }
                                                cjVar2.r(xe1.C(1, parameterizedType3), annotationArr3);
                                                u82Var.f = true;
                                                xw1Var = new ax1(method, i7, ((oi0) annotation).encoded(), i12);
                                            } else if (annotation instanceof qx1) {
                                                u82Var.c(i7, type);
                                                if (!u82Var.q) {
                                                    throw xe1.a0(method, i7, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                qx1 qx1Var = (qx1) annotation;
                                                u82Var.g = true;
                                                String strValue5 = qx1Var.value();
                                                Class clsD8 = xe1.D(type);
                                                if (!strValue5.isEmpty()) {
                                                    String[] strArr = {"Content-Disposition", vi0.j("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", qx1Var.encoding()};
                                                    js0 js0Var = js0.i;
                                                    js0 js0VarP = ci0.P(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsD8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw xe1.a0(method, i7, clsD8.getSimpleName() + " must include generic type (e.g., " + clsD8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeC4 = xe1.C(0, (ParameterizedType) type);
                                                        if (tj1.class.isAssignableFrom(xe1.D(typeC4))) {
                                                            throw xe1.a0(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        xw1Var = new xw1(new cx1(method, i7, js0VarP, cjVar2.o(typeC4, annotationArr3, annotationArr)), 0);
                                                    } else if (clsD8.isArray()) {
                                                        Class clsA = u82.a(clsD8.getComponentType());
                                                        if (tj1.class.isAssignableFrom(clsA)) {
                                                            throw xe1.a0(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        xw1Var = new xw1(new cx1(method, i7, js0VarP, cjVar2.o(clsA, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (tj1.class.isAssignableFrom(clsD8)) {
                                                            throw xe1.a0(method, i7, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        cx1Var = new cx1(method, i7, js0VarP, cjVar2.o(type, annotationArr3, annotationArr));
                                                        xw1Var = cx1Var;
                                                    }
                                                } else if (Iterable.class.isAssignableFrom(clsD8)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw xe1.a0(method, i7, clsD8.getSimpleName() + " must include generic type (e.g., " + clsD8.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    if (!tj1.class.isAssignableFrom(xe1.D(xe1.C(0, (ParameterizedType) type)))) {
                                                        throw xe1.a0(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                    xw1Var = new xw1(gx1Var, 0);
                                                } else if (clsD8.isArray()) {
                                                    if (!tj1.class.isAssignableFrom(clsD8.getComponentType())) {
                                                        throw xe1.a0(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                    }
                                                    xw1Var = new xw1(gx1Var, 1);
                                                } else if (!tj1.class.isAssignableFrom(clsD8)) {
                                                    throw xe1.a0(method, i7, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                }
                                            } else if (annotation instanceof rx1) {
                                                u82Var.c(i7, type);
                                                if (!u82Var.q) {
                                                    throw xe1.a0(method, i7, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                u82Var.g = true;
                                                Class clsD9 = xe1.D(type);
                                                if (!Map.class.isAssignableFrom(clsD9)) {
                                                    throw xe1.a0(method, i7, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeE4 = xe1.E(type, clsD9);
                                                if (!(typeE4 instanceof ParameterizedType)) {
                                                    throw xe1.a0(method, i7, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeE4;
                                                Type typeC5 = xe1.C(0, parameterizedType4);
                                                if (String.class != typeC5) {
                                                    throw xe1.a0(method, i7, "@PartMap keys must be of type String: " + typeC5, new Object[0]);
                                                }
                                                Type typeC6 = xe1.C(1, parameterizedType4);
                                                if (tj1.class.isAssignableFrom(xe1.D(typeC6))) {
                                                    throw xe1.a0(method, i7, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                gx1Var = new cx1(method, i7, cjVar2.o(typeC6, annotationArr3, annotationArr), ((rx1) annotation).encoding());
                                            } else if (annotation instanceof il) {
                                                u82Var.c(i7, type);
                                                if (u82Var.p || u82Var.q) {
                                                    throw xe1.a0(method, i7, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (u82Var.h) {
                                                    throw xe1.a0(method, i7, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    x00 x00VarO = cjVar2.o(type, annotationArr3, annotationArr);
                                                    u82Var.h = true;
                                                    gx1Var = new yw1(method, i7, x00VarO);
                                                } catch (RuntimeException e) {
                                                    throw xe1.b0(method, e, i7, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof px2) {
                                                u82Var.c(i7, type);
                                                Class clsA2 = u82.a(xe1.D(type));
                                                for (int i13 = i7 - 1; i13 >= 0; i13--) {
                                                    op0 op0Var3 = u82Var.v[i13];
                                                    if ((op0Var3 instanceof gx1) && ((gx1) op0Var3).h.equals(clsA2)) {
                                                        throw xe1.a0(method, i7, "@Tag type " + clsA2.getName() + " is duplicate of " + yz1.b.l(method, i13) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                gx1Var = new gx1(clsA2);
                                            } else {
                                                xw1Var = null;
                                            }
                                            xw1Var = gx1Var;
                                        }
                                    }
                                    if (xw1Var != null) {
                                        if (op0Var != null) {
                                            throw xe1.a0(method, i7, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
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
                                if (xe1.D(type) == t00.class) {
                                    u82Var.w = true;
                                    op0Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw xe1.a0(method, i7, "No Retrofit annotation found.", new Object[0]);
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
                if (u82Var.r == null && !u82Var.m) {
                    throw xe1.V(method, null, "Missing either @%s URL or @Url parameter.", u82Var.n);
                }
                boolean z6 = u82Var.p;
                if (!z6 && !u82Var.q && !u82Var.o && u82Var.h) {
                    throw xe1.V(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !u82Var.f) {
                    throw xe1.V(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (u82Var.q && !u82Var.g) {
                    throw xe1.V(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                v82 v82Var = new v82(u82Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (xe1.F(genericReturnType2)) {
                    throw xe1.V(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw xe1.V(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = v82Var.k;
                if (z7) {
                    Type typeC7 = ((ParameterizedType) method.getGenericParameterTypes()[r6.length - 1]).getActualTypeArguments()[0];
                    if (typeC7 instanceof WildcardType) {
                        typeC7 = ((WildcardType) typeC7).getLowerBounds()[0];
                    }
                    if (xe1.D(typeC7) == q92.class && (typeC7 instanceof ParameterizedType)) {
                        typeC7 = xe1.C(0, (ParameterizedType) typeC7);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (xe1.D(typeC7) == wo.class) {
                            throw xe1.V(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", xe1.C(0, (ParameterizedType) typeC7));
                        }
                        z3 = xe1.h && typeC7 == a83.class;
                        z2 = false;
                    }
                    genericReturnType = new e93(null, wo.class, typeC7);
                    if (!xe1.J(annotations, mr2.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = nr2.a;
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
                    yo yoVarF = cjVar.f(genericReturnType, annotations);
                    Type typeE5 = yoVarF.e();
                    if (typeE5 == r92.class) {
                        throw xe1.V(method, null, "'" + xe1.D(typeE5).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeE5 == q92.class) {
                        throw xe1.V(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (v82Var.c.equals(str4) && !Void.class.equals(typeE5) && (!xe1.h || typeE5 != a83.class)) {
                        throw xe1.V(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        x00 x00VarP = cjVar.p(typeE5, method.getAnnotations());
                        et1 et1Var = (et1) cjVar.b;
                        return !z7 ? new uw0(v82Var, et1Var, x00VarP, yoVarF, 0) : z2 ? new uw0(v82Var, et1Var, x00VarP, yoVarF, 1) : new vw0(v82Var, et1Var, x00VarP, yoVarF, z);
                    } catch (RuntimeException e2) {
                        throw xe1.V(method, e2, "Unable to create converter for %s", typeE5);
                    }
                } catch (RuntimeException e3) {
                    throw xe1.V(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i5];
            if (annotation2 instanceof z30) {
                u82Var.b("DELETE", ((z30) annotation2).value(), false);
            } else if (annotation2 instanceof zn0) {
                u82Var.b("GET", ((zn0) annotation2).value(), false);
            } else if (annotation2 instanceof pr0) {
                u82Var.b("HEAD", ((pr0) annotation2).value(), false);
            } else if (annotation2 instanceof cw1) {
                u82Var.b("PATCH", ((cw1) annotation2).value(), true);
            } else if (annotation2 instanceof dw1) {
                u82Var.b("POST", ((dw1) annotation2).value(), true);
            } else if (annotation2 instanceof ew1) {
                u82Var.b("PUT", ((ew1) annotation2).value(), true);
            } else if (annotation2 instanceof ds1) {
                u82Var.b("OPTIONS", ((ds1) annotation2).value(), false);
            } else if (annotation2 instanceof qr0) {
                qr0 qr0Var = (qr0) annotation2;
                u82Var.b(qr0Var.method(), qr0Var.path(), qr0Var.hasBody());
            } else if (annotation2 instanceof ks0) {
                ks0 ks0Var = (ks0) annotation2;
                String[] strArrValue = ks0Var.value();
                if (strArrValue.length == 0) {
                    throw xe1.V(method, null, "@Headers annotation is empty.", new Object[0]);
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
                            o72 o72Var = vf1.d;
                            u82Var.t = te.C(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw xe1.V(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        strTrim.getClass();
                        n93.c(strSubstring);
                        n93.a(ye0Var, strSubstring, strTrim);
                    } else {
                        ye0Var.a(strSubstring, strTrim);
                    }
                    i17++;
                    z4 = z8;
                }
                u82Var.s = ye0Var.b();
            } else if (annotation2 instanceof sj1) {
                if (u82Var.p) {
                    throw xe1.V(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                u82Var.q = true;
            } else if (!(annotation2 instanceof qm0)) {
                continue;
            } else {
                if (u82Var.q) {
                    throw xe1.V(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                u82Var.p = true;
            }
            i5++;
        }
    }

    public abstract Object a(ct1 ct1Var, Object[] objArr);
}
