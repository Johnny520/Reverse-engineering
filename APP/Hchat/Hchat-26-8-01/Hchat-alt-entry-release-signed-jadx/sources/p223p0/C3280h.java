package p223p0;

import java.util.Iterator;
import java.util.Map;
import tf.AbstractC4162i;

/* JADX INFO: renamed from: p0.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3280h extends AbstractC4162i {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10437g;

    /* JADX INFO: renamed from: h */
    public final C3274b f10438h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3280h(C3274b c3274b, int i9) {
        this.f10437g = i9;
        this.f10438h = c3274b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f10437g) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C3274b c3274b = this.f10438h;
                Object obj2 = c3274b.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && c3274b.containsKey(entry.getKey());
            default:
                return this.f10438h.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public final int getSize() {
        switch (this.f10437g) {
            case 0:
                C3274b c3274b = this.f10438h;
                c3274b.getClass();
                return c3274b.f10425h;
            default:
                C3274b c3274b2 = this.f10438h;
                c3274b2.getClass();
                return c3274b2.f10425h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f10437g) {
            case 0:
                C3282j c3282j = this.f10438h.f10424g;
                AbstractC3283k[] abstractC3283kArr = new AbstractC3283k[8];
                for (int i9 = 0; i9 < 8; i9++) {
                    abstractC3283kArr[i9] = new C3284l(0);
                }
                return new C3281i(c3282j, abstractC3283kArr);
            default:
                C3282j c3282j2 = this.f10438h.f10424g;
                AbstractC3283k[] abstractC3283kArr2 = new AbstractC3283k[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    abstractC3283kArr2[i10] = new C3284l(1);
                }
                return new C3281i(c3282j2, abstractC3283kArr2);
        }
    }
}
