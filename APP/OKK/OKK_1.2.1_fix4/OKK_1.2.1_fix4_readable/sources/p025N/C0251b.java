package p025N;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import androidx.emoji2.text.C0481f;
import androidx.emoji2.text.C0485j;
import java.nio.ByteBuffer;
import p023M.C0248b;
import p089x0.C1121e;

/* JADX INFO: renamed from: N.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0251b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a */
    public final TextView f529a;

    /* JADX INFO: renamed from: b */
    public final C1121e f530b;

    public C0251b(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        C1121e c1121e = new C1121e(4);
        super(inputConnection, false);
        this.f529a = textView;
        this.f530b = c1121e;
        if (C0485j.f1354k != null) {
            C0485j c0485jM1199a = C0485j.m1199a();
            if (c0485jM1199a.m1200b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0481f c0481f = c0485jM1199a.f1359e;
            c0481f.getClass();
            Bundle bundle = editorInfo.extras;
            C0248b c0248b = (C0248b) c0481f.f1352c.f1044a;
            int iM205a = c0248b.m205a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM205a != 0 ? ((ByteBuffer) c0248b.f214d).getInt(iM205a + c0248b.f211a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0481f.f1350a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i2, int i3) {
        Editable editableText = this.f529a.getEditableText();
        this.f530b.getClass();
        return C1121e.m2637e(this, editableText, i2, i3, false) || super.deleteSurroundingText(i2, i3);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i2, int i3) {
        Editable editableText = this.f529a.getEditableText();
        this.f530b.getClass();
        return C1121e.m2637e(this, editableText, i2, i3, true) || super.deleteSurroundingTextInCodePoints(i2, i3);
    }
}
