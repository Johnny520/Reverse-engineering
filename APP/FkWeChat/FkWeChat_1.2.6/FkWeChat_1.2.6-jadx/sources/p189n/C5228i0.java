package p189n;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;
import p248r.InterfaceC6434j;
import p277t2.C8079k;

/* JADX INFO: renamed from: n.i0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u007f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010+R\u001c\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u001c\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010/R\u0014\u0010\u0014\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010(¨\u00064"}, m16758d2 = {"Ln/i0;", "Ll2/z0;", "Ln/k0;", "Lr/j;", "interactionSource", "Ln/s1;", "indicationNodeFactory", _UrlKt.FRAGMENT_ENCODE_SET, "useLocalIndication", "enabled", _UrlKt.FRAGMENT_ENCODE_SET, "onClickLabel", "Lt2/k;", "role", "Lkotlin/Function0;", "Ll8/i0;", "onClick", "onLongClickLabel", "onLongClick", "onDoubleClick", "hapticFeedbackEnabled", "<init>", "(Lr/j;Ln/s1;ZZLjava/lang/String;Lt2/k;La9/a;Ljava/lang/String;La9/a;La9/a;ZLb9/k;)V", "m", "()Ln/k0;", "node", "n", "(Ln/k0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Lr/j;", "c", "Ln/s1;", "d", "Z", "e", "f", "Ljava/lang/String;", "g", "Lt2/k;", "h", "La9/a;", "i", "j", "k", "l", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C5228i0 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC6434j interactionSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC5279s1 indicationNodeFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean useLocalIndication;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean enabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final String onClickLabel;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final C8079k role;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final InterfaceC0173a onClick;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final String onLongClickLabel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final InterfaceC0173a onLongClick;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final InterfaceC0173a onDoubleClick;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final boolean hapticFeedbackEnabled;

    public C5228i0(InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, String str, C8079k c8079k, InterfaceC0173a interfaceC0173a, String str2, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, boolean z12) {
        this.interactionSource = interfaceC6434j;
        this.indicationNodeFactory = interfaceC5279s1;
        this.useLocalIndication = z10;
        this.enabled = z11;
        this.onClickLabel = str;
        this.role = c8079k;
        this.onClick = interfaceC0173a;
        this.onLongClickLabel = str2;
        this.onLongClick = interfaceC0173a2;
        this.onDoubleClick = interfaceC0173a3;
        this.hapticFeedbackEnabled = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || C5228i0.class != other.getClass()) {
            return false;
        }
        C5228i0 c5228i0 = (C5228i0) other;
        return AbstractC1061t.m3842c(this.interactionSource, c5228i0.interactionSource) && AbstractC1061t.m3842c(this.indicationNodeFactory, c5228i0.indicationNodeFactory) && this.useLocalIndication == c5228i0.useLocalIndication && this.enabled == c5228i0.enabled && AbstractC1061t.m3842c(this.onClickLabel, c5228i0.onClickLabel) && AbstractC1061t.m3842c(this.role, c5228i0.role) && this.onClick == c5228i0.onClick && AbstractC1061t.m3842c(this.onLongClickLabel, c5228i0.onLongClickLabel) && this.onLongClick == c5228i0.onLongClick && this.onDoubleClick == c5228i0.onDoubleClick && this.hapticFeedbackEnabled == c5228i0.hapticFeedbackEnabled;
    }

    public int hashCode() {
        InterfaceC6434j interfaceC6434j = this.interactionSource;
        int iHashCode = (interfaceC6434j != null ? interfaceC6434j.hashCode() : 0) * 31;
        InterfaceC5279s1 interfaceC5279s1 = this.indicationNodeFactory;
        int iHashCode2 = (((((iHashCode + (interfaceC5279s1 != null ? interfaceC5279s1.hashCode() : 0)) * 31) + Boolean.hashCode(this.useLocalIndication)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C8079k c8079k = this.role;
        int iM31192n = (((iHashCode3 + (c8079k != null ? C8079k.m31192n(c8079k.m31194p()) : 0)) * 31) + this.onClick.hashCode()) * 31;
        String str2 = this.onLongClickLabel;
        int iHashCode4 = (iM31192n + (str2 != null ? str2.hashCode() : 0)) * 31;
        InterfaceC0173a interfaceC0173a = this.onLongClick;
        int iHashCode5 = (iHashCode4 + (interfaceC0173a != null ? interfaceC0173a.hashCode() : 0)) * 31;
        InterfaceC0173a interfaceC0173a2 = this.onDoubleClick;
        return ((iHashCode5 + (interfaceC0173a2 != null ? interfaceC0173a2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hapticFeedbackEnabled);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C5238k0 mo1191j() {
        return new C5238k0(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.hapticFeedbackEnabled, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C5238k0 node) {
        node.m21450x3(this.hapticFeedbackEnabled);
        node.m21451y3(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.useLocalIndication, this.enabled, this.onClickLabel, this.role);
    }

    public /* synthetic */ C5228i0(InterfaceC6434j interfaceC6434j, InterfaceC5279s1 interfaceC5279s1, boolean z10, boolean z11, String str, C8079k c8079k, InterfaceC0173a interfaceC0173a, String str2, InterfaceC0173a interfaceC0173a2, InterfaceC0173a interfaceC0173a3, boolean z12, AbstractC1043k abstractC1043k) {
        this(interfaceC6434j, interfaceC5279s1, z10, z11, str, c8079k, interfaceC0173a, str2, interfaceC0173a2, interfaceC0173a3, z12);
    }
}
