.class public final Lxhss/ᲀᛲᲇᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲁᛷᛴᲇ;


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/Object;

.field public final ᛳᲁᲇᛸ:Lxhss/ᲁᛳᲀᛴ;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lxhss/ᲁᛳᲀᛴ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lxhss/ᲀᛲᲇᛲ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᲀᛲᲇᛲ;->ᛱᛱᛲᲇ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lxhss/ᲀᛲᲇᛲ;->ᛳᲁᲇᛸ:Lxhss/ᲁᛳᲀᛴ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lxhss/ᲀᛲᲇᛲ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lxhss/ᛵᛴᛱᲈ;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lxhss/ᛵᛴᛱᲈ;-><init>(Lxhss/ᲀᛲᲇᛲ;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lxhss/ᲀᲀᲇᛵ;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lxhss/ᲀᲀᲇᛵ;-><init>(Lxhss/ᲀᛲᲇᛲ;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
