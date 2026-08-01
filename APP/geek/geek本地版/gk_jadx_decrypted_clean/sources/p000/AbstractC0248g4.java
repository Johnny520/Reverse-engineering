package p000;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: g4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0248g4 {
    /* JADX INFO: renamed from: a */
    public static boolean m1257a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0962zc c0431l0;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0431l0 = new C0431l0(clipData, 3);
            } else {
                C0014ad c0014ad = new C0014ad();
                c0014ad.f131b = clipData;
                c0014ad.f132c = 3;
                c0431l0 = c0014ad;
            }
            ja0.m1571h(textView, c0431l0.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1258b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0962zc c0431l0;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0431l0 = new C0431l0(clipData, 3);
        } else {
            C0014ad c0014ad = new C0014ad();
            c0014ad.f131b = clipData;
            c0014ad.f132c = 3;
            c0431l0 = c0014ad;
        }
        ja0.m1571h(view, c0431l0.build());
        return true;
    }
}
