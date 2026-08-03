package p014b;

import android.content.ContentValues;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.WindowInsetsAnimation;
import bsh.C0353j;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.regex.Pattern;
import md.AbstractC2828e;
import md.InterfaceC2832i;
import nc.C2958a;
import nc.C2959b;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p002a1.RunnableC0006d;
import p003a2.C0014a;
import p011ab.C0045e;
import p012ah.C0086a;
import p015b0.C0136d0;
import p018b3.C0171a;
import p025bc.AbstractC0255e;
import p035c8.C0412a;
import p036c9.C0415a0;
import p068eh.AbstractC0921a;
import p069f.C0943k0;
import p069f.C0956r;
import p080fb.C1103b;
import p080fb.C1156o0;
import p080fb.C1160p0;
import p080fb.C1164q0;
import p080fb.C1167r;
import p080fb.C1168r0;
import p081fc.C1203f;
import p082fd.C1204a;
import p082fd.C1208e;
import p085fg.InterfaceC1235p;
import p089g1.C1275d;
import p092g4.AbstractC1341a;
import p092g4.C1342b;
import p092g4.C1343c;
import p092g4.C1344d;
import p092g4.C1345e;
import p092g4.C1346f;
import p092g4.C1349i;
import p092g4.C1350j;
import p099h.Hchat.hooks.api.model.WeChatChatroom;
import p110hc.InterfaceC1705b;
import p117i0.AbstractC1874r;
import p117i0.InterfaceC1827f;
import p119i2.AbstractC1923e0;
import p119i2.C1926g;
import p119i2.C1939m0;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p141jf.C2128d;
import p147k2.InterfaceC2237d;
import p149k4.C2240b;
import p150k5.C2263n;
import p152k7.AbstractC2331a;
import p159l0.C2429k;
import p162l3.C2467u;
import p162l3.C2468v;
import p162l3.C2469w;
import p162l3.C2471y;
import p162l3.InterfaceC2461o;
import p163l4.C2474c;
import p167l8.C2526a;
import p172lg.C2563c;
import p172lg.C2564d;
import p175m0.InterfaceC2703k0;
import p182m7.C2790c;
import p182m7.C2791d;
import p182m7.C2807t;
import p190n2.C2884s;
import p190n2.InterfaceC2872g;
import p214oc.C3126c;
import p215od.C3128a;
import p215od.C3130c;
import p218og.AbstractC3149m;
import p232pc.C3382d;
import p246qd.AbstractC3506j;
import p257r7.C3711a;
import p257r7.InterfaceC3717g;
import p259r9.AbstractC3754e0;
import p266s0.C3871a;
import p276sf.C3959f;
import p276sf.C3960g;
import p279t1.C4084d;
import p281t3.AbstractC4106c;
import p282t4.C4114a;
import p282t4.C4115b;
import p282t4.C4116c;
import p282t4.C4117d;
import p302ud.C4309e;
import p302ud.C4322r;
import p302ud.C4325u;
import p311v4.AbstractC4446a;
import p311v4.C4448b;
import p311v4.C4449b0;
import p311v4.C4450c;
import p311v4.C4451c0;
import p311v4.C4452d;
import p311v4.C4453d0;
import p311v4.C4455e0;
import p311v4.C4456f;
import p311v4.C4458g;
import p311v4.C4461j;
import p311v4.C4462k;
import p311v4.C4463l;
import p311v4.C4465n;
import p311v4.C4466o;
import p311v4.C4473v;
import p311v4.C4477z;
import p326w4.C4683c;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;
import p351xe.C5796q;
import p376z4.C6087a;
import p376z4.C6088b;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4164k;

/* JADX INFO: renamed from: b.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0126e implements InterfaceC1827f, InterfaceC1705b, InterfaceC2237d, InterfaceC2461o, InterfaceC2703k0, InterfaceC3717g {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f331g;

    /* JADX INFO: renamed from: h */
    public Object f332h;

    /* JADX INFO: renamed from: i */
    public Object f333i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0126e(ArrayList arrayList, C1103b c1103b) {
        this.f331g = 4;
        ArrayList<C1168r0> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((C1168r0) obj).f3899c) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
        for (C1168r0 c1168r0 : arrayList2) {
            c1168r0.getClass();
            String lowerCase = c1168r0.f3898b.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Pattern patternCompile = Pattern.compile("[^a-z0-9_-]+");
            patternCompile.getClass();
            String strReplaceAll = patternCompile.matcher(lowerCase).replaceAll("_");
            strReplaceAll.getClass();
            String strM6701P0 = AbstractC3149m.m6701P0(24, AbstractC3149m.m6704S0(strReplaceAll, '_'));
            strM6701P0 = AbstractC3149m.m6721t0(strM6701P0) ? "server" : strM6701P0;
            String str = c1168r0.f3897a;
            Pattern patternCompile2 = Pattern.compile("[^A-Za-z0-9]+");
            patternCompile2.getClass();
            String strReplaceAll2 = patternCompile2.matcher(str).replaceAll(HttpUrl.FRAGMENT_ENCODE_SET);
            strReplaceAll2.getClass();
            String strM6701P02 = AbstractC3149m.m6701P0(10, strReplaceAll2);
            if (AbstractC3149m.m6721t0(strM6701P02)) {
                strM6701P02 = "mcp";
            }
            arrayList3.add(new C1160p0(c1168r0, AbstractC4855en.m9264h(strM6701P0, "_", strM6701P02), new C1156o0(c1168r0.f3900d, c1168r0.f3901e, c1103b)));
        }
        this.f332h = AbstractC4166m.m8402K1(arrayList3, new C0415a0(new C1167r(6), 11));
        this.f333i = new LinkedHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public C4116c m621A(int i9) {
        C6087a c6087a = (C6087a) this.f333i;
        try {
            int unsignedByte = c6087a.readUnsignedByte();
            C4116c c4116c = new C4116c(unsignedByte);
            for (int i10 = 0; i10 < unsignedByte; i10++) {
                int unsignedShort = c6087a.readUnsignedShort();
                C4115b c4115b = new C4115b();
                for (int i11 = 0; i11 < unsignedShort; i11++) {
                    c4115b.m8313l(m646x(i9));
                }
                c4115b.f24613g = false;
                c4115b.m10856k();
                c4116c.m10841m(i10, c4115b);
            }
            c4116c.f24613g = false;
            if (c6087a.available() == 0) {
                return c4116c;
            }
            throw new C2474c("extra data in attribute", null);
        } catch (IOException e6) {
            C0086a.m457p("shouldn't happen", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public AbstractC4446a m622B() throws IOException {
        C4455e0 c4455e0 = (C4455e0) this.f332h;
        C6087a c6087a = (C6087a) this.f333i;
        int unsignedByte = c6087a.readUnsignedByte();
        if (unsignedByte == 64) {
            return new C4448b(m646x(4));
        }
        if (unsignedByte == 70) {
            return (C4465n) m648z();
        }
        if (unsignedByte == 83) {
            int i9 = ((C4466o) m648z()).f14817g;
            short s10 = (short) i9;
            if (s10 == i9) {
                return new C4449b0(s10);
            }
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "bogus short value: "));
            return null;
        }
        if (unsignedByte == 99) {
            return new C4453d0(C4683c.m9184o(((C4451c0) c4455e0.m8906l(c6087a.readUnsignedShort())).f14760g));
        }
        if (unsignedByte == 101) {
            m623C(4);
            int unsignedShort = c6087a.readUnsignedShort();
            C4477z c4477z = new C4477z((C4451c0) c4455e0.m8906l(c6087a.readUnsignedShort()), (C4451c0) c4455e0.m8906l(unsignedShort));
            C4463l c4463l = new C4463l(new C4453d0(c4477z.m8917k()), c4477z);
            c4463l.f14797i = null;
            return c4463l;
        }
        if (unsignedByte == 115) {
            return m648z();
        }
        if (unsignedByte == 73) {
            return (C4466o) m648z();
        }
        if (unsignedByte == 74) {
            return (C4473v) m648z();
        }
        if (unsignedByte == 90) {
            return C4456f.m8907n(((C4466o) m648z()).f14817g);
        }
        if (unsignedByte == 91) {
            m623C(2);
            int unsignedShort2 = c6087a.readUnsignedShort();
            C4450c c4450c = new C4450c(unsignedShort2);
            for (int i10 = 0; i10 < unsignedShort2; i10++) {
                c4450c.m10841m(i10, m622B());
            }
            c4450c.f24613g = false;
            return new C4452d(c4450c);
        }
        switch (unsignedByte) {
            case 66:
                int i11 = ((C4466o) m648z()).f14817g;
                byte b10 = (byte) i11;
                if (b10 == i11) {
                    return new C4458g(b10);
                }
                C2104o.m5294t(AbstractC0921a.m2249l(i11, "bogus byte value: "));
                return null;
            case 67:
                int i12 = ((C4466o) m648z()).f14817g;
                char c10 = (char) i12;
                if (c10 == i12) {
                    return new C4461j(c10);
                }
                C2104o.m5294t(AbstractC0921a.m2249l(i12, "bogus char value: "));
                return null;
            case 68:
                return (C4462k) m648z();
            default:
                throw new C2474c("unknown annotation tag: ".concat(AbstractC0000a.m44W0(unsignedByte)), null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public void m623C(int i9) {
        if (((C6087a) this.f333i).available() < i9) {
            throw new C2474c("truncated annotation attribute", null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p162l3.InterfaceC2461o
    /* JADX INFO: renamed from: a */
    public boolean mo624a(CharSequence charSequence, int i9, int i10, C2467u c2467u) {
        if ((c2467u.f8097c & 4) > 0) {
            return true;
        }
        if (((C2471y) this.f332h) == null) {
            this.f332h = new C2471y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C0014a) this.f333i).getClass();
        ((C2471y) this.f332h).setSpan(new C2468v(c2467u), i9, i10, 33);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147k2.InterfaceC2237d
    /* JADX INFO: renamed from: b */
    public int mo625b(int i9) {
        CharSequence charSequence = (CharSequence) this.f332h;
        do {
            i9 = ((C0412a) this.f333i).m1380i(i9);
            if (i9 == -1 || i9 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i9)));
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147k2.InterfaceC2237d
    /* JADX INFO: renamed from: c */
    public int mo626c(int i9) {
        do {
            i9 = ((C0412a) this.f333i).m1381j(i9);
            if (i9 == -1 || i9 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f332h).charAt(i9 - 1)));
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p117i0.InterfaceC1827f
    public void cancel() {
        switch (this.f331g) {
            case 0:
                C0127f c0127f = (C0127f) this.f333i;
                C4164k c4164k = (C4164k) c0127f.f336c;
                C0128g c0128g = (C0128g) this.f332h;
                c4164k.remove(c0128g);
                c0128g.f339a.remove(this);
                if (Build.VERSION.SDK_INT >= 33) {
                    c0127f.m652d();
                }
                break;
            default:
                if (!((C3871a) this.f333i).compareAndSet(1, 1)) {
                    ((C0045e) this.f332h).invoke();
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p162l3.InterfaceC2461o
    /* JADX INFO: renamed from: e */
    public Object mo627e() {
        return (C2471y) this.f332h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.InterfaceC2703k0
    /* JADX INFO: renamed from: f */
    public List mo628f(Integer num) {
        List listMo628f = ((InterfaceC2703k0) this.f332h).mo628f(null);
        C2429k c2429k = (C2429k) this.f333i;
        int i9 = c2429k.f7984v;
        return i9 < 0 ? listMo628f : AbstractC4166m.m8397F1(AbstractC1341a.m3592h(c2429k, num, i9, Integer.valueOf(c2429k.m5799E(c2429k.f7964b, i9))), listMo628f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147k2.InterfaceC2237d
    /* JADX INFO: renamed from: g */
    public int mo629g(int i9) {
        do {
            i9 = ((C0412a) this.f333i).m1381j(i9);
            if (i9 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f332h).charAt(i9)));
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    public int get() {
        C3711a c3711a = (C3711a) this.f333i;
        int i9 = c3711a.f12074o;
        if (i9 >= 20 || ((C2807t) this.f332h).f9067s.f12074o == 0) {
            return i9;
        }
        c3711a.mo633k(20);
        return 20;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p147k2.InterfaceC2237d
    /* JADX INFO: renamed from: h */
    public int mo630h(int i9) {
        do {
            i9 = ((C0412a) this.f333i).m1380i(i9);
            if (i9 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.f332h).charAt(i9 - 1)));
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public void m631i(InterfaceC2832i interfaceC2832i, C1203f c1203f) {
        C3382d c3382d = (C3382d) ((AbstractC2828e) interfaceC2832i).f9217g.mo6237c(C3126c.f10128a);
        if (c3382d != null) {
            HashMap map = c3382d.f10916g;
            if (map.isEmpty()) {
                return;
            }
            for (C2959b c2959b : map.values()) {
                if (!c2959b.f9707b.equals("Ljava/lang/Override;")) {
                    c1203f.m3269p();
                    m641s(c1203f, c2959b);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p175m0.InterfaceC2703k0
    /* JADX INFO: renamed from: j */
    public boolean mo632j() {
        return ((InterfaceC2703k0) this.f332h).mo632j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p257r7.InterfaceC3717g
    /* JADX INFO: renamed from: k */
    public void mo633k(int i9) {
        ((C3711a) this.f333i).mo633k(i9);
        C2791d c2791d = ((C2807t) this.f332h).f9071w;
        int size = c2791d.f9926k.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2790c c2790c = (C2790c) c2791d.m6524Q(i10);
            int i11 = c2790c.f14858n;
            c2790c.m7715M((i9 - 12) + i11, false);
            AbstractC2331a.m5536F(c2790c.f12076k, i11, (short) (c2790c.mo5551p() - i11));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public C2884s m634l(List list) {
        InterfaceC2872g interfaceC2872g;
        Exception e6;
        InterfaceC2872g interfaceC2872g2;
        try {
            int size = list.size();
            int i9 = 0;
            interfaceC2872g = null;
            while (i9 < size) {
                try {
                    interfaceC2872g2 = (InterfaceC2872g) list.get(i9);
                } catch (Exception e7) {
                    e6 = e7;
                }
                try {
                    interfaceC2872g2.mo2428a((C2263n) this.f333i);
                    i9++;
                    interfaceC2872g = interfaceC2872g2;
                } catch (Exception e10) {
                    e6 = e10;
                    interfaceC2872g = interfaceC2872g2;
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb3.append(((C0412a) ((C2263n) this.f333i).f7510l).m1373b());
                    sb3.append(", composition=");
                    sb3.append(((C2263n) this.f333i).m5506c());
                    sb3.append(", selection=");
                    C2263n c2263n = (C2263n) this.f333i;
                    sb3.append((Object) C1939m0.m4818h(AbstractC1923e0.m4784b(c2263n.f7506h, c2263n.f7507i)));
                    sb3.append("):");
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    AbstractC4166m.m8428z1(list, sb2, "\n", new C0136d0(interfaceC2872g, 29, this), 60);
                    throw new RuntimeException(sb2.toString(), e6);
                }
            }
            C2263n c2263n2 = (C2263n) this.f333i;
            c2263n2.getClass();
            C1926g c1926g = new C1926g(((C0412a) c2263n2.f7510l).toString());
            C2263n c2263n3 = (C2263n) this.f333i;
            long jM4784b = AbstractC1923e0.m4784b(c2263n3.f7506h, c2263n3.f7507i);
            C1939m0 c1939m0 = C1939m0.m4817g(((C2884s) this.f332h).f9317b) ? null : new C1939m0(jM4784b);
            C2884s c2884s = new C2884s(c1926g, c1939m0 != null ? c1939m0.f6575a : AbstractC1923e0.m4784b(C1939m0.m4815e(jM4784b), C1939m0.m4816f(jM4784b)), ((C2263n) this.f333i).m5506c());
            this.f332h = c2884s;
            return c2884s;
        } catch (Exception e11) {
            interfaceC2872g = null;
            e6 = e11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public String m635m(String str, JSONObject jSONObject) throws JSONException {
        str.getClass();
        C1164q0 c1164q0 = (C1164q0) ((LinkedHashMap) this.f333i).get(str);
        if (c1164q0 == null) {
            C2104o.m5294t("没有找到已启用 MCP 工具: ".concat(str));
            return null;
        }
        C1156o0 c1156o0 = c1164q0.f3872a;
        String str2 = c1164q0.f3873b;
        if (AbstractC3149m.m6721t0(str2)) {
            C2104o.m5294t("MCP 工具名为空");
            return null;
        }
        c1156o0.m2974a();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("name", str2);
        jSONObject2.put("arguments", jSONObject);
        String string = c1156o0.m2977d("tools/call", jSONObject2).toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public String m636n() {
        Object obj;
        C2526a c2526a = (C2526a) this.f332h;
        WeChatChatroom weChatChatroom = (WeChatChatroom) this.f333i;
        if (weChatChatroom != null) {
            return weChatChatroom.chatroomId;
        }
        ContentValues contentValues = c2526a.f8164d;
        String strValueOf = (contentValues == null || TextUtils.isEmpty("chatroomname") || !contentValues.containsKey("chatroomname") || (obj = contentValues.get("chatroomname")) == null) ? HttpUrl.FRAGMENT_ENCODE_SET : String.valueOf(obj);
        if (!TextUtils.isEmpty(strValueOf)) {
            return strValueOf;
        }
        String[] strArr = c2526a.f8166f;
        if (strArr != null && strArr.length > 0) {
            String str = c2526a.f8165e;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (str.toLowerCase().contains("chatroomname")) {
                return strArr[0];
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public C1342b m637o(C1349i c1349i) {
        C1350j c1350j = c1349i.f4462a;
        String str = c1349i.f4464c;
        LinkedHashMap linkedHashMap = m643u(c1350j).f4447i;
        if (linkedHashMap.containsKey(c1349i)) {
            C1275d.m3413g(c1349i, "already declared: ");
            return null;
        }
        C1344d c1344d = new C1344d(c1349i, (str.equals("<init>") || str.equals("<clinit>")) ? 65537 : 1);
        linkedHashMap.put(c1349i, c1344d);
        return c1344d.f4438c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void m638p(C1346f c1346f, int i9) {
        LinkedHashMap linkedHashMap = m643u(c1346f.f4448a).f4446h;
        if (linkedHashMap.containsKey(c1346f)) {
            C1275d.m3413g(c1346f, "already declared: ");
        } else {
            linkedHashMap.put(c1346f, new C1343c(c1346f, i9));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013c  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m639q(C4325u c4325u, C1203f c1203f, C2958a c2958a) {
        String strM10505e;
        String strM10505e2;
        C4309e c4309e = (C4309e) this.f332h;
        C1204a c1204a = (C1204a) this.f333i;
        C4309e c4309e2 = c1204a.f4040a;
        if (c2958a == null) {
            c1203f.mo3255e("null");
        }
        int i9 = c2958a.f9704g;
        C5796q c5796q = c4309e.f14371k.f14437c;
        Object obj = c2958a.f9705h;
        switch (AbstractC4106c.m8279b(i9)) {
            case 0:
                c1203f.mo3255e("null");
                break;
            case 1:
                c1203f.mo3255e(Boolean.TRUE.equals(obj) ? "true" : "false");
                break;
            case 2:
                c1203f.mo3255e(c5796q.m10505e(1, ((Byte) obj).byteValue(), false));
                break;
            case 3:
                long jShortValue = ((Short) obj).shortValue();
                if (c5796q.f23543a != 1) {
                    strM10505e = c5796q.m10505e(2, jShortValue, false);
                } else {
                    short s10 = (short) jShortValue;
                    if (s10 == Short.MIN_VALUE) {
                        strM10505e = "Short.MIN_VALUE";
                    } else if (s10 == Short.MAX_VALUE) {
                        strM10505e = "Short.MAX_VALUE";
                    }
                }
                c1203f.mo3255e(strM10505e);
                break;
            case 4:
                char cCharValue = ((Character) obj).charValue();
                c5796q.getClass();
                c1203f.mo3255e(C5796q.m10502h(cCharValue, false));
                break;
            case 5:
                long jIntValue = ((Integer) obj).intValue();
                if (c5796q.f23543a != 1) {
                    strM10505e2 = c5796q.m10505e(4, jIntValue, false);
                } else {
                    int i10 = (int) jIntValue;
                    if (i10 == Integer.MIN_VALUE) {
                        strM10505e2 = "Integer.MIN_VALUE";
                    } else if (i10 == Integer.MAX_VALUE) {
                        strM10505e2 = "Integer.MAX_VALUE";
                    }
                }
                c1203f.mo3255e(strM10505e2);
                break;
            case 6:
                c1203f.mo3255e(c5796q.m10504d(((Long) obj).longValue(), false));
                break;
            case 7:
                c1203f.mo3255e(C5796q.m10499c(((Float) obj).floatValue()));
                break;
            case 8:
                c1203f.mo3255e(C5796q.m10498b(((Double) obj).doubleValue()));
                break;
            case 9:
                c1203f.mo3255e(c5796q.m10506i((String) obj));
                break;
            case 10:
                c1204a.m3292s(c1203f, AbstractC3506j.m7362z((String) obj));
                c1203f.mo3255e(".class");
                break;
            case 11:
            case 12:
                if (obj instanceof C2128d) {
                    C3130c c3130cM6654a = C3130c.m6654a(c4325u, (C2128d) obj);
                    EnumSet enumSet = C1208e.f4057e;
                    C1208e.m3296m(c1203f, c3130cM6654a, c4309e2.f14371k.m8717h(c3130cM6654a), c1204a);
                } else if (!(obj instanceof C3130c)) {
                    C0086a.m452k("Unexpected field type class: ".concat(String.valueOf(obj.getClass())));
                } else {
                    C3130c c3130c = (C3130c) obj;
                    EnumSet enumSet2 = C1208e.f4057e;
                    C1208e.m3296m(c1203f, c3130c, c4309e2.f14371k.m8717h(c3130c), c1204a);
                }
                break;
            case 13:
                break;
            case 14:
            case 15:
            default:
                C0086a.m452k(AbstractC0255e.m1022k("Can't decode value: ", AbstractC2091b.m5176w(i9), " (", String.valueOf(c2958a), ")"));
                break;
            case 16:
                c1203f.mo3254d('{');
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    m639q(c4309e.f14371k, c1203f, (C2958a) it.next());
                    if (it.hasNext()) {
                        c1203f.mo3255e(", ");
                    }
                }
                c1203f.mo3254d('}');
                break;
            case 17:
                m641s(c1203f, (C2959b) obj);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public void m640r(InterfaceC1235p interfaceC1235p) {
        interfaceC1235p.getClass();
        new Handler(Looper.getMainLooper()).post(new RunnableC0006d(this, 21, interfaceC1235p));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public void m641s(C1203f c1203f, C2959b c2959b) {
        C4322r c4322rM8669n0;
        c1203f.mo3254d('@');
        C4309e c4309e = (C4309e) this.f332h;
        C4325u c4325u = c4309e.f14371k;
        String str = c2959b.f9707b;
        c4325u.getClass();
        C4309e c4309eM8715f = c4325u.m8715f(C3128a.m6636d(c4325u, str));
        C1204a c1204a = (C1204a) this.f333i;
        if (c4309eM8715f != null) {
            c1203f.mo3260j(c4309eM8715f);
            c1203f.mo3255e(c1204a.m3290q(c1204a.f4040a.f14373m, c4309eM8715f.f14373m));
        } else {
            c1204a.m3289p(c1203f, AbstractC3506j.m7360x(c2959b.f9707b));
        }
        LinkedHashMap linkedHashMap = c2959b.f9708c;
        if (linkedHashMap.isEmpty()) {
            return;
        }
        c1203f.mo3254d('(');
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str2 = (String) entry.getKey();
            if (c4309eM8715f != null && (c4322rM8669n0 = c4309eM8715f.m8669n0(str2)) != null) {
                str2 = c4322rM8669n0.f14410k.f10157n;
            }
            if (!str2.equals("value") || linkedHashMap.size() != 1) {
                c1203f.mo3255e(str2);
                c1203f.mo3255e(" = ");
            }
            m639q(c4309e.f14371k, c1203f, (C2958a) entry.getValue());
            if (it.hasNext()) {
                c1203f.mo3255e(", ");
            }
        }
        c1203f.mo3254d(')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public ClassLoader m642t(File file, File file2, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = null;
        }
        try {
            Class.forName("dalvik.system.BaseDexClassLoader");
            return (ClassLoader) Class.forName("dalvik.system.DexClassLoader").getConstructor(String.class, String.class, String.class, ClassLoader.class).newInstance(file.getPath(), file2.getAbsolutePath(), null, classLoader);
        } catch (ClassNotFoundException e6) {
            throw new UnsupportedOperationException("load() requires a Dalvik VM", e6);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InstantiationException unused2) {
            throw new AssertionError();
        } catch (NoSuchMethodException unused3) {
            throw new AssertionError();
        } catch (InvocationTargetException e7) {
            throw new RuntimeException(e7.getCause());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f331g) {
            case 6:
                return "Bounds{lower=" + ((C0171a) this.f332h) + " upper=" + ((C0171a) this.f333i) + "}";
            case 15:
                return AbstractC0255e.m1022k("CodeMetadata{\nlines=", String.valueOf((Map) this.f332h), "\nannotations=\n ", AbstractC5798s.m10516j(((NavigableMap) this.f333i).descendingMap().entrySet(), "\n "), "\n}");
            case 26:
                return Integer.toString(((C3711a) this.f333i).f12074o);
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public C1345e m643u(C1350j c1350j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f332h;
        C1345e c1345e = (C1345e) linkedHashMap.get(c1350j);
        if (c1345e != null) {
            return c1345e;
        }
        C1345e c1345e2 = new C1345e(c1350j);
        linkedHashMap.put(c1350j, c1345e2);
        return c1345e2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public String m644v() throws JSONException {
        Object c3959f;
        List list;
        Iterator it;
        String str;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f333i;
        linkedHashMap.clear();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        ArrayList arrayList = new ArrayList();
        List list2 = (List) this.f332h;
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            C1160p0 c1160p0 = (C1160p0) it2.next();
            JSONObject jSONObject = new JSONObject();
            C1168r0 c1168r0 = c1160p0.f3850a;
            C1156o0 c1156o0 = c1160p0.f3852c;
            String str2 = c1160p0.f3851b;
            String str3 = c1168r0.f3898b;
            jSONObject.put("id", c1168r0.f3897a);
            jSONObject.put("name", str3);
            jSONObject.put("namespace", str2);
            try {
                c3959f = new JSONObject(c1156o0.m2975b());
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Object obj = c3959f;
            if (c3959f instanceof C3959f) {
                list = list2;
                it = it2;
            } else {
                JSONObject jSONObject2 = (JSONObject) obj;
                String strOptString = jSONObject2.optString("instructions", HttpUrl.FRAGMENT_ENCODE_SET);
                strOptString.getClass();
                if (AbstractC3149m.m6721t0(strOptString)) {
                    list = list2;
                    str = null;
                } else {
                    list = list2;
                    str = strOptString;
                }
                if (str != null) {
                    jSONObject.put("instructions", str);
                }
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("tools");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = c2564dM7910r0.iterator();
                while (true) {
                    C2563c c2563c = (C2563c) it3;
                    Iterator it4 = it3;
                    if (!c2563c.f8317i) {
                        break;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(((Number) c2563c.next()).intValue());
                    if (jSONObjectOptJSONObject != null) {
                        arrayList2.add(jSONObjectOptJSONObject);
                    }
                    it3 = it4;
                }
                Iterator it5 = AbstractC4166m.m8402K1(arrayList2, new C1167r(5)).iterator();
                while (it5.hasNext()) {
                    JSONObject jSONObject3 = (JSONObject) it5.next();
                    String strM1023l = AbstractC0255e.m1023l("name", HttpUrl.FRAGMENT_ENCODE_SET, jSONObject3);
                    if (!AbstractC3149m.m6721t0(strM1023l)) {
                        JSONArray jSONArray3 = jSONArrayOptJSONArray;
                        Iterator it6 = it5;
                        Iterator it7 = it2;
                        String strM6704S0 = AbstractC3149m.m6704S0(AbstractC2091b.m5161h("[^A-Za-z0-9_-]+", strM1023l, "_"), '_');
                        if (AbstractC3149m.m6721t0(strM6704S0)) {
                            strM6704S0 = "tool";
                        }
                        String str4 = "mcp__" + str2 + "__" + ((Object) strM6704S0);
                        int i9 = 2;
                        while (linkedHashMap.containsKey(str4)) {
                            str4 = ((Object) str4) + "_" + i9;
                            i9++;
                        }
                        linkedHashMap.put(str4, new C1164q0(c1156o0, strM1023l));
                        JSONObject jSONObject4 = new JSONObject(jSONObject3.toString());
                        jSONObject4.put("name", str4);
                        String strOptString2 = jSONObject4.optString("description", HttpUrl.FRAGMENT_ENCODE_SET);
                        strOptString2.getClass();
                        String string = AbstractC3149m.m6703R0(strOptString2).toString();
                        jSONObject4.put("description", AbstractC3149m.m6721t0(string) ? str3.concat(" 提供的工具") : AbstractC0255e.m1021j("[", str3, "] ", string));
                        jSONArray.put(jSONObject4);
                        jSONArrayOptJSONArray = jSONArray3;
                        it5 = it6;
                        it2 = it7;
                    }
                }
                it = it2;
                jSONObject.put("toolCount", jSONArrayOptJSONArray.length());
            }
            Throwable thM8182b = C3960g.m8182b(obj);
            if (thM8182b != null) {
                String message = thM8182b.getMessage();
                if (message == null) {
                    message = thM8182b.getClass().getSimpleName();
                }
                arrayList.add(str3 + ": " + message);
                jSONObject.put("error", message);
                jSONObject.put("toolCount", 0);
            }
            jSONArray2.put(jSONObject);
            list2 = list;
            it2 = it;
        }
        List list3 = list2;
        if (arrayList.size() == list3.size() && !list3.isEmpty()) {
            C2104o.m5276A("MCP 连接失败: ".concat(AbstractC4166m.m8392A1(arrayList, "；", null, null, null, 62)));
            return null;
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("servers", jSONArray2);
        jSONObject5.put("tools", jSONArray);
        String string2 = jSONObject5.toString();
        string2.getClass();
        return string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public boolean m645w() {
        ContentValues contentValues = ((C2526a) this.f332h).f8164d;
        return contentValues != null && contentValues.containsKey("memberlist");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public C4114a m646x(int i9) throws IOException {
        m623C(4);
        C6087a c6087a = (C6087a) this.f333i;
        int unsignedShort = c6087a.readUnsignedShort();
        int unsignedShort2 = c6087a.readUnsignedShort();
        C4455e0 c4455e0 = (C4455e0) this.f332h;
        C4114a c4114a = new C4114a(new C4453d0(C4683c.m9182m(((C4451c0) c4455e0.m8906l(unsignedShort)).f14760g)), i9);
        for (int i10 = 0; i10 < unsignedShort2; i10++) {
            m623C(5);
            c4114a.m8309l(new C4117d((C4451c0) c4455e0.m8906l(c6087a.readUnsignedShort()), m622B()));
        }
        c4114a.f24613g = false;
        return c4114a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public C4115b m647y(int i9) {
        C6087a c6087a = (C6087a) this.f333i;
        try {
            int unsignedShort = c6087a.readUnsignedShort();
            C4115b c4115b = new C4115b();
            for (int i10 = 0; i10 < unsignedShort; i10++) {
                c4115b.m8313l(m646x(i9));
            }
            c4115b.f24613g = false;
            if (c6087a.available() == 0) {
                return c4115b;
            }
            throw new C2474c("extra data in attribute", null);
        } catch (IOException e6) {
            C0086a.m457p("shouldn't happen", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public AbstractC4446a m648z() throws IOException {
        return ((C4455e0) this.f332h).m8906l(((C6087a) this.f333i).readUnsignedShort());
    }

    public /* synthetic */ C0126e(Object obj, int i9, Object obj2) {
        this.f331g = i9;
        this.f332h = obj;
        this.f333i = obj2;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h0.d1.<init>(w.q1):void, w.q0.<init>(w.x0, i0.r1, y1.g2):void] */
    public /* synthetic */ C0126e(int i9, boolean z9) {
        this.f331g = i9;
    }

    public C0126e(Object obj, Method method) {
        this.f331g = 18;
        method.getClass();
        this.f332h = obj;
        this.f333i = method;
    }

    public C0126e(C0045e c0045e) {
        this.f331g = 13;
        this.f332h = c0045e;
        this.f333i = new C3871a(0);
    }

    public C0126e(C2240b c2240b, int i9, int i10) {
        this.f331g = 17;
        if (c2240b != null) {
            c2240b.m5480d();
            this.f332h = c2240b.f7418d;
            this.f333i = new C6087a(new C6088b(c2240b.f7416b.m3666n(i9, i10 + i9)));
            return;
        }
        C0353j.m1305c("cf == null");
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0126e(Object obj) {
        this(11);
        this.f331g = 11;
        this.f333i = AbstractC1874r.m4639u(obj);
        AbstractC1874r.m4639u(obj);
    }

    public C0126e(int i9) {
        this.f331g = i9;
        switch (i9) {
            case 11:
                this.f332h = AbstractC1874r.m4639u(Boolean.FALSE);
                break;
            case 12:
                this.f332h = new C0943k0();
                this.f333i = new C0943k0();
                break;
            case 22:
                this.f332h = new C4084d(0);
                this.f333i = new C4084d(0);
                break;
            case 25:
                this.f332h = new C2469w(17);
                this.f333i = new C0956r(16);
                break;
            default:
                this.f332h = new LinkedHashMap();
                break;
        }
    }

    public C0126e(C0127f c0127f, C0128g c0128g) {
        this.f331g = 0;
        this.f333i = c0127f;
        this.f332h = c0128g;
    }

    public C0126e(WindowInsetsAnimation.Bounds bounds) {
        this.f331g = 6;
        this.f332h = C0171a.m767c(bounds.getLowerBound());
        this.f333i = C0171a.m767c(bounds.getUpperBound());
    }
}
