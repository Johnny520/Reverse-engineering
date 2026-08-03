package org.luckypray.dexkit.schema;

import com.google.flatbuffers.AbstractC0735d;
import com.google.flatbuffers.C0733b;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p031Q0.AbstractC0304d;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParametersMatcher */
/* JADX INFO: loaded from: classes.dex */
public final class ParametersMatcher extends AbstractC0735d {
    public static final Companion Companion = null;

    /* JADX INFO: renamed from: org.luckypray.dexkit.schema.-ParametersMatcher$Companion */
    public static final class Companion {
        private Companion() {
        }

        public final void addParameterCount(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(1, r3);
        }

        public final void addParameters(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1925h(0, r3);
        }

        public final int createParametersMatcher(C0733b r2, int r3, int r4) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
            addParameterCount(r2, r4);
            addParameters(r2, r3);
            return endParametersMatcher(r2);
        }

        public final int createParametersVector(C0733b r3, int[] r4) {
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

        public final int endParametersMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            return r2.m1929l();
        }

        public final ParametersMatcher getRootAsParametersMatcher(ByteBuffer r2) {
            AbstractC0307g.m703e(r2, "_bb");
            return getRootAsParametersMatcher(r2, new ParametersMatcher());
        }

        public final void startParametersMatcher(C0733b r2) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1936s(2);
        }

        public final void startParametersVector(C0733b r2, int r3) {
            AbstractC0307g.m703e(r2, "builder");
            r2.m1937t(4, r3, 4);
        }

        public final void validateVersion() {
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }

        public final ParametersMatcher getRootAsParametersMatcher(ByteBuffer r3, ParametersMatcher r4) {
            AbstractC0307g.m703e(r3, "_bb");
            AbstractC0307g.m703e(r4, "obj");
            int r02 = AbstractC0324d.m719b(r3, ByteOrder.LITTLE_ENDIAN);
            return r4.__assign(r3.position() + r02, r3);
        }
    }

    static {
        Companion = new Companion(null);
    }

    public ParametersMatcher() {
    }

    public final ParametersMatcher __assign(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __init(r2, r3);
        return this;
    }

    public final void __init(int r2, ByteBuffer r3) {
        AbstractC0307g.m703e(r3, "_bb");
        __reset(r2, r3);
    }

    public final IntRange getParameterCount() {
        return parameterCount(new IntRange());
    }

    public final int getParametersLength() {
        int r02 = __offset(4);
        if (r02 != 0) goto L7;
        return 0;
    L7:
        return __vector_len(r02);
    }

    public final IntRange parameterCount(IntRange r4) {
        AbstractC0307g.m703e(r4, "obj");
        int r02 = __offset(6);
        if (r02 == 0) goto L5;
        int r03 = __indirect(r02 + this.bb_pos);
        ByteBuffer r1 = this.f2573bb;
        AbstractC0307g.m702d(r1, "bb");
        return r4.__assign(r03, r1);
    L5:
        return null;
    }

    public final ParameterMatcher parameters(int r2) {
        return parameters(new ParameterMatcher(), r2);
    }

    public final ParameterMatcher parameters(ParameterMatcher r3, int r4) {
        AbstractC0307g.m703e(r3, "obj");
        int r1 = __offset(4);
        if (r1 == 0) goto L5;
        int r42 = r4 * 4;
        int r43 = __indirect(r42 + __vector(r1));
        ByteBuffer r02 = this.f2573bb;
        AbstractC0307g.m702d(r02, "bb");
        return r3.__assign(r43, r02);
    L5:
        return null;
    }
}
