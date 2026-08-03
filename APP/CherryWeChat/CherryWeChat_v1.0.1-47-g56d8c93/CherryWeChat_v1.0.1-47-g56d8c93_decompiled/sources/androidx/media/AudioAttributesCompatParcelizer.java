package androidx.media;

import p000.AbstractC0702QD;
import p000.InterfaceC0787SD;

/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0702QD abstractC0702QD) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC0787SD interfaceC0787SDM1444h = audioAttributesCompat.f3974a;
        if (abstractC0702QD.mo1441e(1)) {
            interfaceC0787SDM1444h = abstractC0702QD.m1444h();
        }
        audioAttributesCompat.f3974a = (AudioAttributesImpl) interfaceC0787SDM1444h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0702QD abstractC0702QD) {
        abstractC0702QD.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f3974a;
        abstractC0702QD.mo1445i(1);
        abstractC0702QD.m1448l(audioAttributesImpl);
    }
}
