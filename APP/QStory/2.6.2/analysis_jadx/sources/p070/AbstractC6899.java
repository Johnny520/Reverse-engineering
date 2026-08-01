package p070;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4721;
import p126.InterfaceC7429;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18408;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f18409;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f18410;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC6899(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.f18410 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6901 m12149() {
        return new C6901(0, 1, 0, (byte) 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C6901 m12150(AbstractC6899 abstractC6899) {
        byte b = 0;
        return new C6901(abstractC6899.f18409 + abstractC6899.f18408, 1, b, b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6900 m12151(AbstractC6899 abstractC6899, InterfaceC4721[] interfaceC4721Arr) {
        return new C6900(abstractC6899.f18409 + abstractC6899.f18408, interfaceC4721Arr);
    }

    public String toString() {
        switch (this.f18410) {
            case 1:
                String simpleName = AbstractC4395.f12971.mo8927(getClass()).getSimpleName();
                return simpleName == null ? "" : simpleName;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1230 mo12152(C0920 c0920) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract Object mo12153(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract void mo12154(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7429 interfaceC7429);

    public /* synthetic */ AbstractC6899(int i, int i2, int i3, byte b) {
        this.f18410 = i3;
        this.f18409 = i;
        this.f18408 = i2;
    }
}
