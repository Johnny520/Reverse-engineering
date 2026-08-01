package p000;

import android.graphics.ColorFilter;
import android.view.View;
import android.widget.ImageView;
import com.p001mr.elaris.AbstractC0169w;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;

/* JADX INFO: renamed from: pe */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0411pe extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ClassLoader f724a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0411pe(ClassLoader classLoader) {
        super(70);
        this.f724a = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.p001mr.elaris.xposedcompat.XC_MethodHook
    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Object[] objArr;
        C0502v9 c0502v9M315p0 = AbstractC0169w.m315p0((methodHookParam == null || (objArr = methodHookParam.args) == null || objArr.length < 2) ? null : objArr[1]);
        if (c0502v9M315p0 == null) {
            return;
        }
        int i = c0502v9M315p0.f968a;
        Object result = methodHookParam.getResult();
        if (result instanceof View) {
            View view = (View) result;
            AbstractC0169w.m297g0(view, i == 1 ? "保存语音" : "转发语音");
            ImageView imageViewM241F = AbstractC0169w.m241F(view);
            if (imageViewM241F != null) {
                try {
                    imageViewM241F.setImageDrawable(new C0047ce(i, AbstractC0169w.m249J(view), imageViewM241F.getResources() == null ? 1.0f : imageViewM241F.getResources().getDisplayMetrics().density));
                    imageViewM241F.setColorFilter((ColorFilter) null);
                    imageViewM241F.setAlpha(1.0f);
                    imageViewM241F.setPadding(0, 0, 0, 0);
                    imageViewM241F.setAdjustViewBounds(false);
                    imageViewM241F.setScaleType(ImageView.ScaleType.FIT_CENTER);
                } catch (Throwable unused) {
                }
            }
            view.setOnClickListener(new ViewOnClickListenerC0368oe(methodHookParam.thisObject, this.f724a, c0502v9M315p0));
        }
    }
}
