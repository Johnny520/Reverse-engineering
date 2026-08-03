package androidx.media;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a */
    public AudioAttributes f3975a;

    /* JADX INFO: renamed from: b */
    public int f3976b;

    public AudioAttributesImplApi21() {
        this.f3976b = -1;
    }

    public final boolean equals(Object r2) {
        if ((r2 instanceof AudioAttributesImplApi21) == true) goto L7;
        return false;
    L7:
        return this.f3975a.equals(((AudioAttributesImplApi21) r2).f3975a);
    }

    public final int hashCode() {
        return this.f3975a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f3975a;
    }
}
