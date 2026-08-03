.class public LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۧ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۥۧۧ;->ۥ۟۟ۡۧ(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۥۧۧ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۥۧۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۧ;->ۥۣ۟۟۠:LYue/ۥ۟ۥۧۧ;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method

.method private static synthetic yue_xin_awa(I)Ljava/lang/String;
    .locals 2

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x5afb499990b0584dL

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۧ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_1
    return-object p0
.end method

.method public static synthetic ۥ(Landroid/widget/FrameLayout;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۧ;->ۥ۟۟۟(Landroid/widget/FrameLayout;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(Landroid/widget/FrameLayout;Landroid/view/View;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    add-int/lit8 p0, p0, 0x1e

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    const/4 v1, -0x1

    invoke-direct {v0, v1, p0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const/16 v1, 0xa

    const/4 v2, 0x0

    const/16 v3, 0x14

    invoke-virtual {v0, v3, v1, v3, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    :try_start_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {v0}, LYue/ۥ۟ۥۧۧ$ۥ۟۟۟ۧ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object v1

    const-class v2, Landroid/view/View;

    invoke-static {p1, v1, v2}, LYue/ۥ۠ۨۤۢ;->ۥ۟۟۟۟(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    instance-of v2, v1, Landroid/widget/FrameLayout;

    if-eqz v2, :cond_0

    check-cast v1, Landroid/widget/FrameLayout;

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Lcom/yuexin/panel/R$ۥ۟۟۟۟;->ۥ۟۟ۡ۠:I

    invoke-virtual {v2, v3, v1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-static {}, LYue/ۥ۟ۥۧۧ;->ۥ۟۟۠()Ljava/util/HashMap;

    move-result-object v2

    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, LYue/ۥ۟ۥۧۨ;

    invoke-direct {p1, v1, v0}, LYue/ۥ۟ۥۧۨ;-><init>(Landroid/widget/FrameLayout;Landroid/view/View;)V

    invoke-virtual {v1, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method
