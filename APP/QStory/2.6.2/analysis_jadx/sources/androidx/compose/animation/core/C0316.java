package androidx.compose.animation.core;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;

/* JADX INFO: renamed from: androidx.compose.animation.core.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0316 implements InterfaceC1333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public boolean f1061;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C0374 f1062;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final /* synthetic */ C0315 f1063;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f1064;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public long f1065;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Float f1066;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1395 f1067;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public Float f1068;

    public C0316(C0315 c0315, Float f, Float f2, C0306 c0306) {
        C0357 c0357 = AbstractC0330.f1123;
        this.f1063 = c0315;
        this.f1068 = f;
        this.f1066 = f2;
        this.f1067 = AbstractC1367.m2465(f);
        this.f1062 = new C0374(c0306, c0357, this.f1068, this.f1066, null);
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        return ((AbstractC1347) this.f1067).getValue();
    }
}
