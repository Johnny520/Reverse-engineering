package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5764 extends C5781 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ int f15818;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5764(int i) {
        super(7);
        this.f15818 = i;
    }

    @Override // retrofit2.C5781
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo11155(Method method) {
        switch (this.f15818) {
        }
        return method.isDefault();
    }

    @Override // retrofit2.C5781
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo11156(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f15818) {
        }
        return AbstractC5785.m11189(method, cls, obj, objArr);
    }

    @Override // retrofit2.C5781
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String mo11157(Method method, int i) {
        switch (this.f15818) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                }
                break;
        }
        return super.mo11157(method, i);
    }
}
