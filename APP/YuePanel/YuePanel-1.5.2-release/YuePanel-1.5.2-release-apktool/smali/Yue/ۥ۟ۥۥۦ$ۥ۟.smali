.class public LYue/ۥ۟ۥۥۦ$ۥ۟;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۥۦ;->ۥ۟۟۠(Ljava/lang/String;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۥۥۦ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۥۥۦ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۥۥۦ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۟ۥۥۦ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۟ۥۥۦ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, 0x5946565e389e332L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۥۦ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_1
    return-object p0
.end method

.method public static synthetic ۥ(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, LYue/ۥ۟ۥۥۦ$ۥ۟;->ۥ۟۟۟۠(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, LYue/ۥ۟ۥۥۦ$ۥ۟;->ۥ۟۟۟۟(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۟(Landroid/view/View;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠(Landroid/view/View;)V
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    const/16 v2, 0x14

    if-ge v1, v2, :cond_1

    const-wide/16 v2, 0x64

    invoke-static {v2, v3}, LYue/ۥۢ۟ۡۨ;->ۥ(J)V

    invoke-static {p0}, LYue/ۥۢۤۧۧ;->ۥ۟۟۟ۢ(Landroid/view/View;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    const/16 v4, 0xa

    if-le v3, v4, :cond_0

    invoke-static {v0}, LYue/ۥ۟ۥۥۦ$ۥ۟;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟۟۟(Ljava/lang/String;)I

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    new-instance v4, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v5, LYue/ۥ۟ۥۥۨ;

    invoke-direct {v5, v3}, LYue/ۥ۟ۥۥۨ;-><init>(Landroid/view/View;)V

    invoke-virtual {v4, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/View;

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, LYue/ۥ۟ۥۥۧ;

    invoke-direct {v1, p1}, LYue/ۥ۟ۥۥۧ;-><init>(Landroid/view/View;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method
