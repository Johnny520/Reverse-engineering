package yyds;

import android.app.Dialog;
import android.view.ViewGroup;
import com.bytedance.im.core.model.Message;
import com.thegrizzlylabs.sardineandroid.model.Allprop;
import com.thegrizzlylabs.sardineandroid.model.Propfind;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Pair;

/* JADX INFO: renamed from: yyds.ᛴᛵᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0853 extends AbstractC1861 implements InterfaceC0477 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f3919;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3920;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0853(Object obj, InterfaceC0274 interfaceC0274, int i) {
        super(2, interfaceC0274);
        this.f3920 = i;
        this.f3919 = obj;
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final Object mo474(Object obj) throws Exception {
        C0811 c0811M4948;
        int i = this.f3920;
        C0811 c0811M49482 = null;
        int i2 = 0;
        C1860 c1860 = C1860.f9345;
        C2746 c2746 = C2746.f13459;
        Object obj2 = this.f3919;
        switch (i) {
            case 0:
                AbstractC1544.m3189(obj);
                StringBuilder sb = new StringBuilder(AbstractC2328.m4341(-125794870002542L));
                C1509.f7142.getClass();
                sb.append(C1509.m3131());
                String string = sb.toString();
                String string2 = AbstractC0027.m3912().getString(string, AbstractC2328.m4341(-125889359283054L));
                if (string2 == null) {
                    string2 = AbstractC2328.m4341(-125893654250350L);
                }
                if (string2.length() > 0) {
                    try {
                        return C0184.m761(string2);
                    } catch (Exception e) {
                        C2336.f11496.m4358(AbstractC2328.m4341(-125897949217646L), e);
                    }
                }
                C1509.f7142.getClass();
                String strM4341 = C1509.m3131() == 2 ? AbstractC2328.m4341(-125949488825198L) : AbstractC2328.m4341(-126112697582446L);
                C1633 c1633 = new C1633();
                c1633.m3334(strM4341);
                C2098 c2098 = new C2098(c1633);
                C1327 c1327 = C1327.f6093;
                C1284 c1284M2619 = C1327.m2619();
                c1284M2619.getClass();
                C0837 c0837M4863 = new C2729(c1284M2619, c2098).m4863();
                if (!c0837M4863.f3852) {
                    throw new Exception(AbstractC2328.m4341(-126250136535918L) + c0837M4863.f3860);
                }
                String strM1080 = c0837M4863.f3849.m1080();
                Object obj3 = c1860;
                if (strM1080.length() > 0) {
                    ArrayList arrayListM761 = C0184.m761(strM1080);
                    boolean zIsEmpty = arrayListM761.isEmpty();
                    obj3 = arrayListM761;
                    if (!zIsEmpty) {
                        AbstractC0027.m3912().putString(string, strM1080);
                        obj3 = arrayListM761;
                    }
                }
                return obj3;
            case 1:
                AbstractC1544.m3189(obj);
                C2701 c2701 = C2701.f13261;
                C1221 c1221 = C1221.f5600;
                StringBuilder sb2 = new StringBuilder(AbstractC2328.m4341(-985479818937198L));
                Message message = (Message) obj2;
                sb2.append(message.getMsgId());
                String string3 = sb2.toString();
                String strM43412 = AbstractC2328.m4341(-985518473642862L);
                c1221.getClass();
                String strM2480 = C1221.m2480(string3, strM43412);
                c2701.getClass();
                File fileM4805 = C2701.m4805(strM2480);
                if (!fileM4805.exists()) {
                    AtomicLong atomicLong = AbstractC1108.f5116;
                    AbstractC2328.m4341(-383325404037998L);
                    AbstractC2667.m4760(fileM4805, AbstractC2797.m4923().m515(message));
                }
                AbstractC1960.m3789(AbstractC2328.m4341(-985539948479342L));
                return c2746;
            case 2:
                AbstractC1544.m3189(obj);
                C2701.f13261.getClass();
                C2701.m4792((C1829) obj2);
                return c2746;
            case 3:
                List list = (List) obj2;
                AbstractC1544.m3189(obj);
                try {
                    StringBuilder sb3 = new StringBuilder(AbstractC2328.m4341(-612792621761390L));
                    if (!list.isEmpty()) {
                        sb3.append(AbstractC2328.m4341(-612895700976494L));
                        for (Object obj4 : list) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                AbstractC2725.m4853();
                                throw null;
                            }
                            String str = (String) obj4;
                            if (i2 > 0) {
                                sb3.append(AbstractC2328.m4341(-612904290911086L));
                            }
                            sb3.append(AbstractC2328.m4341(-612912880845678L) + str);
                            i2 = i3;
                        }
                    }
                    URL url = new URL(sb3.toString());
                    C2336 c2336 = C2336.f11496;
                    c2336.m4354(AbstractC2328.m4341(-612925765747566L) + url);
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    AbstractC2328.m4341(-612968715420526L);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    httpURLConnection.setRequestMethod(AbstractC2328.m4341(-613243593327470L));
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        c2336.m4354(AbstractC2328.m4341(-613329492673390L) + responseCode);
                        return null;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), AbstractC2328.m4341(-613260773196654L)));
                    try {
                        String strM1455 = AbstractC0578.m1455(bufferedReader);
                        bufferedReader.close();
                        c2336.m4354(AbstractC2328.m4341(-613286543000430L) + strM1455);
                        C0114 c0114 = C2699.f13255;
                        c0114.getClass();
                        return (C0252) c0114.m517(strM1455, new C2805(C0252.class));
                    } finally {
                    }
                } catch (Exception e2) {
                    C2336.f11496.m4355(AbstractC2328.m4341(-613398212150126L), e2);
                    return null;
                }
            case 4:
                AbstractC1544.m3189(obj);
                ((ViewGroup) obj2).setVisibility(8);
                return c2746;
            case 5:
                AbstractC1544.m3189(obj);
                Dialog dialog = ((C0832) obj2).f3811;
                try {
                    if (dialog.isShowing()) {
                        dialog.dismiss();
                    }
                    break;
                } catch (Throwable unused) {
                }
                return c2746;
            case 6:
                AbstractC1544.m3189(obj);
                C2590 c2590 = C1186.f5426;
                C2592.f12774.getClass();
                return C2592.m4658();
            case 7:
                AbstractC1544.m3189(obj);
                if (!(obj2 instanceof C2658)) {
                    AbstractC1960.m3789(AbstractC2328.m4341(-124768372818798L));
                }
                Throwable thM4249 = C2248.m4249(obj2);
                if (thM4249 != null && !(thM4249 instanceof C0742)) {
                    C2336.f11496.m4358(AbstractC2328.m4341(-124815617459054L), thM4249);
                    String message2 = thM4249.getMessage();
                    if (message2 == null) {
                        message2 = AbstractC2328.m4341(-124862862099310L);
                    }
                    AbstractC1960.m3789(message2);
                }
                return c2746;
            case 8:
                AbstractC1544.m3189(obj);
                ((C0892) obj2).mo371(Boolean.FALSE);
                return c2746;
            case 9:
                AbstractC1544.m3189(obj);
                ((C0061) obj2).mo371(Boolean.FALSE);
                return c2746;
            case 10:
                AbstractC1544.m3189(obj);
                ((C1279) obj2).mo371(c1860);
                return c2746;
            case 11:
                AbstractC1544.m3189(obj);
                ((C0046) obj2).mo371(c1860);
                return c2746;
            case 12:
                AbstractC1544.m3189(obj);
                ((C1584) obj2).mo371(new Integer(0));
                return c2746;
            case 13:
                AbstractC1544.m3189(obj);
                ((C0238) obj2).mo371(new Integer(0));
                return c2746;
            case 14:
                AbstractC1544.m3189(obj);
                ((C1279) obj2).mo371(new C1404(0, 0, 0, 0));
                return c2746;
            case 15:
                AbstractC1544.m3189(obj);
                ((C1785) obj2).mo371(c1860);
                return c2746;
            case 16:
                AbstractC1544.m3189(obj);
                ((InterfaceC1549) obj2).mo371(c1860);
                return c2746;
            case 17:
                AbstractC1544.m3189(obj);
                ((C2732) obj2).mo371(Boolean.FALSE);
                return c2746;
            default:
                AbstractC1544.m3189(obj);
                C0119 c0119 = (C0119) obj2;
                String strM533 = C0119.m533(((C2174) c0119.f812).f10656, true);
                C2336.f11496.m4354(AbstractC2328.m4341(-572540188263278L).concat(strM533));
                C0526 c0526M550 = c0119.m550();
                c0526M550.getClass();
                Propfind propfind = new Propfind();
                propfind.setAllprop(new Allprop());
                C0051 c0051 = C0811.f3734;
                try {
                    c0811M4948 = C2810.m4948("text/xml");
                } catch (IllegalArgumentException unused2) {
                    c0811M4948 = null;
                }
                String[] strArr = AbstractC2515.f12415;
                StringWriter stringWriter = new StringWriter();
                try {
                    AbstractC2515.m4559().write(propfind, stringWriter);
                    String string4 = stringWriter.toString();
                    Charset charset = AbstractC0347.f1806;
                    if (c0811M4948 != null) {
                        Charset charsetM1865 = C0811.m1865(c0811M4948);
                        if (charsetM1865 == null) {
                            try {
                                c0811M49482 = C2810.m4948(c0811M4948 + "; charset=utf-8");
                                break;
                            } catch (IllegalArgumentException unused3) {
                            }
                            c0811M4948 = c0811M49482;
                        } else {
                            charset = charsetM1865;
                        }
                    }
                    Pair pair = new Pair(charset, c0811M4948);
                    Charset charset2 = (Charset) pair.component1();
                    C0811 c0811 = (C0811) pair.component2();
                    byte[] bytes = string4.getBytes(charset2);
                    int length = bytes.length;
                    AbstractC1429.m2917(bytes.length, 0L, length);
                    C0610 c0610 = new C0610(c0811, length, bytes);
                    C1633 c16332 = new C1633();
                    c16332.m3334(strM533);
                    ((C2135) c16332.f8331).m4070("Depth", Integer.toString(1));
                    c16332.m3335("PROPFIND", c0610);
                    C2098 c20982 = new C2098(c16332);
                    C1985 c1985 = new C1985(23);
                    C1284 c1284 = c0526M550.f2527;
                    c1284.getClass();
                    return (List) c1985.m3849(new C2729(c1284, c20982).m4863());
                } catch (Exception e3) {
                    C1693.m3442(e3.getMessage(), e3);
                    return null;
                }
        }
    }

    @Override // yyds.AbstractC0332
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final InterfaceC0274 mo630(Object obj, InterfaceC0274 interfaceC0274) {
        int i = this.f3920;
        Object obj2 = this.f3919;
        switch (i) {
            case 0:
                return new C0853((C0184) obj2, interfaceC0274, 0);
            case 1:
                return new C0853((Message) obj2, interfaceC0274, 1);
            case 2:
                return new C0853((C1829) obj2, interfaceC0274, 2);
            case 3:
                return new C0853((List) obj2, interfaceC0274, 3);
            case 4:
                return new C0853((ViewGroup) obj2, interfaceC0274, 4);
            case 5:
                return new C0853((C0832) obj2, interfaceC0274, 5);
            case 6:
                return new C0853((C1186) obj2, interfaceC0274, 6);
            case 7:
                return new C0853(obj2, interfaceC0274, 7);
            case 8:
                return new C0853((C0892) obj2, interfaceC0274, 8);
            case 9:
                return new C0853((C0061) obj2, interfaceC0274, 9);
            case 10:
                return new C0853((C1279) obj2, interfaceC0274, 10);
            case 11:
                return new C0853((C0046) obj2, interfaceC0274, 11);
            case 12:
                return new C0853((C1584) obj2, interfaceC0274, 12);
            case 13:
                return new C0853((C0238) obj2, interfaceC0274, 13);
            case 14:
                return new C0853((C1279) obj2, interfaceC0274, 14);
            case 15:
                return new C0853((C1785) obj2, interfaceC0274, 15);
            case 16:
                return new C0853((InterfaceC1549) obj2, interfaceC0274, 16);
            case 17:
                return new C0853((C2732) obj2, interfaceC0274, 17);
            default:
                return new C0853((C0119) obj2, interfaceC0274, 18);
        }
    }

    @Override // yyds.InterfaceC0477
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final Object mo511(Object obj, Object obj2) throws Exception {
        int i = this.f3920;
        C2746 c2746 = C2746.f13459;
        InterfaceC0990 interfaceC0990 = (InterfaceC0990) obj;
        InterfaceC0274 interfaceC0274 = (InterfaceC0274) obj2;
        switch (i) {
            case 0:
                return ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
            case 1:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 2:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 3:
                return ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
            case 4:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 5:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 6:
                return ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
            case 7:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 8:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 9:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 10:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 11:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 12:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 13:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 14:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 15:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 16:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            case 17:
                ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
                return c2746;
            default:
                return ((C0853) mo630(interfaceC0990, interfaceC0274)).mo474(c2746);
        }
    }
}
