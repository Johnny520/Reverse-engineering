package com.google.android.material.datepicker;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public interface DateSelector<S> extends android.os.Parcelable {
    private static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(android.widget.EditText[] r3, android.view.View r4, boolean r5) {
            int r5 = r3.length
            r0 = 0
            r1 = r0
        L3:
            if (r1 >= r5) goto L11
            r2 = r3[r1]
            boolean r2 = r2.hasFocus()
            if (r2 == 0) goto Le
            return
        Le:
            int r1 = r1 + 1
            goto L3
        L11:
            com.google.android.material.internal.ViewUtils.hideKeyboard(r4, r0)
            return
    }

    private static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$1(android.view.View r1) {
            r0 = 0
            com.google.android.material.internal.ViewUtils.requestFocusAndShowKeyboard(r1, r0)
            return
    }

    static void showKeyboardWithAutoHideBehavior(@Yue.InterfaceC4410 android.widget.EditText... r5) {
            int r0 = r5.length
            if (r0 != 0) goto L4
            return
        L4:
            Yue.ۥۣ۟ۨ r0 = new Yue.ۥۣ۟ۨ
            r0.<init>(r5)
            int r1 = r5.length
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L16
            r4 = r5[r3]
            r4.setOnFocusChangeListener(r0)
            int r3 = r3 + 1
            goto Lc
        L16:
            r5 = r5[r2]
            Yue.ۥۣ۟ۨ۟ r0 = new Yue.ۥۣ۟ۨ۟
            r0.<init>(r5)
            r1 = 100
            r5.postDelayed(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    static /* synthetic */ void m30578(android.widget.EditText[] r0, android.view.View r1, boolean r2) {
            lambda$showKeyboardWithAutoHideBehavior$0(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    static /* synthetic */ void m30579(android.view.View r0) {
            lambda$showKeyboardWithAutoHideBehavior$1(r0)
            return
    }

    @Yue.InterfaceC6018
    int getDefaultThemeResId(android.content.Context r1);

    @Yue.InterfaceC5971
    int getDefaultTitleResId();

    @Yue.InterfaceC4544
    java.lang.String getError();

    @Yue.InterfaceC4410
    java.util.Collection<java.lang.Long> getSelectedDays();

    @Yue.InterfaceC4410
    java.util.Collection<Yue.C4678<java.lang.Long, java.lang.Long>> getSelectedRanges();

    @Yue.InterfaceC4544
    S getSelection();

    @Yue.InterfaceC4410
    java.lang.String getSelectionContentDescription(@Yue.InterfaceC4410 android.content.Context r1);

    @Yue.InterfaceC4410
    java.lang.String getSelectionDisplayString(android.content.Context r1);

    boolean isSelectionComplete();

    @Yue.InterfaceC4410
    android.view.View onCreateTextInputView(@Yue.InterfaceC4410 android.view.LayoutInflater r1, @Yue.InterfaceC4544 android.view.ViewGroup r2, @Yue.InterfaceC4544 android.os.Bundle r3, @Yue.InterfaceC4410 com.google.android.material.datepicker.CalendarConstraints r4, @Yue.InterfaceC4410 com.google.android.material.datepicker.OnSelectionChangedListener<S> r5);

    void select(long r1);

    void setSelection(@Yue.InterfaceC4410 S r1);

    void setTextInputFormat(@Yue.InterfaceC4544 java.text.SimpleDateFormat r1);
}
