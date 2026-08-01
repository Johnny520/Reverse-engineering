package p116;

import androidx.appcompat.app.C0108;
import androidx.collection.C0276;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1339;
import androidx.compose.runtime.snapshots.InterfaceC1283;

/* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7340 implements InterfaceC1339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object[] f19560;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Object f19561;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public InterfaceC7337 f19562;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7341 f19563 = new C7341(this, 0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public InterfaceC7344 f19564;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public String f19565;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public InterfaceC7345 f19566;

    public C7340(InterfaceC7345 interfaceC7345, InterfaceC7344 interfaceC7344, String str, Object obj, Object[] objArr) {
        this.f19566 = interfaceC7345;
        this.f19564 = interfaceC7344;
        this.f19565 = str;
        this.f19561 = obj;
        this.f19560 = objArr;
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo2164() {
        m12510();
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2165() {
        InterfaceC7337 interfaceC7337 = this.f19562;
        if (interfaceC7337 != null) {
            ((C0108) interfaceC7337).m402();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m12510() {
        String strM12514;
        InterfaceC7344 interfaceC7344 = this.f19564;
        if (this.f19562 != null) {
            C0276.m848(this.f19562, "entry(", ") is not null");
            return;
        }
        if (interfaceC7344 != null) {
            C7341 c7341 = this.f19563;
            Object objInvoke = c7341.invoke();
            if (objInvoke == null || interfaceC7344.mo1475(objInvoke)) {
                this.f19562 = interfaceC7344.mo1471(this.f19565, c7341);
                return;
            }
            if (objInvoke instanceof InterfaceC1283) {
                InterfaceC1283 interfaceC1283 = (InterfaceC1283) objInvoke;
                if (interfaceC1283.mo2273() == C1353.f3919 || interfaceC1283.mo2273() == C1353.f3921 || interfaceC1283.mo2273() == C1353.f3918) {
                    strM12514 = "MutableState containing " + interfaceC1283.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strM12514 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strM12514 = AbstractC7346.m12514(objInvoke);
            }
            throw new IllegalArgumentException(strM12514);
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2166() {
        InterfaceC7337 interfaceC7337 = this.f19562;
        if (interfaceC7337 != null) {
            ((C0108) interfaceC7337).m402();
        }
    }
}
