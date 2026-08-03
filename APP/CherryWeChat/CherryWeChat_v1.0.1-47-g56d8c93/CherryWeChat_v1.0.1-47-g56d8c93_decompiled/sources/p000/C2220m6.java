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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: m6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2220m6 implements InterfaceC1233bs, InterfaceC0579Nd, InterfaceC0879Ud, InterfaceC0627Oi, InterfaceC2500se, InterfaceC2209lw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7716a;

    public /* synthetic */ C2220m6(int i) {
        this.f7716a = i;
    }

    /* JADX INFO: renamed from: e */
    public static C2220m6 m4463e(Context context, int i) {
        AbstractC1293cr.m2545d("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0939Vu.f2945n);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 4);
        AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 9);
        AbstractC0828TB.m1643j(context, typedArrayObtainStyledAttributes, 7);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C0728Qx.m1511a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C2436r(0)).m1383a();
        typedArrayObtainStyledAttributes.recycle();
        C2220m6 c2220m6 = new C2220m6(4);
        AbstractC1293cr.m2546e(rect.left);
        AbstractC1293cr.m2546e(rect.top);
        AbstractC1293cr.m2546e(rect.right);
        AbstractC1293cr.m2546e(rect.bottom);
        return c2220m6;
    }

    /* JADX INFO: renamed from: g */
    public static ByteArrayInputStream m4464g(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4465i(C2630vf c2630vf, Editable editable, int i, int i2, boolean z) {
        int iMin;
        if (editable != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart < 0 || length < selectionStart || iMax < 0) {
                        selectionStart = -1;
                        int iMax2 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0 || iMin < selectionEnd || iMax2 < 0) {
                            iMin = -1;
                            if (selectionStart != -1 && iMin != -1) {
                            }
                        } else {
                            loop2: while (true) {
                                boolean z2 = false;
                                while (true) {
                                    if (iMax2 == 0) {
                                        iMin = selectionEnd;
                                        break loop2;
                                    }
                                    if (selectionEnd >= iMin) {
                                        if (z2) {
                                            break;
                                        }
                                    } else {
                                        char cCharAt = editable.charAt(selectionEnd);
                                        if (z2) {
                                            break;
                                        }
                                        if (!Character.isSurrogate(cCharAt)) {
                                            iMax2--;
                                            selectionEnd++;
                                        } else {
                                            if (Character.isLowSurrogate(cCharAt)) {
                                                break loop2;
                                            }
                                            selectionEnd++;
                                            z2 = true;
                                        }
                                    }
                                }
                                iMax2--;
                                selectionEnd++;
                            }
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    } else {
                        loop0: while (true) {
                            boolean z3 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart >= 0) {
                                    char cCharAt2 = editable.charAt(selectionStart);
                                    if (z3) {
                                        break;
                                    }
                                    if (!Character.isSurrogate(cCharAt2)) {
                                        iMax--;
                                    } else {
                                        if (Character.isHighSurrogate(cCharAt2)) {
                                            break loop0;
                                        }
                                        z3 = true;
                                    }
                                } else {
                                    if (z3) {
                                        break loop0;
                                    }
                                    selectionStart = 0;
                                }
                            }
                            iMax--;
                        }
                        selectionStart = -1;
                        int iMax22 = Math.max(i2, 0);
                        iMin = editable.length();
                        if (selectionEnd >= 0) {
                            iMin = -1;
                            if (selectionStart != -1) {
                            }
                        }
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i2, editable.length());
                }
                C1086ZB[] c1086zbArr = (C1086ZB[]) editable.getSpans(selectionStart, iMin, C1086ZB.class);
                if (c1086zbArr != null && c1086zbArr.length > 0) {
                    for (C1086ZB c1086zb : c1086zbArr) {
                        int spanStart = editable.getSpanStart(c1086zb);
                        int spanEnd = editable.getSpanEnd(c1086zb);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    c2630vf.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    c2630vf.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public static Map m4466j() {
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        String strM1173b = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-495110944978997L), AbstractC0295Gu.m625r(-495226909095989L));
        int length = strM1173b.length();
        C0495Lf c0495Lf = C0495Lf.f1620a;
        if (length == 0) {
            return c0495Lf;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM1173b);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            AbstractC0295Gu.m625r(-495231204063285L);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    EnumC0319Hb enumC0319HbValueOf = EnumC0319Hb.valueOf(next);
                    String string = jSONObject.getString(next);
                    if (string.length() > 0) {
                        linkedHashMap.put(enumC0319HbValueOf, string);
                    }
                } catch (Exception unused) {
                }
            }
            return linkedHashMap;
        } catch (Exception unused2) {
            return c0495Lf;
        }
    }

    /* JADX INFO: renamed from: k */
    public static List m4467k() {
        EnumC0319Hb enumC0319HbValueOf;
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        String strM1173b = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-496481039546421L), AbstractC0295Gu.m625r(-496597003663413L));
        if (strM1173b.length() == 0) {
            return AbstractC0650P4.m1316K(EnumC0319Hb.values());
        }
        try {
            List listM5065Z = AbstractC2564tz.m5065Z(strM1173b, new String[]{AbstractC0295Gu.m625r(-496601298630709L)}, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = listM5065Z.iterator();
            while (it.hasNext()) {
                try {
                    enumC0319HbValueOf = EnumC0319Hb.valueOf(AbstractC2564tz.m5070e0((String) it.next()).toString());
                } catch (Exception unused) {
                    enumC0319HbValueOf = null;
                }
                if (enumC0319HbValueOf != null) {
                    arrayList.add(enumC0319HbValueOf);
                }
            }
            return arrayList.isEmpty() ? AbstractC0650P4.m1316K(EnumC0319Hb.values()) : arrayList;
        } catch (Exception unused2) {
            return AbstractC0650P4.m1316K(EnumC0319Hb.values());
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m4468l(Map map) throws JSONException {
        AbstractC0295Gu.m625r(-495274153736245L);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            EnumC0319Hb enumC0319Hb = (EnumC0319Hb) entry.getKey();
            jSONObject.put(enumC0319Hb.name(), (String) entry.getValue());
        }
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        String strM625r = AbstractC0295Gu.m625r(-495299923540021L);
        String string = jSONObject.toString();
        AbstractC0295Gu.m625r(-494866131843125L);
        AbstractC0599Nx.m1176e(strM625r, string);
    }

    /* JADX INFO: renamed from: m */
    public static void m4469m(List list) {
        AbstractC0295Gu.m625r(-496609888565301L);
        SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
        AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-496635658369077L), AbstractC2453ra.m4901k0(list, AbstractC0295Gu.m625r(-495102355044405L), null, null, new C0223F7(23), 30));
    }

    @Override // p000.InterfaceC0627Oi
    /* JADX INFO: renamed from: a */
    public void mo1221a(AbstractActivityC2148ki abstractActivityC2148ki) {
    }

    @Override // p000.InterfaceC0879Ud
    /* JADX INFO: renamed from: b */
    public File mo1725b(InterfaceC0802Sm interfaceC0802Sm) {
        return null;
    }

    @Override // p000.InterfaceC2500se
    /* JADX INFO: renamed from: c */
    public void mo636c(InterfaceC0565N5 interfaceC0565N5, Bitmap bitmap) {
    }

    @Override // p000.InterfaceC0879Ud
    /* JADX INFO: renamed from: d */
    public void mo1726d(InterfaceC0802Sm interfaceC0802Sm, C2656w4 c2656w4) {
    }

    @Override // p000.InterfaceC2500se
    /* JADX INFO: renamed from: f */
    public void mo639f() {
    }

    /* JADX INFO: renamed from: h */
    public Object m4470h(String str, Provider provider) {
        switch (this.f7716a) {
            case 23:
                return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
            case 24:
                return provider == null ? KeyAgreement.getInstance(str) : KeyAgreement.getInstance(str, provider);
            case 25:
                return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
            case 26:
                return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
            case 27:
                return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
            case 28:
                return provider == null ? MessageDigest.getInstance(str) : MessageDigest.getInstance(str, provider);
            default:
                return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m4471n(C0649P3 c0649p3, float f) {
        C0598Nw c0598Nw = (C0598Nw) ((Drawable) c0649p3.f2089b);
        C0780S6 c0780s6 = (C0780S6) c0649p3.f2090c;
        boolean useCompatPadding = c0780s6.getUseCompatPadding();
        boolean preventCornerOverlap = c0780s6.getPreventCornerOverlap();
        if (f != c0598Nw.f1932e || c0598Nw.f1933f != useCompatPadding || c0598Nw.f1934g != preventCornerOverlap) {
            c0598Nw.f1932e = f;
            c0598Nw.f1933f = useCompatPadding;
            c0598Nw.f1934g = preventCornerOverlap;
            c0598Nw.m1171b(null);
            c0598Nw.invalidateSelf();
        }
        if (!c0780s6.getUseCompatPadding()) {
            c0649p3.m1289T(0, 0, 0, 0);
            return;
        }
        C0598Nw c0598Nw2 = (C0598Nw) ((Drawable) c0649p3.f2089b);
        float f2 = c0598Nw2.f1932e;
        float f3 = c0598Nw2.f1928a;
        int iCeil = (int) Math.ceil(AbstractC0641Ow.m1263a(f2, f3, c0780s6.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(AbstractC0641Ow.m1264b(f2, f3, c0780s6.getPreventCornerOverlap()));
        c0649p3.m1289T(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // p000.InterfaceC1233bs
    /* JADX INFO: renamed from: p */
    public InterfaceC1189as mo88p(C2428qs c2428qs) {
        return new C0872UC(1);
    }

    @Override // p000.InterfaceC0579Nd
    /* JADX INFO: renamed from: r */
    public void mo244r(EditText editText) {
        switch (this.f7716a) {
            case 6:
                Editable text = editText.getText();
                if (text == null || text.length() == 0) {
                    C1442g8 c1442g8 = C1442g8.f5046b;
                    String strM625r = AbstractC0295Gu.m625r(-246342144227381L);
                    c1442g8.getClass();
                    AbstractC0295Gu.m625r(-260897788393525L);
                    SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                    AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-260914968262709L), strM625r);
                } else {
                    C1442g8 c1442g82 = C1442g8.f5046b;
                    String string = text.toString();
                    c1442g82.getClass();
                    AbstractC0295Gu.m625r(-260897788393525L);
                    SharedPreferences sharedPreferences2 = AbstractC0599Nx.f1939a;
                    AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-260914968262709L), string);
                    AbstractC0599Nx.m1174c(AbstractC0295Gu.m625r(-246346439194677L), false);
                    AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-246440928475189L), AbstractC0295Gu.m625r(-246539712722997L));
                    AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-246544007690293L), AbstractC0295Gu.m625r(-247205432653877L));
                }
                break;
            default:
                Editable text2 = editText.getText();
                String string2 = text2 != null ? text2.toString() : null;
                if (string2 == null) {
                    string2 = AbstractC0295Gu.m625r(-247209727621173L);
                }
                SharedPreferences sharedPreferences3 = AbstractC0599Nx.f1939a;
                AbstractC0599Nx.m1176e(AbstractC0295Gu.m625r(-247214022588469L), string2);
                if (string2.length() > 0) {
                    C1442g8.f5046b.getClass();
                    C1442g8.m2761o();
                }
                C1442g8.f5046b.getClass();
                C1442g8.m2760n();
                break;
        }
    }
}
