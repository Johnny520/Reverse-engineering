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
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p018.AbstractC6253;
import p261.AbstractC8248;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3749 {
    View customView;
    private int dialogHash;
    private AbstractComponentCallbacksC2338 fragment;
    int layoutResId;
    private int parentViewHash;
    private Fragment supportFragment;
    private Runnable waitBindRunnable;
    private final int PARENT_FLAG = -109;
    private int fragmentParentId = -1;

    public AbstractC3749(int i) {
        if (AbstractC3738.m8032() == null) {
            AbstractC4922 abstractC4922 = AbstractC8248.f22823;
            Log.e(">>>", "DialogX.init: 初始化异常，context 为 null 或未初始化，详情请查看 https://github.com/kongzue/DialogX/wiki");
        } else {
            this.layoutResId = i;
            this.customView = AbstractC6253.m11750(AbstractC3738.m8032()).inflate(i, (ViewGroup) new RelativeLayout(AbstractC3738.m8032()), false);
        }
    }

    public static int access$200(AbstractC3749 abstractC3749) {
        if (abstractC3749.fragmentParentId == -1) {
            abstractC3749.fragmentParentId = View.generateViewId();
        }
        return abstractC3749.fragmentParentId;
    }

    public void bindParent(ViewGroup viewGroup, AbstractC3738 abstractC3738) {
        if (getCustomView() == null) {
            this.waitBindRunnable = new RunnableC3742(this, 2, viewGroup);
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
        onBind(abstractC3738, getCustomView());
        View customView = getCustomView();
        if (abstractC3738.hashCode() != this.dialogHash || customView.hashCode() != this.parentViewHash) {
            this.dialogHash = abstractC3738.hashCode();
            this.parentViewHash = customView.hashCode();
            setEvent(abstractC3738, getCustomView());
        }
        if (this.fragment == null && this.supportFragment == null) {
            return;
        }
        if (abstractC3738.f11593 != DialogX$IMPL_MODE.VIEW) {
            AbstractC3738.m8040(abstractC3738.mo8050().concat("非 VIEW 实现模式不支持 fragment 作为子布局显示。\n其原因为 Window 中不存在 FragmentManager，无法对子布局中的 fragment 进行管理。"));
        } else {
            getCustomView().post(new RunnableC3742(this, 1, abstractC3738));
        }
    }

    public void clean() {
        this.layoutResId = 0;
        this.customView = null;
    }

    public View getCustomView() {
        if (this.customView == null) {
            this.customView = AbstractC6253.m11750(AbstractC3738.m8032()).inflate(this.layoutResId, (ViewGroup) new RelativeLayout(AbstractC3738.m8032()), false);
        }
        return this.customView;
    }

    public int getLayoutResId() {
        return this.layoutResId;
    }

    public abstract void onBind(Object obj, View view);

    public AbstractC3749 setCustomView(View view) {
        this.customView = view;
        return this;
    }

    public AbstractC3749 setLayoutResId(int i) {
        this.layoutResId = i;
        return this;
    }

    public void onFragmentBind(Object obj, View view, AbstractComponentCallbacksC2338 abstractComponentCallbacksC2338, AbstractC2313 abstractC2313) {
    }

    public void setEvent(Object obj, View view) {
    }

    public AbstractC3749(View view) {
        this.customView = view;
    }

    public void onFragmentBind(Object obj, View view, Fragment fragment, FragmentManager fragmentManager) {
    }

    @Deprecated
    public void bindParent(ViewGroup viewGroup) {
        if (getCustomView() == null) {
            this.waitBindRunnable = new RunnableC3742(this, 2, viewGroup);
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
