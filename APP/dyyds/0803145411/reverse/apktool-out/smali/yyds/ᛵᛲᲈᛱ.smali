.class public final synthetic Lyyds/ᛵᛲᲈᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛲᛱ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛱᛷᛸᲈ;Lyyds/ᛱᲁᛲᛱ;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᛵᛲᲈᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛵᛲᲈᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᛵᛲᲈᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛲᛱ;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lyyds/ᛵᛲᲈᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛵᛲᲈᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛱᲁᛲᛱ;

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᛵᛲᲈᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛱᛷᛸᲈ;

    .line 6
    .line 7
    check-cast p1, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    check-cast p2, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    packed-switch v0, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    new-instance v0, Lyyds/ᛶᲇᛴᛴ;

    .line 23
    .line 24
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lyyds/ᛶᲇᛴᛴ;

    .line 27
    .line 28
    iget v2, p0, Lyyds/ᛶᲇᛴᛴ;->ᛵᛸᛸᛷ:I

    .line 29
    .line 30
    iget p0, p0, Lyyds/ᛶᲇᛴᛴ;->ᲇᲈᛵᛷ:I

    .line 31
    .line 32
    invoke-direct {v0, p1, v2, p2, p0}, Lyyds/ᛶᲇᛴᛴ;-><init>(IIII)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lyyds/ᲀᲀᛸᛱ;->ᛲᛳᛶᲁ(Lyyds/ᛶᲇᛴᛴ;Lyyds/ᛱᲁᛲᛱ;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_0
    new-instance v0, Lyyds/ᛶᲇᛴᛴ;

    .line 45
    .line 46
    iget-object p0, p0, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Lyyds/ᛶᲇᛴᛴ;

    .line 49
    .line 50
    iget v2, p0, Lyyds/ᛶᲇᛴᛴ;->ᛲᲈᲁ:I

    .line 51
    .line 52
    iget p0, p0, Lyyds/ᛶᲇᛴᛴ;->ᲀᛲᛳᲀ:I

    .line 53
    .line 54
    invoke-direct {v0, v2, p1, p0, p2}, Lyyds/ᛶᲇᛴᛴ;-><init>(IIII)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Lyyds/ᲀᲀᛸᛱ;->ᛲᛳᛶᲁ(Lyyds/ᛶᲇᛴᛴ;Lyyds/ᛱᲁᛲᛱ;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    goto :goto_0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
