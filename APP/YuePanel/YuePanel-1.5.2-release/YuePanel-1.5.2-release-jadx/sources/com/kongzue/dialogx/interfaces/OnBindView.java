package com.kongzue.dialogx.interfaces;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.AbstractC8885;
import androidx.fragment.app.Fragment;
import com.kongzue.dialogx.DialogX;
import com.kongzue.dialogx.util.views.ExtendChildLayoutParamsFrameLayout;
import com.kongzue.dialogx.wrapper.ModuleUtil;

/* JADX INFO: loaded from: classes.dex */
public abstract class OnBindView<D> {
    View customView;
    private int dialogHash;
    private Fragment fragment;
    int layoutResId;
    private int parentViewHash;
    private android.app.Fragment supportFragment;
    private Runnable waitBindRunnable;
    private final int PARENT_FLAG = -109;
    private int fragmentParentId = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OnBindView(int i) {
        if (BaseDialog.getTopActivity() == null) {
            DialogX.error(DialogX.ERROR_INIT_TIPS);
        } else {
            this.layoutResId = i;
            this.customView = ModuleUtil.getLayoutInflater(BaseDialog.getTopActivity()).inflate(i, (ViewGroup) new RelativeLayout(BaseDialog.getTopActivity()), false);
        }
    }

    private void callSetEvent(D d, View view) {
        if (d.hashCode() == this.dialogHash && view.hashCode() == this.parentViewHash) {
            return;
        }
        this.dialogHash = d.hashCode();
        this.parentViewHash = view.hashCode();
        setEvent(d, getCustomView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getFragmentParentId() {
        if (this.fragmentParentId == -1) {
            this.fragmentParentId = View.generateViewId();
        }
        return this.fragmentParentId;
    }

    private void waitBind(final ViewGroup viewGroup, final BaseDialog baseDialog) {
        this.waitBindRunnable = new Runnable() { // from class: com.kongzue.dialogx.interfaces.OnBindView.3
            @Override // java.lang.Runnable
            public void run() {
                if (OnBindView.this.getCustomView() == null) {
                    BaseDialog baseDialog2 = baseDialog;
                    if (baseDialog2 == null) {
                        OnBindView.this.bindParent(viewGroup);
                    } else {
                        OnBindView.this.bindParent(viewGroup, baseDialog2);
                    }
                }
            }
        };
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Deprecated
    public void bindParent(ViewGroup viewGroup) {
        if (getCustomView() == null) {
            waitBind(viewGroup, null);
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

    public void clean() {
        this.layoutResId = 0;
        this.customView = null;
    }

    public View getCustomView() {
        if (this.customView == null) {
            this.customView = ModuleUtil.getLayoutInflater(BaseDialog.getTopActivity()).inflate(this.layoutResId, (ViewGroup) new RelativeLayout(BaseDialog.getTopActivity()), false);
        }
        return this.customView;
    }

    public int getLayoutResId() {
        return this.layoutResId;
    }

    public abstract void onBind(D d, View view);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void onFragmentBind(D d, View view, android.app.Fragment fragment, FragmentManager fragmentManager) {
    }

    public OnBindView<D> setCustomView(View view) {
        this.customView = view;
        return this;
    }

    public void setEvent(D d, View view) {
    }

    public OnBindView<D> setLayoutResId(int i) {
        this.layoutResId = i;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public void onFragmentBind(D d, View view, Fragment fragment, androidx.fragment.app.FragmentManager fragmentManager) {
    }

    public OnBindView(final int i, boolean z) {
        if (BaseDialog.getTopActivity() == null) {
            DialogX.error(DialogX.ERROR_INIT_TIPS);
            return;
        }
        this.layoutResId = i;
        if (z) {
            new Thread() { // from class: com.kongzue.dialogx.interfaces.OnBindView.1
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    super.run();
                    synchronized (OnBindView.this) {
                        try {
                            OnBindView.this.customView = ModuleUtil.getLayoutInflater(BaseDialog.getTopActivity()).inflate(i, (ViewGroup) new RelativeLayout(BaseDialog.getTopActivity()), false);
                            if (OnBindView.this.waitBindRunnable != null) {
                                OnBindView.this.waitBindRunnable.run();
                                OnBindView.this.waitBindRunnable = null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }.start();
        } else {
            this.customView = ModuleUtil.getLayoutInflater(BaseDialog.getTopActivity()).inflate(i, (ViewGroup) new RelativeLayout(BaseDialog.getTopActivity()), false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.kongzue.dialogx.interfaces.BaseDialog */
    /* JADX WARN: Multi-variable type inference failed */
    public void bindParent(ViewGroup viewGroup, final BaseDialog baseDialog) {
        if (getCustomView() == null) {
            waitBind(viewGroup, null);
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
        onBind(baseDialog, getCustomView());
        callSetEvent(baseDialog, getCustomView());
        if (this.fragment == null && this.supportFragment == null) {
            return;
        }
        if (baseDialog.getDialogImplMode() != DialogX.IMPL_MODE.VIEW) {
            BaseDialog.error(baseDialog.dialogKey() + "非 VIEW 实现模式不支持 fragment 作为子布局显示。\n其原因为 Window 中不存在 FragmentManager，无法对子布局中的 fragment 进行管理。");
            return;
        }
        getCustomView().post(new Runnable() { // from class: com.kongzue.dialogx.interfaces.OnBindView.2
            @Override // java.lang.Runnable
            public void run() {
                if (OnBindView.this.fragment != null && (OnBindView.this.getCustomView() instanceof FrameLayout) && (baseDialog.getOwnActivity() instanceof AppCompatActivity)) {
                    AppCompatActivity appCompatActivity = (AppCompatActivity) baseDialog.getOwnActivity();
                    AbstractC8885 abstractC8885M29749 = appCompatActivity.getSupportFragmentManager().m29749();
                    abstractC8885M29749.m30040(OnBindView.this.getFragmentParentId(), OnBindView.this.fragment);
                    abstractC8885M29749.mo29904();
                    OnBindView onBindView = OnBindView.this;
                    onBindView.onFragmentBind(baseDialog, onBindView.getCustomView(), OnBindView.this.fragment, appCompatActivity.getSupportFragmentManager());
                }
                if (OnBindView.this.supportFragment != null && (OnBindView.this.getCustomView() instanceof FrameLayout) && (baseDialog.getOwnActivity() instanceof Activity)) {
                    Activity ownActivity = baseDialog.getOwnActivity();
                    FragmentTransaction fragmentTransactionBeginTransaction = ownActivity.getFragmentManager().beginTransaction();
                    fragmentTransactionBeginTransaction.add(OnBindView.this.getFragmentParentId(), OnBindView.this.supportFragment);
                    fragmentTransactionBeginTransaction.commit();
                    OnBindView onBindView2 = OnBindView.this;
                    onBindView2.onFragmentBind(baseDialog, onBindView2.getCustomView(), OnBindView.this.supportFragment, ownActivity.getFragmentManager());
                }
            }
        });
    }

    public OnBindView(View view) {
        this.customView = view;
    }

    public OnBindView(Fragment fragment) {
        if (BaseDialog.getTopActivity() == null) {
            return;
        }
        ExtendChildLayoutParamsFrameLayout extendChildLayoutParamsFrameLayout = new ExtendChildLayoutParamsFrameLayout(BaseDialog.getTopActivity());
        this.customView = extendChildLayoutParamsFrameLayout;
        extendChildLayoutParamsFrameLayout.setId(getFragmentParentId());
        this.fragment = fragment;
        this.supportFragment = null;
    }

    public OnBindView(android.app.Fragment fragment) {
        if (BaseDialog.getTopActivity() == null) {
            return;
        }
        ExtendChildLayoutParamsFrameLayout extendChildLayoutParamsFrameLayout = new ExtendChildLayoutParamsFrameLayout(BaseDialog.getTopActivity());
        this.customView = extendChildLayoutParamsFrameLayout;
        extendChildLayoutParamsFrameLayout.setId(getFragmentParentId());
        this.supportFragment = fragment;
        this.fragment = null;
    }
}
