package lin.xposed.hook.javaplugin;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bumptech.glide.AbstractC3887;
import com.bumptech.glide.AbstractC3888;
import com.davemorrissey.labs.subscaleview.C0328R;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.concurrent.atomic.AtomicBoolean;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.dialog.PluginMenuDialog;
import p034.AbstractC7082;
import p042.AbstractC7143;
import p045.C7149;
import p054.C7210;
import p054.InterfaceC7201;
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMenuFloatingWindow extends AbstractC7143 {
    private static ImageView floatingButton;
    private static WindowManager.LayoutParams layoutParams;
    private static WindowManager windowManager;
    public InterfaceC7201 onChatShowListener = new C04081();
    public static final String TAG = AbstractC9234.m14531(583);
    private static final AtomicBoolean isShowing = new AtomicBoolean();

    /* JADX INFO: renamed from: lin.xposed.hook.javaplugin.PluginMenuFloatingWindow$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class C04081 implements InterfaceC7201 {
        public C04081() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$hide$1() {
            PluginMenuFloatingWindow.this.hidePluginFloatingWindow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$show$0() {
            PluginMenuFloatingWindow.this.showPluginFloatingWindow();
        }

        @Override // p054.InterfaceC7201
        public void hide() {
            if (PluginMenuFloatingWindow.this.hasPluginRunning()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC6382(this, 0));
            }
        }

        @Override // p054.InterfaceC7201
        public void show() {
            if (PluginMenuFloatingWindow.this.hasPluginRunning()) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC6382(this, 1), 300L);
            }
        }
    }

    private ImageView createIcon(final Context context) {
        ImageView imageView = new ImageView(context);
        floatingButton = imageView;
        imageView.setImageResource(C0328R.drawable.plugin_icon);
        floatingButton.setAdjustViewBounds(true);
        floatingButton.setOnTouchListener(new OnTouchListener(0));
        floatingButton.setOnClickListener(new View.OnClickListener() { // from class: lin.xposed.hook.javaplugin.飘花落叶言子楪世哲苏兰
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PluginMenuFloatingWindow.lambda$createIcon$0(context, view);
            }
        });
        return floatingButton;
    }

    private WindowManager.LayoutParams getWindowManagerParams(Context context) {
        WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams();
        layoutParams = layoutParams2;
        layoutParams2.type = DescriptorProtos$Edition.EDITION_2023_VALUE;
        layoutParams2.flags = 8;
        layoutParams2.format = 1;
        layoutParams2.width = AbstractC7082.m12313(context, 30.0f);
        layoutParams.height = AbstractC7082.m12313(context, 30.0f);
        C7149 c7149 = new C7149(AbstractC9234.m14531(583));
        int iIntValue = ((Integer) c7149.m12399(0, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵喵"))).intValue();
        int iIntValue2 = ((Integer) c7149.m12399(0, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵呜"))).intValue();
        WindowManager.LayoutParams layoutParams3 = layoutParams;
        if (iIntValue == 0) {
            iIntValue = 50;
        }
        layoutParams3.x = iIntValue;
        if (iIntValue2 == 0) {
            iIntValue2 = 50;
        }
        layoutParams3.y = iIntValue2;
        return layoutParams3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasPluginRunning() {
        return PluginManager.getAllRunningPluginLoader().size() != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void hidePluginFloatingWindow() {
        AtomicBoolean atomicBoolean = isShowing;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            try {
                windowManager.removeViewImmediate(floatingButton);
                C7149 c7149 = new C7149(AbstractC9234.m14531(583));
                c7149.m12395(Integer.valueOf(layoutParams.x), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵喵"));
                c7149.m12395(Integer.valueOf(layoutParams.y), AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵呜"));
                c7149.mo12394();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createIcon$0(Context context, View view) {
        PluginCallback.onClickFloatingWindow();
        PluginMenuDialog.showDialog(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void showPluginFloatingWindow() {
        AtomicBoolean atomicBoolean = isShowing;
        if (atomicBoolean.get()) {
            return;
        }
        atomicBoolean.set(true);
        try {
            Activity activityM7213 = AbstractC3887.m7213();
            WindowManager windowManager2 = activityM7213.getWindowManager();
            windowManager = windowManager2;
            windowManager2.addView(createIcon(activityM7213), getWindowManagerParams(activityM7213));
        } catch (Exception unused) {
        }
    }

    @Override // p042.AbstractC7143
    public boolean isLoadedByDefault() {
        return true;
    }

    @Override // p042.AbstractC7143
    public void loadHook(ClassLoader classLoader) {
        if (AbstractC3888.m7256()) {
            C7210.addOnChatShowListener(this.onChatShowListener);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class OnTouchListener implements View.OnTouchListener {

        /* JADX INFO: renamed from: x */
        int f313x;

        /* JADX INFO: renamed from: y */
        int f314y;

        public /* synthetic */ OnTouchListener(int i) {
            this();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f313x = (int) motionEvent.getRawX();
                this.f314y = (int) motionEvent.getRawY();
                return false;
            }
            if (action != 2) {
                return false;
            }
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int i = rawX - this.f313x;
            int i2 = rawY - this.f314y;
            this.f313x = rawX;
            this.f314y = rawY;
            PluginMenuFloatingWindow.layoutParams.x += i;
            PluginMenuFloatingWindow.layoutParams.y += i2;
            PluginMenuFloatingWindow.windowManager.updateViewLayout(view, PluginMenuFloatingWindow.layoutParams);
            return false;
        }

        private OnTouchListener() {
        }
    }
}
