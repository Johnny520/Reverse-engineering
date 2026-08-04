package yyds;

/* JADX INFO: renamed from: yyds.ᲀᲀᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2061 implements InterfaceC2162 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public int f10203;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public boolean f10204;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final InterfaceC2162 f10205;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final InterfaceC1410 f10206;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final boolean f10207;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final C2620 f10208;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final boolean f10209;

    public C2061(InterfaceC2162 interfaceC2162, boolean z, boolean z2, InterfaceC1410 interfaceC1410, C2620 c2620) {
        AbstractC0319.m992(interfaceC2162, "Argument must not be null");
        this.f10205 = interfaceC2162;
        this.f10207 = z;
        this.f10209 = z2;
        this.f10206 = interfaceC1410;
        AbstractC0319.m992(c2620, "Argument must not be null");
        this.f10208 = c2620;
    }

    @Override // yyds.InterfaceC2162
    public final Object get() {
        return this.f10205.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f10207 + ", listener=" + this.f10208 + ", key=" + this.f10206 + ", acquired=" + this.f10203 + ", isRecycled=" + this.f10204 + ", resource=" + this.f10205 + '}';
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final synchronized void mo1177() {
        if (this.f10203 > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f10204) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f10204 = true;
        if (this.f10209) {
            this.f10205.mo1177();
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final synchronized void m3918() {
        if (this.f10204) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f10203++;
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final int mo1178() {
        return this.f10205.mo1178();
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m3919() {
        boolean z;
        synchronized (this) {
            int i = this.f10203;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f10203 = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f10208.m4733(this.f10206, this);
        }
    }

    @Override // yyds.InterfaceC2162
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final Class mo1179() {
        return this.f10205.mo1179();
    }
}
