.class public final synthetic Lxhss/ᛶᛲᛵᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲀᛸᛳᛲ;


# instance fields
.field public final synthetic ᛷᛵᛵᲈ:I


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛷᛱᛳᲁ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᛶᛲᛵᛳ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget p0, p0, Lxhss/ᛶᛲᛵᛳ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    throw v0

    .line 10
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 13
    .line 14
    .line 15
    throw p0

    .line 16
    :pswitch_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    throw v0

    .line 19
    :cond_1
    new-instance p0, Ljava/lang/ClassCastException;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 22
    .line 23
    .line 24
    throw p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
