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
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3113 extends AbstractC2450 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final DayViewDecorator f10277;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final DateSelector f10278;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final CalendarConstraints f10279;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C3136 f10280;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3137 f10281;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f10282 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f10283;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Month f10284;

    public C3113(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, C3137 c3137, C3136 c3136) {
        Month month = calendarConstraints.f10235;
        Month month2 = calendarConstraints.f10233;
        Month month3 = calendarConstraints.f10230;
        if (month.f10268.compareTo(month3.f10268) > 0) {
            C5919.m11249("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.f10268.compareTo(month2.f10268) > 0) {
            C5919.m11249("currentPage cannot be after lastPage");
            throw null;
        }
        this.f10283 = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * C3117.f10292) + (C3135.m7154(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f10279 = calendarConstraints;
        this.f10278 = dateSelector;
        this.f10277 = dayViewDecorator;
        this.f10281 = c3137;
        this.f10280 = c3136;
        this.f10284 = month3;
        if (this.f7297.m4804()) {
            C5919.m11250("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.f7296 = true;
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo4783(int i) {
        Calendar calendarM7145 = AbstractC3120.m7145(this.f10279.f10235.f10268);
        calendarM7145.add(2, i);
        return new Month(calendarM7145).f10268.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo4784() {
        return this.f10279.f10232;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int m7132(Month month) {
        return this.f10279.f10235.m7129(month);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Month m7133(int i) {
        Calendar calendarM7145 = AbstractC3120.m7145(this.f10279.f10235.f10268);
        calendarM7145.add(2, i);
        return new Month(calendarM7145);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC2484 mo4788(int i, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C3135.m7154(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new C3114(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C2518(-1, this.f10283));
        return new C3114(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.AbstractC2450
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo4795(AbstractC2484 abstractC2484, int i) {
        C3114 c3114 = (C3114) abstractC2484;
        CalendarConstraints calendarConstraints = this.f10279;
        Calendar calendarM7145 = AbstractC3120.m7145(calendarConstraints.f10235.f10268);
        calendarM7145.add(2, i);
        Month month = new Month(calendarM7145);
        c3114.f10286.setText(month.m7130());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c3114.f10285.findViewById(R.id.month_grid);
        if (materialCalendarGridView.m7126() == null || !month.equals(materialCalendarGridView.m7126().f10298)) {
            C3117 c3117 = new C3117(month, this.f10278, calendarConstraints, this.f10277);
            materialCalendarGridView.setNumColumns(month.f10263);
            materialCalendarGridView.setAdapter((ListAdapter) c3117);
        } else {
            materialCalendarGridView.invalidate();
            C3117 c3117M7126 = materialCalendarGridView.m7126();
            DateSelector dateSelector = c3117M7126.f10297;
            Iterator it = c3117M7126.f10296.iterator();
            while (it.hasNext()) {
                c3117M7126.m7140(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            if (dateSelector != null) {
                Iterator it2 = dateSelector.mo7112().iterator();
                while (it2.hasNext()) {
                    c3117M7126.m7140(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                c3117M7126.f10296 = dateSelector.mo7112();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C3115(this, materialCalendarGridView));
        materialCalendarGridView.setOnMonthNavigationListener(this.f10280);
        boolean zM7154 = C3135.m7154(c3114.itemView.getContext(), android.R.attr.windowFullscreen);
        if (zM7154 || month.equals(this.f10284)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(Opcodes.ASM6);
        }
        if (zM7154 || !month.equals(this.f10284)) {
            return;
        }
        final int i2 = this.f10282;
        this.f10282 = 0;
        materialCalendarGridView.post(new Runnable(this) { // from class: com.google.android.material.datepicker.飘花落叶言子世楪苏兰哲
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                int iM7139;
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                if (!materialCalendarGridView2.hasFocus() || (i3 = i2) == 0) {
                    return;
                }
                C3117 c3117M71262 = materialCalendarGridView2.m7126();
                if (i3 == 1) {
                    iM7139 = c3117M71262.m7138(c3117M71262.m7134() + 1);
                    if (iM7139 == -1) {
                        iM7139 = c3117M71262.m7134();
                    }
                } else {
                    iM7139 = c3117M71262.m7139(c3117M71262.m7137() - 1);
                    if (iM7139 == -1) {
                        iM7139 = c3117M71262.m7137();
                    }
                }
                materialCalendarGridView2.setSelection(iM7139);
            }
        });
    }
}
