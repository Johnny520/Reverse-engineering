package p299u9;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p065eb.C0859c0;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tf.AbstractC4156d0;

/* JADX INFO: renamed from: u9.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4287f implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14211g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f14212h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f14213i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f14214j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4287f(InterfaceC1809a1 interfaceC1809a1, ArrayList arrayList, boolean z9) {
        this.f14213i = arrayList;
        this.f14212h = z9;
        this.f14214j = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f14211g) {
            case 0:
                ((C4289h) this.f14213i).m8608a((View) this.f14214j, this.f14212h);
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f14213i;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f14214j;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add(((C0859c0) it.next()).f2626a);
                }
                interfaceC1809a1.setValue(this.f14212h ? AbstractC4156d0.m8352T((Set) interfaceC1809a1.getValue(), linkedHashSet) : AbstractC4156d0.m8353U((Set) interfaceC1809a1.getValue(), linkedHashSet));
                break;
            default:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f14213i;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f14214j;
                if (this.f14212h) {
                    interfaceC1220a.invoke();
                } else {
                    interfaceC1220a2.invoke();
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4287f(C4289h c4289h, View view, boolean z9) {
        this.f14213i = c4289h;
        this.f14214j = view;
        this.f14212h = z9;
    }

    public /* synthetic */ C4287f(boolean z9, InterfaceC1220a interfaceC1220a, InterfaceC1220a interfaceC1220a2) {
        this.f14212h = z9;
        this.f14213i = interfaceC1220a;
        this.f14214j = interfaceC1220a2;
    }
}
