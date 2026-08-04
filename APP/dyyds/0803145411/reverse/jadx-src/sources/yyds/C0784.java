package yyds;

/* JADX INFO: renamed from: yyds.ᛴᛱᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0784 implements InterfaceC0131, InterfaceC1823 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object f3621;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0131 f3622;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public volatile InterfaceC1823 f3623;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public volatile InterfaceC1823 f3625;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f3620 = 3;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int f3624 = 3;

    public C0784(Object obj, InterfaceC0131 interfaceC0131) {
        this.f3621 = obj;
        this.f3622 = interfaceC0131;
    }

    @Override // yyds.InterfaceC1823
    public final void clear() {
        synchronized (this.f3621) {
            try {
                this.f3620 = 3;
                this.f3623.clear();
                if (this.f3624 != 3) {
                    this.f3624 = 3;
                    this.f3625.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [yyds.ᛱᛵᲁᲀ] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // yyds.InterfaceC0131
    public final InterfaceC0131 getRoot() {
        ?? root;
        synchronized (this.f3621) {
            try {
                InterfaceC0131 interfaceC0131 = this.f3622;
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
        synchronized (this.f3621) {
            try {
                z = true;
                if (this.f3620 != 1 && this.f3624 != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo449(InterfaceC1823 interfaceC1823) {
        if (interfaceC1823 instanceof C0784) {
            C0784 c0784 = (C0784) interfaceC1823;
            if (this.f3623.mo449(c0784.f3623) && this.f3625.mo449(c0784.f3625)) {
                return true;
            }
        }
        return false;
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final boolean mo450() {
        boolean z;
        synchronized (this.f3621) {
            try {
                z = this.f3620 == 4 || this.f3624 == 4;
            } finally {
            }
        }
        return z;
    }

    @Override // yyds.InterfaceC0131
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo451(InterfaceC1823 interfaceC1823) {
        synchronized (this.f3621) {
            try {
                if (interfaceC1823.equals(this.f3625)) {
                    this.f3624 = 5;
                    InterfaceC0131 interfaceC0131 = this.f3622;
                    if (interfaceC0131 != null) {
                        interfaceC0131.mo451(this);
                    }
                    return;
                }
                this.f3620 = 5;
                if (this.f3624 != 1) {
                    this.f3624 = 1;
                    this.f3625.mo454();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC0131, yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo452() {
        boolean z;
        synchronized (this.f3621) {
            try {
                z = this.f3623.mo452() || this.f3625.mo452();
            } finally {
            }
        }
        return z;
    }

    @Override // yyds.InterfaceC0131
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo453(InterfaceC1823 interfaceC1823) {
        synchronized (this.f3621) {
            try {
                if (interfaceC1823.equals(this.f3623)) {
                    this.f3620 = 4;
                } else if (interfaceC1823.equals(this.f3625)) {
                    this.f3624 = 4;
                }
                InterfaceC0131 interfaceC0131 = this.f3622;
                if (interfaceC0131 != null) {
                    interfaceC0131.mo453(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final void mo454() {
        synchronized (this.f3621) {
            try {
                if (this.f3620 != 1) {
                    this.f3620 = 1;
                    this.f3623.mo454();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC0131
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final boolean mo455(InterfaceC1823 interfaceC1823) {
        boolean z;
        synchronized (this.f3621) {
            InterfaceC0131 interfaceC0131 = this.f3622;
            z = interfaceC0131 == null || interfaceC0131.mo455(this);
        }
        return z;
    }

    @Override // yyds.InterfaceC0131
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final boolean mo456(InterfaceC1823 interfaceC1823) {
        boolean z;
        synchronized (this.f3621) {
            InterfaceC0131 interfaceC0131 = this.f3622;
            z = (interfaceC0131 == null || interfaceC0131.mo456(this)) && interfaceC1823.equals(this.f3623);
        }
        return z;
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo457() {
        boolean z;
        synchronized (this.f3621) {
            try {
                z = this.f3620 == 3 && this.f3624 == 3;
            } finally {
            }
        }
        return z;
    }

    @Override // yyds.InterfaceC1823
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo458() {
        synchronized (this.f3621) {
            try {
                if (this.f3620 == 1) {
                    this.f3620 = 2;
                    this.f3623.mo458();
                }
                if (this.f3624 == 1) {
                    this.f3624 = 2;
                    this.f3625.mo458();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // yyds.InterfaceC0131
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final boolean mo459(InterfaceC1823 interfaceC1823) {
        boolean z;
        int i;
        synchronized (this.f3621) {
            InterfaceC0131 interfaceC0131 = this.f3622;
            z = false;
            if (interfaceC0131 == null || interfaceC0131.mo459(this)) {
                if (this.f3620 != 5 ? interfaceC1823.equals(this.f3623) : interfaceC1823.equals(this.f3625) && ((i = this.f3624) == 4 || i == 5)) {
                    z = true;
                }
            }
        }
        return z;
    }
}
