package Yue;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: Yue.ۥۡۨ۟ۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7301 extends AbstractC7276<C7301> {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public /* synthetic */ AtomicReferenceArray f22012;

    public C7301(long j, @InterfaceC6489 C7301 c7301, int i) {
        super(j, c7301, i);
        this.f22012 = new AtomicReferenceArray(C7300.f22007);
    }

    @InterfaceC6399
    public String toString() {
        return "SemaphoreSegment[id=" + m22732() + ", hashCode=" + hashCode() + ']';
    }

    @Override // Yue.AbstractC7276
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public int mo22733() {
        return C7300.f22007;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final void m22818(int i) {
        this.f22012.set(i, C7300.f22006);
        m22734();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m22819(int i, @InterfaceC6489 Object obj, @InterfaceC6489 Object obj2) {
        return C4079.m1036(this.f22012, i, obj, obj2);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final Object m22820(int i) {
        return this.f22012.get(i);
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final Object m22821(int i, @InterfaceC6489 Object obj) {
        return this.f22012.getAndSet(i, obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final void m22822(int i, @InterfaceC6489 Object obj) {
        this.f22012.set(i, obj);
    }
}
