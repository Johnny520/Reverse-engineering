package p109hb;

import java.util.Calendar;
import org.json.JSONException;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;

/* JADX INFO: renamed from: hb.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1703z implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5683g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5684h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f5685i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5686j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f5687k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f5688l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1231l f5689m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1703z(InterfaceC1231l interfaceC1231l, int i9, int i10, int i11, int i12, int i13, int i14) {
        this.f5683g = i14;
        this.f5689m = interfaceC1231l;
        this.f5684h = i9;
        this.f5685i = i10;
        this.f5686j = i11;
        this.f5687k = i12;
        this.f5688l = i13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) throws JSONException {
        switch (this.f5683g) {
            case 0:
                C1668a0 c1668a0 = (C1668a0) this.f5689m;
                int iIntValue = ((Integer) obj).intValue();
                Calendar calendar = Calendar.getInstance();
                calendar.set(this.f5684h, this.f5685i, this.f5686j, this.f5687k, this.f5688l, iIntValue);
                calendar.set(14, 0);
                c1668a0.invoke(Long.valueOf(calendar.getTimeInMillis()));
                break;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(1, this.f5684h);
                calendar2.set(2, this.f5685i);
                calendar2.set(5, this.f5686j);
                calendar2.set(11, this.f5687k);
                calendar2.set(12, this.f5688l);
                calendar2.set(13, iIntValue2);
                calendar2.set(14, 0);
                this.f5689m.invoke(Long.valueOf(calendar2.getTimeInMillis()));
                break;
        }
        return C3967n.f12976a;
    }
}
