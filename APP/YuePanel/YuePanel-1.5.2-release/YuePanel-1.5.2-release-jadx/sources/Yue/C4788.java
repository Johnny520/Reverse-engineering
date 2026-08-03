package Yue;

import java.util.Random;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4788 extends AbstractC2999 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public final C0492 f10720 = new C0492();

    /* JADX INFO: renamed from: Yue.ۥ۠ۡۦۣ$ۥ */
    public static final class C0492 extends ThreadLocal<Random> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // Yue.AbstractC2999
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public Random mo5819() {
        Random random = this.f10720.get();
        C5499.m17102(random, "implStorage.get()");
        return random;
    }
}
