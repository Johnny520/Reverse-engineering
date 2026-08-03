package p057g;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* JADX INFO: renamed from: g.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0848A {
    /* JADX INFO: renamed from: a */
    public static TextClassifier m2158a(TextView r1) {
        TextClassificationManager r12 = (TextClassificationManager) r1.getContext().getSystemService(TextClassificationManager.class);
        if (r12 == null) goto L7;
        return r12.getTextClassifier();
    L7:
        return TextClassifier.NO_OP;
    }
}
