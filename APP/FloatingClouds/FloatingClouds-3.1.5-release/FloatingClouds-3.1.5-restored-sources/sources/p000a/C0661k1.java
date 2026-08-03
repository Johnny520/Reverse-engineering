package p000a;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import p000a.C0401W3;

/* JADX INFO: renamed from: a.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0661k1 {
    /* JADX INFO: renamed from: a */
    public static boolean m1535a(DragEvent dragEvent, TextView textView, Activity activity) {
        C0401W3.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                aVar = new C0401W3.a(clipData, 3);
            } else {
                C0401W3.c cVar = new C0401W3.c();
                cVar.f1530a = clipData;
                cVar.f1531b = 3;
                aVar = cVar;
            }
            C0866ug.m1999f(textView, aVar.mo1041a());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1536b(DragEvent dragEvent, View view, Activity activity) {
        C0401W3.b aVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new C0401W3.a(clipData, 3);
        } else {
            C0401W3.c cVar = new C0401W3.c();
            cVar.f1530a = clipData;
            cVar.f1531b = 3;
            aVar = cVar;
        }
        C0866ug.m1999f(view, aVar.mo1041a());
        return true;
    }
}
