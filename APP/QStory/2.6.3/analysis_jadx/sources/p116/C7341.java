package p116;

import androidx.appcompat.app.C0108;
import androidx.collection.C0276;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1339;
import androidx.compose.runtime.snapshots.InterfaceC1283;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7341 implements InterfaceC1339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object[] f19555;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f19556;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC7338 f19557;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7342 f19558 = new C7342(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC7345 f19559;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f19560;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC7346 f19561;

    public C7341(InterfaceC7346 interfaceC7346, InterfaceC7345 interfaceC7345, String str, Object obj, Object[] objArr) {
        this.f19561 = interfaceC7346;
        this.f19559 = interfaceC7345;
        this.f19560 = str;
        this.f19556 = obj;
        this.f19555 = objArr;
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2174() {
        m12537();
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2175() {
        InterfaceC7338 interfaceC7338 = this.f19557;
        if (interfaceC7338 != null) {
            ((C0108) interfaceC7338).m403();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12537() {
        String strM12541;
        InterfaceC7345 interfaceC7345 = this.f19559;
        if (this.f19557 != null) {
            C0276.m849(this.f19557, "entry(", ") is not null");
            return;
        }
        if (interfaceC7345 != null) {
            C7342 c7342 = this.f19558;
            Object objInvoke = c7342.invoke();
            if (objInvoke == null || interfaceC7345.mo1485(objInvoke)) {
                this.f19557 = interfaceC7345.mo1481(this.f19560, c7342);
                return;
            }
            if (objInvoke instanceof InterfaceC1283) {
                InterfaceC1283 interfaceC1283 = (InterfaceC1283) objInvoke;
                if (interfaceC1283.mo2283() == C1353.f3920 || interfaceC1283.mo2283() == C1353.f3922 || interfaceC1283.mo2283() == C1353.f3919) {
                    strM12541 = "MutableState containing " + interfaceC1283.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM12541 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM12541 = AbstractC7347.m12541(objInvoke);
            }
            throw new IllegalArgumentException(strM12541);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2176() {
        InterfaceC7338 interfaceC7338 = this.f19557;
        if (interfaceC7338 != null) {
            ((C0108) interfaceC7338).m403();
        }
    }
}
