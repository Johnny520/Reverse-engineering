package p000;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: renamed from: h3 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0242h3 {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f342b;

    /* JADX INFO: renamed from: a */
    public static final C0461t0 f341a = new C0461t0(64);

    /* JADX INFO: renamed from: c */
    public static final ThreadLocal f343c = new ThreadLocal();

    /* JADX INFO: renamed from: d */
    public static final Object f344d = new Object();

    /* JADX INFO: renamed from: e */
    public static final HashMap f345e = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static Object m472A(Object obj, String str, String str2) {
        if (obj != null) {
            try {
                return obj.getClass().getMethod(str, null).invoke(obj, null);
            } catch (Throwable unused) {
                for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    try {
                        Method declaredMethod = superclass.getDeclaredMethod(str, null);
                        if (declaredMethod.getParameterTypes().length == 0) {
                            declaredMethod.setAccessible(true);
                            return declaredMethod.invoke(obj, null);
                        }
                    } catch (Throwable unused2) {
                    }
                }
                try {
                    return obj.getClass().getField(str2).get(obj);
                } catch (Throwable unused3) {
                    for (Class<?> superclass2 = obj.getClass(); superclass2 != null && superclass2 != Object.class; superclass2 = superclass2.getSuperclass()) {
                        try {
                            Field declaredField = superclass2.getDeclaredField(str2);
                            declaredField.setAccessible(true);
                            return declaredField.get(obj);
                        } catch (Throwable unused4) {
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX INFO: renamed from: B */
    public static int m473B(Object obj, File file, long j) {
        String absolutePath = file.getAbsolutePath();
        String name = file.getName();
        Object objM472A = m472A(obj, "getMsgRecord", "msgRecord");
        long jM507w = m507w(obj, "getMsgElementId", "msgElementId");
        Object objM472A2 = m472A(objM472A, "getElements", "elements");
        ?? M508x = 0;
        M508x = 0;
        if (objM472A2 instanceof Iterable) {
            Iterator it = ((Iterable) objM472A2).iterator();
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (next != null) {
                        long jM507w2 = m507w(next, "getElementId", "elementId");
                        Object objM472A3 = m472A(next, "getFileElement", "fileElement");
                        if (objM472A3 != null) {
                            if (jM507w != 0 && jM507w2 == jM507w) {
                                if (!m494j(objM472A3, absolutePath, name, j) ? false : m508x(objM472A3, absolutePath)) {
                                    M508x = 1;
                                    break;
                                }
                            }
                            if (obj2 == null && m494j(objM472A3, absolutePath, name, j)) {
                                obj2 = objM472A3;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (m494j(obj2, absolutePath, name, j)) {
                    M508x = m508x(obj2, absolutePath);
                }
            }
        }
        return M508x > 0 ? M508x : m474C(obj, absolutePath, name, j, Collections.newSetFromMap(new IdentityHashMap()), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static int m474C(Object obj, String str, String str2, long j, Set set, int i) {
        Set set2 = set;
        int iM474C = 0;
        if (obj != null && i <= 6 && !(obj instanceof String) && !(obj instanceof Number) && !(obj instanceof Boolean) && !(obj instanceof Character) && !(obj instanceof Enum) && !set2.contains(obj)) {
            set2.add(obj);
            if (m506v(obj)) {
                if (m494j(obj, str, str2, j)) {
                    return m508x(obj, str) ? 1 : 0;
                }
                return 0;
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    iM474C += m474C(it.next(), str, str2, j, set2, i + 1);
                    if (iM474C > 0) {
                        return iM474C;
                    }
                    set2 = set;
                }
                return iM474C;
            }
            if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).values().iterator();
                while (it2.hasNext() && (iM474C = iM474C + m474C(it2.next(), str, str2, j, set, i + 1)) <= 0) {
                }
                return iM474C;
            }
            Class<?> cls = obj.getClass();
            if (cls.isArray()) {
                int length = Array.getLength(obj);
                int iM474C2 = 0;
                while (iM474C < length) {
                    iM474C2 += m474C(Array.get(obj, iM474C), str, str2, j, set, i + 1);
                    if (iM474C2 > 0) {
                        return iM474C2;
                    }
                    iM474C++;
                }
                return iM474C2;
            }
            if (cls.getName().startsWith("com.tencent.")) {
                int i2 = 0;
                for (Class<?> superclass = cls; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    try {
                        int iM474C3 = i2;
                        for (Field field : superclass.getDeclaredFields()) {
                            if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                                try {
                                    field.setAccessible(true);
                                    iM474C3 += m474C(field.get(obj), str, str2, j, set, i + 1);
                                    if (iM474C3 > 0) {
                                        return iM474C3;
                                    }
                                } catch (Throwable unused) {
                                    continue;
                                }
                            }
                        }
                        i2 = iM474C3;
                    } catch (Throwable unused2) {
                    }
                }
                return i2;
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static void m475D(long j) {
        Set setNewSetFromMap = Collections.newSetFromMap(new HashMap());
        HashMap map = f345e;
        for (Map.Entry entry : map.entrySet()) {
            if (j - ((C0210f3) entry.getValue()).f251c > 600000) {
                setNewSetFromMap.add((String) entry.getKey());
            }
        }
        Iterator it = setNewSetFromMap.iterator();
        while (it.hasNext()) {
            map.remove((String) it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:154:0x02c6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:218:0x0266 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:221:0x02cb */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:224:0x02c6 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:300:0x043c */
    /* JADX WARN: Can't wrap try/catch for region: R(11:(4:250|42|248|43)|(2:256|44)|(3:45|(1:47)(1:308)|(2:64|(1:68)(0))(4:69|(4:74|(2:266|76)|(1:78)|79)|80|(1:82)(0)))|48|49|(1:51)(1:52)|246|53|274|54|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(15:250|42|248|43|256|44|(3:45|(1:47)(1:308)|(2:64|(1:68)(0))(4:69|(4:74|(2:266|76)|(1:78)|79)|80|(1:82)(0)))|48|49|(1:51)(1:52)|246|53|274|54|(0)(0)) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d3 A[Catch: all -> 0x030e, TryCatch #25 {all -> 0x030e, blocks: (B:157:0x02cb, B:159:0x02d3, B:161:0x030a, B:166:0x0317), top: B:282:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0317 A[Catch: all -> 0x030e, TRY_LEAVE, TryCatch #25 {all -> 0x030e, blocks: (B:157:0x02cb, B:159:0x02d3, B:161:0x030a, B:166:0x0317), top: B:282:0x02cb }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0268 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x02ba A[EXC_TOP_SPLITTER, PHI: r1 r8 r26
  0x02ba: PHI (r1v20 ??) = (r1v19 ??), (r1v24 ??) binds: [B:154:0x02c6, B:148:0x02b8] A[DONT_GENERATE, DONT_INLINE]
  0x02ba: PHI (r8v29 android.database.Cursor) = (r8v28 android.database.Cursor), (r8v33 android.database.Cursor) binds: [B:154:0x02c6, B:148:0x02b8] A[DONT_GENERATE, DONT_INLINE]
  0x02ba: PHI (r26v12 android.net.Uri) = (r26v11 android.net.Uri), (r26v15 android.net.Uri) binds: [B:154:0x02c6, B:148:0x02b8] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0271 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0357 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106 A[Catch: all -> 0x0079, TRY_ENTER, TryCatch #12 {all -> 0x0079, blocks: (B:30:0x006d, B:33:0x0075, B:36:0x007c, B:39:0x0085, B:40:0x00b5, B:64:0x0106, B:66:0x010c, B:68:0x0114, B:69:0x0119, B:71:0x011f, B:74:0x0128, B:78:0x0143, B:79:0x0146, B:80:0x016e, B:82:0x0174, B:26:0x0060), top: B:258:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0119 A[Catch: all -> 0x0079, TryCatch #12 {all -> 0x0079, blocks: (B:30:0x006d, B:33:0x0075, B:36:0x007c, B:39:0x0085, B:40:0x00b5, B:64:0x0106, B:66:0x010c, B:68:0x0114, B:69:0x0119, B:71:0x011f, B:74:0x0128, B:78:0x0143, B:79:0x0146, B:80:0x016e, B:82:0x0174, B:26:0x0060), top: B:258:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c7  */
    /* JADX WARN: Type inference failed for: r0v38, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v14 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v23 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r21v25 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27 */
    /* JADX WARN: Type inference failed for: r21v28 */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r25v1, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r8v11, types: [android.content.ContentResolver] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX INFO: renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File m476E(File file, File file2) {
        int i;
        File file3;
        File file4;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        int i2;
        byte[] bArr;
        long j;
        File file5;
        ?? r21;
        ?? r1;
        int i3;
        ?? r8;
        Uri uri;
        Uri uri2;
        String str;
        ?? r13;
        ?? r212;
        ?? r82;
        ?? r12;
        ?? r213;
        ?? r14;
        ?? r214;
        OutputStream outputStream;
        FileInputStream fileInputStream2;
        ?? r215;
        int i4;
        ?? r15;
        Cursor cursorQuery;
        long j2;
        int columnIndex;
        File file6 = file;
        int i5 = 20;
        int i6 = 0;
        if (file6.isFile()) {
            File fileM25r = file2;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 < i5) {
                    try {
                        File parentFile = fileM25r.getParentFile();
                        if (parentFile != null && (parentFile.exists() || parentFile.mkdirs())) {
                            Context contextHostContext = HookEntry.hostContext();
                            if (contextHostContext != null) {
                                i = 1;
                                try {
                                    String strM509y = m509y(fileM25r.getParentFile());
                                    if (strM509y.length() == 0) {
                                        file4 = fileM25r;
                                    } else {
                                        file4 = fileM25r;
                                        m490f(contextHostContext.getContentResolver(), strM509y, file4, "filesystem");
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    file4 = fileM25r;
                                    if (i8 != 0) {
                                        AbstractC0004a3.m23p(file4);
                                    }
                                    HookEntry.logAlways("download redirect file publish failed target=" + m479H(file4.getAbsolutePath()) + " reason=" + th.getClass().getSimpleName() + ": " + m479H(String.valueOf(th.getMessage())));
                                    file3 = null;
                                    if (file3 != null) {
                                    }
                                }
                            } else {
                                file4 = fileM25r;
                                i = 1;
                            }
                            if (file4.exists()) {
                                if (i8 != 0) {
                                    try {
                                        AbstractC0004a3.m23p(file4);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (i8 != 0) {
                                        }
                                        HookEntry.logAlways("download redirect file publish failed target=" + m479H(file4.getAbsolutePath()) + " reason=" + th.getClass().getSimpleName() + ": " + m479H(String.valueOf(th.getMessage())));
                                    }
                                }
                                fileM25r = AbstractC0004a3.m25r(file4);
                                if (fileM25r == null) {
                                    break;
                                }
                                HookEntry.logAlways("download redirect collision target advanced from=" + m479H(file4.getAbsolutePath()) + " to=" + m479H(fileM25r.getAbsolutePath()));
                                i7++;
                                i8 = i;
                                i5 = 20;
                            } else {
                                long length = file6.length();
                                if (!file6.renameTo(file4)) {
                                    try {
                                        fileInputStream = new FileInputStream(file6);
                                        try {
                                            fileOutputStream = new FileOutputStream(file4);
                                        } catch (Throwable unused) {
                                            fileOutputStream = null;
                                            if (fileInputStream != null) {
                                                try {
                                                    fileInputStream.close();
                                                } catch (Throwable unused2) {
                                                }
                                            }
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            i2 = 0;
                                            if (i2 != 0) {
                                            }
                                            file3 = null;
                                            if (file3 != null) {
                                            }
                                        }
                                    } catch (Throwable unused4) {
                                        fileInputStream = null;
                                    }
                                    try {
                                        bArr = new byte[MethodData.ACC_DECLARED_SYNCHRONIZED];
                                        j = 0;
                                    } catch (Throwable unused5) {
                                        if (fileInputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        i2 = 0;
                                    }
                                    while (true) {
                                        int i9 = fileInputStream.read(bArr);
                                        if (i9 <= 0) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, i6, i9);
                                        bArr = bArr;
                                        i6 = 0;
                                        j += (long) i9;
                                        if (i2 != 0) {
                                            if (file4.isFile() && file4.length() == length) {
                                                m489e(length, file4);
                                                Context contextHostContext2 = HookEntry.hostContext();
                                                if (contextHostContext2 != null) {
                                                    try {
                                                        MediaScannerConnection.scanFile(contextHostContext2, new String[]{file4.getAbsolutePath()}, new String[]{"application/octet-stream"}, null);
                                                    } catch (Throwable unused6) {
                                                    }
                                                }
                                                if (i8 != 0) {
                                                    AbstractC0004a3.m23p(file4);
                                                }
                                                HookEntry.logAlways("download redirect file published target=" + m479H(file4.getAbsolutePath()) + " size=" + file4.length());
                                                file3 = file4;
                                            }
                                            if (file4.exists()) {
                                                file4.delete();
                                            }
                                        } else if (file4.exists() && file4.length() != length) {
                                            file4.delete();
                                        }
                                    }
                                    fileOutputStream.flush();
                                    i2 = j == file6.length() ? i : 0;
                                    fileInputStream.close();
                                    fileOutputStream.close();
                                    if (i2 != 0) {
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        file4 = fileM25r;
                        i = 1;
                    }
                } else {
                    File file7 = fileM25r;
                    i = 1;
                    if (i8 != 0) {
                        AbstractC0004a3.m23p(file7);
                    }
                }
            }
            file3 = null;
        } else {
            file3 = null;
            i = 1;
        }
        if (file3 != null) {
            return file3;
        }
        Context contextHostContext3 = HookEntry.hostContext();
        if (contextHostContext3 != null) {
            String strM509y2 = m509y(file2.getParentFile());
            if (strM509y2.length() == 0) {
                return null;
            }
            File file8 = file2;
            int i10 = 0;
            ?? r132 = 0;
            File file9 = file6;
            ?? r5 = "application/octet-stream";
            ?? contentResolver = contextHostContext3.getContentResolver();
            ?? r216 = j;
            while (true) {
                if (i10 < 20) {
                    try {
                        m490f(contentResolver, strM509y2, file8, "pre-insert");
                        ?? contentValues = new ContentValues();
                        contentValues.put("_display_name", file8.getName());
                        contentValues.put("mime_type", r5);
                        contentValues.put("relative_path", strM509y2);
                        contentValues.put("is_pending", Integer.valueOf(i));
                        Uri uriInsert = contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, contentValues);
                        try {
                            if (uriInsert == null) {
                                throw new IllegalStateException("insert returned null");
                            }
                            try {
                                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uriInsert, "w");
                                if (outputStreamOpenOutputStream == null) {
                                    throw new IllegalStateException("openOutputStream returned null");
                                }
                                try {
                                    fileInputStream2 = new FileInputStream(file9);
                                    r214 = r5;
                                    try {
                                        byte[] bArr2 = new byte[MethodData.ACC_DECLARED_SYNCHRONIZED];
                                        long j3 = 0;
                                        while (true) {
                                            int i11 = fileInputStream2.read(bArr2);
                                            if (i11 <= 0) {
                                                break;
                                            }
                                            i3 = i10;
                                            try {
                                                outputStreamOpenOutputStream.write(bArr2, 0, i11);
                                                j3 += (long) i11;
                                                outputStreamOpenOutputStream = outputStreamOpenOutputStream;
                                                i10 = i3;
                                            } catch (Throwable unused7) {
                                                outputStream = outputStreamOpenOutputStream;
                                                if (fileInputStream2 != null) {
                                                }
                                                try {
                                                    outputStream.close();
                                                } catch (Throwable unused8) {
                                                }
                                                i4 = 0;
                                                r215 = r214;
                                                if (i4 != 0) {
                                                }
                                            }
                                        }
                                        i3 = i10;
                                        outputStream = outputStreamOpenOutputStream;
                                        try {
                                            outputStream.flush();
                                            int i12 = j3 == file.length() ? i : 0;
                                            try {
                                                fileInputStream2.close();
                                            } catch (Throwable unused9) {
                                            }
                                            try {
                                                outputStream.close();
                                            } catch (Throwable unused10) {
                                            }
                                            i4 = i12;
                                            r215 = r214;
                                        } catch (Throwable unused11) {
                                            if (fileInputStream2 != null) {
                                                try {
                                                    fileInputStream2.close();
                                                } catch (Throwable unused12) {
                                                }
                                            }
                                            outputStream.close();
                                            i4 = 0;
                                            r215 = r214;
                                        }
                                    } catch (Throwable unused13) {
                                        i3 = i10;
                                    }
                                } catch (Throwable unused14) {
                                    r214 = r5;
                                    i3 = i10;
                                    outputStream = outputStreamOpenOutputStream;
                                    fileInputStream2 = null;
                                }
                                if (i4 != 0) {
                                    throw new IllegalStateException("stream copy incomplete");
                                }
                                try {
                                    ContentValues contentValues2 = new ContentValues();
                                    try {
                                        contentValues2.put("is_pending", (Integer) 0);
                                        if (contentResolver.update(uriInsert, contentValues2, null, null) <= 0) {
                                            throw new IllegalStateException("publish update failed");
                                        }
                                        try {
                                            ?? r25 = contentResolver;
                                            uri2 = uriInsert;
                                            try {
                                                cursorQuery = r25.query(uri2, new String[]{"_size"}, null, null, null);
                                                r15 = r25;
                                            } catch (Throwable unused15) {
                                                r15 = r25;
                                                cursorQuery = null;
                                                if (cursorQuery != null) {
                                                }
                                                j2 = -1;
                                                if (j2 != file.length()) {
                                                }
                                            }
                                        } catch (Throwable unused16) {
                                            r15 = contentResolver;
                                            uri2 = uriInsert;
                                        }
                                        try {
                                            if (cursorQuery != null) {
                                                try {
                                                } catch (Throwable unused17) {
                                                    if (cursorQuery != null) {
                                                    }
                                                }
                                                if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("_size")) >= 0 && !cursorQuery.isNull(columnIndex)) {
                                                    j2 = cursorQuery.getLong(columnIndex);
                                                    try {
                                                        cursorQuery.close();
                                                    } catch (Throwable unused18) {
                                                    }
                                                    if (j2 != file.length()) {
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append("stored size mismatch expected=");
                                                        sb.append(file.length());
                                                        sb.append(" actual=");
                                                        sb.append(j2);
                                                        throw new IllegalStateException(sb.toString());
                                                    }
                                                    m489e(j2, file8);
                                                    HookEntry.logAlways("download redirect MediaStore published uri=" + m479H(uri2.toString()) + " target=" + m479H(file8.getAbsolutePath()) + " size=" + j2);
                                                    if (r132 != 0) {
                                                        AbstractC0004a3.m23p(file8);
                                                    }
                                                    return file8;
                                                }
                                            }
                                            if (j2 != file.length()) {
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            r82 = r132;
                                            r12 = r15;
                                            r212 = r215;
                                            uri = uri2;
                                            r1 = r12;
                                            r8 = r82;
                                            r21 = r212;
                                            if (uri == null) {
                                                file5 = null;
                                                try {
                                                    r1.delete(uri, null, null);
                                                } catch (Throwable unused19) {
                                                }
                                            } else {
                                                file5 = null;
                                            }
                                            str = th.getClass().getName() + ": " + String.valueOf(th.getMessage());
                                            if (!str.contains("SQLiteConstraint") || str.contains("UNIQUE constraint")) {
                                                if (r8 != 0) {
                                                    AbstractC0004a3.m23p(file8);
                                                }
                                                if (m490f(r1, strM509y2, file8, "constraint") <= 0) {
                                                    r13 = r8;
                                                } else {
                                                    File fileM25r2 = AbstractC0004a3.m25r(file8);
                                                    if (fileM25r2 == null) {
                                                        break;
                                                    }
                                                    HookEntry.logAlways("download redirect collision target advanced from=" + m479H(file8.getAbsolutePath()) + " to=" + m479H(fileM25r2.getAbsolutePath()));
                                                    file8 = fileM25r2;
                                                    r13 = i;
                                                }
                                                i10 = i3 + 1;
                                                contentResolver = r1;
                                                r5 = r21;
                                                file9 = file;
                                                r132 = r13;
                                                r216 = r21;
                                            } else {
                                                if (r8 != 0) {
                                                    AbstractC0004a3.m23p(file8);
                                                }
                                                HookEntry.logAlways("download redirect MediaStore failed target=" + m479H(file8.getAbsolutePath()) + " reason=" + m479H(str));
                                            }
                                            return file5;
                                        }
                                        if (cursorQuery != null) {
                                            try {
                                                cursorQuery.close();
                                            } catch (Throwable unused20) {
                                            }
                                        }
                                        j2 = -1;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        r12 = contentResolver;
                                        r82 = r132;
                                        uri2 = uriInsert;
                                        r212 = r215;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    r14 = contentResolver;
                                    r213 = r215;
                                    r82 = r132;
                                    uri2 = uriInsert;
                                    r12 = r14;
                                    r212 = r213;
                                    uri = uri2;
                                    r1 = r12;
                                    r8 = r82;
                                    r21 = r212;
                                    if (uri == null) {
                                    }
                                    str = th.getClass().getName() + ": " + String.valueOf(th.getMessage());
                                    if (str.contains("SQLiteConstraint")) {
                                        if (r8 != 0) {
                                        }
                                        if (m490f(r1, strM509y2, file8, "constraint") <= 0) {
                                        }
                                        i10 = i3 + 1;
                                        contentResolver = r1;
                                        r5 = r21;
                                        file9 = file;
                                        r132 = r13;
                                        r216 = r21;
                                    }
                                    return file5;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                r213 = r5;
                                r14 = contentResolver;
                                i3 = i10;
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            r12 = file9;
                            r82 = contentResolver;
                            r212 = r216;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        r21 = r5;
                        r1 = contentResolver;
                        i3 = i10;
                        r8 = r132;
                        uri = null;
                    }
                } else {
                    file5 = null;
                    if (r132 != 0) {
                        AbstractC0004a3.m23p(file8);
                    }
                }
                i10 = i3 + 1;
                contentResolver = r1;
                r5 = r21;
                file9 = file;
                r132 = r13;
                r216 = r21;
            }
        } else {
            file5 = null;
        }
        return file5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static void m477F(String str, C0210f3 c0210f3) {
        if (str == null || str.length() == 0) {
            return;
        }
        f345e.put(m492h(str), c0210f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static void m478G(File file, long j, File file2) {
        if (m505u(file.getName())) {
            if (j <= 0) {
                j = file.length();
            }
            long j2 = j;
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (f344d) {
                try {
                    m475D(jCurrentTimeMillis);
                    String absolutePath = file.getAbsolutePath();
                    file.getName();
                    C0210f3 c0210f3 = new C0210f3(absolutePath, j2, jCurrentTimeMillis, m488d(file2));
                    m477F(file.getName(), c0210f3);
                    String strM487c = m487c(file.getName());
                    if (!strM487c.equals(file.getName())) {
                        m477F(strM487c, c0210f3);
                    }
                    String strM483L = m483L(file.getName());
                    if (!strM483L.equals(file.getName())) {
                        m477F(strM483L, c0210f3);
                    }
                    String strM483L2 = m483L(strM487c);
                    if (!strM483L2.equals(strM487c)) {
                        m477F(strM483L2, c0210f3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static String m479H(String str) {
        if (str == null) {
            return "";
        }
        String strReplace = str.replace('\r', ' ').replace('\n', ' ').replace('\t', ' ');
        return strReplace.length() > 220 ? strReplace.substring(0, 220).concat("...") : strReplace;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static boolean m480I(Object obj, String str, int i) {
        Class<?> cls = Integer.TYPE;
        if (obj != null) {
            Integer numValueOf = Integer.valueOf(i);
            try {
                Field field = obj.getClass().getField(str);
                Class<?> type = field.getType();
                if (type == cls || type == Integer.class) {
                    field.set(obj, field.getType() == cls ? Integer.valueOf(i) : numValueOf);
                    return true;
                }
            } catch (Throwable unused) {
                for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    try {
                        Field declaredField = superclass.getDeclaredField(str);
                        Class<?> type2 = declaredField.getType();
                        if (type2 == cls || type2 == Integer.class) {
                            declaredField.setAccessible(true);
                            declaredField.set(obj, declaredField.getType() == cls ? Integer.valueOf(i) : numValueOf);
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                String str2 = "set" + Character.toUpperCase(str.charAt(0)) + str.substring(1);
                for (Class<?> superclass2 = obj.getClass(); superclass2 != null && superclass2 != Object.class; superclass2 = superclass2.getSuperclass()) {
                    try {
                        try {
                            Method declaredMethod = superclass2.getDeclaredMethod(str2, cls);
                            declaredMethod.setAccessible(true);
                            declaredMethod.invoke(obj, Integer.valueOf(i));
                        } catch (Throwable unused3) {
                            Method declaredMethod2 = superclass2.getDeclaredMethod(str2, Integer.class);
                            declaredMethod2.setAccessible(true);
                            declaredMethod2.invoke(obj, numValueOf);
                        }
                        return true;
                    } catch (Throwable unused4) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static boolean m481J(Object obj, String str, String str2) {
        if (obj != null && str2 != null) {
            try {
                Field field = obj.getClass().getField(str);
                if (field.getType() == String.class) {
                    field.set(obj, str2);
                    return true;
                }
            } catch (Throwable unused) {
                for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    try {
                        Field declaredField = superclass.getDeclaredField(str);
                        if (declaredField.getType() == String.class) {
                            declaredField.setAccessible(true);
                            declaredField.set(obj, str2);
                            break;
                        }
                    } catch (Throwable unused2) {
                    }
                }
                String str3 = "set" + Character.toUpperCase(str.charAt(0)) + str.substring(1);
                for (Class<?> superclass2 = obj.getClass(); superclass2 != null && superclass2 != Object.class; superclass2 = superclass2.getSuperclass()) {
                    try {
                        Method declaredMethod = superclass2.getDeclaredMethod(str3, String.class);
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(obj, str2);
                        return true;
                    } catch (Throwable unused3) {
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static String m482K(Object obj, String str, String str2) {
        Object objM472A = m472A(obj, str, str2);
        return objM472A instanceof String ? ((String) objM472A).trim() : "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static String m483L(String str) {
        return !m505u(str) ? str == null ? "" : str : str.substring(0, str.length() - 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static Object m484M(Object obj) {
        if (obj == null) {
            return null;
        }
        if ("com.tencent.mobileqq.filemanager.data.FileManagerEntity".equals(obj.getClass().getName())) {
            return obj;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            try {
                for (Field field : superclass.getDeclaredFields()) {
                    if ("com.tencent.mobileqq.filemanager.data.FileManagerEntity".equals(field.getType().getName())) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 != null) {
                            return obj2;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m485a(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            long jM507w = m507w(obj2, "getFileModelId", "fileModelId");
            long jM507w2 = m507w(obj2, "getMsgElementId", "msgElementId");
            long[] jArr = {m504t(obj2, "getChatType", "chatType") == 8 ? jM507w2 : jM507w, jM507w, jM507w2};
            try {
                for (Field field : obj.getClass().getDeclaredFields()) {
                    if (Map.class.isAssignableFrom(field.getType())) {
                        field.setAccessible(true);
                        Object obj3 = field.get(obj);
                        if (obj3 instanceof Map) {
                            Map map = (Map) obj3;
                            for (int i = 0; i < 3; i++) {
                                long j = jArr[i];
                                if (j != 0) {
                                    Object objM484M = m484M(map.get(Long.valueOf(j)));
                                    if (objM484M == null && j >= -2147483648L && j <= 2147483647L) {
                                        objM484M = m484M(map.get(Integer.valueOf((int) j)));
                                    }
                                    if (objM484M == null) {
                                        objM484M = m484M(map.get(String.valueOf(j)));
                                    }
                                    if (objM484M != null) {
                                        return objM484M;
                                    }
                                }
                            }
                            Object objM498n = m498n(map, obj2);
                            if (objM498n != null) {
                                return objM498n;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                HookEntry.log("download redirect entity capture failed: " + th);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m486b(Object obj) {
        C0210f3 c0210f3;
        File fileM11d;
        if (m506v(obj)) {
            String strM482K = m482K(obj, "getFileName", "fileName");
            String strM482K2 = m482K(obj, "getFilePath", "filePath");
            long jM507w = m507w(obj, "getFileSize", "fileSize");
            C0210f3 c0210f32 = null;
            if (strM482K == null) {
                c0210f3 = null;
            } else {
                Locale locale = Locale.ROOT;
                String lowerCase = strM482K.toLowerCase(locale);
                if ((lowerCase.endsWith(".apk") || lowerCase.endsWith(".apk.1")) && strM482K != null) {
                    String lowerCase2 = strM482K.toLowerCase(locale);
                    if ((lowerCase2.endsWith(".apk") || lowerCase2.endsWith(".apk.1")) && jM507w > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        synchronized (f344d) {
                            try {
                                m475D(jCurrentTimeMillis);
                                HashMap map = f345e;
                                c0210f3 = (C0210f3) map.get(m492h(strM482K));
                                if (c0210f3 == null && m505u(strM482K)) {
                                    c0210f3 = (C0210f3) map.get(m492h(m483L(strM482K)));
                                }
                                if (c0210f3 == null && strM482K != null && strM482K.toLowerCase(locale).endsWith(".apk")) {
                                    c0210f3 = (C0210f3) map.get(m492h(strM482K.concat(".1")));
                                }
                                if (c0210f3 != null) {
                                    long j = c0210f3.f250b;
                                    if (j > 0 && jM507w == j) {
                                        if (c0210f3.f252d.length() != 0 && strM482K2 != null && strM482K2.trim().length() != 0 && c0210f3.f252d.equalsIgnoreCase(m488d(new File(strM482K2.trim())))) {
                                        }
                                    }
                                }
                                c0210f3 = null;
                            } finally {
                            }
                        }
                    }
                }
            }
            if (c0210f3 == null) {
                if (jM507w > 0 && (fileM11d = AbstractC0004a3.m11d()) != null) {
                    File fileM493i = m493i(fileM11d, strM482K2, jM507w);
                    if (fileM493i == null && strM482K != null && strM482K.trim().length() > 0) {
                        fileM493i = m493i(fileM11d, new File(fileM11d, AbstractC0004a3.m27t(strM482K)).getAbsolutePath(), jM507w);
                    }
                    if (fileM493i != null) {
                        String absolutePath = fileM493i.getAbsolutePath();
                        fileM493i.getName();
                        c0210f32 = new C0210f3(absolutePath, fileM493i.length(), System.currentTimeMillis(), "");
                    }
                }
                c0210f3 = c0210f32;
            }
            if (c0210f3 != null && m508x(obj, c0210f3.f249a)) {
                if (f341a.m996a(System.currentTimeMillis(), c0210f3.f249a)) {
                    HookEntry.logAlways("download redirect card file element patched final=" + m479H(c0210f3.f249a) + " name=" + m479H(strM482K) + " old_path=" + m479H(strM482K2));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m487c(String str) {
        int iLastIndexOf;
        int i;
        if (!m505u(str)) {
            return str == null ? "" : str;
        }
        String strSubstring = str.substring(str.length() - 6);
        String strSubstring2 = str.substring(0, str.length() - 6);
        if (!strSubstring2.endsWith(")") || (iLastIndexOf = strSubstring2.lastIndexOf(" (")) < 0 || (i = iLastIndexOf + 2) >= strSubstring2.length() - 1) {
            return str;
        }
        try {
            int i2 = Integer.parseInt(strSubstring2.substring(i, strSubstring2.length() - 1));
            if (i2 > 0 && i2 <= 9999) {
                return strSubstring2.substring(0, iLastIndexOf).concat(strSubstring);
            }
            return str;
        } catch (NumberFormatException unused) {
            return str;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m488d(File file) {
        if (file == null) {
            return "";
        }
        try {
            return file.getCanonicalPath();
        } catch (Throwable unused) {
            return file.getAbsolutePath();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m489e(long j, File file) {
        File parentFile;
        File[] fileArrListFiles;
        if (m505u(file.getName()) && (parentFile = file.getParentFile()) != null && parentFile.isDirectory()) {
            try {
                fileArrListFiles = parentFile.listFiles();
            } catch (Throwable unused) {
                fileArrListFiles = null;
            }
            if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                return;
            }
            String strM488d = m488d(file);
            long length = file.isFile() ? file.length() : j;
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isFile()) {
                    String strM488d2 = m488d(file2);
                    if (!strM488d.equalsIgnoreCase(strM488d2)) {
                        String name = file.getName();
                        String name2 = file2.getName();
                        if (m505u(name) && name2 != null && name2.toLowerCase(Locale.ROOT).endsWith(".1")) {
                            String strSubstring = name.substring(0, name.length() - 2);
                            String strSubstring2 = name2.substring(0, name2.length() - 2);
                            if (strSubstring2.regionMatches(true, 0, strSubstring, 0, strSubstring.length())) {
                                String strTrim = strSubstring2.substring(strSubstring.length()).trim();
                                if (strTrim.length() >= 3 && strTrim.charAt(0) == '(' && strTrim.charAt(strTrim.length() - 1) == ')') {
                                    String strSubstring3 = strTrim.substring(1, strTrim.length() - 1);
                                    if (strSubstring3.length() != 0 && strSubstring3.length() <= 4) {
                                        int i = 0;
                                        while (true) {
                                            if (i >= strSubstring3.length()) {
                                                try {
                                                    int i2 = Integer.parseInt(strSubstring3);
                                                    if (i2 <= 0 || i2 > 9999) {
                                                        break;
                                                    }
                                                    long length2 = file2.length();
                                                    if ((j <= 0 || length2 == j) && (length <= 0 || length2 == length)) {
                                                        if (file.isFile()) {
                                                            if (file2.delete()) {
                                                                HookEntry.logAlways("download redirect apk.1 collision duplicate removed file=" + m479H(strM488d2) + " target=" + m479H(strM488d));
                                                            }
                                                        } else if (file2.renameTo(file)) {
                                                            HookEntry.logAlways("download redirect apk.1 collision repaired from=" + m479H(strM488d2) + " to=" + m479H(strM488d));
                                                        }
                                                    }
                                                } catch (Throwable unused2) {
                                                }
                                            } else if (!Character.isDigit(strSubstring3.charAt(i))) {
                                                break;
                                            } else {
                                                i++;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static int m490f(ContentResolver contentResolver, String str, File file, String str2) {
        if (contentResolver == null || str.length() == 0) {
            return 0;
        }
        int iM491g = m491g(contentResolver, str, file, str2, true);
        if (iM491g < 0) {
            iM491g = m491g(contentResolver, str, file, str2, false);
        }
        if (iM491g > 0) {
            HookEntry.logAlways("download redirect stale MediaStore rows cleared target=" + m479H(file.getAbsolutePath()) + " count=" + iM491g + " reason=" + m479H(str2));
        }
        return Math.max(0, iM491g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00df  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m491g(ContentResolver contentResolver, String str, File file, String str2, boolean z) {
        Cursor cursorQuery;
        Cursor cursor = null;
        try {
            cursorQuery = contentResolver.query(MediaStore.Downloads.EXTERNAL_CONTENT_URI, z ? new String[]{"_id", "_size", "relative_path", "_data"} : new String[]{"_id", "_size", "relative_path"}, "_display_name=?", new String[]{file.getName()}, null);
        } catch (Throwable th) {
            th = th;
        }
        if (cursorQuery == null) {
            if (cursorQuery != null) {
                try {
                    cursorQuery.close();
                } catch (Throwable unused) {
                }
                return 0;
            }
            return 0;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("_id");
            int columnIndex2 = cursorQuery.getColumnIndex("_size");
            int columnIndex3 = cursorQuery.getColumnIndex("relative_path");
            int columnIndex4 = z ? cursorQuery.getColumnIndex("_data") : -1;
            int iMax = 0;
            while (cursorQuery.moveToNext()) {
                if (columnIndex >= 0 && !cursorQuery.isNull(columnIndex)) {
                    long j = cursorQuery.getLong(columnIndex);
                    long j2 = (columnIndex2 < 0 || cursorQuery.isNull(columnIndex2)) ? -1L : cursorQuery.getLong(columnIndex2);
                    String string = "";
                    String string2 = (columnIndex3 < 0 || cursorQuery.isNull(columnIndex3)) ? "" : cursorQuery.getString(columnIndex3);
                    if (columnIndex4 >= 0 && !cursorQuery.isNull(columnIndex4)) {
                        string = cursorQuery.getString(columnIndex4);
                    }
                    String strM510z = m510z(str);
                    if (((strM510z.length() <= 0 || !strM510z.equals(m510z(string2))) ? (string == null || string.length() <= 0) ? false : m488d(new File(string)).equalsIgnoreCase(m488d(file)) : true) && !file.exists()) {
                        if (string != null && string.length() > 0) {
                            try {
                                if (new File(string).exists()) {
                                }
                            } catch (Throwable unused2) {
                            }
                        } else if (j2 <= 0 || !file.exists()) {
                            try {
                                iMax += Math.max(0, contentResolver.delete(ContentUris.withAppendedId(MediaStore.Downloads.EXTERNAL_CONTENT_URI, j), null, null));
                            } catch (Throwable unused3) {
                            }
                        }
                    }
                }
            }
            try {
                cursorQuery.close();
            } catch (Throwable unused4) {
            }
            return iMax;
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorQuery;
            if (z) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable unused5) {
                    }
                }
                return -1;
            }
            try {
                HookEntry.logAlways("download redirect stale MediaStore cleanup failed target=" + m479H(file.getAbsolutePath()) + " reason=" + m479H(str2) + " error=" + th.getClass().getSimpleName() + ": " + m479H(String.valueOf(th.getMessage())));
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable unused6) {
                    }
                }
                return 0;
            } catch (Throwable th3) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (Throwable unused7) {
                    }
                }
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m492h(String str) {
        if (str == null) {
            str = "";
        }
        return new File(str).getName().toLowerCase(Locale.ROOT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static File m493i(File file, String str, long j) {
        if (str == null || str.trim().length() == 0) {
            return null;
        }
        try {
            File file2 = new File(str.trim());
            if (!file2.isAbsolute()) {
                file2 = new File(file, AbstractC0004a3.m27t(str));
            }
            File parentFile = file2.getParentFile();
            if (parentFile != null && m488d(parentFile).equalsIgnoreCase(m488d(file)) && file2.isFile()) {
                if (j > 0) {
                    if (file2.length() != j) {
                        return null;
                    }
                }
                return file2;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m494j(Object obj, String str, String str2, long j) {
        if (!m506v(obj)) {
            return false;
        }
        String strM482K = m482K(obj, "getFileName", "fileName");
        String strM482K2 = m482K(obj, "getFilePath", "filePath");
        long jM507w = m507w(obj, "getFileSize", "fileSize");
        boolean z = strM482K.length() == 0 || m496l(str2, strM482K) || m496l(str2, new File(strM482K).getName());
        boolean z2 = j <= 0 || jM507w <= 0 || jM507w == j;
        String lowerCase = strM482K2.toLowerCase(Locale.ROOT);
        return z && z2 && (strM482K2.length() == 0 || str.equalsIgnoreCase(strM482K2) || strM482K2.indexOf(".elaris-") >= 0 || lowerCase.endsWith(".apk") || lowerCase.endsWith(".apk.1"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m495k(String str) {
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        return strTrim.length() == 0 ? "" : new File(strTrim).getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m496l(String str, String str2) {
        String strM495k = m495k(str);
        String strM495k2 = m495k(str2);
        if (strM495k.length() == 0 || strM495k2.length() == 0) {
            return false;
        }
        if (strM495k.equalsIgnoreCase(strM495k2) || m483L(strM495k).equalsIgnoreCase(strM495k2) || m483L(strM495k2).equalsIgnoreCase(strM495k)) {
            return true;
        }
        String strM487c = m487c(strM495k);
        if (strM487c.equalsIgnoreCase(strM495k2)) {
            return true;
        }
        return m483L(strM487c).equalsIgnoreCase(strM495k2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static Method m497m(Class cls, Class cls2, Class cls3) throws NoSuchMethodException {
        while (cls != null && cls != Object.class) {
            for (Method method : cls.getDeclaredMethods()) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (method.getReturnType() == Void.TYPE && parameterTypes.length == 3 && parameterTypes[0].isAssignableFrom(cls2) && parameterTypes[1].isAssignableFrom(cls3) && parameterTypes[2] == Boolean.TYPE) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        throw new NoSuchMethodException("QQ file completion entity handler");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Object m498n(Map map, Object obj) {
        if (map.isEmpty() || obj == null) {
            return null;
        }
        String strM482K = m482K(obj, "getFilePath", "filePath");
        Object objM472A = m472A(obj, "getCommonFileInfo", "commonFileInfo");
        if (strM482K.length() == 0 && objM472A != null) {
            strM482K = m482K(objM472A, "getFilePath", "filePath");
        }
        String strM495k = m495k(strM482K);
        if (strM495k.length() == 0) {
            strM495k = m482K(obj, "getFileName", "fileName");
        }
        if (strM495k.length() == 0 && objM472A != null) {
            strM495k = m482K(objM472A, "getFileName", "fileName");
        }
        long jM507w = m507w(obj, "getFileSize", "fileSize");
        long j = 0;
        if (jM507w <= 0 && objM472A != null) {
            jM507w = m507w(objM472A, "getFileSize", "fileSize");
        }
        String strM488d = strM482K.length() == 0 ? "" : m488d(new File(strM482K));
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            Object objM484M = m484M(it.next());
            if (objM484M != null) {
                String strM482K2 = m482K(objM484M, "getFilePath", "strFilePath");
                String strM482K3 = m482K(objM484M, "getFileName", "fileName");
                long jM507w2 = m507w(objM484M, "getFileSize", "fileSize");
                boolean z = true;
                boolean z2 = jM507w <= j || jM507w2 <= j || jM507w2 == jM507w;
                boolean z3 = strM488d.length() > 0 && strM482K2.length() > 0 && strM488d.equalsIgnoreCase(m488d(new File(strM482K2)));
                if (strM495k.length() <= 0 || (!m496l(strM495k, strM482K3) && !m496l(strM495k, m495k(strM482K2)))) {
                    z = false;
                }
                if (z2 && (z3 || (jM507w > j && z))) {
                    return objM484M;
                }
                j = 0;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static int m499o(ClassLoader classLoader) {
        Class clsM1091j = AbstractC0497v4.m1091j(classLoader, "br2.a");
        Class<?> clsM1091j2 = AbstractC0497v4.m1091j(classLoader, "com.tencent.qqnt.kernel.nativeinterface.FileElement");
        if (clsM1091j == null || clsM1091j2 == null) {
            HookEntry.log("download redirect file card class missing");
            return 0;
        }
        int i = 0;
        for (Method method : clsM1091j.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            int i2 = -1;
            if (parameterTypes != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= parameterTypes.length) {
                        break;
                    }
                    if (parameterTypes[i3] == clsM1091j2) {
                        i2 = i3;
                        break;
                    }
                    i3++;
                }
            }
            if (i2 >= 0) {
                try {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0194e3(i2));
                    i++;
                } catch (Throwable th) {
                    HookEntry.log("download redirect file card hook failed: " + th);
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static int m500p(ClassLoader classLoader) {
        Class clsM1091j = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.aio.msglist.holder.component.file.AIOFileViewer");
        Class<?> clsM1091j2 = AbstractC0497v4.m1091j(classLoader, "com.tencent.qqnt.kernel.nativeinterface.FileElement");
        if (clsM1091j != null && clsM1091j2 != null) {
            Method method = null;
            int i = 0;
            for (Method method2 : clsM1091j.getDeclaredMethods()) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                if (!Modifier.isStatic(method2.getModifiers()) && method2.getReturnType() == Void.TYPE && parameterTypes.length == 2 && parameterTypes[0] == clsM1091j2 && parameterTypes[1] == Integer.TYPE) {
                    i++;
                    method = method2;
                }
            }
            if (i == 1 && method != null) {
                try {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0178d3(70));
                    return 1;
                } catch (Throwable th) {
                    HookEntry.log("download redirect file viewer hook failed: " + th);
                    return 0;
                }
            }
            if (i > 1) {
                HookEntry.log("download redirect file viewer hook ambiguous count=" + i);
            }
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static int m501q(Class cls, Class cls2) {
        int i = 0;
        for (Method method : cls.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (Modifier.isPublic(method.getModifiers()) && method.getReturnType() == Void.TYPE && parameterTypes.length == 1 && parameterTypes[0] == cls2) {
                try {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0020b3(80));
                    i++;
                } catch (Throwable th) {
                    HookEntry.log("download redirect finalizer hook failed: " + th);
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static int m502r(ClassLoader classLoader) {
        Class clsM1091j = AbstractC0497v4.m1091j(classLoader, "vk6.a");
        Class<?> clsM1091j2 = AbstractC0497v4.m1091j(classLoader, "com.tencent.qqnt.kernel.nativeinterface.FileElement");
        if (clsM1091j == null || clsM1091j2 == null) {
            return 0;
        }
        int i = 0;
        for (Method method : clsM1091j.getDeclaredMethods()) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0] == clsM1091j2) {
                try {
                    method.setAccessible(true);
                    XposedBridge.hookMethod(method, new C0036c3(70));
                    i++;
                } catch (Throwable th) {
                    HookEntry.log("download redirect file state hook failed: " + th);
                }
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static synchronized void m503s(ClassLoader classLoader) {
        try {
            if (!f342b && classLoader != null) {
                Class clsM1091j = AbstractC0497v4.m1091j(classLoader, "com.tencent.mobileqq.filemanager.nt.aa");
                Class clsM1091j2 = AbstractC0497v4.m1091j(classLoader, "com.tencent.qqnt.kernel.nativeinterface.FileTransNotifyInfo");
                if (clsM1091j != null && clsM1091j2 != null) {
                    int iM501q = m501q(clsM1091j, clsM1091j2);
                    int iM499o = m499o(classLoader);
                    int iM502r = m502r(classLoader);
                    int iM500p = iM502r == 0 ? m500p(classLoader) : 0;
                    if (iM502r == 0 && iM500p == 0) {
                        HookEntry.log("download redirect file card state hook unavailable");
                    }
                    if (iM501q + iM499o + iM502r + iM500p > 0) {
                        f342b = true;
                        HookEntry.logAlways("download redirect finalizer hook installed count=" + iM501q + " card_count=" + iM499o + " state_count=" + iM502r + " viewer_count=" + iM500p);
                    }
                    return;
                }
                HookEntry.log("download redirect finalizer class missing");
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static int m504t(Object obj, String str, String str2) {
        Object objM472A = m472A(obj, str, str2);
        if (objM472A instanceof Number) {
            return ((Number) objM472A).intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m505u(String str) {
        return str != null && str.toLowerCase(Locale.ROOT).endsWith(".apk.1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static boolean m506v(Object obj) {
        if (obj == null) {
            return false;
        }
        String name = obj.getClass().getName();
        return "com.tencent.qqnt.kernel.nativeinterface.FileElement".equals(name) || "com.tencent.qqnt.kernelpublic.nativeinterface.FileElement".equals(name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static long m507w(Object obj, String str, String str2) {
        Object objM472A = m472A(obj, str, str2);
        if (objM472A instanceof Number) {
            return ((Number) objM472A).longValue();
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static boolean m508x(Object obj, String str) {
        if (!m481J(obj, "filePath", str)) {
            return false;
        }
        m480I(obj, "transferStatus", 4);
        m480I(obj, "invalidState", 0);
        m480I(obj, "progress", 100);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static String m509y(File file) {
        if (file == null) {
            return "";
        }
        String strReplace = m488d(Environment.getExternalStorageDirectory()).replace('\\', '/');
        String strReplace2 = m488d(file).replace('\\', '/');
        if (!strReplace.endsWith("/")) {
            strReplace = strReplace.concat("/");
        }
        if (!strReplace2.startsWith(strReplace)) {
            return "";
        }
        String strSubstring = strReplace2.substring(strReplace.length());
        String str = Environment.DIRECTORY_DOWNLOADS;
        if (!strSubstring.equalsIgnoreCase(str)) {
            if (!strSubstring.toLowerCase().startsWith(str.toLowerCase() + "/")) {
                return "";
            }
        }
        return strSubstring.endsWith("/") ? strSubstring : strSubstring.concat("/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static String m510z(String str) {
        String lowerCase = str == null ? "" : str.replace('\\', '/').trim().toLowerCase();
        while (lowerCase.startsWith("/")) {
            lowerCase = lowerCase.substring(1);
        }
        while (lowerCase.endsWith("/")) {
            lowerCase = lowerCase.substring(0, lowerCase.length() - 1);
        }
        return lowerCase;
    }
}
