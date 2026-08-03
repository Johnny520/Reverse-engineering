package a;

/* JADX INFO: renamed from: a.vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0431vf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.C0431vf.a f741a = null;

    /* JADX INFO: renamed from: a.vf$a */
    public class a implements java.util.Comparator<android.view.View> {
        @Override // java.util.Comparator
        public final int compare(android.view.View r1, android.view.View r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.View r2 = (android.view.View) r2
                int r1 = r1.getTop()
                int r2 = r2.getTop()
                int r1 = r1 - r2
                return r1
        }
    }

    static {
            a.vf$a r0 = new a.vf$a
            r0.<init>()
            a.C0431vf.f741a = r0
            return
    }

    public static android.widget.ImageButton a(com.google.android.material.search.SearchBar r4) {
            android.graphics.drawable.Drawable r0 = r4.getNavigationIcon()
            if (r0 != 0) goto L7
            goto L22
        L7:
            r1 = 0
        L8:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L22
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof android.widget.ImageButton
            if (r3 == 0) goto L1f
            android.widget.ImageButton r2 = (android.widget.ImageButton) r2
            android.graphics.drawable.Drawable r3 = r2.getDrawable()
            if (r3 != r0) goto L1f
            return r2
        L1f:
            int r1 = r1 + 1
            goto L8
        L22:
            r4 = 0
            return r4
    }

    public static java.util.ArrayList b(com.google.android.material.appbar.MaterialToolbar r4, java.lang.CharSequence r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.getChildCount()
            if (r1 >= r2) goto L26
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r2 instanceof android.widget.TextView
            if (r3 == 0) goto L23
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.CharSequence r3 = r2.getText()
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L23
            r0.add(r2)
        L23:
            int r1 = r1 + 1
            goto L6
        L26:
            return r0
    }
}
