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
import p251.AbstractC8174;
import p305.C8648;
import p309.C8660;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3111 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final MaterialCalendar f10275;

    public C3111(MaterialCalendar materialCalendar) {
        this.f10275 = materialCalendar;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4784() {
        return this.f10275.f10258.f10231;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4788(int i, ViewGroup viewGroup) {
        return new C3118((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4795(AbstractC2484 abstractC2484, int i) {
        MaterialCalendar materialCalendar = this.f10275;
        int i2 = materialCalendar.f10258.f10235.f10267 + i;
        TextView textView = ((C3118) abstractC2484).f10299;
        textView.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i2)));
        Context context = textView.getContext();
        textView.setContentDescription(AbstractC3120.m7142().get(1) == i2 ? String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2)) : String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2)));
        C2492 c2492 = materialCalendar.f10250;
        Calendar calendarM7142 = AbstractC3120.m7142();
        C0191 c0191 = (C0191) (calendarM7142.get(1) == i2 ? c2492.f7456 : c2492.f7458);
        Iterator it = materialCalendar.f10255.mo7112().iterator();
        while (it.hasNext()) {
            calendarM7142.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarM7142.get(1) == i2) {
                c0191 = (C0191) c2492.f7457;
            }
        }
        c0191.m655(textView);
        if (!(textView.getForeground() instanceof FocusRingDrawable)) {
            Context context2 = textView.getContext();
            Drawable foreground = textView.getForeground();
            ColorDrawable colorDrawable = FocusRingDrawable.f10389;
            if (AbstractC8174.m13596(context2.getTheme(), R.attr.focusRingsEnabled, false)) {
                foreground = new FocusRingDrawable(context2, foreground);
            }
            if (foreground instanceof FocusRingDrawable) {
                FocusRingDrawable focusRingDrawable = (FocusRingDrawable) foreground;
                C8648 c8648 = (C8648) c0191.f752;
                C8660 c8660 = focusRingDrawable.f10390;
                c8660.f24368 = c8648;
                c8660.f24379 = ((Rect) c0191.f749).top;
                textView.setForeground(focusRingDrawable);
            }
        }
        textView.setSelected(c0191 == ((C0191) c2492.f7457));
        textView.setOnClickListener(new ViewOnClickListenerC3119(this, i2));
    }
}
