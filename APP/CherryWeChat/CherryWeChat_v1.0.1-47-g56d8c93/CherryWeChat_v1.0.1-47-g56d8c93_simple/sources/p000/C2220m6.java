package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Selection;
import android.util.Base64;
import android.widget.EditText;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import org.json.JSONObject;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2220m6 implements InterfaceC1233bs, InterfaceC0579Nd, InterfaceC0879Ud, InterfaceC0627Oi, InterfaceC2500se, InterfaceC2209lw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7716a;

    public /* synthetic */ C2220m6(int r1) {
        this.f7716a = r1;
    }

    /* JADX INFO: renamed from: e */
    public static C2220m6 m4463e(Context r6, int r7) {
        if (r7 == 0) goto L5;
        boolean r2 = true;
    L6:
        AbstractC1293cr.m2545d("Cannot create a CalendarItemStyle with a styleResId of 0", r2);
        TypedArray r72 = r6.obtainStyledAttributes(r7, AbstractC0939Vu.f2945n);
        Rect r5 = new Rect(r72.getDimensionPixelOffset(0, 0), r72.getDimensionPixelOffset(2, 0), r72.getDimensionPixelOffset(1, 0), r72.getDimensionPixelOffset(3, 0));
        AbstractC0828TB.m1643j(r6, r72, 4);
        AbstractC0828TB.m1643j(r6, r72, 9);
        AbstractC0828TB.m1643j(r6, r72, 7);
        r72.getDimensionPixelSize(8, 0);
        C0728Qx.m1511a(r6, r72.getResourceId(5, 0), r72.getResourceId(6, 0), new C2436r(0)).m1383a();
        r72.recycle();
        C2220m6 r62 = new C2220m6(4);
        AbstractC1293cr.m2546e(r5.left);
        AbstractC1293cr.m2546e(r5.top);
        AbstractC1293cr.m2546e(r5.right);
        AbstractC1293cr.m2546e(r5.bottom);
        return r62;
    L5:
        r2 = false;
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public static ByteArrayInputStream m4464g(String r4) {
        if (r4.startsWith("data:image") == false) goto L15;
        int r0 = r4.indexOf(44);
        if (r0 == (-1)) goto L13;
        if (r4.substring(0, r0).endsWith(";base64") == false) goto L11;
        return new ByteArrayInputStream(Base64.decode(r4.substring(r0 + 1), 0));
    L11:
        throw new IllegalArgumentException("Not a base64 image data URL.");
    L13:
        throw new IllegalArgumentException("Missing comma in data URL.");
    L15:
        throw new IllegalArgumentException("Not a valid image data URL.");
    }

    /* JADX INFO: renamed from: i */
    public static boolean m4465i(C2630vf r7, Editable r8, int r9, int r10, boolean r11) {
        if (r8 == null) goto L79;
        if (r9 < 0) goto L79;
        if (r10 < 0) goto L79;
        int r1 = Selection.getSelectionStart(r8);
        int r2 = Selection.getSelectionEnd(r8);
        if (r1 == (-1)) goto L79;
        if (r2 == (-1)) goto L79;
        if (r1 != r2) goto L79;
        if (r11 == false) goto L69;
        int r92 = Math.max(r9, 0);
        int r112 = r8.length();
        if (r1 < 0) goto L19;
        if (r112 < r1) goto L19;
        if (r92 < 0) goto L19;
    L20:
        boolean r113 = false;
    L21:
        if (r92 == 0) goto L41;
        r1 = r1 - 1;
        if (r1 < 0) goto L25;
        char r5 = r8.charAt(r1);
        if (r113 == true) goto L31;
        if (Character.isSurrogate(r5) == false) goto L36;
        if (Character.isHighSurrogate(r5) == true) goto L19;
        r113 = true;
        goto L21
    L36:
        r92 = r92 - 1;
        goto L21
    L31:
        if (Character.isHighSurrogate(r5) == false) goto L19;
        r92 = r92 - 1;
        goto L20
    L25:
        if (r113 == true) goto L19;
        r1 = 0;
    L41:
        int r93 = Math.max(r10, 0);
        int r102 = r8.length();
        if (r2 < 0) goto L46;
        if (r102 < r2) goto L46;
        if (r93 < 0) goto L46;
    L47:
        boolean r114 = false;
    L48:
        if (r93 == 0) goto L49;
        if (r2 >= r102) goto L51;
        char r52 = r8.charAt(r2);
        if (r114 == true) goto L56;
        if (Character.isSurrogate(r52) == false) goto L61;
        if (Character.isLowSurrogate(r52) == true) goto L46;
        r2 = r2 + 1;
        r114 = true;
        goto L48
    L61:
        r93 = r93 - 1;
        r2 = r2 + 1;
        goto L48
    L56:
        if (Character.isLowSurrogate(r52) == false) goto L46;
        r93 = r93 - 1;
        r2 = r2 + 1;
        goto L47
    L51:
        if (r114 == true) goto L46;
    L66:
        if (r1 == (-1)) goto L79;
        if (r102 == (-1)) goto L79;
    L70:
        C1086ZB[] r94 = (C1086ZB[]) r8.getSpans(r1, r102, C1086ZB.class);
        if (r94 == null) goto L79;
        if (r94.length <= 0) goto L79;
        int r115 = r94.length;
        int r22 = 0;
    L75:
        if (r22 >= r115) goto L77;
        C1086ZB r3 = r94[r22];
        int r53 = r8.getSpanStart(r3);
        int r32 = r8.getSpanEnd(r3);
        r1 = Math.min(r53, r1);
        r102 = Math.max(r32, r102);
        r22 = r22 + 1;
        goto L75
    L77:
        int r95 = Math.max(r1, 0);
        int r103 = Math.min(r102, r8.length());
        r7.beginBatchEdit();
        r8.delete(r95, r103);
        r7.endBatchEdit();
        return true;
    L49:
        r102 = r2;
    L46:
        r102 = -1;
    L19:
        r1 = -1;
        goto L41
    L69:
        r1 = Math.max(r1 - r9, 0);
        r102 = Math.min(r2 + r10, r8.length());
    L79:
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static Map m4466j() {
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        String r02 = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-495110944978997L), AbstractC0295Gu.m625r(-495226909095989L));
        int r1 = r02.length();
        C0495Lf r2 = C0495Lf.f1620a;
        if (r1 != 0) goto L19;
        return r2;
    L19:
        JSONObject r12 = new JSONObject(r02);     // Catch: Exception -> L16
        LinkedHashMap r03 = new LinkedHashMap();     // Catch: Exception -> L16
        Iterator<String> r3 = r12.keys();     // Catch: Exception -> L16
        AbstractC0295Gu.m625r(-495231204063285L);     // Catch: Exception -> L16
    L6:
        if (r3.hasNext() == false) goto L14;
        String r4 = r3.next();     // Catch: Exception -> L16
        EnumC0319Hb r5 = EnumC0319Hb.valueOf(r4);     // Catch: Exception -> L15
        String r42 = r12.getString(r4);     // Catch: Exception -> L15
        if (r42.length() <= 0) goto L6;
        r03.put(r5, r42);     // Catch: Exception -> L15
        goto L6
    L14:
        return r03;
    L27:
        return r2;
    }

    /* JADX INFO: renamed from: k */
    public static List m4467k() {
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        String r02 = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-496481039546421L), AbstractC0295Gu.m625r(-496597003663413L));
        if (r02.length() != 0) goto L24;
        return AbstractC0650P4.m1316K(EnumC0319Hb.values());
    L24:
        List r03 = AbstractC2564tz.m5065Z(r02, new String[]{AbstractC0295Gu.m625r(-496601298630709L)}, 6);     // Catch: Exception -> L20
        ArrayList r1 = new ArrayList();     // Catch: Exception -> L20
        Iterator r04 = r03.iterator();     // Catch: Exception -> L20
    L9:
        if (r04.hasNext() == false) goto L17;
        EnumC0319Hb r2 = EnumC0319Hb.valueOf(AbstractC2564tz.m5070e0((String) r04.next()).toString());     // Catch: Exception -> L13
    L14:
        if (r2 == null) goto L9;
        r1.add(r2);     // Catch: Exception -> L20
    L13:
        r2 = null;
        goto L14
    L17:
        if (r1.isEmpty() == false) goto L31;
        return AbstractC0650P4.m1316K(EnumC0319Hb.values());
    L31:
        return r1;
    L21:
        return AbstractC0650P4.m1316K(EnumC0319Hb.values());
    }

    /* JADX INFO: renamed from: l */
    public static void m4468l(Map r3) {
        AbstractC0295Gu.m625r(-495274153736245L);
        JSONObject r0 = new JSONObject();
        Iterator r32 = r3.entrySet().iterator();
    L4:
        if (r32.hasNext() == false) goto L6;
        Map.Entry r1 = (Map.Entry) r32.next();
        EnumC0319Hb r2 = (EnumC0319Hb) r1.getKey();
        String r12 = (String) r1.getValue();
        r0.put(r2.name(), r12);
        goto L4
    L6:
        SharedPreferences r33 = AbstractC0599Nx.f1939a;
        String r34 = AbstractC0295Gu.m625r(-495299923540021L);
        String r02 = r0.toString();
        AbstractC0295Gu.m625r(-494866131843125L);
        AbstractC0599Nx.m1176e(r34, r02);
    }

    /* JADX INFO: renamed from: m */
    public static void m4469m(List r9) {
        AbstractC0295Gu.m625r(-496609888565301L);
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-496635658369077L), AbstractC2453ra.m4901k0(r9, AbstractC0295Gu.m625r(-495102355044405L), null, null, new C0223F7(23), 30));
    }

    @Override // p000.InterfaceC0627Oi
    /* JADX INFO: renamed from: a */
    public void mo1221a(AbstractActivityC2148ki r1) {
    }

    @Override // p000.InterfaceC0879Ud
    /* JADX INFO: renamed from: b */
    public File mo1725b(InterfaceC0802Sm r1) {
        return null;
    }

    @Override // p000.InterfaceC2500se
    /* JADX INFO: renamed from: c */
    public void mo636c(InterfaceC0565N5 r1, Bitmap r2) {
    }

    @Override // p000.InterfaceC0879Ud
    /* JADX INFO: renamed from: d */
    public void mo1726d(InterfaceC0802Sm r1, C2656w4 r2) {
    }

    @Override // p000.InterfaceC2500se
    /* JADX INFO: renamed from: f */
    public void mo639f() {
    }

    /* JADX INFO: renamed from: h */
    public Object m4470h(String r2, Provider r3) {
        switch(this.f7716a) {
            case 23: goto L28;
            case 24: goto L24;
            case 25: goto L20;
            case 26: goto L16;
            case 27: goto L12;
            case 28: goto L8;
            default: goto L4;
        };
    L4:
        if (r3 != null) goto L7;
        return Signature.getInstance(r2);
    L7:
        return Signature.getInstance(r2, r3);
    L8:
        if (r3 != null) goto L11;
        return MessageDigest.getInstance(r2);
    L11:
        return MessageDigest.getInstance(r2, r3);
    L12:
        if (r3 != null) goto L15;
        return Mac.getInstance(r2);
    L15:
        return Mac.getInstance(r2, r3);
    L16:
        if (r3 != null) goto L19;
        return KeyPairGenerator.getInstance(r2);
    L19:
        return KeyPairGenerator.getInstance(r2, r3);
    L20:
        if (r3 != null) goto L23;
        return KeyFactory.getInstance(r2);
    L23:
        return KeyFactory.getInstance(r2, r3);
    L24:
        if (r3 != null) goto L27;
        return KeyAgreement.getInstance(r2);
    L27:
        return KeyAgreement.getInstance(r2, r3);
    L28:
        if (r3 != null) goto L31;
        return Cipher.getInstance(r2);
    L31:
        return Cipher.getInstance(r2, r3);
    }

    /* JADX INFO: renamed from: n */
    public void m4471n(C0649P3 r6, float r7) {
        C0598Nw r0 = (C0598Nw) ((Drawable) r6.f2089b);
        C0780S6 r1 = (C0780S6) r6.f2090c;
        boolean r2 = r1.getUseCompatPadding();
        boolean r3 = r1.getPreventCornerOverlap();
        if (r7 == r0.f1932e) goto L5;
    L9:
        r0.f1932e = r7;
        r0.f1933f = r2;
        r0.f1934g = r3;
        r0.m1171b(null);
        r0.invalidateSelf();
    L11:
        if (r1.getUseCompatPadding() == true) goto L14;
        r6.m1289T(0, 0, 0, 0);
        return;
    L14:
        C0598Nw r72 = (C0598Nw) ((Drawable) r6.f2089b);
        float r02 = r72.f1932e;
        float r73 = r72.f1928a;
        int r22 = (int) Math.ceil(AbstractC0641Ow.m1263a(r02, r73, r1.getPreventCornerOverlap()));
        int r74 = (int) Math.ceil(AbstractC0641Ow.m1264b(r02, r73, r1.getPreventCornerOverlap()));
        r6.m1289T(r22, r74, r22, r74);
        return;
    L5:
        if (r0.f1933f != r2) goto L9;
        if (r0.f1934g != r3) goto L9;
        goto L9
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs r2) {
        return new C0872UC(1);
    }

    @Override // p000.InterfaceC0579Nd
    /* JADX INFO: renamed from: r */
    public void mo244r(EditText r7) {
        switch(this.f7716a) {
            case 6: goto L15;
            default: goto L4;
        };
    L4:
        Editable r72 = r7.getText();
        if (r72 == null) goto L7;
        String r73 = r72.toString();
    L8:
        if (r73 != null) goto L10;
        r73 = AbstractC0295Gu.m625r(-247209727621173L);
    L10:
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-247214022588469L), r73);
        if (r73.length() <= 0) goto L13;
        C1442g8.f5046b.getClass();
        C1442g8.m2761o();
    L13:
        C1442g8.f5046b.getClass();
        C1442g8.m2760n();
        return;
    L7:
        r73 = null;
        goto L8
    L15:
        Editable r74 = r7.getText();
        if (r74 != null) goto L18;
    L21:
        C1442g8 r75 = C1442g8.f5046b;
        String r4 = AbstractC0295Gu.m625r(-246342144227381L);
        r75.getClass();
        AbstractC0295Gu.m625r(-260897788393525L);
        SharedPreferences r76 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-260914968262709L), r4);
        return;
    L18:
        if (r74.length() == 0) goto L21;
        C1442g8 r42 = C1442g8.f5046b;
        String r77 = r74.toString();
        r42.getClass();
        AbstractC0295Gu.m625r(-260897788393525L);
        SharedPreferences r2 = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-260914968262709L), r77);
        AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-246346439194677L), false);
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-246440928475189L), AbstractC0295Gu.m625r(-246539712722997L));
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-246544007690293L), AbstractC0295Gu.m625r(-247205432653877L));
    }
}
