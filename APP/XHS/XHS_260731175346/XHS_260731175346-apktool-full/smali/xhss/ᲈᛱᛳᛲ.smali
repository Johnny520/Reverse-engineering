.class public final Lxhss/ᲈᛱᛳᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᲀᲀ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᲀᲀ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᲈᛱᛳᛲ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᲈᛱᛳᛲ;->ᛳᲁᲇᛸ:Lxhss/ᲀᲀ;

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
    iget v0, p0, Lxhss/ᲈᛱᛳᛲ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᲈᛱᛳᛲ;->ᛳᲁᲇᛸ:Lxhss/ᲀᲀ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, v1, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 9
    .line 10
    iget-object v2, v0, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ:Lxhss/ᛶᲈᛴᛲ;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    new-instance v2, Lxhss/ᛶᲈᛴᛲ;

    .line 15
    .line 16
    const/4 v3, 0x2

    .line 17
    invoke-direct {v2, v3, v1}, Lxhss/ᛶᲈᛴᛲ;-><init>(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iput-object v2, v0, Lxhss/ᛳᛴᛵ;->ᛱᛳᲁᲈ:Lxhss/ᛶᲈᛴᛲ;

    .line 21
    .line 22
    :cond_0
    invoke-virtual {v2, v0}, Lxhss/ᛶᲈᛴᛲ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Lxhss/ᛴᲈᲀᲇ;

    .line 26
    .line 27
    const/16 v2, 0x8

    .line 28
    .line 29
    invoke-direct {v0, v2, p0}, Lxhss/ᛴᲈᲀᲇ;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    invoke-virtual {v1, p0}, Lxhss/ᲀᲀ;->ᛱᛱᛲᲇ(Landroid/view/animation/Animation;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    invoke-static {v0, v1, v2}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛵᛲᲁᛶ(Ljava/lang/Runnable;J)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_0
    iget-object p0, v1, Lxhss/ᲀᲀ;->ᛸᛷᲈᲈ:Lxhss/ᛳᛴᛵ;

    .line 42
    .line 43
    iget p0, p0, Lxhss/ᛳᛴᛵ;->ᛵᛷᛲᛸ:I

    .line 44
    .line 45
    new-instance v0, Lxhss/ᛵᛶᛲᛳ;

    .line 46
    .line 47
    invoke-direct {v0, v1, p0}, Lxhss/ᛵᛶᛲᛳ;-><init>(Lxhss/ᲀᲀ;I)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

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
