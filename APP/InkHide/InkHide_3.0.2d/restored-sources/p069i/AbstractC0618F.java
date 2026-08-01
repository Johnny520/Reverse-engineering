package p069i;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p004C.C0066j;
import p099y.AbstractC1048L;
import p099y.C1070e;
import p099y.InterfaceC1068d;

/* JADX INFO: renamed from: i.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0618F {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m1217a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC1068d c0066j;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0066j = new C0066j(clipData, 3);
            } else {
                C1070e c1070e = new C1070e();
                c1070e.f3695c = clipData;
                c1070e.f3696d = 3;
                c0066j = c1070e;
            }
            AbstractC1048L.m2287f(textView, c0066j.mo140k());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m1218b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC1068d c0066j;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0066j = new C0066j(clipData, 3);
        } else {
            C1070e c1070e = new C1070e();
            c1070e.f3695c = clipData;
            c1070e.f3696d = 3;
            c0066j = c1070e;
        }
        AbstractC1048L.m2287f(view, c0066j.mo140k());
        return true;
    }
}
