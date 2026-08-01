package p000;

import android.content.ContentResolver;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.IOException;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class jo0 implements gr0, ss0, ob1 {

    /* JADX INFO: renamed from: e */
    public static jo0 f2919e;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2920d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public jo0() {
        this.f2920d = 23;
        new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final void m1726j(jo0 jo0Var) {
        z31 z31Var;
        oq0 oq0Var;
        oq0 oq0Var2;
        z31 z31Var2 = ot0.f4630z;
        do {
            z31Var = ot0.f4630z;
            oq0Var = (oq0) z31Var.getValue();
            gq0 gq0VarM1254a = oq0Var.f4608f;
            ua0 ua0Var = (ua0) gq0VarM1254a.get(jo0Var);
            if (ua0Var == null) {
                oq0Var2 = oq0Var;
            } else {
                Object obj = ua0Var.f6174a;
                Object obj2 = ua0Var.f6175b;
                l91 l91Var = gq0VarM1254a.f2037d;
                l91 l91VarM2005v = l91Var.m2005v(jo0Var != null ? jo0Var.hashCode() : 0, 0, jo0Var);
                if (l91Var != l91VarM2005v) {
                    gq0VarM1254a = l91VarM2005v == null ? gq0.f2036f : new gq0(l91VarM2005v, gq0VarM1254a.f2038e - 1);
                }
                C0496n2 c0496n2 = C0496n2.f4124D;
                if (obj != c0496n2) {
                    Object obj3 = gq0VarM1254a.get(obj);
                    obj3.getClass();
                    gq0VarM1254a = gq0VarM1254a.m1254a(obj, new ua0(((ua0) obj3).f6174a, obj2));
                }
                if (obj2 != c0496n2) {
                    Object obj4 = gq0VarM1254a.get(obj2);
                    obj4.getClass();
                    gq0VarM1254a = gq0VarM1254a.m1254a(obj2, new ua0(obj, ((ua0) obj4).f6175b));
                }
                Object obj5 = obj != c0496n2 ? oq0Var.f4606d : obj2;
                if (obj2 != c0496n2) {
                    obj = oq0Var.f4607e;
                }
                oq0Var2 = new oq0(obj5, obj, gq0VarM1254a);
            }
            if (oq0Var == oq0Var2) {
                return;
            }
        } while (!z31Var.m5413j(oq0Var, oq0Var2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final C0915x6 m1727k(String str, int i) {
        WeakHashMap weakHashMap = de1.f1062v;
        return new C0915x6(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final int m1728l(int i, long j) {
        int i2 = AbstractC0307i4.f2439t;
        return ((int) (j >> (i * 15))) & 32767;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static final db1 m1729m(String str, int i) {
        WeakHashMap weakHashMap = de1.f1062v;
        return new db1(new q20(0, 0, 0, 0), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Typeface m1730n(String str, C1018zv c1018zv, int i) {
        if (i == 0 && p30.m3002l(c1018zv, C1018zv.f8005f) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c1018zv.f8009d, i == 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static de1 m1731o(InterfaceC0356ji interfaceC0356ji) {
        de1 de1Var;
        C0616pi c0616pi = (C0616pi) interfaceC0356ji;
        View view = (View) c0616pi.m3112j(AbstractC0676r4.f5294e);
        WeakHashMap weakHashMap = de1.f1062v;
        synchronized (weakHashMap) {
            try {
                Object de1Var2 = weakHashMap.get(view);
                if (de1Var2 == null) {
                    de1Var2 = new de1(view);
                    weakHashMap.put(view, de1Var2);
                }
                de1Var = (de1) de1Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zM3108h = c0616pi.m3108h(de1Var) | c0616pi.m3108h(view);
        Object objM3080L = c0616pi.m3080L();
        if (zM3108h || objM3080L == C0320ii.f2572a) {
            objM3080L = new C0073c(24, de1Var, view);
            c0616pi.m3107g0(objM3080L);
        }
        s91.m4038c(de1Var, (InterfaceC0742sw) objM3080L, c0616pi);
        return de1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static Font m1732p(FontFamily fontFamily) {
        FontStyle fontStyle = new FontStyle(400, 0);
        Font font = fontFamily.getFont(0);
        int iM1733s = m1733s(fontStyle, font.getStyle());
        for (int i = 1; i < fontFamily.getSize(); i++) {
            Font font2 = fontFamily.getFont(i);
            int iM1733s2 = m1733s(fontStyle, font2.getStyle());
            if (iM1733s2 < iM1733s) {
                font = font2;
                iM1733s = iM1733s2;
            }
        }
        return font;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static int m1733s(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ob1
    /* JADX INFO: renamed from: c */
    public int mo374c() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ss0
    /* JADX INFO: renamed from: d */
    public void mo1736d() {
        switch (this.f2920d) {
            case 5:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ss0
    /* JADX INFO: renamed from: f */
    public void mo1737f(int i, Object obj) {
        String str;
        switch (this.f2920d) {
            case 5:
                break;
            default:
                switch (i) {
                    case 1:
                        str = "RESULT_INSTALL_SUCCESS";
                        break;
                    case 2:
                        str = "RESULT_ALREADY_INSTALLED";
                        break;
                    case 3:
                        str = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    case 4:
                        str = "RESULT_NOT_WRITABLE";
                        break;
                    case 5:
                        str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    case 6:
                        str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    case 7:
                        str = "RESULT_IO_EXCEPTION";
                        break;
                    case 8:
                        str = "RESULT_PARSE_EXCEPTION";
                        break;
                    case 9:
                    default:
                        str = "";
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i == 6 || i == 7 || i == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ob1
    /* JADX INFO: renamed from: g */
    public int mo378g() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.mb1
    /* JADX INFO: renamed from: h */
    public AbstractC0046b8 mo379h(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        return j < 0 ? abstractC0046b8 : abstractC0046b82;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public FontFamily m1738q(C0107cw[] c0107cwArr, ContentResolver contentResolver) {
        Font fontBuild;
        String str;
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (C0107cw c0107cw : c0107cwArr) {
            if (Objects.equals(c0107cw.f898a.getScheme(), "systemfont")) {
                fontBuild = mo1739r(c0107cw);
            } else {
                try {
                    Uri uri = c0107cw.f898a;
                    str = c0107cw.f902e;
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r", null);
                } catch (IOException e) {
                    Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
                    fontBuild = null;
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    fontBuild = null;
                } else {
                    try {
                        Font.Builder ttcIndex = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c0107cw.f900c).setSlant(c0107cw.f901d ? 1 : 0).setTtcIndex(c0107cw.f899b);
                        if (!TextUtils.isEmpty(str)) {
                            ttcIndex.setFontVariationSettings(str);
                        }
                        fontBuild = ttcIndex.build();
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
            if (fontBuild != null) {
                if (builder == null) {
                    builder = new FontFamily.Builder(fontBuild);
                } else {
                    builder.addFont(fontBuild);
                }
            }
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public Font mo1739r(C0107cw c0107cw) {
        throw new UnsupportedOperationException("Getting font from Typeface is not supported before API31");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f2920d) {
            case j50.f2734e /* 15 */:
                return "SharingStarted.Eagerly";
            case 16:
                return "SharingStarted.Lazily";
            case 17:
            default:
                return super.toString();
            case 18:
                return "ReusedSlotId";
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [d.<init>(int):void, ed0.<init>():void, gh.onPictureInPictureModeChanged(boolean):void, gh.onPictureInPictureModeChanged(boolean, android.content.res.Configuration):void, gh.onPictureInPictureUiStateChanged(android.app.PictureInPictureUiState):void, i4.<clinit>():void, kl.<clinit>():void, lo0.<init>(float, int):void, o30.<clinit>():void, o8.<init>(int):void, p30.<clinit>():void, rc1.<init>():void, x1.<init>(int):void, y2.<init>(vc1, tc1, el):void] */
    public /* synthetic */ jo0(int i) {
        this.f2920d = i;
    }

    /* JADX INFO: renamed from: t */
    private final void m1734t() {
    }

    /* JADX INFO: renamed from: u */
    private final void m1735u(int i, Object obj) {
    }

    @Override // p000.mb1
    /* JADX INFO: renamed from: e */
    public AbstractC0046b8 mo376e(long j, AbstractC0046b8 abstractC0046b8, AbstractC0046b8 abstractC0046b82, AbstractC0046b8 abstractC0046b83) {
        return abstractC0046b83;
    }
}
