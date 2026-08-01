package org.apache.commons.compress;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PasswordRequiredException extends CompressException {
    private static final long serialVersionUID = 1391070005491684483L;

    public PasswordRequiredException(String str) {
        super(AbstractC0053.m156("Cannot read encrypted content from ", str, " without a password."));
    }
}
