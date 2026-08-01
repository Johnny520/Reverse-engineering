package bsh.classpath;

import bsh.C1234p1;
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
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import okhttp3.internal.url._UrlKt;
import p055e.AbstractC1960a;
import p181m4.C4965b;
import p376zd.C10023w;

/* JADX INFO: renamed from: bsh.classpath.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1157n implements InterfaceC1158o {

    /* JADX INFO: renamed from: k */
    public static final Pattern f3496k = Pattern.compile("[/\\\\]");

    /* JADX INFO: renamed from: l */
    public static final Pattern f3497l = Pattern.compile("^modules/[^/]+/");

    /* JADX INFO: renamed from: m */
    public static final Pattern f3498m = Pattern.compile("\\.[^\\.]+$");

    /* JADX INFO: renamed from: n */
    public static final Pattern f3499n = Pattern.compile("\\.(?=[^.]+$)");

    /* JADX INFO: renamed from: o */
    public static URL[] f3500o;

    /* JADX INFO: renamed from: p */
    public static C1157n f3501p;

    /* JADX INFO: renamed from: q */
    public static C1157n f3502q;

    /* JADX INFO: renamed from: a */
    public String f3503a;

    /* JADX INFO: renamed from: b */
    public final Set f3504b;

    /* JADX INFO: renamed from: c */
    public final Set f3505c;

    /* JADX INFO: renamed from: d */
    public final Map f3506d;

    /* JADX INFO: renamed from: e */
    public final Map f3507e;

    /* JADX INFO: renamed from: f */
    public boolean f3508f;

    /* JADX INFO: renamed from: g */
    public g f3509g;

    /* JADX INFO: renamed from: h */
    public boolean f3510h;

    /* JADX INFO: renamed from: i */
    public Vector f3511i;

    /* JADX INFO: renamed from: j */
    public List f3512j;

    /* JADX INFO: renamed from: bsh.classpath.n$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public List f3513a;

        public a(String str) {
            ArrayList arrayList = new ArrayList();
            this.f3513a = arrayList;
            arrayList.add(str);
        }

        /* JADX INFO: renamed from: a */
        public void m4258a(String str) {
            this.f3513a.add(str);
        }

        /* JADX INFO: renamed from: b */
        public List m4259b() {
            return this.f3513a;
        }
    }

    /* JADX INFO: renamed from: bsh.classpath.n$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        public Object f3514a;

        /* JADX INFO: renamed from: a */
        public abstract byte[] mo4260a(String str);
    }

    /* JADX INFO: renamed from: bsh.classpath.n$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class c extends b {
        public c(File file) {
            this.f3514a = file;
        }

        /* JADX INFO: renamed from: c */
        public static byte[] m4261c(File file, String str) {
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
            } catch (IOException e10) {
                C4965b.m20055a("Couldn't load file: ", file2, e10);
                return null;
            }
        }

        @Override // bsh.classpath.C1157n.b
        /* JADX INFO: renamed from: a */
        public byte[] mo4260a(String str) {
            return m4261c(m4262b(), str);
        }

        /* JADX INFO: renamed from: b */
        public File m4262b() {
            return (File) this.f3514a;
        }

        public String toString() {
            return "Dir: " + this.f3514a;
        }
    }

    /* JADX INFO: renamed from: bsh.classpath.n$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d extends b {
        public d(byte[] bArr) {
            this.f3514a = bArr;
        }

        @Override // bsh.classpath.C1157n.b
        /* JADX INFO: renamed from: a */
        public byte[] mo4260a(String str) {
            return (byte[]) this.f3514a;
        }
    }

    /* JADX INFO: renamed from: bsh.classpath.n$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class e extends b {
        public e(URL url) {
            this.f3514a = url;
        }

        @Override // bsh.classpath.C1157n.b
        /* JADX INFO: renamed from: a */
        public byte[] mo4260a(String str) {
            String str2 = "/" + str.replace('.', '/') + ".class";
            try {
                URLClassLoader uRLClassLoader = new URLClassLoader(new URL[]{m4263b()});
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
                } catch (Throwable th) {
                    try {
                        uRLClassLoader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | ClassNotFoundException unused) {
                return new byte[0];
            }
        }

        /* JADX INFO: renamed from: b */
        public URL m4263b() {
            return (URL) this.f3514a;
        }

        public String toString() {
            return "Jar: " + this.f3514a;
        }
    }

    /* JADX INFO: renamed from: bsh.classpath.n$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class f extends b {
        public f(URL url) {
            this.f3514a = url;
        }

        @Override // bsh.classpath.C1157n.b
        /* JADX INFO: renamed from: a */
        public byte[] mo4260a(String str) {
            try {
                DataInputStream dataInputStream = new DataInputStream((InputStream) new URL(this.f3514a + ("/" + str.replace('.', '/') + ".class")).getContent());
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

        public String toString() {
            return "Jrt: " + this.f3514a;
        }
    }

    /* JADX INFO: renamed from: bsh.classpath.n$g */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class g extends HashMap {
        private static final long serialVersionUID = 1;

        /* JADX INFO: renamed from: a */
        public void m4264a(String str) {
            String str2 = C1157n.m4219R(str)[1];
            if (super.containsKey(str2)) {
                ((a) super.get(str2)).m4258a(str);
            } else {
                super.put(str2, new a(str));
            }
        }
    }

    public C1157n(String str) {
        this.f3504b = ConcurrentHashMap.newKeySet();
        this.f3505c = ConcurrentHashMap.newKeySet();
        this.f3506d = new ConcurrentHashMap();
        this.f3507e = new ConcurrentHashMap();
        this.f3510h = true;
        this.f3511i = new Vector();
        this.f3503a = str;
        m4215L();
    }

    /* JADX INFO: renamed from: A */
    public static C1157n m4211A() {
        if (f3501p == null) {
            f3501p = new C1157n("User Class Path", m4212B());
        }
        return f3501p;
    }

    /* JADX INFO: renamed from: B */
    public static URL[] m4212B() throws C1234p1 {
        URL[] urlArr = f3500o;
        if (urlArr != null) {
            return urlArr;
        }
        String property = System.getProperty("java.class.path");
        String[] strArrSplit = property == null ? new String[0] : property.split(File.pathSeparator);
        URL[] urlArr2 = new URL[strArrSplit.length];
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            try {
                urlArr2[i10] = new File(new File(strArrSplit[i10]).getCanonicalPath()).toURI().toURL();
            } catch (IOException e10) {
                throw new C1234p1("can't parse class path: " + e10, e10);
            }
        }
        f3500o = urlArr2;
        return urlArr2;
    }

    /* JADX INFO: renamed from: E */
    public static boolean m4213E(String str) {
        String lowerCase = str.toLowerCase();
        return lowerCase.endsWith(".jar") || lowerCase.endsWith(".zip") || lowerCase.endsWith(".jmod");
    }

    /* JADX INFO: renamed from: F */
    public static boolean m4214F(String str) {
        return str.toLowerCase().endsWith(".class");
    }

    /* JADX INFO: renamed from: L */
    private void m4215L() {
        this.f3504b.clear();
        this.f3505c.clear();
        m4249p();
    }

    /* JADX INFO: renamed from: M */
    public static String[] m4216M(URL url) throws IOException {
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(url.openStream());
        while (zipInputStream.available() == 1) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null && m4214F(nextEntry.getName())) {
                arrayList.add(m4230n(nextEntry.getName()));
            }
        }
        zipInputStream.close();
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* JADX INFO: renamed from: N */
    public static String[] m4217N(URL url) throws Exception {
        try {
            try {
                FileSystems.newFileSystem(url.toURI(), new HashMap());
            } catch (URISyntaxException unused) {
                return new String[0];
            }
        } catch (FileSystemAlreadyExistsException unused2) {
        }
        try {
            Stream<Path> streamWalk = Files.walk(FileSystems.getFileSystem(url.toURI()).getPath("/", new String[0]), new FileVisitOption[0]);
            try {
                String[] strArr = (String[]) streamWalk.map(new C1151h()).filter(new C1152i()).map(new C1153j()).toArray(new IntFunction() { // from class: bsh.classpath.c
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i10) {
                        return C1157n.m4225d(i10);
                    }
                });
                streamWalk.close();
                return strArr;
            } finally {
            }
        } catch (Exception e10) {
            throw e10;
        }
    }

    /* JADX INFO: renamed from: O */
    public static String[] m4218O(URL url) throws Exception {
        try {
            try {
                Stream<Path> streamWalk = Files.walk(FileSystems.getFileSystem(new URI("jrt:/")).getPath("modules", url.getPath()), new FileVisitOption[0]);
                try {
                    String[] strArr = (String[]) streamWalk.map(new C1151h()).filter(new C1152i()).map(new C1153j()).toArray(new IntFunction() { // from class: bsh.classpath.k
                        @Override // java.util.function.IntFunction
                        public final Object apply(int i10) {
                            return C1157n.m4228g(i10);
                        }
                    });
                    streamWalk.close();
                    return strArr;
                } finally {
                }
            } catch (Exception e10) {
                throw e10;
            }
        } catch (URISyntaxException unused) {
            return new String[0];
        }
    }

    /* JADX INFO: renamed from: R */
    public static String[] m4219R(String str) {
        String strM4230n = m4230n(str);
        return strM4230n.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM4230n} : f3499n.split(strM4230n);
    }

    /* JADX INFO: renamed from: T */
    public static String[] m4220T(File file) throws IOException {
        List listM4221U = m4221U(file, file);
        return (String[]) listM4221U.toArray(new String[listM4221U.size()]);
    }

    /* JADX INFO: renamed from: U */
    public static List m4221U(File file, File file2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String absolutePath = file.getAbsolutePath();
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isDirectory()) {
                arrayList.addAll(m4221U(file, file3));
            } else {
                String absolutePath2 = file3.getAbsolutePath();
                if (!m4214F(absolutePath2)) {
                    continue;
                } else {
                    if (!absolutePath2.startsWith(absolutePath)) {
                        C10023w.m38841a("problem parsing paths");
                        return null;
                    }
                    arrayList.add(m4230n(absolutePath2.substring(absolutePath.length() + 1)));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4222a(List list, C1157n c1157n) {
        for (URL url : c1157n.m4255w()) {
            if (!list.contains(url)) {
                list.add(url);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ String[] m4225d(int i10) {
        return new String[i10];
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m4227f(String str, Set set, C1157n c1157n) {
        Set setM4254v = c1157n.m4254v(str);
        if (setM4254v != null) {
            set.addAll(setM4254v);
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ String[] m4228g(int i10) {
        return new String[i10];
    }

    /* JADX INFO: renamed from: n */
    public static String m4230n(String str) {
        if (str.startsWith("modules/")) {
            str = f3497l.matcher(str).replaceFirst(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        if (str.indexOf(47) >= 0 || str.indexOf(92) >= 0) {
            str = f3496k.matcher(str).replaceAll(".");
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
        return str.endsWith(".class") ? f3498m.matcher(str).replaceFirst(_UrlKt.FRAGMENT_ENCODE_SET) : str;
    }

    /* JADX INFO: renamed from: s */
    public static C1157n m4231s() throws C1234p1 {
        if (f3502q == null) {
            try {
                f3502q = new C1157n("Boot Class Path", new URL[]{m4232y()});
            } catch (MalformedURLException e10) {
                throw new C1234p1(" can't find boot jar: " + e10, e10);
            }
        }
        return f3502q;
    }

    /* JADX INFO: renamed from: y */
    public static URL m4232y() {
        String externalForm = Class.class.getResource("/java/lang/String.class").toExternalForm();
        return externalForm.startsWith("jrt:/") ? new URL(externalForm.substring(0, externalForm.indexOf(47, 5))) : new URL(externalForm.replaceFirst("[^!]*$", "/"));
    }

    /* JADX INFO: renamed from: C */
    public void m4233C() {
        m4234D(true);
    }

    /* JADX INFO: renamed from: D */
    public void m4234D(boolean z10) {
        if (z10 && !this.f3508f) {
            m4242S();
        }
        this.f3505c.forEach(new Consumer() { // from class: bsh.classpath.g
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((C1157n) obj).m4234D(false);
            }
        });
        if (!this.f3508f) {
            m4237I((URL[]) this.f3504b.toArray(new URL[0]));
        }
        if (z10 && !this.f3508f) {
            m4250q();
        }
        this.f3508f = true;
    }

    /* JADX INFO: renamed from: G */
    public void m4235G(URL url) {
        if ("jrt".equals(url.getProtocol())) {
            m4248o("FileSystem: " + url);
            m4236H(m4218O(url), new f(url));
            return;
        }
        if ("jar".equals(url.getProtocol())) {
            m4248o("FileSystem: " + url);
            m4236H(m4217N(url), new e(url));
            return;
        }
        String file = url.getFile();
        File file2 = new File(file);
        if (file2.isDirectory()) {
            m4248o("Directory " + file2.toString());
            m4236H(m4220T(file2), new c(file2));
            return;
        }
        if (!m4213E(file)) {
            m4251r("Not a classpath component: " + file);
        } else {
            m4248o("Archive: " + url);
            m4236H(m4216M(url), new e(url));
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m4236H(String[] strArr, b bVar) {
        for (String str : strArr) {
            m4238J(str, bVar);
        }
    }

    /* JADX INFO: renamed from: I */
    public void m4237I(URL[] urlArr) {
        for (int i10 = 0; i10 < urlArr.length; i10++) {
            try {
                m4235G(urlArr[i10]);
            } catch (Exception e10) {
                m4251r("Error constructing classpath: " + urlArr[i10] + ": " + e10);
                throw new RuntimeException("Failed to map class path " + i10, e10);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m4238J(String str, b bVar) {
        String str2 = m4219R(str)[0];
        Set hashSet = (Set) this.f3506d.get(str2);
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f3506d.put(str2, hashSet);
        }
        hashSet.add(str);
        if (this.f3507e.get(str) == null) {
            this.f3507e.put(str, bVar);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m4239K() {
        List list = this.f3512j;
        if (list != null && list.size() > 0) {
            AbstractC1960a.m7104a(this.f3512j.get(0));
            throw null;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m4240P(String str, b bVar) {
        this.f3507e.put(str, bVar);
    }

    /* JADX INFO: renamed from: Q */
    public void m4241Q(URL[] urlArr) {
        m4215L();
        m4244j(urlArr);
    }

    /* JADX INFO: renamed from: S */
    public void m4242S() {
        System.err.println("Start ClassPath Mapping");
    }

    /* JADX INFO: renamed from: i */
    public void m4243i(URL url) {
        this.f3504b.add(url);
        if (this.f3508f) {
            m4235G(url);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m4244j(URL[] urlArr) {
        this.f3504b.addAll(Arrays.asList(urlArr));
        if (this.f3508f) {
            m4237I(urlArr);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m4245k(C1157n c1157n) {
        if (c1157n == null) {
            return;
        }
        this.f3505c.add(c1157n);
        c1157n.m4246l(this);
    }

    /* JADX INFO: renamed from: l */
    public void m4246l(InterfaceC1158o interfaceC1158o) {
        this.f3511i.addElement(new WeakReference(interfaceC1158o));
    }

    /* JADX INFO: renamed from: m */
    public final g m4247m() {
        final g gVar = new g();
        this.f3505c.forEach(new Consumer() { // from class: bsh.classpath.l
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((C1157n) obj).f3507e.keySet().forEach(new Consumer() { // from class: bsh.classpath.d
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        gVar.m4264a((String) obj2);
                    }
                });
            }
        });
        this.f3507e.keySet().forEach(new Consumer() { // from class: bsh.classpath.m
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                gVar.m4264a((String) obj);
            }
        });
        return gVar;
    }

    /* JADX INFO: renamed from: o */
    public void m4248o(String str) {
        System.err.println("Mapping: " + str);
    }

    /* JADX INFO: renamed from: p */
    public final void m4249p() {
        this.f3508f = false;
        this.f3506d.clear();
        this.f3507e.clear();
        this.f3509g = null;
        m4239K();
    }

    /* JADX INFO: renamed from: q */
    public void m4250q() {
        System.err.println("End ClassPath Mapping");
    }

    /* JADX INFO: renamed from: r */
    public void m4251r(String str) {
        System.err.println(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public String m4252t(String str) throws C1234p1 {
        m4233C();
        a aVar = (a) m4257z().get(str);
        if (aVar == null) {
            return null;
        }
        List listM4259b = aVar.m4259b();
        if (listM4259b.size() == 1) {
            return (String) listM4259b.get(0);
        }
        throw new C1234p1("Ambiguous class names: " + listM4259b);
    }

    public String toString() {
        return "BshClassPath " + this.f3503a + "(" + super.toString() + ") path= " + this.f3504b + "\ncompPaths = {" + this.f3505c + " }";
    }

    /* JADX INFO: renamed from: u */
    public b m4253u(String str) {
        b bVar = (b) this.f3507e.get(str);
        if (bVar != null) {
            return bVar;
        }
        m4233C();
        Iterator it = this.f3505c.iterator();
        b bVarM4253u = (b) this.f3507e.get(str);
        while (bVarM4253u == null && it.hasNext()) {
            bVarM4253u = ((C1157n) it.next()).m4253u(str);
        }
        return bVarM4253u;
    }

    /* JADX INFO: renamed from: v */
    public Set m4254v(final String str) {
        m4233C();
        final HashSet hashSet = new HashSet();
        Collection collection = (Collection) this.f3506d.get(str);
        if (collection != null) {
            hashSet.addAll(collection);
        }
        this.f3505c.forEach(new Consumer() { // from class: bsh.classpath.f
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C1157n.m4227f(str, hashSet, (C1157n) obj);
            }
        });
        return hashSet;
    }

    /* JADX INFO: renamed from: w */
    public List m4255w() {
        final ArrayList arrayList = new ArrayList();
        this.f3505c.forEach(new Consumer() { // from class: bsh.classpath.e
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C1157n.m4222a(arrayList, (C1157n) obj);
            }
        });
        arrayList.addAll(this.f3504b);
        return arrayList;
    }

    /* JADX INFO: renamed from: x */
    public URL[] m4256x() {
        return (URL[]) m4255w().toArray(new URL[0]);
    }

    /* JADX INFO: renamed from: z */
    public final g m4257z() {
        if (this.f3509g == null) {
            this.f3509g = m4247m();
        }
        return this.f3509g;
    }

    public C1157n(String str, URL[] urlArr) {
        this(str);
        m4244j(urlArr);
    }
}
