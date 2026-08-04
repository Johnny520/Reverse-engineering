.class public final Lyyds/ᲇᛲᛶᲇ;
.super Lyyds/ᛳᛷᲈᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field final synthetic this$0:Lyyds/ᛴᛸᛴᲁ;


# direct methods
.method public constructor <init>(Lyyds/ᛴᛸᛴᲁ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲇᛲᛶᲇ;->this$0:Lyyds/ᛴᛸᛴᲁ;

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
    iget-object p0, p0, Lyyds/ᲇᛲᛶᲇ;->this$0:Lyyds/ᛴᛸᛴᲁ;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, -0x1

    .line 6
    .line 7
    iput p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲇᲈᛵᛷ:I

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᛶᛷᛲᲁ:Landroid/os/Handler;

    .line 12
    .line 13
    iget-object p0, p0, Lyyds/ᛴᛸᛴᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛳᛵᛱ;

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
    new-instance p2, Lyyds/ᲇᛲᛶᲇ$ᛲᲈᲁ;

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲇᛲᛶᲇ;->this$0:Lyyds/ᛴᛸᛴᲁ;

    .line 4
    .line 5
    invoke-direct {p2, p0}, Lyyds/ᲇᛲᛶᲇ$ᛲᲈᲁ;-><init>(Lyyds/ᛴᛸᛴᲁ;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lyyds/ᲇᲈᲈᛱ;->ᛲᲈᲁ(Landroid/app/Activity;Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public onActivityStopped(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lyyds/ᲇᛲᛶᲇ;->this$0:Lyyds/ᛴᛸᛴᲁ;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    add-int/lit8 p1, p1, -0x1

    .line 6
    .line 7
    iput p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᛱᲈᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 16
    .line 17
    sget-object v0, Lyyds/ᛳᛷᛵᛷ;->ON_STOP:Lyyds/ᛳᛷᛵᛷ;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲈᛵᛷ(Lyyds/ᛳᛷᛵᛷ;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    iput-boolean p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲇᲇᲇᛱ:Z

    .line 24
    .line 25
    :cond_0
    return-void
.end method
