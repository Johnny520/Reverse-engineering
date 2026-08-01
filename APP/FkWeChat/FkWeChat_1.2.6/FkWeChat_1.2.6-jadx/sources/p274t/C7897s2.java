package p274t;

import p024b9.AbstractC1043k;
import p121i3.C3179i;
import p121i3.EnumC3191u;
import p288u.AbstractC8476a;

/* JADX INFO: renamed from: t.s2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7897s2 implements InterfaceC7887q2 {

    /* JADX INFO: renamed from: a */
    public final float f26303a;

    /* JADX INFO: renamed from: b */
    public final float f26304b;

    /* JADX INFO: renamed from: c */
    public final float f26305c;

    /* JADX INFO: renamed from: d */
    public final float f26306d;

    public C7897s2(float f10, float f11, float f12, float f13) {
        this.f26303a = f10;
        this.f26304b = f11;
        this.f26305c = f12;
        this.f26306d = f13;
        if (!((f10 >= 0.0f) & (f11 >= 0.0f) & (f12 >= 0.0f)) || !(f13 >= 0.0f)) {
            AbstractC8476a.m32537a("Padding must be non-negative");
        }
    }

    @Override // p274t.InterfaceC7887q2
    /* JADX INFO: renamed from: a */
    public float mo27239a() {
        return this.f26306d;
    }

    @Override // p274t.InterfaceC7887q2
    /* JADX INFO: renamed from: b */
    public float mo27240b(EnumC3191u enumC3191u) {
        return enumC3191u == EnumC3191u.f8484q ? this.f26303a : this.f26305c;
    }

    @Override // p274t.InterfaceC7887q2
    /* JADX INFO: renamed from: c */
    public float mo27241c() {
        return this.f26304b;
    }

    @Override // p274t.InterfaceC7887q2
    /* JADX INFO: renamed from: d */
    public float mo27242d(EnumC3191u enumC3191u) {
        return enumC3191u == EnumC3191u.f8484q ? this.f26305c : this.f26303a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C7897s2)) {
            return false;
        }
        C7897s2 c7897s2 = (C7897s2) obj;
        return C3179i.m12005m(this.f26303a, c7897s2.f26303a) && C3179i.m12005m(this.f26304b, c7897s2.f26304b) && C3179i.m12005m(this.f26305c, c7897s2.f26305c) && C3179i.m12005m(this.f26306d, c7897s2.f26306d);
    }

    public int hashCode() {
        return (((((C3179i.m12006n(this.f26303a) * 31) + C3179i.m12006n(this.f26304b)) * 31) + C3179i.m12006n(this.f26305c)) * 31) + C3179i.m12006n(this.f26306d);
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) C3179i.m12007p(this.f26303a)) + ", top=" + ((Object) C3179i.m12007p(this.f26304b)) + ", end=" + ((Object) C3179i.m12007p(this.f26305c)) + ", bottom=" + ((Object) C3179i.m12007p(this.f26306d)) + ')';
    }

    public /* synthetic */ C7897s2(float f10, float f11, float f12, float f13, AbstractC1043k abstractC1043k) {
        this(f10, f11, f12, f13);
    }
}
