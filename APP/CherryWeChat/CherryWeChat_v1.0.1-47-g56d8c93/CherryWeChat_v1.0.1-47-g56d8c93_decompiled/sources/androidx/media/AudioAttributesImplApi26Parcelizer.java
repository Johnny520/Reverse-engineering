package androidx.media;

import android.media.AudioAttributes;
import p000.AbstractC0702QD;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC0702QD abstractC0702QD) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f3975a = (AudioAttributes) abstractC0702QD.m1443g(audioAttributesImplApi26.f3975a, 1);
        audioAttributesImplApi26.f3976b = abstractC0702QD.m1442f(audioAttributesImplApi26.f3976b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC0702QD abstractC0702QD) {
        abstractC0702QD.getClass();
        abstractC0702QD.m1447k(audioAttributesImplApi26.f3975a, 1);
        abstractC0702QD.m1446j(audioAttributesImplApi26.f3976b, 2);
    }
}
