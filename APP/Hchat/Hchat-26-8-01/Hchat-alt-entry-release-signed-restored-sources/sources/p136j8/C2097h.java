package p136j8;

import ac.RunnableC0059l;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.Html;
import android.text.TextUtils;
import bsh.org.objectweb.asm.Opcodes;
import ch.C0570e;
import gg.AbstractC1416l;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import ng.C3019q;
import okhttp3.HttpUrl;
import okhttp3.internal.connection.RealConnection;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p015b0.C0136d0;
import p015b0.C0153s;
import p024b9.RunnableC0217c;
import p025bc.AbstractC0255e;
import p036c9.C0446i;
import p054dg.C0791j;
import p054dg.C0795n;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p069f.C0939i0;
import p080fb.C1141k1;
import p086fh.C1253k;
import p096g8.C1370k;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p119i2.C1955z;
import p125i8.C2005i;
import p126ia.C2026t;
import p162l3.C2469w;
import p210o8.C3086j;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.C3147k;
import p218og.EnumC3148l;
import p218og.InterfaceC3142f;
import p222p.AbstractC3199a;
import p242q8.C3460o;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p304uf.C4327a;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: j8.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2097h {

    /* JADX INFO: renamed from: a */
    public final Context f7007a;

    /* JADX INFO: renamed from: b */
    public final DexFinder f7008b;

    /* JADX INFO: renamed from: c */
    public final ClassLoader f7009c;

    /* JADX INFO: renamed from: d */
    public final DexKitBridge f7010d;

    /* JADX INFO: renamed from: e */
    public final C3460o f7011e;

    /* JADX INFO: renamed from: f */
    public final C1141k1 f7012f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f7013g;

    /* JADX INFO: renamed from: h */
    public final Object f7014h;

    /* JADX INFO: renamed from: i */
    public volatile long f7015i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f7016j;

    /* JADX INFO: renamed from: k */
    public volatile String f7017k;

    /* JADX INFO: renamed from: l */
    public final ConcurrentHashMap.KeySetView f7018l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2097h(Context context, DexFinder dexFinder, ClassLoader classLoader, DexKitBridge dexKitBridge, C3460o c3460o, C2104o c2104o) {
        classLoader.getClass();
        this.f7007a = context;
        this.f7008b = dexFinder;
        this.f7009c = classLoader;
        this.f7010d = dexKitBridge;
        this.f7011e = c3460o;
        this.f7012f = new C1141k1(80, 0.75f, true, 1);
        this.f7013g = new LinkedHashMap();
        this.f7014h = new Object();
        this.f7016j = true;
        this.f7017k = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f7018l = ConcurrentHashMap.newKeySet();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static String m5223C(String str, String str2) {
        if (!AbstractC3149m.m6721t0(str)) {
            String strM1022k = AbstractC0255e.m1022k("<", str2, "(?:\\s[^>]*)?>(.*?)</", str2, ">");
            Iterator it = AbstractC4156d0.m8355W(EnumC3148l.IGNORE_CASE, EnumC3148l.DOT_MATCHES_ALL).iterator();
            int i9 = 0;
            while (it.hasNext()) {
                i9 |= ((EnumC3148l) it.next()).f10210g;
            }
            Pattern patternCompile = Pattern.compile(strM1022k, C2469w.m5864f(i9));
            patternCompile.getClass();
            Matcher matcher = patternCompile.matcher(str);
            matcher.getClass();
            C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
            String str3 = c3145iM238b != null ? (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a()) : null;
            if (str3 != null) {
                return str3;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static String m5224D(String str, String... strArr) {
        for (String str2 : strArr) {
            String strM5229h = m5229h(AbstractC3149m.m6687B0(AbstractC3149m.m6686A0(AbstractC3149m.m6703R0(m5223C(str, str2)).toString(), "<![CDATA["), "]]>"));
            if (!AbstractC3149m.m6721t0(strM5229h)) {
                return strM5229h;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m5225a(C2097h c2097h, String str, Throwable th2) {
        if (th2 != null) {
            c2097h.getClass();
            str = AbstractC4855en.m9264h(str, ": ", th2.getMessage());
        }
        c2097h.getClass();
        C2005i.m4939f(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m5226e(String str) {
        String strM5229h = m5229h(str);
        if (!m5233o(strM5229h)) {
            strM5229h = null;
        }
        return strM5229h == null ? HttpUrl.FRAGMENT_ENCODE_SET : strM5229h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m5227f(Object obj, ArrayList arrayList, HashSet hashSet, int i9) {
        if (obj == null || i9 > 3 || !hashSet.add(obj)) {
            return;
        }
        if (obj instanceof String) {
            C0939i0 c0939i0 = new C0939i0(C3147k.m6681c(new C3147k("(?:wxid_[A-Za-z0-9_-]+|gh_[A-Za-z0-9_-]+|[A-Za-z0-9_-]+@(?:im\\.)?chatroom)"), (CharSequence) obj));
            while (c0939i0.hasNext()) {
                arrayList.add(((C3145i) ((InterfaceC3142f) c0939i0.next())).m6678c());
            }
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                m5227f(it.next(), arrayList, hashSet, i9 + 1);
            }
            return;
        }
        if (obj instanceof Object[]) {
            for (Object obj2 : (Object[]) obj) {
                m5227f(obj2, arrayList, hashSet, i9 + 1);
            }
            return;
        }
        String name = obj.getClass().getName();
        if (AbstractC3156t.m6740d0(name, "java.", false) || AbstractC3156t.m6740d0(name, "android.", false)) {
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            for (Field field : KavaReflector.declaredFields(superclass)) {
                if (!field.getType().isPrimitive()) {
                    m5227f(KavaReflector.readField(field, obj), arrayList, hashSet, i9 + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5228g(Object obj, ArrayList arrayList, HashSet hashSet, int i9) {
        Object field;
        String strM6701P0;
        if (obj == null || i9 > 2 || !hashSet.add(obj)) {
            return;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (AbstractC3149m.m6721t0(str)) {
                strM6701P0 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                String strM5229h = m5229h(str);
                if (!AbstractC3149m.m6721t0(strM5229h)) {
                    strM6701P0 = AbstractC3149m.m6701P0(Opcodes.IF_ICMPNE, strM5229h);
                }
            }
            if ((strM6701P0.length() > 0 ? 1 : 0) == 0) {
                strM6701P0 = null;
            }
            if (strM6701P0 != null) {
                arrayList.add(strM6701P0);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                m5228g(it.next(), arrayList, hashSet, i9 + 1);
            }
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (i < length) {
                m5228g(objArr[i], arrayList, hashSet, i9 + 1);
                i++;
            }
            return;
        }
        String name = obj.getClass().getName();
        if (AbstractC3156t.m6740d0(name, "java.", false) || AbstractC3156t.m6740d0(name, "android.", false)) {
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            for (Field field2 : KavaReflector.declaredFields(superclass)) {
                if (!field2.getType().isPrimitive() && (field = KavaReflector.readField(field2, obj)) != null) {
                    m5228g(field, arrayList, hashSet, i9 + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m5229h(String str) {
        if (AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strM5161h = AbstractC2091b.m5161h("[\\u0000-\\u0008\\u000B\\u000C\\u000E-\\u001F\\u007F]", AbstractC3156t.m6738b0(Html.fromHtml(str, 0).toString(), (char) 65532, ' '), HttpUrl.FRAGMENT_ENCODE_SET);
        Pattern patternCompile = Pattern.compile("\\s+");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(strM5161h).replaceAll(" ");
        strReplaceAll.getClass();
        return AbstractC3149m.m6703R0(strReplaceAll).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static int m5230k(Object obj) {
        Number numberM5232m = m5232m(obj, "field_type", "type");
        if (numberM5232m != null) {
            return numberM5232m.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m5231l(Object obj) {
        String[] strArr = {"field_xml", "xml", "field_content", "content"};
        for (int i9 = 0; i9 < 4; i9++) {
            Object field = KavaReflector.readField(obj, strArr[i9]);
            String str = field instanceof String ? (String) field : null;
            if (!TextUtils.isEmpty(str)) {
                return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static Number m5232m(Object obj, String... strArr) {
        for (String str : strArr) {
            Object field = KavaReflector.readField(obj, str);
            if (field instanceof Number) {
                return (Number) field;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static boolean m5233o(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        if (string.length() > 0) {
            for (int i9 = 0; i9 < string.length(); i9++) {
                if (Character.isLetterOrDigit(string.charAt(i9))) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m5234p(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, string, locale);
        if (!AbstractC3149m.m6721t0(string) && string.length() >= 2 && !AbstractC4156d0.m8355W("silk", "amr", "mp3", "mp4", "jpg", "jpeg", "png", "gif", "htm", "html").contains(strM5165l) && !AbstractC3156t.m6740d0(strM5165l, "wxid_", false) && !AbstractC3156t.m6733W(strM5165l, "@chatroom", false) && !AbstractC3156t.m6740d0(strM5165l, "content://", false) && !AbstractC3156t.m6740d0(string, "/", false)) {
            Pattern patternCompile = Pattern.compile("^[A-Za-z]:[\\\\/]");
            patternCompile.getClass();
            if (!patternCompile.matcher(string).find()) {
                Pattern patternCompile2 = Pattern.compile("^[0-9a-f]{16,}$", C2469w.m5864f(2));
                patternCompile2.getClass();
                if (!patternCompile2.matcher(AbstractC3156t.m6737a0(string, " ", HttpUrl.FRAGMENT_ENCODE_SET, false)).matches()) {
                    Pattern patternCompile3 = Pattern.compile("^[A-Za-z0-9_-]{24,}$");
                    patternCompile3.getClass();
                    if (!patternCompile3.matcher(string).matches() && !AbstractC3156t.m6740d0(string, ".", false)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static List m5235x(Object obj) {
        if (obj == null) {
            return C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList();
        m5228g(obj, arrayList, new HashSet(), 0);
        return AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m5236A(String str, String str2) {
        str.getClass();
        str2.getClass();
        Long lM6743g0 = AbstractC3156t.m6743g0(AbstractC3149m.m6703R0(str2).toString());
        if (lM6743g0 != null && lM6743g0.longValue() > 0) {
            return m5252z(lM6743g0.longValue(), str);
        }
        C2005i.m4939f("发送收藏失败: localId 非法 ".concat(str2));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final boolean m5237B(String str, C2092c c2092c) {
        Object c3959f;
        C2114y c2114y;
        String str2 = c2092c.f6995a;
        boolean z9 = false;
        if (!new File(str2).isFile()) {
            return false;
        }
        try {
            C2105p c2105pMedia = WeChatApis.media();
            if (c2105pMedia != null && (c2114y = c2105pMedia.f7036b) != null && c2114y.m5323s(c2092c.f6996b, str, str2)) {
                z9 = true;
            }
            c3959f = Boolean.valueOf(z9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            C2005i.m4939f("发送收藏语音失败: " + thM8182b.getMessage());
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5238b(Object obj, long j3) {
        synchronized (this.f7012f) {
            this.f7012f.put(Long.valueOf(j3), obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C2096g m5239c() {
        C2096g c2096g;
        synchronized (this.f7014h) {
            Collection collectionValues = this.f7013g.values();
            collectionValues.getClass();
            c2096g = new C2096g(AbstractC4166m.m8407P1(collectionValues), this.f7016j, false);
        }
        return c2096g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m5240d() {
        DexFinder dexFinder = this.f7008b;
        return (dexFinder.favoriteServiceClass == null || dexFinder.favoriteServiceResolverMethod == null || dexFinder.favoriteStorageGetterMethod == null || dexFinder.favoriteListMethod == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x01d1 A[EDGE_INSN: B:373:0x01d1->B:90:0x01d1 BREAK  A[LOOP:15: B:65:0x017c->B:88:0x01ca, LOOP_LABEL: LOOP:15: B:65:0x017c->B:88:0x01ca], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x01f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01fb  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2098i m5241i(Object obj) {
        Number numberM5232m;
        long j3;
        Iterable iterableM6418b0;
        Iterator it;
        Object next;
        String str;
        Object next2;
        Iterator it2;
        Object next3;
        String strM6701P0;
        String str2;
        List list;
        Object next4;
        Object obj2;
        String strM9265i;
        C1370k c1370k;
        ArrayList arrayList;
        int i9;
        Class<?> superclass;
        Iterator<Field> it3;
        Class<?> cls;
        Iterator<Field> it4;
        Class<?> cls2;
        Iterator<Field> it5;
        String strM3739a;
        String strM5226e;
        List listM8407P1;
        String strM3731t;
        String strM5226e2;
        String strM3739a2;
        String strM5226e3;
        Object objM5182f;
        Integer numM5187k;
        String strM6836i;
        Object next5;
        Object obj3 = obj;
        if (obj3 == null || (numberM5232m = m5232m(obj3, "field_localId", "localId", "id")) == null) {
            return null;
        }
        long jLongValue = numberM5232m.longValue();
        int iM5230k = m5230k(obj3);
        Number numberM5232m2 = m5232m(obj3, "field_datatotalsize", "datatotalsize", "totalSize");
        long j4 = 0;
        long jLongValue2 = numberM5232m2 != null ? numberM5232m2.longValue() : 0L;
        Number numberM5232m3 = m5232m(obj3, "field_updateTime", "updateTime");
        if (numberM5232m3 != null) {
            long jLongValue3 = numberM5232m3.longValue();
            if (1 <= jLongValue3 && jLongValue3 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                jLongValue3 *= 1000;
            }
            j4 = jLongValue3;
        }
        long j5 = j4;
        String strM5231l = m5231l(obj3);
        Object field = KavaReflector.readField(obj3, "field_favProto");
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (iM5230k == 1) {
            String strM5224D = m5224D(strM5231l, "desc", "content", "title");
            if (AbstractC3149m.m6721t0(strM5224D)) {
                strM5224D = null;
            }
            if (strM5224D != null) {
                strM6701P0 = AbstractC3149m.m6701P0(Opcodes.IF_ICMPNE, strM5224D);
            } else {
                List listM5235x = m5235x(field);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : listM5235x) {
                    if (m5234p((String) obj4)) {
                        arrayList2.add(obj4);
                    }
                }
                Iterator it6 = arrayList2.iterator();
                if (it6.hasNext()) {
                    next5 = it6.next();
                    if (it6.hasNext()) {
                        Integer numValueOf = Integer.valueOf(((String) next5).length());
                        while (true) {
                            Object next6 = it6.next();
                            Iterator it7 = it6;
                            Integer numValueOf2 = Integer.valueOf(((String) next6).length());
                            if (numValueOf.compareTo(numValueOf2) < 0) {
                                numValueOf = numValueOf2;
                                next5 = next6;
                            }
                            if (!it7.hasNext()) {
                                break;
                            }
                            it6 = it7;
                        }
                    }
                } else {
                    next5 = null;
                }
                String str4 = (String) next5;
                if (str4 != null) {
                    strM6701P0 = AbstractC3149m.m6701P0(Opcodes.IF_ICMPNE, str4);
                }
                if (AbstractC3149m.m6721t0(strM5231l)) {
                    j3 = jLongValue;
                    iterableM6418b0 = AbstractC3015m.m6418b0(new C3011i(AbstractC3015m.m6413W(C3147k.m6681c(new C3147k("<(title|desc|description|content|filename|fileName|appname|sourcename|locationname)(?:\\s[^>]*)?>(?:<!\\[CDATA\\[)?(.*?)(?:]]>)?</\\1>", AbstractC4156d0.m8355W(EnumC3148l.IGNORE_CASE, EnumC3148l.DOT_MATCHES_ALL)), strM5231l), new C1955z(this, 10)), true, new C1955z(11)));
                } else {
                    iterableM6418b0 = C4173t.f13710g;
                    j3 = jLongValue;
                }
                it = iterableM6418b0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (m5234p((String) next)) {
                        break;
                    }
                }
                str = (String) next;
                if (str == null) {
                    strM6701P0 = AbstractC3149m.m6701P0(Opcodes.IF_ICMPNE, str);
                } else if (field != null) {
                    loop15: for (Class<?> superclass2 = field.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                        for (Field field2 : KavaReflector.declaredFields(superclass2)) {
                            if (Collection.class.isAssignableFrom(field2.getType())) {
                                Object field3 = KavaReflector.readField(field2, field);
                                Collection collection = field3 instanceof Collection ? (Collection) field3 : null;
                                if (collection != null) {
                                    Iterator it8 = collection.iterator();
                                    while (it8.hasNext()) {
                                        next2 = it8.next();
                                        if (next2 != null) {
                                            break;
                                        }
                                    }
                                    next2 = null;
                                    if (next2 == null) {
                                        break loop15;
                                    }
                                } else {
                                    next2 = null;
                                    if (next2 == null) {
                                    }
                                }
                            }
                        }
                    }
                    next2 = null;
                    it2 = AbstractC4166m.m8397F1(m5235x(next2), m5235x(field)).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it2.next();
                        if (m5234p((String) next3)) {
                            break;
                        }
                    }
                    String str5 = (String) next3;
                    strM6701P0 = str5 == null ? AbstractC3149m.m6701P0(Opcodes.IF_ICMPNE, str5) : iM5230k == 3 ? "语音收藏" : HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    next2 = null;
                    it2 = AbstractC4166m.m8397F1(m5235x(next2), m5235x(field)).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                        }
                    }
                    String str52 = (String) next3;
                    if (str52 == null) {
                    }
                }
            }
            j3 = jLongValue;
        } else {
            if (AbstractC3149m.m6721t0(strM5231l)) {
            }
            it = iterableM6418b0.iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            str = (String) next;
            if (str == null) {
            }
        }
        String strM2249l = "笔记";
        if (iM5230k != 10) {
            if (iM5230k == 14) {
                strM2249l = "聊天记录";
            } else if (iM5230k != 18) {
                if (iM5230k != 19) {
                    switch (iM5230k) {
                        case 1:
                            strM2249l = "文字";
                            break;
                        case 2:
                            strM2249l = "图片";
                            break;
                        case 3:
                            strM2249l = "语音";
                            break;
                        case 4:
                            strM2249l = "视频";
                            break;
                        case 5:
                            strM2249l = "链接";
                            break;
                        case 6:
                            strM2249l = "位置";
                            break;
                        case 7:
                            strM2249l = "音乐";
                            break;
                        case 8:
                            strM2249l = "文件";
                            break;
                        default:
                            strM2249l = AbstractC0921a.m2249l(iM5230k, "类型");
                            break;
                    }
                } else {
                    strM2249l = "小程序";
                }
            }
        }
        if (AbstractC3149m.m6721t0(strM6701P0)) {
            strM6701P0 = strM2249l.concat("收藏");
        }
        ArrayList arrayList3 = new ArrayList();
        m5227f(obj3, arrayList3, new HashSet(), 0);
        List listM8407P12 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList3));
        Iterator it9 = listM8407P12.iterator();
        while (true) {
            if (it9.hasNext()) {
                next4 = it9.next();
                str2 = strM6701P0;
                String str6 = (String) next4;
                list = listM8407P12;
                if (!AbstractC3156t.m6733W(str6, "@chatroom", false) && !AbstractC3156t.m6733W(str6, "@im.chatroom", false)) {
                    strM6701P0 = str2;
                    listM8407P12 = list;
                }
            } else {
                str2 = strM6701P0;
                list = listM8407P12;
                next4 = null;
            }
        }
        String str7 = (String) next4;
        Iterator it10 = list.iterator();
        while (it10.hasNext()) {
            Object next7 = it10.next();
            Iterator it11 = it10;
            String str8 = (String) next7;
            if (AbstractC3156t.m6740d0(str8, "wxid_", false) || AbstractC3156t.m6740d0(str8, "gh_", false)) {
                obj2 = next7;
                strM9265i = (String) obj2;
                WeChatApis.contact().getClass();
                c1370k = WeChatApis.userApi;
                arrayList = new ArrayList();
                arrayList.add(strM2249l);
                if (strM2249l.equals("语音")) {
                    i9 = iM5230k;
                } else {
                    ConcurrentHashMap concurrentHashMap = C2093d.f6997a;
                    if (C2093d.m5181e(obj3) == 3 && (objM5182f = C2093d.m5182f(obj3)) != null) {
                        i9 = iM5230k;
                        Number numberM5183g = C2093d.m5183g(objM5182f, "y", "duration", "length");
                        numM5187k = C2093d.m5187k(numberM5183g != null ? Long.valueOf(numberM5183g.longValue()) : null);
                    } else {
                        i9 = iM5230k;
                        numM5187k = null;
                    }
                    if (numM5187k != null) {
                        int iIntValue = numM5187k.intValue();
                        if (iIntValue < 0) {
                            iIntValue = 0;
                        }
                        int i10 = (iIntValue + 999) / 1000;
                        if (i10 < 1) {
                            i10 = 1;
                        }
                        int i11 = i10 / 60;
                        int i12 = i10 % 60;
                        if (i11 <= 0) {
                            strM6836i = AbstractC3199a.m6836i(i12, "秒");
                        } else if (i12 == 0) {
                            strM6836i = AbstractC3199a.m6836i(i11, "分钟");
                        } else {
                            strM6836i = i11 + "分" + i12 + "秒";
                        }
                        arrayList.add(strM6836i);
                    }
                }
                if (str7 != null && !AbstractC3149m.m6721t0(str7)) {
                    strM3739a2 = c1370k == null ? c1370k.m3739a(str7) : null;
                    if (strM3739a2 == null) {
                        strM3739a2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    strM5226e3 = m5226e(strM3739a2);
                    if (strM5226e3.equals(str7)) {
                        strM5226e3 = null;
                    }
                    if (strM5226e3 == null) {
                        strM5226e3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    arrayList.add(!AbstractC3149m.m6721t0(strM5226e3) ? str7 : AbstractC4855en.m9265i(strM5226e3, "（", str7, "）"));
                }
                if (strM9265i != null && !AbstractC3149m.m6721t0(strM9265i)) {
                    strM3739a = c1370k == null ? c1370k.m3739a(strM9265i) : null;
                    if (strM3739a == null) {
                        strM3739a = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    strM5226e = m5226e(strM3739a);
                    if (strM5226e.equals(strM9265i)) {
                        strM5226e = null;
                    }
                    if (strM5226e == null) {
                        strM5226e = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    if (str7 != null && !AbstractC3149m.m6721t0(str7)) {
                        if (c1370k != null) {
                            strM3731t = null;
                        } else if (TextUtils.isEmpty(strM9265i)) {
                            strM3731t = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            strM3731t = c1370k.f4555b.m3731t(str7, strM9265i);
                            if (TextUtils.isEmpty(strM3731t)) {
                                strM3731t = strM9265i;
                            } else if (strM3731t == null) {
                            }
                        }
                        if (strM3731t == null) {
                            strM3731t = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        strM5226e2 = m5226e(strM3731t);
                        if (strM5226e2.equals(strM9265i)) {
                            strM5226e2 = null;
                        }
                        if (strM5226e2 != null) {
                            str3 = strM5226e2;
                        }
                    }
                    List listM101y0 = AbstractC0000a.m101y0(strM5226e, str3);
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj5 : listM101y0) {
                        if (!AbstractC3149m.m6721t0((String) obj5)) {
                            arrayList4.add(obj5);
                        }
                    }
                    listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4));
                    if (!listM8407P1.isEmpty()) {
                        strM9265i = AbstractC4855en.m9265i(AbstractC4166m.m8392A1(listM8407P1, " / ", null, null, null, 62), "（", strM9265i, "）");
                    }
                    arrayList.add(strM9265i);
                }
                String strM8392A1 = AbstractC4166m.m8392A1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)), " · ", null, null, null, 62);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                superclass = obj3.getClass();
                while (superclass != null && !superclass.equals(Object.class)) {
                    it3 = KavaReflector.declaredFields(superclass).iterator();
                    while (it3.hasNext()) {
                        Field next8 = it3.next();
                        if (next8.getType().isPrimitive() || AbstractC1416l.m3825a(next8.getType(), String.class)) {
                            cls = superclass;
                            it4 = it3;
                            obj3 = obj;
                            superclass = cls;
                            it3 = it4;
                        } else {
                            Object field4 = KavaReflector.readField(next8, obj3);
                            if (field4 != null) {
                                ArrayList arrayList5 = new ArrayList();
                                for (Class<?> superclass3 = field4.getClass(); superclass3 != null && !superclass3.equals(Object.class); superclass3 = superclass3.getSuperclass()) {
                                    for (Field field5 : KavaReflector.declaredFields(superclass3)) {
                                        if (Collection.class.isAssignableFrom(field5.getType())) {
                                            Object field6 = KavaReflector.readField(field5, field4);
                                            Collection collection2 = field6 instanceof Collection ? (Collection) field6 : null;
                                            if (collection2 != null) {
                                                if (collection2.isEmpty()) {
                                                    cls2 = superclass;
                                                    it5 = it3;
                                                    superclass = cls2;
                                                    it3 = it5;
                                                } else {
                                                    Collection collection3 = collection2;
                                                    if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                                                        Iterator it12 = collection3.iterator();
                                                        while (it12.hasNext()) {
                                                            Collection collection4 = collection3;
                                                            if (it12.next() instanceof String) {
                                                                collection3 = collection4;
                                                            } else {
                                                                cls2 = superclass;
                                                                it5 = it3;
                                                                superclass = cls2;
                                                                it3 = it5;
                                                            }
                                                        }
                                                    }
                                                    Collection collection5 = collection3;
                                                    ArrayList arrayList6 = new ArrayList();
                                                    for (Object obj6 : collection5) {
                                                        Class<?> cls3 = superclass;
                                                        Iterator<Field> it13 = it3;
                                                        if (obj6 instanceof String) {
                                                            arrayList6.add(obj6);
                                                        }
                                                        superclass = cls3;
                                                        it3 = it13;
                                                    }
                                                    cls2 = superclass;
                                                    it5 = it3;
                                                    AbstractC4171r.m8432h1(arrayList5, arrayList6);
                                                    superclass = cls2;
                                                    it3 = it5;
                                                }
                                            }
                                        }
                                    }
                                }
                                cls = superclass;
                                it4 = it3;
                                ArrayList arrayList7 = new ArrayList(AbstractC4167n.m8429e1(arrayList5));
                                Iterator it14 = arrayList5.iterator();
                                while (it14.hasNext()) {
                                    arrayList7.add(m5229h((String) it14.next()));
                                }
                                ArrayList arrayList8 = new ArrayList();
                                for (Object obj7 : arrayList7) {
                                    if (m5233o((String) obj7)) {
                                        arrayList8.add(obj7);
                                    }
                                }
                                Iterator it15 = arrayList8.iterator();
                                while (it15.hasNext()) {
                                    linkedHashSet.add(AbstractC3149m.m6701P0(24, (String) it15.next()));
                                }
                                obj3 = obj;
                                superclass = cls;
                                it3 = it4;
                            } else {
                                obj3 = obj;
                            }
                        }
                    }
                    superclass = superclass.getSuperclass();
                    obj3 = obj;
                }
                return new C2098i(j3, i9, str2, strM8392A1, jLongValue2, j5, AbstractC4166m.m8403L1(8, linkedHashSet));
            }
            it10 = it11;
        }
        obj2 = null;
        strM9265i = (String) obj2;
        WeChatApis.contact().getClass();
        c1370k = WeChatApis.userApi;
        arrayList = new ArrayList();
        arrayList.add(strM2249l);
        if (strM2249l.equals("语音")) {
        }
        if (str7 != null) {
            if (c1370k == null) {
            }
            if (strM3739a2 == null) {
            }
            strM5226e3 = m5226e(strM3739a2);
            if (strM5226e3.equals(str7)) {
            }
            if (strM5226e3 == null) {
            }
            arrayList.add(!AbstractC3149m.m6721t0(strM5226e3) ? str7 : AbstractC4855en.m9265i(strM5226e3, "（", str7, "）"));
        }
        if (strM9265i != null) {
            if (c1370k == null) {
            }
            if (strM3739a == null) {
            }
            strM5226e = m5226e(strM3739a);
            if (strM5226e.equals(strM9265i)) {
            }
            if (strM5226e == null) {
            }
            if (str7 != null) {
                if (c1370k != null) {
                }
                if (strM3731t == null) {
                }
                strM5226e2 = m5226e(strM3731t);
                if (strM5226e2.equals(strM9265i)) {
                }
                if (strM5226e2 != null) {
                }
            }
            List listM101y02 = AbstractC0000a.m101y0(strM5226e, str3);
            ArrayList arrayList42 = new ArrayList();
            while (r1.hasNext()) {
            }
            listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList42));
            if (!listM8407P1.isEmpty()) {
            }
            arrayList.add(strM9265i);
        }
        String strM8392A12 = AbstractC4166m.m8392A1(AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList)), " · ", null, null, null, 62);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        superclass = obj3.getClass();
        while (superclass != null) {
            it3 = KavaReflector.declaredFields(superclass).iterator();
            while (it3.hasNext()) {
            }
            superclass = superclass.getSuperclass();
            obj3 = obj;
        }
        return new C2098i(j3, i9, str2, strM8392A12, jLongValue2, j5, AbstractC4166m.m8403L1(8, linkedHashSet2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final Object m5242j() {
        Class<?> cls;
        Method method;
        Object objInvoke;
        DexFinder dexFinder = this.f7008b;
        dexFinder.resolveFavoriteApi();
        Method method2 = dexFinder.favoriteServiceResolverMethod;
        if (method2 == null || (cls = dexFinder.favoriteServiceClass) == null || (method = dexFinder.favoriteStorageGetterMethod) == null || (objInvoke = KavaReflector.invoke(method2, null, cls)) == null) {
            return null;
        }
        return KavaReflector.invoke(method, objInvoke, new Object[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073 A[PHI: r10
  0x0073: PHI (r10v4 java.lang.reflect.Constructor<?>) = (r10v3 java.lang.reflect.Constructor<?>), (r10v11 java.lang.reflect.Constructor<?>) binds: [B:19:0x005a, B:27:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0112  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5243n(Method method, Context context, String str, Object obj) throws NoSuchMethodException {
        Object next;
        Object objNewInstance;
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length == 5) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(obj);
            KavaReflector.invokeOrThrow(method, null, context, str, HttpUrl.FRAGMENT_ENCODE_SET, linkedList, null);
            return;
        }
        Class<?> cls = this.f7008b.favoriteSendParamClass;
        if (cls == null && (cls = (Class) AbstractC4165l.m8366C0(1, parameterTypes)) == null) {
            C2104o.m5276A("favorite request class missing");
            return;
        }
        Iterator<T> it = KavaReflector.declaredConstructors(cls).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Class<?>[] parameterTypes2 = ((Constructor) next).getParameterTypes();
            parameterTypes2.getClass();
            if (parameterTypes2.length == 0) {
                break;
            }
        }
        Constructor<?> constructorFindConstructor = (Constructor) next;
        boolean z9 = false;
        if (constructorFindConstructor == null) {
            constructorFindConstructor = KavaReflector.findConstructor(cls, new Class[0]);
            if (constructorFindConstructor != null) {
                Class<?>[] parameterTypes3 = constructorFindConstructor.getParameterTypes();
                parameterTypes3.getClass();
                if (parameterTypes3.length != 0) {
                    constructorFindConstructor = null;
                }
                if (constructorFindConstructor != null) {
                    objNewInstance = KavaReflector.newInstance(constructorFindConstructor, new Object[0]);
                    if (objNewInstance != null) {
                        LinkedList linkedList2 = new LinkedList();
                        linkedList2.add(obj);
                        boolean z10 = false;
                        int i9 = 0;
                        for (Class<?> superclass = objNewInstance.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                            for (Field field : KavaReflector.declaredFields(superclass)) {
                                if (!KavaReflector.isStatic(field)) {
                                    if (AbstractC1416l.m3825a(field.getType(), String.class)) {
                                        int i10 = i9 + 1;
                                        String str2 = i9 == 0 ? str : HttpUrl.FRAGMENT_ENCODE_SET;
                                        if (KavaReflector.writeField(field, objNewInstance, str2) && AbstractC1416l.m3825a(str2, str)) {
                                            z9 = true;
                                        }
                                        i9 = i10;
                                    } else if (AbstractC1416l.m3825a(field.getType(), Boolean.TYPE) || AbstractC1416l.m3825a(field.getType(), Boolean.class)) {
                                        KavaReflector.writeField(field, objNewInstance, Boolean.FALSE);
                                    } else if (List.class.isAssignableFrom(field.getType()) && KavaReflector.writeField(field, objNewInstance, linkedList2)) {
                                        z10 = true;
                                    }
                                }
                            }
                        }
                        if (!z9 || !z10) {
                            objNewInstance = null;
                        }
                    }
                }
            }
        }
        if (objNewInstance != null) {
            KavaReflector.invokeOrThrow(method, null, context, objNewInstance, null);
        } else {
            C2104o.m5276A("favorite request build failed: ".concat(cls.getName()));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:38:0x0078 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0071  */
    /* JADX WARN: Type inference failed for: r0v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m5244q(int i9) {
        ?? c3959f;
        Object objInvoke;
        C2098i c2098iM5241i;
        DexFinder dexFinder = this.f7008b;
        dexFinder.resolveFavoriteApi();
        ?? r2 = 0;
        if (!m5240d()) {
            return null;
        }
        try {
            Object objInvoke2 = KavaReflector.invoke(dexFinder.favoriteServiceResolverMethod, null, dexFinder.favoriteServiceClass);
            if (objInvoke2 == null || (objInvoke = KavaReflector.invoke(dexFinder.favoriteStorageGetterMethod, objInvoke2, new Object[0])) == null) {
                c3959f = 0;
            } else {
                Object objInvoke3 = KavaReflector.invoke(dexFinder.favoriteListMethod, objInvoke, -1, Integer.valueOf(i9), Collections.EMPTY_LIST, Collections.EMPTY_SET, null);
                List list = objInvoke3 instanceof List ? (List) objInvoke3 : null;
                if (list != null) {
                    c3959f = new ArrayList();
                    for (Object obj : list) {
                        if (obj == null || (c2098iM5241i = m5241i(obj)) == null) {
                            c2098iM5241i = null;
                        } else {
                            m5238b(obj, c2098iM5241i.f7019a);
                        }
                        if (c2098iM5241i != null) {
                            c3959f.add(c2098iM5241i);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null) {
            r2 = c3959f;
        } else {
            C2005i.m4939f("调用微信原生收藏列表失败: " + thM8182b.getMessage());
        }
        return (List) r2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Object m5245r(long j3) {
        Object obj;
        DexFinder dexFinder;
        Class<?> cls;
        Object c3959f;
        if (j3 > 0) {
            synchronized (this.f7012f) {
                obj = this.f7012f.get(Long.valueOf(j3));
            }
            if (obj != null) {
                return obj;
            }
            Object objM5242j = m5242j();
            if (objM5242j != null && (cls = (dexFinder = this.f7008b).favoriteItemClass) != null) {
                Method method = dexFinder.favoriteGetMethod;
                C4329c c4329cM7E = AbstractC0000a.m7E();
                if (method != null) {
                    c4329cM7E.add(method);
                }
                List<Method> listDeclaredMethods = KavaReflector.declaredMethods(objM5242j.getClass());
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = listDeclaredMethods.iterator();
                while (true) {
                    boolean z9 = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Method method2 = (Method) next;
                    if (!KavaReflector.isStatic(method2) && method2.getParameterTypes().length == 1 && AbstractC1416l.m3825a(method2.getParameterTypes()[0], Long.TYPE) && cls.isAssignableFrom(method2.getReturnType())) {
                        z9 = true;
                    }
                    if (z9) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (!AbstractC1416l.m3825a((Method) obj2, method)) {
                        arrayList2.add(obj2);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    c4329cM7E.add((Method) it2.next());
                }
                ListIterator listIterator = AbstractC0000a.m90t(c4329cM7E).listIterator(0);
                while (true) {
                    C4327a c4327a = (C4327a) listIterator;
                    if (!c4327a.hasNext()) {
                        C2005i.m4939f("调用微信原生收藏读取失败: localId 未匹配");
                        break;
                    }
                    try {
                        c3959f = KavaReflector.invoke((Method) c4327a.next(), objM5242j, Long.valueOf(j3));
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (c3959f instanceof C3959f) {
                        c3959f = null;
                    }
                    if (c3959f != null) {
                        Number numberM5232m = m5232m(c3959f, "field_localId", "localId");
                        Long lValueOf = numberM5232m != null ? Long.valueOf(numberM5232m.longValue()) : null;
                        if (lValueOf != null && lValueOf.longValue() == j3) {
                            m5238b(c3959f, j3);
                            return c3959f;
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final C2096g m5246s() {
        C2098i c2098iM5241i;
        synchronized (this.f7014h) {
            if (!this.f7016j) {
                Collection collectionValues = this.f7013g.values();
                collectionValues.getClass();
                return new C2096g(AbstractC4166m.m8407P1(collectionValues), false, false);
            }
            List listM5250w = m5250w(this.f7015i);
            if (listM5250w == null) {
                this.f7016j = false;
                Collection collectionValues2 = this.f7013g.values();
                collectionValues2.getClass();
                return new C2096g(AbstractC4166m.m8407P1(collectionValues2), false, false);
            }
            if (listM5250w.isEmpty()) {
                this.f7016j = false;
                Collection collectionValues3 = this.f7013g.values();
                collectionValues3.getClass();
                return new C2096g(AbstractC4166m.m8407P1(collectionValues3), false, false);
            }
            for (Object obj : listM5250w) {
                if (obj != null && (c2098iM5241i = m5241i(obj)) != null) {
                    m5238b(obj, c2098iM5241i.f7019a);
                    this.f7013g.put(Long.valueOf(c2098iM5241i.f7019a), c2098iM5241i);
                }
            }
            this.f7016j = listM5250w.size() >= 20;
            if (this.f7016j) {
                this.f7015i = m5247t(listM5250w, this.f7015i);
                if (this.f7015i <= 0) {
                    this.f7016j = false;
                }
            }
            if (AbstractC3149m.m6721t0(this.f7017k)) {
                Collection collectionValues4 = this.f7013g.values();
                collectionValues4.getClass();
                C2098i c2098i = (C2098i) AbstractC4166m.m8423u1(collectionValues4);
                this.f7017k = c2098i != null ? c2098i.f7019a + ":" + c2098i.f7024f : "empty";
            }
            Collection collectionValues5 = this.f7013g.values();
            collectionValues5.getClass();
            return new C2096g(AbstractC4166m.m8407P1(collectionValues5), this.f7016j, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m5247t(List list, long j3) {
        Number number;
        Number numberM5232m;
        Method method = this.f7008b.favoriteListCursorMethod;
        if (method != null) {
            if (j3 != 0) {
                Object objInvoke = KavaReflector.invoke(method, null, Long.valueOf(j3), -1, 20);
                number = !(objInvoke instanceof Number) ? (Number) objInvoke : null;
                if (number != null) {
                    long jLongValue = number.longValue();
                    Long lValueOf = (jLongValue > 0L ? 1 : (jLongValue == 0L ? 0 : -1)) > 0 && (jLongValue > j3 ? 1 : (jLongValue == j3 ? 0 : -1)) != 0 ? Long.valueOf(jLongValue) : null;
                    if (lValueOf != null) {
                        return lValueOf.longValue();
                    }
                }
            } else {
                Object objM8394C1 = AbstractC4166m.m8394C1(list);
                if (objM8394C1 != null && (numberM5232m = m5232m(objM8394C1, "field_updateTime", "updateTime")) != null) {
                    j3 = numberM5232m.longValue();
                    Object objInvoke2 = KavaReflector.invoke(method, null, Long.valueOf(j3), -1, 20);
                    if (!(objInvoke2 instanceof Number)) {
                    }
                    if (number != null) {
                    }
                }
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final C2096g m5248u() {
        String str;
        List listM5244q = m5244q(1);
        if (listM5244q == null) {
            return m5239c();
        }
        C2098i c2098i = (C2098i) AbstractC4166m.m8424v1(listM5244q);
        if (c2098i != null) {
            str = c2098i.f7019a + ":" + c2098i.f7024f;
        } else {
            str = "empty";
        }
        synchronized (this.f7014h) {
            boolean zIsEmpty = this.f7013g.isEmpty();
            boolean z9 = !zIsEmpty;
            if (!zIsEmpty && str.equals(this.f7017k)) {
                Collection collectionValues = this.f7013g.values();
                collectionValues.getClass();
                return new C2096g(AbstractC4166m.m8407P1(collectionValues), this.f7016j, false);
            }
            this.f7013g.clear();
            synchronized (this.f7012f) {
                this.f7012f.clear();
            }
            this.f7015i = 0L;
            this.f7016j = true;
            this.f7017k = str;
            C2096g c2096gM5246s = m5246s();
            List list = c2096gM5246s.f7004a;
            boolean z10 = c2096gM5246s.f7005b;
            list.getClass();
            return new C2096g(list, z10, z9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final String m5249v(long j3) {
        Object objM5182f;
        Object objM5245r = m5245r(j3);
        if (objM5245r == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = C2093d.f6997a;
        C2026t c2026t = new C2026t(2, this, AbstractC0921a.m2246i(C2097h.class), "logFavoriteVoice", "logFavoriteVoice(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 1);
        ClassLoader classLoader = this.f7009c;
        classLoader.getClass();
        int iM5181e = C2093d.m5181e(objM5245r);
        if ((iM5181e != 2 && iM5181e != 4) || (objM5182f = C2093d.m5182f(objM5245r)) == null) {
            return null;
        }
        String str = iM5181e == 4 ? "mp4" : "jpg";
        Context context = this.f7007a;
        return (String) AbstractC3015m.m6411U(AbstractC3015m.m6414X(new C0795n(C2093d.m5180d(context, classLoader, this.f7010d, objM5182f, c2026t), 6), new C0153s(context, classLoader, str)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m5250w(long j3) {
        Object objM5242j;
        Object c3959f;
        DexFinder dexFinder = this.f7008b;
        dexFinder.resolveFavoriteApi();
        Object obj = null;
        if (!m5240d() || (objM5242j = m5242j()) == null) {
            return null;
        }
        try {
            if (j3 == 0) {
                Object objInvoke = KavaReflector.invoke(dexFinder.favoriteListMethod, objM5242j, -1, 20, Collections.EMPTY_LIST, Collections.EMPTY_SET, null);
                c3959f = objInvoke instanceof List ? (List) objInvoke : null;
            } else {
                Method method = dexFinder.favoriteListNextMethod;
                if (method != null) {
                    Object objInvoke2 = KavaReflector.invoke(method, objM5242j, Long.valueOf(j3), -1, Collections.EMPTY_LIST, Collections.EMPTY_SET, null);
                    if (objInvoke2 instanceof List) {
                        c3959f = (List) objInvoke2;
                    }
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null) {
            obj = c3959f;
        } else {
            C2005i.m4939f("调用微信原生收藏分页失败: " + thM8182b.getMessage());
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final C2092c m5251y(Object obj) {
        Object objM5182f;
        ConcurrentHashMap concurrentHashMap = C2093d.f6997a;
        C2026t c2026t = new C2026t(2, this, AbstractC0921a.m2246i(C2097h.class), "logFavoriteVoice", "logFavoriteVoice(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 2);
        ClassLoader classLoader = this.f7009c;
        classLoader.getClass();
        if (C2093d.m5181e(obj) == 3 && (objM5182f = C2093d.m5182f(obj)) != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Context context = this.f7007a;
            Iterator it = C2093d.m5180d(context, classLoader, this.f7010d, objM5182f, c2026t).iterator();
            while (it.hasNext()) {
                linkedHashSet.add((String) it.next());
            }
            String strM5189m = C2093d.m5189m(classLoader, objM5182f);
            if (strM5189m != null) {
                linkedHashSet.add(strM5189m);
            }
            String strM5189m2 = C2093d.m5189m(classLoader, obj);
            if (strM5189m2 != null) {
                linkedHashSet.add(strM5189m2);
            }
            String str = (String) AbstractC3015m.m6411U(AbstractC3015m.m6414X(new C0795n(linkedHashSet, 6), new C0446i(context, 23, classLoader)));
            if (str != null) {
                Number numberM5183g = C2093d.m5183g(objM5182f, "y", "duration", "length");
                Integer numM5187k = C2093d.m5187k(numberM5183g != null ? Long.valueOf(numberM5183g.longValue()) : null);
                return new C2092c(str, numM5187k != null ? numM5187k.intValue() : 1000);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5252z(long j3, String str) {
        Object c3959f;
        Object obj;
        Method method;
        Object next;
        C3086j c3086jTasks;
        String str2;
        Boolean boolValueOf;
        Method method2;
        Object c3959f2;
        str.getClass();
        if (AbstractC3149m.m6721t0(str) || j3 <= 0) {
            C2005i.m4939f("发送收藏失败: talker/localId 为空");
            return false;
        }
        Object objM5245r = m5245r(j3);
        if (objM5245r == null) {
            C2005i.m4939f("发送收藏失败: 未找到收藏 localId=" + j3);
            return false;
        }
        int iM5230k = m5230k(objM5245r);
        Context context = this.f7007a;
        if (iM5230k != 3) {
            if (iM5230k != 19) {
                str2 = str;
            } else {
                String strM5231l = m5231l(objM5245r);
                String strM5223C = m5223C(strM5231l, "appbranditem");
                if (AbstractC3149m.m6721t0(strM5223C)) {
                    str2 = str;
                    boolValueOf = null;
                    if (boolValueOf != null) {
                        return boolValueOf.booleanValue();
                    }
                } else {
                    String strM5224D = m5224D(strM5223C, "username");
                    if (!AbstractC3149m.m6721t0(strM5224D)) {
                        String strM5224D2 = m5224D(strM5223C, "pagepath");
                        String strM5224D3 = m5224D(strM5223C, "appid");
                        String strM5224D4 = m5224D(strM5231l, "desc", "datatitle", "title");
                        if (AbstractC3149m.m6721t0(strM5224D4)) {
                            strM5224D4 = "小程序";
                        }
                        String strM5224D5 = m5224D(strM5231l, "datadesc", "sourcedisplayname");
                        C2105p c2105pMedia = WeChatApis.media();
                        if (c2105pMedia != null) {
                            str2 = str;
                            boolean zM5302b = c2105pMedia.m5302b(str2, AbstractC3149m.m6701P0(128, strM5224D4), AbstractC3149m.m6701P0(Opcodes.ACC_NATIVE, strM5224D5), strM5224D, strM5224D2, new byte[0], strM5224D3);
                            if (!zM5302b) {
                                C2005i.m4939f("发送收藏小程序失败: 公共小程序 API 未成功");
                            }
                            boolValueOf = Boolean.valueOf(zM5302b);
                        }
                        if (boolValueOf != null) {
                        }
                    }
                }
            }
            DexFinder dexFinder = this.f7008b;
            dexFinder.resolveFavoriteApi();
            dexFinder.resolveFavoriteApi();
            if (dexFinder.favoriteItemClass == null || dexFinder.favoriteGetMethod == null || (method2 = dexFinder.favoriteSendMethod) == null) {
                C2005i.m4939f("发送收藏失败: API 未就绪");
                return false;
            }
            Activity activityM7263a = this.f7011e.m7263a();
            if (activityM7263a != null) {
                context = activityM7263a;
            }
            try {
                m5243n(method2, context, str2, objM5245r);
                c3959f2 = Boolean.TRUE;
            } catch (Throwable th2) {
                c3959f2 = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f2);
            if (thM8182b != null) {
                C2005i.m4939f("发送收藏异常: " + thM8182b.getMessage());
                c3959f2 = Boolean.FALSE;
            }
            return ((Boolean) c3959f2).booleanValue();
        }
        C2092c c2092cM5251y = m5251y(objM5245r);
        if (c2092cM5251y != null) {
            return m5237B(str, c2092cM5251y);
        }
        ConcurrentHashMap concurrentHashMap = C2093d.f6997a;
        C2026t c2026t = new C2026t(2, this, AbstractC0921a.m2246i(C2097h.class), "logFavoriteVoice", "logFavoriteVoice(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 3);
        ClassLoader classLoader = this.f7009c;
        classLoader.getClass();
        if (C2093d.m5181e(objM5245r) != 3) {
            C2005i.m4939f("发送收藏语音失败: 文件不存在且无法启动下载");
        } else {
            Class<?> cls = objM5245r.getClass();
            ConcurrentHashMap concurrentHashMap2 = C2093d.f6998b;
            Method method3 = (Method) concurrentHashMap2.get(cls);
            if (method3 == null || !C2093d.m5185i(cls, method3)) {
                SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_favorite_voice_method_cache");
                String strM2091g = C0828b.m2091g(context, classLoader);
                String strConcat = "fav_voice_download_v1_".concat(cls.getName());
                Method methodM2087c = C0828b.m2087c(sharedPreferencesM8640c, strM2091g, classLoader, strConcat);
                if (methodM2087c == null || !C2093d.m5185i(cls, methodM2087c)) {
                    DexKitBridge dexKitBridge = this.f7010d;
                    if (dexKitBridge == null) {
                        method = null;
                    } else {
                        try {
                            C0570e c0570e = new C0570e();
                            C1253k c1253k = new C1253k();
                            C1253k.m3367u0(c1253k, AbstractC0000a.m101y0("key_detail_data_id", "key_detail_info_id", "get fav item info error"));
                            c0570e.f1764h = c1253k;
                            C3010h c3010h = new C3010h(AbstractC3015m.m6414X(new C0791j(AbstractC4166m.m8415m1(dexKitBridge.findMethod(c0570e)), new C1955z(8), C3019q.f9816n), new C0136d0(classLoader)));
                            while (true) {
                                if (!c3010h.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = c3010h.next();
                                if (C2093d.m5185i(cls, (Method) next)) {
                                    break;
                                }
                            }
                            Method method4 = (Method) next;
                            if (method4 != null) {
                                concurrentHashMap2.put(cls, method4);
                                C0828b.m2092h(sharedPreferencesM8640c, strM2091g, strConcat, method4);
                                c3959f = method4;
                            } else {
                                c3959f = null;
                            }
                        } catch (Throwable th3) {
                            c3959f = new C3959f(th3);
                        }
                        Throwable thM8182b2 = C3960g.m8182b(c3959f);
                        if (thM8182b2 == null) {
                            obj = c3959f;
                        } else {
                            c2026t.invoke("收藏语音定位下载方法失败", thM8182b2);
                            obj = null;
                        }
                        method = (Method) obj;
                    }
                } else {
                    concurrentHashMap2.put(cls, methodM2087c);
                    method = methodM2087c;
                }
            } else {
                method = method3;
            }
            if (method != null && (c3086jTasks = WeChatApis.tasks()) != null) {
                c3086jTasks.m6554e(new RunnableC0059l(method, objM5245r, c2026t, 17));
                C3086j c3086jTasks2 = WeChatApis.tasks();
                if (c3086jTasks2 != null) {
                    String str3 = str + ":" + j3;
                    if (this.f7018l.add(str3)) {
                        c3086jTasks2.m6553d(new RunnableC0217c((Object) this, str3, objM5245r, (Object) str, 8));
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
