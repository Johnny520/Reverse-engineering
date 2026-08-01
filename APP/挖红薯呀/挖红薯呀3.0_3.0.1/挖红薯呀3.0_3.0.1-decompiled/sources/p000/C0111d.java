package p000;

import android.R;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.luckypray.dexkit.C0587R;
import org.luckypray.dexkit.result.MethodData;

/* JADX INFO: renamed from: d */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class C0111d implements InterfaceC0973yr, InterfaceC0296hu, a51, InterfaceC0958yc, qm0, qx0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f918d;

    /* JADX INFO: renamed from: e */
    public Object f919e;

    /* JADX INFO: renamed from: f */
    public Object f920f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0111d(int i) {
        this.f918d = i;
        switch (i) {
            case 8:
                break;
            case 9:
            case 12:
            case j50.f2734e /* 15 */:
            case 16:
            case 17:
            case 19:
            case 20:
            default:
                this.f919e = new C0193f1(this);
                break;
            case 10:
                this.f919e = new tb1(0);
                this.f920f = new tb1(0);
                break;
            case 11:
                this.f919e = r60.m3419u(Boolean.FALSE);
                break;
            case 13:
                this.f919e = new jh0();
                this.f920f = new jh0();
                break;
            case 14:
                this.f919e = new sh0(new b60[16]);
                break;
            case 18:
                this.f919e = new LinkedHashMap();
                this.f920f = new LinkedHashMap();
                break;
            case 21:
                this.f919e = new jo0(21);
                this.f920f = new fc0(16);
                break;
            case 22:
                this.f919e = new sh0(new Reference[16]);
                this.f920f = new ReferenceQueue();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x0074 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:59:0x0083 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:61:0x003c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x003c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x007d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [oe0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [sh0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [sh0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: l */
    public static void m607l(b60 b60Var) {
        if (b60Var.f403Q > 0) {
            if (b60Var.f396J.f1595d == x50.f7268h && !b60Var.m309p() && !b60Var.m311r() && !b60Var.f404R && b60Var.m273I()) {
                oe0 oe0Var = b60Var.f395I.f3998f;
                if ((oe0Var.f4532g & 256) != 0) {
                    while (oe0Var != null) {
                        if ((oe0Var.f4531f & 256) != 0) {
                            ?? M3050f = oe0Var;
                            ?? sh0Var = 0;
                            while (M3050f != 0) {
                                if (M3050f instanceof InterfaceC0529nx) {
                                    InterfaceC0529nx interfaceC0529nx = (InterfaceC0529nx) M3050f;
                                    interfaceC0529nx.mo1257n(pf1.m3037O(interfaceC0529nx, 256));
                                } else if ((M3050f.f4531f & 256) != 0 && (M3050f instanceof AbstractC0731sm)) {
                                    oe0 oe0Var2 = ((AbstractC0731sm) M3050f).f5782s;
                                    int i = 0;
                                    M3050f = M3050f;
                                    sh0Var = sh0Var;
                                    while (oe0Var2 != null) {
                                        if ((oe0Var2.f4531f & 256) != 0) {
                                            i++;
                                            sh0Var = sh0Var;
                                            if (i == 1) {
                                                M3050f = oe0Var2;
                                            } else {
                                                if (sh0Var == 0) {
                                                    sh0Var = new sh0(new oe0[16]);
                                                }
                                                if (M3050f != 0) {
                                                    sh0Var.m4072b(M3050f);
                                                    M3050f = 0;
                                                }
                                                sh0Var.m4072b(oe0Var2);
                                            }
                                        }
                                        oe0Var2 = oe0Var2.f4534i;
                                        M3050f = M3050f;
                                        sh0Var = sh0Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                M3050f = pf1.m3050f(sh0Var);
                            }
                        }
                        if ((oe0Var.f4532g & 256) == 0) {
                            break;
                        } else {
                            oe0Var = oe0Var.f4534i;
                        }
                    }
                }
            }
            b60Var.f402P = false;
            sh0 sh0VarM319z = b60Var.m319z();
            Object[] objArr = sh0VarM319z.f5768d;
            int i2 = sh0VarM319z.f5770f;
            for (int i3 = 0; i3 < i2; i3++) {
                m607l((b60) objArr[i3]);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0973yr
    /* JADX INFO: renamed from: a */
    public Object mo608a() {
        return (pa1) this.f919e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0296hu
    /* JADX INFO: renamed from: b */
    public Object mo609b(InterfaceC0331iu interfaceC0331iu, InterfaceC0322ik interfaceC0322ik) {
        int i = this.f918d;
        na1 na1Var = na1.f4229a;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        switch (i) {
            case 4:
                Object objMo609b = ((C0760td) this.f919e).mo609b(new C0345j7(new vt0(), interfaceC0331iu, (kt0) this.f920f, 1), interfaceC0322ik);
                return objMo609b == enumC1007zk ? objMo609b : na1Var;
            default:
                Object objMo609b2 = ((InterfaceC0296hu) this.f919e).mo609b(new C0810uo(2, interfaceC0331iu, (ld0) this.f920f), interfaceC0322ik);
                return objMo609b2 == enumC1007zk ? objMo609b2 : na1Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0958yc
    public void cancel() {
        if (((C0238g9) this.f920f).compareAndSet(1, 1)) {
            return;
        }
        ((C0607p9) this.f919e).invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.a51
    /* JADX INFO: renamed from: d */
    public void mo23d(z41 z41Var) {
        ch0 ch0Var = (ch0) this.f920f;
        ch0Var.m531a();
        eh0 eh0Var = (eh0) z41Var.f7799e;
        Object[] objArr = eh0Var.f1449b;
        long[] jArr = eh0Var.f1450c;
        int i = eh0Var.f1452e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objM2635b = ((n70) this.f919e).m2635b(obj);
            int iM534d = ch0Var.m534d(objM2635b);
            int i3 = iM534d >= 0 ? ch0Var.f812c[iM534d] : 0;
            if (i3 == 7) {
                z41Var.remove(obj);
            } else {
                ch0Var.m537g(i3 + 1, objM2635b);
            }
            i = i2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qm0
    /* JADX INFO: renamed from: e */
    public List mo610e(Integer num) {
        List listMo610e = ((qm0) this.f919e).mo610e(null);
        z11 z11Var = (z11) this.f920f;
        int i = z11Var.f7772v;
        return i < 0 ? listMo610e : AbstractC0960ye.m5249S(p30.m3006p(z11Var, num, i, Integer.valueOf(z11Var.m5371E(z11Var.f7752b, i))), listMo610e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qx0
    /* JADX INFO: renamed from: f */
    public Object mo611f(Object obj) {
        return ((InterfaceC0742sw) this.f920f).invoke(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0973yr
    /* JADX INFO: renamed from: g */
    public boolean mo612g(CharSequence charSequence, int i, int i2, y91 y91Var) {
        if ((y91Var.f7588c & 4) > 0) {
            return true;
        }
        if (((pa1) this.f919e) == null) {
            this.f919e = new pa1(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0675r3) this.f920f).getClass();
        ((pa1) this.f919e).setSpan(new z91(y91Var), i, i2, 33);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.a51
    /* JADX INFO: renamed from: h */
    public boolean mo24h(Object obj, Object obj2) {
        n70 n70Var = (n70) this.f919e;
        return p30.m3002l(n70Var.m2635b(obj), n70Var.m2635b(obj2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.qx0
    /* JADX INFO: renamed from: i */
    public Object mo613i(vw0 vw0Var, Object obj) {
        return ((InterfaceC0904ww) this.f919e).invoke(vw0Var, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public boolean m614j(long j) {
        Object obj;
        List list = (List) ((C0111d) this.f920f).f919e;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (z60.m5449s(((pr0) obj).f4948a, j)) {
                break;
            }
            i++;
        }
        pr0 pr0Var = (pr0) obj;
        if (pr0Var != null) {
            return pr0Var.f4955h;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:655:0x0375 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:658:0x03c0 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:664:0x0425 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:671:0x048c */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0585  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05bf  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05ec  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05fb  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0673  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06eb  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x06f9  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x071d  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x07d4  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x085a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x088f  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0914  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0917  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x091d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x09db  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0a02  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0a05  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x0a2c  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0a36  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0c31  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0c3b  */
    /* JADX WARN: Removed duplicated region for block: B:636:0x0c4e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x083d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01bb  */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v44, types: [java.lang.Class, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r2v73, types: [hs] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v75, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r3v62, types: [android.view.accessibility.AccessibilityNodeInfo] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v73, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v74, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r40v0 */
    /* JADX WARN: Type inference failed for: r40v1 */
    /* JADX WARN: Type inference failed for: r40v2 */
    /* JADX WARN: Type inference failed for: r40v3 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v92, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v98 */
    /* JADX WARN: Type inference failed for: r7v99 */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0156e1 m615k(int i) {
        C0156e1 c0156e1;
        jh0 jh0Var;
        Object objM1701g;
        xv0 xv0Var;
        AccessibilityManager accessibilityManager;
        l31 l31Var;
        int size;
        int i2;
        int i3;
        C0200f8 c0200f8M3495x;
        ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3;
        sg0 sg0Var;
        xv0 xv0Var2;
        b60 b60Var;
        jh0 jh0Var2;
        ?? r40;
        C0156e1 c0156e12;
        sz0 sz0Var;
        xz0 xz0Var;
        ?? r0;
        ?? r1;
        e01 e01Var;
        jh0 jh0Var3;
        ?? r3;
        Object objM1701g2;
        p81 p81Var;
        Object objM1701g3;
        Boolean bool;
        xv0 xv0Var3;
        int i4;
        sz0 sz0Var2;
        Object objM1701g4;
        Object objM1701g5;
        String str;
        Object objM1701g6;
        int i5;
        Object objM1701g7;
        ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c42;
        boolean z;
        Object objM1701g8;
        C0156e1 c0156e13;
        Object objM1701g9;
        C0533o0 c0533o0;
        Object objM1701g10;
        C0533o0 c0533o02;
        String strM447l;
        ArrayList arrayList;
        CharSequence charSequenceM767e;
        ys0 ys0Var;
        Object objM1701g11;
        float f;
        hy0 hy0Var;
        hy0 hy0Var2;
        boolean z2;
        int iM4068d;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w32;
        int iM4068d2;
        String str2;
        C0156e1 c0156e14;
        Object objM1701g12;
        b60 b60Var2;
        C0533o0 c0533o03;
        List list;
        b60 b60VarM315v;
        boolean zM3002l;
        boolean zBooleanValue;
        ?? arrayList2;
        ?? arrayList3;
        int i6;
        boolean zM3002l2;
        xz0 xz0Var2;
        int i7;
        s90 lifecycle;
        ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c43 = (ViewOnAttachStateChangeListenerC0078c4) this.f920f;
        AccessibilityManager accessibilityManager2 = viewOnAttachStateChangeListenerC0078c43.f672j;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w33 = viewOnAttachStateChangeListenerC0078c43.f669g;
        C0378k3 viewTreeOwners = viewTreeObserverOnGlobalLayoutListenerC0875w33.getViewTreeOwners();
        if (((viewTreeOwners == null || (lifecycle = viewTreeOwners.f2997a.getLifecycle()) == null) ? null : ((z90) lifecycle).f7841c) == r90.f5332d) {
            c0156e14 = !accessibilityManager2.isEnabled() ? new C0156e1(AccessibilityNodeInfo.obtain()) : null;
            viewOnAttachStateChangeListenerC0078c42 = viewOnAttachStateChangeListenerC0078c43;
            i5 = i;
        } else {
            zz0 zz0Var = (zz0) viewOnAttachStateChangeListenerC0078c43.m467k().m4248b(i);
            if (zz0Var == null) {
                if (!accessibilityManager2.isEnabled()) {
                    c0156e14 = new C0156e1(AccessibilityNodeInfo.obtain());
                }
                viewOnAttachStateChangeListenerC0078c42 = viewOnAttachStateChangeListenerC0078c43;
                i5 = i;
            } else {
                xz0 xz0Var3 = zz0Var.f8062a;
                sz0 sz0VarM5188k = xz0Var3.m5188k();
                b60 b60Var3 = xz0Var3.f7470c;
                Object objM1701g13 = sz0VarM5188k.f5877d.m1701g(b01.f335n);
                if (objM1701g13 == null) {
                    objM1701g13 = null;
                }
                boolean zM3002l3 = p30.m3002l(objM1701g13, Boolean.TRUE);
                if (!zM3002l3) {
                    ?? Obtain = AccessibilityNodeInfo.obtain();
                    C0156e1 c0156e15 = new C0156e1(Obtain);
                    int i8 = Build.VERSION.SDK_INT;
                    if (i8 >= 34) {
                        AbstractC0709s0.m3997g(Obtain, zM3002l3);
                    } else {
                        Bundle extras = Obtain.getExtras();
                        if (extras != null) {
                            c0156e1 = null;
                            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-65)) | (zM3002l3 ? 64 : 0));
                        }
                        if (i != -1) {
                            Object parentForAccessibility = viewTreeObserverOnGlobalLayoutListenerC0875w33.getParentForAccessibility();
                            ?? r7 = parentForAccessibility instanceof View ? (View) parentForAccessibility : c0156e1;
                            c0156e15.f1257b = -1;
                            Obtain.setParent(r7);
                        } else {
                            xz0 xz0VarM5189l = xz0Var3.m5189l();
                            ?? ValueOf = xz0VarM5189l != null ? Integer.valueOf(xz0VarM5189l.f7474g) : c0156e1;
                            if (ValueOf == 0) {
                                w10.m4825c("semanticsNode " + i + " has null parent");
                                throw new C0725sg();
                            }
                            int iIntValue = ValueOf.intValue();
                            if (iIntValue == viewTreeObserverOnGlobalLayoutListenerC0875w33.getSemanticsOwner().m2a().f7474g) {
                                iIntValue = -1;
                            }
                            c0156e15.f1257b = iIntValue;
                            Obtain.setParent(viewTreeObserverOnGlobalLayoutListenerC0875w33, iIntValue);
                        }
                        c0156e15.f1258c = i;
                        Obtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0875w33, i);
                        Obtain.setBoundsInScreen(viewOnAttachStateChangeListenerC0078c43.m459c(zz0Var));
                        sg0 sg0Var2 = viewOnAttachStateChangeListenerC0078c43.f665N;
                        l31 l31Var2 = viewOnAttachStateChangeListenerC0078c43.f685w;
                        Resources resources = viewTreeObserverOnGlobalLayoutListenerC0875w33.getContext().getResources();
                        c0156e15.m768f("android.view.View");
                        sz0 sz0Var3 = xz0Var3.f7471d;
                        jh0Var = sz0Var3.f5877d;
                        if (jh0Var.m1697c(b01.f312E)) {
                            c0156e15.m768f("android.widget.EditText");
                        }
                        if (jh0Var.m1697c(b01.f308A)) {
                            c0156e15.m768f("android.widget.TextView");
                        }
                        objM1701g = jh0Var.m1701g(b01.f345x);
                        if (objM1701g == null) {
                            objM1701g = c0156e1;
                        }
                        xv0Var = (xv0) objM1701g;
                        if (xv0Var == null) {
                            int i9 = xv0Var.f7427a;
                            accessibilityManager = accessibilityManager2;
                            if (xz0Var3.f7472e) {
                                i7 = 4;
                                l31Var = l31Var2;
                            } else {
                                i7 = 4;
                                l31Var = l31Var2;
                                if (xz0.m5178j(4, xz0Var3).isEmpty()) {
                                }
                            }
                            if (i9 == i7) {
                                Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(C0587R.string.tab));
                            } else if (i9 == 2) {
                                Obtain.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", resources.getString(C0587R.string.switch_role));
                            } else {
                                String strM4260D = u50.m4260D(i9);
                                if (i9 != 5 || xz0Var3.m5191n() || sz0Var3.f5879f) {
                                    c0156e15.m768f(strM4260D);
                                }
                            }
                        } else {
                            accessibilityManager = accessibilityManager2;
                            l31Var = l31Var2;
                        }
                        Obtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0875w33.getContext().getPackageName());
                        Obtain.setImportantForAccessibility(AbstractC0307i4.m1546v(xz0Var3));
                        boolean zM3995e = i8 < 34 ? AbstractC0709s0.m3995e(accessibilityManager) : true;
                        List listM5178j = xz0.m5178j(4, xz0Var3);
                        size = listM5178j.size();
                        boolean z3 = zM3995e;
                        int i10 = 0;
                        i2 = 0;
                        while (i2 < size) {
                            int i11 = size;
                            xz0 xz0Var4 = (xz0) listM5178j.get(i2);
                            List list2 = listM5178j;
                            u20 u20VarM467k = viewOnAttachStateChangeListenerC0078c43.m467k();
                            int i12 = i2;
                            int i13 = xz0Var4.f7474g;
                            if (u20VarM467k.m4247a(i13)) {
                                if (viewTreeObserverOnGlobalLayoutListenerC0875w33.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(xz0Var4.f7470c) != null) {
                                    C0921xc.m5123d();
                                    return c0156e1;
                                }
                                if (i13 != -1) {
                                    zz0 zz0Var2 = (zz0) viewOnAttachStateChangeListenerC0078c43.m467k().m4248b(i13);
                                    if (zz0Var2 == null || (xz0Var2 = zz0Var2.f8062a) == null) {
                                        zM3002l2 = false;
                                    } else {
                                        Object objM1701g14 = xz0Var2.m5188k().f5877d.m1701g(b01.f335n);
                                        if (objM1701g14 == null) {
                                            objM1701g14 = c0156e1;
                                        }
                                        zM3002l2 = p30.m3002l(objM1701g14, Boolean.TRUE);
                                    }
                                    if (z3 || !zM3002l2) {
                                        Obtain.addChild(viewTreeObserverOnGlobalLayoutListenerC0875w33, i13);
                                    }
                                    sg0Var2.m4070f(i13, i10);
                                    i10++;
                                }
                            }
                            i2 = i12 + 1;
                            listM5178j = list2;
                            size = i11;
                        }
                        i3 = viewOnAttachStateChangeListenerC0078c43.f677o;
                        AccessibilityNodeInfo accessibilityNodeInfo = c0156e15.f1256a;
                        if (i != i3) {
                            accessibilityNodeInfo.setAccessibilityFocused(true);
                            c0156e15.m764a(C0002a1.f7d);
                        } else {
                            accessibilityNodeInfo.setAccessibilityFocused(false);
                            c0156e15.m764a(C0002a1.f6c);
                        }
                        c0200f8M3495x = rd0.m3495x(xz0Var3);
                        if (c0200f8M3495x == null) {
                            viewTreeObserverOnGlobalLayoutListenerC0875w33.getFontFamilyResolver();
                            InterfaceC0968ym density = viewTreeObserverOnGlobalLayoutListenerC0875w33.getDensity();
                            C0541o8 c0541o8 = viewOnAttachStateChangeListenerC0078c43.f661J;
                            viewTreeObserverOnGlobalLayoutListenerC0875w3 = viewTreeObserverOnGlobalLayoutListenerC0875w33;
                            String str3 = c0200f8M3495x.f1625e;
                            b60Var = b60Var3;
                            List list3 = c0200f8M3495x.f1624d;
                            SpannableString spannableString = new SpannableString(str3);
                            ArrayList arrayList4 = c0200f8M3495x.f1626f;
                            if (arrayList4 != null) {
                                int size2 = arrayList4.size();
                                c0156e12 = c0156e15;
                                int i14 = 0;
                                Obtain = Obtain;
                                while (i14 < size2) {
                                    ArrayList arrayList5 = arrayList4;
                                    C0163e8 c0163e8 = (C0163e8) arrayList4.get(i14);
                                    int i15 = size2;
                                    j31 j31Var = (j31) c0163e8.f1338a;
                                    int i16 = i14;
                                    int i17 = c0163e8.f1339b;
                                    int i18 = c0163e8.f1340c;
                                    ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c44 = viewOnAttachStateChangeListenerC0078c43;
                                    long jMo2626a = j31Var.f2670a.mo2626a();
                                    sg0 sg0Var3 = sg0Var2;
                                    xv0 xv0Var4 = xv0Var;
                                    long j = j31Var.f2671b;
                                    C1018zv c1018zv = j31Var.f2672c;
                                    C0940xv c0940xv = j31Var.f2673d;
                                    y61 y61Var = j31Var.f2679j;
                                    sz0 sz0Var4 = sz0Var3;
                                    fb0 fb0Var = j31Var.f2680k;
                                    jh0 jh0Var4 = jh0Var;
                                    ?? r402 = Obtain;
                                    long j2 = j31Var.f2681l;
                                    u61 u61Var = j31Var.f2682m;
                                    x61 c0724sf = j31Var.f2670a;
                                    xz0 xz0Var5 = xz0Var3;
                                    AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
                                    if (!C0207ff.m1094c(jMo2626a, c0724sf.mo2626a())) {
                                        c0724sf = jMo2626a != 16 ? new C0724sf(jMo2626a) : C0496n2.f4142V;
                                    }
                                    v50.m4411q(spannableString, c0724sf.mo2626a(), i17, i18);
                                    SpannableString spannableString2 = spannableString;
                                    v50.m4412r(spannableString2, j, density, i17, i18);
                                    if (c1018zv == null && c0940xv == null) {
                                        i6 = 33;
                                    } else {
                                        C1018zv c1018zv2 = c1018zv == null ? C1018zv.f8005f : c1018zv;
                                        int i19 = c0940xv != null ? c0940xv.f7426a : 0;
                                        boolean z4 = p30.m3008r(c1018zv2.f8009d, C1018zv.f8004e.f8009d) >= 0;
                                        boolean z5 = i19 == 1;
                                        StyleSpan styleSpan = new StyleSpan((z5 && z4) ? 3 : z4 ? 1 : z5 ? 2 : 0);
                                        i6 = 33;
                                        spannableString2.setSpan(styleSpan, i17, i18, 33);
                                    }
                                    if (u61Var != null) {
                                        int i20 = u61Var.f6145a;
                                        if ((i20 | 1) == i20) {
                                            spannableString2.setSpan(new UnderlineSpan(), i17, i18, i6);
                                        }
                                        if ((i20 | 2) == i20) {
                                            spannableString2.setSpan(new StrikethroughSpan(), i17, i18, i6);
                                        }
                                    }
                                    if (y61Var != null) {
                                        spannableString2.setSpan(new ScaleXSpan(y61Var.f7555a), i17, i18, i6);
                                    }
                                    v50.m4413s(spannableString2, fb0Var, i17, i18);
                                    if (j2 != 16) {
                                        spannableString2.setSpan(new BackgroundColorSpan(p30.m2987W(j2)), i17, i18, i6);
                                    }
                                    i14 = i16 + 1;
                                    spannableString = spannableString2;
                                    xz0Var3 = xz0Var5;
                                    arrayList4 = arrayList5;
                                    size2 = i15;
                                    viewOnAttachStateChangeListenerC0078c43 = viewOnAttachStateChangeListenerC0078c44;
                                    sg0Var2 = sg0Var3;
                                    xv0Var = xv0Var4;
                                    sz0Var3 = sz0Var4;
                                    Obtain = r402;
                                    jh0Var = jh0Var4;
                                    accessibilityNodeInfo = accessibilityNodeInfo2;
                                }
                            } else {
                                c0156e12 = c0156e15;
                            }
                            viewOnAttachStateChangeListenerC0078c4 = viewOnAttachStateChangeListenerC0078c43;
                            sg0Var = sg0Var2;
                            xv0Var2 = xv0Var;
                            AccessibilityNodeInfo accessibilityNodeInfo3 = accessibilityNodeInfo;
                            SpannableString spannableString3 = spannableString;
                            jh0Var2 = jh0Var;
                            r40 = Obtain;
                            sz0Var = sz0Var3;
                            xz0Var = xz0Var3;
                            int length = str3.length();
                            ?? arrayList6 = C0294hs.f2354d;
                            if (list3 != null) {
                                arrayList2 = new ArrayList(list3.size());
                                int size3 = list3.size();
                                for (int i21 = 0; i21 < size3; i21++) {
                                    Object obj = list3.get(i21);
                                    C0163e8 c0163e82 = (C0163e8) obj;
                                    if ((c0163e82.f1338a instanceof ub1) && AbstractC0237g8.m1232a(0, length, c0163e82.f1339b, c0163e82.f1340c)) {
                                        arrayList2.add(obj);
                                    }
                                }
                            } else {
                                arrayList2 = arrayList6;
                            }
                            int size4 = arrayList2.size();
                            for (int i22 = 0; i22 < size4; i22++) {
                                C0163e8 c0163e83 = (C0163e8) arrayList2.get(i22);
                                ub1 ub1Var = (ub1) c0163e83.f1338a;
                                int i23 = c0163e83.f1339b;
                                int i24 = c0163e83.f1340c;
                                if (!(ub1Var instanceof ub1)) {
                                    C0921xc.m5129j();
                                    return c0156e1;
                                }
                                spannableString3.setSpan(new TtsSpan.VerbatimBuilder(ub1Var.f6189a).build(), i23, i24, 33);
                            }
                            int length2 = str3.length();
                            if (list3 != null) {
                                arrayList3 = new ArrayList(list3.size());
                                int size5 = list3.size();
                                for (int i25 = 0; i25 < size5; i25++) {
                                    Object obj2 = list3.get(i25);
                                    C0163e8 c0163e84 = (C0163e8) obj2;
                                    if ((c0163e84.f1338a instanceof wa1) && AbstractC0237g8.m1232a(0, length2, c0163e84.f1339b, c0163e84.f1340c)) {
                                        arrayList3.add(obj2);
                                    }
                                }
                            } else {
                                arrayList3 = arrayList6;
                            }
                            int size6 = arrayList3.size();
                            for (int i26 = 0; i26 < size6; i26++) {
                                C0163e8 c0163e85 = (C0163e8) arrayList3.get(i26);
                                wa1 wa1Var = (wa1) c0163e85.f1338a;
                                int i27 = c0163e85.f1339b;
                                int i28 = c0163e85.f1340c;
                                WeakHashMap weakHashMap = (WeakHashMap) c0541o8.f4480a;
                                Object uRLSpan = weakHashMap.get(wa1Var);
                                if (uRLSpan == null) {
                                    uRLSpan = new URLSpan(wa1Var.f7056a);
                                    weakHashMap.put(wa1Var, uRLSpan);
                                }
                                spannableString3.setSpan((URLSpan) uRLSpan, i27, i28, 33);
                            }
                            int length3 = str3.length();
                            if (list3 != null) {
                                arrayList6 = new ArrayList(list3.size());
                                int size7 = list3.size();
                                for (int i29 = 0; i29 < size7; i29++) {
                                    Object obj3 = list3.get(i29);
                                    C0163e8 c0163e86 = (C0163e8) obj3;
                                    if ((c0163e86.f1338a instanceof ta0) && AbstractC0237g8.m1232a(0, length3, c0163e86.f1339b, c0163e86.f1340c)) {
                                        arrayList6.add(obj3);
                                    }
                                }
                            }
                            int size8 = arrayList6.size();
                            for (int i30 = 0; i30 < size8; i30++) {
                                C0163e8 c0163e87 = (C0163e8) arrayList6.get(i30);
                                int i31 = c0163e87.f1339b;
                                Object obj4 = c0163e87.f1338a;
                                int i32 = c0163e87.f1340c;
                                if (i31 != i32) {
                                    ta0 ta0Var = (ta0) obj4;
                                    if (ta0Var instanceof sa0) {
                                        obj4.getClass();
                                        sa0 sa0Var = (sa0) obj4;
                                        C0163e8 c0163e88 = new C0163e8(i31, i32, sa0Var);
                                        WeakHashMap weakHashMap2 = (WeakHashMap) c0541o8.f4481b;
                                        Object uRLSpan2 = weakHashMap2.get(c0163e88);
                                        if (uRLSpan2 == null) {
                                            uRLSpan2 = new URLSpan(sa0Var.f5730a);
                                            weakHashMap2.put(c0163e88, uRLSpan2);
                                        }
                                        spannableString3.setSpan((URLSpan) uRLSpan2, i31, i32, 33);
                                    } else {
                                        WeakHashMap weakHashMap3 = (WeakHashMap) c0541o8.f4482c;
                                        Object c0764th = weakHashMap3.get(c0163e87);
                                        if (c0764th == null) {
                                            c0764th = new C0764th(ta0Var);
                                            weakHashMap3.put(c0163e87, c0764th);
                                        }
                                        spannableString3.setSpan((ClickableSpan) c0764th, i31, i32, 33);
                                    }
                                }
                            }
                            r1 = accessibilityNodeInfo3;
                            r0 = (SpannableString) ViewOnAttachStateChangeListenerC0078c4.m446H(spannableString3);
                        } else {
                            viewOnAttachStateChangeListenerC0078c4 = viewOnAttachStateChangeListenerC0078c43;
                            viewTreeObserverOnGlobalLayoutListenerC0875w3 = viewTreeObserverOnGlobalLayoutListenerC0875w33;
                            sg0Var = sg0Var2;
                            xv0Var2 = xv0Var;
                            b60Var = b60Var3;
                            jh0Var2 = jh0Var;
                            r40 = Obtain;
                            c0156e12 = c0156e15;
                            sz0Var = sz0Var3;
                            xz0Var = xz0Var3;
                            r0 = c0156e1;
                            r1 = accessibilityNodeInfo;
                        }
                        r1.setText(r0);
                        e01Var = b01.f317J;
                        jh0Var3 = jh0Var2;
                        if (jh0Var3.m1697c(e01Var)) {
                            r3 = r40;
                        } else {
                            ?? r32 = r40;
                            r32.setContentInvalid(true);
                            Object objM1701g15 = jh0Var3.m1701g(e01Var);
                            if (objM1701g15 == null) {
                                objM1701g15 = c0156e1;
                            }
                            r32.setError((CharSequence) objM1701g15);
                            r3 = r32;
                        }
                        r1.setStateDescription(rd0.m3494w(xz0Var, resources));
                        r3.setCheckable(rd0.m3493v(xz0Var));
                        objM1701g2 = jh0Var3.m1701g(b01.f315H);
                        if (objM1701g2 == null) {
                            objM1701g2 = c0156e1;
                        }
                        p81Var = (p81) objM1701g2;
                        if (p81Var != null) {
                            if (p81Var == p81.f4779d) {
                                r1.setChecked(true);
                            } else if (p81Var == p81.f4780e) {
                                r1.setChecked(false);
                            }
                        }
                        objM1701g3 = jh0Var3.m1701g(b01.f314G);
                        if (objM1701g3 == null) {
                            objM1701g3 = c0156e1;
                        }
                        bool = (Boolean) objM1701g3;
                        if (bool == null) {
                            boolean zBooleanValue2 = bool.booleanValue();
                            if (xv0Var2 == null) {
                                xv0Var3 = xv0Var2;
                                i4 = 4;
                            } else {
                                xv0Var3 = xv0Var2;
                                i4 = 4;
                                if (xv0Var3.f7427a == 4) {
                                    r3.setSelected(zBooleanValue2);
                                }
                            }
                            r1.setChecked(zBooleanValue2);
                        } else {
                            xv0Var3 = xv0Var2;
                            i4 = 4;
                        }
                        sz0Var2 = sz0Var;
                        if (sz0Var2.f5879f || xz0.m5178j(i4, xz0Var).isEmpty()) {
                            objM1701g4 = jh0Var3.m1701g(b01.f322a);
                            if (objM1701g4 == null) {
                                objM1701g4 = c0156e1;
                            }
                            List list4 = (List) objM1701g4;
                            r3.setContentDescription(list4 == null ? (String) AbstractC0960ye.m5241K(list4) : c0156e1);
                        }
                        objM1701g5 = jh0Var3.m1701g(b01.f346y);
                        if (objM1701g5 == null) {
                            objM1701g5 = c0156e1;
                        }
                        str = (String) objM1701g5;
                        if (str != null) {
                            xz0 xz0VarM5189l2 = xz0Var;
                            while (true) {
                                if (xz0VarM5189l2 == null) {
                                    zBooleanValue = false;
                                    break;
                                }
                                sz0 sz0Var5 = xz0VarM5189l2.f7471d;
                                e01 e01Var2 = c01.f624a;
                                if (sz0Var5.f5877d.m1697c(e01Var2)) {
                                    zBooleanValue = ((Boolean) sz0Var5.m4137c(e01Var2)).booleanValue();
                                    break;
                                }
                                xz0VarM5189l2 = xz0VarM5189l2.m5189l();
                            }
                            if (zBooleanValue) {
                                r3.setViewIdResourceName(str);
                            }
                        }
                        objM1701g6 = jh0Var3.m1701g(b01.f329h);
                        if (objM1701g6 == null) {
                            objM1701g6 = c0156e1;
                        }
                        if (((na1) objM1701g6) != null) {
                            r1.setHeading(true);
                        }
                        i5 = i;
                        if (i5 != -1) {
                            int iM4068d3 = sg0Var.m4068d(xz0Var.f7474g);
                            if (iM4068d3 != -1) {
                                r3.setDrawingOrder(iM4068d3);
                            } else {
                                Log.w("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
                            }
                        }
                        r3.setPassword(jh0Var3.m1697c(b01.f316I));
                        r3.setEditable(jh0Var3.m1697c(b01.f319L));
                        objM1701g7 = jh0Var3.m1701g(b01.f320M);
                        if (objM1701g7 == null) {
                            objM1701g7 = c0156e1;
                        }
                        Integer num = (Integer) objM1701g7;
                        r3.setMaxTextLength(num == null ? num.intValue() : -1);
                        r3.setEnabled(rd0.m3478g(xz0Var));
                        e01 e01Var3 = b01.f332k;
                        r3.setFocusable(jh0Var3.m1697c(e01Var3));
                        if (r3.isFocusable()) {
                            viewOnAttachStateChangeListenerC0078c42 = viewOnAttachStateChangeListenerC0078c4;
                        } else {
                            r3.setFocused(((Boolean) sz0Var2.m4137c(e01Var3)).booleanValue());
                            if (r3.isFocused()) {
                                r1.addAction(2);
                                viewOnAttachStateChangeListenerC0078c42 = viewOnAttachStateChangeListenerC0078c4;
                                viewOnAttachStateChangeListenerC0078c42.f678p = i5;
                            } else {
                                viewOnAttachStateChangeListenerC0078c42 = viewOnAttachStateChangeListenerC0078c4;
                                z = true;
                                r1.addAction(1);
                                r3.setVisibleToUser(AbstractC0307i4.m1545u(xz0Var) ^ z);
                                objM1701g8 = jh0Var3.m1701g(b01.f331j);
                                if (objM1701g8 == null) {
                                    objM1701g8 = c0156e1;
                                }
                                if (objM1701g8 != null) {
                                    C0921xc.m5123d();
                                    return null;
                                }
                                r1.setClickable(false);
                                Object objM1701g16 = jh0Var3.m1701g(rz0.f5589b);
                                if (objM1701g16 == null) {
                                    objM1701g16 = c0156e1;
                                }
                                C0533o0 c0533o04 = (C0533o0) objM1701g16;
                                if (c0533o04 == null) {
                                    c0156e13 = c0156e12;
                                    r1.setLongClickable(false);
                                    objM1701g9 = jh0Var3.m1701g(rz0.f5590c);
                                    if (objM1701g9 == null) {
                                        objM1701g9 = null;
                                    }
                                    c0533o0 = (C0533o0) objM1701g9;
                                    if (c0533o0 != null) {
                                        r1.setLongClickable(true);
                                        if (rd0.m3478g(xz0Var)) {
                                            c0156e13.m764a(new C0002a1(null, 32, c0533o0.f4377a, null));
                                        }
                                    }
                                    objM1701g10 = jh0Var3.m1701g(rz0.f5603p);
                                    if (objM1701g10 == null) {
                                        objM1701g10 = null;
                                    }
                                    c0533o02 = (C0533o0) objM1701g10;
                                    if (c0533o02 != null) {
                                        c0156e13.m764a(new C0002a1(null, 16384, c0533o02.f4377a, null));
                                    }
                                    if (rd0.m3478g(xz0Var)) {
                                        Object objM1701g17 = jh0Var3.m1701g(rz0.f5598k);
                                        if (objM1701g17 == null) {
                                            objM1701g17 = null;
                                        }
                                        C0533o0 c0533o05 = (C0533o0) objM1701g17;
                                        if (c0533o05 != null) {
                                            c0156e13.m764a(new C0002a1(null, 2097152, c0533o05.f4377a, null));
                                        }
                                        C0533o0 c0533o06 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5602o);
                                        if (c0533o06 != null) {
                                            c0156e13.m764a(new C0002a1(c0533o06.f4377a, R.id.accessibilityActionImeEnter));
                                        }
                                        C0533o0 c0533o07 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5604q);
                                        if (c0533o07 != null) {
                                            c0156e13.m764a(new C0002a1(c0533o07.f4377a, 65536));
                                        }
                                        C0533o0 c0533o08 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5605r);
                                        if (c0533o08 != null && r3.isFocused()) {
                                            ClipDescription primaryClipDescription = viewTreeObserverOnGlobalLayoutListenerC0875w3.m5744getClipboardManager().f1281a.getPrimaryClipDescription();
                                            if (primaryClipDescription != null ? primaryClipDescription.hasMimeType("text/*") : false) {
                                                c0156e13.m764a(new C0002a1(c0533o08.f4377a, 32768));
                                            }
                                        }
                                    }
                                    strM447l = ViewOnAttachStateChangeListenerC0078c4.m447l(xz0Var);
                                    if (strM447l != null && strM447l.length() != 0) {
                                        r3.setTextSelection(viewOnAttachStateChangeListenerC0078c42.m466j(xz0Var), viewOnAttachStateChangeListenerC0078c42.m465i(xz0Var));
                                        C0533o0 c0533o09 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5597j);
                                        c0156e13.m764a(new C0002a1(c0533o09 == null ? c0533o09.f4377a : null, MethodData.ACC_DECLARED_SYNCHRONIZED));
                                        r1.addAction(256);
                                        r1.addAction(512);
                                        r1.setMovementGranularities(11);
                                        list = (List) w60.m4915v(sz0Var2, b01.f322a);
                                        if ((list != null || list.isEmpty()) && jh0Var3.m1697c(rz0.f5588a) && (!jh0Var3.m1697c(b01.f312E) || p30.m3002l(w60.m4915v(sz0Var2, e01Var3), Boolean.TRUE))) {
                                            b60VarM315v = b60Var.m315v();
                                            while (true) {
                                                if (b60VarM315v == null) {
                                                    b60VarM315v = null;
                                                    break;
                                                }
                                                sz0 sz0VarM317x = b60VarM315v.m317x();
                                                if (sz0VarM317x != null && sz0VarM317x.f5879f) {
                                                    if (sz0VarM317x.f5877d.m1697c(b01.f312E)) {
                                                        break;
                                                    }
                                                }
                                                b60VarM315v = b60VarM315v.m315v();
                                            }
                                            if (b60VarM315v == null) {
                                                r1.setMovementGranularities(r3.getMovementGranularities() | 20);
                                            } else {
                                                sz0 sz0VarM317x2 = b60VarM315v.m317x();
                                                if (sz0VarM317x2 != null) {
                                                    Object objM1701g18 = sz0VarM317x2.f5877d.m1701g(e01Var3);
                                                    if (objM1701g18 == null) {
                                                        objM1701g18 = null;
                                                    }
                                                    zM3002l = p30.m3002l(objM1701g18, Boolean.TRUE);
                                                } else {
                                                    zM3002l = false;
                                                }
                                                if (zM3002l) {
                                                }
                                            }
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    arrayList.add("androidx.compose.ui.semantics.id");
                                    charSequenceM767e = c0156e13.m767e();
                                    if (charSequenceM767e != null && charSequenceM767e.length() != 0 && jh0Var3.m1697c(rz0.f5588a)) {
                                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
                                    if (jh0Var3.m1697c(b01.f346y)) {
                                        arrayList.add("androidx.compose.ui.semantics.testTag");
                                    }
                                    if (jh0Var3.m1697c(b01.f321N)) {
                                        arrayList.add("androidx.compose.ui.semantics.shapeType");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRect");
                                        arrayList.add("androidx.compose.ui.semantics.shapeCorners");
                                        arrayList.add("androidx.compose.ui.semantics.shapeRegion");
                                    }
                                    r3.setAvailableExtraData(arrayList);
                                    ys0Var = (ys0) w60.m4915v(sz0Var2, b01.f324c);
                                    float f2 = 0.0f;
                                    if (ys0Var != null) {
                                        e01 e01Var4 = rz0.f5596i;
                                        if (jh0Var3.m1697c(e01Var4)) {
                                            c0156e13.m768f("android.widget.SeekBar");
                                        } else {
                                            c0156e13.m768f("android.widget.ProgressBar");
                                        }
                                        if (ys0Var != ys0.f7689b) {
                                            r3.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, 0.0f, 0.0f, 0.0f));
                                        }
                                        if (jh0Var3.m1697c(e01Var4)) {
                                            rd0.m3478g(xz0Var);
                                        }
                                    }
                                    if (rd0.m3478g(xz0Var) && (c0533o03 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5596i)) != null) {
                                        c0156e13.m764a(new C0002a1(c0533o03.f4377a, R.id.accessibilityActionSetProgress));
                                    }
                                    AbstractC0398kl.m1940z(c0156e13, xz0Var);
                                    objM1701g11 = xz0Var.m5188k().f5877d.m1701g(b01.f328g);
                                    if (objM1701g11 == null) {
                                        objM1701g11 = null;
                                    }
                                    if (objM1701g11 != null) {
                                        xz0 xz0VarM5189l3 = xz0Var.m5189l();
                                        if (xz0VarM5189l3 == null) {
                                            f = 0.0f;
                                        } else {
                                            Object objM1701g19 = xz0VarM5189l3.m5188k().f5877d.m1701g(b01.f326e);
                                            if (objM1701g19 == null) {
                                                objM1701g19 = null;
                                            }
                                            if (objM1701g19 != null) {
                                                Object objM1701g20 = xz0VarM5189l3.m5188k().f5877d.m1701g(b01.f327f);
                                                if (objM1701g20 == null) {
                                                    objM1701g20 = null;
                                                }
                                                C0923xe c0923xe = (C0923xe) objM1701g20;
                                                if (c0923xe == null || (c0923xe.f7334a >= 0 && c0923xe.f7335b >= 0)) {
                                                    if (xz0Var.m5188k().f5877d.m1697c(b01.f314G)) {
                                                        ArrayList arrayList7 = new ArrayList();
                                                        List listM5178j2 = xz0.m5178j(4, xz0VarM5189l3);
                                                        int size9 = listM5178j2.size();
                                                        int i33 = 0;
                                                        int i34 = 0;
                                                        while (i33 < size9) {
                                                            xz0 xz0Var6 = (xz0) listM5178j2.get(i33);
                                                            float f3 = f2;
                                                            if (xz0Var6.m5188k().f5877d.m1697c(b01.f314G)) {
                                                                arrayList7.add(xz0Var6);
                                                                if (xz0Var6.f7470c.m316w() < xz0Var.f7470c.m316w()) {
                                                                    i34++;
                                                                }
                                                            }
                                                            i33++;
                                                            f2 = f3;
                                                        }
                                                        f = f2;
                                                        if (!arrayList7.isEmpty()) {
                                                            boolean zM1923i = AbstractC0398kl.m1923i(arrayList7);
                                                            int i35 = zM1923i ? 0 : i34;
                                                            int i36 = zM1923i ? i34 : 0;
                                                            Object objM1701g21 = xz0Var.m5188k().f5877d.m1701g(b01.f314G);
                                                            if (objM1701g21 == null) {
                                                                objM1701g21 = Boolean.FALSE;
                                                            }
                                                            r1.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i35, 1, i36, 1, false, ((Boolean) objM1701g21).booleanValue()));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        f = 0.0f;
                                        C0921xc.m5123d();
                                    }
                                    hy0Var = (hy0) w60.m4915v(sz0Var2, b01.f342u);
                                    C0533o0 c0533o010 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5591d);
                                    if (hy0Var != null && c0533o010 != null) {
                                        objM1701g12 = xz0Var.m5188k().f5877d.m1701g(b01.f327f);
                                        if (objM1701g12 == null) {
                                            objM1701g12 = null;
                                        }
                                        if (objM1701g12 == null) {
                                            Object objM1701g22 = xz0Var.m5188k().f5877d.m1701g(b01.f326e);
                                            if (objM1701g22 == null) {
                                                objM1701g22 = null;
                                            }
                                            if (objM1701g22 == null) {
                                                c0156e13.m768f("android.widget.HorizontalScrollView");
                                            }
                                        }
                                        if (((Number) hy0Var.f2377b.invoke()).floatValue() > f) {
                                            r1.setScrollable(true);
                                        }
                                        if (rd0.m3478g(xz0Var)) {
                                            boolean zM450r = ViewOnAttachStateChangeListenerC0078c4.m450r(hy0Var);
                                            k50 k50Var = k50.f3016e;
                                            if (zM450r) {
                                                c0156e13.m764a(C0002a1.f8e);
                                                b60Var2 = b60Var;
                                                c0156e13.m764a(b60Var2.f389C == k50Var ? C0002a1.f11h : C0002a1.f13j);
                                            } else {
                                                b60Var2 = b60Var;
                                            }
                                            if (ViewOnAttachStateChangeListenerC0078c4.m449q(hy0Var)) {
                                                c0156e13.m764a(C0002a1.f9f);
                                                c0156e13.m764a(b60Var2.f389C == k50Var ? C0002a1.f13j : C0002a1.f11h);
                                            }
                                        }
                                    }
                                    hy0Var2 = (hy0) w60.m4915v(sz0Var2, b01.f343v);
                                    if (hy0Var2 != null || c0533o010 == null) {
                                        z2 = true;
                                    } else {
                                        Object objM1701g23 = xz0Var.m5188k().f5877d.m1701g(b01.f327f);
                                        if (objM1701g23 == null) {
                                            objM1701g23 = null;
                                        }
                                        if (objM1701g23 == null) {
                                            Object objM1701g24 = xz0Var.m5188k().f5877d.m1701g(b01.f326e);
                                            if (objM1701g24 == null) {
                                                objM1701g24 = null;
                                            }
                                            if (objM1701g24 == null) {
                                                c0156e13.m768f("android.widget.ScrollView");
                                            }
                                        }
                                        z2 = true;
                                        if (((Number) hy0Var2.f2377b.invoke()).floatValue() > f) {
                                            r1.setScrollable(true);
                                        }
                                        if (rd0.m3478g(xz0Var)) {
                                            if (ViewOnAttachStateChangeListenerC0078c4.m450r(hy0Var2)) {
                                                c0156e13.m764a(C0002a1.f8e);
                                                c0156e13.m764a(C0002a1.f12i);
                                            }
                                            if (ViewOnAttachStateChangeListenerC0078c4.m449q(hy0Var2)) {
                                                c0156e13.m764a(C0002a1.f9f);
                                                c0156e13.m764a(C0002a1.f10g);
                                            }
                                        }
                                    }
                                    p30.m3001k(c0156e13, xz0Var);
                                    r1.setPaneTitle((CharSequence) w60.m4915v(sz0Var2, b01.f325d));
                                    if (rd0.m3478g(xz0Var)) {
                                        C0533o0 c0533o011 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5606s);
                                        if (c0533o011 != null) {
                                            c0156e13.m764a(new C0002a1(c0533o011.f4377a, 262144));
                                        }
                                        C0533o0 c0533o012 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5607t);
                                        if (c0533o012 != null) {
                                            c0156e13.m764a(new C0002a1(c0533o012.f4377a, 524288));
                                        }
                                        C0533o0 c0533o013 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5608u);
                                        if (c0533o013 != null) {
                                            c0156e13.m764a(new C0002a1(c0533o013.f4377a, 1048576));
                                        }
                                        e01 e01Var5 = rz0.f5610w;
                                        if (sz0Var2.f5877d.m1697c(rz0.f5610w)) {
                                            List list5 = (List) sz0Var2.m4137c(e01Var5);
                                            int size10 = list5.size();
                                            tg0 tg0Var = ViewOnAttachStateChangeListenerC0078c4.f651R;
                                            if (size10 >= tg0Var.f6001b) {
                                                throw new IllegalStateException("Can't have more than " + tg0Var.f6001b + " custom actions for one widget");
                                            }
                                            l31 l31Var3 = new l31();
                                            ch0 ch0VarM1720a = jk0.m1720a();
                                            l31 l31Var4 = l31Var;
                                            if (o30.m2770j(l31Var4.f3334d, l31Var4.f3336f, i5) >= 0 ? z2 : false) {
                                                ch0 ch0Var = (ch0) l31Var4.m1973b(i5);
                                                int[] iArr = tg0Var.f6000a;
                                                int i37 = tg0Var.f6001b;
                                                int[] iArrCopyOf = new int[16];
                                                int i38 = 0;
                                                int i39 = 0;
                                                while (i38 < i37) {
                                                    int i40 = iArr[i38];
                                                    int i41 = i37;
                                                    int i42 = i39 + 1;
                                                    int i43 = i38;
                                                    if (iArrCopyOf.length < i42) {
                                                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, Math.max(i42, (iArrCopyOf.length * 3) / 2));
                                                    }
                                                    iArrCopyOf[i39] = i40;
                                                    i38 = i43 + 1;
                                                    i39 = i42;
                                                    i37 = i41;
                                                }
                                                ArrayList arrayList8 = new ArrayList();
                                                if (list5.size() > 0) {
                                                    AbstractC0748t1.m4160r(list5.get(0));
                                                    ch0Var.getClass();
                                                    throw null;
                                                }
                                                if (arrayList8.size() > 0) {
                                                    AbstractC0748t1.m4160r(arrayList8.get(0));
                                                    if (i39 <= 0) {
                                                        C0921xc.m5125f("Index must be between 0 and size");
                                                        return null;
                                                    }
                                                    int i44 = iArrCopyOf[0];
                                                    throw null;
                                                }
                                            } else if (list5.size() > 0) {
                                                AbstractC0748t1.m4160r(list5.get(0));
                                                tg0Var.m4199b(0);
                                                throw null;
                                            }
                                            viewOnAttachStateChangeListenerC0078c42.f684v.m1974c(i5, l31Var3);
                                            l31Var4.m1974c(i5, ch0VarM1720a);
                                        }
                                    }
                                    r1.setScreenReaderFocusable(rd0.m3479h(xz0Var, resources));
                                    iM4068d = viewOnAttachStateChangeListenerC0078c42.f657F.m4068d(i5);
                                    if (iM4068d == -1) {
                                        u50.m4257A(viewTreeObserverOnGlobalLayoutListenerC0875w3.getAndroidViewsHandler$ui(), iM4068d);
                                        viewTreeObserverOnGlobalLayoutListenerC0875w32 = viewTreeObserverOnGlobalLayoutListenerC0875w3;
                                        r1.setTraversalBefore(viewTreeObserverOnGlobalLayoutListenerC0875w32, iM4068d);
                                        viewOnAttachStateChangeListenerC0078c42.m458b(i5, c0156e13, viewOnAttachStateChangeListenerC0078c42.f659H, null);
                                    } else {
                                        viewTreeObserverOnGlobalLayoutListenerC0875w32 = viewTreeObserverOnGlobalLayoutListenerC0875w3;
                                    }
                                    iM4068d2 = viewOnAttachStateChangeListenerC0078c42.f658G.m4068d(i5);
                                    if (iM4068d2 != -1) {
                                        u50.m4257A(viewTreeObserverOnGlobalLayoutListenerC0875w32.getAndroidViewsHandler$ui(), iM4068d2);
                                    }
                                    str2 = (String) w60.m4915v(xz0Var.f7471d, c01.f625b);
                                    if (str2 != null) {
                                        c0156e13.m768f(str2);
                                    }
                                    c0156e14 = c0156e13;
                                } else {
                                    Object objM1701g25 = jh0Var3.m1701g(b01.f314G);
                                    if (objM1701g25 == null) {
                                        objM1701g25 = c0156e1;
                                    }
                                    boolean zM3002l4 = p30.m3002l(objM1701g25, Boolean.TRUE);
                                    boolean z6 = (xv0Var3 != null && xv0Var3.f7427a == 4) || (xv0Var3 != null && xv0Var3.f7427a == 3);
                                    r1.setClickable(!z6 || (z6 && !zM3002l4));
                                    if (rd0.m3478g(xz0Var) && r3.isClickable()) {
                                        ?? r10 = c0156e1;
                                        C0002a1 c0002a1 = new C0002a1(r10, 16, c0533o04.f4377a, r10);
                                        c0156e13 = c0156e12;
                                        c0156e13.m764a(c0002a1);
                                    }
                                    r1.setLongClickable(false);
                                    objM1701g9 = jh0Var3.m1701g(rz0.f5590c);
                                    if (objM1701g9 == null) {
                                    }
                                    c0533o0 = (C0533o0) objM1701g9;
                                    if (c0533o0 != null) {
                                    }
                                    objM1701g10 = jh0Var3.m1701g(rz0.f5603p);
                                    if (objM1701g10 == null) {
                                    }
                                    c0533o02 = (C0533o0) objM1701g10;
                                    if (c0533o02 != null) {
                                    }
                                    if (rd0.m3478g(xz0Var)) {
                                    }
                                    strM447l = ViewOnAttachStateChangeListenerC0078c4.m447l(xz0Var);
                                    if (strM447l != null) {
                                        r3.setTextSelection(viewOnAttachStateChangeListenerC0078c42.m466j(xz0Var), viewOnAttachStateChangeListenerC0078c42.m465i(xz0Var));
                                        C0533o0 c0533o092 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5597j);
                                        c0156e13.m764a(new C0002a1(c0533o092 == null ? c0533o092.f4377a : null, MethodData.ACC_DECLARED_SYNCHRONIZED));
                                        r1.addAction(256);
                                        r1.addAction(512);
                                        r1.setMovementGranularities(11);
                                        list = (List) w60.m4915v(sz0Var2, b01.f322a);
                                        if (list != null) {
                                            b60VarM315v = b60Var.m315v();
                                            while (true) {
                                                if (b60VarM315v == null) {
                                                }
                                                b60VarM315v = b60VarM315v.m315v();
                                            }
                                            if (b60VarM315v == null) {
                                            }
                                        } else {
                                            b60VarM315v = b60Var.m315v();
                                            while (true) {
                                                if (b60VarM315v == null) {
                                                }
                                                b60VarM315v = b60VarM315v.m315v();
                                            }
                                            if (b60VarM315v == null) {
                                            }
                                        }
                                    }
                                    arrayList = new ArrayList();
                                    arrayList.add("androidx.compose.ui.semantics.id");
                                    charSequenceM767e = c0156e13.m767e();
                                    if (charSequenceM767e != null) {
                                        arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
                                    }
                                    if (jh0Var3.m1697c(b01.f346y)) {
                                    }
                                    if (jh0Var3.m1697c(b01.f321N)) {
                                    }
                                    r3.setAvailableExtraData(arrayList);
                                    ys0Var = (ys0) w60.m4915v(sz0Var2, b01.f324c);
                                    float f22 = 0.0f;
                                    if (ys0Var != null) {
                                    }
                                    if (rd0.m3478g(xz0Var)) {
                                        c0156e13.m764a(new C0002a1(c0533o03.f4377a, R.id.accessibilityActionSetProgress));
                                    }
                                    AbstractC0398kl.m1940z(c0156e13, xz0Var);
                                    objM1701g11 = xz0Var.m5188k().f5877d.m1701g(b01.f328g);
                                    if (objM1701g11 == null) {
                                    }
                                    if (objM1701g11 != null) {
                                    }
                                    hy0Var = (hy0) w60.m4915v(sz0Var2, b01.f342u);
                                    C0533o0 c0533o0102 = (C0533o0) w60.m4915v(sz0Var2, rz0.f5591d);
                                    if (hy0Var != null) {
                                        objM1701g12 = xz0Var.m5188k().f5877d.m1701g(b01.f327f);
                                        if (objM1701g12 == null) {
                                        }
                                        if (objM1701g12 == null) {
                                        }
                                        if (((Number) hy0Var.f2377b.invoke()).floatValue() > f) {
                                        }
                                        if (rd0.m3478g(xz0Var)) {
                                        }
                                    }
                                    hy0Var2 = (hy0) w60.m4915v(sz0Var2, b01.f343v);
                                    if (hy0Var2 != null) {
                                        z2 = true;
                                        p30.m3001k(c0156e13, xz0Var);
                                        r1.setPaneTitle((CharSequence) w60.m4915v(sz0Var2, b01.f325d));
                                        if (rd0.m3478g(xz0Var)) {
                                        }
                                        r1.setScreenReaderFocusable(rd0.m3479h(xz0Var, resources));
                                        iM4068d = viewOnAttachStateChangeListenerC0078c42.f657F.m4068d(i5);
                                        if (iM4068d == -1) {
                                        }
                                        iM4068d2 = viewOnAttachStateChangeListenerC0078c42.f658G.m4068d(i5);
                                        if (iM4068d2 != -1) {
                                        }
                                        str2 = (String) w60.m4915v(xz0Var.f7471d, c01.f625b);
                                        if (str2 != null) {
                                        }
                                        c0156e14 = c0156e13;
                                    }
                                }
                            }
                        }
                        z = true;
                        r3.setVisibleToUser(AbstractC0307i4.m1545u(xz0Var) ^ z);
                        objM1701g8 = jh0Var3.m1701g(b01.f331j);
                        if (objM1701g8 == null) {
                        }
                        if (objM1701g8 != null) {
                        }
                    }
                    c0156e1 = null;
                    if (i != -1) {
                    }
                    c0156e15.f1258c = i;
                    Obtain.setSource(viewTreeObserverOnGlobalLayoutListenerC0875w33, i);
                    Obtain.setBoundsInScreen(viewOnAttachStateChangeListenerC0078c43.m459c(zz0Var));
                    sg0 sg0Var22 = viewOnAttachStateChangeListenerC0078c43.f665N;
                    l31 l31Var22 = viewOnAttachStateChangeListenerC0078c43.f685w;
                    Resources resources2 = viewTreeObserverOnGlobalLayoutListenerC0875w33.getContext().getResources();
                    c0156e15.m768f("android.view.View");
                    sz0 sz0Var32 = xz0Var3.f7471d;
                    jh0Var = sz0Var32.f5877d;
                    if (jh0Var.m1697c(b01.f312E)) {
                    }
                    if (jh0Var.m1697c(b01.f308A)) {
                    }
                    objM1701g = jh0Var.m1701g(b01.f345x);
                    if (objM1701g == null) {
                    }
                    xv0Var = (xv0) objM1701g;
                    if (xv0Var == null) {
                    }
                    Obtain.setPackageName(viewTreeObserverOnGlobalLayoutListenerC0875w33.getContext().getPackageName());
                    Obtain.setImportantForAccessibility(AbstractC0307i4.m1546v(xz0Var3));
                    if (i8 < 34) {
                    }
                    List listM5178j3 = xz0.m5178j(4, xz0Var3);
                    size = listM5178j3.size();
                    boolean z32 = zM3995e;
                    int i102 = 0;
                    i2 = 0;
                    while (i2 < size) {
                    }
                    i3 = viewOnAttachStateChangeListenerC0078c43.f677o;
                    AccessibilityNodeInfo accessibilityNodeInfo4 = c0156e15.f1256a;
                    if (i != i3) {
                    }
                    c0200f8M3495x = rd0.m3495x(xz0Var3);
                    if (c0200f8M3495x == null) {
                    }
                    r1.setText(r0);
                    e01Var = b01.f317J;
                    jh0Var3 = jh0Var2;
                    if (jh0Var3.m1697c(e01Var)) {
                    }
                    r1.setStateDescription(rd0.m3494w(xz0Var, resources2));
                    r3.setCheckable(rd0.m3493v(xz0Var));
                    objM1701g2 = jh0Var3.m1701g(b01.f315H);
                    if (objM1701g2 == null) {
                    }
                    p81Var = (p81) objM1701g2;
                    if (p81Var != null) {
                    }
                    objM1701g3 = jh0Var3.m1701g(b01.f314G);
                    if (objM1701g3 == null) {
                    }
                    bool = (Boolean) objM1701g3;
                    if (bool == null) {
                    }
                    sz0Var2 = sz0Var;
                    if (sz0Var2.f5879f) {
                        objM1701g4 = jh0Var3.m1701g(b01.f322a);
                        if (objM1701g4 == null) {
                        }
                        List list42 = (List) objM1701g4;
                        r3.setContentDescription(list42 == null ? (String) AbstractC0960ye.m5241K(list42) : c0156e1);
                        objM1701g5 = jh0Var3.m1701g(b01.f346y);
                        if (objM1701g5 == null) {
                        }
                        str = (String) objM1701g5;
                        if (str != null) {
                        }
                        objM1701g6 = jh0Var3.m1701g(b01.f329h);
                        if (objM1701g6 == null) {
                        }
                        if (((na1) objM1701g6) != null) {
                        }
                        i5 = i;
                        if (i5 != -1) {
                        }
                        r3.setPassword(jh0Var3.m1697c(b01.f316I));
                        r3.setEditable(jh0Var3.m1697c(b01.f319L));
                        objM1701g7 = jh0Var3.m1701g(b01.f320M);
                        if (objM1701g7 == null) {
                        }
                        Integer num2 = (Integer) objM1701g7;
                        r3.setMaxTextLength(num2 == null ? num2.intValue() : -1);
                        r3.setEnabled(rd0.m3478g(xz0Var));
                        e01 e01Var32 = b01.f332k;
                        r3.setFocusable(jh0Var3.m1697c(e01Var32));
                        if (r3.isFocusable()) {
                        }
                        z = true;
                        r3.setVisibleToUser(AbstractC0307i4.m1545u(xz0Var) ^ z);
                        objM1701g8 = jh0Var3.m1701g(b01.f331j);
                        if (objM1701g8 == null) {
                        }
                        if (objM1701g8 != null) {
                        }
                    }
                } else if (!(Build.VERSION.SDK_INT >= 34 ? AbstractC0709s0.m3995e(accessibilityManager2) : true)) {
                    viewOnAttachStateChangeListenerC0078c42 = viewOnAttachStateChangeListenerC0078c43;
                    i5 = i;
                    c0156e14 = null;
                }
            }
        }
        if (viewOnAttachStateChangeListenerC0078c42.f681s) {
            if (i5 == viewOnAttachStateChangeListenerC0078c42.f677o) {
                viewOnAttachStateChangeListenerC0078c42.f679q = c0156e14;
            }
            if (i5 == viewOnAttachStateChangeListenerC0078c42.f678p) {
                viewOnAttachStateChangeListenerC0078c42.f680r = c0156e14;
            }
        }
        return c0156e14;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public xd0 m616m() {
        return (xd0) ((gp0) this.f920f).getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public AutofillId m617n(long j) {
        return ((ContentCaptureSession) this.f919e).newAutofillId(((View) this.f920f).getAutofillId(), j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public void m618o() {
        if (((h10) this.f920f) != null) {
            this.f920f = null;
            ((AbstractC0493n) this.f919e).m2613D0(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void m619p(int i, int i2, boolean z) {
        Window window = (Window) this.f920f;
        if (window == null) {
            WindowInsetsController windowInsetsController = (WindowInsetsController) this.f919e;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public void mo510q(boolean z) {
        m619p(16, 16, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void mo511r(boolean z) {
        m619p(8192, 8, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f918d) {
            case 23:
                return "Bounds{lower=" + ((i20) this.f919e) + " upper=" + ((i20) this.f920f) + "}";
            default:
                return super.toString();
        }
    }

    public C0111d(b60 b60Var, xd0 xd0Var) {
        this.f918d = 6;
        this.f919e = b60Var;
        this.f920f = r60.m3419u(xd0Var);
    }

    public C0111d(C0607p9 c0607p9) {
        this.f918d = 15;
        this.f919e = c0607p9;
        this.f920f = new C0238g9(0);
    }

    public /* synthetic */ C0111d(int i, Object obj, Object obj2) {
        this.f918d = i;
        this.f919e = obj;
        this.f920f = obj2;
    }

    public C0111d(n70 n70Var) {
        this.f918d = 7;
        this.f919e = n70Var;
        ch0 ch0Var = jk0.f2910a;
        this.f920f = new ch0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0111d(Object obj) {
        this(11);
        this.f918d = 11;
        this.f920f = r60.m3419u(obj);
        r60.m3419u(obj);
    }

    public C0111d(WindowInsetsAnimation.Bounds bounds) {
        this.f918d = 23;
        this.f919e = i20.m1513b(bounds.getLowerBound());
        this.f920f = i20.m1513b(bounds.getUpperBound());
    }

    public C0111d(Window window) {
        this.f918d = 24;
        this.f919e = window.getInsetsController();
        this.f920f = window;
    }

    public C0111d(AbstractC0493n abstractC0493n) {
        this.f918d = 0;
        this.f919e = abstractC0493n;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0111d(ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4) {
        this(1);
        this.f918d = 1;
        this.f920f = viewOnAttachStateChangeListenerC0078c4;
    }
}
