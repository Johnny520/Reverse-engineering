package androidx.media;

import p000.AbstractC0702QD;
import p000.InterfaceC0787SD;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public AudioAttributesCompatParcelizer() {
    }

    public static AudioAttributesCompat read(AbstractC0702QD r3) {
        AudioAttributesCompat r0 = new AudioAttributesCompat();
        InterfaceC0787SD r1 = r0.f3974a;
        if (r3.mo1441e(1) == false) goto L6;
        r1 = r3.m1444h();
    L6:
        r0.f3974a = (AudioAttributesImpl) r1;
        return r0;
    }

    public static void write(AudioAttributesCompat r1, AbstractC0702QD r2) {
        r2.getClass();
        AudioAttributesImpl r12 = r1.f3974a;
        r2.mo1445i(1);
        r2.m1448l(r12);
    }
}
