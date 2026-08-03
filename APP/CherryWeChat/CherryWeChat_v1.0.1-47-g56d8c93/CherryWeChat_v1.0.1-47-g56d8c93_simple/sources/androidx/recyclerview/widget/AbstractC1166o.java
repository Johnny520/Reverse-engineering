package androidx.recyclerview.widget;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p000.AbstractC2185lE;
import p000.C2431qv;

/* JADX INFO: renamed from: androidx.recyclerview.widget.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1166o {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final List<Object> FULLUPDATE_PAYLOADS = null;
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final View itemView;
    AbstractC1158g mBindingAdapter;
    int mFlags;
    boolean mInChangeScrap;
    private int mIsRecyclableCount;
    long mItemId;
    int mItemViewType;
    WeakReference<RecyclerView> mNestedRecyclerView;
    int mOldPosition;
    RecyclerView mOwnerRecyclerView;
    List<Object> mPayloads;
    int mPendingAccessibilityState;
    int mPosition;
    int mPreLayoutPosition;
    C1161j mScrapContainer;
    AbstractC1166o mShadowedHolder;
    AbstractC1166o mShadowingHolder;
    List<Object> mUnmodifiedPayloads;
    private int mWasImportantForAccessibilityBeforeHidden;

    static {
        FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
    }

    public AbstractC1166o(View r4) {
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1;
        this.mItemViewType = -1;
        this.mPreLayoutPosition = -1;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        this.mPayloads = null;
        this.mUnmodifiedPayloads = null;
        this.mIsRecyclableCount = 0;
        this.mScrapContainer = null;
        this.mInChangeScrap = false;
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        if (r4 == null) goto L7;
        this.itemView = r4;
        return;
    L7:
        throw new IllegalArgumentException("itemView may not be null");
    }

    public void addChangePayload(Object r3) {
        if (r3 != null) goto L7;
        addFlags(FLAG_ADAPTER_FULLUPDATE);
        return;
    L7:
        if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) goto L9;
        return;
    L9:
        if (this.mPayloads != null) goto L11;
        ArrayList r0 = new ArrayList();
        this.mPayloads = r0;
        this.mUnmodifiedPayloads = Collections.unmodifiableList(r0);
    L11:
        this.mPayloads.add(r3);
    }

    public void addFlags(int r2) {
        this.mFlags = r2 | this.mFlags;
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void clearPayload() {
        List<Object> r0 = this.mPayloads;
        if (r0 == null) goto L5;
        r0.clear();
    L5:
        this.mFlags &= -1025;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public boolean doesTransientStatePreventRecycling() {
        if ((this.mFlags & FLAG_NOT_RECYCLABLE) != 0) goto L8;
        View r0 = this.itemView;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        if (r0.hasTransientState() == false) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public void flagRemovedAndOffsetPosition(int r2, int r3, boolean r4) {
        addFlags(8);
        offsetPosition(r3, r4);
        this.mPosition = r2;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView r0 = this.mOwnerRecyclerView;
        if (r0 != null) goto L7;
        return -1;
    L7:
        return r0.getAdapterPositionInRecyclerView(this);
    }

    @Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    public final AbstractC1158g getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        if (this.mBindingAdapter != null) goto L5;
        return -1;
    L5:
        RecyclerView r0 = this.mOwnerRecyclerView;
        if (r0 != null) goto L8;
        return -1;
    L8:
        AbstractC1158g r02 = r0.getAdapter();
        if (r02 != null) goto L11;
        return -1;
    L11:
        int r2 = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this);
        if (r2 != (-1)) goto L15;
        return -1;
    L15:
        return r02.findRelativeAdapterPositionIn(this.mBindingAdapter, this, r2);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int r0 = this.mPreLayoutPosition;
        if (r0 == (-1)) goto L5;
        return r0;
    L5:
        return this.mPosition;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int r0 = this.mPreLayoutPosition;
        if (r0 == (-1)) goto L5;
        return r0;
    L5:
        return this.mPosition;
    }

    public List<Object> getUnmodifiedPayloads() {
        if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) goto L14;
        List<Object> r0 = this.mPayloads;
        if (r0 == null) goto L12;
        if (r0.size() == 0) goto L12;
        return this.mUnmodifiedPayloads;
    L12:
        return FULLUPDATE_PAYLOADS;
    L14:
        return FULLUPDATE_PAYLOADS;
    }

    public boolean hasAnyOfTheFlags(int r2) {
        if ((r2 & this.mFlags) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isAdapterPositionUnknown() {
        if ((this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) == 0) goto L5;
        return true;
    L5:
        if (isInvalid() == true) goto L11;
        return false;
    L11:
        return true;
    }

    public boolean isAttachedToTransitionOverlay() {
        if (this.itemView.getParent() != null) goto L5;
        return false;
    L5:
        if (this.itemView.getParent() == this.mOwnerRecyclerView) goto L10;
        return true;
    L10:
        return false;
    }

    public boolean isBound() {
        if ((this.mFlags & 1) == 0) goto L5;
        return true;
    L5:
        return false;
    }

    public boolean isInvalid() {
        if ((this.mFlags & 4) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & FLAG_NOT_RECYCLABLE) != 0) goto L8;
        View r0 = this.itemView;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        if (r0.hasTransientState() == true) goto L10;
        return true;
    L10:
        return false;
    L8:
        return false;
    }

    public boolean isRemoved() {
        if ((this.mFlags & 8) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isScrap() {
        if (this.mScrapContainer == null) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isTmpDetached() {
        if ((this.mFlags & FLAG_TMP_DETACHED) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean isUpdated() {
        if ((this.mFlags & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean needsUpdate() {
        if ((this.mFlags & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public void offsetPosition(int r3, boolean r4) {
        if (this.mOldPosition != (-1)) goto L6;
        this.mOldPosition = this.mPosition;
    L6:
        if (this.mPreLayoutPosition != (-1)) goto L8;
        this.mPreLayoutPosition = this.mPosition;
    L8:
        if (r4 == false) goto L10;
        this.mPreLayoutPosition += r3;
    L10:
        this.mPosition += r3;
        if (this.itemView.getLayoutParams() == null) goto L14;
        ((C2431qv) this.itemView.getLayoutParams()).f8528c = true;
        return;
    }

    public void onEnteredHiddenState(RecyclerView r3) {
        int r0 = this.mPendingAccessibilityState;
        if (r0 == (-1)) goto L5;
        this.mWasImportantForAccessibilityBeforeHidden = r0;
    L6:
        r3.setChildImportantForAccessibilityInternal(this, 4);
        return;
    L5:
        View r02 = this.itemView;
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        this.mWasImportantForAccessibilityBeforeHidden = r02.getImportantForAccessibility();
        goto L6
    }

    public void onLeftHiddenState(RecyclerView r2) {
        r2.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        if (RecyclerView.sDebugAssertionsEnabled == true) goto L5;
    L9:
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        return;
    L5:
        if (isTmpDetached() == false) goto L9;
        throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
    }

    public void saveOldPosition() {
        if (this.mOldPosition != (-1)) goto L6;
        this.mOldPosition = this.mPosition;
        return;
    }

    public void setFlags(int r3, int r4) {
        int r32 = r3 & r4;
        this.mFlags = r32 | (this.mFlags & (~r4));
    }

    public final void setIsRecyclable(boolean r3) {
        int r1 = this.mIsRecyclableCount;
        if (r3 == false) goto L5;
        int r12 = r1 - 1;
    L6:
        this.mIsRecyclableCount = r12;
        if (r12 >= 0) goto L13;
        this.mIsRecyclableCount = 0;
        if (RecyclerView.sDebugAssertionsEnabled == true) goto L12;
        toString();
    L20:
        if (RecyclerView.sVerboseLoggingEnabled == false) goto L23;
        toString();
        return;
    L23:
        return;
    L12:
        throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
    L13:
        if (r3 == true) goto L16;
        if (r12 != 1) goto L16;
        this.mFlags |= FLAG_NOT_RECYCLABLE;
    L16:
        if (r3 == false) goto L20;
        if (r12 != 0) goto L20;
        this.mFlags &= -17;
        goto L20
    L5:
        r12 = r1 + 1;
        goto L6
    }

    public void setScrapContainer(C1161j r1, boolean r2) {
        this.mScrapContainer = r1;
        this.mInChangeScrap = r2;
    }

    public boolean shouldBeKeptAsChild() {
        if ((this.mFlags & FLAG_NOT_RECYCLABLE) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public boolean shouldIgnore() {
        if ((this.mFlags & FLAG_IGNORE) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public String toString() {
        if (getClass().isAnonymousClass() == false) goto L5;
        String r0 = "ViewHolder";
    L6:
        StringBuilder r1 = new StringBuilder(r0 + "{" + Integer.toHexString(hashCode()) + " position=" + this.mPosition + " id=" + this.mItemId + ", oldPos=" + this.mOldPosition + ", pLpos:" + this.mPreLayoutPosition);
        if (isScrap() == false) goto L14;
        r1.append(" scrap ");
        if (this.mInChangeScrap == false) goto L11;
        String r02 = "[changeScrap]";
    L12:
        r1.append(r02);
        goto L14
    L11:
        r02 = "[attachedScrap]";
    L14:
        if (isInvalid() == false) goto L17;
        r1.append(" invalid");
    L17:
        if (isBound() == true) goto L20;
        r1.append(" unbound");
    L20:
        if (needsUpdate() == false) goto L23;
        r1.append(" update");
    L23:
        if (isRemoved() == false) goto L26;
        r1.append(" removed");
    L26:
        if (shouldIgnore() == false) goto L29;
        r1.append(" ignored");
    L29:
        if (isTmpDetached() == false) goto L32;
        r1.append(" tmpDetached");
    L32:
        if (isRecyclable() == true) goto L35;
        r1.append(" not recyclable(" + this.mIsRecyclableCount + ")");
    L35:
        if (isAdapterPositionUnknown() == false) goto L38;
        r1.append(" undefined adapter position");
    L38:
        if (this.itemView.getParent() != null) goto L40;
        r1.append(" no parent");
    L40:
        r1.append("}");
        return r1.toString();
    L5:
        r0 = getClass().getSimpleName();
        goto L6
    }

    public void unScrap() {
        this.mScrapContainer.m2267n(this);
    }

    public boolean wasReturnedFromScrap() {
        if ((this.mFlags & FLAG_RETURNED_FROM_SCRAP) == 0) goto L6;
        return true;
    L6:
        return false;
    }
}
