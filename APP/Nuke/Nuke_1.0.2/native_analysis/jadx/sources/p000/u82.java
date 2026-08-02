package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u82 {

    /* JADX INFO: renamed from: x */
    public static final Pattern f11130x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: y */
    public static final Pattern f11131y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: a */
    public final C0093cj f11132a;

    /* JADX INFO: renamed from: b */
    public final Method f11133b;

    /* JADX INFO: renamed from: c */
    public final Annotation[] f11134c;

    /* JADX INFO: renamed from: d */
    public final Annotation[][] f11135d;

    /* JADX INFO: renamed from: e */
    public final Type[] f11136e;

    /* JADX INFO: renamed from: f */
    public boolean f11137f;

    /* JADX INFO: renamed from: g */
    public boolean f11138g;

    /* JADX INFO: renamed from: h */
    public boolean f11139h;

    /* JADX INFO: renamed from: i */
    public boolean f11140i;

    /* JADX INFO: renamed from: j */
    public boolean f11141j;

    /* JADX INFO: renamed from: k */
    public boolean f11142k;

    /* JADX INFO: renamed from: l */
    public boolean f11143l;

    /* JADX INFO: renamed from: m */
    public boolean f11144m;

    /* JADX INFO: renamed from: n */
    public String f11145n;

    /* JADX INFO: renamed from: o */
    public boolean f11146o;

    /* JADX INFO: renamed from: p */
    public boolean f11147p;

    /* JADX INFO: renamed from: q */
    public boolean f11148q;

    /* JADX INFO: renamed from: r */
    public String f11149r;

    /* JADX INFO: renamed from: s */
    public js0 f11150s;

    /* JADX INFO: renamed from: t */
    public vf1 f11151t;

    /* JADX INFO: renamed from: u */
    public LinkedHashSet f11152u;

    /* JADX INFO: renamed from: v */
    public op0[] f11153v;

    /* JADX INFO: renamed from: w */
    public boolean f11154w;

    public u82(C0093cj c0093cj, Method method) {
        this.f11132a = c0093cj;
        this.f11133b = method;
        this.f11134c = method.getAnnotations();
        this.f11136e = method.getGenericParameterTypes();
        this.f11135d = method.getParameterAnnotations();
    }

    /* JADX INFO: renamed from: a */
    public static Class m5472a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* JADX INFO: renamed from: b */
    public final void m5473b(String str, String str2, boolean z) {
        String str3 = this.f11145n;
        Method method = this.f11133b;
        if (str3 != null) {
            throw xe1.m6104V(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f11145n = str;
        this.f11146o = z;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f11130x;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw xe1.m6104V(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f11149r = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f11152u = linkedHashSet;
    }

    /* JADX INFO: renamed from: c */
    public final void m5474c(int i, Type type) {
        if (xe1.m6088F(type)) {
            throw xe1.m6110a0(this.f11133b, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
