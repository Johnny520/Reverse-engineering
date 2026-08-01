package org.luckypray.dexkit.query.enums;

import p000.AbstractC0431r2;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public enum AnnotationVisibilityType {
    Build,
    Runtime,
    System;

    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0431r2 abstractC0431r2) {
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
            throw new IllegalArgumentException("Unknown AnnotationVisibilityType: " + ((int) b));
        }

        private Companion() {
        }
    }
}
