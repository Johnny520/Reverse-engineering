.class public final Lyyds/ᲈᛸᲀᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛵᲈᛴᛷ;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Lyyds/ᛷᛴᲈᲀ;

.field public final ᲀᛲᛳᲀ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lyyds/ᛷᛴᲈᲀ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᲈᛸᲀᛱ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲈᛸᲀᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲈᛸᲀᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛴᲈᲀ;

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
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᲈᛸᲀᛱ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Lyyds/ᛵᛶᛷᛸ;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lyyds/ᛵᛶᛷᛸ;-><init>(Lyyds/ᲈᛸᲀᛱ;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_0
    new-instance v0, Lyyds/ᛸᛴ;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lyyds/ᛸᛴ;-><init>(Lyyds/ᲈᛸᲀᛱ;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :pswitch_1
    new-instance v0, Lyyds/ᛴᲇᛱᛵ;

    .line 19
    .line 20
    iget-object v1, p0, Lyyds/ᲈᛸᲀᛱ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lyyds/ᛲᲈᲁᛱ;

    .line 23
    .line 24
    new-instance v2, Lyyds/ᛵᛶᛷᛸ;

    .line 25
    .line 26
    invoke-direct {v2, v1}, Lyyds/ᛵᛶᛷᛸ;-><init>(Lyyds/ᛲᲈᲁᛱ;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lyyds/ᲈᛸᲀᛱ;->ᛵᛸᛸᛷ:Lyyds/ᛷᛴᲈᲀ;

    .line 30
    .line 31
    invoke-direct {v0, v2, p0}, Lyyds/ᛴᲇᛱᛵ;-><init>(Ljava/util/Iterator;Lyyds/ᛷᛴᲈᲀ;)V

    .line 32
    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
