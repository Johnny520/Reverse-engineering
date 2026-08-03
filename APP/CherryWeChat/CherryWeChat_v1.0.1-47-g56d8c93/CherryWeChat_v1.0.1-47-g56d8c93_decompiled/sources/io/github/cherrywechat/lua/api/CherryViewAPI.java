package io.github.cherrywechat.lua.api;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Looper;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import io.github.cherrywechat.lua.LuaLocks;
import io.github.cherrywechat.lua.LuaUiScheduler;
import io.github.cherrywechat.lua.api.CherryViewAPI;
import java.io.File;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC0213Ey;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC2374ph;
import p000.AbstractC2453ra;
import p000.AbstractC2496sa;
import p000.C0181E8;
import p000.C0296Gv;
import p000.C0339Hv;
import p000.C0396J8;
import p000.C0439K8;
import p000.C0495Lf;
import p000.C0525M8;
import p000.C0568N8;
import p000.C0611O8;
import p000.C0654P8;
import p000.C0782S8;
import p000.C0829TC;
import p000.C0868U8;
import p000.C0954W8;
import p000.C1083Z8;
import p000.C1127a9;
import p000.C1302d;
import p000.C1389f;
import p000.C2087j8;
import p000.C2265n8;
import p000.C2308o8;
import p000.DialogInterfaceOnClickListenerC0825T8;
import p000.DialogInterfaceOnClickListenerC2179l8;
import p000.InterfaceC0884Ui;
import p000.RunnableC2260n3;
import p000.ViewOnClickListenerC0482L8;
import party.iroiro.luajava.Lua;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClickableViewAccessibility", "StaticFieldLeak"})
public final class CherryViewAPI {
    private static final String TAG = AbstractC0295Gu.m625r(-304697864878133L);
    public static final CherryViewAPI INSTANCE = new CherryViewAPI();
    private static final ConcurrentHashMap<String, FloatingWindowInfo> floatingWindows = new ConcurrentHashMap<>();
    private static final AtomicLong windowIdCounter = new AtomicLong(0);
    private static final AtomicLong viewIdCounter = new AtomicLong(0);
    private static final ConcurrentHashMap<String, View> viewRefs = new ConcurrentHashMap<>();
    private static final ExecutorService imageLoadExecutor = Executors.newFixedThreadPool(3);

    public static final class FloatingWindowInfo {
        private final FrameLayout container;

        /* JADX INFO: renamed from: id */
        private final String f5551id;
        private boolean isShowing;
        private final WindowManager.LayoutParams params;
        private final WindowManager windowManager;

        public FloatingWindowInfo(String str, FrameLayout frameLayout, WindowManager.LayoutParams layoutParams, WindowManager windowManager, boolean z) {
            AbstractC0295Gu.m625r(-545314817701941L);
            AbstractC0295Gu.m625r(-545327702603829L);
            AbstractC0295Gu.m625r(-544820896462901L);
            AbstractC0295Gu.m625r(-544850961233973L);
            this.f5551id = str;
            this.container = frameLayout;
            this.params = layoutParams;
            this.windowManager = windowManager;
            this.isShowing = z;
        }

        public static /* synthetic */ FloatingWindowInfo copy$default(FloatingWindowInfo floatingWindowInfo, String str, FrameLayout frameLayout, WindowManager.LayoutParams layoutParams, WindowManager windowManager, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = floatingWindowInfo.f5551id;
            }
            if ((i & 2) != 0) {
                frameLayout = floatingWindowInfo.container;
            }
            if ((i & 4) != 0) {
                layoutParams = floatingWindowInfo.params;
            }
            if ((i & 8) != 0) {
                windowManager = floatingWindowInfo.windowManager;
            }
            if ((i & 16) != 0) {
                z = floatingWindowInfo.isShowing;
            }
            boolean z2 = z;
            WindowManager.LayoutParams layoutParams2 = layoutParams;
            return floatingWindowInfo.copy(str, frameLayout, layoutParams2, windowManager, z2);
        }

        public final String component1() {
            return this.f5551id;
        }

        public final FrameLayout component2() {
            return this.container;
        }

        public final WindowManager.LayoutParams component3() {
            return this.params;
        }

        public final WindowManager component4() {
            return this.windowManager;
        }

        public final boolean component5() {
            return this.isShowing;
        }

        public final FloatingWindowInfo copy(String str, FrameLayout frameLayout, WindowManager.LayoutParams layoutParams, WindowManager windowManager, boolean z) {
            AbstractC0295Gu.m625r(-544911090776117L);
            AbstractC0295Gu.m625r(-544923975678005L);
            AbstractC0295Gu.m625r(-544966925350965L);
            AbstractC0295Gu.m625r(-544996990122037L);
            return new FloatingWindowInfo(str, frameLayout, layoutParams, windowManager, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FloatingWindowInfo)) {
                return false;
            }
            FloatingWindowInfo floatingWindowInfo = (FloatingWindowInfo) obj;
            return AbstractC0585Nj.m1134a(this.f5551id, floatingWindowInfo.f5551id) && AbstractC0585Nj.m1134a(this.container, floatingWindowInfo.container) && AbstractC0585Nj.m1134a(this.params, floatingWindowInfo.params) && AbstractC0585Nj.m1134a(this.windowManager, floatingWindowInfo.windowManager) && this.isShowing == floatingWindowInfo.isShowing;
        }

        public final FrameLayout getContainer() {
            return this.container;
        }

        public final String getId() {
            return this.f5551id;
        }

        public final WindowManager.LayoutParams getParams() {
            return this.params;
        }

        public final WindowManager getWindowManager() {
            return this.windowManager;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isShowing) + ((this.windowManager.hashCode() + ((this.params.hashCode() + ((this.container.hashCode() + (this.f5551id.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        public final boolean isShowing() {
            return this.isShowing;
        }

        public final void setShowing(boolean z) {
            this.isShowing = z;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(AbstractC0295Gu.m625r(-545057119664181L));
            AbstractC2374ph.m4817n(sb, this.f5551id, -543506636470325L);
            sb.append(this.container);
            sb.append(AbstractC0295Gu.m625r(-543562471045173L));
            sb.append(this.params);
            sb.append(AbstractC0295Gu.m625r(-543605420718133L));
            sb.append(this.windowManager);
            sb.append(AbstractC0295Gu.m625r(-543678435162165L));
            sb.append(this.isShowing);
            sb.append(')');
            return sb.toString();
        }
    }

    private CherryViewAPI() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC cleanup$lambda$135() {
        Collection<FloatingWindowInfo> collectionValues = floatingWindows.values();
        AbstractC0295Gu.m625r(-304620555466805L);
        for (FloatingWindowInfo floatingWindowInfo : collectionValues) {
            if (floatingWindowInfo.isShowing()) {
                try {
                    floatingWindowInfo.getWindowManager().removeView(floatingWindowInfo.getContainer());
                } catch (Exception unused) {
                }
            }
        }
        floatingWindows.clear();
        viewRefs.clear();
        return C0829TC.f2620a;
    }

    /* JADX INFO: renamed from: dp */
    private final int m3294dp(int i) {
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        return currentContext == null ? i : (int) TypedValue.applyDimension(1, i, currentContext.getResources().getDisplayMetrics());
    }

    private final String generateViewId() {
        return AbstractC0295Gu.m625r(-540238166358069L) + viewIdCounter.incrementAndGet();
    }

    private final void loadImageFromUrl(ImageView imageView, String str) {
        imageLoadExecutor.execute(new RunnableC2260n3(5, str, imageView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadImageFromUrl$lambda$132(String str, ImageView imageView) {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            AbstractC0295Gu.m625r(-306295592712245L);
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(15000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
                inputStream.close();
                if (bitmapDecodeStream != null) {
                    LuaUiScheduler.INSTANCE.runOnUiThread(new C1389f(4, imageView, bitmapDecodeStream));
                }
            }
            httpURLConnection.disconnect();
        } catch (Exception unused) {
            AbstractC0295Gu.m625r(-304921203177525L);
            AbstractC0295Gu.m625r(-304981332719669L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC loadImageFromUrl$lambda$132$lambda$131(ImageView imageView, Bitmap bitmap) {
        imageView.setImageBitmap(bitmap);
        return C0829TC.f2620a;
    }

    private final int parseColor(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    private final int parseGravity(String str) {
        String lowerCase;
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            AbstractC0295Gu.m625r(-541131519555637L);
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            return 0;
        }
        switch (lowerCase.hashCode()) {
            case -1699597560:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541741404911669L)) ? 0 : 8388693;
            case -1698351794:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541522361579573L)) ? 0 : 8388691;
            case -1682225977:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-540147972044853L)) ? 0 : 8388693;
            case -1383228885:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541831599224885L)) ? 0 : 80;
            case -1364013995:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541861663995957L)) ? 0 : 17;
            case -1139554575:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541797239486517L)) ? 0 : 8388661;
            case -966253391:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541685570336821L)) ? 0 : 8388659;
            case -609197669:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-542020577785909L)) ? 0 : 8388691;
            case -348726240:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541616850860085L)) ? 0 : 16;
            case 100571:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541724225042485L)) ? 0 : 8388613;
            case 115029:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541578196154421L)) ? 0 : 48;
            case 3317767:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541595376023605L)) ? 0 : 8388611;
            case 108511772:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541917498570805L)) ? 0 : 8388613;
            case 109757538:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541891728767029L)) ? 0 : 8388611;
            case 116576946:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541204533999669L)) ? 0 : 8388661;
            case 117822712:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-540195216685109L)) ? 0 : 8388659;
            case 1063616078:
                return !lowerCase.equals(AbstractC0295Gu.m625r(-541943268374581L)) ? 0 : 1;
            default:
                return 0;
        }
    }

    private final Map<String, Object> readConfig(Lua lua, int i) {
        Object objValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        lua.pushValue(i);
        lua.pushNil();
        while (lua.next(-2) != 0) {
            String string = lua.toString(-2);
            if (lua.isString(-1)) {
                objValueOf = lua.toString(-1);
            } else if (lua.isNumber(-1)) {
                objValueOf = Double.valueOf(lua.toNumber(-1));
            } else if (lua.isBoolean(-1)) {
                objValueOf = Boolean.valueOf(lua.toBoolean(-1));
            } else if (lua.isFunction(-1)) {
                lua.pushValue(-1);
                objValueOf = Integer.valueOf(lua.ref());
            } else {
                objValueOf = null;
            }
            if (string != null) {
                linkedHashMap.put(string, objValueOf);
            }
            lua.pop(1);
        }
        lua.pop(1);
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$1(Lua lua) {
        AbstractC0295Gu.m625r(-540697727858741L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-540706317793333L);
        }
        INSTANCE.runOnUiThread(new C2308o8(string, (lua.getTop() <= 1 || ((int) lua.toNumber(2)) <= 0) ? 0 : 1, 3));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$1$lambda$0(String str, int i) {
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = cherryGlobalAPI.getCurrentContext();
        }
        if (currentActivity != null) {
            Toast.makeText(currentActivity, str, i).show();
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$101(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-307824601069621L);
        String string2 = lua.toString(1);
        if (string2 == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        INSTANCE.runOnUiThread(new C0611O8(1, string2, string));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$101$lambda$100(String str, String str2) {
        View view;
        FloatingWindowInfo floatingWindowInfo = floatingWindows.get(str);
        C0829TC c0829tc = C0829TC.f2620a;
        if (floatingWindowInfo == null || (view = viewRefs.get(str2)) == null) {
            return c0829tc;
        }
        floatingWindowInfo.getContainer().removeAllViews();
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        floatingWindowInfo.getContainer().addView(view, new FrameLayout.LayoutParams(-1, -1));
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$103(Lua lua) {
        AbstractC0295Gu.m625r(-307446643947573L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        INSTANCE.runOnUiThread(new C0782S8(string, 2));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$103$lambda$102(String str) {
        FloatingWindowInfo floatingWindowInfo = floatingWindows.get(str);
        C0829TC c0829tc = C0829TC.f2620a;
        if (floatingWindowInfo != null && !floatingWindowInfo.isShowing()) {
            try {
                floatingWindowInfo.getWindowManager().addView(floatingWindowInfo.getContainer(), floatingWindowInfo.getParams());
                floatingWindowInfo.setShowing(true);
            } catch (Exception e) {
                AbstractC0213Ey.m411i(-307833191004213L, -307343564732469L, e);
            }
        }
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$105(Lua lua) {
        AbstractC0295Gu.m625r(-305969175197749L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        INSTANCE.runOnUiThread(new C0782S8(string, 3));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$105$lambda$104(String str) {
        FloatingWindowInfo floatingWindowInfo = floatingWindows.get(str);
        C0829TC c0829tc = C0829TC.f2620a;
        if (floatingWindowInfo != null && floatingWindowInfo.isShowing()) {
            try {
                floatingWindowInfo.getWindowManager().removeView(floatingWindowInfo.getContainer());
                floatingWindowInfo.setShowing(false);
            } catch (Exception e) {
                AbstractC0213Ey.m411i(-307455233882165L, -307515363424309L, e);
            }
        }
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$108(Lua lua) {
        AbstractC0295Gu.m625r(-306153858791477L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        INSTANCE.runOnUiThread(new C0782S8(string, 0));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$108$lambda$107(String str) {
        FloatingWindowInfo floatingWindowInfoRemove = floatingWindows.remove(str);
        if (floatingWindowInfoRemove != null && floatingWindowInfoRemove.isShowing()) {
            try {
                floatingWindowInfoRemove.getWindowManager().removeView(floatingWindowInfoRemove.getContainer());
            } catch (Exception e) {
                AbstractC0213Ey.m411i(-305977765132341L, -306037894674485L, e);
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$11(Lua lua) {
        AbstractC0295Gu.m625r(-540766447335477L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-540775037270069L);
        }
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-540779332237365L);
        }
        if (!lua.isFunction(3)) {
            return 0;
        }
        lua.pushValue(3);
        INSTANCE.runOnUiThread(new C2265n8(string, string2, lua.ref(), lua));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$11$lambda$10(String str, String str2, Lua lua, int i) {
        Activity currentActivity = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        if (currentActivity != null && !currentActivity.isFinishing()) {
            new AlertDialog.Builder(currentActivity).setTitle(str).setMessage(str2).setPositiveButton(AbstractC0295Gu.m625r(-540740677531701L), new DialogInterfaceOnClickListenerC2179l8(lua, i, 4)).setNegativeButton(AbstractC0295Gu.m625r(-540753562433589L), new DialogInterfaceOnClickListenerC2179l8(lua, i, 5)).show();
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$11$lambda$10$lambda$7(Lua lua, int i, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        LuaLocks.INSTANCE.withLock(lua, new C1083Z8(lua, i, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$11$lambda$10$lambda$7$lambda$6(Lua lua, int i) {
        lua.refGet(i);
        lua.push(true);
        lua.pCall(1, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$11$lambda$10$lambda$9(Lua lua, int i, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 29));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$11$lambda$10$lambda$9$lambda$8(Lua lua, int i) {
        lua.refGet(i);
        lua.push(false);
        lua.pCall(1, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$110(Lua lua) {
        AbstractC0295Gu.m625r(-306162448726069L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        INSTANCE.runOnUiThread(new C0868U8(string, (int) lua.toNumber(2), (int) lua.toNumber(3), 1));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$110$lambda$109(String str, int i, int i2) {
        FloatingWindowInfo floatingWindowInfo = floatingWindows.get(str);
        C0829TC c0829tc = C0829TC.f2620a;
        if (floatingWindowInfo == null) {
            return c0829tc;
        }
        floatingWindowInfo.getParams().x = i;
        floatingWindowInfo.getParams().y = i2;
        if (floatingWindowInfo.isShowing()) {
            floatingWindowInfo.getWindowManager().updateViewLayout(floatingWindowInfo.getContainer(), floatingWindowInfo.getParams());
        }
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$112(Lua lua) {
        AbstractC0295Gu.m625r(-306171038660661L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        int number = (int) lua.toNumber(2);
        CherryViewAPI cherryViewAPI = INSTANCE;
        cherryViewAPI.runOnUiThread(new C0868U8(string, cherryViewAPI.m3294dp(number), cherryViewAPI.m3294dp((int) lua.toNumber(3)), 0));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$112$lambda$111(String str, int i, int i2) {
        FloatingWindowInfo floatingWindowInfo = floatingWindows.get(str);
        C0829TC c0829tc = C0829TC.f2620a;
        if (floatingWindowInfo == null) {
            return c0829tc;
        }
        floatingWindowInfo.getParams().width = i;
        floatingWindowInfo.getParams().height = i2;
        if (floatingWindowInfo.isShowing()) {
            floatingWindowInfo.getWindowManager().updateViewLayout(floatingWindowInfo.getContainer(), floatingWindowInfo.getParams());
        }
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$114(Lua lua) {
        AbstractC0295Gu.m625r(-306179628595253L);
        Set<String> setKeySet = floatingWindows.keySet();
        AbstractC0295Gu.m625r(-306188218529845L);
        List listM4908r0 = AbstractC2453ra.m4908r0(setKeySet);
        int i = 0;
        lua.createTable(listM4908r0.size(), 0);
        for (Object obj : listM4908r0) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2496sa.m4978c0();
                throw null;
            }
            lua.push((String) obj);
            lua.rawSetI(-2, i2);
            i = i2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$117(Lua lua) {
        AbstractC0295Gu.m625r(-306510341077045L);
        INSTANCE.runOnUiThread(new C1302d(6));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$117$lambda$116() {
        Collection<FloatingWindowInfo> collectionValues = floatingWindows.values();
        AbstractC0295Gu.m625r(-305707182192693L);
        for (FloatingWindowInfo floatingWindowInfo : collectionValues) {
            if (floatingWindowInfo.isShowing()) {
                try {
                    floatingWindowInfo.getWindowManager().removeView(floatingWindowInfo.getContainer());
                } catch (Exception e) {
                    AbstractC0213Ey.m411i(-305784491604021L, -305844621146165L, e);
                }
            }
        }
        floatingWindows.clear();
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$130(Lua lua) {
        AbstractC0295Gu.m625r(-306287002777653L);
        INSTANCE.runOnUiThread(new C1389f(3, lua.isTable(1) ? INSTANCE.readConfig(lua, 1) : C0495Lf.f1620a, lua));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$130$lambda$129(Map map, final Lua lua) {
        View view;
        Activity currentActivity = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        C0829TC c0829tc = C0829TC.f2620a;
        if (currentActivity != null && !currentActivity.isFinishing()) {
            Object obj = map.get(AbstractC0295Gu.m625r(-306518931011637L));
            String str = obj instanceof String ? (String) obj : null;
            Object obj2 = map.get(AbstractC0295Gu.m625r(-306544700815413L));
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            boolean z = !AbstractC0585Nj.m1134a(map.get(AbstractC0295Gu.m625r(-306566175651893L)), Boolean.FALSE);
            AlertDialog.Builder builder = new AlertDialog.Builder(currentActivity);
            if (str != null) {
                builder.setTitle(str);
            }
            if (str2 != null && (view = viewRefs.get(str2)) != null) {
                ViewParent parent = view.getParent();
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                }
                builder.setView(view);
            }
            builder.setCancelable(z);
            Object obj3 = map.get(AbstractC0295Gu.m625r(-306613420292149L));
            String str3 = obj3 instanceof String ? (String) obj3 : null;
            if (str3 != null) {
                Object obj4 = map.get(AbstractC0295Gu.m625r(-306677844801589L));
                final Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
                final int i = 0;
                builder.setPositiveButton(str3, new DialogInterface.OnClickListener() { // from class: V8
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        switch (i) {
                            case 0:
                                CherryViewAPI.register$lambda$130$lambda$129$lambda$124$lambda$123(num, lua, dialogInterface, i2);
                                break;
                            default:
                                CherryViewAPI.register$lambda$130$lambda$129$lambda$128$lambda$127(num, lua, dialogInterface, i2);
                                break;
                        }
                    }
                });
            }
            Object obj5 = map.get(AbstractC0295Gu.m625r(-306725089441845L));
            String str4 = obj5 instanceof String ? (String) obj5 : null;
            if (str4 != null) {
                Object obj6 = map.get(AbstractC0295Gu.m625r(-306239758137397L));
                final Integer num2 = obj6 instanceof Integer ? (Integer) obj6 : null;
                final int i2 = 1;
                builder.setNegativeButton(str4, new DialogInterface.OnClickListener() { // from class: V8
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i22) {
                        switch (i2) {
                            case 0:
                                CherryViewAPI.register$lambda$130$lambda$129$lambda$124$lambda$123(num2, lua, dialogInterface, i22);
                                break;
                            default:
                                CherryViewAPI.register$lambda$130$lambda$129$lambda$128$lambda$127(num2, lua, dialogInterface, i22);
                                break;
                        }
                    }
                });
            }
            builder.show();
        }
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$130$lambda$129$lambda$124$lambda$123(Integer num, Lua lua, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (num != null) {
            LuaLocks.INSTANCE.withLock(lua, new C1083Z8(lua, num.intValue(), 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: register$lambda$130$lambda$129$lambda$124$lambda$123$lambda$122$lambda$121 */
    public static final C0829TC m3323x7dea6f2b(Lua lua, int i) {
        lua.refGet(i);
        lua.pCall(0, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$130$lambda$129$lambda$128$lambda$127(Integer num, Lua lua, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (num != null) {
            LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, num.intValue(), 25));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: register$lambda$130$lambda$129$lambda$128$lambda$127$lambda$126$lambda$125 */
    public static final C0829TC m3324xb9f67a2b(Lua lua, int i) {
        lua.refGet(i);
        lua.pCall(0, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int register$lambda$18(final Lua lua) {
        String strM625r;
        int i;
        long j;
        AbstractC0295Gu.m625r(-540809397008437L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-540817986943029L);
        }
        final String str = string;
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-540822281910325L);
        }
        final String str2 = string2;
        if (lua.getTop() >= 4) {
            strM625r = lua.toString(3);
            j = strM625r == null ? -540826576877621L : -540830871844917L;
            i = lua.getTop() >= 4 ? 4 : 3;
            if (lua.isFunction(i)) {
                return 0;
            }
            lua.pushValue(i);
            final int iRef = lua.ref();
            final String str3 = strM625r;
            INSTANCE.runOnUiThread(new InterfaceC0884Ui() { // from class: Q8
                @Override // p000.InterfaceC0884Ui
                /* JADX INFO: renamed from: a */
                public final Object mo6a() {
                    return CherryViewAPI.register$lambda$18$lambda$17(str, str2, str3, lua, iRef);
                }
            });
            return 0;
        }
        strM625r = AbstractC0295Gu.m625r(j);
        if (lua.getTop() >= 4) {
        }
        if (lua.isFunction(i)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$18$lambda$17(String str, String str2, String str3, Lua lua, int i) {
        Activity currentActivity = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        if (currentActivity != null && !currentActivity.isFinishing()) {
            EditText editText = new EditText(currentActivity);
            editText.setText(str3);
            new AlertDialog.Builder(currentActivity).setTitle(str).setMessage(str2).setView(editText).setPositiveButton(AbstractC0295Gu.m625r(-540783627204661L), new DialogInterfaceOnClickListenerC0825T8(lua, i, editText, 1)).setNegativeButton(AbstractC0295Gu.m625r(-540796512106549L), new DialogInterfaceOnClickListenerC2179l8(lua, i, 7)).show();
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$18$lambda$17$lambda$14(Lua lua, int i, EditText editText, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        LuaLocks.INSTANCE.withLock(lua, new C0396J8(lua, i, editText, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$18$lambda$17$lambda$14$lambda$13(Lua lua, int i, EditText editText) {
        lua.refGet(i);
        lua.push(editText.getText().toString());
        lua.pCall(1, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$18$lambda$17$lambda$16(Lua lua, int i, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        LuaLocks.INSTANCE.withLock(lua, new C1083Z8(lua, i, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$18$lambda$17$lambda$16$lambda$15(Lua lua, int i) {
        lua.refGet(i);
        lua.pushNil();
        lua.pCall(1, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$25(Lua lua) {
        AbstractC0295Gu.m625r(-540848051714101L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-540856641648693L);
        }
        if (lua.isTable(2) && lua.isFunction(3)) {
            ArrayList arrayList = new ArrayList();
            lua.pushValue(2);
            lua.pushNil();
            while (lua.next(-2) != 0) {
                String string2 = lua.toString(-1);
                if (string2 != null) {
                    arrayList.add(string2);
                }
                lua.pop(1);
            }
            lua.pop(1);
            lua.pushValue(3);
            INSTANCE.runOnUiThread(new C1127a9(string, arrayList, lua, lua.ref()));
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$25$lambda$24(String str, List list, Lua lua, int i) {
        Activity currentActivity = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        if (currentActivity != null && !currentActivity.isFinishing()) {
            new AlertDialog.Builder(currentActivity).setTitle(str).setItems((CharSequence[]) list.toArray(new String[0]), new DialogInterfaceOnClickListenerC0825T8(lua, i, list, 0)).setNegativeButton(AbstractC0295Gu.m625r(-540835166812213L), new DialogInterfaceOnClickListenerC2179l8(lua, i, 3)).show();
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$25$lambda$24$lambda$21(final Lua lua, final int i, final List list, DialogInterface dialogInterface, final int i2) {
        dialogInterface.dismiss();
        LuaLocks.INSTANCE.withLock(lua, new InterfaceC0884Ui() { // from class: X8
            @Override // p000.InterfaceC0884Ui
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                return CherryViewAPI.register$lambda$25$lambda$24$lambda$21$lambda$20(lua, i, i2, list);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$25$lambda$24$lambda$21$lambda$20(Lua lua, int i, int i2, List list) {
        lua.refGet(i);
        lua.push(Double.valueOf(i2 + 1));
        lua.push((String) list.get(i2));
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$25$lambda$24$lambda$23(Lua lua, int i, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        LuaLocks.INSTANCE.withLock(lua, new C1083Z8(lua, i, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$25$lambda$24$lambda$23$lambda$22(Lua lua, int i) {
        lua.refGet(i);
        lua.pushNil();
        lua.pushNil();
        lua.pCall(2, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$26(Lua lua) {
        AbstractC0295Gu.m625r(-540860936615989L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = cherryGlobalAPI.getCurrentContext();
        }
        if (currentActivity != null) {
            try {
                Intent intent = new Intent(AbstractC0295Gu.m625r(-540869526550581L), Uri.parse(string));
                intent.addFlags(268435456);
                currentActivity.startActivity(intent);
                lua.push(true);
            } catch (Exception unused) {
                lua.push(false);
            }
        } else {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$27(Lua lua) {
        AbstractC0295Gu.m625r(-540435734853685L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = cherryGlobalAPI.getCurrentContext();
        }
        if (currentActivity != null) {
            try {
                Intent intent = new Intent();
                intent.setClassName(currentActivity.getPackageName(), string);
                intent.addFlags(268435456);
                currentActivity.startActivity(intent);
                lua.push(true);
            } catch (Exception unused) {
                lua.push(false);
            }
        } else {
            lua.push(false);
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$28(Lua lua) {
        AbstractC0295Gu.m625r(-540444324788277L);
        Activity currentActivity = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        if (currentActivity != null) {
            lua.push(currentActivity, Lua.Conversion.SEMI);
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$29(Lua lua) {
        AbstractC0295Gu.m625r(-540452914722869L);
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        if (currentActivity == null) {
            currentActivity = cherryGlobalAPI.getCurrentContext();
        }
        if (currentActivity != null) {
            lua.push(currentActivity, Lua.Conversion.SEMI);
            return 1;
        }
        lua.pushNil();
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$32(Lua lua) {
        AbstractC0295Gu.m625r(-540461504657461L);
        if (!lua.isFunction(1)) {
            return 0;
        }
        lua.pushValue(1);
        INSTANCE.runOnUiThread(new C2087j8(lua, lua.ref(), 26));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$32$lambda$31(Lua lua, int i) {
        LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 27));
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$32$lambda$31$lambda$30(Lua lua, int i) {
        lua.refGet(i);
        lua.pCall(0, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$33(Lua lua) {
        AbstractC0295Gu.m625r(-540470094592053L);
        lua.push(AbstractC0585Nj.m1134a(Looper.myLooper(), Looper.getMainLooper()));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$41(Lua lua) {
        AbstractC0295Gu.m625r(-539168719501365L);
        Map<String, Object> config = lua.isTable(1) ? INSTANCE.readConfig(lua, 1) : C0495Lf.f1620a;
        CherryViewAPI cherryViewAPI = INSTANCE;
        String strGenerateViewId = cherryViewAPI.generateViewId();
        cherryViewAPI.runOnUiThread(new C0654P8(strGenerateViewId, config, lua, 1));
        lua.push(strGenerateViewId);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$41$lambda$40(String str, Map map, Lua lua) {
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        C0829TC c0829tc = C0829TC.f2620a;
        if (currentActivity == null && (currentActivity = cherryGlobalAPI.getCurrentContext()) == null) {
            return c0829tc;
        }
        TextView textView = new TextView(currentActivity);
        Object obj = map.get(AbstractC0295Gu.m625r(-540478684526645L));
        String strM625r = obj instanceof String ? (String) obj : null;
        if (strM625r == null) {
            strM625r = AbstractC0295Gu.m625r(-540500159363125L);
        }
        textView.setText(strM625r);
        Object obj2 = map.get(AbstractC0295Gu.m625r(-540504454330421L));
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        textView.setTextSize(number != null ? number.floatValue() : 14.0f);
        CherryViewAPI cherryViewAPI = INSTANCE;
        Object obj3 = map.get(AbstractC0295Gu.m625r(-540543109036085L));
        textView.setTextColor(cherryViewAPI.parseColor(obj3 instanceof String ? (String) obj3 : null, -1));
        Object obj4 = map.get(AbstractC0295Gu.m625r(-540586058709045L));
        textView.setGravity(cherryViewAPI.parseGravity(obj4 instanceof String ? (String) obj4 : null));
        Object obj5 = map.get(AbstractC0295Gu.m625r(-540620418447413L));
        String str2 = obj5 instanceof String ? (String) obj5 : null;
        if (str2 != null) {
            textView.setBackgroundColor(cherryViewAPI.parseColor(str2, 0));
        }
        Object obj6 = map.get(AbstractC0295Gu.m625r(-539039870482485L));
        Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
        int iM3294dp = number2 != null ? cherryViewAPI.m3294dp(number2.intValue()) : 0;
        textView.setPadding(iM3294dp, iM3294dp, iM3294dp, iM3294dp);
        if (AbstractC0585Nj.m1134a(map.get(AbstractC0295Gu.m625r(-539074230220853L)), Boolean.TRUE)) {
            textView.setTypeface(Typeface.DEFAULT_BOLD);
        }
        Object obj7 = map.get(AbstractC0295Gu.m625r(-539095705057333L));
        Number number3 = obj7 instanceof Number ? (Number) obj7 : null;
        if (number3 != null) {
            textView.setMaxLines(number3.intValue());
        }
        Object obj8 = map.get(AbstractC0295Gu.m625r(-539134359762997L));
        Integer num = obj8 instanceof Integer ? (Integer) obj8 : null;
        if (num != null) {
            textView.setOnClickListener(new ViewOnClickListenerC0482L8(lua, num.intValue(), str, 2));
        }
        viewRefs.put(str, textView);
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37(Lua lua, int i, String str, View view) {
        LuaLocks.INSTANCE.withLock(lua, new C0181E8(lua, i, str, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: register$lambda$41$lambda$40$lambda$39$lambda$38$lambda$37$lambda$36 */
    public static final C0829TC m3325xed14eec4(Lua lua, int i, String str) {
        lua.refGet(i);
        lua.push(str);
        lua.pCall(1, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$49(Lua lua) {
        AbstractC0295Gu.m625r(-539615396100149L);
        Map<String, Object> config = lua.isTable(1) ? INSTANCE.readConfig(lua, 1) : C0495Lf.f1620a;
        CherryViewAPI cherryViewAPI = INSTANCE;
        String strGenerateViewId = cherryViewAPI.generateViewId();
        cherryViewAPI.runOnUiThread(new C0654P8(strGenerateViewId, config, lua, 0));
        lua.push(strGenerateViewId);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0829TC register$lambda$49$lambda$48(String str, Map map, Lua lua) {
        ImageView.ScaleType scaleType;
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        C0829TC c0829tc = C0829TC.f2620a;
        if (currentActivity == null && (currentActivity = cherryGlobalAPI.getCurrentContext()) == null) {
            return c0829tc;
        }
        ImageView imageView = new ImageView(currentActivity);
        Object obj = map.get(AbstractC0295Gu.m625r(-539177309435957L));
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            if (str2.startsWith(AbstractC0295Gu.m625r(-539194489305141L)) || str2.startsWith(AbstractC0295Gu.m625r(-539228849043509L))) {
                INSTANCE.loadImageFromUrl(imageView, str2);
            } else if (new File(str2).exists()) {
                imageView.setImageBitmap(BitmapFactory.decodeFile(str2));
            }
        }
        Object obj2 = map.get(AbstractC0295Gu.m625r(-539267503749173L));
        String str3 = obj2 instanceof String ? (String) obj2 : null;
        if (str3 != null) {
            switch (str3.hashCode()) {
                case -1364013995:
                    scaleType = !str3.equals(AbstractC0295Gu.m625r(-538816532183093L)) ? ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.CENTER;
                    break;
                case -340708175:
                    if (str3.equals(AbstractC0295Gu.m625r(-539310453422133L))) {
                        scaleType = ImageView.ScaleType.CENTER_INSIDE;
                        break;
                    }
                    break;
                case 97441490:
                    if (str3.equals(AbstractC0295Gu.m625r(-538889546627125L))) {
                        scaleType = ImageView.ScaleType.FIT_XY;
                        break;
                    }
                    break;
                case 520762310:
                    if (str3.equals(AbstractC0295Gu.m625r(-538846596954165L))) {
                        scaleType = ImageView.ScaleType.FIT_CENTER;
                        break;
                    }
                    break;
                case 1161480325:
                    if (str3.equals(AbstractC0295Gu.m625r(-538915316430901L))) {
                        scaleType = ImageView.ScaleType.CENTER_CROP;
                        break;
                    }
                    break;
            }
        }
        imageView.setScaleType(scaleType);
        Object obj3 = map.get(AbstractC0295Gu.m625r(-538962561071157L));
        String str4 = obj3 instanceof String ? (String) obj3 : null;
        if (str4 != null) {
            imageView.setBackgroundColor(INSTANCE.parseColor(str4, 0));
        }
        Object obj4 = map.get(AbstractC0295Gu.m625r(-539031280547893L));
        Integer num = obj4 instanceof Integer ? (Integer) obj4 : null;
        if (num != null) {
            imageView.setOnClickListener(new ViewOnClickListenerC0482L8(lua, num.intValue(), str, 1));
        }
        viewRefs.put(str, imageView);
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45(Lua lua, int i, String str, View view) {
        LuaLocks.INSTANCE.withLock(lua, new C0181E8(lua, i, str, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: register$lambda$49$lambda$48$lambda$47$lambda$46$lambda$45$lambda$44 */
    public static final C0829TC m3326x1809f3c8(Lua lua, int i, String str) {
        lua.refGet(i);
        lua.push(str);
        lua.pCall(1, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$5(Lua lua) {
        int iRef;
        AbstractC0295Gu.m625r(-540723497662517L);
        String string = lua.toString(1);
        if (string == null) {
            string = AbstractC0295Gu.m625r(-540732087597109L);
        }
        String str = string;
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-540736382564405L);
        }
        String str2 = string2;
        if (lua.getTop() < 3 || !lua.isFunction(3)) {
            iRef = -1;
        } else {
            lua.pushValue(3);
            iRef = lua.ref();
        }
        INSTANCE.runOnUiThread(new C2265n8(str, str2, iRef, lua, 3));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$5$lambda$4(String str, String str2, int i, Lua lua) {
        Activity currentActivity = CherryGlobalAPI.INSTANCE.getCurrentActivity();
        if (currentActivity != null && !currentActivity.isFinishing()) {
            new AlertDialog.Builder(currentActivity).setTitle(str).setMessage(str2).setPositiveButton(AbstractC0295Gu.m625r(-540710612760629L), new DialogInterfaceOnClickListenerC2179l8(i, lua, 6)).show();
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$5$lambda$4$lambda$3(int i, Lua lua, DialogInterface dialogInterface, int i2) {
        dialogInterface.dismiss();
        if (i != -1) {
            LuaLocks.INSTANCE.withLock(lua, new C2087j8(lua, i, 28));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$5$lambda$4$lambda$3$lambda$2(Lua lua, int i) {
        lua.refGet(i);
        lua.push(true);
        lua.pCall(1, 0);
        lua.unref(i);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$56(Lua lua) {
        AbstractC0295Gu.m625r(-539435007473717L);
        Map<String, Object> config = lua.isTable(1) ? INSTANCE.readConfig(lua, 1) : C0495Lf.f1620a;
        CherryViewAPI cherryViewAPI = INSTANCE;
        String strGenerateViewId = cherryViewAPI.generateViewId();
        cherryViewAPI.runOnUiThread(new C0654P8(strGenerateViewId, config, lua, 2));
        lua.push(strGenerateViewId);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$56$lambda$55(String str, Map map, Lua lua) {
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        C0829TC c0829tc = C0829TC.f2620a;
        if (currentActivity == null && (currentActivity = cherryGlobalAPI.getCurrentContext()) == null) {
            return c0829tc;
        }
        Button button = new Button(currentActivity);
        Object obj = map.get(AbstractC0295Gu.m625r(-539623986034741L));
        String strM625r = obj instanceof String ? (String) obj : null;
        if (strM625r == null) {
            strM625r = AbstractC0295Gu.m625r(-539645460871221L);
        }
        button.setText(strM625r);
        Object obj2 = map.get(AbstractC0295Gu.m625r(-539675525642293L));
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        button.setTextSize(number != null ? number.floatValue() : 14.0f);
        CherryViewAPI cherryViewAPI = INSTANCE;
        Object obj3 = map.get(AbstractC0295Gu.m625r(-539714180347957L));
        button.setTextColor(cherryViewAPI.parseColor(obj3 instanceof String ? (String) obj3 : null, -1));
        Object obj4 = map.get(AbstractC0295Gu.m625r(-539757130020917L));
        int color = cherryViewAPI.parseColor(obj4 instanceof String ? (String) obj4 : null, Color.parseColor(AbstractC0295Gu.m625r(-539825849497653L)));
        Object obj5 = map.get(AbstractC0295Gu.m625r(-539860209236021L));
        Number number2 = obj5 instanceof Number ? (Number) obj5 : null;
        float fM3293dp = cherryViewAPI.m3293dp(number2 != null ? number2.floatValue() : 8.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadius(fM3293dp);
        button.setBackground(gradientDrawable);
        Object obj6 = map.get(AbstractC0295Gu.m625r(-539366287996981L));
        Number number3 = obj6 instanceof Number ? (Number) obj6 : null;
        int iM3294dp = cherryViewAPI.m3294dp(number3 != null ? number3.intValue() : 12);
        int i = iM3294dp / 2;
        button.setPadding(iM3294dp, i, iM3294dp, i);
        button.setAllCaps(false);
        Object obj7 = map.get(AbstractC0295Gu.m625r(-539400647735349L));
        Integer num = obj7 instanceof Integer ? (Integer) obj7 : null;
        if (num != null) {
            button.setOnClickListener(new ViewOnClickListenerC0482L8(lua, num.intValue(), str, 0));
        }
        viewRefs.put(str, button);
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void register$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52(Lua lua, int i, String str, View view) {
        LuaLocks.INSTANCE.withLock(lua, new C0181E8(lua, i, str, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: register$lambda$56$lambda$55$lambda$54$lambda$53$lambda$52$lambda$51 */
    public static final C0829TC m3327xcffa3770(Lua lua, int i, String str) {
        lua.refGet(i);
        lua.push(str);
        lua.pCall(1, 0);
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$61(Lua lua) {
        AbstractC0295Gu.m625r(-538159402186805L);
        Map<String, Object> config = lua.isTable(1) ? INSTANCE.readConfig(lua, 1) : C0495Lf.f1620a;
        CherryViewAPI cherryViewAPI = INSTANCE;
        String strGenerateViewId = cherryViewAPI.generateViewId();
        cherryViewAPI.runOnUiThread(new C0568N8(strGenerateViewId, config, 4));
        lua.push(strGenerateViewId);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$61$lambda$60(String str, Map map) {
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        C0829TC c0829tc = C0829TC.f2620a;
        if (currentActivity == null && (currentActivity = cherryGlobalAPI.getCurrentContext()) == null) {
            return c0829tc;
        }
        EditText editText = new EditText(currentActivity);
        Object obj = map.get(AbstractC0295Gu.m625r(-539443597408309L));
        String strM625r = obj instanceof String ? (String) obj : null;
        if (strM625r == null) {
            strM625r = AbstractC0295Gu.m625r(-539465072244789L);
        }
        editText.setText(strM625r);
        Object obj2 = map.get(AbstractC0295Gu.m625r(-539469367212085L));
        String strM625r2 = obj2 instanceof String ? (String) obj2 : null;
        if (strM625r2 == null) {
            strM625r2 = AbstractC0295Gu.m625r(-539490842048565L);
        }
        editText.setHint(strM625r2);
        Object obj3 = map.get(AbstractC0295Gu.m625r(-539495137015861L));
        Number number = obj3 instanceof Number ? (Number) obj3 : null;
        editText.setTextSize(number != null ? number.floatValue() : 14.0f);
        CherryViewAPI cherryViewAPI = INSTANCE;
        Object obj4 = map.get(AbstractC0295Gu.m625r(-539533791721525L));
        editText.setTextColor(cherryViewAPI.parseColor(obj4 instanceof String ? (String) obj4 : null, -1));
        Object obj5 = map.get(AbstractC0295Gu.m625r(-539576741394485L));
        editText.setHintTextColor(cherryViewAPI.parseColor(obj5 instanceof String ? (String) obj5 : null, -7829368));
        Object obj6 = map.get(AbstractC0295Gu.m625r(-537970423625781L));
        String str2 = obj6 instanceof String ? (String) obj6 : null;
        if (str2 != null) {
            editText.setBackgroundColor(cherryViewAPI.parseColor(str2, 0));
        }
        Object obj7 = map.get(AbstractC0295Gu.m625r(-538039143102517L));
        Number number2 = obj7 instanceof Number ? (Number) obj7 : null;
        int iM3294dp = cherryViewAPI.m3294dp(number2 != null ? number2.intValue() : 8);
        editText.setPadding(iM3294dp, iM3294dp, iM3294dp, iM3294dp);
        Object obj8 = map.get(AbstractC0295Gu.m625r(-538073502840885L));
        Number number3 = obj8 instanceof Number ? (Number) obj8 : null;
        if (number3 != null) {
            editText.setMaxLines(number3.intValue());
        }
        editText.setSingleLine(AbstractC0585Nj.m1134a(map.get(AbstractC0295Gu.m625r(-538112157546549L)), Boolean.TRUE));
        viewRefs.put(str, editText);
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$65(Lua lua) {
        AbstractC0295Gu.m625r(-537854459508789L);
        Map<String, Object> config = lua.isTable(1) ? INSTANCE.readConfig(lua, 1) : C0495Lf.f1620a;
        CherryViewAPI cherryViewAPI = INSTANCE;
        String strGenerateViewId = cherryViewAPI.generateViewId();
        cherryViewAPI.runOnUiThread(new C0568N8(strGenerateViewId, config, 3));
        lua.push(strGenerateViewId);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$65$lambda$64(String str, Map map) {
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        C0829TC c0829tc = C0829TC.f2620a;
        if (currentActivity == null && (currentActivity = cherryGlobalAPI.getCurrentContext()) == null) {
            return c0829tc;
        }
        LinearLayout linearLayout = new LinearLayout(currentActivity);
        linearLayout.setOrientation(!AbstractC0585Nj.m1134a(map.get(AbstractC0295Gu.m625r(-538167992121397L)), AbstractC0295Gu.m625r(-537669775915061L)) ? 1 : 0);
        CherryViewAPI cherryViewAPI = INSTANCE;
        Object obj = map.get(AbstractC0295Gu.m625r(-537717020555317L));
        linearLayout.setGravity(cherryViewAPI.parseGravity(obj instanceof String ? (String) obj : null));
        Object obj2 = map.get(AbstractC0295Gu.m625r(-537751380293685L));
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        if (str2 != null) {
            linearLayout.setBackgroundColor(cherryViewAPI.parseColor(str2, 0));
        }
        Object obj3 = map.get(AbstractC0295Gu.m625r(-537820099770421L));
        Number number = obj3 instanceof Number ? (Number) obj3 : null;
        int iM3294dp = number != null ? cherryViewAPI.m3294dp(number.intValue()) : 0;
        linearLayout.setPadding(iM3294dp, iM3294dp, iM3294dp, iM3294dp);
        viewRefs.put(str, linearLayout);
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$69(Lua lua) {
        AbstractC0295Gu.m625r(-538515884472373L);
        Map<String, Object> config = lua.isTable(1) ? INSTANCE.readConfig(lua, 1) : C0495Lf.f1620a;
        CherryViewAPI cherryViewAPI = INSTANCE;
        String strGenerateViewId = cherryViewAPI.generateViewId();
        cherryViewAPI.runOnUiThread(new C0568N8(strGenerateViewId, config, 2));
        lua.push(strGenerateViewId);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$69$lambda$68(String str, Map map) {
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        C0829TC c0829tc = C0829TC.f2620a;
        if (currentActivity == null && (currentActivity = cherryGlobalAPI.getCurrentContext()) == null) {
            return c0829tc;
        }
        FrameLayout frameLayout = new FrameLayout(currentActivity);
        Object obj = map.get(AbstractC0295Gu.m625r(-537863049443381L));
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            frameLayout.setBackgroundColor(INSTANCE.parseColor(str2, 0));
        }
        Object obj2 = map.get(AbstractC0295Gu.m625r(-537931768920117L));
        Number number = obj2 instanceof Number ? (Number) obj2 : null;
        int iM3294dp = number != null ? INSTANCE.m3294dp(number.intValue()) : 0;
        frameLayout.setPadding(iM3294dp, iM3294dp, iM3294dp, iM3294dp);
        viewRefs.put(str, frameLayout);
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$73(Lua lua) {
        AbstractC0295Gu.m625r(-538649028458549L);
        Map<String, Object> config = lua.isTable(1) ? INSTANCE.readConfig(lua, 1) : C0495Lf.f1620a;
        CherryViewAPI cherryViewAPI = INSTANCE;
        String strGenerateViewId = cherryViewAPI.generateViewId();
        cherryViewAPI.runOnUiThread(new C0568N8(strGenerateViewId, config, 0));
        lua.push(strGenerateViewId);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$73$lambda$72(String str, Map map) {
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        C0829TC c0829tc = C0829TC.f2620a;
        if (currentActivity == null && (currentActivity = cherryGlobalAPI.getCurrentContext()) == null) {
            return c0829tc;
        }
        ScrollView scrollView = new ScrollView(currentActivity);
        scrollView.setFillViewport(!AbstractC0585Nj.m1134a(map.get(AbstractC0295Gu.m625r(-538524474406965L)), Boolean.FALSE));
        Object obj = map.get(AbstractC0295Gu.m625r(-538580308981813L));
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 != null) {
            scrollView.setBackgroundColor(INSTANCE.parseColor(str2, 0));
        }
        viewRefs.put(str, scrollView);
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$77(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-537485092321333L);
        String string2 = lua.toString(1);
        if (string2 == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        INSTANCE.runOnUiThread(new C0525M8(string2, string, (lua.getTop() < 3 || !lua.isTable(3)) ? C0495Lf.f1620a : INSTANCE.readConfig(lua, 3), 0));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$77$lambda$76(String str, String str2, Map map) {
        View view;
        int iM3294dp;
        int iM3294dp2;
        ViewGroup.LayoutParams layoutParams;
        ConcurrentHashMap<String, View> concurrentHashMap = viewRefs;
        View view2 = concurrentHashMap.get(str);
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        C0829TC c0829tc = C0829TC.f2620a;
        if (viewGroup == null || (view = concurrentHashMap.get(str2)) == null) {
            return c0829tc;
        }
        Object obj = map.get(AbstractC0295Gu.m625r(-538657618393141L));
        int iM3294dp3 = -1;
        if (AbstractC0585Nj.m1134a(obj, AbstractC0295Gu.m625r(-538683388196917L)) || AbstractC0585Nj.m1134a(obj, AbstractC0295Gu.m625r(-538709158000693L))) {
            iM3294dp = -1;
        } else if (AbstractC0585Nj.m1134a(obj, AbstractC0295Gu.m625r(-538215236761653L)) || AbstractC0585Nj.m1134a(obj, AbstractC0295Gu.m625r(-538236711598133L)) || !(obj instanceof Number)) {
            iM3294dp = -2;
        } else {
            CherryViewAPI cherryViewAPI = INSTANCE;
            Object obj2 = map.get(AbstractC0295Gu.m625r(-538292546172981L));
            AbstractC0295Gu.m625r(-538318315976757L);
            iM3294dp = cherryViewAPI.m3294dp(((Number) obj2).intValue());
        }
        Object obj3 = map.get(AbstractC0295Gu.m625r(-536888091867189L));
        if (!AbstractC0585Nj.m1134a(obj3, AbstractC0295Gu.m625r(-536918156638261L)) && !AbstractC0585Nj.m1134a(obj3, AbstractC0295Gu.m625r(-536943926442037L))) {
            if (AbstractC0585Nj.m1134a(obj3, AbstractC0295Gu.m625r(-536999761016885L)) || AbstractC0585Nj.m1134a(obj3, AbstractC0295Gu.m625r(-537021235853365L)) || !(obj3 instanceof Number)) {
                iM3294dp3 = -2;
            } else {
                CherryViewAPI cherryViewAPI2 = INSTANCE;
                Object obj4 = map.get(AbstractC0295Gu.m625r(-537077070428213L));
                AbstractC0295Gu.m625r(-537107135199285L);
                iM3294dp3 = cherryViewAPI2.m3294dp(((Number) obj4).intValue());
            }
        }
        if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iM3294dp, iM3294dp3);
            Object obj5 = map.get(AbstractC0295Gu.m625r(-536776422717493L));
            Number number = obj5 instanceof Number ? (Number) obj5 : null;
            layoutParams2.weight = number != null ? number.floatValue() : 0.0f;
            Object obj6 = map.get(AbstractC0295Gu.m625r(-536806487488565L));
            Number number2 = obj6 instanceof Number ? (Number) obj6 : null;
            iM3294dp2 = number2 != null ? INSTANCE.m3294dp(number2.intValue()) : 0;
            layoutParams2.setMargins(iM3294dp2, iM3294dp2, iM3294dp2, iM3294dp2);
            CherryViewAPI cherryViewAPI3 = INSTANCE;
            Object obj7 = map.get(AbstractC0295Gu.m625r(-536836552259637L));
            layoutParams2.gravity = cherryViewAPI3.parseGravity(obj7 instanceof String ? (String) obj7 : null);
            layoutParams = layoutParams2;
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(iM3294dp, iM3294dp3);
            Object obj8 = map.get(AbstractC0295Gu.m625r(-537420667811893L));
            Number number3 = obj8 instanceof Number ? (Number) obj8 : null;
            iM3294dp2 = number3 != null ? INSTANCE.m3294dp(number3.intValue()) : 0;
            layoutParams3.setMargins(iM3294dp2, iM3294dp2, iM3294dp2, iM3294dp2);
            CherryViewAPI cherryViewAPI4 = INSTANCE;
            Object obj9 = map.get(AbstractC0295Gu.m625r(-537450732582965L));
            layoutParams3.gravity = cherryViewAPI4.parseGravity(obj9 instanceof String ? (String) obj9 : null);
            layoutParams = layoutParams3;
        } else {
            layoutParams = new ViewGroup.LayoutParams(iM3294dp, iM3294dp3);
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.addView(view, layoutParams);
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$79(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-537493682255925L);
        String string2 = lua.toString(1);
        if (string2 == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        INSTANCE.runOnUiThread(new C0611O8(4, string2, string));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$79$lambda$78(String str, String str2) {
        View view;
        ConcurrentHashMap<String, View> concurrentHashMap = viewRefs;
        View view2 = concurrentHashMap.get(str);
        ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
        C0829TC c0829tc = C0829TC.f2620a;
        if (viewGroup == null || (view = concurrentHashMap.get(str2)) == null) {
            return c0829tc;
        }
        viewGroup.removeView(view);
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$81(Lua lua) {
        AbstractC0295Gu.m625r(-537502272190517L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-537510862125109L);
        }
        INSTANCE.runOnUiThread(new C0611O8(3, string, string2));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$81$lambda$80(String str, String str2) {
        View view = viewRefs.get(str);
        if (view instanceof TextView) {
            ((TextView) view).setText(str2);
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$82(Lua lua) {
        AbstractC0295Gu.m625r(-537515157092405L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        View view = viewRefs.get(string);
        if (view instanceof TextView) {
            lua.push(((TextView) view).getText().toString());
        } else {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$84(Lua lua) {
        AbstractC0295Gu.m625r(-537523747026997L);
        final String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        final boolean z = lua.toBoolean(2);
        INSTANCE.runOnUiThread(new InterfaceC0884Ui() { // from class: Y8
            @Override // p000.InterfaceC0884Ui
            /* JADX INFO: renamed from: a */
            public final Object mo6a() {
                return CherryViewAPI.register$lambda$84$lambda$83(string, z);
            }
        });
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$84$lambda$83(String str, boolean z) {
        View view = viewRefs.get(str);
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$86(Lua lua) {
        AbstractC0295Gu.m625r(-537532336961589L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        String string2 = lua.toString(2);
        if (string2 == null) {
            string2 = AbstractC0295Gu.m625r(-537540926896181L);
        }
        INSTANCE.runOnUiThread(new C0611O8(2, string, string2));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$86$lambda$85(String str, String str2) {
        View view = viewRefs.get(str);
        if (view != null) {
            view.setBackgroundColor(INSTANCE.parseColor(str2, -1));
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$87(Lua lua) {
        AbstractC0295Gu.m625r(-537575286634549L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        View view = viewRefs.get(string);
        if (view != null) {
            lua.push(view, Lua.Conversion.SEMI);
        } else {
            lua.pushNil();
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$89(Lua lua) {
        String string;
        AbstractC0295Gu.m625r(-537656891013173L);
        String string2 = lua.toString(1);
        if (string2 == null || (string = lua.toString(2)) == null) {
            return 0;
        }
        INSTANCE.runOnUiThread(new C0611O8(5, string2, string));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$89$lambda$88(String str, String str2) {
        View view = viewRefs.get(str);
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        C0829TC c0829tc = C0829TC.f2620a;
        if (imageView != null) {
            if (str2.startsWith(AbstractC0295Gu.m625r(-537583876569141L)) || str2.startsWith(AbstractC0295Gu.m625r(-537618236307509L))) {
                INSTANCE.loadImageFromUrl(imageView, str2);
                return c0829tc;
            }
            if (new File(str2).exists()) {
                imageView.setImageBitmap(BitmapFactory.decodeFile(str2));
            }
        }
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$92(Lua lua) {
        AbstractC0295Gu.m625r(-537115725133877L);
        String string = lua.toString(1);
        if (string == null) {
            return 0;
        }
        INSTANCE.runOnUiThread(new C0782S8(string, 1));
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$92$lambda$91(String str) {
        View viewRemove = viewRefs.remove(str);
        if (viewRemove != null) {
            ViewParent parent = viewRemove.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(viewRemove);
            }
        }
        return C0829TC.f2620a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int register$lambda$99(Lua lua) {
        AbstractC0295Gu.m625r(-307781651396661L);
        Map<String, Object> config = lua.isTable(1) ? INSTANCE.readConfig(lua, 1) : C0495Lf.f1620a;
        String str = AbstractC0295Gu.m625r(-307790241331253L) + windowIdCounter.incrementAndGet();
        INSTANCE.runOnUiThreadSync(new C0568N8(str, config));
        lua.push(str);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC register$lambda$99$lambda$98(Map map, String str) {
        CherryGlobalAPI cherryGlobalAPI = CherryGlobalAPI.INSTANCE;
        Context currentActivity = cherryGlobalAPI.getCurrentActivity();
        C0829TC c0829tc = C0829TC.f2620a;
        if (currentActivity == null && (currentActivity = cherryGlobalAPI.getCurrentContext()) == null) {
            return c0829tc;
        }
        final Context context = currentActivity;
        Object obj = map.get(AbstractC0295Gu.m625r(-307081571727413L));
        Number number = obj instanceof Number ? (Number) obj : null;
        int iM3294dp = number != null ? INSTANCE.m3294dp(number.intValue()) : -2;
        Object obj2 = map.get(AbstractC0295Gu.m625r(-307107341531189L));
        Number number2 = obj2 instanceof Number ? (Number) obj2 : null;
        int iM3294dp2 = number2 != null ? INSTANCE.m3294dp(number2.intValue()) : -2;
        Object obj3 = map.get(AbstractC0295Gu.m625r(-307137406302261L));
        Number number3 = obj3 instanceof Number ? (Number) obj3 : null;
        int iIntValue = number3 != null ? number3.intValue() : 0;
        Object obj4 = map.get(AbstractC0295Gu.m625r(-307145996236853L));
        Number number4 = obj4 instanceof Number ? (Number) obj4 : null;
        int iIntValue2 = number4 != null ? number4.intValue() : 100;
        boolean zM1134a = AbstractC0585Nj.m1134a(map.get(AbstractC0295Gu.m625r(-307154586171445L)), Boolean.FALSE);
        final WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(iM3294dp, iM3294dp2, 2038, 520, -3);
        layoutParams.gravity = 8388659;
        layoutParams.x = iIntValue;
        layoutParams.y = iIntValue2;
        final FrameLayout frameLayout = new FrameLayout(context);
        Object obj5 = map.get(AbstractC0295Gu.m625r(-307197535844405L));
        String str2 = obj5 instanceof String ? (String) obj5 : null;
        if (str2 != null) {
            frameLayout.setBackgroundColor(INSTANCE.parseColor(str2, Color.parseColor(AbstractC0295Gu.m625r(-307266255321141L))));
        }
        Object obj6 = map.get(AbstractC0295Gu.m625r(-307309204994101L));
        Number number5 = obj6 instanceof Number ? (Number) obj6 : null;
        float fM3293dp = number5 != null ? INSTANCE.m3293dp(number5.floatValue()) : INSTANCE.m3293dp(12.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        CherryViewAPI cherryViewAPI = INSTANCE;
        Object obj7 = map.get(AbstractC0295Gu.m625r(-306815283755061L));
        gradientDrawable.setColor(cherryViewAPI.parseColor(obj7 instanceof String ? (String) obj7 : null, Color.parseColor(AbstractC0295Gu.m625r(-306884003231797L))));
        gradientDrawable.setCornerRadius(fM3293dp);
        frameLayout.setBackground(gradientDrawable);
        if (!zM1134a) {
            final C0339Hv c0339Hv = new C0339Hv();
            final C0339Hv c0339Hv2 = new C0339Hv();
            final C0296Gv c0296Gv = new C0296Gv();
            final C0296Gv c0296Gv2 = new C0296Gv();
            frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: R8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return CherryViewAPI.register$lambda$99$lambda$98$lambda$97(context, c0339Hv, layoutParams, c0339Hv2, c0296Gv, c0296Gv2, frameLayout, view, motionEvent);
                }
            });
        }
        Object systemService = context.getSystemService(AbstractC0295Gu.m625r(-306926952904757L));
        AbstractC0295Gu.m625r(-306957017675829L);
        floatingWindows.put(str, new FloatingWindowInfo(str, frameLayout, layoutParams, (WindowManager) systemService, false));
        return c0829tc;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean register$lambda$99$lambda$98$lambda$97(Context context, C0339Hv c0339Hv, WindowManager.LayoutParams layoutParams, C0339Hv c0339Hv2, C0296Gv c0296Gv, C0296Gv c0296Gv2, FrameLayout frameLayout, View view, MotionEvent motionEvent) {
        Object systemService = context.getSystemService(AbstractC0295Gu.m625r(-537124315068469L));
        AbstractC0295Gu.m625r(-537154379839541L);
        WindowManager windowManager = (WindowManager) systemService;
        int action = motionEvent.getAction();
        if (action == 0) {
            c0339Hv.f1147a = layoutParams.x;
            c0339Hv2.f1147a = layoutParams.y;
            c0296Gv.f1009a = motionEvent.getRawX();
            c0296Gv2.f1009a = motionEvent.getRawY();
            return true;
        }
        if (action != 2) {
            return false;
        }
        layoutParams.x = c0339Hv.f1147a + ((int) (motionEvent.getRawX() - c0296Gv.f1009a));
        layoutParams.y = c0339Hv2.f1147a + ((int) (motionEvent.getRawY() - c0296Gv2.f1009a));
        windowManager.updateViewLayout(frameLayout, layoutParams);
        return true;
    }

    private final void runOnUiThread(InterfaceC0884Ui interfaceC0884Ui) {
        LuaUiScheduler.INSTANCE.runOnUiThread(interfaceC0884Ui);
    }

    private final void runOnUiThreadSync(InterfaceC0884Ui interfaceC0884Ui) {
        if (LuaUiScheduler.INSTANCE.runOnUiThreadSync(interfaceC0884Ui)) {
            return;
        }
        AbstractC0295Gu.m625r(-540263936161845L);
        AbstractC0295Gu.m625r(-540324065703989L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C0829TC setImageSource$lambda$133(String str, String str2) {
        View view = viewRefs.get(str);
        ImageView imageView = view instanceof ImageView ? (ImageView) view : null;
        C0829TC c0829tc = C0829TC.f2620a;
        if (imageView != null) {
            if (str2.startsWith(AbstractC0295Gu.m625r(-305097296836661L)) || str2.startsWith(AbstractC0295Gu.m625r(-304581900761141L))) {
                INSTANCE.loadImageFromUrl(imageView, str2);
                return c0829tc;
            }
            if (new File(str2).exists()) {
                imageView.setImageBitmap(BitmapFactory.decodeFile(str2));
            }
        }
        return c0829tc;
    }

    public final void cleanup() {
        runOnUiThread(new C1302d(7));
        AbstractC0295Gu.m625r(-539950403549237L);
        AbstractC0295Gu.m625r(-540010533091381L);
    }

    public final void register(Lua lua) {
        AbstractC0295Gu.m625r(-543184513923125L);
        lua.createTable(0, 50);
        lua.push(new C0439K8(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-543201693792309L));
        lua.push(new C0439K8(29));
        lua.setField(-2, AbstractC0295Gu.m625r(-543227463596085L));
        lua.push(new C0954W8(10));
        lua.setField(-2, AbstractC0295Gu.m625r(-543270413269045L));
        lua.push(new C0954W8(18));
        lua.setField(-2, AbstractC0295Gu.m625r(-543321952876597L));
        lua.push(new C0954W8(19));
        lua.setField(-2, AbstractC0295Gu.m625r(-543369197516853L));
        lua.push(new C0954W8(20));
        lua.setField(-2, AbstractC0295Gu.m625r(-543416442157109L));
        lua.push(new C0954W8(21));
        lua.setField(-2, AbstractC0295Gu.m625r(-544000557709365L));
        lua.push(new C0954W8(22));
        lua.setField(-2, AbstractC0295Gu.m625r(-544060687251509L));
        lua.push(new C0954W8(23));
        lua.setField(-2, AbstractC0295Gu.m625r(-544112226859061L));
        lua.push(new C0954W8(24));
        lua.setField(-2, AbstractC0295Gu.m625r(-544159471499317L));
        lua.push(new C0439K8(19));
        lua.setField(-2, AbstractC0295Gu.m625r(-544219601041461L));
        lua.push(new C0439K8(20));
        lua.setField(-2, AbstractC0295Gu.m625r(-543717089867829L));
        lua.push(new C0439K8(21));
        lua.setField(-2, AbstractC0295Gu.m625r(-543781514377269L));
        lua.push(new C0439K8(22));
        lua.setField(-2, AbstractC0295Gu.m625r(-543850233854005L));
        lua.push(new C0439K8(23));
        lua.setField(-2, AbstractC0295Gu.m625r(-543906068428853L));
        lua.push(new C0439K8(24));
        lua.setField(-2, AbstractC0295Gu.m625r(-543970492938293L));
        lua.push(new C0439K8(25));
        lua.setField(-2, AbstractC0295Gu.m625r(-542402829875253L));
        lua.push(new C0439K8(26));
        lua.setField(-2, AbstractC0295Gu.m625r(-542480139286581L));
        lua.push(new C0439K8(27));
        lua.setField(-2, AbstractC0295Gu.m625r(-542553153730613L));
        lua.push(new C0439K8(28));
        lua.setField(-2, AbstractC0295Gu.m625r(-542591808436277L));
        lua.push(new C0954W8(0));
        lua.setField(-2, AbstractC0295Gu.m625r(-542093592229941L));
        lua.push(new C0954W8(1));
        lua.setField(-2, AbstractC0295Gu.m625r(-542127951968309L));
        lua.push(new C0954W8(2));
        lua.setField(-2, AbstractC0295Gu.m625r(-542162311706677L));
        lua.push(new C0954W8(3));
        lua.setField(-2, AbstractC0295Gu.m625r(-542209556346933L));
        lua.push(new C0954W8(4));
        lua.setField(-2, AbstractC0295Gu.m625r(-542291160725557L));
        lua.push(new C0954W8(5));
        lua.setField(-2, AbstractC0295Gu.m625r(-542325520463925L));
        lua.push(new C0954W8(6));
        lua.setField(-2, AbstractC0295Gu.m625r(-542926815885365L));
        lua.push(new C0954W8(7));
        lua.setField(-2, AbstractC0295Gu.m625r(-542978355492917L));
        lua.push(new C0954W8(8));
        lua.setField(-2, AbstractC0295Gu.m625r(-543068549806133L));
        lua.push(new C0954W8(9));
        lua.setField(-2, AbstractC0295Gu.m625r(-543141564250165L));
        lua.push(new C0954W8(11));
        lua.setField(-2, AbstractC0295Gu.m625r(-542639053076533L));
        lua.push(new C0954W8(12));
        lua.setField(-2, AbstractC0295Gu.m625r(-542686297716789L));
        lua.push(new C0954W8(13));
        lua.setField(-2, AbstractC0295Gu.m625r(-542746427258933L));
        lua.push(new C0954W8(14));
        lua.setField(-2, AbstractC0295Gu.m625r(-542836621572149L));
        lua.push(new C0954W8(15));
        lua.setField(-2, AbstractC0295Gu.m625r(-541260368574517L));
        lua.push(new C0954W8(16));
        lua.setField(-2, AbstractC0295Gu.m625r(-541333383018549L));
        lua.push(new C0954W8(17));
        lua.setField(-2, AbstractC0295Gu.m625r(-541410692429877L));
        AbstractC0295Gu.m625r(-541483706873909L);
        AbstractC0295Gu.m625r(-540994080602165L);
    }

    public final void setImageSource(String str, String str2) {
        AbstractC0295Gu.m625r(-539903158908981L);
        AbstractC0295Gu.m625r(-539933223680053L);
        runOnUiThread(new C0611O8(0, str, str2));
    }

    /* JADX INFO: renamed from: dp */
    private final float m3293dp(float f) {
        Context currentContext = CherryGlobalAPI.INSTANCE.getCurrentContext();
        return currentContext == null ? f : TypedValue.applyDimension(1, f, currentContext.getResources().getDisplayMetrics());
    }
}
