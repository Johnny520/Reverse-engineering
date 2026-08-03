package org.luckypray.dexkit.query.enums;

import Yue.C4335;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;

/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6211(m2698d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, m2699d2 = {"Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "", "(Ljava/lang/String;I)V", "Build", "Runtime", "System", "Companion", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
public enum AnnotationVisibilityType {
    Build,
    Runtime,
    System;


    @InterfaceC6399
    public static final Companion Companion = new Companion(null);

    @InterfaceC6211(m2698d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m2699d2 = {"Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType$Companion;", "", "()V", "from", "Lorg/luckypray/dexkit/query/enums/AnnotationVisibilityType;", "retentionPolicy", "", "dexkit-android_release"}, m2700k = 1, m2701mv = {1, 5, 1}, m2703xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: org.luckypray.dexkit.query.enums.AnnotationVisibilityType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(C4335 c4335) {
            this();
        }

        @InterfaceC6489
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

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }
}
