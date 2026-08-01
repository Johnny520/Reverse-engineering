package p238t;

import android.content.ClipData;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;
import p047I0.C0741k0;
import p061L2.C0981u;
import p092S0.C1252E;
import p092S0.C1267e;
import p092S0.C1269g;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p147d1.C1951a;
import p147d1.C1962l;
import p147d1.C1966p;
import p147d1.InterfaceC1965o;
import p153e1.C2019o;
import p211o0.C2737L;
import p211o0.C2762u;

/* JADX INFO: renamed from: t.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3205c {

    /* JADX INFO: renamed from: a */
    public static final StackTraceElement[] f9977a = new StackTraceElement[0];

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0741k0 m5480a(C1269g c1269g) {
        SpannableString spannableString;
        List list = c1269g.f4564f;
        C0981u c0981u = C0981u.f3047d;
        List list2 = list == null ? c0981u : list;
        CharSequence charSequence = c1269g.f4563e;
        if (!list2.isEmpty()) {
            SpannableString spannableString2 = new SpannableString(charSequence);
            C3203a c3203a = new C3203a();
            c3203a.f9976a = Parcel.obtain();
            if (list == null) {
                list = c0981u;
            }
            int size = list.size();
            int i5 = 0;
            while (i5 < size) {
                C1267e c1267e = (C1267e) list.get(i5);
                C1252E c1252e = (C1252E) c1267e.f4557a;
                int i6 = c1267e.f4558b;
                int i7 = c1267e.f4559c;
                c3203a.f9976a.recycle();
                c3203a.f9976a = Parcel.obtain();
                InterfaceC1965o interfaceC1965o = c1252e.f4494a;
                long j5 = c1252e.f4505l;
                long j6 = c1252e.f4501h;
                int i8 = i5;
                long j7 = c1252e.f4495b;
                List list3 = list;
                int i9 = size;
                long jMo3620b = interfaceC1965o.mo3620b();
                long j8 = C2762u.f8762g;
                if (C2762u.m4921c(jMo3620b, j8)) {
                    spannableString = spannableString2;
                } else {
                    c3203a.m5472c((byte) 1);
                    spannableString = spannableString2;
                    c3203a.f9976a.writeLong(c1252e.f4494a.mo3620b());
                }
                long j9 = C2019o.f6747c;
                byte b2 = 2;
                if (!C2019o.m3708a(j7, j9)) {
                    c3203a.m5472c((byte) 2);
                    c3203a.m5474e(j7);
                }
                C1587l c1587l = c1252e.f4496c;
                if (c1587l != null) {
                    c3203a.m5472c((byte) 3);
                    c3203a.f9976a.writeInt(c1587l.f5507d);
                }
                C1585j c1585j = c1252e.f4497d;
                if (c1585j != null) {
                    int i10 = c1585j.f5499a;
                    c3203a.m5472c((byte) 4);
                    c3203a.m5472c((i10 != 0 && i10 == 1) ? (byte) 1 : (byte) 0);
                }
                C1586k c1586k = c1252e.f4498e;
                if (c1586k != null) {
                    int i11 = c1586k.f5500a;
                    c3203a.m5472c((byte) 5);
                    if (i11 != 0) {
                        if (i11 == 65535) {
                            b2 = 1;
                        } else if (i11 != 1) {
                            b2 = i11 == 2 ? (byte) 3 : (byte) 0;
                        }
                        c3203a.m5472c(b2);
                    }
                }
                String str = c1252e.f4500g;
                if (str != null) {
                    c3203a.m5472c((byte) 6);
                    c3203a.f9976a.writeString(str);
                }
                if (!C2019o.m3708a(j6, j9)) {
                    c3203a.m5472c((byte) 7);
                    c3203a.m5474e(j6);
                }
                C1951a c1951a = c1252e.f4502i;
                if (c1951a != null) {
                    float f2 = c1951a.f6619a;
                    c3203a.m5472c((byte) 8);
                    c3203a.m5473d(f2);
                }
                C1966p c1966p = c1252e.f4503j;
                if (c1966p != null) {
                    c3203a.m5472c((byte) 9);
                    c3203a.m5473d(c1966p.f6647a);
                    c3203a.m5473d(c1966p.f6648b);
                }
                if (!C2762u.m4921c(j5, j8)) {
                    c3203a.m5472c((byte) 10);
                    c3203a.f9976a.writeLong(j5);
                }
                C1962l c1962l = c1252e.f4506m;
                if (c1962l != null) {
                    c3203a.m5472c((byte) 11);
                    c3203a.f9976a.writeInt(c1962l.f6643a);
                }
                C2737L c2737l = c1252e.f4507n;
                if (c2737l != null) {
                    c3203a.m5472c((byte) 12);
                    c3203a.f9976a.writeLong(c2737l.f8704a);
                    long j10 = c2737l.f8705b;
                    c3203a.m5473d(Float.intBitsToFloat((int) (j10 >> 32)));
                    c3203a.m5473d(Float.intBitsToFloat((int) (j10 & 4294967295L)));
                    c3203a.m5473d(c2737l.f8706c);
                }
                SpannableString spannableString3 = spannableString;
                spannableString3.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(c3203a.f9976a.marshall(), 0)), i6, i7, 33);
                i5 = i8 + 1;
                spannableString2 = spannableString3;
                list = list3;
                size = i9;
            }
            charSequence = spannableString2;
        }
        return new C0741k0(ClipData.newPlainText("plain text", charSequence));
    }
}
