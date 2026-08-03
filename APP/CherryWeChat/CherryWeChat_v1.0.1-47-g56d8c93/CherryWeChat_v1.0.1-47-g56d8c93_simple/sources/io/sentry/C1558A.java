package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1558A implements InterfaceC1622Q {

    /* JADX INFO: renamed from: b */
    public static final Charset f5578b = null;

    /* JADX INFO: renamed from: a */
    public final InterfaceC1866e0 f5579a;

    static {
        f5578b = Charset.forName("UTF-8");
    }

    public C1558A(InterfaceC1866e0 r1) {
        this.f5579a = r1;
    }

    @Override // io.sentry.InterfaceC1622Q
    /* JADX INFO: renamed from: a */
    public final C1901c mo3556a(BufferedInputStream r13) {
        InterfaceC1866e0 r0 = this.f5579a;
        Charset r1 = f5578b;
        byte[] r2 = new byte[1024];
        ByteArrayOutputStream r3 = new ByteArrayOutputStream();
        int r7 = 0;
        int r6 = -1;
    L85:
        int r8 = r13.read(r2);     // Catch: Throwable -> L12
        if (r8 <= 0) goto L15;
        int r10 = 0;
    L6:
        if (r6 != (-1)) goto L14;
        if (r10 >= r8) goto L14;
        if (r2[r10] == 10) goto L10;
        r10 = r10 + 1;     // Catch: Throwable -> L12
        goto L6
    L10:
        r6 = r7 + r10;     // Catch: Throwable -> L12
    L14:
        r3.write(r2, 0, r8);     // Catch: Throwable -> L12
        r7 = r7 + r8;     // Catch: Throwable -> L12
        goto L85
    L15:
        byte[] r132 = r3.toByteArray();     // Catch: Throwable -> L12
        if (r132.length == 0) goto L75;
        if (r6 == (-1)) goto L73;
        StringReader r4 = new StringReader(new String(r132, 0, r6, r1));     // Catch: Throwable -> L12
        C1596J1 r22 = (C1596J1) r0.mo3607a(r4, C1596J1.class);     // Catch: Throwable -> L66
        r4.close();     // Catch: Throwable -> L12
        if (r22 == null) goto L65;
        int r62 = r6 + 1;     // Catch: Throwable -> L12
        ArrayList r42 = new ArrayList();     // Catch: Throwable -> L12
    L23:
        int r72 = r62;
    L25:
        if (r72 >= r132.length) goto L30;
        if (r132[r72] == 10) goto L31;
        r72 = r72 + 1;     // Catch: Throwable -> L12
    L31:
        if (r72 == (-1)) goto L63;
        StringReader r63 = new StringReader(new String(r132, r62, r72 - r62, r1));     // Catch: Throwable -> L12
        C1624Q1 r82 = (C1624Q1) r0.mo3607a(r63, C1624Q1.class);     // Catch: Throwable -> L56
        r63.close();     // Catch: Throwable -> L12
        if (r82 == null) goto L55;
        if (r82.m3737a() <= 0) goto L55;
        int r64 = r82.m3737a() + r72;     // Catch: Throwable -> L12
        int r102 = r64 + 1;     // Catch: Throwable -> L12
        if (r102 > r132.length) goto L53;
        r42.add(new C1620P1(r82, Arrays.copyOfRange(r132, r72 + 1, r102)));     // Catch: Throwable -> L12
        if (r102 == r132.length) goto L47;
        r62 = r64 + 2;     // Catch: Throwable -> L12
        if (r62 != r132.length) goto L23;
        if (r132[r102] == 10) goto L47;
        throw new IllegalArgumentException("Envelope has invalid data following an item.");     // Catch: Throwable -> L12
    L47:
        C1901c r133 = new C1901c(r22, r42);     // Catch: Throwable -> L12
        r3.close();
        return r133;
    L53:
        throw new IllegalArgumentException("Invalid length for item at index '" + r42.size() + "'. Item is '" + r102 + "' bytes. There are '" + r132.length + "' in the buffer.");     // Catch: Throwable -> L12
    L55:
        throw new IllegalArgumentException("Item header at index '" + r42.size() + "' is null or empty.");     // Catch: Throwable -> L12
    L56:
        th = move-exception;
        r63.close();     // Catch: Throwable -> L59
    L61:
        throw th;     // Catch: Throwable -> L12
    L59:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L12
        goto L61
    L63:
        throw new IllegalArgumentException("Invalid envelope. Item at index '" + r42.size() + "'. has no header delimiter.");     // Catch: Throwable -> L12
    L30:
        r72 = -1;
        goto L31
    L65:
        throw new IllegalArgumentException("Envelope header is null.");     // Catch: Throwable -> L12
    L66:
        th = move-exception;
        r4.close();     // Catch: Throwable -> L69
    L71:
        throw th;     // Catch: Throwable -> L12
    L69:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L12
        goto L71
    L73:
        throw new IllegalArgumentException("Envelope contains no header.");     // Catch: Throwable -> L12
    L75:
        throw new IllegalArgumentException("Empty stream.");     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        r3.close();     // Catch: Throwable -> L78
    L80:
        throw th;
    L78:
        th = move-exception;
        th.addSuppressed(th);
        goto L80
    }
}
