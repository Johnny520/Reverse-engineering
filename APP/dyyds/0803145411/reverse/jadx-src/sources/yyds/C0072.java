package yyds;

/* JADX INFO: renamed from: yyds.ᛱᛲᛲᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0072 implements InterfaceC0131, InterfaceC1823 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0131 f630;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final Object f631;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public boolean f632;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public volatile C0397 f633;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public volatile InterfaceC1823 f635;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f629 = 3;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f634 = 3;

    public C0072(Object obj, InterfaceC0131 interfaceC0131) {
        this.f631 = obj;
        this.f630 = interfaceC0131;
    }

    @Override // yyds.InterfaceC1823
    public final void clear() {
        synchronized (this.f631) {
            this.f632 = false;
            this.f629 = 3;
            this.f634 = 3;
            this.f635.clear();
            this.f633.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [yyds.ᛱᛵᲁᲀ] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // yyds.InterfaceC0131
    public final InterfaceC0131 getRoot() {
        ?? root;
        synchronized (this.f631) {
            try {
                InterfaceC0131 interfaceC0131 = this.f630;
                this = this;
                if (interfaceC0131 != null) {
                    root = interfaceC0131.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // yyds.InterfaceC1823
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f631) {
            z = true;
            if (this.f629 != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final boolean mo449(InterfaceC1823 interfaceC1823) {
        if (!(interfaceC1823 instanceof C0072)) {
            return false;
        }
        C0072 c0072 = (C0072) interfaceC1823;
        if (this.f633 == null) {
            if (c0072.f633 != null) {
                return false;
            }
        } else if (!this.f633.mo449(c0072.f633)) {
            return false;
        }
        return this.f635 == null ? c0072.f635 == null : this.f635.mo449(c0072.f635);
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean mo450() {
        boolean z;
        synchronized (this.f631) {
            z = this.f629 == 4;
        }
        return z;
    }

    @Override // yyds.InterfaceC0131
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final void mo451(InterfaceC1823 interfaceC1823) {
        synchronized (this.f631) {
            try {
                if (!interfaceC1823.equals(this.f633)) {
                    this.f634 = 5;
                    return;
                }
                this.f629 = 5;
                InterfaceC0131 interfaceC0131 = this.f630;
                if (interfaceC0131 != null) {
                    interfaceC0131.mo451(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC0131, yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final boolean mo452() {
        boolean z;
        synchronized (this.f631) {
            try {
                z = this.f635.mo452() || this.f633.mo452();
            } finally {
            }
        }
        return z;
    }

    @Override // yyds.InterfaceC0131
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void mo453(InterfaceC1823 interfaceC1823) {
        synchronized (this.f631) {
            try {
                if (interfaceC1823.equals(this.f635)) {
                    this.f634 = 4;
                    return;
                }
                this.f629 = 4;
                InterfaceC0131 interfaceC0131 = this.f630;
                if (interfaceC0131 != null) {
                    interfaceC0131.mo453(this);
                }
                if (!AbstractC0897.m2005(this.f634)) {
                    this.f635.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void mo454() {
        synchronized (this.f631) {
            try {
                this.f632 = true;
                try {
                    if (this.f629 != 4 && this.f634 != 1) {
                        this.f634 = 1;
                        this.f635.mo454();
                    }
                    if (this.f632 && this.f629 != 1) {
                        this.f629 = 1;
                        this.f633.mo454();
                    }
                    this.f632 = false;
                } catch (Throwable th) {
                    this.f632 = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // yyds.InterfaceC0131
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public final boolean mo455(InterfaceC1823 interfaceC1823) {
        boolean z;
        synchronized (this.f631) {
            try {
                InterfaceC0131 interfaceC0131 = this.f630;
                z = (interfaceC0131 == null || interfaceC0131.mo455(this)) && (interfaceC1823.equals(this.f633) || this.f629 != 4);
            } finally {
            }
        }
        return z;
    }

    @Override // yyds.InterfaceC0131
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final boolean mo456(InterfaceC1823 interfaceC1823) {
        boolean z;
        synchronized (this.f631) {
            try {
                InterfaceC0131 interfaceC0131 = this.f630;
                z = (interfaceC0131 == null || interfaceC0131.mo456(this)) && interfaceC1823.equals(this.f633) && this.f629 != 2;
            } finally {
            }
        }
        return z;
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean mo457() {
        boolean z;
        synchronized (this.f631) {
            z = this.f629 == 3;
        }
        return z;
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void mo458() {
        synchronized (this.f631) {
            try {
                if (!AbstractC0897.m2005(this.f634)) {
                    this.f634 = 2;
                    this.f635.mo458();
                }
                if (!AbstractC0897.m2005(this.f629)) {
                    this.f629 = 2;
                    this.f633.mo458();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC0131
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean mo459(InterfaceC1823 interfaceC1823) {
        boolean z;
        synchronized (this.f631) {
            try {
                InterfaceC0131 interfaceC0131 = this.f630;
                z = (interfaceC0131 == null || interfaceC0131.mo459(this)) && interfaceC1823.equals(this.f633) && !mo452();
            } finally {
            }
        }
        return z;
    }
}
