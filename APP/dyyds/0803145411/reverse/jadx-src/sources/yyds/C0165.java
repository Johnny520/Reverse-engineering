package yyds;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛱᛷᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0165 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f986;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f987;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0119 f988;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ long f989;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0165(C0119 c0119, String str, String str2, long j, InterfaceC0274 interfaceC0274) {
        super(2, interfaceC0274);
        this.f988 = c0119;
        this.f986 = str;
        this.f987 = str2;
        this.f989 = j;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        AbstractC1544.m3189(obj);
        StringBuilder sb = new StringBuilder();
        C0119 c0119 = this.f988;
        sb.append(((C2174) c0119.f812).f10656);
        sb.append('/');
        sb.append(this.f986);
        sb.append('/');
        sb.append(this.f987);
        int i = 0;
        String strM533 = C0119.m533(sb.toString(), false);
        C2336.f11496.m4354(AbstractC2328.m4341(-579545279923054L).concat(strM533));
        C0526 c0526M550 = c0119.m550();
        c0526M550.getClass();
        Map map = Collections.EMPTY_MAP;
        String[] strArr = new String[map.size() * 2];
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            String string = AbstractC0473.m1314(str).toString();
            String string2 = AbstractC0473.m1314(str2).toString();
            AbstractC0797.m1830(string);
            AbstractC0797.m1831(string2, string);
            strArr[i] = string;
            strArr[i + 1] = string2;
            i += 2;
        }
        C1633 c1633 = new C1633();
        c1633.m3334(strM533);
        c1633.m3335("GET", null);
        C2135 c2135 = new C2135(2);
        AbstractC1432.m2927(c2135.f10556, strArr);
        c1633.f8331 = c2135;
        C2098 c2098 = new C2098(c1633);
        C1284 c1284 = c0526M550.f2527;
        c1284.getClass();
        C0837 c0837M4863 = new C2729(c1284, c2098).m4863();
        AbstractC0024.m3294(c0837M4863);
        InputStream inputStreamM1079 = c0837M4863.f3849.m1079();
        try {
            String strM1455 = AbstractC0578.m1455(new InputStreamReader(new C2705(inputStreamM1079, this.f989), AbstractC0347.f1806));
            inputStreamM1079.close();
            return strM1455;
        } finally {
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        return new C0165(this.f988, this.f986, this.f987, this.f989, interfaceC0274);
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) {
        return ((C0165) mo630((InterfaceC0990) obj, (InterfaceC0274) obj2)).mo474(C2746.f13459);
    }
}
