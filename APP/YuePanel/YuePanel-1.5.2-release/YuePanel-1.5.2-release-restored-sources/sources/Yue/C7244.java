package Yue;

import Yue.C8336;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* JADX INFO: renamed from: Yue.ۥۡۧۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C7244 extends RecyclerView.AbstractC8926 {

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f21886 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f21887 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static final int f21888 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final int f21889 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static final int f21890 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public static final int f21891 = -1;

    /* JADX INFO: renamed from: ۥ */
    public C8336.AbstractC8344 f2763;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6391
    public final C8336 f2764;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final RecyclerView f21892;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6391
    public final LinearLayoutManager f21893;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f21894;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f21895;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C1219 f21896;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f21897;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public int f21898;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean f21899;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean f21900;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean f21901;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public boolean f21902;

    /* JADX INFO: renamed from: Yue.ۥۡۧۥ۠$ۥ */
    public static final class C1219 {

        /* JADX INFO: renamed from: ۥ */
        public int f2765;

        /* JADX INFO: renamed from: ۥ۟ */
        public float f2766;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public int f21903;

        /* JADX INFO: renamed from: ۥ */
        public void m3530() {
            this.f2765 = -1;
            this.f2766 = 0.0f;
            this.f21903 = 0;
        }
    }

    public C7244(@InterfaceC6391 C8336 c8336) {
        this.f2764 = c8336;
        RecyclerView recyclerView = c8336.f24920;
        this.f21892 = recyclerView;
        this.f21893 = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f21896 = new C1219();
        m22692();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8926
    public void onScrollStateChanged(@InterfaceC6391 RecyclerView recyclerView, int i) {
        if (!(this.f21894 == 1 && this.f21895 == 1) && i == 1) {
            m22694(false);
            return;
        }
        if (m22687() && i == 2) {
            if (this.f21900) {
                m22680(2);
                this.f21899 = true;
                return;
            }
            return;
        }
        if (m22687() && i == 0) {
            m22695();
            if (this.f21900) {
                C1219 c1219 = this.f21896;
                if (c1219.f21903 == 0) {
                    int i2 = this.f21897;
                    int i3 = c1219.f2765;
                    if (i2 != i3) {
                        m3529(i3);
                    }
                }
            } else {
                int i4 = this.f21896.f2765;
                if (i4 != -1) {
                    m3528(i4, 0.0f, 0);
                }
            }
            m22680(0);
            m22692();
        }
        if (this.f21894 == 2 && i == 0 && this.f21901) {
            m22695();
            C1219 c12192 = this.f21896;
            if (c12192.f21903 == 0) {
                int i5 = this.f21898;
                int i6 = c12192.f2765;
                if (i5 != i6) {
                    if (i6 == -1) {
                        i6 = 0;
                    }
                    m3529(i6);
                }
                m22680(0);
                m22692();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC8926
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onScrolled(@InterfaceC6391 RecyclerView recyclerView, int i, int i2) {
        int i3;
        this.f21900 = true;
        m22695();
        if (this.f21899) {
            this.f21899 = false;
            if (i2 > 0) {
                C1219 c1219 = this.f21896;
                i3 = c1219.f21903 != 0 ? c1219.f2765 + 1 : this.f21896.f2765;
                this.f21898 = i3;
                if (this.f21897 != i3) {
                    m3529(i3);
                }
            } else {
                if (i2 == 0) {
                    if ((i < 0) == this.f2764.m27795()) {
                    }
                }
                this.f21898 = i3;
                if (this.f21897 != i3) {
                }
            }
        } else if (this.f21894 == 0) {
            int i4 = this.f21896.f2765;
            if (i4 == -1) {
                i4 = 0;
            }
            m3529(i4);
        }
        C1219 c12192 = this.f21896;
        int i5 = c12192.f2765;
        if (i5 == -1) {
            i5 = 0;
        }
        m3528(i5, c12192.f2766, c12192.f21903);
        C1219 c12193 = this.f21896;
        int i6 = c12193.f2765;
        int i7 = this.f21898;
        if ((i6 == i7 || i7 == -1) && c12193.f21903 == 0 && this.f21895 != 1) {
            m22680(0);
            m22692();
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m3528(int i, float f, int i2) {
        C8336.AbstractC8344 abstractC8344 = this.f2763;
        if (abstractC8344 != null) {
            abstractC8344.onPageScrolled(i, f, i2);
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m3529(int i) {
        C8336.AbstractC8344 abstractC8344 = this.f2763;
        if (abstractC8344 != null) {
            abstractC8344.onPageSelected(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m22680(int i) {
        if ((this.f21894 == 3 && this.f21895 == 0) || this.f21895 == i) {
            return;
        }
        this.f21895 = i;
        C8336.AbstractC8344 abstractC8344 = this.f2763;
        if (abstractC8344 != null) {
            abstractC8344.onPageScrollStateChanged(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m22681() {
        return this.f21893.findFirstVisibleItemPosition();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public double m22682() {
        m22695();
        C1219 c1219 = this.f21896;
        return ((double) c1219.f2765) + ((double) c1219.f2766);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int m22683() {
        return this.f21895;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m22684() {
        return this.f21895 == 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public boolean m22685() {
        return this.f21902;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public boolean m22686() {
        return this.f21895 == 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final boolean m22687() {
        int i = this.f21894;
        return i == 1 || i == 4;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m22688() {
        this.f21894 = 4;
        m22694(true);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void m22689() {
        this.f21901 = true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m22690() {
        if (!m22684() || this.f21902) {
            this.f21902 = false;
            m22695();
            C1219 c1219 = this.f21896;
            if (c1219.f21903 != 0) {
                m22680(2);
                return;
            }
            int i = c1219.f2765;
            if (i != this.f21897) {
                m3529(i);
            }
            m22680(0);
            m22692();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m22691(int i, boolean z) {
        this.f21894 = z ? 2 : 3;
        this.f21902 = false;
        boolean z2 = this.f21898 != i;
        this.f21898 = i;
        m22680(2);
        if (z2) {
            m3529(i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final void m22692() {
        this.f21894 = 0;
        this.f21895 = 0;
        this.f21896.m3530();
        this.f21897 = -1;
        this.f21898 = -1;
        this.f21899 = false;
        this.f21900 = false;
        this.f21902 = false;
        this.f21901 = false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m22693(C8336.AbstractC8344 abstractC8344) {
        this.f2763 = abstractC8344;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final void m22694(boolean z) {
        this.f21902 = z;
        this.f21894 = z ? 4 : 1;
        int i = this.f21898;
        if (i != -1) {
            this.f21897 = i;
            this.f21898 = -1;
        } else if (this.f21897 == -1) {
            this.f21897 = m22681();
        }
        m22680(1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m22695() {
        int top;
        C1219 c1219 = this.f21896;
        int iFindFirstVisibleItemPosition = this.f21893.findFirstVisibleItemPosition();
        c1219.f2765 = iFindFirstVisibleItemPosition;
        if (iFindFirstVisibleItemPosition == -1) {
            c1219.m3530();
            return;
        }
        View viewFindViewByPosition = this.f21893.findViewByPosition(iFindFirstVisibleItemPosition);
        if (viewFindViewByPosition == null) {
            c1219.m3530();
            return;
        }
        int leftDecorationWidth = this.f21893.getLeftDecorationWidth(viewFindViewByPosition);
        int rightDecorationWidth = this.f21893.getRightDecorationWidth(viewFindViewByPosition);
        int topDecorationHeight = this.f21893.getTopDecorationHeight(viewFindViewByPosition);
        int bottomDecorationHeight = this.f21893.getBottomDecorationHeight(viewFindViewByPosition);
        ViewGroup.LayoutParams layoutParams = viewFindViewByPosition.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            leftDecorationWidth += marginLayoutParams.leftMargin;
            rightDecorationWidth += marginLayoutParams.rightMargin;
            topDecorationHeight += marginLayoutParams.topMargin;
            bottomDecorationHeight += marginLayoutParams.bottomMargin;
        }
        int height = viewFindViewByPosition.getHeight() + topDecorationHeight + bottomDecorationHeight;
        int width = viewFindViewByPosition.getWidth() + leftDecorationWidth + rightDecorationWidth;
        if (this.f21893.getOrientation() == 0) {
            top = (viewFindViewByPosition.getLeft() - leftDecorationWidth) - this.f21892.getPaddingLeft();
            if (this.f2764.m27795()) {
                top = -top;
            }
            height = width;
        } else {
            top = (viewFindViewByPosition.getTop() - topDecorationHeight) - this.f21892.getPaddingTop();
        }
        int i = -top;
        c1219.f21903 = i;
        if (i >= 0) {
            c1219.f2766 = height == 0 ? 0.0f : i / height;
        } else {
            if (!new C3222(this.f21893).m6585()) {
                throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(c1219.f21903)));
            }
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }
}
