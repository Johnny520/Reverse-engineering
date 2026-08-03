package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import p000.AbstractC0702QD;

/* JADX INFO: loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public AudioAttributesCompatParcelizer() {
    }

    public static AudioAttributesCompat read(AbstractC0702QD r0) {
        return androidx.media.AudioAttributesCompatParcelizer.read(r0);
    }

    public static void write(AudioAttributesCompat r0, AbstractC0702QD r1) {
        androidx.media.AudioAttributesCompatParcelizer.write(r0, r1);
    }
}
