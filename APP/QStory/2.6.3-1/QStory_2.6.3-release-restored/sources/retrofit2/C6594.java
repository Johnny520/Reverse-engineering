package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6594 extends C6611 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ int f16163;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6594(int i) {
        super(7);
        this.f16163 = i;
    }

    @Override // retrofit2.C6611
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean mo11714(Method method) {
        switch (this.f16163) {
        }
        return method.isDefault();
    }

    @Override // retrofit2.C6611
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo11715(Method method, Class cls, Object obj, Object[] objArr) {
        switch (this.f16163) {
        }
        return AbstractC6615.m11748(method, cls, obj, objArr);
    }

    @Override // retrofit2.C6611
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public String mo11716(Method method, int i) {
        switch (this.f16163) {
            case 1:
                Parameter parameter = method.getParameters()[i];
                if (!parameter.isNamePresent()) {
                }
                break;
        }
        return super.mo11716(method, i);
    }
}
