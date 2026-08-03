package p025bc;

import ad.C0069c;
import ae.C0073d;
import bd.InterfaceC0268a;
import cd.C0547b;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p003a2.C0014a;
import p081fc.C1199b;
import p081fc.C1200c;
import p136j8.AbstractC2091b;
import p157kd.C2387a;
import p162l3.C2469w;
import p169ld.C2551a;
import p169ld.C2552b;
import p222p.AbstractC3199a;
import p301uc.C4303a;
import p301uc.InterfaceC4304b;
import p382zc.EnumC6135a;
import ve.C4550b;

/* JADX INFO: renamed from: bc.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0257g implements Closeable {

    /* JADX INFO: renamed from: X */
    public static final InterfaceC2844b f712X = AbstractC2846d.m6274b(C0257g.class);

    /* JADX INFO: renamed from: Y */
    public static final int f713Y = Math.max(1, Runtime.getRuntime().availableProcessors() / 2);

    /* JADX INFO: renamed from: Z */
    public static final String f714Z = System.lineSeparator();

    /* JADX INFO: renamed from: A */
    public final C2387a f715A;

    /* JADX INFO: renamed from: B */
    public boolean f716B;

    /* JADX INFO: renamed from: C */
    public final boolean f717C;

    /* JADX INFO: renamed from: D */
    public final EnumSet f718D;

    /* JADX INFO: renamed from: E */
    public final EnumC0252b f719E;

    /* JADX INFO: renamed from: F */
    public final String f720F;

    /* JADX INFO: renamed from: G */
    public final String f721G;

    /* JADX INFO: renamed from: H */
    public final EnumC0251a f722H;

    /* JADX INFO: renamed from: I */
    public final int f723I;

    /* JADX INFO: renamed from: J */
    public final C4550b f724J;

    /* JADX INFO: renamed from: K */
    public final C0069c f725K;

    /* JADX INFO: renamed from: L */
    public final ArrayList f726L;

    /* JADX INFO: renamed from: M */
    public final HashMap f727M;

    /* JADX INFO: renamed from: N */
    public final HashSet f728N;

    /* JADX INFO: renamed from: O */
    public InterfaceC4304b f729O;

    /* JADX INFO: renamed from: P */
    public boolean f730P;

    /* JADX INFO: renamed from: U */
    public final int f735U;

    /* JADX INFO: renamed from: V */
    public final int f736V;

    /* JADX INFO: renamed from: W */
    public final int f737W;

    /* JADX INFO: renamed from: h */
    public File f739h;

    /* JADX INFO: renamed from: i */
    public File f740i;

    /* JADX INFO: renamed from: j */
    public File f741j;

    /* JADX INFO: renamed from: g */
    public ArrayList f738g = new ArrayList(1);

    /* JADX INFO: renamed from: k */
    public InterfaceC0253c f742k = new C1200c();

    /* JADX INFO: renamed from: l */
    public InterfaceC0268a f743l = new C0547b();

    /* JADX INFO: renamed from: m */
    public final C0073d f744m = new C0073d(3);

    /* JADX INFO: renamed from: n */
    public int f745n = f713Y;

    /* JADX INFO: renamed from: o */
    public boolean f746o = false;

    /* JADX INFO: renamed from: p */
    public final boolean f747p = true;

    /* JADX INFO: renamed from: q */
    public final boolean f748q = true;

    /* JADX INFO: renamed from: r */
    public final boolean f749r = true;

    /* JADX INFO: renamed from: s */
    public boolean f750s = true;

    /* JADX INFO: renamed from: t */
    public final boolean f751t = true;

    /* JADX INFO: renamed from: u */
    public final boolean f752u = true;

    /* JADX INFO: renamed from: v */
    public boolean f753v = true;

    /* JADX INFO: renamed from: w */
    public boolean f754w = false;

    /* JADX INFO: renamed from: Q */
    public final int f731Q = 1;

    /* JADX INFO: renamed from: R */
    public final int f732R = 3;

    /* JADX INFO: renamed from: x */
    public final int f755x = 10;

    /* JADX INFO: renamed from: S */
    public final int f733S = 1;

    /* JADX INFO: renamed from: T */
    public final int f734T = 1;

    /* JADX INFO: renamed from: y */
    public final int f756y = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: z */
    public final List f757z = C2552b.f8281a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0257g() {
        C2387a c2387a = new C2387a();
        c2387a.f7839a = 0;
        c2387a.f7840b = 0;
        c2387a.f7841c = 0;
        c2387a.f7842d = 0;
        this.f715A = c2387a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2551a());
        C2552b c2552b = new C2552b();
        new HashSet();
        new HashSet();
        arrayList.add(c2552b);
        arrayList.add(new C2551a());
        arrayList.add(new C2551a());
        C2551a c2551a = new C2551a();
        new HashSet();
        arrayList.add(c2551a);
        arrayList.add(new C2469w(1));
        new C0014a(arrayList);
        this.f716B = true;
        this.f717C = true;
        this.f718D = EnumSet.allOf(EnumC0256f.class);
        this.f735U = 1;
        this.f719E = EnumC0252b.f703g;
        this.f720F = f714Z;
        this.f721G = "    ";
        this.f722H = EnumC0251a.f700k;
        this.f736V = 1;
        this.f723I = 10;
        this.f737W = 2;
        this.f724J = C4550b.f15009a;
        this.f725K = new C0069c(EnumSet.allOf(EnumC6135a.class));
        this.f726L = new ArrayList();
        this.f727M = new HashMap();
        this.f728N = new HashSet();
        this.f729O = new C4303a();
        this.f730P = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m1036a() {
        return this.f718D.contains(EnumC0256f.f709h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            try {
                this.f738g = null;
                InterfaceC0253c interfaceC0253c = this.f742k;
                if (interfaceC0253c != null) {
                    interfaceC0253c.close();
                }
                InterfaceC0268a interfaceC0268a = this.f743l;
                if (interfaceC0268a != null) {
                    interfaceC0268a.close();
                }
                InterfaceC4304b interfaceC4304b = this.f729O;
                if (interfaceC4304b != null) {
                    interfaceC4304b.close();
                }
            } catch (Exception e6) {
                f712X.mo6251e("Failed to close JadxArgs", e6);
            }
            this.f742k = null;
            this.f743l = null;
        } catch (Throwable th2) {
            this.f742k = null;
            this.f743l = null;
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String strValueOf = String.valueOf(this.f738g);
        String strValueOf2 = String.valueOf(this.f739h);
        String strValueOf3 = String.valueOf(this.f740i);
        String strValueOf4 = String.valueOf(this.f741j);
        int i9 = this.f745n;
        String strValueOf5 = String.valueOf(this.f719E);
        boolean z9 = this.f746o;
        boolean z10 = this.f754w;
        int i10 = this.f731Q;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "IGNORE" : "READ_AND_AUTOSAVE_BEFORE_CLOSING" : "READ_AND_AUTOSAVE_EVERY_CHANGE" : "READ";
        int i11 = this.f733S;
        String str2 = i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? "null" : "IGNORE" : "OVERWRITE" : "READ_OR_SAVE" : "READ";
        String strM1034w = AbstractC0255e.m1034w(this.f734T);
        String strM1035x = AbstractC0255e.m1035x(this.f732R);
        int i12 = this.f737W;
        String str3 = i12 != 1 ? i12 != 2 ? i12 != 3 ? "null" : "APPLY_AND_HIDE" : "APPLY" : "DISABLE";
        String strValueOf6 = String.valueOf(this.f757z);
        boolean z11 = this.f716B;
        String strValueOf7 = String.valueOf(this.f718D);
        int i13 = this.f735U;
        String str4 = i13 != 1 ? i13 != 2 ? "null" : "JSON" : "JAVA";
        String strValueOf8 = String.valueOf(this.f722H);
        String strValueOf9 = String.valueOf(this.f742k);
        this.f744m.getClass();
        String simpleName = new C1199b(this).getClass().getSimpleName();
        String strValueOf10 = String.valueOf(this.f727M);
        StringBuilder sbM1027p = AbstractC0255e.m1027p("JadxArgs{inputFiles=", strValueOf, ", outDir=", strValueOf2, ", outDirSrc=");
        AbstractC2091b.m5173t(sbM1027p, strValueOf3, ", outDirRes=", strValueOf4, ", threadsCount=");
        sbM1027p.append(i9);
        sbM1027p.append(", decompilationMode=");
        sbM1027p.append(strValueOf5);
        sbM1027p.append(", showInconsistentCode=");
        AbstractC3199a.m6851x(sbM1027p, z9, ", useImports=", this.f747p, ", skipResources=");
        sbM1027p.append(z10);
        sbM1027p.append(", skipSources=false, includeDependencies=false, userRenamesMappingsPath=null, userRenamesMappingsMode=");
        sbM1027p.append(str);
        sbM1027p.append(", deobfuscationOn=false, generatedRenamesMappingFile=null, generatedRenamesMappingFileMode=");
        AbstractC2091b.m5173t(sbM1027p, str2, ", resourceNameSource=", strM1034w, ", useSourceNameAsClassNameAlias=");
        sbM1027p.append(strM1035x);
        sbM1027p.append(", sourceNameRepeatLimit=");
        sbM1027p.append(this.f755x);
        sbM1027p.append(", useKotlinMethodsForVarNames=");
        sbM1027p.append(str3);
        sbM1027p.append(", insertDebugLines=false, extractFinally=");
        sbM1027p.append(this.f749r);
        sbM1027p.append(", deobfuscationMinLength=0, deobfuscationMaxLength=");
        sbM1027p.append(this.f756y);
        sbM1027p.append(", deobfuscationWhitelist=");
        sbM1027p.append(strValueOf6);
        sbM1027p.append(", escapeUnicode=false, replaceConsts=");
        AbstractC3199a.m6851x(sbM1027p, z11, ", restoreSwitchOverString=", this.f717C, ", respectBytecodeAccModifiers=false, exportGradleType=null, skipXmlPrettyPrint=false, fsCaseSensitive=false, renameFlags=");
        AbstractC2091b.m5173t(sbM1027p, strValueOf7, ", outputFormat=", str4, ", commentsLevel=");
        AbstractC2091b.m5173t(sbM1027p, strValueOf8, ", codeCache=", strValueOf9, ", codeWriter=");
        AbstractC2091b.m5173t(sbM1027p, simpleName, ", useDxInput=false, pluginOptions=", strValueOf10, ", cfgOutput=false, rawCFGOutput=false, useHeadersForDetectResourceExtensions=false, typeUpdatesLimitCount=");
        return AbstractC2091b.m5163j(sbM1027p, this.f723I, "}");
    }
}
