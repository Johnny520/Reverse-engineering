package p332wb;

import java.util.ArrayList;
import okhttp3.HttpUrl;
import p051db.C0763a;
import p051db.C0765c;
import p085fg.InterfaceC1231l;
import p218og.AbstractC3156t;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.vg */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5407vg implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f21403g = 1;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f21404h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0765c f21405i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f21406j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5407vg(int i9, C0765c c0765c, InterfaceC1231l interfaceC1231l) {
        this.f21404h = interfaceC1231l;
        this.f21405i = c0765c;
        this.f21406j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        switch (this.f21403g) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, str);
                boolean z9 = false;
                int iIntValue = numM6741e0 != null ? numM6741e0.intValue() : 0;
                C0765c c0765cM1980a = this.f21405i;
                ArrayList arrayList = new ArrayList(AbstractC4955ho.m9445T6(c0765cM1980a));
                int i9 = this.f21406j;
                if (i9 >= 0 && i9 < arrayList.size()) {
                    C0763a c0763a = (C0763a) arrayList.get(i9);
                    int i10 = c0763a.f2286a;
                    if (i10 == iIntValue) {
                        z9 = true;
                        arrayList.set(i9, new C0763a(iIntValue, !z9 ? c0763a.f2287b : HttpUrl.FRAGMENT_ENCODE_SET));
                        c0765cM1980a = C0765c.m1980a(c0765cM1980a, 0, null, null, null, null, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, 0, arrayList, 0, null, 3670015);
                    } else {
                        if ((i10 == 0 || i10 == 6) == (iIntValue == 0 || iIntValue == 6) && i10 != 7 && iIntValue != 7) {
                        }
                        arrayList.set(i9, new C0763a(iIntValue, !z9 ? c0763a.f2287b : HttpUrl.FRAGMENT_ENCODE_SET));
                        c0765cM1980a = C0765c.m1980a(c0765cM1980a, 0, null, null, null, null, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, 0, arrayList, 0, null, 3670015);
                    }
                }
                this.f21404h.invoke(c0765cM1980a);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                this.f21404h.invoke(AbstractC4955ho.m9610m7(this.f21405i, this.f21406j, str2));
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C5407vg(boolean z9, InterfaceC1231l interfaceC1231l, C0765c c0765c, int i9) {
        this.f21404h = interfaceC1231l;
        this.f21405i = c0765c;
        this.f21406j = i9;
    }
}
