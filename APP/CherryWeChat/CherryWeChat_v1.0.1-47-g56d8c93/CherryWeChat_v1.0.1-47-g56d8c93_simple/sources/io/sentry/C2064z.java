package io.sentry;

import io.sentry.config.AbstractC1856a;
import java.net.URI;

/* JADX INFO: renamed from: io.sentry.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2064z {

    /* JADX INFO: renamed from: a */
    public final String f7294a;

    /* JADX INFO: renamed from: b */
    public final String f7295b;

    /* JADX INFO: renamed from: c */
    public final URI f7296c;

    public C2064z(String r11) {
        AbstractC1856a.m4048D("The DSN is required.", r11);     // Catch: Throwable -> L10
        URI r112 = new URI(r11).normalize();     // Catch: Throwable -> L10
        String r3 = r112.getScheme();     // Catch: Throwable -> L10
        if ("http".equalsIgnoreCase(r3) == false) goto L6;
    L12:
        String r1 = r112.getUserInfo();     // Catch: Throwable -> L10
        if (r1 == null) goto L40;
        if (r1.isEmpty() == true) goto L40;
        String[] r12 = r1.split(":", -1);     // Catch: Throwable -> L10
        String r5 = r12[0];     // Catch: Throwable -> L10
        this.f7295b = r5;     // Catch: Throwable -> L10
        if (r5 == null) goto L38;
        if (r5.isEmpty() == true) goto L38;
        if (r12.length <= 1) goto L24;
        String r13 = r12[1];     // Catch: Throwable -> L10
    L25:
        this.f7294a = r13;     // Catch: Throwable -> L10
        String r14 = r112.getPath();     // Catch: Throwable -> L10
        if (r14.endsWith("/") == false) goto L28;
        r14 = r14.substring(0, r14.length() - 1);     // Catch: Throwable -> L10
    L28:
        int r2 = r14.lastIndexOf("/") + 1;     // Catch: Throwable -> L10
        String r4 = r14.substring(0, r2);     // Catch: Throwable -> L10
        if (r4.endsWith("/") == true) goto L31;
        r4 = r4.concat("/");     // Catch: Throwable -> L10
    L31:
        String r0 = r14.substring(r2);     // Catch: Throwable -> L10
        if (r0.isEmpty() == true) goto L36;
        this.f7296c = new URI(r3, null, r112.getHost(), r112.getPort(), r4 + "api/" + r0, null, null);     // Catch: Throwable -> L10
        return;
    L36:
        throw new IllegalArgumentException("Invalid DSN: A Project Id is required.");     // Catch: Throwable -> L10
    L24:
        r13 = null;
    L38:
        throw new IllegalArgumentException("Invalid DSN: No public key provided.");     // Catch: Throwable -> L10
    L40:
        throw new IllegalArgumentException("Invalid DSN: No public key provided.");     // Catch: Throwable -> L10
    L6:
        if ("https".equalsIgnoreCase(r3) == true) goto L12;
        throw new IllegalArgumentException("Invalid DSN scheme: " + r3);     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        throw new IllegalArgumentException(th);
    }
}
