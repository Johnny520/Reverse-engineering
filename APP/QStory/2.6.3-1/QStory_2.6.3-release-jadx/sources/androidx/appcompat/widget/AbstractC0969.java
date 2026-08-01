package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.C0960;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3077;
import androidx.core.view.InterfaceC3078;

/* JADX INFO: renamed from: androidx.appcompat.widget.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0969 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m1088(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC3078 c0960;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            c0960 = new C0960(clipData, 3);
        } else {
            C3077 c3077 = new C3077();
            c3077.f6887 = clipData;
            c3077.f6888 = 3;
            c0960 = c3077;
        }
        AbstractC3103.m4807(view, c0960.build());
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m1089(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC3078 c0960;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                c0960 = new C0960(clipData, 3);
            } else {
                C3077 c3077 = new C3077();
                c3077.f6887 = clipData;
                c3077.f6888 = 3;
                c0960 = c3077;
            }
            AbstractC3103.m4807(textView, c0960.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }
}
