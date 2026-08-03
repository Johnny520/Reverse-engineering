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
    public static boolean m2273a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0097e c0095d;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0095d = new C0095d(clipData, 3);
            } else {
                C0099f c0099f = new C0099f();
                c0099f.f258b = clipData;
                c0099f.f259c = 3;
                c0095d = c0099f;
            }
            AbstractC0080Q.m287f(textView, c0095d.mo347m());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m2274b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0097e c0095d;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0095d = new C0095d(clipData, 3);
        } else {
            C0099f c0099f = new C0099f();
            c0099f.f258b = clipData;
            c0099f.f259c = 3;
            c0095d = c0099f;
        }
        AbstractC0080Q.m287f(view, c0095d.mo347m());
        return true;
    }
}
