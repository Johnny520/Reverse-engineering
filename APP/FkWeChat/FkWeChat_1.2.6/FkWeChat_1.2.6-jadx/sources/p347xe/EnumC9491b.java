package p347xe;

import ae.C0306e;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: xe.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC9491b {
    Build,
    Runtime,
    System;


    /* JADX INFO: renamed from: q */
    public static final a f32239q = new a(null);

    /* JADX INFO: renamed from: xe.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final EnumC9491b m36986a(byte b10) {
            if (b10 == 0) {
                return EnumC9491b.Build;
            }
            if (b10 == 1) {
                return EnumC9491b.Runtime;
            }
            if (b10 == 2) {
                return EnumC9491b.System;
            }
            if (b10 == 3) {
                return null;
            }
            C0306e.m922a("Unknown AnnotationVisibilityType: ", b10);
            return null;
        }

        public a() {
        }
    }
}
