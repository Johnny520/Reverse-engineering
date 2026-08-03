package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
public final class AlertController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.content.Context f804a;
    public final androidx.appcompat.app.b b;
    public final android.view.Window c;
    public java.lang.CharSequence d;
    public androidx.appcompat.app.AlertController.RecycleListView e;
    public android.widget.Button f;
    public android.widget.Button g;
    public android.widget.Button h;
    public androidx.core.widget.NestedScrollView i;
    public android.graphics.drawable.Drawable j;
    public android.widget.ImageView k;
    public android.widget.TextView l;
    public android.widget.TextView m;
    public android.view.View n;
    public android.widget.ListAdapter o;
    public int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final boolean u;
    public final androidx.appcompat.app.AlertController.c v;
    public final androidx.appcompat.app.AlertController.a w;

    public static class RecycleListView extends android.widget.ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f805a;
        public final int b;

        public RecycleListView(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = androidx.appcompat.R.styleable.RecycleListView
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = androidx.appcompat.R.styleable.RecycleListView_paddingBottomNoButtons
                r0 = -1
                int r3 = r2.getDimensionPixelOffset(r3, r0)
                r1.b = r3
                int r3 = androidx.appcompat.R.styleable.RecycleListView_paddingTopNoTitle
                int r2 = r2.getDimensionPixelOffset(r3, r0)
                r1.f805a = r2
                return
        }
    }

    public class a implements android.view.View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.appcompat.app.AlertController f806a;

        public a(androidx.appcompat.app.AlertController r1) {
                r0 = this;
                r0.<init>()
                r0.f806a = r1
                return
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View r3) {
                r2 = this;
                androidx.appcompat.app.AlertController r3 = r2.f806a
                android.widget.Button r0 = r3.f
                androidx.appcompat.app.AlertController$c r0 = r3.v
                androidx.appcompat.app.b r3 = r3.b
                r1 = 1
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final android.view.ContextThemeWrapper f807a;
        public final android.view.LayoutInflater b;
        public android.graphics.drawable.Drawable c;
        public java.lang.CharSequence d;
        public android.view.View e;
        public androidx.appcompat.view.menu.g f;
        public java.lang.Object g;
        public android.content.DialogInterface.OnClickListener h;
        public boolean i;
        public int j;

        public b(android.view.ContextThemeWrapper r2) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.j = r0
                r1.f807a = r2
                java.lang.String r0 = "layout_inflater"
                java.lang.Object r2 = r2.getSystemService(r0)
                android.view.LayoutInflater r2 = (android.view.LayoutInflater) r2
                r1.b = r2
                return
        }
    }

    public static final class c extends android.os.Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.ref.WeakReference<android.content.DialogInterface> f808a;

        @Override // android.os.Handler
        public final void handleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = -3
                if (r0 == r1) goto L17
                r1 = -2
                if (r0 == r1) goto L17
                r1 = -1
                if (r0 == r1) goto L17
                r1 = 1
                if (r0 == r1) goto Lf
                return
            Lf:
                java.lang.Object r3 = r3.obj
                android.content.DialogInterface r3 = (android.content.DialogInterface) r3
                r3.dismiss()
                return
            L17:
                java.lang.Object r0 = r3.obj
                android.content.DialogInterface$OnClickListener r0 = (android.content.DialogInterface.OnClickListener) r0
                java.lang.ref.WeakReference<android.content.DialogInterface> r1 = r2.f808a
                java.lang.Object r1 = r1.get()
                android.content.DialogInterface r1 = (android.content.DialogInterface) r1
                int r3 = r3.what
                r0.onClick(r1, r3)
                return
        }
    }

    public static class d extends android.widget.ArrayAdapter<java.lang.CharSequence> {
        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final long getItemId(int r3) {
                r2 = this;
                long r0 = (long) r3
                return r0
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public final boolean hasStableIds() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    public AlertController(android.content.Context r4, androidx.appcompat.app.b r5, android.view.Window r6) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r1 = -1
            r3.p = r1
            androidx.appcompat.app.AlertController$a r1 = new androidx.appcompat.app.AlertController$a
            r1.<init>(r3)
            r3.w = r1
            r3.f804a = r4
            r3.b = r5
            r3.c = r6
            androidx.appcompat.app.AlertController$c r6 = new androidx.appcompat.app.AlertController$c
            r6.<init>()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r5)
            r6.f808a = r1
            r3.v = r6
            int[] r6 = androidx.appcompat.R.styleable.AlertDialog
            int r1 = androidx.appcompat.R.attr.alertDialogStyle
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r2, r6, r1, r0)
            int r6 = androidx.appcompat.R.styleable.AlertDialog_android_layout
            int r6 = r4.getResourceId(r6, r0)
            r3.q = r6
            int r6 = androidx.appcompat.R.styleable.AlertDialog_buttonPanelSideLayout
            r4.getResourceId(r6, r0)
            int r6 = androidx.appcompat.R.styleable.AlertDialog_listLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.r = r6
            int r6 = androidx.appcompat.R.styleable.AlertDialog_multiChoiceItemLayout
            r4.getResourceId(r6, r0)
            int r6 = androidx.appcompat.R.styleable.AlertDialog_singleChoiceItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.s = r6
            int r6 = androidx.appcompat.R.styleable.AlertDialog_listItemLayout
            int r6 = r4.getResourceId(r6, r0)
            r3.t = r6
            int r6 = androidx.appcompat.R.styleable.AlertDialog_showTitle
            r1 = 1
            boolean r6 = r4.getBoolean(r6, r1)
            r3.u = r6
            int r6 = androidx.appcompat.R.styleable.AlertDialog_buttonIconDimen
            r4.getDimensionPixelSize(r6, r0)
            r4.recycle()
            a.O0 r4 = r5.c()
            r4.v(r1)
            return
    }

    public static android.view.ViewGroup a(android.view.View r2, android.view.View r3) {
            if (r2 != 0) goto Lf
            boolean r2 = r3 instanceof android.view.ViewStub
            if (r2 == 0) goto Lc
            android.view.ViewStub r3 = (android.view.ViewStub) r3
            android.view.View r3 = r3.inflate()
        Lc:
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            return r3
        Lf:
            if (r3 == 0) goto L1e
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 == 0) goto L1e
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r0.removeView(r3)
        L1e:
            boolean r3 = r2 instanceof android.view.ViewStub
            if (r3 == 0) goto L28
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            android.view.View r2 = r2.inflate()
        L28:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
    }
}
