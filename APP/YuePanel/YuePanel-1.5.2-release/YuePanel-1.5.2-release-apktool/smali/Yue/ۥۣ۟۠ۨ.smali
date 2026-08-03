.class public LYue/ۥۣ۟۠ۨ;
.super Ljava/lang/Object;


# static fields
.field public static ۥ:Ljava/lang/String;

.field public static ۥ۟:Ljava/lang/String;

.field public static ۥ۟۟:Ljava/lang/String;

.field public static ۥ۟۟۟:Landroid/content/Context;

.field public static ۥ۟۟۟۟:Ljava/lang/String;

.field public static ۥ۟۟۟۠:Ljava/lang/String;

.field public static ۥ۟۟۟ۡ:J

.field public static ۥ۟۟۟ۢ:Ljava/lang/ClassLoader;

.field public static ۥۣ۟۟۟:Ljava/lang/ClassLoader;

.field public static ۥ۟۟۟ۤ:Landroid/app/Activity;

.field public static volatile synthetic ۥ۟۟۟ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۢ:Ljava/lang/String;

.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x44

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static native synthetic yue_xin_awa(I)Ljava/lang/String;
.end method

.method public static native ۥ()Landroid/app/Activity;
.end method

.method public static native ۥ۟()Ljava/lang/String;
.end method

.method public static native ۥ۟۟()Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟()Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟۟()Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟۠()Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟ۡ()Landroid/content/Context;
.end method

.method public static ۥ۟۟۟ۢ()Landroid/content/Context;
    .locals 3

    :try_start_0
    sget-object v0, LYue/ۥ۟ۦۣۨ;->ۥ۟:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    sget-object v0, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۢ:Ljava/lang/ClassLoader;

    invoke-static {v1}, LYue/ۥۣ۟۠ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v2}, LYue/ۥۣ۟۠ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, LYue/ۥ۠ۨۤۢ;->ۥۣ۟۟۟(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۣۨ;->ۥ۟:Ljava/lang/Object;

    :cond_0
    sget-object v0, LYue/ۥ۟ۦۣۨ;->ۥ۟:Ljava/lang/Object;

    const/4 v2, 0x2

    invoke-static {v2}, LYue/ۥۣ۟۠ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const/4 v0, 0x3

    invoke-static {v0}, LYue/ۥۣ۟۠ۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    sget-object v0, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟:Landroid/content/Context;

    return-object v0
.end method

.method public static native ۥۣ۟۟۟()Ljava/lang/ClassLoader;
.end method

.method public static native ۥ۟۟۟ۤ()Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟ۥ()Ljava/lang/ClassLoader;
.end method

.method public static native ۥ۟۟۟ۦ()Landroid/app/Activity;
.end method

.method public static native ۥ۟۟۟ۧ()Ljava/lang/String;
.end method

.method public static native ۥ۟۟۟ۨ()J
.end method

.method public static native ۥ۟۟۠(Landroid/app/Activity;)V
.end method

.method public static native ۥ۟۟۠۟(Ljava/lang/String;)V
.end method

.method public static native ۥ۟۟۠۠(Ljava/lang/String;)V
.end method

.method public static native ۥ۟۟۠ۡ(Ljava/lang/String;)V
.end method

.method public static native ۥ۟۟۠ۢ(Landroid/content/Context;)V
.end method

.method public static native ۥۣ۟۟۠(Ljava/lang/ClassLoader;)V
.end method

.method public static native ۥ۟۟۠ۤ(Ljava/lang/String;)V
.end method

.method public static native ۥ۟۟۠ۥ(Ljava/lang/ClassLoader;)V
.end method

.method public static native ۥ۟۟۠ۦ(Ljava/lang/String;)V
.end method

.method public static native ۥ۟۟۠ۧ(J)V
.end method
