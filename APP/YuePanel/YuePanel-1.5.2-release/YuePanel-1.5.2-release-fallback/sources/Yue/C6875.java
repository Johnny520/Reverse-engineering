package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6875 extends android.view.ViewGroup {

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f24080 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f24081 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f24082 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f24083 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f24084 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public static final int f24085 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public static boolean f24086 = true;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final android.graphics.Rect f24087;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final android.graphics.Rect f24088;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.C1433 f24089;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public int f24090;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean f24091;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public androidx.recyclerview.widget.RecyclerView.AbstractC7680 f24092;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public androidx.recyclerview.widget.LinearLayoutManager f24093;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f24094;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public android.os.Parcelable f24095;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public androidx.recyclerview.widget.RecyclerView f24096;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public androidx.recyclerview.widget.C7794 f24097;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public Yue.C5514 f24098;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Yue.C1433 f24099;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public Yue.C2330 f24100;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public Yue.C4665 f24101;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public androidx.recyclerview.widget.RecyclerView.AbstractC7684 f24102;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f24103;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean f24104;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public int f24105;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public Yue.C6875.AbstractC6880 f24106;

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ, reason: contains not printable characters */
    public class C6876 extends Yue.C6875.AbstractC6882 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6875 f24107;

        public C6876(Yue.C6875 r1) {
                r0 = this;
                r0.f24107 = r1
                r1 = 0
                r0.<init>(r1)
                return
        }

        @Override // Yue.C6875.AbstractC6882, androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public void onChanged() {
                r2 = this;
                Yue.ۥۢۤۦۢ r0 = r2.f24107
                r1 = 1
                r0.f24091 = r1
                Yue.ۥۡۧۥ۠ r0 = r0.f24098
                r0.m20757()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟, reason: contains not printable characters */
    public class C6877 extends Yue.C6875.AbstractC6885 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6875 f24108;

        public C6877(Yue.C6875 r1) {
                r0 = this;
                r0.f24108 = r1
                r0.<init>()
                return
        }

        @Override // Yue.C6875.AbstractC6885
        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                if (r1 != 0) goto L7
                Yue.ۥۢۤۦۢ r1 = r0.f24108
                r1.m26657()
            L7:
                return
        }

        @Override // Yue.C6875.AbstractC6885
        public void onPageSelected(int r3) {
                r2 = this;
                Yue.ۥۢۤۦۢ r0 = r2.f24108
                int r1 = r0.f24090
                if (r1 == r3) goto Ld
                r0.f24090 = r3
                Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r3 = r0.f24106
                r3.mo26676()
            Ld:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟, reason: contains not printable characters */
    public class C6878 extends Yue.C6875.AbstractC6885 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6875 f24109;

        public C6878(Yue.C6875 r1) {
                r0 = this;
                r0.f24109 = r1
                r0.<init>()
                return
        }

        @Override // Yue.C6875.AbstractC6885
        public void onPageSelected(int r2) {
                r1 = this;
                Yue.ۥۢۤۦۢ r2 = r1.f24109
                r2.clearFocus()
                Yue.ۥۢۤۦۢ r2 = r1.f24109
                boolean r2 = r2.hasFocus()
                if (r2 == 0) goto L15
                Yue.ۥۢۤۦۢ r2 = r1.f24109
                androidx.recyclerview.widget.RecyclerView r2 = r2.f24096
                r0 = 2
                r2.requestFocus(r0)
            L15:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟, reason: contains not printable characters */
    public class C6879 implements androidx.recyclerview.widget.RecyclerView.InterfaceC7697 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6875 f24110;

        public C6879(Yue.C6875 r1) {
                r0 = this;
                r0.f24110 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC7697
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public void mo26658(@Yue.InterfaceC4410 android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC7697
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo26659(@Yue.InterfaceC4410 android.view.View r3) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۟ r3 = (androidx.recyclerview.widget.RecyclerView.C7696) r3
                int r0 = r3.width
                r1 = -1
                if (r0 != r1) goto L10
                int r3 = r3.height
                if (r3 != r1) goto L10
                return
            L10:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.String r0 = "Pages must fill the whole ViewPager2 (use match_parent)"
                r3.<init>(r0)
                throw r3
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟۟, reason: contains not printable characters */
    public abstract class AbstractC6880 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6875 f24111;

        public AbstractC6880(Yue.C6875 r1) {
                r0 = this;
                r0.f24111 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ AbstractC6880(Yue.C6875 r1, Yue.C6875.C6876 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean mo26660() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean mo26661(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean mo26662(int r1, android.os.Bundle r2) {
                r0 = this;
                r1 = 0
                return r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean mo26663() {
                r1 = this;
                r0 = 0
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void mo26664(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678<?> r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public void mo26665(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678<?> r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public java.lang.String mo26666() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Not implemented."
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void mo26667(@Yue.InterfaceC4410 Yue.C1433 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo26668(android.view.accessibility.AccessibilityNodeInfo r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo26669(@Yue.InterfaceC4410 Yue.C0140 r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public boolean mo26670(int r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Not implemented."
                r2.<init>(r0)
                throw r2
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public boolean mo26671(int r1, android.os.Bundle r2) {
                r0 = this;
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Not implemented."
                r1.<init>(r2)
                throw r1
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public void mo26672() {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public java.lang.CharSequence mo26673() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Not implemented."
                r0.<init>(r1)
                throw r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public void mo26674(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r1) {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
        public void mo26675() {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
        public void mo26676() {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
        public void mo26677() {
                r0 = this;
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
        public void mo26678() {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C6881 extends Yue.C6875.AbstractC6880 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6875 f24112;

        public C6881(Yue.C6875 r2) {
                r1 = this;
                r1.f24112 = r2
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo26661(int r2) {
                r1 = this;
                r0 = 8192(0x2000, float:1.148E-41)
                if (r2 == r0) goto L8
                r0 = 4096(0x1000, float:5.74E-42)
                if (r2 != r0) goto L12
            L8:
                Yue.ۥۢۤۦۢ r2 = r1.f24112
                boolean r2 = r2.m26644()
                if (r2 != 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo26663() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        public void mo26669(@Yue.InterfaceC4410 Yue.C0140 r2) {
                r1 = this;
                Yue.ۥۢۤۦۢ r0 = r1.f24112
                boolean r0 = r0.m26644()
                if (r0 != 0) goto L16
                Yue.ۥ۟۟ۥۧ$ۥ r0 = Yue.C0140.C0141.f329
                r2.m719(r0)
                Yue.ۥ۟۟ۥۧ$ۥ r0 = Yue.C0140.C0141.f328
                r2.m719(r0)
                r0 = 0
                r2.m773(r0)
            L16:
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public boolean mo26670(int r1) {
                r0 = this;
                boolean r1 = r0.mo26661(r1)
                if (r1 == 0) goto L8
                r1 = 0
                return r1
            L8:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                r1.<init>()
                throw r1
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public java.lang.CharSequence mo26673() {
                r1 = this;
                boolean r0 = r1.mo26663()
                if (r0 == 0) goto L9
                java.lang.String r0 = "androidx.viewpager.widget.ViewPager"
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static abstract class AbstractC6882 extends androidx.recyclerview.widget.RecyclerView.AbstractC7680 {
        public AbstractC6882() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ AbstractC6882(Yue.C6875.C6876 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public final void onItemRangeChanged(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public final void onItemRangeChanged(int r1, int r2, @Yue.InterfaceC4544 java.lang.Object r3) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public final void onItemRangeInserted(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public final void onItemRangeMoved(int r1, int r2, int r3) {
                r0 = this;
                r0.onChanged()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7680
        public final void onItemRangeRemoved(int r1, int r2) {
                r0 = this;
                r0.onChanged()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    public class C6883 extends androidx.recyclerview.widget.LinearLayoutManager {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6875 f24113;

        public C6883(Yue.C6875 r1, android.content.Context r2) {
                r0 = this;
                r0.f24113 = r1
                r0.<init>(r2)
                return
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void calculateExtraLayoutSpace(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r3, @Yue.InterfaceC4410 int[] r4) {
                r2 = this;
                Yue.ۥۢۤۦۢ r0 = r2.f24113
                int r0 = r0.getOffscreenPageLimit()
                r1 = -1
                if (r0 != r1) goto Ld
                super.calculateExtraLayoutSpace(r3, r4)
                return
            Ld:
                Yue.ۥۢۤۦۢ r3 = r2.f24113
                int r3 = r3.getPageSize()
                int r3 = r3 * r0
                r0 = 0
                r4[r0] = r3
                r0 = 1
                r4[r0] = r3
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
        public void onInitializeAccessibilityNodeInfo(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r2, @Yue.InterfaceC4410 Yue.C0140 r3) {
                r0 = this;
                super.onInitializeAccessibilityNodeInfo(r1, r2, r3)
                Yue.ۥۢۤۦۢ r1 = r0.f24113
                Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r1 = r1.f24106
                r1.mo26669(r3)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
        public boolean performAccessibilityAction(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7704 r2, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.C7713 r3, int r4, @Yue.InterfaceC4544 android.os.Bundle r5) {
                r1 = this;
                Yue.ۥۢۤۦۢ r0 = r1.f24113
                Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r0.f24106
                boolean r0 = r0.mo26661(r4)
                if (r0 == 0) goto L13
                Yue.ۥۢۤۦۢ r2 = r1.f24113
                Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r2 = r2.f24106
                boolean r2 = r2.mo26670(r4)
                return r2
            L13:
                boolean r2 = super.performAccessibilityAction(r2, r3, r4, r5)
                return r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC7691
        public boolean requestChildRectangleOnScreen(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r1, @Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4410 android.graphics.Rect r3, boolean r4, boolean r5) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥۣ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC3281(from = 1)
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC6884 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static abstract class AbstractC6885 {
        public AbstractC6885() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                return
        }

        public void onPageScrolled(int r1, float r2, @Yue.InterfaceC4992 int r3) {
                r0 = this;
                return
        }

        public void onPageSelected(int r1) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC6886 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ, reason: contains not printable characters */
    public class C6887 extends Yue.C6875.AbstractC6880 {

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final Yue.InterfaceC0160 f24114;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final Yue.InterfaceC0160 f24115;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public androidx.recyclerview.widget.RecyclerView.AbstractC7680 f24116;

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6875 f24117;

        /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ, reason: contains not printable characters */
        public class C6888 implements Yue.InterfaceC0160 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C6875.C6887 f24118;

            public C6888(Yue.C6875.C6887 r1) {
                    r0 = this;
                    r0.f24118 = r1
                    r0.<init>()
                    return
            }

            @Override // Yue.InterfaceC0160
            public boolean perform(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 Yue.InterfaceC0160.AbstractC0161 r3) {
                    r1 = this;
                    Yue.ۥۢۤۦۢ r2 = (Yue.C6875) r2
                    Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ r3 = r1.f24118
                    int r2 = r2.getCurrentItem()
                    r0 = 1
                    int r2 = r2 + r0
                    r3.m26681(r2)
                    return r0
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟, reason: contains not printable characters */
        public class C6889 implements Yue.InterfaceC0160 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C6875.C6887 f24119;

            public C6889(Yue.C6875.C6887 r1) {
                    r0 = this;
                    r0.f24119 = r1
                    r0.<init>()
                    return
            }

            @Override // Yue.InterfaceC0160
            public boolean perform(@Yue.InterfaceC4410 android.view.View r2, @Yue.InterfaceC4544 Yue.InterfaceC0160.AbstractC0161 r3) {
                    r1 = this;
                    Yue.ۥۢۤۦۢ r2 = (Yue.C6875) r2
                    Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ r3 = r1.f24119
                    int r2 = r2.getCurrentItem()
                    r0 = 1
                    int r2 = r2 - r0
                    r3.m26681(r2)
                    return r0
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟۟, reason: contains not printable characters */
        public class C6890 extends Yue.C6875.AbstractC6882 {

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C6875.C6887 f24120;

            public C6890(Yue.C6875.C6887 r1) {
                    r0 = this;
                    r0.f24120 = r1
                    r1 = 0
                    r0.<init>(r1)
                    return
            }

            @Override // Yue.C6875.AbstractC6882, androidx.recyclerview.widget.RecyclerView.AbstractC7680
            public void onChanged() {
                    r1 = this;
                    Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ r0 = r1.f24120
                    r0.m26682()
                    return
            }
        }

        public C6887(Yue.C6875 r2) {
                r1 = this;
                r1.f24117 = r2
                r0 = 0
                r1.<init>(r2, r0)
                Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ r2 = new Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ
                r2.<init>(r1)
                r1.f24114 = r2
                Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟ r2 = new Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟
                r2.<init>(r1)
                r1.f24115 = r2
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ */
        public boolean mo26660() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo26662(int r1, android.os.Bundle r2) {
                r0 = this;
                r2 = 8192(0x2000, float:1.148E-41)
                if (r1 == r2) goto Lb
                r2 = 4096(0x1000, float:5.74E-42)
                if (r1 != r2) goto L9
                goto Lb
            L9:
                r1 = 0
                goto Lc
            Lb:
                r1 = 1
            Lc:
                return r1
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public void mo26664(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678<?> r2) {
                r1 = this;
                r1.m26682()
                if (r2 == 0) goto La
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟ r0 = r1.f24116
                r2.registerAdapterDataObserver(r0)
            La:
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        public void mo26665(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678<?> r2) {
                r1 = this;
                if (r2 == 0) goto L7
                androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟ r0 = r1.f24116
                r2.unregisterAdapterDataObserver(r0)
            L7:
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        public java.lang.String mo26666() {
                r1 = this;
                boolean r0 = r1.mo26660()
                if (r0 == 0) goto L9
                java.lang.String r0 = "androidx.viewpager.widget.ViewPager"
                return r0
            L9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        public void mo26667(@Yue.InterfaceC4410 Yue.C1433 r1, @Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                r1 = 2
                Yue.C6794.m26241(r2, r1)
                Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟۟ r1 = new Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ$ۥ۟۟
                r1.<init>(r0)
                r0.f24116 = r1
                Yue.ۥۢۤۦۢ r1 = r0.f24117
                int r1 = Yue.C6794.m26135(r1)
                if (r1 != 0) goto L19
                Yue.ۥۢۤۦۢ r1 = r0.f24117
                r2 = 1
                Yue.C6794.m26241(r1, r2)
            L19:
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo26668(android.view.accessibility.AccessibilityNodeInfo r1) {
                r0 = this;
                r0.m26679(r1)
                r0.m26680(r1)
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public boolean mo26671(int r2, android.os.Bundle r3) {
                r1 = this;
                boolean r3 = r1.mo26662(r2, r3)
                if (r3 == 0) goto L1e
                r3 = 8192(0x2000, float:1.148E-41)
                r0 = 1
                if (r2 != r3) goto L13
                Yue.ۥۢۤۦۢ r2 = r1.f24117
                int r2 = r2.getCurrentItem()
                int r2 = r2 - r0
                goto L1a
            L13:
                Yue.ۥۢۤۦۢ r2 = r1.f24117
                int r2 = r2.getCurrentItem()
                int r2 = r2 + r0
            L1a:
                r1.m26681(r2)
                return r0
            L1e:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>()
                throw r2
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        public void mo26672() {
                r0 = this;
                r0.m26682()
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public void mo26674(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                Yue.ۥۢۤۦۢ r0 = r1.f24117
                r2.setSource(r0)
                java.lang.String r0 = r1.mo26666()
                r2.setClassName(r0)
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۠۟ */
        public void mo26675() {
                r0 = this;
                r0.m26682()
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۠۠ */
        public void mo26676() {
                r0 = this;
                r0.m26682()
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
        public void mo26677() {
                r0 = this;
                r0.m26682()
                return
        }

        @Override // Yue.C6875.AbstractC6880
        /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
        public void mo26678() {
                r0 = this;
                r0.m26682()
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final void m26679(android.view.accessibility.AccessibilityNodeInfo r4) {
                r3 = this;
                Yue.ۥۢۤۦۢ r0 = r3.f24117
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.getAdapter()
                r1 = 0
                if (r0 == 0) goto L2b
                Yue.ۥۢۤۦۢ r0 = r3.f24117
                int r0 = r0.getOrientation()
                r2 = 1
                if (r0 != r2) goto L1e
                Yue.ۥۢۤۦۢ r0 = r3.f24117
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.getAdapter()
                int r0 = r0.getItemCount()
                r2 = r1
                goto L2d
            L1e:
                Yue.ۥۢۤۦۢ r0 = r3.f24117
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.getAdapter()
                int r0 = r0.getItemCount()
                r2 = r0
                r0 = r1
                goto L2d
            L2b:
                r0 = r1
                r2 = r0
            L2d:
                Yue.ۥ۟۟ۥۧ r4 = Yue.C0140.m624(r4)
                Yue.ۥ۟۟ۥۧ$ۥ۟۟۟۠ r0 = Yue.C0140.C0146.m824(r0, r2, r1, r1)
                r4.m735(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final void m26680(android.view.accessibility.AccessibilityNodeInfo r4) {
                r3 = this;
                Yue.ۥۢۤۦۢ r0 = r3.f24117
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.getAdapter()
                if (r0 != 0) goto L9
                return
            L9:
                int r0 = r0.getItemCount()
                if (r0 == 0) goto L33
                Yue.ۥۢۤۦۢ r1 = r3.f24117
                boolean r1 = r1.m26644()
                if (r1 != 0) goto L18
                goto L33
            L18:
                Yue.ۥۢۤۦۢ r1 = r3.f24117
                int r1 = r1.f24090
                if (r1 <= 0) goto L23
                r1 = 8192(0x2000, float:1.148E-41)
                r4.addAction(r1)
            L23:
                Yue.ۥۢۤۦۢ r1 = r3.f24117
                int r1 = r1.f24090
                r2 = 1
                int r0 = r0 - r2
                if (r1 >= r0) goto L30
                r0 = 4096(0x1000, float:5.74E-42)
                r4.addAction(r0)
            L30:
                r4.setScrollable(r2)
            L33:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public void m26681(int r3) {
                r2 = this;
                Yue.ۥۢۤۦۢ r0 = r2.f24117
                boolean r0 = r0.m26644()
                if (r0 == 0) goto Le
                Yue.ۥۢۤۦۢ r0 = r2.f24117
                r1 = 1
                r0.m26652(r3, r1)
            Le:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public void m26682() {
                r8 = this;
                Yue.ۥۢۤۦۢ r0 = r8.f24117
                r1 = 16908360(0x1020048, float:2.387743E-38)
                Yue.C6794.m26213(r0, r1)
                r2 = 16908361(0x1020049, float:2.3877434E-38)
                Yue.C6794.m26213(r0, r2)
                r3 = 16908358(0x1020046, float:2.3877425E-38)
                Yue.C6794.m26213(r0, r3)
                r4 = 16908359(0x1020047, float:2.3877428E-38)
                Yue.C6794.m26213(r0, r4)
                Yue.ۥۢۤۦۢ r5 = r8.f24117
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r5 = r5.getAdapter()
                if (r5 != 0) goto L23
                return
            L23:
                Yue.ۥۢۤۦۢ r5 = r8.f24117
                androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r5 = r5.getAdapter()
                int r5 = r5.getItemCount()
                if (r5 != 0) goto L30
                return
            L30:
                Yue.ۥۢۤۦۢ r6 = r8.f24117
                boolean r6 = r6.m26644()
                if (r6 != 0) goto L39
                return
            L39:
                Yue.ۥۢۤۦۢ r6 = r8.f24117
                int r6 = r6.getOrientation()
                r7 = 0
                if (r6 != 0) goto L73
                Yue.ۥۢۤۦۢ r3 = r8.f24117
                boolean r3 = r3.m26643()
                if (r3 == 0) goto L4c
                r4 = r1
                goto L4d
            L4c:
                r4 = r2
            L4d:
                if (r3 == 0) goto L50
                r1 = r2
            L50:
                Yue.ۥۢۤۦۢ r2 = r8.f24117
                int r2 = r2.f24090
                int r5 = r5 + (-1)
                if (r2 >= r5) goto L62
                Yue.ۥ۟۟ۥۧ$ۥ r2 = new Yue.ۥ۟۟ۥۧ$ۥ
                r2.<init>(r4, r7)
                Yue.ۥ۟۟ۦۤ r3 = r8.f24114
                Yue.C6794.m26216(r0, r2, r7, r3)
            L62:
                Yue.ۥۢۤۦۢ r2 = r8.f24117
                int r2 = r2.f24090
                if (r2 <= 0) goto L95
                Yue.ۥ۟۟ۥۧ$ۥ r2 = new Yue.ۥ۟۟ۥۧ$ۥ
                r2.<init>(r1, r7)
                Yue.ۥ۟۟ۦۤ r1 = r8.f24115
                Yue.C6794.m26216(r0, r2, r7, r1)
                goto L95
            L73:
                Yue.ۥۢۤۦۢ r1 = r8.f24117
                int r1 = r1.f24090
                int r5 = r5 + (-1)
                if (r1 >= r5) goto L85
                Yue.ۥ۟۟ۥۧ$ۥ r1 = new Yue.ۥ۟۟ۥۧ$ۥ
                r1.<init>(r4, r7)
                Yue.ۥ۟۟ۦۤ r2 = r8.f24114
                Yue.C6794.m26216(r0, r1, r7, r2)
            L85:
                Yue.ۥۢۤۦۢ r1 = r8.f24117
                int r1 = r1.f24090
                if (r1 <= 0) goto L95
                Yue.ۥ۟۟ۥۧ$ۥ r1 = new Yue.ۥ۟۟ۥۧ$ۥ
                r1.<init>(r3, r7)
                Yue.ۥ۟۟ۦۤ r2 = r8.f24115
                Yue.C6794.m26216(r0, r1, r7, r2)
            L95:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ, reason: contains not printable characters */
    public interface InterfaceC6891 {
        /* JADX INFO: renamed from: ۥ */
        void mo7075(@Yue.InterfaceC4410 android.view.View r1, float r2);
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۟ۨ, reason: contains not printable characters */
    public class C6892 extends androidx.recyclerview.widget.C7794 {

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6875 f24121;

        public C6892(Yue.C6875 r1) {
                r0 = this;
                r0.f24121 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.C7794, androidx.recyclerview.widget.AbstractC7800
        @Yue.InterfaceC4544
        public android.view.View findSnapView(androidx.recyclerview.widget.RecyclerView.AbstractC7691 r2) {
                r1 = this;
                Yue.ۥۢۤۦۢ r0 = r1.f24121
                boolean r0 = r0.m26642()
                if (r0 == 0) goto La
                r2 = 0
                goto Le
            La:
                android.view.View r2 = super.findSnapView(r2)
            Le:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۠, reason: contains not printable characters */
    public class C6893 extends androidx.recyclerview.widget.RecyclerView {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6875 f24122;

        public C6893(@Yue.InterfaceC4410 Yue.C6875 r1, android.content.Context r2) {
                r0 = this;
                r0.f24122 = r1
                r0.<init>(r2)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @Yue.InterfaceC5336(23)
        public java.lang.CharSequence getAccessibilityClassName() {
                r1 = this;
                Yue.ۥۢۤۦۢ r0 = r1.f24122
                Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r0.f24106
                boolean r0 = r0.mo26663()
                if (r0 == 0) goto L13
                Yue.ۥۢۤۦۢ r0 = r1.f24122
                Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r0.f24106
                java.lang.CharSequence r0 = r0.mo26673()
                return r0
            L13:
                java.lang.CharSequence r0 = super.getAccessibilityClassName()
                return r0
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@Yue.InterfaceC4410 android.view.accessibility.AccessibilityEvent r2) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2)
                Yue.ۥۢۤۦۢ r0 = r1.f24122
                int r0 = r0.f24090
                r2.setFromIndex(r0)
                Yue.ۥۢۤۦۢ r0 = r1.f24122
                int r0 = r0.f24090
                r2.setToIndex(r0)
                Yue.ۥۢۤۦۢ r0 = r1.f24122
                Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r0.f24106
                r0.mo26674(r2)
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(android.view.MotionEvent r2) {
                r1 = this;
                Yue.ۥۢۤۦۢ r0 = r1.f24122
                boolean r0 = r0.m26644()
                if (r0 == 0) goto L10
                boolean r2 = super.onInterceptTouchEvent(r2)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @android.annotation.SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(android.view.MotionEvent r2) {
                r1 = this;
                Yue.ۥۢۤۦۢ r0 = r1.f24122
                boolean r0 = r0.m26644()
                if (r0 == 0) goto L10
                boolean r2 = super.onTouchEvent(r2)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۠۟, reason: contains not printable characters */
    public static class C6894 extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<Yue.C6875.C6894> CREATOR = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f24123;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f24124;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public android.os.Parcelable f24125;

        /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۠۟$ۥ, reason: contains not printable characters */
        public static class C6895 implements android.os.Parcelable.ClassLoaderCreator<Yue.C6875.C6894> {
            public C6895() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    Yue.ۥۢۤۦۢ$ۥ۟۟۠۟ r1 = r0.m26684(r1)
                    return r1
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* bridge */ /* synthetic */ Yue.C6875.C6894 createFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    Yue.ۥۢۤۦۢ$ۥ۟۟۠۟ r1 = r0.m26685(r1, r2)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
                    r0 = this;
                    Yue.ۥۢۤۦۢ$ۥ۟۟۠۟[] r1 = r0.m26686(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public Yue.C6875.C6894 m26684(android.os.Parcel r2) {
                    r1 = this;
                    r0 = 0
                    Yue.ۥۢۤۦۢ$ۥ۟۟۠۟ r2 = r1.m26685(r2, r0)
                    return r2
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public Yue.C6875.C6894 m26685(android.os.Parcel r2, java.lang.ClassLoader r3) {
                    r1 = this;
                    Yue.ۥۢۤۦۢ$ۥ۟۟۠۟ r0 = new Yue.ۥۢۤۦۢ$ۥ۟۟۠۟
                    r0.<init>(r2, r3)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
            public Yue.C6875.C6894[] m26686(int r1) {
                    r0 = this;
                    Yue.ۥۢۤۦۢ$ۥ۟۟۠۟[] r1 = new Yue.C6875.C6894[r1]
                    return r1
            }
        }

        static {
                Yue.ۥۢۤۦۢ$ۥ۟۟۠۟$ۥ r0 = new Yue.ۥۢۤۦۢ$ۥ۟۟۠۟$ۥ
                r0.<init>()
                Yue.C6875.C6894.CREATOR = r0
                return
        }

        public C6894(android.os.Parcel r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.m26683(r2, r0)
                return
        }

        @Yue.InterfaceC5336(24)
        public C6894(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.m26683(r1, r2)
                return
        }

        public C6894(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                int r0 = r1.f24123
                r2.writeInt(r0)
                int r0 = r1.f24124
                r2.writeInt(r0)
                android.os.Parcelable r0 = r1.f24125
                r2.writeParcelable(r0, r3)
                return
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m26683(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                int r0 = r2.readInt()
                r1.f24123 = r0
                int r0 = r2.readInt()
                r1.f24124 = r0
                android.os.Parcelable r2 = r2.readParcelable(r3)
                r1.f24125 = r2
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۠۠, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface InterfaceC6896 {
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۢ$ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static class RunnableC6897 implements java.lang.Runnable {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int f24126;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final androidx.recyclerview.widget.RecyclerView f24127;

        public RunnableC6897(int r1, androidx.recyclerview.widget.RecyclerView r2) {
                r0 = this;
                r0.<init>()
                r0.f24126 = r1
                r0.f24127 = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r0 = r2.f24127
                int r1 = r2.f24126
                r0.smoothScrollToPosition(r1)
                return
        }
    }

    static {
            return
    }

    public C6875(@Yue.InterfaceC4410 android.content.Context r4) {
            r3 = this;
            r3.<init>(r4)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f24087 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f24088 = r0
            Yue.ۥ۟ۦۤۧ r0 = new Yue.ۥ۟ۦۤۧ
            r1 = 3
            r0.<init>(r1)
            r3.f24089 = r0
            r0 = 0
            r3.f24091 = r0
            Yue.ۥۢۤۦۢ$ۥ r1 = new Yue.ۥۢۤۦۢ$ۥ
            r1.<init>(r3)
            r3.f24092 = r1
            r1 = -1
            r3.f24094 = r1
            r2 = 0
            r3.f24102 = r2
            r3.f24103 = r0
            r0 = 1
            r3.f24104 = r0
            r3.f24105 = r1
            r3.m26640(r4, r2)
            return
    }

    public C6875(@Yue.InterfaceC4410 android.content.Context r4, @Yue.InterfaceC4544 android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f24087 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r3.f24088 = r0
            Yue.ۥ۟ۦۤۧ r0 = new Yue.ۥ۟ۦۤۧ
            r1 = 3
            r0.<init>(r1)
            r3.f24089 = r0
            r0 = 0
            r3.f24091 = r0
            Yue.ۥۢۤۦۢ$ۥ r1 = new Yue.ۥۢۤۦۢ$ۥ
            r1.<init>(r3)
            r3.f24092 = r1
            r1 = -1
            r3.f24094 = r1
            r2 = 0
            r3.f24102 = r2
            r3.f24103 = r0
            r0 = 1
            r3.f24104 = r0
            r3.f24105 = r1
            r3.m26640(r4, r5)
            return
    }

    public C6875(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4544 android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r2.f24087 = r5
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r2.f24088 = r5
            Yue.ۥ۟ۦۤۧ r5 = new Yue.ۥ۟ۦۤۧ
            r0 = 3
            r5.<init>(r0)
            r2.f24089 = r5
            r5 = 0
            r2.f24091 = r5
            Yue.ۥۢۤۦۢ$ۥ r0 = new Yue.ۥۢۤۦۢ$ۥ
            r0.<init>(r2)
            r2.f24092 = r0
            r0 = -1
            r2.f24094 = r0
            r1 = 0
            r2.f24102 = r1
            r2.f24103 = r5
            r5 = 1
            r2.f24104 = r5
            r2.f24105 = r0
            r2.m26640(r3, r4)
            return
    }

    @Yue.InterfaceC5336(21)
    public C6875(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3, int r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r1.f24087 = r4
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r1.f24088 = r4
            Yue.ۥ۟ۦۤۧ r4 = new Yue.ۥ۟ۦۤۧ
            r5 = 3
            r4.<init>(r5)
            r1.f24089 = r4
            r4 = 0
            r1.f24091 = r4
            Yue.ۥۢۤۦۢ$ۥ r5 = new Yue.ۥۢۤۦۢ$ۥ
            r5.<init>(r1)
            r1.f24092 = r5
            r5 = -1
            r1.f24094 = r5
            r0 = 0
            r1.f24102 = r0
            r1.f24103 = r4
            r4 = 1
            r1.f24104 = r4
            r1.f24105 = r5
            r1.m26640(r2, r3)
            return
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f24096
            boolean r2 = r0.canScrollHorizontally(r2)
            return r2
    }

    @Override // android.view.View
    public boolean canScrollVertically(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f24096
            boolean r2 = r0.canScrollVertically(r2)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r4) {
            r3 = this;
            int r0 = r3.getId()
            java.lang.Object r0 = r4.get(r0)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            boolean r1 = r0 instanceof Yue.C6875.C6894
            if (r1 == 0) goto L22
            Yue.ۥۢۤۦۢ$ۥ۟۟۠۟ r0 = (Yue.C6875.C6894) r0
            int r0 = r0.f24123
            androidx.recyclerview.widget.RecyclerView r1 = r3.f24096
            int r1 = r1.getId()
            java.lang.Object r2 = r4.get(r0)
            r4.put(r1, r2)
            r4.remove(r0)
        L22:
            super.dispatchRestoreInstanceState(r4)
            r3.m26650()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    @Yue.InterfaceC5336(23)
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r1.f24106
            boolean r0 = r0.mo26660()
            if (r0 == 0) goto Lf
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r1.f24106
            java.lang.String r0 = r0.mo26666()
            return r0
        Lf:
            java.lang.CharSequence r0 = super.getAccessibilityClassName()
            return r0
    }

    @Yue.InterfaceC4544
    public androidx.recyclerview.widget.RecyclerView.AbstractC7678 getAdapter() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f24096
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.getAdapter()
            return r0
    }

    public int getCurrentItem() {
            r1 = this;
            int r0 = r1.f24090
            return r0
    }

    public int getItemDecorationCount() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f24096
            int r0 = r0.getItemDecorationCount()
            return r0
    }

    public int getOffscreenPageLimit() {
            r1 = this;
            int r0 = r1.f24105
            return r0
    }

    public int getOrientation() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.f24093
            int r0 = r0.getOrientation()
            return r0
    }

    public int getPageSize() {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r3.f24096
            int r1 = r3.getOrientation()
            if (r1 != 0) goto L17
            int r1 = r0.getWidth()
            int r2 = r0.getPaddingLeft()
            int r1 = r1 - r2
            int r0 = r0.getPaddingRight()
        L15:
            int r1 = r1 - r0
            goto L25
        L17:
            int r1 = r0.getHeight()
            int r2 = r0.getPaddingTop()
            int r1 = r1 - r2
            int r0 = r0.getPaddingBottom()
            goto L15
        L25:
            return r1
    }

    public int getScrollState() {
            r1 = this;
            Yue.ۥۡۧۥ۠ r0 = r1.f24098
            int r0 = r0.m20751()
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r1.f24106
            r0.mo26668(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            androidx.recyclerview.widget.RecyclerView r4 = r3.f24096
            int r4 = r4.getMeasuredWidth()
            androidx.recyclerview.widget.RecyclerView r0 = r3.f24096
            int r0 = r0.getMeasuredHeight()
            android.graphics.Rect r1 = r3.f24087
            int r2 = r3.getPaddingLeft()
            r1.left = r2
            android.graphics.Rect r1 = r3.f24087
            int r7 = r7 - r5
            int r5 = r3.getPaddingRight()
            int r7 = r7 - r5
            r1.right = r7
            android.graphics.Rect r5 = r3.f24087
            int r7 = r3.getPaddingTop()
            r5.top = r7
            android.graphics.Rect r5 = r3.f24087
            int r8 = r8 - r6
            int r6 = r3.getPaddingBottom()
            int r8 = r8 - r6
            r5.bottom = r8
            android.graphics.Rect r5 = r3.f24087
            android.graphics.Rect r6 = r3.f24088
            r7 = 8388659(0x800033, float:1.1755015E-38)
            android.view.Gravity.apply(r7, r4, r0, r5, r6)
            androidx.recyclerview.widget.RecyclerView r4 = r3.f24096
            android.graphics.Rect r5 = r3.f24088
            int r6 = r5.left
            int r7 = r5.top
            int r8 = r5.right
            int r5 = r5.bottom
            r4.layout(r6, r7, r8, r5)
            boolean r4 = r3.f24091
            if (r4 == 0) goto L50
            r3.m26657()
        L50:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r6, int r7) {
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.f24096
            r5.measureChild(r0, r6, r7)
            androidx.recyclerview.widget.RecyclerView r0 = r5.f24096
            int r0 = r0.getMeasuredWidth()
            androidx.recyclerview.widget.RecyclerView r1 = r5.f24096
            int r1 = r1.getMeasuredHeight()
            androidx.recyclerview.widget.RecyclerView r2 = r5.f24096
            int r2 = r2.getMeasuredState()
            int r3 = r5.getPaddingLeft()
            int r4 = r5.getPaddingRight()
            int r3 = r3 + r4
            int r0 = r0 + r3
            int r3 = r5.getPaddingTop()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 + r4
            int r1 = r1 + r3
            int r3 = r5.getSuggestedMinimumWidth()
            int r0 = java.lang.Math.max(r0, r3)
            int r3 = r5.getSuggestedMinimumHeight()
            int r1 = java.lang.Math.max(r1, r3)
            int r6 = android.view.View.resolveSizeAndState(r0, r6, r2)
            int r0 = r2 << 16
            int r7 = android.view.View.resolveSizeAndState(r1, r7, r0)
            r5.setMeasuredDimension(r6, r7)
            return
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C6875.C6894
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            Yue.ۥۢۤۦۢ$ۥ۟۟۠۟ r2 = (Yue.C6875.C6894) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            int r0 = r2.f24124
            r1.f24094 = r0
            android.os.Parcelable r2 = r2.f24125
            r1.f24095 = r2
            return
    }

    @Override // android.view.View
    @Yue.InterfaceC4544
    public android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            Yue.ۥۢۤۦۢ$ۥ۟۟۠۟ r1 = new Yue.ۥۢۤۦۢ$ۥ۟۟۠۟
            r1.<init>(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.f24096
            int r0 = r0.getId()
            r1.f24123 = r0
            int r0 = r3.f24094
            r2 = -1
            if (r0 != r2) goto L18
            int r0 = r3.f24090
        L18:
            r1.f24124 = r0
            android.os.Parcelable r0 = r3.f24095
            if (r0 == 0) goto L21
            r1.f24125 = r0
            goto L33
        L21:
            androidx.recyclerview.widget.RecyclerView r0 = r3.f24096
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.getAdapter()
            boolean r2 = r0 instanceof Yue.InterfaceC5948
            if (r2 == 0) goto L33
            Yue.ۥۢ۠۟ۦ r0 = (Yue.InterfaceC5948) r0
            android.os.Parcelable r0 = r0.saveState()
            r1.f24125 = r0
        L33:
            return r1
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View r3) {
            r2 = this;
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<Yue.ۥۢۤۦۢ> r1 = Yue.C6875.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = " does not support direct child views"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // android.view.View
    @Yue.InterfaceC5336(16)
    public boolean performAccessibilityAction(int r2, android.os.Bundle r3) {
            r1 = this;
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r1.f24106
            boolean r0 = r0.mo26662(r2, r3)
            if (r0 == 0) goto Lf
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r1.f24106
            boolean r2 = r0.mo26671(r2, r3)
            return r2
        Lf:
            boolean r2 = super.performAccessibilityAction(r2, r3)
            return r2
    }

    public void setAdapter(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678 r3) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.f24096
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r0.getAdapter()
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r1 = r2.f24106
            r1.mo26665(r0)
            r2.m26655(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.f24096
            r0.setAdapter(r3)
            r0 = 0
            r2.f24090 = r0
            r2.m26650()
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r2.f24106
            r0.mo26664(r3)
            r2.m26645(r3)
            return
    }

    public void setCurrentItem(int r2) {
            r1 = this;
            r0 = 1
            r1.m26651(r2, r0)
            return
    }

    @Override // android.view.View
    @Yue.InterfaceC5336(17)
    public void setLayoutDirection(int r1) {
            r0 = this;
            super.setLayoutDirection(r1)
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r1 = r0.f24106
            r1.mo26675()
            return
    }

    public void setOffscreenPageLimit(int r2) {
            r1 = this;
            r0 = 1
            if (r2 >= r0) goto Lf
            r0 = -1
            if (r2 != r0) goto L7
            goto Lf
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0"
            r2.<init>(r0)
            throw r2
        Lf:
            r1.f24105 = r2
            androidx.recyclerview.widget.RecyclerView r2 = r1.f24096
            r2.requestLayout()
            return
    }

    public void setOrientation(int r2) {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.f24093
            r0.setOrientation(r2)
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r2 = r1.f24106
            r2.mo26677()
            return
    }

    public void setPageTransformer(@Yue.InterfaceC4544 Yue.C6875.InterfaceC6891 r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L18
            boolean r1 = r3.f24103
            if (r1 != 0) goto L12
            androidx.recyclerview.widget.RecyclerView r1 = r3.f24096
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r1 = r1.getItemAnimator()
            r3.f24102 = r1
            r1 = 1
            r3.f24103 = r1
        L12:
            androidx.recyclerview.widget.RecyclerView r1 = r3.f24096
            r1.setItemAnimator(r0)
            goto L28
        L18:
            boolean r1 = r3.f24103
            if (r1 == 0) goto L28
            androidx.recyclerview.widget.RecyclerView r1 = r3.f24096
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۦ r2 = r3.f24102
            r1.setItemAnimator(r2)
            r3.f24102 = r0
            r0 = 0
            r3.f24103 = r0
        L28:
            Yue.ۥۣۡۥۥ r0 = r3.f24101
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ r0 = r0.m18511()
            if (r4 != r0) goto L31
            return
        L31:
            Yue.ۥۣۡۥۥ r0 = r3.f24101
            r0.m18512(r4)
            r3.m26649()
            return
    }

    public void setUserInputEnabled(boolean r1) {
            r0 = this;
            r0.f24104 = r1
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r1 = r0.f24106
            r1.mo26678()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m26633(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7690 r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f24096
            r0.addItemDecoration(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m26634(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7690 r2, int r3) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f24096
            r0.addItemDecoration(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m26635() {
            r1 = this;
            Yue.ۥ۠ۡۦۢ r0 = r1.f24100
            boolean r0 = r0.m10704()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public boolean m26636() {
            r1 = this;
            Yue.ۥ۠ۡۦۢ r0 = r1.f24100
            boolean r0 = r0.m10706()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final androidx.recyclerview.widget.RecyclerView.InterfaceC7697 m26637() {
            r1 = this;
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ r0 = new Yue.ۥۢۤۦۢ$ۥ۟۟۟
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m26638(@Yue.InterfaceC4992 @android.annotation.SuppressLint({"SupportAnnotationUsage"}) float r2) {
            r1 = this;
            Yue.ۥ۠ۡۦۢ r0 = r1.f24100
            boolean r2 = r0.m10707(r2)
            return r2
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public androidx.recyclerview.widget.RecyclerView.AbstractC7690 m26639(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f24096
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۨ r2 = r0.getItemDecorationAt(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final void m26640(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            boolean r0 = Yue.C6875.f24086
            if (r0 == 0) goto La
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ r0 = new Yue.ۥۢۤۦۢ$ۥ۟۟۟ۦ
            r0.<init>(r2)
            goto Lf
        La:
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۠ r0 = new Yue.ۥۢۤۦۢ$ۥ۟۟۟۠
            r0.<init>(r2)
        Lf:
            r2.f24106 = r0
            Yue.ۥۢۤۦۢ$ۥ۟۟۠ r0 = new Yue.ۥۢۤۦۢ$ۥ۟۟۠
            r0.<init>(r2, r3)
            r2.f24096 = r0
            int r1 = Yue.C6794.m26115()
            r0.setId(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.f24096
            r1 = 131072(0x20000, float:1.83671E-40)
            r0.setDescendantFocusability(r1)
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۢ r0 = new Yue.ۥۢۤۦۢ$ۥ۟۟۟ۢ
            r0.<init>(r2, r3)
            r2.f24093 = r0
            androidx.recyclerview.widget.RecyclerView r1 = r2.f24096
            r1.setLayoutManager(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r2.f24096
            r1 = 1
            r0.setScrollingTouchSlop(r1)
            r2.m26653(r3, r4)
            androidx.recyclerview.widget.RecyclerView r3 = r2.f24096
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r0 = -1
            r4.<init>(r0, r0)
            r3.setLayoutParams(r4)
            androidx.recyclerview.widget.RecyclerView r3 = r2.f24096
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۠۠ r4 = r2.m26637()
            r3.addOnChildAttachStateChangeListener(r4)
            Yue.ۥۡۧۥ۠ r3 = new Yue.ۥۡۧۥ۠
            r3.<init>(r2)
            r2.f24098 = r3
            Yue.ۥ۠ۡۦۢ r4 = new Yue.ۥ۠ۡۦۢ
            androidx.recyclerview.widget.RecyclerView r0 = r2.f24096
            r4.<init>(r2, r3, r0)
            r2.f24100 = r4
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۨ r3 = new Yue.ۥۢۤۦۢ$ۥ۟۟۟ۨ
            r3.<init>(r2)
            r2.f24097 = r3
            androidx.recyclerview.widget.RecyclerView r4 = r2.f24096
            r3.attachToRecyclerView(r4)
            androidx.recyclerview.widget.RecyclerView r3 = r2.f24096
            Yue.ۥۡۧۥ۠ r4 = r2.f24098
            r3.addOnScrollListener(r4)
            Yue.ۥ۟ۦۤۧ r3 = new Yue.ۥ۟ۦۤۧ
            r4 = 3
            r3.<init>(r4)
            r2.f24099 = r3
            Yue.ۥۡۧۥ۠ r4 = r2.f24098
            r4.m20761(r3)
            Yue.ۥۢۤۦۢ$ۥ۟ r3 = new Yue.ۥۢۤۦۢ$ۥ۟
            r3.<init>(r2)
            Yue.ۥۢۤۦۢ$ۥ۟۟ r4 = new Yue.ۥۢۤۦۢ$ۥ۟۟
            r4.<init>(r2)
            Yue.ۥ۟ۦۤۧ r0 = r2.f24099
            r0.m7072(r3)
            Yue.ۥ۟ۦۤۧ r3 = r2.f24099
            r3.m7072(r4)
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r3 = r2.f24106
            Yue.ۥ۟ۦۤۧ r4 = r2.f24099
            androidx.recyclerview.widget.RecyclerView r0 = r2.f24096
            r3.mo26667(r4, r0)
            Yue.ۥ۟ۦۤۧ r3 = r2.f24099
            Yue.ۥ۟ۦۤۧ r4 = r2.f24089
            r3.m7072(r4)
            Yue.ۥۣۡۥۥ r3 = new Yue.ۥۣۡۥۥ
            androidx.recyclerview.widget.LinearLayoutManager r4 = r2.f24093
            r3.<init>(r4)
            r2.f24101 = r3
            Yue.ۥ۟ۦۤۧ r4 = r2.f24099
            r4.m7072(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r2.f24096
            r4 = 0
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            r2.attachViewToParent(r3, r4, r0)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void m26641() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f24096
            r0.invalidateItemDecorations()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public boolean m26642() {
            r1 = this;
            Yue.ۥ۠ۡۦۢ r0 = r1.f24100
            boolean r0 = r0.m10708()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public boolean m26643() {
            r2 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = r2.f24093
            int r0 = r0.getLayoutDirection()
            r1 = 1
            if (r0 != r1) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public boolean m26644() {
            r1 = this;
            boolean r0 = r1.f24104
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m26645(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678<?> r2) {
            r1 = this;
            if (r2 == 0) goto L7
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟ r0 = r1.f24092
            r2.registerAdapterDataObserver(r0)
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void m26646(@Yue.InterfaceC4410 Yue.C6875.AbstractC6885 r2) {
            r1 = this;
            Yue.ۥ۟ۦۤۧ r0 = r1.f24089
            r0.m7072(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m26647(@Yue.InterfaceC4410 androidx.recyclerview.widget.RecyclerView.AbstractC7690 r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f24096
            r0.removeItemDecoration(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m26648(int r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.f24096
            r0.removeItemDecorationAt(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m26649() {
            r5 = this;
            Yue.ۥۣۡۥۥ r0 = r5.f24101
            Yue.ۥۢۤۦۢ$ۥ۟۟۟ۧ r0 = r0.m18511()
            if (r0 != 0) goto L9
            return
        L9:
            Yue.ۥۡۧۥ۠ r0 = r5.f24098
            double r0 = r0.m20750()
            int r2 = (int) r0
            double r3 = (double) r2
            double r0 = r0 - r3
            float r0 = (float) r0
            int r1 = r5.getPageSize()
            float r1 = (float) r1
            float r1 = r1 * r0
            int r1 = java.lang.Math.round(r1)
            Yue.ۥۣۡۥۥ r3 = r5.f24101
            r3.onPageScrolled(r2, r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public final void m26650() {
            r4 = this;
            int r0 = r4.f24094
            r1 = -1
            if (r0 != r1) goto L6
            return
        L6:
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r4.getAdapter()
            if (r0 != 0) goto Ld
            return
        Ld:
            android.os.Parcelable r2 = r4.f24095
            if (r2 == 0) goto L1e
            boolean r3 = r0 instanceof Yue.InterfaceC5948
            if (r3 == 0) goto L1b
            r3 = r0
            Yue.ۥۢ۠۟ۦ r3 = (Yue.InterfaceC5948) r3
            r3.mo22064(r2)
        L1b:
            r2 = 0
            r4.f24095 = r2
        L1e:
            int r2 = r4.f24094
            int r0 = r0.getItemCount()
            int r0 = r0 + (-1)
            int r0 = java.lang.Math.min(r2, r0)
            r2 = 0
            int r0 = java.lang.Math.max(r2, r0)
            r4.f24090 = r0
            r4.f24094 = r1
            androidx.recyclerview.widget.RecyclerView r1 = r4.f24096
            r1.scrollToPosition(r0)
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r0 = r4.f24106
            r0.mo26672()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m26651(int r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.m26642()
            if (r0 != 0) goto La
            r1.m26652(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Cannot change current item when ViewPager2 is fake dragging"
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void m26652(int r9, boolean r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟۟ۡ r0 = r8.getAdapter()
            r1 = 0
            if (r0 != 0) goto L13
            int r10 = r8.f24094
            r0 = -1
            if (r10 == r0) goto L12
            int r9 = java.lang.Math.max(r9, r1)
            r8.f24094 = r9
        L12:
            return
        L13:
            int r2 = r0.getItemCount()
            if (r2 > 0) goto L1a
            return
        L1a:
            int r9 = java.lang.Math.max(r9, r1)
            int r0 = r0.getItemCount()
            int r0 = r0 + (-1)
            int r9 = java.lang.Math.min(r9, r0)
            int r0 = r8.f24090
            if (r9 != r0) goto L35
            Yue.ۥۡۧۥ۠ r0 = r8.f24098
            boolean r0 = r0.m20754()
            if (r0 == 0) goto L35
            return
        L35:
            int r0 = r8.f24090
            if (r9 != r0) goto L3c
            if (r10 == 0) goto L3c
            return
        L3c:
            double r0 = (double) r0
            r8.f24090 = r9
            Yue.ۥۢۤۦۢ$ۥ۟۟۟۟ r2 = r8.f24106
            r2.mo26676()
            Yue.ۥۡۧۥ۠ r2 = r8.f24098
            boolean r2 = r2.m20754()
            if (r2 != 0) goto L52
            Yue.ۥۡۧۥ۠ r0 = r8.f24098
            double r0 = r0.m20750()
        L52:
            Yue.ۥۡۧۥ۠ r2 = r8.f24098
            r2.m20759(r9, r10)
            if (r10 != 0) goto L5f
            androidx.recyclerview.widget.RecyclerView r10 = r8.f24096
            r10.scrollToPosition(r9)
            return
        L5f:
            double r2 = (double) r9
            double r4 = r2 - r0
            double r4 = java.lang.Math.abs(r4)
            r6 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 <= 0) goto L85
            androidx.recyclerview.widget.RecyclerView r10 = r8.f24096
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L75
            int r0 = r9 + (-3)
            goto L77
        L75:
            int r0 = r9 + 3
        L77:
            r10.scrollToPosition(r0)
            androidx.recyclerview.widget.RecyclerView r10 = r8.f24096
            Yue.ۥۢۤۦۢ$ۥ۟۟۠ۡ r0 = new Yue.ۥۢۤۦۢ$ۥ۟۟۠ۡ
            r0.<init>(r9, r10)
            r10.post(r0)
            goto L8a
        L85:
            androidx.recyclerview.widget.RecyclerView r10 = r8.f24096
            r10.smoothScrollToPosition(r9)
        L8a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final void m26653(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            int[] r0 = Yue.C5142.C5152.f19079
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L17
            int[] r3 = Yue.C5142.C5152.f19079
            r6 = 0
            r7 = 0
            r1 = r8
            r2 = r9
            r4 = r10
            r5 = r0
            Yue.C6874.m26632(r1, r2, r3, r4, r5, r6, r7)
        L17:
            int r9 = Yue.C5142.C5152.f19080     // Catch: java.lang.Throwable -> L25
            r10 = 0
            int r9 = r0.getInt(r9, r10)     // Catch: java.lang.Throwable -> L25
            r8.setOrientation(r9)     // Catch: java.lang.Throwable -> L25
            r0.recycle()
            return
        L25:
            r9 = move-exception
            r0.recycle()
            throw r9
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void m26654() {
            r4 = this;
            androidx.recyclerview.widget.ۥ۟۟۠ۡ r0 = r4.f24097
            androidx.recyclerview.widget.LinearLayoutManager r1 = r4.f24093
            android.view.View r0 = r0.findSnapView(r1)
            if (r0 != 0) goto Lb
            return
        Lb:
            androidx.recyclerview.widget.ۥ۟۟۠ۡ r1 = r4.f24097
            androidx.recyclerview.widget.LinearLayoutManager r2 = r4.f24093
            int[] r0 = r1.calculateDistanceToFinalSnap(r2, r0)
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            if (r1 != 0) goto L1d
            r3 = r0[r2]
            if (r3 == 0) goto L24
        L1d:
            androidx.recyclerview.widget.RecyclerView r3 = r4.f24096
            r0 = r0[r2]
            r3.smoothScrollBy(r1, r0)
        L24:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m26655(@Yue.InterfaceC4544 androidx.recyclerview.widget.RecyclerView.AbstractC7678<?> r2) {
            r1 = this;
            if (r2 == 0) goto L7
            androidx.recyclerview.widget.RecyclerView$ۥۣ۟۟۟ r0 = r1.f24092
            r2.unregisterAdapterDataObserver(r0)
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void m26656(@Yue.InterfaceC4410 Yue.C6875.AbstractC6885 r2) {
            r1 = this;
            Yue.ۥ۟ۦۤۧ r0 = r1.f24089
            r0.m7073(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void m26657() {
            r2 = this;
            androidx.recyclerview.widget.ۥ۟۟۠ۡ r0 = r2.f24097
            if (r0 == 0) goto L26
            androidx.recyclerview.widget.LinearLayoutManager r1 = r2.f24093
            android.view.View r0 = r0.findSnapView(r1)
            if (r0 != 0) goto Ld
            return
        Ld:
            androidx.recyclerview.widget.LinearLayoutManager r1 = r2.f24093
            int r0 = r1.getPosition(r0)
            int r1 = r2.f24090
            if (r0 == r1) goto L22
            int r1 = r2.getScrollState()
            if (r1 != 0) goto L22
            Yue.ۥ۟ۦۤۧ r1 = r2.f24099
            r1.onPageSelected(r0)
        L22:
            r0 = 0
            r2.f24091 = r0
            return
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Design assumption violated."
            r0.<init>(r1)
            throw r0
    }
}
