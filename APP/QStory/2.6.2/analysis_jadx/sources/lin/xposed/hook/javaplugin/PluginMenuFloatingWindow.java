package lin.xposed.hook.javaplugin;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.alibaba.fastjson2.AbstractC2904;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import com.google.protobuf.DescriptorProtos$Edition;
import java.util.concurrent.atomic.AtomicBoolean;
import lin.xposed.hook.javaplugin.controller.PluginManager;
import lin.xposed.hook.javaplugin.dialog.PluginMenuDialog;
import p026.AbstractC6296;
import p028.C6301;
import p037.C6364;
import p037.InterfaceC6355;
import p053.AbstractC6560;
import p175.AbstractC7738;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class PluginMenuFloatingWindow extends AbstractC6296 {
    private static ImageView floatingButton;
    private static WindowManager.LayoutParams layoutParams;
    private static WindowManager windowManager;
    public InterfaceC6355 onChatShowListener = new AnonymousClass1();
    public static final String TAG = AbstractC3056.m6668(-3937619888139666855L);
    private static final AtomicBoolean isShowing = new AtomicBoolean();

    /* JADX INFO: renamed from: lin.xposed.hook.javaplugin.PluginMenuFloatingWindow$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public class AnonymousClass1 implements InterfaceC6355 {
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

        @Override // p037.InterfaceC6355
        public void hide() {
            if (PluginMenuFloatingWindow.this.hasPluginRunning()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC5550(this, 0));
            }
        }

        @Override // p037.InterfaceC6355
        public void show() {
            if (PluginMenuFloatingWindow.this.hasPluginRunning()) {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC5550(this, 1), 300L);
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
        layoutParams2.width = AbstractC2904.m6267(context, 30.0f);
        layoutParams.height = AbstractC2904.m6267(context, 30.0f);
        C6301 c6301 = new C6301(AbstractC3056.m6668(-3937619888139666855L));
        int iIntValue = ((Integer) c6301.m11812(0, AbstractC3056.m6668(-3937621434327893415L))).intValue();
        int iIntValue2 = ((Integer) c6301.m11812(0, AbstractC3056.m6668(-3937621464392664487L))).intValue();
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
                C6301 c6301 = new C6301(AbstractC3056.m6668(-3937619888139666855L));
                c6301.m11808(Integer.valueOf(layoutParams.x), AbstractC3056.m6668(-3937621434327893415L));
                c6301.m11808(Integer.valueOf(layoutParams.y), AbstractC3056.m6668(-3937621464392664487L));
                c6301.mo11807();
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
            Activity activityM13031 = AbstractC7738.m13031();
            WindowManager windowManager2 = activityM13031.getWindowManager();
            windowManager = windowManager2;
            windowManager2.addView(createIcon(activityM13031), getWindowManagerParams(activityM13031));
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6296
    public boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6296
    public void loadHook(ClassLoader classLoader) {
        if (AbstractC6560.m12011()) {
            C6364.addOnChatShowListener(this.onChatShowListener);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
