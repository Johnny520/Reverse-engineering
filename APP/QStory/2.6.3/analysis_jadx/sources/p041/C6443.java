package p041;

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
import p018.AbstractC6253;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6443 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashMap f17647 = new HashMap();

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws NoSuchMethodException {
        final int i = 0;
        m11831(View.class.getDeclaredMethod(AbstractC8405.m13972(556), null), new InterfaceC6312(this) { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6443 f17654;

            {
                this.f17654 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i2 = i;
                C6443 c6443 = this.f17654;
                switch (i2) {
                    case 0:
                        Object obj = methodHookParam.thisObject;
                        if (((View) obj) instanceof TextView) {
                            c6443.f17647.remove((TextView) obj);
                        }
                        break;
                    case 1:
                        TextView textView = (TextView) methodHookParam.thisObject;
                        HashMap map = c6443.f17647;
                        if (((C6444) map.get(textView)) == null) {
                            C6444 c6444 = new C6444();
                            c6444.f17653 = new Matrix();
                            c6444.f17650 = AbstractC6253.m11754(textView.getContext(), 150.0f);
                            c6444.f17651 = AbstractC6253.m11754(textView.getContext(), 5.0f);
                            c6444.f17648 = new LinearGradient(0.0f, 0.0f, c6444.f17650, 0.0f, c6444.f17649, (float[]) null, Shader.TileMode.MIRROR);
                            textView.getPaint().setShader(c6444.f17648);
                            map.put(textView, c6444);
                        }
                        break;
                    default:
                        TextView textView2 = (TextView) methodHookParam.thisObject;
                        C6444 c64442 = (C6444) c6443.f17647.get(textView2);
                        if (c64442.f17653 == null) {
                            c64442.f17653 = new Matrix();
                        }
                        float f = c64442.f17652 + c64442.f17651;
                        c64442.f17652 = f;
                        c64442.f17653.setTranslate(f, 0.0f);
                        c64442.f17648.setLocalMatrix(c64442.f17653);
                        textView2.postInvalidateDelayed(100L);
                        break;
                }
            }
        });
        Method declaredMethod = TextView.class.getDeclaredMethod(AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜呜呜呜喵~喵喵喵呜呜喵呜喵~喵喵喵喵喵呜喵喵~喵喵喵呜呜喵呜呜"), Canvas.class);
        Class cls = Integer.TYPE;
        Constructor constructor = TextView.class.getConstructor(Context.class, AttributeSet.class, cls, cls);
        final int i2 = 1;
        m11830(constructor, new InterfaceC6312(this) { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6443 f17654;

            {
                this.f17654 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i2;
                C6443 c6443 = this.f17654;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.thisObject;
                        if (((View) obj) instanceof TextView) {
                            c6443.f17647.remove((TextView) obj);
                        }
                        break;
                    case 1:
                        TextView textView = (TextView) methodHookParam.thisObject;
                        HashMap map = c6443.f17647;
                        if (((C6444) map.get(textView)) == null) {
                            C6444 c6444 = new C6444();
                            c6444.f17653 = new Matrix();
                            c6444.f17650 = AbstractC6253.m11754(textView.getContext(), 150.0f);
                            c6444.f17651 = AbstractC6253.m11754(textView.getContext(), 5.0f);
                            c6444.f17648 = new LinearGradient(0.0f, 0.0f, c6444.f17650, 0.0f, c6444.f17649, (float[]) null, Shader.TileMode.MIRROR);
                            textView.getPaint().setShader(c6444.f17648);
                            map.put(textView, c6444);
                        }
                        break;
                    default:
                        TextView textView2 = (TextView) methodHookParam.thisObject;
                        C6444 c64442 = (C6444) c6443.f17647.get(textView2);
                        if (c64442.f17653 == null) {
                            c64442.f17653 = new Matrix();
                        }
                        float f = c64442.f17652 + c64442.f17651;
                        c64442.f17652 = f;
                        c64442.f17653.setTranslate(f, 0.0f);
                        c64442.f17648.setLocalMatrix(c64442.f17653);
                        textView2.postInvalidateDelayed(100L);
                        break;
                }
            }
        });
        final int i3 = 2;
        m11830(declaredMethod, new InterfaceC6312(this) { // from class: 飘花落叶言世哲苏兰楪子.飘花落叶言子楪世苏哲兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6443 f17654;

            {
                this.f17654 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) {
                int i22 = i3;
                C6443 c6443 = this.f17654;
                switch (i22) {
                    case 0:
                        Object obj = methodHookParam.thisObject;
                        if (((View) obj) instanceof TextView) {
                            c6443.f17647.remove((TextView) obj);
                        }
                        break;
                    case 1:
                        TextView textView = (TextView) methodHookParam.thisObject;
                        HashMap map = c6443.f17647;
                        if (((C6444) map.get(textView)) == null) {
                            C6444 c6444 = new C6444();
                            c6444.f17653 = new Matrix();
                            c6444.f17650 = AbstractC6253.m11754(textView.getContext(), 150.0f);
                            c6444.f17651 = AbstractC6253.m11754(textView.getContext(), 5.0f);
                            c6444.f17648 = new LinearGradient(0.0f, 0.0f, c6444.f17650, 0.0f, c6444.f17649, (float[]) null, Shader.TileMode.MIRROR);
                            textView.getPaint().setShader(c6444.f17648);
                            map.put(textView, c6444);
                        }
                        break;
                    default:
                        TextView textView2 = (TextView) methodHookParam.thisObject;
                        C6444 c64442 = (C6444) c6443.f17647.get(textView2);
                        if (c64442.f17653 == null) {
                            c64442.f17653 = new Matrix();
                        }
                        float f = c64442.f17652 + c64442.f17651;
                        c64442.f17652 = f;
                        c64442.f17653.setTranslate(f, 0.0f);
                        c64442.f17648.setLocalMatrix(c64442.f17653);
                        textView2.postInvalidateDelayed(100L);
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(555);
    }
}
