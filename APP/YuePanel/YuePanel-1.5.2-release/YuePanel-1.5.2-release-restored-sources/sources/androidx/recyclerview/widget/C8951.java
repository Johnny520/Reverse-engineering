package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8951 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean f30104 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final String f30105 = "ChildrenHelper";

    /* JADX INFO: renamed from: ۥ */
    public final InterfaceC1764 f3923;

    /* JADX INFO: renamed from: ۥ۟ */
    public final C1763 f3924 = new C1763();

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final List<View> f30106 = new ArrayList();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ */
    public static class C1763 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f30107 = 64;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final long f30108 = Long.MIN_VALUE;

        /* JADX INFO: renamed from: ۥ */
        public long f3925 = 0;

        /* JADX INFO: renamed from: ۥ۟ */
        public C1763 f3926;

        public String toString() {
            if (this.f3926 == null) {
                return Long.toBinaryString(this.f3925);
            }
            return this.f3926.toString() + "xx" + Long.toBinaryString(this.f3925);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4977(int i) {
            if (i < 64) {
                this.f3925 &= ~(1 << i);
                return;
            }
            C1763 c1763 = this.f3926;
            if (c1763 != null) {
                c1763.m4977(i - 64);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public int m4978(int i) {
            C1763 c1763 = this.f3926;
            return c1763 == null ? i >= 64 ? Long.bitCount(this.f3925) : Long.bitCount(this.f3925 & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f3925 & ((1 << i) - 1)) : c1763.m4978(i - 64) + Long.bitCount(this.f3925);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m30548() {
            if (this.f3926 == null) {
                this.f3926 = new C1763();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m30549(int i) {
            if (i < 64) {
                return (this.f3925 & (1 << i)) != 0;
            }
            m30548();
            return this.f3926.m30549(i - 64);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30550(int i, boolean z) {
            if (i >= 64) {
                m30548();
                this.f3926.m30550(i - 64, z);
                return;
            }
            long j = this.f3925;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f3925 = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m30553(i);
            } else {
                m4977(i);
            }
            if (z2 || this.f3926 != null) {
                m30548();
                this.f3926.m30550(0, z2);
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m30551(int i) {
            if (i >= 64) {
                m30548();
                return this.f3926.m30551(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f3925;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f3925 = j3;
            long j4 = j - 1;
            this.f3925 = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C1763 c1763 = this.f3926;
            if (c1763 != null) {
                if (c1763.m30549(0)) {
                    m30553(63);
                }
                this.f3926.m30551(0);
            }
            return z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m30552() {
            this.f3925 = 0L;
            C1763 c1763 = this.f3926;
            if (c1763 != null) {
                c1763.m30552();
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m30553(int i) {
            if (i < 64) {
                this.f3925 |= 1 << i;
            } else {
                m30548();
                this.f3926.m30553(i - 64);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ */
    public interface InterfaceC1764 {
        /* JADX INFO: renamed from: ۥ */
        View mo4911(int i);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo4912(View view);

        /* JADX INFO: renamed from: ۥ۟۟ */
        int mo30249();

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo30250();

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        int mo30251(View view);

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        RecyclerView.AbstractC8938 mo30252(View view);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        void mo30253(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        void mo30254(View view);

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        void mo30255(View view, int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        void mo30256(int i);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        void mo30257(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    public C8951(InterfaceC1764 interfaceC1764) {
        this.f3923 = interfaceC1764;
    }

    public String toString() {
        return this.f3924.toString() + ", hidden list:" + this.f30106.size();
    }

    /* JADX INFO: renamed from: ۥ */
    public void m4975(View view, int i, boolean z) {
        int iMo30249 = i < 0 ? this.f3923.mo30249() : m30535(i);
        this.f3924.m30550(iMo30249, z);
        if (z) {
            m30539(view);
        }
        this.f3923.mo30255(view, iMo30249);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void m4976(View view, boolean z) {
        m4975(view, -1, z);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m30530(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iMo30249 = i < 0 ? this.f3923.mo30249() : m30535(i);
        this.f3924.m30550(iMo30249, z);
        if (z) {
            m30539(view);
        }
        this.f3923.mo30257(view, iMo30249, layoutParams);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m30531(int i) {
        int iM30535 = m30535(i);
        this.f3924.m30551(iM30535);
        this.f3923.mo30253(iM30535);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public View m30532(int i) {
        int size = this.f30106.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f30106.get(i2);
            RecyclerView.AbstractC8938 abstractC8938Mo30252 = this.f3923.mo30252(view);
            if (abstractC8938Mo30252.getLayoutPosition() == i && !abstractC8938Mo30252.isInvalid() && !abstractC8938Mo30252.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public View m30533(int i) {
        return this.f3923.mo4911(m30535(i));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m30534() {
        return this.f3923.mo30249() - this.f30106.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m30535(int i) {
        if (i < 0) {
            return -1;
        }
        int iMo30249 = this.f3923.mo30249();
        int i2 = i;
        while (i2 < iMo30249) {
            int iM4978 = i - (i2 - this.f3924.m4978(i2));
            if (iM4978 == 0) {
                while (this.f3924.m30549(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iM4978;
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public View m30536(int i) {
        return this.f3923.mo4911(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m30537() {
        return this.f3923.mo30249();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m30538(View view) {
        int iMo30251 = this.f3923.mo30251(view);
        if (iMo30251 >= 0) {
            this.f3924.m30553(iMo30251);
            m30539(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m30539(View view) {
        this.f30106.add(view);
        this.f3923.mo4912(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m30540(View view) {
        int iMo30251 = this.f3923.mo30251(view);
        if (iMo30251 == -1 || this.f3924.m30549(iMo30251)) {
            return -1;
        }
        return iMo30251 - this.f3924.m4978(iMo30251);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m30541(View view) {
        return this.f30106.contains(view);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m30542() {
        this.f3924.m30552();
        for (int size = this.f30106.size() - 1; size >= 0; size--) {
            this.f3923.mo30254(this.f30106.get(size));
            this.f30106.remove(size);
        }
        this.f3923.mo30250();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m30543(View view) {
        int iMo30251 = this.f3923.mo30251(view);
        if (iMo30251 < 0) {
            return;
        }
        if (this.f3924.m30551(iMo30251)) {
            m30547(view);
        }
        this.f3923.mo30256(iMo30251);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m30544(int i) {
        int iM30535 = m30535(i);
        View viewMo4911 = this.f3923.mo4911(iM30535);
        if (viewMo4911 == null) {
            return;
        }
        if (this.f3924.m30551(iM30535)) {
            m30547(viewMo4911);
        }
        this.f3923.mo30256(iM30535);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m30545(View view) {
        int iMo30251 = this.f3923.mo30251(view);
        if (iMo30251 == -1) {
            m30547(view);
            return true;
        }
        if (!this.f3924.m30549(iMo30251)) {
            return false;
        }
        this.f3924.m30551(iMo30251);
        m30547(view);
        this.f3923.mo30256(iMo30251);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m30546(View view) {
        int iMo30251 = this.f3923.mo30251(view);
        if (iMo30251 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f3924.m30549(iMo30251)) {
            this.f3924.m4977(iMo30251);
            m30547(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m30547(View view) {
        if (!this.f30106.remove(view)) {
            return false;
        }
        this.f3923.mo30254(view);
        return true;
    }
}
