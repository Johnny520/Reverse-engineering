package p015b0;

import android.view.ActionMode;
import p040d0.C0645b;
import p040d0.C0646c;
import p099h.Hchat.R;
import p100h0.C1511d1;
import p116i.C1765k1;
import p117i0.InterfaceC1898z;
import p136j8.C2095f;
import p243q9.C3465a;
import p265s.C3813a0;
import p265s.C3834h0;
import p265s.C3844m0;
import p322w0.C4668s;
import p357y1.C5900k1;
import p358y2.C5989x;
import p358y2.DialogC5987v;

/* JADX INFO: renamed from: b0.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0147m implements InterfaceC1898z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f389a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f390b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0147m(Object obj, int i9) {
        this.f389a = i9;
        this.f390b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1898z
    /* JADX INFO: renamed from: a */
    public final void mo725a() {
        int i9 = this.f389a;
        Object obj = this.f390b;
        switch (i9) {
            case 0:
                C0142h c0142h = (C0142h) obj;
                C4668s c4668s = c0142h.f371e;
                C3465a c3465a = c4668s.f15543h;
                if (c3465a != null) {
                    c3465a.m7269e();
                }
                c4668s.m9160a();
                ActionMode actionMode = c0142h.f374h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c0142h.f374h = null;
                break;
            case 1:
                C0645b c0645b = (C0645b) ((C0646c) obj).f2013c.getValue();
                if (c0645b != null) {
                    c0645b.close();
                }
                break;
            case 2:
                ((C1765k1) obj).m4420i();
                break;
            case 3:
                ((C3813a0) obj).f12507d = null;
                break;
            case 4:
                C3844m0 c3844m0 = (C3844m0) obj;
                C2095f c2095f = c3844m0.f12580c;
                if (c2095f != null) {
                    c2095f.f7000a = false;
                }
                c3844m0.f12580c = null;
                break;
            case 5:
                ((C3834h0) obj).f12560f = true;
                break;
            case 6:
                ((C1511d1) obj).m4029o();
                break;
            case 7:
                ((C5900k1) obj).f23972h.invoke();
                break;
            case 8:
                DialogC5987v dialogC5987v = (DialogC5987v) obj;
                dialogC5987v.dismiss();
                dialogC5987v.f24316m.m10555f();
                break;
            default:
                C5989x c5989x = (C5989x) obj;
                c5989x.m10555f();
                c5989x.setTag(R.id.view_tree_lifecycle_owner, null);
                c5989x.f24338v.removeViewImmediate(c5989x);
                break;
        }
    }
}
