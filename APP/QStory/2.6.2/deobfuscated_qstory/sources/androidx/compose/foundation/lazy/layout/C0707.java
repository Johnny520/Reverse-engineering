package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.C0749;
import androidx.compose.runtime.C1309;
import androidx.compose.ui.node.C1748;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC4394;
import lin.xposed.hook.javaplugin.dialog.PluginDialog;
import p033.C6326;
import p048.C6518;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0707 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f1994;

    public /* synthetic */ C0707(int i) {
        this.f1994 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1994) {
            case 0:
                return AbstractC4394.m8915(((C0729) obj2).f2042, ((C0729) obj).f2042);
            case 1:
                return AbstractC4394.m8915(((C0749) obj).f2161, ((C0749) obj2).f2161);
            case 2:
                return AbstractC4394.m8915(((C1309) obj).f3799, ((C1309) obj2).f3799);
            case 3:
                C1748 c1748 = (C1748) obj;
                C1748 c17482 = (C1748) obj2;
                float f = c1748.f5131.f5166.f5016;
                float f2 = c17482.f5131.f5166.f5016;
                return f == f2 ? AbstractC4394.m8915(c1748.m3243(), c17482.m3243()) : Float.compare(f, f2);
            case 4:
                return Integer.compare(((Constructor) obj2).getParameterCount(), ((Constructor) obj).getParameterCount());
            case 5:
                return PluginDialog.lambda$sortPlugins$7((String) obj, (String) obj2);
            case 6:
                long j = ((C6326) obj2).f17429 - ((C6326) obj).f17429;
                if (j == 0) {
                    return 0;
                }
                return j < 0 ? -1 : 1;
            case 7:
                File file = (File) obj;
                File file2 = (File) obj2;
                if (file.isDirectory() && file2.isFile()) {
                    return -1;
                }
                if (file.isFile() && file2.isDirectory()) {
                    return 1;
                }
                return file.getName().compareTo(file2.getName());
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
                C6518 c6518 = (C6518) obj;
                C6518 c65182 = (C6518) obj2;
                return (c6518.f17820 - c6518.f17822) - (c65182.f17820 - c65182.f17822);
        }
    }
}
