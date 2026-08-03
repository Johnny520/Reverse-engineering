package p332wb;

import bsh.org.objectweb.asm.Opcodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.HttpUrl;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p261rb.C3788d;
import p261rb.C3795k;
import p261rb.C3797m;
import p261rb.EnumC3789e;
import p276sf.C3967n;
import p322w0.C4661l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: wb.fk */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4885fk implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17209g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f17210h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4885fk(InterfaceC1809a1 interfaceC1809a1, int i9) {
        this.f17209g = i9;
        this.f17210h = interfaceC1809a1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        C3797m c3797m;
        switch (this.f17209g) {
            case 0:
                this.f17210h.setValue(null);
                break;
            case 1:
                this.f17210h.setValue(Boolean.FALSE);
                break;
            case 2:
                this.f17210h.setValue(EnumC5262r3.f20323g);
                break;
            case 3:
                this.f17210h.setValue(C5096m2.f18833c);
                break;
            case 4:
                this.f17210h.setValue(C5096m2.f18831a);
                break;
            case 5:
                this.f17210h.setValue(new C5129n2(new C5391v0("添加通知会话", EnumC5358u0.f20981j, true, HttpUrl.FRAGMENT_ENCODE_SET, new C4661l(12), true, Opcodes.CHECKCAST)));
                break;
            case 6:
                this.f17210h.setValue(C5096m2.f18833c);
                break;
            case 7:
                this.f17210h.setValue(C5096m2.f18833c);
                break;
            case 8:
                this.f17210h.setValue(C5096m2.f18833c);
                break;
            case 9:
                this.f17210h.setValue(C5096m2.f18833c);
                break;
            case 10:
                this.f17210h.setValue(C5096m2.f18832b);
                break;
            case 11:
                this.f17210h.setValue(C5096m2.f18832b);
                break;
            case 12:
                this.f17210h.setValue(C4797cu.f16465b);
                break;
            case 13:
                this.f17210h.setValue(C4797cu.f16466c);
                break;
            case 14:
                this.f17210h.setValue(C4797cu.f16465b);
                break;
            case 15:
                this.f17210h.setValue(C4797cu.f16465b);
                break;
            case 16:
                this.f17210h.setValue(C5217po.f20027a);
                break;
            case 17:
                InterfaceC1809a1 interfaceC1809a1 = this.f17210h;
                C3795k c3795k = AbstractC1184v0.f3987a;
                if (c3795k != null) {
                    c3797m = c3795k.m7985l();
                } else {
                    C4173t c4173t = C4173t.f13710g;
                    c3797m = new C3797m(false, false, "等待检测", HttpUrl.FRAGMENT_ENCODE_SET, 0, 0, c4173t, c4173t, false, 0, 0, 0, 0);
                }
                List list = c3797m.f12472g;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (((C3788d) obj).f12420c == EnumC3789e.f12423h) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C3788d) it.next()).f12418a);
                }
                interfaceC1809a1.setValue(new C5356tv(EnumC5455wv.f21839i, new C5391v0("批量删除好友", EnumC5358u0.f20978g, true, AbstractC4166m.m8392A1(AbstractC4166m.m8412U1(arrayList2), "|", null, null, null, 62), new C5015jk(21), true, Opcodes.CHECKCAST)));
                break;
            case 18:
                this.f17210h.setValue(C4173t.f13710g);
                break;
            case 19:
                this.f17210h.setValue(C5389uv.f21257a);
                break;
            case 20:
                this.f17210h.setValue(Boolean.FALSE);
                break;
            case 21:
                this.f17210h.setValue(EnumC4897g.f17315i);
                break;
            case 22:
                this.f17210h.setValue(EnumC4897g.f17314h);
                break;
            case 23:
                this.f17210h.setValue(EnumC4897g.f17315i);
                break;
            case 24:
                this.f17210h.setValue(EnumC4897g.f17313g);
                break;
            case 25:
                this.f17210h.setValue(EnumC4897g.f17314h);
                break;
            case 26:
                this.f17210h.setValue(C4891fq.f17278a);
                break;
            case 27:
                this.f17210h.setValue(null);
                break;
            case 28:
                this.f17210h.setValue(null);
                break;
            default:
                this.f17210h.setValue(Boolean.FALSE);
                break;
        }
        return C3967n.f12976a;
    }
}
