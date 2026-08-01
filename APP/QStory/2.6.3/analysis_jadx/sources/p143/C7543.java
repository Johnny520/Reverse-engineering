package p143;

import androidx.compose.animation.core.C0325;
import androidx.lifecycle.C2423;
import androidx.lifecycle.InterfaceC2388;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.InterfaceC5093;
import p160.C7637;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7543 extends AbstractC7546 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2388 f20424;

    public C7543(InterfaceC2388 interfaceC2388, C2423 c2423) {
        this.f20424 = interfaceC2388;
        c2423.getClass();
        C7637 c7637 = C7637.f20725;
        c7637.getClass();
        C0325 c0325 = new C0325(c2423, C7544.f20425, c7637);
        InterfaceC5093 interfaceC5093Mo8917 = AbstractC4396.f12975.mo8917(C7544.class);
        String strMo8885 = interfaceC5093Mo8917.mo8885();
        if (strMo8885 != null) {
        } else {
            C5925.m11310("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC2388 interfaceC2388 = this.f20424;
        if (interfaceC2388 == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC2388.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = interfaceC2388.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC2388)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
