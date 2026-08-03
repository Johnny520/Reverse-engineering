.class public LYue/ۥۡۨۧۢ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨۧۢ;->load(LYue/ۥ۟ۤۧۡ;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۥ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۨۧۢ;


# direct methods
.method public constructor <init>(LYue/ۥۡۨۧۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨۧۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۨۧۢ;

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
    sget-object p0, LYue/ۥۡۨۧۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x4358dd03f8e2ef54L    # -1.6054281611640683E-16

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۢ$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥۡۨۧۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x157979f69f3a818fL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥۡۨۧۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_3
    return-object p0
.end method

.method public static synthetic ۥ(LYue/ۥۡۨۧۢ$ۥ;Landroid/view/ViewGroup;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۨۧۢ$ۥ;->ۥ۟۟۟۠(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥۡۨۧۢ$ۥ;Landroid/view/ViewGroup;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۨۧۢ$ۥ;->ۥ۟۟۟ۡ(Landroid/view/ViewGroup;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥۡۨۧۢ$ۥ;Landroid/app/Dialog;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۨۧۢ$ۥ;->ۥۣ۟۟۟(Landroid/app/Dialog;)V

    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥۡۨۧۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۦۦۨ;->ۥ۟۟(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast p1, Landroid/app/Dialog;

    invoke-static {p1}, LYue/ۥ۟ۦۣۨ;->ۥ۟۟۟۠(Landroid/app/Dialog;)V

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, LYue/ۥۡۨۧۡ;

    invoke-direct {v1, p0, p1}, LYue/ۥۡۨۧۡ;-><init>(LYue/ۥۡۨۧۢ$ۥ;Landroid/app/Dialog;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final synthetic ۥ۟۟۟۠(Landroid/view/ViewGroup;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۨۧۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۨۧۢ;

    invoke-static {v0, p1}, LYue/ۥۡۨۧۢ;->ۥ۟۟۟ۥ(LYue/ۥۡۨۧۢ;Landroid/view/ViewGroup;)V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۡ(Landroid/view/ViewGroup;)V
    .locals 1

    iget-object v0, p0, LYue/ۥۡۨۧۢ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۨۧۢ;

    invoke-static {v0, p1}, LYue/ۥۡۨۧۢ;->ۥ۟۟۟ۥ(LYue/ۥۡۨۧۢ;Landroid/view/ViewGroup;)V

    return-void
.end method

.method public final synthetic ۥۣ۟۟۟(Landroid/app/Dialog;)V
    .locals 8

    const/4 v0, 0x0

    const/4 v1, 0x0

    move-object v2, v1

    move v1, v0

    :goto_0
    const/16 v3, 0x14

    if-ge v0, v3, :cond_3

    const-wide/16 v3, 0x64

    invoke-static {v3, v4}, LYue/ۥۢ۟ۡۨ;->ۥ(J)V

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/view/ViewGroup;

    invoke-static {v3}, LYue/ۥۢۤۧۧ;->ۥ۟۟۟ۢ(Landroid/view/View;)Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {v6}, LYue/ۥۡۨۧۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    check-cast v4, Landroid/view/ViewGroup;

    add-int/lit8 v1, v1, 0x1

    if-ne v1, v6, :cond_1

    move-object v2, v4

    :cond_1
    const/4 v5, 0x2

    if-ne v1, v5, :cond_0

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, LYue/ۥۡۨۧ۟;

    invoke-direct {v0, p0, v4}, LYue/ۥۡۨۧ۟;-><init>(LYue/ۥۡۨۧۢ$ۥ;Landroid/view/ViewGroup;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    if-eqz v2, :cond_4

    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {p1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v0, LYue/ۥۡۨۧ۠;

    invoke-direct {v0, p0, v2}, LYue/ۥۡۨۧ۠;-><init>(LYue/ۥۡۨۧۢ$ۥ;Landroid/view/ViewGroup;)V

    invoke-virtual {p1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_4
    return-void
.end method
