package p000A;

import android.content.Context;
import com.bumptech.glide.AbstractC1925g;
import java.io.File;
import me.dartcv.nuke.BuildConfig;
import nuke.data.cipher.NativeCrypto;
import p004A3.AbstractC0156a;
import p005A4.AbstractC0164d;
import p009B2.AbstractC0220a;
import p016C3.C0245b;
import p029F0.C0410l;
import p031F2.C0452b;
import p036G1.AbstractC0472a;
import p040H.AbstractC0548f;
import p045H4.AbstractC0649a;
import p049I2.C0795m;
import p056K2.C0884j;
import p056K2.C0891q;
import p057K3.AbstractC0896d;
import p057K3.AbstractC0898f;
import p057K3.InterfaceC0895c;
import p057K3.InterfaceC0897e;
import p058L.AbstractC0908J;
import p058L.AbstractC0933e0;
import p076P.AbstractC1059E;
import p076P.AbstractC1061G;
import p076P.AbstractC1096i;
import p076P.AbstractC1105r;
import p076P.C1065K;
import p076P.C1109v;
import p095T.C1305C;
import p095T.C1341U0;
import p112W2.InterfaceC1599a;
import p113W3.AbstractC1609b;
import p113W3.AbstractC1611d;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p128a.AbstractC1785a;
import p153e1.C2010f;
import p160f3.AbstractC2100C;
import p201m3.C2608e;
import p201m3.ExecutorC2607d;
import p211o0.AbstractC2767z;
import p211o0.C2740O;

/* JADX INFO: renamed from: A.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0065i implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f295d;

    public /* synthetic */ C0065i(int i5) {
        this.f295d = i5;
    }

    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    public final Object mo6a() {
        Object objM3229o;
        switch (this.f295d) {
            case 0:
                return new C2740O(AbstractC2767z.m4933c(1308617531));
            case BuildConfig.VERSION_CODE /* 1 */:
                C1341U0 c1341u0 = AbstractC0085s.f387a;
                return null;
            case 2:
                return AbstractC0156a.f561g;
            case 3:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 4:
                Context context = AbstractC1785a.f6095a;
                if (context != null) {
                    return new C0245b(new C0795m(context, "global_config").m1357a());
                }
                AbstractC1665j.m2991k("hostContext");
                throw null;
            case 5:
                Context context2 = AbstractC1785a.f6095a;
                if (context2 != null) {
                    return new C0245b(new C0795m(context2, "global_cache").m1357a());
                }
                AbstractC1665j.m2991k("hostContext");
                throw null;
            case 6:
                return AbstractC0164d.m238b();
            case 7:
                ClassLoader classLoader = C0452b.class.getClassLoader();
                int i5 = AbstractC0220a.f766a;
                try {
                    objM3229o = classLoader.loadClass("android.os.Build");
                    if (objM3229o == null) {
                        objM3229o = null;
                    }
                } catch (Throwable th) {
                    objM3229o = AbstractC1784a.m3229o(th);
                }
                return Boolean.valueOf(((Class) (objM3229o instanceof C0884j ? null : objM3229o)) != null);
            case 8:
                C1305C c1305c = AbstractC0472a.f1395a;
                return null;
            case 9:
                C1305C c1305c2 = AbstractC0548f.f1661a;
                return null;
            case 10:
                return AbstractC1925g.m3548y(AbstractC0649a.f2059a);
            case 11:
                return Boolean.valueOf(NativeCrypto.m6446());
            case 12:
                return Boolean.valueOf(NativeCrypto.m6447());
            case 13:
                return Boolean.valueOf(NativeCrypto.m6461());
            case 14:
                return NativeCrypto.m6460();
            case 15:
                File fileM2859b = AbstractC1609b.m2859b();
                if (fileM2859b.isFile()) {
                    AbstractC1611d.m2874k(fileM2859b);
                    System.load(fileM2859b.getAbsolutePath());
                    return C0891q.f2780a;
                }
                throw new SecurityException("Native library is not downloaded: " + fileM2859b.getAbsolutePath());
            case 16:
                return Boolean.valueOf(NativeCrypto.INSTANCE.attestModuleFromRuntime$app_release());
            case 17:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 18:
                return (InterfaceC0895c) AbstractC0896d.f2786a.m430g(InterfaceC0895c.class);
            case 19:
                return (InterfaceC0897e) AbstractC0898f.f2789b.m430g(InterfaceC0897e.class);
            case 20:
                C2608e c2608e = AbstractC2100C.f7029a;
                return ExecutorC2607d.f8303f;
            case 21:
                C1305C c1305c3 = AbstractC0908J.f2824a;
                return null;
            case 22:
                return AbstractC0933e0.f2927b;
            case 23:
                float f2 = AbstractC1096i.f3517a;
                return C1109v.f3618a;
            case 24:
                return AbstractC1105r.m2156d(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535);
            case 25:
                C1341U0 c1341u02 = AbstractC1105r.f3612a;
                return Boolean.TRUE;
            case 26:
                C0410l c0410l = AbstractC1059E.f3301a;
                return Boolean.TRUE;
            case 27:
                return new C2010f(48);
            case 28:
                C1341U0 c1341u03 = AbstractC1061G.f3310a;
                return Boolean.FALSE;
            default:
                return C1065K.f3317a;
        }
    }
}
