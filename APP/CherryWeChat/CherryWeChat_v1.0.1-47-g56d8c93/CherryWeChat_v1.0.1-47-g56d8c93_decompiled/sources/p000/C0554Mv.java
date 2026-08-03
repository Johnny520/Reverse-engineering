package p000;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: Mv */
/* JADX INFO: loaded from: classes.dex */
public final class C0554Mv implements Serializable {

    /* JADX INFO: renamed from: a */
    public final Pattern f1822a;

    public C0554Mv(Pattern pattern) {
        this.f1822a = pattern;
    }

    public final String toString() {
        return this.f1822a.toString();
    }

    public C0554Mv(String str) {
        this(Pattern.compile(str));
    }
}
