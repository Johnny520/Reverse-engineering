package p036c9;

import android.media.MediaPlayer;
import okhttp3.HttpUrl;
import p003a2.C0014a;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.C4930h;
import p332wb.C5483xq;

/* JADX INFO: renamed from: c9.w0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0497w0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1518g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f1519h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f1520i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f1521j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0497w0(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, int i9) {
        this.f1518g = i9;
        this.f1519h = interfaceC1809a1;
        this.f1520i = interfaceC1809a12;
        this.f1521j = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        Object c3959f;
        switch (this.f1518g) {
            case 0:
                this.f1519h.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                this.f1520i.setValue(null);
                this.f1521j.setValue(EnumC0432e1.f1270i);
                break;
            case 1:
                this.f1520i.setValue((String) this.f1519h.getValue());
                this.f1521j.setValue(C4930h.f17507e);
                break;
            case 2:
                this.f1520i.setValue((String) this.f1519h.getValue());
                this.f1521j.setValue(C4930h.f17506d);
                break;
            case 3:
                this.f1519h.setValue(null);
                this.f1520i.setValue(C0014a.m182p());
                this.f1521j.setValue(C5483xq.f22028b);
                break;
            case 4:
                Boolean bool = Boolean.FALSE;
                this.f1519h.setValue(bool);
                this.f1520i.setValue(Float.valueOf(0.0f));
                ((InterfaceC1231l) this.f1521j.getValue()).invoke(bool);
                break;
            case 5:
                Boolean bool2 = Boolean.FALSE;
                this.f1519h.setValue(bool2);
                this.f1520i.setValue(Float.valueOf(0.0f));
                ((InterfaceC1231l) this.f1521j.getValue()).invoke(bool2);
                break;
            default:
                MediaPlayer mediaPlayer = (MediaPlayer) this.f1519h.getValue();
                C3967n c3967n = C3967n.f12976a;
                if (mediaPlayer != null) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f1520i;
                    if (((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                        try {
                            mediaPlayer.pause();
                            break;
                        } catch (Throwable unused) {
                        }
                        interfaceC1809a1.setValue(Boolean.FALSE);
                    } else {
                        try {
                            mediaPlayer.start();
                            interfaceC1809a1.setValue(Boolean.TRUE);
                            c3959f = c3967n;
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        if (C3960g.m8182b(c3959f) != null) {
                            this.f1521j.setValue("预览播放失败");
                            interfaceC1809a1.setValue(Boolean.FALSE);
                        }
                    }
                }
                return c3967n;
        }
        return C3967n.f12976a;
    }
}
