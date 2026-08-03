package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0483 extends android.widget.Spinner implements Yue.InterfaceC6266 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @Yue.InterfaceC6031
    @android.annotation.SuppressLint({"ResourceType"})
    public static final int[] f1218 = null;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f1219 = 15;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String f1220 = "AppCompatSpinner";

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f1221 = 0;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f1222 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f1223 = -1;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final Yue.C0429 f1224;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final android.content.Context f1225;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Yue.AbstractViewOnTouchListenerC2750 f1226;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public android.widget.SpinnerAdapter f1227;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final boolean f1228;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Yue.C0483.InterfaceC0495 f1229;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f1230;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public final android.graphics.Rect f1231;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ, reason: contains not printable characters */
    public class C0484 extends Yue.AbstractViewOnTouchListenerC2750 {

        /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0483.C0489 f1232;

        /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0483 f1233;

        public C0484(Yue.C0483 r1, android.view.View r2, Yue.C0483.C0489 r3) {
                r0 = this;
                r0.f1233 = r1
                r0.f1232 = r3
                r0.<init>(r2)
                return
        }

        @Override // Yue.AbstractViewOnTouchListenerC2750
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public Yue.InterfaceC5782 mo1750() {
                r1 = this;
                Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r0 = r1.f1232
                return r0
        }

        @Override // Yue.AbstractViewOnTouchListenerC2750
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean mo1751() {
                r1 = this;
                Yue.ۥۣ۟ۡۤ r0 = r1.f1233
                Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r0.getInternalPopup()
                boolean r0 = r0.mo1753()
                if (r0 != 0) goto L11
                Yue.ۥۣ۟ۡۤ r0 = r1.f1233
                r0.m1749()
            L11:
                r0 = 1
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟, reason: contains not printable characters */
    public class ViewTreeObserverOnGlobalLayoutListenerC0485 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0483 f1234;

        public ViewTreeObserverOnGlobalLayoutListenerC0485(Yue.C0483 r1) {
                r0 = this;
                r0.f1234 = r1
                r0.<init>()
                return
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
                r1 = this;
                Yue.ۥۣ۟ۡۤ r0 = r1.f1234
                Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r0.getInternalPopup()
                boolean r0 = r0.mo1753()
                if (r0 != 0) goto L11
                Yue.ۥۣ۟ۡۤ r0 = r1.f1234
                r0.m1749()
            L11:
                Yue.ۥۣ۟ۡۤ r0 = r1.f1234
                android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                if (r0 == 0) goto L1c
                r0.removeOnGlobalLayoutListener(r1)
            L1c:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static final class C0486 {
        public C0486() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m1752(@Yue.InterfaceC4410 android.widget.ThemedSpinnerAdapter r1, @Yue.InterfaceC4544 android.content.res.Resources.Theme r2) {
                android.content.res.Resources$Theme r0 = r1.getDropDownViewTheme()
                boolean r0 = Yue.C4554.m18124(r0, r2)
                if (r0 != 0) goto Ld
                r1.setDropDownViewTheme(r2)
            Ld:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC6959
    public class DialogInterfaceOnClickListenerC0487 implements Yue.C0483.InterfaceC0495, android.content.DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @Yue.InterfaceC6959
        public androidx.appcompat.app.DialogInterfaceC7281 f1235;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public android.widget.ListAdapter f1236;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public java.lang.CharSequence f1237;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0483 f1238;

        public DialogInterfaceOnClickListenerC0487(Yue.C0483 r1) {
                r0 = this;
                r0.f1238 = r1
                r0.<init>()
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        public void dismiss() {
                r1 = this;
                androidx.appcompat.app.ۥ۟۟ r0 = r1.f1235
                if (r0 == 0) goto La
                r0.dismiss()
                r0 = 0
                r1.f1235 = r0
            La:
                return
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(android.content.DialogInterface r4, int r5) {
                r3 = this;
                Yue.ۥۣ۟ۡۤ r4 = r3.f1238
                r4.setSelection(r5)
                Yue.ۥۣ۟ۡۤ r4 = r3.f1238
                android.widget.AdapterView$OnItemClickListener r4 = r4.getOnItemClickListener()
                if (r4 == 0) goto L19
                Yue.ۥۣ۟ۡۤ r4 = r3.f1238
                android.widget.ListAdapter r0 = r3.f1236
                long r0 = r0.getItemId(r5)
                r2 = 0
                r4.performItemClick(r2, r5, r0)
            L19:
                r3.dismiss()
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set popup background for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean mo1753() {
                r1 = this;
                androidx.appcompat.app.ۥ۟۟ r0 = r1.f1235
                if (r0 == 0) goto L9
                boolean r0 = r0.isShowing()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int mo1754() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void mo1755(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set horizontal offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public java.lang.CharSequence mo1756() {
                r1 = this;
                java.lang.CharSequence r0 = r1.f1237
                return r0
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public android.graphics.drawable.Drawable mo1757() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public void mo1758(java.lang.CharSequence r1) {
                r0 = this;
                r0.f1237 = r1
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
        public void mo1759(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set vertical offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
        public void mo1760(int r2) {
                r1 = this;
                java.lang.String r2 = "AppCompatSpinner"
                java.lang.String r0 = "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring"
                android.util.Log.e(r2, r0)
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public void mo1761(int r4, int r5) {
                r3 = this;
                android.widget.ListAdapter r0 = r3.f1236
                if (r0 != 0) goto L5
                return
            L5:
                androidx.appcompat.app.ۥ۟۟$ۥ r0 = new androidx.appcompat.app.ۥ۟۟$ۥ
                Yue.ۥۣ۟ۡۤ r1 = r3.f1238
                android.content.Context r1 = r1.getPopupContext()
                r0.<init>(r1)
                java.lang.CharSequence r1 = r3.f1237
                if (r1 == 0) goto L17
                r0.setTitle(r1)
            L17:
                android.widget.ListAdapter r1 = r3.f1236
                Yue.ۥۣ۟ۡۤ r2 = r3.f1238
                int r2 = r2.getSelectedItemPosition()
                androidx.appcompat.app.ۥ۟۟$ۥ r0 = r0.setSingleChoiceItems(r1, r2, r3)
                androidx.appcompat.app.ۥ۟۟ r0 = r0.create()
                r3.f1235 = r0
                android.widget.ListView r0 = r0.m27944()
                r0.setTextDirection(r4)
                r0.setTextAlignment(r5)
                androidx.appcompat.app.ۥ۟۟ r4 = r3.f1235
                r4.show()
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public int mo1762() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
        public int mo1763() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
        public void mo1764(android.widget.ListAdapter r1) {
                r0 = this;
                r0.f1236 = r1
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static class C0488 implements android.widget.ListAdapter, android.widget.SpinnerAdapter {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public android.widget.SpinnerAdapter f1239;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public android.widget.ListAdapter f1240;

        public C0488(@Yue.InterfaceC4544 android.widget.SpinnerAdapter r2, @Yue.InterfaceC4544 android.content.res.Resources.Theme r3) {
                r1 = this;
                r1.<init>()
                r1.f1239 = r2
                boolean r0 = r2 instanceof android.widget.ListAdapter
                if (r0 == 0) goto Le
                r0 = r2
                android.widget.ListAdapter r0 = (android.widget.ListAdapter) r0
                r1.f1240 = r0
            Le:
                if (r3 == 0) goto L29
                boolean r0 = r2 instanceof android.widget.ThemedSpinnerAdapter
                if (r0 == 0) goto L1a
                android.widget.ThemedSpinnerAdapter r2 = (android.widget.ThemedSpinnerAdapter) r2
                Yue.C0483.C0486.m1752(r2, r3)
                goto L29
            L1a:
                boolean r0 = r2 instanceof Yue.InterfaceC6174
                if (r0 == 0) goto L29
                Yue.ۥۣۢۡۡ r2 = (Yue.InterfaceC6174) r2
                android.content.res.Resources$Theme r0 = r2.getDropDownViewTheme()
                if (r0 != 0) goto L29
                r2.setDropDownViewTheme(r3)
            L29:
                return
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
                r1 = this;
                android.widget.ListAdapter r0 = r1.f1240
                if (r0 == 0) goto L9
                boolean r0 = r0.areAllItemsEnabled()
                return r0
            L9:
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public int getCount() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1239
                if (r0 != 0) goto L6
                r0 = 0
                goto La
            L6:
                int r0 = r0.getCount()
            La:
                return r0
        }

        @Override // android.widget.SpinnerAdapter
        public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1239
                if (r0 != 0) goto L6
                r2 = 0
                goto La
            L6:
                android.view.View r2 = r0.getDropDownView(r2, r3, r4)
            La:
                return r2
        }

        @Override // android.widget.Adapter
        public java.lang.Object getItem(int r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1239
                if (r0 != 0) goto L6
                r2 = 0
                goto La
            L6:
                java.lang.Object r2 = r0.getItem(r2)
            La:
                return r2
        }

        @Override // android.widget.Adapter
        public long getItemId(int r3) {
                r2 = this;
                android.widget.SpinnerAdapter r0 = r2.f1239
                if (r0 != 0) goto L7
                r0 = -1
                goto Lb
            L7:
                long r0 = r0.getItemId(r3)
            Lb:
                return r0
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.widget.Adapter
        public android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
                r0 = this;
                android.view.View r1 = r0.getDropDownView(r1, r2, r3)
                return r1
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1239
                if (r0 == 0) goto Lc
                boolean r0 = r0.hasStableIds()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
                r1 = this;
                int r0 = r1.getCount()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int r2) {
                r1 = this;
                android.widget.ListAdapter r0 = r1.f1240
                if (r0 == 0) goto L9
                boolean r2 = r0.isEnabled(r2)
                return r2
            L9:
                r2 = 1
                return r2
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1239
                if (r0 == 0) goto L7
                r0.registerDataSetObserver(r2)
            L7:
                return
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(android.database.DataSetObserver r2) {
                r1 = this;
                android.widget.SpinnerAdapter r0 = r1.f1239
                if (r0 == 0) goto L7
                r0.unregisterDataSetObserver(r2)
            L7:
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC6959
    public class C0489 extends Yue.C3631 implements Yue.C0483.InterfaceC0495 {

        /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
        public java.lang.CharSequence f1241;

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public android.widget.ListAdapter f1242;

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public final android.graphics.Rect f1243;

        /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
        public int f1244;

        /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
        public final /* synthetic */ Yue.C0483 f1245;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ, reason: contains not printable characters */
        public class C0490 implements android.widget.AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0483 f1246;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0483.C0489 f1247;

            public C0490(Yue.C0483.C0489 r1, Yue.C0483 r2) {
                    r0 = this;
                    r0.f1247 = r1
                    r0.f1246 = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(android.widget.AdapterView<?> r3, android.view.View r4, int r5, long r6) {
                    r2 = this;
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r3 = r2.f1247
                    Yue.ۥۣ۟ۡۤ r3 = r3.f1245
                    r3.setSelection(r5)
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r3 = r2.f1247
                    Yue.ۥۣ۟ۡۤ r3 = r3.f1245
                    android.widget.AdapterView$OnItemClickListener r3 = r3.getOnItemClickListener()
                    if (r3 == 0) goto L1e
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r3 = r2.f1247
                    Yue.ۥۣ۟ۡۤ r6 = r3.f1245
                    android.widget.ListAdapter r3 = r3.f1242
                    long r0 = r3.getItemId(r5)
                    r6.performItemClick(r4, r5, r0)
                L1e:
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r3 = r2.f1247
                    r3.dismiss()
                    return
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟, reason: contains not printable characters */
        public class ViewTreeObserverOnGlobalLayoutListenerC0491 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0483.C0489 f1248;

            public ViewTreeObserverOnGlobalLayoutListenerC0491(Yue.C0483.C0489 r1) {
                    r0 = this;
                    r0.f1248 = r1
                    r0.<init>()
                    return
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                    r2 = this;
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r0 = r2.f1248
                    Yue.ۥۣ۟ۡۤ r1 = r0.f1245
                    boolean r0 = r0.m1767(r1)
                    if (r0 != 0) goto L10
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r0 = r2.f1248
                    r0.dismiss()
                    goto L1a
                L10:
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r0 = r2.f1248
                    r0.m1766()
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r0 = r2.f1248
                    Yue.C0483.C0489.m1765(r0)
                L1a:
                    return
            }
        }

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟۟, reason: contains not printable characters */
        public class C0492 implements android.widget.PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
            public final /* synthetic */ android.view.ViewTreeObserver.OnGlobalLayoutListener f1249;

            /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
            public final /* synthetic */ Yue.C0483.C0489 f1250;

            public C0492(Yue.C0483.C0489 r1, android.view.ViewTreeObserver.OnGlobalLayoutListener r2) {
                    r0 = this;
                    r0.f1250 = r1
                    r0.f1249 = r2
                    r0.<init>()
                    return
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                    r2 = this;
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r0 = r2.f1250
                    Yue.ۥۣ۟ۡۤ r0 = r0.f1245
                    android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
                    if (r0 == 0) goto Lf
                    android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.f1249
                    r0.removeGlobalOnLayoutListener(r1)
                Lf:
                    return
            }
        }

        public C0489(Yue.C0483 r1, android.content.Context r2, android.util.AttributeSet r3, int r4) {
                r0 = this;
                r0.f1245 = r1
                r0.<init>(r2, r3, r4)
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r0.f1243 = r2
                r0.m14724(r1)
                r2 = 1
                r0.m14735(r2)
                r2 = 0
                r0.m14741(r2)
                Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ r2 = new Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ
                r2.<init>(r0, r1)
                r0.m14737(r2)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
        public static /* synthetic */ void m1765(Yue.C0483.C0489 r0) {
                super.show()
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        public java.lang.CharSequence mo1756() {
                r1 = this;
                java.lang.CharSequence r0 = r1.f1241
                return r0
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        public void mo1758(java.lang.CharSequence r1) {
                r0 = this;
                r0.f1241 = r1
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        public void mo1760(int r1) {
                r0 = this;
                r0.f1244 = r1
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        public void mo1761(int r4, int r5) {
                r3 = this;
                boolean r0 = r3.mo14691()
                r3.m1766()
                r1 = 2
                r3.m14732(r1)
                super.show()
                android.widget.ListView r1 = r3.mo14695()
                r2 = 1
                r1.setChoiceMode(r2)
                r1.setTextDirection(r4)
                r1.setTextAlignment(r5)
                Yue.ۥۣ۟ۡۤ r4 = r3.f1245
                int r4 = r4.getSelectedItemPosition()
                r3.m14743(r4)
                if (r0 == 0) goto L28
                return
            L28:
                Yue.ۥۣ۟ۡۤ r4 = r3.f1245
                android.view.ViewTreeObserver r4 = r4.getViewTreeObserver()
                if (r4 == 0) goto L40
                Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟ r5 = new Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟
                r5.<init>(r3)
                r4.addOnGlobalLayoutListener(r5)
                Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟۟ r4 = new Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠$ۥ۟۟
                r4.<init>(r3, r5)
                r3.m14736(r4)
            L40:
                return
        }

        @Override // Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        public int mo1763() {
                r1 = this;
                int r0 = r1.f1244
                return r0
        }

        @Override // Yue.C3631, Yue.C0483.InterfaceC0495
        /* JADX INFO: renamed from: ۥ۟۟۠ */
        public void mo1764(android.widget.ListAdapter r1) {
                r0 = this;
                super.mo1764(r1)
                r0.f1242 = r1
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
        public void m1766() {
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.m14694()
                if (r0 == 0) goto L24
                Yue.ۥۣ۟ۡۤ r1 = r8.f1245
                android.graphics.Rect r1 = r1.f1231
                r0.getPadding(r1)
                Yue.ۥۣ۟ۡۤ r0 = r8.f1245
                boolean r0 = Yue.C6928.m26811(r0)
                if (r0 == 0) goto L1c
                Yue.ۥۣ۟ۡۤ r0 = r8.f1245
                android.graphics.Rect r0 = r0.f1231
                int r0 = r0.right
                goto L2e
            L1c:
                Yue.ۥۣ۟ۡۤ r0 = r8.f1245
                android.graphics.Rect r0 = r0.f1231
                int r0 = r0.left
                int r0 = -r0
                goto L2e
            L24:
                Yue.ۥۣ۟ۡۤ r0 = r8.f1245
                android.graphics.Rect r0 = r0.f1231
                r1 = 0
                r0.right = r1
                r0.left = r1
                r0 = r1
            L2e:
                Yue.ۥۣ۟ۡۤ r1 = r8.f1245
                int r1 = r1.getPaddingLeft()
                Yue.ۥۣ۟ۡۤ r2 = r8.f1245
                int r2 = r2.getPaddingRight()
                Yue.ۥۣ۟ۡۤ r3 = r8.f1245
                int r3 = r3.getWidth()
                Yue.ۥۣ۟ۡۤ r4 = r8.f1245
                int r5 = r4.f1230
                r6 = -2
                if (r5 != r6) goto L7b
                android.widget.ListAdapter r5 = r8.f1242
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.m14694()
                int r4 = r4.m1748(r5, r6)
                Yue.ۥۣ۟ۡۤ r5 = r8.f1245
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                Yue.ۥۣ۟ۡۤ r6 = r8.f1245
                android.graphics.Rect r6 = r6.f1231
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L70
                r4 = r5
            L70:
                int r5 = r3 - r1
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                r8.m14726(r4)
                goto L88
            L7b:
                r4 = -1
                if (r5 != r4) goto L85
                int r4 = r3 - r1
                int r4 = r4 - r2
                r8.m14726(r4)
                goto L88
            L85:
                r8.m14726(r5)
            L88:
                Yue.ۥۣ۟ۡۤ r4 = r8.f1245
                boolean r4 = Yue.C6928.m26811(r4)
                if (r4 == 0) goto L9d
                int r3 = r3 - r2
                int r1 = r8.m14714()
                int r3 = r3 - r1
                int r1 = r8.mo1763()
                int r3 = r3 - r1
                int r0 = r0 + r3
                goto La3
            L9d:
                int r2 = r8.mo1763()
                int r1 = r1 + r2
                int r0 = r0 + r1
            La3:
                r8.m14693(r0)
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟ۤۧ, reason: contains not printable characters */
        public boolean m1767(android.view.View r2) {
                r1 = this;
                boolean r0 = r2.isAttachedToWindow()
                if (r0 == 0) goto L10
                android.graphics.Rect r0 = r1.f1243
                boolean r2 = r2.getGlobalVisibleRect(r0)
                if (r2 == 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static class C0493 extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<Yue.C0483.C0493> CREATOR = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public boolean f1251;

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ$ۥ, reason: contains not printable characters */
        public class C0494 implements android.os.Parcelable.Creator<Yue.C0483.C0493> {
            public C0494() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Yue.C0483.C0493 createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ r1 = r0.m1768(r1)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Yue.C0483.C0493[] newArray(int r1) {
                    r0 = this;
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ[] r1 = r0.m1769(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public Yue.C0483.C0493 m1768(android.os.Parcel r2) {
                    r1 = this;
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ r0 = new Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ
                    r0.<init>(r2)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public Yue.C0483.C0493[] m1769(int r1) {
                    r0 = this;
                    Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ[] r1 = new Yue.C0483.C0493[r1]
                    return r1
            }
        }

        static {
                Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ$ۥ r0 = new Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ$ۥ
                r0.<init>()
                Yue.C0483.C0493.CREATOR = r0
                return
        }

        public C0493(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                byte r1 = r1.readByte()
                if (r1 == 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                r0.f1251 = r1
                return
        }

        public C0493(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                boolean r2 = r0.f1251
                byte r2 = (byte) r2
                r1.writeByte(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ, reason: contains not printable characters */
    @Yue.InterfaceC6959
    public interface InterfaceC0495 {
        void dismiss();

        void setBackgroundDrawable(android.graphics.drawable.Drawable r1);

        /* JADX INFO: renamed from: ۥ */
        boolean mo1753();

        /* JADX INFO: renamed from: ۥ۟ */
        int mo1754();

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo1755(int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        java.lang.CharSequence mo1756();

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        android.graphics.drawable.Drawable mo1757();

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        void mo1758(java.lang.CharSequence r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        void mo1759(int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        void mo1760(int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
        void mo1761(int r1, int r2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
        int mo1762();

        /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
        int mo1763();

        /* JADX INFO: renamed from: ۥ۟۟۠ */
        void mo1764(android.widget.ListAdapter r1);
    }

    static {
            r0 = 16843505(0x10102f1, float:2.3695668E-38)
            int[] r0 = new int[]{r0}
            Yue.C0483.f1218 = r0
            return
    }

    public C0483(@Yue.InterfaceC4410 android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public C0483(@Yue.InterfaceC4410 android.content.Context r3, int r4) {
            r2 = this;
            r0 = 0
            int r1 = Yue.C5058.C5060.f16758
            r2.<init>(r3, r0, r1, r4)
            return
    }

    public C0483(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            int r0 = Yue.C5058.C5060.f16758
            r1.<init>(r2, r3, r0)
            return
    }

    public C0483(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3, int r4) {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public C0483(@Yue.InterfaceC4410 android.content.Context r7, @Yue.InterfaceC4544 android.util.AttributeSet r8, int r9, int r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public C0483(@Yue.InterfaceC4410 android.content.Context r7, @Yue.InterfaceC4544 android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1231 = r0
            android.content.Context r0 = r6.getContext()
            Yue.C6173.m23109(r6, r0)
            int[] r0 = Yue.C5058.C5071.f17932
            r1 = 0
            Yue.ۥۢۡۥۦ r0 = Yue.C6264.m23339(r7, r8, r0, r9, r1)
            Yue.ۥ۟ۡ۟۟ r2 = new Yue.ۥ۟ۡ۟۟
            r2.<init>(r6)
            r6.f1224 = r2
            if (r11 == 0) goto L29
            Yue.ۥ۟ۧۤۡ r2 = new Yue.ۥ۟ۧۤۡ
            r2.<init>(r7, r11)
            r6.f1225 = r2
            goto L3b
        L29:
            int r11 = Yue.C5058.C5071.f17937
            int r11 = r0.m23360(r11, r1)
            if (r11 == 0) goto L39
            Yue.ۥ۟ۧۤۡ r2 = new Yue.ۥ۟ۧۤۡ
            r2.<init>(r7, r11)
            r6.f1225 = r2
            goto L3b
        L39:
            r6.f1225 = r7
        L3b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L6d
            int[] r11 = Yue.C0483.f1218     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            boolean r3 = r11.hasValue(r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            if (r3 == 0) goto L55
            int r10 = r11.getInt(r1, r1)     // Catch: java.lang.Throwable -> L50 java.lang.Exception -> L53
            goto L55
        L50:
            r7 = move-exception
            r2 = r11
            goto L67
        L53:
            r3 = move-exception
            goto L5d
        L55:
            r11.recycle()
            goto L6d
        L59:
            r7 = move-exception
            goto L67
        L5b:
            r3 = move-exception
            r11 = r2
        L5d:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch: java.lang.Throwable -> L50
            if (r11 == 0) goto L6d
            goto L55
        L67:
            if (r2 == 0) goto L6c
            r2.recycle()
        L6c:
            throw r7
        L6d:
            r11 = 1
            if (r10 == 0) goto Laa
            if (r10 == r11) goto L73
            goto Lba
        L73:
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠ r10 = new Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۠
            android.content.Context r3 = r6.f1225
            r10.<init>(r6, r3, r8, r9)
            android.content.Context r3 = r6.f1225
            int[] r4 = Yue.C5058.C5071.f17932
            Yue.ۥۢۡۥۦ r1 = Yue.C6264.m23339(r3, r8, r4, r9, r1)
            int r3 = Yue.C5058.C5071.f17936
            r4 = -2
            int r3 = r1.m23356(r3, r4)
            r6.f1230 = r3
            int r3 = Yue.C5058.C5071.f17934
            android.graphics.drawable.Drawable r3 = r1.m23347(r3)
            r10.setBackgroundDrawable(r3)
            int r3 = Yue.C5058.C5071.f17935
            java.lang.String r3 = r0.m23362(r3)
            r10.mo1758(r3)
            r1.m23371()
            r6.f1229 = r10
            Yue.ۥۣ۟ۡۤ$ۥ r1 = new Yue.ۥۣ۟ۡۤ$ۥ
            r1.<init>(r6, r6, r10)
            r6.f1226 = r1
            goto Lba
        Laa:
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ r10 = new Yue.ۥۣ۟ۡۤ$ۥ۟۟۟
            r10.<init>(r6)
            r6.f1229 = r10
            int r1 = Yue.C5058.C5071.f17935
            java.lang.String r1 = r0.m23362(r1)
            r10.mo1758(r1)
        Lba:
            int r10 = Yue.C5058.C5071.f17933
            java.lang.CharSequence[] r10 = r0.m23364(r10)
            if (r10 == 0) goto Ld2
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = Yue.C5058.C5068.f17217
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        Ld2:
            r0.m23371()
            r6.f1228 = r11
            android.widget.SpinnerAdapter r7 = r6.f1227
            if (r7 == 0) goto Le0
            r6.setAdapter(r7)
            r6.f1227 = r2
        Le0:
            Yue.ۥ۟ۡ۟۟ r7 = r6.f1224
            r7.m1631(r8, r9)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
            r1 = this;
            super.drawableStateChanged()
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1224
            if (r0 == 0) goto La
            r0.m1628()
        La:
            return
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto L9
            int r0 = r0.mo1754()
            return r0
        L9:
            int r0 = super.getDropDownHorizontalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto L9
            int r0 = r0.mo1762()
            return r0
        L9:
            int r0 = super.getDropDownVerticalOffset()
            return r0
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto L7
            int r0 = r1.f1230
            return r0
        L7:
            int r0 = super.getDropDownWidth()
            return r0
    }

    @Yue.InterfaceC6959
    public final Yue.C0483.InterfaceC0495 getInternalPopup() {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            return r0
    }

    @Override // android.widget.Spinner
    public android.graphics.drawable.Drawable getPopupBackground() {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.mo1757()
            return r0
        L9:
            android.graphics.drawable.Drawable r0 = super.getPopupBackground()
            return r0
    }

    @Override // android.widget.Spinner
    public android.content.Context getPopupContext() {
            r1 = this;
            android.content.Context r0 = r1.f1225
            return r0
    }

    @Override // android.widget.Spinner
    public java.lang.CharSequence getPrompt() {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto L9
            java.lang.CharSequence r0 = r0.mo1756()
            goto Ld
        L9:
            java.lang.CharSequence r0 = super.getPrompt()
        Ld:
            return r0
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1224
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.m1629()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    @Yue.InterfaceC4544
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1224
            if (r0 == 0) goto L9
            android.graphics.PorterDuff$Mode r0 = r0.m1630()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto L12
            boolean r0 = r0.mo1753()
            if (r0 == 0) goto L12
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            r0.dismiss()
        L12:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r4 = r2.f1229
            if (r4 == 0) goto L32
            int r4 = android.view.View.MeasureSpec.getMode(r3)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r0) goto L32
            int r4 = r2.getMeasuredWidth()
            android.widget.SpinnerAdapter r0 = r2.getAdapter()
            android.graphics.drawable.Drawable r1 = r2.getBackground()
            int r0 = r2.m1748(r0, r1)
            int r4 = java.lang.Math.max(r4, r0)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            int r3 = java.lang.Math.min(r4, r3)
            int r4 = r2.getMeasuredHeight()
            r2.setMeasuredDimension(r3, r4)
        L32:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ r2 = (Yue.C0483.C0493) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            boolean r2 = r2.f1251
            if (r2 == 0) goto L1b
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()
            if (r2 == 0) goto L1b
            Yue.ۥۣ۟ۡۤ$ۥ۟ r0 = new Yue.ۥۣ۟ۡۤ$ۥ۟
            r0.<init>(r1)
            r2.addOnGlobalLayoutListener(r0)
        L1b:
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ r0 = new Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۡ
            android.os.Parcelable r1 = super.onSaveInstanceState()
            r0.<init>(r1)
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r1 = r2.f1229
            if (r1 == 0) goto L15
            boolean r1 = r1.mo1753()
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L15:
            r1 = 0
        L16:
            r0.f1251 = r1
            return r0
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r2) {
            r1 = this;
            Yue.ۥ۠ۢۦۨ r0 = r1.f1226
            if (r0 == 0) goto Lc
            boolean r0 = r0.onTouch(r1, r2)
            if (r0 == 0) goto Lc
            r2 = 1
            return r2
        Lc:
            boolean r2 = super.onTouchEvent(r2)
            return r2
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto Lf
            boolean r0 = r0.mo1753()
            if (r0 != 0) goto Ld
            r1.m1749()
        Ld:
            r0 = 1
            return r0
        Lf:
            boolean r0 = super.performClick()
            return r0
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(android.widget.Adapter r1) {
            r0 = this;
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            r0.setAdapter(r1)
            return
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    public void setAdapter(android.widget.SpinnerAdapter r4) {
            r3 = this;
            boolean r0 = r3.f1228
            if (r0 != 0) goto L7
            r3.f1227 = r4
            return
        L7:
            super.setAdapter(r4)
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r3.f1229
            if (r0 == 0) goto L24
            android.content.Context r0 = r3.f1225
            if (r0 != 0) goto L16
            android.content.Context r0 = r3.getContext()
        L16:
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r1 = r3.f1229
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۟ r2 = new Yue.ۥۣ۟ۡۤ$ۥ۟۟۟۟
            android.content.res.Resources$Theme r0 = r0.getTheme()
            r2.<init>(r4, r0)
            r1.mo1764(r2)
        L24:
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Yue.InterfaceC4544 android.graphics.drawable.Drawable r2) {
            r1 = this;
            super.setBackgroundDrawable(r2)
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1224
            if (r0 == 0) goto La
            r0.m1632(r2)
        La:
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            super.setBackgroundResource(r2)
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1224
            if (r0 == 0) goto La
            r0.m1633(r2)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto Ld
            r0.mo1760(r2)
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            r0.mo1755(r2)
            goto L10
        Ld:
            super.setDropDownHorizontalOffset(r2)
        L10:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto L8
            r0.mo1759(r2)
            goto Lb
        L8:
            super.setDropDownVerticalOffset(r2)
        Lb:
            return
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto L7
            r1.f1230 = r2
            goto La
        L7:
            super.setDropDownWidth(r2)
        La:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto L8
            r0.setBackgroundDrawable(r2)
            goto Lb
        L8:
            super.setPopupBackgroundDrawable(r2)
        Lb:
            return
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@Yue.InterfaceC2004 int r2) {
            r1 = this;
            android.content.Context r0 = r1.getPopupContext()
            android.graphics.drawable.Drawable r2 = Yue.C0479.m1737(r0, r2)
            r1.setPopupBackgroundDrawable(r2)
            return
    }

    @Override // android.widget.Spinner
    public void setPrompt(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r1.f1229
            if (r0 == 0) goto L8
            r0.mo1758(r2)
            goto Lb
        L8:
            super.setPrompt(r2)
        Lb:
            return
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportBackgroundTintList(@Yue.InterfaceC4544 android.content.res.ColorStateList r2) {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1224
            if (r0 == 0) goto L7
            r0.m1635(r2)
        L7:
            return
    }

    @Override // Yue.InterfaceC6266
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public void setSupportBackgroundTintMode(@Yue.InterfaceC4544 android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            Yue.ۥ۟ۡ۟۟ r0 = r1.f1224
            if (r0 == 0) goto L7
            r0.m1636(r2)
        L7:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public int m1748(android.widget.SpinnerAdapter r11, android.graphics.drawable.Drawable r12) {
            r10 = this;
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            int r1 = r10.getMeasuredWidth()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r2 = r10.getMeasuredHeight()
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            int r3 = r10.getSelectedItemPosition()
            int r3 = java.lang.Math.max(r0, r3)
            int r4 = r11.getCount()
            int r5 = r3 + 15
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r4 - r3
            int r5 = 15 - r5
            int r3 = r3 - r5
            int r3 = java.lang.Math.max(r0, r3)
            r5 = 0
            r6 = r3
            r7 = r5
            r3 = r0
        L33:
            if (r6 >= r4) goto L5e
            int r8 = r11.getItemViewType(r6)
            if (r8 == r0) goto L3d
            r7 = r5
            r0 = r8
        L3d:
            android.view.View r7 = r11.getView(r6, r7, r10)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            if (r8 != 0) goto L50
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            r7.setLayoutParams(r8)
        L50:
            r7.measure(r1, r2)
            int r8 = r7.getMeasuredWidth()
            int r3 = java.lang.Math.max(r3, r8)
            int r6 = r6 + 1
            goto L33
        L5e:
            if (r12 == 0) goto L6d
            android.graphics.Rect r11 = r10.f1231
            r12.getPadding(r11)
            android.graphics.Rect r11 = r10.f1231
            int r12 = r11.left
            int r11 = r11.right
            int r12 = r12 + r11
            int r3 = r3 + r12
        L6d:
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m1749() {
            r3 = this;
            Yue.ۥۣ۟ۡۤ$ۥ۟۟۟ۢ r0 = r3.f1229
            int r1 = r3.getTextDirection()
            int r2 = r3.getTextAlignment()
            r0.mo1761(r1, r2)
            return
    }
}
