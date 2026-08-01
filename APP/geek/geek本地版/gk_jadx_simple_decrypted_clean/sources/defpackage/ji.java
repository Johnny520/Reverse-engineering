package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ji extends InputConnectionWrapper {
    public final EditText a;
    public final vh b;

    public ji(EditText r4, InputConnection r5, EditorInfo r6) {
        vh r0 = new vh(18);
        super(r5, false);
        this.a = r4;
        this.b = r0;
        if (ei.j == null) goto L17;
        ei r42 = ei.a();
        if (r42.b() != 1) goto L18;
        if (r6 != null) goto L9;
        return;
    L9:
        if (r6.extras != null) goto L11;
        r6.extras = new Bundle();
    L11:
        zh r43 = r42.e;
        r43.getClass();
        Bundle r52 = r6.extras;
        wv r44 = (wv) r43.c.a;
        int r02 = r44.a(4);
        if (r02 == 0) goto L14;
        int r45 = ((ByteBuffer) r44.d).getInt(r02 + r44.a);
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
        Editable r0 = this.a.getEditableText();
        this.b.getClass();
        if (vh.i(this, r0, r3, r4, false) == false) goto L5;
        return true;
    L5:
        if (super.deleteSurroundingText(r3, r4) == true) goto L10;
        return false;
    L10:
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int r3, int r4) {
        Editable r0 = this.a.getEditableText();
        this.b.getClass();
        if (vh.i(this, r0, r3, r4, true) == false) goto L5;
    L9:
        return true;
    L5:
        if (super.deleteSurroundingTextInCodePoints(r3, r4) == true) goto L9;
        return false;
    }
}
