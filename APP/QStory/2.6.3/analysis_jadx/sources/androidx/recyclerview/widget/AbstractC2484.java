package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import androidx.core.view.AbstractC2270;
import com.google.protobuf.C3683;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import lin.xposed.hook.javaplugin.C5554;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.recyclerview.widget.飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2484 {
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
    private static final List<Object> FULLUPDATE_PAYLOADS = Collections.EMPTY_LIST;
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
    public final View itemView;
    AbstractC2450 mBindingAdapter;
    int mFlags;
    WeakReference<RecyclerView> mNestedRecyclerView;
    RecyclerView mOwnerRecyclerView;
    int mPosition = -1;
    int mOldPosition = -1;
    long mItemId = -1;
    int mItemViewType = -1;
    int mPreLayoutPosition = -1;
    AbstractC2484 mShadowedHolder = null;
    AbstractC2484 mShadowingHolder = null;
    List<Object> mPayloads = null;
    List<Object> mUnmodifiedPayloads = null;
    private int mIsRecyclableCount = 0;
    C2531 mScrapContainer = null;
    boolean mInChangeScrap = false;
    private int mWasImportantForAccessibilityBeforeHidden = 0;
    int mPendingAccessibilityState = -1;

    public AbstractC2484(View view) {
        if (view != null) {
            this.itemView = view;
        } else {
            C5925.m11310("itemView may not be null");
            throw null;
        }
    }

    public void addChangePayload(Object obj) {
        if (obj == null) {
            addFlags(1024);
            return;
        }
        if ((1024 & this.mFlags) == 0) {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
            this.mPayloads.add(obj);
        }
    }

    public void addFlags(int i) {
        this.mFlags = i | this.mFlags;
    }

    public void clearOldPosition() {
        this.mOldPosition = -1;
        this.mPreLayoutPosition = -1;
    }

    public void clearPayload() {
        List<Object> list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags &= -1025;
    }

    public void clearReturnedFromScrapFlag() {
        this.mFlags &= -33;
    }

    public void clearTmpDetachFlag() {
        this.mFlags &= -257;
    }

    public boolean doesTransientStatePreventRecycling() {
        if ((this.mFlags & 16) != 0) {
            return false;
        }
        View view = this.itemView;
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        return view.hasTransientState();
    }

    public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
        addFlags(8);
        offsetPosition(i2, z);
        this.mPosition = i;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.m4706(this);
    }

    @Deprecated
    public final int getAdapterPosition() {
        return getBindingAdapterPosition();
    }

    public final AbstractC2450 getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        RecyclerView recyclerView;
        AbstractC2450 adapter;
        int iM4706;
        if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (iM4706 = this.mOwnerRecyclerView.m4706(this)) == -1) {
            return -1;
        }
        return adapter.mo4795(this.mBindingAdapter, this, iM4706);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int i = this.mPreLayoutPosition;
        return i == -1 ? this.mPosition : i;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    @Deprecated
    public final int getPosition() {
        int i = this.mPreLayoutPosition;
        return i == -1 ? this.mPosition : i;
    }

    public List<Object> getUnmodifiedPayloads() {
        if ((this.mFlags & 1024) != 0) {
            return FULLUPDATE_PAYLOADS;
        }
        List<Object> list = this.mPayloads;
        return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
    }

    public boolean hasAnyOfTheFlags(int i) {
        return (this.mFlags & i) != 0;
    }

    public boolean isAdapterPositionUnknown() {
        return (this.mFlags & 512) != 0 || isInvalid();
    }

    public boolean isAttachedToTransitionOverlay() {
        return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
    }

    public boolean isBound() {
        return (this.mFlags & 1) != 0;
    }

    public boolean isInvalid() {
        return (this.mFlags & 4) != 0;
    }

    public final boolean isRecyclable() {
        if ((this.mFlags & 16) != 0) {
            return false;
        }
        View view = this.itemView;
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        return !view.hasTransientState();
    }

    public boolean isRemoved() {
        return (this.mFlags & 8) != 0;
    }

    public boolean isScrap() {
        return this.mScrapContainer != null;
    }

    public boolean isTmpDetached() {
        return (this.mFlags & 256) != 0;
    }

    public boolean isUpdated() {
        return (this.mFlags & 2) != 0;
    }

    public boolean needsUpdate() {
        return (this.mFlags & 2) != 0;
    }

    public void offsetPosition(int i, boolean z) {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
        if (this.mPreLayoutPosition == -1) {
            this.mPreLayoutPosition = this.mPosition;
        }
        if (z) {
            this.mPreLayoutPosition += i;
        }
        this.mPosition += i;
        if (this.itemView.getLayoutParams() != null) {
            ((C2518) this.itemView.getLayoutParams()).f7578 = true;
        }
    }

    public void onEnteredHiddenState(RecyclerView recyclerView) {
        int i = this.mPendingAccessibilityState;
        if (i != -1) {
            this.mWasImportantForAccessibilityBeforeHidden = i;
        } else {
            this.mWasImportantForAccessibilityBeforeHidden = this.itemView.getImportantForAccessibility();
        }
        if (!recyclerView.m4705()) {
            this.itemView.setImportantForAccessibility(4);
        } else {
            this.mPendingAccessibilityState = 4;
            recyclerView.f7222.add(this);
        }
    }

    public void onLeftHiddenState(RecyclerView recyclerView) {
        int i = this.mWasImportantForAccessibilityBeforeHidden;
        if (recyclerView.m4705()) {
            this.mPendingAccessibilityState = i;
            recyclerView.f7222.add(this);
        } else {
            this.itemView.setImportantForAccessibility(i);
        }
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        if (RecyclerView.f7176 && isTmpDetached()) {
            C5554.m10883(this, "Attempting to reset temp-detached ViewHolder: ", ". ViewHolders should be fully detached before resetting.");
            return;
        }
        this.mFlags = 0;
        this.mPosition = -1;
        this.mOldPosition = -1;
        this.mItemId = -1L;
        this.mPreLayoutPosition = -1;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = -1;
        RecyclerView.m4695(this);
    }

    public void saveOldPosition() {
        if (this.mOldPosition == -1) {
            this.mOldPosition = this.mPosition;
        }
    }

    public void setFlags(int i, int i2) {
        this.mFlags = (i & i2) | (this.mFlags & (~i2));
    }

    public final void setIsRecyclable(boolean z) {
        int i = this.mIsRecyclableCount;
        int i2 = z ? i - 1 : i + 1;
        this.mIsRecyclableCount = i2;
        if (i2 < 0) {
            this.mIsRecyclableCount = 0;
            if (RecyclerView.f7176) {
                C3683.m7925(this, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                return;
            } else {
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            }
        } else if (!z && i2 == 1) {
            this.mFlags |= 16;
        } else if (z && i2 == 0) {
            this.mFlags &= -17;
        }
        if (RecyclerView.f7177) {
            Log.d("RecyclerView", "setIsRecyclable val:" + z + ":" + this);
        }
    }

    public void setScrapContainer(C2531 c2531, boolean z) {
        this.mScrapContainer = c2531;
        this.mInChangeScrap = z;
    }

    public boolean shouldBeKeptAsChild() {
        return (this.mFlags & 16) != 0;
    }

    public boolean shouldIgnore() {
        return (this.mFlags & 128) != 0;
    }

    public void stopIgnoring() {
        this.mFlags &= -129;
    }

    public String toString() {
        StringBuilder sbM11584 = AbstractC6183.m11584(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
        sbM11584.append(Integer.toHexString(hashCode()));
        sbM11584.append(" position=");
        sbM11584.append(this.mPosition);
        sbM11584.append(" id=");
        sbM11584.append(this.mItemId);
        sbM11584.append(", oldPos=");
        sbM11584.append(this.mOldPosition);
        sbM11584.append(", pLpos:");
        sbM11584.append(this.mPreLayoutPosition);
        StringBuilder sb = new StringBuilder(sbM11584.toString());
        if (isScrap()) {
            sb.append(" scrap ");
            sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
        }
        if (isInvalid()) {
            sb.append(" invalid");
        }
        if (!isBound()) {
            sb.append(" unbound");
        }
        if (needsUpdate()) {
            sb.append(" update");
        }
        if (isRemoved()) {
            sb.append(" removed");
        }
        if (shouldIgnore()) {
            sb.append(" ignored");
        }
        if (isTmpDetached()) {
            sb.append(" tmpDetached");
        }
        if (!isRecyclable()) {
            sb.append(" not recyclable(" + this.mIsRecyclableCount + ")");
        }
        if (isAdapterPositionUnknown()) {
            sb.append(" undefined adapter position");
        }
        if (this.itemView.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }

    public void unScrap() {
        this.mScrapContainer.m5036(this);
    }

    public boolean wasReturnedFromScrap() {
        return (this.mFlags & 32) != 0;
    }
}
