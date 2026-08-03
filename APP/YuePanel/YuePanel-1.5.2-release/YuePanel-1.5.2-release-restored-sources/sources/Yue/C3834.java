package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۤۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C3834 {

    /* JADX INFO: renamed from: ۥ */
    public final C7215 f536;

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۧۦ$ۥ۟ */
    public final class C0269 implements InterfaceC6387 {

        /* JADX INFO: renamed from: ۥ */
        public int f537;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C4605 f538;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C4605 f7246;

        @Override // Yue.InterfaceC6387
        /* JADX INFO: renamed from: ۥ */
        public void mo891(AbstractC6381 abstractC6381, int i) {
            if (!(abstractC6381 instanceof C4605)) {
                if (abstractC6381 instanceof C7755) {
                    this.f7246.m13710(new C7755(((C7755) abstractC6381).m24631()));
                    return;
                } else if (!(abstractC6381 instanceof C4299) || !C3834.this.f536.m22601(abstractC6381.mo13701().mo13700())) {
                    this.f537++;
                    return;
                } else {
                    this.f7246.m13710(new C4299(((C4299) abstractC6381).m12417()));
                    return;
                }
            }
            C4605 c4605 = (C4605) abstractC6381;
            if (!C3834.this.f536.m22601(c4605.mo13700())) {
                if (abstractC6381 != this.f538) {
                    this.f537++;
                }
            } else {
                C3835 c3835M10607 = C3834.this.m10607(c4605);
                C4605 c46052 = c3835M10607.f539;
                this.f7246.m13710(c46052);
                this.f537 += c3835M10607.f540;
                this.f7246 = c46052;
            }
        }

        @Override // Yue.InterfaceC6387
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo892(AbstractC6381 abstractC6381, int i) {
            if ((abstractC6381 instanceof C4605) && C3834.this.f536.m22601(abstractC6381.mo13700())) {
                this.f7246 = this.f7246.mo13701();
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0269(C4605 c4605, C4605 c46052) {
            this.f537 = 0;
            this.f538 = c4605;
            this.f7246 = c46052;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۤۧۦ$ۥ۟۟, reason: contains not printable characters */
    public static class C3835 {

        /* JADX INFO: renamed from: ۥ */
        public C4605 f539;

        /* JADX INFO: renamed from: ۥ۟ */
        public int f540;

        public C3835(C4605 c4605, int i) {
            this.f539 = c4605;
            this.f540 = i;
        }
    }

    public C3834(C7215 c7215) {
        C8159.m26910(c7215);
        this.f536 = c7215;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C4483 m10605(C4483 c4483) {
        C8159.m26910(c4483);
        C4483 c4483M12981 = C4483.m12981(c4483.mo13686());
        m10606(c4483.m12987(), c4483M12981.m12987());
        c4483M12981.m13002(c4483.m13001().clone());
        return c4483M12981;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final int m10606(C4605 c4605, C4605 c46052) {
        C0269 c0269 = new C0269(c4605, c46052);
        C6385.m19940(c0269, c4605);
        return c0269.f537;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final C3835 m10607(C4605 c4605) {
        C4605 c4605Mo12985 = c4605.mo12985();
        String strM13816 = c4605.m13816();
        C3456 c3456Mo13685 = c4605Mo12985.mo13685();
        c4605Mo12985.mo13690();
        int i = 0;
        for (C3454 c3454 : c4605.mo13685()) {
            if (this.f536.m22600(strM13816, c4605, c3454)) {
                c3456Mo13685.m9207(c3454);
            } else {
                i++;
            }
        }
        c3456Mo13685.m9187(this.f536.m22599(strM13816));
        c4605Mo12985.mo13685().m9187(c3456Mo13685);
        return new C3835(c4605Mo12985, i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public boolean m10608(C4483 c4483) {
        C8159.m26910(c4483);
        return m10606(c4483.m12987(), C4483.m12981(c4483.mo13686()).m12987()) == 0 && c4483.m12998().m19903().isEmpty();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public boolean m10609(String str) {
        C4483 c4483M12981 = C4483.m12981("");
        C4483 c4483M129812 = C4483.m12981("");
        C6614 c6614M20988 = C6614.m20988(1);
        c4483M129812.m12987().m13777(0, C6617.m20999(str, c4483M129812.m12987(), "", c6614M20988));
        return m10606(c4483M129812.m12987(), c4483M12981.m12987()) == 0 && c6614M20988.isEmpty();
    }
}
