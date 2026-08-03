package androidx.media;

import android.media.AudioAttributes;
import p000.AbstractC0702QD;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC0702QD abstractC0702QD) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f3975a = (AudioAttributes) abstractC0702QD.m1443g(audioAttributesImplApi21.f3975a, 1);
        audioAttributesImplApi21.f3976b = abstractC0702QD.m1442f(audioAttributesImplApi21.f3976b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC0702QD abstractC0702QD) {
        abstractC0702QD.getClass();
        abstractC0702QD.m1447k(audioAttributesImplApi21.f3975a, 1);
        abstractC0702QD.m1446j(audioAttributesImplApi21.f3976b, 2);
    }
}
