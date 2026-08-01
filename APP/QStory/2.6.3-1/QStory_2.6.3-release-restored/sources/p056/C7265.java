package p056;

import androidx.fragment.app.C3191;
import java.io.File;
import java.io.OutputStream;
import java.net.URL;
import java.util.HashMap;
import p042.AbstractC7140;
import p049.AbstractC7162;
import p049.AbstractC7166;

/* JADX INFO: renamed from: 飘花落叶言世哲苏兰子楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7265 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final HashMap f17976 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public long f17977;

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        m12390(AbstractC7162.m12409("com.tencent.mobileqq.transfile.HttpDownloader", "downloadImage", File.class, new Class[]{OutputStream.class, AbstractC7166.m12425("com.tencent.image.DownloadParams"), AbstractC7166.m12425("com.tencent.image.URLDrawableHandler"), Integer.TYPE, URL.class}), new C3191(this, 20));
    }
}
