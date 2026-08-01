package com.google.android.material.datepicker;

import android.R;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.AbstractC3283;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.C3351;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.util.Calendar;
import java.util.Iterator;
import net.bytebuddy.jar.asm.Opcodes;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: com.google.android.material.datepicker.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3946 extends AbstractC3283 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final DayViewDecorator f10627;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final DateSelector f10628;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final CalendarConstraints f10629;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C3969 f10630;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C3970 f10631;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public int f10632 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final int f10633;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Month f10634;

    public C3946(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, C3970 c3970, C3969 c3969) {
        Month month = calendarConstraints.f10585;
        Month month2 = calendarConstraints.f10583;
        Month month3 = calendarConstraints.f10580;
        if (month.f10618.compareTo(month3.f10618) > 0) {
            C6755.m11869("firstPage cannot be after currentPage");
            throw null;
        }
        if (month3.f10618.compareTo(month2.f10618) > 0) {
            C6755.m11869("currentPage cannot be after lastPage");
            throw null;
        }
        this.f10633 = (contextThemeWrapper.getResources().getDimensionPixelSize(C0328R.dimen.mtrl_calendar_day_height) * C3950.f10642) + (C3968.m7700(contextThemeWrapper, R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(C0328R.dimen.mtrl_calendar_day_height) : 0);
        this.f10629 = calendarConstraints;
        this.f10628 = dateSelector;
        this.f10627 = dayViewDecorator;
        this.f10631 = c3970;
        this.f10630 = c3969;
        this.f10634 = month3;
        if (this.f7643.m5374()) {
            C6755.m11870("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            throw null;
        }
        this.f7642 = true;
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final long mo5353(int i) {
        Calendar calendarM7691 = AbstractC3953.m7691(this.f10629.f10585.f10618);
        calendarM7691.add(2, i);
        return new Month(calendarM7691).f10618.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo5354() {
        return this.f10629.f10582;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int m7678(Month month) {
        return this.f10629.f10585.m7675(month);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Month m7679(int i) {
        Calendar calendarM7691 = AbstractC3953.m7691(this.f10629.f10585.f10618);
        calendarM7691.add(2, i);
        return new Month(calendarM7691);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final AbstractC3317 mo5358(int i, ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0328R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!C3968.m7700(viewGroup.getContext(), R.attr.windowFullscreen)) {
            return new C3947(linearLayout, false);
        }
        linearLayout.setLayoutParams(new C3351(-1, this.f10633));
        return new C3947(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.AbstractC3283
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final void mo5365(AbstractC3317 abstractC3317, int i) {
        C3947 c3947 = (C3947) abstractC3317;
        CalendarConstraints calendarConstraints = this.f10629;
        Calendar calendarM7691 = AbstractC3953.m7691(calendarConstraints.f10585.f10618);
        calendarM7691.add(2, i);
        Month month = new Month(calendarM7691);
        c3947.f10636.setText(month.m7676());
        final MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c3947.f10635.findViewById(C0328R.id.month_grid);
        if (materialCalendarGridView.m7672() == null || !month.equals(materialCalendarGridView.m7672().f10648)) {
            C3950 c3950 = new C3950(month, this.f10628, calendarConstraints, this.f10627);
            materialCalendarGridView.setNumColumns(month.f10613);
            materialCalendarGridView.setAdapter((ListAdapter) c3950);
        } else {
            materialCalendarGridView.invalidate();
            C3950 c3950M7672 = materialCalendarGridView.m7672();
            DateSelector dateSelector = c3950M7672.f10647;
            Iterator it = c3950M7672.f10646.iterator();
            while (it.hasNext()) {
                c3950M7672.m7686(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            if (dateSelector != null) {
                Iterator it2 = dateSelector.mo7657().iterator();
                while (it2.hasNext()) {
                    c3950M7672.m7686(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                c3950M7672.f10646 = dateSelector.mo7657();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new C3948(this, materialCalendarGridView));
        materialCalendarGridView.setOnMonthNavigationListener(this.f10630);
        boolean zM7700 = C3968.m7700(c3947.itemView.getContext(), R.attr.windowFullscreen);
        if (zM7700 || month.equals(this.f10634)) {
            materialCalendarGridView.setFocusable(true);
            materialCalendarGridView.setDescendantFocusability(131072);
        } else {
            materialCalendarGridView.setFocusable(false);
            materialCalendarGridView.setDescendantFocusability(Opcodes.ASM6);
        }
        if (zM7700 || !month.equals(this.f10634)) {
            return;
        }
        final int i2 = this.f10632;
        this.f10632 = 0;
        materialCalendarGridView.post(new Runnable(this) { // from class: com.google.android.material.datepicker.飘花落叶言子世楪苏兰哲
            @Override // java.lang.Runnable
            public final void run() {
                int i3;
                int iM7685;
                MaterialCalendarGridView materialCalendarGridView2 = materialCalendarGridView;
                if (!materialCalendarGridView2.hasFocus() || (i3 = i2) == 0) {
                    return;
                }
                C3950 c3950M76722 = materialCalendarGridView2.m7672();
                if (i3 == 1) {
                    iM7685 = c3950M76722.m7684(c3950M76722.m7680() + 1);
                    if (iM7685 == -1) {
                        iM7685 = c3950M76722.m7680();
                    }
                } else {
                    iM7685 = c3950M76722.m7685(c3950M76722.m7683() - 1);
                    if (iM7685 == -1) {
                        iM7685 = c3950M76722.m7683();
                    }
                }
                materialCalendarGridView2.setSelection(iM7685);
            }
        });
    }
}
