package p159;

import androidx.compose.animation.core.C1171;
import androidx.lifecycle.C3256;
import androidx.lifecycle.InterfaceC3221;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.InterfaceC5925;
import p176.C8466;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8372 extends AbstractC8375 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC3221 f20769;

    public C8372(InterfaceC3221 interfaceC3221, C3256 c3256) {
        this.f20769 = interfaceC3221;
        c3256.getClass();
        C8466 c8466 = C8466.f21070;
        c8466.getClass();
        C1171 c1171 = new C1171(c3256, C8373.f20770, c8466);
        InterfaceC5925 interfaceC5925Mo9476 = AbstractC5228.f13320.mo9476(C8373.class);
        String strMo9444 = interfaceC5925Mo9476.mo9444();
        if (strMo9444 != null) {
        } else {
            C6755.m11869("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC3221 interfaceC3221 = this.f20769;
        if (interfaceC3221 == null) {
            sb.append("null");
        } else {
            String simpleName = interfaceC3221.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = interfaceC3221.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(iLastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            sb.append(Integer.toHexString(System.identityHashCode(interfaceC3221)));
        }
        sb.append("}}");
        return sb.toString();
    }
}
