package yyds;

import com.thegrizzlylabs.sardineandroid.model.Allprop;
import com.thegrizzlylabs.sardineandroid.model.Propfind;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛱᲀᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0196 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ C0119 f1159;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f1160;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f1161;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ String f1162;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0196(C0119 c0119, String str, String str2, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f1161 = i;
        this.f1159 = c0119;
        this.f1160 = str;
        this.f1162 = str2;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Throwable {
        C0811 c0811M4948;
        int i = this.f1161;
        String str = this.f1162;
        String str2 = this.f1160;
        C0119 c0119 = this.f1159;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                String strM533 = C0119.m533(((C2174) c0119.f812).f10656 + '/' + str2 + '/' + str, false);
                C2336.f11496.m4354(AbstractC2328.m4341(-600878382482286L).concat(strM533));
                C0526 c0526M550 = c0119.m550();
                c0526M550.getClass();
                C1633 c1633 = new C1633();
                c1633.m3334(strM533);
                c1633.m3335("DELETE", AbstractC0659.f3149);
                C2098 c2098 = new C2098(c1633);
                C1284 c1284 = c0526M550.f2527;
                c1284.getClass();
                AbstractC0024.m3294(new C2729(c1284, c2098).m4863());
                return C2746.f13459;
            default:
                AbstractC1544.m3189(obj);
                String strM5332 = C0119.m533(((C2174) c0119.f812).f10656 + '/' + str2 + '/' + str, false);
                C2336.f11496.m4354(AbstractC2328.m4341(-620849980408686L).concat(strM5332));
                C0526 c0526M5502 = c0119.m550();
                c0526M5502.getClass();
                Propfind propfind = new Propfind();
                propfind.setAllprop(new Allprop());
                C0051 c0051 = C0811.f3734;
                try {
                    c0811M4948 = C2810.m4948("text/xml");
                } catch (IllegalArgumentException unused) {
                    c0811M4948 = null;
                }
                String[] strArr = AbstractC2515.f12415;
                StringWriter stringWriter = new StringWriter();
                try {
                    AbstractC2515.m4559().write(propfind, stringWriter);
                    String string = stringWriter.toString();
                    Charset charset = AbstractC0347.f1806;
                    if (c0811M4948 != null) {
                        Charset charsetM1865 = C0811.m1865(c0811M4948);
                        if (charsetM1865 == null) {
                            try {
                                c0811M4948 = C2810.m4948(c0811M4948 + "; charset=utf-8");
                            } catch (IllegalArgumentException unused2) {
                                c0811M4948 = null;
                            }
                        } else {
                            charset = charsetM1865;
                        }
                        break;
                    }
                    Pair pair = new Pair(charset, c0811M4948);
                    Charset charset2 = (Charset) pair.component1();
                    C0811 c0811 = (C0811) pair.component2();
                    byte[] bytes = string.getBytes(charset2);
                    int length = bytes.length;
                    AbstractC1429.m2917(bytes.length, 0L, length);
                    C0610 c0610 = new C0610(c0811, length, bytes);
                    C1633 c16332 = new C1633();
                    c16332.m3334(strM5332);
                    ((C2135) c16332.f8331).m4070("Depth", Integer.toString(1));
                    c16332.m3335("PROPFIND", c0610);
                    C2098 c20982 = new C2098(c16332);
                    C1985 c1985 = new C1985(23);
                    C1284 c12842 = c0526M5502.f2527;
                    c12842.getClass();
                    List list = (List) c1985.m3849(new C2729(c12842, c20982).m4863());
                    if (list.isEmpty()) {
                        return null;
                    }
                    return AbstractC1595.m3280(list);
                } catch (Exception e) {
                    C1693.m3442(e.getMessage(), e);
                    return null;
                }
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        switch (this.f1161) {
            case 0:
                return new C0196(this.f1159, this.f1160, this.f1162, interfaceC0274, 0);
            default:
                return new C0196(this.f1159, this.f1160, this.f1162, interfaceC0274, 1);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Throwable {
        int i = this.f1161;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                ((C0196) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            default:
                return ((C0196) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
        }
    }
}
