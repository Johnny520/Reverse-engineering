package p001;

import java.util.Random;

/* JADX INFO: renamed from: ۟.s2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0385s2 extends AbstractC0190e {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final a f1779 = new a();

    /* JADX INFO: renamed from: ۟.s2$a */
    public static final class a extends ThreadLocal<Random> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // p001.AbstractC0190e
    /* JADX INFO: renamed from: ۥ۟۠ */
    public final Random mo1051() {
        Random random = this.f1779.get();
        C0237h4.m1089("get(...)", random);
        return random;
    }
}
