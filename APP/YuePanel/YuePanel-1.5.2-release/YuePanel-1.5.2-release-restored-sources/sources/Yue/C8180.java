package Yue;

import Yue.AbstractC8178;
import Yue.InterfaceC7144;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۣۢۦۣ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
public class C8180 extends AbstractC8178 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final Charset f24318 = Charset.forName("UTF-16");

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f24319 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public static final int f24320 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public static final int f24321 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f24322 = 3;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f24323 = 4;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f24324 = 5;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f24325 = 6;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public static final int f24326 = 7;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public static final int f24327 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public static final int f24328 = 9;

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public static final int f24329 = 10;

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public static final int f24330 = 11;

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public static final int f24331 = 12;

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public static final int f24332 = 13;

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public static final int f24333 = 14;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final DataInputStream f24334;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final DataOutputStream f24335;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public DataInputStream f24336;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public DataOutputStream f24337;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C1454 f24338;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public boolean f24339;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f24340;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f24341;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public int f24342;

    /* JADX INFO: renamed from: Yue.ۥۣۢۦۣ$ۥ۟ */
    public static class C1454 {

        /* JADX INFO: renamed from: ۥ */
        public final ByteArrayOutputStream f3292;

        /* JADX INFO: renamed from: ۥ۟ */
        public final DataOutputStream f3293;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int f24344;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final DataOutputStream f24345;

        public C1454(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f3292 = byteArrayOutputStream;
            this.f3293 = new DataOutputStream(byteArrayOutputStream);
            this.f24344 = i;
            this.f24345 = dataOutputStream;
        }

        /* JADX INFO: renamed from: ۥ */
        public void m4209() throws IOException {
            this.f3293.flush();
            int size = this.f3292.size();
            this.f24345.writeInt((this.f24344 << 16) | (size >= 65535 ? 65535 : size));
            if (size >= 65535) {
                this.f24345.writeInt(size);
            }
            this.f3292.writeTo(this.f24345);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C8180(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new C3394(), new C3394(), new C3394());
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ */
    public void mo4207() {
        C1454 c1454 = this.f24338;
        if (c1454 != null) {
            try {
                if (c1454.f3292.size() != 0) {
                    this.f24338.m4209();
                }
                this.f24338 = null;
            } catch (IOException e) {
                throw new AbstractC8178.C1452(e);
            }
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ */
    public AbstractC8178 mo26980() {
        return new C8180(this.f24336, this.f24337, this.f3290, this.f3291, this.f24306);
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public boolean mo26985() {
        return true;
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public boolean mo26988() {
        try {
            return this.f24336.readBoolean();
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public Bundle mo26992() {
        int iMo27014 = mo27014();
        if (iMo27014 < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < iMo27014; i++) {
            m27095(mo27014(), mo27031(), bundle);
        }
        return bundle;
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public byte[] mo26995() {
        try {
            int i = this.f24336.readInt();
            if (i <= 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            this.f24336.readFully(bArr);
            return bArr;
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public CharSequence mo26998() {
        return null;
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public double mo27001() {
        try {
            return this.f24336.readDouble();
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public boolean mo27008(int i) {
        while (true) {
            try {
                int i2 = this.f24341;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                if (this.f24340 < this.f24342) {
                    this.f24334.skip(r2 - r1);
                }
                this.f24342 = -1;
                int i3 = this.f24334.readInt();
                this.f24340 = 0;
                int i4 = i3 & 65535;
                if (i4 == 65535) {
                    i4 = this.f24334.readInt();
                }
                this.f24341 = (i3 >> 16) & 65535;
                this.f24342 = i4;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public float mo27009() {
        try {
            return this.f24336.readFloat();
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public int mo27014() {
        try {
            return this.f24336.readInt();
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public long mo27019() {
        try {
            return this.f24336.readLong();
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥۣ۟۟ */
    public <T extends Parcelable> T mo27024() {
        return null;
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥۣ۟۟ۥ */
    public String mo27031() {
        try {
            int i = this.f24336.readInt();
            if (i <= 0) {
                return null;
            }
            byte[] bArr = new byte[i];
            this.f24336.readFully(bArr);
            return new String(bArr, f24318);
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥۣ۟۟ۧ */
    public IBinder mo27033() {
        return null;
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۤ۠ */
    public void mo27037(int i) {
        mo4207();
        C1454 c1454 = new C1454(i, this.f24335);
        this.f24338 = c1454;
        this.f24337 = c1454.f3293;
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۤۡ */
    public void mo27038(boolean z, boolean z2) {
        if (!z) {
            throw new RuntimeException("Serialization of this object is not allowed");
        }
        this.f24339 = z2;
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۤۤ */
    public void mo27041(boolean z) {
        try {
            this.f24337.writeBoolean(z);
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۤۨ */
    public void mo27045(Bundle bundle) {
        try {
            if (bundle == null) {
                this.f24337.writeInt(-1);
                return;
            }
            Set<String> setKeySet = bundle.keySet();
            this.f24337.writeInt(setKeySet.size());
            for (String str : setKeySet) {
                mo27085(str);
                m27096(bundle.get(str));
            }
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public void mo27048(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f24337.writeInt(bArr.length);
                this.f24337.write(bArr);
            } else {
                this.f24337.writeInt(-1);
            }
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۥۢ */
    public void mo27050(byte[] bArr, int i, int i2) {
        try {
            if (bArr != null) {
                this.f24337.writeInt(i2);
                this.f24337.write(bArr, i, i2);
            } else {
                this.f24337.writeInt(-1);
            }
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۥۥ */
    public void mo27053(CharSequence charSequence) {
        if (!this.f24339) {
            throw new RuntimeException("CharSequence cannot be written to an OutputStream");
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۦ */
    public void mo27057(double d) {
        try {
            this.f24337.writeDouble(d);
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ */
    public void mo27062(float f) {
        try {
            this.f24337.writeFloat(f);
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۦۧ */
    public void mo27066(int i) {
        try {
            this.f24337.writeInt(i);
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۧۡ */
    public void mo27071(long j) {
        try {
            this.f24337.writeLong(j);
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۧۧ */
    public void mo27077(Parcelable parcelable) {
        if (!this.f24339) {
            throw new RuntimeException("Parcelables cannot be written to an OutputStream");
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ */
    public void mo27085(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(f24318);
                this.f24337.writeInt(bytes.length);
                this.f24337.write(bytes);
            } else {
                this.f24337.writeInt(-1);
            }
        } catch (IOException e) {
            throw new AbstractC8178.C1452(e);
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۨۦ */
    public void mo27087(IBinder iBinder) {
        if (!this.f24339) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    @Override // Yue.AbstractC8178
    /* JADX INFO: renamed from: ۥ۟۟ۨۨ */
    public void mo27089(IInterface iInterface) {
        if (!this.f24339) {
            throw new RuntimeException("Binders cannot be written to an OutputStream");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public final void m27095(int i, String str, Bundle bundle) {
        switch (i) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, mo26992());
                return;
            case 2:
                bundle.putBundle(str, mo26992());
                return;
            case 3:
                bundle.putString(str, mo27031());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) m26986(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, mo26988());
                return;
            case 6:
                bundle.putBooleanArray(str, m26990());
                return;
            case 7:
                bundle.putDouble(str, mo27001());
                return;
            case 8:
                bundle.putDoubleArray(str, m27003());
                return;
            case 9:
                bundle.putInt(str, mo27014());
                return;
            case 10:
                bundle.putIntArray(str, m27016());
                return;
            case 11:
                bundle.putLong(str, mo27019());
                return;
            case 12:
                bundle.putLongArray(str, m27021());
                return;
            case 13:
                bundle.putFloat(str, mo27009());
                return;
            case 14:
                bundle.putFloatArray(str, m27011());
                return;
            default:
                throw new RuntimeException("Unknown type " + i);
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public final void m27096(Object obj) {
        if (obj == null) {
            mo27066(0);
            return;
        }
        if (obj instanceof Bundle) {
            mo27066(1);
            mo27045((Bundle) obj);
            return;
        }
        if (obj instanceof String) {
            mo27066(3);
            mo27085((String) obj);
            return;
        }
        if (obj instanceof String[]) {
            mo27066(4);
            m27039((String[]) obj);
            return;
        }
        if (obj instanceof Boolean) {
            mo27066(5);
            mo27041(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            mo27066(6);
            m27043((boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            mo27066(7);
            mo27057(((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            mo27066(8);
            m27059((double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            mo27066(9);
            mo27066(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            mo27066(10);
            m27068((int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            mo27066(11);
            mo27071(((Long) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            mo27066(12);
            m27073((long[]) obj);
            return;
        }
        if (obj instanceof Float) {
            mo27066(13);
            mo27062(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            mo27066(14);
            m27064((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C8180(InputStream inputStream, OutputStream outputStream, C3394<String, Method> c3394, C3394<String, Method> c33942, C3394<String, Class> c33943) {
        super(c3394, c33942, c33943);
        this.f24340 = 0;
        this.f24341 = -1;
        this.f24342 = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new C1453(inputStream)) : null;
        this.f24334 = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f24335 = dataOutputStream;
        this.f24336 = dataInputStream;
        this.f24337 = dataOutputStream;
    }

    /* JADX INFO: renamed from: Yue.ۥۣۢۦۣ$ۥ */
    public class C1453 extends FilterInputStream {
        public C1453(InputStream inputStream) {
            super(inputStream);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            C8180 c8180 = C8180.this;
            int i = c8180.f24342;
            if (i != -1 && c8180.f24340 >= i) {
                throw new IOException();
            }
            int i2 = super.read();
            C8180.this.f24340++;
            return i2;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) throws IOException {
            C8180 c8180 = C8180.this;
            int i = c8180.f24342;
            if (i != -1 && c8180.f24340 >= i) {
                throw new IOException();
            }
            long jSkip = super.skip(j);
            if (jSkip > 0) {
                C8180.this.f24340 += (int) jSkip;
            }
            return jSkip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            C8180 c8180 = C8180.this;
            int i3 = c8180.f24342;
            if (i3 != -1 && c8180.f24340 >= i3) {
                throw new IOException();
            }
            int i4 = super.read(bArr, i, i2);
            if (i4 > 0) {
                C8180.this.f24340 += i4;
            }
            return i4;
        }
    }
}
