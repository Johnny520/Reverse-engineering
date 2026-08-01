package p148k;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p163l.C4295f2;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: k.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b+\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R:\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R:\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b4\u00101R:\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006R\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010-\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010\u0010\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\b\u0013\u0010F\"\u0004\bG\u0010HR\"\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006O"}, m16758d2 = {"Lk/r;", "Ll2/z0;", "Lk/u;", "Ll/f2;", "Lk/q;", "transition", "Ll/f2$a;", "Li3/s;", "Ll/p;", "sizeAnimation", "Li3/o;", "offsetAnimation", "slideAnimation", "Lk/v;", "enter", "Lk/x;", "exit", "Lkotlin/Function0;", _UrlKt.FRAGMENT_ENCODE_SET, "isEnabled", "Lk/c0;", "graphicsLayerBlock", "<init>", "(Ll/f2;Ll/f2$a;Ll/f2$a;Ll/f2$a;Lk/v;Lk/x;La9/a;Lk/c0;)V", "m", "()Lk/u;", "node", "Ll8/i0;", "n", "(Lk/u;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ll/f2;", "getTransition", "()Ll/f2;", "c", "Ll/f2$a;", "getSizeAnimation", "()Ll/f2$a;", "setSizeAnimation", "(Ll/f2$a;)V", "d", "getOffsetAnimation", "setOffsetAnimation", "e", "getSlideAnimation", "setSlideAnimation", "f", "Lk/v;", "getEnter", "()Lk/v;", "setEnter", "(Lk/v;)V", "g", "Lk/x;", "getExit", "()Lk/x;", "setExit", "(Lk/x;)V", "h", "La9/a;", "()La9/a;", "setEnabled", "(La9/a;)V", "i", "Lk/c0;", "getGraphicsLayerBlock", "()Lk/c0;", "setGraphicsLayerBlock", "(Lk/c0;)V", "animation"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final /* data */ class C3897r extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final C4295f2 transition;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public C4295f2.a sizeAnimation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public C4295f2.a offsetAnimation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public C4295f2.a slideAnimation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public AbstractC3901v enter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public AbstractC3903x exit;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public InterfaceC0173a isEnabled;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public InterfaceC3869c0 graphicsLayerBlock;

    public C3897r(C4295f2 c4295f2, C4295f2.a aVar, C4295f2.a aVar2, C4295f2.a aVar3, AbstractC3901v abstractC3901v, AbstractC3903x abstractC3903x, InterfaceC0173a interfaceC0173a, InterfaceC3869c0 interfaceC3869c0) {
        this.transition = c4295f2;
        this.sizeAnimation = aVar;
        this.offsetAnimation = aVar2;
        this.slideAnimation = aVar3;
        this.enter = abstractC3901v;
        this.exit = abstractC3903x;
        this.isEnabled = interfaceC0173a;
        this.graphicsLayerBlock = interfaceC3869c0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C3897r)) {
            return false;
        }
        C3897r c3897r = (C3897r) other;
        return AbstractC1061t.m3842c(this.transition, c3897r.transition) && AbstractC1061t.m3842c(this.sizeAnimation, c3897r.sizeAnimation) && AbstractC1061t.m3842c(this.offsetAnimation, c3897r.offsetAnimation) && AbstractC1061t.m3842c(this.slideAnimation, c3897r.slideAnimation) && AbstractC1061t.m3842c(this.enter, c3897r.enter) && AbstractC1061t.m3842c(this.exit, c3897r.exit) && AbstractC1061t.m3842c(this.isEnabled, c3897r.isEnabled) && AbstractC1061t.m3842c(this.graphicsLayerBlock, c3897r.graphicsLayerBlock);
    }

    public int hashCode() {
        int iHashCode = this.transition.hashCode() * 31;
        C4295f2.a aVar = this.sizeAnimation;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C4295f2.a aVar2 = this.offsetAnimation;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C4295f2.a aVar3 = this.slideAnimation;
        return ((((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.enter.hashCode()) * 31) + this.exit.hashCode()) * 31) + this.isEnabled.hashCode()) * 31) + this.graphicsLayerBlock.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C3900u mo1191j() {
        return new C3900u(this.transition, this.sizeAnimation, this.offsetAnimation, this.slideAnimation, this.enter, this.exit, this.isEnabled, this.graphicsLayerBlock);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C3900u node) {
        node.m15538R2(this.transition);
        node.m15536P2(this.sizeAnimation);
        node.m15535O2(this.offsetAnimation);
        node.m15537Q2(this.slideAnimation);
        node.m15531K2(this.enter);
        node.m15532L2(this.exit);
        node.m15530J2(this.isEnabled);
        node.m15533M2(this.graphicsLayerBlock);
    }

    public String toString() {
        return "EnterExitTransitionElement(transition=" + this.transition + ", sizeAnimation=" + this.sizeAnimation + ", offsetAnimation=" + this.offsetAnimation + ", slideAnimation=" + this.slideAnimation + ", enter=" + this.enter + ", exit=" + this.exit + ", isEnabled=" + this.isEnabled + ", graphicsLayerBlock=" + this.graphicsLayerBlock + ')';
    }
}
