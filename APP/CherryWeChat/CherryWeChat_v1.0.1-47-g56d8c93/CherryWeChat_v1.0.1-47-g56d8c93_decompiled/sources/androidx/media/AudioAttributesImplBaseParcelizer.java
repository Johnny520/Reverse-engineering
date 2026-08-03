package androidx.media;

import p000.AbstractC0702QD;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC0702QD abstractC0702QD) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3977a = abstractC0702QD.m1442f(audioAttributesImplBase.f3977a, 1);
        audioAttributesImplBase.f3978b = abstractC0702QD.m1442f(audioAttributesImplBase.f3978b, 2);
        audioAttributesImplBase.f3979c = abstractC0702QD.m1442f(audioAttributesImplBase.f3979c, 3);
        audioAttributesImplBase.f3980d = abstractC0702QD.m1442f(audioAttributesImplBase.f3980d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC0702QD abstractC0702QD) {
        abstractC0702QD.getClass();
        abstractC0702QD.m1446j(audioAttributesImplBase.f3977a, 1);
        abstractC0702QD.m1446j(audioAttributesImplBase.f3978b, 2);
        abstractC0702QD.m1446j(audioAttributesImplBase.f3979c, 3);
        abstractC0702QD.m1446j(audioAttributesImplBase.f3980d, 4);
    }
}
