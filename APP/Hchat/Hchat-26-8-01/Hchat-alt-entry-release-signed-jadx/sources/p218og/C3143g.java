package p218og;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import okhttp3.HttpUrl;
import tf.AbstractC4159f;
import tf.AbstractC4166m;
import tf.C4179z;

/* JADX INFO: renamed from: og.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3143g extends AbstractC4159f {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10197g = 1;

    /* JADX INFO: renamed from: h */
    public final Object f10198h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3143g(List list) {
        list.getClass();
        this.f10198h = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.f10197g) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        switch (this.f10197g) {
            case 0:
                String strGroup = ((C3145i) this.f10198h).f10201a.group(i9);
                return strGroup == null ? HttpUrl.FRAGMENT_ENCODE_SET : strGroup;
            default:
                return ((List) this.f10198h).get(AbstractC4166m.m8413k1(i9, this));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public final int getSize() {
        switch (this.f10197g) {
            case 0:
                return ((C3145i) this.f10198h).f10201a.groupCount() + 1;
            default:
                return ((List) this.f10198h).size();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.f10197g) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.f10197g) {
            case 1:
                return new C4179z(this, 0);
            default:
                return super.iterator();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.f10197g) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public ListIterator listIterator() {
        switch (this.f10197g) {
            case 1:
                return new C4179z(this, 0);
            default:
                return super.listIterator();
        }
    }

    public C3143g(C3145i c3145i) {
        this.f10198h = c3145i;
    }

    @Override // tf.AbstractC4159f, java.util.List
    public ListIterator listIterator(int i9) {
        switch (this.f10197g) {
            case 1:
                return new C4179z(this, i9);
            default:
                return super.listIterator(i9);
        }
    }
}
