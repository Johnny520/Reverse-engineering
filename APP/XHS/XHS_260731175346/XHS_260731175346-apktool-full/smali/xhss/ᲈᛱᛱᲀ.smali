.class public final Lxhss/ᲈᛱᛱᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲁᛷᛴᲇ;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᲈᛱᛱᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᲈᛱᛱᲀ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲈᛱᛱᲀ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᲈᛱᛱᲀ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast v1, Ljava/util/Iterator;

    .line 9
    .line 10
    return-object v1

    .line 11
    :pswitch_0
    check-cast v1, Lxhss/ᛸᛸᲁᲁ;

    .line 12
    .line 13
    new-instance p0, Lxhss/ᛸᛴᲇᲁ;

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p0, p0}, Lxhss/ᛷᛲᛳᛴ;->ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lxhss/ᛸᛴᲇᲁ;->ᲇᛴᲇᛵ:Lxhss/ᛱᛴᛶᛴ;

    .line 23
    .line 24
    return-object p0

    .line 25
    :pswitch_1
    new-instance v0, Lxhss/ᲈᛷᛸ;

    .line 26
    .line 27
    invoke-direct {v0, p0}, Lxhss/ᲈᛷᛸ;-><init>(Lxhss/ᲈᛱᛱᲀ;)V

    .line 28
    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_2
    check-cast v1, Ljava/lang/Iterable;

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
