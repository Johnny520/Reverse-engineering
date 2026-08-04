.class public final Lyyds/ᛸᲀᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛶᲁᛲᛳ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛶᲁᛲᛳ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛸᲀᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛸᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲁᛲᛳ;

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
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛸᲀᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛸᲀᲈ;->ᲇᲈᛵᛷ:Lyyds/ᛶᲁᛲᛳ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, v1, Lyyds/ᛶᲁᛲᛳ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lyyds/ᲇᛵᲈᲈ;

    .line 11
    .line 12
    iget-object v0, p0, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 13
    .line 14
    iget v0, v0, Lyyds/ᛷᲀᛳᛱ;->ᛷᛶᛷᲀ:I

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    if-le v0, v1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Lyyds/ᲇᛵᲈᲈ;->ᛲᲈᲁ(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_0
    new-instance v0, Lyyds/ᛶᛵᲁᛵ;

    .line 25
    .line 26
    invoke-direct {v0}, Lyyds/ᛶᛵᲁᛵ;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lyyds/ᛶᛵᲁᛵ;->ᲇᲈᛵᛷ()V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, Lyyds/ᛶᲁᛲᛳ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lyyds/ᲇᛵᲈᲈ;

    .line 35
    .line 36
    invoke-virtual {v0}, Lyyds/ᲇᛵᲈᲈ;->ᲀᛲᛳᲀ()V

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, Lyyds/ᲇᛵᲈᲈ;->ᛷᲈᲈᲁ:Lyyds/ᛷᲀᛳᛱ;

    .line 40
    .line 41
    iget-wide v1, v1, Lyyds/ᛷᲀᛳᛱ;->ᲀᛲᛱᛱ:J

    .line 42
    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    cmp-long v3, v1, v3

    .line 46
    .line 47
    if-lez v3, :cond_1

    .line 48
    .line 49
    iget-object v0, v0, Lyyds/ᲇᛵᲈᲈ;->ᛲᛴᛳᛲ:Lyyds/ᲁᲀᛵᛴ;

    .line 50
    .line 51
    new-instance v3, Lyyds/ᛴᛶᛳᛸ;

    .line 52
    .line 53
    const/16 v4, 0x14

    .line 54
    .line 55
    invoke-direct {v3, v4, p0}, Lyyds/ᛴᛶᛳᛸ;-><init>(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v3, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 59
    .line 60
    .line 61
    :cond_1
    return-void

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
