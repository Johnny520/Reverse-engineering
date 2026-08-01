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
    public final String[] f16095 = {AbstractC3932.m8313().concat("/\u672a\u8bbe\u7f6e.txt"), AbstractC3932.m8313().concat("/\u8868\u60c5\u5916\u663e\u6587\u6848.txt")};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16096 = AbstractC3932.m8313().concat("/\u8868\u60c5\u5916\u663e\u6587\u6848V2.txt");

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        new Thread(new RunnableC1107(this, 11)).start();
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u4f7f\u7528\u81ea\u5b9a\u4e49\u7684\u968f\u673a\u6587\u6848,\u6587\u6848\u6587\u4ef6\u5b58\u653e\u5728:" + this.f16096 + " \n\\\\\u5f00\u5934\u7684\u6587\u672c\u4e0d\u4f1a\u4f7f\u7528,\u5982\u679c\u4e0d\u4f7f\u7528\u9ed8\u8ba4\u6587\u6848\u8bf7\u81ea\u884c\u5907\u4efd,QS\u66f4\u65b0\u65f6\u53ef\u80fd\u4f1a\u8986\u76d6\u6389\u4f60\u81ea\u5b9a\u4e49\u6587\u6848";
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
