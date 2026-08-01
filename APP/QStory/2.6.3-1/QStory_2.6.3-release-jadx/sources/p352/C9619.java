package p352;

import p042.AbstractC7140;
import p049.AbstractC7162;
import p052.AbstractC7187;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言苏世楪兰哲子.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class C9619 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        String strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜呜喵");
        if (AbstractC7187.f17853 < 3814) {
            strM14532 = AbstractC9234.m14532("喵喵喵呜喵呜喵呜");
        }
        m12390(AbstractC7162.m12409(AbstractC9234.m14531(1140), strM14532, Boolean.TYPE, new Class[0]), new C9620(0));
    }
}
