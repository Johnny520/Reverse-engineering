.class public final Lxhss/ᛳᛸᛸᛵ;
.super Lxhss/ᲁᛵᛷᛷ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛴᛷᛱ:Ljava/lang/String;

.field public final ᛸᛴᛶᛳ:Lxhss/ᛴᛷᛱ;

.field public final ᲀᲇᛳᲁ:Lxhss/ᛴᛷᛱ;

.field public final ᲇᛴᲇᛵ:I

.field public final ᲇᛶᛴᲀ:Lxhss/ᛴᛷᛱ;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lxhss/ᲁᛵᛷᛷ;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p5, p0, Lxhss/ᛳᛸᛸᛵ;->ᲇᛴᲇᛵ:I

    .line 5
    .line 6
    iput-object p6, p0, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 7
    .line 8
    new-instance p4, Lxhss/ᛸᛱᲁᲁ;

    .line 9
    .line 10
    const/4 p5, 0x4

    .line 11
    invoke-direct {p4, p5, p0}, Lxhss/ᛸᛱᲁᲁ;-><init>(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    new-instance p5, Lxhss/ᛴᛷᛱ;

    .line 15
    .line 16
    invoke-direct {p5, p4}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 17
    .line 18
    .line 19
    iput-object p5, p0, Lxhss/ᛳᛸᛸᛵ;->ᲇᛶᛴᲀ:Lxhss/ᛴᛷᛱ;

    .line 20
    .line 21
    new-instance v0, Lxhss/ᛵᛳᲈᲁ;

    .line 22
    .line 23
    const/4 v5, 0x1

    .line 24
    move-object v2, p0

    .line 25
    move-object v1, p1

    .line 26
    move v4, p2

    .line 27
    move v3, p3

    .line 28
    invoke-direct/range {v0 .. v5}, Lxhss/ᛵᛳᲈᲁ;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᲁᛵᛷᛷ;III)V

    .line 29
    .line 30
    .line 31
    move-object p2, v2

    .line 32
    move p4, v4

    .line 33
    new-instance p0, Lxhss/ᛴᛷᛱ;

    .line 34
    .line 35
    invoke-direct {p0, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 36
    .line 37
    .line 38
    iput-object p0, p2, Lxhss/ᛳᛸᛸᛵ;->ᲀᲇᛳᲁ:Lxhss/ᛴᛷᛱ;

    .line 39
    .line 40
    new-instance p0, Lxhss/ᛵᛳᲈᲁ;

    .line 41
    .line 42
    const/4 p5, 0x2

    .line 43
    invoke-direct/range {p0 .. p5}, Lxhss/ᛵᛳᲈᲁ;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᲁᛵᛷᛷ;III)V

    .line 44
    .line 45
    .line 46
    new-instance p1, Lxhss/ᛴᛷᛱ;

    .line 47
    .line 48
    invoke-direct {p1, p0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 49
    .line 50
    .line 51
    iput-object p1, p2, Lxhss/ᛳᛸᛸᛵ;->ᛸᛴᛶᛳ:Lxhss/ᛴᛷᛱ;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lxhss/ᛳᛸᛸᛵ;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lxhss/ᛳᛸᛸᛵ;

    .line 9
    .line 10
    iget-object p1, p1, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p0, p0, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, " "

    .line 7
    .line 8
    iget v2, p0, Lxhss/ᛳᛸᛸᛵ;->ᲇᛴᲇᛵ:I

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v2, v2, Lxhss/ᲇᛴᲇᛴ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Lxhss/ᲇᛴᲇᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v1, "."

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    iget-object v1, v1, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, "("

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Lxhss/ᛳᛸᛸᛵ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iget-object p0, p0, Lxhss/ᲇᛴᲇᛴ;->ᛳᲁᲇᛸ:Ljava/util/ArrayList;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    const/16 v2, 0x3e

    .line 82
    .line 83
    const-string v3, ", "

    .line 84
    .line 85
    invoke-static {p0, v3, v1, v2}, Lxhss/ᛷᲇᛵᛳ;->ᛴᲀᛸᛵ(Ljava/util/Collection;Ljava/lang/String;Lxhss/ᛷᛴᛲᛲ;I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p0, ")"

    .line 93
    .line 94
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᲇᛴᲇᛴ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛳᛸᛸᛵ;->ᲇᛶᛴᲀ:Lxhss/ᛴᛷᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxhss/ᲇᛴᲇᛴ;

    .line 8
    .line 9
    return-object p0
.end method
