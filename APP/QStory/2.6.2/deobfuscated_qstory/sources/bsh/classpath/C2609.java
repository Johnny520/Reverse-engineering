package bsh.classpath;

import androidx.collection.C0276;
import bsh.ClassPathException;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import net.bytebuddy.dynamic.ClassFileLocator;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2609 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C2609 f7802;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static URL[] f7803;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static C2609 f7804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7809;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ConcurrentHashMap f7810;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ConcurrentHashMap f7811;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f7812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f7813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f7814;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Vector f7815;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public BshClassPath$UnqualifiedNameTable f7816;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final Pattern f7807 = Pattern.compile("[/\\\\]");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Pattern f7808 = Pattern.compile("^modules/[^/]+/");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Pattern f7805 = Pattern.compile("\\.[^\\.]+$");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Pattern f7806 = Pattern.compile("\\.(?=[^.]+$)");

    public C2609(String str) {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        this.f7813 = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        this.f7812 = keySetViewNewKeySet2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f7811 = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.f7810 = concurrentHashMap2;
        this.f7815 = new Vector();
        this.f7814 = str;
        keySetViewNewKeySet.clear();
        keySetViewNewKeySet2.clear();
        this.f7809 = false;
        concurrentHashMap.clear();
        concurrentHashMap2.clear();
        this.f7816 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static URL m5100() {
        String externalForm = Class.class.getResource("/java/lang/String.class").toExternalForm();
        return externalForm.startsWith("jrt:/") ? new URL(externalForm.substring(0, externalForm.indexOf(47, 5))) : new URL(externalForm.replaceFirst("[^!]*$", "/"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C2609 m5101() throws ClassPathException {
        if (f7804 == null) {
            try {
                f7804 = new C2609("Boot Class Path", new URL[]{m5100()});
            } catch (MalformedURLException e) {
                throw new ClassPathException(" can't find boot jar: " + e, e);
            }
        }
        return f7804;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m5102(String str) {
        System.err.println("Mapping: ".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m5103(String str) {
        if (str.startsWith("modules/")) {
            str = f7808.matcher(str).replaceFirst("");
        }
        if (str.indexOf(47) >= 0 || str.indexOf(92) >= 0) {
            str = f7807.matcher(str).replaceAll(".");
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
        return str.endsWith(ClassFileLocator.CLASS_FILE_EXTENSION) ? f7805.matcher(str).replaceFirst("") : str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C2609 m5104() throws ClassPathException {
        if (f7802 == null) {
            URL[] urlArr = f7803;
            if (urlArr == null) {
                String property = System.getProperty("java.class.path");
                String[] strArrSplit = property == null ? new String[0] : property.split(File.pathSeparator);
                URL[] urlArr2 = new URL[strArrSplit.length];
                for (int i = 0; i < strArrSplit.length; i++) {
                    try {
                        urlArr2[i] = new File(new File(strArrSplit[i]).getCanonicalPath()).toURI().toURL();
                    } catch (IOException e) {
                        throw new ClassPathException("can't parse class path: " + e, e);
                    }
                }
                f7803 = urlArr2;
                urlArr = urlArr2;
            }
            f7802 = new C2609("User Class Path", urlArr);
        }
        return f7802;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static ArrayList m5105(File file, File file2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String absolutePath = file.getAbsolutePath();
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isDirectory()) {
                arrayList.addAll(m5105(file, file3));
            } else {
                String absolutePath2 = file3.getAbsolutePath();
                if (!absolutePath2.toLowerCase().endsWith(ClassFileLocator.CLASS_FILE_EXTENSION)) {
                    continue;
                } else {
                    if (!absolutePath2.startsWith(absolutePath)) {
                        C5919.m11246("problem parsing paths");
                        return null;
                    }
                    arrayList.add(m5103(absolutePath2.substring(absolutePath.length() + 1)));
                }
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "BshClassPath " + this.f7814 + "(" + super.toString() + ") path= " + this.f7813 + "\ncompPaths = {" + this.f7812 + " }";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2607 m5106(String str) {
        ConcurrentHashMap concurrentHashMap = this.f7810;
        AbstractC2607 abstractC2607 = (AbstractC2607) concurrentHashMap.get(str);
        if (abstractC2607 != null) {
            return abstractC2607;
        }
        m5108(true);
        Iterator it = this.f7812.iterator();
        AbstractC2607 abstractC2607M5106 = (AbstractC2607) concurrentHashMap.get(str);
        while (abstractC2607M5106 == null && it.hasNext()) {
            abstractC2607M5106 = ((C2609) it.next()).m5106(str);
        }
        return abstractC2607M5106;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5107(C2609 c2609) {
        if (c2609 == null) {
            return;
        }
        this.f7812.add(c2609);
        c2609.f7815.addElement(new WeakReference(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m5108(boolean z) {
        if (z && !this.f7809) {
            System.err.println("Start ClassPath Mapping");
        }
        this.f7812.forEach(new C2604(0));
        if (!this.f7809) {
            m5109((URL[]) this.f7813.toArray(new URL[0]));
        }
        if (z && !this.f7809) {
            System.err.println("End ClassPath Mapping");
        }
        this.f7809 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m5109(URL[] urlArr) {
        for (int i = 0; i < urlArr.length; i++) {
            try {
                m5110(urlArr[i]);
            } catch (Exception e) {
                System.err.println("Error constructing classpath: " + urlArr[i] + ": " + e);
                C0276.m847(AbstractC6136.m11556(i, "Failed to map class path "), e);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5110(URL url) throws Exception {
        String[] strArr;
        Stream<Path> streamWalk;
        String[] strArr2;
        int i = 0;
        if ("jrt".equals(url.getProtocol())) {
            m5102("FileSystem: " + url);
            try {
                try {
                    streamWalk = Files.walk(FileSystems.getFileSystem(new URI("jrt:/")).getPath("modules", url.getPath()), new FileVisitOption[0]);
                } catch (Exception e) {
                    throw e;
                }
            } catch (URISyntaxException unused) {
                strArr2 = new String[0];
            }
            try {
                strArr2 = (String[]) streamWalk.map(new C2603(0)).filter(new C2602(i)).map(new C2603(1)).toArray(new C2601(0));
                streamWalk.close();
                C2611 c2611 = new C2611(2);
                c2611.f7800 = url;
                m5111(strArr2, c2611);
                return;
            } finally {
                if (streamWalk != null) {
                    try {
                        streamWalk.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        }
        if ("jar".equals(url.getProtocol())) {
            m5102("FileSystem: " + url);
            try {
                try {
                    FileSystems.newFileSystem(url.toURI(), new HashMap());
                } catch (URISyntaxException unused2) {
                    strArr = new String[0];
                }
            } catch (FileSystemAlreadyExistsException unused3) {
            }
            try {
                streamWalk = Files.walk(FileSystems.getFileSystem(url.toURI()).getPath("/", new String[0]), new FileVisitOption[0]);
                try {
                    strArr = (String[]) streamWalk.map(new C2603(0)).filter(new C2602(i)).map(new C2603(1)).toArray(new C2601(1));
                    streamWalk.close();
                    m5111(strArr, new C2612(url));
                    return;
                } finally {
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        String file = url.getFile();
        File file2 = new File(file);
        if (file2.isDirectory()) {
            m5102("Directory " + file2.toString());
            ArrayList arrayListM5105 = m5105(file2, file2);
            String[] strArr3 = (String[]) arrayListM5105.toArray(new String[arrayListM5105.size()]);
            C2611 c26112 = new C2611(0);
            c26112.f7800 = file2;
            m5111(strArr3, c26112);
            return;
        }
        String lowerCase = file.toLowerCase();
        if (!lowerCase.endsWith(".jar") && !lowerCase.endsWith(".zip") && !lowerCase.endsWith(".jmod")) {
            System.err.println("Not a classpath component: ".concat(file));
            return;
        }
        m5102("Archive: " + url);
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(url.openStream());
        while (zipInputStream.available() == 1) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null && nextEntry.getName().toLowerCase().endsWith(ClassFileLocator.CLASS_FILE_EXTENSION)) {
                arrayList.add(m5103(nextEntry.getName()));
            }
        }
        zipInputStream.close();
        m5111((String[]) arrayList.toArray(new String[arrayList.size()]), new C2612(url));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m5111(String[] strArr, AbstractC2607 abstractC2607) {
        for (String str : strArr) {
            String strM5103 = m5103(str);
            String str2 = (strM5103.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM5103} : f7806.split(strM5103))[0];
            ConcurrentHashMap concurrentHashMap = this.f7811;
            Set hashSet = (Set) concurrentHashMap.get(str2);
            if (hashSet == null) {
                hashSet = new HashSet();
                concurrentHashMap.put(str2, hashSet);
            }
            hashSet.add(str);
            ConcurrentHashMap concurrentHashMap2 = this.f7810;
            if (concurrentHashMap2.get(str) == null) {
                concurrentHashMap2.put(str, abstractC2607);
            }
        }
    }

    public C2609(String str, URL[] urlArr) {
        this(str);
        this.f7813.addAll(Arrays.asList(urlArr));
        if (this.f7809) {
            m5109(urlArr);
        }
    }
}
