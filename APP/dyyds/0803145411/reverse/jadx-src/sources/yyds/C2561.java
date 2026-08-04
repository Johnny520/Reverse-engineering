package yyds;

import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: yyds.ᲇᲈᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2561 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final TextView f12639;

    public C2561(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        super(inputConnection, false);
        this.f12639 = textView;
        if (C0331.f1745 != null) {
            C0331 c0331M1001 = C0331.m1001();
            if (c0331M1001.m1003() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C2505 c2505 = c0331M1001.f1747;
            c2505.getClass();
            Bundle bundle = editorInfo.extras;
            C2308 c2308 = (C2308) ((C0299) c2505.f12334).f1577;
            int iM3645 = c2308.m3645(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iM3645 != 0 ? ((ByteBuffer) c2308.f9366).getInt(iM3645 + c2308.f9365) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        return C2133.m4041(this, this.f12639.getEditableText(), i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        return C2133.m4041(this, this.f12639.getEditableText(), i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
