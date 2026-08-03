package androidx.media;

import p000.AbstractC0702QD;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public AudioAttributesImplBaseParcelizer() {
    }

    public static AudioAttributesImplBase read(AbstractC0702QD r3) {
        AudioAttributesImplBase r0 = new AudioAttributesImplBase();
        r0.f3977a = r3.m1442f(r0.f3977a, 1);
        r0.f3978b = r3.m1442f(r0.f3978b, 2);
        r0.f3979c = r3.m1442f(r0.f3979c, 3);
        r0.f3980d = r3.m1442f(r0.f3980d, 4);
        return r0;
    }

    public static void write(AudioAttributesImplBase r2, AbstractC0702QD r3) {
        r3.getClass();
        r3.m1446j(r2.f3977a, 1);
        r3.m1446j(r2.f3978b, 2);
        r3.m1446j(r2.f3979c, 3);
        r3.m1446j(r2.f3980d, 4);
    }
}
