package p332wb;

import android.app.Activity;
import android.content.SharedPreferences;
import java.util.List;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p219oh.AbstractC3165h;
import p251r.C3619d;
import p266s0.AbstractC3879i;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.bd */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4747bd implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16013g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f16014h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ long f16015i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f16016j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f16017k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4747bd(long j3, Activity activity, InterfaceC1231l interfaceC1231l, String str) {
        this.f16014h = str;
        this.f16015i = j3;
        this.f16016j = activity;
        this.f16017k = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f16013g) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f16016j;
                List list = (List) this.f16017k;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-1197430173, new C5043kf(sharedPreferences, list, this.f16015i, this.f16014h), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                Activity activity = (Activity) this.f16016j;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f16017k;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                interfaceC1220a.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= c1836h02.m4538h(interfaceC1220a) ? 4 : 2;
                }
                int i9 = iIntValue2;
                if (c1836h02.m4516S(i9 & 1, (i9 & 19) != 18)) {
                    AbstractC3165h.m6777d(null, this.f16014h, 0L, 0L, 0L, false, interfaceC1220a, 0L, 0L, false, AbstractC3879i.m8071e(1778152648, new C5043kf(this.f16015i, interfaceC1220a, activity, interfaceC1231l), c1836h02), c1836h02, ((i9 << 24) & 234881024) | 6, 3072);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4747bd(SharedPreferences sharedPreferences, List list, long j3, String str) {
        this.f16016j = sharedPreferences;
        this.f16017k = list;
        this.f16015i = j3;
        this.f16014h = str;
    }
}
