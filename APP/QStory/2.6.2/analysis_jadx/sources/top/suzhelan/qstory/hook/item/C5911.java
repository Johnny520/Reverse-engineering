package top.suzhelan.qstory.hook.item;

import android.os.Environment;
import com.bumptech.glide.AbstractC3056;
import p026.AbstractC6293;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5911 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        m11802(Class.forName(AbstractC3056.m6668(-3937660754753488295L), false, classLoader).getDeclaredMethod(AbstractC3056.m6668(-3937660527120221607L), String.class), new C5919(this, 0));
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937660746163553703L).concat(Environment.getExternalStorageDirectory().getAbsolutePath() + AbstractC3056.m6668(-3937660973796820391L));
    }
}
