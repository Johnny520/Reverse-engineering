package androidx.media;

import android.media.AudioAttributes;
import p000.AbstractC0702QD;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public AudioAttributesImplApi21Parcelizer() {
    }

    public static AudioAttributesImplApi21 read(AbstractC0702QD r3) {
        AudioAttributesImplApi21 r0 = new AudioAttributesImplApi21();
        r0.f3975a = (AudioAttributes) r3.m1443g(r0.f3975a, 1);
        r0.f3976b = r3.m1442f(r0.f3976b, 2);
        return r0;
    }

    public static void write(AudioAttributesImplApi21 r2, AbstractC0702QD r3) {
        r3.getClass();
        r3.m1447k(r2.f3975a, 1);
        r3.m1446j(r2.f3976b, 2);
    }
}
