package yyds;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.kongzue.dialogx.interfaces.AbstractC0041;
import com.p000ss.android.ugc.awemes.WardDatabase;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: yyds.ᛱᛱᛶᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0057 implements Runnable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Object f571;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f572;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Object f573;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object f574;

    public /* synthetic */ RunnableC0057(Object obj, Object obj2, Object obj3, int i) {
        this.f572 = i;
        this.f574 = obj;
        this.f571 = obj2;
        this.f573 = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objCall = null;
        boolean z = false;
        switch (this.f572) {
            case 0:
                View view = (View) this.f574;
                if (view.getParent() != ((AbstractC0041) this.f571).m278()) {
                    if (view.getParent() != null) {
                        ((ViewGroup) view.getParent()).removeView(view);
                    }
                    ((FrameLayout) this.f573).addView(view);
                } else {
                    AbstractC0041.m269(((AbstractC0041) view.getTag()).mo283().concat("已处于显示状态，请勿重复执行 show() 指令。"));
                }
                break;
            case 1:
                C0488 c0488 = (C0488) this.f573;
                Context context = (Context) this.f571;
                LinkedHashMap linkedHashMap = AbstractC1426.f6739;
                View viewM2895 = AbstractC1426.m2895((ViewGroup) this.f574, AbstractC2328.m4341(-1017554634703726L));
                ViewGroup viewGroup = viewM2895 instanceof ViewGroup ? (ViewGroup) viewM2895 : null;
                if (viewGroup != null) {
                    C1599 c1599 = C1599.f8153;
                    AbstractC2328.m4341(-762656915620718L);
                    View viewM3193 = AbstractC1544.m3193(viewGroup, c1599);
                    if (viewM3193 == null) {
                        viewM3193 = null;
                    }
                    ImageView imageView = (ImageView) viewM3193;
                    if (imageView != null) {
                        View childAt = viewGroup.getChildAt(0);
                        ImageView imageView2 = childAt instanceof ImageView ? (ImageView) childAt : null;
                        if (imageView2 != null) {
                            imageView2.setOnLongClickListener(new ViewOnLongClickListenerC0756(context, c0488, 0));
                        }
                        imageView.setOnLongClickListener(new ViewOnLongClickListenerC0756(context, c0488, 1));
                        break;
                    }
                }
                break;
            case 2:
                try {
                    objCall = ((CallableC2087) this.f574).call();
                    break;
                } catch (Exception unused) {
                }
                ((Handler) this.f573).post(new RunnableC2660(7, (C2212) this.f571, objCall, z));
                break;
            default:
                C1853 c1853 = (C1853) this.f574;
                try {
                    AbstractC2217.m4197(c1853.f9326.mo421(C0135.f836), new C1639((WardDatabase) this.f571, c1853, (C0219) this.f573, (InterfaceC0274) null, 11));
                } catch (Throwable th) {
                    c1853.m3626(th);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0057() {
        this.f572 = 2;
    }
}
