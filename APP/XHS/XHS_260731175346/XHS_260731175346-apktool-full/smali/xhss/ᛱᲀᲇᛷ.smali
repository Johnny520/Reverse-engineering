.class public final synthetic Lxhss/ᛱᲀᲇᛷ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲀᛸᛳᛲ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;

.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛷᛱᛳᲁ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛱᲀᲇᛷ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᛱᲀᲇᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᛱᲀᲇᛷ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, Lxhss/ᛱᲀᲇᛷ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛱᛳᲁ;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/16 v0, 0x50

    .line 16
    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, v1}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛲᲀᛵ(Z)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void

    .line 23
    :pswitch_0
    check-cast p1, Landroid/content/res/Configuration;

    .line 24
    .line 25
    invoke-virtual {p0, v1}, Lxhss/ᛷᛱᛳᲁ;->ᛸᛴᛶᛳ(Z)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
