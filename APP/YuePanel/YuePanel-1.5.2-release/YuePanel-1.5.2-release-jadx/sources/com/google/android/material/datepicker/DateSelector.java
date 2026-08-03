package com.google.android.material.datepicker;

import Yue.C6600;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7144;
import Yue.InterfaceC7613;
import Yue.InterfaceC7651;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.internal.ViewUtils;
import java.text.SimpleDateFormat;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public interface DateSelector<S> extends Parcelable {
    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ void lambda$showKeyboardWithAutoHideBehavior$0(EditText[] editTextArr, View view, boolean z) {
        for (EditText editText : editTextArr) {
            if (editText.hasFocus()) {
                return;
            }
        }
        ViewUtils.hideKeyboard(view, false);
    }

    static void showKeyboardWithAutoHideBehavior(@InterfaceC6391 final EditText... editTextArr) {
        if (editTextArr.length == 0) {
            return;
        }
        View.OnFocusChangeListener onFocusChangeListener = new View.OnFocusChangeListener() { // from class: Yue.ۥۣ۟ۨ
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                DateSelector.lambda$showKeyboardWithAutoHideBehavior$0(editTextArr, view, z);
            }
        };
        for (EditText editText : editTextArr) {
            editText.setOnFocusChangeListener(onFocusChangeListener);
        }
        final EditText editText2 = editTextArr[0];
        editText2.postDelayed(new Runnable() { // from class: Yue.ۥۣ۟ۨ۟
            @Override // java.lang.Runnable
            public final void run() {
                ViewUtils.requestFocusAndShowKeyboard(editText2, false);
            }
        }, 100L);
    }

    @InterfaceC7651
    int getDefaultThemeResId(Context context);

    @InterfaceC7613
    int getDefaultTitleResId();

    @InterfaceC6490
    String getError();

    @InterfaceC6391
    Collection<Long> getSelectedDays();

    @InterfaceC6391
    Collection<C6600<Long, Long>> getSelectedRanges();

    @InterfaceC6490
    S getSelection();

    @InterfaceC6391
    String getSelectionContentDescription(@InterfaceC6391 Context context);

    @InterfaceC6391
    String getSelectionDisplayString(Context context);

    boolean isSelectionComplete();

    @InterfaceC6391
    View onCreateTextInputView(@InterfaceC6391 LayoutInflater layoutInflater, @InterfaceC6490 ViewGroup viewGroup, @InterfaceC6490 Bundle bundle, @InterfaceC6391 CalendarConstraints calendarConstraints, @InterfaceC6391 OnSelectionChangedListener<S> onSelectionChangedListener);

    void select(long j);

    void setSelection(@InterfaceC6391 S s);

    void setTextInputFormat(@InterfaceC6490 SimpleDateFormat simpleDateFormat);
}
