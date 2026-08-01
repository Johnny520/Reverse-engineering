package org.apache.commons.compress;

import androidx.activity.AbstractC0053;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PasswordRequiredException extends CompressException {
    private static final long serialVersionUID = 1391070005491684483L;

    public PasswordRequiredException(String str) {
        super(AbstractC0053.m158("Cannot read encrypted content from ", str, " without a password."));
    }
}
