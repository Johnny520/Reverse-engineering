package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import kotlin.text.AbstractC5139;
import net.bytebuddy.pool.TypePool;
import p049.AbstractC6526;
import p052.InterfaceC6543;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5076 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f14626;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14627;

    public /* synthetic */ C5076(String str, int i) {
        this.f14627 = i;
        this.f14626 = str;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        String str;
        int i = this.f14627;
        String str2 = this.f14626;
        switch (i) {
            case 0:
                String strM148 = AbstractC0053.m148(new StringBuilder(), AbstractC6526.f17844.f13696.f13693, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                str = AbstractC5139.m10139(str2, strM148, false) ? strM148 : null;
                if (str != null) {
                    break;
                }
                break;
            default:
                String strM1482 = AbstractC0053.m148(new StringBuilder(), AbstractC6526.f17853.f13696.f13693, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                str = AbstractC5139.m10139(str2, strM1482, false) ? strM1482 : null;
                if (str != null) {
                    break;
                }
                break;
        }
        return str;
    }
}
