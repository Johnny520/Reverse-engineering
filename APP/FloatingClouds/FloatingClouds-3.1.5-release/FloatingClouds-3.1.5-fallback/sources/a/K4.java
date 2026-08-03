package a;

/* JADX INFO: loaded from: classes.dex */
public final class K4 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.Calendar f149a;
    public final int b;
    public final int c;

    public K4() {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.util.Calendar r0 = a.Zf.e(r0)
            r2.f149a = r0
            r1 = 7
            int r1 = r0.getMaximum(r1)
            r2.b = r1
            int r0 = r0.getFirstDayOfWeek()
            r2.c = r0
            return
    }

    public K4(int r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            java.util.Calendar r0 = a.Zf.e(r0)
            r2.f149a = r0
            r1 = 7
            int r0 = r0.getMaximum(r1)
            r2.b = r0
            r2.c = r3
            return
    }

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r3) {
            r2 = this;
            int r0 = r2.b
            if (r3 < r0) goto L6
            r3 = 0
            return r3
        L6:
            int r1 = r2.c
            int r3 = r3 + r1
            if (r3 <= r0) goto Lc
            int r3 = r3 - r0
        Lc:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            return r3
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.Adapter
    @android.annotation.SuppressLint({"WrongConstant"})
    public final android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
            r3 = this;
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r5 != 0) goto L17
            android.content.Context r5 = r6.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day_of_week
            r1 = 0
            android.view.View r5 = r5.inflate(r0, r6, r1)
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
        L17:
            int r5 = r3.c
            int r4 = r4 + r5
            int r5 = r3.b
            if (r4 <= r5) goto L1f
            int r4 = r4 - r5
        L1f:
            java.util.Calendar r5 = r3.f149a
            r1 = 7
            r5.set(r1, r4)
            android.content.res.Resources r4 = r0.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            r2 = 4
            java.lang.String r4 = r5.getDisplayName(r1, r2, r4)
            r0.setText(r4)
            android.content.Context r4 = r6.getContext()
            int r6 = com.google.android.material.R.string.mtrl_picker_day_of_week_column_header
            java.lang.String r4 = r4.getString(r6)
            r6 = 2
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.getDisplayName(r1, r6, r2)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.setContentDescription(r4)
            return r0
    }
}
