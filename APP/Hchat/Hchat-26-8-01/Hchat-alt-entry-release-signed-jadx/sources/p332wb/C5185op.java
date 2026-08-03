package p332wb;

import okhttp3.HttpUrl;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p119i2.AbstractC1923e0;
import p190n2.C2884s;
import p218og.AbstractC3149m;
import p222p.AbstractC3199a;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.op */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5185op implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f19481g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f19482h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f19483i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5185op(int i9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f19481g = i9;
        this.f19482h = interfaceC1809a1;
        this.f19483i = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        String str;
        switch (this.f19481g) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.f19482h.setValue(Boolean.FALSE);
                if (zBooleanValue) {
                    InterfaceC1809a1 interfaceC1809a1 = this.f19483i;
                    AbstractC3199a.m6848u((Number) interfaceC1809a1.getValue(), 1, interfaceC1809a1);
                }
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                this.f19482h.setValue(str2);
                switch (str2.hashCode()) {
                    case -2131439764:
                        str = str2.equals("anthropic") ? "https://api.anthropic.com/v1/messages" : HttpUrl.FRAGMENT_ENCODE_SET;
                        break;
                    case -1249537483:
                        if (str2.equals("gemini")) {
                            str = "https://generativelanguage.googleapis.com/v1beta";
                            break;
                        }
                        break;
                    case -1010579470:
                        if (str2.equals("openai")) {
                            str = "https://api.openai.com/v1/chat/completions";
                            break;
                        }
                        break;
                    case 629437796:
                        if (str2.equals("deepseek")) {
                            str = "https://api.deepseek.com/chat/completions";
                            break;
                        }
                        break;
                    case 1231576595:
                        if (str2.equals("openrouter")) {
                            str = "https://openrouter.ai/api/v1/chat/completions";
                            break;
                        }
                        break;
                    case 1975967741:
                        if (str2.equals("siliconflow")) {
                            str = "https://api.siliconflow.cn/v1/chat/completions";
                            break;
                        }
                        break;
                }
                if (AbstractC3149m.m6721t0(str)) {
                    str = null;
                }
                if (str != null) {
                    this.f19483i.setValue(str);
                }
                break;
            default:
                C2884s c2884s = (C2884s) obj;
                c2884s.getClass();
                String str3 = c2884s.f9316a.f6529h;
                StringBuilder sb2 = new StringBuilder();
                int length = str3.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char cCharAt = str3.charAt(i9);
                    if (Character.isDigit(cCharAt)) {
                        sb2.append(cCharAt);
                    }
                }
                String strM6701P0 = AbstractC3149m.m6701P0(10, sb2.toString());
                int length2 = strM6701P0.length();
                this.f19482h.setValue(new C2884s(4, strM6701P0, AbstractC1923e0.m4784b(length2, length2)));
                this.f19483i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
        }
        return C3967n.f12976a;
    }
}
