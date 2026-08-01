package androidx.compose.foundation.lazy.layout;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;
import p219p.EnumC5898w0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.e1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+¨\u0006."}, m16758d2 = {"Landroidx/compose/foundation/lazy/layout/e1;", "Ll2/z0;", "Landroidx/compose/foundation/lazy/layout/k1;", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/y;", "itemProviderLambda", "Landroidx/compose/foundation/lazy/layout/c1;", "state", "Lp/w0;", "orientation", _UrlKt.FRAGMENT_ENCODE_SET, "userScrollEnabled", "reverseScrolling", "<init>", "(La9/a;Landroidx/compose/foundation/lazy/layout/c1;Lp/w0;ZZ)V", "m", "()Landroidx/compose/foundation/lazy/layout/k1;", "node", "Ll8/i0;", "n", "(Landroidx/compose/foundation/lazy/layout/k1;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "La9/a;", "getItemProviderLambda", "()La9/a;", "c", "Landroidx/compose/foundation/lazy/layout/c1;", "getState", "()Landroidx/compose/foundation/lazy/layout/c1;", "d", "Lp/w0;", "getOrientation", "()Lp/w0;", "e", "Z", "getUserScrollEnabled", "()Z", "f", "getReverseScrolling", "foundation_release"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C0368e1 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC0173a itemProviderLambda;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC0360c1 state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final EnumC5898w0 orientation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean userScrollEnabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean reverseScrolling;

    public C0368e1(InterfaceC0173a interfaceC0173a, InterfaceC0360c1 interfaceC0360c1, EnumC5898w0 enumC5898w0, boolean z10, boolean z11) {
        this.itemProviderLambda = interfaceC0173a;
        this.state = interfaceC0360c1;
        this.orientation = enumC5898w0;
        this.userScrollEnabled = z10;
        this.reverseScrolling = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C0368e1)) {
            return false;
        }
        C0368e1 c0368e1 = (C0368e1) other;
        return this.itemProviderLambda == c0368e1.itemProviderLambda && AbstractC1061t.m3842c(this.state, c0368e1.state) && this.orientation == c0368e1.orientation && this.userScrollEnabled == c0368e1.userScrollEnabled && this.reverseScrolling == c0368e1.reverseScrolling;
    }

    public int hashCode() {
        return (((((((this.itemProviderLambda.hashCode() * 31) + this.state.hashCode()) * 31) + this.orientation.hashCode()) * 31) + Boolean.hashCode(this.userScrollEnabled)) * 31) + Boolean.hashCode(this.reverseScrolling);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0392k1 mo1191j() {
        return new C0392k1(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C0392k1 node) {
        node.m1258O2(this.itemProviderLambda, this.state, this.orientation, this.userScrollEnabled, this.reverseScrolling);
    }
}
