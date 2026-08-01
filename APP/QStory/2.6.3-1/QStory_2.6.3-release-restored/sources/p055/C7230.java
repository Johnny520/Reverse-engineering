package p055;

import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3888;
import de.robv.android.xposed.XposedHelpers;
import p035.C7092;
import p042.AbstractC7140;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7230 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        m12390(XposedHelpers.findMethodBestMatch(classLoader.loadClass("com.tencent.mobileqq.widget.navbar.NavBarAIO"), "setEarIconVisible", new Class[]{Boolean.TYPE}), new C7092(16));
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "当前功能未在QQNT修复 可用状态 : ".concat(AbstractC3888.m7256() ? "不可用" : "可用");
    }
}
