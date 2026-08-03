.class public LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۧۧ;->ۥ۟۟ۡۥ(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ۟:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public final synthetic ۥ۟۟۠ۥ:Ljava/lang/reflect/Method;

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥ۟ۥۧۧ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۥۧۧ;Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥ۟ۥۧۧ;

    iput-object p2, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    iput-object p3, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    iput-object p4, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/reflect/Method;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_6

    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x7161b50c6c15f198L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟ۡ۟:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x7e5b05e3d0eeaed7L    # 4.524278917668629E300

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x38d86c0fb2b30f7bL    # 7.349262763227339E-35

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, -0x7ddbe542e8d927f2L    # -2.401631960770026E-298

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_7
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    invoke-static {v0}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۥۧۧ;->ۥ۟۟۠ۦ(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v1, v1, v0

    const/4 v2, 0x1

    invoke-static {v2}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    new-array v4, v0, [Ljava/lang/Object;

    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    iget-object v5, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    iget-object v5, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/reflect/Method;

    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v5

    new-array v6, v0, [Ljava/lang/Object;

    invoke-static {v3, v5, v6}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/Object;

    aget-object v2, v3, v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    const/4 v5, 0x2

    aget-object v3, v3, v5

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    const-class v6, Ljava/lang/String;

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v6, v7, v7}, [Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v4

    invoke-static {v5}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v5

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v1, v5, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v5, 0x3e8

    mul-long/2addr v0, v5

    invoke-static {v0, v1}, LYue/ۥۣۢۡۨ;->ۥ۟۟۟۟(J)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0, v2, v3}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v1, 0x3

    invoke-static {v1}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
