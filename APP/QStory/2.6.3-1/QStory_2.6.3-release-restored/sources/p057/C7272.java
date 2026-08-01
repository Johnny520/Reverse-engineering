package p057;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import p034.AbstractC7082;
import p042.AbstractC7140;
import p042.InterfaceC7141;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7272 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashMap f17992 = new HashMap();

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        final int i = 0;
        m12390(View.class.getDeclaredMethod("onDetachedFromWindow", null), new InterfaceC7141(this) { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7272 f17999;

            {
                this.f17999 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C7272 c7272 = this.f17999;
                switch (i2) {
                    case 0:
                        Object obj = methodHookParam.thisObject;
                        if (((View) obj) instanceof TextView) {
                            c7272.f17992.remove((TextView) obj);
                        }
                        break;
                    case 1:
                        TextView textView = (TextView) methodHookParam.thisObject;
                        HashMap map = c7272.f17992;
                        if (((C7273) map.get(textView)) == null) {
                            C7273 c7273 = new C7273();
                            c7273.f17998 = new Matrix();
                            c7273.f17995 = AbstractC7082.m12313(textView.getContext(), 150.0f);
                            c7273.f17996 = AbstractC7082.m12313(textView.getContext(), 5.0f);
                            c7273.f17993 = new LinearGradient(0.0f, 0.0f, c7273.f17995, 0.0f, c7273.f17994, (float[]) null, Shader.TileMode.MIRROR);
                            textView.getPaint().setShader(c7273.f17993);
                            map.put(textView, c7273);
                        }
                        break;
                    default:
                        TextView textView2 = (TextView) methodHookParam.thisObject;
                        C7273 c72732 = (C7273) c7272.f17992.get(textView2);
                        if (c72732.f17998 == null) {
                            c72732.f17998 = new Matrix();
                        }
                        float f = c72732.f17997 + c72732.f17996;
                        c72732.f17997 = f;
                        c72732.f17998.setTranslate(f, 0.0f);
                        c72732.f17993.setLocalMatrix(c72732.f17998);
                        textView2.postInvalidateDelayed(100L);
                        break;
                }
            }
        });
        Method declaredMethod = TextView.class.getDeclaredMethod("onDraw", Canvas.class);
        Class cls = Integer.TYPE;
        Constructor constructor = TextView.class.getConstructor(Context.class, AttributeSet.class, cls, cls);
        final int i2 = 1;
        m12389(constructor, new InterfaceC7141(this) { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7272 f17999;

            {
                this.f17999 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C7272 c7272 = this.f17999;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.thisObject;
                        if (((View) obj) instanceof TextView) {
                            c7272.f17992.remove((TextView) obj);
                        }
                        break;
                    case 1:
                        TextView textView = (TextView) methodHookParam.thisObject;
                        HashMap map = c7272.f17992;
                        if (((C7273) map.get(textView)) == null) {
                            C7273 c7273 = new C7273();
                            c7273.f17998 = new Matrix();
                            c7273.f17995 = AbstractC7082.m12313(textView.getContext(), 150.0f);
                            c7273.f17996 = AbstractC7082.m12313(textView.getContext(), 5.0f);
                            c7273.f17993 = new LinearGradient(0.0f, 0.0f, c7273.f17995, 0.0f, c7273.f17994, (float[]) null, Shader.TileMode.MIRROR);
                            textView.getPaint().setShader(c7273.f17993);
                            map.put(textView, c7273);
                        }
                        break;
                    default:
                        TextView textView2 = (TextView) methodHookParam.thisObject;
                        C7273 c72732 = (C7273) c7272.f17992.get(textView2);
                        if (c72732.f17998 == null) {
                            c72732.f17998 = new Matrix();
                        }
                        float f = c72732.f17997 + c72732.f17996;
                        c72732.f17997 = f;
                        c72732.f17998.setTranslate(f, 0.0f);
                        c72732.f17993.setLocalMatrix(c72732.f17998);
                        textView2.postInvalidateDelayed(100L);
                        break;
                }
            }
        });
        final int i3 = 2;
        m12389(declaredMethod, new InterfaceC7141(this) { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7272 f17999;

            {
                this.f17999 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i3;
                C7272 c7272 = this.f17999;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.thisObject;
                        if (((View) obj) instanceof TextView) {
                            c7272.f17992.remove((TextView) obj);
                        }
                        break;
                    case 1:
                        TextView textView = (TextView) methodHookParam.thisObject;
                        HashMap map = c7272.f17992;
                        if (((C7273) map.get(textView)) == null) {
                            C7273 c7273 = new C7273();
                            c7273.f17998 = new Matrix();
                            c7273.f17995 = AbstractC7082.m12313(textView.getContext(), 150.0f);
                            c7273.f17996 = AbstractC7082.m12313(textView.getContext(), 5.0f);
                            c7273.f17993 = new LinearGradient(0.0f, 0.0f, c7273.f17995, 0.0f, c7273.f17994, (float[]) null, Shader.TileMode.MIRROR);
                            textView.getPaint().setShader(c7273.f17993);
                            map.put(textView, c7273);
                        }
                        break;
                    default:
                        TextView textView2 = (TextView) methodHookParam.thisObject;
                        C7273 c72732 = (C7273) c7272.f17992.get(textView2);
                        if (c72732.f17998 == null) {
                            c72732.f17998 = new Matrix();
                        }
                        float f = c72732.f17997 + c72732.f17996;
                        c72732.f17997 = f;
                        c72732.f17998.setTranslate(f, 0.0f);
                        c72732.f17993.setLocalMatrix(c72732.f17998);
                        textView2.postInvalidateDelayed(100L);
                        break;
                }
            }
        });
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "使QQ字体添加彩色效果 重启生效";
    }
}
