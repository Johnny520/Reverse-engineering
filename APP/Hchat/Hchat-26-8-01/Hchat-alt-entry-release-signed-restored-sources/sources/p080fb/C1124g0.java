package p080fb;

import gg.AbstractC1416l;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.ZipEntry;
import okhttp3.HttpUrl;
import org.json.JSONObject;
import p025bc.AbstractC0255e;
import p054dg.AbstractC0793l;
import p065eb.C0859c0;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p166l7.C2525m;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p229p7.C3341k;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p314v7.AbstractC4497g0;
import p314v7.AbstractC4520z;
import p314v7.C4487b0;
import p314v7.C4490d;
import p314v7.C4491d0;
import p314v7.C4519y;
import tf.AbstractC4156d0;

/* JADX INFO: renamed from: fb.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1124g0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f3675g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [fb.g1.b(android.content.Context, java.util.List):void, fb.g1.e(android.content.Context, java.lang.String):void, fb.g1.i(android.content.Context):java.util.List, fb.g1.n(android.content.Context, fb.d1):void, fb.l1.<init>(java.io.File, java.lang.String):void, fb.l1.d(java.util.zip.ZipFile):java.util.List, fb.n0.R(t7.b):java.util.List, fb.n0.c0(java.io.File):java.lang.String, fb.o0.d(java.lang.String, org.json.JSONObject):org.json.JSONObject, fb.s2.F(org.json.JSONObject, fb.b):java.lang.String, fb.s2.b(org.json.JSONObject):java.lang.String, fb.s2.c():fb.i2, fb.t2.M(java.io.File):void, fb.t2.a0(java.util.Map):java.lang.String, fb.t2.b0(java.io.File, java.lang.String):fb.p2, fb.t2.s(java.io.File):void, fb.t2.y(java.io.File):java.lang.String, fb.u.v(android.content.Context, fb.v, fb.b1, fb.b, c9.k, boolean, boolean, boolean, fb.s):fb.t1, fb.v0.f(android.content.Context, fb.b1, boolean, boolean):fb.u0] */
    public /* synthetic */ C1124g0(int i9) {
        this.f3675g = i9;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0198  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        InputStream resourceAsStream;
        Object c3959f4;
        switch (this.f3675g) {
            case 0:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 1:
                C4490d c4490d = (C4490d) obj;
                try {
                    AbstractC4497g0 abstractC4497g0 = c4490d.f14846k;
                    C4491d0 c4491d0 = abstractC4497g0 instanceof C4487b0 ? (C4491d0) ((C4487b0) abstractC4497g0).f14850l : null;
                    String strM8935S = c4491d0 != null ? c4491d0.m8935S() : null;
                    strM8935S.getClass();
                    C2525m c2525m = (C2525m) c4490d.m5553u(C2525m.class);
                    C4519y c4519y = c2525m != null ? ((C3341k) c2525m.f8138m).f10755v : null;
                    String strM8942T = c4519y != null ? c4519y.m8942T() : null;
                    if (strM8942T == null) {
                        strM8942T = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    C2525m c2525m2 = (C2525m) c4490d.m5553u(C2525m.class);
                    C4519y c4519y2 = c2525m2 != null ? ((C3341k) c2525m2.f8138m).f10755v : null;
                    c3959f = new C1144l0(strM8935S, strM8942T, c4519y2 != null ? AbstractC4520z.m8944R(c4519y2.f14896n.mo5552r()) : false);
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                return (C1144l0) (c3959f instanceof C3959f ? null : c3959f);
            case 2:
                ((C1144l0) obj).getClass();
                return Boolean.valueOf(!AbstractC3149m.m6721t0(r7.f3773a));
            case 3:
                String str = (String) obj;
                return AbstractC3199a.m6839l(str, str);
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                return Boolean.valueOf(AbstractC3156t.m6740d0(str2, "data:", false));
            case 5:
                String str3 = (String) obj;
                str3.getClass();
                return AbstractC3149m.m6703R0(AbstractC3149m.m6686A0(str3, "data:")).toString();
            case 6:
                String str4 = (String) obj;
                str4.getClass();
                return Boolean.valueOf(AbstractC3156t.m6740d0(str4, "{", false));
            case 7:
                String str5 = (String) obj;
                str5.getClass();
                try {
                    c3959f2 = new JSONObject(str5);
                    break;
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                return (JSONObject) (c3959f2 instanceof C3959f ? null : c3959f2);
            case 8:
                C0859c0 c0859c0 = (C0859c0) obj;
                c0859c0.getClass();
                String str6 = c0859c0.f2626a;
                String str7 = c0859c0.f2633h;
                if (str7 == null) {
                    str7 = c0859c0.f2627b;
                }
                String str8 = c0859c0.f2631f;
                if (AbstractC3149m.m6721t0(str8)) {
                    str8 = WeChatSnsPost.TYPE_UNKNOWN;
                }
                StringBuilder sbM1027p = AbstractC0255e.m1027p("- id=", str6, ", name=", str7, ", version=");
                sbM1027p.append((Object) str8);
                return sbM1027p.toString();
            case 9:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 10:
                String str9 = (String) obj;
                str9.getClass();
                try {
                    ClassLoader classLoader = AbstractC1184v0.class.getClassLoader();
                    if (classLoader == null || (resourceAsStream = classLoader.getResourceAsStream(str9)) == null) {
                        c3959f3 = null;
                    } else {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, AbstractC3137a.f10177a), 8192);
                        try {
                            String strM7887e0 = AbstractC3754e0.m7887e0(bufferedReader);
                            bufferedReader.close();
                            boolean zM6721t0 = AbstractC3149m.m6721t0(strM7887e0);
                            c3959f3 = strM7887e0;
                            if (zM6721t0) {
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                return (String) (c3959f3 instanceof C3959f ? null : c3959f3);
            case 11:
                C1113d1 c1113d1 = (C1113d1) obj;
                c1113d1.getClass();
                C1125g1 c1125g1 = C1125g1.f3676a;
                return Boolean.valueOf(C1125g1.m2864h(c1113d1.f3640e));
            case 12:
                ((String) obj).getClass();
                return new Object();
            case 13:
                ((String) obj).getClass();
                return new Object();
            case 14:
                File file = (File) obj;
                file.getClass();
                return file.getPath();
            case 15:
                File file2 = (File) obj;
                if (file2.isFile() && AbstractC0793l.m2023c0(file2).equals("json")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                File file3 = (File) obj;
                C1125g1 c1125g12 = C1125g1.f3676a;
                try {
                    file3.getClass();
                    c3959f4 = c1125g12.m2874c(AbstractC0793l.m2028h0(file3, AbstractC3137a.f10177a));
                    break;
                } catch (Throwable th5) {
                    c3959f4 = new C3959f(th5);
                }
                return (C1113d1) (c3959f4 instanceof C3959f ? null : c3959f4);
            case 17:
                ZipEntry zipEntry = (ZipEntry) obj;
                if (!zipEntry.isDirectory()) {
                    C3147k c3147k = C1145l1.f3776e;
                    String name = zipEntry.getName();
                    name.getClass();
                    if (c3147k.m6683d(name)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 18:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 19:
                C1100a0 c1100a0 = (C1100a0) obj;
                c1100a0.getClass();
                return c1100a0.f3545b;
            case 20:
                C1100a0 c1100a02 = (C1100a0) obj;
                c1100a02.getClass();
                return c1100a02.f3545b;
            case 21:
                File file4 = (File) obj;
                file4.getClass();
                if (file4.isFile() && !AbstractC1416l.m3825a(file4.getName(), "main.java")) {
                    Set setM8355W = AbstractC4156d0.m8355W("java", "bsh", "js", "kt");
                    String lowerCase = AbstractC0793l.m2023c0(file4).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (setM8355W.contains(lowerCase)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 22:
                String path = ((File) obj).getPath();
                path.getClass();
                return path;
            case 23:
                File file5 = (File) obj;
                file5.getClass();
                return Boolean.valueOf(file5.isFile());
            case 24:
                return String.format("%02x", Arrays.copyOf(new Object[]{Integer.valueOf(((Byte) obj).byteValue() & 255)}, 1));
            case 25:
                ((String) obj).getClass();
                return new ReentrantLock();
            case 26:
                C1100a0 c1100a03 = (C1100a0) obj;
                c1100a03.getClass();
                return c1100a03.f3545b;
            case 27:
                File file6 = (File) obj;
                file6.getClass();
                return Boolean.valueOf(file6.isFile());
            case 28:
                File file7 = (File) obj;
                file7.getClass();
                return Boolean.valueOf(file7.isFile());
            default:
                C1100a0 c1100a04 = (C1100a0) obj;
                c1100a04.getClass();
                return c1100a04.f3545b;
        }
    }
}
