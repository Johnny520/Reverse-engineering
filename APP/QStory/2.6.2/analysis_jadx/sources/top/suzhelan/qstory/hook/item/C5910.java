package top.suzhelan.qstory.hook.item;

import androidx.compose.material.ripple.RunnableC1107;
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import p026.AbstractC6293;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5910 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f16095 = {AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937660501350417831L)), AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937660402566170023L))};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16096 = AbstractC3932.m8313().concat(AbstractC3056.m6668(-3937660419746039207L));

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        new Thread(new RunnableC1107(this, 11)).start();
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937660269422183847L) + this.f16096 + AbstractC3056.m6668(-3937660183522837927L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m11237() {
        File file = new File(this.f16096);
        for (String str : this.f16095) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
        }
        return file.exists() && file.isFile();
    }
}
