package p277t2;

import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1067w;
import p098g9.InterfaceC2557k;

/* JADX INFO: renamed from: t2.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8072g0 {

    /* JADX INFO: renamed from: a */
    public final String f26950a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0188p f26951b;

    /* JADX INFO: renamed from: c */
    public boolean f26952c;

    /* JADX INFO: renamed from: d */
    public String f26953d;

    /* JADX INFO: renamed from: t2.g0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public static final a f26954r = new a();

        public a() {
            super(2);
        }

        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public /* synthetic */ C8072g0(String str, InterfaceC0188p interfaceC0188p, int i10, AbstractC1043k abstractC1043k) {
        this(str, (i10 & 2) != 0 ? a.f26954r : interfaceC0188p);
    }

    /* JADX INFO: renamed from: a */
    public final String m31153a() {
        return this.f26953d;
    }

    /* JADX INFO: renamed from: b */
    public final String m31154b() {
        return this.f26950a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m31155c() {
        return this.f26952c;
    }

    /* JADX INFO: renamed from: d */
    public final Object m31156d(Object obj, Object obj2) {
        return this.f26951b.invoke(obj, obj2);
    }

    /* JADX INFO: renamed from: e */
    public final void m31157e(InterfaceC8074h0 interfaceC8074h0, InterfaceC2557k interfaceC2557k, Object obj) {
        interfaceC8074h0.mo19816a(this, obj);
    }

    public String toString() {
        return "AccessibilityKey: " + this.f26950a;
    }

    public C8072g0(String str, InterfaceC0188p interfaceC0188p) {
        this.f26950a = str;
        this.f26951b = interfaceC0188p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8072g0(String str, boolean z10) {
        this(str, (InterfaceC0188p) null, 2, (AbstractC1043k) (0 == true ? 1 : 0));
        this.f26952c = z10;
    }

    public /* synthetic */ C8072g0(String str, boolean z10, InterfaceC0188p interfaceC0188p, String str2, int i10, AbstractC1043k abstractC1043k) {
        this(str, z10, interfaceC0188p, (i10 & 8) != 0 ? null : str2);
    }

    public C8072g0(String str, boolean z10, InterfaceC0188p interfaceC0188p, String str2) {
        this(str, interfaceC0188p);
        this.f26952c = z10;
        this.f26953d = str2;
    }
}
