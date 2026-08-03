.class public LYue/ۥۡۡ۠$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۡ۠;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟ۡ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/Class;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۡۡ۠;


# direct methods
.method public constructor <init>(LYue/ۥۡۡ۠;Ljava/lang/Class;Ljava/lang/ClassLoader;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010,
            0x1010,
            0x1010
        }
        names = {
            null,
            null,
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۡ۠;

    iput-object p2, p0, LYue/ۥۡۡ۠$ۥ;->ۥۣ۟۟۠:Ljava/lang/Class;

    iput-object p3, p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

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
    sget-object p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x631580a313e89bb6L    # 2.0287395786440918E169

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟ۡ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x170887b1347ecf07L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x721bd52b5bd4c03L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x3d28dd04216cdaaL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_7
    return-object p0
.end method

.method public static synthetic ۥ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟۟۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x2

    invoke-static {v0}, LYue/ۥۡۡ۠$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, LYue/ۥۡۥۥ;->ۥ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x3

    invoke-static {v0}, LYue/ۥۡۡ۠$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, LYue/ۥۡۨ۠ۧ;->ۥ۟۟۠ۧ:LYue/ۥۡۨ۠ۧ;

    invoke-virtual {v2}, LYue/ۥۡۨ۠ۧ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v2

    invoke-static {p0, v1, v2}, LYue/ۥۡۧۤ;->ۥ۟۟ۡ۠(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0}, LYue/ۥۡۡ۠$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    const-class v2, Ljava/util/List;

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->findFirstFieldByExactType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    move-result-object v0

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object p1, p1, v1

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    iget-object v2, p0, LYue/ۥۡۡ۠$ۥ;->ۥۣ۟۟۠:Ljava/lang/Class;

    invoke-static {v0, v2}, Lde/robv/android/xposed/XposedHelpers;->findFirstFieldByExactType(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    move-result-object v0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, LYue/ۥۡۡۡ;->ۥ۟۟(Ljava/lang/Class;)LYue/ۥۡۡۡ;

    move-result-object v2

    invoke-static {v1}, LYue/ۥۡۡ۠$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LYue/ۥۡۡۡ;->ۥ۟۟۟ۡ(Ljava/lang/String;)LYue/ۥۡۡۡ;

    move-result-object v2

    iget-object v3, p0, LYue/ۥۡۡ۠$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/ClassLoader;

    invoke-virtual {v2, v3}, LYue/ۥۡۡۡ;->ۥ۟۟۟۟(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    new-instance v3, LYue/ۥۡۡ۟ۨ;

    invoke-direct {v3, v2}, LYue/ۥۡۡ۟ۨ;-><init>(Ljava/lang/Object;)V

    sget v2, Lcom/yuexin/panel/R$ۥ۟۟;->ۥ۟۟:I

    const/4 v4, 0x1

    invoke-static {v4}, LYue/ۥۡۡ۠$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v0, v2, v4, v3}, LYue/ۥ۟ۨ۟ۦ;->ۥ(Ljava/lang/Object;ILjava/lang/String;Ljava/util/concurrent/Callable;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    return-void
.end method
