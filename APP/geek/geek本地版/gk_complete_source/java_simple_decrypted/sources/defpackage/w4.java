package defpackage;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class w4 {
    public static TextClassifier a(TextView r1) {
        TextClassificationManager r12 = (TextClassificationManager) r1.getContext().getSystemService(TextClassificationManager.class);
        if (r12 == null) goto L7;
        return r12.getTextClassifier();
    L7:
        return TextClassifier.NO_OP;
    }
}
