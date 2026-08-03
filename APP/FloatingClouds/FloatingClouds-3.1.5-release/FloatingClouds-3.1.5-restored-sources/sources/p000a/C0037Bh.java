package p000a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C1247R;
import com.google.android.material.datepicker.C1284c;
import com.google.android.material.datepicker.ViewOnClickListenerC1289h;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: a.Bh */
/* JADX INFO: loaded from: classes.dex */
public final class C0037Bh extends RecyclerView.AbstractC1167d<a> {

    /* JADX INFO: renamed from: d */
    public final C1284c<?> f134d;

    /* JADX INFO: renamed from: a.Bh$a */
    public static class a extends RecyclerView.AbstractC1163A {

        /* JADX INFO: renamed from: u */
        public final TextView f135u;

        public a(TextView textView) {
            super(textView);
            this.f135u = textView;
        }
    }

    public C0037Bh(C1284c<?> c1284c) {
        this.f134d = c1284c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
    /* JADX INFO: renamed from: a */
    public final int mo109a() {
        return this.f134d.f5693Y.f5685f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
    /* JADX INFO: renamed from: d */
    public final void mo110d(RecyclerView.AbstractC1163A abstractC1163A, int i) {
        C1284c<?> c1284c = this.f134d;
        int i2 = c1284c.f5693Y.f5680a.f3314c + i;
        String str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((a) abstractC1163A).f135u;
        textView.setText(str);
        Context context = textView.getContext();
        textView.setContentDescription(C0467Zf.m1138d().get(1) == i2 ? String.format(context.getString(C1247R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(C1247R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C0059D2 c0059d2 = c1284c.f5697c0;
        Calendar calendarM1138d = C0467Zf.m1138d();
        C0041C2 c0041c2 = calendarM1138d.get(1) == i2 ? c0059d2.f207f : c0059d2.f205d;
        Iterator<Long> it = c1284c.f5692X.m431j().iterator();
        while (it.hasNext()) {
            calendarM1138d.setTimeInMillis(it.next().longValue());
            if (calendarM1138d.get(1) == i2) {
                c0041c2 = c0059d2.f206e;
            }
        }
        c0041c2.m124b(textView);
        textView.setOnClickListener(new ViewOnClickListenerC1289h(this, i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1167d
    /* JADX INFO: renamed from: e */
    public final RecyclerView.AbstractC1163A mo111e(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1247R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
