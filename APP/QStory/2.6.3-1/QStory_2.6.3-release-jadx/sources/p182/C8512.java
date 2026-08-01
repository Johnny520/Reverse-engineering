package p182;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;
import p091.C7787;
import p183.C8542;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8512 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C7787 f21205;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final TextView f21206;

    public C8512(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        C7787 c7787 = new C7787(5);
        super(inputConnection, false);
        this.f21206 = textView;
        this.f21205 = c7787;
        if (C8542.m13568()) {
            C8542.m13569().m13576(editorInfo);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f21206.getEditableText();
        this.f21205.getClass();
        return C7787.m12819(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f21206.getEditableText();
        this.f21205.getClass();
        return C7787.m12819(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
