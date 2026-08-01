.class public final Lxhss/ᲇᲁᛲᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛶᛳᲁᲈ;

.field public final ᛳᲁᲇᛸ:Ljava/lang/Object;

.field public final ᛷᛵᛵᲈ:Ljava/lang/Object;

.field public final ᲇᛴᲇᛵ:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p1, p0, Lxhss/ᲇᲁᛲᛳ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 18
    iput-object p2, p0, Lxhss/ᲇᲁᛲᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᲁᲈ;

    .line 19
    iput-object p3, p0, Lxhss/ᲇᲁᛲᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 20
    iput-object p4, p0, Lxhss/ᲇᲁᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Throwable;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lxhss/ᛶᛳᲁᲈ;Ljava/util/concurrent/CancellationException;I)V
    .locals 2

    .line 1
    and-int/lit8 v0, p4, 0x2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p2, v1

    .line 7
    :cond_0
    and-int/lit8 p4, p4, 0x10

    .line 8
    .line 9
    if-eqz p4, :cond_1

    .line 10
    .line 11
    move-object p3, v1

    .line 12
    :cond_1
    invoke-direct {p0, p1, p2, v1, p3}, Lxhss/ᲇᲁᛲᛳ;-><init>(Ljava/lang/Object;Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static ᛷᛵᛵᲈ(Lxhss/ᲇᲁᛲᛳ;Lxhss/ᛶᛳᲁᲈ;Ljava/util/concurrent/CancellationException;I)Lxhss/ᲇᲁᛲᛳ;
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᲇᲁᛲᛳ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 2
    .line 3
    and-int/lit8 v1, p3, 0x2

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lxhss/ᲇᲁᛲᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᲁᲈ;

    .line 8
    .line 9
    :cond_0
    iget-object v1, p0, Lxhss/ᲇᲁᛲᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 10
    .line 11
    and-int/lit8 p3, p3, 0x10

    .line 12
    .line 13
    if-eqz p3, :cond_1

    .line 14
    .line 15
    iget-object p2, p0, Lxhss/ᲇᲁᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Throwable;

    .line 16
    .line 17
    :cond_1
    new-instance p0, Lxhss/ᲇᲁᛲᛳ;

    .line 18
    .line 19
    invoke-direct {p0, v0, p1, v1, p2}, Lxhss/ᲇᲁᛲᛳ;-><init>(Ljava/lang/Object;Lxhss/ᛶᛳᲁᲈ;Ljava/lang/Object;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lxhss/ᲇᲁᛲᛳ;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lxhss/ᲇᲁᛲᛳ;

    .line 12
    .line 13
    iget-object v1, p0, Lxhss/ᲇᲁᛲᛳ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v3, p1, Lxhss/ᲇᲁᛲᛳ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lxhss/ᲇᲁᛲᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᲁᲈ;

    .line 25
    .line 26
    iget-object v3, p1, Lxhss/ᲇᲁᛲᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᲁᲈ;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lxhss/ᲇᲁᛲᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v3, p1, Lxhss/ᲇᲁᛲᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object p0, p0, Lxhss/ᲇᲁᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Throwable;

    .line 47
    .line 48
    iget-object p1, p1, Lxhss/ᲇᲁᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Throwable;

    .line 49
    .line 50
    invoke-static {p0, p1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-nez p0, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lxhss/ᲇᲁᛲᛳ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    mul-int/lit8 v1, v1, 0x1f

    .line 13
    .line 14
    iget-object v2, p0, Lxhss/ᲇᲁᛲᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᲁᲈ;

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    move v2, v0

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_1
    add-int/2addr v1, v2

    .line 25
    mul-int/lit16 v1, v1, 0x3c1

    .line 26
    .line 27
    iget-object v2, p0, Lxhss/ᲇᲁᛲᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 28
    .line 29
    if-nez v2, :cond_2

    .line 30
    .line 31
    move v2, v0

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_2
    add-int/2addr v1, v2

    .line 38
    mul-int/lit8 v1, v1, 0x1f

    .line 39
    .line 40
    iget-object p0, p0, Lxhss/ᲇᲁᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Throwable;

    .line 41
    .line 42
    if-nez p0, :cond_3

    .line 43
    .line 44
    goto :goto_3

    .line 45
    :cond_3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    :goto_3
    add-int/2addr v1, v0

    .line 50
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "CompletedContinuation(result="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lxhss/ᲇᲁᛲᛳ;->ᛷᛵᛵᲈ:Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", cancelHandler="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lxhss/ᲇᲁᛲᛳ;->ᛱᛱᛲᲇ:Lxhss/ᛶᛳᲁᲈ;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", onCancellation=null, idempotentResume="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lxhss/ᲇᲁᛲᛳ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", cancelCause="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lxhss/ᲇᲁᛲᛳ;->ᲇᛴᲇᛵ:Ljava/lang/Throwable;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 p0, 0x29

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
