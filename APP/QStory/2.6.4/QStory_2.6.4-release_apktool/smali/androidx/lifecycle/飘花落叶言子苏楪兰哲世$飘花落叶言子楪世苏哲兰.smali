.class public final Landroidx/lifecycle/飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/app/Application$ActivityLifecycleCallbacks;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170"
.end annotation


# static fields
.field public static final Companion:Landroidx/lifecycle/飘花落叶言子苏楪兰世哲;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Landroidx/lifecycle/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰;->Companion:Landroidx/lifecycle/飘花落叶言子苏楪兰世哲;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final registerIn(Landroid/app/Activity;)V
    .locals 1

    .line 1
    sget-object v0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰;->Companion:Landroidx/lifecycle/飘花落叶言子苏楪兰世哲;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    new-instance v0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    invoke-direct {v0}, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Landroidx/core/view/飘花落叶言子哲楪世兰苏;->飘花落叶言子楪苏兰世哲(Landroid/app/Activity;Landroidx/lifecycle/飘花落叶言子苏楪兰哲世$飘花落叶言子楪世苏哲兰;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivityDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivityPostCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:I

    .line 5
    .line 6
    sget-object p0, Landroidx/lifecycle/Lifecycle$Event;->ON_CREATE:Landroidx/lifecycle/Lifecycle$Event;

    .line 7
    .line 8
    invoke-static {p1, p0}, Landroidx/lifecycle/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:I

    .line 5
    .line 6
    sget-object p0, Landroidx/lifecycle/Lifecycle$Event;->ON_RESUME:Landroidx/lifecycle/Lifecycle$Event;

    .line 7
    .line 8
    invoke-static {p1, p0}, Landroidx/lifecycle/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:I

    .line 5
    .line 6
    sget-object p0, Landroidx/lifecycle/Lifecycle$Event;->ON_START:Landroidx/lifecycle/Lifecycle$Event;

    .line 7
    .line 8
    invoke-static {p1, p0}, Landroidx/lifecycle/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityPreDestroyed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:I

    .line 5
    .line 6
    sget-object p0, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    .line 7
    .line 8
    invoke-static {p1, p0}, Landroidx/lifecycle/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityPrePaused(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:I

    .line 5
    .line 6
    sget-object p0, Landroidx/lifecycle/Lifecycle$Event;->ON_PAUSE:Landroidx/lifecycle/Lifecycle$Event;

    .line 7
    .line 8
    invoke-static {p1, p0}, Landroidx/lifecycle/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityPreStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget p0, Landroidx/lifecycle/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪哲兰世苏:I

    .line 5
    .line 6
    sget-object p0, Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;

    .line 7
    .line 8
    invoke-static {p1, p0}, Landroidx/lifecycle/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪世苏哲兰(Landroid/app/Activity;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityResumed(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivitySaveInstanceState(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public onActivityStarted(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method
