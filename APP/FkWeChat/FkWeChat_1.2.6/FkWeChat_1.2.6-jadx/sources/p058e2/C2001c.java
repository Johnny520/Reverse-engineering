package p058e2;

import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: e2.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m16758d2 = {"Le2/c;", "Ll2/z0;", "Le2/e;", "Le2/a;", "connection", "Le2/b;", "dispatcher", "<init>", "(Le2/a;Le2/b;)V", "m", "()Le2/e;", "node", "Ll8/i0;", "n", "(Le2/e;)V", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "b", "Le2/a;", "getConnection", "()Le2/a;", "c", "Le2/b;", "getDispatcher", "()Le2/b;", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
final class C2001c extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final InterfaceC1999a connection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final C2000b dispatcher;

    public C2001c(InterfaceC1999a interfaceC1999a, C2000b c2000b) {
        this.connection = interfaceC1999a;
        this.dispatcher = c2000b;
    }

    public boolean equals(Object other) {
        if (!(other instanceof C2001c)) {
            return false;
        }
        C2001c c2001c = (C2001c) other;
        return AbstractC1061t.m3842c(c2001c.connection, this.connection) && AbstractC1061t.m3842c(c2001c.dispatcher, this.dispatcher);
    }

    public int hashCode() {
        int iHashCode = this.connection.hashCode() * 31;
        C2000b c2000b = this.dispatcher;
        return iHashCode + (c2000b != null ? c2000b.hashCode() : 0);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2003e mo1191j() {
        return new C2003e(this.connection, this.dispatcher);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C2003e node) {
        node.m7238N2(this.connection, this.dispatcher);
    }
}
