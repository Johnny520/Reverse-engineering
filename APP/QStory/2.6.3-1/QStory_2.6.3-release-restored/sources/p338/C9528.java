package p338;

import androidx.compose.material.ripple.RunnableC1945;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import p040.AbstractC7138;
import p053.AbstractC7199;
import p348.C9614;
import p353.AbstractC9632;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C9528 extends AbstractC9632 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f24869 = {AbstractC4765.m8874().concat("/QQ空间文案.txt"), AbstractC4765.m8874().concat("/QQ空间文案V2.txt")};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f24870 = AbstractC4765.m8874().concat("/QQ空间文案V3.txt");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static String m14980() {
        List arrayList;
        List arrayList2;
        C9528 c9528 = (C9528) AbstractC7138.f17769.get(C9528.class);
        if (c9528 == null) {
            return "空间打卡";
        }
        try {
            arrayList = Files.readAllLines(Paths.get(c9528.f24870, new String[0]));
        } catch (IOException unused) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty() || !c9528.m14981()) {
            AbstractC7199.m12510("https://suzhelan.top/api/pan/direct/private/如果有人能懂我的忧郁.txt", c9528.f24870);
            try {
                arrayList2 = Files.readAllLines(Paths.get(c9528.f24870, new String[0]));
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

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        new Thread(new RunnableC1945(this, 29)).start();
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "QStory发送空间使用自定义的文案内容,文案文件存放在:" + this.f24870 + " \n\\\\开头的文本不会使用,如果不使用默认文案请自行备份,QS更新时可能会覆盖掉你自定义文案";
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11810(C9614 c9614) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m14981() {
        File file = new File(this.f24870);
        for (String str : this.f24869) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
        }
        return file.exists() && file.isFile();
    }

    @Override // p353.AbstractC9632
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11811(C9614 c9614) {
        return c9614.f25085.intValue() > 0;
    }
}
