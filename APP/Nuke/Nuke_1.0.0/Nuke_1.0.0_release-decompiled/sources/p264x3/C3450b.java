package p264x3;

/* JADX INFO: renamed from: x3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3450b {

    /* JADX INFO: renamed from: a */
    public final int f10765a;

    /* JADX INFO: renamed from: b */
    public final EnumC3451c f10766b;

    public C3450b(int i5, EnumC3451c enumC3451c) {
        this.f10765a = i5;
        this.f10766b = enumC3451c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3450b)) {
            return false;
        }
        C3450b c3450b = (C3450b) obj;
        return this.f10765a == c3450b.f10765a && this.f10766b == c3450b.f10766b;
    }

    public final int hashCode() {
        return this.f10766b.hashCode() + (Integer.hashCode(this.f10765a) * 31);
    }

    public final String toString() {
        return "DiscussionDialogItem(titleRes=" + this.f10765a + ", target=" + this.f10766b + ")";
    }
}
