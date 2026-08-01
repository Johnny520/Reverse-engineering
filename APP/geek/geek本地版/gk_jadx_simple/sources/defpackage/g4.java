package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public abstract class g4 {
    public static boolean a(DragEvent r2, TextView r3, Activity r4) {
        r4.requestDragAndDropPermissions(r2);
        int r42 = r3.getOffsetForPosition(r2.getX(), r2.getY());
        r3.beginBatchEdit();
        Selection.setSelection((Spannable) r3.getText(), r42);     // Catch: Throwable -> L10
        ClipData r22 = r2.getClipData();     // Catch: Throwable -> L10
        if (Build.VERSION.SDK_INT < 31) goto L6;
        zc r43 = new l0(r22, 3);     // Catch: Throwable -> L10
    L7:
        ja0.h(r3, r43.build());     // Catch: Throwable -> L10
        r3.endBatchEdit();
        return true;
    L6:
        ad r44 = new ad();     // Catch: Throwable -> L10
        r44.b = r22;     // Catch: Throwable -> L10
        r44.c = 3;     // Catch: Throwable -> L10
        r43 = r44;
    L10:
        th = move-exception;
        r3.endBatchEdit();
        throw th;
    }

    public static boolean b(DragEvent r2, View r3, Activity r4) {
        r4.requestDragAndDropPermissions(r2);
        ClipData r22 = r2.getClipData();
        if (Build.VERSION.SDK_INT < 31) goto L5;
        zc r42 = new l0(r22, 3);
    L6:
        ja0.h(r3, r42.build());
        return true;
    L5:
        ad r43 = new ad();
        r43.b = r22;
        r43.c = 3;
        r42 = r43;
        goto L6
    }
}
