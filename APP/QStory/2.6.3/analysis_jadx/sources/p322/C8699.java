package p322;

import androidx.compose.material.ripple.RunnableC1107;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import p024.AbstractC6309;
import p037.AbstractC6370;
import p287.AbstractC8405;
import p332.C8785;
import p337.AbstractC8803;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C8699 extends AbstractC8803 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String[] f24524 = {AbstractC3933.m8315().concat(AbstractC8405.m13972(1199)), AbstractC3933.m8315().concat(AbstractC8405.m13972(1200))};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f24525 = AbstractC3933.m8315().concat(AbstractC8405.m13972(1201));

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static String m14421() {
        List arrayList;
        List arrayList2;
        C8699 c8699 = (C8699) AbstractC6309.f17424.get(C8699.class);
        if (c8699 == null) {
            return AbstractC8405.m13972(1202);
        }
        try {
            arrayList = Files.readAllLines(Paths.get(c8699.f24525, new String[0]));
        } catch (IOException unused) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty() || !c8699.m14422()) {
            AbstractC6370.m11951(AbstractC8405.m13972(1092), c8699.f24525);
            try {
                arrayList2 = Files.readAllLines(Paths.get(c8699.f24525, new String[0]));
            } catch (IOException unused2) {
                arrayList2 = new ArrayList();
            }
            arrayList = arrayList2;
        }
        Object obj = arrayList.get((int) (Math.random() * ((double) arrayList.size())));
        while (true) {
            String str = (String) obj;
            if (!str.isEmpty() && !str.startsWith(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵呜喵呜呜喵呜喵"))) {
                return str;
            }
            obj = arrayList.get((int) (Math.random() * ((double) arrayList.size())));
        }
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        new Thread(new RunnableC1107(this, 29)).start();
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(1203) + this.f24525 + AbstractC8405.m13972(1091);
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final boolean mo11251(C8785 c8785) {
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean m14422() {
        File file = new File(this.f24525);
        for (String str : this.f24524) {
            File file2 = new File(str);
            if (file2.exists()) {
                file2.delete();
            }
        }
        return file.exists() && file.isFile();
    }

    @Override // p337.AbstractC8803
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final boolean mo11252(C8785 c8785) {
        return c8785.f24740.intValue() > 0;
    }
}
