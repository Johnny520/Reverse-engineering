package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import java.text.BreakIterator;
import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kx2 implements in0 {
    public final /* synthetic */ int h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h63.toString():java.lang.String] */
    public /* synthetic */ kx2(h63 h63Var) {
        this.h = 8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                Resources resources = (Resources) obj;
                resources.getClass();
                break;
            case 1:
                pz2 pz2Var = (pz2) obj;
                String str = pz2Var.g.i;
                long j = pz2Var.f;
                int i2 = f13.c;
                int i3 = (int) (j & 4294967295L);
                int iOffsetByCodePoints = (i3 > 0 && i3 > 0) ? Character.offsetByCodePoints(str, i3, -1) : -1;
                if (iOffsetByCodePoints != -1) {
                    break;
                }
                break;
            case 2:
                pz2 pz2Var2 = (pz2) obj;
                String str2 = pz2Var2.g.i;
                long j2 = pz2Var2.f;
                int i4 = f13.c;
                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                characterInstance.setText(str2);
                int iFollowing = characterInstance.following((int) (j2 & 4294967295L));
                if (iFollowing != -1) {
                }
                break;
            case 3:
                pz2 pz2Var3 = (pz2) obj;
                Integer numE = pz2Var3.e();
                if (numE != null) {
                    int iIntValue = numE.intValue();
                    long j3 = pz2Var3.f;
                    int i5 = f13.c;
                }
                break;
            case 4:
                pz2 pz2Var4 = (pz2) obj;
                Integer numD = pz2Var4.d();
                if (numD != null) {
                    int iIntValue2 = numD.intValue();
                    long j4 = pz2Var4.f;
                    int i6 = f13.c;
                }
                break;
            case 5:
                pz2 pz2Var5 = (pz2) obj;
                Integer numC = pz2Var5.c();
                if (numC != null) {
                    int iIntValue3 = numC.intValue();
                    long j5 = pz2Var5.f;
                    int i7 = f13.c;
                }
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                pz2 pz2Var6 = (pz2) obj;
                Integer numB = pz2Var6.b();
                if (numB != null) {
                    int iIntValue4 = numB.intValue();
                    long j6 = pz2Var6.f;
                    int i8 = f13.c;
                }
                break;
            case 7:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                qv1 qv1Var = ((Boolean) obj2).booleanValue() ? qv1.h : qv1.i;
                Object obj3 = list.get(0);
                obj3.getClass();
                break;
            case 8:
                ((x41) obj).getClass();
                break;
            case 9:
                jg3 jg3Var = (jg3) obj;
                jg3Var.getClass();
                Object obj4 = jg3Var.a.thisObject;
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
                kd kdVar = (kd) obj;
                break;
            case 17:
                gr2 gr2Var = (gr2) obj;
                break;
            case 18:
                kd kdVar2 = (kd) obj;
                break;
            case 19:
                rs1 rs1Var = (rs1) obj;
                break;
            case AIChatConfig.MaxContextRounds /* 20 */:
                kd kdVar3 = (kd) obj;
                break;
            case 21:
                long j7 = ((z01) obj).a;
                break;
            case 22:
                kd kdVar4 = (kd) obj;
                break;
            case 23:
                long j8 = ((h11) obj).a;
                break;
            case 24:
                kd kdVar5 = (kd) obj;
                int iRound = Math.round(kdVar5.a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(kdVar5.b);
                break;
            case 25:
                o62 o62Var = (o62) obj;
                break;
            case 26:
                md mdVar = (md) obj;
                break;
            case 27:
                break;
            case 28:
                at atVar = (at) obj;
                atVar.getClass();
                atVar.c0("MicroMsg.SceneVoiceService", "//voicetrymore", "getVoiceService %s");
                break;
            default:
                cj0 cj0Var = (cj0) obj;
                cj0Var.getClass();
                cj0Var.c0(new kx2(28));
                break;
        }
        return a83Var;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [kx2.j(java.lang.Object):java.lang.Object, m0.j(java.lang.Object):java.lang.Object, nuke.ui.HomeActivity.onCreate(android.os.Bundle):void, rg3.<clinit>():void, xb3.a(org.luckypray.dexkit.DexKitBridge):void] */
    public /* synthetic */ kx2(int i) {
        this.h = i;
    }
}
