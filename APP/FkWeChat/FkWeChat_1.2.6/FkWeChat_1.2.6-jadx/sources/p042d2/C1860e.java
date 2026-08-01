package p042d2;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: d2.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B3\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, m16758d2 = {"Ld2/e;", "Ll2/z0;", "Ld2/h;", "Lkotlin/Function1;", "Ld2/b;", _UrlKt.FRAGMENT_ENCODE_SET, "onKeyEvent", "onPreKeyEvent", "<init>", "(La9/l;La9/l;)V", "m", "()Ld2/h;", "node", "Ll8/i0;", "n", "(Ld2/h;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "La9/l;", "getOnKeyEvent", "()La9/l;", "c", "getOnPreKeyEvent", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C1860e extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC0184l onKeyEvent;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC0184l onPreKeyEvent;

    public C1860e(InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        this.onKeyEvent = interfaceC0184l;
        this.onPreKeyEvent = interfaceC0184l2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C1860e)) {
            return false;
        }
        C1860e c1860e = (C1860e) other;
        return this.onKeyEvent == c1860e.onKeyEvent && this.onPreKeyEvent == c1860e.onPreKeyEvent;
    }

    public int hashCode() {
        InterfaceC0184l interfaceC0184l = this.onKeyEvent;
        int iHashCode = (interfaceC0184l != null ? interfaceC0184l.hashCode() : 0) * 31;
        InterfaceC0184l interfaceC0184l2 = this.onPreKeyEvent;
        return iHashCode + (interfaceC0184l2 != null ? interfaceC0184l2.hashCode() : 0);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C1863h mo1191j() {
        return new C1863h(this.onKeyEvent, this.onPreKeyEvent);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C1863h node) {
        node.m6617G2(this.onKeyEvent);
        node.m6618H2(this.onPreKeyEvent);
    }
}
