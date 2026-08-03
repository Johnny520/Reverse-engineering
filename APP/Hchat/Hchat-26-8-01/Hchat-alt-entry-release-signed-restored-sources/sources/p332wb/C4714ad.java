package p332wb;

import android.media.MediaPlayer;
import bsh.org.objectweb.asm.Opcodes;
import java.util.Set;
import okhttp3.HttpUrl;
import p051db.C0765c;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p117i0.InterfaceC1809a1;
import p189n1.C2864c;
import p189n1.InterfaceC2862a;
import p251r.C3623h;
import p259r9.AbstractC3754e0;
import p266s0.C3874d;
import p276sf.C3967n;
import p345x8.C5709b;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.ad */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4714ad implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15749g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1809a1 f15750h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f15751i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f15752j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4714ad(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, int i9) {
        this.f15749g = i9;
        this.f15750h = interfaceC1809a1;
        this.f15751i = interfaceC1809a12;
        this.f15752j = interfaceC1809a13;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f15749g) {
            case 0:
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19745d1, 3);
                C3623h.m7604a(c3623h, null, new C3874d(1209821612, new C5200p7(this.f15750h, this.f15751i, this.f15752j, 8), true), 3);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                if (((Number) this.f15750h.getValue()).intValue() == 1) {
                    this.f15751i.setValue(str);
                } else {
                    this.f15752j.setValue(str);
                }
                return C3967n.f12976a;
            case 2:
                EnumC5033k5 enumC5033k5 = (EnumC5033k5) obj;
                enumC5033k5.getClass();
                this.f15750h.setValue(enumC5033k5);
                if (enumC5033k5 == EnumC5033k5.f18308l) {
                    this.f15751i.setValue(null);
                }
                this.f15752j.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                break;
            case 3:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                this.f15752j.setValue(new C5131n4(new C5391v0(zBooleanValue ? "选择仅生效聊天" : "选择排除聊天", EnumC5358u0.f20980i, true, AbstractC4166m.m8392A1(zBooleanValue ? (Set) this.f15750h.getValue() : (Set) this.f15751i.getValue(), ",", null, null, null, 62), new C5015jk(20), true, Opcodes.CHECKCAST), zBooleanValue));
                break;
            case 4:
                C0765c c0765c = (C0765c) obj;
                c0765c.getClass();
                this.f15750h.setValue(c0765c.f2288a);
                this.f15751i.setValue(c0765c);
                this.f15752j.setValue(C5483xq.f22028b);
                break;
            case 5:
                C5709b c5709b = (C5709b) obj;
                c5709b.getClass();
                this.f15750h.setValue(c5709b.f23199a);
                this.f15751i.setValue(c5709b);
                this.f15752j.setValue("ruleEditor");
                break;
            case 6:
                int iIntValue = ((Integer) obj).intValue();
                this.f15752j.setValue(new C5283ro(iIntValue, new C5391v0(iIntValue == 1 ? "选择点赞黑名单" : "选择点赞白名单", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(iIntValue == 1 ? (Set) this.f15750h.getValue() : (Set) this.f15751i.getValue()), new C5015jk(18), true, Opcodes.CHECKCAST)));
                break;
            case 7:
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19544B, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(-954467868, new C5200p7(this.f15750h, this.f15751i, this.f15752j, 10), true), 3);
                break;
            case 8:
                int iIntValue2 = ((Integer) obj).intValue();
                this.f15752j.setValue(new C5085lo(iIntValue2, new C5391v0(iIntValue2 == 1 ? "选择评论黑名单" : "选择评论白名单", EnumC5358u0.f20978g, true, AbstractC4955ho.m9316D5(iIntValue2 == 1 ? (Set) this.f15750h.getValue() : (Set) this.f15751i.getValue()), new C5015jk(26), true, Opcodes.CHECKCAST)));
                break;
            case 9:
                this.f15750h.setValue(Float.valueOf(0.0f));
                Boolean bool = Boolean.TRUE;
                this.f15751i.setValue(bool);
                ((InterfaceC1231l) this.f15752j.getValue()).invoke(bool);
                break;
            case 10:
                InterfaceC1809a1 interfaceC1809a1 = this.f15752j;
                float fFloatValue = ((Float) obj).floatValue();
                MediaPlayer mediaPlayer = (MediaPlayer) this.f15750h.getValue();
                if (mediaPlayer != null) {
                    int iM7907q = (int) (AbstractC3754e0.m7907q(fFloatValue, 0.0f, 1.0f) * ((Number) this.f15751i.getValue()).intValue());
                    try {
                        mediaPlayer.seekTo(iM7907q);
                        interfaceC1809a1.setValue(Integer.valueOf(iM7907q));
                        break;
                    } catch (Throwable unused) {
                    }
                }
                return C3967n.f12976a;
            default:
                Integer num = (Integer) obj;
                num.getClass();
                ((C2864c) ((InterfaceC2862a) this.f15751i.getValue())).m6283a(16);
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f15750h.getValue();
                if (interfaceC1231l != null) {
                    interfaceC1231l.invoke(num);
                }
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f15752j.getValue();
                if (interfaceC1220a != null) {
                    interfaceC1220a.invoke();
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }
}
