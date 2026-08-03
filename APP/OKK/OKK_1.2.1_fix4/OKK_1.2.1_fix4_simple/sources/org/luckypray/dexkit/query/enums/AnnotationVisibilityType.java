package org.luckypray.dexkit.query.enums;

import p031Q0.AbstractC0304d;
import p034S.AbstractC0324d;

/* JADX INFO: loaded from: classes.dex */
public enum AnnotationVisibilityType extends Enum<AnnotationVisibilityType> {
    private static final /* synthetic */ AnnotationVisibilityType[] $VALUES = null;
    public static final AnnotationVisibilityType Build = null;
    public static final Companion Companion = null;
    public static final AnnotationVisibilityType Runtime = null;
    public static final AnnotationVisibilityType System = null;

    public static final class Companion {
        private Companion() {
        }

        public final AnnotationVisibilityType from(byte r3) {
            if (r3 != 0) goto L5;
            return AnnotationVisibilityType.Build;
        L5:
            if (r3 != 1) goto L8;
            return AnnotationVisibilityType.Runtime;
        L8:
            if (r3 != 2) goto L11;
            return AnnotationVisibilityType.System;
        L11:
            if (r3 != 3) goto L15;
            return null;
        L15:
            throw new IllegalArgumentException(AbstractC0324d.m720c("Unknown AnnotationVisibilityType: ", r3));
        }

        public /* synthetic */ Companion(AbstractC0304d r1) {
            this();
        }
    }

    private static final /* synthetic */ AnnotationVisibilityType[] $values() {
        return new AnnotationVisibilityType[]{Build, Runtime, System};
    }

    static {
        Build = new AnnotationVisibilityType("Build", 0);
        Runtime = new AnnotationVisibilityType("Runtime", 1);
        System = new AnnotationVisibilityType("System", 2);
        $VALUES = $values();
        Companion = new Companion(null);
    }

    AnnotationVisibilityType(String r1, int r2) {
    }

    public static AnnotationVisibilityType valueOf(String r1) {
        return (AnnotationVisibilityType) Enum.valueOf(AnnotationVisibilityType.class, r1);
    }

    public static AnnotationVisibilityType[] values() {
        return (AnnotationVisibilityType[]) $VALUES.clone();
    }
}
