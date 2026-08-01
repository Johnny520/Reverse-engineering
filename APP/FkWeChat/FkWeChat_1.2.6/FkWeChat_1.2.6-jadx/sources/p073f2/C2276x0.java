package p073f2;

import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import java.util.Arrays;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: f2.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B=\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR#\u0010\u0007\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, m16758d2 = {"Lf2/x0;", "Ll2/z0;", "Lf2/b1;", _UrlKt.FRAGMENT_ENCODE_SET, "key1", "key2", _UrlKt.FRAGMENT_ENCODE_SET, "keys", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputEventHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "m", "()Lf2/b1;", "node", "Ll8/i0;", "n", "(Lf2/b1;)V", "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", "b", "Ljava/lang/Object;", "getKey1", "()Ljava/lang/Object;", "c", "getKey2", "d", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "e", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "getPointerInputEventHandler", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class C2276x0 extends AbstractC4606z0 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final Object key1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final Object key2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final Object[] keys;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final PointerInputEventHandler pointerInputEventHandler;

    public /* synthetic */ C2276x0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? null : obj, (i10 & 2) != 0 ? null : obj2, (i10 & 4) != 0 ? null : objArr, pointerInputEventHandler);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C2276x0)) {
            return false;
        }
        C2276x0 c2276x0 = (C2276x0) other;
        if (!AbstractC1061t.m3842c(this.key1, c2276x0.key1) || !AbstractC1061t.m3842c(this.key2, c2276x0.key2)) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = c2276x0.keys;
        if (objArr != null) {
            if (objArr2 == null || !Arrays.equals(objArr, objArr2)) {
                return false;
            }
        } else if (objArr2 != null) {
            return false;
        }
        return this.pointerInputEventHandler == c2276x0.pointerInputEventHandler;
    }

    public int hashCode() {
        Object obj = this.key1;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.key2;
        int iHashCode2 = (iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31;
        Object[] objArr = this.keys;
        return ((iHashCode2 + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31) + this.pointerInputEventHandler.hashCode();
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public C2232b1 mo1191j() {
        return new C2232b1(this.key1, this.key2, this.keys, this.pointerInputEventHandler);
    }

    @Override // p166l2.AbstractC4606z0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo1192k(C2232b1 node) {
        node.m8052N2(this.key1, this.key2, this.keys, this.pointerInputEventHandler);
    }

    public C2276x0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this.pointerInputEventHandler = pointerInputEventHandler;
    }
}
