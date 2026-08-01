package org.luckypray.dexkit.query.base;

import java.util.Arrays;
import p000.C0938xt;
import p000.p30;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class BaseFinder extends BaseMatcher {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return Arrays.equals(serializedBytes$dexkit_android_release(), ((BaseFinder) obj).serializedBytes$dexkit_android_release());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int i = -2128831035;
        for (byte b : serializedBytes$dexkit_android_release()) {
            i = (i ^ (b & 255)) * 16777619;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String hashKey() {
        String strConcat;
        CharSequence charSequenceSubSequence;
        long j = -3750763034362895579L;
        for (byte b : serializedBytes$dexkit_android_release()) {
            j = (j ^ (((long) b) & 255)) * 1099511628211L;
        }
        p30.m3007q(16);
        int i = 1;
        if (j >= 0) {
            p30.m3007q(16);
            strConcat = Long.toString(j, 16);
            strConcat.getClass();
        } else {
            long j2 = ((j >>> 1) / 16) << 1;
            long j3 = j - (j2 * 16);
            if (j3 >= 16) {
                j3 -= 16;
                j2++;
            }
            p30.m3007q(16);
            String string = Long.toString(j2, 16);
            string.getClass();
            p30.m3007q(16);
            String string2 = Long.toString(j3, 16);
            string2.getClass();
            strConcat = string.concat(string2);
        }
        if (16 <= strConcat.length()) {
            charSequenceSubSequence = strConcat.subSequence(0, strConcat.length());
        } else {
            StringBuilder sb = new StringBuilder(16);
            int length = 16 - strConcat.length();
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((CharSequence) strConcat);
            charSequenceSubSequence = sb;
        }
        return charSequenceSubSequence.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final byte[] serializedBytes$dexkit_android_release() {
        C0938xt c0938xt = new C0938xt();
        build$dexkit_android_release(c0938xt);
        int i = c0938xt.f7411b;
        int iCapacity = c0938xt.f7410a.capacity() - c0938xt.f7411b;
        if (!c0938xt.f7416g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        c0938xt.f7410a.position(i);
        c0938xt.f7410a.get(bArr);
        return bArr;
    }
}
