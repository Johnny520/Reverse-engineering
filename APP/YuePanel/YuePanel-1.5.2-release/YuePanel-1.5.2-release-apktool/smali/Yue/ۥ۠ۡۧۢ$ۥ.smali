.class public LYue/ۥ۠ۡۧۢ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۡۧۢ;->ۥ۟۟ۢ(Ljava/lang/Class;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# static fields
.field public static volatile synthetic ۥۣ۟۟۠:Ljava/lang/String;

.field public static volatile synthetic ۥ۟۟۠ۤ:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

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
    sget-object p0, LYue/ۥ۠ۡۧۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-nez p0, :cond_1

    const-wide v0, -0x602738a40bbdaa05L

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۧۢ$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    :cond_1
    return-object p0

    :cond_2
    sget-object p0, LYue/ۥ۠ۡۧۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    if-nez p0, :cond_3

    const-wide v0, 0x486bda246c82162eL    # 7.582067786752096E40

    invoke-static {v0, v1}, LYue/ۥ۠ۥۨۧ;->ۥ(J)Ljava/lang/String;

    move-result-object p0

    sput-object p0, LYue/ۥ۠ۡۧۢ$ۥ;->ۥۣ۟۟۠:Ljava/lang/String;

    :cond_3
    return-object p0
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {}, LYue/ۥ۠ۡۧۢ;->ۥ۟۟۟()Ljava/lang/ThreadLocal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v0, v0, Landroid/view/View;

    if-eqz v0, :cond_3

    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-eqz v0, :cond_3

    array-length v1, v0

    if-eqz v1, :cond_3

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v2, v0, Landroid/view/MotionEvent;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast v0, Landroid/view/MotionEvent;

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v2

    if-eqz v2, :cond_2

    return-void

    :cond_2
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-static {p1}, LYue/ۥ۠ۡۧۢ;->ۥ۟۟۟ۡ(Landroid/view/View;)LYue/ۥ۠ۡۧۢ$ۥ۟۟۟۠;

    move-result-object v2

    iget-boolean v3, v2, LYue/ۥ۠ۡۧۢ$ۥ۟۟۟۠;->ۥ۟۟:Z

    if-eqz v3, :cond_3

    iget-boolean v3, v2, LYue/ۥ۠ۡۧۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۢ:Z

    if-eqz v3, :cond_3

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F

    move-result v0

    invoke-static {p1, v3, v0}, LYue/ۥ۠ۡۧۢ;->ۥۣ۟۟۟(Landroid/view/View;FF)Z

    move-result p1

    if-eqz p1, :cond_3

    iput-boolean v1, v2, LYue/ۥ۠ۡۧۢ$ۥ۟۟۟۠;->ۥ۟۟۠ۢ:Z

    const/4 p1, 0x1

    invoke-static {p1}, LYue/ۥ۠ۡۧۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۡۧۢ;->ۥ۟۟۟۠(Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 6

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {}, LYue/ۥ۠ۡۧۢ;->ۥ۟۟۟()Ljava/lang/ThreadLocal;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void

    :cond_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    instance-of v2, v1, Landroid/view/View;

    if-eqz v2, :cond_3

    iget-object v2, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    if-eqz v2, :cond_3

    array-length v3, v2

    if-eqz v3, :cond_3

    const/4 v3, 0x0

    aget-object v2, v2, v3

    instance-of v2, v2, Landroid/view/MotionEvent;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast v1, Landroid/view/View;

    invoke-static {v1}, LYue/ۥ۠ۡۧۢ;->ۥ۟۟۟۟(Landroid/view/View;)Landroid/app/Activity;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-static {v3}, LYue/ۥ۠ۡۧۢ$ۥ;->yue_xin_awa(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠ۡۧۢ;->ۥ۟۟۟۠(Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v4, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    aget-object v3, v4, v3

    check-cast v3, Landroid/view/MotionEvent;

    invoke-static {v1}, LYue/ۥ۠ۡۧۢ;->ۥ۟۟۟ۡ(Landroid/view/View;)LYue/ۥ۠ۡۧۢ$ۥ۟۟۟۠;

    move-result-object v4

    invoke-virtual {v3}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v5

    invoke-static {v2, v1, v3, v5, v4}, LYue/ۥ۠ۡۧۢ;->ۥ۟۟۟ۢ(Landroid/app/Activity;Landroid/view/View;Landroid/view/MotionEvent;ILYue/ۥ۠ۡۧۢ$ۥ۟۟۟۠;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    :cond_3
    :goto_0
    return-void
.end method
