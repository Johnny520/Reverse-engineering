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
    protected List<T> mDatas = new ArrayList();
    private int mIncreaseCount = 2;
    private OnBannerListener<T> mOnBannerListener;
    private VH mViewHolder;

    public BannerAdapter(List<T> list) {
        setDatas(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onBindViewHolder$0(Object obj, int i, View view) {
        this.mOnBannerListener.OnBannerClick(obj, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public /* synthetic */ void lambda$onCreateViewHolder$1(AbstractC1166o abstractC1166o, View view) {
        if (this.mOnBannerListener != null) {
            Object tag = abstractC1166o.itemView.getTag(C1288R.id.banner_data_key);
            this.mOnBannerListener.OnBannerClick((T) tag, ((Integer) abstractC1166o.itemView.getTag(C1288R.id.banner_pos_key)).intValue());
        }
    }

    public T getData(int i) {
        if (i > this.mDatas.size() - 1) {
            return null;
        }
        return this.mDatas.get(i);
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public int getItemCount() {
        return getRealCount() > 1 ? getRealCount() + this.mIncreaseCount : getRealCount();
    }

    public int getRealCount() {
        List<T> list = this.mDatas;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public T getRealData(int i) {
        int realPosition = getRealPosition(i);
        if (realPosition > this.mDatas.size() - 1) {
            return null;
        }
        return this.mDatas.get(realPosition);
    }

    public int getRealPosition(int i) {
        return BannerUtils.getRealPosition(this.mIncreaseCount == 2, i, getRealCount());
    }

    public VH getViewHolder() {
        return this.mViewHolder;
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public final void onBindViewHolder(VH vh, int i) {
        this.mViewHolder = vh;
        int realPosition = getRealPosition(i);
        T t = this.mDatas.get(realPosition);
        vh.itemView.setTag(C1288R.id.banner_data_key, t);
        vh.itemView.setTag(C1288R.id.banner_pos_key, Integer.valueOf(realPosition));
        onBindView(vh, this.mDatas.get(realPosition), realPosition, getRealCount());
        if (this.mOnBannerListener != null) {
            vh.itemView.setOnClickListener(new ViewOnClickListenerC2219m5(this, t, realPosition));
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1158g
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        VH vhOnCreateHolder = onCreateHolder(viewGroup, i);
        vhOnCreateHolder.itemView.setOnClickListener(new ViewOnClickListenerC2176l5(0, this, vhOnCreateHolder));
        return vhOnCreateHolder;
    }

    public void setDatas(List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.mDatas.clear();
        this.mDatas.addAll(list);
        notifyDataSetChanged();
    }

    public void setIncreaseCount(int i) {
        this.mIncreaseCount = i;
    }

    public void setOnBannerListener(OnBannerListener<T> onBannerListener) {
        this.mOnBannerListener = onBannerListener;
    }
}
