package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.AbstractC2450;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.C2518;
import com.davemorrissey.labs.subscaleview.R;
import java.util.Calendar;
import java.util.Iterator;
import net.bytebuddy.jar.asm.Opcodes;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3114 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final DayViewDecorator f10282;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final DateSelector f10283;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final CalendarConstraints f10284;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C3137 f10285;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3138 f10286;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f10287 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f10288;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Month f10289;

    public C3114(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, C3138 c3138, C3137 c3137) {
        Month month = calendarConstraints.f10240;
        Month month2 = calendarConstraints.f10238;
        Month month3 = calendarConstraints.f10235;
        if (month.f10273.compareTo(month3.f10273) > 0) {
            C5925.m11310("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.f10273.compareTo(month2.f10273) > 0) {
            C5925.m11310("currentPage cannot be after lastPage");
            throw null;
        }
        this.f10288 = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C3118.f10297) + (C3136.m7141(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f10284 = calendarConstraints;
        this.f10283 = dateSelector;
        this.f10282 = dayViewDecorator;
        this.f10286 = c3138;
        this.f10285 = c3137;
        this.f10289 = month3;
        if (this.f7298.m4814()) {
            C5925.m11311("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.f7297 = true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo4793(int i) {
        Calendar calendarM7132 = AbstractC3121.m7132(this.f10284.f10240.f10273);
        calendarM7132.add(2, i);
        return new Month(calendarM7132).f10273.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4794() {
        return this.f10284.f10237;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int m7119(Month month) {
        return this.f10284.f10240.m7116(month);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Month m7120(int i) {
        Calendar calendarM7132 = AbstractC3121.m7132(this.f10284.f10240.f10273);
        calendarM7132.add(2, i);
        return new Month(calendarM7132);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4798(int i, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C3136.m7141(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C3115(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C2518(-1, this.f10288));
        return new C3115(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4805(AbstractC2484 abstractC2484, int i) {
        C3115 c3115 = (C3115) abstractC2484;
        CalendarConstraints calendarConstraints = this.f10284;
        Calendar calendarM7132 = AbstractC3121.m7132(calendarConstraints.f10240.f10273);
        calendarM7132.add(2, i);
        Month month = new Month(calendarM7132);
        c3115.f10291.setText(month.m7117());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c3115.f10290.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m7113() == null || !month.equals(materialCalendarGridView.m7113().f10303)) {
            C3118 c3118 = new C3118(month, this.f10283, calendarConstraints, this.f10282);
            materialCalendarGridView.setNumColumns(month.f10268);
            materialCalendarGridView.setAdapter((ListAdapter) c3118);
        } else {
            materialCalendarGridView.invalidate();
            C3118 c3118M7113 = materialCalendarGridView.m7113();
            DateSelector dateSelector = c3118M7113.f10302;
            Iterator it = c3118M7113.f10301.iterator();
            while (it.hasNext()) {
                c3118M7113.m7127(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            if (dateSelector != null) {
                Iterator it2 = dateSelector.mo7098().iterator();
                while (it2.hasNext()) {
                    c3118M7113.m7127(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                c3118M7113.f10301 = dateSelector.mo7098();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C3116(this, materialCalendarGridView));
        materialCalendarGridView.setOnMonthNavigationListener(this.f10285);
        boolean zM7141 = C3136.m7141(c3115.itemView.getContext(), android.R.attr.windowFullscreen);
        if (zM7141 || month.equals(this.f10289)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(Opcodes.ASM6);
        }
        if (zM7141 || !month.equals(this.f10289)) {
            return;
        }
        final int i2 = this.f10287;
        this.f10287 = 0;
        materialCalendarGridView.post(new Runnable(this) { // from class: com.google.android.material.datepicker.飘花落叶言子世楪苏兰哲
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                int iM7126;
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                if (!materialCalendarGridView2.hasFocus() || (i3 = i2) == 0) {
                    return;
                }
                C3118 c3118M71132 = materialCalendarGridView2.m7113();
                if (i3 == 1) {
                    iM7126 = c3118M71132.m7125(c3118M71132.m7121() + 1);
                    if (iM7126 == -1) {
                        iM7126 = c3118M71132.m7121();
                    }
                } else {
                    iM7126 = c3118M71132.m7126(c3118M71132.m7124() - 1);
                    if (iM7126 == -1) {
                        iM7126 = c3118M71132.m7124();
                    }
                }
                materialCalendarGridView2.setSelection(iM7126);
            }
        });
    }
}
