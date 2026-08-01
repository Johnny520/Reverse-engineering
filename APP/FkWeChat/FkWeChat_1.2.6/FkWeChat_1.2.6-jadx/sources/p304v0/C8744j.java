package p304v0;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.C3179i;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: v0.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0004\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, m16758d2 = {"Lv0/j;", "Ll2/z0;", "Lv0/r;", _UrlKt.FRAGMENT_ENCODE_SET, "isRefreshing", "Lkotlin/Function0;", "Ll8/i0;", "onRefresh", "enabled", "Lv0/s;", "state", "Li3/i;", "threshold", "<init>", "(ZLa9/a;ZLv0/s;FLb9/k;)V", "m", "()Lv0/r;", "node", "n", "(Lv0/r;)V", _UrlKt.FRAGMENT_ENCODE_SET, "other", "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Z", "()Z", "c", "La9/a;", "getOnRefresh", "()La9/a;", "d", "getEnabled", "e", "Lv0/s;", "getState", "()Lv0/s;", "f", "F", "getThreshold-D9Ej5fM", "()F", "material3"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class C8744j extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean isRefreshing;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final InterfaceC0173a onRefresh;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean enabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final InterfaceC8753s state;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final float threshold;

    public C8744j(boolean z10, InterfaceC0173a interfaceC0173a, boolean z11, InterfaceC8753s interfaceC8753s, float f10) {
        this.isRefreshing = z10;
        this.onRefresh = interfaceC0173a;
        this.enabled = z11;
        this.state = interfaceC8753s;
        this.threshold = f10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C8744j)) {
            return false;
        }
        C8744j c8744j = (C8744j) other;
        return this.isRefreshing == c8744j.isRefreshing && this.enabled == c8744j.enabled && this.onRefresh == c8744j.onRefresh && AbstractC1061t.m3842c(this.state, c8744j.state) && C3179i.m12005m(this.threshold, c8744j.threshold);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isRefreshing) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.onRefresh.hashCode()) * 31) + this.state.hashCode()) * 31) + C3179i.m12006n(this.threshold);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C8752r mo1191j() {
        return new C8752r(this.isRefreshing, this.onRefresh, this.enabled, this.state, this.threshold, null);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C8752r node) {
        node.m33576f3(this.onRefresh);
        node.m33575e3(this.enabled);
        node.m33578h3(this.state);
        node.m33579i3(this.threshold);
        boolean zM33572b3 = node.m33572b3();
        boolean z10 = this.isRefreshing;
        if (zM33572b3 != z10) {
            node.m33577g3(z10);
            node.m33581k3();
        }
    }

    public /* synthetic */ C8744j(boolean z10, InterfaceC0173a interfaceC0173a, boolean z11, InterfaceC8753s interfaceC8753s, float f10, AbstractC1043k abstractC1043k) {
        this(z10, interfaceC0173a, z11, interfaceC8753s, f10);
    }
}
