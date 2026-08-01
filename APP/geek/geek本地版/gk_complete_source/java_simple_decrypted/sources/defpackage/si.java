package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public final class si implements TextWatcher {
    public final EditText a;
    public ri b;
    public boolean c;

    public si(EditText r1) {
        this.a = r1;
        this.c = true;
    }

    public static void a(EditText r4, int r5) {
        if (r5 != 1) goto L22;
        if (r4 != null) goto L6;
        return;
    L6:
        if (r4.isAttachedToWindow() == false) goto L24;
        Editable r42 = r4.getEditableText();
        int r52 = Selection.getSelectionStart(r42);
        int r0 = Selection.getSelectionEnd(r42);
        ei r1 = ei.a();
        if (r42 != null) goto L10;
        int r3 = 0;
    L11:
        r1.e(r42, 0, r3);
        if (r52 < 0) goto L16;
        if (r0 < 0) goto L16;
        Selection.setSelection(r42, r52, r0);
        return;
    L16:
        if (r52 < 0) goto L19;
        Selection.setSelection(r42, r52);
        return;
    L19:
        if (r0 < 0) goto L25;
        Selection.setSelection(r42, r0);
        return;
    L25:
        return;
    L10:
        r1.getClass();
        r3 = r42.length();
        goto L11
    L24:
        return;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence r3, int r4, int r5, int r6) {
        EditText r0 = this.a;
        if (r0.isInEditMode() == false) goto L5;
        return;
    L5:
        if (this.c == true) goto L7;
        return;
    L7:
        if (ei.j == null) goto L27;
        if (r5 <= r6) goto L10;
        return;
    L10:
        if ((r3 instanceof Spannable) == false) goto L29;
        int r52 = ei.a().b();
        if (r52 != 0) goto L14;
    L20:
        ei r32 = ei.a();
        if (this.b != null) goto L23;
        this.b = new ri(r0);
    L23:
        r32.f(this.b);
        return;
    L14:
        if (r52 != 1) goto L16;
        ei r53 = ei.a();
        r53.e((Spannable) r3, r4, r6 + r4);
        return;
    L16:
        if (r52 == 3) goto L20;
        return;
    L29:
        return;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable r1) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence r1, int r2, int r3, int r4) {
    }
}
