package p025N;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.AbstractC0483h;
import androidx.emoji2.text.C0485j;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: N.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0252c extends AbstractC0483h {

    /* JADX INFO: renamed from: a */
    public final WeakReference f531a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f532b;

    public C0252c(TextView r2, C0253d r3) {
        this.f531a = new WeakReference(r2);
        this.f532b = new WeakReference(r3);
    }

    @Override // androidx.emoji2.text.AbstractC0483h
    /* JADX INFO: renamed from: b */
    public final void mo685b() {
        TextView r02 = (TextView) this.f531a.get();
        InputFilter r1 = (InputFilter) this.f532b.get();
        if (r1 == null) goto L35;
        if (r02 == null) goto L43;
        InputFilter[] r2 = r02.getFilters();
        if (r2 == null) goto L44;
        int r4 = 0;
    L11:
        if (r4 >= r2.length) goto L45;
        if (r2[r4] == r1) goto L15;
        r4 = r4 + 1;
        goto L11
    L15:
        if (r02.isAttachedToWindow() == false) goto L38;
        CharSequence r12 = r02.getText();
        C0485j r22 = C0485j.m1199a();
        if (r12 != null) goto L19;
        int r42 = 0;
    L20:
        CharSequence r23 = r22.m1204f(r12, 0, r42);
        if (r12 != r23) goto L23;
        return;
    L23:
        int r13 = Selection.getSelectionStart(r23);
        int r3 = Selection.getSelectionEnd(r23);
        r02.setText(r23);
        if ((r23 instanceof Spannable) == false) goto L39;
        Spannable r24 = (Spannable) r23;
        if (r13 < 0) goto L29;
        if (r3 < 0) goto L29;
        Selection.setSelection(r24, r13, r3);
        return;
    L29:
        if (r13 < 0) goto L31;
        Selection.setSelection(r24, r13);
        return;
    L31:
        if (r3 < 0) goto L42;
        Selection.setSelection(r24, r3);
        return;
    L42:
        return;
    L39:
        return;
    L19:
        r22.getClass();
        r42 = r12.length();
        goto L20
    L38:
        return;
    L45:
        return;
    L44:
        return;
    L43:
        return;
    }
}
