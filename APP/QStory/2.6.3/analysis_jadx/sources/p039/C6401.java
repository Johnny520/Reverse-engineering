package p039;

import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import p019.C6263;
import p026.AbstractC6311;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6401 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        m11831(XposedHelpers.findMethodBestMatch(classLoader.loadClass(AbstractC8405.m13972(Opcodes.REM_DOUBLE_2ADDR)), AbstractC8405.m13972(Opcodes.ADD_INT_LIT16), new Class[]{Boolean.TYPE}), new C6263(16));
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(Opcodes.MUL_DOUBLE_2ADDR).concat(AbstractC3056.m6696() ? AbstractC8405.m13972(Opcodes.DIV_DOUBLE_2ADDR) : AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜喵呜喵呜喵呜~呜喵喵喵呜呜呜呜~呜呜呜呜喵喵喵呜~呜呜喵喵喵呜喵喵"));
    }
}
