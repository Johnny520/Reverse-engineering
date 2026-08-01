package defpackage;

/* JADX INFO: renamed from: ᛶᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1191 {
    private boolean mHasStableIds;
    private final defpackage.C0066 mObservable;
    private defpackage.EnumC0957 mStateRestorationPolicy;

    public AbstractC1191() {
            r1 = this;
            r1.<init>()
            ᛱᛳᲈᛶ r0 = new ᛱᛳᲈᛶ
            r0.<init>()
            r1.mObservable = r0
            r0 = 0
            r1.mHasStableIds = r0
            ᛵᲀᛴᛷ r0 = defpackage.EnumC0957.f4264
            r1.mStateRestorationPolicy = r0
            return
    }

    public final void bindViewHolder(defpackage.AbstractC2316 r6, int r7) {
            r5 = this;
            ᛶᲈᲀᲇ r0 = r6.f9786
            android.view.View r1 = r6.f9791
            r2 = 1
            if (r0 != 0) goto L9
            r0 = r2
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L3a
            r6.f9790 = r7
            boolean r3 = r5.hasStableIds()
            if (r3 == 0) goto L1a
            long r3 = r5.getItemId(r7)
            r6.f9787 = r3
        L1a:
            int r3 = r6.f9792
            r3 = r3 & (-520(0xfffffffffffffdf8, float:NaN))
            r3 = r3 | r2
            r6.f9792 = r3
            boolean r3 = android.os.Trace.isEnabled()
            if (r3 == 0) goto L3a
            int r3 = r6.f9797
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "RV onBindViewHolder type=0x%X"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            android.os.Trace.beginSection(r3)
        L3a:
            r6.f9786 = r5
            boolean r3 = defpackage.C0055.f603
            if (r3 == 0) goto L90
            android.view.ViewParent r3 = r1.getParent()
            if (r3 != 0) goto L7d
            boolean r3 = r1.isAttachedToWindow()
            boolean r4 = r6.m3777()
            if (r3 != r4) goto L51
            goto L7d
        L51:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            boolean r7 = r6.m3777()
            boolean r0 = r1.isAttachedToWindow()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Temp-detached state out of sync with reality. holder.isTmpDetached(): "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r7 = ", attached to window: "
            r1.append(r7)
            r1.append(r0)
            java.lang.String r7 = ", holder: "
            r1.append(r7)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
        L7d:
            android.view.ViewParent r3 = r1.getParent()
            if (r3 != 0) goto L90
            boolean r3 = r1.isAttachedToWindow()
            if (r3 != 0) goto L8a
            goto L90
        L8a:
            java.lang.String r5 = "Attempting to bind attached holder with no parent (AKA temp detached): "
            defpackage.C2264.m3671(r6, r5)
            return
        L90:
            java.util.List r3 = r6.m3780()
            r5.onBindViewHolder(r6, r7, r3)
            if (r0 == 0) goto Lb5
            java.util.ArrayList r5 = r6.f9782
            if (r5 == 0) goto La0
            r5.clear()
        La0:
            int r5 = r6.f9792
            r5 = r5 & (-1025(0xfffffffffffffbff, float:NaN))
            r6.f9792 = r5
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            boolean r6 = r5 instanceof defpackage.C0840
            if (r6 == 0) goto Lb2
            ᛵᛲᲁᛴ r5 = (defpackage.C0840) r5
            r5.f3862 = r2
        Lb2:
            android.os.Trace.endSection()
        Lb5:
            return
    }

    public boolean canRestoreState() {
            r2 = this;
            ᛵᲀᛴᛷ r0 = r2.mStateRestorationPolicy
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto Ld
            r2 = 2
            if (r0 == r2) goto L14
            goto L13
        Ld:
            int r2 = r2.getItemCount()
            if (r2 <= 0) goto L14
        L13:
            return r1
        L14:
            r2 = 0
            return r2
    }

    public final defpackage.AbstractC2316 createViewHolder(android.view.ViewGroup r3, int r4) {
            r2 = this;
            boolean r0 = android.os.Trace.isEnabled()     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L17
            java.lang.String r0 = "RV onCreateViewHolder type=0x%X"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch: java.lang.Throwable -> L31
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> L31
        L17:
            ᲈᛸᲈᛷ r2 = r2.onCreateViewHolder(r3, r4)     // Catch: java.lang.Throwable -> L31
            android.view.View r3 = r2.f9791     // Catch: java.lang.Throwable -> L31
            android.view.ViewParent r3 = r3.getParent()     // Catch: java.lang.Throwable -> L31
            if (r3 != 0) goto L29
            r2.f9797 = r4     // Catch: java.lang.Throwable -> L31
            android.os.Trace.endSection()
            return r2
        L29:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            java.lang.String r3 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L31
            throw r2     // Catch: java.lang.Throwable -> L31
        L31:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    public int findRelativeAdapterPositionIn(defpackage.AbstractC1191 r1, defpackage.AbstractC2316 r2, int r3) {
            r0 = this;
            if (r1 != r0) goto L3
            return r3
        L3:
            r0 = -1
            return r0
    }

    public abstract int getItemCount();

    public long getItemId(int r1) {
            r0 = this;
            r0 = -1
            return r0
    }

    public int getItemViewType(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public final defpackage.EnumC0957 getStateRestorationPolicy() {
            r0 = this;
            ᛵᲀᛴᛷ r0 = r0.mStateRestorationPolicy
            return r0
    }

    public final boolean hasObservers() {
            r0 = this;
            ᛱᛳᲈᛶ r0 = r0.mObservable
            boolean r0 = r0.m489()
            return r0
    }

    public final boolean hasStableIds() {
            r0 = this;
            boolean r0 = r0.mHasStableIds
            return r0
    }

    public final void notifyDataSetChanged() {
            r0 = this;
            ᛱᛳᲈᛶ r0 = r0.mObservable
            r0.m490()
            return
    }

    public final void notifyItemChanged(int r3) {
            r2 = this;
            ᛱᛳᲈᛶ r2 = r2.mObservable
            r0 = 1
            r1 = 0
            r2.m487(r3, r0, r1)
            return
    }

    public final void notifyItemChanged(int r2, java.lang.Object r3) {
            r1 = this;
            ᛱᛳᲈᛶ r1 = r1.mObservable
            r0 = 1
            r1.m487(r2, r0, r3)
            return
    }

    public final void notifyItemInserted(int r2) {
            r1 = this;
            ᛱᛳᲈᛶ r1 = r1.mObservable
            r0 = 1
            r1.m486(r2, r0)
            return
    }

    public final void notifyItemMoved(int r1, int r2) {
            r0 = this;
            ᛱᛳᲈᛶ r0 = r0.mObservable
            r0.m488(r1, r2)
            return
    }

    public final void notifyItemRangeChanged(int r2, int r3) {
            r1 = this;
            ᛱᛳᲈᛶ r1 = r1.mObservable
            r0 = 0
            r1.m487(r2, r3, r0)
            return
    }

    public final void notifyItemRangeChanged(int r1, int r2, java.lang.Object r3) {
            r0 = this;
            ᛱᛳᲈᛶ r0 = r0.mObservable
            r0.m487(r1, r2, r3)
            return
    }

    public final void notifyItemRangeInserted(int r1, int r2) {
            r0 = this;
            ᛱᛳᲈᛶ r0 = r0.mObservable
            r0.m486(r1, r2)
            return
    }

    public final void notifyItemRangeRemoved(int r1, int r2) {
            r0 = this;
            ᛱᛳᲈᛶ r0 = r0.mObservable
            r0.m491(r1, r2)
            return
    }

    public final void notifyItemRemoved(int r2) {
            r1 = this;
            ᛱᛳᲈᛶ r1 = r1.mObservable
            r0 = 1
            r1.m491(r2, r0)
            return
    }

    public void onAttachedToRecyclerView(defpackage.C0055 r1) {
            r0 = this;
            return
    }

    public abstract void onBindViewHolder(defpackage.AbstractC2316 r1, int r2);

    public void onBindViewHolder(defpackage.AbstractC2316 r1, int r2, java.util.List<java.lang.Object> r3) {
            r0 = this;
            r0.onBindViewHolder(r1, r2)
            return
    }

    public abstract defpackage.AbstractC2316 onCreateViewHolder(android.view.ViewGroup r1, int r2);

    public void onDetachedFromRecyclerView(defpackage.C0055 r1) {
            r0 = this;
            return
    }

    public boolean onFailedToRecycleView(defpackage.AbstractC2316 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public void onViewAttachedToWindow(defpackage.AbstractC2316 r1) {
            r0 = this;
            return
    }

    public void onViewDetachedFromWindow(defpackage.AbstractC2316 r1) {
            r0 = this;
            return
    }

    public void onViewRecycled(defpackage.AbstractC2316 r1) {
            r0 = this;
            return
    }

    public void registerAdapterDataObserver(defpackage.AbstractC1319 r1) {
            r0 = this;
            ᛱᛳᲈᛶ r0 = r0.mObservable
            r0.registerObserver(r1)
            return
    }

    public void setHasStableIds(boolean r2) {
            r1 = this;
            boolean r0 = r1.hasObservers()
            if (r0 != 0) goto L9
            r1.mHasStableIds = r2
            return
        L9:
            java.lang.String r1 = "Cannot change whether this adapter has stable IDs while the adapter has registered observers."
            defpackage.C2264.m3676(r1)
            return
    }

    public void setStateRestorationPolicy(defpackage.EnumC0957 r1) {
            r0 = this;
            r0.mStateRestorationPolicy = r1
            ᛱᛳᲈᛶ r0 = r0.mObservable
            r0.m492()
            return
    }

    public void unregisterAdapterDataObserver(defpackage.AbstractC1319 r1) {
            r0 = this;
            ᛱᛳᲈᛶ r0 = r0.mObservable
            r0.unregisterObserver(r1)
            return
    }
}
