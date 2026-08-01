package lin.xposed.hook.javaplugin;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.bumptech.glide.AbstractC3055;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.concurrent.atomic.AtomicBoolean;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.dialog.PluginMenuDialog;
import p018.AbstractC6253;
import p026.AbstractC6314;
import p029.C6320;
import p038.C6381;
import p038.InterfaceC6372;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMenuFloatingWindow extends AbstractC6314 {
    private static ImageView floatingButton;
    private static WindowManager.LayoutParams layoutParams;
    private static WindowManager windowManager;
    public InterfaceC6372 onChatShowListener = new AnonymousClass1();
    public static final String TAG = AbstractC8405.m13972(583);
    private static final AtomicBoolean isShowing = new AtomicBoolean();

    /* JADX INFO: renamed from: lin.xposed.hook.javaplugin.PluginMenuFloatingWindow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public class AnonymousClass1 implements InterfaceC6372 {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$hide$1() {
            PluginMenuFloatingWindow.this.hidePluginFloatingWindow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$show$0() {
            PluginMenuFloatingWindow.this.showPluginFloatingWindow();
        }

        @Override // p038.InterfaceC6372
        public void hide() {
            if (PluginMenuFloatingWindow.this.hasPluginRunning()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC5551(this, 0));
            }
        }

        @Override // p038.InterfaceC6372
        public void show() {
            if (PluginMenuFloatingWindow.this.hasPluginRunning()) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC5551(this, 1), 300L);
            }
        }
    }

    private ImageView createIcon(final Context context) {
        ImageView imageView = new ImageView(context);
        floatingButton = imageView;
        imageView.setImageResource(R.drawable.plugin_icon);
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
        layoutParams2.width = AbstractC6253.m11754(context, 30.0f);
        layoutParams.height = AbstractC6253.m11754(context, 30.0f);
        C6320 c6320 = new C6320(AbstractC8405.m13972(583));
        int iIntValue = ((Integer) c6320.m11840(0, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵喵"))).intValue();
        int iIntValue2 = ((Integer) c6320.m11840(0, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵呜"))).intValue();
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
                C6320 c6320 = new C6320(AbstractC8405.m13972(583));
                c6320.m11836(Integer.valueOf(layoutParams.x), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵喵"));
                c6320.m11836(Integer.valueOf(layoutParams.y), AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜呜呜喵呜~喵喵喵呜喵呜喵呜~喵喵喵呜呜呜呜呜~喵呜喵喵喵呜喵呜~喵喵喵呜喵呜喵呜"));
                c6320.mo11835();
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
            Activity activityM6653 = AbstractC3055.m6653();
            WindowManager windowManager2 = activityM6653.getWindowManager();
            windowManager = windowManager2;
            windowManager2.addView(createIcon(activityM6653), getWindowManagerParams(activityM6653));
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6314
    public boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6314
    public void loadHook(ClassLoader classLoader) {
        if (AbstractC3056.m6696()) {
            C6381.addOnChatShowListener(this.onChatShowListener);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class OnTouchListener implements View.OnTouchListener {
        int x;
        int y;

        public /* synthetic */ OnTouchListener(int i) {
            this();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.x = (int) motionEvent.getRawX();
                this.y = (int) motionEvent.getRawY();
                return false;
            }
            if (action != 2) {
                return false;
            }
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            int i = rawX - this.x;
            int i2 = rawY - this.y;
            this.x = rawX;
            this.y = rawY;
            PluginMenuFloatingWindow.layoutParams.x += i;
            PluginMenuFloatingWindow.layoutParams.y += i2;
            PluginMenuFloatingWindow.windowManager.updateViewLayout(view, PluginMenuFloatingWindow.layoutParams);
            return false;
        }

        private OnTouchListener() {
        }
    }
}
