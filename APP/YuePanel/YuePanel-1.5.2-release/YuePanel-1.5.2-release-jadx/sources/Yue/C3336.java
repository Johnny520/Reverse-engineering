package Yue;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3336 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6391
    public TextView f229;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6490
    public TextClassifier f230;

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡۦ$ۥ */
    @InterfaceC7113(26)
    public static final class C0110 {
        @InterfaceC6391
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static TextClassifier m408(@InterfaceC6391 TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    public C3336(@InterfaceC6391 TextView textView) {
        this.f229 = (TextView) C6740.m21415(textView);
    }

    @InterfaceC6391
    @InterfaceC7113(api = 26)
    /* JADX INFO: renamed from: ۥ */
    public TextClassifier m406() {
        TextClassifier textClassifier = this.f230;
        return textClassifier == null ? C0110.m408(this.f229) : textClassifier;
    }

    @InterfaceC7113(api = 26)
    /* JADX INFO: renamed from: ۥ۟ */
    public void m407(@InterfaceC6490 TextClassifier textClassifier) {
        this.f230 = textClassifier;
    }
}
