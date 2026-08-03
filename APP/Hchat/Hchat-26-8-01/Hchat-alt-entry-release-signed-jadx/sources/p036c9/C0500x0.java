package p036c9;

import bsh.org.objectweb.asm.Opcodes;
import java.util.List;
import java.util.Set;
import na.C2920h;
import okhttp3.HttpUrl;
import p010aa.C0040h;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p154k9.C2366j;
import p276sf.C3967n;
import p322w0.C4661l;
import p332wb.AbstractC4955ho;
import p332wb.C4700a;
import p332wb.C4752bi;
import p332wb.C4806d6;
import p332wb.C4968i4;
import p332wb.C5015jk;
import p332wb.C5177oh;
import p332wb.C5184oo;
import p332wb.C5204pb;
import p332wb.C5229q3;
import p332wb.C5341tg;
import p332wb.C5382uo;
import p332wb.C5391v0;
import p332wb.EnumC5358u0;
import tf.AbstractC4166m;
import tf.C4175v;

/* JADX INFO: renamed from: c9.x0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0500x0 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f1528g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f1529h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f1530i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0500x0(int i9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f1528g = i9;
        this.f1529h = interfaceC1809a1;
        this.f1530i = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f1528g) {
            case 0:
                if (!((List) this.f1529h.getValue()).isEmpty()) {
                    this.f1530i.setValue(EnumC0432e1.f1272k);
                }
                return C3967n.f12976a;
            case 1:
                this.f1529h.setValue(C4175v.f13712g);
                this.f1530i.setValue(EnumC0432e1.f1271j);
                break;
            case 2:
                this.f1529h.setValue(Boolean.FALSE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 3:
                this.f1529h.setValue(Boolean.TRUE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 4:
                this.f1529h.setValue(Boolean.FALSE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 5:
                this.f1529h.setValue(Boolean.TRUE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 6:
                this.f1529h.setValue(Boolean.FALSE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 7:
                this.f1529h.setValue(Boolean.TRUE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 8:
                this.f1529h.setValue(Boolean.FALSE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 9:
                this.f1529h.setValue(Boolean.TRUE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 10:
                InterfaceC1809a1 interfaceC1809a1 = this.f1529h;
                int size = ((List) interfaceC1809a1.getValue()).size();
                interfaceC1809a1.setValue(AbstractC4166m.m8398G1((List) interfaceC1809a1.getValue(), new C2920h(System.currentTimeMillis() + "_" + (size + 1), 1, "谢谢老板", 0L, false)));
                this.f1530i.setValue(Integer.valueOf(size));
                break;
            case 11:
                this.f1529h.setValue(Boolean.FALSE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 12:
                this.f1529h.setValue(Boolean.TRUE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 13:
                this.f1529h.setValue(C4175v.f13712g);
                this.f1530i.setValue(Boolean.TRUE);
                break;
            case 14:
                this.f1529h.setValue(Boolean.FALSE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 15:
                this.f1529h.setValue(Boolean.TRUE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 16:
                this.f1529h.setValue(Boolean.FALSE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 17:
                this.f1529h.setValue(Boolean.TRUE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 18:
                this.f1529h.setValue(Boolean.FALSE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 19:
                this.f1529h.setValue(Boolean.TRUE);
                this.f1530i.setValue(C4175v.f13712g);
                break;
            case 20:
                InterfaceC1809a1 interfaceC1809a12 = this.f1529h;
                this.f1530i.setValue(new C4968i4(new C5391v0("选择系统消息群聊", EnumC5358u0.f20979h, true, (String) interfaceC1809a12.getValue(), new C5341tg(interfaceC1809a12, 22), false, 224), true));
                break;
            case 21:
                InterfaceC1809a1 interfaceC1809a13 = this.f1529h;
                this.f1530i.setValue(new C5391v0("选择白名单", EnumC5358u0.f20980i, true, (String) interfaceC1809a13.getValue(), new C4752bi(interfaceC1809a13, 8), true, Opcodes.CHECKCAST));
                break;
            case 22:
                InterfaceC1809a1 interfaceC1809a14 = this.f1529h;
                this.f1530i.setValue(new C5391v0("选择黑名单", EnumC5358u0.f20980i, true, (String) interfaceC1809a14.getValue(), new C5177oh(interfaceC1809a14, 6), true, Opcodes.CHECKCAST));
                break;
            case 23:
                this.f1530i.setValue(new C4700a(new C5391v0("选择屏蔽群聊", EnumC5358u0.f20979h, true, AbstractC4955ho.m9316D5((Set) this.f1529h.getValue()), new C5204pb(17), false, 224)));
                break;
            case 24:
                InterfaceC1809a1 interfaceC1809a15 = this.f1529h;
                this.f1530i.setValue(new C5391v0("选择系统消息群聊", EnumC5358u0.f20979h, true, (String) interfaceC1809a15.getValue(), new C5177oh(interfaceC1809a15, 4), false, 224));
                break;
            case 25:
                this.f1530i.setValue(new C5229q3(null, new C2366j("shortcut_" + System.currentTimeMillis() + "_" + ((List) this.f1529h.getValue()).size(), HttpUrl.FRAGMENT_ENCODE_SET, "activity", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true)));
                break;
            case 26:
                InterfaceC1809a1 interfaceC1809a16 = this.f1529h;
                int size2 = ((List) interfaceC1809a16.getValue()).size();
                int size3 = ((List) interfaceC1809a16.getValue()).size() + 1;
                this.f1530i.setValue(new C4806d6(size2, new C0040h(System.currentTimeMillis() + "_" + size3, AbstractC0921a.m2249l(size3, "模板 "), true, 0, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, false, C4175v.f13712g, HttpUrl.FRAGMENT_ENCODE_SET), false));
                break;
            case 27:
                this.f1530i.setValue(new C5382uo(new C5391v0("选择朋友圈提醒好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5((Set) this.f1529h.getValue()), new C4661l(8), true, Opcodes.CHECKCAST)));
                break;
            case 28:
                this.f1529h.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                this.f1530i.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            default:
                this.f1530i.setValue(new C5184oo(new C5391v0("选择转发好友", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5((Set) this.f1529h.getValue()), new C5015jk(16), true, Opcodes.CHECKCAST)));
                break;
        }
        return C3967n.f12976a;
    }
}
