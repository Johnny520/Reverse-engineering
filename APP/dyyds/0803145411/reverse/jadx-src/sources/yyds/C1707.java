package yyds;

import java.io.IOException;

/* JADX INFO: renamed from: yyds.ᛸᛱᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1707 extends AbstractC0850 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final AutoCloseable f8646;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final /* synthetic */ int f8647 = 1;

    public C1707(C0574 c0574, String str) {
        super(c0574, str);
        this.f8646 = new C0106(c0574.f2765.compileStatement(str));
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.f8647;
        AutoCloseable autoCloseable = this.f8646;
        switch (i) {
            case 0:
                ((C2643) autoCloseable).close();
                break;
            default:
                ((C0106) autoCloseable).close();
                this.f3912 = true;
                break;
        }
    }

    @Override // yyds.InterfaceC1212
    public final int getColumnCount() {
        switch (this.f8647) {
            case 0:
                return ((C2643) this.f8646).getColumnCount();
            default:
                m1931();
                return 0;
        }
    }

    @Override // yyds.InterfaceC1212
    public final String getColumnName(int i) {
        switch (this.f8647) {
            case 0:
                return ((C2643) this.f8646).getColumnName(i);
            default:
                m1931();
                AbstractC2328.m4346(21, "no row");
                throw null;
        }
    }

    @Override // yyds.InterfaceC1212
    public final long getLong(int i) {
        switch (this.f8647) {
            case 0:
                return ((C2643) this.f8646).getLong(i);
            default:
                m1931();
                AbstractC2328.m4346(21, "no row");
                throw null;
        }
    }

    @Override // yyds.InterfaceC1212
    public final boolean isNull(int i) {
        switch (this.f8647) {
            case 0:
                return ((C2643) this.f8646).isNull(i);
            default:
                m1931();
                AbstractC2328.m4346(21, "no row");
                throw null;
        }
    }

    @Override // yyds.AbstractC0850, yyds.InterfaceC1212
    public void reset() {
        switch (this.f8647) {
            case 0:
                ((C2643) this.f8646).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final String mo430(int i) {
        switch (this.f8647) {
            case 0:
                return ((C2643) this.f8646).mo430(i);
            default:
                m1931();
                AbstractC2328.m4346(21, "no row");
                throw null;
        }
    }

    @Override // yyds.AbstractC0850, yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo431() {
        int i = this.f8647;
        AutoCloseable autoCloseable = this.f8646;
        switch (i) {
            case 0:
                ((C2643) autoCloseable).mo431();
                break;
            default:
                m1931();
                ((C0106) autoCloseable).mo3149();
                break;
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo432(int i) {
        int i2 = this.f8647;
        AutoCloseable autoCloseable = this.f8646;
        switch (i2) {
            case 0:
                ((C2643) autoCloseable).mo432(i);
                break;
            default:
                m1931();
                ((C0106) autoCloseable).mo3150(i);
                break;
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛵᲀᛵᛸ */
    public final boolean mo433() {
        int i = this.f8647;
        AutoCloseable autoCloseable = this.f8646;
        switch (i) {
            case 0:
                C2643 c2643 = (C2643) autoCloseable;
                boolean zMo433 = c2643.mo433();
                boolean zEqualsIgnoreCase = c2643.mo430(0).equalsIgnoreCase("wal");
                C0574 c0574 = this.f3913;
                if (zEqualsIgnoreCase) {
                    c0574.f2765.enableWriteAheadLogging();
                } else {
                    c0574.f2765.disableWriteAheadLogging();
                }
                return zMo433;
            default:
                m1931();
                ((C0106) autoCloseable).f749.execute();
                return false;
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛶᲈᛴᲈ */
    public boolean mo2234() {
        switch (this.f8647) {
            case 0:
                return ((C2643) this.f8646).mo2234();
            default:
                return super.mo2234();
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public final void mo434(int i, String str) {
        int i2 = this.f8647;
        AutoCloseable autoCloseable = this.f8646;
        switch (i2) {
            case 0:
                ((C2643) autoCloseable).mo434(i, str);
                break;
            default:
                m1931();
                ((C0106) autoCloseable).mo3148(i, str);
                break;
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo435(int i, long j) {
        int i2 = this.f8647;
        AutoCloseable autoCloseable = this.f8646;
        switch (i2) {
            case 0:
                ((C2643) autoCloseable).mo435(i, j);
                break;
            default:
                m1931();
                ((C0106) autoCloseable).mo3152(i, j);
                break;
        }
    }

    public C1707(C0574 c0574, String str, C2643 c2643) {
        super(c0574, str);
        this.f8646 = c2643;
    }
}
