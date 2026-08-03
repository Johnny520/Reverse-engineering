package p109hb;

import ac.C0058k;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import bb.C0240b;
import ch.C0570e;
import gg.AbstractC1416l;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p010aa.C0035c;
import p011ab.C0042b;
import p024b9.RunnableC0217c;
import p035c8.C0412a;
import p051db.C0763a;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1236q;
import p086fh.C1253k;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1727l;
import p115hh.C1730o;
import p115hh.C1731p;
import p115hh.C1732q;
import p136j8.AbstractC2091b;
import p136j8.C2095f;
import p136j8.C2105p;
import p136j8.C2113x;
import p136j8.C2114y;
import p153k8.C2356t;
import p167l8.C2529d;
import p183m8.C2813a;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: hb.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1687k {

    /* JADX INFO: renamed from: a */
    public final C3742g f5600a;

    /* JADX INFO: renamed from: b */
    public final C0042b f5601b;

    /* JADX INFO: renamed from: c */
    public final Handler f5602c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f5603d;

    /* JADX INFO: renamed from: e */
    public final ArrayDeque f5604e;

    /* JADX INFO: renamed from: f */
    public volatile C1679g f5605f;

    /* JADX INFO: renamed from: g */
    public C1683i f5606g;

    /* JADX INFO: renamed from: h */
    public Object f5607h;

    /* JADX INFO: renamed from: i */
    public RunnableC0217c f5608i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f5609j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1687k(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f5600a = c3742g;
        this.f5601b = c0042b;
        this.f5602c = new Handler(Looper.getMainLooper());
        this.f5603d = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_selected_message_method_cache");
        this.f5604e = new ArrayDeque();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1697t m4289b(C0763a c0763a, int i9) {
        int i10;
        int i11;
        String str;
        String str2;
        int i12 = c0763a.f2286a;
        C2356t c2356t = null;
        if (i12 == 0) {
            i10 = 1;
        } else if (i12 == 1) {
            i10 = 3;
        } else if (i12 == 2) {
            i10 = 43;
        } else if (i12 == 4) {
            i10 = 47;
        } else {
            if (i12 != 5) {
                if (i12 == 6) {
                    i10 = 49;
                }
                return null;
            }
            i10 = 34;
        }
        String string = AbstractC3149m.m6703R0(c0763a.f2287b).toString();
        if (!AbstractC3149m.m6721t0(string)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (i10 == 3 || i10 == 43 || i10 == 47) {
                long j3 = jCurrentTimeMillis + ((long) i9);
                long length = new File(string).length();
                if (length > 2147483647L) {
                    length = 2147483647L;
                }
                i11 = i10;
                str = string;
                c2356t = new C2356t(i11, 2, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, str, j3, (int) length);
            } else {
                str = string;
                i11 = i10;
            }
            long j4 = jCurrentTimeMillis + ((long) i9);
            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (i11 == 1 || i11 == 49) {
                str2 = str;
            } else {
                str2 = str;
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String str4 = i11 == 43 ? str2 : HttpUrl.FRAGMENT_ENCODE_SET;
            if (i11 == 34) {
                str3 = str2;
            }
            return new C1697t(j4, i11, HttpUrl.FRAGMENT_ENCODE_SET, str, str4, jCurrentTimeMillis, c2356t, str3, 0, null, null, 1536);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static ArrayList m4290c(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                int i10 = i9 + 1;
                if (i9 < 0) {
                    AbstractC0000a.m32Q0();
                    throw null;
                }
                C1697t c1697tM4289b = m4289b((C0763a) next, i9);
                if (c1697tM4289b == null) {
                    break;
                }
                arrayList2.add(c1697tM4289b);
                i9 = i10;
            } else if (!arrayList2.isEmpty()) {
                return arrayList2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m4291e(C1697t c1697t) {
        C2356t c2356t = c1697t.f5652g;
        String str = c2356t != null ? c2356t.f7746f : null;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = AbstractC3149m.m6703R0(str).toString();
        if (!AbstractC0921a.m2262y(string)) {
            Pattern patternCompile = Pattern.compile("[0-9a-fA-F]{32}");
            patternCompile.getClass();
            string.getClass();
            if (!patternCompile.matcher(string).matches()) {
                C2356t c2356t2 = c1697t.f5652g;
                String str3 = c2356t2 != null ? c2356t2.f7743c : null;
                if (str3 != null) {
                    str2 = str3;
                }
                if (AbstractC3149m.m6721t0(str2)) {
                    str2 = c1697t.f5649d;
                }
                WeChatMessage.Companion.getClass();
                string = C2529d.m5947m(str2, "md5");
                if (AbstractC3149m.m6721t0(string)) {
                    return C2529d.m5949o(str2, "md5");
                }
            }
        }
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r1 != 62) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1 A[RETURN] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4292h(C1697t c1697t, C1679g c1679g) {
        boolean zM4334b;
        boolean zM6721t0;
        C2114y c2114y;
        c1697t.getClass();
        String str = c1697t.f5649d;
        int i9 = c1697t.f5647b & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        if (i9 == 1 || i9 == 3 || i9 == 34 || i9 == 43 || i9 == 47) {
            zM4334b = true;
        } else if (i9 == 49) {
            zM4334b = c1697t.m4334b();
        } else if (i9 != 62) {
            zM4334b = false;
        }
        if (zM4334b) {
            if (i9 == 1) {
                zM6721t0 = AbstractC3149m.m6721t0(str);
            } else if (i9 == 3) {
                C2356t c2356t = c1697t.f5652g;
                String str2 = c2356t != null ? c2356t.f7746f : null;
                if (str2 == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (!new File(str2).isFile() || c1679g.f5563e == null || c1679g.f5562d == null) {
                }
            } else if (i9 != 34) {
                if (i9 == 43) {
                    zM6721t0 = AbstractC3149m.m6721t0(m4295p(c1697t));
                } else if (i9 != 47) {
                    if (i9 == 49) {
                        zM6721t0 = AbstractC3149m.m6721t0(str);
                    }
                } else if (c1679g.f5567i != null && !AbstractC3149m.m6721t0(m4291e(c1697t))) {
                    return true;
                }
            } else if (new File(c1697t.f5653h).isFile()) {
                C2105p c2105pMedia = WeChatApis.media();
                if ((c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null || !c2114y.m5307a()) ? false : true) {
                }
            }
            return !zM6721t0;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m4293j(List list) {
        if (list.isEmpty()) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1697t c1697t = (C1697t) it.next();
            if ((c1697t.f5647b & Settings.DEFAULT_INITIAL_WINDOW_SIZE) == 47 && m4294k(c1697t) == null) {
                return "无法读取原生群发表情";
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066 A[Catch: all -> 0x004f, TryCatch #0 {all -> 0x004f, blocks: (B:14:0x0025, B:16:0x0030, B:19:0x0038, B:22:0x0044, B:24:0x004a, B:33:0x0066, B:35:0x007d, B:36:0x0081, B:38:0x0085, B:40:0x008d, B:42:0x009b, B:43:0x009f, B:45:0x00a3, B:47:0x00ab, B:52:0x00bd, B:54:0x00c3, B:60:0x00d9, B:63:0x00dd, B:65:0x00e3, B:70:0x00f2, B:75:0x00fd, B:27:0x0052, B:30:0x005e), top: B:79:0x0025 }] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0412a m4294k(C1697t c1697t) {
        C2105p c2105pMedia;
        C2095f c2095f;
        String strM5197k;
        Object objM5207g;
        String strM4291e = m4291e(c1697t);
        if (!AbstractC3149m.m6721t0(strM4291e) && (c2105pMedia = WeChatApis.media()) != null && (c2095f = c2105pMedia.f7038d) != null && !TextUtils.isEmpty(strM4291e) && c2095f.m5201a()) {
            try {
                File file = new File(strM4291e);
                if (!file.isFile()) {
                    strM5197k = C2095f.m5197k(strM4291e);
                    if (!TextUtils.isEmpty(strM5197k)) {
                        objM5207g = c2095f.m5207g(strM5197k);
                        if (objM5207g == null) {
                        }
                    }
                } else if (c2095f.m5201a()) {
                    strM5197k = c2095f.m5205e(file);
                    if (!TextUtils.isEmpty(strM5197k)) {
                        objM5207g = c2095f.m5207g(strM5197k);
                        if (objM5207g == null) {
                            objM5207g = c2095f.m5212n(file, strM5197k);
                        }
                        if (objM5207g == null) {
                            String strM5198s = C2095f.m5198s(objM5207g, "getMd5", "field_md5");
                            int i9 = 0;
                            Object objInvokeMethod = KavaReflector.invokeMethod(objM5207g, "getSize", new Object[0]);
                            if (!(objInvokeMethod instanceof Number)) {
                                objInvokeMethod = KavaReflector.readField(objM5207g, "field_size");
                            }
                            int iIntValue = objInvokeMethod instanceof Number ? ((Number) objInvokeMethod).intValue() : 0;
                            Object objInvokeMethod2 = KavaReflector.invokeMethod(objM5207g, "getType", new Object[0]);
                            if (!(objInvokeMethod2 instanceof Number)) {
                                objInvokeMethod2 = KavaReflector.readField(objM5207g, "field_type");
                            }
                            int iIntValue2 = objInvokeMethod2 instanceof Number ? ((Number) objInvokeMethod2).intValue() : 0;
                            String strM5198s2 = C2095f.m5198s(objM5207g, "getContent", "field_content");
                            if (!TextUtils.isEmpty(strM5198s)) {
                                strM5197k = strM5198s;
                            }
                            if (iIntValue <= 0 && file.isFile()) {
                                long length = file.length();
                                if (length > 0) {
                                    i9 = length > 2147483647L ? Integer.MAX_VALUE : (int) length;
                                }
                                iIntValue = i9;
                            }
                            if (iIntValue2 <= 0 && file.isFile()) {
                                iIntValue2 = c2095f.m5208h(file.getAbsolutePath()) ? 2 : 1;
                            }
                            if (!TextUtils.isEmpty(strM5197k) && iIntValue > 0 && iIntValue2 > 0) {
                                return new C0412a(iIntValue, strM5197k, strM5198s2, iIntValue2);
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                c2095f.m5209j("准备群发表情异常: " + th2.getMessage());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m4295p(C1697t c1697t) {
        Object next;
        String strM970o;
        C2356t c2356t = c1697t.f5652g;
        String str = null;
        String str2 = c2356t != null ? c2356t.f7746f : null;
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM101y0 = AbstractC0000a.m101y0(str2, c1697t.f5650e);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM101y0));
        Iterator it = listM101y0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
        Iterator it2 = listM8407P1.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (AbstractC0921a.m2262y((String) next)) {
                break;
            }
        }
        String str3 = (String) next;
        if (str3 != null) {
            String absolutePath = new File(str3).getAbsolutePath();
            absolutePath.getClass();
            return absolutePath;
        }
        C2105p c2105pMedia = WeChatApis.media();
        C0240b c0240b = c2105pMedia != null ? c2105pMedia.f7037c : null;
        Iterator it3 = listM8407P1.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            String str4 = (String) it3.next();
            if (c0240b == null || (strM970o = c0240b.m970o(str4)) == null || AbstractC3149m.m6721t0(strM970o)) {
                strM970o = null;
            }
            if (strM970o != null) {
                str = strM970o;
                break;
            }
        }
        if (str != null) {
            return str;
        }
        String str5 = (String) AbstractC4166m.m8424v1(listM8407P1);
        return str5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m4296q(Object obj, String str, Serializable serializable) {
        Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(obj.getClass(), str);
        if (fieldFindFieldRecursive != null) {
            KavaReflector.writeField(fieldFindFieldRecursive, obj, serializable);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4297a(C1683i c1683i, boolean z9) {
        RunnableC0217c runnableC0217c = this.f5608i;
        Handler handler = this.f5602c;
        if (runnableC0217c != null) {
            handler.removeCallbacks(runnableC0217c);
        }
        this.f5608i = null;
        C1685j c1685j = (C1685j) AbstractC4166m.m8425w1(c1683i.f5580e, c1683i.f5577b);
        if (z9 && c1685j != null) {
            c1683i.f5581f = c1685j.f5592b.size() + c1683i.f5581f;
        }
        c1683i.f5580e++;
        handler.postDelayed(new RunnableC1675e(this, c1683i, 1), 500L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0208, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0255  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1677f m4298d(C1730o c1730o) {
        C1677f c1677f;
        Method methodFindMethodRecursive;
        List list = (List) c1730o.f5759s.getValue();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1732q) it.next()).f5760a);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str = ((C1727l) obj).m4347p().f8328g;
            Object arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            List list2 = (List) entry.getValue();
            Class<?> clsLoadClass = KavaReflector.loadClass(str2, this.f5600a.f12145c);
            if (clsLoadClass == null || (methodFindMethodRecursive = KavaReflector.findMethodRecursive(clsLoadClass, "toByteArray", new Class[0])) == null) {
                c1677f = null;
            } else {
                Class<?>[] parameterTypes = methodFindMethodRecursive.getParameterTypes();
                parameterTypes.getClass();
                Method method = parameterTypes.length == 0 && AbstractC1416l.m3825a(methodFindMethodRecursive.getReturnType(), byte[].class) ? methodFindMethodRecursive : null;
                if (method != null) {
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj2 : list2) {
                        if (hashSet.add(((C1727l) obj2).m4347p().f8329h)) {
                            arrayList4.add(obj2);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(clsLoadClass, ((C1727l) it2.next()).m4347p().f8329h);
                        if (fieldFindFieldRecursive != null) {
                            arrayList5.add(fieldFindFieldRecursive);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj3 : arrayList5) {
                        if (AbstractC1416l.m3825a(((Field) obj3).getType(), String.class)) {
                            arrayList6.add(obj3);
                        }
                    }
                    ArrayList arrayList7 = new ArrayList();
                    for (Object obj4 : arrayList5) {
                        if (AbstractC1416l.m3825a(((Field) obj4).getType(), Integer.TYPE)) {
                            arrayList7.add(obj4);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj5 : arrayList5) {
                        Field field = (Field) obj5;
                        if ((field.getType().isPrimitive() || AbstractC1416l.m3825a(field.getType(), String.class) || field.getType().isArray()) ? false : true) {
                            arrayList8.add(obj5);
                        }
                    }
                    if (arrayList6.size() == 2 && arrayList7.size() == 4 && arrayList8.size() == 1) {
                        Iterator<T> it3 = KavaReflector.declaredConstructors(clsLoadClass).iterator();
                        boolean z9 = false;
                        Object obj6 = null;
                        while (true) {
                            if (it3.hasNext()) {
                                Object next = it3.next();
                                Class<?>[] parameterTypes2 = ((Constructor) next).getParameterTypes();
                                parameterTypes2.getClass();
                                if (parameterTypes2.length == 0) {
                                    if (z9) {
                                        break;
                                    }
                                    z9 = true;
                                    obj6 = next;
                                }
                            } else if (!z9) {
                                break;
                            }
                        }
                        obj6 = null;
                        Constructor constructor = (Constructor) obj6;
                        if (constructor != null) {
                            Iterator<T> it4 = KavaReflector.declaredConstructors(((Field) arrayList8.get(0)).getType()).iterator();
                            boolean z10 = false;
                            Object obj7 = null;
                            while (true) {
                                if (it4.hasNext()) {
                                    Object next2 = it4.next();
                                    Class<?>[] parameterTypes3 = ((Constructor) next2).getParameterTypes();
                                    parameterTypes3.getClass();
                                    if (parameterTypes3.length == 0) {
                                        if (z10) {
                                            break;
                                        }
                                        z10 = true;
                                        obj7 = next2;
                                    }
                                } else if (!z10) {
                                    break;
                                }
                            }
                            Constructor constructor2 = (Constructor) obj7;
                            if (constructor2 != null) {
                                c1677f = new C1677f(constructor, method, (Field) arrayList6.get(0), (Field) arrayList7.get(0), (Field) arrayList7.get(1), (Field) arrayList8.get(0), constructor2, (Field) arrayList7.get(2), (Field) arrayList6.get(1), (Field) arrayList7.get(3));
                            }
                        }
                    }
                }
            }
            if (c1677f != null) {
                arrayList3.add(c1677f);
            }
        }
        return (C1677f) AbstractC4166m.m8400I1(arrayList3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0135  */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1696s m4299f(List list, List list2, InterfaceC1236q interfaceC1236q) {
        Integer numValueOf;
        int iIntValue;
        Method method;
        Iterator it;
        int i9;
        C2113x c2113x;
        C2105p c2105pMedia;
        C2114y c2114y;
        C1679g c1679gM4301i = this.f5605f;
        if (c1679gM4301i == null) {
            c1679gM4301i = m4301i();
            if (c1679gM4301i != null) {
                this.f5605f = c1679gM4301i;
            } else {
                c1679gM4301i = null;
            }
            if (c1679gM4301i == null) {
                return null;
            }
        }
        C1679g c1679g = c1679gM4301i;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list2));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            AbstractC2091b.m5171r((String) it2.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
        if (list.isEmpty() || listM8407P1.isEmpty()) {
            return null;
        }
        if (!list.isEmpty()) {
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                if (!m4292h((C1697t) it3.next(), c1679g)) {
                    return null;
                }
            }
        }
        ArrayList<C1681h> arrayList3 = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            C1697t c1697t = (C1697t) it4.next();
            int i10 = 65535 & c1697t.f5647b;
            C0412a c0412aM4294k = i10 == 47 ? m4294k(c1697t) : null;
            if (i10 == 34) {
                String str = c1697t.f5653h;
                int i11 = c1697t.f5654i;
                if (new File(str).isFile() && (c2105pMedia = WeChatApis.media()) != null && (c2114y = c2105pMedia.f7036b) != null) {
                    String str2 = c1697t.f5655j;
                    if (TextUtils.isEmpty(str2) || c2114y.f7061a.voiceFullPathMethod == null) {
                        c2113x = null;
                        if (c2113x == null) {
                            it = it4;
                        } else {
                            String str3 = c1697t.f5653h;
                            if (TextUtils.isEmpty(str3) || !c2114y.m5307a()) {
                                it = it4;
                                c2113x = null;
                            } else {
                                File file = new File(str3);
                                if (file.isFile()) {
                                    C0058k c0058kM5320p = c2114y.m5320p(file);
                                    if (c0058kM5320p != null) {
                                        File file2 = (File) c0058kM5320p.f177i;
                                        if (file2.isFile()) {
                                            it = it4;
                                            try {
                                                String str4 = (String) KavaReflector.invoke(c2114y.f7061a.voiceStartRecordMethod, null, "masssendapp", C2114y.m5306x(c0058kM5320p.f176h, file2.getAbsolutePath()));
                                                if (TextUtils.isEmpty(str4)) {
                                                    c2114y.m5317m("准备群发语音失败: 创建voiceinfo失败");
                                                } else {
                                                    String strM5315k = c2114y.m5315k(str4, true);
                                                    if (TextUtils.isEmpty(strM5315k)) {
                                                        c2114y.m5317m("准备群发语音失败: 获取语音目标路径失败");
                                                    } else if (c2114y.m5311e(file2, new File(strM5315k))) {
                                                        int iM5313i = c2114y.m5313i(Math.max(1, i11 > 0 ? i11 : C2114y.m5305h(str3)));
                                                        if (c2114y.m5314j(iM5313i, str4)) {
                                                            C2113x c2113x2 = new C2113x(str4, iM5313i);
                                                            c0058kM5320p.m358i();
                                                            c2113x = c2113x2;
                                                        } else {
                                                            c2114y.m5317m("准备群发语音失败: 完成voiceinfo失败");
                                                        }
                                                    } else {
                                                        c2114y.m5317m("准备群发语音失败: 复制语音文件失败 " + strM5315k);
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                try {
                                                    c2114y.m5317m("准备群发语音异常: " + th2.getMessage());
                                                } finally {
                                                    c0058kM5320p.m358i();
                                                }
                                            }
                                        } else {
                                            it = it4;
                                            c2114y.m5317m("准备群发语音失败: 音频转换失败 " + str3);
                                        }
                                    }
                                }
                                c2113x = null;
                            }
                        }
                        i9 = 47;
                    } else {
                        String strM5321q = c2114y.m5321q(str2);
                        if (!TextUtils.isEmpty(strM5321q) && AbstractC0921a.m2262y(strM5321q)) {
                            c2113x = new C2113x(str2, c2114y.m5313i(i11));
                        }
                        if (c2113x == null) {
                        }
                        i9 = 47;
                    }
                }
            } else {
                it = it4;
                i9 = 47;
                c2113x = null;
            }
            if (i10 == i9 && c0412aM4294k == null) {
                return null;
            }
            if (i10 == 34 && c2113x == null) {
                return null;
            }
            arrayList3.add(new C1681h(c1697t, c0412aM4294k, c2113x));
            it4 = it;
        }
        Method method2 = c1679g.f5565g;
        Object objInvoke = method2 != null ? KavaReflector.invoke(method2, null, new Object[0]) : null;
        if (objInvoke == null || (method = c1679g.f5566h) == null) {
            numValueOf = null;
        } else {
            Object objInvoke2 = KavaReflector.invoke(method, objInvoke, new Object[0]);
            Number number = objInvoke2 instanceof Number ? (Number) objInvoke2 : null;
            if (number != null) {
                numValueOf = Integer.valueOf(number.intValue());
            }
        }
        if (numValueOf == null) {
            iIntValue = 500;
        } else {
            if (numValueOf.intValue() <= 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            }
        }
        ArrayList<List> arrayListM8416n1 = AbstractC4166m.m8416n1(iIntValue, listM8407P1);
        ArrayList arrayList4 = new ArrayList();
        for (List list3 : arrayListM8416n1) {
            ArrayList arrayList5 = new ArrayList(AbstractC4167n.m8429e1(arrayList3));
            for (C1681h c1681h : arrayList3) {
                arrayList5.add(new C1685j(c1681h.f5571a, list3, c1681h.f5572b, c1681h.f5573c));
            }
            AbstractC4171r.m8432h1(arrayList4, arrayList5);
        }
        if (arrayList4.isEmpty()) {
            return null;
        }
        String string = UUID.randomUUID().toString();
        string.getClass();
        C1683i c1683i = new C1683i(string, arrayList4, listM8407P1.size() * list.size(), interfaceC1236q);
        this.f5602c.post(new RunnableC1675e(this, c1683i, 0));
        return new C1696s(new C0035c(this, 13, c1683i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4300g() {
        return this.f5605f != null && this.f5609j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:191:0x0363 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:212:0x0078 */
    /* JADX DEBUG: Type inference failed for r14v22. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX DEBUG: Type inference failed for r14v34. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Can't wrap try/catch for region: R(18:0|2|(16:179|7|(9:10|189|11|15|(1:17)|18|(3:213|20|216)(1:215)|214|8)|212|24|(1:26)|27|(1:29)|30|(4:33|(2:35|218)(1:219)|36|31)|217|37|(6:40|(2:41|(2:43|(1:226)(1:227))(2:225|46))|(1:48)(1:49)|(3:220|51|224)(1:223)|222|38)|221|52|(6:185|54|(1:56)|57|58|(2:60|228)(1:61))(1:63))|6|64|(6:66|(1:68)|69|(6:75|(2:76|(3:78|(3:198|83|201)(2:199|(1:196)(2:82|202))|200)(2:197|(1:IC)))|86|(2:88|(3:90|(1:95)(1:94)|(2:97|(2:98|(2:100|(1:102)(1:204))(3:203|103|(2:105|(1:IC)(5:116|(2:117|(3:119|(3:206|124|210)(2:208|(1:207)(2:123|211))|209)(2:205|(1:IC)))|122|127|(1:129))))))))(1:71)|72|(1:131))(0)|175|176)(1:132)|181|133|(10:136|183|137|141|(1:143)|144|(1:149)(1:148)|(3:192|153|195)(1:194)|193|134)|191|156|(1:158)|159|(1:161)(1:162)|163|(7:187|165|(1:167)|168|169|(1:171)(1:172)|173)(1:174)|175|176) */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0356, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x035e, code lost:
    
        r3 = new p276sf.C3959f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a3, code lost:
    
        r19 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r13v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1679g m4301i() {
        ?? c3959f;
        C1679g c1679gM4302l;
        C1679g c1679gM4302l2;
        Object c3959f2;
        C4173t c4173t;
        C1677f c1677f;
        C1677f c1677f2;
        Object c3959f3;
        C1677f c1677fM4298d;
        Class<?> clsLoadClass;
        C1677f c1677f3;
        C3742g c3742g = this.f5600a;
        Context context = c3742g.f12143a;
        DexKitBridge dexKitBridge = c3742g.f12146d;
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        SharedPreferences sharedPreferences = this.f5603d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM2091g, classLoader, "official_mass_send_anchor_v1");
        C4173t c4173t2 = C4173t.f13710g;
        C0042b c0042b = this.f5601b;
        if (methodM2087c == null || (c1679gM4302l = m4302l(methodM2087c)) == null) {
            try {
                C0570e c0570e = new C0570e();
                C1253k c1253k = new C1253k();
                C1253k.m3367u0(c1253k, AbstractC0000a.m99x0("MicroMsg.NetSceneMasSend"));
                c0570e.f1764h = c1253k;
                C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                c3959f = new ArrayList();
                Iterator it = c1731pFindMethod.iterator();
                while (it.hasNext()) {
                    try {
                        c3959f2 = ((C1730o) it.next()).m4350r(classLoader);
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    if (c3959f2 instanceof C3959f) {
                        c3959f2 = null;
                    }
                    Method method = (Method) c3959f2;
                    if (method != null) {
                        c3959f.add(method);
                    }
                }
            } catch (Throwable th3) {
                c3959f = new C3959f(th3);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                c0042b.invoke("定位微信原生群发助手网络类失败", thM8182b);
            }
            boolean z9 = c3959f instanceof C3959f;
            ?? r13 = c3959f;
            if (z9) {
                r13 = c4173t2;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : (List) r13) {
                Class<?> declaringClass = ((Method) obj).getDeclaringClass();
                Object obj2 = linkedHashMap.get(declaringClass);
                if (obj2 == null) {
                    ArrayList arrayList = new ArrayList();
                    linkedHashMap.put(declaringClass, arrayList);
                    obj2 = arrayList;
                }
                ((List) obj2).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                List list = (List) ((Map.Entry) it2.next()).getValue();
                Iterator it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        c1679gM4302l2 = null;
                        break;
                    }
                    c1679gM4302l2 = m4302l((Method) it3.next());
                    if (c1679gM4302l2 != null) {
                        break;
                    }
                }
                C3958e c3958e = c1679gM4302l2 != null ? new C3958e(AbstractC4166m.m8422t1(list), c1679gM4302l2) : null;
                if (c3958e != null) {
                    arrayList2.add(c3958e);
                }
            }
            C3958e c3958e2 = (C3958e) AbstractC4166m.m8400I1(arrayList2);
            if (c3958e2 == null) {
                try {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                        editorEdit.clear().putString("cache.key", strM2091g);
                    }
                    editorEdit.remove("official_mass_send_anchor_v1").apply();
                } catch (Throwable unused) {
                }
                if (arrayList2.size() <= 1) {
                    return null;
                }
                c0042b.invoke("微信原生群发助手网络类候选不唯一", null);
                return null;
            }
            C0828b.m2092h(sharedPreferences, strM2091g, "official_mass_send_anchor_v1", (Method) c3958e2.f12961g);
            c1679gM4302l = (C1679g) c3958e2.f12962h;
        }
        C1679g c1679g = c1679gM4302l;
        if (C0828b.m2087c(sharedPreferences, strM2091g, classLoader, "official_mass_send_emoji_callback_v1") != null) {
            String string = sharedPreferences.getString("official_mass_send_emoji_spec_v1", HttpUrl.FRAGMENT_ENCODE_SET);
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            List listM6691F0 = AbstractC3149m.m6691F0(string, new char[]{'\n'}, 6);
            if (listM6691F0.size() == 8 && (clsLoadClass = KavaReflector.loadClass((String) listM6691F0.get(0), classLoader)) != null) {
                Iterator it4 = KavaReflector.declaredConstructors(clsLoadClass).iterator();
                boolean z10 = false;
                Object obj3 = null;
                while (true) {
                    if (it4.hasNext()) {
                        Object next = it4.next();
                        Class<?>[] parameterTypes = ((Constructor) next).getParameterTypes();
                        parameterTypes.getClass();
                        if (parameterTypes.length == 0) {
                            if (z10) {
                                break;
                            }
                            obj3 = next;
                            z10 = true;
                        }
                    } else if (!z10) {
                        break;
                    }
                }
                Constructor constructor = (Constructor) obj3;
                if (constructor != null) {
                    c4173t = c4173t2;
                    Method methodFindMethodRecursive = KavaReflector.findMethodRecursive(clsLoadClass, "toByteArray", new Class[0]);
                    if (methodFindMethodRecursive != null) {
                        Class<?>[] parameterTypes2 = methodFindMethodRecursive.getParameterTypes();
                        parameterTypes2.getClass();
                        Method method2 = (parameterTypes2.length == 0 && AbstractC1416l.m3825a(methodFindMethodRecursive.getReturnType(), byte[].class)) ? methodFindMethodRecursive : null;
                        if (method2 != null) {
                            List listM8419q1 = AbstractC4166m.m8419q1(1, listM6691F0);
                            ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(listM8419q1));
                            Iterator it5 = listM8419q1.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(clsLoadClass, (String) it5.next());
                                    if (fieldFindFieldRecursive == null) {
                                        break;
                                    }
                                    arrayList3.add(fieldFindFieldRecursive);
                                } else if (AbstractC1416l.m3825a(((Field) arrayList3.get(0)).getType(), String.class)) {
                                    Class<?> type = ((Field) arrayList3.get(1)).getType();
                                    Class cls = Integer.TYPE;
                                    if (!AbstractC1416l.m3825a(type, cls) || !AbstractC1416l.m3825a(((Field) arrayList3.get(2)).getType(), cls) || !AbstractC1416l.m3825a(((Field) arrayList3.get(4)).getType(), cls) || !AbstractC1416l.m3825a(((Field) arrayList3.get(5)).getType(), String.class) || !AbstractC1416l.m3825a(((Field) arrayList3.get(6)).getType(), cls)) {
                                        break;
                                    }
                                    Iterator it6 = KavaReflector.declaredConstructors(((Field) arrayList3.get(3)).getType()).iterator();
                                    Object obj4 = null;
                                    boolean z11 = false;
                                    while (true) {
                                        if (it6.hasNext()) {
                                            Object next2 = it6.next();
                                            Class<?>[] parameterTypes3 = ((Constructor) next2).getParameterTypes();
                                            parameterTypes3.getClass();
                                            if (parameterTypes3.length == 0) {
                                                if (z11) {
                                                    break;
                                                }
                                                obj4 = next2;
                                                z11 = true;
                                            }
                                        } else if (!z11) {
                                            break;
                                        }
                                    }
                                    obj4 = null;
                                    Constructor constructor2 = (Constructor) obj4;
                                    c1677f3 = constructor2 != null ? new C1677f(constructor, method2, (Field) arrayList3.get(0), (Field) arrayList3.get(1), (Field) arrayList3.get(2), (Field) arrayList3.get(3), constructor2, (Field) arrayList3.get(4), (Field) arrayList3.get(5), (Field) arrayList3.get(6)) : null;
                                }
                            }
                        }
                    }
                } else {
                    c4173t = c4173t2;
                }
                if (c1677f3 != null) {
                    c1677f2 = c1677f3;
                }
            }
            return new C1679g(c1679g.f5559a, c1679g.f5560b, c1679g.f5561c, c1679g.f5562d, c1679g.f5563e, c1679g.f5564f, c1679g.f5565g, c1679g.f5566h, c1677f2);
        }
        c4173t = c4173t2;
        C0570e c0570e2 = new C0570e();
        C1253k c1253k2 = new C1253k();
        C1253k.m3367u0(c1253k2, AbstractC0000a.m99x0("MicroMsg.MassSendFooterEventImpl"));
        c0570e2.f1764h = c1253k2;
        C1731p<C1730o> c1731pFindMethod2 = dexKitBridge.findMethod(c0570e2);
        ?? c3959f4 = new ArrayList();
        for (C1730o c1730o : c1731pFindMethod2) {
            try {
                c3959f3 = c1730o.m4350r(classLoader);
            } catch (Throwable th4) {
                c3959f3 = new C3959f(th4);
            }
            if (c3959f3 instanceof C3959f) {
                c3959f3 = null;
            }
            Method method3 = (Method) c3959f3;
            C3958e c3958e3 = (method3 == null || (c1677fM4298d = m4298d(c1730o)) == null) ? null : new C3958e(method3, c1677fM4298d);
            if (c3958e3 != null) {
                c3959f4.add(c3958e3);
            }
        }
        Throwable thM8182b2 = C3960g.m8182b(c3959f4);
        if (thM8182b2 != null) {
            c0042b.invoke("定位微信原生群发表情协议失败", thM8182b2);
        }
        List list2 = (List) (c3959f4 instanceof C3959f ? c4173t : c3959f4);
        C3958e c3958e4 = (C3958e) AbstractC4166m.m8400I1(list2);
        if (c3958e4 == null) {
            try {
                SharedPreferences.Editor editorEdit2 = sharedPreferences.edit();
                if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strM2091g)) {
                    editorEdit2.clear().putString("cache.key", strM2091g);
                }
                editorEdit2.remove("official_mass_send_emoji_callback_v1").apply();
            } catch (Throwable unused2) {
            }
            sharedPreferences.edit().remove("official_mass_send_emoji_spec_v1").apply();
            if (list2.size() > 1) {
                c1677f = null;
                c0042b.invoke("微信原生群发表情协议候选不唯一", null);
            } else {
                c1677f = null;
            }
            c1677f2 = c1677f;
        } else {
            Object obj5 = c3958e4.f12962h;
            C0828b.m2092h(sharedPreferences, strM2091g, "official_mass_send_emoji_callback_v1", (Method) c3958e4.f12961g);
            C1677f c1677f4 = (C1677f) obj5;
            sharedPreferences.edit().putString("official_mass_send_emoji_spec_v1", AbstractC4166m.m8392A1(AbstractC0000a.m101y0(c1677f4.f5544a.getDeclaringClass().getName(), c1677f4.f5546c.getName(), c1677f4.f5547d.getName(), c1677f4.f5548e.getName(), c1677f4.f5549f.getName(), c1677f4.f5551h.getName(), c1677f4.f5552i.getName(), c1677f4.f5553j.getName()), "\n", null, null, null, 62)).apply();
            c1677f2 = c1677f4;
        }
        return new C1679g(c1679g.f5559a, c1679g.f5560b, c1679g.f5561c, c1679g.f5562d, c1679g.f5563e, c1679g.f5564f, c1679g.f5565g, c1679g.f5566h, c1677f2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v13, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r8v14, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r8v24, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r8v3, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r8v9, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v17, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v8, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r9v9, resolved type: boolean */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01e8, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0264, code lost:
    
        r5 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0305, code lost:
    
        if (gg.AbstractC1416l.m3825a(r1 != null ? r1.getType() : r20, java.lang.String.class) != false) goto L169;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x018e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1679g m4302l(Method method) {
        char c10;
        char c11;
        Class cls;
        char c12;
        char c13;
        C1679g c1679g;
        Object next;
        Object next2;
        char c14;
        Object objInvoke;
        char c15;
        Method method2;
        char c16;
        Method method3;
        char c17;
        C1679g c1679g2;
        Method method4;
        boolean z9;
        boolean z10;
        boolean z11;
        Object next3;
        Class<?> declaringClass = method.getDeclaringClass();
        Iterator<T> it = KavaReflector.declaredConstructors(declaringClass).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c10 = 2;
            c11 = 3;
            cls = Integer.TYPE;
            c12 = 1;
            c13 = 0;
            c1679g = null;
            if (!zHasNext) {
                next = null;
                break;
            }
            next = it.next();
            Constructor constructor = (Constructor) next;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (Boolean.valueOf(parameterTypes.length == 3 && AbstractC1416l.m3825a(parameterTypes[1], Boolean.TYPE) && AbstractC1416l.m3825a(parameterTypes[2], cls) && AbstractC3149m.m6700O0(parameterTypes[0].getName(), '.', HttpUrl.FRAGMENT_ENCODE_SET).equals(AbstractC3149m.m6700O0(constructor.getDeclaringClass().getName(), '.', HttpUrl.FRAGMENT_ENCODE_SET))).booleanValue()) {
                break;
            }
        }
        Constructor constructor2 = (Constructor) next;
        if (constructor2 != null) {
            Class<?> cls2 = constructor2.getParameterTypes()[0];
            Iterator<T> it2 = KavaReflector.declaredConstructors(cls2).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                Class<?>[] parameterTypes2 = ((Constructor) next2).getParameterTypes();
                parameterTypes2.getClass();
                if (Boolean.valueOf(parameterTypes2.length == 0).booleanValue()) {
                    break;
                }
            }
            Constructor constructor3 = (Constructor) next2;
            if (constructor3 != null) {
                String strM6700O0 = AbstractC3149m.m6700O0(declaringClass.getName(), '.', HttpUrl.FRAGMENT_ENCODE_SET);
                if (AbstractC3149m.m6721t0(strM6700O0)) {
                    return null;
                }
                String strConcat = strM6700O0.concat(".z");
                C3742g c3742g = this.f5600a;
                Class<?> clsLoadClass = KavaReflector.loadClass(strConcat, c3742g.f12145c);
                Class<?> clsLoadClass2 = KavaReflector.loadClass(strM6700O0.concat(".k0"), c3742g.f12145c);
                Class<?> clsLoadClass3 = KavaReflector.loadClass(strM6700O0.concat(".a0"), c3742g.f12145c);
                if (clsLoadClass == null || clsLoadClass2 == null) {
                    c14 = 2;
                    objInvoke = null;
                } else {
                    Iterator<T> it3 = KavaReflector.declaredMethods(clsLoadClass2).iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            c14 = c10;
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                        Method method5 = (Method) next3;
                        c14 = c10;
                        if (Modifier.isStatic(method5.getModifiers())) {
                            Class<?>[] parameterTypes3 = method5.getParameterTypes();
                            parameterTypes3.getClass();
                            boolean z12 = parameterTypes3.length == 0 && AbstractC1416l.m3825a(method5.getReturnType(), clsLoadClass);
                            if (Boolean.valueOf(z12).booleanValue()) {
                                break;
                            }
                            c10 = c14;
                        }
                    }
                    Method method6 = (Method) next3;
                    objInvoke = method6 != null ? KavaReflector.invoke(method6, null, new Object[0]) : null;
                }
                if (clsLoadClass3 == null || clsLoadClass2 == null) {
                    c15 = 3;
                    method2 = null;
                } else {
                    Iterator<T> it4 = KavaReflector.declaredMethods(clsLoadClass2).iterator();
                    boolean z13 = false;
                    Object obj = null;
                    while (true) {
                        if (!it4.hasNext()) {
                            c15 = c11;
                            if (!z13) {
                                break;
                            }
                        } else {
                            Object next4 = it4.next();
                            Method method7 = (Method) next4;
                            if (Modifier.isStatic(method7.getModifiers())) {
                                c15 = c11;
                                Class<?>[] parameterTypes4 = method7.getParameterTypes();
                                parameterTypes4.getClass();
                                if (parameterTypes4.length == 0 && AbstractC1416l.m3825a(method7.getReturnType(), clsLoadClass3)) {
                                    z11 = true;
                                }
                                if (Boolean.valueOf(z11).booleanValue()) {
                                    if (z13) {
                                        break;
                                    }
                                    z13 = true;
                                    obj = next4;
                                }
                                c11 = c15;
                            } else {
                                c15 = c11;
                            }
                            z11 = false;
                            if (Boolean.valueOf(z11).booleanValue()) {
                            }
                            c11 = c15;
                        }
                    }
                    obj = null;
                    method2 = (Method) obj;
                }
                if (clsLoadClass3 != null) {
                    Iterator<T> it5 = KavaReflector.declaredMethods(clsLoadClass3).iterator();
                    char c18 = 0;
                    Object obj2 = null;
                    while (true) {
                        if (!it5.hasNext()) {
                            c16 = c12;
                            if (c18 == 0) {
                                break;
                            }
                        } else {
                            Object next5 = it5.next();
                            Method method8 = (Method) next5;
                            if (Modifier.isStatic(method8.getModifiers())) {
                                c16 = c12;
                            } else {
                                c16 = c12;
                                Class<?>[] parameterTypes5 = method8.getParameterTypes();
                                parameterTypes5.getClass();
                                if (parameterTypes5.length == 0 && AbstractC1416l.m3825a(method8.getReturnType(), cls)) {
                                    z10 = c16;
                                }
                                if (Boolean.valueOf(z10).booleanValue()) {
                                    c12 = c16;
                                } else {
                                    if (c18 != 0) {
                                        break;
                                    }
                                    obj2 = next5;
                                    c18 = c16;
                                    c12 = c18;
                                }
                            }
                            z10 = 0;
                            if (Boolean.valueOf(z10).booleanValue()) {
                            }
                        }
                    }
                    method3 = (Method) obj2;
                } else {
                    c16 = 1;
                    method3 = null;
                }
                if (clsLoadClass != null) {
                    Iterator<T> it6 = KavaReflector.declaredMethods(clsLoadClass).iterator();
                    char c19 = 0;
                    Object obj3 = null;
                    while (true) {
                        if (!it6.hasNext()) {
                            c17 = c13;
                            c1679g2 = c1679g;
                            if (c19 == 0) {
                                break;
                            }
                        } else {
                            Object next6 = it6.next();
                            Method method9 = (Method) next6;
                            c17 = c13;
                            Class<?>[] parameterTypes6 = method9.getParameterTypes();
                            if (AbstractC1416l.m3825a(method9.getReturnType(), cls2)) {
                                c1679g2 = c1679g;
                                if (parameterTypes6.length == 4 && AbstractC1416l.m3825a(parameterTypes6[c17], String.class) && AbstractC1416l.m3825a(parameterTypes6[c16], String.class) && AbstractC1416l.m3825a(parameterTypes6[c14], cls) && AbstractC1416l.m3825a(parameterTypes6[c15], cls)) {
                                    z9 = c16;
                                }
                                if (Boolean.valueOf(z9).booleanValue()) {
                                    c13 = c17;
                                } else {
                                    if (c19 != 0) {
                                        break;
                                    }
                                    obj3 = next6;
                                    c13 = c17;
                                    c19 = c16;
                                }
                                c1679g = c1679g2;
                            } else {
                                c1679g2 = c1679g;
                            }
                            z9 = c17;
                            if (Boolean.valueOf(z9).booleanValue()) {
                            }
                            c1679g = c1679g2;
                        }
                    }
                    method4 = (Method) obj3;
                } else {
                    c17 = 0;
                    c1679g2 = null;
                    method4 = null;
                }
                Iterator<T> it7 = KavaReflector.declaredMethods(declaringClass).iterator();
                char c20 = c17;
                Object obj4 = c1679g2;
                while (true) {
                    if (!it7.hasNext()) {
                        if (c20 == 0) {
                            break;
                        }
                    } else {
                        Object next7 = it7.next();
                        Method method10 = (Method) next7;
                        if (Boolean.valueOf((AbstractC1416l.m3825a(method10.getName(), "onGYNetEnd") && AbstractC1416l.m3825a(method10.getReturnType(), Void.TYPE) && method10.getParameterTypes().length == 6) ? c16 : c17).booleanValue()) {
                            if (c20 != 0) {
                                break;
                            }
                            obj4 = next7;
                            c20 = c16;
                        }
                    }
                }
                obj4 = c1679g2;
                Method method11 = (Method) obj4;
                if (method11 != null) {
                    String str = "j";
                    Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(cls2, "j");
                    if (!AbstractC1416l.m3825a(fieldFindFieldRecursive != null ? fieldFindFieldRecursive.getType() : c1679g2, String.class)) {
                        str = "m";
                        Field fieldFindFieldRecursive2 = KavaReflector.findFieldRecursive(cls2, "m");
                    }
                    return new C1679g(constructor2, constructor3, method11, objInvoke, method4, str, method2, method3, null);
                }
                return c1679g2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:44:0x0113 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0227  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4303m(C1683i c1683i) {
        C1685j c1685j;
        int i9;
        ?? r12;
        String strM4295p;
        int i10;
        int length;
        Object objInvoke;
        Object objNewInstance;
        Object c3959f;
        if (this.f5606g != c1683i) {
            return;
        }
        if (c1683i.f5580e >= c1683i.f5577b.size()) {
            int i11 = c1683i.f5581f;
            int i12 = c1683i.f5578c;
            InterfaceC1236q interfaceC1236q = c1683i.f5579d;
            this.f5606g = null;
            this.f5607h = null;
            if (interfaceC1236q != null) {
                interfaceC1236q.mo734b(Integer.valueOf(i11), Integer.valueOf(i12), Boolean.FALSE);
            }
            m4304n();
            return;
        }
        C1679g c1679g = this.f5605f;
        if (c1679g == null) {
            m4297a(c1683i, false);
            return;
        }
        C1685j c1685j2 = (C1685j) c1683i.f5577b.get(c1683i.f5580e);
        String strM8392A1 = AbstractC4166m.m8392A1(c1685j2.f5592b, ";", null, null, null, 62);
        C1697t c1697t = c1685j2.f5591a;
        int size = c1685j2.f5592b.size();
        C0412a c0412a = c1685j2.f5593c;
        C2113x c2113x = c1685j2.f5594d;
        int i13 = c1697t.f5647b;
        C2356t c2356t = c1697t.f5652g;
        int i14 = i13 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (i14 == 3) {
            Object obj = c1679g.f5562d;
            if (obj != null) {
                String str2 = c2356t != null ? c2356t.f7746f : null;
                if (str2 != null) {
                    str = str2;
                }
                objInvoke = KavaReflector.invoke(c1679g.f5563e, obj, str, strM8392A1, Integer.valueOf(size), 1);
                c1685j = c1685j2;
                i10 = 62;
                if (objInvoke == null) {
                    m4297a(c1683i, false);
                    return;
                }
                int i15 = i10;
                C1685j c1685j3 = c1685j;
                Object objNewInstance2 = KavaReflector.newInstance(c1679g.f5559a, objInvoke, Boolean.FALSE, Integer.valueOf((c1685j3.f5591a.f5647b & Settings.DEFAULT_INITIAL_WINDOW_SIZE) == 3 ? 1 : 0));
                if (objNewInstance2 == null) {
                    m4297a(c1683i, false);
                    return;
                }
                this.f5607h = objNewInstance2;
                try {
                    C2813a c2813aNetwork = WeChatApis.network();
                    c3959f = Boolean.valueOf(c2813aNetwork != null && c2813aNetwork.f9079a.m6216j(objNewInstance2));
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    this.f5601b.invoke("微信原生群发助手派发失败", thM8182b);
                }
                Boolean bool = Boolean.FALSE;
                if (c3959f instanceof C3959f) {
                    c3959f = bool;
                }
                if (!((Boolean) c3959f).booleanValue()) {
                    this.f5607h = null;
                    m4297a(c1683i, false);
                    return;
                }
                RunnableC0217c runnableC0217c = new RunnableC0217c(this, objNewInstance2, c1685j3, c1683i, 5);
                Handler handler = this.f5602c;
                int i16 = c1685j3.f5591a.f5647b & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
                handler.postDelayed(runnableC0217c, i16 != 3 ? i16 != 34 ? (i16 == 43 || i16 == i15) ? 300000L : 30000L : 90000L : 120000L);
                this.f5608i = runnableC0217c;
                return;
            }
            c1685j = c1685j2;
        } else {
            Object objNewInstance3 = KavaReflector.newInstance(c1679g.f5560b, new Object[0]);
            if (objNewInstance3 == null) {
                c1685j = c1685j2;
            } else {
                if (i14 == 47) {
                    C1677f c1677f = c1679g.f5567i;
                    if (c1677f != null && c0412a != null) {
                        i9 = size;
                        c1685j = c1685j2;
                        Object objNewInstance4 = KavaReflector.newInstance(c1677f.f5544a, new Object[0]);
                        if (objNewInstance4 == null || (objNewInstance = KavaReflector.newInstance(c1677f.f5550g, new Object[0])) == null) {
                            r12 = 0;
                            if (r12 == 0) {
                            }
                        } else {
                            KavaReflector.writeField(c1677f.f5546c, objNewInstance4, (String) c0412a.f1127d);
                            KavaReflector.writeField(c1677f.f5547d, objNewInstance4, (Object) 0);
                            KavaReflector.writeField(c1677f.f5548e, objNewInstance4, Integer.valueOf(c0412a.f1125b));
                            KavaReflector.writeField(c1677f.f5549f, objNewInstance4, objNewInstance);
                            KavaReflector.writeField(c1677f.f5551h, objNewInstance4, Integer.valueOf(c0412a.f1126c));
                            KavaReflector.writeField(c1677f.f5552i, objNewInstance4, (String) c0412a.f1128e);
                            KavaReflector.writeField(c1677f.f5553j, objNewInstance4, (Object) 0);
                            Object objInvoke2 = KavaReflector.invoke(c1677f.f5545b, objNewInstance4, new Object[0]);
                            if (objInvoke2 instanceof byte[]) {
                                r12 = (byte[]) objInvoke2;
                            }
                            if (r12 == 0) {
                            }
                        }
                    }
                } else {
                    c1685j = c1685j2;
                    i9 = size;
                    r12 = 0;
                }
                if (i14 == 34) {
                    strM4295p = c2113x != null ? c2113x.f7059b : null;
                    if (strM4295p == null) {
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j3 = c1697t.f5646a;
                    StringBuilder sbM6842o = AbstractC3199a.m6842o(jCurrentTimeMillis, "Hchat_", "_");
                    sbM6842o.append(j3);
                    m4296q(objNewInstance3, "d", sbM6842o.toString());
                    m4296q(objNewInstance3, "e", 104);
                    m4296q(objNewInstance3, "f", Long.valueOf(jCurrentTimeMillis));
                    m4296q(objNewInstance3, "g", 0L);
                    m4296q(objNewInstance3, "h", strM4295p);
                    m4296q(objNewInstance3, "i", HttpUrl.FRAGMENT_ENCODE_SET);
                    m4296q(objNewInstance3, c1679g.f5564f, strM8392A1);
                    m4296q(objNewInstance3, "n", Integer.valueOf(i9));
                    i10 = 62;
                    m4296q(objNewInstance3, "o", Integer.valueOf(i14 == 62 ? 43 : i14));
                } else if (i14 == 43) {
                    strM4295p = m4295p(c1697t);
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    long j32 = c1697t.f5646a;
                    StringBuilder sbM6842o2 = AbstractC3199a.m6842o(jCurrentTimeMillis2, "Hchat_", "_");
                    sbM6842o2.append(j32);
                    m4296q(objNewInstance3, "d", sbM6842o2.toString());
                    m4296q(objNewInstance3, "e", 104);
                    m4296q(objNewInstance3, "f", Long.valueOf(jCurrentTimeMillis2));
                    m4296q(objNewInstance3, "g", 0L);
                    m4296q(objNewInstance3, "h", strM4295p);
                    m4296q(objNewInstance3, "i", HttpUrl.FRAGMENT_ENCODE_SET);
                    m4296q(objNewInstance3, c1679g.f5564f, strM8392A1);
                    m4296q(objNewInstance3, "n", Integer.valueOf(i9));
                    i10 = 62;
                    m4296q(objNewInstance3, "o", Integer.valueOf(i14 == 62 ? 43 : i14));
                    m4296q(objNewInstance3, "p", Integer.valueOf((i14 != 34 || c2113x == null) ? 0 : c2113x.f7058a));
                    m4296q(objNewInstance3, "q", 0);
                    if (r12 == 0) {
                        length = r12.length;
                    } else {
                        Charset charset = StandardCharsets.UTF_8;
                        charset.getClass();
                        byte[] bytes = strM4295p.getBytes(charset);
                        bytes.getClass();
                        length = bytes.length;
                    }
                    m4296q(objNewInstance3, "r", Integer.valueOf(length));
                    m4296q(objNewInstance3, "s", 0);
                    m4296q(objNewInstance3, "t", 0);
                    m4296q(objNewInstance3, "u", 0);
                    m4296q(objNewInstance3, "v", 0);
                    m4296q(objNewInstance3, "w", HttpUrl.FRAGMENT_ENCODE_SET);
                    m4296q(objNewInstance3, "x", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (r12 != 0) {
                        m4296q(objNewInstance3, "y", r12);
                    }
                    m4296q(objNewInstance3, "z", -1);
                    objInvoke = objNewInstance3;
                } else {
                    if (i14 == 47) {
                        strM4295p = c0412a != null ? (String) c0412a.f1127d : null;
                        if (strM4295p == null) {
                            strM4295p = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                    } else if (i14 != 62) {
                        strM4295p = c2356t != null ? c2356t.f7743c : null;
                        if (strM4295p == null) {
                            strM4295p = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (AbstractC3149m.m6721t0(strM4295p)) {
                            strM4295p = c1697t.f5649d;
                        }
                    }
                    long jCurrentTimeMillis22 = System.currentTimeMillis();
                    long j322 = c1697t.f5646a;
                    StringBuilder sbM6842o22 = AbstractC3199a.m6842o(jCurrentTimeMillis22, "Hchat_", "_");
                    sbM6842o22.append(j322);
                    m4296q(objNewInstance3, "d", sbM6842o22.toString());
                    m4296q(objNewInstance3, "e", 104);
                    m4296q(objNewInstance3, "f", Long.valueOf(jCurrentTimeMillis22));
                    m4296q(objNewInstance3, "g", 0L);
                    m4296q(objNewInstance3, "h", strM4295p);
                    m4296q(objNewInstance3, "i", HttpUrl.FRAGMENT_ENCODE_SET);
                    m4296q(objNewInstance3, c1679g.f5564f, strM8392A1);
                    m4296q(objNewInstance3, "n", Integer.valueOf(i9));
                    i10 = 62;
                    m4296q(objNewInstance3, "o", Integer.valueOf(i14 == 62 ? 43 : i14));
                    if (i14 != 34) {
                        m4296q(objNewInstance3, "p", Integer.valueOf((i14 != 34 || c2113x == null) ? 0 : c2113x.f7058a));
                        m4296q(objNewInstance3, "q", 0);
                        if (r12 == 0) {
                        }
                        m4296q(objNewInstance3, "r", Integer.valueOf(length));
                        m4296q(objNewInstance3, "s", 0);
                        m4296q(objNewInstance3, "t", 0);
                        m4296q(objNewInstance3, "u", 0);
                        m4296q(objNewInstance3, "v", 0);
                        m4296q(objNewInstance3, "w", HttpUrl.FRAGMENT_ENCODE_SET);
                        m4296q(objNewInstance3, "x", HttpUrl.FRAGMENT_ENCODE_SET);
                        if (r12 != 0) {
                        }
                        m4296q(objNewInstance3, "z", -1);
                        objInvoke = objNewInstance3;
                    }
                }
            }
            if (objInvoke == null) {
            }
        }
        i10 = 62;
        objInvoke = null;
        if (objInvoke == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4304n() {
        if (this.f5606g != null) {
            return;
        }
        C1683i c1683i = (C1683i) this.f5604e.pollFirst();
        this.f5606g = c1683i;
        if (c1683i != null) {
            m4303m(c1683i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final List m4305o(List list) {
        C1679g c1679g = this.f5605f;
        if (c1679g == null) {
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1697t) it.next()).m4335c());
            }
            return AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!m4292h((C1697t) obj, c1679g)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((C1697t) it2.next()).m4335c());
        }
        return AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList3));
    }
}
