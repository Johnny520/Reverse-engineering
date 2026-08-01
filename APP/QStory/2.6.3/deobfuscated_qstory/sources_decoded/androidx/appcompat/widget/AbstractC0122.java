package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.C0113;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2244;
import androidx.core.view.InterfaceC2245;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0122 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m528(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC2245 c0113;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0113 = new C0113(clipData, 3);
        } else {
            C2244 c2244 = new C2244();
            c2244.f6542 = clipData;
            c2244.f6543 = 3;
            c0113 = c2244;
        }
        AbstractC2270.m4247(view, c0113.build());
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m529(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC2245 c0113;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0113 = new C0113(clipData, 3);
            } else {
                C2244 c2244 = new C2244();
                c2244.f6542 = clipData;
                c2244.f6543 = 3;
                c0113 = c2244;
            }
            AbstractC2270.m4247(textView, c0113.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }
}
