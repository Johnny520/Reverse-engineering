.class public final Lxhss/ᛷᛸᲇᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛵᛶᛲᛳ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛵᛶᛲᛳ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛷᛸᲇᛸ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛷᛸᲇᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛶᛲᛳ;

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
    iget v0, p0, Lxhss/ᛷᛸᲇᛸ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᛷᛸᲇᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛶᛲᛳ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, v1, Lxhss/ᛵᛶᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lxhss/ᲀᲀ;

    .line 11
    .line 12
    iget-object v0, p0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 13
    .line 14
    iget v0, v0, Lxhss/ᛳᛴᛵ;->ᛳᛸᛵᲀ:I

    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    if-le v0, v1, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Lxhss/ᲀᲀ;->ᛷᛵᛵᲈ(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void

    .line 24
    :pswitch_0
    new-instance v0, Lxhss/ᲁᛲᛸᛴ;

    .line 25
    .line 26
    invoke-direct {v0}, Lxhss/ᲁᛲᛸᛴ;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Lxhss/ᲁᛲᛸᛴ;->ᛳᲁᲇᛸ()V

    .line 30
    .line 31
    .line 32
    iget-object v0, v1, Lxhss/ᛵᛶᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lxhss/ᲀᲀ;

    .line 35
    .line 36
    invoke-virtual {v0}, Lxhss/ᲀᲀ;->ᛳᲁᲇᛸ()V

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 40
    .line 41
    iget-wide v1, v1, Lxhss/ᛳᛴᛵ;->ᛲᛴᲇᛲ:J

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
    iget-object v0, v0, Lxhss/ᲀᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛵᛲᲇᛴ;

    .line 50
    .line 51
    new-instance v3, Lxhss/ᛴᲈᲀᲇ;

    .line 52
    .line 53
    const/16 v4, 0x9

    .line 54
    .line 55
    invoke-direct {v3, v4, p0}, Lxhss/ᛴᲈᲀᲇ;-><init>(ILjava/lang/Object;)V

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
