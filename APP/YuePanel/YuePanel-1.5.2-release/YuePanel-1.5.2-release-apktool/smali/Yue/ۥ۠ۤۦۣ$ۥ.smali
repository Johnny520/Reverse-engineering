.class public LYue/ۥ۠ۤۦۣ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۤۦۣ;->ۥ(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    return-void
.end method


# virtual methods
.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast p1, Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    instance-of v0, p1, Landroid/app/Activity;

    if-eqz v0, :cond_1

    check-cast p1, Landroid/app/Activity;

    invoke-static {p1}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p1

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p1}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۢ(Landroid/content/Context;)V

    :cond_0
    invoke-static {p1}, LYue/ۥۡۦۦۧ;->ۥ(Landroid/content/Context;)V

    :cond_1
    return-void
.end method
