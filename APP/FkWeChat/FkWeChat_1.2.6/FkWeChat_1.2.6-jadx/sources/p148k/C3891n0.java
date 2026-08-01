package p148k;

import p121i3.InterfaceC3175e;
import p163l.InterfaceC4313j0;

/* JADX INFO: renamed from: k.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3891n0 implements InterfaceC4313j0 {

    /* JADX INFO: renamed from: a */
    public final C3865a0 f11240a;

    public C3891n0(InterfaceC3175e interfaceC3175e) {
        this.f11240a = new C3865a0(AbstractC3893o0.m15455a(), interfaceC3175e);
    }

    @Override // p163l.InterfaceC4313j0
    /* JADX INFO: renamed from: a */
    public float mo15444a() {
        return 0.0f;
    }

    @Override // p163l.InterfaceC4313j0
    /* JADX INFO: renamed from: b */
    public float mo15445b(long j10, float f10, float f11) {
        return this.f11240a.m15317d(f11).m15320b(j10 / 1000000);
    }

    @Override // p163l.InterfaceC4313j0
    /* JADX INFO: renamed from: c */
    public long mo15446c(float f10, float f11) {
        return this.f11240a.m15316c(f11) * 1000000;
    }

    @Override // p163l.InterfaceC4313j0
    /* JADX INFO: renamed from: d */
    public float mo15447d(float f10, float f11) {
        return f10 + m15449f(f11);
    }

    @Override // p163l.InterfaceC4313j0
    /* JADX INFO: renamed from: e */
    public float mo15448e(long j10, float f10, float f11) {
        return f10 + this.f11240a.m15317d(f11).m15319a(j10 / 1000000);
    }

    /* JADX INFO: renamed from: f */
    public final float m15449f(float f10) {
        return this.f11240a.m15315b(f10) * Math.signum(f10);
    }
}
