.class public final Lxhss/ᲈᛶᛵᛴ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Ljava/lang/String;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛴᛳ;

.field public final ᛷᛵᛵᲈ:Ljava/lang/String;

.field public final ᲇᛴᲇᛵ:[Ljava/lang/Object;


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;Ljava/lang/String;Lxhss/ᛷᛸᛴᛳ;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲈᛶᛵᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᲈᛶᛵᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᲈᛶᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛴᛳ;

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᲈᛶᛵᛴ;->ᲇᛴᲇᛵ:[Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Lxhss/ᲈᛶᛵᛴ;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Lxhss/ᲈᛶᛵᛴ;

    .line 10
    .line 11
    iget-object v0, p0, Lxhss/ᲈᛶᛵᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 12
    .line 13
    iget-object v1, p1, Lxhss/ᲈᛶᛵᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    iget-object v0, p0, Lxhss/ᲈᛶᛵᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v1, p1, Lxhss/ᲈᛶᛵᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v0, p0, Lxhss/ᲈᛶᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛴᛳ;

    .line 32
    .line 33
    iget-object v1, p1, Lxhss/ᲈᛶᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛴᛳ;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lxhss/ᛷᛸᛴᛳ;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object p0, p0, Lxhss/ᲈᛶᛵᛴ;->ᲇᛴᲇᛵ:[Ljava/lang/Object;

    .line 42
    .line 43
    iget-object p1, p1, Lxhss/ᲈᛶᛵᛴ;->ᲇᛴᲇᛵ:[Ljava/lang/Object;

    .line 44
    .line 45
    invoke-static {p0, p1}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    :goto_0
    const/4 p0, 0x1

    .line 52
    return p0

    .line 53
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 54
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᲈᛶᛵᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lxhss/ᲈᛶᛵᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    xor-int/2addr v0, v1

    .line 20
    iget-object v1, p0, Lxhss/ᲈᛶᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛴᛳ;

    .line 21
    .line 22
    invoke-virtual {v1}, Lxhss/ᛷᛸᛴᛳ;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    const/16 v2, 0x10

    .line 27
    .line 28
    invoke-static {v1, v2}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    xor-int/2addr v0, v1

    .line 33
    iget-object p0, p0, Lxhss/ᲈᛶᛵᛴ;->ᲇᛴᲇᛵ:[Ljava/lang/Object;

    .line 34
    .line 35
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    const/16 v1, 0x18

    .line 40
    .line 41
    invoke-static {p0, v1}, Ljava/lang/Integer;->rotateLeft(II)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    xor-int/2addr p0, v0

    .line 46
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lxhss/ᲈᛶᛵᛴ;->ᲇᛴᲇᛵ:[Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, Lxhss/ᲈᛶᛵᛴ;->ᛷᛵᛵᲈ:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const-string v2, " : "

    .line 18
    .line 19
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v2, p0, Lxhss/ᲈᛶᛵᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lxhss/ᲈᛶᛵᛴ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛸᛴᛳ;

    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method
