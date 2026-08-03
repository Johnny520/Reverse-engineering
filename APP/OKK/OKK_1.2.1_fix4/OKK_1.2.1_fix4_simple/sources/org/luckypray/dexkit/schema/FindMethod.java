package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FindMethod */
/* JADX INFO: loaded from: classes.dex */
public final class FindMethod extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-FindMethod$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addExcludePackages(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(1, r3);
        }

        public final void addFindFirst(C0733b r2, boolean r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1918a(5, r3);
        }

        public final void addIgnorePackagesCase(C0733b r2, boolean r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1918a(2, r3);
        }

        public final void addInClasses(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(3, r3);
        }

        public final void addInMethods(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(4, r3);
        }

        public final void addMatcher(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(6, r3);
        }

        public final void addSearchPackages(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final int createExcludePackagesVector(C0733b r3, int[] r4) {
            AbstractC0307g.m703e(r3, "builder");
            AbstractC0307g.m703e(r4, "data");
            r3.m1937t(4, r4.length, 4);
            int r02 = r4.length;
        L3:
            r02 = r02 - 1;
            if ((-1) >= r02) goto L7;
            r3.m1924g(r4[r02]);
            goto L3
        L7:
            return r3.m1930m();
        }

        public final int createFindMethod(C0733b r2, int r3, int r4, boolean r5, int r6, int r7, boolean r8, int r9) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(7);
            addMatcher(r2, r9);
            addInMethods(r2, r7);
            addInClasses(r2, r6);
            addExcludePackages(r2, r4);
            addSearchPackages(r2, r3);
            addFindFirst(r2, r8);
            addIgnorePackagesCase(r2, r5);
            return endFindMethod(r2);
        }

        public final int createInClassesVector(C0733b r4, long[] r5) {
            AbstractC0307g.m703e(r4, "builder");
            AbstractC0307g.m703e(r5, "data");
            r4.m1937t(8, r5.length, 8);
            int r02 = r5.length;
        L3:
            r02 = r02 - 1;
            if ((-1) >= r02) goto L7;
            r4.m1923f(r5[r02]);
            goto L3
        L7:
            return r4.m1930m();
        }

        public final int createInMethodsVector(C0733b r4, long[] r5) {
            AbstractC0307g.m703e(r4, "builder");
            AbstractC0307g.m703e(r5, "data");
            r4.m1937t(8, r5.length, 8);
            int r02 = r5.length;
        L3:
            r02 = r02 - 1;
            if ((-1) >= r02) goto L7;
            r4.m1923f(r5[r02]);
            goto L3
        L7:
            return r4.m1930m();
        }

        public final int createSearchPackagesVector(C0733b r3, int[] r4) {
            AbstractC0307g.m703e(r3, "builder");
            AbstractC0307g.m703e(r4, "data");
            r3.m1937t(4, r4.length, 4);
            int r02 = r4.length;
        L3:
            r02 = r02 - 1;
            if ((-1) >= r02) goto L7;
            r3.m1924g(r4[r02]);
            goto L3
        L7:
            return r3.m1930m();
        }

        public final int endFindMethod(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final FindMethod getRootAsFindMethod(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsFindMethod(r2, new FindMethod());
        }

        public final void startExcludePackagesVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void startFindMethod(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(7);
        }

        public final void startInClassesVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(8, r3, 8);
        }

        public final void startInMethodsVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(8, r3, 8);
        }

        public final void startSearchPackagesVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final FindMethod getRootAsFindMethod(ByteBuffer r3, FindMethod r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public FindMethod() {
    }

    public final FindMethod __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final String excludePackages(int r2) {
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        int r22 = r2 * 4;
        return __string(r22 + __vector(r02));
    L5:
        return null;
    }

    public final int getExcludePackagesLength() {
        int r02 = __offset(6);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final boolean getFindFirst() {
        int r02 = __offset(14);
        if (r02 != 0) goto L5;
        return false;
    L5:
        if (((byte) 0) == this.f2573bb.get(r02 + this.bb_pos)) goto L9;
        return true;
    L9:
        return false;
    }

    public final boolean getIgnorePackagesCase() {
        int r02 = __offset(8);
        if (r02 != 0) goto L5;
        return false;
    L5:
        if (((byte) 0) == this.f2573bb.get(r02 + this.bb_pos)) goto L9;
        return true;
    L9:
        return false;
    }

    public final ByteBuffer getInClassesAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(10, 8);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(10, 8)");
        return r02;
    }

    public final int getInClassesLength() {
        int r02 = __offset(10);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final ByteBuffer getInMethodsAsByteBuffer() {
        ByteBuffer r02 = __vector_as_bytebuffer(12, 8);
        AbstractC0307g.m702d(r02, "__vector_as_bytebuffer(12, 8)");
        return r02;
    }

    public final int getInMethodsLength() {
        int r02 = __offset(12);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final MethodMatcher getMatcher() {
        return matcher(new MethodMatcher());
    }

    public final int getSearchPackagesLength() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final long inClasses(int r3) {
        int r02 = __offset(10);
        if (r02 == 0) goto L5;
        int r32 = r3 * 8;
        return this.f2573bb.getLong(r32 + __vector(r02));
    L5:
        return 0;
    }

    public final ByteBuffer inClassesInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 10, 8);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 10, 8)");
        return r32;
    }

    public final long inMethods(int r3) {
        int r02 = __offset(12);
        if (r02 == 0) goto L5;
        int r32 = r3 * 8;
        return this.f2573bb.getLong(r32 + __vector(r02));
    L5:
        return 0;
    }

    public final ByteBuffer inMethodsInByteBuffer(ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        ByteBuffer r32 = __vector_in_bytebuffer(r3, 12, 8);
        AbstractC0307g.m702d(r32, "__vector_in_bytebuffer(_bb, 12, 8)");
        return r32;
    }

    public final MethodMatcher matcher(MethodMatcher r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(16);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final boolean mutateFindFirst(boolean r4) {
        int r02 = __offset(14);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4 ? 1 : 0);
        return true;
    L5:
        return false;
    }

    public final boolean mutateIgnorePackagesCase(boolean r4) {
        int r02 = __offset(8);
        if (r02 == 0) goto L5;
        this.f2573bb.put(r02 + this.bb_pos, r4 ? 1 : 0);
        return true;
    L5:
        return false;
    }

    public final boolean mutateInClasses(int r3, long r4) {
        int r02 = __offset(10);
        if (r02 == 0) goto L5;
        int r32 = r3 * 8;
        this.f2573bb.putLong(r32 + __vector(r02), r4);
        return true;
    L5:
        return false;
    }

    public final boolean mutateInMethods(int r3, long r4) {
        int r02 = __offset(12);
        if (r02 == 0) goto L5;
        int r32 = r3 * 8;
        this.f2573bb.putLong(r32 + __vector(r02), r4);
        return true;
    L5:
        return false;
    }

    public final String searchPackages(int r3) {
        int r1 = __offset(4);
        if (r1 == 0) goto L5;
        int r32 = r3 * 4;
        return __string(r32 + __vector(r1));
    L5:
        return null;
    }
}
