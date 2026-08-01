package p000;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* JADX INFO: renamed from: aw */
/* JADX INFO: loaded from: classes.dex */
public final class C0046aw extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f688d = u80.m2428c(null).getMaximum(4);

    /* JADX INFO: renamed from: e */
    public static final int f689e = (u80.m2428c(null).getMaximum(7) + u80.m2428c(null).getMaximum(5)) - 1;

    /* JADX INFO: renamed from: a */
    public final C0981zv f690a;

    /* JADX INFO: renamed from: b */
    public C0138d4 f691b;

    /* JADX INFO: renamed from: c */
    public final C0095c8 f692c;

    public C0046aw(C0981zv c0981zv, C0095c8 c0095c8) {
        this.f690a = c0981zv;
        this.f692c = c0095c8;
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m475a() {
        int firstDayOfWeek = this.f692c.f913e;
        C0981zv c0981zv = this.f690a;
        Calendar calendar = c0981zv.f5619a;
        int i = calendar.get(7);
        if (firstDayOfWeek <= 0) {
            firstDayOfWeek = calendar.getFirstDayOfWeek();
        }
        int i2 = i - firstDayOfWeek;
        return i2 < 0 ? i2 + c0981zv.f5622d : i2;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i) {
        if (i < m475a() || i > m477c()) {
            return null;
        }
        int iM475a = (i - m475a()) + 1;
        Calendar calendarM2426a = u80.m2426a(this.f690a.f5619a);
        calendarM2426a.set(5, iM475a);
        return Long.valueOf(calendarM2426a.getTimeInMillis());
    }

    /* JADX INFO: renamed from: c */
    public final int m477c() {
        return (m475a() + this.f690a.f5623e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f689e;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f690a.f5622d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            d4 r1 = r4.f691b
            if (r1 != 0) goto Lf
            d4 r1 = new d4
            r1.<init>(r0)
            r4.f691b = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131492935(0x7f0c0047, float:1.8609336E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.m475a()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            zv r7 = r4.f690a
            int r2 = r7.f5623e
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L6e
        L6c:
            if (r0 != 0) goto L6f
        L6e:
            return r0
        L6f:
            r0.getContext()
            java.util.Calendar r5 = p000.u80.m2427b()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0046aw.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
