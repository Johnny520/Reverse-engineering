package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class w4 {
    public static android.view.textclassifier.TextClassifier a(android.widget.TextView r1) {
            android.content.Context r1 = r1.getContext()
            java.lang.Class<android.view.textclassifier.TextClassificationManager> r0 = android.view.textclassifier.TextClassificationManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.textclassifier.TextClassificationManager r1 = (android.view.textclassifier.TextClassificationManager) r1
            if (r1 == 0) goto L13
            android.view.textclassifier.TextClassifier r1 = r1.getTextClassifier()
            return r1
        L13:
            android.view.textclassifier.TextClassifier r1 = android.view.textclassifier.TextClassifier.NO_OP
            return r1
    }
}
