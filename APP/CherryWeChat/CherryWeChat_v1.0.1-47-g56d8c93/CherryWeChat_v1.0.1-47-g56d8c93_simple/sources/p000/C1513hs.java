package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import io.github.cherrywechat.R;
import java.util.Calendar;

/* JADX INFO: renamed from: hs */
/* JADX INFO: loaded from: classes.dex */
public final class C1513hs extends BaseAdapter {

    /* JADX INFO: renamed from: d */
    public static final int f5357d = 0;

    /* JADX INFO: renamed from: e */
    public static final int f5358e = 0;

    /* JADX INFO: renamed from: a */
    public final C1469gs f5359a;

    /* JADX INFO: renamed from: b */
    public C0649P3 f5360b;

    /* JADX INFO: renamed from: c */
    public final C0136D6 f5361c;

    static {
        f5357d = AbstractC2407qD.m4845c(null).getMaximum(4);
        int r1 = AbstractC2407qD.m4845c(null).getMaximum(5);
        f5358e = (AbstractC2407qD.m4845c(null).getMaximum(7) + r1) - 1;
    }

    public C1513hs(C1469gs r1, C0136D6 r2) {
        this.f5359a = r1;
        this.f5361c = r2;
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m2886a() {
        int r0 = this.f5361c.f353e;
        C1469gs r1 = this.f5359a;
        Calendar r2 = r1.f5207a;
        int r3 = r2.get(7);
        if (r0 > 0) goto L6;
        r0 = r2.getFirstDayOfWeek();
    L6:
        int r32 = r3 - r0;
        if (r32 < 0) goto L9;
        return r32;
    L9:
        return r32 + r1.f5210d;
    }

    /* JADX INFO: renamed from: b */
    public final Long m2887b(int r3) {
        if (r3 >= m2886a()) goto L5;
        return null;
    L5:
        if (r3 > m2888c()) goto L11;
        int r32 = (r3 - m2886a()) + 1;
        Calendar r0 = AbstractC2407qD.m4843a(this.f5359a.f5207a);
        r0.set(5, r32);
        return Long.valueOf(r0.getTimeInMillis());
    L11:
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final int m2888c() {
        return (m2886a() + this.f5359a.f5211e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f5358e;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int r1) {
        return m2887b(r1);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3 / this.f5359a.f5210d;
    }

    @Override // android.widget.Adapter
    public final View getView(int r5, View r6, ViewGroup r7) {
        Context r0 = r7.getContext();
        if (this.f5360b != null) goto L5;
        this.f5360b = new C0649P3(r0);
    L5:
        TextView r02 = (TextView) r6;
        if (r6 != null) goto L8;
        r02 = (TextView) LayoutInflater.from(r7.getContext()).inflate(R.layout.mtrl_calendar_day, r7, false);
    L8:
        int r62 = r5 - m2886a();
        if (r62 < 0) goto L14;
        C1469gs r72 = this.f5359a;
        if (r62 >= r72.f5211e) goto L14;
        r02.setTag(r72);
        r02.setText(String.format(r02.getResources().getConfiguration().locale, "%d", new Object[]{Integer.valueOf(r62 + 1)}));
        r02.setVisibility(0);
        r02.setEnabled(true);
    L16:
        if (m2887b(r5) == null) goto L19;
        if (r02 == null) goto L19;
        r02.getContext();
        AbstractC2407qD.m4844b().getTimeInMillis();
        throw null;
    L19:
        return r02;
    L14:
        r02.setVisibility(8);
        r02.setEnabled(false);
        goto L16
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
