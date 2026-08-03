.class public LYue/ۥۣ۟ۧۨ;
.super Ljava/lang/Object;


# static fields
.field public static volatile synthetic ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۟:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۟ۢ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1df

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

.method public static native ۥ(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public static ۥ۟(Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    :try_start_0
    invoke-static {v1}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۨ()J

    move-result-wide v3

    const-wide/16 v5, 0x1a2a

    cmp-long v3, v5, v3

    if-ltz v3, :cond_0

    const/4 v1, 0x5

    invoke-static {v1}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v3

    const/4 v4, 0x6

    invoke-static {v4}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    const-class v5, Ljava/lang/String;

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v5

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v3, v4, v5, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    if-nez p0, :cond_1

    return-object v2

    :cond_1
    const/4 p0, 0x0

    invoke-static {p0}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۣۣۢۨ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x7

    invoke-static {v0}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1}, [Ljava/lang/Class;

    move-result-object v1

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0, v0, v1, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    return-object v2
.end method

.method public static ۥ۟۟(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 4

    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣۣۢۨ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x3

    invoke-static {v1}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    filled-new-array {v3, v3, v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p0, p1, p2}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v1, v2, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟(Ljava/lang/String;)Ljava/lang/Object;
    .locals 5

    invoke-static {p0}, LYue/ۥۣ۟ۧۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣۣۢۨ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x2

    invoke-static {v1}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v4, Ljava/lang/String;

    filled-new-array {v4, v2, v3}, [Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    filled-new-array {p0, v3, v4}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v1, v2, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۟(Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    invoke-static {p0}, LYue/ۥۣ۟ۧۨ;->ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۣۣۢۨ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v1, 0x0

    :goto_0
    const/4 v2, 0x2

    invoke-static {v2}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-class v5, Ljava/lang/String;

    filled-new-array {v5, v3, v4}, [Ljava/lang/Class;

    move-result-object v3

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {p0, v4, v0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v1, v2, v3, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟۠(Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۟()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣۣۢۨ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    invoke-static {v1}, LYue/ۥۣ۟ۧۨ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const-class v2, Ljava/lang/String;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, v1, v2, p0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static native ۥ۟۟۟ۡ(Ljava/lang/String;)J
.end method
