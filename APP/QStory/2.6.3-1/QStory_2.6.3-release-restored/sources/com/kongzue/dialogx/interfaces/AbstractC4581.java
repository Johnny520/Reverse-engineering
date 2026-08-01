package com.kongzue.dialogx.interfaces;

import android.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC3146;
import androidx.fragment.app.AbstractComponentCallbacksC3171;
import com.kongzue.dialogx.DialogX$IMPL_MODE;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p034.AbstractC7082;
import p277.AbstractC9077;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4581 {
    View customView;
    private int dialogHash;
    private AbstractComponentCallbacksC3171 fragment;
    int layoutResId;
    private int parentViewHash;
    private Fragment supportFragment;
    private Runnable waitBindRunnable;
    private final int PARENT_FLAG = -109;
    private int fragmentParentId = -1;

    public AbstractC4581(int i) {
        if (AbstractC4570.m8591() == null) {
            AbstractC5754 abstractC5754 = AbstractC9077.f23168;
            Log.e(">>>", "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki");
        } else {
            this.layoutResId = i;
            this.customView = AbstractC7082.m12309(AbstractC4570.m8591()).inflate(i, (ViewGroup) new RelativeLayout(AbstractC4570.m8591()), false);
        }
    }

    public static int access$200(AbstractC4581 abstractC4581) {
        if (abstractC4581.fragmentParentId == -1) {
            abstractC4581.fragmentParentId = View.generateViewId();
        }
        return abstractC4581.fragmentParentId;
    }

    public void bindParent(ViewGroup viewGroup, AbstractC4570 abstractC4570) {
        if (getCustomView() == null) {
            this.waitBindRunnable = new RunnableC4574(this, 2, viewGroup);
            return;
        }
        if (getCustomView().getParent() == viewGroup || viewGroup.getTag(-109) == getCustomView().toString()) {
            return;
        }
        if (getCustomView().getParent() != null) {
            ((ViewGroup) getCustomView().getParent()).removeView(getCustomView());
        }
        ViewGroup.LayoutParams layoutParams = getCustomView().getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        viewGroup.addView(getCustomView(), layoutParams);
        onBind(abstractC4570, getCustomView());
        View customView = getCustomView();
        if (abstractC4570.hashCode() != this.dialogHash || customView.hashCode() != this.parentViewHash) {
            this.dialogHash = abstractC4570.hashCode();
            this.parentViewHash = customView.hashCode();
            setEvent(abstractC4570, getCustomView());
        }
        if (this.fragment == null && this.supportFragment == null) {
            return;
        }
        if (abstractC4570.f11938 != DialogX$IMPL_MODE.VIEW) {
            AbstractC4570.m8599(abstractC4570.mo8609().concat("非 VIEW 实现模式不支持 fragment 作为子布局显示。\n其原因为 Window 中不存在 FragmentManager，无法对子布局中的 fragment 进行管理。"));
        } else {
            getCustomView().post(new RunnableC4574(this, 1, abstractC4570));
        }
    }

    public void clean() {
        this.layoutResId = 0;
        this.customView = null;
    }

    public View getCustomView() {
        if (this.customView == null) {
            this.customView = AbstractC7082.m12309(AbstractC4570.m8591()).inflate(this.layoutResId, (ViewGroup) new RelativeLayout(AbstractC4570.m8591()), false);
        }
        return this.customView;
    }

    public int getLayoutResId() {
        return this.layoutResId;
    }

    public abstract void onBind(Object obj, View view);

    public AbstractC4581 setCustomView(View view) {
        this.customView = view;
        return this;
    }

    public AbstractC4581 setLayoutResId(int i) {
        this.layoutResId = i;
        return this;
    }

    public void onFragmentBind(Object obj, View view, AbstractComponentCallbacksC3171 abstractComponentCallbacksC3171, AbstractC3146 abstractC3146) {
    }

    public void setEvent(Object obj, View view) {
    }

    public AbstractC4581(View view) {
        this.customView = view;
    }

    public void onFragmentBind(Object obj, View view, Fragment fragment, FragmentManager fragmentManager) {
    }

    @Deprecated
    public void bindParent(ViewGroup viewGroup) {
        if (getCustomView() == null) {
            this.waitBindRunnable = new RunnableC4574(this, 2, viewGroup);
            return;
        }
        if (getCustomView().getParent() != null) {
            if (getCustomView().getParent() == viewGroup) {
                return;
            } else {
                ((ViewGroup) getCustomView().getParent()).removeView(getCustomView());
            }
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        }
        viewGroup.addView(getCustomView(), layoutParams);
    }
}
