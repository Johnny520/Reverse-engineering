package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1558A implements InterfaceC1622Q {

    /* JADX INFO: renamed from: b */
    public static final Charset f5578b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final InterfaceC1866e0 f5579a;

    public C1558A(InterfaceC1866e0 interfaceC1866e0) {
        this.f5579a = interfaceC1866e0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00aa, code lost:
    
        r13 = new io.sentry.internal.debugmeta.C1901c(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010b, code lost:
    
        throw new java.lang.IllegalArgumentException("Item header at index '" + r4.size() + "' is null or empty.");
     */
    @Override // io.sentry.InterfaceC1622Q
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1901c mo3556a(BufferedInputStream bufferedInputStream) throws IOException {
        InterfaceC1866e0 interfaceC1866e0 = this.f5579a;
        Charset charset = f5578b;
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        int i2 = -1;
        while (true) {
            try {
                int i3 = bufferedInputStream.read(bArr);
                if (i3 <= 0) {
                    break;
                }
                int i4 = 0;
                while (true) {
                    if (i2 != -1 || i4 >= i3) {
                        break;
                    }
                    if (bArr[i4] == 10) {
                        i2 = i + i4;
                        break;
                    }
                    i4++;
                }
                byteArrayOutputStream.write(bArr, 0, i3);
                i += i3;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (byteArray.length == 0) {
            throw new IllegalArgumentException("Empty stream.");
        }
        if (i2 == -1) {
            throw new IllegalArgumentException("Envelope contains no header.");
        }
        StringReader stringReader = new StringReader(new String(byteArray, 0, i2, charset));
        try {
            C1596J1 c1596j1 = (C1596J1) interfaceC1866e0.mo3607a(stringReader, C1596J1.class);
            stringReader.close();
            if (c1596j1 == null) {
                throw new IllegalArgumentException("Envelope header is null.");
            }
            int i5 = i2 + 1;
            ArrayList arrayList = new ArrayList();
            while (true) {
                int i6 = i5;
                while (true) {
                    if (i6 >= byteArray.length) {
                        i6 = -1;
                        break;
                    }
                    if (byteArray[i6] == 10) {
                        break;
                    }
                    i6++;
                }
                if (i6 == -1) {
                    throw new IllegalArgumentException("Invalid envelope. Item at index '" + arrayList.size() + "'. has no header delimiter.");
                }
                stringReader = new StringReader(new String(byteArray, i5, i6 - i5, charset));
                try {
                    C1624Q1 c1624q1 = (C1624Q1) interfaceC1866e0.mo3607a(stringReader, C1624Q1.class);
                    stringReader.close();
                    if (c1624q1 == null || c1624q1.m3737a() <= 0) {
                        break;
                    }
                    int iM3737a = c1624q1.m3737a() + i6;
                    int i7 = iM3737a + 1;
                    if (i7 > byteArray.length) {
                        throw new IllegalArgumentException("Invalid length for item at index '" + arrayList.size() + "'. Item is '" + i7 + "' bytes. There are '" + byteArray.length + "' in the buffer.");
                    }
                    arrayList.add(new C1620P1(c1624q1, Arrays.copyOfRange(byteArray, i6 + 1, i7)));
                    if (i7 == byteArray.length) {
                        break;
                    }
                    i5 = iM3737a + 2;
                    if (i5 == byteArray.length) {
                        if (byteArray[i7] != 10) {
                            throw new IllegalArgumentException("Envelope has invalid data following an item.");
                        }
                    }
                } finally {
                }
            }
        } finally {
        }
    }
}
