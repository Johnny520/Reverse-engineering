package defpackage;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class ft extends l {
    public final /* synthetic */ d4 a;

    public ft(d4 r1) {
        this.a = r1;
    }

    @Override // defpackage.l
    public final int a() {
        return ((Matcher) this.a.b).groupCount() + 1;
    }

    @Override // defpackage.l, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object r2) {
        if ((r2 instanceof String) == true) goto L7;
        return false;
    L7:
        return super.contains((String) r2);
    }

    @Override // java.util.List
    public final Object get(int r2) {
        String r22 = ((Matcher) this.a.b).group(r2);
        if (r22 != null) goto L6;
        return "";
    L6:
        return r22;
    }

    @Override // defpackage.l, java.util.List
    public final /* bridge */ int indexOf(Object r2) {
        if ((r2 instanceof String) == true) goto L7;
        return -1;
    L7:
        return super.indexOf((String) r2);
    }

    @Override // defpackage.l, java.util.List
    public final /* bridge */ int lastIndexOf(Object r2) {
        if ((r2 instanceof String) == true) goto L7;
        return -1;
    L7:
        return super.lastIndexOf((String) r2);
    }
}
