package org.luckypray.dexkit.query.enums;

import p000.AbstractC0619pl;
import p000.AbstractC0748t1;
import p000.C0921xc;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public enum AnnotationVisibilityType {
    Build,
    Runtime,
    System;

    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0619pl abstractC0619pl) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final AnnotationVisibilityType from(byte b) {
            if (b == 0) {
                return AnnotationVisibilityType.Build;
            }
            if (b == 1) {
                return AnnotationVisibilityType.Runtime;
            }
            if (b == 2) {
                return AnnotationVisibilityType.System;
            }
            if (b == 3) {
                return null;
            }
            C0921xc.m5131l(AbstractC0748t1.m4154l("Unknown AnnotationVisibilityType: ", b));
            return null;
        }

        private Companion() {
        }
    }
}
