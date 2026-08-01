package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C1038;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.C3325;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import p069.AbstractC7390;
import p321.C9469;
import p325.C9481;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3944 extends AbstractC3283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final MaterialCalendar f10625;

    public C3944(MaterialCalendar materialCalendar) {
        this.f10625 = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo5354() {
        return this.f10625.f10608.f10581;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC3317 mo5358(int i, ViewGroup viewGroup) {
        return new C3951((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0328R.layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo5365(AbstractC3317 abstractC3317, int i) {
        MaterialCalendar materialCalendar = this.f10625;
        int i2 = materialCalendar.f10608.f10585.f10617 + i;
        TextView textView = ((C3951) abstractC3317).f10649;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC3953.m7688().get(1) == i2 ? String.format(context.getString(C0328R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(C0328R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C3325 c3325 = materialCalendar.f10600;
        Calendar calendarM7688 = AbstractC3953.m7688();
        C1038 c1038 = (C1038) (calendarM7688.get(1) == i2 ? c3325.f7802 : c3325.f7804);
        Iterator it = materialCalendar.f10605.mo7657().iterator();
        while (it.hasNext()) {
            calendarM7688.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarM7688.get(1) == i2) {
                c1038 = (C1038) c3325.f7803;
            }
        }
        c1038.m1216(textView);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Context context2 = textView.getContext();
            Drawable foreground = textView.getForeground();
            ColorDrawable colorDrawable = FocusRingDrawable.f10739;
            if (AbstractC7390.m12627(context2.getTheme(), C0328R.attr.focusRingsEnabled, false)) {
                foreground = new FocusRingDrawable(context2, foreground);
            }
            if (foreground instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) foreground;
                C9469 c9469 = (C9469) c1038.f1097;
                C9481 c9481 = focusRingDrawable.f10740;
                c9481.f24704 = c9469;
                c9481.f24715 = ((Rect) c1038.f1094).top;
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(c1038 == ((C1038) c3325.f7803));
        textView.setOnClickListener(new ViewOnClickListenerC3952(this, i2));
    }
}
