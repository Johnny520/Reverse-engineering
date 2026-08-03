package bsh.classpath;

import ae.C0073d;
import ae.C0074e;
import be.C0305w;
import bsh.C0353j;
import bsh.ClassPathException;
import bsh.NameSource;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okhttp3.HttpUrl;
import p007a7.C0019b;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BshClassPath implements ClassPathListener, NameSource {
    private static BshClassPath bootClassPath;
    private static MappingFeedback mappingFeedbackListener;
    private static BshClassPath userClassPath;
    private static URL[] userClassPathComp;
    private final Map<String, ClassSource> classSource;
    private final Set<BshClassPath> compPaths;
    Vector<WeakReference<ClassPathListener>> listeners;
    private boolean mapsInitialized;
    String name;
    private boolean nameCompletionIncludesUnqNames;
    private List<NameSource.Listener> nameSourceListeners;
    private final Map<String, Set<String>> packageMap;
    private final Set<URL> path;
    private UnqualifiedNameTable unqNameTable;
    private static final Pattern slashDot = Pattern.compile("[/\\\\]");
    private static final Pattern moduleName = Pattern.compile("^modules/[^/]+/");
    private static final Pattern dotClass = Pattern.compile("\\.[^\\.]+$");
    private static final Pattern splitClass = Pattern.compile("\\.(?=[^.]+$)");

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class AmbiguousName {
        List<String> list;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public AmbiguousName(String str) {
            ArrayList arrayList = new ArrayList();
            this.list = arrayList;
            arrayList.add(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void add(String str) {
            this.list.add(str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public List<String> get() {
            return this.list;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static abstract class ClassSource {
        Object source;

        public abstract byte[] getCode(String str);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class DirClassSource extends ClassSource {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public DirClassSource(File file) {
            this.source = file;
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public static byte[] readBytesFromFile(File file, String str) {
            File file2 = new File(file, str.replace('.', File.separatorChar) + ".class");
            if (!file2.exists()) {
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file2);
                try {
                    DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                    try {
                        byte[] bArr = new byte[(int) file2.length()];
                        dataInputStream.readFully(bArr);
                        dataInputStream.close();
                        dataInputStream.close();
                        fileInputStream.close();
                        return bArr;
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e6) {
                throw new RuntimeException("Couldn't load file: " + file2, e6);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.classpath.BshClassPath.ClassSource
        public byte[] getCode(String str) {
            return readBytesFromFile(getDir(), str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public File getDir() {
            return (File) this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "Dir: " + this.source;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class GeneratedClassSource extends ClassSource {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public GeneratedClassSource(byte[] bArr) {
            this.source = bArr;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.classpath.BshClassPath.ClassSource
        public byte[] getCode(String str) {
            return (byte[]) this.source;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class JarClassSource extends ClassSource {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public JarClassSource(URL url) {
            this.source = url;
        }

        /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.classpath.BshClassPath.ClassSource
        public byte[] getCode(String str) {
            String str2 = "/" + str.replace('.', '/') + ".class";
            try {
                URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{getURL()});
                try {
                    DataInputStream dataInputStream = new DataInputStream(uRLClassLoader.loadClass(str).getResourceAsStream(str2));
                    try {
                        byte[] bArr = new byte[dataInputStream.available()];
                        dataInputStream.readFully(bArr);
                        dataInputStream.close();
                        uRLClassLoader.close();
                        return bArr;
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        uRLClassLoader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException | ClassNotFoundException unused) {
                return new byte[0];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public URL getURL() {
            return (URL) this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "Jar: " + this.source;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class JrtClassSource extends ClassSource {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public JrtClassSource(URL url) {
            this.source = url;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.classpath.BshClassPath.ClassSource
        public byte[] getCode(String str) {
            try {
                DataInputStream dataInputStream = new DataInputStream((InputStream) new URL(this.source + ("/" + str.replace('.', '/') + ".class")).getContent());
                try {
                    byte[] bArr = new byte[dataInputStream.available()];
                    dataInputStream.readFully(bArr);
                    dataInputStream.close();
                    return bArr;
                } finally {
                }
            } catch (IOException unused) {
                return new byte[0];
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public URL getURL() {
            return (URL) this.source;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "Jrt: " + this.source;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public interface MappingFeedback {
        void classMapping(String str);

        void endClassMapping();

        void errorWhileMapping(String str);

        void startClassMapping();
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class UnqualifiedNameTable extends HashMap<String, AmbiguousName> {
        private static final long serialVersionUID = 1;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public void add(String str) {
            String str2 = BshClassPath.splitClassname(str)[1];
            if (super.containsKey(str2)) {
                ((AmbiguousName) super.get(str2)).add(str);
            } else {
                super.put(str2, new AmbiguousName(str));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshClassPath(String str) {
        this.path = ConcurrentHashMap.newKeySet();
        this.compPaths = ConcurrentHashMap.newKeySet();
        this.packageMap = new ConcurrentHashMap();
        this.classSource = new ConcurrentHashMap();
        this.nameCompletionIncludesUnqNames = true;
        this.listeners = new Vector<>();
        this.name = str;
        reset();
    }

    /* JADX DEBUG: Class process forced to load method for inline: bsh.j.g(java.lang.String):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void addMappingFeedback(MappingFeedback mappingFeedback) {
        if (mappingFeedbackListener == null) {
            mappingFeedbackListener = mappingFeedback;
        } else {
            C0353j.m1309g("Unimplemented: already a listener");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private UnqualifiedNameTable buildUnqualifiedNameTable() {
        UnqualifiedNameTable unqualifiedNameTable = new UnqualifiedNameTable();
        this.compPaths.forEach(new C0344a(unqualifiedNameTable, 0));
        this.classSource.keySet().forEach(new C0344a(unqualifiedNameTable, 1));
        return unqualifiedNameTable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String canonicalizeClassName(String str) {
        if (str.startsWith("modules/")) {
            str = moduleName.matcher(str).replaceFirst(HttpUrl.FRAGMENT_ENCODE_SET);
        }
        if (str.indexOf(47) >= 0 || str.indexOf(92) >= 0) {
            str = slashDot.matcher(str).replaceAll(".");
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        if (str.startsWith("class ")) {
            str = str.substring(6);
        }
        if (str.startsWith("classes.")) {
            str = str.substring(8);
        }
        return str.endsWith(".class") ? dotClass.matcher(str).replaceFirst(HttpUrl.FRAGMENT_ENCODE_SET) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void clearCachedStructures() {
        this.mapsInitialized = false;
        this.packageMap.clear();
        this.classSource.clear();
        this.unqNameTable = null;
        nameSpaceChanged();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshClassPath getBootClassPath() throws ClassPathException {
        if (bootClassPath == null) {
            try {
                bootClassPath = new BshClassPath("Boot Class Path", new URL[]{getRTJarPath()});
            } catch (MalformedURLException e6) {
                throw new ClassPathException(" can't find boot jar: " + e6, e6);
            }
        }
        return bootClassPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static URL getRTJarPath() {
        String externalForm = Class.class.getResource("/java/lang/String.class").toExternalForm();
        return externalForm.startsWith("jrt:/") ? new URL(externalForm.substring(0, externalForm.indexOf(47, 5))) : new URL(externalForm.replaceFirst("[^!]*$", "/"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private UnqualifiedNameTable getUnqualifiedNameTable() {
        if (this.unqNameTable == null) {
            this.unqNameTable = buildUnqualifiedNameTable();
        }
        return this.unqNameTable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static BshClassPath getUserClassPath() {
        if (userClassPath == null) {
            userClassPath = new BshClassPath("User Class Path", getUserClassPathComponents());
        }
        return userClassPath;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static URL[] getUserClassPathComponents() throws ClassPathException {
        URL[] urlArr = userClassPathComp;
        if (urlArr != null) {
            return urlArr;
        }
        String property = System.getProperty("java.class.path");
        String[] strArrSplit = property == null ? new String[0] : property.split(File.pathSeparator);
        URL[] urlArr2 = new URL[strArrSplit.length];
        for (int i9 = 0; i9 < strArrSplit.length; i9++) {
            try {
                urlArr2[i9] = new File(new File(strArrSplit[i9]).getCanonicalPath()).toURI().toURL();
            } catch (IOException e6) {
                throw new ClassPathException("can't parse class path: " + e6, e6);
            }
        }
        userClassPathComp = urlArr2;
        return urlArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isArchiveFileName(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".jar") || lowerCase.endsWith(".zip") || lowerCase.endsWith(".jmod");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isClassFileName(String str) {
        return str.toLowerCase().endsWith(".class");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$buildUnqualifiedNameTable$4(UnqualifiedNameTable unqualifiedNameTable, BshClassPath bshClassPath) {
        bshClassPath.classSource.keySet().forEach(new C0344a(unqualifiedNameTable, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getAllNames$6(List list, String str) {
        list.addAll(removeInnerClassNames(getClassesForPackage(str)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getClassesForPackage$0(String str, Set set, BshClassPath bshClassPath) {
        Set<String> classesForPackage = bshClassPath.getClassesForPackage(str);
        if (classesForPackage != null) {
            set.addAll(classesForPackage);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getFullPath$2(List list, BshClassPath bshClassPath) {
        for (URL url : bshClassPath.getFullPath()) {
            if (!list.contains(url)) {
                list.add(url);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getPackagesSet$9(Set set, BshClassPath bshClassPath) {
        set.addAll(bshClassPath.packageMap.keySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$searchJarFSForClasses$8(int i9) {
        return new String[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$searchJrtFSForClasses$7(int i9) {
        return new String[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void mapClass(String str, ClassSource classSource) {
        String str2 = splitClassname(str)[0];
        Set<String> hashSet = this.packageMap.get(str2);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.packageMap.put(str2, hashSet);
        }
        hashSet.add(str);
        if (this.classSource.get(str) == null) {
            this.classSource.put(str, classSource);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Collection<String> removeInnerClassNames(Collection<String> collection) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(collection);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).indexOf("$") != -1) {
                it.remove();
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void reset() {
        this.path.clear();
        this.compPaths.clear();
        clearCachedStructures();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] searchArchiveForClasses(URL url) throws IOException {
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(url.openStream());
        while (zipInputStream.available() == 1) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null && isClassFileName(nextEntry.getName())) {
                arrayList.add(canonicalizeClassName(nextEntry.getName()));
            }
        }
        zipInputStream.close();
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] searchJarFSForClasses(URL url) throws Exception {
        try {
            try {
                FileSystems.newFileSystem(url.toURI(), new HashMap());
            } catch (FileSystemAlreadyExistsException unused) {
            }
            try {
                Stream<Path> streamWalk = Files.walk(FileSystems.getFileSystem(url.toURI()).getPath("/", new String[0]), new FileVisitOption[0]);
                try {
                    String[] strArr = (String[]) streamWalk.map(new C0073d(20)).filter(new C0019b(22)).map(new C0073d(21)).toArray(new C0345b(0));
                    streamWalk.close();
                    return strArr;
                } finally {
                }
            } catch (Exception e6) {
                throw e6;
            }
        } catch (URISyntaxException unused2) {
            return new String[0];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] searchJrtFSForClasses(URL url) throws Exception {
        try {
            try {
                Stream<Path> streamWalk = Files.walk(FileSystems.getFileSystem(new URI("jrt:/")).getPath("modules", url.getPath()), new FileVisitOption[0]);
                try {
                    String[] strArr = (String[]) streamWalk.map(new C0073d(20)).filter(new C0019b(22)).map(new C0073d(21)).toArray(new C0345b(1));
                    streamWalk.close();
                    return strArr;
                } finally {
                }
            } catch (Exception e6) {
                throw e6;
            }
        } catch (URISyntaxException unused) {
            return new String[0];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] splitClassname(String str) {
        String strCanonicalizeClassName = canonicalizeClassName(str);
        return strCanonicalizeClassName.indexOf(46) == -1 ? new String[]{"<unpackaged>", strCanonicalizeClassName} : splitClass.split(strCanonicalizeClassName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String[] traverseDirForClasses(File file) throws IOException {
        List<String> listTraverseDirForClassesAux = traverseDirForClassesAux(file, file);
        return (String[]) listTraverseDirForClassesAux.toArray(new String[listTraverseDirForClassesAux.size()]);
    }

    /* JADX DEBUG: Class process forced to load method for inline: j8.o.y(java.lang.String):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static List<String> traverseDirForClassesAux(File file, File file2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String absolutePath = file.getAbsolutePath();
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isDirectory()) {
                arrayList.addAll(traverseDirForClassesAux(file, file3));
            } else {
                String absolutePath2 = file3.getAbsolutePath();
                if (!isClassFileName(absolutePath2)) {
                    continue;
                } else {
                    if (!absolutePath2.startsWith(absolutePath)) {
                        C2104o.m5299y("problem parsing paths");
                        return null;
                    }
                    arrayList.add(canonicalizeClassName(absolutePath2.substring(absolutePath.length() + 1)));
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void add(URL[] urlArr) {
        this.path.addAll(Arrays.asList(urlArr));
        if (this.mapsInitialized) {
            map(urlArr);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addComponent(BshClassPath bshClassPath) {
        if (bshClassPath == null) {
            return;
        }
        this.compPaths.add(bshClassPath);
        bshClassPath.addListener(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addListener(ClassPathListener classPathListener) {
        this.listeners.addElement(new WeakReference<>(classPathListener));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSource
    public void addNameSourceListener(NameSource.Listener listener) {
        if (this.nameSourceListeners == null) {
            this.nameSourceListeners = new ArrayList();
        }
        this.nameSourceListeners.add(listener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void classMapping(String str) {
        MappingFeedback mappingFeedback = mappingFeedbackListener;
        if (mappingFeedback != null) {
            mappingFeedback.classMapping(str);
            return;
        }
        System.err.println("Mapping: " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.classpath.ClassPathListener
    public void classPathChanged() {
        clearCachedStructures();
        notifyListeners();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void endClassMapping() {
        MappingFeedback mappingFeedback = mappingFeedbackListener;
        if (mappingFeedback != null) {
            mappingFeedback.endClassMapping();
        } else {
            System.err.println("End ClassPath Mapping");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void errorWhileMapping(String str) {
        MappingFeedback mappingFeedback = mappingFeedbackListener;
        if (mappingFeedback != null) {
            mappingFeedback.errorWhileMapping(str);
        } else {
            System.err.println(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.NameSource
    public String[] getAllNames() {
        insureInitialized();
        ArrayList arrayList = new ArrayList();
        getPackagesSet().forEach(new C0305w(this, 3, arrayList));
        if (this.nameCompletionIncludesUnqNames) {
            arrayList.addAll(getUnqualifiedNameTable().keySet());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getClassNameByUnqName(String str) throws ClassPathException {
        insureInitialized();
        AmbiguousName ambiguousName = getUnqualifiedNameTable().get(str);
        if (ambiguousName == null) {
            return null;
        }
        List<String> list = ambiguousName.get();
        if (list.size() == 1) {
            return list.get(0);
        }
        throw new ClassPathException("Ambiguous class names: " + list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ClassSource getClassSource(String str) {
        ClassSource classSource = this.classSource.get(str);
        if (classSource != null) {
            return classSource;
        }
        insureInitialized();
        Iterator<BshClassPath> it = this.compPaths.iterator();
        ClassSource classSource2 = this.classSource.get(str);
        while (classSource2 == null && it.hasNext()) {
            classSource2 = it.next().getClassSource(str);
        }
        return classSource2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Set<String> getClassesForPackage(String str) {
        insureInitialized();
        HashSet hashSet = new HashSet();
        Set<String> set = this.packageMap.get(str);
        if (set != null) {
            hashSet.addAll(set);
        }
        this.compPaths.forEach(new C0305w(str, 4, hashSet));
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<URL> getFullPath() {
        ArrayList arrayList = new ArrayList();
        this.compPaths.forEach(new C0346c(arrayList, 0));
        arrayList.addAll(this.path);
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public List<NameSource.Listener> getNameSourceListeners() {
        return this.nameSourceListeners;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Set<String> getPackagesSet() {
        insureInitialized();
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.packageMap.keySet());
        this.compPaths.forEach(new C0346c(hashSet, 1));
        return hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public URL[] getPathComponents() {
        return (URL[]) getFullPath().toArray(new URL[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public UnqualifiedNameTable getUnqNameTable() {
        return this.unqNameTable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void insureInitialized(boolean z9) {
        if (z9 && !this.mapsInitialized) {
            startClassMapping();
        }
        this.compPaths.forEach(new C0074e(9));
        if (!this.mapsInitialized) {
            map((URL[]) this.path.toArray(new URL[0]));
        }
        if (z9 && !this.mapsInitialized) {
            endClassMapping();
        }
        this.mapsInitialized = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isMapsInitialized() {
        return this.mapsInitialized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isNameCompletionIncludesUnqNames() {
        return this.nameCompletionIncludesUnqNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void map(URL url) {
        if ("jrt".equals(url.getProtocol())) {
            classMapping("FileSystem: " + url);
            map(searchJrtFSForClasses(url), new JrtClassSource(url));
            return;
        }
        if ("jar".equals(url.getProtocol())) {
            classMapping("FileSystem: " + url);
            map(searchJarFSForClasses(url), new JarClassSource(url));
            return;
        }
        String file = url.getFile();
        File file2 = new File(file);
        if (file2.isDirectory()) {
            classMapping("Directory " + file2.toString());
            map(traverseDirForClasses(file2), new DirClassSource(file2));
            return;
        }
        if (!isArchiveFileName(file)) {
            errorWhileMapping("Not a classpath component: " + file);
        } else {
            classMapping("Archive: " + url);
            map(searchArchiveForClasses(url), new JarClassSource(url));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void nameSpaceChanged() {
        if (this.nameSourceListeners == null) {
            return;
        }
        for (int i9 = 0; i9 < this.nameSourceListeners.size(); i9++) {
            this.nameSourceListeners.get(i9).nameSourceChanged(this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void notifyListeners() {
        Iterator<WeakReference<ClassPathListener>> it = this.listeners.iterator();
        while (it.hasNext()) {
            ClassPathListener classPathListener = it.next().get();
            if (classPathListener == null) {
                it.remove();
            } else {
                classPathListener.classPathChanged();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void removeListener(ClassPathListener classPathListener) {
        Iterator<WeakReference<ClassPathListener>> it = this.listeners.iterator();
        while (it.hasNext()) {
            if (it.next().get() == classPathListener) {
                it.remove();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setClassSource(String str, ClassSource classSource) {
        this.classSource.put(str, classSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setMapsInitialized(boolean z9) {
        this.mapsInitialized = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNameCompletionIncludesUnqNames(boolean z9) {
        this.nameCompletionIncludesUnqNames = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setNameSourceListeners(List<NameSource.Listener> list) {
        this.nameSourceListeners = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setPath(URL[] urlArr) {
        reset();
        add(urlArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setUnqNameTable(UnqualifiedNameTable unqualifiedNameTable) {
        this.unqNameTable = unqualifiedNameTable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void startClassMapping() {
        MappingFeedback mappingFeedback = mappingFeedbackListener;
        if (mappingFeedback != null) {
            mappingFeedback.startClassMapping();
        } else {
            System.err.println("Start ClassPath Mapping");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "BshClassPath " + this.name + "(" + super.toString() + ") path= " + this.path + "\ncompPaths = {" + this.compPaths + " }";
    }

    public void add(URL url) {
        this.path.add(url);
        if (this.mapsInitialized) {
            map(url);
        }
    }

    public BshClassPath(String str, URL[] urlArr) {
        this(str);
        add(urlArr);
    }

    public void insureInitialized() {
        insureInitialized(true);
    }

    /* JADX DEBUG: Class process forced to load method for inline: ah.a.p(java.lang.String, java.lang.Throwable):void */
    public void map(URL[] urlArr) {
        for (int i9 = 0; i9 < urlArr.length; i9++) {
            try {
                map(urlArr[i9]);
            } catch (Exception e6) {
                errorWhileMapping("Error constructing classpath: " + urlArr[i9] + ": " + e6);
                C0086a.m457p(AbstractC0921a.m2249l(i9, "Failed to map class path "), e6);
                return;
            }
        }
    }

    private void map(String[] strArr, ClassSource classSource) {
        for (String str : strArr) {
            mapClass(str, classSource);
        }
    }
}
