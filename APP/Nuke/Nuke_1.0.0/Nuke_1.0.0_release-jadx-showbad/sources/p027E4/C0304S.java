package p027E4;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p014C1.C0240b;
import p118X3.C1707q;
import p118X3.C1711u;

/* JADX INFO: renamed from: E4.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0304S {

    /* JADX INFO: renamed from: y */
    public static final Pattern f979y = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: z */
    public static final Pattern f980z = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* JADX INFO: renamed from: a */
    public final C0240b f981a;

    /* JADX INFO: renamed from: b */
    public final Class f982b;

    /* JADX INFO: renamed from: c */
    public final Method f983c;

    /* JADX INFO: renamed from: d */
    public final Annotation[] f984d;

    /* JADX INFO: renamed from: e */
    public final Annotation[][] f985e;

    /* JADX INFO: renamed from: f */
    public final Type[] f986f;

    /* JADX INFO: renamed from: g */
    public boolean f987g;

    /* JADX INFO: renamed from: h */
    public boolean f988h;

    /* JADX INFO: renamed from: i */
    public boolean f989i;

    /* JADX INFO: renamed from: j */
    public boolean f990j;

    /* JADX INFO: renamed from: k */
    public boolean f991k;

    /* JADX INFO: renamed from: l */
    public boolean f992l;

    /* JADX INFO: renamed from: m */
    public boolean f993m;

    /* JADX INFO: renamed from: n */
    public boolean f994n;

    /* JADX INFO: renamed from: o */
    public String f995o;

    /* JADX INFO: renamed from: p */
    public boolean f996p;

    /* JADX INFO: renamed from: q */
    public boolean f997q;

    /* JADX INFO: renamed from: r */
    public boolean f998r;

    /* JADX INFO: renamed from: s */
    public String f999s;

    /* JADX INFO: renamed from: t */
    public C1707q f1000t;

    /* JADX INFO: renamed from: u */
    public C1711u f1001u;

    /* JADX INFO: renamed from: v */
    public LinkedHashSet f1002v;

    /* JADX INFO: renamed from: w */
    public AbstractC0315b0[] f1003w;

    /* JADX INFO: renamed from: x */
    public boolean f1004x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0304S(C0240b c0240b, Class cls, Method method) {
        this.f981a = c0240b;
        this.f982b = cls;
        this.f983c = method;
        this.f984d = method.getAnnotations();
        this.f986f = method.getGenericParameterTypes();
        this.f985e = method.getParameterAnnotations();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Class m526a(Class cls) {
        return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m527b(String str, String str2, boolean z5) {
        String str3 = this.f995o;
        Method method = this.f983c;
        if (str3 != null) {
            throw AbstractC0315b0.m542m(method, null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }
        this.f995o = str;
        this.f996p = z5;
        if (str2.isEmpty()) {
            return;
        }
        int iIndexOf = str2.indexOf(63);
        Pattern pattern = f979y;
        if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
            String strSubstring = str2.substring(iIndexOf + 1);
            if (pattern.matcher(strSubstring).find()) {
                throw AbstractC0315b0.m542m(method, null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
            }
        }
        this.f999s = str2;
        Matcher matcher = pattern.matcher(str2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        this.f1002v = linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m528c(int i5, Type type) {
        if (AbstractC0315b0.m539j(type)) {
            throw AbstractC0315b0.m543n(this.f983c, i5, "Parameter type must not include a type variable or wildcard: %s", type);
        }
    }
}
