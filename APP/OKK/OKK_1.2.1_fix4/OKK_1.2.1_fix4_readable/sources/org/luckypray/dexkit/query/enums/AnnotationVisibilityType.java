package org.luckypray.dexkit.query.enums;

import p031Q0.AbstractC0304d;
import p034S.AbstractC0324d;

/* JADX INFO: loaded from: classes.dex */
public enum AnnotationVisibilityType {
    Build,
    Runtime,
    System;

    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public final AnnotationVisibilityType from(byte b2) {
            if (b2 == 0) {
                return AnnotationVisibilityType.Build;
            }
            if (b2 == 1) {
                return AnnotationVisibilityType.Runtime;
            }
            if (b2 == 2) {
                return AnnotationVisibilityType.System;
            }
            if (b2 == 3) {
                return null;
            }
            throw new IllegalArgumentException(AbstractC0324d.m720c("Unknown AnnotationVisibilityType: ", b2));
        }

        public /* synthetic */ Companion(AbstractC0304d abstractC0304d) {
            this();
        }
    }
}
