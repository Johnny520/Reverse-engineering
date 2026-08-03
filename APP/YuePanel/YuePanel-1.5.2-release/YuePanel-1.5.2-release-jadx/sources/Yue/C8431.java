package Yue;

import Yue.C4128;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۢۥۣ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8431 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final boolean f25258 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static int f25259;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f3493;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f25261;

    /* JADX INFO: renamed from: ۥ */
    public ArrayList<C4128> f3492 = new ArrayList<>();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean f25260 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public ArrayList<C1528> f25262 = null;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f25263 = -1;

    /* JADX INFO: renamed from: Yue.ۥۢۥۣ۟$ۥ */
    public class C1528 {

        /* JADX INFO: renamed from: ۥ */
        public WeakReference<C4128> f3494;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3495;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f25264;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f25265;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public int f25266;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int f25267;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public int f25268;

        public C1528(C4128 c4128, C5714 c5714, int i) {
            this.f3494 = new WeakReference<>(c4128);
            this.f3495 = c5714.m17656(c4128.f8386);
            this.f25264 = c5714.m17656(c4128.f8387);
            this.f25265 = c5714.m17656(c4128.f8388);
            this.f25266 = c5714.m17656(c4128.f8389);
            this.f25267 = c5714.m17656(c4128.f8390);
            this.f25268 = i;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4413() {
            C4128 c4128 = this.f3494.get();
            if (c4128 != null) {
                c4128.m11926(this.f3495, this.f25264, this.f25265, this.f25266, this.f25267, this.f25268);
            }
        }
    }

    public C8431(int i) {
        int i2 = f25259;
        f25259 = i2 + 1;
        this.f3493 = i2;
        this.f25261 = i;
    }

    public String toString() {
        String str = m28201() + " [" + this.f3493 + "] <";
        Iterator<C4128> it = this.f3492.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().m11854();
        }
        return str + " >";
    }

    /* JADX INFO: renamed from: ۥ */
    public boolean m4411(C4128 c4128) {
        if (this.f3492.contains(c4128)) {
            return false;
        }
        this.f3492.add(c4128);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4412() {
        if (this.f25262 != null && this.f25260) {
            for (int i = 0; i < this.f25262.size(); i++) {
                this.f25262.get(i).m4413();
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m28196(ArrayList<C8431> arrayList) {
        int size = this.f3492.size();
        if (this.f25263 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C8431 c8431 = arrayList.get(i);
                if (this.f25263 == c8431.f3493) {
                    m28206(this.f25261, c8431);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m28197() {
        this.f3492.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final boolean m28198(C4128 c4128) {
        return this.f3492.contains(c4128);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m28199() {
        return this.f3493;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m28200() {
        return this.f25261;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final String m28201() {
        int i = this.f25261;
        return i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown";
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m28202(C8431 c8431) {
        for (int i = 0; i < this.f3492.size(); i++) {
            if (c8431.m28198(this.f3492.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m28203() {
        return this.f25260;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final int m28204(int i, C4128 c4128) {
        C4128.EnumC0339 enumC0339M11855 = c4128.m11855(i);
        if (enumC0339M11855 == C4128.EnumC0339.WRAP_CONTENT || enumC0339M11855 == C4128.EnumC0339.MATCH_PARENT || enumC0339M11855 == C4128.EnumC0339.FIXED) {
            return i == 0 ? c4128.m11891() : c4128.m11859();
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m28205(C5714 c5714, int i) {
        if (this.f3492.size() == 0) {
            return 0;
        }
        return m28210(c5714, this.f3492, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m28206(int i, C8431 c8431) {
        for (C4128 c4128 : this.f3492) {
            c8431.m4411(c4128);
            if (i == 0) {
                c4128.f8439 = c8431.m28199();
            } else {
                c4128.f8440 = c8431.m28199();
            }
        }
        this.f25263 = c8431.f3493;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m28207(boolean z) {
        this.f25260 = z;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m28208(int i) {
        this.f25261 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m28209() {
        return this.f3492.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final int m28210(C5714 c5714, ArrayList<C4128> arrayList, int i) {
        int iM17656;
        int iM176562;
        C4129 c4129 = (C4129) arrayList.get(0).m11876();
        c5714.m17666();
        c4129.mo9340(c5714, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).mo9340(c5714, false);
        }
        if (i == 0 && c4129.f8461 > 0) {
            C3689.m764(c4129, c5714, arrayList, 0);
        }
        if (i == 1 && c4129.f8462 > 0) {
            C3689.m764(c4129, c5714, arrayList, 1);
        }
        try {
            c5714.m17661();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f25262 = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f25262.add(new C1528(arrayList.get(i3), c5714, i));
        }
        if (i == 0) {
            iM17656 = c5714.m17656(c4129.f8386);
            iM176562 = c5714.m17656(c4129.f8388);
            c5714.m17666();
        } else {
            iM17656 = c5714.m17656(c4129.f8387);
            iM176562 = c5714.m17656(c4129.f8389);
            c5714.m17666();
        }
        return iM176562 - iM17656;
    }
}
