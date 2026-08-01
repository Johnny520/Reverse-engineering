.class public final Lxhss/ᛸᛱᲁᲁ;
.super Lxhss/ᛴᛴᛲᛲ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛳᲇᛶ;


# instance fields
.field public final synthetic ᛳᲁᲇᛸ:I

.field public final synthetic ᲇᛴᲇᛵ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lxhss/ᛸᛱᲁᲁ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    iput-object p2, p0, Lxhss/ᛸᛱᲁᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lxhss/ᛴᛴᛲᛲ;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lxhss/ᛸᛱᲁᲁ;->ᛳᲁᲇᛸ:I

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᛸᛱᲁᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lxhss/ᲁᲇᛸᲀ;

    .line 9
    .line 10
    new-instance v0, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const-class v1, Lxhss/ᲀᲀᛸᛸ;

    .line 16
    .line 17
    invoke-static {v1}, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ(Ljava/lang/Class;)Lxhss/ᛱᛸᛷᛸ;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    new-instance v2, Lxhss/ᛵᛳᲇ;

    .line 22
    .line 23
    invoke-interface {v1}, Lxhss/ᛲᛵᲀᲈ;->ᛷᛵᛵᲈ()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    new-array v1, v1, [Lxhss/ᛵᛳᲇ;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, [Lxhss/ᛵᛳᲇ;

    .line 40
    .line 41
    array-length v1, v0

    .line 42
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    check-cast v0, [Lxhss/ᛵᛳᲇ;

    .line 47
    .line 48
    invoke-interface {p0}, Lxhss/ᲁᲇᛸᲀ;->ᛳᲁᲇᛸ()Lxhss/ᲈᲀᲀᛱ;

    .line 49
    .line 50
    .line 51
    check-cast p0, Lxhss/ᛱᲈᛴᛲ;

    .line 52
    .line 53
    invoke-interface {p0}, Lxhss/ᛱᲈᛴᛲ;->ᛱᛱᛲᲇ()Lxhss/ᛱᛱᛷᛸ;

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    throw p0

    .line 58
    :pswitch_0
    new-instance v0, Lxhss/ᲇᛴᲇᛴ;

    .line 59
    .line 60
    check-cast p0, Lxhss/ᛳᛸᛸᛵ;

    .line 61
    .line 62
    iget-object p0, p0, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 63
    .line 64
    invoke-direct {v0, p0}, Lxhss/ᲇᛴᲇᛴ;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_1
    new-instance v0, Lxhss/ᛷᛲᛲᛲ;

    .line 69
    .line 70
    check-cast p0, Lxhss/ᲀᛷᲀᲇ;

    .line 71
    .line 72
    iget-object p0, p0, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 73
    .line 74
    invoke-direct {v0, p0}, Lxhss/ᛷᛲᛲᛲ;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_2
    check-cast p0, Lxhss/ᲇᛴᲇᛴ;

    .line 79
    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v1, "("

    .line 83
    .line 84
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v1, p0, Lxhss/ᲇᛴᲇᛴ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 88
    .line 89
    sget-object v2, Lxhss/ᲀᲈᲇᛱ;->ᛷᛴᛷᛱ:Lxhss/ᲀᲈᲇᛱ;

    .line 90
    .line 91
    const/16 v3, 0x1e

    .line 92
    .line 93
    const-string v4, ""

    .line 94
    .line 95
    invoke-static {v1, v4, v2, v3}, Lxhss/ᛷᲇᛵᛳ;->ᛴᲀᛸᛵ(Ljava/util/Collection;Ljava/lang/String;Lxhss/ᛷᛴᛲᛲ;I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ")"

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    iget-object p0, p0, Lxhss/ᲇᛴᲇᛴ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {p0}, Lxhss/ᛱᛲᲁᛸ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :pswitch_3
    check-cast p0, Lxhss/ᛷᛲᛲᛲ;

    .line 122
    .line 123
    iget-object p0, p0, Lxhss/ᛷᛲᛲᛲ;->ᛳᲁᲇᛸ:Ljava/lang/String;

    .line 124
    .line 125
    invoke-static {p0}, Lxhss/ᛱᛲᲁᛸ;->ᲇᛴᲇᛵ(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    return-object p0

    .line 130
    :pswitch_4
    new-instance v0, Lxhss/ᲇᛶᛳᛵ;

    .line 131
    .line 132
    check-cast p0, Lxhss/ᲇᛸᛳᛸ;

    .line 133
    .line 134
    iget-object p0, p0, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 135
    .line 136
    invoke-direct {v0, p0}, Lxhss/ᲇᛶᛳᛵ;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-object v0

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
