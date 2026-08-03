.class public LYue/ۥ۟ۤۤۤ;
.super LYue/ۥ۠ۥ۟;


# static fields
.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;


# instance fields
.field public ۥ:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x42a

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LYue/ۥ۠ۥ۟;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, LYue/ۥ۟ۤۤۤ;->ۥ:J

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native synthetic ۥ(Landroid/widget/FrameLayout;)V
.end method

.method public static native synthetic ۥ۟(ILandroid/view/View;)Z
.end method

.method public static native synthetic ۥ۟۟(LYue/ۥ۟ۤۤۤ;)J
.end method

.method public static native synthetic ۥ۟۟۟(LYue/ۥ۟ۤۤۤ;J)J
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥ۟ۤۤۤ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۤۤۤ;->ۥ۟۟۟ۢ(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    return-void
.end method

.method public static native synthetic ۥ۟۟۟۠(LYue/ۥ۟ۤۤۤ;Ljava/lang/ClassLoader;Landroid/view/View;)V
.end method

.method public static native synthetic ۥۣ۟۟۟(ILandroid/view/View;)Z
.end method

.method public static native synthetic ۥ۟۟۟ۤ(Landroid/widget/FrameLayout;)V
.end method


# virtual methods
.method public native info()Lcom/yuexin/panel/myClass/itemInfo;
.end method

.method public load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
    .locals 2

    const/4 p1, 0x2

    invoke-static {p1}, LYue/ۥ۟ۤۤۤ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, p2}, Lde/robv/android/xposed/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    const/4 v0, 0x3

    invoke-static {v0}, LYue/ۥ۟ۤۤۤ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, LYue/ۥ۟ۤۤۤ$ۥ;

    invoke-direct {v1, p0, p2}, LYue/ۥ۟ۤۤۤ$ۥ;-><init>(LYue/ۥ۟ۤۤۤ;Ljava/lang/ClassLoader;)V

    const-class p2, Ljava/lang/String;

    filled-new-array {p2, v1}, [Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, v0, p2}, LYue/ۥ۠ۤۦۢ;->ۥ۟۟۟(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)LYue/ۥ۠ۤۦۢ$ۥ۟;

    return-void
.end method

.method public final native ۥ۟۟۟ۡ(Ljava/lang/ClassLoader;Landroid/view/View;)V
.end method

.method public final ۥ۟۟۟ۢ(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast p1, Landroid/widget/FrameLayout;

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, LYue/ۥ۟ۤۤۢ;

    invoke-direct {v1, p1}, LYue/ۥ۟ۤۤۢ;-><init>(Landroid/widget/FrameLayout;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
