package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import p048b.AbstractC0550a;
import p057g.C0868K;

/* JADX INFO: loaded from: classes.dex */
public class DialogTitle extends C0868K {
    public DialogTitle(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // p057g.C0868K, android.widget.TextView, android.view.View
    public final void onMeasure(int r7, int r8) {
        super.onMeasure(r7, r8);
        Layout r02 = getLayout();
        if (r02 == null) goto L13;
        int r1 = r02.getLineCount();
        if (r1 > 0) goto L7;
        return;
    L7:
        if (r02.getEllipsisCount(r1 - 1) <= 0) goto L15;
        setSingleLine(false);
        setMaxLines(2);
        TypedArray r12 = getContext().obtainStyledAttributes(null, AbstractC0550a.f1634s, R.attr.textAppearanceMedium, R.style.TextAppearance.Medium);
        int r2 = r12.getDimensionPixelSize(0, 0);
        if (r2 == 0) goto L11;
        setTextSize(0, r2);
    L11:
        r12.recycle();
        super.onMeasure(r7, r8);
        return;
    L15:
        return;
    }
}
