.class public LYue/ۥۢۦۤۦ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۦۤۦ;->ۥ۟()V
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
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, LYue/ۥۡۦۦۧ;->ۥ(Landroid/content/Context;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, LYue/ۥ۟ۡۦ;->ۥ۟(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۦ(Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥ۟ۡۦ;->ۥ(Landroid/content/Context;)J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۧ(J)V

    invoke-static {p1}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۢ(Landroid/content/Context;)V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ()Landroid/app/Activity;

    move-result-object v0

    invoke-static {v0}, Lcom/kongzue/dialogx/DialogX;->init(Landroid/content/Context;)V

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۠(Ljava/lang/ClassLoader;)V

    invoke-static {}, LYue/ۥۢۦۤۦ;->ۥ()V

    return-void
.end method
