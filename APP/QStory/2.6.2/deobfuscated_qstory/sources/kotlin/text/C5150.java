package kotlin.text;

import androidx.compose.foundation.C1067;
import androidx.core.view.C2207;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC4334;
import kotlin.collections.C4345;
import kotlin.sequences.AbstractC5121;
import p000.AbstractC6087;
import p048.C6518;
import p123.AbstractC7407;
import p123.C7400;
import p123.C7403;
import p123.C7406;
import p123.C7409;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C5150 extends AbstractC4334 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14704;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14705;

    public /* synthetic */ C5150(Object obj, int i) {
        this.f14705 = i;
        this.f14704 = obj;
    }

    @Override // kotlin.collections.AbstractC4334, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f14705) {
            case 0:
                if (obj == null ? true : obj instanceof C5145) {
                    return super.contains((C5145) obj);
                }
                return false;
            default:
                return ((C7400) this.f14704).containsValue(obj);
        }
    }

    @Override // kotlin.collections.AbstractC4334
    public final int getSize() {
        int i = this.f14705;
        Object obj = this.f14704;
        switch (i) {
            case 0:
                return ((C5147) obj).f14699.groupCount() + 1;
            default:
                C7400 c7400 = (C7400) obj;
                c7400.getClass();
                return c7400.f20074;
        }
    }

    @Override // kotlin.collections.AbstractC4334, java.util.Collection
    public boolean isEmpty() {
        switch (this.f14705) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f14705) {
            case 0:
                return new C2207(AbstractC5121.m10111(new C4345(new C6518(0, size() - 1, 1), 1), new C1067(this, 22)));
            default:
                C7406 c7406 = ((C7400) this.f14704).f20075;
                AbstractC7407[] abstractC7407Arr = new AbstractC7407[8];
                for (int i = 0; i < 8; i++) {
                    abstractC7407Arr[i] = new C7403(2);
                }
                return new C7409(c7406, abstractC7407Arr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5145 m10178(int i) {
        Matcher matcher = ((C5147) this.f14704).f14699;
        C6518 c6518M11422 = AbstractC6087.m11422(matcher.start(i), matcher.end(i));
        if (c6518M11422.f17822 < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new C5145(strGroup, c6518M11422);
    }
}
