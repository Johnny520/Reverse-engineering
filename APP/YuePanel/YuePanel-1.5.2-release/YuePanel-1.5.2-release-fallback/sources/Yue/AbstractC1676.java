package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۨۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1676 extends android.widget.BaseAdapter implements android.widget.Filterable, Yue.C1679.InterfaceC1680 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @java.lang.Deprecated
    public static final int f5264 = 1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final int f5265 = 2;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public boolean f5266;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public boolean f5267;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public android.database.Cursor f5268;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public android.content.Context f5269;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public int f5270;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public Yue.AbstractC1676.C1677 f5271;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public android.database.DataSetObserver f5272;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public Yue.C1679 f5273;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
    public android.widget.FilterQueryProvider f5274;

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۨۧ$ۥ, reason: contains not printable characters */
    public class C1677 extends android.database.ContentObserver {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC1676 f5275;

        public C1677(Yue.AbstractC1676 r1) {
                r0 = this;
                r0.f5275 = r1
                android.os.Handler r1 = new android.os.Handler
                r1.<init>()
                r0.<init>(r1)
                return
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r1) {
                r0 = this;
                Yue.ۥ۟ۧۨۧ r1 = r0.f5275
                r1.m8065()
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۟ۧۨۧ$ۥ۟, reason: contains not printable characters */
    public class C1678 extends android.database.DataSetObserver {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ Yue.AbstractC1676 f5276;

        public C1678(Yue.AbstractC1676 r1) {
                r0 = this;
                r0.f5276 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r2 = this;
                Yue.ۥ۟ۧۨۧ r0 = r2.f5276
                r1 = 1
                r0.f5266 = r1
                r0.notifyDataSetChanged()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r2 = this;
                Yue.ۥ۟ۧۨۧ r0 = r2.f5276
                r1 = 0
                r0.f5266 = r1
                r0.notifyDataSetInvalidated()
                return
        }
    }

    @java.lang.Deprecated
    public AbstractC1676(android.content.Context r2, android.database.Cursor r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.m8061(r2, r3, r0)
            return
    }

    public AbstractC1676(android.content.Context r1, android.database.Cursor r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.m8061(r1, r2, r3)
            return
    }

    public AbstractC1676(android.content.Context r1, android.database.Cursor r2, boolean r3) {
            r0 = this;
            r0.<init>()
            if (r3 == 0) goto L7
            r3 = 1
            goto L8
        L7:
            r3 = 2
        L8:
            r0.m8061(r1, r2, r3)
            return
    }

    @Override // android.widget.Adapter
    public int getCount() {
            r1 = this;
            boolean r0 = r1.f5266
            if (r0 == 0) goto Ld
            android.database.Cursor r0 = r1.f5268
            if (r0 == 0) goto Ld
            int r0 = r0.getCount()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // Yue.C1679.InterfaceC1680
    public android.database.Cursor getCursor() {
            r1 = this;
            android.database.Cursor r0 = r1.f5268
            return r0
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.f5266
            if (r0 == 0) goto L1b
            android.database.Cursor r0 = r1.f5268
            r0.moveToPosition(r2)
            if (r3 != 0) goto L13
            android.content.Context r2 = r1.f5269
            android.database.Cursor r3 = r1.f5268
            android.view.View r3 = r1.mo8063(r2, r3, r4)
        L13:
            android.content.Context r2 = r1.f5269
            android.database.Cursor r4 = r1.f5268
            r1.mo8059(r3, r2, r4)
            return r3
        L1b:
            r2 = 0
            return r2
    }

    @Override // android.widget.Filterable
    public android.widget.Filter getFilter() {
            r1 = this;
            Yue.ۥ۟ۧۨۨ r0 = r1.f5273
            if (r0 != 0) goto Lb
            Yue.ۥ۟ۧۨۨ r0 = new Yue.ۥ۟ۧۨۨ
            r0.<init>(r1)
            r1.f5273 = r0
        Lb:
            Yue.ۥ۟ۧۨۨ r0 = r1.f5273
            return r0
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.f5266
            if (r0 == 0) goto Le
            android.database.Cursor r0 = r1.f5268
            if (r0 == 0) goto Le
            r0.moveToPosition(r2)
            android.database.Cursor r2 = r1.f5268
            return r2
        Le:
            r2 = 0
            return r2
    }

    @Override // android.widget.Adapter
    public long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.f5266
            r1 = 0
            if (r0 == 0) goto L19
            android.database.Cursor r0 = r3.f5268
            if (r0 == 0) goto L19
            boolean r4 = r0.moveToPosition(r4)
            if (r4 == 0) goto L19
            android.database.Cursor r4 = r3.f5268
            int r0 = r3.f5270
            long r0 = r4.getLong(r0)
            return r0
        L19:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.f5266
            if (r0 == 0) goto L35
            android.database.Cursor r0 = r1.f5268
            boolean r0 = r0.moveToPosition(r2)
            if (r0 == 0) goto L1e
            if (r3 != 0) goto L16
            android.content.Context r2 = r1.f5269
            android.database.Cursor r3 = r1.f5268
            android.view.View r3 = r1.mo8064(r2, r3, r4)
        L16:
            android.content.Context r2 = r1.f5269
            android.database.Cursor r4 = r1.f5268
            r1.mo8059(r3, r2, r4)
            return r3
        L1e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "couldn't move cursor to position "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L35:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "this should only be called when the cursor is valid"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // Yue.C1679.InterfaceC1680
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public java.lang.CharSequence mo8056(android.database.Cursor r1) {
            r0 = this;
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            goto L9
        L5:
            java.lang.String r1 = r1.toString()
        L9:
            return r1
    }

    @Override // Yue.C1679.InterfaceC1680
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void mo8057(android.database.Cursor r1) {
            r0 = this;
            android.database.Cursor r1 = r0.mo8067(r1)
            if (r1 == 0) goto L9
            r1.close()
        L9:
            return
    }

    @Override // Yue.C1679.InterfaceC1680
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.database.Cursor mo8058(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.FilterQueryProvider r0 = r1.f5274
            if (r0 == 0) goto L9
            android.database.Cursor r2 = r0.runQuery(r2)
            return r2
        L9:
            android.database.Cursor r2 = r1.f5268
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public abstract void mo8059(android.view.View r1, android.content.Context r2, android.database.Cursor r3);

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.widget.FilterQueryProvider m8060() {
            r1 = this;
            android.widget.FilterQueryProvider r0 = r1.f5274
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void m8061(android.content.Context r4, android.database.Cursor r5, int r6) {
            r3 = this;
            r0 = r6 & 1
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lb
            r6 = r6 | 2
            r3.f5267 = r2
            goto Ld
        Lb:
            r3.f5267 = r1
        Ld:
            if (r5 == 0) goto L10
            r1 = r2
        L10:
            r3.f5268 = r5
            r3.f5266 = r1
            r3.f5269 = r4
            if (r1 == 0) goto L1f
            java.lang.String r4 = "_id"
            int r4 = r5.getColumnIndexOrThrow(r4)
            goto L20
        L1f:
            r4 = -1
        L20:
            r3.f5270 = r4
            r4 = 2
            r6 = r6 & r4
            if (r6 != r4) goto L35
            Yue.ۥ۟ۧۨۧ$ۥ r4 = new Yue.ۥ۟ۧۨۧ$ۥ
            r4.<init>(r3)
            r3.f5271 = r4
            Yue.ۥ۟ۧۨۧ$ۥ۟ r4 = new Yue.ۥ۟ۧۨۧ$ۥ۟
            r4.<init>(r3)
            r3.f5272 = r4
            goto L3a
        L35:
            r4 = 0
            r3.f5271 = r4
            r3.f5272 = r4
        L3a:
            if (r1 == 0) goto L4a
            Yue.ۥ۟ۧۨۧ$ۥ r4 = r3.f5271
            if (r4 == 0) goto L43
            r5.registerContentObserver(r4)
        L43:
            android.database.DataSetObserver r4 = r3.f5272
            if (r4 == 0) goto L4a
            r5.registerDataSetObserver(r4)
        L4a:
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m8062(android.content.Context r1, android.database.Cursor r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L4
            r3 = 1
            goto L5
        L4:
            r3 = 2
        L5:
            r0.m8061(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public android.view.View mo8063(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3) {
            r0 = this;
            android.view.View r1 = r0.mo8064(r1, r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public abstract android.view.View mo8064(android.content.Context r1, android.database.Cursor r2, android.view.ViewGroup r3);

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void m8065() {
            r1 = this;
            boolean r0 = r1.f5267
            if (r0 == 0) goto L16
            android.database.Cursor r0 = r1.f5268
            if (r0 == 0) goto L16
            boolean r0 = r0.isClosed()
            if (r0 != 0) goto L16
            android.database.Cursor r0 = r1.f5268
            boolean r0 = r0.requery()
            r1.f5266 = r0
        L16:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m8066(android.widget.FilterQueryProvider r1) {
            r0 = this;
            r0.f5274 = r1
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public android.database.Cursor mo8067(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.f5268
            if (r3 != r0) goto L6
            r3 = 0
            return r3
        L6:
            if (r0 == 0) goto L16
            Yue.ۥ۟ۧۨۧ$ۥ r1 = r2.f5271
            if (r1 == 0) goto Lf
            r0.unregisterContentObserver(r1)
        Lf:
            android.database.DataSetObserver r1 = r2.f5272
            if (r1 == 0) goto L16
            r0.unregisterDataSetObserver(r1)
        L16:
            r2.f5268 = r3
            if (r3 == 0) goto L37
            Yue.ۥ۟ۧۨۧ$ۥ r1 = r2.f5271
            if (r1 == 0) goto L21
            r3.registerContentObserver(r1)
        L21:
            android.database.DataSetObserver r1 = r2.f5272
            if (r1 == 0) goto L28
            r3.registerDataSetObserver(r1)
        L28:
            java.lang.String r1 = "_id"
            int r3 = r3.getColumnIndexOrThrow(r1)
            r2.f5270 = r3
            r3 = 1
            r2.f5266 = r3
            r2.notifyDataSetChanged()
            goto L40
        L37:
            r3 = -1
            r2.f5270 = r3
            r3 = 0
            r2.f5266 = r3
            r2.notifyDataSetInvalidated()
        L40:
            return r0
    }
}
