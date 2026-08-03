.class public LYue/ۥ۠ۦۧ۠$ۥ۟۟۟۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۦۧ۠;->ۥ۟(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۦۧ۠;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۦۧ۠;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۦۧ۠;

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
    sget-object p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x5889e9a120b8fcc2L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x42bca6eb6c4b840aL    # 3.150323989184404E13

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۦۧ۠$ۥ۟۟۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_3
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

    invoke-static {v0}, LYue/ۥ۠ۦۧ۠$ۥ۟۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    const/4 p1, 0x1

    invoke-static {p1}, LYue/ۥ۠ۦۧ۠$ۥ۟۟۟۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p1, v0}, LYue/ۥۡۢ۟ۡ;->ۥۣ۟۟۟(Ljava/lang/String;I)V

    return-void
.end method
