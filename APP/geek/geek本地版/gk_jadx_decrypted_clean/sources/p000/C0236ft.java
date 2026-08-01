package p000;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: ft */
/* JADX INFO: loaded from: classes.dex */
public final class C0236ft extends AbstractC0430l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0138d4 f1993a;

    public C0236ft(C0138d4 c0138d4) {
        this.f1993a = c0138d4;
    }

    @Override // p000.AbstractC0430l
    /* JADX INFO: renamed from: a */
    public final int mo1236a() {
        return ((Matcher) this.f1993a.f1363b).groupCount() + 1;
    }

    @Override // p000.AbstractC0430l, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = ((Matcher) this.f1993a.f1363b).group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // p000.AbstractC0430l, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p000.AbstractC0430l, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
