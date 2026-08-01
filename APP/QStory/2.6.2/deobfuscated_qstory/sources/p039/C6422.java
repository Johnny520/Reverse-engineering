package p039;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import p026.AbstractC6293;
import p026.InterfaceC6294;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6422 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashMap f17587 = new HashMap();

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        final int i = 0;
        m11803(View.class.getDeclaredMethod("onDetachedFromWindow", null), new InterfaceC6294(this) { // from class: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6422 f17594;

            {
                this.f17594 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C6422 c6422 = this.f17594;
                switch (i2) {
                    case 0:
                        Object obj = methodHookParam.thisObject;
                        if (((View) obj) instanceof TextView) {
                            c6422.f17587.remove((TextView) obj);
                        }
                        break;
                    case 1:
                        TextView textView = (TextView) methodHookParam.thisObject;
                        HashMap map = c6422.f17587;
                        if (((C6423) map.get(textView)) == null) {
                            C6423 c6423 = new C6423();
                            c6423.f17593 = new Matrix();
                            c6423.f17590 = AbstractC2904.m6267(textView.getContext(), 150.0f);
                            c6423.f17591 = AbstractC2904.m6267(textView.getContext(), 5.0f);
                            c6423.f17588 = new LinearGradient(0.0f, 0.0f, c6423.f17590, 0.0f, c6423.f17589, (float[]) null, Shader.TileMode.MIRROR);
                            textView.getPaint().setShader(c6423.f17588);
                            map.put(textView, c6423);
                        }
                        break;
                    default:
                        TextView textView2 = (TextView) methodHookParam.thisObject;
                        C6423 c64232 = (C6423) c6422.f17587.get(textView2);
                        if (c64232.f17593 == null) {
                            c64232.f17593 = new Matrix();
                        }
                        float f = c64232.f17592 + c64232.f17591;
                        c64232.f17592 = f;
                        c64232.f17593.setTranslate(f, 0.0f);
                        c64232.f17588.setLocalMatrix(c64232.f17593);
                        textView2.postInvalidateDelayed(100L);
                        break;
                }
            }
        });
        Method declaredMethod = TextView.class.getDeclaredMethod("onDraw", Canvas.class);
        Class cls = Integer.TYPE;
        Constructor constructor = TextView.class.getConstructor(Context.class, AttributeSet.class, cls, cls);
        final int i2 = 1;
        m11802(constructor, new InterfaceC6294(this) { // from class: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6422 f17594;

            {
                this.f17594 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C6422 c6422 = this.f17594;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.thisObject;
                        if (((View) obj) instanceof TextView) {
                            c6422.f17587.remove((TextView) obj);
                        }
                        break;
                    case 1:
                        TextView textView = (TextView) methodHookParam.thisObject;
                        HashMap map = c6422.f17587;
                        if (((C6423) map.get(textView)) == null) {
                            C6423 c6423 = new C6423();
                            c6423.f17593 = new Matrix();
                            c6423.f17590 = AbstractC2904.m6267(textView.getContext(), 150.0f);
                            c6423.f17591 = AbstractC2904.m6267(textView.getContext(), 5.0f);
                            c6423.f17588 = new LinearGradient(0.0f, 0.0f, c6423.f17590, 0.0f, c6423.f17589, (float[]) null, Shader.TileMode.MIRROR);
                            textView.getPaint().setShader(c6423.f17588);
                            map.put(textView, c6423);
                        }
                        break;
                    default:
                        TextView textView2 = (TextView) methodHookParam.thisObject;
                        C6423 c64232 = (C6423) c6422.f17587.get(textView2);
                        if (c64232.f17593 == null) {
                            c64232.f17593 = new Matrix();
                        }
                        float f = c64232.f17592 + c64232.f17591;
                        c64232.f17592 = f;
                        c64232.f17593.setTranslate(f, 0.0f);
                        c64232.f17588.setLocalMatrix(c64232.f17593);
                        textView2.postInvalidateDelayed(100L);
                        break;
                }
            }
        });
        final int i3 = 2;
        m11802(declaredMethod, new InterfaceC6294(this) { // from class: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6422 f17594;

            {
                this.f17594 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i3;
                C6422 c6422 = this.f17594;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.thisObject;
                        if (((View) obj) instanceof TextView) {
                            c6422.f17587.remove((TextView) obj);
                        }
                        break;
                    case 1:
                        TextView textView = (TextView) methodHookParam.thisObject;
                        HashMap map = c6422.f17587;
                        if (((C6423) map.get(textView)) == null) {
                            C6423 c6423 = new C6423();
                            c6423.f17593 = new Matrix();
                            c6423.f17590 = AbstractC2904.m6267(textView.getContext(), 150.0f);
                            c6423.f17591 = AbstractC2904.m6267(textView.getContext(), 5.0f);
                            c6423.f17588 = new LinearGradient(0.0f, 0.0f, c6423.f17590, 0.0f, c6423.f17589, (float[]) null, Shader.TileMode.MIRROR);
                            textView.getPaint().setShader(c6423.f17588);
                            map.put(textView, c6423);
                        }
                        break;
                    default:
                        TextView textView2 = (TextView) methodHookParam.thisObject;
                        C6423 c64232 = (C6423) c6422.f17587.get(textView2);
                        if (c64232.f17593 == null) {
                            c64232.f17593 = new Matrix();
                        }
                        float f = c64232.f17592 + c64232.f17591;
                        c64232.f17592 = f;
                        c64232.f17593.setTranslate(f, 0.0f);
                        c64232.f17588.setLocalMatrix(c64232.f17593);
                        textView2.postInvalidateDelayed(100L);
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u4f7fQQ\u5b57\u4f53\u6dfb\u52a0\u5f69\u8272\u6548\u679c \u91cd\u542f\u751f\u6548";
    }
}
