package p000;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: S3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0777S3 {
    /* JADX INFO: renamed from: a */
    public static boolean m1599a(DragEvent r2, TextView r3, Activity r4) {
        r4.requestDragAndDropPermissions(r2);
        int r42 = r3.getOffsetForPosition(r2.getX(), r2.getY());
        r3.beginBatchEdit();
        Selection.setSelection((Spannable) r3.getText(), r42);     // Catch: Throwable -> L10
        ClipData r22 = r2.getClipData();     // Catch: Throwable -> L10
        if (Build.VERSION.SDK_INT < 31) goto L6;
        InterfaceC2669wb r43 = new C0132D2(r22, 3);     // Catch: Throwable -> L10
    L7:
        AbstractC2185lE.m4395h(r3, r43.build());     // Catch: Throwable -> L10
        r3.endBatchEdit();
        return true;
    L6:
        C2712xb r44 = new C2712xb();     // Catch: Throwable -> L10
        r44.f9286b = r22;     // Catch: Throwable -> L10
        r44.f9287c = 3;     // Catch: Throwable -> L10
        r43 = r44;
    L10:
        th = move-exception;
        r3.endBatchEdit();
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1600b(DragEvent r2, View r3, Activity r4) {
        r4.requestDragAndDropPermissions(r2);
        ClipData r22 = r2.getClipData();
        if (Build.VERSION.SDK_INT < 31) goto L5;
        InterfaceC2669wb r42 = new C0132D2(r22, 3);
    L6:
        AbstractC2185lE.m4395h(r3, r42.build());
        return true;
    L5:
        C2712xb r43 = new C2712xb();
        r43.f9286b = r22;
        r43.f9287c = 3;
        r42 = r43;
        goto L6
    }
}
