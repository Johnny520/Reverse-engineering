package com.youth.banner.adapter;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.AbstractC1158g;
import androidx.recyclerview.widget.AbstractC1166o;
import com.youth.banner.C1288R;
import com.youth.banner.holder.IViewHolder;
import com.youth.banner.listener.OnBannerListener;
import com.youth.banner.util.BannerUtils;
import java.util.ArrayList;
import java.util.List;
import p000.ViewOnClickListenerC2176l5;
import p000.ViewOnClickListenerC2219m5;

/* JADX INFO: loaded from: classes.dex */
public abstract class BannerAdapter<T, VH extends AbstractC1166o> extends AbstractC1158g implements IViewHolder<T, VH> {
    protected List<T> mDatas;
    private int mIncreaseCount;
    private OnBannerListener<T> mOnBannerListener;
    private VH mViewHolder;

    public BannerAdapter(List<T> r2) {
        this.mDatas = new ArrayList();
        this.mIncreaseCount = 2;
        setDatas(r2);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2519a(BannerAdapter r0, Object r1, int r2, View r3) {
        r0.lambda$onBindViewHolder$0(r1, r2, r3);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2520b(BannerAdapter r0, AbstractC1166o r1, View r2) {
        r0.lambda$onCreateViewHolder$1(r1, r2);
    }

    private /* synthetic */ void lambda$onBindViewHolder$0(Object r1, int r2, View r3) {
        this.mOnBannerListener.OnBannerClick(r1, r2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private /* synthetic */ void lambda$onCreateViewHolder$1(AbstractC1166o r2, View r3) {
        if (this.mOnBannerListener == null) goto L6;
        Object r32 = r2.itemView.getTag(C1288R.id.banner_data_key);
        int r22 = ((Integer) r2.itemView.getTag(C1288R.id.banner_pos_key)).intValue();
        this.mOnBannerListener.OnBannerClick((T) r32, r22);
        return;
    }

    public T getData(int r2) {
        if (r2 <= (this.mDatas.size() - 1)) goto L7;
        return null;
    L7:
        return this.mDatas.get(r2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public int getItemCount() {
        if (getRealCount() <= 1) goto L7;
        return getRealCount() + this.mIncreaseCount;
    L7:
        return getRealCount();
    }

    public int getRealCount() {
        List<T> r0 = this.mDatas;
        if (r0 != null) goto L7;
        return 0;
    L7:
        return r0.size();
    }

    public T getRealData(int r2) {
        int r22 = getRealPosition(r2);
        if (r22 <= (this.mDatas.size() - 1)) goto L7;
        return null;
    L7:
        return this.mDatas.get(r22);
    }

    public int getRealPosition(int r3) {
        if (this.mIncreaseCount != 2) goto L5;
        boolean r0 = true;
    L7:
        return BannerUtils.getRealPosition(r0, r3, getRealCount());
    L5:
        r0 = false;
        goto L7
    }

    public VH getViewHolder() {
        return this.mViewHolder;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(VH r5, int r6) {
        this.mViewHolder = r5;
        int r62 = getRealPosition(r6);
        T r0 = this.mDatas.get(r62);
        r5.itemView.setTag(C1288R.id.banner_data_key, r0);
        r5.itemView.setTag(C1288R.id.banner_pos_key, Integer.valueOf(r62));
        onBindView(r5, this.mDatas.get(r62), r62, getRealCount());
        if (this.mOnBannerListener == null) goto L6;
        r5.itemView.setOnClickListener(new ViewOnClickListenerC2219m5(this, r0, r62));
        return;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public VH onCreateViewHolder(ViewGroup r3, int r4) {
        VH r32 = onCreateHolder(r3, r4);
        r32.itemView.setOnClickListener(new ViewOnClickListenerC2176l5(0, this, r32));
        return r32;
    }

    public void setDatas(List<T> r2) {
        if (r2 != null) goto L4;
        r2 = new ArrayList();
    L4:
        this.mDatas.clear();
        this.mDatas.addAll(r2);
        notifyDataSetChanged();
    }

    public void setIncreaseCount(int r1) {
        this.mIncreaseCount = r1;
    }

    public void setOnBannerListener(OnBannerListener<T> r1) {
        this.mOnBannerListener = r1;
    }
}
