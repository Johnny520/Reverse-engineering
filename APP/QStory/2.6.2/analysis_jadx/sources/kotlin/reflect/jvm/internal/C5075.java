package kotlin.reflect.jvm.internal;

import androidx.activity.AbstractC0053;
import kotlin.text.AbstractC5138;
import net.bytebuddy.pool.TypePool;
import p049.AbstractC6525;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5075 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f14626;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14627;

    public /* synthetic */ C5075(String str, int i) {
        this.f14627 = i;
        this.f14626 = str;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        String str;
        int i = this.f14627;
        String str2 = this.f14626;
        switch (i) {
            case 0:
                String strM155 = AbstractC0053.m155(new StringBuilder(), AbstractC6525.f17848.f13692.f13689, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                str = AbstractC5138.m10125(str2, strM155, false) ? strM155 : null;
                if (str != null) {
                    break;
                }
                break;
            default:
                String strM1552 = AbstractC0053.m155(new StringBuilder(), AbstractC6525.f17857.f13692.f13689, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                str = AbstractC5138.m10125(str2, strM1552, false) ? strM1552 : null;
                if (str != null) {
                    break;
                }
                break;
        }
        return str;
    }
}
