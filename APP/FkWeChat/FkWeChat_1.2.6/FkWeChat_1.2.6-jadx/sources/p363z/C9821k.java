package p363z;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;
import p189n.InterfaceC5279s1;
import p248r.InterfaceC6434j;
import p277t2.C8079k;
import p306v2.EnumC8807a;

/* JADX INFO: renamed from: z.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BK\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m16758d2 = {"Lz/k;", "Ll2/z0;", "Lz/l;", "Lv2/a;", "state", "Lr/j;", "interactionSource", "Ln/s1;", "indicationNodeFactory", _UrlKt.FRAGMENT_ENCODE_SET, "useLocalIndication", "enabled", "Lt2/k;", "role", "Lkotlin/Function0;", "Ll8/i0;", "onClick", "<init>", "(Lv2/a;Lr/j;Ln/s1;ZZLt2/k;La9/a;Lb9/k;)V", "m", "()Lz/l;", "node", "n", "(Lz/l;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Lv2/a;", "c", "Lr/j;", "d", "Ln/s1;", "e", "Z", "f", "g", "Lt2/k;", "h", "La9/a;", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C9821k extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final EnumC8807a state;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC6434j interactionSource;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC5279s1 indicationNodeFactory;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean useLocalIndication;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean enabled;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final C8079k role;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final InterfaceC0173a onClick;

    public C9821k(EnumC8807a enumC8807a, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, C8079k c8079k, InterfaceC0173a interfaceC0173a) {
        this.state = enumC8807a;
        this.interactionSource = interfaceC6434j;
        this.indicationNodeFactory = interfaceC5279s1;
        this.useLocalIndication = z10;
        this.enabled = z11;
        this.role = c8079k;
        this.onClick = interfaceC0173a;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || C9821k.class != other.getClass()) {
            return false;
        }
        C9821k c9821k = (C9821k) other;
        return this.state == c9821k.state && AbstractC1061t.m3842c(this.interactionSource, c9821k.interactionSource) && AbstractC1061t.m3842c(this.indicationNodeFactory, c9821k.indicationNodeFactory) && this.useLocalIndication == c9821k.useLocalIndication && this.enabled == c9821k.enabled && AbstractC1061t.m3842c(this.role, c9821k.role) && this.onClick == c9821k.onClick;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        InterfaceC6434j interfaceC6434j = this.interactionSource;
        int iHashCode2 = (iHashCode + (interfaceC6434j != null ? interfaceC6434j.hashCode() : 0)) * 31;
        InterfaceC5279s1 interfaceC5279s1 = this.indicationNodeFactory;
        int iHashCode3 = (((((iHashCode2 + (interfaceC5279s1 != null ? interfaceC5279s1.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalIndication)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        C8079k c8079k = this.role;
        return ((iHashCode3 + (c8079k != null ? C8079k.m31192n(c8079k.m31194p()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C9822l mo1191j() {
        return new C9822l(this.state, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onClick, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C9822l node) {
        node.m38171t3(this.state, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.role, this.onClick);
    }

    public /* synthetic */ C9821k(EnumC8807a enumC8807a, InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, C8079k c8079k, InterfaceC0173a interfaceC0173a, AbstractC1043k abstractC1043k) {
        this(enumC8807a, interfaceC6434j, interfaceC5279s1, z10, z11, c8079k, interfaceC0173a);
    }
}
