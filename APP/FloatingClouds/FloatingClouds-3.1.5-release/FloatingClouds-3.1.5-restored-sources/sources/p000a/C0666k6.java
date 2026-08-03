package p000a;

import java.util.Random;

/* JADX INFO: renamed from: a.k6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0666k6 extends AbstractC0925y {

    /* JADX INFO: renamed from: c */
    public final a f2487c = new a();

    /* JADX INFO: renamed from: a.k6$a */
    public static final class a extends ThreadLocal<Random> {
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.lang.ThreadLocal
        public final Random initialValue() {
            return new Random();
        }
    }

    @Override // p000a.AbstractC0925y
    /* JADX INFO: renamed from: a */
    public final Random mo1537a() {
        Random random = this.f2487c.get();
        C0631i9.m1481d(random, "get(...)");
        return random;
    }
}
