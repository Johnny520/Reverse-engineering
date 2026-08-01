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
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2610 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C2610 f7804;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static URL[] f7805;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static C2610 f7806;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f7811;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ConcurrentHashMap f7812;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ConcurrentHashMap f7813;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f7814;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f7815;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f7816;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Vector f7817;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public BshClassPath$UnqualifiedNameTable f7818;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final Pattern f7809 = Pattern.compile("[/\\\\]");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Pattern f7810 = Pattern.compile("^modules/[^/]+/");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Pattern f7807 = Pattern.compile("\\.[^\\.]+$");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Pattern f7808 = Pattern.compile("\\.(?=[^.]+$)");

    public C2610(String str) {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        this.f7815 = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        this.f7814 = keySetViewNewKeySet2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f7813 = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.f7812 = concurrentHashMap2;
        this.f7817 = new Vector();
        this.f7816 = str;
        keySetViewNewKeySet.clear();
        keySetViewNewKeySet2.clear();
        this.f7811 = false;
        concurrentHashMap.clear();
        concurrentHashMap2.clear();
        this.f7818 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static URL m5145() {
        String externalForm = Class.class.getResource("/java/lang/String.class").toExternalForm();
        return externalForm.startsWith("jrt:/") ? new URL(externalForm.substring(0, externalForm.indexOf(47, 5))) : new URL(externalForm.replaceFirst("[^!]*$", "/"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C2610 m5146() throws ClassPathException {
        if (f7806 == null) {
            try {
                f7806 = new C2610("Boot Class Path", new URL[]{m5145()});
            } catch (MalformedURLException e) {
                throw new ClassPathException(" can't find boot jar: " + e, e);
            }
        }
        return f7806;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m5147(String str) {
        System.err.println("Mapping: ".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m5148(String str) {
        if (str.startsWith("modules/")) {
            str = f7810.matcher(str).replaceFirst("");
        }
        if (str.indexOf(47) >= 0 || str.indexOf(92) >= 0) {
            str = f7809.matcher(str).replaceAll(".");
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
        return str.endsWith(ClassFileLocator.CLASS_FILE_EXTENSION) ? f7807.matcher(str).replaceFirst("") : str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C2610 m5149() throws ClassPathException {
        if (f7804 == null) {
            URL[] urlArr = f7805;
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
                f7805 = urlArr2;
                urlArr = urlArr2;
            }
            f7804 = new C2610("User Class Path", urlArr);
        }
        return f7804;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static ArrayList m5150(File file, File file2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String absolutePath = file.getAbsolutePath();
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isDirectory()) {
                arrayList.addAll(m5150(file, file3));
            } else {
                String absolutePath2 = file3.getAbsolutePath();
                if (!absolutePath2.toLowerCase().endsWith(ClassFileLocator.CLASS_FILE_EXTENSION)) {
                    continue;
                } else {
                    if (!absolutePath2.startsWith(absolutePath)) {
                        C5925.m11307("problem parsing paths");
                        return null;
                    }
                    arrayList.add(m5148(absolutePath2.substring(absolutePath.length() + 1)));
                }
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "BshClassPath " + this.f7816 + "(" + super.toString() + ") path= " + this.f7815 + "\ncompPaths = {" + this.f7814 + " }";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2608 m5151(String str) {
        ConcurrentHashMap concurrentHashMap = this.f7812;
        AbstractC2608 abstractC2608 = (AbstractC2608) concurrentHashMap.get(str);
        if (abstractC2608 != null) {
            return abstractC2608;
        }
        m5153(true);
        Iterator it = this.f7814.iterator();
        AbstractC2608 abstractC2608M5151 = (AbstractC2608) concurrentHashMap.get(str);
        while (abstractC2608M5151 == null && it.hasNext()) {
            abstractC2608M5151 = ((C2610) it.next()).m5151(str);
        }
        return abstractC2608M5151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5152(C2610 c2610) {
        if (c2610 == null) {
            return;
        }
        this.f7814.add(c2610);
        c2610.f7817.addElement(new WeakReference(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m5153(boolean z) {
        if (z && !this.f7811) {
            System.err.println("Start ClassPath Mapping");
        }
        this.f7814.forEach(new C2605(0));
        if (!this.f7811) {
            m5154((URL[]) this.f7815.toArray(new URL[0]));
        }
        if (z && !this.f7811) {
            System.err.println("End ClassPath Mapping");
        }
        this.f7811 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m5154(URL[] urlArr) {
        for (int i = 0; i < urlArr.length; i++) {
            try {
                m5155(urlArr[i]);
            } catch (Exception e) {
                System.err.println("Error constructing classpath: " + urlArr[i] + ": " + e);
                C0276.m848(AbstractC6183.m11588(i, "Failed to map class path "), e);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5155(URL url) throws Exception {
        String[] strArr;
        Stream<Path> streamWalk;
        String[] strArr2;
        int i = 0;
        if ("jrt".equals(url.getProtocol())) {
            m5147("FileSystem: " + url);
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
                strArr2 = (String[]) streamWalk.map(new C2604(0)).filter(new C2603(i)).map(new C2604(1)).toArray(new C2602(0));
                streamWalk.close();
                C2612 c2612 = new C2612(2);
                c2612.f7802 = url;
                m5156(strArr2, c2612);
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
            m5147("FileSystem: " + url);
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
                    strArr = (String[]) streamWalk.map(new C2604(0)).filter(new C2603(i)).map(new C2604(1)).toArray(new C2602(1));
                    streamWalk.close();
                    m5156(strArr, new C2613(url));
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
            m5147("Directory " + file2.toString());
            ArrayList arrayListM5150 = m5150(file2, file2);
            String[] strArr3 = (String[]) arrayListM5150.toArray(new String[arrayListM5150.size()]);
            C2612 c26122 = new C2612(0);
            c26122.f7802 = file2;
            m5156(strArr3, c26122);
            return;
        }
        String lowerCase = file.toLowerCase();
        if (!lowerCase.endsWith(".jar") && !lowerCase.endsWith(".zip") && !lowerCase.endsWith(".jmod")) {
            System.err.println("Not a classpath component: ".concat(file));
            return;
        }
        m5147("Archive: " + url);
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(url.openStream());
        while (zipInputStream.available() == 1) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null && nextEntry.getName().toLowerCase().endsWith(ClassFileLocator.CLASS_FILE_EXTENSION)) {
                arrayList.add(m5148(nextEntry.getName()));
            }
        }
        zipInputStream.close();
        m5156((String[]) arrayList.toArray(new String[arrayList.size()]), new C2613(url));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m5156(String[] strArr, AbstractC2608 abstractC2608) {
        for (String str : strArr) {
            String strM5148 = m5148(str);
            String str2 = (strM5148.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM5148} : f7808.split(strM5148))[0];
            ConcurrentHashMap concurrentHashMap = this.f7813;
            Set hashSet = (Set) concurrentHashMap.get(str2);
            if (hashSet == null) {
                hashSet = new HashSet();
                concurrentHashMap.put(str2, hashSet);
            }
            hashSet.add(str);
            ConcurrentHashMap concurrentHashMap2 = this.f7812;
            if (concurrentHashMap2.get(str) == null) {
                concurrentHashMap2.put(str, abstractC2608);
            }
        }
    }

    public C2610(String str, URL[] urlArr) {
        this(str);
        this.f7815.addAll(Arrays.asList(urlArr));
        if (this.f7811) {
            m5154(urlArr);
        }
    }
}
