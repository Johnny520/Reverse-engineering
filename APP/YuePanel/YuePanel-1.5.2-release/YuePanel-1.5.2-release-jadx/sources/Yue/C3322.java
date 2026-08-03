package Yue;

import Yue.C4152;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۡ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3322 {

    /* JADX INFO: renamed from: ۥ */
    public static final String f226 = "ReceiveContent";

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۡ۟$ۥ */
    @InterfaceC7113(24)
    public static final class C0104 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static boolean m393(@InterfaceC6391 DragEvent dragEvent, @InterfaceC6391 TextView textView, @InterfaceC6391 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                C8273.m27424(textView, new C4152.C0343(dragEvent.getClipData(), 3).m1113());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ۟ */
        public static boolean m394(@InterfaceC6391 DragEvent dragEvent, @InterfaceC6391 View view, @InterfaceC6391 Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            C8273.m27424(view, new C4152.C0343(dragEvent.getClipData(), 3).m1113());
            return true;
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static boolean m391(@InterfaceC6391 View view, @InterfaceC6391 DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && C8273.m27364(view) != null) {
            Activity activityM6784 = m6784(view);
            if (activityM6784 == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                return view instanceof TextView ? C0104.m393(dragEvent, (TextView) view, activityM6784) : C0104.m394(dragEvent, view, activityM6784);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static boolean m392(@InterfaceC6391 TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 31 || C8273.m27364(textView) == null || !(i == 16908322 || i == 16908337)) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C8273.m27424(textView, new C4152.C0343(primaryClip, 1).m12034(i != 16908322 ? 1 : 0).m1113());
        }
        return true;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static Activity m6784(@InterfaceC6391 View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
