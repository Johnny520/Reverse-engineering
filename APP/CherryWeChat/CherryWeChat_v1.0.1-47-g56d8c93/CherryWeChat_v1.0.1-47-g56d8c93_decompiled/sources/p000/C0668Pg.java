package p000;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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

    public /* synthetic */ C0668Pg(int i) {
        this.f2132a = i;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m1326d(C0668Pg c0668Pg, String str, AbstractC0644Oz abstractC0644Oz) {
        c0668Pg.getClass();
        if (str.startsWith(AbstractC0295Gu.m625r(-170462957008949L)) || str.startsWith(AbstractC0295Gu.m625r(-170497316747317L))) {
            C1498hd c1498hd = AbstractC1499he.f5282a;
            return AbstractC0585Nj.m1133N(ExecutorC0921Vc.f2876b, new C0948W2(1, null, str), abstractC0644Oz);
        }
        File file = new File(AbstractC2248ms.f7952b, new File(str).getName());
        AbstractC2675wh.m5238a0(new File(str), file);
        return file.getCanonicalPath();
    }

    /* JADX INFO: renamed from: e */
    public static final String m1327e(C0668Pg c0668Pg, String str) {
        c0668Pg.getClass();
        if (str == null || AbstractC2564tz.m5059T(str)) {
            return null;
        }
        C2813zq c2813zqM2680E = AbstractC1406fG.m2680E(Pattern.compile(AbstractC0295Gu.m625r(-170535971452981L), 66).matcher(str), 0, str);
        if (c2813zqM2680E != null) {
            String string = AbstractC2564tz.m5070e0((String) ((C2770yq) c2813zqM2680E.m5446a()).get(3)).toString();
            try {
                CharSequence charSequenceM625r = (CharSequence) ((C2770yq) c2813zqM2680E.m5446a()).get(1);
                if (charSequenceM625r.length() == 0) {
                    charSequenceM625r = AbstractC0295Gu.m625r(-171261820926005L);
                }
                return URLDecoder.decode(string, (String) charSequenceM625r);
            } catch (Exception unused) {
                return string;
            }
        }
        C2813zq c2813zqM2680E2 = AbstractC1406fG.m2680E(Pattern.compile(AbstractC0295Gu.m625r(-171287590729781L), 66).matcher(str), 0, str);
        if (c2813zqM2680E2 == null) {
            return null;
        }
        CharSequence charSequence = (CharSequence) ((C2770yq) c2813zqM2680E2.m5446a()).get(1);
        if (AbstractC2564tz.m5059T(charSequence)) {
            charSequence = (String) ((C2770yq) c2813zqM2680E2.m5446a()).get(2);
        }
        String string2 = AbstractC2564tz.m5070e0((String) charSequence).toString();
        char[] cArr = {'\"'};
        int length = string2.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            char cCharAt = string2.charAt(!z ? i : length);
            int i2 = 0;
            while (true) {
                if (i2 >= 1) {
                    i2 = -1;
                    break;
                }
                if (cCharAt == cArr[i2]) {
                    break;
                }
                i2++;
            }
            boolean z2 = i2 >= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        return string2.subSequence(i, length + 1).toString();
    }

    /* JADX INFO: renamed from: h */
    public static void m1328h(String str, String str2) {
        AbstractC0295Gu.m625r(-172979807844405L);
        AbstractC0295Gu.m625r(-173009872615477L);
        try {
            C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-586997475309621L));
            Object obj = c1214bG != null ? c1214bG.f4146a : null;
            C1538iG c1538iG = new C1538iG(obj instanceof Class ? (Class) obj : null);
            c1538iG.m2922g(String.class, List.class, String.class, Boolean.TYPE, String.class, Integer.TYPE);
            c1538iG.m2919d(str, null, str2, Boolean.FALSE, null, 2);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: j */
    private final void m1329j(int i, Object obj) {
    }

    /* JADX INFO: renamed from: k */
    private final void m1330k(Object obj) {
    }

    /* JADX INFO: renamed from: l */
    public static void m1331l(String str, String str2) {
        AbstractC0295Gu.m625r(-173027052484661L);
        AbstractC0295Gu.m625r(-173057117255733L);
        C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-588225835956277L));
        Object obj = c1214bG != null ? c1214bG.f4146a : null;
        (obj instanceof Method ? (Method) obj : null).invoke(null, str2, str);
    }

    /* JADX INFO: renamed from: m */
    public static void m1332m(Bundle bundle, String str) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String strM625r = AbstractC0295Gu.m625r(-170724950014005L);
        AbstractC0295Gu.m625r(-578300166535221L);
        int i = AbstractC1450gG.f5067a;
        C1538iG c1538iG = new C1538iG(AbstractC1406fG.m2718r0(strM625r));
        c1538iG.m2921f(AbstractC0295Gu.m625r(-170961173215285L));
        Object objM2919d = c1538iG.m2919d(bundle);
        LinkedHashMap linkedHashMap = AbstractC1257cG.f4258a;
        C1214bG c1214bG = (C1214bG) linkedHashMap.get(AbstractC0295Gu.m625r(-585940913354805L));
        Object obj = c1214bG != null ? c1214bG.f4146a : null;
        Method method = obj instanceof Method ? (Method) obj : null;
        Application application = C1456gf.f5172p;
        Method method2 = method;
        Intent intent = new Intent();
        C1214bG c1214bG2 = (C1214bG) linkedHashMap.get(AbstractC0295Gu.m625r(-585940913354805L));
        Object obj2 = c1214bG2 != null ? c1214bG2.f4146a : null;
        Object objNewInstance = (obj2 instanceof Method ? (Method) obj2 : null).getParameterTypes()[2].getConstructor(null).newInstance(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        method2.invoke(null, application, intent, objNewInstance, objM2919d, linkedList, 1, Boolean.TRUE, Boolean.FALSE, AbstractC0295Gu.m625r(-170458662041653L), 0, null, 2, null, null);
    }

    /* JADX INFO: renamed from: n */
    public static void m1333n(String str, String str2, String str3, String str4, String str5) {
        AbstractC0295Gu.m625r(-173143016601653L);
        AbstractC0295Gu.m625r(-173173081372725L);
        Bundle bundle = new Bundle();
        bundle.putString(AbstractC0295Gu.m625r(-172640505428021L), AbstractC0295Gu.m625r(-172734994708533L));
        bundle.putString(AbstractC0295Gu.m625r(-172808009152565L), str2);
        bundle.putString(AbstractC0295Gu.m625r(-173478024050741L), str3);
        bundle.putString(AbstractC0295Gu.m625r(-173546743527477L), str4);
        if (str5 != null) {
            AbstractC0585Nj.m1128G(AbstractC2248ms.f7953c, new C1417fk(str5, bundle, str, null, 2), 3);
        } else {
            m1332m(bundle, str);
        }
    }

    @Override // p000.InterfaceC2558tt
    /* JADX INFO: renamed from: a */
    public void mo1334a(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // p000.InterfaceC0080Bu
    /* JADX INFO: renamed from: b */
    public void mo131b(int i, Object obj) {
        switch (this.f2132a) {
            case 25:
                break;
            default:
                if (i == 6 || i == 7 || i == 8) {
                }
                break;
        }
    }

    @Override // p000.InterfaceC0667Pf
    /* JADX INFO: renamed from: c */
    public boolean mo892c(Object obj, File file, C2644vt c2644vt) throws Throwable {
        try {
            AbstractC2529t6.m5012d(((C0327Hj) ((C0026Aj) ((InterfaceC2389pw) obj).get()).f50a.f1572b).f1113a.f3104d.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // p000.InterfaceC2647vw
    /* JADX INFO: renamed from: f */
    public int mo893f(C2644vt c2644vt) {
        return 1;
    }

    @Override // p000.InterfaceC1054Yg
    /* JADX INFO: renamed from: g */
    public Object mo235g() {
        switch (this.f2132a) {
            case 3:
                return new ArrayList();
            default:
                return new C1466gp();
        }
    }

    @Override // p000.InterfaceC2819zw
    /* JADX INFO: renamed from: i */
    public InterfaceC2389pw mo660i(InterfaceC2389pw interfaceC2389pw, C2644vt c2644vt) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((C0327Hj) ((C0026Aj) interfaceC2389pw.get()).f50a.f1572b).f1113a.f3104d.asReadOnlyBuffer();
        AtomicReference atomicReference = AbstractC2529t6.f8828a;
        C2486s6 c2486s6 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C2486s6(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (c2486s6 != null && c2486s6.f8744a == 0 && c2486s6.f8745b == ((byte[]) c2486s6.f8746c).length) {
            bArrArray = byteBufferAsReadOnlyBuffer.array();
        } else {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        }
        return new C0304H2(bArrArray);
    }

    public C0668Pg(C0649P3 c0649p3, AbstractC2805zi abstractC2805zi) {
        this.f2132a = 15;
    }
}
