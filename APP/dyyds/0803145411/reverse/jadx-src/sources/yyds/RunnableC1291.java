package yyds;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛶᛲᲈᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1291 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C1681 f5936;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f5937;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final C2791 f5938;

    public /* synthetic */ RunnableC1291(C1681 c1681, C2791 c2791, int i) {
        this.f5937 = i;
        this.f5936 = c1681;
        this.f5938 = c2791;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i = this.f5937;
        int i2 = 1;
        C1681 c1681 = this.f5936;
        C2791 c2791 = this.f5938;
        switch (i) {
            case 0:
                c1681.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                c1681.getClass();
                C1681.f8569.postAtTime(new RunnableC1291(c1681, c2791, i2), jUptimeMillis + ((long) (C1681.m3426() == null ? 300 : 0)));
                break;
            default:
                WeakReference weakReference = c1681.f8571;
                InterfaceC1215 interfaceC1215 = weakReference != null ? (InterfaceC1215) weakReference.get() : null;
                if (interfaceC1215 != null) {
                    interfaceC1215.cancel();
                }
                Activity activityM3426 = C1681.m3426();
                InterfaceC1215 c2763 = Settings.canDrawOverlays(c1681.f8570) ? new C2763(c1681.f8570) : activityM3426 != null ? new C2763(activityM3426) : new C1597(c1681.f8570);
                if (!(c2763 instanceof C2763)) {
                    try {
                        Method method = Class.forName("android.app.compat.CompatChanges").getMethod("isChangeEnabled", Long.TYPE);
                        method.setAccessible(true);
                        z = Boolean.parseBoolean(String.valueOf(method.invoke(null, 147798919L)));
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        e.printStackTrace();
                        z = false;
                    }
                    if (!z) {
                        C1586 c1586 = (C1586) c2791.f13645;
                        Application application = c1681.f8570;
                        c1586.getClass();
                        TextView textView = new TextView(application);
                        textView.setId(R.id.message);
                        textView.setGravity(17);
                        textView.setTextColor(-285212673);
                        textView.setTextSize(0, TypedValue.applyDimension(2, 14.0f, application.getResources().getDisplayMetrics()));
                        int iApplyDimension = (int) TypedValue.applyDimension(1, 24.0f, application.getResources().getDisplayMetrics());
                        int iApplyDimension2 = (int) TypedValue.applyDimension(1, 16.0f, application.getResources().getDisplayMetrics());
                        textView.setPaddingRelative(iApplyDimension, iApplyDimension2, iApplyDimension, iApplyDimension2);
                        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setColor(-1291845632);
                        gradientDrawable.setCornerRadius(TypedValue.applyDimension(1, 10.0f, application.getResources().getDisplayMetrics()));
                        textView.setBackground(gradientDrawable);
                        textView.setZ(TypedValue.applyDimension(1, 3.0f, application.getResources().getDisplayMetrics()));
                        c2763.setView(textView);
                        c2763.setGravity(17, 0, 0);
                        c2763.setMargin(0.0f, 0.0f);
                    }
                    break;
                }
                c1681.f8571 = new WeakReference(c2763);
                c2763.setDuration(c2791.f13648);
                c2763.setText((CharSequence) c2791.f13650);
                c2763.show();
                break;
        }
    }
}
