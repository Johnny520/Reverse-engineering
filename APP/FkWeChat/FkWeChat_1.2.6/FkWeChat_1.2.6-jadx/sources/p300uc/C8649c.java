package p300uc;

import java.util.List;

/* JADX INFO: renamed from: uc.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8649c extends C8661o {

    /* JADX INFO: renamed from: q */
    public final List f28720q;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8649c(List list, String str) {
        String str2;
        list.getClass();
        str.getClass();
        if (list.size() == 1) {
            str2 = "Field '" + ((String) list.get(0)) + "' is required for type with serial name '" + str + "', but it was missing";
        } else {
            str2 = "Fields " + list + " are required for type with serial name '" + str + "', but they were missing";
        }
        this(list, str2, null);
    }

    /* JADX INFO: renamed from: a */
    public final List m33258a() {
        return this.f28720q;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8649c(List list, String str, Throwable th) {
        super(str, th);
        list.getClass();
        this.f28720q = list;
    }
}
