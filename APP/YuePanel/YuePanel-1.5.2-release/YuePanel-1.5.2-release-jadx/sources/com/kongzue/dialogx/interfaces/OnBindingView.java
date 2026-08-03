package com.kongzue.dialogx.interfaces;

import Yue.InterfaceC8270;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.kongzue.dialogx.C2413R;
import com.kongzue.dialogx.wrapper.ModuleUtil;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes2.dex */
public abstract class OnBindingView<D, VB extends InterfaceC8270> extends OnBindView<D> {
    protected VB binding;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public OnBindingView(VB vb) {
        super(vb.getRoot());
        this.binding = vb;
    }

    private static View getBindingRootView(InterfaceC8270 interfaceC8270) {
        if (interfaceC8270 == null) {
            return new View(BaseDialog.getContext());
        }
        View root = interfaceC8270.getRoot();
        root.setTag(C2413R.id.dialogx_view_binding_tag_key, interfaceC8270);
        return root;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private InterfaceC8270 getViewBinding() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            return getViewBinding((Class) ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]);
        }
        BaseDialog.error("DialogX: OnBindingView初始化异常，若要使用无参构建，必须指定ViewBinding泛型");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.kongzue.dialogx.interfaces.OnBindView
    public void onBind(D d, View view) {
        onBind(d, view, this.binding);
    }

    public abstract void onBind(D d, View view, VB vb);

    public OnBindingView() {
        super((View) null);
        setCustomView(getBindingRootView(getViewBinding()));
        this.binding = (VB) getCustomView().getTag(C2413R.id.dialogx_view_binding_tag_key);
    }

    public OnBindingView(Class cls) {
        super(getBindingRootView(getViewBinding(cls)));
        this.binding = (VB) getCustomView().getTag(C2413R.id.dialogx_view_binding_tag_key);
    }

    private static InterfaceC8270 getViewBinding(String str) {
        try {
            return getViewBinding(Class.forName(str));
        } catch (ClassNotFoundException e) {
            BaseDialog.error("DialogX: OnBindingView初始化异常，未能根据bindingClassName：" + str + "找到对应的ViewBinding，请尝试指定ViewBinding实例");
            throw new RuntimeException(e);
        }
    }

    public OnBindingView(String str) {
        super(getBindingRootView(getViewBinding(str)));
        this.binding = (VB) getCustomView().getTag(C2413R.id.dialogx_view_binding_tag_key);
    }

    private static InterfaceC8270 getViewBinding(Class cls) {
        try {
            return (InterfaceC8270) cls.getMethod("inflate", LayoutInflater.class).invoke(null, ModuleUtil.getLayoutInflater(BaseDialog.getContext()));
        } catch (Exception e) {
            BaseDialog.error("DialogX: OnBindingView初始化异常，未能根据bindingClass找到对应的ViewBinding，请尝试指定ViewBinding实例");
            e.printStackTrace();
            return null;
        }
    }

    public OnBindingView(int i) {
        super(i);
    }

    public OnBindingView(int i, boolean z) {
        super(i, z);
    }

    public OnBindingView(View view) {
        super(view);
    }

    public OnBindingView(Fragment fragment) {
        super(fragment);
    }

    public OnBindingView(android.app.Fragment fragment) {
        super(fragment);
    }
}
