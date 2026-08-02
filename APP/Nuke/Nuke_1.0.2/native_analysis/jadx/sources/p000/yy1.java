package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yy1 extends zy1 implements InterfaceC0329iy {

    /* JADX INFO: renamed from: k */
    public static final yy1 f13674k = new yy1(h43.f3816e, 0);

    @Override // p000.zy1
    /* JADX INFO: renamed from: a */
    public final bz1 mo6368a() {
        xy1 xy1Var = new xy1(this);
        xy1Var.f13236n = this;
        return xy1Var;
    }

    @Override // p000.zy1
    /* JADX INFO: renamed from: b */
    public final bz1 mo6369b() {
        xy1 xy1Var = new xy1(this);
        xy1Var.f13236n = this;
        return xy1Var;
    }

    @Override // p000.zy1, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof e42) {
            return super.containsKey((e42) obj);
        }
        return false;
    }

    @Override // p000.zy1, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof m93) {
            return super.containsValue((m93) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public final yy1 m6370d(e42 e42Var, m93 m93Var) {
        C0133dk c0133dkM2074u = this.f14150h.m2074u(e42Var.hashCode(), 0, e42Var, m93Var);
        return c0133dkM2074u == null ? this : new yy1((h43) c0133dkM2074u.f2082j, this.f14151i + c0133dkM2074u.f2081i);
    }

    @Override // p000.zy1, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof e42) {
            return (m93) super.get((e42) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof e42) ? obj2 : (m93) super.getOrDefault((e42) obj, (m93) obj2);
    }
}
