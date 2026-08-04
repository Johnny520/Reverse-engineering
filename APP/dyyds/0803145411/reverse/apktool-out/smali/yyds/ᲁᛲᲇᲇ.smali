.class public final Lyyds/ᲁᛲᲇᲇ;
.super Lyyds/ᛸᲀᛷᛱ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public synthetic ᛱᲈᲁ:Ljava/lang/Object;

.field public final synthetic ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;

.field public final synthetic ᛶᛷᛲᲁ:I


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᲁᛲᲇᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᲁᛲᲇᲇ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;

    .line 4
    .line 5
    const/4 p2, 0x2

    .line 6
    invoke-direct {p0, p2, p1}, Lyyds/ᛸᲀᛷᛱ;-><init>(ILyyds/ᛲᛱᛶᛸ;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲁᛲᲇᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᲁᛲᲇᲇ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᲁᛲᲇᲇ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lyyds/ᛱᲇᛶᛵ;

    .line 14
    .line 15
    check-cast p0, Lyyds/ᛸᛸᲈᛳ;

    .line 16
    .line 17
    invoke-interface {p0}, Lyyds/ᛸᛸᲈᛳ;->ᛵᛸᛸᛷ()Lyyds/ᛱᛵᛷ;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {v1, p0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-static {p1}, Lyyds/ᛷᛴᲇᛲ;->ᛳᲁᲁᲇ(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lyyds/ᲁᛲᲇᲇ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p0, Lyyds/ᛱᲇᛶᛵ;

    .line 32
    .line 33
    check-cast p0, Lyyds/ᛸᛸᲈᛳ;

    .line 34
    .line 35
    invoke-interface {p0}, Lyyds/ᛸᛸᲈᛳ;->ᛵᛸᛸᛷ()Lyyds/ᛱᛵᛷ;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-interface {v1, p0}, Lyyds/ᛷᛴᲈᲀ;->ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲁᛲᲇᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲁᛲᲇᲇ;->ᛲᛳᛶᲁ:Lyyds/ᛷᛴᲈᲀ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lyyds/ᲁᛲᲇᲇ;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p2, p0, v1}, Lyyds/ᲁᛲᲇᲇ;-><init>(Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;I)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, Lyyds/ᲁᛲᲇᲇ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lyyds/ᲁᛲᲇᲇ;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p2, p0, v1}, Lyyds/ᲁᛲᲇᲇ;-><init>(Lyyds/ᛲᛱᛶᛸ;Lyyds/ᛷᛴᲈᲀ;I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, Lyyds/ᲁᛲᲇᲇ;->ᛱᲈᲁ:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lyyds/ᲁᛲᲇᲇ;->ᛶᛷᛲᲁ:I

    .line 2
    .line 3
    sget-object v1, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 4
    .line 5
    check-cast p1, Lyyds/ᛱᲇᛶᛵ;

    .line 6
    .line 7
    check-cast p2, Lyyds/ᛲᛱᛶᛸ;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lyyds/ᲁᛲᲇᲇ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Lyyds/ᲁᛲᲇᲇ;

    .line 17
    .line 18
    invoke-virtual {p0, v1}, Lyyds/ᲁᛲᲇᲇ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lyyds/ᲁᛲᲇᲇ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Lyyds/ᲁᛲᲇᲇ;

    .line 28
    .line 29
    invoke-virtual {p0, v1}, Lyyds/ᲁᛲᲇᲇ;->ᛱᛳᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
