package org.luckypray.dexkit.schema;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000.AbstractC0619pl;
import p000.AbstractC0748t1;
import p000.C0938xt;
import p000.c61;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FindMethod, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class FindMethod extends c61 {
    public static final Companion Companion = new Companion(null);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final FindMethod __assign(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __init(i, byteBuffer);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void __init(int i, ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        __reset(i, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String excludePackages(int i) {
        int i__offset = __offset(6);
        if (i__offset == 0) {
            return null;
        }
        return __string((i * 4) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getExcludePackagesLength() {
        int i__offset = __offset(6);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getFindFirst() {
        int i__offset = __offset(14);
        return (i__offset == 0 || this.f715bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean getIgnorePackagesCase() {
        int i__offset = __offset(8);
        return (i__offset == 0 || this.f715bb.get(i__offset + this.bb_pos) == 0) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getInClassesAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(10, 8);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getInClassesLength() {
        int i__offset = __offset(10);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer getInMethodsAsByteBuffer() {
        ByteBuffer byteBuffer__vector_as_bytebuffer = __vector_as_bytebuffer(12, 8);
        byteBuffer__vector_as_bytebuffer.getClass();
        return byteBuffer__vector_as_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getInMethodsLength() {
        int i__offset = __offset(12);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher getMatcher() {
        return matcher(new MethodMatcher());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getSearchPackagesLength() {
        int i__offset = __offset(4);
        if (i__offset != 0) {
            return __vector_len(i__offset);
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long inClasses(int i) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return 0L;
        }
        return this.f715bb.getLong((i * 8) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer inClassesInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 10, 8);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long inMethods(int i) {
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return 0L;
        }
        return this.f715bb.getLong((i * 8) + __vector(i__offset));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ByteBuffer inMethodsInByteBuffer(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        ByteBuffer byteBuffer__vector_in_bytebuffer = __vector_in_bytebuffer(byteBuffer, 12, 8);
        byteBuffer__vector_in_bytebuffer.getClass();
        return byteBuffer__vector_in_bytebuffer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final MethodMatcher matcher(MethodMatcher methodMatcher) {
        methodMatcher.getClass();
        int i__offset = __offset(16);
        if (i__offset == 0) {
            return null;
        }
        int i__indirect = __indirect(i__offset + this.bb_pos);
        ByteBuffer byteBuffer = this.f715bb;
        byteBuffer.getClass();
        return methodMatcher.__assign(i__indirect, byteBuffer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateFindFirst(boolean z) {
        int i__offset = __offset(14);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.put(i__offset + this.bb_pos, z ? (byte) 1 : (byte) 0);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateIgnorePackagesCase(boolean z) {
        int i__offset = __offset(8);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.put(i__offset + this.bb_pos, z ? (byte) 1 : (byte) 0);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateInClasses(int i, long j) {
        int i__offset = __offset(10);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putLong((i * 8) + __vector(i__offset), j);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean mutateInMethods(int i, long j) {
        int i__offset = __offset(12);
        if (i__offset == 0) {
            return false;
        }
        this.f715bb.putLong((i * 8) + __vector(i__offset), j);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String searchPackages(int i) {
        int i__offset = __offset(4);
        if (i__offset == 0) {
            return null;
        }
        return __string((i * 4) + __vector(i__offset));
    }

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FindMethod$Companion */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.schema.-FindMethod.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addExcludePackages(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(1, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addFindFirst(C0938xt c0938xt, boolean z) {
            c0938xt.getClass();
            c0938xt.m5152a(5, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addIgnorePackagesCase(C0938xt c0938xt, boolean z) {
            c0938xt.getClass();
            c0938xt.m5152a(2, z);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addInClasses(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(3, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addInMethods(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(4, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addMatcher(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(6, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void addSearchPackages(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5159h(0, i);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createExcludePackagesVector(C0938xt c0938xt, int[] iArr) {
            c0938xt.getClass();
            iArr.getClass();
            c0938xt.m5170s(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0938xt.m5164m();
                }
                c0938xt.m5158g(iArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int createFindMethod(C0938xt c0938xt, int i, int i2, boolean z, int i3, int i4, boolean z2, int i5) {
            c0938xt.getClass();
            c0938xt.m5169r(7);
            addMatcher(c0938xt, i5);
            addInMethods(c0938xt, i4);
            addInClasses(c0938xt, i3);
            addExcludePackages(c0938xt, i2);
            addSearchPackages(c0938xt, i);
            addFindFirst(c0938xt, z2);
            addIgnorePackagesCase(c0938xt, z);
            return endFindMethod(c0938xt);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000f */
        public final int createInClassesVector(C0938xt c0938xt, long[] jArr) {
            c0938xt.getClass();
            jArr.getClass();
            c0938xt.m5170s(8, jArr.length, 8);
            int length = jArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0938xt.m5164m();
                }
                c0938xt.m5157f(jArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000f */
        public final int createInMethodsVector(C0938xt c0938xt, long[] jArr) {
            c0938xt.getClass();
            jArr.getClass();
            c0938xt.m5170s(8, jArr.length, 8);
            int length = jArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0938xt.m5164m();
                }
                c0938xt.m5157f(jArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x000e */
        public final int createSearchPackagesVector(C0938xt c0938xt, int[] iArr) {
            c0938xt.getClass();
            iArr.getClass();
            c0938xt.m5170s(4, iArr.length, 4);
            int length = iArr.length;
            while (true) {
                length--;
                if (-1 >= length) {
                    return c0938xt.m5164m();
                }
                c0938xt.m5158g(iArr[length]);
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final int endFindMethod(C0938xt c0938xt) {
            c0938xt.getClass();
            return c0938xt.m5163l();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final FindMethod getRootAsFindMethod(ByteBuffer byteBuffer, FindMethod findMethod) {
            byteBuffer.getClass();
            findMethod.getClass();
            return findMethod.__assign(byteBuffer.position() + AbstractC0748t1.m4148f(byteBuffer, ByteOrder.LITTLE_ENDIAN), byteBuffer);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startExcludePackagesVector(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5170s(4, i, 4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startFindMethod(C0938xt c0938xt) {
            c0938xt.getClass();
            c0938xt.m5169r(7);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startInClassesVector(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5170s(8, i, 8);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startInMethodsVector(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5170s(8, i, 8);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void startSearchPackagesVector(C0938xt c0938xt, int i) {
            c0938xt.getClass();
            c0938xt.m5170s(4, i, 4);
        }

        private Companion() {
        }

        public final FindMethod getRootAsFindMethod(ByteBuffer byteBuffer) {
            byteBuffer.getClass();
            return getRootAsFindMethod(byteBuffer, new FindMethod());
        }

        public final void validateVersion() {
        }
    }
}
