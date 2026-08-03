package p099h.Hchat.hooks.api.runtime;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2005i;
import p210o8.InterfaceC3078b;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WeChatDatabaseApi {
    private volatile Object coreStorage;
    private volatile Object dbWrapper;
    private volatile Method deleteMethod;
    private final DexFinder dexFinder;
    private volatile List<Method> insertMethods;
    private final InterfaceC3078b logger;
    private volatile Object messageStorage;
    private volatile Method messageTableMethod;
    private volatile List<String> messageTables;
    private volatile Method nativeMessageByIdMethod;
    private volatile Method nativeMessageUpdateMethod;
    private volatile Object nativeMessageUpdateStorage;
    private volatile Method queryMethod;
    private volatile Method updateMethod;
    private final Map<String, String> messageTableCache = new ConcurrentHashMap();
    private final Map<String, Object> storageObjectCache = new ConcurrentHashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public WeChatDatabaseApi(DexFinder dexFinder, InterfaceC3078b interfaceC3078b) {
        this.dexFinder = dexFinder;
        this.logger = interfaceC3078b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object cursorValue(Cursor cursor, int i9) {
        try {
            int type = cursor.getType(i9);
            if (type != 0) {
                if (type == 1) {
                    return Long.valueOf(cursor.getLong(i9));
                }
                if (type == 2) {
                    return Double.valueOf(cursor.getDouble(i9));
                }
                if (type == 4) {
                    return cursor.getBlob(i9);
                }
                String string = cursor.getString(i9);
                return string != null ? string : HttpUrl.FRAGMENT_ENCODE_SET;
            }
        } catch (Throwable unused) {
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void enqueueNestedObjects(Object obj, ArrayDeque<Object> arrayDeque, Set<Object> set) {
        Class<?> type;
        Object field;
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field2 : KavaReflector.declaredFields(superclass)) {
                try {
                    if (!KavaReflector.isStatic(field2) && (type = field2.getType()) != null && !type.isPrimitive() && type != String.class && (field = KavaReflector.readField(field2, obj)) != null && !set.contains(field)) {
                        arrayDeque.addLast(field);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private synchronized Method ensureNativeMessageUpdateMethod(Object obj) {
        Method methodFindNativeMessageUpdateMethod;
        Method method = this.nativeMessageUpdateMethod;
        Object obj2 = this.nativeMessageUpdateStorage;
        if (method != null && obj2 != null && method.getDeclaringClass().isInstance(obj2) && isNativeMessageUpdateMethod(method, obj)) {
            return method;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        ArrayList arrayList = new ArrayList();
        if (this.messageStorage != null) {
            arrayList.add(this.messageStorage);
        }
        Object coreStorage = getCoreStorage();
        if (coreStorage != null) {
            arrayList.addAll(storageFieldObjects(coreStorage));
        }
        for (Object obj3 : arrayList) {
            if (obj3 != null && setNewSetFromMap.add(obj3) && (methodFindNativeMessageUpdateMethod = findNativeMessageUpdateMethod(obj3, obj)) != null) {
                this.nativeMessageUpdateStorage = obj3;
                this.nativeMessageUpdateMethod = methodFindNativeMessageUpdateMethod;
                return methodFindNativeMessageUpdateMethod;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private synchronized boolean ensureReady() {
        if (this.dbWrapper != null && this.queryMethod != null) {
            return true;
        }
        if (!isAvailable()) {
            return false;
        }
        Object coreStorage = getCoreStorage();
        if (coreStorage == null) {
            return false;
        }
        Object objFindDbWrapper = findDbWrapper(coreStorage);
        if (objFindDbWrapper == null) {
            log("未找到 SqliteDB wrapper");
            return false;
        }
        Method methodFindQueryMethod = findQueryMethod(objFindDbWrapper.getClass());
        if (methodFindQueryMethod == null) {
            log("未找到 SqliteDB 查询方法: ".concat(objFindDbWrapper.getClass().getName()));
            return false;
        }
        this.dbWrapper = objFindDbWrapper;
        this.queryMethod = methodFindQueryMethod;
        log("数据库API已就绪: wrapper=" + objFindDbWrapper.getClass().getName() + " query=" + methodFindQueryMethod.getName());
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object findDbWrapper(Object obj) {
        if (obj != null && this.dexFinder.sqliteDbWrapperClass != null) {
            Set<Object> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            ArrayDeque<Object> arrayDeque = new ArrayDeque<>();
            arrayDeque.add(obj);
            while (!arrayDeque.isEmpty()) {
                Object objRemoveFirst = arrayDeque.removeFirst();
                if (objRemoveFirst != null && !setNewSetFromMap.contains(objRemoveFirst)) {
                    setNewSetFromMap.add(objRemoveFirst);
                    if (this.dexFinder.sqliteDbWrapperClass.isInstance(objRemoveFirst) || findQueryMethod(objRemoveFirst.getClass()) != null) {
                        return objRemoveFirst;
                    }
                    enqueueNestedObjects(objRemoveFirst, arrayDeque, setNewSetFromMap);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findDeleteMethod(Class<?> cls) {
        while (cls != null && cls != Object.class) {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                if (isDeleteMethod(method)) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private List<Method> findInsertMethods(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && cls != Object.class) {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                if (isInsertMethod(method)) {
                    arrayList.add(method);
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String findMessageTableMethod(String str) {
        Object coreStorage = getCoreStorage();
        if (coreStorage == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        HashSet hashSet = new HashSet();
        for (Object obj : storageFieldObjects(coreStorage)) {
            if (obj != null && !hashSet.contains(obj)) {
                hashSet.add(obj);
                Method methodFindMessageTableMethod = findMessageTableMethod(obj, str);
                if (methodFindMessageTableMethod == null) {
                    continue;
                } else {
                    Object objInvoke = KavaReflector.invoke(methodFindMessageTableMethod, obj, str);
                    if (objInvoke instanceof String) {
                        String str2 = (String) objInvoke;
                        if (isUsableMessageTable(str2)) {
                            this.messageStorage = obj;
                            this.messageTableMethod = methodFindMessageTableMethod;
                            return str2;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findNativeMessageByIdMethod(Object obj) {
        DexFinder dexFinder;
        if (obj != null && (dexFinder = this.dexFinder) != null && dexFinder.localMessageClass != null) {
            for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                for (Method method : KavaReflector.declaredMethods(superclass)) {
                    if (isNativeMessageByIdMethod(method)) {
                        return KavaReflector.accessible(method);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findNativeMessageUpdateMethod(Object obj, Object obj2) {
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : KavaReflector.declaredMethods(superclass)) {
                if (isNativeMessageUpdateMethod(method, obj2)) {
                    return KavaReflector.accessible(method);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findQueryMethod(Class<?> cls) {
        Method method = null;
        while (cls != null && cls != Object.class) {
            for (Method method2 : KavaReflector.declaredMethods(cls)) {
                if (isQueryMethod(method2) && (method == null || queryPriority(method2) > queryPriority(method))) {
                    method = method2;
                }
            }
            cls = cls.getSuperclass();
        }
        return method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Method findUpdateMethod(Class<?> cls) {
        while (cls != null && cls != Object.class) {
            for (Method method : KavaReflector.declaredMethods(cls)) {
                if (isUpdateMethod(method)) {
                    return method;
                }
            }
            cls = cls.getSuperclass();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private String invokeMessageTableMethod(String str) {
        Object obj = this.messageStorage;
        Method method = this.messageTableMethod;
        if (obj != null && method != null) {
            try {
                Object objInvoke = KavaReflector.invoke(method, obj, str);
                if (objInvoke instanceof String) {
                    return (String) objInvoke;
                }
            } catch (Throwable unused) {
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Object invokeNativeMessageById(Object obj, Method method, long j3) {
        if (obj != null && method != null) {
            try {
                Object objInvoke = KavaReflector.invoke(method, obj, Long.valueOf(j3));
                if (this.dexFinder.localMessageClass.isInstance(objInvoke)) {
                    return objInvoke;
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isDeleteMethod(Method method) {
        if (method == null) {
            return false;
        }
        Class<?> returnType = method.getReturnType();
        if (returnType != Integer.TYPE && returnType != Integer.class) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2] == String[].class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isInsertMethod(Method method) {
        if (method == null) {
            return false;
        }
        Class<?> returnType = method.getReturnType();
        if (returnType != Long.TYPE && returnType != Long.class) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 3 && parameterTypes[0] == String.class && parameterTypes[1] == String.class && parameterTypes[2] == ContentValues.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isLikelyMessageTable(String str) {
        boolean z9 = false;
        if (!isSafeTableName(str)) {
            return false;
        }
        Cursor cursorRawQueryInternal = rawQueryInternal("PRAGMA table_info(" + quoteTable(str) + ")", null, false);
        if (cursorRawQueryInternal == null) {
            return false;
        }
        try {
            try {
                int columnIndex = cursorRawQueryInternal.getColumnIndex("name");
                if (columnIndex < 0) {
                    try {
                        cursorRawQueryInternal.close();
                    } catch (Throwable unused) {
                    }
                    return false;
                }
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                boolean z13 = false;
                while (cursorRawQueryInternal.moveToNext()) {
                    String string = cursorRawQueryInternal.getString(columnIndex);
                    if ("msgId".equals(string)) {
                        z10 = true;
                    }
                    if ("msgSvrId".equals(string)) {
                        z11 = true;
                    }
                    if ("createTime".equals(string)) {
                        z12 = true;
                    }
                    if ("content".equals(string)) {
                        z13 = true;
                    }
                }
                if (z10 && z11 && z12 && z13) {
                    z9 = true;
                }
                try {
                    cursorRawQueryInternal.close();
                } catch (Throwable unused2) {
                }
                return z9;
            } catch (Throwable unused3) {
                cursorRawQueryInternal.close();
            }
        } catch (Throwable unused4) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isMessageTableNameMethod(Method method) {
        if (method == null || KavaReflector.isStatic(method) || method.getReturnType() != String.class) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 1 && parameterTypes[0] == String.class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isNativeMessageByIdMethod(Method method) {
        DexFinder dexFinder;
        Class<?> cls;
        Class<?> cls2;
        if (method == null || KavaReflector.isStatic(method) || (dexFinder = this.dexFinder) == null || (cls = dexFinder.localMessageClass) == null || !cls.isAssignableFrom(method.getReturnType())) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 1 && ((cls2 = parameterTypes[0]) == Long.TYPE || cls2 == Long.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isNativeMessageUpdateMethod(Method method, Object obj) {
        Class<?> returnType;
        Class<?> cls;
        if (method == null || obj == null || KavaReflector.isStatic(method) || !((returnType = method.getReturnType()) == Integer.TYPE || returnType == Integer.class)) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 2 && ((cls = parameterTypes[0]) == Long.TYPE || cls == Long.class) && parameterTypes[1].isAssignableFrom(obj.getClass());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isQueryMethod(Method method) {
        if (method != null && method.getReturnType() == Cursor.class) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 2 && parameterTypes[0] == String.class && parameterTypes[1] == String[].class) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isSafeTableName(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (int i9 = 0; i9 < str.length(); i9++) {
            char cCharAt = str.charAt(i9);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < '0' || cCharAt > '9') && cCharAt != '_'))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isUpdateMethod(Method method) {
        if (method == null) {
            return false;
        }
        Class<?> returnType = method.getReturnType();
        if (returnType != Integer.TYPE && returnType != Integer.class) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        return parameterTypes.length == 4 && parameterTypes[0] == String.class && parameterTypes[1] == ContentValues.class && parameterTypes[2] == String.class && parameterTypes[3] == String[].class;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private boolean isUsableMessageTable(String str) {
        if (!isSafeTableName(str) || TextUtils.isEmpty(queryFirstString("SELECT name FROM sqlite_master WHERE type='table' AND name=? LIMIT 1", new String[]{str}, "name"))) {
            return false;
        }
        Cursor cursorRawQueryInternal = rawQueryInternal("SELECT msgId,msgSvrId,type,status,isSend,createTime,talker,content FROM " + quoteTable(str) + " LIMIT 0", null, false);
        if (cursorRawQueryInternal == null) {
            return false;
        }
        try {
            cursorRawQueryInternal.close();
        } catch (Throwable unused) {
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void log(String str) {
        if (this.logger != null) {
            C2005i.m4939f("[WeChatDatabaseApi] " + str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private int queryPriority(Method method) {
        String name = method.getName();
        if ("rawQuery".equals(name)) {
            return 100;
        }
        if ("f".equals(name)) {
            return 90;
        }
        if ("j".equals(name)) {
            return 80;
        }
        return "a".equals(name) ? 70 : 10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Cursor rawQueryInternal(String str, String[] strArr, boolean z9) {
        try {
            Object objInvoke = KavaReflector.invoke(this.queryMethod, this.dbWrapper, str, strArr);
            if (objInvoke instanceof Cursor) {
                return (Cursor) objInvoke;
            }
            return null;
        } catch (Throwable th2) {
            if (z9) {
                log("SQL 查询异常: " + th2.getMessage() + " sql=" + str);
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private List<Object> storageFieldObjects(Object obj) {
        Class<?> type;
        Object field;
        ArrayList arrayList = new ArrayList();
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field2 : KavaReflector.declaredFields(superclass)) {
                try {
                    if (!KavaReflector.isStatic(field2) && (type = field2.getType()) != null && !type.isPrimitive() && type != String.class && (field = KavaReflector.readField(field2, obj)) != null) {
                        arrayList.add(field);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String stringValue(Map<String, Object> map, String str) {
        Object obj = map != null ? map.get(str) : null;
        return obj != null ? String.valueOf(obj) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int delete(String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str) || !ensureReady()) {
            return -1;
        }
        Method methodFindDeleteMethod = this.deleteMethod;
        if (methodFindDeleteMethod == null) {
            methodFindDeleteMethod = findDeleteMethod(this.dbWrapper.getClass());
            this.deleteMethod = methodFindDeleteMethod;
        }
        Object obj = this.dbWrapper;
        if (methodFindDeleteMethod == null) {
            log("未找到 SqliteDB 删除方法: ".concat(obj.getClass().getName()));
            return -1;
        }
        try {
            Object objInvoke = KavaReflector.invoke(methodFindDeleteMethod, obj, str, str2, strArr);
            if (objInvoke instanceof Number) {
                return ((Number) objInvoke).intValue();
            }
            return -1;
        } catch (Throwable th2) {
            log("SQL 删除异常: " + th2.getMessage() + " table=" + str);
            return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object getCoreStorage() {
        if (this.coreStorage != null) {
            return this.coreStorage;
        }
        try {
            Method method = this.dexFinder.coreStorageGetter;
            Object objInvoke = KavaReflector.invoke(method, KavaReflector.isStatic(method) ? null : this.dexFinder.mmKernelClass, new Object[0]);
            if (objInvoke != null) {
                this.coreStorage = objInvoke;
                return objInvoke;
            }
        } catch (Throwable th2) {
            log("获取 CoreStorage 失败: " + th2.getMessage());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long insert(String str, String str2, ContentValues contentValues) {
        long jLongValue;
        if (TextUtils.isEmpty(str) || contentValues == null || !ensureReady()) {
            return -1L;
        }
        List<Method> listFindInsertMethods = this.insertMethods;
        if (listFindInsertMethods == null) {
            listFindInsertMethods = findInsertMethods(this.dbWrapper.getClass());
            this.insertMethods = listFindInsertMethods;
        }
        if (listFindInsertMethods == null || listFindInsertMethods.isEmpty()) {
            log("未找到 SqliteDB 插入方法: ".concat(this.dbWrapper.getClass().getName()));
            return -1L;
        }
        Iterator<Method> it = listFindInsertMethods.iterator();
        while (it.hasNext()) {
            try {
                Object objInvoke = KavaReflector.invoke(it.next(), this.dbWrapper, str, str2, contentValues);
                jLongValue = objInvoke instanceof Number ? ((Number) objInvoke).longValue() : -1L;
            } catch (Throwable unused) {
            }
            if (jLongValue >= 0) {
                return jLongValue;
            }
        }
        log(AbstractC4855en.m9263g("SQL 插入失败: table=", str));
        return -1L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isAvailable() {
        DexFinder dexFinder = this.dexFinder;
        return (dexFinder == null || dexFinder.coreStorageGetter == null || dexFinder.sqliteDbWrapperClass == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isReady() {
        return (this.dbWrapper == null || this.queryMethod == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String messageTableForTalker(String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = this.messageTableCache.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (!ensureReady()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strInvokeMessageTableMethod = invokeMessageTableMethod(str);
        if (isUsableMessageTable(strInvokeMessageTableMethod)) {
            this.messageTableCache.put(str, strInvokeMessageTableMethod);
            return strInvokeMessageTableMethod;
        }
        String strFindMessageTableMethod = findMessageTableMethod(str);
        if (!isUsableMessageTable(strFindMessageTableMethod)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        this.messageTableCache.put(str, strFindMessageTableMethod);
        return strFindMessageTableMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<String> messageTables() {
        List<String> list = this.messageTables;
        if (list != null) {
            return list;
        }
        if (!ensureReady()) {
            return new ArrayList();
        }
        synchronized (this) {
            try {
                if (this.messageTables != null) {
                    return this.messageTables;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Map<String, Object>> it = query("SELECT name FROM sqlite_master WHERE type='table' AND name NOT LIKE 'sqlite_%'", null).iterator();
                while (it.hasNext()) {
                    String strStringValue = stringValue(it.next(), "name");
                    if (isLikelyMessageTable(strStringValue)) {
                        arrayList.add(strStringValue);
                    }
                }
                this.messageTables = arrayList;
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object nativeMessageById(long j3) {
        DexFinder dexFinder;
        if (j3 <= 0 || (dexFinder = this.dexFinder) == null || dexFinder.localMessageClass == null || !ensureReady()) {
            return null;
        }
        Object objInvokeNativeMessageById = invokeNativeMessageById(this.messageStorage, this.nativeMessageByIdMethod, j3);
        if (objInvokeNativeMessageById != null) {
            return objInvokeNativeMessageById;
        }
        Object coreStorage = getCoreStorage();
        if (coreStorage == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (Object obj : storageFieldObjects(coreStorage)) {
            if (obj != null && !hashSet.contains(obj)) {
                hashSet.add(obj);
                Method methodFindNativeMessageByIdMethod = findNativeMessageByIdMethod(obj);
                Object objInvokeNativeMessageById2 = invokeNativeMessageById(obj, methodFindNativeMessageByIdMethod, j3);
                if (objInvokeNativeMessageById2 != null) {
                    this.messageStorage = obj;
                    this.nativeMessageByIdMethod = methodFindNativeMessageByIdMethod;
                    return objInvokeNativeMessageById2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<Map<String, Object>> query(String str, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = rawQuery(str, strArr);
        try {
            if (cursorRawQuery != null) {
                try {
                    String[] columnNames = cursorRawQuery.getColumnNames();
                    if (columnNames != null && cursorRawQuery.moveToFirst()) {
                        do {
                            HashMap map = new HashMap();
                            for (int i9 = 0; i9 < columnNames.length; i9++) {
                                map.put(columnNames[i9], cursorValue(cursorRawQuery, i9));
                            }
                            arrayList.add(map);
                        } while (cursorRawQuery.moveToNext());
                        cursorRawQuery.close();
                        return arrayList;
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    try {
                        log("SQL 结果读取异常: " + th2.getMessage());
                        cursorRawQuery.close();
                    } finally {
                        try {
                            cursorRawQuery.close();
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String queryFirstString(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = rawQuery(str, strArr);
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (cursorRawQuery == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            if (!cursorRawQuery.moveToFirst()) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            int i9 = 0;
            int columnIndex = !TextUtils.isEmpty(str2) ? cursorRawQuery.getColumnIndex(str2) : 0;
            if (columnIndex >= 0) {
                i9 = columnIndex;
            }
            String string = cursorRawQuery.getString(i9);
            if (string != null) {
                str3 = string;
            }
            try {
                cursorRawQuery.close();
            } catch (Throwable unused) {
            }
            return str3;
        } catch (Throwable th2) {
            try {
                log("SQL 单值读取异常: " + th2.getMessage());
                try {
                    cursorRawQuery.close();
                } catch (Throwable unused2) {
                }
                return HttpUrl.FRAGMENT_ENCODE_SET;
            } finally {
                try {
                    cursorRawQuery.close();
                } catch (Throwable unused3) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String quoteTable(String str) {
        return isSafeTableName(str) ? AbstractC0921a.m2251n("`", str, "`") : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Cursor rawQuery(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && ensureReady()) {
            return rawQueryInternal(str, strArr, true);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object storageObjectForMethod(Method method) {
        Class<?> declaringClass;
        if (method == null || (declaringClass = method.getDeclaringClass()) == null) {
            return null;
        }
        String name = declaringClass.getName();
        Object obj = this.storageObjectCache.get(name);
        if (obj != null) {
            if (declaringClass.isInstance(obj)) {
                return obj;
            }
            this.storageObjectCache.remove(name);
        }
        Object coreStorage = getCoreStorage();
        if (coreStorage == null) {
            return null;
        }
        Set<Object> setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        ArrayDeque<Object> arrayDeque = new ArrayDeque<>();
        arrayDeque.add(coreStorage);
        while (!arrayDeque.isEmpty()) {
            Object objRemoveFirst = arrayDeque.removeFirst();
            if (objRemoveFirst != null && !setNewSetFromMap.contains(objRemoveFirst)) {
                setNewSetFromMap.add(objRemoveFirst);
                if (declaringClass.isInstance(objRemoveFirst)) {
                    this.storageObjectCache.put(name, objRemoveFirst);
                    return objRemoveFirst;
                }
                enqueueNestedObjects(objRemoveFirst, arrayDeque, setNewSetFromMap);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int update(String str, ContentValues contentValues, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str) || contentValues == null || !ensureReady()) {
            return -1;
        }
        Method methodFindUpdateMethod = this.updateMethod;
        if (methodFindUpdateMethod == null) {
            methodFindUpdateMethod = findUpdateMethod(this.dbWrapper.getClass());
            this.updateMethod = methodFindUpdateMethod;
        }
        Object obj = this.dbWrapper;
        if (methodFindUpdateMethod == null) {
            log("未找到 SqliteDB 更新方法: ".concat(obj.getClass().getName()));
            return -1;
        }
        try {
            Object objInvoke = KavaReflector.invoke(methodFindUpdateMethod, obj, str, contentValues, str2, strArr);
            if (objInvoke instanceof Number) {
                return ((Number) objInvoke).intValue();
            }
            return -1;
        } catch (Throwable th2) {
            log("SQL 更新异常: " + th2.getMessage() + " table=" + str);
            return -1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean updateNativeMessageContent(long j3, String str, Object obj) {
        DexFinder dexFinder;
        Class<?> cls;
        if (j3 > 0 && (dexFinder = this.dexFinder) != null && (cls = dexFinder.localMessageClass) != null) {
            if (!cls.isInstance(obj)) {
                obj = nativeMessageById(j3);
            }
            if (obj == null) {
                return false;
            }
            Method methodEnsureNativeMessageUpdateMethod = ensureNativeMessageUpdateMethod(obj);
            Object obj2 = this.nativeMessageUpdateStorage;
            if (methodEnsureNativeMessageUpdateMethod != null && obj2 != null) {
                Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(obj.getClass(), "field_content");
                if (fieldFindFieldRecursive == null) {
                    fieldFindFieldRecursive = KavaReflector.findFieldRecursive(obj.getClass(), "content");
                }
                if (fieldFindFieldRecursive != null && fieldFindFieldRecursive.getType() == String.class) {
                    Object field = KavaReflector.readField(fieldFindFieldRecursive, obj);
                    if (!KavaReflector.writeField(fieldFindFieldRecursive, obj, str)) {
                        return false;
                    }
                    try {
                        Object objInvokeOrThrow = KavaReflector.invokeOrThrow(methodEnsureNativeMessageUpdateMethod, obj2, Long.valueOf(j3), obj);
                        if ((objInvokeOrThrow instanceof Number ? ((Number) objInvokeOrThrow).intValue() : 0) > 0) {
                            return true;
                        }
                        KavaReflector.writeField(fieldFindFieldRecursive, obj, field);
                        return false;
                    } catch (Throwable th2) {
                        KavaReflector.writeField(fieldFindFieldRecursive, obj, field);
                        log("原生消息更新异常: " + th2.getMessage() + " msgId=" + j3);
                    }
                }
            }
        }
        return false;
    }

    private Method findMessageTableMethod(Object obj, String str) {
        for (Class<?> superclass = obj.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Method method : KavaReflector.declaredMethods(superclass)) {
                if (isMessageTableNameMethod(method)) {
                    Object objInvoke = KavaReflector.invoke(method, obj, str);
                    if ((objInvoke instanceof String) && isUsableMessageTable((String) objInvoke)) {
                        return method;
                    }
                }
            }
        }
        return null;
    }
}
