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
    public static boolean m1599a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC2669wb c0132d2;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0132d2 = new C0132D2(clipData, 3);
            } else {
                C2712xb c2712xb = new C2712xb();
                c2712xb.f9286b = clipData;
                c2712xb.f9287c = 3;
                c0132d2 = c2712xb;
            }
            AbstractC2185lE.m4395h(textView, c0132d2.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1600b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC2669wb c0132d2;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0132d2 = new C0132D2(clipData, 3);
        } else {
            C2712xb c2712xb = new C2712xb();
            c2712xb.f9286b = clipData;
            c2712xb.f9287c = 3;
            c0132d2 = c2712xb;
        }
        AbstractC2185lE.m4395h(view, c0132d2.build());
        return true;
    }
}
