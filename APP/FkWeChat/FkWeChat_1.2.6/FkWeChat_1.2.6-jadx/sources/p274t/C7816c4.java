package p274t;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.C3185o;
import p121i3.C3189s;
import p121i3.EnumC3191u;
import p165l1.InterfaceC4499e;
import p166l2.AbstractC4606z0;
import p274t.C7816c4;

/* JADX INFO: renamed from: t.c4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0002\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)BA\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006*"}, m16758d2 = {"Lt/c4;", "Ll2/z0;", "Lt/e4;", "Lt/h0;", "direction", _UrlKt.FRAGMENT_ENCODE_SET, "unbounded", "Lkotlin/Function2;", "Li3/s;", "Li3/u;", "Li3/o;", "alignmentCallback", _UrlKt.FRAGMENT_ENCODE_SET, "align", _UrlKt.FRAGMENT_ENCODE_SET, "inspectorName", "<init>", "(Lt/h0;ZLa9/p;Ljava/lang/Object;Ljava/lang/String;)V", "m", "()Lt/e4;", "node", "Ll8/i0;", "n", "(Lt/e4;)V", "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Lt/h0;", "c", "Z", "d", "La9/p;", "e", "Ljava/lang/Object;", "f", "Ljava/lang/String;", "g", "a", "foundation-layout"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C7816c4 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final EnumC7840h0 direction;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean unbounded;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC0188p alignmentCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final Object align;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String inspectorName;

    public C7816c4(EnumC7840h0 enumC7840h0, boolean z10, InterfaceC0188p interfaceC0188p, Object obj, String str) {
        this.direction = enumC7840h0;
        this.unbounded = z10;
        this.alignmentCallback = interfaceC0188p;
        this.align = obj;
        this.inspectorName = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || C7816c4.class != other.getClass()) {
            return false;
        }
        C7816c4 c7816c4 = (C7816c4) other;
        return this.direction == c7816c4.direction && this.unbounded == c7816c4.unbounded && AbstractC1061t.m3842c(this.align, c7816c4.align);
    }

    public int hashCode() {
        return (((this.direction.hashCode() * 31) + Boolean.hashCode(this.unbounded)) * 31) + this.align.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C7828e4 mo1191j() {
        return new C7828e4(this.direction, this.unbounded, this.alignmentCallback);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C7828e4 node) {
        node.m30308I2(this.direction);
        node.m30309J2(this.unbounded);
        node.m30307H2(this.alignmentCallback);
    }

    /* JADX INFO: renamed from: t.c4$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public static C3185o m30261a(InterfaceC4499e.b bVar, C3189s c3189s, EnumC3191u enumC3191u) {
            return C3185o.m12043c(C3185o.m12044d((((long) bVar.mo17427a(0, (int) (c3189s.m12087h() >> 32), enumC3191u)) << 32) | (((long) 0) & 4294967295L)));
        }

        /* JADX INFO: renamed from: b */
        public static C3185o m30262b(InterfaceC4499e.c cVar, C3189s c3189s, EnumC3191u enumC3191u) {
            return C3185o.m12043c(C3185o.m12044d((((long) 0) << 32) | (4294967295L & ((long) cVar.mo17428a(0, (int) (c3189s.m12087h() & 4294967295L))))));
        }

        /* JADX INFO: renamed from: c */
        public static C3185o m30263c(InterfaceC4499e interfaceC4499e, C3189s c3189s, EnumC3191u enumC3191u) {
            return C3185o.m12043c(interfaceC4499e.mo17411a(C3189s.f8481b.m12088a(), c3189s.m12087h(), enumC3191u));
        }

        /* JADX INFO: renamed from: d */
        public final C7816c4 m30264d(final InterfaceC4499e.c cVar, boolean z10) {
            return new C7816c4(EnumC7840h0.f26150q, z10, new InterfaceC0188p() { // from class: t.a4
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return C7816c4.Companion.m30262b(cVar, (C3189s) obj, (EnumC3191u) obj2);
                }
            }, cVar, "wrapContentHeight");
        }

        /* JADX INFO: renamed from: e */
        public final C7816c4 m30265e(final InterfaceC4499e interfaceC4499e, boolean z10) {
            return new C7816c4(EnumC7840h0.f26152s, z10, new InterfaceC0188p() { // from class: t.b4
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return C7816c4.Companion.m30263c(interfaceC4499e, (C3189s) obj, (EnumC3191u) obj2);
                }
            }, interfaceC4499e, "wrapContentSize");
        }

        /* JADX INFO: renamed from: f */
        public final C7816c4 m30266f(final InterfaceC4499e.b bVar, boolean z10) {
            return new C7816c4(EnumC7840h0.f26151r, z10, new InterfaceC0188p() { // from class: t.z3
                @Override // p010a9.InterfaceC0188p
                public final Object invoke(Object obj, Object obj2) {
                    return C7816c4.Companion.m30261a(bVar, (C3189s) obj, (EnumC3191u) obj2);
                }
            }, bVar, "wrapContentWidth");
        }

        public Companion() {
        }
    }
}
