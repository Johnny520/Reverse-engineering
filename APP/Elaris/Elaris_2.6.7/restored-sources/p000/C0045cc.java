package p000;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.p001mr.elaris.ViewOnClickListenerC0168v;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import java.util.Map;

/* JADX INFO: renamed from: cc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0045cc extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f105a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045cc(ClassLoader classLoader) {
        super(70);
        this.f105a = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        boolean z;
        Object obj;
        Object obj2;
        boolean zEquals;
        Object objM364D;
        int color;
        Object[] objArr;
        Object obj3 = (methodHookParam == null || (objArr = methodHookParam.args) == null || objArr.length < 2) ? null : objArr[1];
        if (AbstractC0219fc.m377Q(obj3)) {
            Object result = methodHookParam.getResult();
            if (result instanceof View) {
                View view = (View) result;
                TextView textViewM411x = AbstractC0219fc.m411x(view);
                if (textViewM411x != null) {
                    try {
                        textViewM411x.setText("复读");
                        textViewM411x.setContentDescription("复读");
                    } catch (Throwable unused) {
                    }
                }
                if (!AbstractC0219fc.m370J(this.f105a, obj3.getClass())) {
                    try {
                        objM364D = AbstractC0219fc.m364D(view, "mListenerInfo");
                    } catch (Throwable unused2) {
                    }
                    if (objM364D != null) {
                        z = AbstractC0219fc.m364D(objM364D, "mOnClickListener") instanceof View.OnClickListener;
                        if (!z) {
                            ClassLoader classLoader = this.f105a;
                            Map map = AbstractC0219fc.f261c;
                            synchronized (map) {
                                obj = map.get(obj3);
                            }
                            Map map2 = AbstractC0219fc.f262d;
                            synchronized (map2) {
                                obj2 = map2.get(obj3);
                            }
                            Map map3 = AbstractC0219fc.f263e;
                            synchronized (map3) {
                                zEquals = Boolean.TRUE.equals(map3.get(obj3));
                            }
                            if (obj != null) {
                                try {
                                    view.setOnClickListener(new ViewOnClickListenerC0168v(obj2, classLoader, obj, zEquals));
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                    }
                    z = false;
                    if (!z) {
                    }
                }
                ImageView imageViewM410w = AbstractC0219fc.m410w(view);
                if (imageViewM410w == null) {
                    return;
                }
                Context context = imageViewM410w.getContext();
                if (context == null) {
                    color = -1;
                } else {
                    try {
                        int identifier = context.getResources().getIdentifier("qui_common_text_allwhite_primary", "color", context.getPackageName());
                        if (identifier != 0) {
                            color = context.getColor(identifier);
                        }
                    } catch (Throwable unused4) {
                    }
                }
                imageViewM410w.setImageDrawable(new C0235gc(color, imageViewM410w.getResources().getDisplayMetrics().density));
                imageViewM410w.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imageViewM410w.setVisibility(0);
            }
        }
    }
}
