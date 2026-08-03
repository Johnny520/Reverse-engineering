.class public LYue/ۥۣ۟۠ۦ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟۠ۦ;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۧ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۨ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/lang/Class;

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣ۟۠ۦ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟۠ۦ;Ljava/lang/ClassLoader;Ljava/lang/Class;)V
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

    iput-object p1, p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟۠ۦ;

    iput-object p2, p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    iput-object p3, p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Class;

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
    sget-object p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x7d9c833db7dc0f91L    # 1.1654495671918286E297

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x4d789e60c40e3f44L    # 1.6204049542331799E65

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥ۟۟۠ۧ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x4a9e2fe76ca896ddL    # 2.8235860879226572E51

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_5
    return-object p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 10

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۣ۟۠ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    :cond_0
    const/4 v1, 0x2

    const/4 v2, 0x1

    :try_start_0
    iget-object v3, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v4, v3, v2

    invoke-static {v2}, LYue/ۥۣ۟۠ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {v4, v3, v0}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    const/16 v3, 0x4d

    if-eq v0, v3, :cond_3

    const/4 v3, 0x7

    if-eq v0, v3, :cond_3

    const/16 v3, 0x8

    if-eq v0, v3, :cond_3

    const/4 v3, 0x5

    if-eq v0, v3, :cond_3

    const/16 v3, 0x1b

    if-eq v0, v3, :cond_3

    const/16 v3, 0x88

    if-ne v0, v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v5, v0, v1

    iget-object v0, p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣ۟۠ۦ;

    iget-object v3, p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-static {v0, v3}, LYue/ۥۣ۟۠ۦ;->ۥ(LYue/ۥۣ۟۠ۦ;Ljava/lang/ClassLoader;)Ljava/lang/Object;

    move-result-object v6

    if-nez v6, :cond_2

    return-void

    :cond_2
    iget-object v0, p0, LYue/ۥۣ۟۠ۦ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Class;

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v8, 0x0

    move-object v7, v9

    filled-new-array/range {v4 .. v9}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v3}, LYue/ۥۡۦۢۨ;->ۥ۟۟۟(Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_3
    :goto_0
    return-void

    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v1}, LYue/ۥۣ۟۠ۦ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v2}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    :goto_2
    return-void
.end method
