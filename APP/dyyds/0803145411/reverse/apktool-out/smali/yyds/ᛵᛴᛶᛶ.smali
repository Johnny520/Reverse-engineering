.class public final Lyyds/ᛵᛴᛶᛶ;
.super Lyyds/ᛳᲇᛸᲁ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final synthetic ᲇᲈᛵᛷ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛵᛴᛶᛶ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lyyds/ᛳᲇᛸᲁ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final ᛵᛸᛸᛷ()Lyyds/ᛷᛲᛴᛳ;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᛵᛴᛶᛶ;->ᲇᲈᛵᛷ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lyyds/ᛳᲇᛸᲇ;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lyyds/ᛳᲇᛸᲇ;-><init>(Lyyds/ᛵᛴᛶᛶ;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lyyds/ᛲᛳᛳᲈ;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lyyds/ᛲᛳᛳᲈ;-><init>(Lyyds/ᛵᛴᛶᛶ;)V

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
