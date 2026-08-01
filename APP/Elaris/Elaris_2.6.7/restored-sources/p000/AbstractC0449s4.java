package p000;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: s4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0449s4 {

    /* JADX INFO: renamed from: a */
    public static final Object f831a = new Object();

    /* JADX INFO: renamed from: b */
    public static final Object f832b = new Object();

    /* JADX INFO: renamed from: c */
    public static volatile ClassLoader f833c;

    /* JADX INFO: renamed from: d */
    public static volatile boolean f834d;

    /* JADX INFO: renamed from: e */
    public static volatile Method f835e;

    /* JADX INFO: renamed from: f */
    public static volatile Object f836f;

    /* JADX INFO: renamed from: g */
    public static volatile boolean f837g;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f838h;

    /* JADX INFO: renamed from: i */
    public static volatile Method f839i;

    /* JADX INFO: renamed from: j */
    public static volatile WeakReference f840j;

    /* JADX INFO: renamed from: k */
    public static volatile Method f841k;

    /* JADX INFO: renamed from: l */
    public static volatile WeakReference f842l;

    /* JADX INFO: renamed from: m */
    public static volatile WeakReference f843m;

    /* JADX INFO: renamed from: n */
    public static long f844n;

    /* JADX INFO: renamed from: o */
    public static C0209f2 f845o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static String m881A(String str) {
        return str == null ? "null" : m896o(str.replace('\n', ' ').replace('\r', ' '), 120);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m882a(EditText editText, Editable editable, String str, ArrayList arrayList) {
        if (str != null && !arrayList.isEmpty()) {
            try {
                boolean zEquals = str.equals(editable.toString());
                int selectionStart = editText.getSelectionStart();
                int selectionEnd = editText.getSelectionEnd();
                Collections.sort(arrayList);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                int i = 0;
                int i2 = 0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0417q4 c0417q4 = (C0417q4) arrayList.get(size);
                    int i3 = c0417q4.f736a;
                    SpannableStringBuilder spannableStringBuilder2 = c0417q4.f738c;
                    int i4 = c0417q4.f737b;
                    if (i3 >= 0 && i4 <= spannableStringBuilder.length() && i3 < i4) {
                        int i5 = i4 - i3;
                        int length = spannableStringBuilder2.length();
                        if (selectionStart >= i4) {
                            i = (length - i5) + i;
                        }
                        if (selectionEnd >= i4) {
                            i2 += length - i5;
                        }
                        spannableStringBuilder.replace(i3, i4, (CharSequence) spannableStringBuilder2);
                    }
                }
                editable.replace(0, editable.length(), spannableStringBuilder);
                int length2 = editable.length();
                if (!zEquals) {
                    editText.setSelection(length2);
                    return true;
                }
                if (selectionStart < 0 || selectionEnd < 0) {
                    editText.setSelection(length2);
                    return true;
                }
                editText.setSelection(Math.max(0, Math.min(length2, selectionStart + i)), Math.max(0, Math.min(length2, selectionEnd + i2)));
                return true;
            } catch (Throwable th) {
                m897p("apply official spans failed: " + th);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C0209f2 m883b(EditText editText, String str, int i, boolean z) {
        C0209f2 c0209f2;
        if (i <= 0) {
            m887f(null, "invalid_begin");
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = f844n + 1;
        f844n = j;
        C0209f2 c0209f22 = new C0209f2(editText, new C0265ia(j, editText, str, i, HookEntry.hotReloadGeneration(), jCurrentTimeMillis));
        synchronized (f832b) {
            c0209f2 = f845o;
            f845o = c0209f22;
        }
        m886e(c0209f2);
        C0294k4 c0294k4 = new C0294k4(c0209f22);
        c0209f22.f248d = c0294k4;
        try {
            editText.addTextChangedListener(c0294k4);
            if (z) {
                ((C0265ia) c0209f22.f246b).m679a(jCurrentTimeMillis);
            }
            return c0209f22;
        } catch (Throwable th) {
            m887f(c0209f22, "watcher_failed");
            m897p("pending watcher install failed: ".concat(th.getClass().getSimpleName()));
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m884c(String str, ArrayList arrayList, ArrayList arrayList2, C0540y c0540y) {
        C0259i4 c0259i4;
        C0358o4 c0358o4M890i;
        String str2;
        SpannableStringBuilder spannableStringBuilder;
        C0433r4 c0433r4;
        int i;
        int i2;
        C0433r4 c0433r42;
        int i3;
        int i4;
        Object obj;
        int i5;
        C0540y c0540y2 = c0540y;
        ArrayList arrayList3 = new ArrayList();
        int i6 = 0;
        while (i6 < arrayList.size() && arrayList3.size() < 16) {
            C0433r4 c0433r43 = (C0433r4) arrayList.get(i6);
            if (c0433r43 != null && c0433r43.f787a) {
                String str3 = c0433r43.f790d;
                if (str3 != null) {
                    for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                        c0259i4 = (C0259i4) arrayList2.get(i7);
                        if (c0259i4 != null && str3.equals(c0259i4.f374a)) {
                            break;
                        }
                    }
                }
                c0259i4 = null;
                if (c0259i4 == null || c0259i4.f379f == null) {
                    break;
                }
                C0243h4 c0243h4 = c0259i4.f379f;
                if (c0243h4 == null || (i5 = c0243h4.f346a) < 0) {
                    c0358o4M890i = null;
                    if (c0358o4M890i != null || (str2 = c0358o4M890i.f631a) == null || str2.length() <= 0 || ((String) c0358o4M890i.f633c).length() != 0) {
                        StringBuilder sb = new StringBuilder("unsupported favorite token=");
                        String str4 = c0433r43.f790d;
                        sb.append(str4 != null ? str4.length() <= 36 ? str4 : str4.substring(0, 36) : "null");
                        sb.append(" reason=");
                        sb.append(c0358o4M890i != null ? "no_pic_path" : (String) c0358o4M890i.f633c);
                        m897p(sb.toString());
                        return arrayList3;
                    }
                    String str5 = c0358o4M890i.f631a;
                    boolean z = c0358o4M890i.f632b;
                    Method method = (Method) c0540y2.f1081a;
                    if (str5 != null && str5.length() != 0 && (obj = c0540y2.f1082b) != null && method != null) {
                        try {
                            Object objInvoke = method.invoke(obj, str5, Uri.fromFile(new File(str5)), Boolean.valueOf(z));
                            if (objInvoke != null) {
                                spannableStringBuilder = new SpannableStringBuilder("图片");
                                spannableStringBuilder.setSpan(objInvoke, 0, spannableStringBuilder.length(), 33);
                            }
                        } catch (Throwable th) {
                            m897p("official span invocation failed method=" + AbstractC0497v4.m1078E(method) + " path=" + m896o(str5, 120) + ": " + th);
                        }
                        if (spannableStringBuilder != null) {
                        }
                        StringBuilder sb2 = new StringBuilder("official span create failed token=");
                        String str6 = c0433r43.f790d;
                        sb2.append(str6 != null ? str6.length() <= 36 ? str6 : str6.substring(0, 36) : "null");
                        sb2.append(" path=");
                        sb2.append(m896o(c0358o4M890i.f631a, 120));
                        m897p(sb2.toString());
                        return arrayList3;
                    }
                    spannableStringBuilder = null;
                    if (spannableStringBuilder != null || spannableStringBuilder.length() == 0) {
                        StringBuilder sb22 = new StringBuilder("official span create failed token=");
                        String str62 = c0433r43.f790d;
                        sb22.append(str62 != null ? str62.length() <= 36 ? str62 : str62.substring(0, 36) : "null");
                        sb22.append(" path=");
                        sb22.append(m896o(c0358o4M890i.f631a, 120));
                        m897p(sb22.toString());
                        return arrayList3;
                    }
                    boolean z2 = true;
                    boolean z3 = (i6 > 0 && (c0433r4 = (C0433r4) arrayList.get(i6 - 1)) != null && !c0433r4.f787a && (i = c0433r4.f789c) > (i2 = c0433r4.f788b)) ? !(str != null && i > i2 && i <= str.length() && str.charAt(i + (-1)) == '\n') : false;
                    if (i6 < arrayList.size() - 1 && (c0433r42 = (C0433r4) arrayList.get(i6 + 1)) != null && !c0433r42.f787a && (i3 = c0433r42.f789c) > (i4 = c0433r42.f788b)) {
                        z2 = true ^ (str != null && i3 > i4 && i4 >= 0 && i4 < str.length() && str.charAt(i4) == '\n');
                    }
                    if (z3 || z2) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        if (z3) {
                            spannableStringBuilder2.append('\n');
                        }
                        spannableStringBuilder2.append((CharSequence) spannableStringBuilder);
                        if (z2) {
                            spannableStringBuilder2.append('\n');
                        }
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    arrayList3.add(new C0417q4(c0433r43.f788b, c0433r43.f789c, spannableStringBuilder));
                } else {
                    Object[] objArr = (Object[]) c0243h4.f347b;
                    if (i5 < objArr.length) {
                        Object obj2 = objArr[i5];
                        if (obj2 instanceof ArrayList) {
                            ArrayList arrayList4 = (ArrayList) obj2;
                            for (int i8 = 0; i8 < arrayList4.size(); i8++) {
                                c0358o4M890i = m890i(arrayList4.get(i8), 0, Collections.newSetFromMap(new IdentityHashMap()), new int[]{0});
                                if (c0358o4M890i != null) {
                                    break;
                                }
                            }
                            c0358o4M890i = null;
                            if (c0358o4M890i != null) {
                            }
                            StringBuilder sb3 = new StringBuilder("unsupported favorite token=");
                            String str42 = c0433r43.f790d;
                            sb3.append(str42 != null ? str42.length() <= 36 ? str42 : str42.substring(0, 36) : "null");
                            sb3.append(" reason=");
                            sb3.append(c0358o4M890i != null ? "no_pic_path" : (String) c0358o4M890i.f633c);
                            m897p(sb3.toString());
                            return arrayList3;
                        }
                    }
                }
            }
            i6++;
            c0540y2 = c0540y;
        }
        return arrayList3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static Object m885d(Object obj, String str) {
        if (obj != null && str.length() != 0) {
            Class<?> superclass = obj.getClass();
            while (superclass != null && superclass != Object.class) {
                try {
                    Method declaredMethod = superclass.getDeclaredMethod(str, null);
                    if (declaredMethod.getParameterTypes().length == 0) {
                        declaredMethod.setAccessible(true);
                        return declaredMethod.invoke(obj, null);
                    }
                    superclass = superclass.getSuperclass();
                } catch (NoSuchMethodException unused) {
                    superclass = superclass.getSuperclass();
                } catch (Throwable unused2) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m886e(C0209f2 c0209f2) {
        ArrayList arrayList;
        if (c0209f2 == null) {
            return;
        }
        C0265ia c0265ia = (C0265ia) c0209f2.f246b;
        synchronized (c0265ia) {
            c0265ia.f418g = true;
            c0265ia.f419h = 0L;
        }
        synchronized (c0209f2) {
            arrayList = new ArrayList((ArrayList) c0209f2.f247c);
            ((ArrayList) c0209f2.f247c).clear();
        }
        EditText editText = (EditText) ((WeakReference) c0209f2.f245a).get();
        if (editText != null) {
            try {
                C0294k4 c0294k4 = (C0294k4) c0209f2.f248d;
                if (c0294k4 != null) {
                    editText.removeTextChangedListener(c0294k4);
                }
            } catch (Throwable unused) {
            }
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    editText.removeCallbacks((Runnable) arrayList.get(i));
                } catch (Throwable unused2) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m887f(C0209f2 c0209f2, String str) {
        synchronized (f832b) {
            C0209f2 c0209f22 = f845o;
            if (c0209f22 != null && (c0209f2 == null || c0209f22 == c0209f2)) {
                f845o = null;
                m886e(c0209f22);
                m897p("pending official mixed send cleared id=" + ((C0265ia) c0209f22.f246b).f412a + " reason=" + str);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static View m888g(EditText editText, View view) {
        for (int i = 0; i < 5 && view != null && view != editText; i++) {
            try {
                if (view.isShown() && view.isEnabled() && view.isClickable()) {
                    return view;
                }
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable unused) {
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m889h(ArrayList arrayList) {
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            C0433r4 c0433r4 = (C0433r4) arrayList.get(i2);
            if (c0433r4 != null && c0433r4.f787a) {
                i++;
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static C0358o4 m890i(Object obj, int i, Set set, int[] iArr) {
        Object objM891j;
        Field[] declaredFields;
        C0358o4 c0358o4M890i;
        int length;
        if (obj != null && i <= 5) {
            int i2 = 0;
            if (iArr[0] <= 180 && set.add(obj)) {
                boolean zBooleanValue = true;
                iArr[0] = iArr[0] + 1;
                if (!(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Context) && !(obj instanceof View)) {
                    String name = obj.getClass().getName();
                    Locale locale = Locale.ROOT;
                    String lowerCase = name.toLowerCase(locale);
                    if (lowerCase.contains("marketface") || lowerCase.contains("facebubble") || lowerCase.contains("giphyelement")) {
                        return new C0358o4("", "face_or_market", false);
                    }
                    if (lowerCase.contains("picelement")) {
                        Object objM885d = m885d(obj, "getSourcePath");
                        String strValueOf = objM885d == null ? null : String.valueOf(objM885d);
                        if (strValueOf == null || strValueOf.length() == 0) {
                            Object objM891j2 = m891j(obj, "sourcePath");
                            strValueOf = objM891j2 != null ? String.valueOf(objM891j2) : null;
                        }
                        Object objM885d2 = m885d(obj, "getOriginal");
                        Object objM891j3 = m891j(obj, "original");
                        boolean zBooleanValue2 = objM891j3 instanceof Boolean ? ((Boolean) objM891j3).booleanValue() : (objM891j3 instanceof Number) && ((Number) objM891j3).intValue() != 0;
                        if (objM885d2 instanceof Boolean) {
                            zBooleanValue = ((Boolean) objM885d2).booleanValue();
                        } else if (!(objM885d2 instanceof Number)) {
                            zBooleanValue = zBooleanValue2;
                        } else if (((Number) objM885d2).intValue() == 0) {
                            zBooleanValue = false;
                        }
                        if (strValueOf == null || strValueOf.length() == 0) {
                            return new C0358o4("", "path_empty", false);
                        }
                        if (strValueOf.startsWith("file://")) {
                            strValueOf = strValueOf.substring(7);
                        }
                        String lowerCase2 = strValueOf.toLowerCase(locale);
                        if (lowerCase2.startsWith("http://") || lowerCase2.startsWith("https://") || lowerCase2.startsWith("content://")) {
                            return new C0358o4("", "non_file_path", false);
                        }
                        File file = new File(strValueOf);
                        return (!file.isFile() || file.length() <= 0) ? new C0358o4("", "file_missing", false) : new C0358o4(file.getAbsolutePath(), "", zBooleanValue);
                    }
                    if (obj.getClass().isArray() && !obj.getClass().getComponentType().isPrimitive()) {
                        try {
                            length = Array.getLength(obj);
                        } catch (Throwable unused) {
                            length = 0;
                        }
                        while (i2 < length && i2 < 64) {
                            C0358o4 c0358o4M890i2 = m890i(Array.get(obj, i2), i + 1, set, iArr);
                            if (c0358o4M890i2 != null) {
                                return c0358o4M890i2;
                            }
                            i2++;
                        }
                    } else if (obj instanceof Iterable) {
                        Iterator it = ((Iterable) obj).iterator();
                        while (it.hasNext() && i2 < 64) {
                            C0358o4 c0358o4M890i3 = m890i(it.next(), i + 1, set, iArr);
                            if (c0358o4M890i3 != null) {
                                return c0358o4M890i3;
                            }
                            i2++;
                        }
                    } else if (obj instanceof Map) {
                        Iterator it2 = ((Map) obj).entrySet().iterator();
                        while (it2.hasNext() && i2 < 64) {
                            Object next = it2.next();
                            if (next instanceof Map.Entry) {
                                Map.Entry entry = (Map.Entry) next;
                                int i3 = i + 1;
                                C0358o4 c0358o4M890i4 = m890i(entry.getValue(), i3, set, iArr);
                                if (c0358o4M890i4 != null) {
                                    return c0358o4M890i4;
                                }
                                C0358o4 c0358o4M890i5 = m890i(entry.getKey(), i3, set, iArr);
                                if (c0358o4M890i5 != null) {
                                    return c0358o4M890i5;
                                }
                            }
                            i2++;
                        }
                    } else {
                        Object objM891j4 = m891j(obj, "picElement");
                        if (objM891j4 != null && (c0358o4M890i = m890i(objM891j4, i + 1, set, iArr)) != null) {
                            return c0358o4M890i;
                        }
                        String[] strArr = {"marketFaceElement", "faceBubbleElement", "faceElement", "giphyElement"};
                        int i4 = 0;
                        while (true) {
                            if (i4 >= 4) {
                                objM891j = null;
                                break;
                            }
                            objM891j = m891j(obj, strArr[i4]);
                            if (objM891j != null) {
                                break;
                            }
                            i4++;
                        }
                        if (objM891j != null) {
                            return new C0358o4("", "face_or_market", false);
                        }
                        if (!lowerCase.startsWith("java.") && !lowerCase.startsWith("android.") && !lowerCase.startsWith("kotlin.")) {
                            int i5 = 0;
                            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class && i5 < 80; superclass = superclass.getSuperclass()) {
                                try {
                                    declaredFields = superclass.getDeclaredFields();
                                } catch (Throwable unused2) {
                                    declaredFields = null;
                                }
                                if (declaredFields != null) {
                                    for (int i6 = 0; i6 < declaredFields.length && i5 < 80; i6++) {
                                        Field field = declaredFields[i6];
                                        if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                                            String name2 = field.getName();
                                            String lowerCase3 = name2 == null ? "" : name2.toLowerCase(Locale.ROOT);
                                            if (lowerCase3.contains("pic") || lowerCase3.contains("image") || lowerCase3.contains("face") || lowerCase3.contains("element") || i <= 2) {
                                                i5++;
                                                try {
                                                    field.setAccessible(true);
                                                    C0358o4 c0358o4M890i6 = m890i(field.get(obj), i + 1, set, iArr);
                                                    if (c0358o4M890i6 != null) {
                                                        return c0358o4M890i6;
                                                    }
                                                } catch (Throwable unused3) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Object m891j(Object obj, String str) {
        if (obj != null && str != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    return declaredField.get(obj);
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Method m892k(Class cls) {
        Class<?> cls2;
        for (Method method : cls.getDeclaredMethods()) {
            if (method != null && method.getReturnType() != Void.TYPE) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == Uri.class && ((cls2 = parameterTypes[2]) == Boolean.TYPE || cls2 == Boolean.class)) {
                    method.setAccessible(true);
                    return method;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012c  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m893l(View view, EditText editText, int i, int[] iArr, C0243h4 c0243h4, int i2, int i3) {
        int iMax;
        int[] iArr2;
        int[] iArr3;
        int iAbs;
        Context context;
        int iMax2;
        int iMax3;
        EditText editText2 = editText;
        C0243h4 c0243h42 = c0243h4;
        if (view == null || i > (i = i2)) {
            return;
        }
        int i4 = 0;
        int i5 = iArr[0];
        int i6 = i3;
        if (i5 > i6) {
            return;
        }
        iArr[0] = i5 + 1;
        if (view != editText2) {
            try {
                if (view.isShown()) {
                    if (view.isEnabled()) {
                        CharSequence text = view instanceof TextView ? ((TextView) view).getText() : null;
                        String strTrim = text == null ? "" : text.toString().trim();
                        int iMax4 = "发送".equals(strTrim) ? 120 : (!strTrim.contains("发送") || strTrim.length() > 6) ? 0 : 95;
                        CharSequence contentDescription = view.getContentDescription();
                        if ((contentDescription != null ? contentDescription.toString().trim() : "").contains("发送")) {
                            iMax4 = Math.max(iMax4, 80);
                        }
                        String lowerCase = m904w(view).toLowerCase(Locale.ROOT);
                        if (lowerCase.contains("send") || lowerCase.contains("fun_btn")) {
                            iMax4 = Math.max(iMax4, 58);
                        }
                        if (iMax4 > 0 && m888g(editText2, view) != null) {
                            try {
                                iArr2 = new int[2];
                                iArr3 = new int[2];
                                editText2.getLocationOnScreen(iArr2);
                                view.getLocationOnScreen(iArr3);
                                iAbs = Math.abs((iArr3[1] + (view.getHeight() / 2)) - (iArr2[1] + (editText2.getHeight() / 2)));
                                context = editText2.getContext();
                            } catch (Throwable unused) {
                                iMax = 1;
                            }
                            if (context == null) {
                                iMax2 = 120;
                                if (iAbs <= iMax2) {
                                    iMax = 0;
                                } else {
                                    iMax = Math.max(1, 40 - ((iAbs * 40) / Math.max(1, iMax2)));
                                    int i7 = iArr3[0];
                                    int i8 = iArr2[0];
                                    Context context2 = editText2.getContext();
                                    if (context2 == null) {
                                        iMax3 = 24;
                                        if (i7 >= i8 - iMax3) {
                                            iMax += 12;
                                        }
                                    } else {
                                        try {
                                            iMax3 = Math.max(1, Math.round(24.0f * context2.getResources().getDisplayMetrics().density));
                                        } catch (Throwable unused2) {
                                            iMax3 = 24;
                                        }
                                        if (i7 >= i8 - iMax3) {
                                        }
                                    }
                                }
                                if (iMax <= 0 || iMax4 >= 100) {
                                    i4 = iMax4 + iMax;
                                }
                            } else {
                                try {
                                    iMax2 = Math.max(1, Math.round(120.0f * context.getResources().getDisplayMetrics().density));
                                } catch (Throwable unused3) {
                                    iMax2 = 120;
                                }
                                if (iAbs <= iMax2) {
                                }
                                if (iMax <= 0) {
                                    i4 = iMax4 + iMax;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused4) {
            }
        }
        if (i4 > c0243h42.f346a) {
            View viewM888g = m888g(editText2, view);
            if (viewM888g != null) {
                c0243h42.f347b = viewM888g;
            }
            c0243h42.f346a = i4;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 120) - 1;
            while (iMin >= 0) {
                m893l(viewGroup.getChildAt(iMin), editText2, i + 1, iArr, c0243h42, i, i6);
                iMin--;
                editText2 = editText;
                c0243h42 = c0243h4;
                int i9 = i2;
                i6 = i3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m894m(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            C0433r4 c0433r4 = (C0433r4) arrayList.get(i);
            if (c0433r4 != null && !c0433r4.f787a && c0433r4.f789c > c0433r4.f788b) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006b  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m895n(C0209f2 c0209f2, boolean z) {
        Editable text;
        boolean z2;
        boolean z3 = false;
        if (c0209f2 == null || !HookEntry.runtimeBool(Prefs.KEY_FAVORITE_EMOTICON_BATCH_SEND)) {
            return false;
        }
        synchronized (f832b) {
            try {
                if (f845o != c0209f2) {
                    return false;
                }
                EditText editText = (EditText) ((WeakReference) c0209f2.f245a).get();
                String string = null;
                if (editText == null) {
                    text = null;
                } else {
                    try {
                        text = editText.getText();
                    } catch (Throwable unused) {
                    }
                }
                if (text != null) {
                    string = text.toString();
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0265ia c0265ia = (C0265ia) c0209f2.f246b;
                int iHotReloadGeneration = HookEntry.hotReloadGeneration();
                synchronized (c0265ia) {
                    try {
                        if (c0265ia.f418g || jCurrentTimeMillis > c0265ia.f417f || c0265ia.f416e != iHotReloadGeneration || editText == null || editText != c0265ia.f413b.get()) {
                            z2 = false;
                        } else {
                            String str = c0265ia.f414c;
                            if (string == null) {
                                string = "";
                            }
                            if (str.equals(string)) {
                                z2 = true;
                            }
                        }
                    } finally {
                    }
                }
                if (!z2 || !z) {
                    return z2;
                }
                C0265ia c0265ia2 = (C0265ia) c0209f2.f246b;
                synchronized (c0265ia2) {
                    if (!c0265ia2.f418g && jCurrentTimeMillis <= c0265ia2.f417f) {
                        if (jCurrentTimeMillis <= c0265ia2.f419h) {
                            z3 = true;
                        }
                    }
                }
                return z3;
            } finally {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m896o(String str, int i) {
        return str == null ? "" : str.length() <= i ? str : str.substring(0, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m897p(String str) {
        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
            HookEntry.log("favorite emoticon mixed ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m898q(String str, XC_MethodHook.MethodHookParam methodHookParam, int i, EditText editText, Editable editable, ArrayList arrayList) {
        String strConcat;
        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" input=");
            sb.append(editText.getClass().getName());
            sb.append(" editable=");
            sb.append("class=" + editable.getClass().getName() + " len=" + editable.length() + " text=" + m881A(editable.toString()));
            sb.append(" spans=");
            try {
                Object[] spans = editable.getSpans(0, editable.length(), Object.class);
                if (spans == null || spans.length == 0) {
                    strConcat = "[]";
                } else {
                    StringBuilder sb2 = new StringBuilder("[");
                    int iMin = Math.min(spans.length, 8);
                    for (int i2 = 0; i2 < iMin; i2++) {
                        if (i2 > 0) {
                            sb2.append(',');
                        }
                        Object obj = spans[i2];
                        if (obj == null) {
                            sb2.append("null");
                        } else {
                            String name = obj.getClass().getName();
                            int iLastIndexOf = name.lastIndexOf(46);
                            if (iLastIndexOf >= 0) {
                                name = name.substring(iLastIndexOf + 1);
                            }
                            sb2.append(name);
                            if (obj instanceof ReplacementSpan) {
                                sb2.append(":replacement");
                            }
                        }
                    }
                    if (spans.length > iMin) {
                        sb2.append(",+");
                        sb2.append(spans.length - iMin);
                    }
                    sb2.append(']');
                    strConcat = sb2.toString();
                }
            } catch (Throwable th) {
                strConcat = "error:".concat(th.getClass().getSimpleName());
            }
            sb.append(strConcat);
            sb.append(" segments=");
            StringBuilder sb3 = new StringBuilder("[");
            for (int i3 = 0; i3 < arrayList.size() && i3 < 12; i3++) {
                if (i3 > 0) {
                    sb3.append(',');
                }
                C0433r4 c0433r4 = (C0433r4) arrayList.get(i3);
                if (c0433r4 == null) {
                    sb3.append("null");
                } else {
                    int i4 = c0433r4.f789c;
                    int i5 = c0433r4.f788b;
                    if (c0433r4.f787a) {
                        sb3.append("fav(");
                        sb3.append(i5);
                        sb3.append('-');
                        sb3.append(i4);
                        sb3.append(')');
                    } else {
                        sb3.append("text(");
                        sb3.append(i5);
                        sb3.append('-');
                        sb3.append(i4);
                        sb3.append(')');
                    }
                }
            }
            if (arrayList.size() > 12) {
                sb3.append(",+");
                sb3.append(arrayList.size() - 12);
            }
            sb3.append(']');
            sb.append(sb3.toString());
            sb.append(" sendEntry=");
            sb.append("null");
            sb.append(" sendMethod=");
            sb.append(m899r(methodHookParam));
            sb.append(" listIndex=");
            sb.append(i);
            sb.append(" spanMethod=");
            Method method = f835e;
            sb.append(method != null ? AbstractC0497v4.m1078E(method) : "null");
            m897p(sb.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static String m899r(XC_MethodHook.MethodHookParam methodHookParam) {
        if (methodHookParam == null) {
            return "null";
        }
        Member member = methodHookParam.method;
        return !(member instanceof Method) ? "null" : AbstractC0497v4.m1078E((Method) member);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static C0540y m900s(EditText editText) {
        Object objNewInstance;
        Method method = f835e;
        Object obj = f836f;
        if (method != null && obj != null) {
            return new C0540y(obj, method, false);
        }
        ClassLoader classLoader = f833c;
        if (classLoader == null && editText.getContext() != null) {
            classLoader = editText.getContext().getClassLoader();
        }
        if (classLoader != null) {
            synchronized (f831a) {
                try {
                    Method method2 = f835e;
                    Object obj2 = f836f;
                    if (method2 != null && obj2 != null) {
                        return new C0540y(obj2, method2, false);
                    }
                    if (f834d) {
                        return null;
                    }
                    f834d = true;
                    try {
                        Class clsM1091j = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.aio.input.fullscreen.InputImageUtils");
                        if (clsM1091j == null) {
                            m897p("official input image utils missing class=com.tencent.mobileqq.aio.input.fullscreen.InputImageUtils");
                            return null;
                        }
                        Field[] declaredFields = clsM1091j.getDeclaredFields();
                        int i = 0;
                        while (true) {
                            if (i < declaredFields.length) {
                                Field field = declaredFields[i];
                                try {
                                    if (Modifier.isStatic(field.getModifiers()) && clsM1091j.isAssignableFrom(field.getType())) {
                                        field.setAccessible(true);
                                        objNewInstance = field.get(null);
                                        if (objNewInstance != null) {
                                            break;
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                                i++;
                            } else {
                                try {
                                    Constructor declaredConstructor = clsM1091j.getDeclaredConstructor(null);
                                    declaredConstructor.setAccessible(true);
                                    objNewInstance = declaredConstructor.newInstance(null);
                                    break;
                                } catch (Throwable unused2) {
                                    objNewInstance = null;
                                }
                            }
                        }
                        Method methodM892k = m892k(clsM1091j);
                        if (objNewInstance != null && methodM892k != null) {
                            f836f = objNewInstance;
                            f835e = methodM892k;
                            m897p("official input image span ready method=" + AbstractC0497v4.m1078E(methodM892k));
                            return new C0540y(objNewInstance, methodM892k, false);
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("official input image span unresolved host=");
                        sb.append(objNewInstance == null ? "null" : objNewInstance.getClass().getName());
                        sb.append(" method=");
                        sb.append(methodM892k == null ? "null" : AbstractC0497v4.m1078E(methodM892k));
                        m897p(sb.toString());
                    } catch (Throwable th) {
                        m897p("official input image span resolve failed: " + th);
                    }
                } finally {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static ArrayList m901t(String str, ArrayList arrayList) {
        int iIndexOf;
        int i;
        ArrayList arrayList2 = new ArrayList();
        if (str != null && str.length() != 0 && !arrayList.isEmpty()) {
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= str.length()) {
                    break;
                }
                int i4 = i3 + 1;
                if (i3 >= 512) {
                    break;
                }
                C0543y2 c0543y2 = null;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    String str2 = (String) arrayList.get(i5);
                    if (str2 != null && str2.length() != 0 && (iIndexOf = str.indexOf(str2, i2)) >= 0) {
                        int length = str2.length() + iIndexOf;
                        if (c0543y2 == null || iIndexOf < (i = c0543y2.f1085b) || (iIndexOf == i && str2.length() > ((String) c0543y2.f1084a).length())) {
                            c0543y2 = new C0543y2();
                            c0543y2.f1084a = str2;
                            c0543y2.f1085b = iIndexOf;
                            c0543y2.f1086c = length;
                        }
                    }
                }
                if (c0543y2 != null) {
                    int i6 = c0543y2.f1086c;
                    int i7 = c0543y2.f1085b;
                    if (i7 > i2) {
                        arrayList2.add(new C0433r4(null, i2, i7, false));
                    }
                    arrayList2.add(new C0433r4((String) c0543y2.f1084a, i7, i6, true));
                    i3 = i4;
                    i2 = i6;
                } else if (i2 < str.length()) {
                    arrayList2.add(new C0433r4(null, i2, str.length(), false));
                    return arrayList2;
                }
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m902u(C0209f2 c0209f2, Runnable runnable, long j) {
        synchronized (c0209f2) {
            ((ArrayList) c0209f2.f247c).add(runnable);
        }
        EditText editText = (EditText) ((WeakReference) c0209f2.f245a).get();
        if (editText == null) {
            synchronized (c0209f2) {
                ((ArrayList) c0209f2.f247c).remove(runnable);
            }
            m887f(c0209f2, "input_missing");
            return;
        }
        try {
            if (editText.postDelayed(runnable, j)) {
                return;
            }
            synchronized (c0209f2) {
                ((ArrayList) c0209f2.f247c).remove(runnable);
            }
            m897p("auto send task rejected delay=" + j);
        } catch (Throwable th) {
            synchronized (c0209f2) {
                ((ArrayList) c0209f2.f247c).remove(runnable);
                m897p("auto send click schedule failed: " + th);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m903v(ClassLoader classLoader) {
        Class clsM1091j;
        Class clsM1091j2;
        if (classLoader != null) {
            f833c = classLoader;
            if (!f838h) {
                synchronized (f831a) {
                    try {
                        if (!f838h) {
                            f838h = true;
                            try {
                                clsM1091j2 = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.aio.input.sendmsg.b");
                            } catch (Throwable th) {
                                m897p("official send button click hook failed: " + th);
                            }
                            if (clsM1091j2 == null) {
                                m897p("official send button listener missing class=com.tencent.mobileqq.aio.input.sendmsg.b");
                            } else {
                                Method declaredMethod = clsM1091j2.getDeclaredMethod("onClick", View.class);
                                if (declaredMethod.getReturnType() != Void.TYPE) {
                                    m897p("official send button listener method incompatible=".concat(AbstractC0497v4.m1078E(declaredMethod)));
                                } else {
                                    declaredMethod.setAccessible(true);
                                    XposedBridge.hookMethod(declaredMethod, new C0326m4(40));
                                    f841k = declaredMethod;
                                    m897p("official send button click hook installed method=".concat(AbstractC0497v4.m1078E(declaredMethod)));
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            if (f837g) {
                return;
            }
            synchronized (f831a) {
                try {
                    if (f837g) {
                        return;
                    }
                    f837g = true;
                    try {
                        clsM1091j = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.aio.input.sendmsg.AIOSendMsgVMDelegate");
                    } catch (NoSuchMethodException unused) {
                    } catch (Throwable th2) {
                        m897p("official send delegate hook failed: " + th2);
                    }
                    if (clsM1091j == null) {
                        m897p("official send delegate missing class=com.tencent.mobileqq.aio.input.sendmsg.AIOSendMsgVMDelegate");
                        return;
                    }
                    Method declaredMethod2 = clsM1091j.getDeclaredMethod("E", null);
                    if (declaredMethod2.getParameterTypes().length == 0 && declaredMethod2.getReturnType() == Void.TYPE) {
                        declaredMethod2.setAccessible(true);
                        XposedBridge.hookMethod(declaredMethod2, new C0342n4(40));
                        f839i = declaredMethod2;
                        m897p("official send delegate hook installed method=".concat(AbstractC0497v4.m1078E(declaredMethod2)));
                        return;
                    }
                    m897p("official send delegate method incompatible=".concat(AbstractC0497v4.m1078E(declaredMethod2)));
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static String m904w(View view) {
        try {
            int id = view.getId();
            if (id != -1 && view.getContext() != null) {
                return view.getContext().getResources().getResourceEntryName(id);
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m905x(EditText editText, Editable editable, String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        try {
            if (str.equals(editable.toString())) {
                return;
            }
            editable.replace(0, editable.length(), str);
            editText.setSelection(editable.length());
            m897p("restored input text snapshot len=" + str.length());
        } catch (Throwable th) {
            m897p("restore input text failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m906y(Object obj, int i, Set set, C0401p4 c0401p4) {
        Field[] declaredFields;
        int length;
        if (obj == null || i > 4 || c0401p4.f698c) {
            return;
        }
        if (obj instanceof CharSequence) {
            if (obj.toString().contains("[ELARIS_FAV:")) {
                c0401p4.f698c = true;
                return;
            }
            return;
        }
        if ((obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Context) || (obj instanceof View) || set == null || !set.add(obj)) {
            return;
        }
        Class<?> superclass = obj.getClass();
        String lowerCase = superclass.getName().toLowerCase(Locale.ROOT);
        if (lowerCase.contains("picelement")) {
            c0401p4.f696a++;
            return;
        }
        if (lowerCase.contains("textelement")) {
            c0401p4.f697b++;
            return;
        }
        int i2 = 0;
        if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                i2++;
                if (i2 > 80) {
                    return;
                }
                m906y(obj2, i + 1, set, c0401p4);
                if (c0401p4.f698c) {
                    return;
                }
            }
            return;
        }
        if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i2++;
                if (i2 > 80) {
                    return;
                }
                int i3 = i + 1;
                m906y(entry.getKey(), i3, set, c0401p4);
                m906y(entry.getValue(), i3, set, c0401p4);
                if (c0401p4.f698c) {
                    return;
                }
            }
            return;
        }
        if (superclass.isArray() && !superclass.getComponentType().isPrimitive()) {
            try {
                length = Array.getLength(obj);
            } catch (Throwable unused) {
                length = 0;
            }
            while (i2 < length && i2 < 80) {
                try {
                    m906y(Array.get(obj, i2), i + 1, set, c0401p4);
                } catch (Throwable unused2) {
                }
                if (c0401p4.f698c) {
                    return;
                } else {
                    i2++;
                }
            }
            return;
        }
        Object objM891j = m891j(obj, "picElement");
        if (objM891j != null) {
            m906y(objM891j, i + 1, set, c0401p4);
            return;
        }
        Object objM891j2 = m891j(obj, "textElement");
        if (objM891j2 != null) {
            m906y(objM891j2, i + 1, set, c0401p4);
            return;
        }
        if (i >= 3 || lowerCase.startsWith("java.") || lowerCase.startsWith("android.") || lowerCase.startsWith("kotlin.")) {
            return;
        }
        int i4 = 0;
        while (superclass != null && superclass != Object.class && i4 < 48) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused3) {
                declaredFields = null;
            }
            if (declaredFields != null) {
                for (int i5 = 0; i5 < declaredFields.length && i4 < 48; i5++) {
                    Field field = declaredFields[i5];
                    try {
                        if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                            String name = field.getName();
                            String lowerCase2 = name == null ? "" : name.toLowerCase(Locale.ROOT);
                            if (lowerCase2.contains("pic") || lowerCase2.contains("image") || lowerCase2.contains("element") || lowerCase2.contains("msg")) {
                                i4++;
                                field.setAccessible(true);
                                m906y(field.get(obj), i + 1, set, c0401p4);
                                if (c0401p4.f698c) {
                                    return;
                                }
                            }
                        }
                    } catch (Throwable unused4) {
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m907z(EditText editText, String str) {
        if (editText == null || str.length() == 0) {
            return;
        }
        try {
            Context context = editText.getContext();
            if (context == null) {
                return;
            }
            RunnableC0258i3 runnableC0258i3 = new RunnableC0258i3(context, str, 2);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC0258i3.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnableC0258i3);
            }
        } catch (Throwable unused) {
        }
    }
}
