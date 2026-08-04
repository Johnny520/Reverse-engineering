.class public final Lyyds/ᲈᲁᛶᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛵᲇᛲᲀ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:I

.field public ᛲᲈᲁ:Landroid/view/View;

.field public ᛵᛸᛸᛷ:Landroid/widget/TextView;

.field public ᲀᛲᛳᲀ:I

.field public final ᲇᲇᲇᛱ:Lyyds/ᛴᛸᲀᛵ;

.field public ᲇᲈᛵᛷ:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lyyds/ᲈᲁᛶᛸ;->ᛲᛴᛳᛲ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lyyds/ᛴᛸᲀᛵ;

    .line 8
    .line 9
    invoke-direct {v1, p1, p0}, Lyyds/ᛴᛸᲀᛵ;-><init>(Landroid/content/ContextWrapper;Lyyds/ᲈᲁᛶᛸ;)V

    .line 10
    .line 11
    .line 12
    iput-boolean v0, v1, Lyyds/ᛴᛸᲀᛵ;->ᛲᛴᛳᛲ:Z

    .line 13
    .line 14
    new-instance v0, Lyyds/ᛵᛳᛲᛱ;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, v0, Lyyds/ᛵᛳᛲᛱ;->ᛲᲈᲁ:Landroid/app/Activity;

    .line 20
    .line 21
    iput-object v0, v1, Lyyds/ᛴᛸᲀᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛵᛳᛲᛱ;

    .line 22
    .line 23
    iput-object v1, p0, Lyyds/ᲈᲁᛶᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛸᲀᛵ;

    .line 24
    .line 25
    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 2

    const/4 v0, 0x1

    iput v0, p0, Lyyds/ᲈᲁᛶᛸ;->ᛲᛴᛳᛲ:I

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    new-instance v1, Lyyds/ᛴᛸᲀᛵ;

    .line 28
    invoke-direct {v1, p1, p0}, Lyyds/ᛴᛸᲀᛵ;-><init>(Landroid/content/ContextWrapper;Lyyds/ᲈᲁᛶᛸ;)V

    .line 29
    iput-boolean v0, v1, Lyyds/ᛴᛸᲀᛵ;->ᛲᛴᛳᛲ:Z

    .line 30
    new-instance v0, Lyyds/ᛵᛳᛲᛱ;

    .line 31
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 32
    iput-object p1, v0, Lyyds/ᛵᛳᛲᛱ;->ᛵᛸᛸᛷ:Landroid/app/Application;

    .line 33
    iput-object v0, v1, Lyyds/ᛴᛸᲀᛵ;->ᛵᛸᛸᛷ:Lyyds/ᛵᛳᛲᛱ;

    .line 34
    iput-object v1, p0, Lyyds/ᲈᲁᛶᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛸᲀᛵ;

    return-void
.end method


# virtual methods
.method public final cancel()V
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲈᲁᛶᛸ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyyds/ᲈᲁᛶᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛸᲀᛵ;

    .line 7
    .line 8
    invoke-virtual {p0}, Lyyds/ᛴᛸᲀᛵ;->ᛲᲈᲁ()V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p0, p0, Lyyds/ᲈᲁᛶᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛸᲀᛵ;

    .line 13
    .line 14
    invoke-virtual {p0}, Lyyds/ᛴᛸᲀᛵ;->ᛲᲈᲁ()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final setDuration(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᲈᲁᛶᛸ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    return-void
.end method

.method public final setGravity(III)V
    .locals 0

    .line 1
    const/16 p1, 0x11

    .line 2
    .line 3
    iput p1, p0, Lyyds/ᲈᲁᛶᛸ;->ᲀᛲᛳᲀ:I

    .line 4
    .line 5
    return-void
.end method

.method public final setMargin(FF)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lyyds/ᲈᲁᛶᛸ;->ᛵᛸᛸᛷ:Landroid/widget/TextView;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final setView(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lyyds/ᲈᲁᛶᛸ;->ᛲᲈᲁ:Landroid/view/View;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lyyds/ᲈᲁᛶᛸ;->ᛵᛸᛸᛷ:Landroid/widget/TextView;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-static {p1}, Lyyds/ᛵᲇᛲᲀ;->ᛲᲈᲁ(Landroid/view/View;)Landroid/widget/TextView;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lyyds/ᲈᲁᛶᛸ;->ᛵᛸᛸᛷ:Landroid/widget/TextView;

    .line 14
    .line 15
    return-void
.end method

.method public final show()V
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲈᲁᛶᛸ;->ᛲᛴᛳᛲ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲈᲁᛶᛸ;->ᲇᲇᲇᛱ:Lyyds/ᛴᛸᲀᛵ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lyyds/ᛴᛸᲀᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛶᛲ;

    .line 9
    .line 10
    iget-boolean p0, p0, Lyyds/ᛴᛸᲀᛵ;->ᲇᲈᛵᛷ:Z

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-ne p0, v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0}, Lyyds/ᛳᲀᛶᛲ;->run()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    sget-object p0, Lyyds/ᛴᛸᲀᛵ;->ᛱᲈᲁ:Landroid/os/Handler;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :pswitch_0
    iget-object v0, p0, Lyyds/ᛴᛸᲀᛵ;->ᲇᲇᲇᛱ:Lyyds/ᛳᲀᛶᛲ;

    .line 39
    .line 40
    iget-boolean p0, p0, Lyyds/ᛴᛸᲀᛵ;->ᲇᲈᛵᛷ:Z

    .line 41
    .line 42
    if-eqz p0, :cond_2

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-ne p0, v1, :cond_3

    .line 54
    .line 55
    invoke-virtual {v0}, Lyyds/ᛳᲀᛶᛲ;->run()V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_3
    sget-object p0, Lyyds/ᛴᛸᲀᛵ;->ᛱᲈᲁ:Landroid/os/Handler;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    .line 67
    :goto_1
    return-void

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
