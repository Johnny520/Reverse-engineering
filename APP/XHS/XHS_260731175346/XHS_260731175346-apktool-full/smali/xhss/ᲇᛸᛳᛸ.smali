.class public final Lxhss/ᲇᛸᛳᛸ;
.super Lxhss/ᲁᛵᛷᛷ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛴᛷᛱ:Ljava/lang/String;

.field public final ᛸᛲᲀᛵ:Lxhss/ᛴᛷᛱ;

.field public final ᛸᛴᛶᛳ:Lxhss/ᛴᛷᛱ;

.field public final ᛸᛷᲈᲈ:Lxhss/ᛴᛷᛱ;

.field public final ᲀᲇᛳᲁ:Ljava/util/ArrayList;

.field public final ᲇᛴᲇᛵ:I

.field public final ᲇᛶᛴᲀ:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIILjava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lxhss/ᲁᛵᛷᛷ;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lxhss/ᲇᛸᛳᛸ;->ᲇᛴᲇᛵ:I

    .line 5
    .line 6
    iput-object p5, p0, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p6, p0, Lxhss/ᲇᛸᛳᛸ;->ᲇᛶᛴᲀ:Ljava/lang/Integer;

    .line 9
    .line 10
    iput-object p7, p0, Lxhss/ᲇᛸᛳᛸ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 11
    .line 12
    new-instance p2, Lxhss/ᛸᛱᲁᲁ;

    .line 13
    .line 14
    const/4 p4, 0x0

    .line 15
    invoke-direct {p2, p4, p0}, Lxhss/ᛸᛱᲁᲁ;-><init>(ILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    new-instance p5, Lxhss/ᛴᛷᛱ;

    .line 19
    .line 20
    invoke-direct {p5, p2}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 21
    .line 22
    .line 23
    iput-object p5, p0, Lxhss/ᲇᛸᛳᛸ;->ᛸᛴᛶᛳ:Lxhss/ᛴᛷᛱ;

    .line 24
    .line 25
    new-instance p2, Lxhss/ᛶᲇᲇᛸ;

    .line 26
    .line 27
    invoke-direct {p2, p0, p1, p3}, Lxhss/ᛶᲇᲇᛸ;-><init>(Lxhss/ᲇᛸᛳᛸ;Lorg/luckypray/dexkit/DexKitBridge;I)V

    .line 28
    .line 29
    .line 30
    new-instance p5, Lxhss/ᛴᛷᛱ;

    .line 31
    .line 32
    invoke-direct {p5, p2}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 33
    .line 34
    .line 35
    iput-object p5, p0, Lxhss/ᲇᛸᛳᛸ;->ᛸᛲᲀᛵ:Lxhss/ᛴᛷᛱ;

    .line 36
    .line 37
    new-instance p2, Lxhss/ᛶᲇᲇᛸ;

    .line 38
    .line 39
    invoke-direct {p2, p1, p0, p3, p4}, Lxhss/ᛶᲇᲇᛸ;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᲁᛵᛷᛷ;II)V

    .line 40
    .line 41
    .line 42
    new-instance p1, Lxhss/ᛴᛷᛱ;

    .line 43
    .line 44
    invoke-direct {p1, p2}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lxhss/ᲇᛸᛳᛸ;->ᛸᛷᲈᲈ:Lxhss/ᛴᛷᛱ;

    .line 48
    .line 49
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
    instance-of v0, p1, Lxhss/ᲇᛸᛳᛸ;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    check-cast p1, Lxhss/ᲇᛸᛳᛸ;

    .line 9
    .line 10
    iget-object p1, p1, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 11
    .line 12
    iget-object p0, p0, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object p0, p0, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ:Ljava/lang/String;

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
    iget v1, p0, Lxhss/ᲇᛸᛳᛸ;->ᲇᛴᲇᛵ:I

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    new-instance v2, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v1, " "

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    :cond_0
    invoke-virtual {p0}, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛶᛳᛵ;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-object v1, v1, Lxhss/ᲇᛶᛳᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 39
    .line 40
    const-string v2, "class "

    .line 41
    .line 42
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lxhss/ᲇᛸᛳᛸ;->ᛸᛲᲀᛵ:Lxhss/ᛴᛷᛱ;

    .line 50
    .line 51
    invoke-virtual {v1}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Lxhss/ᲇᛸᛳᛸ;

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    const-string v2, " extends "

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lxhss/ᲇᛸᛳᛸ;->ᛷᛴᛷᛱ()Lxhss/ᲇᛶᛳᛵ;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iget-object v1, v1, Lxhss/ᲇᛶᛳᛵ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    :cond_1
    iget-object v1, p0, Lxhss/ᲇᛸᛳᛸ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-lez v1, :cond_2

    .line 80
    .line 81
    const-string v1, " implements "

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lxhss/ᲇᛸᛳᛸ;->ᛸᛷᲈᲈ:Lxhss/ᛴᛷᛱ;

    .line 87
    .line 88
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    check-cast p0, Lxhss/ᛵᛲᛴᛵ;

    .line 93
    .line 94
    sget-object v1, Lxhss/ᲀᲈᲇᛱ;->ᲇᛴᲇᛵ:Lxhss/ᲀᲈᲇᛱ;

    .line 95
    .line 96
    const/16 v2, 0x1e

    .line 97
    .line 98
    const-string v3, ", "

    .line 99
    .line 100
    invoke-static {p0, v3, v1, v2}, Lxhss/ᛷᲇᛵᛳ;->ᛴᲀᛸᛵ(Ljava/util/Collection;Ljava/lang/String;Lxhss/ᛷᛴᛲᛲ;I)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᲇᛶᛳᛵ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛸᛳᛸ;->ᛸᛴᛶᛳ:Lxhss/ᛴᛷᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxhss/ᲇᛶᛳᛵ;

    .line 8
    .line 9
    return-object p0
.end method
