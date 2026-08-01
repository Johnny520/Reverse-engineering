package bsh.classpath;

import androidx.collection.C1123;
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
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: bsh.classpath.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3443 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static C3443 f8149;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static URL[] f8150;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static C3443 f8151;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f8156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final ConcurrentHashMap f8157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final ConcurrentHashMap f8158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f8159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f8160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f8161;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Vector f8162;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public BshClassPath$UnqualifiedNameTable f8163;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final Pattern f8154 = Pattern.compile("[/\\\\]");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final Pattern f8155 = Pattern.compile("^modules/[^/]+/");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Pattern f8152 = Pattern.compile("\\.[^\\.]+$");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Pattern f8153 = Pattern.compile("\\.(?=[^.]+$)");

    public C3443(String str) {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        this.f8160 = keySetViewNewKeySet;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet2 = ConcurrentHashMap.newKeySet();
        this.f8159 = keySetViewNewKeySet2;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f8158 = concurrentHashMap;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.f8157 = concurrentHashMap2;
        this.f8162 = new Vector();
        this.f8161 = str;
        keySetViewNewKeySet.clear();
        keySetViewNewKeySet2.clear();
        this.f8156 = false;
        concurrentHashMap.clear();
        concurrentHashMap2.clear();
        this.f8163 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static URL m5705() {
        String externalForm = Class.class.getResource("/java/lang/String.class").toExternalForm();
        return externalForm.startsWith("jrt:/") ? new URL(externalForm.substring(0, externalForm.indexOf(47, 5))) : new URL(externalForm.replaceFirst("[^!]*$", "/"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static C3443 m5706() throws ClassPathException {
        if (f8151 == null) {
            try {
                f8151 = new C3443("Boot Class Path", new URL[]{m5705()});
            } catch (MalformedURLException e) {
                throw new ClassPathException(" can't find boot jar: " + e, e);
            }
        }
        return f8151;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static void m5707(String str) {
        System.err.println("Mapping: ".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String m5708(String str) {
        if (str.startsWith("modules/")) {
            str = f8155.matcher(str).replaceFirst("");
        }
        if (str.indexOf(47) >= 0 || str.indexOf(92) >= 0) {
            str = f8154.matcher(str).replaceAll(".");
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
        return str.endsWith(ClassFileLocator.CLASS_FILE_EXTENSION) ? f8152.matcher(str).replaceFirst("") : str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C3443 m5709() throws ClassPathException {
        if (f8149 == null) {
            URL[] urlArr = f8150;
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
                f8150 = urlArr2;
                urlArr = urlArr2;
            }
            f8149 = new C3443("User Class Path", urlArr);
        }
        return f8149;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static ArrayList m5710(File file, File file2) throws IOException {
        ArrayList arrayList = new ArrayList();
        String absolutePath = file.getAbsolutePath();
        File[] fileArrListFiles = file2.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file3 : fileArrListFiles) {
            if (file3.isDirectory()) {
                arrayList.addAll(m5710(file, file3));
            } else {
                String absolutePath2 = file3.getAbsolutePath();
                if (!absolutePath2.toLowerCase().endsWith(ClassFileLocator.CLASS_FILE_EXTENSION)) {
                    continue;
                } else {
                    if (!absolutePath2.startsWith(absolutePath)) {
                        C6755.m11866("problem parsing paths");
                        return null;
                    }
                    arrayList.add(m5708(absolutePath2.substring(absolutePath.length() + 1)));
                }
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "BshClassPath " + this.f8161 + "(" + super.toString() + ") path= " + this.f8160 + "\ncompPaths = {" + this.f8159 + " }";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3441 m5711(String str) {
        ConcurrentHashMap concurrentHashMap = this.f8157;
        AbstractC3441 abstractC3441 = (AbstractC3441) concurrentHashMap.get(str);
        if (abstractC3441 != null) {
            return abstractC3441;
        }
        m5713(true);
        Iterator it = this.f8159.iterator();
        AbstractC3441 abstractC3441M5711 = (AbstractC3441) concurrentHashMap.get(str);
        while (abstractC3441M5711 == null && it.hasNext()) {
            abstractC3441M5711 = ((C3443) it.next()).m5711(str);
        }
        return abstractC3441M5711;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m5712(C3443 c3443) {
        if (c3443 == null) {
            return;
        }
        this.f8159.add(c3443);
        c3443.f8162.addElement(new WeakReference(this));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m5713(boolean z) {
        if (z && !this.f8156) {
            System.err.println("Start ClassPath Mapping");
        }
        this.f8159.forEach(new C3438(0));
        if (!this.f8156) {
            m5714((URL[]) this.f8160.toArray(new URL[0]));
        }
        if (z && !this.f8156) {
            System.err.println("End ClassPath Mapping");
        }
        this.f8156 = true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m5714(URL[] urlArr) {
        for (int i = 0; i < urlArr.length; i++) {
            try {
                m5715(urlArr[i]);
            } catch (Exception e) {
                System.err.println("Error constructing classpath: " + urlArr[i] + ": " + e);
                C1123.m1408(AbstractC7012.m12147(i, "Failed to map class path "), e);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void m5715(URL url) throws Exception {
        String[] strArr;
        Stream<Path> streamWalk;
        String[] strArr2;
        int i = 0;
        if ("jrt".equals(url.getProtocol())) {
            m5707("FileSystem: " + url);
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
                strArr2 = (String[]) streamWalk.map(new C3437(0)).filter(new C3436(i)).map(new C3437(1)).toArray(new C3435(0));
                streamWalk.close();
                C3445 c3445 = new C3445(2);
                c3445.f8147 = url;
                m5716(strArr2, c3445);
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
            m5707("FileSystem: " + url);
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
                    strArr = (String[]) streamWalk.map(new C3437(0)).filter(new C3436(i)).map(new C3437(1)).toArray(new C3435(1));
                    streamWalk.close();
                    m5716(strArr, new C3446(url));
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
            m5707("Directory " + file2.toString());
            ArrayList arrayListM5710 = m5710(file2, file2);
            String[] strArr3 = (String[]) arrayListM5710.toArray(new String[arrayListM5710.size()]);
            C3445 c34452 = new C3445(0);
            c34452.f8147 = file2;
            m5716(strArr3, c34452);
            return;
        }
        String lowerCase = file.toLowerCase();
        if (!lowerCase.endsWith(".jar") && !lowerCase.endsWith(".zip") && !lowerCase.endsWith(".jmod")) {
            System.err.println("Not a classpath component: ".concat(file));
            return;
        }
        m5707("Archive: " + url);
        ArrayList arrayList = new ArrayList();
        ZipInputStream zipInputStream = new ZipInputStream(url.openStream());
        while (zipInputStream.available() == 1) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null && nextEntry.getName().toLowerCase().endsWith(ClassFileLocator.CLASS_FILE_EXTENSION)) {
                arrayList.add(m5708(nextEntry.getName()));
            }
        }
        zipInputStream.close();
        m5716((String[]) arrayList.toArray(new String[arrayList.size()]), new C3446(url));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m5716(String[] strArr, AbstractC3441 abstractC3441) {
        for (String str : strArr) {
            String strM5708 = m5708(str);
            String str2 = (strM5708.indexOf(46) == -1 ? new String[]{"<unpackaged>", strM5708} : f8153.split(strM5708))[0];
            ConcurrentHashMap concurrentHashMap = this.f8158;
            Set hashSet = (Set) concurrentHashMap.get(str2);
            if (hashSet == null) {
                hashSet = new HashSet();
                concurrentHashMap.put(str2, hashSet);
            }
            hashSet.add(str);
            ConcurrentHashMap concurrentHashMap2 = this.f8157;
            if (concurrentHashMap2.get(str) == null) {
                concurrentHashMap2.put(str, abstractC3441);
            }
        }
    }

    public C3443(String str, URL[] urlArr) {
        this(str);
        this.f8160.addAll(Arrays.asList(urlArr));
        if (this.f8156) {
            m5714(urlArr);
        }
    }
}
