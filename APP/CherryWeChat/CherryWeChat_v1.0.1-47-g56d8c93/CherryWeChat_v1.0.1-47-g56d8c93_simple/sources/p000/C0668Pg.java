package p000;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Pg */
/* JADX INFO: loaded from: classes.dex */
public final class C0668Pg implements InterfaceC1054Yg, InterfaceC2819zw, InterfaceC2647vw, InterfaceC2209lw, InterfaceC2558tt, InterfaceC0080Bu {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2132a;

    public /* synthetic */ C0668Pg(int r1) {
        this.f2132a = r1;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m1326d(C0668Pg r3, String r4, AbstractC0644Oz r5) {
        r3.getClass();
        if (r4.startsWith(AbstractC0295Gu.m625r(-170462957008949L)) == false) goto L5;
    L9:
        C1498hd r32 = AbstractC1499he.f5282a;
        return AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(1, null, r4), r5);
    L5:
        if (r4.startsWith(AbstractC0295Gu.m625r(-170497316747317L)) == true) goto L9;
        File r33 = new File(AbstractC2248ms.f7952b, new File(r4).getName());
        AbstractC2675wh.m5238a0(new File(r4), r33);
        return r33.getCanonicalPath();
    }

    /* JADX INFO: renamed from: e */
    public static final String m1327e(C0668Pg r8, String r9) {
        r8.getClass();
        if (r9 != null) goto L5;
        return null;
    L5:
        if (AbstractC2564tz.m5059T(r9) == true) goto L62;
        C2813zq r82 = AbstractC1406fG.m2680E(Pattern.compile(AbstractC0295Gu.m625r(-170535971452981L), 66).matcher(r9), 0, r9);
        if (r82 == null) goto L16;
        String r92 = AbstractC2564tz.m5070e0((String) ((C2770yq) r82.m5446a()).get(3)).toString();
        CharSequence r83 = (CharSequence) ((C2770yq) r82.m5446a()).get(1);     // Catch: Exception -> L15
        if (r83.length() != 0) goto L13;
        r83 = AbstractC0295Gu.m625r(-171261820926005L);     // Catch: Exception -> L15
    L13:
        return URLDecoder.decode(r92, (String) r83);
    L15:
        return r92;
    L16:
        C2813zq r84 = AbstractC1406fG.m2680E(Pattern.compile(AbstractC0295Gu.m625r(-171287590729781L), 66).matcher(r9), 0, r9);
        if (r84 == null) goto L61;
        CharSequence r93 = (CharSequence) ((C2770yq) r84.m5446a()).get(1);
        if (AbstractC2564tz.m5059T(r93) == false) goto L21;
        r93 = (String) ((C2770yq) r84.m5446a()).get(2);
    L21:
        String r85 = AbstractC2564tz.m5070e0((String) r93).toString();
        char[] r94 = {'\"'};
        int r0 = r85.length() - 1;
        int r3 = 0;
        boolean r4 = false;
    L22:
        if (r3 > r0) goto L44;
        if (r4 == true) goto L25;
        int r5 = r3;
    L26:
        char r52 = r85.charAt(r5);
        int r6 = 0;
    L27:
        if (r6 >= 1) goto L32;
        if (r52 == r94[r6]) goto L33;
        r6 = r6 + 1;
    L33:
        if (r6 < 0) goto L35;
        boolean r53 = true;
    L36:
        if (r4 == false) goto L37;
        if (r53 == false) goto L44;
        r0 = r0 - 1;
        goto L22
    L37:
        if (r53 == false) goto L38;
        r3 = r3 + 1;
        goto L22
    L38:
        r4 = true;
        goto L22
    L35:
        r53 = false;
        goto L36
    L32:
        r6 = -1;
        goto L33
    L25:
        r5 = r0;
    L44:
        return r85.subSequence(r3, r0 + 1).toString();
    L61:
        return null;
    L62:
        return null;
    }

    /* JADX INFO: renamed from: h */
    public static void m1328h(String r8, String r9) {
        AbstractC0295Gu.m625r(-172979807844405L);
        AbstractC0295Gu.m625r(-173009872615477L);
        C1214bG r0 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-586997475309621L));     // Catch: Throwable -> L12
        Class r1 = null;
        if (r0 == null) goto L6;
        Object r02 = r0.f4146a;     // Catch: Throwable -> L12
    L8:
        if ((r02 instanceof Class) == false) goto L10;
        r1 = (Class) r02;     // Catch: Throwable -> L12
    L10:
        C1538iG r03 = new C1538iG(r1);     // Catch: Throwable -> L12
        r03.m2922g(new Object[]{String.class, List.class, String.class, Boolean.TYPE, String.class, Integer.TYPE});     // Catch: Throwable -> L12
        r03.m2919d(new Object[]{r8, null, r9, Boolean.FALSE, null, 2});     // Catch: Throwable -> L12
        return;
    L6:
        r02 = null;
    }

    /* JADX INFO: renamed from: j */
    private final void m1329j(int r1, Object r2) {
    }

    /* JADX INFO: renamed from: k */
    private final void m1330k(Object r1) {
    }

    /* JADX INFO: renamed from: l */
    public static void m1331l(String r3, String r4) {
        AbstractC0295Gu.m625r(-173027052484661L);
        AbstractC0295Gu.m625r(-173057117255733L);
        C1214bG r0 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-588225835956277L));
        if (r0 == null) goto L5;
        Object r02 = r0.f4146a;
    L7:
        if ((r02 instanceof Method) == false) goto L9;
        Method r03 = (Method) r02;
    L10:
        r03.invoke(null, new Object[]{r4, r3});
        return;
    L9:
        r03 = null;
        goto L10
    L5:
        r02 = null;
        goto L7
    }

    /* JADX INFO: renamed from: m */
    public static void m1332m(Bundle r17, String r18) {
        String r0 = AbstractC0295Gu.m625r(-170724950014005L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int r2 = AbstractC1450gG.f5067a;
        C1538iG r1 = new C1538iG(AbstractC1406fG.m2718r0(r0));
        r1.m2921f(AbstractC0295Gu.m625r(-170961173215285L));
        Object r5 = r1.m2919d(new Object[]{r17});
        LinkedHashMap r02 = AbstractC1257cG.f4258a;
        C1214bG r3 = (C1214bG) r02.get(AbstractC0295Gu.m625r(-585940913354805L));
        if (r3 == null) goto L5;
        Object r32 = r3.f4146a;
    L7:
        if ((r32 instanceof Method) == false) goto L10;
        Method r33 = (Method) r32;
    L11:
        Application r22 = C1456gf.f5172p;
        Method r12 = r33;
        Intent r34 = new Intent();
        C1214bG r03 = (C1214bG) r02.get(AbstractC0295Gu.m625r(-585940913354805L));
        if (r03 == null) goto L14;
        Object r04 = r03.f4146a;
    L16:
        if ((r04 instanceof Method) == false) goto L18;
        Method r05 = (Method) r04;
    L19:
        Object r06 = r05.getParameterTypes()[2].getConstructor(null).newInstance(null);
        LinkedList r6 = new LinkedList();
        r6.add(r18);
        r12.invoke(null, new Object[]{r22, r34, r06, r5, r6, 1, Boolean.TRUE, Boolean.FALSE, AbstractC0295Gu.m625r(-170458662041653L), 0, null, 2, null, null});
        return;
    L18:
        r05 = null;
        goto L19
    L14:
        r04 = null;
        goto L16
    L10:
        r33 = null;
        goto L11
    L5:
        r32 = null;
        goto L7
    }

    /* JADX INFO: renamed from: n */
    public static void m1333n(String r8, String r9, String r10, String r11, String r12) {
        AbstractC0295Gu.m625r(-173143016601653L);
        AbstractC0295Gu.m625r(-173173081372725L);
        Bundle r4 = new Bundle();
        r4.putString(AbstractC0295Gu.m625r(-172640505428021L), AbstractC0295Gu.m625r(-172734994708533L));
        r4.putString(AbstractC0295Gu.m625r(-172808009152565L), r9);
        r4.putString(AbstractC0295Gu.m625r(-173478024050741L), r10);
        r4.putString(AbstractC0295Gu.m625r(-173546743527477L), r11);
        if (r12 == null) goto L6;
        AbstractC0585Nj.m1128G(AbstractC2248ms.f7953c, new C1417fk(r12, r4, r8, null, 2), 3);
        return;
    L6:
        m1332m(r4, r8);
    }

    @Override // p000.InterfaceC2558tt
    /* JADX INFO: renamed from: a */
    public void mo1334a(byte[] r1, Object r2, MessageDigest r3) {
    }

    @Override // p000.InterfaceC0080Bu
    /* JADX INFO: renamed from: b */
    public void mo131b(int r2, Object r3) {
        switch(this.f2132a) {
            case 25: goto L13;
            default: goto L5;
        };
    L13:
        return;
    L5:
        if (r2 != 6) goto L7;
    L11:
        Throwable r32 = (Throwable) r3;
        return;
    L7:
        if (r2 == 7) goto L11;
        if (r2 == 8) goto L11;
    }

    @Override // p000.InterfaceC0667Pf
    /* JADX INFO: renamed from: c */
    public boolean mo892c(Object r1, File r2, C2644vt r3) {
        AbstractC2529t6.m5012d(((C0327Hj) ((C0026Aj) ((InterfaceC2389pw) r1).get()).f50a.f1572b).f1113a.f3104d.asReadOnlyBuffer(), r2);     // Catch: IOException -> L6
        return true;
    L6:
        return false;
    }

    @Override // p000.InterfaceC2647vw
    /* JADX INFO: renamed from: f */
    public int mo893f(C2644vt r1) {
        return 1;
    }

    @Override // p000.InterfaceC1054Yg
    /* JADX INFO: renamed from: g */
    public Object mo235g() {
        switch(this.f2132a) {
            case 3: goto L7;
            default: goto L5;
        };
    L5:
        return new C1466gp();
    L7:
        return new ArrayList();
    }

    @Override // p000.InterfaceC2819zw
    /* JADX INFO: renamed from: i */
    public InterfaceC2389pw mo660i(InterfaceC2389pw r5, C2644vt r6) {
        ByteBuffer r52 = ((C0327Hj) ((C0026Aj) r5.get()).f50a.f1572b).f1113a.f3104d.asReadOnlyBuffer();
        AtomicReference r0 = AbstractC2529t6.f8828a;
        if (r52.isReadOnly() == false) goto L5;
    L7:
        C2486s6 r02 = null;
    L8:
        if (r02 != null) goto L10;
    L14:
        ByteBuffer r53 = r52.asReadOnlyBuffer();
        byte[] r03 = new byte[r53.limit()];
        ByteBuffer r1 = (ByteBuffer) r53.position(0);
        r53.get(r03);
        byte[] r54 = r03;
    L16:
        return new C0304H2(r54);
    L10:
        if (r02.f8744a != 0) goto L14;
        if (r02.f8745b != ((byte[]) r02.f8746c).length) goto L14;
        r54 = r52.array();
        goto L16
    L5:
        if (r52.hasArray() == false) goto L7;
        r02 = new C2486s6(r52.array(), r52.arrayOffset(), r52.limit());
        goto L8
    }

    public C0668Pg(C0649P3 r1, AbstractC2805zi r2) {
        this.f2132a = 15;
    }
}
