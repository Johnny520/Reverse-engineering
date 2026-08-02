package p000;

import android.app.Activity;
import android.content.res.Resources;
import java.text.BreakIterator;
import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx2 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f5842h;

    public /* synthetic */ kx2(h63 h63Var) {
        this.f5842h = 8;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f5842h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                Resources resources = (Resources) obj;
                resources.getClass();
                break;
            case 1:
                pz2 pz2Var = (pz2) obj;
                String str = pz2Var.f8655g.f10051i;
                long j = pz2Var.f8654f;
                int i2 = f13.f2738c;
                int i3 = (int) (j & 4294967295L);
                int iOffsetByCodePoints = (i3 > 0 && i3 > 0) ? Character.offsetByCodePoints(str, i3, -1) : -1;
                if (iOffsetByCodePoints != -1) {
                    break;
                }
                break;
            case 2:
                pz2 pz2Var2 = (pz2) obj;
                String str2 = pz2Var2.f8655g.f10051i;
                long j2 = pz2Var2.f8654f;
                int i4 = f13.f2738c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str2);
                int iFollowing = characterInstance.following((int) (j2 & 4294967295L));
                if (iFollowing != -1) {
                }
                break;
            case 3:
                pz2 pz2Var3 = (pz2) obj;
                Integer numM4026e = pz2Var3.m4026e();
                if (numM4026e != null) {
                    int iIntValue = numM4026e.intValue();
                    long j3 = pz2Var3.f8654f;
                    int i5 = f13.f2738c;
                }
                break;
            case 4:
                pz2 pz2Var4 = (pz2) obj;
                Integer numM4025d = pz2Var4.m4025d();
                if (numM4025d != null) {
                    int iIntValue2 = numM4025d.intValue();
                    long j4 = pz2Var4.f8654f;
                    int i6 = f13.f2738c;
                }
                break;
            case 5:
                pz2 pz2Var5 = (pz2) obj;
                Integer numM4024c = pz2Var5.m4024c();
                if (numM4024c != null) {
                    int iIntValue3 = numM4024c.intValue();
                    long j5 = pz2Var5.f8654f;
                    int i7 = f13.f2738c;
                }
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                pz2 pz2Var6 = (pz2) obj;
                Integer numM4023b = pz2Var6.m4023b();
                if (numM4023b != null) {
                    int iIntValue4 = numM4023b.intValue();
                    long j6 = pz2Var6.f8654f;
                    int i8 = f13.f2738c;
                }
                break;
            case 7:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                qv1 qv1Var = ((Boolean) obj2).booleanValue() ? qv1.f9205h : qv1.f9206i;
                Object obj3 = list.get(0);
                obj3.getClass();
                break;
            case 8:
                ((x41) obj).getClass();
                break;
            case 9:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                Object obj4 = jg3Var.f5028a.thisObject;
                obj4.getClass();
                ((Activity) obj4).getIntent().putExtra("max_select_count", 6666);
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                bb0 bb0Var = (bb0) obj;
                break;
            case 16:
                C0383kd c0383kd = (C0383kd) obj;
                break;
            case 17:
                gr2 gr2Var = (gr2) obj;
                break;
            case 18:
                C0383kd c0383kd2 = (C0383kd) obj;
                break;
            case 19:
                rs1 rs1Var = (rs1) obj;
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                C0383kd c0383kd3 = (C0383kd) obj;
                break;
            case 21:
                long j7 = ((z01) obj).f13695a;
                break;
            case 22:
                C0383kd c0383kd4 = (C0383kd) obj;
                break;
            case 23:
                long j8 = ((h11) obj).f3775a;
                break;
            case 24:
                C0383kd c0383kd5 = (C0383kd) obj;
                int iRound = Math.round(c0383kd5.f5460a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c0383kd5.f5461b);
                break;
            case 25:
                o62 o62Var = (o62) obj;
                break;
            case 26:
                C0457md c0457md = (C0457md) obj;
                break;
            case 27:
                break;
            case 28:
                C0030at c0030at = (C0030at) obj;
                c0030at.getClass();
                c0030at.m271c0("MicroMsg.SceneVoiceService", "//voicetrymore", "getVoiceService %s");
                break;
            default:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.m845c0(new kx2(28));
                break;
        }
        return a83Var;
    }

    public /* synthetic */ kx2(int i) {
        this.f5842h = i;
    }
}
