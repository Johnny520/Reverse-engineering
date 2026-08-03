package p023b8;

import ae.C0077h;
import android.speech.tts.Voice;
import gg.AbstractC1416l;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import okhttp3.HttpUrl;
import p046d6.C0712i;
import p117i0.C1860n0;
import p172lg.C2564d;
import p198nb.C2930d;
import p251r.C3632q;
import p257r7.AbstractC3729s;
import p265s.C3823d1;
import p339x1.C5602f0;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: b8.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0205c implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f505g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b8.f.j():java.lang.String, i0.r.<clinit>():void, id.a.a():d6.l, j2.g.<clinit>():void, ke.c.g(ud.r):void, md.f.toString():java.lang.String, nb.c.b(android.content.Context):java.util.List, nb.f0.e(android.speech.tts.TextToSpeech):java.util.ArrayList, s.b.<init>(android.view.View):void, s.o.<clinit>():void, u7.c.<init>(boolean, boolean, okio.a):void, x1.f0.<clinit>():void] */
    public /* synthetic */ C0205c(int i9) {
        this.f505g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f505g) {
            case 0:
                return AbstractC5999a.m10740c(((C0206d) obj).f506h, ((C0206d) obj2).f506h);
            case 1:
                return C0712i.f2142e.compare((C0712i) ((Map.Entry) obj).getKey(), (C0712i) ((Map.Entry) obj2).getKey());
            case 2:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i9 = 0; i9 < bArr.length; i9++) {
                    byte b10 = bArr[i9];
                    byte b11 = bArr2[i9];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            case 3:
                return AbstractC1416l.m3827c(((C1860n0) obj).f6185b, ((C1860n0) obj2).f6185b);
            case 4:
                C2564d c2564d = (C2564d) obj;
                C2564d c2564d2 = (C2564d) obj2;
                return (c2564d.f8313h - c2564d.f8312g) - (c2564d2.f8313h - c2564d2.f8312g);
            case 5:
                C0077h c0077h = (C0077h) obj;
                C0077h c0077h2 = (C0077h) obj2;
                if (c0077h == c0077h2) {
                    return 0;
                }
                return c0077h.f246j == c0077h2 ? 1 : -1;
            case 6:
                return ((String) obj).compareTo((String) obj2);
            case 7:
                C2930d c2930d = (C2930d) obj;
                C2930d c2930d2 = (C2930d) obj2;
                Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                comparator.getClass();
                int iCompare = comparator.compare(c2930d.f9589b, c2930d2.f9589b);
                return iCompare != 0 ? iCompare : comparator.compare(c2930d.f9588a, c2930d2.f9588a);
            case 8:
                Voice voice = (Voice) obj;
                Voice voice2 = (Voice) obj2;
                Comparator comparator2 = String.CASE_INSENSITIVE_ORDER;
                comparator2.getClass();
                Locale locale = voice.getLocale();
                String languageTag = locale != null ? locale.toLanguageTag() : null;
                String str = HttpUrl.FRAGMENT_ENCODE_SET;
                if (languageTag == null) {
                    languageTag = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Locale locale2 = voice2.getLocale();
                String languageTag2 = locale2 != null ? locale2.toLanguageTag() : null;
                if (languageTag2 != null) {
                    str = languageTag2;
                }
                int iCompare2 = comparator2.compare(languageTag, str);
                return iCompare2 != 0 ? iCompare2 : comparator2.compare(voice.getName(), voice2.getName());
            case 9:
                return AbstractC1416l.m3827c(((C3823d1) obj2).f12536a, ((C3823d1) obj).f12536a);
            case 10:
                return AbstractC1416l.m3827c(((C3632q) obj).f11753a, ((C3632q) obj2).f11753a);
            case 11:
                AbstractC3729s abstractC3729s = (AbstractC3729s) obj;
                AbstractC3729s abstractC3729s2 = (AbstractC3729s) obj2;
                int iCompareTo = abstractC3729s.compareTo(abstractC3729s2);
                return iCompareTo == 0 ? AbstractC5999a.m10742e(abstractC3729s.f7657g, abstractC3729s2.f7657g) : iCompareTo;
            default:
                C5602f0 c5602f0 = (C5602f0) obj;
                C5602f0 c5602f02 = (C5602f0) obj2;
                float f3 = c5602f0.f22779M.f22891p.f23021K;
                float f10 = c5602f02.f22779M.f22891p.f23021K;
                return f3 == f10 ? AbstractC1416l.m3827c(c5602f0.m10050v(), c5602f02.m10050v()) : Float.compare(f3, f10);
        }
    }
}
