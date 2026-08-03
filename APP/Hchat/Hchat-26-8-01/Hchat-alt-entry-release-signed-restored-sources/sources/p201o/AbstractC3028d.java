package p201o;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;
import p071f1.C1024q0;
import p071f1.C1034w;
import p119i2.C1922e;
import p119i2.C1925f0;
import p119i2.C1926g;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p280t2.C4085a;
import p280t2.C4096l;
import p280t2.C4100p;
import p280t2.InterfaceC4099o;
import p293u2.C4245o;
import p357y1.C5951x0;
import tf.C4173t;

/* JADX INFO: renamed from: o.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3028d {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement[] f9832a = new StackTraceElement[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C5951x0 m6433a(C1926g c1926g) {
        SpannableString spannableString;
        List list = c1926g.f6530i;
        C4173t c4173t = C4173t.f13710g;
        List list2 = list == null ? c4173t : list;
        CharSequence charSequence = c1926g.f6529h;
        if (!list2.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            C3025a c3025a = new C3025a();
            c3025a.f9830a = Parcel.obtain();
            if (list == null) {
                list = c4173t;
            }
            int size = list.size();
            int i9 = 0;
            while (i9 < size) {
                C1922e c1922e = (C1922e) list.get(i9);
                C1925f0 c1925f0 = (C1925f0) c1922e.f6503a;
                int i10 = c1922e.f6504b;
                int i11 = c1922e.f6505c;
                c3025a.f9830a.recycle();
                c3025a.f9830a = Parcel.obtain();
                InterfaceC4099o interfaceC4099o = c1925f0.f6513a;
                long j3 = c1925f0.f6524l;
                long j4 = c1925f0.f6520h;
                int i12 = i9;
                long j5 = c1925f0.f6514b;
                List list3 = list;
                int i13 = size;
                long jMo8268b = interfaceC4099o.mo8268b();
                long j10 = C1034w.f3263g;
                if (C1034w.m2635c(jMo8268b, j10)) {
                    spannableString = spannableString2;
                } else {
                    c3025a.m6425c((byte) 1);
                    spannableString = spannableString2;
                    c3025a.f9830a.writeLong(c1925f0.f6513a.mo8268b());
                }
                long j11 = C4245o.f13924c;
                byte b10 = 2;
                if (!C4245o.m8538a(j5, j11)) {
                    c3025a.m6425c((byte) 2);
                    c3025a.m6427e(j5);
                }
                C2767k c2767k = c1925f0.f6515c;
                if (c2767k != null) {
                    c3025a.m6425c((byte) 3);
                    c3025a.f9830a.writeInt(c2767k.f9003g);
                }
                C2765i c2765i = c1925f0.f6516d;
                if (c2765i != null) {
                    int i14 = c2765i.f8996a;
                    c3025a.m6425c((byte) 4);
                    c3025a.m6425c((i14 != 0 && i14 == 1) ? (byte) 1 : (byte) 0);
                }
                C2766j c2766j = c1925f0.f6517e;
                if (c2766j != null) {
                    int i15 = c2766j.f8997a;
                    c3025a.m6425c((byte) 5);
                    if (i15 != 0) {
                        if (i15 == 65535) {
                            b10 = 1;
                        } else if (i15 != 1) {
                            b10 = i15 == 2 ? (byte) 3 : (byte) 0;
                        }
                        c3025a.m6425c(b10);
                    }
                }
                String str = c1925f0.f6519g;
                if (str != null) {
                    c3025a.m6425c((byte) 6);
                    c3025a.f9830a.writeString(str);
                }
                if (!C4245o.m8538a(j4, j11)) {
                    c3025a.m6425c((byte) 7);
                    c3025a.m6427e(j4);
                }
                C4085a c4085a = c1925f0.f6521i;
                if (c4085a != null) {
                    float f3 = c4085a.f13537a;
                    c3025a.m6425c((byte) 8);
                    c3025a.m6426d(f3);
                }
                C4100p c4100p = c1925f0.f6522j;
                if (c4100p != null) {
                    c3025a.m6425c((byte) 9);
                    c3025a.m6426d(c4100p.f13565a);
                    c3025a.m6426d(c4100p.f13566b);
                }
                if (!C1034w.m2635c(j3, j10)) {
                    c3025a.m6425c((byte) 10);
                    c3025a.f9830a.writeLong(j3);
                }
                C4096l c4096l = c1925f0.f6525m;
                if (c4096l != null) {
                    c3025a.m6425c((byte) 11);
                    c3025a.f9830a.writeInt(c4096l.f13561a);
                }
                C1024q0 c1024q0 = c1925f0.f6526n;
                if (c1024q0 != null) {
                    c3025a.m6425c((byte) 12);
                    c3025a.f9830a.writeLong(c1024q0.f3234a);
                    long j12 = c1024q0.f3235b;
                    c3025a.m6426d(Float.intBitsToFloat((int) (j12 >> 32)));
                    c3025a.m6426d(Float.intBitsToFloat((int) (j12 & 4294967295L)));
                    c3025a.m6426d(c1024q0.f3236c);
                }
                SpannableString spannableString3 = spannableString;
                spannableString3.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(c3025a.f9830a.marshall(), 0)), i10, i11, 33);
                i9 = i12 + 1;
                spannableString2 = spannableString3;
                list = list3;
                size = i13;
            }
            charSequence = spannableString2;
        }
        return new C5951x0(ClipData.newPlainText("plain text", charSequence));
    }
}
