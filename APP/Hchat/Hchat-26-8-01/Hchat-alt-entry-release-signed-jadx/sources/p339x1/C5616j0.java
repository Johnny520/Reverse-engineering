package p339x1;

import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: x1.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5616j0 {

    /* JADX INFO: renamed from: a */
    public final C5602f0 f22876a;

    /* JADX INFO: renamed from: b */
    public boolean f22877b;

    /* JADX INFO: renamed from: c */
    public boolean f22878c;

    /* JADX INFO: renamed from: e */
    public boolean f22880e;

    /* JADX INFO: renamed from: f */
    public boolean f22881f;

    /* JADX INFO: renamed from: g */
    public boolean f22882g;

    /* JADX INFO: renamed from: h */
    public int f22883h;

    /* JADX INFO: renamed from: i */
    public int f22884i;

    /* JADX INFO: renamed from: j */
    public boolean f22885j;

    /* JADX INFO: renamed from: k */
    public boolean f22886k;

    /* JADX INFO: renamed from: l */
    public int f22887l;

    /* JADX INFO: renamed from: m */
    public boolean f22888m;

    /* JADX INFO: renamed from: n */
    public boolean f22889n;

    /* JADX INFO: renamed from: o */
    public int f22890o;

    /* JADX INFO: renamed from: q */
    public C5640r0 f22892q;

    /* JADX INFO: renamed from: d */
    public EnumC5586b0 f22879d = EnumC5586b0.f22712k;

    /* JADX INFO: renamed from: p */
    public final C5652v0 f22891p = new C5652v0(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5616j0(C5602f0 c5602f0) {
        this.f22876a = c5602f0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final AbstractC5614i1 m10125a() {
        return this.f22876a.f22778L.f22717d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m10126b() {
        EnumC5586b0 enumC5586b0 = this.f22876a.f22779M.f22879d;
        EnumC5586b0 enumC5586b02 = EnumC5586b0.f22710i;
        EnumC5586b0 enumC5586b03 = EnumC5586b0.f22711j;
        if (enumC5586b0 == enumC5586b02 || enumC5586b0 == enumC5586b03) {
            if (this.f22891p.f23017G) {
                m10131g(true);
            } else {
                m10130f(true);
            }
        }
        if (enumC5586b0 == enumC5586b03) {
            C5640r0 c5640r0 = this.f22892q;
            if (c5640r0 == null || !c5640r0.f22952A) {
                m10132h(true);
            } else {
                m10133i(true);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m10127c(long j3) {
        C5640r0 c5640r0 = this.f22892q;
        if (c5640r0 != null) {
            C5616j0 c5616j0 = c5640r0.f22960l;
            c5616j0.f22879d = EnumC5586b0.f22709h;
            C5602f0 c5602f0 = c5616j0.f22876a;
            c5616j0.f22880e = false;
            c5640r0.f22956E = j3;
            C5647t1 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC5934t) AbstractC5613i0.m10067a(c5602f0)).getSnapshotObserver();
            C5637q0 c5637q0 = c5640r0.f22957F;
            snapshotObserver.f23001a.m9162c(c5602f0, snapshotObserver.f23002b, c5637q0);
            c5616j0.f22881f = true;
            c5616j0.f22882g = true;
            boolean zM10161q = AbstractC5618k.m10161q(c5602f0);
            C5652v0 c5652v0 = c5616j0.f22891p;
            if (zM10161q) {
                c5652v0.f23012B = true;
                c5652v0.f23013C = true;
            } else {
                c5652v0.f23011A = true;
            }
            c5616j0.f22879d = EnumC5586b0.f22712k;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m10128d(int i9) {
        int i10 = this.f22887l;
        this.f22887l = i9;
        if ((i10 == 0) != (i9 == 0)) {
            C5602f0 c5602f0M10049u = this.f22876a.m10049u();
            C5616j0 c5616j0 = c5602f0M10049u != null ? c5602f0M10049u.f22779M : null;
            if (c5616j0 != null) {
                int i11 = c5616j0.f22887l;
                if (i9 == 0) {
                    c5616j0.m10128d(i11 - 1);
                } else {
                    c5616j0.m10128d(i11 + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10129e(int i9) {
        int i10 = this.f22890o;
        this.f22890o = i9;
        if ((i10 == 0) != (i9 == 0)) {
            C5602f0 c5602f0M10049u = this.f22876a.m10049u();
            C5616j0 c5616j0 = c5602f0M10049u != null ? c5602f0M10049u.f22779M : null;
            if (c5616j0 != null) {
                int i11 = c5616j0.f22890o;
                if (i9 == 0) {
                    c5616j0.m10129e(i11 - 1);
                } else {
                    c5616j0.m10129e(i11 + 1);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m10130f(boolean z9) {
        if (this.f22886k != z9) {
            this.f22886k = z9;
            if (z9 && !this.f22885j) {
                m10128d(this.f22887l + 1);
            } else {
                if (z9 || this.f22885j) {
                    return;
                }
                m10128d(this.f22887l - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m10131g(boolean z9) {
        if (this.f22885j != z9) {
            this.f22885j = z9;
            if (z9 && !this.f22886k) {
                m10128d(this.f22887l + 1);
            } else {
                if (z9 || this.f22886k) {
                    return;
                }
                m10128d(this.f22887l - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m10132h(boolean z9) {
        if (this.f22889n != z9) {
            this.f22889n = z9;
            if (z9 && !this.f22888m) {
                m10129e(this.f22890o + 1);
            } else {
                if (z9 || this.f22888m) {
                    return;
                }
                m10129e(this.f22890o - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m10133i(boolean z9) {
        if (this.f22888m != z9) {
            this.f22888m = z9;
            if (z9 && !this.f22889n) {
                m10129e(this.f22890o + 1);
            } else {
                if (z9 || this.f22889n) {
                    return;
                }
                m10129e(this.f22890o - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m10134j() {
        C5652v0 c5652v0 = this.f22891p;
        C5616j0 c5616j0 = c5652v0.f23029l;
        Object obj = c5652v0.f23041x;
        C5602f0 c5602f0 = this.f22876a;
        if ((obj != null || c5616j0.m10125a().mo8824X() != null) && c5652v0.f23040w) {
            c5652v0.f23040w = false;
            c5652v0.f23041x = c5616j0.m10125a().mo8824X();
            C5602f0 c5602f0M10049u = c5602f0.m10049u();
            if (c5602f0M10049u != null) {
                C5602f0.m10001V(c5602f0M10049u, false, 7);
            }
        }
        C5640r0 c5640r0 = this.f22892q;
        if (c5640r0 != null) {
            C5616j0 c5616j02 = c5640r0.f22960l;
            if (c5640r0.f22955D == null) {
                AbstractC5631o0 abstractC5631o0Mo10104p1 = c5616j02.m10125a().mo10104p1();
                abstractC5631o0Mo10104p1.getClass();
                if (abstractC5631o0Mo10104p1.f22932u.mo8824X() == null) {
                    return;
                }
            }
            if (c5640r0.f22954C) {
                c5640r0.f22954C = false;
                AbstractC5631o0 abstractC5631o0Mo10104p12 = c5616j02.m10125a().mo10104p1();
                abstractC5631o0Mo10104p12.getClass();
                c5640r0.f22955D = abstractC5631o0Mo10104p12.f22932u.mo8824X();
                if (AbstractC5618k.m10161q(c5602f0)) {
                    C5602f0 c5602f0M10049u2 = c5602f0.m10049u();
                    if (c5602f0M10049u2 != null) {
                        C5602f0.m10001V(c5602f0M10049u2, false, 7);
                        return;
                    }
                    return;
                }
                C5602f0 c5602f0M10049u3 = c5602f0.m10049u();
                if (c5602f0M10049u3 != null) {
                    C5602f0.m10000T(c5602f0M10049u3, false, 7);
                }
            }
        }
    }
}
