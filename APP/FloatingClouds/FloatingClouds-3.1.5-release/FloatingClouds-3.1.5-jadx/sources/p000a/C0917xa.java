package p000a;

import java.util.regex.Matcher;

/* JADX INFO: renamed from: a.xa */
/* JADX INFO: loaded from: classes.dex */
public final class C0917xa extends AbstractC0887w<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0459Z7 f3532a;

    public C0917xa(C0459Z7 c0459z7) {
        this.f3532a = c0459z7;
    }

    @Override // p000a.AbstractC0849u
    /* JADX INFO: renamed from: a */
    public final int mo1328a() {
        return ((Matcher) this.f3532a.f1726a).groupCount() + 1;
    }

    @Override // p000a.AbstractC0849u, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String strGroup = ((Matcher) this.f3532a.f1726a).group(i);
        return strGroup == null ? "" : strGroup;
    }

    @Override // p000a.AbstractC0887w, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // p000a.AbstractC0887w, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
