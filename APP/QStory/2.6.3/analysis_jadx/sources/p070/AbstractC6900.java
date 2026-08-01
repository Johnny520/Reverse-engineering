package p070;

import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC4722;
import p126.InterfaceC7430;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18403;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f18404;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f18405;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC6900(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.f18405 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C6902 m12177() {
        return new C6902(0, 1, 0, (byte) 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C6902 m12178(AbstractC6900 abstractC6900) {
        byte b = 0;
        return new C6902(abstractC6900.f18404 + abstractC6900.f18403, 1, b, b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6901 m12179(AbstractC6900 abstractC6900, InterfaceC4722[] interfaceC4722Arr) {
        return new C6901(abstractC6900.f18404 + abstractC6900.f18403, interfaceC4722Arr);
    }

    public String toString() {
        switch (this.f18405) {
            case 1:
                String simpleName = AbstractC4396.f12975.mo8917(getClass()).getSimpleName();
                return simpleName == null ? "" : simpleName;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C1230 mo12180(C0920 c0920) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract Object mo12181(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract void mo12182(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430);

    public /* synthetic */ AbstractC6900(int i, int i2, int i3, byte b) {
        this.f18405 = i3;
        this.f18404 = i;
        this.f18403 = i2;
    }
}
