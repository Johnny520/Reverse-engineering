package io.sentry.transport;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

/* JADX INFO: renamed from: io.sentry.transport.l */
/* JADX INFO: loaded from: classes.dex */
public final class C2017l extends Authenticator {

    /* JADX INFO: renamed from: a */
    public final String f7197a;

    /* JADX INFO: renamed from: b */
    public final String f7198b;

    public C2017l(String r1, String r2) {
        this.f7197a = r1;
        this.f7198b = r2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) goto L6;
        char[] r1 = this.f7198b.toCharArray();
        return new PasswordAuthentication(this.f7197a, r1);
    L6:
        return null;
    }
}
