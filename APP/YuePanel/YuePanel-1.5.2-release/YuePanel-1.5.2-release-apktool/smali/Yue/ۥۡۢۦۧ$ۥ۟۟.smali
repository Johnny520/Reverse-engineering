.class public LYue/ۥۡۢۦۧ$ۥ۟۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۢۦۧ;->ۥۣ۟۟۟(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۢۦۧ;


# direct methods
.method public constructor <init>(LYue/ۥۡۢۦۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۢۦۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡۢۦۧ;

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
    sget-object p0, LYue/ۥۡۢۦۧ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x5863984dc4c58a17L    # 6.176638524068541E117

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۢۦۧ$ۥ۟۟;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۡۢۦۧ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x7f28b0a8a5f28ccfL    # 3.3863201440845107E304

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۢۦۧ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۡۢۦۧ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, -0x6c5c377f779b6937L    # -4.591027352350366E-214

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۢۦۧ$ۥ۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_5
    return-object p0

    :cond_6
    sget-object p0, LYue/ۥۡۢۦۧ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_7

    const-wide v0, 0x31aae3ff84b7f775L    # 1.9481024294932063E-69

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۢۦۧ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_7
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    const/4 v0, 0x1

    :try_start_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v2, 0x0

    aget-object p1, p1, v2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    invoke-static {v2}, LYue/ۥۡۢۦۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    new-array v2, v2, [Ljava/lang/Object;

    invoke-static {v1, v3, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, LYue/ۥۡۢۦۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1, v2, p1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, LYue/ۥۡۢۦۧ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥۡۢۦۧ;

    invoke-virtual {v1, p1}, LYue/ۥۡۢۦۧ;->ۥ۟۟۟۟(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, LYue/ۥۢۤ۠ۧ;->ۥ۟۟۟۠(Ljava/lang/Object;)V

    const/4 p1, 0x2

    invoke-static {p1}, LYue/ۥۡۢۦۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    sput-object p1, LYue/ۥ۟ۦۣۨ;->ۥ۟۟۟۠:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/4 v2, 0x3

    invoke-static {v2}, LYue/ۥۡۢۦۧ$ۥ۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    :goto_0
    return-void
.end method
