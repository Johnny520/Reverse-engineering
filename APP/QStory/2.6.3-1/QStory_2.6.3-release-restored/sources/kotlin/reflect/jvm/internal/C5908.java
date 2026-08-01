package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0900;
import kotlin.text.AbstractC5971;
import net.bytebuddy.pool.TypePool;
import p065.AbstractC7355;
import p068.InterfaceC7372;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5908 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f14971;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14972;

    public /* synthetic */ C5908(String str, int i) {
        this.f14972 = i;
        this.f14971 = str;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        String str;
        int i = this.f14972;
        String str2 = this.f14971;
        switch (i) {
            case 0:
                String strM708 = AbstractC0900.m708(new StringBuilder(), AbstractC7355.f18189.f14041.f14038, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                str = AbstractC5971.m10698(str2, strM708, false) ? strM708 : null;
                if (str != null) {
                    break;
                }
                break;
            default:
                String strM7082 = AbstractC0900.m708(new StringBuilder(), AbstractC7355.f18198.f14041.f14038, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                str = AbstractC5971.m10698(str2, strM7082, false) ? strM7082 : null;
                if (str != null) {
                    break;
                }
                break;
        }
        return str;
    }
}
