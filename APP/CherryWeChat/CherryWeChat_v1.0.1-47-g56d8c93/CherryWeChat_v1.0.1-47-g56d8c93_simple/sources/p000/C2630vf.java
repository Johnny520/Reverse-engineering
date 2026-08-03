package p000;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: vf */
/* JADX INFO: loaded from: classes.dex */
public final class C2630vf extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f9137a;

    /* JADX INFO: renamed from: b */
    public final C2220m6 f9138b;

    public C2630vf(EditText r4, InputConnection r5, EditorInfo r6) {
        C2220m6 r0 = new C2220m6(18);
        super(r5, false);
        this.f9137a = r4;
        this.f9138b = r0;
        if (C2372pf.f8342k == null) goto L17;
        C2372pf r42 = C2372pf.m4798a();
        if (r42.m4799b() != 1) goto L18;
        if (r6 != null) goto L9;
        return;
    L9:
        if (r6.extras != null) goto L11;
        r6.extras = new Bundle();
    L11:
        C2192lf r43 = r42.f8347e;
        r43.getClass();
        Bundle r52 = r6.extras;
        C0679Pr r44 = (C0679Pr) r43.f7646c.f8520a;
        int r02 = r44.m4624a(4);
        if (r02 == 0) goto L14;
        int r45 = ((ByteBuffer) r44.f8037d).getInt(r02 + r44.f8034a);
    L15:
        r52.putInt("android.support.text.emoji.emojiCompat_metadataVersion", r45);
        r6.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        return;
    L14:
        r45 = 0;
        goto L15
    L18:
        return;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int r3, int r4) {
        Editable r0 = this.f9137a.getEditableText();
        this.f9138b.getClass();
        if (C2220m6.m4465i(this, r0, r3, r4, false) == false) goto L5;
        return true;
    L5:
        if (super.deleteSurroundingText(r3, r4) == true) goto L10;
        return false;
    L10:
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r3, int r4) {
        Editable r0 = this.f9137a.getEditableText();
        this.f9138b.getClass();
        if (C2220m6.m4465i(this, r0, r3, r4, true) == false) goto L5;
    L9:
        return true;
    L5:
        if (super.deleteSurroundingTextInCodePoints(r3, r4) == true) goto L9;
        return false;
    }
}
