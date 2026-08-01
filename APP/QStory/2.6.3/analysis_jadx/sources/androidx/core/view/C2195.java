package androidx.core.view;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2195 extends AbstractC2192 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f6471;

    public C2195(int i, Class cls, int i2, int i3, int i4) {
        this.f6471 = i4;
        this.f6467 = i;
        this.f6464 = cls;
        this.f6466 = i2;
        this.f6465 = i3;
    }

    @Override // androidx.core.view.AbstractC2192
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo3998(Object obj, View view) {
        switch (this.f6471) {
            case 0:
                AbstractC2284.m4279(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC2284.m4280(view, (CharSequence) obj);
                break;
            default:
                AbstractC2284.m4273(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // androidx.core.view.AbstractC2192
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo3999(View view) {
        switch (this.f6471) {
            case 0:
                return Boolean.valueOf(AbstractC2284.m4275(view));
            case 1:
                return AbstractC2284.m4277(view);
            default:
                return Boolean.valueOf(AbstractC2284.m4276(view));
        }
    }

    @Override // androidx.core.view.AbstractC2192
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo4002(Object obj, Object obj2) {
        switch (this.f6471) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
