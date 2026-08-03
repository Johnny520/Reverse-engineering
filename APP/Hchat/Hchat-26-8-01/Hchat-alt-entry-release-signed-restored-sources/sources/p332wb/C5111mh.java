package p332wb;

import java.util.LinkedHashSet;
import java.util.Set;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import tf.AbstractC4156d0;

/* JADX INFO: renamed from: wb.mh */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5111mh implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f18927g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C4838e6 f18928h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f18929i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f18930j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5111mh(C4838e6 c4838e6, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, int i9) {
        this.f18927g = i9;
        this.f18928h = c4838e6;
        this.f18929i = interfaceC1809a1;
        this.f18930j = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        LinkedHashSet linkedHashSetM8351S;
        LinkedHashSet linkedHashSetM8351S2;
        LinkedHashSet linkedHashSetM8351S3;
        switch (this.f18927g) {
            case 0:
                String str = this.f18928h.f16756a;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC1809a1 interfaceC1809a1 = this.f18929i;
                if (zBooleanValue) {
                    linkedHashSetM8351S = AbstractC4156d0.m8354V((Set) interfaceC1809a1.getValue(), str);
                } else {
                    if (str.equals(WeChatSnsPost.TYPE_TEXT)) {
                        this.f18930j.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                    linkedHashSetM8351S = AbstractC4156d0.m8351S((Set) interfaceC1809a1.getValue(), str);
                }
                interfaceC1809a1.setValue(linkedHashSetM8351S);
                break;
            case 1:
                String str2 = this.f18928h.f16756a;
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                InterfaceC1809a1 interfaceC1809a12 = this.f18929i;
                if (zBooleanValue2) {
                    linkedHashSetM8351S2 = AbstractC4156d0.m8354V((Set) interfaceC1809a12.getValue(), str2);
                } else {
                    if (str2.equals(WeChatSnsPost.TYPE_TEXT)) {
                        this.f18930j.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                    linkedHashSetM8351S2 = AbstractC4156d0.m8351S((Set) interfaceC1809a12.getValue(), str2);
                }
                interfaceC1809a12.setValue(linkedHashSetM8351S2);
                break;
            default:
                String str3 = this.f18928h.f16756a;
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                InterfaceC1809a1 interfaceC1809a13 = this.f18929i;
                if (zBooleanValue3) {
                    linkedHashSetM8351S3 = AbstractC4156d0.m8354V((Set) interfaceC1809a13.getValue(), str3);
                } else {
                    if (str3.equals(WeChatSnsPost.TYPE_TEXT)) {
                        this.f18930j.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    }
                    linkedHashSetM8351S3 = AbstractC4156d0.m8351S((Set) interfaceC1809a13.getValue(), str3);
                }
                interfaceC1809a13.setValue(linkedHashSetM8351S3);
                break;
        }
        return C3967n.f12976a;
    }
}
