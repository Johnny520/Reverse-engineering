package p080fb;

import android.content.Context;
import be.AbstractC0283h;
import be.C0293m;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;
import p007a7.C0019b;
import p007a7.C0020c;
import p007a7.C0022e;
import p034c7.AbstractC0409e;
import p034c7.C0405a;
import p085fg.InterfaceC1220a;
import p124i7.C1995e;
import p166l7.C2524l;
import p257r7.C3734x;
import p276sf.EnumC3957d;
import p298u7.C4279b;
import p314v7.C4490d;
import p363y7.AbstractC5999a;
import p379z7.C6107c;
import p379z7.C6111g;
import p379z7.C6112h;

/* JADX INFO: renamed from: fb.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1136j0 implements AutoCloseable {

    /* JADX INFO: renamed from: g */
    public final Context f3728g;

    /* JADX INFO: renamed from: h */
    public final DexKitBridge f3729h;

    /* JADX INFO: renamed from: i */
    public final String f3730i;

    /* JADX INFO: renamed from: j */
    public final String f3731j;

    /* JADX INFO: renamed from: k */
    public final String f3732k;

    /* JADX INFO: renamed from: l */
    public final String f3733l;

    /* JADX INFO: renamed from: m */
    public final boolean f3734m;

    /* JADX INFO: renamed from: n */
    public final C1145l1 f3735n;

    /* JADX INFO: renamed from: o */
    public final C1112d0 f3736o;

    /* JADX INFO: renamed from: p */
    public final Object f3737p;

    /* JADX INFO: renamed from: q */
    public final Object f3738q;

    /* JADX INFO: renamed from: r */
    public final Object f3739r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1136j0(Context context, DexKitBridge dexKitBridge, String str, String str2, String str3, String str4, boolean z9) {
        this.f3728g = context;
        this.f3729h = dexKitBridge;
        this.f3730i = str;
        this.f3731j = str2;
        this.f3732k = str3;
        this.f3733l = str4;
        this.f3734m = z9;
        C1145l1 c1145l1 = new C1145l1(new File(context.getCacheDir(), "Hchat_agent_reverse"), str);
        this.f3735n = c1145l1;
        this.f3736o = new C1112d0(c1145l1, str);
        final int i9 = 0;
        InterfaceC1220a interfaceC1220a = new InterfaceC1220a(this) { // from class: fb.i0

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1136j0 f3707h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3707h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, sf.c] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, sf.c] */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        C0405a c0405a = new C0405a(new C1995e(new File(this.f3707h.f3730i)), 1);
                        C0020c c0020c = new C0020c("base", c0405a.m1364a());
                        c0020c.f69p = c0405a;
                        c0020c.f62i = false;
                        c0020c.f63j = true;
                        return c0020c;
                    case 1:
                        Object value = this.f3707h.f3737p.getValue();
                        value.getClass();
                        return ((C0020c) value).mo270g();
                    default:
                        HashMap map = new HashMap();
                        Object value2 = this.f3707h.f3737p.getValue();
                        value2.getClass();
                        C0020c c0020c2 = (C0020c) value2;
                        C6107c<C0022e> c6107c = new C6107c(0);
                        C2524l c2524lMo270g = c0020c2.mo270g();
                        if (c2524lMo270g != null) {
                            C4279b c4279b = c2524lMo270g.f8154o;
                            for (AbstractC0409e abstractC0409e : c0020c2.f61h.m1371c()) {
                                String strM1368a = abstractC0409e.m1368a();
                                c4279b.m8599U();
                                Iterator itM2580o = c4279b.f14198r.m2580o(strM1368a);
                                while (itM2580o.hasNext()) {
                                    C3734x c3734x = (C3734x) itM2580o.next();
                                    C0019b c0019b = new C0019b(0);
                                    c3734x.mo7736W();
                                    Iterator itM10744g = AbstractC5999a.m10744g(c3734x.f12105p);
                                    List listM1150b0 = AbstractC0283h.m1150b0(!itM10744g.hasNext() ? C6112h.f24664g : new C6111g(itM10744g, new C0293m(C4490d.class, 2, c0019b)));
                                    if (!listM1150b0.isEmpty()) {
                                        c6107c.add(new C0022e(abstractC0409e, listM1150b0));
                                    }
                                }
                            }
                        }
                        for (C0022e c0022e : c6107c) {
                            c0022e.getClass();
                            Iterator it = c0022e.f75g.iterator();
                            while (it.hasNext()) {
                                map.putIfAbsent(Integer.valueOf(((C4490d) it.next()).m8926M()), c0022e.f76h.m1368a());
                            }
                        }
                        return map;
                }
            }
        };
        EnumC3957d enumC3957d = EnumC3957d.f12958g;
        this.f3737p = AbstractC0283h.m1127G(enumC3957d, interfaceC1220a);
        final int i10 = 1;
        this.f3738q = AbstractC0283h.m1127G(enumC3957d, new InterfaceC1220a(this) { // from class: fb.i0

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1136j0 f3707h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3707h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, sf.c] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, sf.c] */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        C0405a c0405a = new C0405a(new C1995e(new File(this.f3707h.f3730i)), 1);
                        C0020c c0020c = new C0020c("base", c0405a.m1364a());
                        c0020c.f69p = c0405a;
                        c0020c.f62i = false;
                        c0020c.f63j = true;
                        return c0020c;
                    case 1:
                        Object value = this.f3707h.f3737p.getValue();
                        value.getClass();
                        return ((C0020c) value).mo270g();
                    default:
                        HashMap map = new HashMap();
                        Object value2 = this.f3707h.f3737p.getValue();
                        value2.getClass();
                        C0020c c0020c2 = (C0020c) value2;
                        C6107c<C0022e> c6107c = new C6107c(0);
                        C2524l c2524lMo270g = c0020c2.mo270g();
                        if (c2524lMo270g != null) {
                            C4279b c4279b = c2524lMo270g.f8154o;
                            for (AbstractC0409e abstractC0409e : c0020c2.f61h.m1371c()) {
                                String strM1368a = abstractC0409e.m1368a();
                                c4279b.m8599U();
                                Iterator itM2580o = c4279b.f14198r.m2580o(strM1368a);
                                while (itM2580o.hasNext()) {
                                    C3734x c3734x = (C3734x) itM2580o.next();
                                    C0019b c0019b = new C0019b(0);
                                    c3734x.mo7736W();
                                    Iterator itM10744g = AbstractC5999a.m10744g(c3734x.f12105p);
                                    List listM1150b0 = AbstractC0283h.m1150b0(!itM10744g.hasNext() ? C6112h.f24664g : new C6111g(itM10744g, new C0293m(C4490d.class, 2, c0019b)));
                                    if (!listM1150b0.isEmpty()) {
                                        c6107c.add(new C0022e(abstractC0409e, listM1150b0));
                                    }
                                }
                            }
                        }
                        for (C0022e c0022e : c6107c) {
                            c0022e.getClass();
                            Iterator it = c0022e.f75g.iterator();
                            while (it.hasNext()) {
                                map.putIfAbsent(Integer.valueOf(((C4490d) it.next()).m8926M()), c0022e.f76h.m1368a());
                            }
                        }
                        return map;
                }
            }
        });
        final int i11 = 2;
        this.f3739r = AbstractC0283h.m1127G(enumC3957d, new InterfaceC1220a(this) { // from class: fb.i0

            /* JADX INFO: renamed from: h */
            public final /* synthetic */ C1136j0 f3707h;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f3707h = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, sf.c] */
            /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, sf.c] */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i11) {
                    case 0:
                        C0405a c0405a = new C0405a(new C1995e(new File(this.f3707h.f3730i)), 1);
                        C0020c c0020c = new C0020c("base", c0405a.m1364a());
                        c0020c.f69p = c0405a;
                        c0020c.f62i = false;
                        c0020c.f63j = true;
                        return c0020c;
                    case 1:
                        Object value = this.f3707h.f3737p.getValue();
                        value.getClass();
                        return ((C0020c) value).mo270g();
                    default:
                        HashMap map = new HashMap();
                        Object value2 = this.f3707h.f3737p.getValue();
                        value2.getClass();
                        C0020c c0020c2 = (C0020c) value2;
                        C6107c<C0022e> c6107c = new C6107c(0);
                        C2524l c2524lMo270g = c0020c2.mo270g();
                        if (c2524lMo270g != null) {
                            C4279b c4279b = c2524lMo270g.f8154o;
                            for (AbstractC0409e abstractC0409e : c0020c2.f61h.m1371c()) {
                                String strM1368a = abstractC0409e.m1368a();
                                c4279b.m8599U();
                                Iterator itM2580o = c4279b.f14198r.m2580o(strM1368a);
                                while (itM2580o.hasNext()) {
                                    C3734x c3734x = (C3734x) itM2580o.next();
                                    C0019b c0019b = new C0019b(0);
                                    c3734x.mo7736W();
                                    Iterator itM10744g = AbstractC5999a.m10744g(c3734x.f12105p);
                                    List listM1150b0 = AbstractC0283h.m1150b0(!itM10744g.hasNext() ? C6112h.f24664g : new C6111g(itM10744g, new C0293m(C4490d.class, 2, c0019b)));
                                    if (!listM1150b0.isEmpty()) {
                                        c6107c.add(new C0022e(abstractC0409e, listM1150b0));
                                    }
                                }
                            }
                        }
                        for (C0022e c0022e : c6107c) {
                            c0022e.getClass();
                            Iterator it = c0022e.f75g.iterator();
                            while (it.hasNext()) {
                                map.putIfAbsent(Integer.valueOf(((C4490d) it.next()).m8926M()), c0022e.f76h.m1368a());
                            }
                        }
                        return map;
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sf.c] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        ?? r02 = this.f3737p;
        if (r02.mo8178a()) {
            try {
                ((C0020c) r02.getValue()).close();
            } catch (Throwable unused) {
            }
        }
        if (this.f3734m) {
            try {
                this.f3729h.close();
            } catch (Throwable unused2) {
            }
        }
    }
}
