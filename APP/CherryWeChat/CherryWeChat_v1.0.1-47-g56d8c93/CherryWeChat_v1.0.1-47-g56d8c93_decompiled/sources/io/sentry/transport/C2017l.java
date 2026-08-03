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

    public C2017l(String str, String str2) {
        this.f7197a = str;
        this.f7198b = str2;
    }

    @Override // java.net.Authenticator
    public final PasswordAuthentication getPasswordAuthentication() {
        if (getRequestorType() != Authenticator.RequestorType.PROXY) {
            return null;
        }
        return new PasswordAuthentication(this.f7197a, this.f7198b.toCharArray());
    }
}
