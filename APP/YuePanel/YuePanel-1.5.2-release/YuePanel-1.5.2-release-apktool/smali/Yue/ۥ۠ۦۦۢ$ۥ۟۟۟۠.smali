.class public LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۦۦۢ;->ۥ۟۟۟۟(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۦ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۦۦۢ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦۦۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;->ۥۣ۟۟۠:LYue/ۥ۠ۦۦۢ;

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
    sget-object p0, LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۦ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x4960a491dd17600eL    # 2.9691837831460824E45

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۦ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, -0x578dd1cd7b449a98L    # -7.38255133925091E-114

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_3
    return-object p0

    :cond_4
    sget-object p0, LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_5

    const-wide v0, 0x541ef0b848619ff7L    # 1.6522026293232623E97

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_5
    return-object p0
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    invoke-static {v0}, LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    const/4 p1, 0x2

    invoke-static {p1}, LYue/ۥ۠ۦۦۢ$ۥ۟۟۟۠;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x3

    invoke-static {p1, v0}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    :cond_1
    :goto_0
    return-void
.end method
