package p286;

import android.content.Context;
import com.bumptech.glide.load.engine.InterfaceC2989;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8392 implements InterfaceC8399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List f23269;

    public C8392(InterfaceC8399... interfaceC8399Arr) {
        if (interfaceC8399Arr.length != 0) {
            this.f23269 = Arrays.asList(interfaceC8399Arr);
        } else {
            C5925.m11310("MultiTransformation must contain at least one Transformation");
            throw null;
        }
    }

    @Override // p286.InterfaceC8393
    public final boolean equals(Object obj) {
        if (obj instanceof C8392) {
            return this.f23269.equals(((C8392) obj).f23269);
        }
        return false;
    }

    @Override // p286.InterfaceC8393
    public final int hashCode() {
        return this.f23269.hashCode();
    }

    @Override // p286.InterfaceC8399
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final InterfaceC2989 mo6535(Context context, InterfaceC2989 interfaceC2989, int i, int i2) {
        Iterator it = this.f23269.iterator();
        InterfaceC2989 interfaceC29892 = interfaceC2989;
        while (it.hasNext()) {
            InterfaceC2989 interfaceC2989Mo6535 = ((InterfaceC8399) it.next()).mo6535(context, interfaceC29892, i, i2);
            if (interfaceC29892 != null && !interfaceC29892.equals(interfaceC2989) && !interfaceC29892.equals(interfaceC2989Mo6535)) {
                interfaceC29892.recycle();
            }
            interfaceC29892 = interfaceC2989Mo6535;
        }
        return interfaceC29892;
    }

    @Override // p286.InterfaceC8393
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6468(MessageDigest messageDigest) {
        Iterator it = this.f23269.iterator();
        while (it.hasNext()) {
            ((InterfaceC8399) it.next()).mo6468(messageDigest);
        }
    }
}
