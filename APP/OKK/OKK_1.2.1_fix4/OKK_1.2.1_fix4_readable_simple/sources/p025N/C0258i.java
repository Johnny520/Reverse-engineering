package p025N;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.C0485j;

/* JADX INFO: renamed from: N.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0258i implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public final EditText f543a;

    /* JADX INFO: renamed from: b */
    public final boolean f544b;

    /* JADX INFO: renamed from: c */
    public C0257h f545c;

    /* JADX INFO: renamed from: d */
    public boolean f546d;

    public C0258i(EditText r1) {
        this.f543a = r1;
        this.f544b = false;
        this.f546d = true;
    }

    /* JADX INFO: renamed from: a */
    public static void m687a(EditText r4, int r5) {
        if (r5 != 1) goto L20;
        if (r4 != null) goto L6;
        return;
    L6:
        if (r4.isAttachedToWindow() == false) goto L22;
        Editable r42 = r4.getEditableText();
        int r52 = Selection.getSelectionStart(r42);
        int r02 = Selection.getSelectionEnd(r42);
        C0485j r1 = C0485j.m1199a();
        if (r42 != null) goto L10;
        int r3 = 0;
    L11:
        r1.m1204f(r42, 0, r3);
        if (r52 < 0) goto L15;
        if (r02 < 0) goto L15;
        Selection.setSelection(r42, r52, r02);
        return;
    L15:
        if (r52 < 0) goto L17;
        Selection.setSelection(r42, r52);
        return;
    L17:
        if (r02 < 0) goto L25;
        Selection.setSelection(r42, r02);
        return;
    L25:
        return;
    L10:
        r1.getClass();
        r3 = r42.length();
        goto L11
    L22:
        return;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r1) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r3, int r4, int r5, int r6) {
        EditText r02 = this.f543a;
        if (r02.isInEditMode() == false) goto L5;
        return;
    L5:
        if (this.f546d == true) goto L7;
        return;
    L7:
        if (this.f544b == false) goto L9;
    L10:
        if (r5 <= r6) goto L12;
        return;
    L12:
        if ((r3 instanceof Spannable) == false) goto L30;
        int r52 = C0485j.m1199a().m1200b();
        if (r52 != 0) goto L16;
    L21:
        C0485j r32 = C0485j.m1199a();
        if (this.f545c != null) goto L24;
        this.f545c = new C0257h(r02);
    L24:
        r32.m1205g(this.f545c);
        return;
    L16:
        if (r52 != 1) goto L18;
        C0485j r53 = C0485j.m1199a();
        r53.m1204f((Spannable) r3, r4, r6 + r4);
        return;
    L18:
        if (r52 == 3) goto L21;
        return;
    L30:
        return;
    L9:
        if (C0485j.f1354k != null) goto L10;
    }
}
