package p070f0;

import gg.C1423s;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1231l;
import p218og.AbstractC3149m;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p276sf.C3967n;

/* JADX INFO: renamed from: f0.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0980l implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3091g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1423s f3092h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C1423s f3093i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0980l(C1423s c1423s, C1423s c1423s2, int i9) {
        this.f3091g = i9;
        this.f3092h = c1423s;
        this.f3093i = c1423s2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f3091g) {
            case 0:
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                C1423s c1423s = this.f3092h;
                if (c1423s.f4736g == -1) {
                    c1423s.f4736g = ((C3145i) interfaceC3142f).m6677b().f8312g;
                }
                this.f3093i.f4736g = ((C3145i) interfaceC3142f).m6677b().f8313h + 1;
                return HttpUrl.FRAGMENT_ENCODE_SET;
            default:
                String str = (String) obj;
                str.getClass();
                this.f3092h.f4736g++;
                boolean zM6709h0 = AbstractC3149m.m6709h0(str, "备注", false);
                C1423s c1423s2 = this.f3093i;
                if (zM6709h0 || AbstractC3149m.m6709h0(str, "标签", false)) {
                    c1423s2.f4736g += 12;
                } else if (AbstractC3149m.m6709h0(str, "群聊名称", false)) {
                    c1423s2.f4736g += 16;
                } else if (AbstractC3149m.m6709h0(str, "查找聊天记录", false)) {
                    c1423s2.f4736g += 10;
                } else if (AbstractC3149m.m6709h0(str, "聊天信息", false)) {
                    c1423s2.f4736g += 8;
                } else if (AbstractC3149m.m6709h0(str, "设置", false)) {
                    c1423s2.f4736g += 4;
                }
                return C3967n.f12976a;
        }
    }
}
