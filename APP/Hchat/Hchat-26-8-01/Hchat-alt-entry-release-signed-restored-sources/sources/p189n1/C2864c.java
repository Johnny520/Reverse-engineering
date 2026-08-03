package p189n1;

import android.os.Build;
import android.view.View;
import p091g3.AbstractC1329q;

/* JADX INFO: renamed from: n1.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2864c implements InterfaceC2862a {

    /* JADX INFO: renamed from: a */
    public final View f9258a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2864c(View view) {
        this.f9258a = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:56:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x006d  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6283a(int i9) {
        int i10;
        int i11 = 0;
        if (i9 == 16) {
            i10 = 16;
        } else if (i9 == 6) {
            i10 = 6;
        } else if (i9 == 13) {
            i10 = 13;
        } else {
            i10 = 23;
            if (i9 != 23) {
                i10 = 3;
                if (i9 != 3) {
                    if (i9 == 0) {
                        i10 = 0;
                    } else if (i9 == 17) {
                        i10 = 17;
                    } else {
                        i10 = 27;
                        if (i9 != 27) {
                            i10 = 26;
                            if (i9 != 26) {
                                i10 = 9;
                                if (i9 != 9) {
                                    i10 = 22;
                                    if (i9 != 22) {
                                        i10 = 21;
                                        if (i9 != 21) {
                                            i10 = i9 == 1 ? 1 : -1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        int i12 = AbstractC1329q.f4395a;
        if (i10 == -1) {
            i11 = -1;
        } else {
            int i13 = Build.VERSION.SDK_INT;
            if (i13 < 34) {
                switch (i10) {
                    case 21:
                    case 23:
                    case 26:
                        i10 = 6;
                        break;
                    case 22:
                    case 24:
                    case 27:
                        i10 = 4;
                        break;
                    case 25:
                        i10 = 0;
                        break;
                }
            }
            if (i13 >= 30) {
                i11 = i10;
            } else if (i10 == 12) {
                i11 = 1;
            } else if (i10 == 13) {
                i11 = 6;
            } else if (i10 != 16) {
                if (i10 != 17) {
                }
            }
        }
        if (i11 == -1) {
            return;
        }
        this.f9258a.performHapticFeedback(i11);
    }
}
