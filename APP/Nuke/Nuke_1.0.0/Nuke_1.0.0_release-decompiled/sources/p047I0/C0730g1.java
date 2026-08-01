package p047I0;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1603e;
import p172h3.C2243c;
import p178i3.InterfaceC2324e;

/* JADX INFO: renamed from: I0.g1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0730g1 extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f2301h = 1;

    /* JADX INFO: renamed from: i */
    public Object f2302i;

    /* JADX INFO: renamed from: j */
    public int f2303j;

    /* JADX INFO: renamed from: k */
    public Object f2304k;

    /* JADX INFO: renamed from: l */
    public Object f2305l;

    /* JADX INFO: renamed from: m */
    public Object f2306m;

    /* JADX INFO: renamed from: n */
    public Object f2307n;

    /* JADX INFO: renamed from: o */
    public /* synthetic */ Object f2308o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f2309p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0730g1(InterfaceC1599a interfaceC1599a, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2309p = interfaceC1599a;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) throws Throwable {
        InterfaceC2324e interfaceC2324e = (InterfaceC2324e) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f2301h) {
            case 0:
                return ((C0730g1) mo7n(interfaceC1046d, interfaceC2324e)).mo8p(C0891q.f2780a);
            default:
                ((C0730g1) mo7n(interfaceC1046d, interfaceC2324e)).mo8p(C0891q.f2780a);
                return EnumC1152a.f3788d;
        }
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2301h) {
            case 0:
                C0730g1 c0730g1 = new C0730g1((ContentResolver) this.f2305l, (Uri) this.f2306m, (C0733h1) this.f2307n, (C2243c) this.f2308o, (Context) this.f2309p, interfaceC1046d);
                c0730g1.f2302i = obj;
                return c0730g1;
            default:
                C0730g1 c0730g12 = new C0730g1((InterfaceC1599a) this.f2309p, interfaceC1046d);
                c0730g12.f2308o = obj;
                return c0730g12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b6, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Path cross not found for [B:47:0x011f, B:59:0x0150], limit reached: 164 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01d2 A[LOOP:0: B:40:0x00fa->B:100:0x01d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x025d A[Catch: all -> 0x0211, TRY_LEAVE, TryCatch #0 {all -> 0x0211, blocks: (B:118:0x020b, B:129:0x0243, B:133:0x0255, B:135:0x025d, B:125:0x0224, B:128:0x023a), top: B:143:0x01fd }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0178 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01be  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x0282 -> B:129:0x0243). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01b5 -> B:87:0x01b6). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p047I0.C0730g1.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0730g1(ContentResolver contentResolver, Uri uri, C0733h1 c0733h1, C2243c c2243c, Context context, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2305l = contentResolver;
        this.f2306m = uri;
        this.f2307n = c0733h1;
        this.f2308o = c2243c;
        this.f2309p = context;
    }
}
