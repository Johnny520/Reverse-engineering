package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5763 extends C5780 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ int f15818;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5763(int i) {
        super(7);
        this.f15818 = i;
    }

    @Override // retrofit2.C5780
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo11098(Method method) {
        switch (this.f15818) {
        }
        return method.isDefault();
    }

    @Override // retrofit2.C5780
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo11099(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f15818) {
        }
        return AbstractC5784.m11132(method, cls, obj, objArr);
    }

    @Override // retrofit2.C5780
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String mo11100(Method method, int i) {
        switch (this.f15818) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                }
                break;
        }
        return super.mo11100(method, i);
    }
}
