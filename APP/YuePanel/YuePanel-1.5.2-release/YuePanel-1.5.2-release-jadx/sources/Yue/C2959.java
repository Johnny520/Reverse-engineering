package Yue;

import Yue.C3630;
import Yue.C6618;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۟۟۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n59#1,22:407\n209#1:433\n209#1:434\n1549#2:429\n1620#2,3:430\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n53#1:407,22\n199#1:433\n204#1:434\n53#1:429\n53#1:430,3\n*E\n"})
@InterfaceC5572(name = "-Path")
public final class C2959 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C3630 f11;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6399
    public static final C3630 f12;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C3630 f4266;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C3630 f4267;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public static final C3630 f4268;

    static {
        C3630.C0198 c0198 = C3630.f6370;
        f11 = c0198.m9876("/");
        f12 = c0198.m9876("\\");
        f4266 = c0198.m9876("/\\");
        f4267 = c0198.m9876(".");
        f4268 = c0198.m9876("..");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int m5572(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) {
        C5499.m17103(c6618, "<this>");
        C5499.m17103(c66182, "other");
        return c6618.m21025().compareTo(c66182.m21025());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean m5573(@InterfaceC6399 C6618 c6618, @InterfaceC6489 Object obj) {
        C5499.m17103(c6618, "<this>");
        return (obj instanceof C6618) && C5499.m17094(((C6618) obj).m21025(), c6618.m21025());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int m5574(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        return c6618.m21025().hashCode();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final boolean m5575(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        return m5601(c6618) != -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final boolean m5576(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        return m5601(c6618) == -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final boolean m5577(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        return m5601(c6618) == c6618.m21025().m9852();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final String m5578(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        return c6618.m21033().m9862();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final C3630 m5579(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        int iM5597 = m5597(c6618);
        return iM5597 != -1 ? C3630.m9813(c6618.m21025(), iM5597 + 1, 0, 2, null) : (c6618.m21045() == null || c6618.m21025().m9852() != 2) ? c6618.m21025() : C3630.f6372;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final C6618 m5580(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        return C6618.f16986.m21050(c6618.toString(), true);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final C6618 m5581(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        if (C5499.m17094(c6618.m21025(), f4267) || C5499.m17094(c6618.m21025(), f11) || C5499.m17094(c6618.m21025(), f12) || m5600(c6618)) {
            return null;
        }
        int iM5597 = m5597(c6618);
        if (iM5597 == 2 && c6618.m21045() != null) {
            if (c6618.m21025().m9852() == 3) {
                return null;
            }
            return new C6618(C3630.m9813(c6618.m21025(), 0, 3, 1, null));
        }
        if (iM5597 == 1 && c6618.m21025().m9853(f12)) {
            return null;
        }
        if (iM5597 != -1 || c6618.m21045() == null) {
            return iM5597 == -1 ? new C6618(f4267) : iM5597 == 0 ? new C6618(C3630.m9813(c6618.m21025(), 0, 1, 1, null)) : new C6618(C3630.m9813(c6618.m21025(), 0, iM5597, 1, null));
        }
        if (c6618.m21025().m9852() == 2) {
            return null;
        }
        return new C6618(C3630.m9813(c6618.m21025(), 0, 2, 1, null));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public static final C6618 m5582(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182) {
        C5499.m17103(c6618, "<this>");
        C5499.m17103(c66182, "other");
        if (!C5499.m17094(c6618.m21026(), c66182.m21026())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + c6618 + " and " + c66182).toString());
        }
        List<C3630> listM21028 = c6618.m21028();
        List<C3630> listM210282 = c66182.m21028();
        int iMin = Math.min(listM21028.size(), listM210282.size());
        int i = 0;
        while (i < iMin && C5499.m17094(listM21028.get(i), listM210282.get(i))) {
            i++;
        }
        if (i == iMin && c6618.m21025().m9852() == c66182.m21025().m9852()) {
            return C6618.C1032.m21047(C6618.f16986, ".", false, 1, null);
        }
        if (listM210282.subList(i, listM210282.size()).indexOf(f4268) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + c6618 + " and " + c66182).toString());
        }
        C3600 c3600 = new C3600();
        C3630 c3630M5599 = m5599(c66182);
        if (c3630M5599 == null && (c3630M5599 = m5599(c6618)) == null) {
            c3630M5599 = m5605(C6618.f16987);
        }
        int size = listM210282.size();
        for (int i2 = i; i2 < size; i2++) {
            c3600.mo9668(f4268);
            c3600.mo9668(c3630M5599);
        }
        int size2 = listM21028.size();
        while (i < size2) {
            c3600.mo9668(listM21028.get(i));
            c3600.mo9668(c3630M5599);
            i++;
        }
        return m5603(c3600, false);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final C6618 m5583(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C3600 c3600, boolean z) {
        C5499.m17103(c6618, "<this>");
        C5499.m17103(c3600, "child");
        return m5585(c6618, m5603(c3600, false), z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final C6618 m5584(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C3630 c3630, boolean z) {
        C5499.m17103(c6618, "<this>");
        C5499.m17103(c3630, "child");
        return m5585(c6618, m5603(new C3600().mo9668(c3630), false), z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final C6618 m5585(@InterfaceC6399 C6618 c6618, @InterfaceC6399 C6618 c66182, boolean z) {
        C5499.m17103(c6618, "<this>");
        C5499.m17103(c66182, "child");
        if (c66182.m21029() || c66182.m21045() != null) {
            return c66182;
        }
        C3630 c3630M5599 = m5599(c6618);
        if (c3630M5599 == null && (c3630M5599 = m5599(c66182)) == null) {
            c3630M5599 = m5605(C6618.f16987);
        }
        C3600 c3600 = new C3600();
        c3600.mo9668(c6618.m21025());
        if (c3600.m9684() > 0) {
            c3600.mo9668(c3630M5599);
        }
        c3600.mo9668(c66182.m21025());
        return m5603(c3600, z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public static final C6618 m5586(@InterfaceC6399 C6618 c6618, @InterfaceC6399 String str, boolean z) {
        C5499.m17103(c6618, "<this>");
        C5499.m17103(str, "child");
        return m5585(c6618, m5603(new C3600().mo9638(str), false), z);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public static final C6618 m5587(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        int iM5601 = m5601(c6618);
        if (iM5601 == -1) {
            return null;
        }
        return new C6618(c6618.m21025().mo9858(0, iM5601));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public static final List<String> m5588(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        ArrayList arrayList = new ArrayList();
        int iM5601 = m5601(c6618);
        if (iM5601 == -1) {
            iM5601 = 0;
        } else if (iM5601 < c6618.m21025().m9852() && c6618.m21025().m9823(iM5601) == 92) {
            iM5601++;
        }
        int iM9852 = c6618.m21025().m9852();
        int i = iM5601;
        while (iM5601 < iM9852) {
            if (c6618.m21025().m9823(iM5601) == 47 || c6618.m21025().m9823(iM5601) == 92) {
                arrayList.add(c6618.m21025().mo9858(i, iM5601));
                i = iM5601 + 1;
            }
            iM5601++;
        }
        if (i < c6618.m21025().m9852()) {
            arrayList.add(c6618.m21025().mo9858(i, c6618.m21025().m9852()));
        }
        ArrayList arrayList2 = new ArrayList(C3881.m10756(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C3630) it.next()).m9862());
        }
        return arrayList2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public static final List<C3630> m5589(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        ArrayList arrayList = new ArrayList();
        int iM5601 = m5601(c6618);
        if (iM5601 == -1) {
            iM5601 = 0;
        } else if (iM5601 < c6618.m21025().m9852() && c6618.m21025().m9823(iM5601) == 92) {
            iM5601++;
        }
        int iM9852 = c6618.m21025().m9852();
        int i = iM5601;
        while (iM5601 < iM9852) {
            if (c6618.m21025().m9823(iM5601) == 47 || c6618.m21025().m9823(iM5601) == 92) {
                arrayList.add(c6618.m21025().mo9858(i, iM5601));
                i = iM5601 + 1;
            }
            iM5601++;
        }
        if (i < c6618.m21025().m9852()) {
            arrayList.add(c6618.m21025().mo9858(i, c6618.m21025().m9852()));
        }
        return arrayList;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final C6618 m5590(@InterfaceC6399 String str, boolean z) {
        C5499.m17103(str, "<this>");
        return m5603(new C3600().mo9638(str), z);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final String m5591(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        return c6618.m21025().m9862();
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final Character m5592(@InterfaceC6399 C6618 c6618) {
        C5499.m17103(c6618, "<this>");
        if (C3630.m9805(c6618.m21025(), f11, 0, 2, null) != -1 || c6618.m21025().m9852() < 2 || c6618.m21025().m9823(1) != 58) {
            return null;
        }
        char cM9823 = (char) c6618.m21025().m9823(0);
        if (('a' > cM9823 || cM9823 >= '{') && ('A' > cM9823 || cM9823 >= '[')) {
            return null;
        }
        return Character.valueOf(cM9823);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m5593() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static /* synthetic */ void m5594() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static /* synthetic */ void m5595() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static /* synthetic */ void m5596() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int m5597(C6618 c6618) {
        int iM9807 = C3630.m9807(c6618.m21025(), f11, 0, 2, null);
        return iM9807 != -1 ? iM9807 : C3630.m9807(c6618.m21025(), f12, 0, 2, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static /* synthetic */ void m5598() {
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final C3630 m5599(C6618 c6618) {
        C3630 c3630M21025 = c6618.m21025();
        C3630 c3630 = f11;
        if (C3630.m9805(c3630M21025, c3630, 0, 2, null) != -1) {
            return c3630;
        }
        C3630 c3630M210252 = c6618.m21025();
        C3630 c36302 = f12;
        if (C3630.m9805(c3630M210252, c36302, 0, 2, null) != -1) {
            return c36302;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final boolean m5600(C6618 c6618) {
        return c6618.m21025().m9821(f4268) && (c6618.m21025().m9852() == 2 || c6618.m21025().mo9844(c6618.m21025().m9852() + (-3), f11, 0, 1) || c6618.m21025().mo9844(c6618.m21025().m9852() + (-3), f12, 0, 1));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int m5601(C6618 c6618) {
        if (c6618.m21025().m9852() == 0) {
            return -1;
        }
        if (c6618.m21025().m9823(0) == 47) {
            return 1;
        }
        if (c6618.m21025().m9823(0) == 92) {
            if (c6618.m21025().m9852() <= 2 || c6618.m21025().m9823(1) != 92) {
                return 1;
            }
            int iM9834 = c6618.m21025().m9834(f12, 2);
            return iM9834 == -1 ? c6618.m21025().m9852() : iM9834;
        }
        if (c6618.m21025().m9852() > 2 && c6618.m21025().m9823(1) == 58 && c6618.m21025().m9823(2) == 92) {
            char cM9823 = (char) c6618.m21025().m9823(0);
            if ('a' <= cM9823 && cM9823 < '{') {
                return 3;
            }
            if ('A' <= cM9823 && cM9823 < '[') {
                return 3;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final boolean m5602(C3600 c3600, C3630 c3630) {
        if (!C5499.m17094(c3630, f12) || c3600.m9684() < 2 || c3600.m9650(1L) != 58) {
            return false;
        }
        char cM9650 = (char) c3600.m9650(0L);
        return ('a' <= cM9650 && cM9650 < '{') || ('A' <= cM9650 && cM9650 < '[');
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final C6618 m5603(@InterfaceC6399 C3600 c3600, boolean z) throws EOFException {
        C3630 c3630;
        C3630 c3630Mo9612;
        C5499.m17103(c3600, "<this>");
        C3600 c36002 = new C3600();
        C3630 c3630M5604 = null;
        int i = 0;
        while (true) {
            if (!c3600.mo9647(0L, f11)) {
                c3630 = f12;
                if (!c3600.mo9647(0L, c3630)) {
                    break;
                }
            }
            byte b = c3600.readByte();
            if (c3630M5604 == null) {
                c3630M5604 = m5604(b);
            }
            i++;
        }
        boolean z2 = i >= 2 && C5499.m17094(c3630M5604, c3630);
        if (z2) {
            C5499.m17100(c3630M5604);
            c36002.mo9668(c3630M5604);
            c36002.mo9668(c3630M5604);
        } else if (i > 0) {
            C5499.m17100(c3630M5604);
            c36002.mo9668(c3630M5604);
        } else {
            long jMo9639 = c3600.mo9639(f4266);
            if (c3630M5604 == null) {
                c3630M5604 = jMo9639 == -1 ? m5605(C6618.f16987) : m5604(c3600.m9650(jMo9639));
            }
            if (m5602(c3600, c3630M5604)) {
                if (jMo9639 == 2) {
                    c36002.mo9102(c3600, 3L);
                } else {
                    c36002.mo9102(c3600, 2L);
                }
            }
        }
        boolean z3 = c36002.m9684() > 0;
        ArrayList arrayList = new ArrayList();
        while (!c3600.mo9622()) {
            long jMo96392 = c3600.mo9639(f4266);
            if (jMo96392 == -1) {
                c3630Mo9612 = c3600.mo9648();
            } else {
                c3630Mo9612 = c3600.mo9612(jMo96392);
                c3600.readByte();
            }
            C3630 c36302 = f4268;
            if (C5499.m17094(c3630Mo9612, c36302)) {
                if (!z3 || !arrayList.isEmpty()) {
                    if (!z || (!z3 && (arrayList.isEmpty() || C5499.m17094(C3888.m10926(arrayList), c36302)))) {
                        arrayList.add(c3630Mo9612);
                    } else if (!z2 || arrayList.size() != 1) {
                        C3885.m10796(arrayList);
                    }
                }
            } else if (!C5499.m17094(c3630Mo9612, f4267) && !C5499.m17094(c3630Mo9612, C3630.f6372)) {
                arrayList.add(c3630Mo9612);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                c36002.mo9668(c3630M5604);
            }
            c36002.mo9668((C3630) arrayList.get(i2));
        }
        if (c36002.m9684() == 0) {
            c36002.mo9668(f4267);
        }
        return new C6618(c36002.mo9648());
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final C3630 m5604(byte b) {
        if (b == 47) {
            return f11;
        }
        if (b == 92) {
            return f12;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final C3630 m5605(String str) {
        if (C5499.m17094(str, "/")) {
            return f11;
        }
        if (C5499.m17094(str, "\\")) {
            return f12;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
