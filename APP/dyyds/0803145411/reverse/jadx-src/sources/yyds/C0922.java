package yyds;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Toast;

/* JADX INFO: renamed from: yyds.ᛴᛸᲀᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0922 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public static final Handler f4225 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public boolean f4226;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final C2763 f4227;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public C1053 f4228;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f4230;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f4232;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final RunnableC0678 f4231 = new RunnableC0678(this, 0);

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final RunnableC0678 f4229 = new RunnableC0678(this, 1);

    public C0922(ContextWrapper contextWrapper, C2763 c2763) {
        this.f4227 = c2763;
        this.f4230 = contextWrapper.getPackageName();
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static void m2038(View view) {
        Context context = view.getContext();
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            AccessibilityEvent accessibilityEvent = new AccessibilityEvent();
            accessibilityEvent.setEventType(64);
            accessibilityEvent.setClassName(Toast.class.getName());
            accessibilityEvent.setPackageName(context.getPackageName());
            view.dispatchPopulateAccessibilityEvent(accessibilityEvent);
            accessibilityManager.sendAccessibilityEvent(accessibilityEvent);
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final void m2039() {
        if (this.f4232) {
            RunnableC0678 runnableC0678 = this.f4231;
            Handler handler = f4225;
            handler.removeCallbacks(runnableC0678);
            Looper looperMyLooper = Looper.myLooper();
            Looper mainLooper = Looper.getMainLooper();
            RunnableC0678 runnableC06782 = this.f4229;
            if (looperMyLooper == mainLooper) {
                runnableC06782.run();
            } else {
                handler.removeCallbacks(runnableC06782);
                handler.post(runnableC06782);
            }
        }
    }
}
