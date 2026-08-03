package p332wb;

import java.util.UUID;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p197n9.C2912a;
import p276sf.C3967n;
import tf.C4175v;

/* JADX INFO: renamed from: wb.yk */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5509yk implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f22188g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f22189h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5509yk(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f22188g = i9;
        this.f22189h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f22188g) {
            case 0:
                this.f22189h.setValue(Boolean.FALSE);
                break;
            case 1:
                this.f22189h.setValue(null);
                break;
            case 2:
                this.f22189h.setValue(null);
                break;
            case 3:
                this.f22189h.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f22189h.setValue(Boolean.TRUE);
                break;
            case 5:
                this.f22189h.setValue(Boolean.TRUE);
                break;
            case 6:
                this.f22189h.setValue(C5483xq.f22028b);
                break;
            case 7:
                this.f22189h.setValue(C5483xq.f22028b);
                break;
            case 8:
                this.f22189h.setValue(C5483xq.f22029c);
                break;
            case 9:
                this.f22189h.setValue(C5483xq.f22027a);
                break;
            case 10:
                this.f22189h.setValue(null);
                break;
            case 11:
                this.f22189h.setValue("main");
                break;
            case 12:
                this.f22189h.setValue("autoAcceptLabels");
                break;
            case 13:
                this.f22189h.setValue("autoAccept");
                break;
            case 14:
                this.f22189h.setValue("main");
                break;
            case 15:
                this.f22189h.setValue("greetAcceptedLabels");
                break;
            case 16:
                this.f22189h.setValue("greetAccepted");
                break;
            case 17:
                this.f22189h.setValue("main");
                break;
            case 18:
                this.f22189h.setValue("rules");
                break;
            case 19:
                this.f22189h.setValue("autoAccept");
                break;
            case 20:
                this.f22189h.setValue("greetAccepted");
                break;
            case 21:
                this.f22189h.setValue("ai");
                break;
            case 22:
                this.f22189h.setValue("main");
                break;
            case 23:
                this.f22189h.setValue(C5316so.f20704a);
                break;
            case 24:
                this.f22189h.setValue(C4961hu.f17742a);
                break;
            case 25:
                this.f22189h.setValue(C4733b.f15953a);
                break;
            case 26:
                String string = UUID.randomUUID().toString();
                string.getClass();
                this.f22189h.setValue(new C5295s3(new C2912a(string, HttpUrl.FRAGMENT_ENCODE_SET, C4175v.f13712g), false));
                break;
            case 27:
                this.f22189h.setValue(C5361u3.f20988a);
                break;
            case 28:
                this.f22189h.setValue(null);
                break;
            default:
                this.f22189h.setValue(Boolean.FALSE);
                break;
        }
        return C3967n.f12976a;
    }
}
