.class public LYue/ۥ۠ۡۡ$ۥ۟۟۟ۡ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۡۡ;->ۥ۟۟۟ۨ(Ljava/lang/ClassLoader;)V
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

    iput-object p1, p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۡ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0xcaae4f1bdc7903cL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_1
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v1, p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۡ;

    invoke-static {v1}, LYue/ۥ۠ۡۡ;->ۥۣ۟۟۟(LYue/ۥ۠ۡۡ;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    iget-object v1, p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۡ;

    invoke-static {v1, p1}, LYue/ۥ۠ۡۡ;->ۥ۟۟۟ۥ(LYue/ۥ۠ۡۡ;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, LYue/ۥ۠ۡۡ;->ۥ۟۟۟ۤ(LYue/ۥ۠ۡۡ;Ljava/lang/String;)Ljava/lang/String;

    :cond_0
    :try_start_0
    iget-object v1, p0, LYue/ۥ۠ۡۡ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:LYue/ۥ۠ۡۡ;

    invoke-static {v1}, LYue/ۥ۠ۡۡ;->ۥۣ۟۟۟(LYue/ۥ۠ۡۡ;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v1, v2}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    invoke-static {p1}, LYue/ۥ۟ۥۨۤ;->ۥ۟۟(I)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYue/ۥ۟ۥۨۤ;->ۥ(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    invoke-static {v0}, LYue/ۥ۠ۡۡ$ۥ۟۟۟ۡ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۠ۡ(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    return-void
.end method
