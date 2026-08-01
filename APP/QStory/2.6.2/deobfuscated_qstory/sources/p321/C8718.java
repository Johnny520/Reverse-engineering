package p321;

import androidx.compose.material.ripple.RunnableC1107;
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import p024.AbstractC6291;
import p036.AbstractC6353;
import p331.C8799;
import p336.AbstractC8805;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C8718 extends AbstractC8805 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f24581 = {AbstractC3932.m8313().concat("/QQ\u7a7a\u95f4\u6587\u6848.txt"), AbstractC3932.m8313().concat("/QQ\u7a7a\u95f4\u6587\u6848V2.txt")};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f24582 = AbstractC3932.m8313().concat("/QQ\u7a7a\u95f4\u6587\u6848V3.txt");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static String m14394() {
        List arrayList;
        List arrayList2;
        C8718 c8718 = (C8718) AbstractC6291.f17375.get(C8718.class);
        if (c8718 == null) {
            return "\u7a7a\u95f4\u6253\u5361";
        }
        try {
            arrayList = Files.readAllLines(Paths.get(c8718.f24582, new String[0]));
        } catch (IOException unused) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty() || !c8718.m14395()) {
            AbstractC6353.m11903("https://suzhelan.top/api/pan/direct/private/\u5982\u679c\u6709\u4eba\u80fd\u61c2\u6211\u7684\u5fe7\u90c1.txt", c8718.f24582);
            try {
                arrayList2 = Files.readAllLines(Paths.get(c8718.f24582, new String[0]));
            } catch (IOException unused2) {
                arrayList2 = new ArrayList();
            }
            arrayList = arrayList2;
        }
        Object obj = arrayList.get((int) (Math.random() * ((double) arrayList.size())));
        while (true) {
            String str = (String) obj;
            if (!str.isEmpty() && !str.startsWith("//")) {
                return str;
            }
            obj = arrayList.get((int) (Math.random() * ((double) arrayList.size())));
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        new Thread(new RunnableC1107(this, 28)).start();
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "QStory\u53d1\u9001\u7a7a\u95f4\u4f7f\u7528\u81ea\u5b9a\u4e49\u7684\u6587\u6848\u5185\u5bb9,\u6587\u6848\u6587\u4ef6\u5b58\u653e\u5728:" + this.f24582 + " \n\\\\\u5f00\u5934\u7684\u6587\u672c\u4e0d\u4f1a\u4f7f\u7528,\u5982\u679c\u4e0d\u4f7f\u7528\u9ed8\u8ba4\u6587\u6848\u8bf7\u81ea\u884c\u5907\u4efd,QS\u66f4\u65b0\u65f6\u53ef\u80fd\u4f1a\u8986\u76d6\u6389\u4f60\u81ea\u5b9a\u4e49\u6587\u6848";
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11255(C8799 c8799) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m14395() {
        File file = new File(this.f24582);
        for (String str : this.f24581) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
        }
        return file.exists() && file.isFile();
    }

    @Override // p336.AbstractC8805
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11257(C8799 c8799) {
        return c8799.f24759.intValue() > 0;
    }
}
