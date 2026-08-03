package p000;

import java.util.List;

/* JADX INFO: renamed from: la */
/* JADX INFO: loaded from: classes.dex */
public final class C2187la {

    /* JADX INFO: renamed from: a */
    public final AbstractC2140ka f7628a;

    /* JADX INFO: renamed from: b */
    public int f7629b;

    /* JADX INFO: renamed from: c */
    public int f7630c;

    /* JADX INFO: renamed from: d */
    public int f7631d = 0;

    public C2187la(AbstractC2140ka abstractC2140ka) {
        AbstractC0501Ll.m982a("input", abstractC2140ka);
        this.f7628a = abstractC2140ka;
        abstractC2140ka.f7486b = this;
    }

    /* JADX INFO: renamed from: w */
    public static void m4401w(int i) throws C0673Pl {
        if ((i & 3) != 0) {
            throw C0673Pl.m1369f();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m4402x(int i) throws C0673Pl {
        if ((i & 7) != 0) {
            throw C0673Pl.m1369f();
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m4403a() {
        int i = this.f7631d;
        if (i != 0) {
            this.f7629b = i;
            this.f7631d = 0;
        } else {
            this.f7629b = this.f7628a.mo2927B();
        }
        int i2 = this.f7629b;
        if (i2 == 0 || i2 == this.f7630c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    /* JADX INFO: renamed from: b */
    public final void m4404b(Object obj, InterfaceC2253mx interfaceC2253mx, C0839Tg c0839Tg) {
        int i = this.f7630c;
        this.f7630c = ((this.f7629b >>> 3) << 3) | 4;
        try {
            interfaceC2253mx.mo1079i(obj, this, c0839Tg);
            if (this.f7629b == this.f7630c) {
            } else {
                throw C0673Pl.m1369f();
            }
        } finally {
            this.f7630c = i;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4405c(Object obj, InterfaceC2253mx interfaceC2253mx, C0839Tg c0839Tg) throws C0673Pl {
        AbstractC2140ka abstractC2140ka = this.f7628a;
        int iMo2928C = abstractC2140ka.mo2928C();
        if (abstractC2140ka.f7485a >= 100) {
            throw new C0673Pl("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo2940l = abstractC2140ka.mo2940l(iMo2928C);
        abstractC2140ka.f7485a++;
        interfaceC2253mx.mo1079i(obj, this, c0839Tg);
        abstractC2140ka.mo2936b(0);
        abstractC2140ka.f7485a--;
        abstractC2140ka.mo2939j(iMo2940l);
    }

    /* JADX INFO: renamed from: d */
    public final void m4406d(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC0779S5;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(abstractC2140ka.mo2941m()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2937f = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
            do {
                list.add(Boolean.valueOf(abstractC2140ka.mo2941m()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            m4423u(iMo2937f);
            return;
        }
        AbstractC0779S5 abstractC0779S5 = (AbstractC0779S5) list;
        int i2 = this.f7629b & 7;
        if (i2 == 0) {
            do {
                abstractC0779S5.m1601b(abstractC2140ka.mo2941m());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2937f2 = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
        do {
            abstractC0779S5.m1601b(abstractC2140ka.mo2941m());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
        m4423u(iMo2937f2);
    }

    /* JADX INFO: renamed from: e */
    public final AbstractC2744y6 m4407e() throws C0630Ol {
        m4424v(2);
        return this.f7628a.mo2942n();
    }

    /* JADX INFO: renamed from: f */
    public final void m4408f(List list) throws C0630Ol {
        int iMo2927B;
        if ((this.f7629b & 7) != 2) {
            throw C0673Pl.m1366c();
        }
        do {
            list.add(m4407e());
            AbstractC2140ka abstractC2140ka = this.f7628a;
            if (abstractC2140ka.mo2938g()) {
                return;
            } else {
                iMo2927B = abstractC2140ka.mo2927B();
            }
        } while (iMo2927B == this.f7629b);
        this.f7631d = iMo2927B;
    }

    /* JADX INFO: renamed from: g */
    public final void m4409g(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC2191le;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(abstractC2140ka.mo2943o()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2928C = abstractC2140ka.mo2928C();
            m4402x(iMo2928C);
            int iMo2937f = abstractC2140ka.mo2937f() + iMo2928C;
            do {
                list.add(Double.valueOf(abstractC2140ka.mo2943o()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            return;
        }
        AbstractC2191le abstractC2191le = (AbstractC2191le) list;
        int i2 = this.f7629b & 7;
        if (i2 == 1) {
            do {
                abstractC2191le.m4426b(abstractC2140ka.mo2943o());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2928C2 = abstractC2140ka.mo2928C();
        m4402x(iMo2928C2);
        int iMo2937f2 = abstractC2140ka.mo2937f() + iMo2928C2;
        do {
            abstractC2191le.m4426b(abstractC2140ka.mo2943o());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
    }

    /* JADX INFO: renamed from: h */
    public final void m4410h(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC0071Bl;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC2140ka.mo2944p()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2937f = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
            do {
                list.add(Integer.valueOf(abstractC2140ka.mo2944p()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            m4423u(iMo2937f);
            return;
        }
        AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) list;
        int i2 = this.f7629b & 7;
        if (i2 == 0) {
            do {
                abstractC0071Bl.m119b(abstractC2140ka.mo2944p());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2937f2 = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
        do {
            abstractC0071Bl.m119b(abstractC2140ka.mo2944p());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
        m4423u(iMo2937f2);
    }

    /* JADX INFO: renamed from: i */
    public final void m4411i(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC0071Bl;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 2) {
                int iMo2928C = abstractC2140ka.mo2928C();
                m4401w(iMo2928C);
                int iMo2937f = abstractC2140ka.mo2937f() + iMo2928C;
                do {
                    list.add(Integer.valueOf(abstractC2140ka.mo2945q()));
                } while (abstractC2140ka.mo2937f() < iMo2937f);
                return;
            }
            if (i != 5) {
                throw C0673Pl.m1366c();
            }
            do {
                list.add(Integer.valueOf(abstractC2140ka.mo2945q()));
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B == this.f7629b);
            this.f7631d = iMo2927B;
            return;
        }
        AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) list;
        int i2 = this.f7629b & 7;
        if (i2 == 2) {
            int iMo2928C2 = abstractC2140ka.mo2928C();
            m4401w(iMo2928C2);
            int iMo2937f2 = abstractC2140ka.mo2937f() + iMo2928C2;
            do {
                abstractC0071Bl.m119b(abstractC2140ka.mo2945q());
            } while (abstractC2140ka.mo2937f() < iMo2937f2);
            return;
        }
        if (i2 != 5) {
            throw C0673Pl.m1366c();
        }
        do {
            abstractC0071Bl.m119b(abstractC2140ka.mo2945q());
            if (abstractC2140ka.mo2938g()) {
                return;
            } else {
                iMo2927B2 = abstractC2140ka.mo2927B();
            }
        } while (iMo2927B2 == this.f7629b);
        this.f7631d = iMo2927B2;
    }

    /* JADX INFO: renamed from: j */
    public final void m4412j(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC2382pp;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC2140ka.mo2946r()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2928C = abstractC2140ka.mo2928C();
            m4402x(iMo2928C);
            int iMo2937f = abstractC2140ka.mo2937f() + iMo2928C;
            do {
                list.add(Long.valueOf(abstractC2140ka.mo2946r()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            return;
        }
        AbstractC2382pp abstractC2382pp = (AbstractC2382pp) list;
        int i2 = this.f7629b & 7;
        if (i2 == 1) {
            do {
                abstractC2382pp.m4821b(abstractC2140ka.mo2946r());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2928C2 = abstractC2140ka.mo2928C();
        m4402x(iMo2928C2);
        int iMo2937f2 = abstractC2140ka.mo2937f() + iMo2928C2;
        do {
            abstractC2382pp.m4821b(abstractC2140ka.mo2946r());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
    }

    /* JADX INFO: renamed from: k */
    public final void m4413k(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC0196Eh;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 2) {
                int iMo2928C = abstractC2140ka.mo2928C();
                m4401w(iMo2928C);
                int iMo2937f = abstractC2140ka.mo2937f() + iMo2928C;
                do {
                    list.add(Float.valueOf(abstractC2140ka.mo2947s()));
                } while (abstractC2140ka.mo2937f() < iMo2937f);
                return;
            }
            if (i != 5) {
                throw C0673Pl.m1366c();
            }
            do {
                list.add(Float.valueOf(abstractC2140ka.mo2947s()));
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B == this.f7629b);
            this.f7631d = iMo2927B;
            return;
        }
        AbstractC0196Eh abstractC0196Eh = (AbstractC0196Eh) list;
        int i2 = this.f7629b & 7;
        if (i2 == 2) {
            int iMo2928C2 = abstractC2140ka.mo2928C();
            m4401w(iMo2928C2);
            int iMo2937f2 = abstractC2140ka.mo2937f() + iMo2928C2;
            do {
                abstractC0196Eh.m389b(abstractC2140ka.mo2947s());
            } while (abstractC2140ka.mo2937f() < iMo2937f2);
            return;
        }
        if (i2 != 5) {
            throw C0673Pl.m1366c();
        }
        do {
            abstractC0196Eh.m389b(abstractC2140ka.mo2947s());
            if (abstractC2140ka.mo2938g()) {
                return;
            } else {
                iMo2927B2 = abstractC2140ka.mo2927B();
            }
        } while (iMo2927B2 == this.f7629b);
        this.f7631d = iMo2927B2;
    }

    /* JADX INFO: renamed from: l */
    public final void m4414l(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC0071Bl;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC2140ka.mo2948t()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2937f = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
            do {
                list.add(Integer.valueOf(abstractC2140ka.mo2948t()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            m4423u(iMo2937f);
            return;
        }
        AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) list;
        int i2 = this.f7629b & 7;
        if (i2 == 0) {
            do {
                abstractC0071Bl.m119b(abstractC2140ka.mo2948t());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2937f2 = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
        do {
            abstractC0071Bl.m119b(abstractC2140ka.mo2948t());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
        m4423u(iMo2937f2);
    }

    /* JADX INFO: renamed from: m */
    public final void m4415m(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC2382pp;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC2140ka.mo2949u()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2937f = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
            do {
                list.add(Long.valueOf(abstractC2140ka.mo2949u()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            m4423u(iMo2937f);
            return;
        }
        AbstractC2382pp abstractC2382pp = (AbstractC2382pp) list;
        int i2 = this.f7629b & 7;
        if (i2 == 0) {
            do {
                abstractC2382pp.m4821b(abstractC2140ka.mo2949u());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2937f2 = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
        do {
            abstractC2382pp.m4821b(abstractC2140ka.mo2949u());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
        m4423u(iMo2937f2);
    }

    /* JADX INFO: renamed from: n */
    public final void m4416n(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC0071Bl;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 2) {
                int iMo2928C = abstractC2140ka.mo2928C();
                m4401w(iMo2928C);
                int iMo2937f = abstractC2140ka.mo2937f() + iMo2928C;
                do {
                    list.add(Integer.valueOf(abstractC2140ka.mo2950v()));
                } while (abstractC2140ka.mo2937f() < iMo2937f);
                return;
            }
            if (i != 5) {
                throw C0673Pl.m1366c();
            }
            do {
                list.add(Integer.valueOf(abstractC2140ka.mo2950v()));
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B == this.f7629b);
            this.f7631d = iMo2927B;
            return;
        }
        AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) list;
        int i2 = this.f7629b & 7;
        if (i2 == 2) {
            int iMo2928C2 = abstractC2140ka.mo2928C();
            m4401w(iMo2928C2);
            int iMo2937f2 = abstractC2140ka.mo2937f() + iMo2928C2;
            do {
                abstractC0071Bl.m119b(abstractC2140ka.mo2950v());
            } while (abstractC2140ka.mo2937f() < iMo2937f2);
            return;
        }
        if (i2 != 5) {
            throw C0673Pl.m1366c();
        }
        do {
            abstractC0071Bl.m119b(abstractC2140ka.mo2950v());
            if (abstractC2140ka.mo2938g()) {
                return;
            } else {
                iMo2927B2 = abstractC2140ka.mo2927B();
            }
        } while (iMo2927B2 == this.f7629b);
        this.f7631d = iMo2927B2;
    }

    /* JADX INFO: renamed from: o */
    public final void m4417o(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC2382pp;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(abstractC2140ka.mo2951w()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2928C = abstractC2140ka.mo2928C();
            m4402x(iMo2928C);
            int iMo2937f = abstractC2140ka.mo2937f() + iMo2928C;
            do {
                list.add(Long.valueOf(abstractC2140ka.mo2951w()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            return;
        }
        AbstractC2382pp abstractC2382pp = (AbstractC2382pp) list;
        int i2 = this.f7629b & 7;
        if (i2 == 1) {
            do {
                abstractC2382pp.m4821b(abstractC2140ka.mo2951w());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2928C2 = abstractC2140ka.mo2928C();
        m4402x(iMo2928C2);
        int iMo2937f2 = abstractC2140ka.mo2937f() + iMo2928C2;
        do {
            abstractC2382pp.m4821b(abstractC2140ka.mo2951w());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
    }

    /* JADX INFO: renamed from: p */
    public final void m4418p(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC0071Bl;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC2140ka.mo2952x()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2937f = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
            do {
                list.add(Integer.valueOf(abstractC2140ka.mo2952x()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            m4423u(iMo2937f);
            return;
        }
        AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) list;
        int i2 = this.f7629b & 7;
        if (i2 == 0) {
            do {
                abstractC0071Bl.m119b(abstractC2140ka.mo2952x());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2937f2 = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
        do {
            abstractC0071Bl.m119b(abstractC2140ka.mo2952x());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
        m4423u(iMo2937f2);
    }

    /* JADX INFO: renamed from: q */
    public final void m4419q(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC2382pp;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC2140ka.mo2953y()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2937f = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
            do {
                list.add(Long.valueOf(abstractC2140ka.mo2953y()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            m4423u(iMo2937f);
            return;
        }
        AbstractC2382pp abstractC2382pp = (AbstractC2382pp) list;
        int i2 = this.f7629b & 7;
        if (i2 == 0) {
            do {
                abstractC2382pp.m4821b(abstractC2140ka.mo2953y());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2937f2 = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
        do {
            abstractC2382pp.m4821b(abstractC2140ka.mo2953y());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
        m4423u(iMo2937f2);
    }

    /* JADX INFO: renamed from: r */
    public final void m4420r(List list, boolean z) throws C0630Ol {
        String strMo2954z;
        int iMo2927B;
        int iMo2927B2;
        if ((this.f7629b & 7) != 2) {
            throw C0673Pl.m1366c();
        }
        boolean z2 = list instanceof InterfaceC0374In;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (z2 && !z) {
            InterfaceC0374In interfaceC0374In = (InterfaceC0374In) list;
            do {
                interfaceC0374In.mo715d(m4407e());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        do {
            if (z) {
                m4424v(2);
                strMo2954z = abstractC2140ka.mo2926A();
            } else {
                m4424v(2);
                strMo2954z = abstractC2140ka.mo2954z();
            }
            list.add(strMo2954z);
            if (abstractC2140ka.mo2938g()) {
                return;
            } else {
                iMo2927B = abstractC2140ka.mo2927B();
            }
        } while (iMo2927B == this.f7629b);
        this.f7631d = iMo2927B;
    }

    /* JADX INFO: renamed from: s */
    public final void m4421s(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC0071Bl;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(abstractC2140ka.mo2928C()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2937f = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
            do {
                list.add(Integer.valueOf(abstractC2140ka.mo2928C()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            m4423u(iMo2937f);
            return;
        }
        AbstractC0071Bl abstractC0071Bl = (AbstractC0071Bl) list;
        int i2 = this.f7629b & 7;
        if (i2 == 0) {
            do {
                abstractC0071Bl.m119b(abstractC2140ka.mo2928C());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2937f2 = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
        do {
            abstractC0071Bl.m119b(abstractC2140ka.mo2928C());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
        m4423u(iMo2937f2);
    }

    /* JADX INFO: renamed from: t */
    public final void m4422t(List list) throws C0673Pl {
        int iMo2927B;
        int iMo2927B2;
        boolean z = list instanceof AbstractC2382pp;
        AbstractC2140ka abstractC2140ka = this.f7628a;
        if (!z) {
            int i = this.f7629b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(abstractC2140ka.mo2929D()));
                    if (abstractC2140ka.mo2938g()) {
                        return;
                    } else {
                        iMo2927B = abstractC2140ka.mo2927B();
                    }
                } while (iMo2927B == this.f7629b);
                this.f7631d = iMo2927B;
                return;
            }
            if (i != 2) {
                throw C0673Pl.m1366c();
            }
            int iMo2937f = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
            do {
                list.add(Long.valueOf(abstractC2140ka.mo2929D()));
            } while (abstractC2140ka.mo2937f() < iMo2937f);
            m4423u(iMo2937f);
            return;
        }
        AbstractC2382pp abstractC2382pp = (AbstractC2382pp) list;
        int i2 = this.f7629b & 7;
        if (i2 == 0) {
            do {
                abstractC2382pp.m4821b(abstractC2140ka.mo2929D());
                if (abstractC2140ka.mo2938g()) {
                    return;
                } else {
                    iMo2927B2 = abstractC2140ka.mo2927B();
                }
            } while (iMo2927B2 == this.f7629b);
            this.f7631d = iMo2927B2;
            return;
        }
        if (i2 != 2) {
            throw C0673Pl.m1366c();
        }
        int iMo2937f2 = abstractC2140ka.mo2937f() + abstractC2140ka.mo2928C();
        do {
            abstractC2382pp.m4821b(abstractC2140ka.mo2929D());
        } while (abstractC2140ka.mo2937f() < iMo2937f2);
        m4423u(iMo2937f2);
    }

    /* JADX INFO: renamed from: u */
    public final void m4423u(int i) throws C0673Pl {
        if (this.f7628a.mo2937f() != i) {
            throw C0673Pl.m1370g();
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m4424v(int i) throws C0630Ol {
        if ((this.f7629b & 7) != i) {
            throw C0673Pl.m1366c();
        }
    }
}
