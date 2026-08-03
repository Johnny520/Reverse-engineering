package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class ActivityChooserView extends android.view.ViewGroup implements androidx.appcompat.widget.C7421.InterfaceC7422 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final androidx.appcompat.widget.ActivityChooserView.C7378 f25607;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final androidx.appcompat.widget.ActivityChooserView.ViewOnClickListenerC7379 f25608;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final android.view.View f25609;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final android.graphics.drawable.Drawable f25610;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final android.widget.FrameLayout f25611;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final android.widget.ImageView f25612;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final android.widget.FrameLayout f25613;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final android.widget.ImageView f25614;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final int f25615;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public Yue.AbstractC0183 f25616;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final android.database.DataSetObserver f25617;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final android.view.ViewTreeObserver.OnGlobalLayoutListener f25618;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public Yue.C3631 f25619;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public android.widget.PopupWindow.OnDismissListener f25620;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public boolean f25621;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public int f25622;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public boolean f25623;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public int f25624;

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public static class InnerLayout extends android.widget.LinearLayout {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final int[] f25625 = null;

        static {
                r0 = 16842964(0x10100d4, float:2.3694152E-38)
                int[] r0 = new int[]{r0}
                androidx.appcompat.widget.ActivityChooserView.InnerLayout.f25625 = r0
                return
        }

        public InnerLayout(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = androidx.appcompat.widget.ActivityChooserView.InnerLayout.f25625
                Yue.ۥۢۡۥۦ r2 = Yue.C6264.m23338(r2, r3, r0)
                r3 = 0
                android.graphics.drawable.Drawable r3 = r2.m23347(r3)
                r1.setBackgroundDrawable(r3)
                r2.m23371()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ, reason: contains not printable characters */
    public class C7373 extends android.database.DataSetObserver {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f25626;

        public C7373(androidx.appcompat.widget.ActivityChooserView r1) {
                r0 = this;
                r0.f25626 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                super.onChanged()
                androidx.appcompat.widget.ActivityChooserView r0 = r1.f25626
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r0.f25607
                r0.notifyDataSetChanged()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                super.onInvalidated()
                androidx.appcompat.widget.ActivityChooserView r0 = r1.f25626
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r0.f25607
                r0.notifyDataSetInvalidated()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟, reason: contains not printable characters */
    public class ViewTreeObserverOnGlobalLayoutListenerC7374 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f25627;

        public ViewTreeObserverOnGlobalLayoutListenerC7374(androidx.appcompat.widget.ActivityChooserView r1) {
                r0 = this;
                r0.f25627 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r2 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25627
                boolean r0 = r0.m28298()
                if (r0 == 0) goto L2d
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25627
                boolean r0 = r0.isShown()
                if (r0 != 0) goto L1a
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25627
                Yue.ۥ۠ۧۢۤ r0 = r0.getListPopupWindow()
                r0.dismiss()
                goto L2d
            L1a:
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25627
                Yue.ۥ۠ۧۢۤ r0 = r0.getListPopupWindow()
                r0.show()
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25627
                Yue.ۥ۟۟ۧ۠ r0 = r0.f25616
                if (r0 == 0) goto L2d
                r1 = 1
                r0.m1035(r1)
            L2d:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟, reason: contains not printable characters */
    public class C7375 extends android.view.View.AccessibilityDelegate {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f25628;

        public C7375(androidx.appcompat.widget.ActivityChooserView r1) {
                r0 = this;
                r0.f25628 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(android.view.View r1, android.view.accessibility.AccessibilityNodeInfo r2) {
                r0 = this;
                super.onInitializeAccessibilityNodeInfo(r1, r2)
                Yue.ۥ۟۟ۥۧ r1 = Yue.C0140.m624(r2)
                r2 = 1
                r1.m730(r2)
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟, reason: contains not printable characters */
    public class C7376 extends Yue.AbstractViewOnTouchListenerC2750 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f25629;

        public C7376(androidx.appcompat.widget.ActivityChooserView r1, android.view.View r2) {
                r0 = this;
                r0.f25629 = r1
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractViewOnTouchListenerC2750
        /* JADX INFO: renamed from: ۥ۟ */
        public Yue.InterfaceC5782 mo1750() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r1.f25629
                Yue.ۥ۠ۧۢۤ r0 = r0.getListPopupWindow()
                return r0
        }

        @Override // Yue.AbstractViewOnTouchListenerC2750
        /* JADX INFO: renamed from: ۥ۟۟ */
        public boolean mo1751() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r1.f25629
                r0.m28299()
                r0 = 1
                return r0
        }

        @Override // Yue.AbstractViewOnTouchListenerC2750
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo12047() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r1.f25629
                r0.m28297()
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۟, reason: contains not printable characters */
    public class C7377 extends android.database.DataSetObserver {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f25630;

        public C7377(androidx.appcompat.widget.ActivityChooserView r1) {
                r0 = this;
                r0.f25630 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                super.onChanged()
                androidx.appcompat.widget.ActivityChooserView r0 = r1.f25630
                r0.m28301()
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠, reason: contains not printable characters */
    public class C7378 extends android.widget.BaseAdapter {

        /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
        public static final int f25631 = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
        public static final int f25632 = 4;

        /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
        public static final int f25633 = 0;

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public static final int f25634 = 1;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public static final int f25635 = 3;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public androidx.appcompat.widget.C7421 f25636;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f25637;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f25638;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f25639;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public boolean f25640;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f25641;

        public C7378(androidx.appcompat.widget.ActivityChooserView r1) {
                r0 = this;
                r0.f25641 = r1
                r0.<init>()
                r1 = 4
                r0.f25637 = r1
                return
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r2 = this;
                androidx.appcompat.widget.ۥ۟ r0 = r2.f25636
                int r0 = r0.m28441()
                boolean r1 = r2.f25638
                if (r1 != 0) goto L14
                androidx.appcompat.widget.ۥ۟ r1 = r2.f25636
                android.content.pm.ResolveInfo r1 = r1.m28443()
                if (r1 == 0) goto L14
                int r0 = r0 + (-1)
            L14:
                int r1 = r2.f25637
                int r0 = java.lang.Math.min(r0, r1)
                boolean r1 = r2.f25640
                if (r1 == 0) goto L20
                int r0 = r0 + 1
            L20:
                return r0
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                int r0 = r1.getItemViewType(r2)
                if (r0 == 0) goto L11
                r2 = 1
                if (r0 != r2) goto Lb
                r2 = 0
                return r2
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
            L11:
                boolean r0 = r1.f25638
                if (r0 != 0) goto L1f
                androidx.appcompat.widget.ۥ۟ r0 = r1.f25636
                android.content.pm.ResolveInfo r0 = r0.m28443()
                if (r0 == 0) goto L1f
                int r2 = r2 + 1
            L1f:
                androidx.appcompat.widget.ۥ۟ r0 = r1.f25636
                android.content.pm.ResolveInfo r2 = r0.m28440(r2)
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int r3) {
                r2 = this;
                boolean r0 = r2.f25640
                if (r0 == 0) goto Ld
                int r0 = r2.getCount()
                r1 = 1
                int r0 = r0 - r1
                if (r3 != r0) goto Ld
                return r1
            Ld:
                r3 = 0
                return r3
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
                r5 = this;
                int r0 = r5.getItemViewType(r6)
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L43
                if (r0 != r2) goto L3d
                if (r7 == 0) goto L12
                int r6 = r7.getId()
                if (r6 == r2) goto L3c
            L12:
                androidx.appcompat.widget.ActivityChooserView r6 = r5.f25641
                android.content.Context r6 = r6.getContext()
                android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
                int r7 = Yue.C5058.C5068.f17193
                android.view.View r7 = r6.inflate(r7, r8, r1)
                r7.setId(r2)
                int r6 = Yue.C5058.C5065.f17167
                android.view.View r6 = r7.findViewById(r6)
                android.widget.TextView r6 = (android.widget.TextView) r6
                androidx.appcompat.widget.ActivityChooserView r8 = r5.f25641
                android.content.Context r8 = r8.getContext()
                int r0 = Yue.C5058.C5069.f17222
                java.lang.String r8 = r8.getString(r0)
                r6.setText(r8)
            L3c:
                return r7
            L3d:
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>()
                throw r6
            L43:
                if (r7 == 0) goto L4d
                int r0 = r7.getId()
                int r3 = Yue.C5058.C5065.f17130
                if (r0 == r3) goto L5d
            L4d:
                androidx.appcompat.widget.ActivityChooserView r7 = r5.f25641
                android.content.Context r7 = r7.getContext()
                android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
                int r0 = Yue.C5058.C5068.f17193
                android.view.View r7 = r7.inflate(r0, r8, r1)
            L5d:
                androidx.appcompat.widget.ActivityChooserView r8 = r5.f25641
                android.content.Context r8 = r8.getContext()
                android.content.pm.PackageManager r8 = r8.getPackageManager()
                int r0 = Yue.C5058.C5065.f17127
                android.view.View r0 = r7.findViewById(r0)
                android.widget.ImageView r0 = (android.widget.ImageView) r0
                java.lang.Object r3 = r5.getItem(r6)
                android.content.pm.ResolveInfo r3 = (android.content.pm.ResolveInfo) r3
                android.graphics.drawable.Drawable r4 = r3.loadIcon(r8)
                r0.setImageDrawable(r4)
                int r0 = Yue.C5058.C5065.f17167
                android.view.View r0 = r7.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                java.lang.CharSequence r8 = r3.loadLabel(r8)
                r0.setText(r8)
                boolean r8 = r5.f25638
                if (r8 == 0) goto L99
                if (r6 != 0) goto L99
                boolean r6 = r5.f25639
                if (r6 == 0) goto L99
                r7.setActivated(r2)
                goto L9c
            L99:
                r7.setActivated(r1)
            L9c:
                return r7
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
                r1 = this;
                r0 = 3
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public int m28302() {
                r1 = this;
                androidx.appcompat.widget.ۥ۟ r0 = r1.f25636
                int r0 = r0.m28441()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.appcompat.widget.C7421 m28303() {
                r1 = this;
                androidx.appcompat.widget.ۥ۟ r0 = r1.f25636
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public android.content.pm.ResolveInfo m28304() {
                r1 = this;
                androidx.appcompat.widget.ۥ۟ r0 = r1.f25636
                android.content.pm.ResolveInfo r0 = r0.m28443()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public int m28305() {
                r1 = this;
                androidx.appcompat.widget.ۥ۟ r0 = r1.f25636
                int r0 = r0.m28445()
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public boolean m28306() {
                r1 = this;
                boolean r0 = r1.f25638
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public int m28307() {
                r9 = this;
                int r0 = r9.f25637
                r1 = 2147483647(0x7fffffff, float:NaN)
                r9.f25637 = r1
                r1 = 0
                int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
                int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r1)
                int r4 = r9.getCount()
                r5 = 0
                r6 = r1
                r7 = r5
            L17:
                if (r1 >= r4) goto L2b
                android.view.View r7 = r9.getView(r1, r7, r5)
                r7.measure(r2, r3)
                int r8 = r7.getMeasuredWidth()
                int r6 = java.lang.Math.max(r6, r8)
                int r1 = r1 + 1
                goto L17
            L2b:
                r9.f25637 = r0
                return r6
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m28308(androidx.appcompat.widget.C7421 r3) {
                r2 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25641
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r0.f25607
                androidx.appcompat.widget.ۥ۟ r0 = r0.m28303()
                if (r0 == 0) goto L19
                androidx.appcompat.widget.ActivityChooserView r1 = r2.f25641
                boolean r1 = r1.isShown()
                if (r1 == 0) goto L19
                androidx.appcompat.widget.ActivityChooserView r1 = r2.f25641
                android.database.DataSetObserver r1 = r1.f25617
                r0.unregisterObserver(r1)
            L19:
                r2.f25636 = r3
                if (r3 == 0) goto L2c
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25641
                boolean r0 = r0.isShown()
                if (r0 == 0) goto L2c
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25641
                android.database.DataSetObserver r0 = r0.f25617
                r3.registerObserver(r0)
            L2c:
                r2.notifyDataSetChanged()
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m28309(int r2) {
                r1 = this;
                int r0 = r1.f25637
                if (r0 == r2) goto L9
                r1.f25637 = r2
                r1.notifyDataSetChanged()
            L9:
                return
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void m28310(boolean r2, boolean r3) {
                r1 = this;
                boolean r0 = r1.f25638
                if (r0 != r2) goto L8
                boolean r0 = r1.f25639
                if (r0 == r3) goto Lf
            L8:
                r1.f25638 = r2
                r1.f25639 = r3
                r1.notifyDataSetChanged()
            Lf:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void m28311(boolean r2) {
                r1 = this;
                boolean r0 = r1.f25640
                if (r0 == r2) goto L9
                r1.f25640 = r2
                r1.notifyDataSetChanged()
            L9:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public class ViewOnClickListenerC7379 implements android.widget.AdapterView.OnItemClickListener, android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.PopupWindow.OnDismissListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.appcompat.widget.ActivityChooserView f25642;

        public ViewOnClickListenerC7379(androidx.appcompat.widget.ActivityChooserView r1) {
                r0 = this;
                r0.f25642 = r1
                r0.<init>()
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25642
                android.widget.FrameLayout r1 = r0.f25613
                if (r3 != r1) goto L3a
                r0.m28297()
                androidx.appcompat.widget.ActivityChooserView r3 = r2.f25642
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r3 = r3.f25607
                android.content.pm.ResolveInfo r3 = r3.m28304()
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25642
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r0.f25607
                androidx.appcompat.widget.ۥ۟ r0 = r0.m28303()
                int r3 = r0.m28442(r3)
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25642
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r0.f25607
                androidx.appcompat.widget.ۥ۟ r0 = r0.m28303()
                android.content.Intent r3 = r0.m28438(r3)
                if (r3 == 0) goto L46
                r0 = 524288(0x80000, float:7.34684E-40)
                r3.addFlags(r0)
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25642
                android.content.Context r0 = r0.getContext()
                r0.startActivity(r3)
                goto L46
            L3a:
                android.widget.FrameLayout r1 = r0.f25611
                if (r3 != r1) goto L47
                r3 = 0
                r0.f25621 = r3
                int r3 = r0.f25622
                r0.m28300(r3)
            L46:
                return
            L47:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>()
                throw r3
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
                r2 = this;
                r2.m28312()
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25642
                Yue.ۥ۟۟ۧ۠ r0 = r0.f25616
                if (r0 == 0) goto Ld
                r1 = 0
                r0.m1035(r1)
            Ld:
                return
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(android.widget.AdapterView<?> r1, android.view.View r2, int r3, long r4) {
                r0 = this;
                android.widget.Adapter r1 = r1.getAdapter()
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r1 = (androidx.appcompat.widget.ActivityChooserView.C7378) r1
                int r1 = r1.getItemViewType(r3)
                if (r1 == 0) goto L1e
                r2 = 1
                if (r1 != r2) goto L18
                androidx.appcompat.widget.ActivityChooserView r1 = r0.f25642
                r2 = 2147483647(0x7fffffff, float:NaN)
                r1.m28300(r2)
                goto L5c
            L18:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>()
                throw r1
            L1e:
                androidx.appcompat.widget.ActivityChooserView r1 = r0.f25642
                r1.m28297()
                androidx.appcompat.widget.ActivityChooserView r1 = r0.f25642
                boolean r2 = r1.f25621
                if (r2 == 0) goto L35
                if (r3 <= 0) goto L5c
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r1 = r1.f25607
                androidx.appcompat.widget.ۥ۟ r1 = r1.m28303()
                r1.m28453(r3)
                goto L5c
            L35:
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r1 = r1.f25607
                boolean r1 = r1.m28306()
                if (r1 == 0) goto L3e
                goto L40
            L3e:
                int r3 = r3 + 1
            L40:
                androidx.appcompat.widget.ActivityChooserView r1 = r0.f25642
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r1 = r1.f25607
                androidx.appcompat.widget.ۥ۟ r1 = r1.m28303()
                android.content.Intent r1 = r1.m28438(r3)
                if (r1 == 0) goto L5c
                r2 = 524288(0x80000, float:7.34684E-40)
                r1.addFlags(r2)
                androidx.appcompat.widget.ActivityChooserView r2 = r0.f25642
                android.content.Context r2 = r2.getContext()
                r2.startActivity(r1)
            L5c:
                return
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r2.f25642
                android.widget.FrameLayout r1 = r0.f25613
                if (r3 != r1) goto L19
                androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r3 = r0.f25607
                int r3 = r3.getCount()
                r0 = 1
                if (r3 <= 0) goto L18
                androidx.appcompat.widget.ActivityChooserView r3 = r2.f25642
                r3.f25621 = r0
                int r1 = r3.f25622
                r3.m28300(r1)
            L18:
                return r0
            L19:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                r3.<init>()
                throw r3
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final void m28312() {
                r1 = this;
                androidx.appcompat.widget.ActivityChooserView r0 = r1.f25642
                android.widget.PopupWindow$OnDismissListener r0 = r0.f25620
                if (r0 == 0) goto L9
                r0.onDismiss()
            L9:
                return
        }
    }

    public ActivityChooserView(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ActivityChooserView(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ActivityChooserView(@Yue.InterfaceC4410 android.content.Context r11, @Yue.InterfaceC4544 android.util.AttributeSet r12, int r13) {
            r10 = this;
            r10.<init>(r11, r12, r13)
            androidx.appcompat.widget.ActivityChooserView$ۥ r0 = new androidx.appcompat.widget.ActivityChooserView$ۥ
            r0.<init>(r10)
            r10.f25617 = r0
            androidx.appcompat.widget.ActivityChooserView$ۥ۟ r0 = new androidx.appcompat.widget.ActivityChooserView$ۥ۟
            r0.<init>(r10)
            r10.f25618 = r0
            r0 = 4
            r10.f25622 = r0
            int[] r1 = Yue.C5058.C5071.f17631
            r2 = 0
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1, r13, r2)
            int[] r5 = Yue.C5058.C5071.f17631
            r9 = 0
            r3 = r10
            r4 = r11
            r6 = r12
            r7 = r1
            r8 = r13
            Yue.C6794.m26221(r3, r4, r5, r6, r7, r8, r9)
            int r12 = Yue.C5058.C5071.f17633
            int r12 = r1.getInt(r12, r0)
            r10.f25622 = r12
            int r12 = Yue.C5058.C5071.f17632
            android.graphics.drawable.Drawable r12 = r1.getDrawable(r12)
            r1.recycle()
            android.content.Context r13 = r10.getContext()
            android.view.LayoutInflater r13 = android.view.LayoutInflater.from(r13)
            int r0 = Yue.C5058.C5068.f17192
            r1 = 1
            r13.inflate(r0, r10, r1)
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟ۡ r13 = new androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟ۡ
            r13.<init>(r10)
            r10.f25608 = r13
            int r0 = Yue.C5058.C5065.f17110
            android.view.View r0 = r10.findViewById(r0)
            r10.f25609 = r0
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r10.f25610 = r0
            int r0 = Yue.C5058.C5065.f17121
            android.view.View r0 = r10.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r10.f25613 = r0
            r0.setOnClickListener(r13)
            r0.setOnLongClickListener(r13)
            int r1 = Yue.C5058.C5065.f17128
            android.view.View r0 = r0.findViewById(r1)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r10.f25614 = r0
            int r0 = Yue.C5058.C5065.f17123
            android.view.View r0 = r10.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.setOnClickListener(r13)
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟ r13 = new androidx.appcompat.widget.ActivityChooserView$ۥ۟۟
            r13.<init>(r10)
            r0.setAccessibilityDelegate(r13)
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟ r13 = new androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟
            r13.<init>(r10, r0)
            r0.setOnTouchListener(r13)
            r10.f25611 = r0
            int r13 = Yue.C5058.C5065.f17128
            android.view.View r13 = r0.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r10.f25612 = r13
            r13.setImageDrawable(r12)
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r12 = new androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠
            r12.<init>(r10)
            r10.f25607 = r12
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۟ r13 = new androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۟
            r13.<init>(r10)
            r12.registerDataSetObserver(r13)
            android.content.res.Resources r11 = r11.getResources()
            android.util.DisplayMetrics r12 = r11.getDisplayMetrics()
            int r12 = r12.widthPixels
            int r12 = r12 / 2
            int r13 = Yue.C5058.C5063.f16933
            int r11 = r11.getDimensionPixelSize(r13)
            int r11 = java.lang.Math.max(r12, r11)
            r10.f25615 = r11
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public androidx.appcompat.widget.C7421 getDataModel() {
            r1 = this;
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r1.f25607
            androidx.appcompat.widget.ۥ۟ r0 = r0.m28303()
            return r0
    }

    public Yue.C3631 getListPopupWindow() {
            r2 = this;
            Yue.ۥ۠ۧۢۤ r0 = r2.f25619
            if (r0 != 0) goto L2d
            Yue.ۥ۠ۧۢۤ r0 = new Yue.ۥ۠ۧۢۤ
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.f25619 = r0
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r1 = r2.f25607
            r0.mo1764(r1)
            Yue.ۥ۠ۧۢۤ r0 = r2.f25619
            r0.m14724(r2)
            Yue.ۥ۠ۧۢۤ r0 = r2.f25619
            r1 = 1
            r0.m14735(r1)
            Yue.ۥ۠ۧۢۤ r0 = r2.f25619
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟ۡ r1 = r2.f25608
            r0.m14737(r1)
            Yue.ۥ۠ۧۢۤ r0 = r2.f25619
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟ۡ r1 = r2.f25608
            r0.m14736(r1)
        L2d:
            Yue.ۥ۠ۧۢۤ r0 = r2.f25619
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r2.f25607
            androidx.appcompat.widget.ۥ۟ r0 = r0.m28303()
            if (r0 == 0) goto L10
            android.database.DataSetObserver r1 = r2.f25617
            r0.registerObserver(r1)
        L10:
            r0 = 1
            r2.f25623 = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r2.f25607
            androidx.appcompat.widget.ۥ۟ r0 = r0.m28303()
            if (r0 == 0) goto L10
            android.database.DataSetObserver r1 = r2.f25617
            r0.unregisterObserver(r1)
        L10:
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 == 0) goto L1f
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f25618
            r0.removeGlobalOnLayoutListener(r1)
        L1f:
            boolean r0 = r2.m28298()
            if (r0 == 0) goto L28
            r2.m28297()
        L28:
            r0 = 0
            r2.f25623 = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            android.view.View r1 = r0.f25609
            int r4 = r4 - r2
            int r5 = r5 - r3
            r2 = 0
            r1.layout(r2, r2, r4, r5)
            boolean r1 = r0.m28298()
            if (r1 != 0) goto L11
            r0.m28297()
        L11:
            return
    }

    @Override // android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            android.view.View r0 = r2.f25609
            android.widget.FrameLayout r1 = r2.f25613
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L14
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r1)
        L14:
            r2.measureChild(r0, r3, r4)
            int r3 = r0.getMeasuredWidth()
            int r4 = r0.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
            return
    }

    @Override // androidx.appcompat.widget.C7421.InterfaceC7422
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
    public void setActivityChooserModel(androidx.appcompat.widget.C7421 r2) {
            r1 = this;
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r1.f25607
            r0.m28308(r2)
            boolean r2 = r1.m28298()
            if (r2 == 0) goto L11
            r1.m28297()
            r1.m28299()
        L11:
            return
    }

    public void setDefaultActionButtonContentDescription(int r1) {
            r0 = this;
            r0.f25624 = r1
            return
    }

    public void setExpandActivityOverflowButtonContentDescription(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            java.lang.String r2 = r0.getString(r2)
            android.widget.ImageView r0 = r1.f25612
            r0.setContentDescription(r2)
            return
    }

    public void setExpandActivityOverflowButtonDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.f25612
            r0.setImageDrawable(r2)
            return
    }

    public void setInitialActivityCount(int r1) {
            r0 = this;
            r0.f25622 = r1
            return
    }

    public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener r1) {
            r0 = this;
            r0.f25620 = r1
            return
    }

    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setProvider(Yue.AbstractC0183 r1) {
            r0 = this;
            r0.f25616 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public boolean m28297() {
            r2 = this;
            boolean r0 = r2.m28298()
            if (r0 == 0) goto L1c
            Yue.ۥ۠ۧۢۤ r0 = r2.getListPopupWindow()
            r0.dismiss()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            boolean r1 = r0.isAlive()
            if (r1 == 0) goto L1c
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f25618
            r0.removeGlobalOnLayoutListener(r1)
        L1c:
            r0 = 1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public boolean m28298() {
            r1 = this;
            Yue.ۥ۠ۧۢۤ r0 = r1.getListPopupWindow()
            boolean r0 = r0.mo14691()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m28299() {
            r2 = this;
            boolean r0 = r2.m28298()
            r1 = 0
            if (r0 != 0) goto L15
            boolean r0 = r2.f25623
            if (r0 != 0) goto Lc
            goto L15
        Lc:
            r2.f25621 = r1
            int r0 = r2.f25622
            r2.m28300(r0)
            r0 = 1
            return r0
        L15:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m28300(int r6) {
            r5 = this;
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r5.f25607
            androidx.appcompat.widget.ۥ۟ r0 = r0.m28303()
            if (r0 == 0) goto L96
            android.view.ViewTreeObserver r0 = r5.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r5.f25618
            r0.addOnGlobalLayoutListener(r1)
            android.widget.FrameLayout r0 = r5.f25613
            int r0 = r0.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1d
            r0 = r2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r3 = r5.f25607
            int r3 = r3.m28302()
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == r4) goto L39
            int r4 = r6 + r0
            if (r3 <= r4) goto L39
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r3 = r5.f25607
            r3.m28311(r2)
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r3 = r5.f25607
            int r6 = r6 - r2
            r3.m28309(r6)
            goto L43
        L39:
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r3 = r5.f25607
            r3.m28311(r1)
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r3 = r5.f25607
            r3.m28309(r6)
        L43:
            Yue.ۥ۠ۧۢۤ r6 = r5.getListPopupWindow()
            boolean r3 = r6.mo14691()
            if (r3 != 0) goto L95
            boolean r3 = r5.f25621
            if (r3 != 0) goto L5a
            if (r0 != 0) goto L54
            goto L5a
        L54:
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r5.f25607
            r0.m28310(r1, r1)
            goto L5f
        L5a:
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r3 = r5.f25607
            r3.m28310(r2, r0)
        L5f:
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r5.f25607
            int r0 = r0.m28307()
            int r3 = r5.f25615
            int r0 = java.lang.Math.min(r0, r3)
            r6.m14726(r0)
            r6.show()
            Yue.ۥ۟۟ۧ۠ r0 = r5.f25616
            if (r0 == 0) goto L78
            r0.m1035(r2)
        L78:
            android.widget.ListView r0 = r6.mo14695()
            android.content.Context r2 = r5.getContext()
            int r3 = Yue.C5058.C5069.f17223
            java.lang.String r2 = r2.getString(r3)
            r0.setContentDescription(r2)
            android.widget.ListView r6 = r6.mo14695()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r1)
            r6.setSelector(r0)
        L95:
            return
        L96:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "No data model. Did you call #setDataModel?"
            r6.<init>(r0)
            throw r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m28301() {
            r4 = this;
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r4.f25607
            int r0 = r0.getCount()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            android.widget.FrameLayout r0 = r4.f25611
            r0.setEnabled(r2)
            goto L15
        L10:
            android.widget.FrameLayout r0 = r4.f25611
            r0.setEnabled(r1)
        L15:
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r4.f25607
            int r0 = r0.m28302()
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r3 = r4.f25607
            int r3 = r3.m28305()
            if (r0 == r2) goto L30
            if (r0 <= r2) goto L28
            if (r3 <= 0) goto L28
            goto L30
        L28:
            android.widget.FrameLayout r0 = r4.f25613
            r1 = 8
            r0.setVisibility(r1)
            goto L67
        L30:
            android.widget.FrameLayout r0 = r4.f25613
            r0.setVisibility(r1)
            androidx.appcompat.widget.ActivityChooserView$ۥ۟۟۟۠ r0 = r4.f25607
            android.content.pm.ResolveInfo r0 = r0.m28304()
            android.content.Context r1 = r4.getContext()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.widget.ImageView r2 = r4.f25614
            android.graphics.drawable.Drawable r3 = r0.loadIcon(r1)
            r2.setImageDrawable(r3)
            int r2 = r4.f25624
            if (r2 == 0) goto L67
            java.lang.CharSequence r0 = r0.loadLabel(r1)
            android.content.Context r1 = r4.getContext()
            int r2 = r4.f25624
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r1.getString(r2, r0)
            android.widget.FrameLayout r1 = r4.f25613
            r1.setContentDescription(r0)
        L67:
            android.widget.FrameLayout r0 = r4.f25613
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L77
            android.view.View r0 = r4.f25609
            android.graphics.drawable.Drawable r1 = r4.f25610
            r0.setBackgroundDrawable(r1)
            goto L7d
        L77:
            android.view.View r0 = r4.f25609
            r1 = 0
            r0.setBackgroundDrawable(r1)
        L7d:
            return
    }
}
