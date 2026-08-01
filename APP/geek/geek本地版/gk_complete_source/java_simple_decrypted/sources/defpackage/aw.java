package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.Calendar;

/* JADX INFO: loaded from: classes.dex */
public final class aw extends BaseAdapter {
    public static final int d = 0;
    public static final int e = 0;
    public final zv a;
    public d4 b;
    public final c8 c;

    static {
        d = u80.c(null).getMaximum(4);
        int r1 = u80.c(null).getMaximum(5);
        e = (u80.c(null).getMaximum(7) + r1) - 1;
    }

    public aw(zv r1, c8 r2) {
        this.a = r1;
        this.c = r2;
        throw null;
    }

    public final int a() {
        int r0 = this.c.e;
        zv r1 = this.a;
        Calendar r2 = r1.a;
        int r3 = r2.get(7);
        if (r0 > 0) goto L6;
        r0 = r2.getFirstDayOfWeek();
    L6:
        int r32 = r3 - r0;
        if (r32 < 0) goto L9;
        return r32;
    L9:
        return r32 + r1.d;
    }

    public final Long b(int r3) {
        if (r3 >= a()) goto L5;
        return null;
    L5:
        if (r3 > c()) goto L11;
        int r32 = (r3 - a()) + 1;
        Calendar r0 = u80.a(this.a.a);
        r0.set(5, r32);
        return Long.valueOf(r0.getTimeInMillis());
    L11:
        return null;
    }

    public final int c() {
        return (a() + this.a.e) - 1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return e;
    }

    @Override // android.widget.Adapter
    public final /* bridge */ /* synthetic */ Object getItem(int r1) {
        return b(r1);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r3) {
        return r3 / this.a.d;
    }

    @Override // android.widget.Adapter
    public final View getView(int r5, View r6, ViewGroup r7) {
        Context r0 = r7.getContext();
        if (this.b != null) goto L5;
        this.b = new d4(r0);
    L5:
        TextView r02 = (TextView) r6;
        if (r6 != null) goto L8;
        r02 = (TextView) LayoutInflater.from(r7.getContext()).inflate(R.layout.mtrl_calendar_day, r7, false);
    L8:
        int r62 = r5 - a();
        if (r62 < 0) goto L14;
        zv r72 = this.a;
        if (r62 >= r72.e) goto L14;
        r02.setTag(r72);
        r02.setText(String.format(r02.getResources().getConfiguration().locale, "%d", new Object[]{Integer.valueOf(r62 + 1)}));
        r02.setVisibility(0);
        r02.setEnabled(true);
    L16:
        if (b(r5) == null) goto L19;
        if (r02 == null) goto L19;
        r02.getContext();
        u80.b().getTimeInMillis();
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
