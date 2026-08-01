.class public final Lxhss/ᛵᛶᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:I

.field public final ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public final synthetic ᛷᛵᛵᲈ:I

.field public ᲇᛴᲇᛵ:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILxhss/ᲁᲁᛱᲀ;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lxhss/ᛵᛶᛳ;->ᛷᛵᛵᲈ:I

    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    iput p1, p0, Lxhss/ᛵᛶᛳ;->ᛱᛱᛲᲇ:I

    .line 24
    iput-object p2, p0, Lxhss/ᛵᛶᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(ILxhss/ᲁᲁᛱᲀ;Lxhss/ᛵᛶᛳ;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lxhss/ᛵᛶᛳ;->ᛷᛵᛵᲈ:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Lxhss/ᛵᛶᛳ;->ᛱᛱᛲᲇ:I

    .line 20
    iput-object p2, p0, Lxhss/ᛵᛶᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 21
    iput-object p3, p0, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lxhss/ᛵᛶᛳ;->ᛷᛵᛵᲈ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxhss/ᛵᛶᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 10
    .line 11
    iput p3, p0, Lxhss/ᛵᛶᛳ;->ᛱᛱᛲᲇ:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lxhss/ᲈᛲᛵᛴ;ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lxhss/ᛵᛶᛳ;->ᛷᛵᛵᲈ:I

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lxhss/ᛵᛶᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 16
    iput p2, p0, Lxhss/ᛵᛶᛳ;->ᛱᛱᛲᲇ:I

    .line 17
    iput-object p3, p0, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᛵᛶᛳ;->ᛷᛵᛵᲈ:I

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᛵᛶᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    check-cast v1, Lxhss/ᲈᛲᛵᛴ;

    .line 19
    .line 20
    sget-object v2, Lxhss/ᲈᛲᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᲈᛲᛵᛴ;

    .line 21
    .line 22
    if-ne v1, v2, :cond_0

    .line 23
    .line 24
    const-string v1, "HTTP/1.0"

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const-string v1, "HTTP/1.1"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    :goto_0
    const/16 v1, 0x20

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    iget v2, p0, Lxhss/ᛵᛶᛳ;->ᛱᛱᛲᲇ:I

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast p0, Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v2, "["

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    check-cast v1, Ljava/lang/Integer;

    .line 68
    .line 69
    const-string v2, ""

    .line 70
    .line 71
    if-nez v1, :cond_1

    .line 72
    .line 73
    move-object v1, v2

    .line 74
    goto :goto_1

    .line 75
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v1, ":"

    .line 83
    .line 84
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, Lxhss/ᛵᛶᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast p0, Ljava/lang/Integer;

    .line 90
    .line 91
    if-nez p0, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p0, "]"

    .line 102
    .line 103
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
