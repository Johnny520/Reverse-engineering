package p000a;

import java.util.Iterator;
import java.util.regex.Matcher;
import p000a.C0035Bf;

/* JADX INFO: renamed from: a.ya */
/* JADX INFO: loaded from: classes.dex */
public final class C0936ya extends AbstractC0849u<C0898wa> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0459Z7 f3546a;

    public C0936ya(C0459Z7 c0459z7) {
        this.f3546a = c0459z7;
    }

    @Override // p000a.AbstractC0849u
    /* JADX INFO: renamed from: a */
    public final int mo1328a() {
        return ((Matcher) this.f3546a.f1726a).groupCount() + 1;
    }

    @Override // p000a.AbstractC0849u, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof C0898wa) {
            return super.contains((C0898wa) obj);
        }
        return false;
    }

    @Override // p000a.AbstractC0849u, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<C0898wa> iterator() {
        return new C0035Bf.a(new C0035Bf(new C0220M1(1, new C0574f9(0, size() - 1, 1)), new C0830t(7, this)));
    }
}
