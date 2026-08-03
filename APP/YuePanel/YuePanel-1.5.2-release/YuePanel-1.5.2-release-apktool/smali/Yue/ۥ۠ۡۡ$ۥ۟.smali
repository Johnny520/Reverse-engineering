.class public LYue/ۥ۠ۡۡ$ۥ۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۡۡ;->ۥ۟۟۠۠(Ljava/lang/ClassLoader;LYue/ۥ۟ۤۧ۠;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۡۡ;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۡۡ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۡۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۠ۡۡ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x7edab9817d0cc1f9L    # 1.1454269322188464E303

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_1
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۡۢۡ;->ۥ۟۟۟ۨ()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p1}, LYue/ۥ۠ۡۢۡ;->ۥۣ۟۟ۡ(Ljava/lang/Object;)V

    sput-object p1, LYue/ۥ۟ۦۣۨ;->ۥ۟۟:Ljava/lang/Object;

    :cond_0
    invoke-static {}, LYue/ۥ۠ۡۢۡ;->ۥ۟۟۟ۨ()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, p1, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, LYue/ۥ۠ۡۢۡ;->ۥۣ۟۟ۡ(Ljava/lang/Object;)V

    sput-object p1, LYue/ۥ۟ۦۣۨ;->ۥ۟۟:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-static {p1}, LYue/ۥ۠ۡۡ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۨۡۢ;->ۥ(Ljava/lang/String;)V

    return-void
.end method
