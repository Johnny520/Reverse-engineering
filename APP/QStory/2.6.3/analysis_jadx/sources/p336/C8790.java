package p336;

import p026.AbstractC6311;
import p033.AbstractC6333;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C8790 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        String strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜呜喵");
        if (AbstractC6358.f17508 < 3814) {
            strM13973 = AbstractC8405.m13973("喵喵喵呜喵呜喵呜");
        }
        m11831(AbstractC6333.m11850(AbstractC8405.m13972(1140), strM13973, Boolean.TYPE, new Class[0]), new C8791(0));
    }
}
