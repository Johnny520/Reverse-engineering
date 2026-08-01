package org.luckypray.dexkit.query.base;

import java.util.Arrays;
import p000.C0038c5;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
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
        int i = 1;
        if (j >= 0) {
            strConcat = Long.toString(j, 16);
            strConcat.getClass();
        } else {
            long j2 = ((j >>> 1) / 16) << 1;
            long j3 = j - (j2 * 16);
            if (j3 >= 16) {
                j3 -= 16;
                j2++;
            }
            String string = Long.toString(j2, 16);
            string.getClass();
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
        C0038c5 c0038c5 = new C0038c5();
        build$dexkit_android_release(c0038c5);
        int i = c0038c5.f87b;
        int iCapacity = c0038c5.f86a.capacity() - c0038c5.f87b;
        if (!c0038c5.f92g) {
            throw new AssertionError("FlatBuffers: you can only access the serialized buffer after it has been finished by FlatBufferBuilder.finish().");
        }
        byte[] bArr = new byte[iCapacity];
        c0038c5.f86a.position(i);
        c0038c5.f86a.get(bArr);
        return bArr;
    }
}
