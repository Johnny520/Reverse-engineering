package p171h2;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC1928j;
import p078P1.C1146h;
import p078P1.C1147i;
import p078P1.InterfaceC1144f;
import p078P1.InterfaceC1151m;
import p088R1.C1211l;
import p121Y1.AbstractC1744e;
import p121Y1.C1755p;
import p121Y1.C1760u;
import p142c2.C1892c;
import p142c2.C1893d;
import p189k2.C2451a;
import p189k2.C2452b;
import p195l2.AbstractC2503g;
import p195l2.AbstractC2511o;
import p195l2.C2499c;

/* JADX INFO: renamed from: h2.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2234a implements Cloneable {

    /* JADX INFO: renamed from: d */
    public int f7295d;

    /* JADX INFO: renamed from: k */
    public boolean f7302k;

    /* JADX INFO: renamed from: o */
    public boolean f7306o;

    /* JADX INFO: renamed from: p */
    public boolean f7307p;

    /* JADX INFO: renamed from: r */
    public boolean f7309r;

    /* JADX INFO: renamed from: e */
    public C1211l f7296e = C1211l.f4022d;

    /* JADX INFO: renamed from: f */
    public EnumC1928j f7297f = EnumC1928j.f6549f;

    /* JADX INFO: renamed from: g */
    public boolean f7298g = true;

    /* JADX INFO: renamed from: h */
    public int f7299h = -1;

    /* JADX INFO: renamed from: i */
    public int f7300i = -1;

    /* JADX INFO: renamed from: j */
    public InterfaceC1144f f7301j = C2451a.f7915b;

    /* JADX INFO: renamed from: l */
    public C1147i f7303l = new C1147i();

    /* JADX INFO: renamed from: m */
    public C2499c f7304m = new C2499c(0);

    /* JADX INFO: renamed from: n */
    public Class f7305n = Object.class;

    /* JADX INFO: renamed from: q */
    public boolean f7308q = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m4036j(int i5, int i6) {
        return (i5 & i6) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public AbstractC2234a mo3605a(AbstractC2234a abstractC2234a) {
        if (this.f7307p) {
            return clone().mo3605a(abstractC2234a);
        }
        int i5 = abstractC2234a.f7295d;
        if (m4036j(abstractC2234a.f7295d, 1048576)) {
            this.f7309r = abstractC2234a.f7309r;
        }
        if (m4036j(abstractC2234a.f7295d, 4)) {
            this.f7296e = abstractC2234a.f7296e;
        }
        if (m4036j(abstractC2234a.f7295d, 8)) {
            this.f7297f = abstractC2234a.f7297f;
        }
        if (m4036j(abstractC2234a.f7295d, 16)) {
            this.f7295d &= -33;
        }
        if (m4036j(abstractC2234a.f7295d, 32)) {
            this.f7295d &= -17;
        }
        if (m4036j(abstractC2234a.f7295d, 64)) {
            this.f7295d &= -129;
        }
        if (m4036j(abstractC2234a.f7295d, 128)) {
            this.f7295d &= -65;
        }
        if (m4036j(abstractC2234a.f7295d, 256)) {
            this.f7298g = abstractC2234a.f7298g;
        }
        if (m4036j(abstractC2234a.f7295d, 512)) {
            this.f7300i = abstractC2234a.f7300i;
            this.f7299h = abstractC2234a.f7299h;
        }
        if (m4036j(abstractC2234a.f7295d, 1024)) {
            this.f7301j = abstractC2234a.f7301j;
        }
        if (m4036j(abstractC2234a.f7295d, 4096)) {
            this.f7305n = abstractC2234a.f7305n;
        }
        if (m4036j(abstractC2234a.f7295d, 8192)) {
            this.f7295d &= -16385;
        }
        if (m4036j(abstractC2234a.f7295d, 16384)) {
            this.f7295d &= -8193;
        }
        if (m4036j(abstractC2234a.f7295d, 131072)) {
            this.f7302k = abstractC2234a.f7302k;
        }
        if (m4036j(abstractC2234a.f7295d, 2048)) {
            this.f7304m.putAll(abstractC2234a.f7304m);
            this.f7308q = abstractC2234a.f7308q;
        }
        this.f7295d |= abstractC2234a.f7295d;
        this.f7303l.f3785b.mo4305g(abstractC2234a.f7303l.f3785b);
        m4043n();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // 
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public AbstractC2234a clone() {
        try {
            AbstractC2234a abstractC2234a = (AbstractC2234a) super.clone();
            C1147i c1147i = new C1147i();
            abstractC2234a.f7303l = c1147i;
            c1147i.f3785b.mo4305g(this.f7303l.f3785b);
            C2499c c2499c = new C2499c(0);
            abstractC2234a.f7304m = c2499c;
            c2499c.putAll(this.f7304m);
            abstractC2234a.f7306o = false;
            abstractC2234a.f7307p = false;
            return abstractC2234a;
        } catch (CloneNotSupportedException e5) {
            throw new RuntimeException(e5);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2234a) {
            return m4039i((AbstractC2234a) obj);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final AbstractC2234a m4037g(Class cls) {
        if (this.f7307p) {
            return clone().m4037g(cls);
        }
        this.f7305n = cls;
        this.f7295d |= 4096;
        m4043n();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final AbstractC2234a m4038h(C1211l c1211l) {
        if (this.f7307p) {
            return clone().m4038h(c1211l);
        }
        this.f7296e = c1211l;
        this.f7295d |= 4;
        m4043n();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        char[] cArr = AbstractC2511o.f8029a;
        return AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4459h(AbstractC2511o.m4458g(0, AbstractC2511o.m4458g(0, AbstractC2511o.m4458g(1, AbstractC2511o.m4458g(this.f7302k ? 1 : 0, AbstractC2511o.m4458g(this.f7300i, AbstractC2511o.m4458g(this.f7299h, AbstractC2511o.m4458g(this.f7298g ? 1 : 0, AbstractC2511o.m4459h(AbstractC2511o.m4458g(0, AbstractC2511o.m4459h(AbstractC2511o.m4458g(0, AbstractC2511o.m4459h(AbstractC2511o.m4458g(0, AbstractC2511o.m4458g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f7296e), this.f7297f), this.f7303l), this.f7304m), this.f7305n), this.f7301j), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m4039i(AbstractC2234a abstractC2234a) {
        abstractC2234a.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = AbstractC2511o.f8029a;
        return this.f7298g == abstractC2234a.f7298g && this.f7299h == abstractC2234a.f7299h && this.f7300i == abstractC2234a.f7300i && this.f7302k == abstractC2234a.f7302k && this.f7296e.equals(abstractC2234a.f7296e) && this.f7297f == abstractC2234a.f7297f && this.f7303l.equals(abstractC2234a.f7303l) && this.f7304m.equals(abstractC2234a.f7304m) && this.f7305n.equals(abstractC2234a.f7305n) && this.f7301j.equals(abstractC2234a.f7301j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final AbstractC2234a m4040k(C1755p c1755p, AbstractC1744e abstractC1744e) {
        if (this.f7307p) {
            return clone().m4040k(c1755p, abstractC1744e);
        }
        m4044o(C1755p.f6037g, c1755p);
        return m4047r(abstractC1744e, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final AbstractC2234a m4041l(int i5, int i6) {
        if (this.f7307p) {
            return clone().m4041l(i5, i6);
        }
        this.f7300i = i5;
        this.f7299h = i6;
        this.f7295d |= 512;
        m4043n();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final AbstractC2234a m4042m() {
        if (this.f7307p) {
            return clone().m4042m();
        }
        this.f7297f = EnumC1928j.f6550g;
        this.f7295d |= 8;
        m4043n();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4043n() {
        if (this.f7306o) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final AbstractC2234a m4044o(C1146h c1146h, C1755p c1755p) {
        if (this.f7307p) {
            return clone().m4044o(c1146h, c1755p);
        }
        AbstractC2503g.m4444b(c1146h);
        this.f7303l.f3785b.put(c1146h, c1755p);
        m4043n();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final AbstractC2234a m4045p(C2452b c2452b) {
        if (this.f7307p) {
            return clone().m4045p(c2452b);
        }
        this.f7301j = c2452b;
        this.f7295d |= 1024;
        m4043n();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final AbstractC2234a m4046q() {
        if (this.f7307p) {
            return clone().m4046q();
        }
        this.f7298g = false;
        this.f7295d |= 256;
        m4043n();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final AbstractC2234a m4047r(InterfaceC1151m interfaceC1151m, boolean z5) {
        if (this.f7307p) {
            return clone().m4047r(interfaceC1151m, z5);
        }
        C1760u c1760u = new C1760u(interfaceC1151m, z5);
        m4049t(Bitmap.class, interfaceC1151m, z5);
        m4049t(Drawable.class, c1760u, z5);
        m4049t(BitmapDrawable.class, c1760u, z5);
        m4049t(C1892c.class, new C1893d(interfaceC1151m), z5);
        m4043n();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final AbstractC2234a m4048s(C1755p c1755p, AbstractC1744e abstractC1744e) {
        if (this.f7307p) {
            return clone().m4048s(c1755p, abstractC1744e);
        }
        m4044o(C1755p.f6037g, c1755p);
        return m4047r(abstractC1744e, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final AbstractC2234a m4049t(Class cls, InterfaceC1151m interfaceC1151m, boolean z5) {
        if (this.f7307p) {
            return clone().m4049t(cls, interfaceC1151m, z5);
        }
        AbstractC2503g.m4444b(interfaceC1151m);
        this.f7304m.put(cls, interfaceC1151m);
        int i5 = this.f7295d;
        this.f7295d = 67584 | i5;
        this.f7308q = false;
        if (z5) {
            this.f7295d = i5 | 198656;
            this.f7302k = true;
        }
        m4043n();
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final AbstractC2234a m4050u() {
        if (this.f7307p) {
            return clone().m4050u();
        }
        this.f7309r = true;
        this.f7295d |= 1048576;
        m4043n();
        return this;
    }
}
