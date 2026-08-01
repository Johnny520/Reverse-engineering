.class public final L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;
.super Landroid/app/Instrumentation;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;


# direct methods
.method public constructor <init>(Landroid/app/Instrumentation;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/app/Instrumentation;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final acquireLooperManager(Landroid/os/Looper;)Landroid/os/TestLooperManager;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->acquireLooperManager(Landroid/os/Looper;)Landroid/os/TestLooperManager;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final addMonitor(Landroid/content/IntentFilter;Landroid/app/Instrumentation$ActivityResult;Z)Landroid/app/Instrumentation$ActivityMonitor;
    .locals 0

    .line 9
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->addMonitor(Landroid/content/IntentFilter;Landroid/app/Instrumentation$ActivityResult;Z)Landroid/app/Instrumentation$ActivityMonitor;

    move-result-object p0

    return-object p0
.end method

.method public final addMonitor(Ljava/lang/String;Landroid/app/Instrumentation$ActivityResult;Z)Landroid/app/Instrumentation$ActivityMonitor;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->addMonitor(Ljava/lang/String;Landroid/app/Instrumentation$ActivityResult;Z)Landroid/app/Instrumentation$ActivityMonitor;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final addMonitor(Landroid/app/Instrumentation$ActivityMonitor;)V
    .locals 0

    .line 8
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->addMonitor(Landroid/app/Instrumentation$ActivityMonitor;)V

    return-void
.end method

.method public final addResults(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->addResults(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 18
    .line 19
    const-class v0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, Landroid/app/Instrumentation;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 1

    if-eqz p2, :cond_0

    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    .line 38
    invoke-static {v0}, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 39
    sget-object v0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 40
    const-class v0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 41
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 42
    :cond_0
    invoke-static {p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏(Landroid/content/Context;)V

    .line 43
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    return-void
.end method

.method public final callActivityOnDestroy(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->callActivityOnDestroy(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnNewIntent(Landroid/app/Activity;Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/app/Instrumentation;->callActivityOnNewIntent(Landroid/app/Activity;Landroid/content/Intent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnPause(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->callActivityOnPause(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnPictureInPictureRequested(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-static {p0, p1}, Landroidx/core/view/飘花落叶言子哲兰楪世苏;->飘花落叶言子楪苏哲兰世(Landroid/app/Instrumentation;Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnPostCreate(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/app/Instrumentation;->callActivityOnPostCreate(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnPostCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 0

    .line 7
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnPostCreate(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    return-void
.end method

.method public final callActivityOnRestart(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->callActivityOnRestart(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnRestoreInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/app/Instrumentation;->callActivityOnRestoreInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnRestoreInstanceState(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 0

    .line 7
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnRestoreInstanceState(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    return-void
.end method

.method public final callActivityOnResume(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->callActivityOnResume(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/app/Instrumentation;->callActivityOnSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V
    .locals 0

    .line 7
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->callActivityOnSaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;Landroid/os/PersistableBundle;)V

    return-void
.end method

.method public final callActivityOnStart(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->callActivityOnStart(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnStop(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->callActivityOnStop(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callActivityOnUserLeaving(Landroid/app/Activity;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->callActivityOnUserLeaving(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final callApplicationOnCreate(Landroid/app/Application;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->callApplicationOnCreate(Landroid/app/Application;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final checkMonitorHit(Landroid/app/Instrumentation$ActivityMonitor;I)Z
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/app/Instrumentation;->checkMonitorHit(Landroid/app/Instrumentation$ActivityMonitor;I)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final endPerformanceSnapshot()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->endPerformanceSnapshot()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final finish(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/app/Instrumentation;->finish(ILandroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final getAllocCounts()Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->getAllocCounts()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getBinderCounts()Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->getBinderCounts()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getComponentName()Landroid/content/ComponentName;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->getComponentName()Landroid/content/ComponentName;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getContext()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getProcessName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->getProcessName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getTargetContext()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->getTargetContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getUiAutomation()Landroid/app/UiAutomation;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->getUiAutomation()Landroid/app/UiAutomation;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final getUiAutomation(I)Landroid/app/UiAutomation;
    .locals 0

    .line 8
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->getUiAutomation(I)Landroid/app/UiAutomation;

    move-result-object p0

    return-object p0
.end method

.method public final invokeContextMenuAction(Landroid/app/Activity;II)Z
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->invokeContextMenuAction(Landroid/app/Activity;II)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final invokeMenuActionSync(Landroid/app/Activity;II)Z
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->invokeMenuActionSync(Landroid/app/Activity;II)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final isProfiling()Z
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->isProfiling()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final newActivity(Ljava/lang/Class;Landroid/content/Context;Landroid/os/IBinder;Landroid/app/Application;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Ljava/lang/CharSequence;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;)Landroid/app/Activity;
    .locals 0

    .line 35
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    invoke-virtual/range {p0 .. p10}, Landroid/app/Instrumentation;->newActivity(Ljava/lang/Class;Landroid/content/Context;Landroid/os/IBinder;Landroid/app/Application;Landroid/content/Intent;Landroid/content/pm/ActivityInfo;Ljava/lang/CharSequence;Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Object;)Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public final newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->newActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    invoke-static {p2}, L飘花落叶言苏楪世哲兰子/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    sget-object p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:[[Ljava/lang/Object;

    .line 16
    .line 17
    const-class p0, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪世苏兰哲;

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {p0, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Landroid/app/Activity;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_0
    throw p0
.end method

.method public final newApplication(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;)Landroid/app/Application;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->newApplication(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Context;)Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final onCreate(Landroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onDestroy()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->onDestroy()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onException(Ljava/lang/Object;Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/app/Instrumentation;->onException(Ljava/lang/Object;Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final onStart()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->onStart()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final removeMonitor(Landroid/app/Instrumentation$ActivityMonitor;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->removeMonitor(Landroid/app/Instrumentation$ActivityMonitor;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final runOnMainSync(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->runOnMainSync(Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendCharacterSync(I)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->sendCharacterSync(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendKeyDownUpSync(I)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->sendKeyDownUpSync(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendKeySync(Landroid/view/KeyEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->sendKeySync(Landroid/view/KeyEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendPointerSync(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->sendPointerSync(Landroid/view/MotionEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendStatus(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Landroid/app/Instrumentation;->sendStatus(ILandroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendStringSync(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->sendStringSync(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final sendTrackballEventSync(Landroid/view/MotionEvent;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->sendTrackballEventSync(Landroid/view/MotionEvent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setAutomaticPerformanceSnapshots()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->setAutomaticPerformanceSnapshots()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setInTouchMode(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->setInTouchMode(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final start()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->start()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final startActivitySync(Landroid/content/Intent;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->startActivitySync(Landroid/content/Intent;)Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final startActivitySync(Landroid/content/Intent;Landroid/os/Bundle;)Landroid/app/Activity;
    .locals 0

    .line 8
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    invoke-static {p0, p1, p2}, L飘花落叶言楪世子兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(Landroid/app/Instrumentation;Landroid/content/Intent;Landroid/os/Bundle;)Landroid/app/Activity;

    move-result-object p0

    return-object p0
.end method

.method public final startAllocCounting()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->startAllocCounting()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final startPerformanceSnapshot()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->startPerformanceSnapshot()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final startProfiling()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->startProfiling()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final stopAllocCounting()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->stopAllocCounting()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final stopProfiling()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->stopProfiling()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final waitForIdle(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->waitForIdle(Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final waitForIdleSync()V
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Instrumentation;->waitForIdleSync()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final waitForMonitor(Landroid/app/Instrumentation$ActivityMonitor;)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Instrumentation;->waitForMonitor(Landroid/app/Instrumentation$ActivityMonitor;)Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final waitForMonitorWithTimeout(Landroid/app/Instrumentation$ActivityMonitor;J)Landroid/app/Activity;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言苏楪世兰子哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/app/Instrumentation;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/Instrumentation;->waitForMonitorWithTimeout(Landroid/app/Instrumentation$ActivityMonitor;J)Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
