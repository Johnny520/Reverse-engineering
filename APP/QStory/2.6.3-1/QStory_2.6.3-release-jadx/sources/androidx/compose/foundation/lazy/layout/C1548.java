package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.C1590;
import androidx.compose.p001ui.node.C2583;
import androidx.compose.runtime.C2144;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC5227;
import lin.xposed.hook.javaplugin.dialog.PluginDialog;
import p050.C7175;
import p064.C7348;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1548 implements Comparator {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f2340;

    public /* synthetic */ C1548(int i) {
        this.f2340 = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2340) {
            case 0:
                return AbstractC5227.m9464(((C1570) obj2).f2388, ((C1570) obj).f2388);
            case 1:
                return AbstractC5227.m9464(((C1590) obj).f2507, ((C1590) obj2).f2507);
            case 2:
                return AbstractC5227.m9464(((C2144) obj).f4145, ((C2144) obj2).f4145);
            case 3:
                C2583 c2583 = (C2583) obj;
                C2583 c25832 = (C2583) obj2;
                float f = c2583.f5477.f5512.f5362;
                float f2 = c25832.f5477.f5512.f5362;
                return f == f2 ? AbstractC5227.m9464(c2583.m3813(), c25832.m3813()) : Float.compare(f, f2);
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
                long j = ((C7175) obj2).f17824 - ((C7175) obj).f17824;
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
                C7348 c7348 = (C7348) obj;
                C7348 c73482 = (C7348) obj2;
                return (c7348.f18161 - c7348.f18163) - (c73482.f18161 - c73482.f18163);
        }
    }
}
