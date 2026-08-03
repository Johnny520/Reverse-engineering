package androidx.appcompat.view.menu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.ۥ۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C7342 extends android.widget.BaseAdapter {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7343 f25433;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f25434;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean f25435;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public final boolean f25436;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final android.view.LayoutInflater f25437;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public final int f25438;

    public C7342(androidx.appcompat.view.menu.C7343 r2, android.view.LayoutInflater r3, boolean r4, int r5) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f25434 = r0
            r1.f25436 = r4
            r1.f25437 = r3
            r1.f25433 = r2
            r1.f25438 = r5
            r1.m28197()
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r2 = this;
            boolean r0 = r2.f25436
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r2.f25433
            java.util.ArrayList r0 = r0.getNonActionItems()
            goto L11
        Lb:
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r2.f25433
            java.util.ArrayList r0 = r0.getVisibleItems()
        L11:
            int r1 = r2.f25434
            if (r1 >= 0) goto L1a
            int r0 = r0.size()
            return r0
        L1a:
            int r0 = r0.size()
            int r0 = r0 + (-1)
            return r0
    }

    @Override // android.widget.Adapter
    public /* bridge */ /* synthetic */ java.lang.Object getItem(int r1) {
            r0 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r1 = r0.m28200(r1)
            return r1
    }

    @Override // android.widget.Adapter
    public long getItemId(int r3) {
            r2 = this;
            long r0 = (long) r3
            return r0
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto Lb
            android.view.LayoutInflater r7 = r5.f25437
            int r1 = r5.f25438
            android.view.View r7 = r7.inflate(r1, r8, r0)
        Lb:
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r8 = r5.m28200(r6)
            int r8 = r8.getGroupId()
            int r1 = r6 + (-1)
            if (r1 < 0) goto L20
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r1 = r5.m28200(r1)
            int r1 = r1.getGroupId()
            goto L21
        L20:
            r1 = r8
        L21:
            r2 = r7
            androidx.appcompat.view.menu.ListMenuItemView r2 = (androidx.appcompat.view.menu.ListMenuItemView) r2
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r3 = r5.f25433
            boolean r3 = r3.isGroupDividerEnabled()
            r4 = 1
            if (r3 == 0) goto L31
            if (r8 == r1) goto L31
            r8 = r4
            goto L32
        L31:
            r8 = r0
        L32:
            r2.setGroupDividerEnabled(r8)
            r8 = r7
            androidx.appcompat.view.menu.ۥ۟۟۟ۥ$ۥ r8 = (androidx.appcompat.view.menu.InterfaceC7354.InterfaceC7355) r8
            boolean r1 = r5.f25435
            if (r1 == 0) goto L3f
            r2.setForceShowIcon(r4)
        L3f:
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r6 = r5.m28200(r6)
            r8.initialize(r6, r0)
            return r7
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
            r0 = this;
            r0.m28197()
            super.notifyDataSetChanged()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m28197() {
            r5 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r5.f25433
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r0 = r0.getExpandedItem()
            if (r0 == 0) goto L23
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r1 = r5.f25433
            java.util.ArrayList r1 = r1.getNonActionItems()
            int r2 = r1.size()
            r3 = 0
        L13:
            if (r3 >= r2) goto L23
            java.lang.Object r4 = r1.get(r3)
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r4 = (androidx.appcompat.view.menu.C7348) r4
            if (r4 != r0) goto L20
            r5.f25434 = r3
            return
        L20:
            int r3 = r3 + 1
            goto L13
        L23:
            r0 = -1
            r5.f25434 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7343 m28198() {
            r1 = this;
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r1.f25433
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public boolean m28199() {
            r1 = this;
            boolean r0 = r1.f25435
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public androidx.appcompat.view.menu.C7348 m28200(int r3) {
            r2 = this;
            boolean r0 = r2.f25436
            if (r0 == 0) goto Lb
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r2.f25433
            java.util.ArrayList r0 = r0.getNonActionItems()
            goto L11
        Lb:
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = r2.f25433
            java.util.ArrayList r0 = r0.getVisibleItems()
        L11:
            int r1 = r2.f25434
            if (r1 < 0) goto L19
            if (r3 < r1) goto L19
            int r3 = r3 + 1
        L19:
            java.lang.Object r3 = r0.get(r3)
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r3 = (androidx.appcompat.view.menu.C7348) r3
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m28201(boolean r1) {
            r0 = this;
            r0.f25435 = r1
            return
    }
}
