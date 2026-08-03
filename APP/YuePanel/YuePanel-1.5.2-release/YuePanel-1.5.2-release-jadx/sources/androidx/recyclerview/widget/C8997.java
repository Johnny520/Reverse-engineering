package androidx.recyclerview.widget;

import Yue.C5885;
import Yue.C6702;
import Yue.C7467;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC8392;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8997 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean f30362 = false;

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC8392
    public final C7467<RecyclerView.AbstractC8938, C1790> f3997 = new C7467<>();

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC8392
    public final C5885<RecyclerView.AbstractC8938> f3998 = new C5885<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟ۡ$ۥ */
    public static class C1790 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final int f30363 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f30364 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f30365 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f30366 = 8;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f30367 = 3;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f30368 = 12;

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public static final int f30369 = 14;

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public static C6702.InterfaceC1067<C1790> f30370 = new C6702.C1068(20);

        /* JADX INFO: renamed from: ۥ */
        public int f3999;

        /* JADX INFO: renamed from: ۥ۟ */
        @InterfaceC6490
        public RecyclerView.AbstractC8914.C8916 f4000;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @InterfaceC6490
        public RecyclerView.AbstractC8914.C8916 f30371;

        /* JADX INFO: renamed from: ۥ */
        public static void m5017() {
            while (f30370.acquire() != null) {
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public static C1790 m5018() {
            C1790 c1790Acquire = f30370.acquire();
            return c1790Acquire == null ? new C1790() : c1790Acquire;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static void m30798(C1790 c1790) {
            c1790.f3999 = 0;
            c1790.f4000 = null;
            c1790.f30371 = null;
            f30370.release(c1790);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟ۡ$ۥ۟ */
    public interface InterfaceC1791 {
        /* JADX INFO: renamed from: ۥ */
        void mo4909(RecyclerView.AbstractC8938 abstractC8938);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo4910(RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6490 RecyclerView.AbstractC8914.C8916 c8916, RecyclerView.AbstractC8914.C8916 c89162);

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo30247(RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6391 RecyclerView.AbstractC8914.C8916 c8916, @InterfaceC6490 RecyclerView.AbstractC8914.C8916 c89162);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo30248(RecyclerView.AbstractC8938 abstractC8938, @InterfaceC6391 RecyclerView.AbstractC8914.C8916 c8916, @InterfaceC6391 RecyclerView.AbstractC8914.C8916 c89162);
    }

    /* JADX INFO: renamed from: ۥ */
    public void m5015(RecyclerView.AbstractC8938 abstractC8938, RecyclerView.AbstractC8914.C8916 c8916) {
        C1790 c1790M5018 = this.f3997.get(abstractC8938);
        if (c1790M5018 == null) {
            c1790M5018 = C1790.m5018();
            this.f3997.put(abstractC8938, c1790M5018);
        }
        c1790M5018.f3999 |= 2;
        c1790M5018.f4000 = c8916;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m5016(RecyclerView.AbstractC8938 abstractC8938) {
        C1790 c1790M5018 = this.f3997.get(abstractC8938);
        if (c1790M5018 == null) {
            c1790M5018 = C1790.m5018();
            this.f3997.put(abstractC8938, c1790M5018);
        }
        c1790M5018.f3999 |= 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m30783(long j, RecyclerView.AbstractC8938 abstractC8938) {
        this.f3998.m18222(j, abstractC8938);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m30784(RecyclerView.AbstractC8938 abstractC8938, RecyclerView.AbstractC8914.C8916 c8916) {
        C1790 c1790M5018 = this.f3997.get(abstractC8938);
        if (c1790M5018 == null) {
            c1790M5018 = C1790.m5018();
            this.f3997.put(abstractC8938, c1790M5018);
        }
        c1790M5018.f30371 = c8916;
        c1790M5018.f3999 |= 8;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m30785(RecyclerView.AbstractC8938 abstractC8938, RecyclerView.AbstractC8914.C8916 c8916) {
        C1790 c1790M5018 = this.f3997.get(abstractC8938);
        if (c1790M5018 == null) {
            c1790M5018 = C1790.m5018();
            this.f3997.put(abstractC8938, c1790M5018);
        }
        c1790M5018.f4000 = c8916;
        c1790M5018.f3999 |= 4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m30786() {
        this.f3997.clear();
        this.f3998.m18210();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public RecyclerView.AbstractC8938 m30787(long j) {
        return this.f3998.m18216(j);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m30788(RecyclerView.AbstractC8938 abstractC8938) {
        C1790 c1790 = this.f3997.get(abstractC8938);
        return (c1790 == null || (c1790.f3999 & 1) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m30789(RecyclerView.AbstractC8938 abstractC8938) {
        C1790 c1790 = this.f3997.get(abstractC8938);
        return (c1790 == null || (c1790.f3999 & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m30790() {
        C1790.m5017();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m30791(RecyclerView.AbstractC8938 abstractC8938) {
        m30796(abstractC8938);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final RecyclerView.AbstractC8914.C8916 m30792(RecyclerView.AbstractC8938 abstractC8938, int i) {
        C1790 c1790ValueAt;
        RecyclerView.AbstractC8914.C8916 c8916;
        int iIndexOfKey = this.f3997.indexOfKey(abstractC8938);
        if (iIndexOfKey >= 0 && (c1790ValueAt = this.f3997.valueAt(iIndexOfKey)) != null) {
            int i2 = c1790ValueAt.f3999;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                c1790ValueAt.f3999 = i3;
                if (i == 4) {
                    c8916 = c1790ValueAt.f4000;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c8916 = c1790ValueAt.f30371;
                }
                if ((i3 & 12) == 0) {
                    this.f3997.removeAt(iIndexOfKey);
                    C1790.m30798(c1790ValueAt);
                }
                return c8916;
            }
        }
        return null;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public RecyclerView.AbstractC8914.C8916 m30793(RecyclerView.AbstractC8938 abstractC8938) {
        return m30792(abstractC8938, 8);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public RecyclerView.AbstractC8914.C8916 m30794(RecyclerView.AbstractC8938 abstractC8938) {
        return m30792(abstractC8938, 4);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m30795(InterfaceC1791 interfaceC1791) {
        for (int size = this.f3997.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC8938 abstractC8938KeyAt = this.f3997.keyAt(size);
            C1790 c1790RemoveAt = this.f3997.removeAt(size);
            int i = c1790RemoveAt.f3999;
            if ((i & 3) == 3) {
                interfaceC1791.mo4909(abstractC8938KeyAt);
            } else if ((i & 1) != 0) {
                RecyclerView.AbstractC8914.C8916 c8916 = c1790RemoveAt.f4000;
                if (c8916 == null) {
                    interfaceC1791.mo4909(abstractC8938KeyAt);
                } else {
                    interfaceC1791.mo30247(abstractC8938KeyAt, c8916, c1790RemoveAt.f30371);
                }
            } else if ((i & 14) == 14) {
                interfaceC1791.mo4910(abstractC8938KeyAt, c1790RemoveAt.f4000, c1790RemoveAt.f30371);
            } else if ((i & 12) == 12) {
                interfaceC1791.mo30248(abstractC8938KeyAt, c1790RemoveAt.f4000, c1790RemoveAt.f30371);
            } else if ((i & 4) != 0) {
                interfaceC1791.mo30247(abstractC8938KeyAt, c1790RemoveAt.f4000, null);
            } else if ((i & 8) != 0) {
                interfaceC1791.mo4910(abstractC8938KeyAt, c1790RemoveAt.f4000, c1790RemoveAt.f30371);
            }
            C1790.m30798(c1790RemoveAt);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m30796(RecyclerView.AbstractC8938 abstractC8938) {
        C1790 c1790 = this.f3997.get(abstractC8938);
        if (c1790 == null) {
            return;
        }
        c1790.f3999 &= -2;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m30797(RecyclerView.AbstractC8938 abstractC8938) {
        int iM18231 = this.f3998.m18231() - 1;
        while (true) {
            if (iM18231 < 0) {
                break;
            }
            if (abstractC8938 == this.f3998.m18232(iM18231)) {
                this.f3998.m18227(iM18231);
                break;
            }
            iM18231--;
        }
        C1790 c1790Remove = this.f3997.remove(abstractC8938);
        if (c1790Remove != null) {
            C1790.m30798(c1790Remove);
        }
    }
}
