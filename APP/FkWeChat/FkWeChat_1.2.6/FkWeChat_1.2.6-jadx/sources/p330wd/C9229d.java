package p330wd;

import java.io.ByteArrayOutputStream;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import okhttp3.internal.url._UrlKt;
import p107h6.C2885m;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p325w8.AbstractC9202b;
import p376zd.C9995i;

/* JADX INFO: renamed from: wd.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9229d {

    /* JADX INFO: renamed from: a */
    public static final C9229d f31494a = new C9229d();

    /* JADX INFO: renamed from: wd.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f31495a;

        /* JADX INFO: renamed from: b */
        public final String f31496b;

        /* JADX INFO: renamed from: c */
        public final int f31497c;

        public a(String str, String str2, int i10) {
            str.getClass();
            str2.getClass();
            this.f31495a = str;
            this.f31496b = str2;
            this.f31497c = i10;
        }

        /* JADX INFO: renamed from: a */
        public final int m35926a() {
            return this.f31497c;
        }

        /* JADX INFO: renamed from: b */
        public final String m35927b() {
            return this.f31496b;
        }

        /* JADX INFO: renamed from: c */
        public final String m35928c() {
            return this.f31495a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final List m35922a(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        if (bArr == null || bArr.length == 0) {
            return arrayList;
        }
        C9229d c9229d = f31494a;
        byte[] bArrM35925d = c9229d.m35925d(bArr);
        if (bArrM35925d.length == 0) {
            return arrayList;
        }
        try {
            C4712s.a aVar = C4712s.f13928r;
            C2885m c2885m = new C2885m(new C9995i().write(bArrM35925d));
            long jM10481d = c2885m.m10481d();
            while (true) {
                int iM10485h = c2885m.m10485h();
                if (iM10485h == -1) {
                    c2885m.m10482e(jM10481d);
                    C4712s.m18798b(C4700i0.f13910a);
                    return arrayList;
                }
                if (iM10485h != 1) {
                    c2885m.m10494q();
                } else {
                    a aVarM35924b = c9229d.m35924b(c2885m);
                    if (aVarM35924b.m35928c().length() > 0 && (aVarM35924b.m35926a() & 2048) != 0) {
                        arrayList.add(aVarM35924b.m35928c());
                    }
                }
            }
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            C4712s.m18798b(AbstractC4713t.m18807a(th));
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Map m35923c(byte[] bArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bArr == null || bArr.length == 0) {
            return linkedHashMap;
        }
        C9229d c9229d = f31494a;
        byte[] bArrM35925d = c9229d.m35925d(bArr);
        if (bArrM35925d.length == 0) {
            return linkedHashMap;
        }
        try {
            C4712s.a aVar = C4712s.f13928r;
            C2885m c2885m = new C2885m(new C9995i().write(bArrM35925d));
            long jM10481d = c2885m.m10481d();
            while (true) {
                int iM10485h = c2885m.m10485h();
                if (iM10485h == -1) {
                    c2885m.m10482e(jM10481d);
                    C4712s.m18798b(C4700i0.f13910a);
                    return linkedHashMap;
                }
                if (iM10485h != 1) {
                    c2885m.m10494q();
                } else {
                    a aVarM35924b = c9229d.m35924b(c2885m);
                    if (aVarM35924b.m35928c().length() > 0) {
                        linkedHashMap.put(aVarM35924b.m35928c(), aVarM35924b.m35927b());
                    }
                }
            }
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            C4712s.m18798b(AbstractC4713t.m18807a(th));
            return linkedHashMap;
        }
    }

    /* JADX INFO: renamed from: b */
    public final a m35924b(C2885m c2885m) throws ProtocolException {
        long jM10481d = c2885m.m10481d();
        String strM10490m = _UrlKt.FRAGMENT_ENCODE_SET;
        int iM10492o = 0;
        String strM10490m2 = _UrlKt.FRAGMENT_ENCODE_SET;
        while (true) {
            int iM10485h = c2885m.m10485h();
            if (iM10485h == -1) {
                c2885m.m10482e(jM10481d);
                return new a(strM10490m, strM10490m2, iM10492o);
            }
            if (iM10485h == 1) {
                strM10490m = c2885m.m10490m();
            } else if (iM10485h == 2) {
                strM10490m2 = c2885m.m10490m();
            } else if (iM10485h != 3) {
                c2885m.m10494q();
            } else {
                iM10492o = c2885m.m10492o();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m35925d(byte[] bArr) {
        int iInflate;
        Inflater inflater = new Inflater();
        inflater.setInput(bArr);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
            try {
                byte[] bArr2 = new byte[1024];
                while (!inflater.finished() && ((iInflate = inflater.inflate(bArr2)) != 0 || !inflater.needsInput())) {
                    byteArrayOutputStream.write(bArr2, 0, iInflate);
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                AbstractC9202b.m35830a(byteArrayOutputStream, null);
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (Exception unused) {
            return bArr;
        } finally {
            inflater.end();
        }
    }
}
