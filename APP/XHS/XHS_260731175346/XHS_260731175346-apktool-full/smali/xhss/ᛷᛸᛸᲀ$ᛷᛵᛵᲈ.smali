.class public final Lxhss/ᛷᛸᛸᲀ$ᛷᛵᛵᲈ;
.super Lxhss/ᲈᲁᛳᛵ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxhss/ᛷᛸᛸᲀ;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lxhss/ᛷᛸᛴᛵ;


# direct methods
.method public constructor <init>(Lxhss/ᛷᛸᛴᛵ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᛷᛸᛸᲀ$ᛷᛵᛵᲈ;->this$0:Lxhss/ᛷᛸᛴᛵ;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onActivityPostResumed(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛸᛸᲀ$ᛷᛵᛵᲈ;->this$0:Lxhss/ᛷᛸᛴᛵ;

    .line 2
    .line 3
    iget p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛱᛱᛲᲇ:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    add-int/2addr p1, v0

    .line 7
    iput p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛱᛱᛲᲇ:I

    .line 8
    .line 9
    if-ne p1, v0, :cond_1

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
    sget-object v0, Lxhss/ᲈᲀᛵᛸ;->ON_RESUME:Lxhss/ᲈᲀᛵᛸ;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ(Lxhss/ᲈᲀᛵᛸ;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛳᲁᲇᛸ:Z

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛷᛴᛷᛱ:Landroid/os/Handler;

    .line 27
    .line 28
    iget-object p0, p0, Lxhss/ᛷᛸᛴᛵ;->ᲀᲇᛳᲁ:Lxhss/ᛳᛶᲈᛲ;

    .line 29
    .line 30
    invoke-virtual {p1, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public onActivityPostStarted(Landroid/app/Activity;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛸᛸᲀ$ᛷᛵᛵᲈ;->this$0:Lxhss/ᛷᛸᛴᛵ;

    .line 2
    .line 3
    iget p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛷᛵᛵᲈ:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    add-int/2addr p1, v0

    .line 7
    iput p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᛷᛵᛵᲈ:I

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛴᲇᛵ:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛶᛴᲀ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 16
    .line 17
    sget-object v0, Lxhss/ᲈᲀᛵᛸ;->ON_START:Lxhss/ᲈᲀᛵᛸ;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ(Lxhss/ᲈᲀᛵᛸ;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Lxhss/ᛷᛸᛴᛵ;->ᲇᛴᲇᛵ:Z

    .line 24
    .line 25
    :cond_0
    return-void
.end method
