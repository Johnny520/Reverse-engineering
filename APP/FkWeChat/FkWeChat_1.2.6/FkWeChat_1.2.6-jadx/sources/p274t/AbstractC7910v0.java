package p274t;

import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p272s8.AbstractC7198b;
import p272s8.InterfaceC7197a;

/* JADX INFO: renamed from: t.v0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7910v0 {

    /* JADX INFO: renamed from: a */
    public final a f26360a;

    /* JADX INFO: renamed from: b */
    public final int f26361b;

    /* JADX INFO: renamed from: c */
    public final int f26362c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0184l f26363d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0184l f26364e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: t.v0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: q */
        public static final a f26365q = new a("Visible", 0);

        /* JADX INFO: renamed from: r */
        public static final a f26366r = new a("Clip", 1);

        /* JADX INFO: renamed from: s */
        public static final a f26367s = new a("ExpandIndicator", 2);

        /* JADX INFO: renamed from: t */
        public static final a f26368t = new a("ExpandOrCollapseIndicator", 3);

        /* JADX INFO: renamed from: u */
        public static final /* synthetic */ a[] f26369u;

        /* JADX INFO: renamed from: v */
        public static final /* synthetic */ InterfaceC7197a f26370v;

        static {
            a[] aVarArrM30543a = m30543a();
            f26369u = aVarArrM30543a;
            f26370v = AbstractC7198b.m28437a(aVarArrM30543a);
        }

        public a(String str, int i10) {
        }

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ a[] m30543a() {
            return new a[]{f26365q, f26366r, f26367s, f26368t};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f26369u.clone();
        }
    }

    /* JADX INFO: renamed from: t.v0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26371a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f26367s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f26368t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26371a = iArr;
        }
    }

    public AbstractC7910v0(a aVar, int i10, int i11, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        this.f26360a = aVar;
        this.f26361b = i10;
        this.f26362c = i11;
        this.f26363d = interfaceC0184l;
        this.f26364e = interfaceC0184l2;
    }

    /* JADX INFO: renamed from: a */
    public final void m30541a(C7925y0 c7925y0, List list) {
        InterfaceC0184l interfaceC0184l = this.f26363d;
        InterfaceC0188p interfaceC0188p = interfaceC0184l != null ? (InterfaceC0188p) interfaceC0184l.mo27m(c7925y0) : null;
        InterfaceC0184l interfaceC0184l2 = this.f26364e;
        InterfaceC0188p interfaceC0188p2 = interfaceC0184l2 != null ? (InterfaceC0188p) interfaceC0184l2.mo27m(c7925y0) : null;
        int i10 = b.f26371a[this.f26360a.ordinal()];
        if (i10 == 1) {
            if (interfaceC0188p != null) {
                list.add(interfaceC0188p);
            }
        } else {
            if (i10 != 2) {
                return;
            }
            if (interfaceC0188p != null) {
                list.add(interfaceC0188p);
            }
            if (interfaceC0188p2 != null) {
                list.add(interfaceC0188p2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final C7925y0 m30542b() {
        return new C7925y0(this.f26360a, this.f26361b, this.f26362c);
    }

    public /* synthetic */ AbstractC7910v0(a aVar, int i10, int i11, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2, AbstractC1043k abstractC1043k) {
        this(aVar, i10, i11, interfaceC0184l, interfaceC0184l2);
    }
}
