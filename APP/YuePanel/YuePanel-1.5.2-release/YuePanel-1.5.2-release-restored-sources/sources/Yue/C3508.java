package Yue;

import Yue.C7583;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۤۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3508 extends C5279 {

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C7583.EnumC7585 f5885;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f5886;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C3507 f5887;

    /* JADX INFO: renamed from: Yue.ۥ۟ۢۤۨ$ۥ */
    public static /* synthetic */ class C0163 {

        /* JADX INFO: renamed from: ۥ */
        public static final /* synthetic */ int[] f344;

        static {
            int[] iArr = new int[C7583.EnumC7585.values().length];
            f344 = iArr;
            try {
                iArr[C7583.EnumC7585.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f344[C7583.EnumC7585.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f344[C7583.EnumC7585.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f344[C7583.EnumC7585.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f344[C7583.EnumC7585.TOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f344[C7583.EnumC7585.BOTTOM.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C3508(C7583 c7583) {
        super(c7583, C7583.EnumC7586.BARRIER);
    }

    @Override // Yue.C5279
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo264() {
        mo9354();
        int i = 0;
        switch (C0163.f344[this.f5885.ordinal()]) {
            case 3:
            case 4:
                i = 1;
                break;
            case 5:
                i = 2;
                break;
            case 6:
                i = 3;
                break;
        }
        this.f5887.m9352(i);
        this.f5887.m9353(this.f5886);
    }

    @Override // Yue.C5279
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C5281 mo9354() {
        if (this.f5887 == null) {
            this.f5887 = new C3507();
        }
        return this.f5887;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m9355(int i) {
        this.f5886 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m9356(Object obj) {
        m9355(this.f1384.m23732(obj));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m9357(C7583.EnumC7585 enumC7585) {
        this.f5885 = enumC7585;
    }
}
