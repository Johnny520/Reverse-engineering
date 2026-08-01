package me.yun.fkwechat.core.config;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import ec.InterfaceC2165o0;
import fkw0.hidden.Hidden0;
import fkw0.p087me.yun.fkwechat.FkwLoader;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0188p;
import p172l8.C4700i0;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;
import p257r8.AbstractC6544m;
import p257r8.InterfaceC6537f;

/* JADX INFO: compiled from: Dex2C */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m16757d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0082@¢\u0006\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, m16758d2 = {"Lme/yun/fkwechat/core/config/ControlManager;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "Landroid/app/Application;", "application", "Ll8/i0;", "register", "(Landroid/app/Application;)V", "Landroid/app/Activity;", "activity", _UrlKt.FRAGMENT_ENCODE_SET, "applyLocalBlock", "(Landroid/app/Activity;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "uin", "wxid", "syncLicenseStatus", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "autoRegisterFlow", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Lp8/f;)Ljava/lang/Object;", "nickname", "registerType", "tradeNo", "submitRegisterRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lp8/f;)Ljava/lang/Object;", "showClosedDialog", "(Landroid/app/Activity;Lp8/f;)Ljava/lang/Object;", "handleNetworkFallback", "isChecking", "Z", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
public final class ControlManager {
    public static final int $stable = 0;
    public static final ControlManager INSTANCE = null;
    private static boolean isChecking;

    /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$autoRegisterFlow$1 */
    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16759k = 3, m16760mv = {2, 3, 0}, m16762xi = 48)
    @InterfaceC6537f(m25850c = "me.yun.fkwechat.core.config.ControlManager", m25851f = "ControlManager.kt", m25852l = {Opcodes.ARRAYLENGTH, Opcodes.ATHROW, 202, 227, 231, 234, 237}, m25853m = "autoRegisterFlow", m25854v = 2)
    public static final class C51711 extends AbstractC6535d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        boolean Z$1;
        boolean Z$2;
        int label;
        Object result;
        final ControlManager this$0;

        static {
            FkwLoader.registerNativesForClass(4, C51711.class);
            Hidden0.special_clinit_4_20(C51711.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51711(ControlManager controlManager, InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
            this.this$0 = controlManager;
        }

        @Override // p257r8.AbstractC6532a
        public final native Object invokeSuspend(Object obj);
    }

    /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$autoRegisterFlow$2 */
    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m16758d2 = {"Lec/o0;", "Ll8/i0;", "<anonymous>", "(Lec/o0;)V"}, m16759k = 3, m16760mv = {2, 3, 0})
    @InterfaceC6537f(m25850c = "me.yun.fkwechat.core.config.ControlManager$autoRegisterFlow$2", m25851f = "ControlManager.kt", m25852l = {}, m25853m = "invokeSuspend", m25854v = 2)
    public static final class C51722 extends AbstractC6544m implements InterfaceC0188p {
        final Activity $activity;
        final String $err;
        int label;

        static {
            FkwLoader.registerNativesForClass(5, C51722.class);
            Hidden0.special_clinit_5_50(C51722.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51722(String str, Activity activity, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.$err = str;
            this.$activity = activity;
        }

        @Override // p257r8.AbstractC6532a
        public final native InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f);

        public final native Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f);

        @Override // p010a9.InterfaceC0188p
        public native /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2);

        @Override // p257r8.AbstractC6532a
        public final native Object invokeSuspend(Object obj);
    }

    /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$autoRegisterFlow$3 */
    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m16758d2 = {"Lec/o0;", "Ll8/i0;", "<anonymous>", "(Lec/o0;)V"}, m16759k = 3, m16760mv = {2, 3, 0})
    @InterfaceC6537f(m25850c = "me.yun.fkwechat.core.config.ControlManager$autoRegisterFlow$3", m25851f = "ControlManager.kt", m25852l = {}, m25853m = "invokeSuspend", m25854v = 2)
    public static final class C51733 extends AbstractC6544m implements InterfaceC0188p {
        final Activity $activity;
        final String $nickname;
        final String $uin;
        final String $wxid;
        int label;

        /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$autoRegisterFlow$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: Dex2C */
        @Metadata(m16757d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, m16758d2 = {"<anonymous>", _UrlKt.FRAGMENT_ENCODE_SET, "tradeNo"}, m16759k = 3, m16760mv = {2, 3, 0}, m16762xi = 48)
        @InterfaceC6537f(m25850c = "me.yun.fkwechat.core.config.ControlManager$autoRegisterFlow$3$1", m25851f = "ControlManager.kt", m25852l = {210, 212}, m25853m = "invokeSuspend", m25854v = 2)
        public static final class AnonymousClass1 extends AbstractC6544m implements InterfaceC0188p {
            final String $nickname;
            final String $uin;
            final String $wxid;
            Object L$0;
            Object L$1;
            int label;

            /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$autoRegisterFlow$3$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Dex2C */
            @Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m16758d2 = {"Lec/o0;", "Ll8/i0;", "<anonymous>", "(Lec/o0;)V"}, m16759k = 3, m16760mv = {2, 3, 0})
            @InterfaceC6537f(m25850c = "me.yun.fkwechat.core.config.ControlManager$autoRegisterFlow$3$1$1", m25851f = "ControlManager.kt", m25852l = {}, m25853m = "invokeSuspend", m25854v = 2)
            public static final class C101581 extends AbstractC6544m implements InterfaceC0188p {
                int label;

                static {
                    FkwLoader.registerNativesForClass(6, C101581.class);
                    Hidden0.special_clinit_6_50(C101581.class);
                }

                public C101581(InterfaceC5976f interfaceC5976f) {
                    super(2, interfaceC5976f);
                }

                @Override // p257r8.AbstractC6532a
                public final native InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f);

                public final native Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f);

                @Override // p010a9.InterfaceC0188p
                public native /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2);

                @Override // p257r8.AbstractC6532a
                public final native Object invokeSuspend(Object obj);
            }

            static {
                FkwLoader.registerNativesForClass(7, AnonymousClass1.class);
                Hidden0.special_clinit_7_50(AnonymousClass1.class);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str, String str2, String str3, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.$uin = str;
                this.$wxid = str2;
                this.$nickname = str3;
            }

            @Override // p257r8.AbstractC6532a
            public final native InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f);

            @Override // p010a9.InterfaceC0188p
            public native /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2);

            public final native Object invoke(String str, InterfaceC5976f interfaceC5976f);

            @Override // p257r8.AbstractC6532a
            public final native Object invokeSuspend(Object obj);
        }

        static {
            FkwLoader.registerNativesForClass(8, C51733.class);
            Hidden0.special_clinit_8_60(C51733.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51733(Activity activity, String str, String str2, String str3, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.$activity = activity;
            this.$uin = str;
            this.$wxid = str2;
            this.$nickname = str3;
        }

        /* JADX INFO: renamed from: r */
        public static native C4700i0 m21240r();

        @Override // p257r8.AbstractC6532a
        public final native InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f);

        public final native Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f);

        @Override // p010a9.InterfaceC0188p
        public native /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2);

        @Override // p257r8.AbstractC6532a
        public final native Object invokeSuspend(Object obj);
    }

    /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$handleNetworkFallback$2 */
    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m16758d2 = {"Lec/o0;", _UrlKt.FRAGMENT_ENCODE_SET, "<anonymous>", "(Lec/o0;)Z"}, m16759k = 3, m16760mv = {2, 3, 0})
    @InterfaceC6537f(m25850c = "me.yun.fkwechat.core.config.ControlManager$handleNetworkFallback$2", m25851f = "ControlManager.kt", m25852l = {}, m25853m = "invokeSuspend", m25854v = 2)
    public static final class C51742 extends AbstractC6544m implements InterfaceC0188p {
        final Activity $activity;
        int label;

        static {
            FkwLoader.registerNativesForClass(9, C51742.class);
            Hidden0.special_clinit_9_50(C51742.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51742(Activity activity, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.$activity = activity;
        }

        @Override // p257r8.AbstractC6532a
        public final native InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f);

        public final native Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f);

        @Override // p010a9.InterfaceC0188p
        public native /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2);

        @Override // p257r8.AbstractC6532a
        public final native Object invokeSuspend(Object obj);
    }

    /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$register$1 */
    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, m16758d2 = {"me/yun/fkwechat/core/config/ControlManager$register$1", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Ll8/i0;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "app"}, m16759k = 1, m16760mv = {2, 3, 0}, m16762xi = 48)
    public static final class C51751 implements Application.ActivityLifecycleCallbacks {
        static {
            FkwLoader.registerNativesForClass(10, C51751.class);
            Hidden0.special_clinit_10_80(C51751.class);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public native void onActivityCreated(Activity activity, Bundle savedInstanceState);

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public native void onActivityDestroyed(Activity activity);

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public native void onActivityPaused(Activity activity);

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public native void onActivityResumed(Activity activity);

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public native void onActivitySaveInstanceState(Activity activity, Bundle outState);

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public native void onActivityStarted(Activity activity);

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public native void onActivityStopped(Activity activity);
    }

    /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$showClosedDialog$2 */
    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m16758d2 = {"Lec/o0;", "Ll8/i0;", "<anonymous>", "(Lec/o0;)V"}, m16759k = 3, m16760mv = {2, 3, 0})
    @InterfaceC6537f(m25850c = "me.yun.fkwechat.core.config.ControlManager$showClosedDialog$2", m25851f = "ControlManager.kt", m25852l = {}, m25853m = "invokeSuspend", m25854v = 2)
    public static final class C51762 extends AbstractC6544m implements InterfaceC0188p {
        final Activity $activity;
        int label;

        static {
            FkwLoader.registerNativesForClass(11, C51762.class);
            Hidden0.special_clinit_11_50(C51762.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51762(Activity activity, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.$activity = activity;
        }

        @Override // p257r8.AbstractC6532a
        public final native InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f);

        public final native Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f);

        @Override // p010a9.InterfaceC0188p
        public native /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2);

        @Override // p257r8.AbstractC6532a
        public final native Object invokeSuspend(Object obj);
    }

    /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$submitRegisterRequest$2 */
    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m16758d2 = {"Lec/o0;", _UrlKt.FRAGMENT_ENCODE_SET, "<anonymous>", "(Lec/o0;)Ljava/lang/String;"}, m16759k = 3, m16760mv = {2, 3, 0})
    @InterfaceC6537f(m25850c = "me.yun.fkwechat.core.config.ControlManager$submitRegisterRequest$2", m25851f = "ControlManager.kt", m25852l = {}, m25853m = "invokeSuspend", m25854v = 2)
    public static final class C51772 extends AbstractC6544m implements InterfaceC0188p {
        final String $nickname;
        final String $registerType;
        final String $tradeNo;
        final String $uin;
        final String $wxid;
        int label;

        static {
            FkwLoader.registerNativesForClass(12, C51772.class);
            Hidden0.special_clinit_12_50(C51772.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51772(String str, String str2, String str3, String str4, String str5, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.$uin = str;
            this.$wxid = str2;
            this.$nickname = str3;
            this.$registerType = str4;
            this.$tradeNo = str5;
        }

        @Override // p257r8.AbstractC6532a
        public final native InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f);

        public final native Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f);

        @Override // p010a9.InterfaceC0188p
        public native /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2);

        @Override // p257r8.AbstractC6532a
        public final native Object invokeSuspend(Object obj);
    }

    /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$syncLicenseStatus$1 */
    /* JADX INFO: compiled from: Dex2C */
    @Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m16758d2 = {"Lec/o0;", "Ll8/i0;", "<anonymous>", "(Lec/o0;)V"}, m16759k = 3, m16760mv = {2, 3, 0})
    @InterfaceC6537f(m25850c = "me.yun.fkwechat.core.config.ControlManager$syncLicenseStatus$1", m25851f = "ControlManager.kt", m25852l = {Opcodes.I2B, Opcodes.IFGT, Opcodes.IF_ICMPEQ, Opcodes.IF_ICMPGT}, m25853m = "invokeSuspend", m25854v = 2)
    public static final class C51781 extends AbstractC6544m implements InterfaceC0188p {
        final Activity $activity;
        final String $uin;
        final String $wxid;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;

        /* JADX INFO: renamed from: me.yun.fkwechat.core.config.ControlManager$syncLicenseStatus$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: Dex2C */
        @Metadata(m16757d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m16758d2 = {"Lec/o0;", "Ll8/i0;", "<anonymous>", "(Lec/o0;)V"}, m16759k = 3, m16760mv = {2, 3, 0})
        @InterfaceC6537f(m25850c = "me.yun.fkwechat.core.config.ControlManager$syncLicenseStatus$1$2", m25851f = "ControlManager.kt", m25852l = {}, m25853m = "invokeSuspend", m25854v = 2)
        public static final class AnonymousClass2 extends AbstractC6544m implements InterfaceC0188p {
            final Activity $activity;
            final int $role;
            int label;

            static {
                FkwLoader.registerNativesForClass(13, AnonymousClass2.class);
                Hidden0.special_clinit_13_50(AnonymousClass2.class);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(int i10, Activity activity, InterfaceC5976f interfaceC5976f) {
                super(2, interfaceC5976f);
                this.$role = i10;
                this.$activity = activity;
            }

            @Override // p257r8.AbstractC6532a
            public final native InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f);

            public final native Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f);

            @Override // p010a9.InterfaceC0188p
            public native /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2);

            @Override // p257r8.AbstractC6532a
            public final native Object invokeSuspend(Object obj);
        }

        static {
            FkwLoader.registerNativesForClass(14, C51781.class);
            Hidden0.special_clinit_14_50(C51781.class);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C51781(String str, Activity activity, String str2, InterfaceC5976f interfaceC5976f) {
            super(2, interfaceC5976f);
            this.$uin = str;
            this.$activity = activity;
            this.$wxid = str2;
        }

        @Override // p257r8.AbstractC6532a
        public final native InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f);

        public final native Object invoke(InterfaceC2165o0 interfaceC2165o0, InterfaceC5976f interfaceC5976f);

        @Override // p010a9.InterfaceC0188p
        public native /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2);

        @Override // p257r8.AbstractC6532a
        public final native Object invokeSuspend(Object obj);
    }

    static {
        FkwLoader.registerNativesForClass(15, ControlManager.class);
        Hidden0.special_clinit_15_00(ControlManager.class);
    }

    private ControlManager() {
    }

    public static final native /* synthetic */ boolean access$applyLocalBlock(ControlManager controlManager, Activity activity);

    public static final native /* synthetic */ Object access$autoRegisterFlow(ControlManager controlManager, Activity activity, String str, String str2, InterfaceC5976f interfaceC5976f);

    public static final native /* synthetic */ Object access$handleNetworkFallback(ControlManager controlManager, Activity activity, InterfaceC5976f interfaceC5976f);

    public static final native /* synthetic */ void access$setChecking$p(boolean z10);

    public static final native /* synthetic */ Object access$showClosedDialog(ControlManager controlManager, Activity activity, InterfaceC5976f interfaceC5976f);

    public static final native /* synthetic */ Object access$submitRegisterRequest(ControlManager controlManager, String str, String str2, String str3, String str4, String str5, InterfaceC5976f interfaceC5976f);

    public static final native /* synthetic */ void access$syncLicenseStatus(ControlManager controlManager, Activity activity, String str, String str2);

    private final native boolean applyLocalBlock(Activity activity);

    private final native Object autoRegisterFlow(Activity activity, String str, String str2, InterfaceC5976f interfaceC5976f);

    private final native Object handleNetworkFallback(Activity activity, InterfaceC5976f interfaceC5976f);

    public static final native void register(Application application);

    private final native Object showClosedDialog(Activity activity, InterfaceC5976f interfaceC5976f);

    private final native Object submitRegisterRequest(String str, String str2, String str3, String str4, String str5, InterfaceC5976f interfaceC5976f);

    private final native void syncLicenseStatus(Activity activity, String uin, String wxid);
}
