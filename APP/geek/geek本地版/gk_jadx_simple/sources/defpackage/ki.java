package defpackage;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ki extends ci {
    public final WeakReference a;
    public final WeakReference b;

    public ki(TextView r2, li r3) {
        this.a = new WeakReference(r2);
        this.b = new WeakReference(r3);
    }

    @Override // defpackage.ci
    public final void a() {
        TextView r0 = (TextView) this.a.get();
        InputFilter r1 = (InputFilter) this.b.get();
        if (r1 == null) goto L37;
        if (r0 == null) goto L43;
        InputFilter[] r2 = r0.getFilters();
        if (r2 == null) goto L44;
        int r4 = 0;
    L11:
        if (r4 >= r2.length) goto L46;
        if (r2[r4] == r1) goto L15;
        r4 = r4 + 1;
        goto L11
    L15:
        if (r0.isAttachedToWindow() == false) goto L40;
        CharSequence r12 = r0.getText();
        ei r22 = ei.a();
        if (r12 != null) goto L19;
        int r42 = 0;
    L20:
        CharSequence r23 = r22.e(r12, 0, r42);
        if (r12 == r23) goto L45;
        int r13 = Selection.getSelectionStart(r23);
        int r3 = Selection.getSelectionEnd(r23);
        r0.setText(r23);
        if ((r23 instanceof Spannable) == false) goto L41;
        Spannable r24 = (Spannable) r23;
        if (r13 < 0) goto L30;
        if (r3 < 0) goto L30;
        Selection.setSelection(r24, r13, r3);
        return;
    L30:
        if (r13 < 0) goto L33;
        Selection.setSelection(r24, r13);
        return;
    L33:
        if (r3 < 0) goto L42;
        Selection.setSelection(r24, r3);
        return;
    L42:
        return;
    L41:
        return;
    L45:
        return;
    L19:
        r22.getClass();
        r42 = r12.length();
        goto L20
    L40:
        return;
    L46:
        return;
    L44:
        return;
    L43:
        return;
    }
}
