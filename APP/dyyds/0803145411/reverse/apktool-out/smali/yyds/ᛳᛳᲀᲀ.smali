.class public final Lyyds/ᛳᛳᲀᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛵᲈᛴᛷ;


# instance fields
.field public final synthetic ᛲᲈᲁ:I

.field public final ᛵᛸᛸᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛳᛳᲀᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛳᛳᲀᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

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
    iget v0, p0, Lyyds/ᛳᛳᲀᲀ;->ᛲᲈᲁ:I

    .line 2
    .line 3
    iget-object v1, p0, Lyyds/ᛳᛳᲀᲀ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Lyyds/ᛳᛷᲇᛸ;

    .line 9
    .line 10
    check-cast v1, Ljava/lang/CharSequence;

    .line 11
    .line 12
    invoke-direct {p0, v1}, Lyyds/ᛳᛷᲇᛸ;-><init>(Ljava/lang/CharSequence;)V

    .line 13
    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    check-cast v1, Lyyds/ᲈᛸᲀᛱ;

    .line 17
    .line 18
    invoke-static {v1}, Lyyds/ᛷᛴᛳᛶ;->ᛷᛸᲇᛶ(Lyyds/ᛵᲈᛴᛷ;)Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object v0, Lyyds/ᲀᛸᲀᛷ;->ᲀᛲᛳᲀ:Lyyds/ᲀᛸᲀᛷ;

    .line 23
    .line 24
    invoke-static {p0, v0}, Lyyds/ᛲᛷᲇᛵ;->ᛶᲈᛴᲈ(Ljava/util/List;Ljava/util/Comparator;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0

    .line 32
    :pswitch_1
    check-cast v1, Ljava/util/Iterator;

    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_2
    check-cast v1, Lyyds/ᛲᲇᲁᛴ;

    .line 36
    .line 37
    new-instance p0, Lyyds/ᛸᛲᲇᛶ;

    .line 38
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    check-cast v1, Lyyds/ᛲᛴᛷᛳ;

    .line 43
    .line 44
    invoke-virtual {v1, p0, p0}, Lyyds/ᛲᛴᛷᛳ;->ᛲᛲᲈᲈ(Ljava/lang/Object;Lyyds/ᛲᛱᛶᛸ;)Lyyds/ᛲᛱᛶᛸ;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iput-object v0, p0, Lyyds/ᛸᛲᲇᛶ;->ᲇᲇᲇᛱ:Lyyds/ᛲᛱᛶᛸ;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_3
    new-instance v0, Lyyds/ᛴᛵᛸᲁ;

    .line 52
    .line 53
    invoke-direct {v0, p0}, Lyyds/ᛴᛵᛸᲁ;-><init>(Lyyds/ᛳᛳᲀᲀ;)V

    .line 54
    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_4
    check-cast v1, Ljava/lang/Iterable;

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :pswitch_5
    check-cast v1, [Ljava/lang/Object;

    .line 65
    .line 66
    new-instance p0, Lyyds/ᛲᲀᛵᛷ;

    .line 67
    .line 68
    const/4 v0, 0x1

    .line 69
    invoke-direct {p0, v0, v1}, Lyyds/ᛲᲀᛵᛷ;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
