.class public LYue/ۥۢۦۤۥ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۦۤۥ;->ۥۣ۟۟۟()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۦۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

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

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast p1, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۢ(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۠(Ljava/lang/ClassLoader;)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۢ(Landroid/content/Context;)V

    iget-object v0, p0, LYue/ۥۢۦۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-static {v0}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۠(Ljava/lang/ClassLoader;)V

    :goto_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۡۦ;->ۥ۟(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۦ(Ljava/lang/String;)V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۟ۡۦ;->ۥ(Landroid/content/Context;)J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۧ(J)V

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟ۡ()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۦۦۧ;->ۥ(Landroid/content/Context;)V

    invoke-static {p1}, Lcom/kongzue/dialogx/DialogX;->init(Landroid/content/Context;)V

    invoke-static {}, LYue/ۥۢۦۤۥ;->ۥ۟()V

    iget-object p1, p0, LYue/ۥۢۦۤۥ$ۥ;->ۥۣ۟۟۠:Ljava/lang/ClassLoader;

    invoke-static {p1}, LYue/ۥۢۦۤۥ;->ۥ۟۟(Ljava/lang/ClassLoader;)V

    sget-object p1, LYue/ۥۢۦۤۥ;->ۥ۟۟:Ljava/util/List;

    invoke-static {p1}, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۟ۢ(Ljava/util/List;)V

    invoke-static {}, LYue/ۥ۟ۡۤۧ;->ۥ()V

    sget-object p1, LYue/ۥۢۦۤۥ;->ۥ۟:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
