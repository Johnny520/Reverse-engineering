.class public final Lyyds/ᲇᛲᛶᲇ$ᛲᲈᲁ;
.super Lyyds/ᛳᛷᲈᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyyds/ᲇᛲᛶᲇ;->onActivityPreCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lyyds/ᛴᛸᛴᲁ;


# direct methods
.method public constructor <init>(Lyyds/ᛴᛸᛴᲁ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲇᛲᛶᲇ$ᛲᲈᲁ;->this$0:Lyyds/ᛴᛸᛴᲁ;

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
    iget-object p0, p0, Lyyds/ᲇᛲᛶᲇ$ᛲᲈᲁ;->this$0:Lyyds/ᛴᛸᛴᲁ;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲇᲈᛵᛷ:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    add-int/2addr p1, v0

    .line 7
    iput p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲇᲈᛵᛷ:I

    .line 8
    .line 9
    if-ne p1, v0, :cond_1

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
    sget-object v0, Lyyds/ᛳᛷᛵᛷ;->ON_RESUME:Lyyds/ᛳᛷᛵᛷ;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲈᛵᛷ(Lyyds/ᛳᛷᛵᛷ;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᛲᛴᛳᛲ:Z

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᛶᛷᛲᲁ:Landroid/os/Handler;

    .line 27
    .line 28
    iget-object p0, p0, Lyyds/ᛴᛸᛴᲁ;->ᛲᛳᛶᲁ:Lyyds/ᛲᛳᛵᛱ;

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
    iget-object p0, p0, Lyyds/ᲇᛲᛶᲇ$ᛲᲈᲁ;->this$0:Lyyds/ᛴᛸᛴᲁ;

    .line 2
    .line 3
    iget p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    add-int/2addr p1, v0

    .line 7
    iput p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲀᛲᛳᲀ:I

    .line 8
    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    iget-boolean p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲇᲇᲇᛱ:Z

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᛱᲈᲁ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 16
    .line 17
    sget-object v0, Lyyds/ᛳᛷᛵᛷ;->ON_START:Lyyds/ᛳᛷᛵᛷ;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲈᛵᛷ(Lyyds/ᛳᛷᛵᛷ;)V

    .line 20
    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, Lyyds/ᛴᛸᛴᲁ;->ᲇᲇᲇᛱ:Z

    .line 24
    .line 25
    :cond_0
    return-void
.end method
