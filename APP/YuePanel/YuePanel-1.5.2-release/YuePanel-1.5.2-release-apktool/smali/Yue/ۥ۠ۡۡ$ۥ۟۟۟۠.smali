.class public LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۡۡ;->ۥ۟۟۟ۧ(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۠ۡۡ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡۡ;Ljava/lang/ClassLoader;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010
        }
        names = {
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:LYue/ۥ۠ۡۡ;

    iput-object p2, p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_4

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x23ba4f57c177adc6L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x1a2c2bcb25930f00L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x19a3c54a4102a570L    # 3.635079695384694E-185

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_5
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {}, LYue/ۥ۠ۡۡ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    iget-object v2, p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    iget-object v3, p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-static {v1}, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    new-array v4, v1, [Ljava/lang/Class;

    invoke-static {v2, v3, v1, v4}, LYue/ۥۢۦۣۣ;->ۥ۟(Ljava/lang/Class;Ljava/lang/Class;I[Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v2, 0x1

    invoke-static {v2}, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/reflect/Method;

    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-static {v2}, LYue/ۥ۠ۡۡ;->ۥ۟۟۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    :cond_1
    invoke-static {}, LYue/ۥ۠ۡۡ;->ۥ۟۟۟ۡ()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, LYue/ۥۣ۠ۡۧ;

    invoke-direct {v1}, LYue/ۥۣ۠ۡۧ;-><init>()V

    invoke-virtual {v1, v0}, LYue/ۥۣ۠ۡۧ;->ۥۣ۟۟۟(Ljava/lang/Object;)LYue/ۥۣ۠ۡۧ;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LYue/ۥۣ۠ۡۧ;->ۥ۟۟۟ۥ(Ljava/lang/Class;)LYue/ۥۣ۠ۡۧ;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v1}, LYue/ۥ۠ۡۡ$ۥ۟۟۟۠;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۣ۠ۡۧ;->ۥ۟(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {v0, p1}, LYue/ۥ۠ۡۢۡ;->ۥ۟(Ljava/lang/String;Ljava/lang/Object;)V

    return-void
.end method
