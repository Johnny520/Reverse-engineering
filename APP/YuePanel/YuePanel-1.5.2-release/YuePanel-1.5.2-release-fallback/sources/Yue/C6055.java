package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C6055 extends android.view.ActionMode {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final android.content.Context f21888;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final Yue.AbstractC0181 f21889;

    /* JADX INFO: renamed from: Yue.ۥۢ۠ۥ۠$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
    public static class C6056 implements Yue.AbstractC0181.InterfaceC0182 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.view.ActionMode.Callback f21890;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public final android.content.Context f21891;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.util.ArrayList<Yue.C6055> f21892;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final Yue.C5787<android.view.Menu, android.view.Menu> f21893;

        public C6056(android.content.Context r1, android.view.ActionMode.Callback r2) {
                r0 = this;
                r0.<init>()
                r0.f21891 = r1
                r0.f21890 = r2
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.f21892 = r1
                Yue.ۥۢ۟ۡ r1 = new Yue.ۥۢ۟ۡ
                r1.<init>()
                r0.f21893 = r1
                return
        }

        @Override // Yue.AbstractC0181.InterfaceC0182
        /* JADX INFO: renamed from: ۥ */
        public boolean mo1019(Yue.AbstractC0181 r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f21890
                android.view.ActionMode r2 = r1.m22767(r2)
                android.view.Menu r3 = r1.m22768(r3)
                boolean r2 = r0.onCreateActionMode(r2, r3)
                return r2
        }

        @Override // Yue.AbstractC0181.InterfaceC0182
        /* JADX INFO: renamed from: ۥ۟ */
        public boolean mo1020(Yue.AbstractC0181 r2, android.view.Menu r3) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f21890
                android.view.ActionMode r2 = r1.m22767(r2)
                android.view.Menu r3 = r1.m22768(r3)
                boolean r2 = r0.onPrepareActionMode(r2, r3)
                return r2
        }

        @Override // Yue.AbstractC0181.InterfaceC0182
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo1021(Yue.AbstractC0181 r2) {
                r1 = this;
                android.view.ActionMode$Callback r0 = r1.f21890
                android.view.ActionMode r2 = r1.m22767(r2)
                r0.onDestroyActionMode(r2)
                return
        }

        @Override // Yue.AbstractC0181.InterfaceC0182
        /* JADX INFO: renamed from: ۥ۟۟۟ */
        public boolean mo1022(Yue.AbstractC0181 r4, android.view.MenuItem r5) {
                r3 = this;
                android.view.ActionMode$Callback r0 = r3.f21890
                android.view.ActionMode r4 = r3.m22767(r4)
                Yue.ۥۡ۠ۦۥ r1 = new Yue.ۥۡ۠ۦۥ
                android.content.Context r2 = r3.f21891
                Yue.ۥۢ۠ۥۣ r5 = (Yue.InterfaceMenuItemC6061) r5
                r1.<init>(r2, r5)
                boolean r4 = r0.onActionItemClicked(r4, r1)
                return r4
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public android.view.ActionMode m22767(Yue.AbstractC0181 r5) {
                r4 = this;
                java.util.ArrayList<Yue.ۥۢ۠ۥ۠> r0 = r4.f21892
                int r0 = r0.size()
                r1 = 0
            L7:
                if (r1 >= r0) goto L1b
                java.util.ArrayList<Yue.ۥۢ۠ۥ۠> r2 = r4.f21892
                java.lang.Object r2 = r2.get(r1)
                Yue.ۥۢ۠ۥ۠ r2 = (Yue.C6055) r2
                if (r2 == 0) goto L18
                Yue.ۥ۟۟ۧ۟ r3 = r2.f21889
                if (r3 != r5) goto L18
                return r2
            L18:
                int r1 = r1 + 1
                goto L7
            L1b:
                Yue.ۥۢ۠ۥ۠ r0 = new Yue.ۥۢ۠ۥ۠
                android.content.Context r1 = r4.f21891
                r0.<init>(r1, r5)
                java.util.ArrayList<Yue.ۥۢ۠ۥ۠> r5 = r4.f21892
                r5.add(r0)
                return r0
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public final android.view.Menu m22768(android.view.Menu r4) {
                r3 = this;
                Yue.ۥۢ۟ۡ<android.view.Menu, android.view.Menu> r0 = r3.f21893
                java.lang.Object r0 = r0.get(r4)
                android.view.Menu r0 = (android.view.Menu) r0
                if (r0 != 0) goto L19
                Yue.ۥۡ۠ۧ۠ r0 = new Yue.ۥۡ۠ۧ۠
                android.content.Context r1 = r3.f21891
                r2 = r4
                Yue.ۥۢ۠ۥۡ r2 = (Yue.InterfaceMenuC6057) r2
                r0.<init>(r1, r2)
                Yue.ۥۢ۟ۡ<android.view.Menu, android.view.Menu> r1 = r3.f21893
                r1.put(r4, r0)
            L19:
                return r0
        }
    }

    public C6055(android.content.Context r1, Yue.AbstractC0181 r2) {
            r0 = this;
            r0.<init>()
            r0.f21888 = r1
            r0.f21889 = r2
            return
    }

    @Override // android.view.ActionMode
    public void finish() {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            r0.mo1001()
            return
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            android.view.View r0 = r0.mo1002()
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
            r3 = this;
            Yue.ۥۡ۠ۧ۠ r0 = new Yue.ۥۡ۠ۧ۠
            android.content.Context r1 = r3.f21888
            Yue.ۥ۟۟ۧ۟ r2 = r3.f21889
            android.view.Menu r2 = r2.mo1003()
            Yue.ۥۢ۠ۥۡ r2 = (Yue.InterfaceMenuC6057) r2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            android.view.MenuInflater r0 = r0.mo1004()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            java.lang.CharSequence r0 = r0.mo1005()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.Object getTag() {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            java.lang.Object r0 = r0.m1006()
            return r0
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            java.lang.CharSequence r0 = r0.mo1007()
            return r0
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            boolean r0 = r0.m1008()
            return r0
    }

    @Override // android.view.ActionMode
    public void invalidate() {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            r0.mo1009()
            return
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            boolean r0 = r0.mo1010()
            return r0
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View r2) {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            r0.mo1012(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int r2) {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            r0.mo1013(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            r0.mo1014(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTag(java.lang.Object r2) {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            r0.m1015(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(int r2) {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            r0.mo1016(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            r0.mo1017(r2)
            return
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean r2) {
            r1 = this;
            Yue.ۥ۟۟ۧ۟ r0 = r1.f21889
            r0.mo1018(r2)
            return
    }
}
