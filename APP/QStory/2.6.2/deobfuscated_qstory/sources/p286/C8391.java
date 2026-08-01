package p286;

import android.content.Context;
import com.bumptech.glide.load.engine.InterfaceC2988;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8391 implements InterfaceC8398 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f23270;

    public C8391(InterfaceC8398... interfaceC8398Arr) {
        if (interfaceC8398Arr.length != 0) {
            this.f23270 = Arrays.asList(interfaceC8398Arr);
        } else {
            C5919.m11249("MultiTransformation must contain at least one Transformation");
            throw null;
        }
    }

    @Override // p286.InterfaceC8392
    public final boolean equals(Object obj) {
        if (obj instanceof C8391) {
            return this.f23270.equals(((C8391) obj).f23270);
        }
        return false;
    }

    @Override // p286.InterfaceC8392
    public final int hashCode() {
        return this.f23270.hashCode();
    }

    @Override // p286.InterfaceC8398
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2988 mo6475(Context context, InterfaceC2988 interfaceC2988, int i, int i2) {
        Iterator it = this.f23270.iterator();
        InterfaceC2988 interfaceC29882 = interfaceC2988;
        while (it.hasNext()) {
            InterfaceC2988 interfaceC2988Mo6475 = ((InterfaceC8398) it.next()).mo6475(context, interfaceC29882, i, i2);
            if (interfaceC29882 != null && !interfaceC29882.equals(interfaceC2988) && !interfaceC29882.equals(interfaceC2988Mo6475)) {
                interfaceC29882.recycle();
            }
            interfaceC29882 = interfaceC2988Mo6475;
        }
        return interfaceC29882;
    }

    @Override // p286.InterfaceC8392
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6410(MessageDigest messageDigest) {
        Iterator it = this.f23270.iterator();
        while (it.hasNext()) {
            ((InterfaceC8398) it.next()).mo6410(messageDigest);
        }
    }
}
