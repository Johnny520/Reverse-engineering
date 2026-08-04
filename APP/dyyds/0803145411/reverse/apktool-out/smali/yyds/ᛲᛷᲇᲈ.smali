.class public final Lyyds/ᛲᛷᲇᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lyyds/ᛳᛱᲇᛴ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛲᛷᲇᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛲᛷᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

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
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛲᛷᲇᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᛲᛷᲇᲈ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lyyds/ᛶᲀᛴᛵ;

    .line 9
    .line 10
    new-instance v0, Lyyds/ᛳᛲᛳᲁ;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lyyds/ᛳᛲᛳᲁ;-><init>(Lyyds/ᛶᲀᛴᛵ;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    new-instance v0, Lyyds/ᛴᛵᛸᲁ;

    .line 17
    .line 18
    check-cast p0, Lyyds/ᛵᲇᛵᲇ;

    .line 19
    .line 20
    iget-object p0, p0, Lyyds/ᛵᲇᛵᲇ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ljava/util/Set;

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-direct {v0, p0}, Lyyds/ᛴᛵᛸᲁ;-><init>(Ljava/util/Iterator;)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
