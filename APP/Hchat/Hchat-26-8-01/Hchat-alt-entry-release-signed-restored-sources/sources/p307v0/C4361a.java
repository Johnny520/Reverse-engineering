package p307v0;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import gg.AbstractC1416l;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import p036c9.C0425c2;
import p062e8.C0828b;
import p065eb.C0893s0;
import p069f.C0945l0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p119i2.C1926g;
import p131j0.C2046b;
import p136j8.C2104o;
import p174m.EnumC2640p1;
import p210o8.C3087k;
import p227p4.C3315t;
import p249qg.AbstractC3603v;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p293u2.C4240j;
import p293u2.C4241k;
import p306v.C4359d;
import p315v8.C4537q;
import p321w.C4609j1;
import p321w.C4629q0;
import p322w0.C4667r;
import p322w0.C4668s;
import p332wb.C5513yo;
import p343x6.AbstractC5700d;
import p348xb.C5768n;
import p348xb.C5769o;
import p365y9.C6007c;
import p365y9.C6009e;
import p380z8.C6125a;
import p380z8.C6126b;
import p380z8.C6127c;
import p380z8.C6128d;
import p380z8.C6129e;
import p380z8.C6130f;
import p380z8.C6131g;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: v0.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4361a implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f14558g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f14559h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4361a(Object obj, int i9) {
        this.f14558g = i9;
        this.f14559h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0168  */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object[] objArr;
        int i9;
        Object c3959f;
        boolean zBooleanValue;
        Method methodM10888e;
        C6126b c6126bM10889f;
        Object c3959f2;
        boolean zBooleanValue2;
        switch (this.f14558g) {
            case 0:
                C4362b c4362b = (C4362b) this.f14559h;
                InterfaceC4370j interfaceC4370j = c4362b.f14560g;
                Object obj = c4362b.f14563j;
                if (obj != null) {
                    return interfaceC4370j.mo4774d(c4362b, obj);
                }
                C2104o.m5294t("Value should be initialized");
                return null;
            case 1:
                C3315t c3315t = ((C4369i) this.f14559h).f14578i;
                if (c3315t != null) {
                    Bundle bundleM10287n = AbstractC5700d.m10287n((C3958e[]) Arrays.copyOf(new C3958e[0], 0));
                    c3315t.m7018G(bundleM10287n);
                    if (!bundleM10287n.isEmpty()) {
                        return bundleM10287n;
                    }
                }
                return null;
            case 2:
                C4537q c4537q = (C4537q) this.f14559h;
                File file = new File(c4537q.f14971b.getCacheDir(), "Hchat_auto_message_forward");
                long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    C3010h c3010h = new C3010h(new C3011i(AbstractC4165l.m8376k0(fileArrListFiles), true, new C0893s0(jCurrentTimeMillis, c4537q, 3)));
                    while (c3010h.hasNext()) {
                        c4537q.m8955a((File) c3010h.next());
                    }
                }
                c4537q.m8962o(21600000L, new C4361a(c4537q, 2));
                return C3967n.f12976a;
            case 3:
                return (C1926g) this.f14559h;
            case 4:
                return ((C4629q0) this.f14559h).m9051d();
            case 5:
                return new C4609j1((EnumC2640p1) this.f14559h, 0.0f);
            case 6:
                return new C4240j(((C4241k) this.f14559h).m8533b());
            case 7:
                C4668s c4668s = (C4668s) this.f14559h;
                do {
                    synchronized (c4668s.f15542g) {
                        try {
                            if (!c4668s.f15538c) {
                                c4668s.f15538c = true;
                                try {
                                    C2046b c2046b = c4668s.f15541f;
                                    Object[] objArr2 = c2046b.f6891g;
                                    int i10 = c2046b.f6893i;
                                    int i11 = 0;
                                    while (i11 < i10) {
                                        C4667r c4667r = (C4667r) objArr2[i11];
                                        C0945l0 c0945l0 = c4667r.f15529g;
                                        InterfaceC1231l interfaceC1231l = c4667r.f15523a;
                                        Object[] objArr3 = c0945l0.f2976b;
                                        long[] jArr = c0945l0.f2975a;
                                        int length = jArr.length - 2;
                                        if (length >= 0) {
                                            int i12 = 0;
                                            while (true) {
                                                long j3 = jArr[i12];
                                                objArr = objArr2;
                                                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i13 = 8;
                                                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                                                    int i15 = 0;
                                                    while (i15 < i14) {
                                                        if ((j3 & 255) < 128) {
                                                            i9 = i13;
                                                            interfaceC1231l.invoke(objArr3[(i12 << 3) + i15]);
                                                        } else {
                                                            i9 = i13;
                                                        }
                                                        j3 >>= i9;
                                                        i15++;
                                                        i13 = i9;
                                                    }
                                                    if (i14 == i13) {
                                                        if (i12 != length) {
                                                            i12++;
                                                            objArr2 = objArr;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            objArr = objArr2;
                                        }
                                        c0945l0.m2329b();
                                        i11++;
                                        objArr2 = objArr;
                                    }
                                    c4668s.f15538c = false;
                                } catch (Throwable th2) {
                                    c4668s.f15538c = false;
                                    throw th2;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                } while (c4668s.m9161b());
                return C3967n.f12976a;
            case 8:
                return (C4359d) this.f14559h;
            case 9:
                C5769o c5769o = (C5769o) this.f14559h;
                AbstractC3603v.m7563q(c5769o.f23491a, null, new C5768n(c5769o, null, 2), 3);
                return C3967n.f12976a;
            case 10:
                C6009e c6009e = ((C6007c) this.f14559h).f24387e;
                boolean z9 = false;
                if (c6009e != null) {
                    if (c6009e.f24399j) {
                        z9 = true;
                    } else {
                        C3742g c3742g = c6009e.f24390a;
                        Context context = c3742g.f12143a;
                        ClassLoader classLoader = c3742g.f12145c;
                        classLoader.getClass();
                        String str = C3087k.m6557a(context, classLoader).f8202h;
                        SharedPreferences sharedPreferences = c6009e.f24398i;
                        Method methodM2087c = C0828b.m2087c(sharedPreferences, str, c3742g.f12145c, "username_bind");
                        Object obj2 = null;
                        if (methodM2087c == null) {
                            List listM10765c = c6009e.m10765c("MicroMsg.ChattingItem", "fillingUsername:need getKfInfo");
                            if (listM10765c.isEmpty()) {
                                listM10765c = c6009e.m10765c("fillingUsername:need getKfInfo");
                            }
                            Iterator it = listM10765c.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    Object next = it.next();
                                    if (c6009e.m10768i((Method) next)) {
                                        obj2 = next;
                                    }
                                }
                            }
                            methodM2087c = (Method) obj2;
                            if (methodM2087c != null) {
                                C0828b.m2092h(sharedPreferences, str, "username_bind", methodM2087c);
                            } else {
                                try {
                                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                                    if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                                        editorEdit.clear().putString("cache.key", str);
                                    }
                                    editorEdit.remove("username_bind").apply();
                                    break;
                                } catch (Throwable unused) {
                                }
                            }
                            if (methodM2087c != null) {
                                try {
                                    C3744i.f12154b.m7763b(methodM2087c, new C5513yo(c6009e, 2));
                                    c6009e.f24399j = true;
                                    z9 = true;
                                } catch (Throwable th4) {
                                    c6009e.f24392c.invoke("群员头衔Hook安装失败", th4);
                                }
                            }
                        } else {
                            if (!c6009e.m10768i(methodM2087c)) {
                                methodM2087c = null;
                            }
                            if (methodM2087c == null) {
                            }
                            if (methodM2087c != null) {
                            }
                        }
                    }
                }
                return Boolean.valueOf(z9);
            case 11:
                C6128d c6128d = ((C6125a) this.f14559h).f24688e;
                boolean z10 = false;
                if (c6128d != null) {
                    synchronized (c6128d) {
                        if (c6128d.f24700g) {
                            zBooleanValue = true;
                        } else {
                            try {
                                List listM10887d = c6128d.m10887d();
                                if (!C6128d.m10885b(listM10887d) || (methodM10888e = c6128d.m10888e()) == null || (c6126bM10889f = c6128d.m10889f()) == null) {
                                    zBooleanValue = false;
                                } else {
                                    Iterator it2 = listM10887d.iterator();
                                    while (it2.hasNext()) {
                                        C3744i.f12154b.m7763b((Method) it2.next(), new C6127c(c6128d, 0));
                                    }
                                    C3744i c3744i = C3744i.f12154b;
                                    c3744i.m7763b(c6126bM10889f.f24689a, new C0425c2(c6128d, 16, c6126bM10889f));
                                    c3744i.m7763b(methodM10888e, new C6127c(c6128d, 1));
                                    c6128d.f24700g = true;
                                    c3959f = Boolean.TRUE;
                                }
                            } catch (Throwable th5) {
                                c3959f = new C3959f(th5);
                            }
                            Throwable thM8182b = C3960g.m8182b(c3959f);
                            if (thM8182b != null) {
                                c6128d.f24695b.invoke("通话媒体限制 Hook 安装失败", thM8182b);
                                c3959f = Boolean.FALSE;
                            }
                            zBooleanValue = ((Boolean) c3959f).booleanValue();
                        }
                        break;
                    }
                    if (zBooleanValue) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            default:
                C6131g c6131g = ((C6129e) this.f14559h).f24701e;
                boolean z11 = false;
                if (c6131g != null) {
                    synchronized (c6131g) {
                        if (c6131g.f24711f) {
                            zBooleanValue2 = true;
                        } else {
                            try {
                                List listM10894e = c6131g.m10894e();
                                List<C6130f> listM10893d = c6131g.m10893d();
                                if (listM10894e.isEmpty() && listM10893d.isEmpty()) {
                                    zBooleanValue2 = false;
                                } else {
                                    Iterator it3 = listM10894e.iterator();
                                    while (it3.hasNext()) {
                                        C3744i.f12154b.m7763b((Method) it3.next(), new C5513yo(c6131g, 4));
                                    }
                                    for (C6130f c6130f : listM10893d) {
                                        C3744i.f12154b.m7763b(c6130f.f24702a, new C0425c2(c6131g, 17, c6130f));
                                    }
                                    c6131g.f24711f = true;
                                    c3959f2 = Boolean.TRUE;
                                }
                            } catch (Throwable th6) {
                                c3959f2 = new C3959f(th6);
                            }
                            Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                            if (thM8182b2 != null) {
                                c6131g.f24707b.invoke("通话铃声屏蔽 Hook 安装失败", thM8182b2);
                                c3959f2 = Boolean.FALSE;
                            }
                            zBooleanValue2 = ((Boolean) c3959f2).booleanValue();
                        }
                        break;
                    }
                    if (zBooleanValue2) {
                        z11 = true;
                    }
                }
                return Boolean.valueOf(z11);
        }
    }
}
