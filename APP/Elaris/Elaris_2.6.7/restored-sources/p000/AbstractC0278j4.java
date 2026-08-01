package p000;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0278j4 {

    /* JADX INFO: renamed from: a */
    public static final String[] f459a = {"com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy", "com.tencent.qqnt.kernelpublic.nativeinterface.IKernelMsgService$CppProxy"};

    /* JADX INFO: renamed from: b */
    public static final Set f460b = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: c */
    public static final ConcurrentHashMap f461c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d */
    public static final Map f462d = Collections.synchronizedMap(new IdentityHashMap());

    /* JADX INFO: renamed from: e */
    public static volatile C0227g4 f463e;

    /* JADX INFO: renamed from: f */
    public static volatile Handler f464f;

    /* JADX INFO: renamed from: g */
    public static volatile RunnableC0035c2 f465g;

    /* JADX INFO: renamed from: h */
    public static volatile boolean f466h;

    /* JADX INFO: renamed from: i */
    public static volatile boolean f467i;

    /* JADX INFO: renamed from: j */
    public static volatile long f468j;

    /* JADX INFO: renamed from: k */
    public static volatile long f469k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static synchronized void m704A() {
        f468j = 0L;
        f469k = 0L;
        m712d(null);
        f466h = false;
        f467i = false;
        f461c.clear();
        f462d.clear();
        f460b.clear();
        AbstractC0260i5.f399t = 0L;
        AbstractC0449s4.f833c = null;
        AbstractC0449s4.f834d = false;
        AbstractC0449s4.f835e = null;
        AbstractC0449s4.f836f = null;
        AbstractC0449s4.f837g = false;
        AbstractC0449s4.f838h = false;
        AbstractC0449s4.f839i = null;
        AbstractC0449s4.f840j = null;
        AbstractC0449s4.f841k = null;
        AbstractC0449s4.f842l = null;
        AbstractC0449s4.f843m = null;
        AbstractC0449s4.m887f(null, "reset");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static void m705B(View view, String str) {
        if (view == null || str.length() == 0) {
            return;
        }
        try {
            Context context = view.getContext();
            if (context == null) {
                return;
            }
            RunnableC0258i3 runnableC0258i3 = new RunnableC0258i3(context, str, 1);
            if (Looper.myLooper() == Looper.getMainLooper()) {
                runnableC0258i3.run();
            } else {
                new Handler(Looper.getMainLooper()).post(runnableC0258i3);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static void m706C(String str, ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            C0259i4 c0259i4 = (C0259i4) arrayList.get(i);
            if (c0259i4 != null) {
                m705B(c0259i4.f376c, str);
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static boolean m707D(int i, Object obj, ArrayList arrayList, Set set, int[] iArr) {
        Field[] declaredFields;
        boolean zM707D;
        int i2 = 0;
        if (i <= 4 && iArr[0] <= 180 && set.add(obj)) {
            iArr[0] = iArr[0] + 1;
            if (obj instanceof StringBuilder) {
                StringBuilder sb = (StringBuilder) obj;
                String strM708E = m708E(sb.toString(), arrayList);
                if (strM708E.equals(sb.toString())) {
                    return false;
                }
                sb.setLength(0);
                sb.append(strM708E);
                return true;
            }
            if (obj instanceof StringBuffer) {
                StringBuffer stringBuffer = (StringBuffer) obj;
                String strM708E2 = m708E(stringBuffer.toString(), arrayList);
                if (strM708E2.equals(stringBuffer.toString())) {
                    return false;
                }
                stringBuffer.setLength(0);
                stringBuffer.append(strM708E2);
                return true;
            }
            Class<?> superclass = obj.getClass();
            if (superclass.isArray()) {
                int iMin = Math.min(Array.getLength(obj), 40);
                boolean zM707D2 = false;
                while (i2 < iMin) {
                    Object obj2 = Array.get(obj, i2);
                    if (obj2 instanceof String) {
                        String strM708E3 = m708E((String) obj2, arrayList);
                        if (!strM708E3.equals(obj2)) {
                            try {
                                Array.set(obj, i2, strM708E3);
                                zM707D2 = true;
                            } catch (Throwable unused) {
                            }
                        }
                    } else if (obj2 != null && ((obj2 instanceof CharSequence) || !m726r(obj2.getClass()))) {
                        zM707D2 |= m707D(i + 1, obj2, arrayList, set, iArr);
                    }
                    i2++;
                }
                return zM707D2;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                int iMin2 = Math.min(list.size(), 40);
                boolean zM707D3 = false;
                while (i2 < iMin2) {
                    Object obj3 = list.get(i2);
                    if (obj3 instanceof String) {
                        String strM708E4 = m708E((String) obj3, arrayList);
                        if (!strM708E4.equals(obj3)) {
                            try {
                                list.set(i2, strM708E4);
                                zM707D3 = true;
                            } catch (Throwable unused2) {
                            }
                        }
                    } else if (obj3 != null && ((obj3 instanceof CharSequence) || !m726r(obj3.getClass()))) {
                        zM707D3 |= m707D(i + 1, obj3, arrayList, set, iArr);
                    }
                    i2++;
                }
                return zM707D3;
            }
            if (obj instanceof Map) {
                Iterator it = ((Map) obj).entrySet().iterator();
                boolean zM707D4 = false;
                while (it.hasNext() && i2 < 60) {
                    Object next = it.next();
                    if (next instanceof Map.Entry) {
                        Map.Entry entry = (Map.Entry) next;
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            String strM708E5 = m708E((String) value, arrayList);
                            if (!strM708E5.equals(value)) {
                                try {
                                    entry.setValue(strM708E5);
                                    zM707D4 = true;
                                } catch (Throwable unused3) {
                                }
                            }
                        } else if (value != null && ((value instanceof CharSequence) || !m726r(value.getClass()))) {
                            zM707D4 |= m707D(i + 1, value, arrayList, set, iArr);
                        }
                    }
                    i2++;
                }
                return zM707D4;
            }
            if (!(obj instanceof CharSequence) && !m726r(superclass) && !superclass.getName().startsWith("android.")) {
                int i3 = 0;
                boolean z = false;
                while (superclass != null && superclass != Object.class && i3 < 56) {
                    try {
                        declaredFields = superclass.getDeclaredFields();
                    } catch (Throwable unused4) {
                        declaredFields = null;
                    }
                    if (declaredFields != null) {
                        for (int i4 = 0; i4 < declaredFields.length && i3 < 56; i4++) {
                            Field field = declaredFields[i4];
                            if (!Modifier.isStatic(field.getModifiers())) {
                                i3++;
                                try {
                                    field.setAccessible(true);
                                    Object obj4 = field.get(obj);
                                    if (obj4 instanceof String) {
                                        String strM708E6 = m708E((String) obj4, arrayList);
                                        if (!strM708E6.equals(obj4)) {
                                            field.set(obj, strM708E6);
                                            z = true;
                                        }
                                    } else {
                                        if (obj4 instanceof StringBuilder) {
                                            StringBuilder sb2 = (StringBuilder) obj4;
                                            String strM708E7 = m708E(sb2.toString(), arrayList);
                                            if (!strM708E7.equals(sb2.toString())) {
                                                sb2.setLength(0);
                                                sb2.append(strM708E7);
                                                zM707D = true;
                                            }
                                            zM707D = false;
                                        } else if (obj4 instanceof StringBuffer) {
                                            StringBuffer stringBuffer2 = (StringBuffer) obj4;
                                            String strM708E8 = m708E(stringBuffer2.toString(), arrayList);
                                            if (strM708E8.equals(stringBuffer2.toString())) {
                                                zM707D = false;
                                            } else {
                                                stringBuffer2.setLength(0);
                                                stringBuffer2.append(strM708E8);
                                                zM707D = true;
                                            }
                                        } else if (obj4 != null && ((obj4 instanceof CharSequence) || !m726r(obj4.getClass()))) {
                                            zM707D = m707D(i + 1, obj4, arrayList, set, iArr);
                                        }
                                        z |= zM707D;
                                    }
                                } catch (Throwable unused5) {
                                }
                            }
                        }
                    }
                    superclass = superclass.getSuperclass();
                }
                return z;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static String m708E(String str, ArrayList arrayList) {
        if (str == null || str.length() == 0) {
            return "";
        }
        for (int i = 0; i < arrayList.size(); i++) {
            String str2 = (String) arrayList.get(i);
            if (str2 != null && str2.length() > 0) {
                str = str.replace(str2, "");
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            ArrayList arrayListM717i = m717i(str);
            if (arrayListM717i.isEmpty()) {
                break;
            }
            for (int i3 = 0; i3 < arrayListM717i.size(); i3++) {
                str = str.replace((CharSequence) arrayListM717i.get(i3), "");
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m709a(StringBuilder sb, Object obj, String str) {
        Object obj2;
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                Field declaredField = superclass.getDeclaredField(str);
                declaredField.setAccessible(true);
                obj2 = declaredField.get(obj);
                break;
            } catch (Throwable unused) {
            }
        }
        obj2 = null;
        if (obj2 == null) {
            return;
        }
        sb.append(' ');
        sb.append(str);
        sb.append('=');
        String strValueOf = String.valueOf(obj2);
        if (strValueOf.length() > 80) {
            strValueOf = strValueOf.substring(0, 80);
        }
        sb.append(strValueOf);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m710b(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        m714f(0, arrayList, arrayList2, m730v(), new int[]{0});
        String str = null;
        int i = 0;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            String str2 = (String) arrayList2.get(i2);
            int size = m717i(str2).size();
            if (size > 0 && (str == null || size > i || (size == i && str2.length() < str.length()))) {
                str = str2;
                i = size;
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m711c(long j) {
        Map map = f462d;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Long l = (Long) ((Map.Entry) it.next()).getValue();
            if (l == null || l.longValue() < j) {
                it.remove();
            }
        }
        if (map.size() > 32) {
            map.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static synchronized void m712d(C0227g4 c0227g4) {
        RunnableC0035c2 runnableC0035c2;
        Handler handler;
        if (c0227g4 == null) {
            f463e = null;
            runnableC0035c2 = f465g;
            f465g = null;
            handler = f464f;
            if (handler != null) {
                handler.removeCallbacks(runnableC0035c2);
            }
            return;
        }
        if (f463e != c0227g4) {
            return;
        }
        f463e = null;
        runnableC0035c2 = f465g;
        f465g = null;
        handler = f464f;
        if (handler != null && runnableC0035c2 != null) {
            handler.removeCallbacks(runnableC0035c2);
        }
        return;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m713e(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            C0259i4 c0259i4 = (C0259i4) arrayList.get(i);
            if (c0259i4 != null) {
                EditText editText = c0259i4.f376c;
                editText.post(new RunnableC0211f4(editText, 0));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m714f(int i, Object obj, ArrayList arrayList, Set set, int[] iArr) {
        if (obj == null || i > 3 || arrayList.size() >= 16) {
            return;
        }
        zContains = false;
        boolean zContains = false;
        if (iArr[0] <= 120 && set.add(obj)) {
            iArr[0] = iArr[0] + 1;
            if (obj instanceof CharSequence) {
                String string = obj.toString();
                if (string != null && string.length() != 0) {
                    zContains = string.contains("[ELARIS_FAV:");
                }
                if (!zContains || arrayList.contains(string)) {
                    return;
                }
                arrayList.add(string);
                return;
            }
            Class<?> superclass = obj.getClass();
            if (superclass.isArray()) {
                int iMin = Math.min(Array.getLength(obj), 30);
                for (int i2 = 0; i2 < iMin; i2++) {
                    m714f(i + 1, Array.get(obj, i2), arrayList, set, iArr);
                }
                return;
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                for (int i3 = 0; it.hasNext() && i3 < 30; i3++) {
                    m714f(i + 1, it.next(), arrayList, set, iArr);
                }
                return;
            }
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("android.")) {
                return;
            }
            int i4 = 0;
            while (superclass != null && superclass != Object.class && i4 < 36) {
                Field[] declaredFields = superclass.getDeclaredFields();
                for (int i5 = 0; i5 < declaredFields.length && i4 < 36; i5++) {
                    Field field = declaredFields[i5];
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i4++;
                        try {
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 != null && ((obj2 instanceof CharSequence) || !m726r(obj2.getClass()))) {
                                m714f(i + 1, obj2, arrayList, set, iArr);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }
                superclass = superclass.getSuperclass();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m715g(String str, ArrayList arrayList) {
        if (str != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                str = str.replace((CharSequence) arrayList.get(i), "");
            }
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isWhitespace(cCharAt) || Character.isSpaceChar(cCharAt) || Character.isISOControl(cCharAt) || cCharAt == 65532 || cCharAt == 65279 || (cCharAt >= 8203 && cCharAt <= 8207)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m716h(ArrayList arrayList, int i) {
        StringBuilder sb = new StringBuilder("[");
        int iMin = Math.min(arrayList.size(), Math.max(0, i));
        for (int i2 = 0; i2 < iMin; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            Object obj = arrayList.get(i2);
            if (obj == null) {
                sb.append("null");
            } else {
                String name = obj.getClass().getName();
                int iLastIndexOf = name.lastIndexOf(46);
                if (iLastIndexOf >= 0) {
                    name = name.substring(iLastIndexOf + 1);
                }
                sb.append(name);
                if (m731w(obj)) {
                    sb.append(":token");
                }
                if (m722n(obj, 0, m730v(), new int[]{0}, "")) {
                    sb.append(":reply");
                }
            }
        }
        if (arrayList.size() > iMin) {
            sb.append(",+");
            sb.append(arrayList.size() - iMin);
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static ArrayList m717i(String str) {
        int iIndexOf;
        ArrayList arrayList = new ArrayList();
        if (str != null && str.length() != 0) {
            int i = 0;
            while (i < str.length() && (iIndexOf = str.indexOf("[ELARIS_FAV:", i)) >= 0) {
                int i2 = iIndexOf + 12;
                int iIndexOf2 = str.indexOf("]", i2);
                if (iIndexOf2 >= 0) {
                    i2 = iIndexOf2 + 1;
                    arrayList.add(str.substring(iIndexOf, i2));
                }
                i = i2;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m718j(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj.getClass().getName());
        m709a(sb, obj, "emoId");
        m709a(sb, obj, "path");
        m709a(sb, obj, "resID");
        m709a(sb, obj, "md5");
        m709a(sb, obj, "epId");
        String string = sb.toString();
        return string.length() > 260 ? string.substring(0, 260) : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static EditText m719k(View view) {
        View rootView;
        int identifier;
        EditText editText = null;
        try {
            rootView = view.getRootView();
        } catch (Throwable unused) {
            rootView = null;
        }
        if (rootView == null) {
            rootView = view;
        }
        try {
            Context context = view.getContext();
            if (context != null && (identifier = context.getResources().getIdentifier("input", "id", context.getPackageName())) != 0) {
                View viewFindViewById = rootView.findViewById(identifier);
                if ((viewFindViewById instanceof EditText) && m727s((EditText) viewFindViewById)) {
                    editText = (EditText) viewFindViewById;
                }
            }
        } catch (Throwable unused2) {
        }
        if (editText != null) {
            return editText;
        }
        EditText editTextM720l = m720l(rootView, 0);
        return editTextM720l != null ? editTextM720l : m721m(rootView, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static EditText m720l(View view, int i) {
        if (view != null && i <= 8) {
            try {
                if ((view instanceof EditText) && view.hasFocus() && m727s((EditText) view)) {
                    return (EditText) view;
                }
            } catch (Throwable unused) {
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int iMin = Math.min(viewGroup.getChildCount(), 80) - 1; iMin >= 0; iMin--) {
                    EditText editTextM720l = m720l(viewGroup.getChildAt(iMin), i + 1);
                    if (editTextM720l != null) {
                        return editTextM720l;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static EditText m721m(View view, int i) {
        EditText editText = null;
        if (view != null && i <= 8) {
            if (view instanceof EditText) {
                EditText editText2 = (EditText) view;
                if (m727s(editText2)) {
                    return editText2;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int iMin = Math.min(viewGroup.getChildCount(), 80) - 1; iMin >= 0; iMin--) {
                    EditText editTextM721m = m721m(viewGroup.getChildAt(iMin), i + 1);
                    if (editTextM721m != null) {
                        if (editTextM721m.hasFocus()) {
                            return editTextM721m;
                        }
                        if (editText == null) {
                            editText = editTextM721m;
                        }
                    }
                }
            }
        }
        return editText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m722n(Object obj, int i, Set set, int[] iArr, String str) {
        if (obj != null && i <= 4 && iArr[0] <= 180 && set.add(obj)) {
            iArr[0] = iArr[0] + 1;
            String lowerCase = str == null ? "" : str.toLowerCase(Locale.ROOT);
            if ((!lowerCase.contains("reply") && !lowerCase.contains("quote")) || !m725q(obj)) {
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    if (!map.isEmpty()) {
                        Iterator it = map.entrySet().iterator();
                        for (int i2 = 0; it.hasNext() && i2 < 60; i2++) {
                            Object next = it.next();
                            if (next instanceof Map.Entry) {
                                Map.Entry entry = (Map.Entry) next;
                                String lowerCase2 = String.valueOf(entry.getKey()).toLowerCase(Locale.ROOT);
                                Object value = entry.getValue();
                                if (((lowerCase2.contains("reply") || lowerCase2.contains("quote")) && m725q(value)) || (value != null && m722n(value, i + 1, set, iArr, lowerCase2))) {
                                }
                            }
                        }
                    }
                } else if (obj instanceof CharSequence) {
                    String lowerCase3 = obj.toString().toLowerCase(Locale.ROOT);
                    if (((lowerCase.contains("reply") || lowerCase.contains("quote")) && lowerCase3.length() > 0) || lowerCase3.contains("replymsg") || lowerCase3.contains("replyinfo") || lowerCase3.contains("quotemsg") || lowerCase3.contains("quoteinfo")) {
                    }
                } else {
                    Class<?> superclass = obj.getClass();
                    if (superclass.isArray()) {
                        int iMin = Math.min(Array.getLength(obj), 40);
                        for (int i3 = 0; i3 < iMin; i3++) {
                            if (!m722n(Array.get(obj, i3), i + 1, set, iArr, lowerCase)) {
                            }
                        }
                    } else if (obj instanceof Iterable) {
                        Iterator it2 = ((Iterable) obj).iterator();
                        for (int i4 = 0; it2.hasNext() && i4 < 40; i4++) {
                            if (!m722n(it2.next(), i + 1, set, iArr, lowerCase)) {
                            }
                        }
                    } else {
                        String lowerCase4 = superclass.getName().toLowerCase(Locale.ROOT);
                        if ((!lowerCase4.contains("reply") && !lowerCase4.contains("quote")) || !m725q(obj)) {
                            if (!m726r(superclass) && !lowerCase4.startsWith("java.") && !lowerCase4.startsWith("android.")) {
                                int i5 = 0;
                                while (superclass != null && superclass != Object.class && i5 < 46) {
                                    Field[] declaredFields = superclass.getDeclaredFields();
                                    for (int i6 = 0; i6 < declaredFields.length && i5 < 46; i6++) {
                                        Field field = declaredFields[i6];
                                        if (!Modifier.isStatic(field.getModifiers())) {
                                            String name = field.getName();
                                            i5++;
                                            try {
                                                field.setAccessible(true);
                                                Object obj2 = field.get(obj);
                                                if (obj2 == null || !m722n(obj2, i + 1, set, iArr, name)) {
                                                }
                                            } catch (Throwable unused) {
                                                continue;
                                            }
                                        }
                                    }
                                    superclass = superclass.getSuperclass();
                                }
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static int m723o(ClassLoader classLoader) {
        int i = 0;
        for (String str : AbstractC0463t2.m1005f("target.kernel.msg_service_classes", f459a, classLoader)) {
            try {
                Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
                if (clsM1091j != null) {
                    for (Method method : clsM1091j.getDeclaredMethods()) {
                        int iM1094m = AbstractC0497v4.m1094m(method, ArrayList.class);
                        if (iM1094m >= 0 && "sendMsg".equals(method.getName()) && !Modifier.isAbstract(method.getModifiers()) && method.getReturnType() == Void.TYPE) {
                            String strM1078E = AbstractC0497v4.m1078E(method);
                            if (f460b.add(strM1078E)) {
                                method.setAccessible(true);
                                XposedBridge.hookMethod(method, new C0195e4(iM1094m));
                                i++;
                                HookEntry.log("hooked favorite emoticon batch sendMsg: " + strM1078E);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                m729u("favorite emoticon batch send hook skip: " + th);
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:12:0x0012, B:14:0x001d, B:19:0x0027, B:20:0x002d, B:22:0x0031, B:35:0x0060, B:25:0x0036, B:27:0x0042, B:30:0x004b, B:32:0x0052, B:34:0x005c, B:37:0x0064, B:39:0x006a, B:41:0x006e, B:48:0x009b, B:49:0x009d, B:51:0x00a0, B:53:0x00a4, B:56:0x00a9, B:57:0x00af, B:61:0x00ca, B:63:0x00de, B:66:0x00e3, B:60:0x00c6, B:43:0x0075, B:46:0x0082), top: B:75:0x0012, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:12:0x0012, B:14:0x001d, B:19:0x0027, B:20:0x002d, B:22:0x0031, B:35:0x0060, B:25:0x0036, B:27:0x0042, B:30:0x004b, B:32:0x0052, B:34:0x005c, B:37:0x0064, B:39:0x006a, B:41:0x006e, B:48:0x009b, B:49:0x009d, B:51:0x00a0, B:53:0x00a4, B:56:0x00a9, B:57:0x00af, B:61:0x00ca, B:63:0x00de, B:66:0x00e3, B:60:0x00c6, B:43:0x0075, B:46:0x0082), top: B:75:0x0012, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c6 A[Catch: all -> 0x0024, TryCatch #0 {all -> 0x0024, blocks: (B:12:0x0012, B:14:0x001d, B:19:0x0027, B:20:0x002d, B:22:0x0031, B:35:0x0060, B:25:0x0036, B:27:0x0042, B:30:0x004b, B:32:0x0052, B:34:0x005c, B:37:0x0064, B:39:0x006a, B:41:0x006e, B:48:0x009b, B:49:0x009d, B:51:0x00a0, B:53:0x00a4, B:56:0x00a9, B:57:0x00af, B:61:0x00ca, B:63:0x00de, B:66:0x00e3, B:60:0x00c6, B:43:0x0075, B:46:0x0082), top: B:75:0x0012, outer: #1 }] */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized void m724p(ClassLoader classLoader) {
        Class clsM1091j;
        Method method;
        int i;
        int i2;
        if (classLoader != null) {
            if (!f466h || !f467i) {
                try {
                    AbstractC0449s4.m903v(classLoader);
                    clsM1091j = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.emoticonview.FavoriteEmotionAdapter");
                } catch (Throwable th) {
                    HookEntry.log("favorite emoticon batch install failed: " + th);
                }
                if (clsM1091j == null) {
                    HookEntry.log("favorite emoticon batch target not found: com.tencent.mobileqq.emoticonview.FavoriteEmotionAdapter");
                    return;
                }
                Method[] declaredMethods = clsM1091j.getDeclaredMethods();
                boolean z = false;
                int i3 = 0;
                while (true) {
                    if (i3 >= declaredMethods.length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i3];
                    if (method != null && "onClick".equals(method.getName()) && method.getReturnType() == Void.TYPE) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length == 1 && View.class.isAssignableFrom(parameterTypes[0])) {
                            method.setAccessible(true);
                            break;
                        }
                    }
                    i3++;
                }
                int iM723o = m723o(classLoader);
                if (iM723o > 0) {
                    f467i = true;
                }
                if (method == null) {
                    HookEntry.log("favorite emoticon batch send method not found");
                } else {
                    String strM1078E = AbstractC0497v4.m1078E(method);
                    if (f460b.add(strM1078E)) {
                        method.setAccessible(true);
                        XposedBridge.hookMethod(method, new C0179d4(72));
                        HookEntry.log("hooked favorite emoticon batch click: ".concat(strM1078E));
                        i = 1;
                        if (i > 0) {
                            f466h = true;
                        }
                        i2 = i + iM723o;
                        if (i2 <= 0 || f466h || f467i) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("favorite emoticon batch hooks installed count=");
                            sb.append(i2);
                            sb.append(" click=");
                            sb.append(method != null ? "null" : AbstractC0497v4.m1078E(method));
                            sb.append(" send=");
                            sb.append(iM723o);
                            sb.append(" active=");
                            if (f466h && f467i) {
                                z = true;
                            }
                            sb.append(z);
                            HookEntry.log(sb.toString());
                        } else {
                            HookEntry.log("favorite emoticon batch hook target not found");
                        }
                    }
                }
                i = 0;
                if (i > 0) {
                }
                i2 = i + iM723o;
                if (i2 <= 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("favorite emoticon batch hooks installed count=");
                    sb2.append(i2);
                    sb2.append(" click=");
                    sb2.append(method != null ? "null" : AbstractC0497v4.m1078E(method));
                    sb2.append(" send=");
                    sb2.append(iM723o);
                    sb2.append(" active=");
                    if (f466h) {
                        z = true;
                    }
                    sb2.append(z);
                    HookEntry.log(sb2.toString());
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m725q(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : obj instanceof Number ? ((Number) obj).longValue() != 0 : obj instanceof CharSequence ? obj.toString().trim().length() > 0 : obj instanceof Map ? !((Map) obj).isEmpty() : obj instanceof Iterable ? ((Iterable) obj).iterator().hasNext() : !obj.getClass().isArray() || Array.getLength(obj) > 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m726r(Class cls) {
        return cls.isPrimitive() || cls.isEnum() || Number.class.isAssignableFrom(cls) || Boolean.class == cls || Character.class == cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m727s(EditText editText) {
        if (editText == null) {
            return false;
        }
        try {
            if (editText.isShown()) {
                if (editText.isEnabled()) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static ArrayList m728t(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            C0259i4 c0259i4 = (C0259i4) f461c.get(arrayList.get(i));
            if (c0259i4 != null) {
                arrayList2.add(c0259i4);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m729u(String str) {
        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
            HookEntry.log(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static Set m730v() {
        return Collections.newSetFromMap(new IdentityHashMap());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static boolean m731w(Object obj) {
        m714f(0, obj, new ArrayList(), m730v(), new int[]{0});
        return !r0.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0160  */
    /* JADX INFO: renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m732x(View view, String str) {
        EditText editTextM719k;
        Editable text;
        char c;
        if (!HookEntry.runtimeBool(Prefs.KEY_FAVORITE_EMOTICON_BATCH_SEND) || f461c.isEmpty() || (editTextM719k = m719k(view)) == null) {
            return false;
        }
        Editable text2 = null;
        try {
            text = editTextM719k.getText();
        } catch (Throwable unused) {
            text = null;
        }
        if (text == null || text.length() == 0) {
            return false;
        }
        String string = text.toString();
        ArrayList arrayListM717i = m717i(string);
        if (arrayListM717i.isEmpty() || m715g(string, arrayListM717i)) {
            return false;
        }
        ArrayList arrayListM728t = m728t(arrayListM717i);
        if (arrayListM728t.isEmpty()) {
            return false;
        }
        if (arrayListM717i.isEmpty() || arrayListM728t.isEmpty()) {
            c = 0;
        } else {
            if (arrayListM717i.size() > 16) {
                AbstractC0449s4.m907z(editTextM719k, "混合发送收藏表情数量过多，已拦截");
                AbstractC0449s4.m897p("blocked before official click reason=too_many_tokens count=" + arrayListM717i.size() + " source=" + str);
            } else {
                try {
                    text2 = editTextM719k.getText();
                } catch (Throwable unused2) {
                }
                if (text2 == null) {
                    AbstractC0449s4.m907z(editTextM719k, "输入框内容未就绪，已拦截混合发送");
                    AbstractC0449s4.m897p("blocked before official click reason=editable_missing input=" + editTextM719k.getClass().getName() + " source=" + str);
                } else {
                    if (string == null) {
                        string = text2.toString();
                    }
                    ArrayList arrayListM901t = AbstractC0449s4.m901t(string, arrayListM717i);
                    if (AbstractC0449s4.m894m(arrayListM901t) && AbstractC0449s4.m889h(arrayListM901t) > 0) {
                        C0540y c0540yM900s = AbstractC0449s4.m900s(editTextM719k);
                        if (c0540yM900s == null) {
                            AbstractC0449s4.m905x(editTextM719k, text2, string);
                            AbstractC0449s4.m907z(editTextM719k, "未找到QQ官方图文输入链路，已拦截");
                            AbstractC0449s4.m898q("blocked before_official_click reason=official_span_missing source=".concat(str), null, -1, editTextM719k, text2, arrayListM901t);
                        } else {
                            Editable editable = text2;
                            ArrayList arrayListM884c = AbstractC0449s4.m884c(string, arrayListM901t, arrayListM728t, c0540yM900s);
                            if (arrayListM884c.size() != AbstractC0449s4.m889h(arrayListM901t)) {
                                AbstractC0449s4.m905x(editTextM719k, editable, string);
                                AbstractC0449s4.m907z(editTextM719k, "部分收藏表情不支持混合发送，已拦截");
                                AbstractC0449s4.m898q("blocked before_official_click reason=unsupported_favorite replacement=" + arrayListM884c.size() + "/" + AbstractC0449s4.m889h(arrayListM901t) + " source=" + str, null, -1, editTextM719k, editable, arrayListM901t);
                            } else if (AbstractC0449s4.m882a(editTextM719k, editable, string, arrayListM884c)) {
                                AbstractC0449s4.m883b(editTextM719k, editable.toString(), arrayListM884c.size(), true);
                                AbstractC0449s4.m898q("converted before_official_click source=".concat(str), null, -1, editTextM719k, editable, arrayListM901t);
                                c = 1;
                            } else {
                                AbstractC0449s4.m905x(editTextM719k, editable, string);
                                AbstractC0449s4.m907z(editTextM719k, "输入框官方图文内容写入失败，已拦截");
                                AbstractC0449s4.m898q("blocked before_official_click reason=span_apply_failed source=".concat(str), null, -1, editTextM719k, editable, arrayListM901t);
                            }
                        }
                    }
                }
            }
            c = 2;
        }
        if (c != 1) {
            return c == 2;
        }
        m733y(arrayListM717i);
        m729u("favorite emoticon mixed prepared before official click tokens=" + arrayListM717i.size() + " reason=" + str);
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m733y(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            f461c.remove(arrayList.get(i));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m734z(XC_MethodHook.MethodHookParam methodHookParam, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, boolean z, String str) {
        int i2;
        Object[] objArr = methodHookParam.args;
        if (objArr != null && i >= 0 && i < objArr.length && !arrayList3.isEmpty()) {
            String strM716h = HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG) ? m716h(arrayList, 6) : "";
            ArrayList arrayList4 = new ArrayList();
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                Object obj = arrayList.get(i6);
                if (obj != null) {
                    if (!m731w(obj)) {
                        arrayList4.add(obj);
                        i3++;
                    } else if (!m707D(0, obj, arrayList2, m730v(), new int[]{0}) || m731w(obj)) {
                        i4++;
                    } else {
                        arrayList4.add(obj);
                        i3++;
                        i5++;
                    }
                }
            }
            int i7 = 0;
            for (int i8 = 0; i8 < arrayList3.size(); i8++) {
                C0259i4 c0259i4 = (C0259i4) arrayList3.get(i8);
                C0243h4 c0243h4 = c0259i4 == null ? null : c0259i4.f379f;
                if (c0243h4 != null && (i2 = c0243h4.f346a) >= 0) {
                    Object[] objArr2 = (Object[]) c0243h4.f347b;
                    if (i2 < objArr2.length) {
                        Object obj2 = objArr2[i2];
                        if (obj2 instanceof ArrayList) {
                            ArrayList arrayList5 = (ArrayList) obj2;
                            for (int i9 = 0; i9 < arrayList5.size(); i9++) {
                                Object obj3 = arrayList5.get(i9);
                                if (obj3 != null) {
                                    arrayList4.add(obj3);
                                    i7++;
                                }
                            }
                        }
                    }
                }
            }
            if (i7 > 0 && (!z || i3 > 0)) {
                Object[] objArr3 = methodHookParam.args;
                objArr3[i] = arrayList4;
                try {
                    if (HookEntry.runtimeBool(Prefs.KEY_PIC_SUMMARY_ENABLED)) {
                        AbstractC0260i5.m520C1(arrayList4, HookEntry.findContactArg(objArr3), true);
                    }
                } catch (Throwable th) {
                    m729u("favorite emoticon batch pic summary failed: " + th);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Map map = f462d;
                synchronized (map) {
                    m711c(jCurrentTimeMillis);
                    map.put(arrayList4, Long.valueOf(jCurrentTimeMillis + 10000));
                }
                AbstractC0423qa.f763l.set(Boolean.TRUE);
                m729u("favorite emoticon batch " + str + " merged official send kept=" + i3 + " appended=" + i7 + " cleanedTokenElements=" + i5 + " droppedTokenElements=" + i4 + " trigger=" + strM716h + " merged=" + m716h(arrayList4, 8));
                return true;
            }
        }
        return false;
    }
}
