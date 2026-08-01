.class public final Lxhss/ᲀᛷᲀᲇ;
.super Lxhss/ᲁᛵᛷᛷ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛴᛷᛱ:Ljava/lang/String;

.field public final ᛸᛲᲀᛵ:Lxhss/ᛴᛷᛱ;

.field public final ᛸᛴᛶᛳ:Lxhss/ᛴᛷᛱ;

.field public final ᲀᲇᛳᲁ:Lxhss/ᛴᛷᛱ;

.field public final ᲇᛴᲇᛵ:I

.field public final ᲇᛶᛴᲀ:I


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lxhss/ᲁᛵᛷᛷ;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    .line 3
    .line 4
    iput p5, p0, Lxhss/ᲀᛷᲀᲇ;->ᲇᛴᲇᛵ:I

    .line 5
    .line 6
    iput-object p6, p0, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 7
    .line 8
    iput p7, p0, Lxhss/ᲀᛷᲀᲇ;->ᲇᛶᛴᲀ:I

    .line 9
    .line 10
    new-instance p4, Lxhss/ᛸᛱᲁᲁ;

    .line 11
    .line 12
    const/4 p5, 0x3

    .line 13
    invoke-direct {p4, p5, p0}, Lxhss/ᛸᛱᲁᲁ;-><init>(ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    new-instance p5, Lxhss/ᛴᛷᛱ;

    .line 17
    .line 18
    invoke-direct {p5, p4}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 19
    .line 20
    .line 21
    iput-object p5, p0, Lxhss/ᲀᛷᲀᲇ;->ᲀᲇᛳᲁ:Lxhss/ᛴᛷᛱ;

    .line 22
    .line 23
    new-instance p4, Lxhss/ᛶᲇᲇᛸ;

    .line 24
    .line 25
    const/4 p5, 0x2

    .line 26
    invoke-direct {p4, p1, p0, p3, p5}, Lxhss/ᛶᲇᲇᛸ;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᲁᛵᛷᛷ;II)V

    .line 27
    .line 28
    .line 29
    new-instance p5, Lxhss/ᛴᛷᛱ;

    .line 30
    .line 31
    invoke-direct {p5, p4}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 32
    .line 33
    .line 34
    iput-object p5, p0, Lxhss/ᲀᛷᲀᲇ;->ᛸᛴᛶᛳ:Lxhss/ᛴᛷᛱ;

    .line 35
    .line 36
    new-instance v0, Lxhss/ᛵᛳᲈᲁ;

    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    move-object v2, p0

    .line 40
    move-object v1, p1

    .line 41
    move v4, p2

    .line 42
    move v3, p3

    .line 43
    invoke-direct/range {v0 .. v5}, Lxhss/ᛵᛳᲈᲁ;-><init>(Lorg/luckypray/dexkit/DexKitBridge;Lxhss/ᲁᛵᛷᛷ;III)V

    .line 44
    .line 45
    .line 46
    new-instance p0, Lxhss/ᛴᛷᛱ;

    .line 47
    .line 48
    invoke-direct {p0, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 49
    .line 50
    .line 51
    iput-object p0, v2, Lxhss/ᲀᛷᲀᲇ;->ᛸᛲᲀᛵ:Lxhss/ᛴᛷᛱ;

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lxhss/ᲀᛷᲀᲇ;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lxhss/ᲀᛷᲀᲇ;

    .line 10
    .line 11
    iget-object p1, p1, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object p0, p0, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-static {p1, p0}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    return v0

    .line 22
    :cond_1
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ:Ljava/lang/String;

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
    iget v2, p0, Lxhss/ᲀᛷᲀᲇ;->ᲇᛴᲇᛵ:I

    .line 9
    .line 10
    if-lez v2, :cond_0

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
    invoke-virtual {p0}, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ()Lxhss/ᛷᛲᛲᛲ;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget-object v2, v2, Lxhss/ᛷᛲᛲᛲ;->ᛳᲁᲇᛸ:Ljava/lang/String;

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
    invoke-virtual {p0}, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ()Lxhss/ᛷᛲᛲᛲ;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    iget-object v1, v1, Lxhss/ᛷᛲᛲᛲ;->ᛷᛵᛵᲈ:Ljava/lang/String;

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
    invoke-virtual {p0}, Lxhss/ᲀᛷᲀᲇ;->ᛷᛴᛷᛱ()Lxhss/ᛷᛲᛲᛲ;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    iget-object p0, p0, Lxhss/ᛷᛲᛲᛲ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method

.method public final ᛷᛴᛷᛱ()Lxhss/ᛷᛲᛲᛲ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲀᛷᲀᲇ;->ᲀᲇᛳᲁ:Lxhss/ᛴᛷᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lxhss/ᛷᛲᛲᛲ;

    .line 8
    .line 9
    return-object p0
.end method
