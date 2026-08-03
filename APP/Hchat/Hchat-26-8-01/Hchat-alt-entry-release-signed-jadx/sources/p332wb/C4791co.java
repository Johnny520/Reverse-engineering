package p332wb;

import android.content.Context;
import android.widget.Toast;
import gg.AbstractC1415k;
import gg.C1414j;
import p000a.AbstractC0000a;
import p051db.C0765c;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.co */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4791co extends C1414j implements InterfaceC1220a {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f16416n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f16417o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Context f16418p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f16419q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4791co(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        super(0, AbstractC0921a.m2246i(AbstractC1415k.class), "openContactPicker", "SelectedMessagesMiuixPage$openContactPicker(Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroid/content/Context;Landroidx/compose/runtime/MutableState;)V", 0);
        this.f16416n = interfaceC1809a1;
        this.f16417o = interfaceC1809a12;
        this.f16418p = context;
        this.f16419q = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        String strM52a1 = AbstractC0000a.m52a1(((Number) this.f16416n.getValue()).intValue(), AbstractC4955ho.m9445T6((C0765c) this.f16417o.getValue()));
        if (strM52a1 != null) {
            Toast.makeText(this.f16418p, strM52a1, 0).show();
        } else {
            this.f16419q.setValue(C4797cu.f16464a);
        }
        return C3967n.f12976a;
    }
}
