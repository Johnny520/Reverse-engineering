package p014H;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.C0392g;
import androidx.emoji2.text.C0396k;
import java.nio.ByteBuffer;
import p012G.C0138b;
import p012G.C0140d;

/* JADX INFO: renamed from: H.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0144c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final EditText f448a;

    /* JADX INFO: renamed from: b */
    public final C0140d f449b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0144c(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        C0140d c0140d = new C0140d(1);
        super(inputConnection, false);
        this.f448a = editText;
        this.f449b = c0140d;
        if (C0396k.f1174j != null) {
            C0396k c0396kM761a = C0396k.m761a();
            if (c0396kM761a.m762b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0392g c0392g = c0396kM761a.f1179e;
            c0392g.getClass();
            Bundle bundle = editorInfo.extras;
            C0138b c0138b = (C0138b) c0392g.f1170c.f1209a;
            int iM303a = c0138b.m303a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM303a != 0 ? ((ByteBuffer) c0138b.f437d).getInt(iM303a + c0138b.f434a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0392g.f1168a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f448a.getEditableText();
        this.f449b.getClass();
        return C0140d.m309d(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f448a.getEditableText();
        this.f449b.getClass();
        return C0140d.m309d(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
