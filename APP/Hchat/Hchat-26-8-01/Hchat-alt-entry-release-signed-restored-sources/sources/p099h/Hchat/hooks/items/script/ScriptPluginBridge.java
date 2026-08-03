package p099h.Hchat.hooks.items.script;

import ac.RunnableC0059l;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import bi.C0315c;
import ca.RunnableC0537x;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import gg.AbstractC1411g;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import okhttp3.HttpUrl;
import p002a1.RunnableC0006d;
import p011ab.C0041a;
import p024b9.C0219e;
import p025bc.AbstractC0255e;
import p036c9.C0467n0;
import p054dg.AbstractC0793l;
import p065eb.C0878l;
import p065eb.C0880m;
import p065eb.C0882n;
import p065eb.C0884o;
import p065eb.C0886p;
import p065eb.C0888q;
import p065eb.C0890r;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p089g1.C1275d;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3155s;
import p218og.AbstractC3156t;
import p242q8.C3460o;
import p242q8.C3463r;
import p258r8.C3744i;
import p266s0.C3874d;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p332wb.C4892fr;
import p332wb.C5322su;
import p332wb.C5491y2;
import p332wb.EnumC5092lv;
import p332wb.InterfaceC5196p3;
import p332wb.RunnableC4794cr;
import p332wb.ViewOnAttachStateChangeListenerC4826dr;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ScriptPluginBridge {
    public static final int $stable = 8;
    public static final C0888q Companion = new C0888q();
    private final Class<WeChatApis> apis;
    private final ClassLoader classLoader;
    private final Object configLock;
    private final ScriptDexKitBridge dexKit;
    private final Context hostContext;
    private final Handler mainHandler;
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<ScriptFloatingGlassBarHandle>> pluginFloatingBars;
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<XC_MethodHook.Unhook>> pluginHooks;
    private final File scriptDir;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ScriptPluginBridge(Context context, ClassLoader classLoader, File file, ScriptDexKitBridge scriptDexKitBridge) {
        context.getClass();
        classLoader.getClass();
        file.getClass();
        this.hostContext = context;
        this.classLoader = classLoader;
        this.scriptDir = file;
        this.dexKit = scriptDexKitBridge;
        this.apis = WeChatApis.class;
        this.pluginHooks = new ConcurrentHashMap<>();
        this.pluginFloatingBars = new ConcurrentHashMap<>();
        this.configLock = new Object();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final p099h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle applyModuleFloatingGlassBar$lambda$1(p099h.Hchat.hooks.items.script.ScriptPluginBridge r22, android.view.View r23, java.util.Map r24, java.lang.String r25) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            android.content.Context r4 = r1.getContext()
            android.app.Activity r4 = r0.findActivity(r4)
            if (r4 == 0) goto L14
        L12:
            r8 = r4
            goto L23
        L14:
            q8.o r4 = p099h.Hchat.hooks.api.core.WeChatApis.currentActivity()
            if (r4 == 0) goto L1f
            android.app.Activity r4 = r4.m7263a()
            goto L20
        L1f:
            r4 = 0
        L20:
            if (r4 == 0) goto L435
            goto L12
        L23:
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference
            r4.<init>()
            wb.fr r6 = p332wb.C4892fr.f17279a
            ab.e r14 = new ab.e
            r6 = 5
            r14.<init>(r4, r0, r3, r6)
            android.os.Looper r6 = android.os.Looper.myLooper()
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            boolean r6 = gg.AbstractC1416l.m3825a(r6, r7)
            if (r6 == 0) goto L42d
            boolean r6 = r8.isFinishing()
            if (r6 != 0) goto L53
            boolean r6 = r8.isDestroyed()
            if (r6 == 0) goto L4b
            goto L53
        L4b:
            boolean r6 = r1 instanceof android.view.SurfaceView
            if (r6 != 0) goto L53
            boolean r6 = r1 instanceof android.view.TextureView
            if (r6 == 0) goto L57
        L53:
            r21 = r4
            goto L3d0
        L57:
            boolean r6 = r1.isAttachedToWindow()
            if (r6 != 0) goto L64
            r21 = r4
        L5f:
            r5 = 0
            r20 = 0
            goto L3fc
        L64:
            r6 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r6 = r8.findViewById(r6)
            r15 = r6
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            if (r15 == 0) goto L3f9
            android.view.ViewParent r6 = r1.getParent()
            boolean r7 = r6 instanceof android.view.ViewGroup
            if (r7 == 0) goto L7e
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r16 = r4
            r4 = r6
            goto L81
        L7e:
            r16 = r4
            r4 = 0
        L81:
            if (r4 == 0) goto L3ce
            if (r1 == r15) goto L3f6
            r6 = r1
        L86:
            if (r6 == 0) goto L3f6
            if (r6 != r15) goto L3d8
            int r6 = r15.getChildCount()
            if (r6 != 0) goto L93
        L90:
            r21 = r16
            goto L5f
        L93:
            java.util.WeakHashMap r6 = p332wb.C4892fr.f17281c
            monitor-enter(r6)
            java.lang.Object r7 = r6.get(r15)     // Catch: java.lang.Throwable -> L3d5
            wb.dr r7 = (p332wb.ViewOnAttachStateChangeListenerC4826dr) r7     // Catch: java.lang.Throwable -> L3d5
            r9 = 1
            if (r7 == 0) goto La9
            java.util.concurrent.atomic.AtomicBoolean r7 = r7.f16709u     // Catch: java.lang.Throwable -> L3d5
            boolean r7 = r7.get()     // Catch: java.lang.Throwable -> L3d5
            if (r7 != r9) goto La9
            monitor-exit(r6)
            goto L90
        La9:
            monitor-exit(r6)
            wb.er r12 = new wb.er
            java.lang.String r6 = "glass"
            boolean r6 = ac.AbstractC0063p.m414g(r6, r2)
            java.lang.String r7 = "clearBackground"
            boolean r7 = ac.AbstractC0063p.m414g(r7, r2)
            java.lang.String r10 = "horizontalMarginDp"
            float r10 = ac.AbstractC0063p.m425r(r10, r2)
            r11 = 0
            r13 = 1111490560(0x42400000, float:48.0)
            float r10 = p259r9.AbstractC3754e0.m7907q(r10, r11, r13)
            java.lang.String r9 = "bottomMarginDp"
            float r2 = ac.AbstractC0063p.m425r(r9, r2)
            float r2 = p259r9.AbstractC3754e0.m7907q(r2, r11, r13)
            r12.<init>(r6, r7, r10, r2)
            int r2 = r4.indexOfChild(r1)
            if (r2 >= 0) goto Ld9
            goto L90
        Ld9:
            android.view.ViewGroup$LayoutParams r6 = r1.getLayoutParams()
            if (r6 == 0) goto L3ce
            android.graphics.drawable.Drawable r17 = r1.getBackground()
            int r7 = r1.getHeight()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            if (r7 <= 0) goto Lee
            goto Lef
        Lee:
            r9 = 0
        Lef:
            if (r9 == 0) goto Lf7
        Lf1:
            int r7 = r9.intValue()
        Lf5:
            r11 = r7
            goto L123
        Lf7:
            int r7 = r1.getMeasuredHeight()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            if (r7 <= 0) goto L102
            goto L103
        L102:
            r9 = 0
        L103:
            if (r9 == 0) goto L106
            goto Lf1
        L106:
            int r7 = r6.height
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            if (r7 <= 0) goto L10f
            goto L110
        L10f:
            r9 = 0
        L110:
            if (r9 == 0) goto L113
            goto Lf1
        L113:
            r7 = 56
            float r7 = (float) r7
            android.content.res.Resources r9 = r8.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            float r7 = r7 * r9
            int r7 = (int) r7
            goto Lf5
        L123:
            android.view.View r7 = new android.view.View
            r7.<init>(r8)
            r9 = 0
            r7.setBackgroundColor(r9)
            int r10 = r1.getWidth()
            if (r10 >= 0) goto L133
            r10 = r9
        L133:
            r7.setMinimumWidth(r10)
            r7.setMinimumHeight(r11)
            r10 = 4
            r7.setVisibility(r10)
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            android.widget.FrameLayout r13 = new android.widget.FrameLayout
            r13.<init>(r8)
            r13.setBackgroundColor(r9)
            r13.setClipChildren(r9)
            r13.setClipToPadding(r9)
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            r10.<init>(r8)
            r10.setBackgroundColor(r9)
            r10.setClipChildren(r9)
            r10.setClipToPadding(r9)
            r4.removeView(r1)     // Catch: java.lang.Throwable -> L32b
            r4.addView(r7, r2, r6)     // Catch: java.lang.Throwable -> L32b
            int r9 = r15.getChildCount()     // Catch: java.lang.Throwable -> L32b
            r5 = 0
        L169:
            if (r5 < r9) goto L32f
            java.util.Iterator r5 = r18.iterator()     // Catch: java.lang.Throwable -> L32b
        L16f:
            boolean r9 = r5.hasNext()     // Catch: java.lang.Throwable -> L32b
            if (r9 == 0) goto L1a0
            java.lang.Object r9 = r5.next()     // Catch: java.lang.Throwable -> L19c
            wb.br r9 = (p332wb.C4761br) r9     // Catch: java.lang.Throwable -> L19c
            r19 = r2
            android.view.View r2 = r9.f16122a     // Catch: java.lang.Throwable -> L18c
            r15.removeView(r2)     // Catch: java.lang.Throwable -> L18c
            android.view.View r2 = r9.f16122a     // Catch: java.lang.Throwable -> L18c
            android.view.ViewGroup$LayoutParams r9 = r9.f16124c     // Catch: java.lang.Throwable -> L18c
            r13.addView(r2, r9)     // Catch: java.lang.Throwable -> L18c
            r2 = r19
            goto L16f
        L18c:
            r0 = move-exception
        L18d:
            r12 = r0
            r1 = r7
            r11 = r13
            r3 = r15
            r7 = r17
            r13 = 0
            r14 = 0
        L195:
            r20 = 0
        L197:
            r15 = r10
            r10 = r18
            goto L371
        L19c:
            r0 = move-exception
            r19 = r2
            goto L18d
        L1a0:
            r19 = r2
            boolean r2 = r12.f16973b     // Catch: java.lang.Throwable -> L328
            if (r2 == 0) goto L1b8
            r2 = 0
            r1.setBackground(r2)     // Catch: java.lang.Throwable -> L1ab
            goto L1b9
        L1ab:
            r0 = move-exception
            r12 = r0
            r14 = r2
            r20 = r14
            r1 = r7
            r11 = r13
            r3 = r15
            r7 = r17
            r13 = r20
            goto L197
        L1b8:
            r2 = 0
        L1b9:
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams     // Catch: java.lang.Throwable -> L323
            r9 = -1
            r5.<init>(r9, r11)     // Catch: java.lang.Throwable -> L323
            r10.addView(r1, r5)     // Catch: java.lang.Throwable -> L323
            r5 = r7
            c9.a1 r7 = new c9.a1     // Catch: java.lang.Throwable -> L31a
            r2 = 4
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L30e
            androidx.lifecycle.s r2 = r7.f1194h     // Catch: java.lang.Throwable -> L2ff
            boolean r9 = r7.f1198l     // Catch: java.lang.Throwable -> L2ff
            if (r9 != 0) goto L1da
            p4.t r9 = r7.f1195i     // Catch: java.lang.Throwable -> L2ff
            android.os.Bundle r1 = android.os.Bundle.EMPTY     // Catch: java.lang.Throwable -> L2ff
            r9.m7017F(r1)     // Catch: java.lang.Throwable -> L2ff
            r1 = 1
            r7.f1198l = r1     // Catch: java.lang.Throwable -> L2ff
            goto L1db
        L1da:
            r1 = 1
        L1db:
            androidx.lifecycle.l r9 = androidx.lifecycle.EnumC0107l.f291i     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r1 = "setCurrentState"
            r2.m554c(r1)     // Catch: java.lang.Throwable -> L2ff
            r2.m556e(r9)     // Catch: java.lang.Throwable -> L2ff
            androidx.lifecycle.l r1 = androidx.lifecycle.EnumC0107l.f292j     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r9 = "setCurrentState"
            r2.m554c(r9)     // Catch: java.lang.Throwable -> L2ff
            r2.m556e(r1)     // Catch: java.lang.Throwable -> L2ff
            androidx.lifecycle.l r1 = androidx.lifecycle.EnumC0107l.f293k     // Catch: java.lang.Throwable -> L2ff
            java.lang.String r9 = "setCurrentState"
            r2.m554c(r9)     // Catch: java.lang.Throwable -> L2ff
            r2.m556e(r1)     // Catch: java.lang.Throwable -> L2ff
            y1.c1 r1 = new y1.c1     // Catch: java.lang.Throwable -> L2fd
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L2fd
            p343x6.AbstractC5700d.m10251H(r1, r7, r7, r7, r7)     // Catch: java.lang.Throwable -> L2fd
            y1.r1 r2 = p357y1.C5928r1.f24042h     // Catch: java.lang.Throwable -> L2fd
            r1.setViewCompositionStrategy(r2)     // Catch: java.lang.Throwable -> L2fd
            r2 = r6
            c9.c0 r6 = new c9.c0     // Catch: java.lang.Throwable -> L2f1
            r9 = r13
            r13 = 9
            r24 = r2
            r2 = 1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L2eb
            r13 = r7
            s0.d r7 = new s0.d     // Catch: java.lang.Throwable -> L2df
            r11 = -1301351656(0xffffffffb26ef318, float:-1.3908696E-8)
            r7.<init>(r11, r6, r2)     // Catch: java.lang.Throwable -> L2df
            r1.setContent(r7)     // Catch: java.lang.Throwable -> L2cd
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams     // Catch: java.lang.Throwable -> L2c8
            r6 = -1
            r2.<init>(r6, r6)     // Catch: java.lang.Throwable -> L2c8
            r15.addView(r1, r2)     // Catch: java.lang.Throwable -> L2c8
            android.view.Window r2 = r8.getWindow()     // Catch: java.lang.Throwable -> L2c8
            if (r2 == 0) goto L23e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Throwable -> L232
            goto L23f
        L232:
            r0 = move-exception
            r6 = r24
            r12 = r0
            r14 = r1
            r1 = r5
            r11 = r9
            r3 = r15
            r7 = r17
            goto L195
        L23e:
            r2 = 0
        L23f:
            gg.u r6 = new gg.u     // Catch: java.lang.Throwable -> L2c8
            r6.<init>()     // Catch: java.lang.Throwable -> L2c8
            r12 = r1
            wb.dr r1 = new wb.dr     // Catch: java.lang.Throwable -> L2ba
            wb.zh r7 = new wb.zh     // Catch: java.lang.Throwable -> L2ba
            r8 = 8
            r7.<init>(r14, r15, r6, r8)     // Catch: java.lang.Throwable -> L2ba
            r14 = r2
            r8 = r5
            r0 = r6
            r11 = r10
            r3 = r15
            r21 = r16
            r5 = r19
            r20 = 0
            r2 = r23
            r6 = r24
            r15 = r7
            r10 = r9
            r7 = r17
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> L2b2
            r2 = r1
            r19 = r5
            r1 = r8
            r15 = r11
            r11 = r10
            r10 = r9
            r0.f4738g = r2     // Catch: java.lang.Throwable -> L275
            if (r14 == 0) goto L27a
            r14.addOnAttachStateChangeListener(r2)     // Catch: java.lang.Throwable -> L275
            goto L27a
        L275:
            r0 = move-exception
        L276:
            r14 = r12
            r12 = r0
            goto L371
        L27a:
            if (r4 == r14) goto L28c
            java.lang.Object r2 = r0.f4738g     // Catch: java.lang.Throwable -> L275
            if (r2 == 0) goto L286
            wb.dr r2 = (p332wb.ViewOnAttachStateChangeListenerC4826dr) r2     // Catch: java.lang.Throwable -> L275
            r4.addOnAttachStateChangeListener(r2)     // Catch: java.lang.Throwable -> L275
            goto L28c
        L286:
            java.lang.String r0 = "handle"
            gg.AbstractC1416l.m3831g(r0)     // Catch: java.lang.Throwable -> L275
            throw r20     // Catch: java.lang.Throwable -> L275
        L28c:
            java.util.WeakHashMap r2 = p332wb.C4892fr.f17281c     // Catch: java.lang.Throwable -> L275
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L275
            java.lang.Object r5 = r0.f4738g     // Catch: java.lang.Throwable -> L2a8
            if (r5 == 0) goto L2aa
            wb.dr r5 = (p332wb.ViewOnAttachStateChangeListenerC4826dr) r5     // Catch: java.lang.Throwable -> L2a8
            r2.put(r3, r5)     // Catch: java.lang.Throwable -> L2a8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L275
            java.lang.Object r0 = r0.f4738g     // Catch: java.lang.Throwable -> L275
            if (r0 == 0) goto L2a2
            r5 = r0
            wb.dr r5 = (p332wb.ViewOnAttachStateChangeListenerC4826dr) r5     // Catch: java.lang.Throwable -> L275
            goto L3fc
        L2a2:
            java.lang.String r0 = "handle"
            gg.AbstractC1416l.m3831g(r0)     // Catch: java.lang.Throwable -> L275
            throw r20     // Catch: java.lang.Throwable -> L275
        L2a8:
            r0 = move-exception
            goto L2b0
        L2aa:
            java.lang.String r0 = "handle"
            gg.AbstractC1416l.m3831g(r0)     // Catch: java.lang.Throwable -> L2a8
            throw r20     // Catch: java.lang.Throwable -> L2a8
        L2b0:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L275
            throw r0     // Catch: java.lang.Throwable -> L275
        L2b2:
            r0 = move-exception
            r19 = r5
            r1 = r8
            r15 = r11
            r11 = r10
            r10 = r9
            goto L276
        L2ba:
            r0 = move-exception
            r6 = r24
        L2bd:
            r1 = r5
            r11 = r9
            r3 = r15
            r7 = r17
            r20 = 0
            r15 = r10
            r10 = r18
            goto L276
        L2c8:
            r0 = move-exception
            r6 = r24
            r12 = r1
            goto L2bd
        L2cd:
            r0 = move-exception
            r6 = r24
            r1 = r5
        L2d1:
            r11 = r9
            r3 = r15
            r7 = r17
            r20 = 0
            r15 = r10
        L2d8:
            r10 = r18
            r12 = r0
            r14 = r20
            goto L371
        L2df:
            r0 = move-exception
            r6 = r24
            r1 = r5
            r11 = r9
            r3 = r15
            r7 = r17
            r20 = 0
            r15 = r10
            goto L2d8
        L2eb:
            r0 = move-exception
            r6 = r24
            r1 = r5
            r13 = r7
            goto L2d1
        L2f1:
            r0 = move-exception
            r6 = r2
        L2f3:
            r1 = r5
            r11 = r13
            r3 = r15
            r20 = 0
            r13 = r7
            r15 = r10
            r7 = r17
            goto L2d8
        L2fd:
            r0 = move-exception
            goto L2f3
        L2ff:
            r0 = move-exception
            r1 = r5
            r11 = r13
            r3 = r15
            r7 = r17
            r20 = 0
            goto L316
        L308:
            r12 = r0
            r13 = r20
            r14 = r13
            goto L371
        L30e:
            r0 = move-exception
            r1 = r5
        L310:
            r11 = r13
            r3 = r15
            r7 = r17
            r20 = 0
        L316:
            r15 = r10
            r10 = r18
            goto L308
        L31a:
            r0 = move-exception
            r20 = r2
            r1 = r5
        L31e:
            r11 = r13
            r3 = r15
            r7 = r17
            goto L316
        L323:
            r0 = move-exception
            r20 = r2
            r1 = r7
            goto L31e
        L328:
            r0 = move-exception
        L329:
            r1 = r7
            goto L310
        L32b:
            r0 = move-exception
            r19 = r2
            goto L329
        L32f:
            r19 = r2
            r1 = r7
            r0 = r11
            r11 = r13
            r3 = r15
            r21 = r16
            r7 = r17
            r13 = 4
            r20 = 0
            r15 = r10
            r10 = r18
            android.view.View r2 = r3.getChildAt(r5)     // Catch: java.lang.Throwable -> L36f
            wb.br r13 = new wb.br     // Catch: java.lang.Throwable -> L36f
            r2.getClass()     // Catch: java.lang.Throwable -> L36f
            r16 = r0
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()     // Catch: java.lang.Throwable -> L36f
            r0.getClass()     // Catch: java.lang.Throwable -> L36f
            r13.<init>(r2, r5, r0)     // Catch: java.lang.Throwable -> L36f
            r10.add(r13)     // Catch: java.lang.Throwable -> L36f
            int r5 = r5 + 1
            r0 = r22
            r17 = r7
            r18 = r10
            r13 = r11
            r10 = r15
            r11 = r16
            r2 = r19
            r16 = r21
            r7 = r1
            r15 = r3
            r1 = r23
            r3 = r25
            goto L169
        L36f:
            r0 = move-exception
            goto L308
        L371:
            if (r14 == 0) goto L376
            r14.m10555f()     // Catch: java.lang.Throwable -> L376
        L376:
            if (r14 == 0) goto L37d
            android.view.ViewParent r5 = r14.getParent()
            goto L37f
        L37d:
            r5 = r20
        L37f:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L386
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L388
        L386:
            r5 = r20
        L388:
            if (r5 == 0) goto L38d
            r5.removeView(r14)
        L38d:
            r2 = r3
            r3 = r4
            r5 = r6
            r6 = r7
            r8 = r10
            r9 = r11
            r10 = r15
            r4 = r19
            r7 = r1
            r1 = r23
            p332wb.C4892fr.m9275c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L39f
            sf.n r0 = p276sf.C3967n.f12976a     // Catch: java.lang.Throwable -> L39f
            goto L3a6
        L39f:
            r0 = move-exception
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L3a6:
            java.lang.Throwable r0 = p276sf.C3960g.m8182b(r0)
            if (r0 == 0) goto L3af
            r12.addSuppressed(r0)
        L3af:
            if (r14 == 0) goto L3b6
            if (r13 == 0) goto L3b6
            p343x6.AbstractC5700d.m10289p(r14)
        L3b6:
            if (r13 == 0) goto L3cd
            androidx.lifecycle.s r0 = r13.f1194h
            androidx.lifecycle.l r1 = r0.f300c
            androidx.lifecycle.l r2 = androidx.lifecycle.EnumC0107l.f289g
            if (r1 == r2) goto L3c3
            r0.m558g(r2)
        L3c3:
            r3.a r0 = r13.f1197k
            r0.m7634a()
            androidx.lifecycle.e0 r0 = r13.f1196j
            r0.m545a()
        L3cd:
            throw r12
        L3ce:
            r21 = r16
        L3d0:
            r20 = 0
            r5 = r20
            goto L3fc
        L3d5:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L3d8:
            r3 = r15
            r21 = r16
            r20 = 0
            android.view.ViewParent r0 = r6.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L3e9
            android.view.View r0 = (android.view.View) r0
            r6 = r0
            goto L3eb
        L3e9:
            r6 = r20
        L3eb:
            r0 = r22
            r1 = r23
            r15 = r3
            r16 = r21
            r3 = r25
            goto L86
        L3f6:
            r21 = r16
            goto L3d0
        L3f9:
            r21 = r4
            goto L3d0
        L3fc:
            if (r5 == 0) goto L437
            h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle r0 = new h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle
            aa.c r1 = new aa.c
            r2 = 7
            r3 = r22
            r1.<init>(r3, r2, r5)
            r0.<init>(r5, r1)
            r1 = r21
            r1.set(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.util.concurrent.CopyOnWriteArrayList<h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle>> r1 = r3.pluginFloatingBars
            r3 = r25
            java.lang.Object r2 = r1.get(r3)
            if (r2 != 0) goto L427
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            java.lang.Object r1 = r1.putIfAbsent(r3, r2)
            if (r1 != 0) goto L426
            goto L427
        L426:
            r2 = r1
        L427:
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2
            r2.add(r0)
            return r0
        L42d:
            r20 = 0
            java.lang.String r0 = "悬浮底栏只能在主线程挂载"
            p136j8.C2104o.m5276A(r0)
            return r20
        L435:
            r20 = 0
        L437:
            return r20
        */
        throw new UnsupportedOperationException("Method not decompiled: p099h.Hchat.hooks.items.script.ScriptPluginBridge.applyModuleFloatingGlassBar$lambda$1(h.Hchat.hooks.items.script.ScriptPluginBridge, android.view.View, java.util.Map, java.lang.String):h.Hchat.hooks.items.script.ScriptFloatingGlassBarHandle");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n applyModuleFloatingGlassBar$lambda$1$0(AtomicReference atomicReference, ScriptPluginBridge scriptPluginBridge, String str) {
        ScriptFloatingGlassBarHandle scriptFloatingGlassBarHandle = (ScriptFloatingGlassBarHandle) atomicReference.get();
        C3967n c3967n = C3967n.f12976a;
        if (scriptFloatingGlassBarHandle != null) {
            CopyOnWriteArrayList<ScriptFloatingGlassBarHandle> copyOnWriteArrayList = scriptPluginBridge.pluginFloatingBars.get(str);
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.remove(scriptFloatingGlassBarHandle);
                if (copyOnWriteArrayList.isEmpty()) {
                    scriptPluginBridge.pluginFloatingBars.remove(str, copyOnWriteArrayList);
                }
            }
            scriptFloatingGlassBarHandle.markRestored$app();
        }
        return c3967n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n applyModuleFloatingGlassBar$lambda$1$1(ScriptPluginBridge scriptPluginBridge, InterfaceC5196p3 interfaceC5196p3) {
        scriptPluginBridge.callOnMainForResult(new C0041a(interfaceC5196p3, 16));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean applyModuleFloatingGlassBar$lambda$1$1$0(InterfaceC5196p3 interfaceC5196p3) {
        ViewOnAttachStateChangeListenerC4826dr viewOnAttachStateChangeListenerC4826dr = (ViewOnAttachStateChangeListenerC4826dr) interfaceC5196p3;
        viewOnAttachStateChangeListenerC4826dr.getClass();
        if (AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
            viewOnAttachStateChangeListenerC4826dr.m9256a();
        } else {
            C4892fr.f17280b.post(new RunnableC4794cr(viewOnAttachStateChangeListenerC4826dr, 0));
        }
        return Boolean.TRUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean areAssignable(Class<?>[] clsArr, Object[] objArr) {
        if (clsArr.length != objArr.length) {
            return false;
        }
        Iterable iterableM8364A0 = AbstractC4165l.m8364A0(clsArr);
        if ((iterableM8364A0 instanceof Collection) && ((Collection) iterableM8364A0).isEmpty()) {
            return true;
        }
        Iterator it = iterableM8364A0.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (!Boolean.valueOf(isAssignable(clsArr[iIntValue], objArr[iIntValue])).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Class<?> boxType(Class<?> cls) {
        return !cls.isPrimitive() ? cls : cls.equals(Integer.TYPE) ? Integer.class : cls.equals(Long.TYPE) ? Long.class : cls.equals(Boolean.TYPE) ? Boolean.class : cls.equals(Double.TYPE) ? Double.class : cls.equals(Float.TYPE) ? Float.class : cls.equals(Short.TYPE) ? Short.class : cls.equals(Byte.TYPE) ? Byte.class : cls.equals(Character.TYPE) ? Character.class : cls.equals(Void.TYPE) ? Void.class : cls;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final <T> T callOnMainForResult(InterfaceC1220a interfaceC1220a) {
        Object c3959f;
        boolean zAwait;
        boolean z9;
        if (AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
            try {
                c3959f = interfaceC1220a.invoke();
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC0921a.m2261x("[Hchat:Script] 执行模块悬浮底栏操作失败: ", thM8182b.getMessage(), thM8182b);
            }
            if (c3959f instanceof C3959f) {
                return null;
            }
            return (T) c3959f;
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicReference atomicReference = new AtomicReference();
        AtomicReference atomicReference2 = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        RunnableC0537x runnableC0537x = new RunnableC0537x(atomicInteger, countDownLatch, atomicReference, interfaceC1220a, atomicReference2, 4);
        if (this.mainHandler.post(runnableC0537x)) {
            try {
                zAwait = countDownLatch.await(5L, TimeUnit.SECONDS);
                z9 = false;
            } catch (InterruptedException unused) {
                zAwait = false;
                z9 = true;
            }
            if (!zAwait) {
                if (atomicInteger.compareAndSet(0, 3)) {
                    this.mainHandler.removeCallbacks(runnableC0537x);
                    if (z9) {
                        Thread.currentThread().interrupt();
                        AbstractC1184v0.m3203m("[Hchat:Script] 等待模块悬浮底栏操作被中断");
                    } else {
                        AbstractC1184v0.m3203m("[Hchat:Script] 执行模块悬浮底栏操作超时");
                    }
                } else {
                    while (atomicInteger.get() != 2) {
                        try {
                            countDownLatch.await();
                        } catch (InterruptedException unused2) {
                            z9 = true;
                        }
                    }
                }
            }
            if (z9) {
                Thread.currentThread().interrupt();
            }
            Throwable th3 = (Throwable) atomicReference2.get();
            if (th3 == null) {
                return (T) atomicReference.get();
            }
            AbstractC0921a.m2261x("[Hchat:Script] 执行模块悬浮底栏操作失败: ", th3.getMessage(), th3);
            return null;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void callOnMainForResult$lambda$1(AtomicInteger atomicInteger, int i9, int i10, CountDownLatch countDownLatch, AtomicReference atomicReference, InterfaceC1220a interfaceC1220a, AtomicReference atomicReference2, int i11) {
        if (!atomicInteger.compareAndSet(i9, i10)) {
            countDownLatch.countDown();
        } else {
            try {
                atomicReference.set(interfaceC1220a.invoke());
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a A[EDGE_INSN: B:34:0x005a->B:26:0x005a BREAK  A[LOOP:1: B:12:0x0020->B:36:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[LOOP:1: B:12:0x0020->B:36:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Method compatibleMethod(Object obj, String str, int i9, Object[] objArr) {
        Object next;
        boolean z9;
        if (str != null && !AbstractC3149m.m6721t0(str)) {
            for (Class<?> clsTargetClass = targetClass(obj); clsTargetClass != null && !clsTargetClass.equals(Object.class); clsTargetClass = clsTargetClass.getSuperclass()) {
                Iterator<T> it = KavaReflector.declaredMethods(clsTargetClass).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Method method = (Method) next;
                    if (!AbstractC1416l.m3825a(method.getName(), str) || method.getParameterTypes().length != i9) {
                        z9 = false;
                        if (!Boolean.valueOf(z9).booleanValue()) {
                            break;
                        }
                    } else {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        parameterTypes.getClass();
                        if (areAssignable(parameterTypes, objArr)) {
                            z9 = true;
                        }
                        if (!Boolean.valueOf(z9).booleanValue()) {
                        }
                    }
                }
                Method method2 = (Method) next;
                if (method2 != null) {
                    return method2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final File configFile(File file) {
        if (file != null) {
            return new File(file, "config.prop");
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final <T> void dispatchDialogCallback(Consumer<T> consumer, T t9) {
        Object c3959f;
        C3967n c3967n;
        if (consumer != null) {
            try {
                consumer.accept(t9);
                c3967n = C3967n.f12976a;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
        } else {
            c3967n = null;
        }
        c3959f = c3967n;
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:Script] 模块弹窗回调失败: ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Activity findActivity(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext == context) {
                break;
            }
            context = baseContext;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean isAssignable(Class<?> cls, Object obj) {
        return obj == null ? !cls.isPrimitive() : boxType(cls).isAssignableFrom(obj.getClass());
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final Properties loadPluginConfig(File file) {
        Object c3959f;
        Properties properties = new Properties();
        File fileConfigFile = configFile(file);
        if (fileConfigFile == null || !fileConfigFile.isFile()) {
            return properties;
        }
        synchronized (this.configLock) {
            try {
                try {
                    File parentFile = fileConfigFile.getParentFile();
                    if (parentFile == null) {
                        throw new IllegalStateException("插件配置目录不可用");
                    }
                    if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                        throw new IllegalStateException(("无法创建插件配置目录: " + parentFile.getAbsolutePath()).toString());
                    }
                    File file2 = new File(AbstractC4302b.m8641d(this.hostContext), "script_plugin_locks");
                    if (!file2.isDirectory() && !file2.mkdirs()) {
                        throw new IllegalStateException(("无法创建插件配置锁目录: " + file2.getAbsolutePath()).toString());
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file2, Integer.toHexString(parentFile.getAbsolutePath().hashCode()) + ".lock"), "rw");
                    try {
                        FileChannel channel = randomAccessFile.getChannel();
                        try {
                            FileLock fileLockLock = channel.lock();
                            try {
                                if (fileConfigFile.isFile()) {
                                    InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileConfigFile), AbstractC3137a.f10177a);
                                    try {
                                        properties.load(inputStreamReader);
                                        inputStreamReader.close();
                                    } finally {
                                    }
                                }
                                channel.close();
                                randomAccessFile.close();
                                c3959f = C3967n.f12976a;
                            } finally {
                                fileLockLock.release();
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    String name = file != null ? file.getName() : null;
                    if (name == null) {
                        name = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    AbstractC1184v0.m3204n("[Hchat:Script] 读取插件配置失败: " + name + " " + thM8182b.getMessage(), thM8182b);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return properties;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Set<String> normalizeStringSet(Set<?> set) {
        Set<?> set2 = set;
        if (set2 == null || set2.isEmpty()) {
            return C4175v.f13712g;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String string = next != null ? next.toString() : null;
            if (string != null) {
                arrayList.add(string);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC4166m.m8405N1(arrayList2, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final void putConfigValue(File file, String str, String str2) {
        File fileConfigFile;
        Object c3959f;
        File parentFile;
        if (str != null) {
            if (AbstractC3149m.m6721t0(str)) {
                str = null;
            }
            if (str == null || (fileConfigFile = configFile(file)) == null) {
                return;
            }
            synchronized (this.configLock) {
                try {
                    try {
                        parentFile = fileConfigFile.getParentFile();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } catch (Throwable th3) {
                    c3959f = new C3959f(th3);
                }
                if (parentFile == null) {
                    throw new IllegalStateException("插件配置目录不可用");
                }
                if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                    throw new IllegalStateException(("无法创建插件配置目录: " + parentFile.getAbsolutePath()).toString());
                }
                File file2 = new File(AbstractC4302b.m8641d(this.hostContext), "script_plugin_locks");
                if (!file2.isDirectory() && !file2.mkdirs()) {
                    throw new IllegalStateException(("无法创建插件配置锁目录: " + file2.getAbsolutePath()).toString());
                }
                RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file2, Integer.toHexString(parentFile.getAbsolutePath().hashCode()) + ".lock"), "rw");
                try {
                    FileChannel channel = randomAccessFile.getChannel();
                    try {
                        FileLock fileLockLock = channel.lock();
                        try {
                            Properties properties = new Properties();
                            if (fileConfigFile.isFile()) {
                                InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileConfigFile), AbstractC3137a.f10177a);
                                try {
                                    properties.load(inputStreamReader);
                                    inputStreamReader.close();
                                } finally {
                                }
                            }
                            properties.setProperty(str, str2);
                            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileConfigFile), AbstractC3137a.f10177a);
                            try {
                                properties.store(outputStreamWriter, "Hchat script plugin config");
                                outputStreamWriter.close();
                                channel.close();
                                randomAccessFile.close();
                                c3959f = C3967n.f12976a;
                                Throwable thM8182b = C3960g.m8182b(c3959f);
                                if (thM8182b != null) {
                                    String name = file != null ? file.getName() : null;
                                    if (name == null) {
                                        name = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    AbstractC1184v0.m3204n("[Hchat:Script] 写入插件配置失败: " + name + " " + thM8182b.getMessage(), thM8182b);
                                }
                            } finally {
                            }
                        } finally {
                            fileLockLock.release();
                        }
                    } finally {
                    }
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Object receiverFor(Object obj, Method method) {
        if ((obj instanceof Class) || KavaReflector.isStatic(method)) {
            return null;
        }
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final void rememberHook(String str, XC_MethodHook.Unhook unhook) {
        CopyOnWriteArrayList<XC_MethodHook.Unhook> copyOnWriteArrayListPutIfAbsent;
        if (str == null || AbstractC3149m.m6721t0(str) || unhook == null) {
            return;
        }
        ConcurrentHashMap<String, CopyOnWriteArrayList<XC_MethodHook.Unhook>> concurrentHashMap = this.pluginHooks;
        CopyOnWriteArrayList<XC_MethodHook.Unhook> copyOnWriteArrayList = concurrentHashMap.get(str);
        if (copyOnWriteArrayList == null && (copyOnWriteArrayListPutIfAbsent = concurrentHashMap.putIfAbsent(str, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
            copyOnWriteArrayList = copyOnWriteArrayListPutIfAbsent;
        }
        copyOnWriteArrayList.add(unhook);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n showModuleChoiceDialog$lambda$1(String str, String str2, List list, String str3, ScriptPluginBridge scriptPluginBridge, Consumer consumer, Activity activity) {
        activity.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3958e((String) it.next(), HttpUrl.FRAGMENT_ENCODE_SET));
        }
        C0882n c0882n = new C0882n(scriptPluginBridge, consumer, 0);
        C0315c c0315c = new C0315c(14);
        EnumC5092lv.f18821g.getClass();
        String str4 = str2;
        C5491y2.m9799Q1(activity, str, str4, arrayList, c0882n, c0315c, C5491y2.m9786K1(str3));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n showModuleChoiceDialog$lambda$1$1(ScriptPluginBridge scriptPluginBridge, Consumer consumer, int i9) {
        scriptPluginBridge.dispatchDialogCallback(consumer, Integer.valueOf(i9));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n showModuleConfirmDialog$lambda$0(String str, String str2, String str3, ScriptPluginBridge scriptPluginBridge, Consumer consumer, Activity activity) {
        activity.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C0882n c0882n = new C0882n(scriptPluginBridge, consumer, 2);
        C0315c c0315c = new C0315c(17);
        EnumC5092lv.f18821g.getClass();
        String str4 = str2;
        C5491y2.m9803S1(activity, str, str4, c0882n, c0315c, C5491y2.m9786K1(str3));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n showModuleConfirmDialog$lambda$0$0(ScriptPluginBridge scriptPluginBridge, Consumer consumer, boolean z9) {
        scriptPluginBridge.dispatchDialogCallback(consumer, Boolean.valueOf(z9));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n showModuleDialog$lambda$0(String str, String str2, String str3, Activity activity) {
        activity.getClass();
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C0315c c0315c = new C0315c(16);
        EnumC5092lv.f18821g.getClass();
        C5491y2.m9796P1(activity, c0315c, new C3874d(-1486742852, new C5322su(str, C5491y2.m9786K1(str3), str2), true));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n showModuleInputDialog$lambda$0(String str, String str2, String str3, String str4, String str5, ScriptPluginBridge scriptPluginBridge, Consumer consumer, Activity activity) {
        activity.getClass();
        String str6 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        String str7 = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        String str8 = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
        String str9 = str4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str4;
        C0882n c0882n = new C0882n(scriptPluginBridge, consumer, 3);
        C0315c c0315c = new C0315c(18);
        EnumC5092lv.f18821g.getClass();
        C5491y2.m9822b2(activity, str6, str7, str8, str9, 4000, true, c0882n, c0315c, C5491y2.m9786K1(str5));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n showModuleInputDialog$lambda$0$0(ScriptPluginBridge scriptPluginBridge, Consumer consumer, String str) {
        str.getClass();
        scriptPluginBridge.dispatchDialogCallback(consumer, str);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n showModuleMultiChoiceDialog$lambda$3(String str, String str2, List list, Set set, String str3, ScriptPluginBridge scriptPluginBridge, Consumer consumer, Activity activity) {
        activity.getClass();
        String str4 = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        String str5 = str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C3958e((String) it.next(), HttpUrl.FRAGMENT_ENCODE_SET));
        }
        C0882n c0882n = new C0882n(scriptPluginBridge, consumer, 1);
        C0315c c0315c = new C0315c(15);
        EnumC5092lv.f18821g.getClass();
        C5491y2.m9816Y1(activity, str4, str5, arrayList, set, true, c0882n, c0315c, C5491y2.m9786K1(str3));
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final C3967n showModuleMultiChoiceDialog$lambda$3$1(ScriptPluginBridge scriptPluginBridge, Consumer consumer, Set set) {
        set.getClass();
        scriptPluginBridge.dispatchDialogCallback(consumer, set);
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final boolean showOnMain(InterfaceC1231l interfaceC1231l) {
        Activity activityM7263a;
        C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
        if (c3460oCurrentActivity == null || (activityM7263a = c3460oCurrentActivity.m7263a()) == null || activityM7263a.isFinishing() || activityM7263a.isDestroyed()) {
            return false;
        }
        RunnableC0059l runnableC0059l = new RunnableC0059l(activityM7263a, this, interfaceC1231l, 12);
        if (AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
            runnableC0059l.run();
            return true;
        }
        activityM7263a.runOnUiThread(runnableC0059l);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final void showOnMain$lambda$0(Activity activity, ScriptPluginBridge scriptPluginBridge, InterfaceC1231l interfaceC1231l) {
        Object c3959f;
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        try {
            interfaceC1231l.invoke(activity);
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:Script] 显示模块弹窗失败: ", thM8182b.getMessage(), thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private final Class<?> targetClass(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Class ? (Class) obj : obj.getClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean unhookPlugin$lambda$0$0(CopyOnWriteArrayList copyOnWriteArrayList) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((ScriptFloatingGlassBarHandle) it.next()).restore();
        }
        return Boolean.TRUE;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    private final <T> T withConfigFileLock(File file, InterfaceC1220a interfaceC1220a) throws IOException {
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            C2104o.m5276A("插件配置目录不可用");
            return null;
        }
        if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
            C1275d.m3414h(parentFile.getAbsolutePath(), "无法创建插件配置目录: ");
            return null;
        }
        File file2 = new File(AbstractC4302b.m8641d(this.hostContext), "script_plugin_locks");
        if (!file2.isDirectory() && !file2.mkdirs()) {
            C1275d.m3414h(file2.getAbsolutePath(), "无法创建插件配置锁目录: ");
            return null;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(file2, AbstractC0255e.m1020i(Integer.toHexString(parentFile.getAbsolutePath().hashCode()), ".lock")), "rw");
        try {
            FileChannel channel = randomAccessFile.getChannel();
            try {
                FileLock fileLockLock = channel.lock();
                try {
                    T t9 = (T) interfaceC1220a.invoke();
                    AbstractC2043a.m5035i(channel, null);
                    randomAccessFile.close();
                    return t9;
                } finally {
                    fileLockLock.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC2043a.m5035i(randomAccessFile, th2);
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ScriptFloatingGlassBarHandle applyModuleFloatingGlassBar(String str, View view, Map<?, ?> map) {
        if (str != null) {
            String str2 = !AbstractC3149m.m6721t0(str) ? str : null;
            if (str2 != null && view != null) {
                return (ScriptFloatingGlassBarHandle) callOnMainForResult(new C0467n0((Object) this, str2, (Object) view, (Object) map, 2));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createInstance(Object obj, int i9, Object[] objArr) {
        Object next;
        Class<?> clsTargetClass = targetClass(obj);
        if (clsTargetClass != null) {
            if (objArr == null) {
                objArr = new Object[0];
            }
            Iterator<T> it = KavaReflector.declaredConstructors(clsTargetClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Constructor constructor = (Constructor) next;
                if (constructor.getParameterTypes().length == i9) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    parameterTypes.getClass();
                    boolean z9 = areAssignable(parameterTypes, objArr);
                    if (Boolean.valueOf(z9).booleanValue()) {
                        break;
                    }
                }
            }
            Constructor constructor2 = (Constructor) next;
            if (constructor2 != null) {
                return KavaReflector.newInstance(constructor2, Arrays.copyOf(objArr, objArr.length));
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File file(String str) {
        str.getClass();
        return new File(this.scriptDir, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<?> findClass(String str) {
        str.getClass();
        Class<?> clsFindClass = XposedHelpers.findClass(str, this.classLoader);
        clsFindClass.getClass();
        return clsFindClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Constructor<?> firstConstructor(Object obj, int i9) {
        Class<?> clsTargetClass = targetClass(obj);
        Object obj2 = null;
        if (clsTargetClass == null) {
            return null;
        }
        Iterator<T> it = KavaReflector.declaredConstructors(clsTargetClass).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Boolean.valueOf(((Constructor) next).getParameterTypes().length == i9).booleanValue()) {
                obj2 = next;
                break;
            }
        }
        return (Constructor) obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Field firstField(Object obj, String str) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return null;
        }
        return KavaReflector.findFieldRecursive(targetClass(obj), str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Method firstMethod(Object obj, String str, int i9) {
        Object next;
        if (str != null && !AbstractC3149m.m6721t0(str)) {
            for (Class<?> clsTargetClass = targetClass(obj); clsTargetClass != null && !clsTargetClass.equals(Object.class); clsTargetClass = clsTargetClass.getSuperclass()) {
                Iterator<T> it = KavaReflector.declaredMethods(clsTargetClass).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Method method = (Method) next;
                    if (Boolean.valueOf(AbstractC1416l.m3825a(method.getName(), str) && (i9 < 0 || method.getParameterTypes().length == i9)).booleanValue()) {
                        break;
                    }
                }
                Method method2 = (Method) next;
                if (method2 != null) {
                    return method2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Class<WeChatApis> getApis() {
        return this.apis;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean getBoolean(File file, String str, boolean z9) {
        String string = getString(file, str, null);
        Locale locale = Locale.US;
        String strM5165l = AbstractC2091b.m5165l(locale, string, locale);
        switch (strM5165l.hashCode()) {
            case 48:
                if (strM5165l.equals("0")) {
                    return false;
                }
                return z9;
            case 49:
                if (strM5165l.equals("1")) {
                    return true;
                }
                break;
            case 110:
                if (strM5165l.equals("n")) {
                    return false;
                }
                break;
            case 121:
                if (strM5165l.equals("y")) {
                    return true;
                }
                break;
            case 3521:
                if (strM5165l.equals("no")) {
                    return false;
                }
                break;
            case 3551:
                if (strM5165l.equals("on")) {
                    return true;
                }
                break;
            case 109935:
                if (strM5165l.equals("off")) {
                    return false;
                }
                break;
            case 119527:
                if (strM5165l.equals("yes")) {
                    return true;
                }
                break;
            case 3569038:
                if (strM5165l.equals("true")) {
                    return true;
                }
                break;
            case 97196323:
                if (strM5165l.equals("false")) {
                    return false;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ClassLoader getClassLoader() {
        return this.classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ScriptDexKitBridge getDexKit() {
        return this.dexKit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getField(Object obj, String str) {
        Field fieldFirstField = firstField(obj, str);
        if (fieldFirstField != null) {
            return KavaReflector.readField(fieldFirstField, receiverFor(obj, fieldFirstField));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final float getFloat(File file, String str, float f3) {
        Float fValueOf = null;
        String string = getString(file, str, null);
        string.getClass();
        try {
            if (AbstractC3155s.m6730T(string)) {
                fValueOf = Float.valueOf(Float.parseFloat(string));
            }
        } catch (NumberFormatException unused) {
        }
        return fValueOf != null ? fValueOf.floatValue() : f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Context getHostContext() {
        return this.hostContext;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getInt(File file, String str, int i9) {
        Integer numM6742f0 = AbstractC3156t.m6742f0(getString(file, str, null));
        return numM6742f0 != null ? numM6742f0.intValue() : i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long getLong(File file, String str, long j3) {
        Long lM6743g0 = AbstractC3156t.m6743g0(getString(file, str, null));
        return lM6743g0 != null ? lM6743g0.longValue() : j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final File getScriptDir() {
        return this.scriptDir;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getString(File file, String str, String str2) {
        if (str != null) {
            if (!Boolean.valueOf(!AbstractC3149m.m6721t0(str)).booleanValue()) {
                str = null;
            }
            if (str != null) {
                String property = loadPluginConfig(file).getProperty(str);
                return property != null ? property : str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
            }
        }
        return str2 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Set<String> getStringSet(File file, String str, Set<?> set) {
        String string = getString(file, str, null);
        String str2 = string.length() > 0 ? string : null;
        if (str2 == null) {
            return normalizeStringSet(set);
        }
        List listM6691F0 = AbstractC3149m.m6691F0(str2, new char[]{'\n'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM6691F0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        AbstractC4166m.m8405N1(arrayList, linkedHashSet);
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final XC_MethodHook.Unhook hookAfter(String str, Member member, Consumer<XC_MethodHook.MethodHookParam> consumer) {
        member.getClass();
        consumer.getClass();
        XC_MethodHook.Unhook unhookM7763b = C3744i.f12154b.m7763b(member, new C0890r(consumer, 0));
        rememberHook(str, unhookM7763b);
        return unhookM7763b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final XC_MethodHook.Unhook hookBefore(String str, Member member, Consumer<XC_MethodHook.MethodHookParam> consumer) {
        member.getClass();
        consumer.getClass();
        XC_MethodHook.Unhook unhookM7763b = C3744i.f12154b.m7763b(member, new C0890r(consumer, 1));
        rememberHook(str, unhookM7763b);
        return unhookM7763b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final XC_MethodHook.Unhook hookReplace(String str, Member member, Function<XC_MethodHook.MethodHookParam, Object> function) {
        member.getClass();
        function.getClass();
        XC_MethodHook.Unhook unhookM7763b = C3744i.f12154b.m7763b(member, new C0219e(function, 8));
        rememberHook(str, unhookM7763b);
        return unhookM7763b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object invokeMethod(Object obj, String str, int i9, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        Method methodCompatibleMethod = compatibleMethod(obj, str, i9, objArr);
        if (methodCompatibleMethod != null) {
            return KavaReflector.invoke(methodCompatibleMethod, receiverFor(obj, methodCompatibleMethod), Arrays.copyOf(objArr, objArr.length));
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void log(String str, File file, Object obj) {
        String string;
        Object c3959f;
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        XposedBridge.log("[Hchat:Script] [" + (str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str) + "] " + string);
        if (file != null) {
            try {
                if (!file.isDirectory()) {
                    file.mkdirs();
                }
                String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US).format(new Date());
                AbstractC0793l.m2020Z(new File(file, "log.txt"), "[" + str2 + "] " + string + "\n");
                c3959f = C3967n.f12976a;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                if (str == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                AbstractC0921a.m2260w("[Hchat:Script] 写入插件日志失败: ", str, " ", thM8182b.getMessage(), thM8182b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final SharedPreferences prefs(String str) {
        str.getClass();
        return AbstractC4302b.m8640c(this.hostContext, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void putBoolean(File file, String str, boolean z9) {
        putConfigValue(file, str, String.valueOf(z9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void putFloat(File file, String str, float f3) {
        putConfigValue(file, str, String.valueOf(f3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void putInt(File file, String str, int i9) {
        putConfigValue(file, str, String.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void putLong(File file, String str, long j3) {
        putConfigValue(file, str, String.valueOf(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void putString(File file, String str, String str2) {
        if (str2 == null) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        putConfigValue(file, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void putStringSet(File file, String str, Set<?> set) {
        putConfigValue(file, str, AbstractC4166m.m8392A1(normalizeStringSet(set), "\n", null, null, null, 62));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setField(Object obj, String str, Object obj2) {
        Field fieldFirstField = firstField(obj, str);
        if (fieldFirstField != null) {
            KavaReflector.writeField(fieldFirstField, receiverFor(obj, fieldFirstField), obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean showModuleChoiceDialog(String str, String str2, List<?> list, String str3, Consumer<Integer> consumer) {
        if (list == null) {
            list = C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String string = next != null ? next.toString() : null;
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            arrayList.add(string);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        return showOnMain(new C0886p(str, str2, arrayList, str3, this, consumer));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean showModuleConfirmDialog(String str, String str2, String str3, Consumer<Boolean> consumer) {
        return showOnMain(new C0884o(str, str2, str3, this, consumer, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean showModuleDialog(String str, String str2, String str3) {
        return showOnMain(new C0878l(0, str, str2, str3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean showModuleInputDialog(String str, String str2, String str3, String str4, String str5, Consumer<String> consumer) {
        return showOnMain(new C0880m(str, str2, str3, str4, str5, this, consumer, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean showModuleMultiChoiceDialog(String str, String str2, List<?> list, Set<?> set, String str3, Consumer<Set<Integer>> consumer) {
        if (list == null) {
            list = C4173t.f13710g;
        }
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String string = next != null ? next.toString() : null;
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            arrayList.add(string);
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        if (set == null) {
            set = C4175v.f13712g;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : set) {
            Number number = obj instanceof Number ? (Number) obj : null;
            Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
            if (numValueOf != null) {
                arrayList2.add(numValueOf);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            int iIntValue = ((Number) obj2).intValue();
            if (iIntValue >= 0 && iIntValue < arrayList.size()) {
                arrayList3.add(obj2);
            }
        }
        return showOnMain(new C0880m(str, str2, arrayList, AbstractC4166m.m8412U1(arrayList3), str3, this, consumer));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void toast(String str, Object obj) {
        String string;
        String strM2251n = null;
        if (str != null) {
            if (AbstractC3149m.m6721t0(str)) {
                str = null;
            }
            if (str != null) {
                strM2251n = AbstractC0921a.m2251n("[", str, "] ");
            }
        }
        if (strM2251n == null) {
            strM2251n = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        WeChatApis.interaction().getClass();
        C3463r c3463r = WeChatApis.notifyApi;
        if (c3463r != null) {
            if (obj == null || (string = obj.toString()) == null) {
                string = "null";
            }
            String strConcat = strM2251n.concat(string);
            if (TextUtils.isEmpty(strConcat)) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC0006d(c3463r, 27, strConcat));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void unhook(String str, XC_MethodHook.Unhook unhook) {
        CopyOnWriteArrayList<XC_MethodHook.Unhook> copyOnWriteArrayList;
        if (str != null && unhook != null && (copyOnWriteArrayList = this.pluginHooks.get(str)) != null) {
            copyOnWriteArrayList.remove(unhook);
        }
        unhook(unhook);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void unhookPlugin(String str) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return;
        }
        CopyOnWriteArrayList<ScriptFloatingGlassBarHandle> copyOnWriteArrayListRemove = this.pluginFloatingBars.remove(str);
        if (copyOnWriteArrayListRemove != null) {
        }
        CopyOnWriteArrayList<XC_MethodHook.Unhook> copyOnWriteArrayListRemove2 = this.pluginHooks.remove(str);
        if (copyOnWriteArrayListRemove2 == null) {
            copyOnWriteArrayListRemove2 = C4173t.f13710g;
        }
        Iterator it = copyOnWriteArrayListRemove2.iterator();
        while (it.hasNext()) {
            try {
                ((XC_MethodHook.Unhook) it.next()).unhook();
            } catch (Throwable unused) {
            }
        }
    }

    public final boolean showModuleDialog(String str, String str2) {
        return showModuleDialog(str, str2, null);
    }

    private final Object receiverFor(Object obj, Field field) {
        if ((obj instanceof Class) || KavaReflector.isStatic(field)) {
            return null;
        }
        return obj;
    }

    public final boolean showModuleConfirmDialog(String str, String str2, Consumer<Boolean> consumer) {
        return showModuleConfirmDialog(str, str2, null, consumer);
    }

    public final boolean showModuleInputDialog(String str, String str2, String str3, String str4, Consumer<String> consumer) {
        return showModuleInputDialog(str, str2, str3, str4, null, consumer);
    }

    public final void unhook(XC_MethodHook.Unhook unhook) {
        if (unhook != null) {
            unhook.unhook();
        }
    }

    public final XC_MethodHook.Unhook hookAfter(Member member, Consumer<XC_MethodHook.MethodHookParam> consumer) {
        member.getClass();
        consumer.getClass();
        return hookAfter(null, member, consumer);
    }

    public final XC_MethodHook.Unhook hookBefore(Member member, Consumer<XC_MethodHook.MethodHookParam> consumer) {
        member.getClass();
        consumer.getClass();
        return hookBefore(null, member, consumer);
    }

    public final void unhook(String str, Object obj) {
        unhook(str, obj instanceof XC_MethodHook.Unhook ? (XC_MethodHook.Unhook) obj : null);
    }

    public final XC_MethodHook.Unhook hookReplace(Member member, Function<XC_MethodHook.MethodHookParam, Object> function) {
        member.getClass();
        function.getClass();
        return hookReplace(null, member, function);
    }

    public final Object invokeMethod(Object obj, String str, Object[] objArr) {
        if (objArr == null) {
            objArr = new Object[0];
        }
        return invokeMethod(obj, str, objArr.length, objArr);
    }

    public final Object invokeMethod(Object obj, String str, int i9) {
        return invokeMethod(obj, str, i9, new Object[0]);
    }

    public final Object invokeMethod(Object obj, String str) {
        return invokeMethod(obj, str, 0, new Object[0]);
    }

    public final ScriptFloatingGlassBarHandle applyModuleFloatingGlassBar(String str, View view) {
        return applyModuleFloatingGlassBar(str, view, null);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 java.lang.ClassLoader)
  (r3v0 java.io.File)
  (wrap:h.Hchat.hooks.items.script.ScriptDexKitBridge:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null h.Hchat.hooks.items.script.ScriptDexKitBridge) : (r4v0 h.Hchat.hooks.items.script.ScriptDexKitBridge))
 A[MD:(android.content.Context, java.lang.ClassLoader, java.io.File, h.Hchat.hooks.items.script.ScriptDexKitBridge):void (m)] (LINE:58) call: h.Hchat.hooks.items.script.ScriptPluginBridge.<init>(android.content.Context, java.lang.ClassLoader, java.io.File, h.Hchat.hooks.items.script.ScriptDexKitBridge):void type: THIS */
    public /* synthetic */ ScriptPluginBridge(Context context, ClassLoader classLoader, File file, ScriptDexKitBridge scriptDexKitBridge, int i9, AbstractC1411g abstractC1411g) {
        this(context, classLoader, file, (i9 & 8) != 0 ? null : scriptDexKitBridge);
    }

    public final boolean showModuleChoiceDialog(String str, String str2, List<?> list, Consumer<Integer> consumer) {
        return showModuleChoiceDialog(str, str2, list, null, consumer);
    }

    public final void toast(Object obj) {
        String string;
        WeChatApis.interaction().getClass();
        C3463r c3463r = WeChatApis.notifyApi;
        if (c3463r != null) {
            if (obj == null || (string = obj.toString()) == null) {
                string = "null";
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC0006d(c3463r, 27, string));
        }
    }

    public final Object createInstance(Object obj, int i9) {
        return createInstance(obj, i9, new Object[0]);
    }

    public final Method firstMethod(Object obj, String str) {
        return firstMethod(obj, str, -1);
    }

    public final void log(Object obj) {
        if (obj == null) {
            obj = "null";
        }
        XposedBridge.log("[Hchat:Script] " + obj);
    }

    public final boolean showModuleMultiChoiceDialog(String str, String str2, List<?> list, Set<?> set, Consumer<Set<Integer>> consumer) {
        return showModuleMultiChoiceDialog(str, str2, list, set, null, consumer);
    }
}
