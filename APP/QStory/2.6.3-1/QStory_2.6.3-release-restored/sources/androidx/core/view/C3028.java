package androidx.core.view;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3028 extends AbstractC3025 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final /* synthetic */ int f6816;

    public C3028(int i, Class cls, int i2, int i3, int i4) {
        this.f6816 = i4;
        this.f6812 = i;
        this.f6809 = cls;
        this.f6811 = i2;
        this.f6810 = i3;
    }

    @Override // androidx.core.view.AbstractC3025
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo4558(Object obj, View view) {
        switch (this.f6816) {
            case 0:
                AbstractC3117.m4839(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC3117.m4840(view, (CharSequence) obj);
                break;
            default:
                AbstractC3117.m4833(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // androidx.core.view.AbstractC3025
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo4559(View view) {
        switch (this.f6816) {
            case 0:
                return Boolean.valueOf(AbstractC3117.m4835(view));
            case 1:
                return AbstractC3117.m4837(view);
            default:
                return Boolean.valueOf(AbstractC3117.m4836(view));
        }
    }

    @Override // androidx.core.view.AbstractC3025
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo4562(Object obj, Object obj2) {
        switch (this.f6816) {
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
