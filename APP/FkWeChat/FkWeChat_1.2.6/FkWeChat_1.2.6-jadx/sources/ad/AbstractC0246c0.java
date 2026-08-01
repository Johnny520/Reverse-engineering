package ad;

import okhttp3.internal.url._UrlKt;
import p080f9.AbstractC2368o;
import p172l8.C4699i;
import p329wc.InterfaceC9218f;

/* JADX INFO: renamed from: ad.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0246c0 {
    /* JADX INFO: renamed from: a */
    public static final C0298y m695a(Number number, String str, String str2) {
        number.getClass();
        str.getClass();
        str2.getClass();
        return m699e(-1, m706l(number, str, str2));
    }

    /* JADX INFO: renamed from: b */
    public static final C0240a0 m696b(Number number, String str) {
        number.getClass();
        str.getClass();
        return new C0240a0("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m704j(str, 0, 1, null)));
    }

    /* JADX INFO: renamed from: c */
    public static final C0240a0 m697c(Number number, String str, String str2) {
        number.getClass();
        str.getClass();
        str2.getClass();
        return new C0240a0(m706l(number, str, str2));
    }

    /* JADX INFO: renamed from: d */
    public static final C0240a0 m698d(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        return new C0240a0("Value of type '" + interfaceC9218f.mo35888a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + interfaceC9218f.mo35896j() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX INFO: renamed from: e */
    public static final C0298y m699e(int i10, String str) {
        str.getClass();
        if (i10 >= 0) {
            str = "Unexpected JSON token at offset " + i10 + ": " + str;
        }
        return new C0298y(str);
    }

    /* JADX INFO: renamed from: f */
    public static final C0298y m700f(int i10, String str, CharSequence charSequence) {
        str.getClass();
        charSequence.getClass();
        return m699e(i10, str + "\nJSON input: " + ((Object) m703i(charSequence, i10)));
    }

    /* JADX INFO: renamed from: g */
    public static final Void m701g(AbstractC0239a abstractC0239a, String str) {
        abstractC0239a.getClass();
        str.getClass();
        abstractC0239a.m629y("Trailing comma before the end of JSON " + str, abstractC0239a.f592a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw new C4699i();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Void m702h(AbstractC0239a abstractC0239a, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "object";
        }
        return m701g(abstractC0239a, str);
    }

    /* JADX INFO: renamed from: i */
    public static final CharSequence m703i(CharSequence charSequence, int i10) {
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            if (i10 != -1) {
                int i11 = i10 - 30;
                int i12 = i10 + 30;
                return (i11 <= 0 ? _UrlKt.FRAGMENT_ENCODE_SET : ".....") + charSequence.subSequence(AbstractC2368o.m8578e(i11, 0), AbstractC2368o.m8582i(i12, charSequence.length())).toString() + (i12 >= charSequence.length() ? _UrlKt.FRAGMENT_ENCODE_SET : ".....");
            }
            int length = charSequence.length() - 60;
            if (length > 0) {
                return "....." + charSequence.subSequence(length, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ CharSequence m704j(CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = -1;
        }
        return m703i(charSequence, i10);
    }

    /* JADX INFO: renamed from: k */
    public static final Void m705k(AbstractC0239a abstractC0239a, Number number) {
        abstractC0239a.getClass();
        number.getClass();
        AbstractC0239a.m588z(abstractC0239a, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
        throw new C4699i();
    }

    /* JADX INFO: renamed from: l */
    public static final String m706l(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m704j(str2, 0, 1, null));
    }
}
