package p132;

import androidx.appcompat.app.C0955;
import androidx.collection.C1123;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.InterfaceC2174;
import androidx.compose.runtime.snapshots.InterfaceC2118;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8170 implements InterfaceC2174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object[] f19900;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f19901;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC8167 f19902;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8171 f19903 = new C8171(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC8174 f19904;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f19905;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC8175 f19906;

    public C8170(InterfaceC8175 interfaceC8175, InterfaceC8174 interfaceC8174, String str, Object obj, Object[] objArr) {
        this.f19906 = interfaceC8175;
        this.f19904 = interfaceC8174;
        this.f19905 = str;
        this.f19901 = obj;
        this.f19900 = objArr;
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2734() {
        m13096();
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2735() {
        InterfaceC8167 interfaceC8167 = this.f19902;
        if (interfaceC8167 != null) {
            ((C0955) interfaceC8167).m963();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m13096() {
        String strM13100;
        InterfaceC8174 interfaceC8174 = this.f19904;
        if (this.f19902 != null) {
            C1123.m1409(this.f19902, "entry(", ") is not null");
            return;
        }
        if (interfaceC8174 != null) {
            C8171 c8171 = this.f19903;
            Object objInvoke = c8171.invoke();
            if (objInvoke == null || interfaceC8174.mo2045(objInvoke)) {
                this.f19902 = interfaceC8174.mo2041(this.f19905, c8171);
                return;
            }
            if (objInvoke instanceof InterfaceC2118) {
                InterfaceC2118 interfaceC2118 = (InterfaceC2118) objInvoke;
                if (interfaceC2118.mo2843() == C2188.f4265 || interfaceC2118.mo2843() == C2188.f4267 || interfaceC2118.mo2843() == C2188.f4264) {
                    strM13100 = "MutableState containing " + interfaceC2118.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM13100 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM13100 = AbstractC8176.m13100(objInvoke);
            }
            throw new IllegalArgumentException(strM13100);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2736() {
        InterfaceC8167 interfaceC8167 = this.f19902;
        if (interfaceC8167 != null) {
            ((C0955) interfaceC8167).m963();
        }
    }
}
