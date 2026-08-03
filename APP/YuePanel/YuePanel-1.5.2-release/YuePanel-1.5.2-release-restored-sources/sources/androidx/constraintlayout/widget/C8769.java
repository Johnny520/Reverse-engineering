package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: renamed from: androidx.constraintlayout.widget.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C8769 {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f26645 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f26646 = 2;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f26647 = 3;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f26648 = 4;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f26649 = 5;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f26650 = 6;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f26651 = 7;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final int f26652 = -1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f26653 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f26654 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final int f26655 = -2;

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final int f26656 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final int f26657 = 0;

    /* JADX INFO: renamed from: ۥ */
    public ConstraintLayout.C1641 f3700;

    /* JADX INFO: renamed from: ۥ۟ */
    public View f3701;

    public C8769(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.C1641)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f3700 = (ConstraintLayout.C1641) layoutParams;
        this.f3701 = view;
    }

    /* JADX INFO: renamed from: ۥ */
    public C8769 m4714(int i, int i2) {
        m29310(1, i, i == 0 ? 1 : 2, 0);
        m29310(2, i2, i2 == 0 ? 2 : 1, 0);
        if (i != 0) {
            new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i)).m29310(2, this.f3701.getId(), 1, 0);
        }
        if (i2 != 0) {
            new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i2)).m29310(1, this.f3701.getId(), 2, 0);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public C8769 m4715(int i, int i2) {
        m29310(6, i, i == 0 ? 6 : 7, 0);
        m29310(7, i2, i2 == 0 ? 7 : 6, 0);
        if (i != 0) {
            new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i)).m29310(7, this.f3701.getId(), 6, 0);
        }
        if (i2 != 0) {
            new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i2)).m29310(6, this.f3701.getId(), 7, 0);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C8769 m29300(int i, int i2) {
        m29310(3, i, i == 0 ? 3 : 4, 0);
        m29310(4, i2, i2 == 0 ? 4 : 3, 0);
        if (i != 0) {
            new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i)).m29310(4, this.f3701.getId(), 3, 0);
        }
        if (i2 != 0) {
            new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i2)).m29310(3, this.f3701.getId(), 4, 0);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C8769 m29301(float f) {
        this.f3701.setAlpha(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m29302() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C8769 m29303(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        if (i3 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i2 == 1 || i2 == 2) {
            m29310(1, i, i2, i3);
            m29310(2, i4, i5, i6);
            this.f3700.f26500 = f;
        } else if (i2 == 6 || i2 == 7) {
            m29310(6, i, i2, i3);
            m29310(7, i4, i5, i6);
            this.f3700.f26500 = f;
        } else {
            m29310(3, i, i2, i3);
            m29310(4, i4, i5, i6);
            this.f3700.f26501 = f;
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public C8769 m29304(int i) {
        if (i == 0) {
            m29303(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            m29303(i, 2, 0, i, 1, 0, 0.5f);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C8769 m29305(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        m29310(1, i, i2, i3);
        m29310(2, i4, i5, i6);
        this.f3700.f26500 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C8769 m29306(int i) {
        if (i == 0) {
            m29303(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            m29303(i, 7, 0, i, 6, 0, 0.5f);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public C8769 m29307(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        m29310(6, i, i2, i3);
        m29310(7, i4, i5, i6);
        this.f3700.f26500 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C8769 m29308(int i) {
        if (i == 0) {
            m29303(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            m29303(i, 4, 0, i, 3, 0, 0.5f);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public C8769 m29309(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        m29310(3, i, i2, i3);
        m29310(4, i4, i5, i6);
        this.f3700.f26501 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public C8769 m29310(int i, int i2, int i3, int i4) {
        switch (i) {
            case 1:
                if (i3 == 1) {
                    ConstraintLayout.C1641 c1641 = this.f3700;
                    c1641.f26478 = i2;
                    c1641.f26479 = -1;
                } else {
                    if (i3 != 2) {
                        throw new IllegalArgumentException("Left to " + m29334(i3) + " undefined");
                    }
                    ConstraintLayout.C1641 c16412 = this.f3700;
                    c16412.f26479 = i2;
                    c16412.f26478 = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f3700).leftMargin = i4;
                return this;
            case 2:
                if (i3 == 1) {
                    ConstraintLayout.C1641 c16413 = this.f3700;
                    c16413.f26480 = i2;
                    c16413.f26481 = -1;
                } else {
                    if (i3 != 2) {
                        throw new IllegalArgumentException("right to " + m29334(i3) + " undefined");
                    }
                    ConstraintLayout.C1641 c16414 = this.f3700;
                    c16414.f26481 = i2;
                    c16414.f26480 = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f3700).rightMargin = i4;
                return this;
            case 3:
                if (i3 == 3) {
                    ConstraintLayout.C1641 c16415 = this.f3700;
                    c16415.f26482 = i2;
                    c16415.f26483 = -1;
                    c16415.f26486 = -1;
                } else {
                    if (i3 != 4) {
                        throw new IllegalArgumentException("right to " + m29334(i3) + " undefined");
                    }
                    ConstraintLayout.C1641 c16416 = this.f3700;
                    c16416.f26483 = i2;
                    c16416.f26482 = -1;
                    c16416.f26486 = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f3700).topMargin = i4;
                return this;
            case 4:
                if (i3 == 4) {
                    ConstraintLayout.C1641 c16417 = this.f3700;
                    c16417.f26485 = i2;
                    c16417.f26484 = -1;
                    c16417.f26486 = -1;
                } else {
                    if (i3 != 3) {
                        throw new IllegalArgumentException("right to " + m29334(i3) + " undefined");
                    }
                    ConstraintLayout.C1641 c16418 = this.f3700;
                    c16418.f26484 = i2;
                    c16418.f26485 = -1;
                    c16418.f26486 = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f3700).bottomMargin = i4;
                return this;
            case 5:
                if (i3 != 5) {
                    throw new IllegalArgumentException("right to " + m29334(i3) + " undefined");
                }
                ConstraintLayout.C1641 c16419 = this.f3700;
                c16419.f26486 = i2;
                c16419.f26485 = -1;
                c16419.f26484 = -1;
                c16419.f26482 = -1;
                c16419.f26483 = -1;
                return this;
            case 6:
                if (i3 == 6) {
                    ConstraintLayout.C1641 c164110 = this.f3700;
                    c164110.f26491 = i2;
                    c164110.f26490 = -1;
                } else {
                    if (i3 != 7) {
                        throw new IllegalArgumentException("right to " + m29334(i3) + " undefined");
                    }
                    ConstraintLayout.C1641 c164111 = this.f3700;
                    c164111.f26490 = i2;
                    c164111.f26491 = -1;
                }
                this.f3700.setMarginStart(i4);
                return this;
            case 7:
                if (i3 == 7) {
                    ConstraintLayout.C1641 c164112 = this.f3700;
                    c164112.f26493 = i2;
                    c164112.f26492 = -1;
                } else {
                    if (i3 != 6) {
                        throw new IllegalArgumentException("right to " + m29334(i3) + " undefined");
                    }
                    ConstraintLayout.C1641 c164113 = this.f3700;
                    c164113.f26492 = i2;
                    c164113.f26493 = -1;
                }
                this.f3700.setMarginEnd(i4);
                return this;
            default:
                throw new IllegalArgumentException(m29334(i) + " to " + m29334(i3) + " unknown");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public C8769 m29311(int i) {
        this.f3700.f26510 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public C8769 m29312(int i) {
        this.f3700.f26509 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public C8769 m29313(int i) {
        ((ViewGroup.MarginLayoutParams) this.f3700).height = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C8769 m29314(int i) {
        this.f3700.f26514 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public C8769 m29315(int i) {
        this.f3700.f26513 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C8769 m29316(int i) {
        this.f3700.f26512 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C8769 m29317(int i) {
        this.f3700.f26511 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C8769 m29318(int i) {
        ((ViewGroup.MarginLayoutParams) this.f3700).width = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public C8769 m29319(String str) {
        this.f3700.f26502 = str;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public C8769 m29320(float f) {
        this.f3701.setElevation(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C8769 m29321(int i, int i2) {
        switch (i) {
            case 1:
                this.f3700.f26494 = i2;
                return this;
            case 2:
                this.f3700.f26496 = i2;
                return this;
            case 3:
                this.f3700.f26495 = i2;
                return this;
            case 4:
                this.f3700.f26497 = i2;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f3700.f26498 = i2;
                return this;
            case 7:
                this.f3700.f26499 = i2;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public C8769 m29322(float f) {
        this.f3700.f26500 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public C8769 m29323(int i) {
        this.f3700.f26507 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C8769 m29324(float f) {
        this.f3700.f26505 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public C8769 m29325(int i, int i2) {
        switch (i) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f3700).leftMargin = i2;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f3700).rightMargin = i2;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f3700).topMargin = i2;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f3700).bottomMargin = i2;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f3700.setMarginStart(i2);
                return this;
            case 7:
                this.f3700.setMarginEnd(i2);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public C8769 m29326(int i) {
        switch (i) {
            case 1:
                ConstraintLayout.C1641 c1641 = this.f3700;
                c1641.f26479 = -1;
                c1641.f26478 = -1;
                ((ViewGroup.MarginLayoutParams) c1641).leftMargin = -1;
                c1641.f26494 = -1;
                return this;
            case 2:
                ConstraintLayout.C1641 c16412 = this.f3700;
                c16412.f26481 = -1;
                c16412.f26480 = -1;
                ((ViewGroup.MarginLayoutParams) c16412).rightMargin = -1;
                c16412.f26496 = -1;
                return this;
            case 3:
                ConstraintLayout.C1641 c16413 = this.f3700;
                c16413.f26483 = -1;
                c16413.f26482 = -1;
                ((ViewGroup.MarginLayoutParams) c16413).topMargin = -1;
                c16413.f26495 = -1;
                return this;
            case 4:
                ConstraintLayout.C1641 c16414 = this.f3700;
                c16414.f26484 = -1;
                c16414.f26485 = -1;
                ((ViewGroup.MarginLayoutParams) c16414).bottomMargin = -1;
                c16414.f26497 = -1;
                return this;
            case 5:
                this.f3700.f26486 = -1;
                return this;
            case 6:
                ConstraintLayout.C1641 c16415 = this.f3700;
                c16415.f26490 = -1;
                c16415.f26491 = -1;
                c16415.setMarginStart(-1);
                this.f3700.f26498 = -1;
                return this;
            case 7:
                ConstraintLayout.C1641 c16416 = this.f3700;
                c16416.f26492 = -1;
                c16416.f26493 = -1;
                c16416.setMarginEnd(-1);
                this.f3700.f26499 = -1;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public C8769 m29327() {
        ConstraintLayout.C1641 c1641 = this.f3700;
        int i = c1641.f26479;
        int i2 = c1641.f26480;
        if (i == -1 && i2 == -1) {
            int i3 = c1641.f26490;
            int i4 = c1641.f26492;
            if (i3 != -1 || i4 != -1) {
                C8769 c8769 = new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i3));
                C8769 c87692 = new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i4));
                ConstraintLayout.C1641 c16412 = this.f3700;
                if (i3 != -1 && i4 != -1) {
                    c8769.m29310(7, i4, 6, 0);
                    c87692.m29310(6, i, 7, 0);
                } else if (i != -1 || i4 != -1) {
                    int i5 = c16412.f26481;
                    if (i5 != -1) {
                        c8769.m29310(7, i5, 7, 0);
                    } else {
                        int i6 = c16412.f26478;
                        if (i6 != -1) {
                            c87692.m29310(6, i6, 6, 0);
                        }
                    }
                }
            }
            m29326(6);
            m29326(7);
        } else {
            C8769 c87693 = new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i));
            C8769 c87694 = new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i2));
            ConstraintLayout.C1641 c16413 = this.f3700;
            if (i != -1 && i2 != -1) {
                c87693.m29310(2, i2, 1, 0);
                c87694.m29310(1, i, 2, 0);
            } else if (i != -1 || i2 != -1) {
                int i7 = c16413.f26481;
                if (i7 != -1) {
                    c87693.m29310(2, i7, 2, 0);
                } else {
                    int i8 = c16413.f26478;
                    if (i8 != -1) {
                        c87694.m29310(1, i8, 1, 0);
                    }
                }
            }
            m29326(1);
            m29326(2);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C8769 m29328() {
        ConstraintLayout.C1641 c1641 = this.f3700;
        int i = c1641.f26483;
        int i2 = c1641.f26484;
        if (i != -1 || i2 != -1) {
            C8769 c8769 = new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i));
            C8769 c87692 = new C8769(((ViewGroup) this.f3701.getParent()).findViewById(i2));
            ConstraintLayout.C1641 c16412 = this.f3700;
            if (i != -1 && i2 != -1) {
                c8769.m29310(4, i2, 3, 0);
                c87692.m29310(3, i, 4, 0);
            } else if (i != -1 || i2 != -1) {
                int i3 = c16412.f26485;
                if (i3 != -1) {
                    c8769.m29310(4, i3, 4, 0);
                } else {
                    int i4 = c16412.f26482;
                    if (i4 != -1) {
                        c87692.m29310(3, i4, 3, 0);
                    }
                }
            }
        }
        m29326(3);
        m29326(4);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public C8769 m29329(float f) {
        this.f3701.setRotation(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public C8769 m29330(float f) {
        this.f3701.setRotationX(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public C8769 m29331(float f) {
        this.f3701.setRotationY(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public C8769 m29332(float f) {
        this.f3701.setScaleY(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public C8769 m29333(float f) {
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final String m29334(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public C8769 m29335(float f, float f2) {
        this.f3701.setPivotX(f);
        this.f3701.setPivotY(f2);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public C8769 m29336(float f) {
        this.f3701.setPivotX(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public C8769 m29337(float f) {
        this.f3701.setPivotY(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public C8769 m29338(float f, float f2) {
        this.f3701.setTranslationX(f);
        this.f3701.setTranslationY(f2);
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public C8769 m29339(float f) {
        this.f3701.setTranslationX(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public C8769 m29340(float f) {
        this.f3701.setTranslationY(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public C8769 m29341(float f) {
        this.f3701.setTranslationZ(f);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public C8769 m29342(float f) {
        this.f3700.f26501 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public C8769 m29343(int i) {
        this.f3700.f26508 = i;
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public C8769 m29344(float f) {
        this.f3700.f26506 = f;
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public C8769 m29345(int i) {
        this.f3701.setVisibility(i);
        return this;
    }
}
