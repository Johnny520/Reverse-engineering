.class public final Lxhss/ᛶᲇᲇᛸ;
.super Lxhss/ᛴᛴᛲᛲ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛳᲇᛶ;


# instance fields
.field public final synthetic ᛳᲁᲇᛸ:I

.field public final synthetic ᛷᛴᛷᛱ:Lorg/luckypray/dexkit/DexKitBridge;

.field public final synthetic ᲇᛴᲇᛵ:Lxhss/ᲁᛵᛷᛷ;

.field public final synthetic ᲇᛶᛴᲀ:I


# direct methods
.method public synthetic constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᲁᛵᛷᛷ;II)V
    .locals 0

    .line 15
    iput p4, p0, Lxhss/ᛶᲇᲇᛸ;->ᛳᲁᲇᛸ:I

    iput-object p1, p0, Lxhss/ᛶᲇᲇᛸ;->ᛷᛴᛷᛱ:Lorg/luckypray/dexkit/DexKitBridge;

    iput-object p2, p0, Lxhss/ᛶᲇᲇᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲁᛵᛷᛷ;

    iput p3, p0, Lxhss/ᛶᲇᲇᛸ;->ᲇᛶᛴᲀ:I

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lxhss/ᛴᛴᛲᛲ;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lxhss/ᲇᛸᛳᛸ;Lorg/luckypray/dexkit/DexKitBridge;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lxhss/ᛶᲇᲇᛸ;->ᛳᲁᲇᛸ:I

    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛶᲇᲇᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲁᛵᛷᛷ;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛶᲇᲇᛸ;->ᛷᛴᛷᛱ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 7
    .line 8
    iput p3, p0, Lxhss/ᛶᲇᲇᛸ;->ᲇᛶᛴᲀ:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-direct {p0, p1}, Lxhss/ᛴᛴᛲᛲ;-><init>(I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lxhss/ᛶᲇᲇᛸ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget v3, p0, Lxhss/ᛶᲇᲇᛸ;->ᲇᛶᛴᲀ:I

    .line 6
    .line 7
    iget-object v4, p0, Lxhss/ᛶᲇᲇᛸ;->ᲇᛴᲇᛵ:Lxhss/ᲁᛵᛷᛷ;

    .line 8
    .line 9
    iget-object p0, p0, Lxhss/ᛶᲇᲇᛸ;->ᛷᛴᛷᛱ:Lorg/luckypray/dexkit/DexKitBridge;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v4, Lxhss/ᲀᛷᲀᲇ;

    .line 15
    .line 16
    iget v0, v4, Lxhss/ᲀᛷᲀᲇ;->ᲇᛶᛴᲀ:I

    .line 17
    .line 18
    invoke-static {v3, v0}, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ(II)J

    .line 19
    .line 20
    .line 21
    move-result-wide v3

    .line 22
    new-array v0, v2, [J

    .line 23
    .line 24
    aput-wide v3, v0, v1

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->ᛸᛶᲈᛶ([J)Lxhss/ᛵᛲᛴᛵ;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Lxhss/ᛷᲁᛴ;->first()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, Lxhss/ᲇᛸᛳᛸ;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    check-cast v4, Lxhss/ᲇᛸᛳᛸ;

    .line 38
    .line 39
    iget-object v0, v4, Lxhss/ᲇᛸᛳᛸ;->ᲇᛶᛴᲀ:Ljava/lang/Integer;

    .line 40
    .line 41
    const/4 v4, 0x0

    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    invoke-static {v3, v0}, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ(II)J

    .line 49
    .line 50
    .line 51
    move-result-wide v5

    .line 52
    new-array v0, v2, [J

    .line 53
    .line 54
    aput-wide v5, v0, v1

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->ᛸᛶᲈᛶ([J)Lxhss/ᛵᛲᛴᛵ;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛷᲁᛴ;->first()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    :goto_0
    check-cast v4, Lxhss/ᲇᛸᛳᛸ;

    .line 72
    .line 73
    :cond_1
    return-object v4

    .line 74
    :pswitch_1
    check-cast v4, Lxhss/ᲇᛸᛳᛸ;

    .line 75
    .line 76
    iget-object v0, v4, Lxhss/ᲇᛸᛳᛸ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 77
    .line 78
    new-instance v1, Ljava/util/ArrayList;

    .line 79
    .line 80
    invoke-static {v0}, Lxhss/ᛳᛲᲈᲁ;->ᲁᛴᛴᛸ(Ljava/lang/Iterable;)I

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_2

    .line 96
    .line 97
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Ljava/lang/Number;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    invoke-static {v3, v2}, Lxhss/ᲁᛵᛷᛷ;->ᛳᲁᲇᛸ(II)J

    .line 108
    .line 109
    .line 110
    move-result-wide v4

    .line 111
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_2
    invoke-static {v1}, Lxhss/ᛷᲇᛵᛳ;->ᛴᛷᛵᛴ(Ljava/util/ArrayList;)[J

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p0, v0}, Lorg/luckypray/dexkit/DexKitBridge;->ᛸᛶᲈᛶ([J)Lxhss/ᛵᛲᛴᛵ;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    return-object p0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
