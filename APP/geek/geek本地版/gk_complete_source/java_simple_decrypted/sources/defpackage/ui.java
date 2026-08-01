package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ui implements vo {
    public final boolean a;

    public ui(boolean r1) {
        this.a = r1;
    }

    @Override // defpackage.vo
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.vo
    public final mw d() {
        return null;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("Empty{");
        if (this.a == false) goto L5;
        String r1 = "Active";
    L6:
        r0.append(r1);
        r0.append('}');
        return r0.toString();
    L5:
        r1 = "New";
        goto L6
    }
}
