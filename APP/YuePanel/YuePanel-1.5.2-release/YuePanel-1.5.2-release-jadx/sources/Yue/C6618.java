package Yue;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n45#2,3:133\n53#2,28:136\n59#2,22:168\n112#2:190\n117#2:191\n122#2,6:192\n139#2,5:198\n149#2:203\n154#2,25:204\n194#2:229\n199#2,11:230\n204#2,6:241\n199#2,11:247\n204#2,6:258\n228#2,36:264\n268#2:300\n282#2:301\n287#2:302\n292#2:303\n297#2:304\n1549#3:164\n1620#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,36\n97#1:300\n104#1:301\n106#1:302\n108#1:303\n110#1:304\n47#1:164\n47#1:165,3\n*E\n"})
public final class C6618 implements Comparable<C6618> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1032 f16986 = new C1032(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final String f16987;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final C3630 f16988;

    /* JADX INFO: renamed from: Yue.ۥۣۡۧۧ$ۥ */
    public static final class C1032 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۡۧۧ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1032(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static /* synthetic */ C6618 m21046(C1032 c1032, File file, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c1032.m3088(file, z);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static /* synthetic */ C6618 m21047(C1032 c1032, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c1032.m21050(str, z);
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static /* synthetic */ C6618 m21048(C1032 c1032, Path path, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return c1032.m21052(path, z);
        }

        @InterfaceC6399
        @InterfaceC5573
        @InterfaceC5572(name = "get")
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ */
        public final C6618 m3087(@InterfaceC6399 File file) {
            C5499.m17103(file, "<this>");
            return m21046(this, file, false, 1, null);
        }

        @InterfaceC6399
        @InterfaceC5573
        @InterfaceC5572(name = "get")
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟ */
        public final C6618 m3088(@InterfaceC6399 File file, boolean z) {
            C5499.m17103(file, "<this>");
            String string = file.toString();
            C5499.m17102(string, "toString(...)");
            return m21050(string, z);
        }

        @InterfaceC6399
        @InterfaceC5573
        @InterfaceC5572(name = "get")
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C6618 m21049(@InterfaceC6399 String str) {
            C5499.m17103(str, "<this>");
            return m21047(this, str, false, 1, null);
        }

        @InterfaceC6399
        @InterfaceC5573
        @InterfaceC5572(name = "get")
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final C6618 m21050(@InterfaceC6399 String str, boolean z) {
            C5499.m17103(str, "<this>");
            return C2959.m5590(str, z);
        }

        @InterfaceC6399
        @InterfaceC5573
        @InterfaceC5572(name = "get")
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C6618 m21051(@InterfaceC6399 Path path) {
            C5499.m17103(path, "<this>");
            return m21048(this, path, false, 1, null);
        }

        @InterfaceC6399
        @InterfaceC5573
        @InterfaceC5572(name = "get")
        @InterfaceC5578
        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final C6618 m21052(@InterfaceC6399 Path path, boolean z) {
            C5499.m17103(path, "<this>");
            return m21050(path.toString(), z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1032() {
        }
    }

    static {
        String str = File.separator;
        C5499.m17102(str, "separator");
        f16987 = str;
    }

    public C6618(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "bytes");
        this.f16988 = c3630;
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "get")
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final C6618 m21016(@InterfaceC6399 File file) {
        return f16986.m3087(file);
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "get")
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final C6618 m21017(@InterfaceC6399 File file, boolean z) {
        return f16986.m3088(file, z);
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "get")
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C6618 m21018(@InterfaceC6399 String str) {
        return f16986.m21049(str);
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "get")
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final C6618 m21019(@InterfaceC6399 String str, boolean z) {
        return f16986.m21050(str, z);
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "get")
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C6618 m21020(@InterfaceC6399 Path path) {
        return f16986.m21051(path);
    }

    @InterfaceC6399
    @InterfaceC5573
    @InterfaceC5572(name = "get")
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C6618 m21021(@InterfaceC6399 Path path, boolean z) {
        return f16986.m21052(path, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static /* synthetic */ C6618 m21022(C6618 c6618, C3630 c3630, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c6618.m21038(c3630, z);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ C6618 m21023(C6618 c6618, C6618 c66182, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c6618.m21040(c66182, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ C6618 m21024(C6618 c6618, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return c6618.m21042(str, z);
    }

    public boolean equals(@InterfaceC6489 Object obj) {
        return (obj instanceof C6618) && C5499.m17094(((C6618) obj).m21025(), m21025());
    }

    public int hashCode() {
        return m21025().hashCode();
    }

    @InterfaceC6399
    public String toString() {
        return m21025().m9862();
    }

    /* JADX DEBUG: Method merged with bridge method: compareTo(Ljava/lang/Object;)I */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
    public int compareTo(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "other");
        return m21025().compareTo(c6618.m21025());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final C3630 m21025() {
        return this.f16988;
    }

    /* JADX DEBUG: Class process forced to load method for inline: Yue.ۥ۟۟۟ۦ.ۥ۟۟۟ۢ(Yue.ۥۣۡۧۧ):int */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final C6618 m21026() {
        int iM5601 = C2959.m5601(this);
        if (iM5601 == -1) {
            return null;
        }
        return new C6618(m21025().mo9858(0, iM5601));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final List<String> m21027() {
        ArrayList arrayList = new ArrayList();
        int iM5601 = C2959.m5601(this);
        if (iM5601 == -1) {
            iM5601 = 0;
        } else if (iM5601 < m21025().m9852() && m21025().m9823(iM5601) == 92) {
            iM5601++;
        }
        int iM9852 = m21025().m9852();
        int i = iM5601;
        while (iM5601 < iM9852) {
            if (m21025().m9823(iM5601) == 47 || m21025().m9823(iM5601) == 92) {
                arrayList.add(m21025().mo9858(i, iM5601));
                i = iM5601 + 1;
            }
            iM5601++;
        }
        if (i < m21025().m9852()) {
            arrayList.add(m21025().mo9858(i, m21025().m9852()));
        }
        ArrayList arrayList2 = new ArrayList(C3881.m10756(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3630) it.next()).m9862());
        }
        return arrayList2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final List<C3630> m21028() {
        ArrayList arrayList = new ArrayList();
        int iM5601 = C2959.m5601(this);
        if (iM5601 == -1) {
            iM5601 = 0;
        } else if (iM5601 < m21025().m9852() && m21025().m9823(iM5601) == 92) {
            iM5601++;
        }
        int iM9852 = m21025().m9852();
        int i = iM5601;
        while (iM5601 < iM9852) {
            if (m21025().m9823(iM5601) == 47 || m21025().m9823(iM5601) == 92) {
                arrayList.add(m21025().mo9858(i, iM5601));
                i = iM5601 + 1;
            }
            iM5601++;
        }
        if (i < m21025().m9852()) {
            arrayList.add(m21025().mo9858(i, m21025().m9852()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m21029() {
        return C2959.m5601(this) != -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final boolean m21030() {
        return C2959.m5601(this) == -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final boolean m21031() {
        return C2959.m5601(this) == m21025().m9852();
    }

    @InterfaceC6399
    @InterfaceC5572(name = "name")
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final String m21032() {
        return m21033().m9862();
    }

    @InterfaceC6399
    @InterfaceC5572(name = "nameBytes")
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final C3630 m21033() {
        int iM5597 = C2959.m5597(this);
        return iM5597 != -1 ? C3630.m9813(m21025(), iM5597 + 1, 0, 2, null) : (m21045() == null || m21025().m9852() != 2) ? m21025() : C3630.f6372;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final C6618 m21034() {
        return f16986.m21050(toString(), true);
    }

    @InterfaceC5572(name = "parent")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final C6618 m21035() {
        C6618 c6618;
        if (C5499.m17094(m21025(), C2959.f4267) || C5499.m17094(m21025(), C2959.f11) || C5499.m17094(m21025(), C2959.f12) || C2959.m5600(this)) {
            return null;
        }
        int iM5597 = C2959.m5597(this);
        if (iM5597 != 2 || m21045() == null) {
            if (iM5597 == 1 && m21025().m9853(C2959.f12)) {
                return null;
            }
            if (iM5597 != -1 || m21045() == null) {
                if (iM5597 == -1) {
                    return new C6618(C2959.f4267);
                }
                if (iM5597 != 0) {
                    return new C6618(C3630.m9813(m21025(), 0, iM5597, 1, null));
                }
                c6618 = new C6618(C3630.m9813(m21025(), 0, 1, 1, null));
            } else {
                if (m21025().m9852() == 2) {
                    return null;
                }
                c6618 = new C6618(C3630.m9813(m21025(), 0, 2, 1, null));
            }
        } else {
            if (m21025().m9852() == 3) {
                return null;
            }
            c6618 = new C6618(C3630.m9813(m21025(), 0, 3, 1, null));
        }
        return c6618;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final C6618 m21036(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "other");
        if (!C5499.m17094(m21026(), c6618.m21026())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + c6618).toString());
        }
        List<C3630> listM21028 = m21028();
        List<C3630> listM210282 = c6618.m21028();
        int iMin = Math.min(listM21028.size(), listM210282.size());
        int i = 0;
        while (i < iMin && C5499.m17094(listM21028.get(i), listM210282.get(i))) {
            i++;
        }
        if (i == iMin && m21025().m9852() == c6618.m21025().m9852()) {
            return C1032.m21047(f16986, ".", false, 1, null);
        }
        if (listM210282.subList(i, listM210282.size()).indexOf(C2959.f4268) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + c6618).toString());
        }
        C3600 c3600 = new C3600();
        C3630 c3630M5599 = C2959.m5599(c6618);
        if (c3630M5599 == null && (c3630M5599 = C2959.m5599(this)) == null) {
            c3630M5599 = C2959.m5605(f16987);
        }
        int size = listM210282.size();
        for (int i2 = i; i2 < size; i2++) {
            c3600.mo9668(C2959.f4268);
            c3600.mo9668(c3630M5599);
        }
        int size2 = listM21028.size();
        while (i < size2) {
            c3600.mo9668(listM21028.get(i));
            c3600.mo9668(c3630M5599);
            i++;
        }
        return C2959.m5603(c3600, false);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "resolve")
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final C6618 m21037(@InterfaceC6399 C3630 c3630) {
        C5499.m17103(c3630, "child");
        return C2959.m5585(this, C2959.m5603(new C3600().mo9668(c3630), false), false);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final C6618 m21038(@InterfaceC6399 C3630 c3630, boolean z) {
        C5499.m17103(c3630, "child");
        return C2959.m5585(this, C2959.m5603(new C3600().mo9668(c3630), false), z);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "resolve")
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final C6618 m21039(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "child");
        return C2959.m5585(this, c6618, false);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final C6618 m21040(@InterfaceC6399 C6618 c6618, boolean z) {
        C5499.m17103(c6618, "child");
        return C2959.m5585(this, c6618, z);
    }

    @InterfaceC6399
    @InterfaceC5572(name = "resolve")
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final C6618 m21041(@InterfaceC6399 String str) {
        C5499.m17103(str, "child");
        return C2959.m5585(this, C2959.m5603(new C3600().mo9638(str), false), false);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final C6618 m21042(@InterfaceC6399 String str, boolean z) {
        C5499.m17103(str, "child");
        return C2959.m5585(this, C2959.m5603(new C3600().mo9638(str), false), z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final File m21043() {
        return new File(toString());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final Path m21044() {
        Path path = Paths.get(toString(), new String[0]);
        C5499.m17102(path, "get(...)");
        return path;
    }

    @InterfaceC5572(name = "volumeLetter")
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final Character m21045() {
        if (C3630.m9805(m21025(), C2959.f11, 0, 2, null) != -1 || m21025().m9852() < 2 || m21025().m9823(1) != 58) {
            return null;
        }
        char cM9823 = (char) m21025().m9823(0);
        if (('a' > cM9823 || cM9823 >= '{') && ('A' > cM9823 || cM9823 >= '[')) {
            return null;
        }
        return Character.valueOf(cM9823);
    }
}
