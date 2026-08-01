package kotlin.text;

import androidx.compose.foundation.C1067;
import androidx.core.view.C2207;
import androidx.window.area.AbstractC2567;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC4335;
import kotlin.collections.C4346;
import kotlin.sequences.AbstractC5122;
import p048.C6519;
import p123.AbstractC7408;
import p123.C7401;
import p123.C7404;
import p123.C7407;
import p123.C7410;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5151 extends AbstractC4335 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f14704;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f14705;

    public /* synthetic */ C5151(Object obj, int i) {
        this.f14705 = i;
        this.f14704 = obj;
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f14705) {
            case 0:
                if (obj == null ? true : obj instanceof C5146) {
                    return super.contains((C5146) obj);
                }
                return false;
            default:
                return ((C7401) this.f14704).containsValue(obj);
        }
    }

    @Override // kotlin.collections.AbstractC4335
    public final int getSize() {
        int i = this.f14705;
        Object obj = this.f14704;
        switch (i) {
            case 0:
                return ((C5148) obj).f14699.groupCount() + 1;
            default:
                C7401 c7401 = (C7401) obj;
                c7401.getClass();
                return c7401.f20069;
        }
    }

    @Override // kotlin.collections.AbstractC4335, java.util.Collection
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
                return new C2207(AbstractC5122.m10111(new C4346(new C6519(0, size() - 1, 1), 1), new C1067(this, 22)));
            default:
                C7407 c7407 = ((C7401) this.f14704).f20070;
                AbstractC7408[] abstractC7408Arr = new AbstractC7408[8];
                for (int i = 0; i < 8; i++) {
                    abstractC7408Arr[i] = new C7404(2);
                }
                return new C7410(c7407, abstractC7408Arr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5146 m10182(int i) {
        Matcher matcher = ((C5148) this.f14704).f14699;
        C6519 c6519M5067 = AbstractC2567.m5067(matcher.start(i), matcher.end(i));
        if (c6519M5067.f17818 < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new C5146(strGroup, c6519M5067);
    }
}
