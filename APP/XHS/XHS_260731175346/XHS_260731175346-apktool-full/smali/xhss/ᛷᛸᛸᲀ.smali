.class public final Lxhss/ᛷᛸᛸᲀ;
.super Lxhss/ᲈᲁᛳᛵ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field final synthetic this$0:Lxhss/ᛷᛸᛴᛵ;


# direct methods
.method public constructor <init>(Lxhss/ᛷᛸᛴᛵ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᛷᛸᛸᲀ;->this$0:Lxhss/ᛷᛸᛴᛵ;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onActivityPaused(Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛸᛸᲀ;->this$0:Lxhss/ᛷᛸᛴᛵ;

    .line 2
    .line 3
    iget p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛱᛱᛲᲇ:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, -0x1

    .line 6
    .line 7
    iput p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛱᛱᛲᲇ:I

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛷᛴᛷᛱ:Landroid/os/Handler;

    .line 12
    .line 13
    iget-object p0, p0, Lxhss/ᛷᛸᛴᛵ;->ᲀᲇᛳᲁ:Lxhss/ᛳᛶᲈᛲ;

    .line 14
    .line 15
    const-wide/16 v0, 0x2bc

    .line 16
    .line 17
    invoke-virtual {p1, p0, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    new-instance p2, Lxhss/ᛷᛸᛸᲀ$ᛷᛵᛵᲈ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛷᛸᛸᲀ;->this$0:Lxhss/ᛷᛸᛴᛵ;

    .line 4
    .line 5
    invoke-direct {p2, p0}, Lxhss/ᛷᛸᛸᲀ$ᛷᛵᛵᲈ;-><init>(Lxhss/ᛷᛸᛴᛵ;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lxhss/ᛲᛸᛴᛸ;->ᛷᛵᛵᲈ(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛸᛸᲀ;->this$0:Lxhss/ᛷᛸᛴᛵ;

    .line 2
    .line 3
    iget p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛷᛵᛵᲈ:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, -0x1

    .line 6
    .line 7
    iput p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛷᛵᛵᲈ:I

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛳᲁᲇᛸ:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛶᛴᲀ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 16
    .line 17
    sget-object v0, Lxhss/ᲈᲀᛵᛸ;->ON_STOP:Lxhss/ᲈᲀᛵᛸ;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ(Lxhss/ᲈᲀᛵᛸ;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛴᲇᛵ:Z

    .line 24
    .line 25
    :cond_0
    return-void
.end method
