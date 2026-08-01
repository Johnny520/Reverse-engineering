package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.C0191;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.C2492;
import com.davemorrissey.labs.subscaleview.R;
import com.google.android.material.focus.FocusRingDrawable;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import p053.AbstractC6561;
import p305.C8640;
import p309.C8652;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3112 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final MaterialCalendar f10280;

    public C3112(MaterialCalendar materialCalendar) {
        this.f10280 = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4794() {
        return this.f10280.f10263.f10236;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4798(int i, ViewGroup viewGroup) {
        return new C3119((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4805(AbstractC2484 abstractC2484, int i) {
        MaterialCalendar materialCalendar = this.f10280;
        int i2 = materialCalendar.f10263.f10240.f10272 + i;
        TextView textView = ((C3119) abstractC2484).f10304;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC3121.m7129().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C2492 c2492 = materialCalendar.f10255;
        Calendar calendarM7129 = AbstractC3121.m7129();
        C0191 c0191 = (C0191) (calendarM7129.get(1) == i2 ? c2492.f7457 : c2492.f7459);
        Iterator it = materialCalendar.f10260.mo7098().iterator();
        while (it.hasNext()) {
            calendarM7129.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarM7129.get(1) == i2) {
                c0191 = (C0191) c2492.f7458;
            }
        }
        c0191.m656(textView);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Context context2 = textView.getContext();
            Drawable foreground = textView.getForeground();
            ColorDrawable colorDrawable = FocusRingDrawable.f10394;
            if (AbstractC6561.m12068(context2.getTheme(), R.attr.focusRingsEnabled, false)) {
                foreground = new FocusRingDrawable(context2, foreground);
            }
            if (foreground instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) foreground;
                C8640 c8640 = (C8640) c0191.f752;
                C8652 c8652 = focusRingDrawable.f10395;
                c8652.f24359 = c8640;
                c8652.f24370 = ((Rect) c0191.f749).top;
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(c0191 == ((C0191) c2492.f7458));
        textView.setOnClickListener(new ViewOnClickListenerC3120(this, i2));
    }
}
