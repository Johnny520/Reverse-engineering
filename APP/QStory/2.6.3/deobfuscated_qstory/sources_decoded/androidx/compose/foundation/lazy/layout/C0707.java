package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.C0749;
import androidx.compose.runtime.C1309;
import androidx.compose.ui.node.C1748;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4395;
import lin.xposed.hook.javaplugin.dialog.PluginDialog;
import p034.C6346;
import p048.C6519;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0707 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1995;

    public /* synthetic */ C0707(int i) {
        this.f1995 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1995) {
            case 0:
                return AbstractC4395.m8905(((C0729) obj2).f2043, ((C0729) obj).f2043);
            case 1:
                return AbstractC4395.m8905(((C0749) obj).f2162, ((C0749) obj2).f2162);
            case 2:
                return AbstractC4395.m8905(((C1309) obj).f3800, ((C1309) obj2).f3800);
            case 3:
                C1748 c1748 = (C1748) obj;
                C1748 c17482 = (C1748) obj2;
                float f = c1748.f5132.f5167.f5017;
                float f2 = c17482.f5132.f5167.f5017;
                return f == f2 ? AbstractC4395.m8905(c1748.m3253(), c17482.m3253()) : Float.compare(f, f2);
            case 4:
                return Integer.compare(((Constructor) obj2).getParameterCount(), ((Constructor) obj).getParameterCount());
            case 5:
                return PluginDialog.lambda$sortPlugins$7((String) obj, (String) obj2);
            case 6:
                File file = (File) obj;
                File file2 = (File) obj2;
                if (file.isDirectory() && file2.isFile()) {
                    return -1;
                }
                if (file.isFile() && file2.isDirectory()) {
                    return 1;
                }
                return file.getName().compareTo(file2.getName());
            case 7:
                long j = ((C6346) obj2).f17479 - ((C6346) obj).f17479;
                if (j == 0) {
                    return 0;
                }
                return j < 0 ? -1 : 1;
            case 8:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            default:
                C6519 c6519 = (C6519) obj;
                C6519 c65192 = (C6519) obj2;
                return (c6519.f17816 - c6519.f17818) - (c65192.f17816 - c65192.f17818);
        }
    }
}
