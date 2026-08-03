package p000;

import android.content.ContentValues;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Xm */
/* JADX INFO: loaded from: classes.dex */
public final class C1017Xm implements InterfaceC0162Dq, InterfaceC0080Bu, InterfaceC0667Pf, InterfaceC2123k0, InterfaceC0579Nd {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3225a;

    /* JADX INFO: renamed from: b */
    public Object f3226b;

    public /* synthetic */ C1017Xm(int r1, Object r2) {
        this.f3225a = r1;
        this.f3226b = r2;
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m1907a(C1376en r2) {
        monitor-enter(this);
        monitor-enter(this);     // Catch: Throwable -> L14
        C2243mn r22 = m1908d(AbstractC0640Ov.m1259e(r2), r2.m2665A());     // Catch: Throwable -> L9
        monitor-exit(this);     // Catch: Throwable -> L14
        C2153kn r0 = (C2153kn) this.f3226b;     // Catch: Throwable -> L14
        r0.m5038e();     // Catch: Throwable -> L14
        C2286nn.m4615x((C2286nn) r0.f8871b, r22);     // Catch: Throwable -> L14
        monitor-exit(this);
        return;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC0080Bu
    /* JADX INFO: renamed from: b */
    public void mo131b(int r2, Object r3) {
        if (r2 != 6) goto L5;
    L9:
        Throwable r32 = (Throwable) r3;
    L10:
        ((ProfileInstallReceiver) this.f3226b).setResultCode(r2);
        return;
    L5:
        if (r2 == 7) goto L9;
        if (r2 == 8) goto L9;
        goto L9
    }

    @Override // p000.InterfaceC0667Pf
    /* JADX INFO: renamed from: c */
    public boolean mo892c(Object r5, File r6, C2644vt r7) {
        InputStream r52 = (InputStream) r5;
        C2812zp r72 = (C2812zp) this.f3226b;
        byte[] r0 = (byte[]) r72.m5441c(65536, byte[].class);
        FileOutputStream r2 = null;
        FileOutputStream r3 = new FileOutputStream(r6);     // Catch: Throwable -> L13 IOException -> L24
    L32:
        int r62 = r52.read(r0);     // Catch: Throwable -> L7 IOException -> L9
        if (r62 == (-1)) goto L10;
        r3.write(r0, 0, r62);     // Catch: Throwable -> L7 IOException -> L9
        goto L32
    L10:
        r3.close();     // Catch: Throwable -> L7 IOException -> L9
        r3.close();     // Catch: IOException -> L22
    L12:
        r72.m5445g(r0);
        return true;
    L9:
        r2 = r3;
    L7:
        th = th;
        r2 = r3;
    L14:
        if (r2 != null) goto L26;
    L16:
        r72.m5445g(r0);
        throw th;
    L26:
        r2.close();     // Catch: IOException -> L23
        goto L16
    L13:
        th = th;
    L18:
        if (r2 != null) goto L28;
    L20:
        r72.m5445g(r0);
        return false;
    L28:
        r2.close();     // Catch: IOException -> L25
        goto L20
    }

    /* JADX INFO: renamed from: d */
    public synchronized C2243mn m1908d(C0931Vm r4, EnumC2773yt r5) {
        monitor-enter(this);
        monitor-enter(this);     // Catch: Throwable -> L17
        int r0 = AbstractC2751yD.m5332a();     // Catch: Throwable -> L9
    L5:
        if (m1913j(r0) == false) goto L11;
        r0 = AbstractC2751yD.m5332a();     // Catch: Throwable -> L9
        goto L5
    L11:
        monitor-exit(this);     // Catch: Throwable -> L17
        if (r5 == EnumC2773yt.f9417b) goto L20;
        C2200ln r1 = C2243mn.m4551F();     // Catch: Throwable -> L17
        r1.m5038e();     // Catch: Throwable -> L17
        C2243mn.m4552w((C2243mn) r1.f8871b, r4);     // Catch: Throwable -> L17
        r1.m5038e();     // Catch: Throwable -> L17
        C2243mn.m4555z((C2243mn) r1.f8871b, r0);     // Catch: Throwable -> L17
        r1.m5038e();     // Catch: Throwable -> L17
        C2243mn.m4554y((C2243mn) r1.f8871b);     // Catch: Throwable -> L17
        r1.m5038e();     // Catch: Throwable -> L17
        C2243mn.m4553x((C2243mn) r1.f8871b, r5);     // Catch: Throwable -> L17
        C2243mn r42 = (C2243mn) r1.m5035b();     // Catch: Throwable -> L17
        monitor-exit(this);
        return r42;
    L20:
        throw new GeneralSecurityException("unknown output prefix type");     // Catch: Throwable -> L17
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: e */
    public String m1909e() {
        String r0 = ((ContentValues) this.f3226b).getAsString(AbstractC0295Gu.m625r(-729165187774517L));
        if (r0 == null) goto L5;
        return r0;
    L5:
        return AbstractC0295Gu.m625r(-729199547512885L);
    }

    /* JADX INFO: renamed from: g */
    public synchronized C2656w4 m1910g() {
        monitor-enter(this);
        C2656w4 r0 = C2656w4.m5191o((C2286nn) ((C2153kn) this.f3226b).m5035b());     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    L6:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: h */
    public String m1911h() {
        String r0 = ((ContentValues) this.f3226b).getAsString(AbstractC0295Gu.m625r(-729130828036149L));
        if (r0 == null) goto L5;
        return r0;
    L5:
        return AbstractC0295Gu.m625r(-729160892807221L);
    }

    /* JADX INFO: renamed from: i */
    public boolean m1912i() {
        Integer r0 = ((ContentValues) this.f3226b).getAsInteger(AbstractC0295Gu.m625r(-729001979017269L));
        if (r0 != null) goto L6;
        return false;
    L6:
        if (r0.intValue() != 1) goto L8;
        return true;
    L8:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public synchronized boolean m1913j(int r3) {
        monitor-enter(this);
        Iterator r0 = Collections.unmodifiableList(((C2286nn) ((C2153kn) this.f3226b).f8871b).m4616A()).iterator();     // Catch: Throwable -> L11
    L4:
        if (r0.hasNext() == false) goto L13;
        if (((C2243mn) r0.next()).m4557B() != r3) goto L4;
        monitor-exit(this);
        return true;
    L13:
        monitor-exit(this);
        return false;
    L11:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: k */
    public C0931Vm m1914k(AbstractC2744y6 r6) {
        AbstractC1551in r0 = (AbstractC1551in) this.f3226b;
        AbstractC2614v5 r1 = r0.mo2972d();     // Catch: C0673Pl -> L9
        AbstractC0043B r62 = r1.mo5007e(r6);     // Catch: C0673Pl -> L9
        r1.mo5008f(r62);     // Catch: C0673Pl -> L9
        AbstractC0043B r63 = r1.mo5005a(r62);     // Catch: C0673Pl -> L9
        C0845Tm r12 = C0931Vm.m1786D();     // Catch: C0673Pl -> L9
        String r2 = r0.mo2970b();     // Catch: C0673Pl -> L9
        r12.m5038e();     // Catch: C0673Pl -> L9
        C0931Vm.m1787w((C0931Vm) r12.f8871b, r2);     // Catch: C0673Pl -> L9
        int r22 = ((AbstractC2634vj) r63).mo63b(null);     // Catch: IOException -> L13
        byte[] r3 = new byte[r22];     // Catch: IOException -> L13
        C2230ma r4 = new C2230ma(r22, r3);     // Catch: IOException -> L13
        r63.mo67f(r4);     // Catch: IOException -> L13
        if ((r4.f7801h - r4.f7802i) != 0) goto L12;
        C2701x6 r23 = new C2701x6(r3);     // Catch: IOException -> L13
        r12.m5038e();     // Catch: C0673Pl -> L9
        C0931Vm.m1788x((C0931Vm) r12.f8871b, r23);     // Catch: C0673Pl -> L9
        EnumC0888Um r64 = r0.mo2973e();     // Catch: C0673Pl -> L9
        r12.m5038e();     // Catch: C0673Pl -> L9
        C0931Vm.m1789y((C0931Vm) r12.f8871b, r64);     // Catch: C0673Pl -> L9
        return (C0931Vm) r12.m5035b();
    L12:
        throw new IllegalStateException("Did not write as much data as expected.");     // Catch: IOException -> L13
    L13:
        e = move-exception;
        throw new RuntimeException(r63.m64c("ByteString"), e);     // Catch: C0673Pl -> L9
    L9:
        e = move-exception;
        throw new GeneralSecurityException("Unexpected proto", e);
    }

    @Override // p000.InterfaceC2123k0
    public boolean perform(View r4, AbstractC1241c0 r5) {
        SwipeDismissBehavior r52 = (SwipeDismissBehavior) this.f3226b;
        boolean r1 = false;
        if (r52.mo2426r(r4) == true) goto L5;
        return false;
    L5:
        if (r4.getLayoutDirection() != 1) goto L7;
        r1 = true;
    L7:
        int r53 = r52.f4405d;
        if (r53 != 0) goto L10;
        if (r1 == false) goto L10;
    L12:
        int r54 = -r4.getWidth();
    L14:
        WeakHashMap r0 = AbstractC2185lE.f7617a;
        r4.offsetLeftAndRight(r54);
        r4.setAlpha(0.0f);
        return true;
    L10:
        if (r53 != 1) goto L13;
        if (r1 == false) goto L12;
    L13:
        r54 = r4.getWidth();
        goto L14
    }

    @Override // p000.InterfaceC0579Nd
    /* JADX INFO: renamed from: r */
    public void mo244r(EditText r5) {
        C0701QC r0 = (C0701QC) this.f3226b;
        Editable r52 = r5.getText();
        if (r52 == null) goto L8;
        String r53 = r52.toString();
        if (r53 == null) goto L8;
        String r54 = AbstractC2564tz.m5070e0(r53).toString();
        if (r54 == null) goto L8;
    L10:
        if (r54.length() <= 0) goto L13;
        C1498hd r1 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(ExecutorC0921Vc.f2876b), new C0658PC(r54, r0, null), 3);
        return;
    L13:
        Toast.makeText(r0.m1432f(), AbstractC0295Gu.m625r(-484699944253493L), 0).show();
        return;
    L8:
        r54 = AbstractC0295Gu.m625r(-484695649286197L);
        goto L10
    }

    public String toString() {
        switch(this.f3225a) {
            case 8: goto L6;
            default: goto L5;
        };
    L6:
        StringBuilder r0 = new StringBuilder();
        r0.append(AbstractC0295Gu.m625r(-728422158432309L));
        ContentValues r1 = (ContentValues) this.f3226b;
        Long r2 = r1.getAsLong(AbstractC0295Gu.m625r(-729435770714165L));
        long r3 = 0;
        if (r2 == null) goto L9;
        long r5 = r2.longValue();
    L10:
        r0.append(r5);
        r0.append(AbstractC0295Gu.m625r(-727906762356789L));
        Long r22 = r1.getAsLong(AbstractC0295Gu.m625r(-729461540517941L));
        if (r22 == null) goto L13;
        long r52 = r22.longValue();
    L14:
        r0.append(r52);
        r0.append(AbstractC0295Gu.m625r(-727958301964341L));
        Integer r23 = r1.getAsInteger(AbstractC0295Gu.m625r(-729500195223605L));
        int r53 = 0;
        if (r23 == null) goto L17;
        int r24 = r23.intValue();
    L18:
        AbstractC0213Ey.m418p(r0, r24, -728005546604597L);
        Integer r25 = r1.getAsInteger(AbstractC0295Gu.m625r(-729521670060085L));
        if (r25 == null) goto L21;
        int r26 = r25.intValue();
    L22:
        r0.append(r26);
        r0.append(AbstractC0295Gu.m625r(-728048496277557L));
        r0.append(m1912i());
        r0.append(AbstractC0295Gu.m625r(-728091445950517L));
        Integer r27 = r1.getAsInteger(AbstractC0295Gu.m625r(-729032043788341L));
        if (r27 == null) goto L25;
        int r28 = r27.intValue();
    L26:
        AbstractC0213Ey.m418p(r0, r28, -728705626273845L);
        Long r29 = r1.getAsLong(AbstractC0295Gu.m625r(-729083583395893L));
        if (r29 == null) goto L29;
        long r6 = r29.longValue();
    L30:
        r0.append(r6);
        r0.append(AbstractC0295Gu.m625r(-728765755815989L));
        r0.append(m1911h());
        r0.append(AbstractC0295Gu.m625r(-728813000456245L));
        r0.append(m1909e());
        r0.append(AbstractC0295Gu.m625r(-728868835031093L));
        String r210 = r1.getAsString(AbstractC0295Gu.m625r(-729203842480181L));
        if (r210 != null) goto L33;
        r210 = AbstractC0295Gu.m625r(-729238202218549L);
    L33:
        AbstractC2374ph.m4817n(r0, r210, -728924669605941L);
        String r211 = r1.getAsString(AbstractC0295Gu.m625r(-729242497185845L));
        if (r211 != null) goto L36;
        r211 = AbstractC0295Gu.m625r(-729830907705397L);
    L36:
        AbstractC2374ph.m4817n(r0, r211, -728435043334197L);
        r0.append(r1.getAsInteger(AbstractC0295Gu.m625r(-729873857378357L)));
        r0.append(AbstractC0295Gu.m625r(-728490877909045L));
        String r212 = r1.getAsString(AbstractC0295Gu.m625r(-729912512084021L));
        if (r212 != null) goto L39;
        r212 = AbstractC0295Gu.m625r(-729968346658869L);
    L39:
        AbstractC2374ph.m4817n(r0, r212, -728563892353077L);
        String r213 = r1.getAsString(AbstractC0295Gu.m625r(-729972641626165L));
        if (r213 != null) goto L42;
        r213 = AbstractC0295Gu.m625r(-730049951037493L);
    L42:
        AbstractC2374ph.m4817n(r0, r213, -728662676600885L);
        String r214 = r1.getAsString(AbstractC0295Gu.m625r(-730054246004789L));
        if (r214 != null) goto L45;
        r214 = AbstractC0295Gu.m625r(-729568914700341L);
    L45:
        AbstractC2374ph.m4817n(r0, r214, -727099308505141L);
        Long r215 = r1.getAsLong(AbstractC0295Gu.m625r(-729573209667637L));
        if (r215 == null) goto L48;
        long r62 = r215.longValue();
    L49:
        r0.append(r62);
        r0.append(AbstractC0295Gu.m625r(-727159438047285L));
        String r216 = r1.getAsString(AbstractC0295Gu.m625r(-729616159340597L));
        if (r216 != null) goto L52;
        r216 = AbstractC0295Gu.m625r(-729676288882741L);
    L52:
        AbstractC2374ph.m4817n(r0, r216, -727236747458613L);
        Long r217 = r1.getAsLong(AbstractC0295Gu.m625r(-729680583850037L));
        if (r217 == null) goto L55;
        long r63 = r217.longValue();
    L56:
        r0.append(r63);
        r0.append(AbstractC0295Gu.m625r(-727283992098869L));
        Integer r218 = r1.getAsInteger(AbstractC0295Gu.m625r(-729710648621109L));
        if (r218 == null) goto L59;
        r53 = r218.intValue();
    L59:
        AbstractC0213Ey.m418p(r0, r53, -727318351837237L);
        String r219 = r1.getAsString(AbstractC0295Gu.m625r(-728160165427253L));
        if (r219 != null) goto L62;
        r219 = AbstractC0295Gu.m625r(-728216000002101L);
    L62:
        AbstractC2374ph.m4817n(r0, r219, -726841610467381L);
        String r220 = r1.getAsString(AbstractC0295Gu.m625r(-728220294969397L));
        if (r220 != null) goto L65;
        r220 = AbstractC0295Gu.m625r(-728267539609653L);
    L65:
        AbstractC2374ph.m4817n(r0, r220, -726910329944117L);
        Long r221 = r1.getAsLong(AbstractC0295Gu.m625r(-728271834576949L));
        if (r221 == null) goto L68;
        long r54 = r221.longValue();
    L69:
        r0.append(r54);
        r0.append(AbstractC0295Gu.m625r(-726970459486261L));
        Long r12 = r1.getAsLong(AbstractC0295Gu.m625r(-728314784249909L));
        if (r12 == null) goto L72;
        r3 = r12.longValue();
    L72:
        r0.append(r3);
        r0.append(AbstractC0295Gu.m625r(-727009114191925L));
        return r0.toString();
    L68:
        r54 = 0;
        goto L69
    L55:
        r63 = 0;
        goto L56
    L48:
        r62 = 0;
        goto L49
    L29:
        r6 = 0;
        goto L30
    L25:
        r28 = 0;
        goto L26
    L21:
        r26 = 0;
        goto L22
    L17:
        r24 = 0;
        goto L18
    L13:
        r52 = 0;
        goto L14
    L9:
        r5 = 0;
        goto L10
    L5:
        return super.toString();
    }

    public /* synthetic */ C1017Xm(int r1, boolean r2) {
        this.f3225a = r1;
    }

    public C1017Xm(ContentValues r3) {
        this.f3225a = 8;
        AbstractC0295Gu.m625r(-729375641172021L);
        this.f3226b = r3;
    }

    public C1017Xm(int r4) {
        this.f3225a = r4;
        switch(r4) {
            case 7: goto L6;
            default: goto L4;
        };
    L4:
        this.f3226b = new LinkedHashMap(0, 0.75f, true);
        return;
    L6:
        this.f3226b = new C1022Xr(500);
    }

    public C1017Xm(AbstractC1551in r4, Class r5) {
        this.f3225a = 0;
        if (r4.f5509b.keySet().contains(r5) == false) goto L5;
    L9:
        this.f3226b = r4;
        return;
    L5:
        if (Void.class.equals(r5) == true) goto L9;
        throw new IllegalArgumentException("Given internalKeyMananger " + r4.toString() + " does not support primitive class " + r5.getName());
    }
}
