package p143;

import androidx.compose.animation.core.C0325;
import androidx.lifecycle.C2423;
import androidx.lifecycle.InterfaceC2388;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.InterfaceC5092;
import p160.C7636;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7542 extends AbstractC7545 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC2388 f20429;

    public C7542(InterfaceC2388 interfaceC2388, C2423 c2423) {
        this.f20429 = interfaceC2388;
        c2423.getClass();
        C7636 c7636 = C7636.f20730;
        c7636.getClass();
        C0325 c0325 = new C0325(c2423, C7543.f20430, c7636);
        InterfaceC5092 interfaceC5092Mo8927 = AbstractC4395.f12971.mo8927(C7543.class);
        String strMo8895 = interfaceC5092Mo8927.mo8895();
        if (strMo8895 != null) {
        } else {
            C5919.m11249("Local and anonymous classes can not be ViewModels");
            throw null;
        }
    }

    public final String toString() {
        int iLastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        InterfaceC2388 interfaceC2388 = this.f20429;
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
