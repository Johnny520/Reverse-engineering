.class public LYue/ۥ۟ۥۨ۟$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۨ۟;->ۥ۟۟۟ۡ(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۥۨ۟;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۥۨ۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۥۨ۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟ۥۨ۟;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۟ۥۨ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x1786b7824a5b70b3L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۨ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥ۟ۥۨ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x1935cd631430dc8aL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۨ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_3
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    :try_start_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, LYue/ۥ۟ۥۨ۟;->ۥ۟۟(Ljava/lang/String;)Ljava/lang/String;

    invoke-static {}, LYue/ۥ۟ۥۨ۟;->ۥ۟۟۟()Z

    move-result p1

    const/4 v0, 0x1

    if-nez p1, :cond_1

    invoke-static {}, LYue/ۥ۟ۥۨ۟;->ۥ۟()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-static {p1}, LYue/ۥ۟ۥۨ۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟ۡ(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lorg/json/JSONObject;

    if-nez v1, :cond_0

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    :cond_0
    invoke-static {v0}, LYue/ۥ۟ۥۨ۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, LYue/ۥ۟ۥۨ۟;->ۥ۟()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-static {p1}, LYue/ۥ۟ۥۨ۟$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟ۧ(Ljava/lang/String;Ljava/lang/Object;)Z

    :cond_1
    invoke-static {v0}, LYue/ۥ۟ۥۨ۟;->ۥ۟۟۟۟(Z)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    return-void
.end method
