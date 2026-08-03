package p057g;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p006D.AbstractC0080Q;
import p006D.C0095d;
import p006D.C0099f;
import p006D.InterfaceC0097e;

/* JADX INFO: renamed from: g.z */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0940z {
    /* JADX INFO: renamed from: a */
    public static boolean m2273a(DragEvent r2, TextView r3, Activity r4) {
        r4.requestDragAndDropPermissions(r2);
        int r42 = r3.getOffsetForPosition(r2.getX(), r2.getY());
        r3.beginBatchEdit();
        Selection.setSelection((Spannable) r3.getText(), r42);     // Catch: Throwable -> L10
        ClipData r22 = r2.getClipData();     // Catch: Throwable -> L10
        if (Build.VERSION.SDK_INT < 31) goto L6;
        InterfaceC0097e r43 = new C0095d(r22, 3);     // Catch: Throwable -> L10
    L7:
        AbstractC0080Q.m287f(r3, r43.mo347m());     // Catch: Throwable -> L10
        r3.endBatchEdit();
        return true;
    L6:
        C0099f r44 = new C0099f();     // Catch: Throwable -> L10
        r44.f258b = r22;     // Catch: Throwable -> L10
        r44.f259c = 3;     // Catch: Throwable -> L10
        r43 = r44;
    L10:
        th = move-exception;
        r3.endBatchEdit();
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2274b(DragEvent r2, View r3, Activity r4) {
        r4.requestDragAndDropPermissions(r2);
        ClipData r22 = r2.getClipData();
        if (Build.VERSION.SDK_INT < 31) goto L5;
        InterfaceC0097e r42 = new C0095d(r22, 3);
    L6:
        AbstractC0080Q.m287f(r3, r42.mo347m());
        return true;
    L5:
        C0099f r43 = new C0099f();
        r43.f258b = r22;
        r43.f259c = 3;
        r42 = r43;
        goto L6
    }
}
