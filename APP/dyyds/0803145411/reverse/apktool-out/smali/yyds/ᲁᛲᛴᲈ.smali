.class public final Lyyds/ᲁᛲᛴᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲇᛵᲈᲈ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲇᛵᲈᲈ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲁᛲᛴᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᛲᛴᲈ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛵᲈᲈ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lyyds/ᲁᛲᛴᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲁᛲᛴᲈ;->ᲇᲈᛵᛷ:Lyyds/ᲇᛵᲈᲈ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 9
    .line 10
    iget-object v2, v0, Lyyds/ᛷᲀᛳᛱ;->ᛷᛸᲇᛶ:Lyyds/ᲁᛳᲀᛸ;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lyyds/ᲁᛳᲀᛸ;

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-direct {v2, v3, v1}, Lyyds/ᲁᛳᲀᛸ;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v2, v0, Lyyds/ᛷᲀᛳᛱ;->ᛷᛸᲇᛶ:Lyyds/ᲁᛳᲀᛸ;

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v2, v0}, Lyyds/ᲁᛳᲀᛸ;->ᛳᛸᛴᛶ(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lyyds/ᛴᛶᛳᛸ;

    .line 26
    .line 27
    const/16 v2, 0x13

    .line 28
    .line 29
    invoke-direct {v0, v2, p0}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    invoke-virtual {v1, p0}, Lyyds/ᲇᛵᲈᲈ;->ᛵᛸᛸᛷ(Landroid/view/animation/Animation;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    invoke-static {v0, v1, v2}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᲇᛲᛱ(Ljava/lang/Runnable;J)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    iget-object p0, v1, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 42
    .line 43
    iget p0, p0, Lyyds/ᛷᲀᛳᛱ;->ᛲᛱᲁᛳ:I

    .line 44
    .line 45
    new-instance v0, Lyyds/ᛶᲁᛲᛳ;

    .line 46
    .line 47
    invoke-direct {v0, v1, p0}, Lyyds/ᛶᲁᛲᛳ;-><init>(Lyyds/ᲇᛵᲈᲈ;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛷᛶᛷᲀ(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
