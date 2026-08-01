.class public final L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Z

.field public 飘花落叶言子楪世兰苏哲:Z

.field public 飘花落叶言子楪世哲兰苏:Z

.field public final 飘花落叶言子楪世哲苏兰:I

.field public 飘花落叶言子楪世苏兰哲:Landroid/app/Activity;

.field public 飘花落叶言子楪世苏哲兰:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Z

    .line 6
    .line 7
    iput-boolean v0, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Z

    .line 8
    .line 9
    iput-boolean v0, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Z

    .line 10
    .line 11
    iput-object p1, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/app/Activity;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityDestroyed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/app/Activity;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput-boolean p1, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Z

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public final onActivityPaused(Landroid/app/Activity;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-boolean v0, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Z

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 14
    .line 15
    :try_start_0
    sget-object v1, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/reflect/Field;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-ne v1, v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    iget v2, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 28
    .line 29
    if-eq v0, v2, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    :try_start_1
    sget-object v0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/reflect/Field;

    .line 33
    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰:Landroid/os/Handler;

    .line 39
    .line 40
    new-instance v2, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;

    .line 41
    .line 42
    const/16 v3, 0xf

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    invoke-direct {v2, v3, p1, v1, v4}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世苏哲兰;-><init>(ILjava/lang/Object;Ljava/lang/Object;Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v2}, Landroid/os/Handler;->postAtFrontOfQueue(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    iput-boolean p1, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:Z

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    iput-object p1, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 56
    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception p0

    .line 59
    const-string p1, "ActivityRecreator"

    .line 60
    .line 61
    const-string v0, "Exception while fetching field values"

    .line 62
    .line 63
    invoke-static {p1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 64
    .line 65
    .line 66
    :cond_1
    :goto_0
    return-void
.end method

.method public final onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onActivityStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Landroid/app/Activity;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, L飘花落叶言子哲楪世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    return-void
.end method
