package bsh;

import bsh.Capabilities;
import bsh.classpath.ClassManagerImpl;
import bsh.loader.BshLoaderManager;
import bsh.loader.BshPluginLoader;
import bsh.util.ValueReferenceMap;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshClassManager {
    static final ValueReferenceMap<Class<?>, MemberCache> memberCache = new ValueReferenceMap<>(new C0342b(2), ValueReferenceMap.Type.Soft);
    private Interpreter declaringInterpreter;
    protected ClassLoader externalClassLoader;
    protected BshPluginLoader pluginLoader;
    protected BshLoaderManager loaderManager = new BshLoaderManager();
    protected final transient Map<String, Class<?>> absoluteClassCache = new ConcurrentHashMap();
    protected final transient Set<String> absoluteNonClasses = ConcurrentHashMap.newKeySet();
    protected final transient Map<String, Class<?>> associatedClasses = new ConcurrentHashMap();

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface Listener {
        void classLoaderChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static UtilEvalError cmUnavailable() {
        return new Capabilities.Unavailable("ClassLoading features unavailable.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshClassManager createClassManager(Interpreter interpreter) {
        ClassManagerImpl classManagerImpl = new ClassManagerImpl();
        ((BshClassManager) classManagerImpl).declaringInterpreter = interpreter;
        return classManagerImpl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ MemberCache lambda$static$0(Class cls) {
        return new MemberCache(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addClassLoader(ClassLoader classLoader) {
        this.loaderManager.addClassLoader(classLoader);
        classLoaderChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void associateClass(Class<?> cls) {
        if (Reflect.isGeneratedClass(cls)) {
            this.associatedClasses.put(cls.getName(), cls);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void cacheClassInfo(String str, Class<?> cls) {
        if (cls == null) {
            this.absoluteNonClasses.add(str);
        } else {
            this.absoluteClassCache.put(str, cls);
            memberCache.get(cls);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean classExists(String str) {
        return classForName(str) != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> classForName(String str) {
        Class<?> clsPlainClassForName;
        try {
            clsPlainClassForName = plainClassForName(str);
        } catch (ClassNotFoundException unused) {
            clsPlainClassForName = null;
        }
        return (clsPlainClassForName == null && this.declaringInterpreter.getCompatibility()) ? loadSourceClass(str) : clsPlainClassForName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void clearCaches() {
        this.absoluteNonClasses.clear();
        this.absoluteClassCache.clear();
        memberCache.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> defineClass(String str, byte[] bArr) {
        throw new InterpreterError(AbstractC0921a.m2251n("Can't create class (", str, ") without class manager package."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void doSuperImport() {
        throw cmUnavailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void dump(PrintWriter printWriter) {
        printWriter.println("BshClassManager: no class manager.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getAssociatedClass(String str) {
        return this.associatedClasses.get(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getClassNameByUnqName(String str) throws UtilEvalError {
        throw cmUnavailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public URL getResource(String str) {
        ClassLoader classLoader = this.externalClassLoader;
        URL resource = classLoader != null ? classLoader.getResource(str.substring(1)) : null;
        return resource == null ? Interpreter.class.getResource(str) : resource;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public InputStream getResourceAsStream(String str) {
        ClassLoader classLoader = this.externalClassLoader;
        InputStream resourceAsStream = classLoader != null ? classLoader.getResourceAsStream(str.substring(1)) : null;
        return resourceAsStream == null ? Interpreter.class.getResourceAsStream(str) : resourceAsStream;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean getStrictJava() {
        Interpreter interpreter = this.declaringInterpreter;
        return interpreter != null && interpreter.getStrictJava();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean hasSuperImport() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> loadGeneratedClass(String str, byte[] bArr) {
        throw new InterpreterError(AbstractC0921a.m2251n("Can't load generated class (", str, ") without class manager package."));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> loadSourceClass(String str) {
        String str2 = "/" + str.replace('.', '/') + ".java";
        URL resource = getResource(str2);
        if (resource == null) {
            return null;
        }
        try {
            FileReader fileReader = new FileReader((InputStream) resource.getContent());
            try {
                Interpreter.debug("Loading class from source file: ".concat(str2));
                this.declaringInterpreter.eval(fileReader);
                fileReader.close();
            } catch (Throwable th2) {
                try {
                    fileReader.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (EvalError | IOException e6) {
            if (Interpreter.DEBUG.get().booleanValue()) {
                e6.printStackTrace();
            }
        }
        try {
            return plainClassForName(str);
        } catch (ClassNotFoundException unused) {
            Interpreter.debug("Class not found in source file: ".concat(str));
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> plainClassForName(String str) {
        ClassLoader classLoader = this.externalClassLoader;
        Class<?> clsLoadClass = classLoader != null ? classLoader.loadClass(str) : Class.forName(str);
        cacheClassInfo(str, clsLoadClass);
        return clsLoadClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reloadAllClasses() throws UtilEvalError {
        throw cmUnavailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reloadClasses(String[] strArr) throws UtilEvalError {
        throw cmUnavailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reloadPackage(String str) throws UtilEvalError {
        throw cmUnavailable();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void reset() {
        clearCaches();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setClassLoader(ClassLoader classLoader) {
        this.externalClassLoader = classLoader;
        classLoaderChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setClassPath(URL[] urlArr) throws UtilEvalError {
        throw cmUnavailable();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class MemberCache {
        private final Map<String, List<Invocable>> cache = new ConcurrentHashMap();
        private final Map<String, Invocable> fields = new ConcurrentHashMap();

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public MemberCache(Class<?> cls) {
            Class<?> superclass = cls;
            while (superclass != null) {
                if (Reflect.isPackageAccessible(superclass) && ((Reflect.isPackageScope(superclass) && !Reflect.isPrivate(superclass)) || Reflect.isPublic(superclass) || Capabilities.haveAccessibility())) {
                    MemberCache memberCache = cls == superclass ? null : BshClassManager.memberCache.get(superclass);
                    for (Field field : superclass.getDeclaredFields()) {
                        if (Reflect.isPublic(field) || Capabilities.haveAccessibility()) {
                            cacheMember(Invocable.get(field));
                        }
                    }
                    for (Method method : superclass.getDeclaredMethods()) {
                        if (Reflect.isPublic(method) || Capabilities.haveAccessibility()) {
                            if (cls == superclass) {
                                cacheMember(Invocable.get(method));
                            } else {
                                cacheMember(memberCache.findMethod(method.getName(), method.getParameterTypes()));
                            }
                        }
                    }
                    for (Constructor<?> constructor : superclass.getDeclaredConstructors()) {
                        if (cls == superclass) {
                            cacheMember(Invocable.get(constructor));
                        } else {
                            cacheMember(memberCache.findMethod(constructor.getName(), constructor.getParameterTypes()));
                        }
                    }
                }
                processInterfaces(superclass.getInterfaces());
                superclass = superclass.getSuperclass();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private boolean cacheMember(Invocable invocable) {
            if (invocable == null) {
                return false;
            }
            if (!invocable.isGetter() && !invocable.isSetter()) {
                return cacheMember(invocable.getName(), invocable);
            }
            String name = invocable.getName();
            String strReplaceFirst = name.replaceFirst("[gs]et|is", HttpUrl.FRAGMENT_ENCODE_SET);
            if (strReplaceFirst.length() == 1 || Character.isLowerCase(name.charAt(1))) {
                char[] charArray = strReplaceFirst.toCharArray();
                charArray[0] = Character.toLowerCase(charArray[0]);
                strReplaceFirst = new String(charArray);
            }
            return cacheMember(name, invocable) && cacheMember(strReplaceFirst, invocable);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private Invocable findBest(List<Invocable> list, Class<?>[] clsArr) {
            if (list.isEmpty()) {
                return null;
            }
            return list.size() == 1 ? list.get(0) : Reflect.findMostSpecificInvocable(clsArr, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private void processInterfaces(Class<?>[] clsArr) {
            for (Class<?> cls : clsArr) {
                if (Reflect.isPackageAccessible(cls)) {
                    MemberCache memberCache = BshClassManager.memberCache.get(cls);
                    for (Field field : cls.getDeclaredFields()) {
                        cacheMember(Invocable.get(field));
                    }
                    for (Method method : cls.getDeclaredMethods()) {
                        if (Reflect.isPublic(method) || Capabilities.haveAccessibility()) {
                            cacheMember(memberCache.findMethod(method.getName(), method.getParameterTypes()));
                        }
                    }
                }
                processInterfaces(cls.getInterfaces());
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Invocable findField(String str) {
            if (hasField(str)) {
                return this.fields.get(str);
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Invocable findGetter(String str) {
            if (!hasMember(str)) {
                return null;
            }
            for (Invocable invocable : members(str)) {
                if (invocable.isGetter()) {
                    return invocable;
                }
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int findMemberIndex(String str, Class<?>[] clsArr) {
            return Reflect.findMostSpecificInvocableIndex(clsArr, members(str));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Invocable findMethod(String str, Class<?>... clsArr) {
            if (hasMember(str)) {
                return findBest(members(str), clsArr);
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Invocable findSetter(String str) {
            if (!hasMember(str)) {
                return null;
            }
            for (Invocable invocable : members(str)) {
                if (invocable.isSetter()) {
                    return invocable;
                }
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public Invocable findStaticMethod(String str) {
            if (hasMember(str)) {
                return members(str).stream().filter(new C0341a(1)).findFirst().get();
            }
            return null;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean hasField(String str) {
            return this.fields.containsKey(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean hasMember(String str) {
            return this.cache.containsKey(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int memberCount(String str) {
            return members(str).size();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public List<Invocable> members(String str) {
            return this.cache.get(str);
        }

        public Invocable findMethod(String str, Object... objArr) {
            return findMethod(str, Types.getTypes(objArr));
        }

        private boolean cacheMember(FieldAccess fieldAccess) {
            return !hasField(fieldAccess.getName()) && this.fields.put(fieldAccess.getName(), fieldAccess) == null;
        }

        private boolean cacheMember(String str, Invocable invocable) {
            if (!hasMember(str)) {
                return this.cache.put(str, Collections.singletonList(invocable)) == null;
            }
            if (memberCount(str) == 1) {
                this.cache.put(str, new ArrayList(members(str)));
            }
            return members(str).add(invocable);
        }
    }

    public void classLoaderChanged() {
    }

    public void addClassPath(URL url) {
    }

    public void addListener(Listener listener) {
    }

    public void removeListener(Listener listener) {
    }
}
