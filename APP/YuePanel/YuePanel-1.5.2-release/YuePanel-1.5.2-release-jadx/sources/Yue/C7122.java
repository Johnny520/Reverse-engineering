package Yue;

import Yue.C6618;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۡۦۦۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n766#2:211\n857#2,2:212\n1549#2:214\n1620#2,3:215\n766#2:218\n857#2,2:219\n1549#2:221\n1620#2,3:222\n1603#2,9:225\n1855#2:234\n1856#2:236\n1612#2:237\n1603#2,9:238\n1855#2:247\n1856#2:249\n1612#2:250\n1#3:235\n1#3:248\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n74#1:211\n74#1:212,2\n75#1:214\n75#1:215,3\n90#1:218\n90#1:219,2\n91#1:221\n91#1:222,3\n173#1:225,9\n173#1:234\n173#1:236\n173#1:237\n174#1:238,9\n174#1:247\n174#1:249\n174#1:250\n173#1:235\n174#1:248\n*E\n"})
public final class C7122 extends AbstractC4819 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1177 f21483 = new C1177(null);

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C6618 f21484 = C6618.C1032.m21047(C6618.f16986, "/", false, 1, null);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final ClassLoader f21485;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final AbstractC4819 f21486;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5684 f21487;

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۡ$ۥ */
    public static final class C1177 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۡۦۦۡ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1177(C4335 c4335) {
            this();
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final C6618 m3409() {
            return C7122.f21484;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final boolean m22243(C6618 c6618) {
            return !C7627.m23972(c6618.m21032(), ".class", true);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C6618 m22244(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) {
            C5499.m17103(c6618, "<this>");
            C5499.m17103(c66182, "base");
            return m3409().m21041(C7627.m23997(C7628.m24094(c6618.toString(), c66182.toString()), '\\', '/', false, 4, null));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1177() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۡ$ۥ۟ */
    public static final class C1178 extends AbstractC5673 implements InterfaceC5122<List<? extends C6599<? extends AbstractC4819, ? extends C6618>>> {
        public C1178() {
            super(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
        /* JADX DEBUG: Return type fixed from 'java.util.List<Yue.ۥۣۡۦ۠<Yue.ۥ۠ۡۨۤ, Yue.ۥۣۡۧۧ>>' to match base method */
        @Override // Yue.InterfaceC5122
        @InterfaceC6399
        public final List<? extends C6599<? extends AbstractC4819, ? extends C6618>> invoke() {
            C7122 c7122 = C7122.this;
            return c7122.m22239(c7122.f21485);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۦۦۡ$ۥ۟۟, reason: contains not printable characters */
    public static final class C7123 extends AbstractC5673 implements InterfaceC5124<C8576, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C7123 f21489 = new C7123();

        public C7123() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(@InterfaceC6399 C8576 c8576) {
            C5499.m17103(c8576, "entry");
            return Boolean.valueOf(C7122.f21483.m22243(c8576.m4545()));
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.ClassLoader)
  (r2v0 boolean)
  (wrap:Yue.ۥ۠ۡۨۤ:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:Yue.ۥ۠ۡۨۤ:0x0004: SGET  A[WRAPPED] (LINE:1) Yue.ۥ۠ۡۨۤ.ۥ۟ Yue.ۥ۠ۡۨۤ) : (r3v0 Yue.ۥ۠ۡۨۤ))
 A[MD:(java.lang.ClassLoader, boolean, Yue.ۥ۠ۡۨۤ):void (m)] (LINE:2) call: Yue.ۥۡۦۦۡ.<init>(java.lang.ClassLoader, boolean, Yue.ۥ۠ۡۨۤ):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C7122(ClassLoader classLoader, boolean z, AbstractC4819 abstractC4819, int i, C4335 c4335) {
        this(classLoader, z, (i & 4) != 0 ? AbstractC4819.f1139 : abstractC4819);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    private final C6618 m22237(C6618 c6618) {
        return f21484.m21040(c6618, true);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public InterfaceC7472 mo14638(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14639(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public C6618 mo14640(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "path");
        return m22237(c6618);
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo14645(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo14646(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) throws IOException {
        C5499.m17103(c6618, "source");
        C5499.m17103(c66182, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // Yue.AbstractC4819
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public void mo14648(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public List<C6618> mo14652(@InterfaceC6399 C6618 c6618) throws FileNotFoundException {
        C5499.m17103(c6618, "dir");
        String strM22242 = m22242(c6618);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (C6599<AbstractC4819, C6618> c6599 : m22238()) {
            AbstractC4819 abstractC4819M3062 = c6599.m3062();
            C6618 c6618M3063 = c6599.m3063();
            try {
                List<C6618> listMo14652 = abstractC4819M3062.mo14652(c6618M3063.m21041(strM22242));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listMo14652) {
                    if (f21483.m22243((C6618) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C3881.m10756(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f21483.m22244((C6618) it.next(), c6618M3063));
                }
                C3885.m10772(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return C3888.m11062(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + c6618);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public List<C6618> mo14653(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "dir");
        String strM22242 = m22242(c6618);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C6599<AbstractC4819, C6618>> it = m22238().iterator();
        boolean z = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            C6599<AbstractC4819, C6618> next = it.next();
            AbstractC4819 abstractC4819M3062 = next.m3062();
            C6618 c6618M3063 = next.m3063();
            List<C6618> listMo14653 = abstractC4819M3062.mo14653(c6618M3063.m21041(strM22242));
            if (listMo14653 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : listMo14653) {
                    if (f21483.m22243((C6618) obj)) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C3881.m10756(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(f21483.m22244((C6618) it2.next(), c6618M3063));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                C3885.m10772(linkedHashSet, arrayList);
                z = true;
            }
        }
        if (z) {
            return C3888.m11062(linkedHashSet);
        }
        return null;
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public C4811 mo14657(@InterfaceC6399 C6618 c6618) throws IOException {
        C5499.m17103(c6618, "path");
        if (!f21483.m22243(c6618)) {
            return null;
        }
        String strM22242 = m22242(c6618);
        for (C6599<AbstractC4819, C6618> c6599 : m22238()) {
            C4811 c4811Mo14657 = c6599.m3062().mo14657(c6599.m3063().m21041(strM22242));
            if (c4811Mo14657 != null) {
                return c4811Mo14657;
            }
        }
        return null;
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public AbstractC4809 mo14658(@InterfaceC6399 C6618 c6618) throws FileNotFoundException {
        C5499.m17103(c6618, "file");
        if (!f21483.m22243(c6618)) {
            throw new FileNotFoundException("file not found: " + c6618);
        }
        String strM22242 = m22242(c6618);
        for (C6599<AbstractC4819, C6618> c6599 : m22238()) {
            try {
                return c6599.m3062().mo14658(c6599.m3063().m21041(strM22242));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + c6618);
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public AbstractC4809 mo14660(@InterfaceC6399 C6618 c6618, boolean z, boolean z2) throws IOException {
        C5499.m17103(c6618, "file");
        throw new IOException("resources are not writable");
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public InterfaceC7472 mo14662(@InterfaceC6399 C6618 c6618, boolean z) throws IOException {
        C5499.m17103(c6618, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // Yue.AbstractC4819
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public InterfaceC7506 mo14663(@InterfaceC6399 C6618 c6618) throws FileNotFoundException {
        InterfaceC7506 interfaceC7506M20847;
        C5499.m17103(c6618, "file");
        if (!f21483.m22243(c6618)) {
            throw new FileNotFoundException("file not found: " + c6618);
        }
        C6618 c66182 = f21484;
        InputStream resourceAsStream = this.f21485.getResourceAsStream(C6618.m21023(c66182, c6618, false, 2, null).m21036(c66182).toString());
        if (resourceAsStream != null && (interfaceC7506M20847 = C6542.m20847(resourceAsStream)) != null) {
            return interfaceC7506M20847;
        }
        throw new FileNotFoundException("file not found: " + c6618);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public final List<C6599<AbstractC4819, C6618>> m22238() {
        return (List) this.f21487.getValue();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public final List<C6599<AbstractC4819, C6618>> m22239(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        C5499.m17102(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        C5499.m17102(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            C5499.m17100(url);
            C6599<AbstractC4819, C6618> c6599M22240 = m22240(url);
            if (c6599M22240 != null) {
                arrayList.add(c6599M22240);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        C5499.m17102(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        C5499.m17102(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            C5499.m17100(url2);
            C6599<AbstractC4819, C6618> c6599M22241 = m22241(url2);
            if (c6599M22241 != null) {
                arrayList2.add(c6599M22241);
            }
        }
        return C3888.m10993(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public final C6599<AbstractC4819, C6618> m22240(URL url) {
        if (C5499.m17094(url.getProtocol(), "file")) {
            return C8003.m4014(this.f21486, C6618.C1032.m21046(C6618.f16986, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public final C6599<AbstractC4819, C6618> m22241(URL url) {
        int iM24071;
        String string = url.toString();
        C5499.m17102(string, "toString(...)");
        if (!C7627.m24008(string, "jar:file:", false, 2, null) || (iM24071 = C7628.m24071(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        C6618.C1032 c1032 = C6618.f16986;
        String strSubstring = string.substring(4, iM24071);
        C5499.m17102(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return C8003.m4014(C8578.m28574(C6618.C1032.m21046(c1032, new File(URI.create(strSubstring)), false, 1, null), this.f21486, C7123.f21489), f21484);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final String m22242(C6618 c6618) {
        return m22237(c6618).m21036(f21484).toString();
    }

    public C7122(@InterfaceC6399 ClassLoader classLoader, boolean z, @InterfaceC6399 AbstractC4819 abstractC4819) {
        C5499.m17103(classLoader, "classLoader");
        C5499.m17103(abstractC4819, "systemFileSystem");
        this.f21485 = classLoader;
        this.f21486 = abstractC4819;
        this.f21487 = C5689.m2370(new C1178());
        if (z) {
            m22238().size();
        }
    }
}
