package p264s0;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p163l.InterfaceC4303h0;
import p166l2.AbstractC4546h0;
import p166l2.AbstractC4606z0;
import p248r.InterfaceC6432h;

/* JADX INFO: renamed from: s0.qb */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, m16758d2 = {"Ls0/qb;", "Ll2/z0;", "Ls0/sb;", "Lr/h;", "interactionSource", _UrlKt.FRAGMENT_ENCODE_SET, "checked", "Ll/h0;", _UrlKt.FRAGMENT_ENCODE_SET, "animationSpec", "<init>", "(Lr/h;ZLl/h0;)V", "m", "()Ls0/sb;", "node", "Ll8/i0;", "n", "(Ls0/sb;)V", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", "b", "Lr/h;", "getInteractionSource", "()Lr/h;", "c", "Z", "getChecked", "()Z", "d", "Ll/h0;", "getAnimationSpec", "()Ll/h0;", "material3"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final /* data */ class C6907qb extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC6432h interactionSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean checked;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final InterfaceC4303h0 animationSpec;

    public C6907qb(InterfaceC6432h interfaceC6432h, boolean z10, InterfaceC4303h0 interfaceC4303h0) {
        this.interactionSource = interfaceC6432h;
        this.checked = z10;
        this.animationSpec = interfaceC4303h0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6907qb)) {
            return false;
        }
        C6907qb c6907qb = (C6907qb) other;
        return AbstractC1061t.m3842c(this.interactionSource, c6907qb.interactionSource) && this.checked == c6907qb.checked && AbstractC1061t.m3842c(this.animationSpec, c6907qb.animationSpec);
    }

    public int hashCode() {
        return (((this.interactionSource.hashCode() * 31) + Boolean.hashCode(this.checked)) * 31) + this.animationSpec.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C6938sb mo1191j() {
        return new C6938sb(this.interactionSource, this.checked, this.animationSpec);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C6938sb node) {
        node.m27536Q2(this.interactionSource);
        if (node.m27532M2() != this.checked) {
            AbstractC4546h0.m17808b(node);
        }
        node.m27535P2(this.checked);
        node.m27534O2(this.animationSpec);
        node.m27537R2();
    }

    public String toString() {
        return "ThumbElement(interactionSource=" + this.interactionSource + ", checked=" + this.checked + ", animationSpec=" + this.animationSpec + ')';
    }
}
