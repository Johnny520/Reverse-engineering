package p302;

import android.content.Context;
import com.bumptech.glide.load.engine.InterfaceC3821;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9221 implements InterfaceC9228 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f23614;

    public C9221(InterfaceC9228... interfaceC9228Arr) {
        if (interfaceC9228Arr.length != 0) {
            this.f23614 = Arrays.asList(interfaceC9228Arr);
        } else {
            C6755.m11869("MultiTransformation must contain at least one Transformation");
            throw null;
        }
    }

    @Override // p302.InterfaceC9222
    public final boolean equals(Object obj) {
        if (obj instanceof C9221) {
            return this.f23614.equals(((C9221) obj).f23614);
        }
        return false;
    }

    @Override // p302.InterfaceC9222
    public final int hashCode() {
        return this.f23614.hashCode();
    }

    @Override // p302.InterfaceC9228
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC3821 mo7095(Context context, InterfaceC3821 interfaceC3821, int i, int i2) {
        Iterator it = this.f23614.iterator();
        InterfaceC3821 interfaceC38212 = interfaceC3821;
        while (it.hasNext()) {
            InterfaceC3821 interfaceC3821Mo7095 = ((InterfaceC9228) it.next()).mo7095(context, interfaceC38212, i, i2);
            if (interfaceC38212 != null && !interfaceC38212.equals(interfaceC3821) && !interfaceC38212.equals(interfaceC3821Mo7095)) {
                interfaceC38212.recycle();
            }
            interfaceC38212 = interfaceC3821Mo7095;
        }
        return interfaceC38212;
    }

    @Override // p302.InterfaceC9222
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo7028(MessageDigest messageDigest) {
        Iterator it = this.f23614.iterator();
        while (it.hasNext()) {
            ((InterfaceC9228) it.next()).mo7028(messageDigest);
        }
    }
}
