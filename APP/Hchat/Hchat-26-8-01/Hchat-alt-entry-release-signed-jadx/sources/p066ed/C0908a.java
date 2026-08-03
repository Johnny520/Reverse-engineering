package p066ed;

import af.C0079b;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p215od.C3128a;
import p215od.C3131d;
import p246qd.AbstractC3506j;
import p246qd.C3497a;
import p246qd.C3499c;
import p246qd.C3501e;
import p246qd.C3502f;
import p246qd.C3505i;
import p281t3.AbstractC4106c;
import p302ud.C4325u;

/* JADX INFO: renamed from: ed.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0908a {

    /* JADX INFO: renamed from: d */
    public static final InterfaceC2844b f2820d = AbstractC2846d.m6274b(C0908a.class);

    /* JADX INFO: renamed from: e */
    public static final AbstractC3506j[] f2821e = new AbstractC3506j[0];

    /* JADX INFO: renamed from: f */
    public static final AbstractC3506j[] f2822f = {AbstractC3506j.f11394k};

    /* JADX INFO: renamed from: a */
    public final C4325u f2823a;

    /* JADX INFO: renamed from: b */
    public int f2824b;

    /* JADX INFO: renamed from: c */
    public C0909b[] f2825c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0908a(C4325u c4325u) {
        this.f2823a = c4325u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m2207e(DataInputStream dataInputStream) throws IOException {
        int i9 = dataInputStream.readByte() & 255;
        byte[] bArr = new byte[i9];
        int i10 = dataInputStream.read(bArr);
        while (i10 != i9) {
            int i11 = dataInputStream.read(bArr, i10, i9 - i10);
            if (i11 == -1) {
                C2104o.m5299y("String read error");
                return null;
            }
            i10 += i11;
        }
        return new String(bArr, "US-ASCII");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2208a(InputStream inputStream) throws IOException {
        AbstractC3506j[] abstractC3506jArr;
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream));
        try {
            byte[] bArr = new byte[8];
            if (dataInputStream.read(bArr) != 8 || !"jadx-cst".equals(new String(bArr, "US-ASCII"))) {
                throw new C0079b("Wrong jadx class set header");
            }
            byte b10 = dataInputStream.readByte();
            if (b10 != 5) {
                throw new C0079b("Wrong jadx class set version, got: " + ((int) b10) + ", expect: 5");
            }
            this.f2824b = dataInputStream.readInt();
            int i9 = dataInputStream.readInt();
            this.f2825c = new C0909b[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                int i11 = dataInputStream.readInt();
                int i12 = dataInputStream.readByte() & 255;
                int[] iArrM8280c = AbstractC4106c.m8280c(4);
                if (i12 < 0 || i12 > iArrM8280c.length) {
                    throw new C0079b("Wrong jadx source identifier: " + i12);
                }
                this.f2825c[i10] = new C0909b(i11, iArrM8280c[i12], AbstractC3506j.m7360x(m2207e(dataInputStream)));
            }
            for (int i13 = 0; i13 < i9; i13++) {
                C0909b c0909b = this.f2825c[i13];
                C3128a c3128aM6637e = C3128a.m6637e(this.f2823a, c0909b.f2826a);
                int i14 = dataInputStream.readByte();
                if (i14 == -2) {
                    abstractC3506jArr = f2822f;
                } else if (i14 == -1) {
                    abstractC3506jArr = null;
                } else if (i14 != 0) {
                    abstractC3506jArr = new AbstractC3506j[i14];
                    for (int i15 = 0; i15 < i14; i15++) {
                        abstractC3506jArr[i15] = m2209b(dataInputStream);
                    }
                } else {
                    abstractC3506jArr = f2821e;
                }
                c0909b.f2828c = abstractC3506jArr;
                c0909b.f2830e = m2210c(dataInputStream);
                ArrayList<C0911d> arrayListM2211d = m2211d(dataInputStream, c3128aM6637e);
                HashMap map = new HashMap(arrayListM2211d.size());
                for (C0911d c0911d : arrayListM2211d) {
                    map.put(c0911d.f2838g.f10154k, c0911d);
                }
                c0909b.f2829d = map;
            }
            dataInputStream.close();
        } catch (Throwable th2) {
            try {
                dataInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final AbstractC3506j m2209b(DataInputStream dataInputStream) throws IOException {
        int i9;
        byte b10 = dataInputStream.readByte();
        if (b10 == -1) {
            return null;
        }
        switch (AbstractC4106c.m8279b(AbstractC4106c.m8280c(7)[b10])) {
            case 0:
                byte b11 = dataInputStream.readByte();
                if (b11 == 0) {
                    i9 = 2;
                } else {
                    i9 = 1;
                    if (b11 != 1) {
                        i9 = 3;
                    }
                }
                return i9 == 2 ? AbstractC3506j.f11403t : new C3505i(i9, m2209b(dataInputStream));
            case 1:
                return AbstractC3506j.m7358e(this.f2825c[dataInputStream.readInt()].f2826a, m2210c(dataInputStream));
            case 2:
                return new C3499c(m2207e(dataInputStream), m2210c(dataInputStream));
            case 3:
                return new C3502f((C3501e) m2209b(dataInputStream), (C3501e) m2209b(dataInputStream));
            case 4:
                return this.f2825c[dataInputStream.readInt()].f2826a;
            case 5:
                AbstractC3506j abstractC3506jM2209b = m2209b(dataInputStream);
                Objects.requireNonNull(abstractC3506jM2209b);
                return new C3497a(abstractC3506jM2209b);
            case 6:
                return AbstractC3506j.m7361y((char) dataInputStream.readByte());
            default:
                C0086a.m452k(AbstractC0921a.m2249l(b10, "Unsupported Arg Type: "));
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final List m2210c(DataInputStream dataInputStream) throws IOException {
        byte b10 = dataInputStream.readByte();
        if (b10 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(b10);
        for (int i9 = 0; i9 < b10; i9++) {
            arrayList.add(m2209b(dataInputStream));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final ArrayList m2211d(DataInputStream dataInputStream, C3128a c3128a) throws IOException {
        short s10 = dataInputStream.readShort();
        ArrayList arrayList = new ArrayList(s10);
        for (int i9 = 0; i9 < s10; i9++) {
            String strM2207e = m2207e(dataInputStream);
            List listM2210c = m2210c(dataInputStream);
            AbstractC3506j abstractC3506jM2209b = m2209b(dataInputStream);
            List listM2210c2 = m2210c(dataInputStream);
            List list = (listM2210c2.isEmpty() || listM2210c2.equals(listM2210c)) ? listM2210c : listM2210c2;
            AbstractC3506j abstractC3506jM2209b2 = m2209b(dataInputStream);
            AbstractC3506j abstractC3506j = Objects.equals(abstractC3506jM2209b2, abstractC3506jM2209b) ? abstractC3506jM2209b : abstractC3506jM2209b2;
            arrayList.add(new C0911d(C3131d.m6657b(this.f2823a, c3128a, strM2207e, listM2210c, abstractC3506jM2209b), list, abstractC3506j, m2210c(dataInputStream), m2210c(dataInputStream), dataInputStream.readInt()));
        }
        return arrayList;
    }
}
