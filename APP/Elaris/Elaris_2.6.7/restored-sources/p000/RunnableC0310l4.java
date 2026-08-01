package p000;

import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: l4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0310l4 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean[] f512a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0209f2 f513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f514c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f515d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean[] f516e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f517f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean[] f518g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RunnableC0310l4(boolean[] zArr, C0209f2 c0209f2, int i, String str, boolean[] zArr2, boolean z, boolean[] zArr3) {
        this.f512a = zArr;
        this.f513b = c0209f2;
        this.f514c = i;
        this.f515d = str;
        this.f516e = zArr2;
        this.f517f = z;
        this.f518g = zArr3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        View rootView;
        View view;
        String string;
        CharSequence text;
        if (this.f512a[0]) {
            return;
        }
        if (!AbstractC0449s4.m895n(this.f513b, false)) {
            this.f512a[0] = true;
            AbstractC0449s4.m887f(this.f513b, "auto_send_invalid");
            return;
        }
        EditText editText = (EditText) ((WeakReference) this.f513b.f245a).get();
        C0209f2 c0209f2 = this.f513b;
        if (editText == null) {
            AbstractC0449s4.m887f(c0209f2, "input_missing");
            return;
        }
        ((C0265ia) c0209f2.f246b).m679a(System.currentTimeMillis());
        C0243h4 c0243h4 = new C0243h4();
        ViewParent parent = editText.getParent();
        int i = 0;
        while (true) {
            if (i < 7 && (parent instanceof View)) {
                View view2 = (View) parent;
                AbstractC0449s4.m893l(view2, editText, 0, new int[]{0}, c0243h4, 10, 700);
                view = (View) c0243h4.f347b;
                if (view != null && c0243h4.f346a >= 120) {
                    break;
                }
                parent = view2.getParent();
                i++;
            } else {
                try {
                    rootView = editText.getRootView();
                } catch (Throwable unused) {
                    rootView = editText;
                }
                AbstractC0449s4.m893l(rootView, editText, 0, new int[]{0}, c0243h4, 14, 1800);
                view = (View) c0243h4.f347b;
                break;
            }
        }
        View view3 = view;
        if (view3 != null) {
            try {
            } catch (Throwable th) {
                AbstractC0449s4.m897p("auto send click failed: " + th);
            }
            boolean zPerformClick = (view3.isShown() && view3.isEnabled()) ? view3.performClick() : false;
            if (zPerformClick) {
                this.f512a[0] = true;
                StringBuilder sb = new StringBuilder("auto send click ok attempt=");
                sb.append(this.f514c);
                sb.append(" entry=");
                if (view3 == null) {
                    string = "null";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(view3.getClass().getName());
                    if ((view3 instanceof TextView) && (text = ((TextView) view3).getText()) != null) {
                        sb2.append(" text=");
                        sb2.append(AbstractC0449s4.m896o(text.toString(), 24));
                    }
                    String strM904w = AbstractC0449s4.m904w(view3);
                    if (strM904w.length() > 0) {
                        sb2.append(" id=");
                        sb2.append(strM904w);
                    }
                    string = sb2.toString();
                }
                sb.append(string);
                sb.append(" sendMethod=");
                sb.append(this.f515d);
                AbstractC0449s4.m897p(sb.toString());
                return;
            }
        }
        if (!this.f516e[0]) {
            Method method = AbstractC0449s4.f841k;
            WeakReference weakReference = AbstractC0449s4.f842l;
            WeakReference weakReference2 = AbstractC0449s4.f843m;
            Object obj = weakReference == null ? null : weakReference.get();
            View view4 = weakReference2 == null ? null : (View) weakReference2.get();
            if (method != null && obj != null && view4 != null) {
                if (view4.getWindowToken() != null) {
                    try {
                        method.invoke(obj, view4);
                        this.f516e[0] = true;
                        AbstractC0449s4.m897p("official send button click invoked attempt=" + this.f514c + " method=" + this.f515d);
                        return;
                    } catch (Throwable th2) {
                        AbstractC0449s4.m897p("official send button click invoke failed: " + th2);
                    }
                }
            }
        }
        if (!this.f516e[0] || this.f517f) {
            if (!this.f518g[0]) {
                Method method2 = AbstractC0449s4.f839i;
                WeakReference weakReference3 = AbstractC0449s4.f840j;
                Object obj2 = weakReference3 == null ? null : weakReference3.get();
                if (method2 != null && obj2 != null) {
                    try {
                        method2.invoke(obj2, null);
                        this.f518g[0] = true;
                        AbstractC0449s4.m897p("official send delegate invoked attempt=" + this.f514c + " method=" + this.f515d);
                        return;
                    } catch (Throwable th3) {
                        AbstractC0449s4.m897p("official send delegate invoke failed: " + th3);
                    }
                }
            }
            if (this.f517f) {
                AbstractC0449s4.m887f(this.f513b, "auto_send_exhausted");
                AbstractC0449s4.m907z(editText, "已写入QQ官方图文内容，请手动再点发送");
                AbstractC0449s4.m897p("auto send click missing after retries method=".concat(this.f515d));
            }
        }
    }
}
