package p000;

import android.content.Context;
import android.view.View;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: qa */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0423qa {

    /* JADX INFO: renamed from: a */
    public static volatile long f752a;

    /* JADX INFO: renamed from: b */
    public static volatile long f753b;

    /* JADX INFO: renamed from: c */
    public static volatile long f754c;

    /* JADX INFO: renamed from: d */
    public static volatile long f755d;

    /* JADX INFO: renamed from: e */
    public static volatile long f756e;

    /* JADX INFO: renamed from: f */
    public static volatile long f757f;

    /* JADX INFO: renamed from: g */
    public static volatile long f758g;

    /* JADX INFO: renamed from: h */
    public static final ConcurrentHashMap f759h = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public static final ConcurrentHashMap f760i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: j */
    public static final ThreadLocal f761j = new ThreadLocal();

    /* JADX INFO: renamed from: k */
    public static final ThreadLocal f762k = new ThreadLocal();

    /* JADX INFO: renamed from: l */
    public static final ThreadLocal f763l = new ThreadLocal();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x019d, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m780A(Object obj, int i, Set set) {
        Field[] declaredFields;
        Field[] declaredFields2;
        Object objM780A;
        int length;
        Object objM780A2;
        if (obj != null && i <= 4 && set.add(obj) && !(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Context) && !(obj instanceof View)) {
            int i2 = 0;
            if (obj instanceof Collection) {
                for (Object obj2 : (Collection) obj) {
                    i2++;
                    if (i2 > 80) {
                        break;
                    }
                    Object objM780A3 = m780A(obj2, i + 1, set);
                    if (objM780A3 != null) {
                        return objM780A3;
                    }
                }
                return null;
            }
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    i2++;
                    if (i2 > 80) {
                        break;
                    }
                    int i3 = i + 1;
                    Object objM780A4 = m780A(entry.getValue(), i3, set);
                    if (objM780A4 != null) {
                        return objM780A4;
                    }
                    Object objM780A5 = m780A(entry.getKey(), i3, set);
                    if (objM780A5 != null) {
                        return objM780A5;
                    }
                }
                return null;
            }
            Class<?> cls = obj.getClass();
            if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
                try {
                    length = Array.getLength(obj);
                } catch (Throwable unused) {
                    length = 0;
                }
                while (i2 < length && i2 < 80) {
                    try {
                        objM780A2 = m780A(Array.get(obj, i2), i + 1, set);
                    } catch (Throwable unused2) {
                    }
                    if (objM780A2 != null) {
                        return objM780A2;
                    }
                    i2++;
                }
                return null;
            }
            if (obj.getClass().getName().toLowerCase(Locale.ROOT).contains("picelement")) {
                return obj;
            }
            Object objM802k = m802k(obj, "picElement");
            if (objM802k != null) {
                Object objM780A6 = m780A(objM802k, i + 1, set);
                return objM780A6 == null ? objM802k : objM780A6;
            }
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    declaredFields2 = superclass.getDeclaredFields();
                } catch (Throwable unused3) {
                    declaredFields2 = null;
                }
                if (declaredFields2 != null) {
                    for (Field field : declaredFields2) {
                        try {
                            if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                                field.setAccessible(true);
                                Object obj3 = field.get(obj);
                                if (obj3 != null) {
                                    String name = field.getName();
                                    Locale locale = Locale.ROOT;
                                    String lowerCase = name.toLowerCase(locale);
                                    String lowerCase2 = obj3.getClass().getName().toLowerCase(locale);
                                    if ((lowerCase.contains("pic") || lowerCase.contains("image") || lowerCase2.contains("pic")) && (objM780A = m780A(obj3, i + 1, set)) != null) {
                                        return objM780A;
                                    }
                                }
                            }
                        } catch (Throwable unused4) {
                        }
                    }
                }
            }
            if (i <= 4) {
                int i4 = 0;
                for (Class<?> superclass2 = obj.getClass(); superclass2 != null && superclass2 != Object.class && i4 < 96; superclass2 = superclass2.getSuperclass()) {
                    try {
                        declaredFields = superclass2.getDeclaredFields();
                    } catch (Throwable unused5) {
                        declaredFields = null;
                    }
                    if (declaredFields != null) {
                        for (Field field2 : declaredFields) {
                            if (i4 >= 96) {
                                break;
                            }
                            try {
                                if (!Modifier.isStatic(field2.getModifiers()) && !field2.getType().isPrimitive()) {
                                    field2.setAccessible(true);
                                    Object obj4 = field2.get(obj);
                                    if (m789J(obj4)) {
                                        i4++;
                                        Object objM780A7 = m780A(obj4, i + 1, set);
                                        if (objM780A7 != null) {
                                            return objM780A7;
                                        }
                                    }
                                }
                            } catch (Throwable unused6) {
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0291 A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:136:0x026d, B:138:0x0275, B:140:0x028b, B:141:0x028e, B:142:0x0291, B:144:0x029b, B:130:0x0253, B:134:0x0267, B:145:0x029f, B:147:0x02a7, B:149:0x02ad, B:151:0x02b9, B:154:0x02c3, B:156:0x02c9), top: B:196:0x026d }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x029f A[Catch: all -> 0x02d0, TryCatch #0 {all -> 0x02d0, blocks: (B:136:0x026d, B:138:0x0275, B:140:0x028b, B:141:0x028e, B:142:0x0291, B:144:0x029b, B:130:0x0253, B:134:0x0267, B:145:0x029f, B:147:0x02a7, B:149:0x02ad, B:151:0x02b9, B:154:0x02c3, B:156:0x02c9), top: B:196:0x026d }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x026d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v30 */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m781B(Object obj) {
        Field[] fieldArr;
        File fileM799h;
        Field[] declaredFields;
        int i;
        int i2;
        Field[] fieldArr2;
        Class<?> cls;
        boolean z;
        int i3;
        int i4;
        String strM815x;
        Object obj2;
        String str;
        ?? Equals;
        ?? M811t;
        String strM794c;
        String str2;
        C0209f2 c0209f2M783D = m783D(obj);
        int i5 = 0;
        if (((String) c0209f2M783D.f247c).length() == 0) {
            return 0;
        }
        String str3 = (String) c0209f2M783D.f247c;
        ArrayList arrayList = new ArrayList();
        m793b(str3, arrayList, new HashSet());
        Iterator it = ((ArrayList) c0209f2M783D.f245a).iterator();
        while (true) {
            fieldArr = null;
            if (it.hasNext()) {
                fileM799h = m799h(((C0407pa) it.next()).f720a);
                if (fileM799h != null && m810s(fileM799h.getAbsolutePath()) && !m811t(fileM799h.getAbsolutePath()) && m814w(fileM799h.getName()) && m785F(fileM799h, (String) c0209f2M783D.f247c, arrayList) >= 120) {
                    m795d((String) c0209f2M783D.f247c, fileM799h);
                    break;
                }
            } else {
                Iterator it2 = ((ArrayList) c0209f2M783D.f246b).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        fileM799h = null;
                        break;
                    }
                    fileM799h = ((C0364oa) it2.next()).f651a;
                    if (fileM799h.isFile() && m810s(fileM799h.getAbsolutePath()) && !m811t(fileM799h.getAbsolutePath()) && m814w(fileM799h.getName()) && m785F(fileM799h, (String) c0209f2M783D.f247c, arrayList) >= 120) {
                        m795d((String) c0209f2M783D.f247c, fileM799h);
                        break;
                    }
                }
            }
        }
        if (fileM799h == null) {
            String str4 = (String) c0209f2M783D.f247c;
            ArrayList arrayList2 = new ArrayList();
            m793b(str4, arrayList2, new HashSet());
            if (arrayList2.isEmpty()) {
                fileM799h = null;
            } else {
                try {
                    strM794c = m794c(str4);
                } catch (Throwable unused) {
                }
                if (strM794c.length() != 0 && (str2 = (String) f759h.get(strM794c)) != null && str2.length() != 0) {
                    File file = new File(str2);
                    if (!file.isFile()) {
                        file = null;
                    }
                    if (file == null || m785F(file, str4, arrayList2) < 220) {
                        C0348na c0348na = new C0348na();
                        ArrayList arrayList3 = new ArrayList();
                        HashSet hashSet = new HashSet();
                        Context contextHostContext = HookEntry.hostContext();
                        if (contextHostContext != null) {
                            try {
                                File externalFilesDir = contextHostContext.getExternalFilesDir(null);
                                File parentFile = externalFilesDir == null ? null : externalFilesDir.getParentFile();
                                m792a(arrayList3, hashSet, parentFile == null ? null : new File(parentFile, "Tencent/MobileQQ/photo"));
                            } catch (Throwable unused2) {
                            }
                        }
                        m792a(arrayList3, hashSet, new File("/storage/emulated/0/Android/data/com.tencent.mobileqq/Tencent/MobileQQ/photo"));
                        m792a(arrayList3, hashSet, new File("/sdcard/Android/data/com.tencent.mobileqq/Tencent/MobileQQ/photo"));
                        for (File file2 : (File[]) arrayList3.toArray(new File[0])) {
                            m784E(file2, arrayList2, str4, c0348na, 0, new int[]{0});
                        }
                        if (c0348na.f601b >= 220) {
                            m795d(str4, c0348na.f600a);
                            fileM799h = c0348na.f600a;
                        }
                    } else {
                        fileM799h = file;
                    }
                }
            }
        }
        boolean z2 = true;
        if (fileM799h == null || !fileM799h.isFile()) {
            String str5 = (String) c0209f2M783D.f247c;
            ArrayList arrayList4 = new ArrayList();
            HashSet hashSet2 = new HashSet();
            m793b(str5, arrayList4, hashSet2);
            int i6 = 0;
            for (C0407pa c0407pa : (ArrayList) c0209f2M783D.f245a) {
                i6++;
                if (i6 > 24) {
                    break;
                }
                m793b(c0407pa.f720a, arrayList4, hashSet2);
            }
            StringBuilder sb = new StringBuilder();
            int iMin = Math.min(arrayList4.size(), 6);
            for (int i7 = 0; i7 < iMin; i7++) {
                if (i7 > 0) {
                    sb.append(',');
                }
                sb.append((String) arrayList4.get(i7));
            }
            String string = sb.toString();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - f754c < 1800) {
                return 0;
            }
            f754c = jCurrentTimeMillis;
            HookEntry.logAlways("original image default path restore miss: cache=" + m782C(str5) + ", tokens=" + m782C(string));
            return 0;
        }
        String absolutePath = fileM799h.getAbsolutePath();
        String name = fileM799h.getName();
        long length = fileM799h.length();
        File file3 = (File) c0209f2M783D.f248d;
        long length2 = (file3 == null || !file3.isFile()) ? -1L : ((File) c0209f2M783D.f248d).length();
        Class<?> superclass = obj.getClass();
        int iM786G = 0;
        while (superclass != null && superclass != Object.class) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused3) {
                declaredFields = fieldArr;
            }
            if (declaredFields != null) {
                int length3 = declaredFields.length;
                i = i5;
                while (i5 < length3) {
                    Field field = declaredFields[i5];
                    if (Modifier.isStatic(field.getModifiers())) {
                        z = z2;
                    } else {
                        field.setAccessible(z2);
                        z = z2;
                        try {
                            strM815x = m815x(field.getName());
                            i3 = i5;
                        } catch (Throwable unused4) {
                            i3 = i5;
                        }
                        try {
                            obj2 = field.get(obj);
                            cls = superclass;
                        } catch (Throwable unused5) {
                            cls = superclass;
                        }
                        try {
                            i4 = iM786G;
                        } catch (Throwable unused6) {
                            i4 = iM786G;
                        }
                        if (field.getType() == String.class) {
                            try {
                            } catch (Throwable unused7) {
                                fieldArr2 = declaredFields;
                            }
                            if (obj2 instanceof String) {
                                String str6 = (String) obj2;
                                String str7 = (String) c0209f2M783D.f247c;
                                if (str6.length() == 0) {
                                    fieldArr2 = declaredFields;
                                    i2 = length3;
                                    M811t = i;
                                    if (M811t != 0) {
                                        try {
                                            field.set(obj, str6.startsWith("file://") ? "file://" + absolutePath.replace('\\', '/') : absolutePath);
                                            iM786G = i4 + 1;
                                        } catch (Throwable unused8) {
                                            iM786G = i4;
                                        }
                                    } else {
                                        if (m787H(strM815x, str6, (String) c0209f2M783D.f247c)) {
                                            field.set(obj, name);
                                            iM786G = i4 + 1;
                                        }
                                        iM786G = i4;
                                    }
                                } else {
                                    String strM791L = m791L(str6);
                                    if (m809r(strM815x) || strM791L.indexOf(47) >= 0 || strM791L.indexOf(92) >= 0) {
                                        if (strM791L == null || str7 == null) {
                                            str = strM791L;
                                            fieldArr2 = declaredFields;
                                            i2 = length3;
                                            Equals = i;
                                        } else {
                                            str = strM791L;
                                            fieldArr2 = declaredFields;
                                            try {
                                                i2 = length3;
                                                Equals = m791L(strM791L).replace('\\', '/').equals(m791L(str7).replace('\\', '/'));
                                            } catch (Throwable unused9) {
                                                i2 = length3;
                                            }
                                        }
                                        M811t = Equals != 0 ? z : m811t(str);
                                        if (M811t != 0) {
                                        }
                                    } else {
                                        fieldArr2 = declaredFields;
                                        i2 = length3;
                                        M811t = i;
                                        if (M811t != 0) {
                                        }
                                    }
                                }
                            } else {
                                fieldArr2 = declaredFields;
                                i2 = length3;
                                if ((obj2 instanceof File) && m809r(strM815x)) {
                                    if (m811t(((File) obj2).getAbsolutePath())) {
                                        field.set(obj, fileM799h);
                                        iM786G = i4 + 1;
                                    }
                                } else if (length > 0 && m788I(strM815x, obj2, length2)) {
                                    iM786G = i4 + m786G(field, obj, length);
                                }
                                iM786G = i4;
                            }
                        }
                        i5 = i3 + 1;
                        z2 = z;
                        superclass = cls;
                        declaredFields = fieldArr2;
                        length3 = i2;
                    }
                    i3 = i5;
                    cls = superclass;
                    i4 = iM786G;
                    fieldArr2 = declaredFields;
                    i2 = length3;
                    iM786G = i4;
                    i5 = i3 + 1;
                    z2 = z;
                    superclass = cls;
                    declaredFields = fieldArr2;
                    length3 = i2;
                }
            } else {
                i = i5;
            }
            boolean z3 = z2;
            superclass = superclass.getSuperclass();
            i5 = i;
            z2 = z3;
            fieldArr = null;
        }
        if (iM786G > 0) {
            String str8 = (String) c0209f2M783D.f247c;
            String absolutePath2 = fileM799h.getAbsolutePath();
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (jCurrentTimeMillis2 - f753b >= 1200) {
                f753b = jCurrentTimeMillis2;
                HookEntry.logAlways("original image default path restored: cache=" + m782C(str8) + ", original=" + m782C(absolutePath2) + ", fields=" + iM786G);
            }
        }
        return iM786G;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static String m782C(String str) {
        String strReplace = str == null ? "" : str.replace('\r', ' ').replace('\n', ' ').replace('\t', ' ');
        return strReplace.length() > 220 ? strReplace.substring(0, 220).concat("...") : strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static C0209f2 m783D(Object obj) {
        Field[] declaredFields;
        C0209f2 c0209f2 = new C0209f2();
        if (obj != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    declaredFields = superclass.getDeclaredFields();
                } catch (Throwable unused) {
                    declaredFields = null;
                }
                if (declaredFields != null) {
                    for (Field field : declaredFields) {
                        try {
                            if (!Modifier.isStatic(field.getModifiers())) {
                                field.setAccessible(true);
                                m815x(field.getName());
                                Object obj2 = field.get(obj);
                                if (obj2 instanceof String) {
                                    String str = (String) obj2;
                                    ((ArrayList) c0209f2.f245a).add(new C0407pa(str));
                                    String strM791L = m791L(str);
                                    if (m811t(strM791L) && ((String) c0209f2.f247c).length() == 0) {
                                        c0209f2.f247c = strM791L;
                                        c0209f2.f248d = m799h(str);
                                    }
                                } else if (obj2 instanceof File) {
                                    File file = (File) obj2;
                                    ((ArrayList) c0209f2.f246b).add(new C0364oa(file));
                                    String absolutePath = file.getAbsolutePath();
                                    if (m811t(absolutePath) && ((String) c0209f2.f247c).length() == 0) {
                                        c0209f2.f247c = absolutePath;
                                        c0209f2.f248d = file;
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
        }
        return c0209f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static void m784E(File file, ArrayList arrayList, String str, C0348na c0348na, int i, int[] iArr) {
        File[] fileArrListFiles;
        ArrayList arrayList2;
        String str2;
        C0348na c0348na2;
        int[] iArr2;
        if (file == null || !file.isDirectory() || iArr[0] >= 1200) {
            return;
        }
        try {
            fileArrListFiles = file.listFiles();
        } catch (Throwable unused) {
            fileArrListFiles = null;
        }
        if (fileArrListFiles == null) {
            return;
        }
        int length = fileArrListFiles.length;
        int i2 = 0;
        while (i2 < length) {
            File file2 = fileArrListFiles[i2];
            if (file2 == null || iArr[0] >= 1200) {
                return;
            }
            if (!file2.isDirectory()) {
                arrayList2 = arrayList;
                str2 = str;
                c0348na2 = c0348na;
                iArr2 = iArr;
                iArr2[0] = iArr2[0] + 1;
                int iM785F = m785F(file2, str2, arrayList2);
                if (iM785F > c0348na2.f601b) {
                    c0348na2.f600a = file2;
                    c0348na2.f601b = iM785F;
                }
            } else if (i < 1) {
                arrayList2 = arrayList;
                String str3 = str;
                c0348na2 = c0348na;
                iArr2 = iArr;
                m784E(file2, arrayList2, str3, c0348na2, i + 1, iArr2);
                str2 = str3;
            } else {
                arrayList2 = arrayList;
                str2 = str;
                c0348na2 = c0348na;
                iArr2 = iArr;
            }
            i2++;
            str = str2;
            arrayList = arrayList2;
            c0348na = c0348na2;
            iArr = iArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static int m785F(File file, String str, ArrayList arrayList) {
        int i = 0;
        if (!file.isFile() || !m814w(file.getName())) {
            return 0;
        }
        String strM815x = m815x(file.getName());
        String strM790K = m790K(m815x(AbstractC0497v4.m1083b(str)));
        if (strM790K.length() > 0 && strM815x.contains(strM790K)) {
            i = 220;
        }
        if (strM790K.length() > 0 && strM815x.endsWith(strM790K.concat("_0_wifi_0.jpg"))) {
            i += 320;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (str2.length() != 0 && strM815x.contains(str2)) {
                i = str2.length() >= 24 ? i + 90 : str2.length() >= 12 ? i + 36 : i + 10;
            }
        }
        if (strM815x.contains("_0_wifi_")) {
            i += 24;
        }
        if (m810s(file.getAbsolutePath())) {
            i += 24;
        }
        try {
            File fileM799h = m799h(str);
            long length = fileM799h == null ? -1L : fileM799h.length();
            return length > 0 ? file.length() > length ? i + 20 : i : i;
        } catch (Throwable unused) {
            return i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static int m786G(Field field, Object obj, long j) throws IllegalAccessException {
        Class<?> type = field.getType();
        if (type == Long.TYPE || type == Long.class) {
            field.set(obj, Long.valueOf(j));
            return 1;
        }
        if (type == Integer.TYPE || type == Integer.class) {
            field.set(obj, Integer.valueOf((int) Math.min(2147483647L, j)));
            return 1;
        }
        if (type != Short.TYPE && type != Short.class) {
            return 0;
        }
        field.set(obj, Short.valueOf((short) Math.min(32767L, j)));
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m787H(String str, String str2, String str3) {
        if (str2.length() == 0 || str == null || str.contains("path") || str.contains("url") || str.contains("uri") || str.contains("md5") || str.contains("sha") || str.contains("uin") || str.contains("uid") || str.contains("uuid")) {
            return false;
        }
        if (!str.contains("filename") && !str.contains("file_name") && !str.equals("name") && !str.endsWith("name")) {
            return false;
        }
        String strM1083b = AbstractC0497v4.m1083b(str2);
        String strM1083b2 = AbstractC0497v4.m1083b(str3);
        return strM1083b.equals(strM1083b2) || m790K(strM1083b).equals(m790K(strM1083b2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static boolean m788I(String str, Object obj, long j) {
        if (str == null || ((!str.equals("size") && !str.endsWith("size") && !str.contains("filesize") && !str.contains("filelen") && !str.contains("length")) || !(obj instanceof Number))) {
            return false;
        }
        long jLongValue = ((Number) obj).longValue();
        if (j <= 0 || jLongValue != j) {
            return jLongValue == 0 && (str.contains("file") || str.contains("origin") || str.contains("original") || str.contains("source") || str.contains("raw"));
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static boolean m789J(Object obj) {
        if (obj == null || (obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Context) || (obj instanceof View)) {
            return false;
        }
        if ((obj instanceof Collection) || (obj instanceof Map)) {
            return true;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray()) {
            return !cls.getComponentType().isPrimitive();
        }
        String lowerCase = cls.getName().toLowerCase(Locale.ROOT);
        return (lowerCase.startsWith("java.") || lowerCase.startsWith("android.") || lowerCase.startsWith("kotlin.")) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static String m790K(String str) {
        if (str == null) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(46);
        return iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static String m791L(String str) {
        return (str == null || !str.startsWith("file://")) ? str : str.substring(7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m792a(ArrayList arrayList, HashSet hashSet, File file) {
        if (file == null) {
            return;
        }
        try {
            if (hashSet.add(file.getCanonicalPath().replace('\\', '/').toLowerCase(Locale.ROOT))) {
                arrayList.add(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m793b(String str, ArrayList arrayList, HashSet hashSet) {
        if (str == null || str.length() == 0) {
            return;
        }
        String strM790K = m790K(m815x(AbstractC0497v4.m1083b(str)));
        if (strM790K.length() >= 16 && strM790K.length() <= 180 && hashSet.add(strM790K)) {
            arrayList.add(strM790K);
        }
        for (String str2 : strM790K.split("[^a-z0-9]+")) {
            if (str2 != null && str2.length() >= 8 && !"screenshot".equals(str2) && !"snapshot".equals(str2) && !"picture".equals(str2) && !"android".equals(str2) && !"mobileqq".equals(str2) && !"tencent".equals(str2) && hashSet.add(str2)) {
                arrayList.add(str2);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m794c(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        try {
            return new File(m791L(str)).getCanonicalPath().replace('\\', '/').toLowerCase(Locale.ROOT);
        } catch (Throwable unused) {
            return m791L(str).replace('\\', '/').toLowerCase(Locale.ROOT);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m795d(String str, File file) {
        try {
            String strM794c = m794c(str);
            if (strM794c.length() <= 0 || file == null || !file.isFile()) {
                return;
            }
            f759h.put(strM794c, file.getAbsolutePath());
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object m796e(Object obj, String str) {
        if (obj != null && str != null && str.length() != 0) {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    Method declaredMethod = superclass.getDeclaredMethod(str, null);
                    if (declaredMethod.getParameterTypes().length == 0) {
                        declaredMethod.setAccessible(true);
                        return declaredMethod.invoke(obj, null);
                    }
                } catch (NoSuchMethodException unused) {
                } catch (Throwable unused2) {
                    return null;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0137, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0137, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0137, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x011c, code lost:
    
        r7.setAccessible(true);
        r7 = r7.get(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0126, code lost:
    
        if ((r7 instanceof java.lang.String) == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x012f, code lost:
    
        if (((java.lang.String) r7).length() <= 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0131, code lost:
    
        r7 = (java.lang.String) r7;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m797f(Object obj) {
        Field[] declaredFields;
        if (obj != null) {
            C0209f2 c0209f2M783D = m783D(obj);
            if (((String) c0209f2M783D.f247c).length() > 0) {
                return "cache:" + m794c((String) c0209f2M783D.f247c);
            }
            Iterator it = ((ArrayList) c0209f2M783D.f245a).iterator();
            String strM815x = "";
            while (it.hasNext()) {
                String strM791L = m791L(((C0407pa) it.next()).f720a);
                if (strM791L.length() != 0) {
                    String strM815x2 = m815x(strM791L);
                    if (m811t(strM815x2) || m810s(strM815x2) || m814w(strM815x2)) {
                        if (m811t(strM815x2) || m810s(strM815x2)) {
                            strM815x = strM815x2;
                            break;
                        }
                        strM815x = strM815x2;
                    }
                }
            }
            if (strM815x.length() <= 0) {
                Iterator it2 = ((ArrayList) c0209f2M783D.f246b).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        strM815x = "";
                        break;
                    }
                    String absolutePath = ((C0364oa) it2.next()).f651a.getAbsolutePath();
                    if (absolutePath.length() != 0) {
                        strM815x = m815x(absolutePath);
                        if (m811t(strM815x) || m810s(strM815x) || m814w(strM815x)) {
                            break;
                        }
                    }
                }
            }
            if (strM815x.length() > 0) {
                return "path:" + m815x(strM815x);
            }
            String[] strArr = {"md5", "sha", "hash", "uuid", "guid"};
            loop2: for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    declaredFields = superclass.getDeclaredFields();
                } catch (Throwable unused) {
                    declaredFields = null;
                }
                if (declaredFields != null) {
                    int length = declaredFields.length;
                    for (int i = 0; i < length; i++) {
                        Field field = declaredFields[i];
                        try {
                            if (!Modifier.isStatic(field.getModifiers()) && field.getType() == String.class) {
                                String strM815x3 = m815x(field.getName());
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= 5) {
                                        break;
                                    }
                                    String str = strArr[i2];
                                    if (str != null && strM815x3.contains(str)) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            String str2 = "";
            if (str2.length() > 0) {
                return "hash:" + m815x(str2);
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static Object m798g(Object obj, String str) {
        int i = (str == null || !str.contains("compress")) ? 0 : 1;
        boolean z = str != null && str.contains("quality");
        if (obj == null || (obj instanceof Boolean)) {
            return Boolean.valueOf(i ^ 1);
        }
        if (obj instanceof Integer) {
            return Integer.valueOf(i == 0 ? z ? 100 : 1 : 0);
        }
        if (obj instanceof Long) {
            return Long.valueOf(i != 0 ? 0L : z ? 100L : 1L);
        }
        if (obj instanceof Short) {
            return Short.valueOf((short) (i == 0 ? z ? 100 : 1 : 0));
        }
        if (obj instanceof Byte) {
            return Byte.valueOf((byte) (i ^ 1));
        }
        if (obj instanceof String) {
            return i != 0 ? "0" : z ? "100" : "origin";
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static File m799h(String str) {
        if (str != null) {
            try {
                if (str.length() != 0 && !str.regionMatches(true, 0, "content://", 0, 10)) {
                    File file = new File(m791L(str));
                    if (file.isFile()) {
                        return file;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m800i(Object obj, String... strArr) {
        for (String str : strArr) {
            Object objM802k = m802k(obj, str);
            if ((objM802k instanceof CharSequence) && ((CharSequence) objM802k).length() > 0) {
                return objM802k.toString();
            }
            Object objM796e = m796e(obj, str);
            if ((objM796e instanceof CharSequence) && ((CharSequence) objM796e).length() > 0) {
                return objM796e.toString();
            }
            if (str != null && str.length() > 0) {
                Object objM796e2 = m796e(obj, "get" + Character.toUpperCase(str.charAt(0)) + str.substring(1));
                if ((objM796e2 instanceof CharSequence) && ((CharSequence) objM796e2).length() > 0) {
                    return objM796e2.toString();
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x027d, code lost:
    
        continue;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m801j(Object obj, int i, Set set) {
        Field[] declaredFields;
        Field[] declaredFields2;
        int length;
        int iM801j;
        Object value;
        Object objM798g;
        int i2 = 0;
        if (obj != null && i <= 5 && set.add(obj) && !(obj instanceof CharSequence) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Context) && !(obj instanceof View)) {
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                if (HookEntry.runtimeBool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT) && !collection.isEmpty()) {
                    Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
                    Iterator it = collection.iterator();
                    int i3 = 0;
                    int iM781B = 0;
                    while (it.hasNext()) {
                        Object objM780A = m780A(it.next(), 0, setNewSetFromMap);
                        if (objM780A != null) {
                            f761j.set(Boolean.TRUE);
                            i3++;
                            ConcurrentHashMap concurrentHashMap = AbstractC0006a5.f20a;
                            if (AbstractC0006a5.m35e(objM780A, 0, Collections.newSetFromMap(new IdentityHashMap()))) {
                                long jCurrentTimeMillis = System.currentTimeMillis();
                                if (jCurrentTimeMillis - f757f >= 1200) {
                                    f757f = jCurrentTimeMillis;
                                    HookEntry.logAlways("original image default skipped flash picture");
                                }
                            } else {
                                iM781B = m781B(objM780A) + m817z(objM780A) + iM781B;
                            }
                        }
                    }
                    if (i3 > 0) {
                        m812u(i3, iM781B);
                    }
                    return iM781B;
                }
            } else if (obj instanceof Map) {
                Map map = (Map) obj;
                if (!map.isEmpty() && i <= 5) {
                    if (map.isEmpty()) {
                        iM801j = 0;
                    } else {
                        try {
                            int i4 = 0;
                            iM801j = 0;
                            for (Object obj2 : map.entrySet()) {
                                try {
                                    i4++;
                                    if (i4 > 80) {
                                        break;
                                    }
                                    if (obj2 instanceof Map.Entry) {
                                        Map.Entry entry = (Map.Entry) obj2;
                                        String strM815x = m815x(String.valueOf(entry.getKey()));
                                        if (m808q(strM815x) && (objM798g = m798g((value = entry.getValue()), strM815x)) != null && !objM798g.equals(value)) {
                                            entry.setValue(objM798g);
                                            iM801j++;
                                        }
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        } catch (Throwable unused2) {
                            iM801j = 0;
                        }
                        if (iM801j > 0) {
                            f761j.set(Boolean.TRUE);
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            if (jCurrentTimeMillis2 - f756e >= 1200) {
                                f756e = jCurrentTimeMillis2;
                                HookEntry.logAlways("original image default send map forced: changed=" + iM801j);
                            }
                        }
                    }
                    for (Map.Entry entry2 : map.entrySet()) {
                        i2++;
                        if (i2 > 80) {
                            break;
                        }
                        try {
                            int i5 = i + 1;
                            iM801j += m801j(entry2.getKey(), i5, set);
                            iM801j += m801j(entry2.getValue(), i5, set);
                        } catch (Throwable unused3) {
                        }
                    }
                    return iM801j;
                }
            } else {
                Class<?> superclass = obj.getClass();
                if (superclass.isArray() && !superclass.getComponentType().isPrimitive()) {
                    try {
                        length = Array.getLength(obj);
                    } catch (Throwable unused4) {
                        length = 0;
                    }
                    int iM801j2 = 0;
                    while (i2 < length && i2 < 80) {
                        try {
                            iM801j2 += m801j(Array.get(obj, i2), i + 1, set);
                        } catch (Throwable unused5) {
                        }
                        i2++;
                    }
                    return iM801j2;
                }
                String lowerCase = superclass.getName().toLowerCase(Locale.ROOT);
                if (!lowerCase.contains("picelement") && !lowerCase.contains("pic") && !lowerCase.contains("image")) {
                    int iM801j3 = 0;
                    while (superclass != null && superclass != Object.class && iM801j3 == 0) {
                        try {
                            declaredFields2 = superclass.getDeclaredFields();
                        } catch (Throwable unused6) {
                            declaredFields2 = null;
                        }
                        if (declaredFields2 != null) {
                            for (Field field : declaredFields2) {
                                try {
                                    if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                                        String lowerCase2 = field.getName().toLowerCase(Locale.ROOT);
                                        if (lowerCase2.contains("pic") || lowerCase2.contains("image") || lowerCase2.contains("element") || lowerCase2.contains("msg")) {
                                            field.setAccessible(true);
                                            iM801j3 += m801j(field.get(obj), i + 1, set);
                                            if (iM801j3 > 0) {
                                                break;
                                            }
                                        }
                                    }
                                } catch (Throwable unused7) {
                                }
                            }
                        }
                        superclass = superclass.getSuperclass();
                    }
                    if (iM801j3 != 0 || i > 3 || !m789J(obj)) {
                        return iM801j3;
                    }
                    if (i <= 3) {
                        int i6 = 0;
                        int iM801j4 = 0;
                        loop6: for (Class<?> superclass2 = obj.getClass(); superclass2 != null && superclass2 != Object.class && i6 < 72; superclass2 = superclass2.getSuperclass()) {
                            try {
                                declaredFields = superclass2.getDeclaredFields();
                            } catch (Throwable unused8) {
                                declaredFields = null;
                            }
                            if (declaredFields != null) {
                                for (Field field2 : declaredFields) {
                                    if (i6 >= 72) {
                                        break;
                                    }
                                    try {
                                        if (!Modifier.isStatic(field2.getModifiers()) && !field2.getType().isPrimitive()) {
                                            field2.setAccessible(true);
                                            Object obj3 = field2.get(obj);
                                            if (m789J(obj3)) {
                                                i6++;
                                                iM801j4 += m801j(obj3, i + 1, set);
                                                if (iM801j4 > 0) {
                                                    break loop6;
                                                }
                                            }
                                        }
                                    } catch (Throwable unused9) {
                                    }
                                }
                            }
                        }
                        i2 = iM801j4;
                    }
                    return iM801j3 + i2;
                }
                Object objM780A2 = m780A(obj, 0, Collections.newSetFromMap(new IdentityHashMap()));
                if (objM780A2 != null) {
                    f761j.set(Boolean.TRUE);
                    ConcurrentHashMap concurrentHashMap2 = AbstractC0006a5.f20a;
                    if (!AbstractC0006a5.m35e(objM780A2, 0, Collections.newSetFromMap(new IdentityHashMap()))) {
                        int iM781B2 = m781B(objM780A2) + m817z(objM780A2);
                        m812u(1, iM781B2);
                        return iM781B2;
                    }
                    long jCurrentTimeMillis3 = System.currentTimeMillis();
                    if (jCurrentTimeMillis3 - f757f >= 1200) {
                        f757f = jCurrentTimeMillis3;
                        HookEntry.logAlways("original image default skipped flash picture");
                    }
                    m812u(1, 0);
                    return 0;
                }
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static Object m802k(Object obj, String str) {
        Class<?> superclass;
        Field declaredField;
        if (obj == null) {
            superclass = null;
        } else {
            try {
                superclass = obj.getClass();
            } catch (Throwable unused) {
                return null;
            }
        }
        if (superclass == null || str == null) {
            declaredField = null;
        } else {
            while (superclass != null && superclass != Object.class) {
                try {
                    declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    break;
                } catch (Throwable unused2) {
                    superclass = superclass.getSuperclass();
                }
            }
            declaredField = null;
        }
        if (declaredField == null) {
            return null;
        }
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m803l(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            for (Object obj : objArr) {
                if (m804m(obj, false, 0, setNewSetFromMap)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019e A[Catch: all -> 0x01de, TryCatch #4 {all -> 0x01de, blocks: (B:108:0x015c, B:110:0x0162, B:113:0x016c, B:115:0x0174, B:117:0x017c, B:119:0x0184, B:124:0x018f, B:130:0x019e, B:133:0x01b4, B:135:0x01ba, B:137:0x01c0, B:140:0x01c7, B:142:0x01cd, B:144:0x01d1, B:146:0x01d5, B:107:0x0156), top: B:162:0x0162 }] */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m804m(Object obj, boolean z, int i, Set set) {
        Field[] declaredFields;
        boolean z2;
        String lowerCase;
        boolean z3;
        Object obj2;
        int length;
        if (obj == null || i > 3 || set == null || !set.add(obj) || (obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Context) || (obj instanceof View)) {
            return false;
        }
        if (obj instanceof Collection) {
            int i2 = 0;
            for (Object obj3 : (Collection) obj) {
                i2++;
                if (i2 > 32) {
                    return false;
                }
                if (m804m(obj3, z, i + 1, set)) {
                }
            }
            return false;
        }
        if (obj instanceof Map) {
            int i3 = 0;
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                i3++;
                if (i3 > 32) {
                    return false;
                }
                int i4 = i + 1;
                if (m804m(entry.getKey(), z, i4, set) || m804m(entry.getValue(), z, i4, set)) {
                }
            }
            return false;
        }
        Class<?> cls = obj.getClass();
        if (cls.isArray() && !cls.getComponentType().isPrimitive()) {
            try {
                length = Array.getLength(obj);
            } catch (Throwable unused) {
                length = 0;
            }
            for (int i5 = 0; i5 < length && i5 < 32; i5++) {
                if (!m804m(Array.get(obj, i5), z, i + 1, set)) {
                }
            }
            return false;
        }
        String lowerCase2 = cls.getName().toLowerCase(Locale.ROOT);
        if (!lowerCase2.contains("picelement") && ((!z || (!lowerCase2.contains("marketface") && !lowerCase2.contains("facebubble") && !lowerCase2.contains("giphyelement"))) && m802k(obj, "picElement") == null && (!z || (m802k(obj, "marketFaceElement") == null && m802k(obj, "faceBubbleElement") == null && m802k(obj, "faceElement") == null && m802k(obj, "giphyElement") == null)))) {
            if (i >= 2) {
                return false;
            }
            try {
                declaredFields = cls.getDeclaredFields();
            } catch (Throwable unused2) {
                declaredFields = null;
            }
            if (declaredFields == null) {
                return false;
            }
            int i6 = 0;
            for (int i7 = 0; i7 < declaredFields.length && i6 < 32; i7++) {
                Field field = declaredFields[i7];
                if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                    String name = field.getName();
                    if (name == null) {
                        lowerCase = "";
                        z2 = false;
                    } else {
                        z2 = false;
                        lowerCase = name.toLowerCase(Locale.ROOT);
                    }
                    if (!lowerCase.equals("picelement")) {
                        try {
                            if (!lowerCase.equals("pic_element") && (!z || (!lowerCase.equals("marketfaceelement") && !lowerCase.equals("facebubbleelement") && !lowerCase.equals("faceelement") && !lowerCase.equals("giphyelement")))) {
                                z3 = z2;
                            }
                            field.setAccessible(true);
                            obj2 = field.get(obj);
                            if (z3 || obj2 == null) {
                                if (obj2 == null) {
                                    String lowerCase3 = obj2.getClass().getName().toLowerCase(Locale.ROOT);
                                    if (!lowerCase3.contains("picelement") && ((!z || (!lowerCase3.contains("marketface") && !lowerCase3.contains("facebubble") && !lowerCase3.contains("giphyelement"))) && ((i6 = i6 + 1) > 16 || ((!(obj2 instanceof Collection) && !(obj2 instanceof Map)) || !m804m(obj2, z, i + 1, set))))) {
                                    }
                                }
                            }
                        } catch (Throwable unused3) {
                            continue;
                        }
                    }
                    z3 = true;
                    field.setAccessible(true);
                    obj2 = field.get(obj);
                    if (z3) {
                    }
                    if (obj2 == null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static int m805n(String str, int i) {
        if (str.contains("compress")) {
            return 0;
        }
        if (str.contains("quality")) {
            return 100;
        }
        if ((str.contains("type") || str.contains("flag") || str.contains("source") || str.contains("raw")) && i > 0) {
            return i;
        }
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static int m806o(Object obj, String str) {
        Object objM802k = m802k(obj, str);
        if (objM802k instanceof Number) {
            return ((Number) objM802k).intValue();
        }
        Object objM796e = m796e(obj, str);
        if (objM796e instanceof Number) {
            return ((Number) objM796e).intValue();
        }
        if (str.length() <= 0) {
            return Integer.MIN_VALUE;
        }
        Object objM796e2 = m796e(obj, "get" + Character.toUpperCase(str.charAt(0)) + str.substring(1));
        if (objM796e2 instanceof Number) {
            return ((Number) objM796e2).intValue();
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m807p(String str) {
        if (str == null || str.length() == 0 || str.contains("summary") || str.contains("name") || str.contains("path") || str.contains("url")) {
            return false;
        }
        return str.contains("origin") || str.contains("original") || str.contains("raw") || str.contains("source") || str.contains("quality") || str.contains("compress");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static boolean m808q(String str) {
        if (str == null || str.length() == 0 || str.contains("summary") || str.contains("name") || str.contains("path") || str.contains("url") || str.contains("md5") || str.contains("sha") || str.contains("hash") || str.contains("uin") || str.contains("uid")) {
            return false;
        }
        return str.contains("origin") || str.contains("original") || str.contains("raw") || str.contains("quality") || str.contains("compress");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m809r(String str) {
        if (str == null) {
            return false;
        }
        return str.contains("path") || str.contains("local") || str.contains("uri") || str.equals("file") || str.endsWith("file");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m810s(String str) {
        return str != null && m815x(str).replace('\\', '/').contains("/tencent/mobileqq/photo/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static boolean m811t(String str) {
        return str != null && m815x(str).contains("rich_media_send_cache");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static void m812u(int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f752a < 1200) {
            return;
        }
        f752a = jCurrentTimeMillis;
        HookEntry.logAlways("original image default send patch: pic=" + i + ", changed=" + i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m813v(String str, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f758g < 1200) {
            return;
        }
        f758g = jCurrentTimeMillis;
        HookEntry.logAlways("original image duplicate send blocked: source=" + m782C(str) + ", count=" + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static boolean m814w(String str) {
        String strM815x = m815x(AbstractC0497v4.m1083b(str));
        return strM815x.endsWith(".jpg") || strM815x.endsWith(".jpeg") || strM815x.endsWith(".png") || strM815x.endsWith(".webp") || strM815x.endsWith(".gif") || strM815x.endsWith(".heic") || strM815x.endsWith(".heif");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static String m815x(String str) {
        return str == null ? "" : str.toLowerCase(Locale.ROOT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static int m816y(Object obj, String str, Field field) throws IllegalAccessException {
        int iIntValue;
        long jLongValue;
        Class<?> type = field.getType();
        Class<?> cls = Boolean.TYPE;
        if (type == cls || type == Boolean.class) {
            boolean z = !str.contains("compress");
            Object objValueOf = type == cls ? Boolean.valueOf(field.getBoolean(obj)) : field.get(obj);
            if ((objValueOf instanceof Boolean) && ((Boolean) objValueOf).booleanValue() == z) {
                return 0;
            }
            if (type == cls) {
                field.setBoolean(obj, z);
                return 1;
            }
            field.set(obj, Boolean.valueOf(z));
            return 1;
        }
        Class<?> cls2 = Integer.TYPE;
        if (type == cls2 || type == Integer.class) {
            if (type == cls2) {
                iIntValue = field.getInt(obj);
            } else {
                Object obj2 = field.get(obj);
                iIntValue = obj2 instanceof Number ? ((Number) obj2).intValue() : Integer.MIN_VALUE;
            }
            int iM805n = m805n(str, iIntValue);
            if (iIntValue == iM805n) {
                return 0;
            }
            if (type == cls2) {
                field.setInt(obj, iM805n);
                return 1;
            }
            field.set(obj, Integer.valueOf(iM805n));
            return 1;
        }
        Class<?> cls3 = Long.TYPE;
        if (type == cls3 || type == Long.class) {
            if (type == cls3) {
                jLongValue = field.getLong(obj);
            } else {
                Object obj3 = field.get(obj);
                jLongValue = obj3 instanceof Number ? ((Number) obj3).longValue() : Long.MIN_VALUE;
            }
            long jM805n = m805n(str, (int) Math.max(-2147483648L, Math.min(2147483647L, jLongValue)));
            if (jLongValue == jM805n) {
                return 0;
            }
            if (type == cls3) {
                field.setLong(obj, jM805n);
                return 1;
            }
            field.set(obj, Long.valueOf(jM805n));
            return 1;
        }
        if (type != String.class) {
            return 0;
        }
        Object obj4 = field.get(obj);
        String str2 = obj4 instanceof String ? (String) obj4 : "";
        if ("origin".equals(str2) || "original".equals(str2) || "raw".equals(str2)) {
            return 0;
        }
        if (str == null) {
            str = "";
        }
        if (str.contains("md5") || str.contains("sha") || str.contains("hash") || str.contains("uuid") || str.contains("guid") || str.contains("id") || str2.indexOf(47) >= 0 || str2.indexOf(92) >= 0 || str2.startsWith("content://") || m814w(str2) || str2.length() > 40) {
            return 0;
        }
        field.set(obj, "origin");
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static int m817z(Object obj) {
        Field[] declaredFields;
        int iM816y = 0;
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                declaredFields = superclass.getDeclaredFields();
            } catch (Throwable unused) {
                declaredFields = null;
            }
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    try {
                        if (!Modifier.isStatic(field.getModifiers())) {
                            String lowerCase = field.getName().toLowerCase(Locale.ROOT);
                            if (m807p(lowerCase)) {
                                field.setAccessible(true);
                                iM816y += m816y(obj, lowerCase, field);
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        return iM816y;
    }
}
