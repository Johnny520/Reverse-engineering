package p218og;

import java.util.Iterator;
import java.util.regex.Matcher;
import ng.AbstractC3015m;
import ng.C3021s;
import p000a.AbstractC0000a;
import p054dg.C0795n;
import p172lg.C2564d;
import p198nb.C2924a;
import p223p0.AbstractC3283k;
import p223p0.C3274b;
import p223p0.C3281i;
import p223p0.C3282j;
import p223p0.C3284l;
import p259r9.AbstractC3754e0;
import tf.AbstractC4149a;

/* JADX INFO: renamed from: og.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3144h extends AbstractC4149a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f10199g;

    /* JADX INFO: renamed from: h */
    public final Object f10200h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3144h(Object obj, int i9) {
        this.f10199g = i9;
        this.f10200h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public C3141e m6675a(int i9) {
        Matcher matcher = ((C3145i) this.f10200h).f10201a;
        C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(matcher.start(i9), matcher.end(i9));
        if (c2564dM7910r0.f8312g < 0) {
            return null;
        }
        String strGroup = matcher.group(i9);
        strGroup.getClass();
        return new C3141e(strGroup, c2564dM7910r0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.f10199g) {
            case 0:
                if (obj == null ? true : obj instanceof C3141e) {
                    return super.contains((C3141e) obj);
                }
                return false;
            default:
                return ((C3274b) this.f10200h).containsValue(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a
    public final int getSize() {
        switch (this.f10199g) {
            case 0:
                return ((C3145i) this.f10200h).f10201a.groupCount() + 1;
            default:
                C3274b c3274b = (C3274b) this.f10200h;
                c3274b.getClass();
                return c3274b.f10425h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a, java.util.Collection
    public boolean isEmpty() {
        switch (this.f10199g) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f10199g) {
            case 0:
                return new C3021s(AbstractC3015m.m6413W(new C0795n(AbstractC0000a.m45X(this), 6), new C2924a(this, 1)));
            default:
                C3282j c3282j = ((C3274b) this.f10200h).f10424g;
                AbstractC3283k[] abstractC3283kArr = new AbstractC3283k[8];
                for (int i9 = 0; i9 < 8; i9++) {
                    abstractC3283kArr[i9] = new C3284l(2);
                }
                return new C3281i(c3282j, abstractC3283kArr);
        }
    }
}
