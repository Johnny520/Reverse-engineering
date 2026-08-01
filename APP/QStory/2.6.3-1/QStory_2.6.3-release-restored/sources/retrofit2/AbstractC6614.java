package retrofit2;

import androidx.activity.AbstractC0900;
import androidx.appcompat.widget.C0978;
import androidx.compose.p001ui.graphics.vector.C2397;
import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.AbstractC3889;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.C6008;
import kotlin.coroutines.InterfaceC5189;
import kotlin.text.Regex;
import p023.C6956;
import p023.C6960;
import p023.C6973;
import p023.C6974;
import p023.C6978;
import p023.C6980;
import p191.AbstractC8568;
import p413.InterfaceC9943;
import p413.InterfaceC9944;
import p413.InterfaceC9945;
import p413.InterfaceC9946;
import p413.InterfaceC9947;
import p413.InterfaceC9948;
import p413.InterfaceC9949;
import p413.InterfaceC9950;
import p413.InterfaceC9951;
import p413.InterfaceC9953;
import p413.InterfaceC9954;
import p413.InterfaceC9955;
import p413.InterfaceC9956;
import p413.InterfaceC9957;
import p413.InterfaceC9958;
import p413.InterfaceC9959;
import p413.InterfaceC9960;
import p413.InterfaceC9961;
import p413.InterfaceC9962;
import p413.InterfaceC9963;
import p413.InterfaceC9964;
import p413.InterfaceC9965;
import p413.InterfaceC9966;
import p413.InterfaceC9967;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6614 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC6619 f16220;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6956 f16221;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6586 f16222;

    public AbstractC6614(C6586 c6586, C6956 c6956, InterfaceC6619 interfaceC6619) {
        this.f16222 = c6586;
        this.f16221 = c6956;
        this.f16220 = interfaceC6619;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x011f, code lost:
    
        throw retrofit2.AbstractC6615.m11741(r28, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0900  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0904 A[SYNTHETIC] */
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
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AbstractC6614 m11732(C0978 c0978, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        AbstractC6615 abstractC6615;
        int i;
        int i2;
        AbstractC6615[] abstractC6615Arr;
        int i3;
        int i4;
        String str;
        AbstractC6615 c6592;
        AbstractC6615 c6604;
        C6597 c6597;
        C6597 c65972;
        C6590 c6590 = new C6590(c0978, cls, method);
        Annotation[] annotationArr = c6590.f16135;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            String str2 = "HEAD";
            boolean z4 = true;
            AbstractC6615 abstractC66152 = null;
            if (i6 >= length) {
                if (c6590.f16149 == null) {
                    throw AbstractC6615.m11741(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!c6590.f16150) {
                    if (c6590.f16148) {
                        throw AbstractC6615.m11741(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (c6590.f16147) {
                        throw AbstractC6615.m11741(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = c6590.f16134;
                int length2 = annotationArr2.length;
                c6590.f16141 = new AbstractC6615[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    AbstractC6615[] abstractC6615Arr2 = c6590.f16141;
                    Type type = c6590.f16133[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        abstractC6615 = abstractC66152;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof InterfaceC9943) {
                                c6590.m11708(i8, type);
                                if (c6590.f16145) {
                                    throw AbstractC6615.m11740(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (c6590.f16156) {
                                    throw AbstractC6615.m11740(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (c6590.f16153) {
                                    throw AbstractC6615.m11740(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (c6590.f16154) {
                                    throw AbstractC6615.m11740(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (c6590.f16146) {
                                    throw AbstractC6615.m11740(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (c6590.f16140 != null) {
                                    throw AbstractC6615.m11740(method, i8, "@Url cannot be used with @%s URL", c6590.f16149);
                                }
                                c6590.f16145 = true;
                                if (type != C6978.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw AbstractC6615.m11740(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                c6592 = new C6605(method, i8, 1);
                                str = str2;
                                i = i7;
                            } else {
                                i = i7;
                                boolean z5 = annotation instanceof InterfaceC9951;
                                C0978 c09782 = c6590.f16138;
                                if (z5) {
                                    c6590.m11708(i8, type);
                                    if (c6590.f16153) {
                                        throw AbstractC6615.m11740(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (c6590.f16154) {
                                        throw AbstractC6615.m11740(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (c6590.f16146) {
                                        throw AbstractC6615.m11740(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (c6590.f16145) {
                                        throw AbstractC6615.m11740(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (c6590.f16140 == null) {
                                        throw AbstractC6615.m11740(method, i8, "@Path can only be used with relative url on @%s", c6590.f16149);
                                    }
                                    c6590.f16156 = true;
                                    InterfaceC9951 interfaceC9951 = (InterfaceC9951) annotation;
                                    String strValue = interfaceC9951.value();
                                    if (!C6590.f16131.matcher(strValue).matches()) {
                                        throw AbstractC6615.m11740(method, i8, "@Path parameter name must match %s. Found: %s", C6590.f16132.pattern(), strValue);
                                    }
                                    if (!c6590.f16144.contains(strValue)) {
                                        throw AbstractC6615.m11740(method, i8, "URL \"%s\" does not contain \"{%s}\".", c6590.f16140, strValue);
                                    }
                                    c09782.m1110(type, annotationArr3);
                                    c6592 = new C6603(c6590.f16136, i8, strValue, interfaceC9951.encoded());
                                    str = str2;
                                } else {
                                    i2 = i10;
                                    abstractC6615Arr = abstractC6615Arr2;
                                    if (annotation instanceof InterfaceC9950) {
                                        c6590.m11708(i8, type);
                                        InterfaceC9950 interfaceC9950 = (InterfaceC9950) annotation;
                                        String strValue2 = interfaceC9950.value();
                                        boolean zEncoded = interfaceC9950.encoded();
                                        i3 = i9;
                                        Class clsM11746 = AbstractC6615.m11746(type);
                                        i4 = length3;
                                        c6590.f16153 = true;
                                        if (Iterable.class.isAssignableFrom(clsM11746)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw AbstractC6615.m11740(method, i8, clsM11746.getSimpleName() + " must include generic type (e.g., " + clsM11746.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            c09782.m1110(AbstractC6615.m11747(0, (ParameterizedType) type), annotationArr3);
                                            c65972 = new C6597(new C6595(2, strValue2, zEncoded), 0);
                                        } else if (clsM11746.isArray()) {
                                            c09782.m1110(C6590.m11707(clsM11746.getComponentType()), annotationArr3);
                                            c65972 = new C6597(new C6595(2, strValue2, zEncoded), 1);
                                        } else {
                                            c09782.m1110(type, annotationArr3);
                                            c6592 = new C6595(2, strValue2, zEncoded);
                                            str = str2;
                                        }
                                        c6592 = c65972;
                                        str = str2;
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof InterfaceC9955) {
                                            c6590.m11708(i8, type);
                                            boolean zEncoded2 = ((InterfaceC9955) annotation).encoded();
                                            Class clsM117462 = AbstractC6615.m11746(type);
                                            c6590.f16154 = true;
                                            if (Iterable.class.isAssignableFrom(clsM117462)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw AbstractC6615.m11740(method, i8, clsM117462.getSimpleName() + " must include generic type (e.g., " + clsM117462.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                c09782.m1110(AbstractC6615.m11747(0, (ParameterizedType) type), annotationArr3);
                                                c65972 = new C6597(new C6602(zEncoded2), 0);
                                            } else if (clsM117462.isArray()) {
                                                c09782.m1110(C6590.m11707(clsM117462.getComponentType()), annotationArr3);
                                                c65972 = new C6597(new C6602(zEncoded2), 1);
                                            } else {
                                                c09782.m1110(type, annotationArr3);
                                                c6592 = new C6602(zEncoded2);
                                            }
                                            c6592 = c65972;
                                        } else if (annotation instanceof InterfaceC9954) {
                                            c6590.m11708(i8, type);
                                            Class clsM117463 = AbstractC6615.m11746(type);
                                            c6590.f16146 = true;
                                            if (!Map.class.isAssignableFrom(clsM117463)) {
                                                throw AbstractC6615.m11740(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type typeM11750 = AbstractC6615.m11750(clsM117463, type);
                                            if (!(typeM11750 instanceof ParameterizedType)) {
                                                throw AbstractC6615.m11740(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) typeM11750;
                                            Type typeM11747 = AbstractC6615.m11747(0, parameterizedType);
                                            if (String.class != typeM11747) {
                                                throw AbstractC6615.m11740(method, i8, "@QueryMap keys must be of type String: " + typeM11747, new Object[0]);
                                            }
                                            c09782.m1110(AbstractC6615.m11747(1, parameterizedType), annotationArr3);
                                            c6592 = new C6606(i8, 2, method, ((InterfaceC9954) annotation).encoded());
                                        } else {
                                            str = str2;
                                            if (annotation instanceof InterfaceC9966) {
                                                c6590.m11708(i8, type);
                                                InterfaceC9966 interfaceC9966 = (InterfaceC9966) annotation;
                                                String strValue3 = interfaceC9966.value();
                                                Class clsM117464 = AbstractC6615.m11746(type);
                                                if (Iterable.class.isAssignableFrom(clsM117464)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw AbstractC6615.m11740(method, i8, clsM117464.getSimpleName() + " must include generic type (e.g., " + clsM117464.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c09782.m1110(AbstractC6615.m11747(0, (ParameterizedType) type), annotationArr3);
                                                    c6604 = new C6597(new C6595(1, strValue3, interfaceC9966.allowUnsafeNonAsciiValues()), 0);
                                                } else if (clsM117464.isArray()) {
                                                    c09782.m1110(C6590.m11707(clsM117464.getComponentType()), annotationArr3);
                                                    c6604 = new C6597(new C6595(1, strValue3, interfaceC9966.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    c09782.m1110(type, annotationArr3);
                                                    c6592 = new C6595(1, strValue3, interfaceC9966.allowUnsafeNonAsciiValues());
                                                }
                                                c6592 = c6604;
                                            } else if (annotation instanceof InterfaceC9967) {
                                                if (type == C6980.class) {
                                                    c6592 = new C6605(method, i8, 0);
                                                } else {
                                                    c6590.m11708(i8, type);
                                                    Class clsM117465 = AbstractC6615.m11746(type);
                                                    if (!Map.class.isAssignableFrom(clsM117465)) {
                                                        throw AbstractC6615.m11740(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type typeM117502 = AbstractC6615.m11750(clsM117465, type);
                                                    if (!(typeM117502 instanceof ParameterizedType)) {
                                                        throw AbstractC6615.m11740(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) typeM117502;
                                                    Type typeM117472 = AbstractC6615.m11747(0, parameterizedType2);
                                                    if (String.class != typeM117472) {
                                                        throw AbstractC6615.m11740(method, i8, "@HeaderMap keys must be of type String: " + typeM117472, new Object[0]);
                                                    }
                                                    c09782.m1110(AbstractC6615.m11747(1, parameterizedType2), annotationArr3);
                                                    c6592 = new C6606(i8, 1, method, ((InterfaceC9967) annotation).allowUnsafeNonAsciiValues());
                                                }
                                            } else if (annotation instanceof InterfaceC9947) {
                                                c6590.m11708(i8, type);
                                                if (!c6590.f16147) {
                                                    throw AbstractC6615.m11740(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                InterfaceC9947 interfaceC9947 = (InterfaceC9947) annotation;
                                                String strValue4 = interfaceC9947.value();
                                                boolean zEncoded3 = interfaceC9947.encoded();
                                                c6590.f16152 = true;
                                                Class clsM117466 = AbstractC6615.m11746(type);
                                                if (Iterable.class.isAssignableFrom(clsM117466)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw AbstractC6615.m11740(method, i8, clsM117466.getSimpleName() + " must include generic type (e.g., " + clsM117466.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    c09782.m1110(AbstractC6615.m11747(0, (ParameterizedType) type), annotationArr3);
                                                    c6604 = new C6597(new C6595(0, strValue4, zEncoded3), 0);
                                                } else if (clsM117466.isArray()) {
                                                    c09782.m1110(C6590.m11707(clsM117466.getComponentType()), annotationArr3);
                                                    c6604 = new C6597(new C6595(0, strValue4, zEncoded3), 1);
                                                } else {
                                                    c09782.m1110(type, annotationArr3);
                                                    c6592 = new C6595(0, strValue4, zEncoded3);
                                                }
                                                c6592 = c6604;
                                            } else if (annotation instanceof InterfaceC9946) {
                                                c6590.m11708(i8, type);
                                                if (!c6590.f16147) {
                                                    throw AbstractC6615.m11740(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class clsM117467 = AbstractC6615.m11746(type);
                                                if (!Map.class.isAssignableFrom(clsM117467)) {
                                                    throw AbstractC6615.m11740(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM117503 = AbstractC6615.m11750(clsM117467, type);
                                                if (!(typeM117503 instanceof ParameterizedType)) {
                                                    throw AbstractC6615.m11740(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeM117503;
                                                Type typeM117473 = AbstractC6615.m11747(0, parameterizedType3);
                                                if (String.class != typeM117473) {
                                                    throw AbstractC6615.m11740(method, i8, "@FieldMap keys must be of type String: " + typeM117473, new Object[0]);
                                                }
                                                c09782.m1110(AbstractC6615.m11747(1, parameterizedType3), annotationArr3);
                                                c6590.f16152 = true;
                                                c6592 = new C6606(i8, 0, method, ((InterfaceC9946) annotation).encoded());
                                            } else if (annotation instanceof InterfaceC9958) {
                                                c6590.m11708(i8, type);
                                                if (!c6590.f16148) {
                                                    throw AbstractC6615.m11740(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                InterfaceC9958 interfaceC9958 = (InterfaceC9958) annotation;
                                                c6590.f16151 = true;
                                                String strValue5 = interfaceC9958.value();
                                                Class clsM117468 = AbstractC6615.m11746(type);
                                                if (strValue5.isEmpty()) {
                                                    boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsM117468);
                                                    C6601 c6601 = C6601.f16187;
                                                    if (zIsAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw AbstractC6615.m11740(method, i8, clsM117468.getSimpleName() + " must include generic type (e.g., " + clsM117468.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!C6974.class.isAssignableFrom(AbstractC6615.m11746(AbstractC6615.m11747(0, (ParameterizedType) type)))) {
                                                            throw AbstractC6615.m11740(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        c6592 = new C6597(c6601, 0);
                                                    } else if (clsM117468.isArray()) {
                                                        if (!C6974.class.isAssignableFrom(clsM117468.getComponentType())) {
                                                            throw AbstractC6615.m11740(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        c6592 = new C6597(c6601, 1);
                                                    } else {
                                                        if (!C6974.class.isAssignableFrom(clsM117468)) {
                                                            throw AbstractC6615.m11740(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        c6592 = c6601;
                                                    }
                                                } else {
                                                    String[] strArr = {"Content-Disposition", AbstractC0900.m718("form-data; name=\"", strValue5, "\""), "Content-Transfer-Encoding", interfaceC9958.encoding()};
                                                    C6980 c6980 = C6980.f17237;
                                                    C6980 c6980M7305 = AbstractC3889.m7305(strArr);
                                                    if (Iterable.class.isAssignableFrom(clsM117468)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw AbstractC6615.m11740(method, i8, clsM117468.getSimpleName() + " must include generic type (e.g., " + clsM117468.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type typeM117474 = AbstractC6615.m11747(0, (ParameterizedType) type);
                                                        if (C6974.class.isAssignableFrom(AbstractC6615.m11746(typeM117474))) {
                                                            throw AbstractC6615.m11740(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c6597 = new C6597(new C6604(method, i8, c6980M7305, c09782.m1112(typeM117474, annotationArr3, annotationArr)), 0);
                                                    } else if (clsM117468.isArray()) {
                                                        Class clsM11707 = C6590.m11707(clsM117468.getComponentType());
                                                        if (C6974.class.isAssignableFrom(clsM11707)) {
                                                            throw AbstractC6615.m11740(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c6597 = new C6597(new C6604(method, i8, c6980M7305, c09782.m1112(clsM11707, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (C6974.class.isAssignableFrom(clsM117468)) {
                                                            throw AbstractC6615.m11740(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        c6604 = new C6604(method, i8, c6980M7305, c09782.m1112(type, annotationArr3, annotationArr));
                                                        c6592 = c6604;
                                                    }
                                                    c6592 = c6597;
                                                }
                                            } else if (annotation instanceof InterfaceC9959) {
                                                c6590.m11708(i8, type);
                                                if (!c6590.f16148) {
                                                    throw AbstractC6615.m11740(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                c6590.f16151 = true;
                                                Class clsM117469 = AbstractC6615.m11746(type);
                                                if (!Map.class.isAssignableFrom(clsM117469)) {
                                                    throw AbstractC6615.m11740(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type typeM117504 = AbstractC6615.m11750(clsM117469, type);
                                                if (!(typeM117504 instanceof ParameterizedType)) {
                                                    throw AbstractC6615.m11740(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) typeM117504;
                                                Type typeM117475 = AbstractC6615.m11747(0, parameterizedType4);
                                                if (String.class != typeM117475) {
                                                    throw AbstractC6615.m11740(method, i8, "@PartMap keys must be of type String: " + typeM117475, new Object[0]);
                                                }
                                                Type typeM117476 = AbstractC6615.m11747(1, parameterizedType4);
                                                if (C6974.class.isAssignableFrom(AbstractC6615.m11746(typeM117476))) {
                                                    throw AbstractC6615.m11740(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                c6592 = new C6604(method, i8, c09782.m1112(typeM117476, annotationArr3, annotationArr), ((InterfaceC9959) annotation).encoding());
                                            } else if (annotation instanceof InterfaceC9949) {
                                                c6590.m11708(i8, type);
                                                if (c6590.f16147 || c6590.f16148) {
                                                    throw AbstractC6615.m11740(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (c6590.f16155) {
                                                    throw AbstractC6615.m11740(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    InterfaceC6619 interfaceC6619M1112 = c09782.m1112(type, annotationArr3, annotationArr);
                                                    c6590.f16155 = true;
                                                    c6592 = new C6596(method, i8, interfaceC6619M1112);
                                                } catch (RuntimeException e) {
                                                    throw AbstractC6615.m11744(method, e, i8, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof InterfaceC9953) {
                                                c6590.m11708(i8, type);
                                                Class clsM117072 = C6590.m11707(AbstractC6615.m11746(type));
                                                for (int i12 = i8 - 1; i12 >= 0; i12--) {
                                                    AbstractC6615 abstractC66153 = c6590.f16141[i12];
                                                    if ((abstractC66153 instanceof C6592) && ((C6592) abstractC66153).f16160.equals(clsM117072)) {
                                                        throw AbstractC6615.m11740(method, i8, "@Tag type " + clsM117072.getName() + " is duplicate of " + AbstractC6591.f16158.mo11716(method, i12) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                c6592 = new C6592(clsM117072);
                                            } else {
                                                c6592 = null;
                                            }
                                        }
                                        str = str2;
                                    }
                                    if (c6592 != null) {
                                        if (abstractC6615 != null) {
                                            throw AbstractC6615.m11740(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        abstractC6615 = c6592;
                                    }
                                    i10 = i2 + 1;
                                    annotationArr2 = annotationArr4;
                                    i7 = i;
                                    length2 = i11;
                                    i9 = i3;
                                    str2 = str;
                                    abstractC6615Arr2 = abstractC6615Arr;
                                    length3 = i4;
                                }
                            }
                            i2 = i10;
                            abstractC6615Arr = abstractC6615Arr2;
                            i3 = i9;
                            i4 = length3;
                            if (c6592 != null) {
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            str2 = str;
                            abstractC6615Arr2 = abstractC6615Arr;
                            length3 = i4;
                        }
                    } else {
                        abstractC6615 = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i13 = length2;
                    String str3 = str2;
                    int i14 = i7;
                    AbstractC6615[] abstractC6615Arr3 = abstractC6615Arr2;
                    int i15 = i9;
                    if (abstractC6615 == null) {
                        if (i15 != 0) {
                            try {
                                if (AbstractC6615.m11746(type) == InterfaceC5189.class) {
                                    c6590.f16142 = true;
                                    abstractC6615 = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw AbstractC6615.m11740(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    abstractC6615Arr3[i8] = abstractC6615;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i14;
                    length2 = i13;
                    str2 = str3;
                    i5 = 0;
                    abstractC66152 = null;
                }
                String str4 = str2;
                if (c6590.f16140 == null && !c6590.f16145) {
                    throw AbstractC6615.m11741(method, null, "Missing either @%s URL or @Url parameter.", c6590.f16149);
                }
                boolean z6 = c6590.f16147;
                if (!z6 && !c6590.f16148 && !c6590.f16150 && c6590.f16155) {
                    throw AbstractC6615.m11741(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !c6590.f16152) {
                    throw AbstractC6615.m11741(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (c6590.f16148 && !c6590.f16151) {
                    throw AbstractC6615.m11741(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                C6586 c6586 = new C6586(c6590);
                Type genericReturnType2 = method.getGenericReturnType();
                if (AbstractC6615.m11751(genericReturnType2)) {
                    throw AbstractC6615.m11741(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw AbstractC6615.m11741(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = c6586.f16112;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type typeM117477 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (typeM117477 instanceof WildcardType) {
                        typeM117477 = ((WildcardType) typeM117477).getLowerBounds()[0];
                    }
                    if (AbstractC6615.m11746(typeM117477) == C6585.class && (typeM117477 instanceof ParameterizedType)) {
                        typeM117477 = AbstractC6615.m11747(0, (ParameterizedType) typeM117477);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (AbstractC6615.m11746(typeM117477) == InterfaceC6608.class) {
                            throw AbstractC6615.m11741(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", AbstractC6615.m11747(0, (ParameterizedType) typeM117477));
                        }
                        z3 = AbstractC6615.f16224 && typeM117477 == C6008.class;
                        z2 = false;
                    }
                    genericReturnType = new C6632(null, InterfaceC6608.class, typeM117477);
                    if (!AbstractC6615.m11749(annotations, InterfaceC6587.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = C6583.f16099;
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
                    InterfaceC6626 interfaceC6626M1109 = c0978.m1109(genericReturnType, annotations);
                    Type typeMo10304 = interfaceC6626M1109.mo10304();
                    if (typeMo10304 == C6960.class) {
                        throw AbstractC6615.m11741(method, null, "'" + AbstractC6615.m11746(typeMo10304).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (typeMo10304 == C6585.class) {
                        throw AbstractC6615.m11741(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (c6586.f16105.equals(str4) && !Void.class.equals(typeMo10304) && (!AbstractC6615.f16224 || typeMo10304 != C6008.class)) {
                        throw AbstractC6615.m11741(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        InterfaceC6619 interfaceC6619M1113 = c0978.m1113(typeMo10304, method.getAnnotations());
                        C6956 c6956 = (C6956) c0978.f922;
                        return !z7 ? new C6621(c6586, c6956, interfaceC6619M1113, interfaceC6626M1109, 0) : z2 ? new C6621(c6586, c6956, interfaceC6619M1113, interfaceC6626M1109, 1) : new C6622(c6586, c6956, interfaceC6619M1113, interfaceC6626M1109, z);
                    } catch (RuntimeException e2) {
                        throw AbstractC6615.m11741(method, e2, "Unable to create converter for %s", typeMo10304);
                    }
                } catch (RuntimeException e3) {
                    throw AbstractC6615.m11741(method, e3, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof InterfaceC9948) {
                c6590.m11709("DELETE", ((InterfaceC9948) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC9944) {
                c6590.m11709("GET", ((InterfaceC9944) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC9963) {
                c6590.m11709("HEAD", ((InterfaceC9963) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC9956) {
                c6590.m11709("PATCH", ((InterfaceC9956) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC9960) {
                c6590.m11709("POST", ((InterfaceC9960) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC9961) {
                c6590.m11709("PUT", ((InterfaceC9961) annotation2).value(), true);
            } else if (annotation2 instanceof InterfaceC9957) {
                c6590.m11709("OPTIONS", ((InterfaceC9957) annotation2).value(), false);
            } else if (annotation2 instanceof InterfaceC9962) {
                InterfaceC9962 interfaceC9962 = (InterfaceC9962) annotation2;
                c6590.m11709(interfaceC9962.method(), interfaceC9962.path(), interfaceC9962.hasBody());
            } else if (annotation2 instanceof InterfaceC9964) {
                InterfaceC9964 interfaceC9964 = (InterfaceC9964) annotation2;
                String[] strArrValue = interfaceC9964.value();
                if (strArrValue.length == 0) {
                    throw AbstractC6615.m11741(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean zAllowUnsafeNonAsciiValues = interfaceC9964.allowUnsafeNonAsciiValues();
                C2397 c2397 = new C2397(6, false);
                int length4 = strArrValue.length;
                int i16 = 0;
                while (i16 < length4) {
                    String str5 = strArrValue[i16];
                    int iIndexOf = str5.indexOf(58);
                    boolean z8 = z4;
                    if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str5.length() - 1) {
                        break loop0;
                    }
                    String strSubstring = str5.substring(0, iIndexOf);
                    String strTrim = str5.substring(iIndexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                        try {
                            Regex regex = C6973.f17204;
                            c6590.f16143 = AbstractC3888.m7271(strTrim);
                        } catch (IllegalArgumentException e4) {
                            throw AbstractC6615.m11741(method, e4, "Malformed content type: %s", strTrim);
                        }
                    } else if (zAllowUnsafeNonAsciiValues) {
                        strTrim.getClass();
                        AbstractC8568.m13617(strSubstring);
                        AbstractC8568.m13641(c2397, strSubstring, strTrim);
                    } else {
                        c2397.m3400(strSubstring, strTrim);
                    }
                    i16++;
                    z4 = z8;
                }
                c6590.f16139 = c2397.m3398();
            } else if (annotation2 instanceof InterfaceC9965) {
                if (c6590.f16147) {
                    throw AbstractC6615.m11741(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                c6590.f16148 = true;
            } else if (!(annotation2 instanceof InterfaceC9945)) {
                continue;
            } else {
                if (c6590.f16148) {
                    throw AbstractC6615.m11741(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                c6590.f16147 = true;
            }
            i6++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public abstract Object mo11733(C6598 c6598, Object[] objArr);
}
