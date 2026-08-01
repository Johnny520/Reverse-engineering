package kotlin.text;

import androidx.compose.foundation.C1905;
import androidx.core.view.C3040;
import androidx.window.area.AbstractC3400;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractC5167;
import kotlin.collections.C5178;
import kotlin.sequences.AbstractC5954;
import p064.C7348;
import p139.AbstractC8237;
import p139.C8230;
import p139.C8233;
import p139.C8236;
import p139.C8239;

/* JADX INFO: renamed from: kotlin.text.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5983 extends AbstractC5167 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Object f15049;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15050;

    public /* synthetic */ C5983(Object obj, int i) {
        this.f15050 = i;
        this.f15049 = obj;
    }

    @Override // kotlin.collections.AbstractC5167, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f15050) {
            case 0:
                if (obj == null ? true : obj instanceof C5978) {
                    return super.contains((C5978) obj);
                }
                return false;
            default:
                return ((C8230) this.f15049).containsValue(obj);
        }
    }

    @Override // kotlin.collections.AbstractC5167
    public final int getSize() {
        int i = this.f15050;
        Object obj = this.f15049;
        switch (i) {
            case 0:
                return ((C5980) obj).f15044.groupCount() + 1;
            default:
                C8230 c8230 = (C8230) obj;
                c8230.getClass();
                return c8230.f20414;
        }
    }

    @Override // kotlin.collections.AbstractC5167, java.util.Collection
    public boolean isEmpty() {
        switch (this.f15050) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f15050) {
            case 0:
                return new C3040(AbstractC5954.m10670(new C5178(new C7348(0, size() - 1, 1), 1), new C1905(this, 22)));
            default:
                C8236 c8236 = ((C8230) this.f15049).f20415;
                AbstractC8237[] abstractC8237Arr = new AbstractC8237[8];
                for (int i = 0; i < 8; i++) {
                    abstractC8237Arr[i] = new C8233(2);
                }
                return new C8239(c8236, abstractC8237Arr);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5978 m10741(int i) {
        Matcher matcher = ((C5980) this.f15049).f15044;
        C7348 c7348M5627 = AbstractC3400.m5627(matcher.start(i), matcher.end(i));
        if (c7348M5627.f18163 < 0) {
            return null;
        }
        String strGroup = matcher.group(i);
        strGroup.getClass();
        return new C5978(strGroup, c7348M5627);
    }
}
