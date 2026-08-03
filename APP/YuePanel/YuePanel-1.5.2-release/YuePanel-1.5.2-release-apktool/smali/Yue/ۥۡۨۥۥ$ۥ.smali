.class public LYue/ۥۡۨۥۥ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۨۥۥ;->load(LYue/ۥ۟ۤۧ۠;Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۨۥۥ;


# direct methods
.method public constructor <init>(LYue/ۥۡۨۥۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۨۥۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۨۥۥ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method public static synthetic ۥ(LYue/ۥۡۨۥۥ$ۥ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۨۥۥ$ۥ;->ۥۣ۟۟۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(Landroid/view/View;)V
    .locals 0

    invoke-static {p0}, LYue/ۥۡۨۥۥ$ۥ;->ۥ۟۟۟۠(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۟(LYue/ۥۡۨۥۥ$ۥ;Landroid/widget/LinearLayout;)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥۡۨۥۥ$ۥ;->ۥ۟۟۟ۡ(Landroid/widget/LinearLayout;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠(Landroid/view/View;)V
    .locals 0

    invoke-static {}, Lcom/yuexin/panel/ۥ;->ۥ۟۟ۡ۟()V

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

    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۦۦۧ;->ۥ(Landroid/content/Context;)V

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, LYue/ۥۡۨۥۢ;

    invoke-direct {v1, p0, p1}, LYue/ۥۡۨۥۢ;-><init>(LYue/ۥۡۨۥۥ$ۥ;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public final synthetic ۥ۟۟۟ۡ(Landroid/widget/LinearLayout;)V
    .locals 3

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/yuexin/panel/R$ۥ۟۟۟۟;->ۥ۟۟ۡ۟:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-virtual {p1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    new-instance p1, LYue/ۥۡۨۥۤ;

    invoke-direct {p1}, LYue/ۥۡۨۥۤ;-><init>()V

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, LYue/ۥۡۨۥۥ$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۨۥۥ;

    invoke-static {p1, v0}, LYue/ۥۡۨۥۥ;->ۥ۟۟(LYue/ۥۡۨۥۥ;Landroid/view/View;)V

    return-void
.end method

.method public final synthetic ۥۣ۟۟۟(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    const/4 v0, 0x0

    :catchall_0
    :goto_0
    const-wide/16 v1, 0x64

    :try_start_0
    invoke-static {v1, v2}, LYue/ۥۢ۟ۡۨ;->ۥ(J)V

    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    invoke-static {v1}, LYue/ۥۢۤۧۧ;->ۥ۟۟۟ۢ(Landroid/view/View;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-lt v2, v3, :cond_0

    const/4 v2, 0x1

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    new-instance v2, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    new-instance v3, LYue/ۥۡۨۥۣ;

    invoke-direct {v3, p0, v1}, LYue/ۥۡۨۥۣ;-><init>(LYue/ۥۡۨۥۥ$ۥ;Landroid/widget/LinearLayout;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_0
    sget v1, LYue/ۥ۟ۦۣۨ;->ۥ۟۟۟ۨ:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-lt v0, v1, :cond_1

    :goto_1
    return-void

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
