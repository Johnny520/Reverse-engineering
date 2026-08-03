.class public LYue/ۥ۟۟ۧۥ$ۥ;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۟ۧۥ;->ۥ۟۟۟(Ljava/lang/ClassLoader;)V
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

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۟()Ljava/lang/String;

    move-result-object v0

    sget-object v1, LYue/ۥ۟ۡۥۧ;->ۥ۟۟۠ۨ:LYue/ۥ۟ۡۥۧ;

    invoke-virtual {v1}, LYue/ۥ۟ۡۥۧ;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    check-cast p1, Landroid/app/Activity;

    sget-object v0, LYue/ۥ۟۟ۧۥ;->ۥ۟:Ljava/lang/String;

    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, LYue/ۥ۟۟ۧۥ;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠(Landroid/app/Activity;)V

    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    if-eqz v0, :cond_1

    invoke-static {v0}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۢ(Landroid/content/Context;)V

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۠(Ljava/lang/ClassLoader;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, LYue/ۥۣ۟۠ۨ;->ۥ۟۟۠ۢ(Landroid/content/Context;)V

    invoke-static {v1}, LYue/ۥۣ۟۠ۨ;->ۥۣ۟۟۠(Ljava/lang/ClassLoader;)V

    :goto_0
    invoke-static {}, LYue/ۥۣ۟۠ۨ;->ۥ۟()Ljava/lang/String;

    move-result-object v0

    sput-object v0, LYue/ۥ۟۟ۧۥ;->ۥ۟:Ljava/lang/String;

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

    invoke-static {}, LYue/ۥ۟۟ۧۥ;->ۥ()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, LYue/ۥ۠۟۟ۥ;->ۥ۟۟۟ۢ(Ljava/util/List;)V

    invoke-static {}, LYue/ۥ۟۟ۧۥ;->ۥ۟()V

    invoke-static {}, LYue/ۥ۟۟ۧۥ;->ۥ۟۟()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_2

    invoke-static {}, LYue/ۥ۟ۡۤۧ;->ۥ()V

    invoke-static {}, LYue/ۥ۟۟ۧۥ;->ۥ۟۟()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    :cond_2
    return-void
.end method
