package yyds;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: yyds.ᛵᛴᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1063 {
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static boolean m2253(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0375 c0052;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0052 = new C0052(clipData, 3);
            } else {
                C2686 c2686 = new C2686();
                c2686.f13159 = clipData;
                c2686.f13155 = 3;
                c0052 = c2686;
            }
            AbstractC1640.m3345(textView, c0052.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static boolean m2254(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0375 c0052;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0052 = new C0052(clipData, 3);
        } else {
            C2686 c2686 = new C2686();
            c2686.f13159 = clipData;
            c2686.f13155 = 3;
            c0052 = c2686;
        }
        AbstractC1640.m3345(view, c0052.build());
        return true;
    }
}
