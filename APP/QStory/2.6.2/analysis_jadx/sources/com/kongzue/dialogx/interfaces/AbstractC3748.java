package com.kongzue.dialogx.interfaces;

import android.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.fragment.app.AbstractC2313;
import androidx.fragment.app.AbstractComponentCallbacksC2338;
import com.kongzue.dialogx.DialogX$IMPL_MODE;
import p033.AbstractC6325;
import p053.AbstractC6560;
import p261.AbstractC8247;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3748 {
    View customView;
    private int dialogHash;
    private AbstractComponentCallbacksC2338 fragment;
    int layoutResId;
    private int parentViewHash;
    private Fragment supportFragment;
    private Runnable waitBindRunnable;
    private final int PARENT_FLAG = -109;
    private int fragmentParentId = -1;

    public AbstractC3748(int i) {
        if (AbstractC3737.m8045() == null) {
            AbstractC6325 abstractC6325 = AbstractC8247.f22824;
            Log.e(">>>", "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki");
        } else {
            this.layoutResId = i;
            this.customView = AbstractC6560.m12028(AbstractC3737.m8045()).inflate(i, (ViewGroup) new RelativeLayout(AbstractC3737.m8045()), false);
        }
    }

    public static int access$200(AbstractC3748 abstractC3748) {
        if (abstractC3748.fragmentParentId == -1) {
            abstractC3748.fragmentParentId = View.generateViewId();
        }
        return abstractC3748.fragmentParentId;
    }

    public void bindParent(ViewGroup viewGroup, AbstractC3737 abstractC3737) {
        if (getCustomView() == null) {
            this.waitBindRunnable = new RunnableC3741(this, 2, viewGroup);
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
        onBind(abstractC3737, getCustomView());
        View customView = getCustomView();
        if (abstractC3737.hashCode() != this.dialogHash || customView.hashCode() != this.parentViewHash) {
            this.dialogHash = abstractC3737.hashCode();
            this.parentViewHash = customView.hashCode();
            setEvent(abstractC3737, getCustomView());
        }
        if (this.fragment == null && this.supportFragment == null) {
            return;
        }
        if (abstractC3737.f11588 != DialogX$IMPL_MODE.VIEW) {
            AbstractC3737.m8053(abstractC3737.mo8063().concat("非 VIEW 实现模式不支持 fragment 作为子布局显示。\n其原因为 Window 中不存在 FragmentManager，无法对子布局中的 fragment 进行管理。"));
        } else {
            getCustomView().post(new RunnableC3741(this, 1, abstractC3737));
        }
    }

    public void clean() {
        this.layoutResId = 0;
        this.customView = null;
    }

    public View getCustomView() {
        if (this.customView == null) {
            this.customView = AbstractC6560.m12028(AbstractC3737.m8045()).inflate(this.layoutResId, (ViewGroup) new RelativeLayout(AbstractC3737.m8045()), false);
        }
        return this.customView;
    }

    public int getLayoutResId() {
        return this.layoutResId;
    }

    public abstract void onBind(Object obj, View view);

    public AbstractC3748 setCustomView(View view) {
        this.customView = view;
        return this;
    }

    public AbstractC3748 setLayoutResId(int i) {
        this.layoutResId = i;
        return this;
    }

    public void onFragmentBind(Object obj, View view, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, AbstractC2313 abstractC2313) {
    }

    public void setEvent(Object obj, View view) {
    }

    public AbstractC3748(View view) {
        this.customView = view;
    }

    public void onFragmentBind(Object obj, View view, Fragment fragment, FragmentManager fragmentManager) {
    }

    @Deprecated
    public void bindParent(ViewGroup viewGroup) {
        if (getCustomView() == null) {
            this.waitBindRunnable = new RunnableC3741(this, 2, viewGroup);
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
