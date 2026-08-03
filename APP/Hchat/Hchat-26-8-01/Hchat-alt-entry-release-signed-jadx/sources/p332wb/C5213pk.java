package p332wb;

import bsh.org.objectweb.asm.Opcodes;
import java.util.Set;
import okhttp3.HttpUrl;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p276sf.C3967n;
import p322w0.C4661l;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.pk */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5213pk implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20000g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f20001h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20002i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5213pk(int i9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f20000g = i9;
        this.f20001h = interfaceC1809a1;
        this.f20002i = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f20000g) {
            case 0:
                this.f20002i.setValue(new C5356tv(EnumC5455wv.f21837g, new C5391v0("选择检测好友", EnumC5358u0.f20978g, true, AbstractC4166m.m8392A1((Set) this.f20001h.getValue(), "|", null, null, null, 62), new C5015jk(8), true, Opcodes.CHECKCAST)));
                break;
            case 1:
                this.f20002i.setValue(new C5356tv(EnumC5455wv.f21838h, new C5391v0("选择排除好友", EnumC5358u0.f20978g, true, AbstractC4166m.m8392A1((Set) this.f20001h.getValue(), "|", null, null, null, 62), new C5015jk(12), true, Opcodes.CHECKCAST)));
                break;
            case 2:
                this.f20001h.setValue(null);
                this.f20002i.setValue(EnumC4897g.f17315i);
                break;
            case 3:
                this.f20002i.setValue(new C4858eq(new C5391v0("允许他人点歌的聊天", EnumC5358u0.f20980i, true, AbstractC4166m.m8392A1((Set) this.f20001h.getValue(), "|", null, null, null, 62), new C4661l(13), true, Opcodes.CHECKCAST)));
                break;
            case 4:
                this.f20001h.setValue("${sendText}");
                this.f20002i.setValue("HH:mm:ss");
                break;
            case 5:
                this.f20001h.setValue(null);
                this.f20002i.setValue("rules");
                break;
            case 6:
                this.f20002i.setValue(new C4928gu(new C5391v0("设置允许名单", EnumC5358u0.f20980i, true, AbstractC4166m.m8392A1((Set) this.f20001h.getValue(), "|", null, null, null, 62), new C4661l(10), true, Opcodes.CHECKCAST)));
                break;
            case 7:
                this.f20001h.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                this.f20002i.setValue("create");
                break;
            case 8:
                InterfaceC1809a1 interfaceC1809a1 = this.f20001h;
                interfaceC1809a1.setValue(Boolean.valueOf(!((Boolean) interfaceC1809a1.getValue()).booleanValue()));
                Boolean bool = (Boolean) interfaceC1809a1.getValue();
                bool.getClass();
                this.f20002i.setValue(bool);
                break;
            default:
                InterfaceC1809a1 interfaceC1809a12 = this.f20001h;
                this.f20002i.setValue((String) interfaceC1809a12.getValue());
                interfaceC1809a12.setValue(null);
                break;
        }
        return C3967n.f12976a;
    }
}
