package p162l3;

import android.graphics.Typeface;
import android.util.Log;
import gg.AbstractC1416l;
import java.util.Iterator;
import java.util.List;
import mh.InterfaceC2843a;
import mh.InterfaceC2844b;
import okhttp3.HttpUrl;
import p069f.AbstractC0957r0;
import p069f.C0943k0;
import p069f.C0956r;
import p092g4.AbstractC1341a;
import p116i.InterfaceC1796v;
import p177m2.C2767k;
import p177m2.C2769m;
import p177m2.InterfaceC2771o;
import p207o5.InterfaceC3048c;
import p218og.AbstractC3149m;
import p219oh.C3159b;
import p271s5.InterfaceC3929a;
import p281t3.InterfaceC4108e;

/* JADX INFO: renamed from: l3.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2469w implements InterfaceC2771o, InterfaceC3048c, InterfaceC3929a, InterfaceC2843a, InterfaceC1796v, InterfaceC4108e {

    /* JADX INFO: renamed from: h */
    public static C2469w f8103h;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f8104g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2469w() {
        this.f8104g = 4;
        new C0956r(16);
        long[] jArr = AbstractC0957r0.f3015a;
        new C0943k0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final int m5864f(int i9) {
        return (i9 & 2) != 0 ? i9 | 64 : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Typeface m5865g(String str, C2767k c2767k, int i9) {
        if (i9 == 0 && AbstractC1416l.m3825a(c2767k, C2767k.f8999i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), c2767k.f9003g, i9 == 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Typeface m5866h(String str, C2767k c2767k, int i9) {
        if (i9 == 0 && AbstractC1416l.m3825a(c2767k, C2767k.f8999i) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        int iM3601q = AbstractC1341a.m3601q(c2767k, i9);
        return (str == null || str.length() == 0) ? Typeface.defaultFromStyle(iM3601q) : Typeface.create(str, iM3601q);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m5867k(String str, String str2) {
        if (AbstractC3149m.m6721t0(str) || str2 == null || AbstractC3149m.m6721t0(str2)) {
            return false;
        }
        List listM6692G0 = AbstractC3149m.m6692G0(str, new String[]{"|", ",", "，", "\n", "\r"});
        if (listM6692G0.isEmpty()) {
            return false;
        }
        Iterator it = listM6692G0.iterator();
        while (it.hasNext()) {
            if (AbstractC1416l.m3825a(AbstractC3149m.m6703R0((String) it.next()).toString(), str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p281t3.InterfaceC4108e
    /* JADX INFO: renamed from: a */
    public void mo5870a() {
        switch (this.f8104g) {
            case 24:
                break;
            default:
                Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1796v
    /* JADX INFO: renamed from: b */
    public float mo3416b(float f3) {
        return 1.0f - ((float) Math.pow(1.0f - f3, 2 * 1.5f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p281t3.InterfaceC4108e
    /* JADX INFO: renamed from: c */
    public void mo5871c(int i9, Object obj) {
        String str;
        switch (this.f8104g) {
            case 24:
                break;
            default:
                switch (i9) {
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
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                        break;
                    case 10:
                        str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                        break;
                    case 11:
                        str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                        break;
                }
                if (i9 == 6 || i9 == 7 || i9 == 8) {
                    Log.e("ProfileInstaller", str, (Throwable) obj);
                } else {
                    Log.d("ProfileInstaller", str);
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // mh.InterfaceC2843a
    /* JADX INFO: renamed from: d */
    public InterfaceC2844b mo5872d(String str) {
        return C3159b.f10213g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p271s5.InterfaceC3929a
    /* JADX INFO: renamed from: e */
    public String mo5873e() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p271s5.InterfaceC3929a
    public String getName() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p271s5.InterfaceC3929a
    public String getType() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface m5874i(C2769m c2769m, C2767k c2767k, int i9) {
        String str;
        switch (this.f8104g) {
            case 6:
                c2769m.getClass();
                return m5865g("monospace", c2767k, i9);
            default:
                c2769m.getClass();
                int i10 = c2767k.f9003g / 100;
                if (i10 >= 0 && i10 < 2) {
                    str = "monospace-thin";
                } else if (2 <= i10 && i10 < 4) {
                    str = "monospace-light";
                } else if (i10 != 4) {
                    str = i10 == 5 ? "monospace-medium" : ((6 > i10 || i10 >= 8) && 8 <= i10 && i10 < 11) ? "monospace-black" : "monospace";
                }
                Typeface typeface = null;
                if (str.length() != 0) {
                    Typeface typefaceM5866h = m5866h(str, c2767k, i9);
                    if (!AbstractC1416l.m3825a(typefaceM5866h, Typeface.create(Typeface.DEFAULT, AbstractC1341a.m3601q(c2767k, i9))) && !AbstractC1416l.m3825a(typefaceM5866h, m5866h(null, c2767k, i9))) {
                        typeface = typefaceM5866h;
                    }
                }
                return typeface == null ? m5866h("monospace", c2767k, i9) : typeface;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public boolean mo5875j(CharSequence charSequence) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p207o5.InterfaceC3048c
    public int seekTo(int i9) {
        return 0;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b.e.<init>(int):void, b5.c.<init>(int):void, bc.g.<init>():void, bc.k.e():void, ig.a.k(android.content.Context):m2.e, m.a.<init>(int):void, m3.c.<init>():void, na.e.<init>(android.content.Context, java.lang.ClassLoader, h.Hchat.dexkit.DexFinder):void, ud.u.<init>(bc.k):void, y1.t.onAttachedToWindow():void] */
    public /* synthetic */ C2469w(int i9) {
        this.f8104g = i9;
    }

    /* JADX INFO: renamed from: l */
    private final void m5868l() {
    }

    /* JADX INFO: renamed from: m */
    private final void m5869m(int i9, Object obj) {
    }
}
