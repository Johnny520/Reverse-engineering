package androidx.recyclerview.widget;

import Yue.C6702;
import androidx.recyclerview.widget.C8986;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ */
/* JADX INFO: loaded from: classes.dex */
public class C1758 implements C8986.InterfaceC1779 {

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f30068 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f30069 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final boolean f30070 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final String f30071 = "AHT";

    /* JADX INFO: renamed from: ۥ */
    public C6702.InterfaceC1067<C8945> f3912;

    /* JADX INFO: renamed from: ۥ۟ */
    public final ArrayList<C8945> f3913;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final ArrayList<C8945> f30072;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final InterfaceC8944 f30073;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Runnable f30074;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final boolean f30075;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final C8986 f30076;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f30077;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ$ۥ, reason: contains not printable characters */
    public interface InterfaceC8944 {
        /* JADX INFO: renamed from: ۥ */
        void mo4913(int i, int i2);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo4914(C8945 c8945);

        /* JADX INFO: renamed from: ۥ۟۟ */
        void mo30258(int i, int i2, Object obj);

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo30259(C8945 c8945);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        RecyclerView.AbstractC8938 mo30260(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        void mo30261(int i, int i2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        void mo30262(int i, int i2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        void mo30263(int i, int i2);
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ$ۥ۟, reason: contains not printable characters */
    public static class C8945 {

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public static final int f30078 = 1;

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public static final int f30079 = 2;

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public static final int f30080 = 4;

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public static final int f30081 = 8;

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public static final int f30082 = 30;

        /* JADX INFO: renamed from: ۥ */
        public int f3914;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f3915;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public Object f30083;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int f30084;

        public C8945(int i, int i2, int i3, Object obj) {
            this.f3914 = i;
            this.f3915 = i2;
            this.f30084 = i3;
            this.f30083 = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C8945 c8945 = (C8945) obj;
            int i = this.f3914;
            if (i != c8945.f3914) {
                return false;
            }
            if (i == 8 && Math.abs(this.f30084 - this.f3915) == 1 && this.f30084 == c8945.f3915 && this.f3915 == c8945.f30084) {
                return true;
            }
            if (this.f30084 != c8945.f30084 || this.f3915 != c8945.f3915) {
                return false;
            }
            Object obj2 = this.f30083;
            if (obj2 != null) {
                if (!obj2.equals(c8945.f30083)) {
                    return false;
                }
            } else if (c8945.f30083 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f3914 * 31) + this.f3915) * 31) + this.f30084;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + m4965() + ",s:" + this.f3915 + "c:" + this.f30084 + ",p:" + this.f30083 + "]";
        }

        /* JADX INFO: renamed from: ۥ */
        public String m4965() {
            int i = this.f3914;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1758(InterfaceC8944 interfaceC8944) {
        this(interfaceC8944, false);
    }

    @Override // androidx.recyclerview.widget.C8986.InterfaceC1779
    /* JADX INFO: renamed from: ۥ */
    public void mo4963(C8945 c8945) {
        if (this.f30075) {
            return;
        }
        c8945.f30083 = null;
        this.f3912.release(c8945);
    }

    @Override // androidx.recyclerview.widget.C8986.InterfaceC1779
    /* JADX INFO: renamed from: ۥ۟ */
    public C8945 mo4964(int i, int i2, int i3, Object obj) {
        C8945 c8945Acquire = this.f3912.acquire();
        if (c8945Acquire == null) {
            return new C8945(i, i2, i3, obj);
        }
        c8945Acquire.f3914 = i;
        c8945Acquire.f3915 = i2;
        c8945Acquire.f30084 = i3;
        c8945Acquire.f30083 = obj;
        return c8945Acquire;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C1758 m30495(C8945... c8945Arr) {
        Collections.addAll(this.f3913, c8945Arr);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m30496(C8945 c8945) {
        m30515(c8945);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m30497(C8945 c8945) {
        m30515(c8945);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m30498(int i) {
        int size = this.f3913.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8945 c8945 = this.f3913.get(i2);
            int i3 = c8945.f3914;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = c8945.f3915;
                    if (i4 <= i) {
                        int i5 = c8945.f30084;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = c8945.f3915;
                    if (i6 == i) {
                        i = c8945.f30084;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (c8945.f30084 <= i) {
                            i++;
                        }
                    }
                }
            } else if (c8945.f3915 <= i) {
                i += c8945.f30084;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final void m30499(C8945 c8945) {
        boolean z;
        byte b;
        int i = c8945.f3915;
        int i2 = c8945.f30084 + i;
        byte b2 = -1;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f30073.mo30260(i3) != null || m30501(i3)) {
                if (b2 == 0) {
                    m30504(mo4964(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b = 1;
            } else {
                if (b2 == 1) {
                    m30515(mo4964(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            b2 = b;
        }
        if (i4 != c8945.f30084) {
            mo4963(c8945);
            c8945 = mo4964(2, i, i4, null);
        }
        if (b2 == 0) {
            m30504(c8945);
        } else {
            m30515(c8945);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m30500(C8945 c8945) {
        int i = c8945.f3915;
        int i2 = c8945.f30084 + i;
        int i3 = 0;
        byte b = -1;
        int i4 = i;
        while (i < i2) {
            if (this.f30073.mo30260(i) != null || m30501(i)) {
                if (b == 0) {
                    m30504(mo4964(4, i4, i3, c8945.f30083));
                    i4 = i;
                    i3 = 0;
                }
                b = 1;
            } else {
                if (b == 1) {
                    m30515(mo4964(4, i4, i3, c8945.f30083));
                    i4 = i;
                    i3 = 0;
                }
                b = 0;
            }
            i3++;
            i++;
        }
        if (i3 != c8945.f30084) {
            Object obj = c8945.f30083;
            mo4963(c8945);
            c8945 = mo4964(4, i4, i3, obj);
        }
        if (b == 0) {
            m30504(c8945);
        } else {
            m30515(c8945);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final boolean m30501(int i) {
        int size = this.f30072.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8945 c8945 = this.f30072.get(i2);
            int i3 = c8945.f3914;
            if (i3 == 8) {
                if (m30507(c8945.f30084, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c8945.f3915;
                int i5 = c8945.f30084 + i4;
                while (i4 < i5) {
                    if (m30507(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m30502() {
        int size = this.f30072.size();
        for (int i = 0; i < size; i++) {
            this.f30073.mo30259(this.f30072.get(i));
        }
        m30517(this.f30072);
        this.f30077 = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m30503() {
        m30502();
        int size = this.f3913.size();
        for (int i = 0; i < size; i++) {
            C8945 c8945 = this.f3913.get(i);
            int i2 = c8945.f3914;
            if (i2 == 1) {
                this.f30073.mo30259(c8945);
                this.f30073.mo30262(c8945.f3915, c8945.f30084);
            } else if (i2 == 2) {
                this.f30073.mo30259(c8945);
                this.f30073.mo30263(c8945.f3915, c8945.f30084);
            } else if (i2 == 4) {
                this.f30073.mo30259(c8945);
                this.f30073.mo30258(c8945.f3915, c8945.f30084, c8945.f30083);
            } else if (i2 == 8) {
                this.f30073.mo30259(c8945);
                this.f30073.mo4913(c8945.f3915, c8945.f30084);
            }
            Runnable runnable = this.f30074;
            if (runnable != null) {
                runnable.run();
            }
        }
        m30517(this.f3913);
        this.f30077 = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m30504(C8945 c8945) {
        int i;
        int i2 = c8945.f3914;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM30519 = m30519(c8945.f3915, i2);
        int i3 = c8945.f3915;
        int i4 = c8945.f3914;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c8945);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < c8945.f30084; i6++) {
            int iM305192 = m30519(c8945.f3915 + (i * i6), c8945.f3914);
            int i7 = c8945.f3914;
            if (i7 == 2 ? iM305192 != iM30519 : !(i7 == 4 && iM305192 == iM30519 + 1)) {
                C8945 c8945Mo4964 = mo4964(i7, iM30519, i5, c8945.f30083);
                m30505(c8945Mo4964, i3);
                mo4963(c8945Mo4964);
                if (c8945.f3914 == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iM30519 = iM305192;
            } else {
                i5++;
            }
        }
        Object obj = c8945.f30083;
        mo4963(c8945);
        if (i5 > 0) {
            C8945 c8945Mo49642 = mo4964(c8945.f3914, iM30519, i5, obj);
            m30505(c8945Mo49642, i3);
            mo4963(c8945Mo49642);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m30505(C8945 c8945, int i) {
        this.f30073.mo4914(c8945);
        int i2 = c8945.f3914;
        if (i2 == 2) {
            this.f30073.mo30263(i, c8945.f30084);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f30073.mo30258(i, c8945.f30084, c8945.f30083);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public int m30506(int i) {
        return m30507(i, 0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public int m30507(int i, int i2) {
        int size = this.f30072.size();
        while (i2 < size) {
            C8945 c8945 = this.f30072.get(i2);
            int i3 = c8945.f3914;
            if (i3 == 8) {
                int i4 = c8945.f3915;
                if (i4 == i) {
                    i = c8945.f30084;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c8945.f30084 <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c8945.f3915;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c8945.f30084;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c8945.f30084;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public boolean m30508(int i) {
        return (i & this.f30077) != 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public boolean m30509() {
        return this.f3913.size() > 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m30510() {
        return (this.f30072.isEmpty() || this.f3913.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean m30511(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f3913.add(mo4964(4, i, i2, obj));
        this.f30077 |= 4;
        return this.f3913.size() == 1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public boolean m30512(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f3913.add(mo4964(1, i, i2, null));
        this.f30077 |= 1;
        return this.f3913.size() == 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public boolean m30513(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f3913.add(mo4964(8, i, i2, null));
        this.f30077 |= 8;
        return this.f3913.size() == 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m30514(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f3913.add(mo4964(2, i, i2, null));
        this.f30077 |= 2;
        return this.f3913.size() == 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m30515(C8945 c8945) {
        this.f30072.add(c8945);
        int i = c8945.f3914;
        if (i == 1) {
            this.f30073.mo30262(c8945.f3915, c8945.f30084);
            return;
        }
        if (i == 2) {
            this.f30073.mo30261(c8945.f3915, c8945.f30084);
            return;
        }
        if (i == 4) {
            this.f30073.mo30258(c8945.f3915, c8945.f30084, c8945.f30083);
        } else {
            if (i == 8) {
                this.f30073.mo4913(c8945.f3915, c8945.f30084);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + c8945);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m30516() {
        this.f30076.m5002(this.f3913);
        int size = this.f3913.size();
        for (int i = 0; i < size; i++) {
            C8945 c8945 = this.f3913.get(i);
            int i2 = c8945.f3914;
            if (i2 == 1) {
                m30496(c8945);
            } else if (i2 == 2) {
                m30499(c8945);
            } else if (i2 == 4) {
                m30500(c8945);
            } else if (i2 == 8) {
                m30497(c8945);
            }
            Runnable runnable = this.f30074;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f3913.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m30517(List<C8945> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo4963(list.get(i));
        }
        list.clear();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void m30518() {
        m30517(this.f3913);
        m30517(this.f30072);
        this.f30077 = 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final int m30519(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f30072.size() - 1; size >= 0; size--) {
            C8945 c8945 = this.f30072.get(size);
            int i5 = c8945.f3914;
            if (i5 == 8) {
                int i6 = c8945.f3915;
                int i7 = c8945.f30084;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c8945.f3915 = i6 + 1;
                            c8945.f30084 = i7 + 1;
                        } else if (i2 == 2) {
                            c8945.f3915 = i6 - 1;
                            c8945.f30084 = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c8945.f30084 = i7 + 1;
                    } else if (i2 == 2) {
                        c8945.f30084 = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c8945.f3915 = i6 + 1;
                    } else if (i2 == 2) {
                        c8945.f3915 = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c8945.f3915;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c8945.f30084;
                    } else if (i5 == 2) {
                        i += c8945.f30084;
                    }
                } else if (i2 == 1) {
                    c8945.f3915 = i8 + 1;
                } else if (i2 == 2) {
                    c8945.f3915 = i8 - 1;
                }
            }
        }
        for (int size2 = this.f30072.size() - 1; size2 >= 0; size2--) {
            C8945 c89452 = this.f30072.get(size2);
            if (c89452.f3914 == 8) {
                int i9 = c89452.f30084;
                if (i9 == c89452.f3915 || i9 < 0) {
                    this.f30072.remove(size2);
                    mo4963(c89452);
                }
            } else if (c89452.f30084 <= 0) {
                this.f30072.remove(size2);
                mo4963(c89452);
            }
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1758(InterfaceC8944 interfaceC8944, boolean z) {
        this.f3912 = new C6702.C1068(30);
        this.f3913 = new ArrayList<>();
        this.f30072 = new ArrayList<>();
        this.f30077 = 0;
        this.f30073 = interfaceC8944;
        this.f30075 = z;
        this.f30076 = new C8986(this);
    }
}
