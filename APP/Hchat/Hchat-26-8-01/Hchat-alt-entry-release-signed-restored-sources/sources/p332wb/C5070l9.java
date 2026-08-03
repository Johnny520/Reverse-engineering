package p332wb;

import android.os.Handler;
import android.os.Looper;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.l9 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5070l9 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18576g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f18577h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5070l9(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f18576g = i9;
        this.f18577h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f18576g) {
            case 0:
                this.f18577h.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f18577h.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f18577h.setValue(null);
                break;
            case 3:
                this.f18577h.setValue(null);
                break;
            case 4:
                this.f18577h.setValue(null);
                break;
            case 5:
                this.f18577h.setValue(null);
                break;
            case 6:
                this.f18577h.setValue(null);
                break;
            case 7:
                this.f18577h.setValue(null);
                break;
            case 8:
                this.f18577h.setValue(null);
                break;
            case 9:
                this.f18577h.setValue(Boolean.FALSE);
                break;
            case 10:
                this.f18577h.setValue(C4930h.f17504b);
                break;
            case 11:
                this.f18577h.setValue(C4930h.f17503a);
                break;
            case 12:
                this.f18577h.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 13:
                this.f18577h.setValue(Boolean.TRUE);
                break;
            case 14:
                this.f18577h.setValue("#FF000000");
                break;
            case 15:
                this.f18577h.setValue("#FF000000");
                break;
            case 16:
                this.f18577h.setValue("#FFFFFFFF");
                break;
            case 17:
                this.f18577h.setValue("#FF000000");
                break;
            case 18:
                this.f18577h.setValue(C4930h.f17505c);
                break;
            case 19:
                this.f18577h.setValue(Boolean.TRUE);
                break;
            case 20:
                this.f18577h.setValue("#F59E0B");
                break;
            case 21:
                this.f18577h.setValue("#FFFFFF");
                break;
            case 22:
                this.f18577h.setValue("#2563EB");
                break;
            case 23:
                this.f18577h.setValue("#FFFFFF");
                break;
            case 24:
                new Handler(Looper.getMainLooper()).post(new RunnableC5378uk(this.f18577h, 0));
                break;
            case 25:
                this.f18577h.setValue("#FFFFFF");
                break;
            case 26:
                this.f18577h.setValue("#22C55E");
                break;
            case 27:
                this.f18577h.setValue("#FFFFFF");
                break;
            case 28:
                this.f18577h.setValue("#64748B");
                break;
            default:
                InterfaceC1809a1 interfaceC1809a1 = this.f18577h;
                interfaceC1809a1.setValue(Integer.valueOf(AbstractC4955ho.m9551g2(interfaceC1809a1) + 1));
                break;
        }
        return C3967n.f12976a;
    }
}
