.class public abstract Lxhss/ᛴᛷᛴᲀ;
.super Lxhss/ᛱᛸᛲᛴ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛲᲁᲇ;
.implements Lxhss/ᛲᲀᛵᛳ;


# instance fields
.field public ᛷᛴᛷᛱ:Lxhss/ᛸᛷᛳᲈ;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/16 v1, 0x40

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-static {p0}, Lxhss/ᛶᛵᛱ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, "[job@"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lxhss/ᛴᛷᛴᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛷᛳᲈ;

    .line 32
    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    :goto_0
    invoke-static {p0}, Lxhss/ᛶᛵᛱ;->ᛸᛴᛶᛳ(Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const/16 p0, 0x5d

    .line 45
    .line 46
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public final ᛷᛵᛵᲈ()V
    .locals 7

    .line 1
    iget-object v0, p0, Lxhss/ᛴᛷᛴᲀ;->ᛷᛴᛷᛱ:Lxhss/ᛸᛷᛳᲈ;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :goto_0
    move-object v2, v0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    goto :goto_0

    .line 9
    :goto_1
    invoke-virtual {v2}, Lxhss/ᛸᛷᛳᲈ;->ᲈᛲᛵᲁ()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    instance-of v0, v5, Lxhss/ᛴᛷᛴᲀ;

    .line 14
    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    if-eq v5, p0, :cond_1

    .line 18
    .line 19
    goto/16 :goto_4

    .line 20
    .line 21
    :cond_1
    sget-object v1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 22
    .line 23
    sget-wide v3, Lxhss/ᛸᛷᛳᲈ;->ᛳᲁᲇᛸ:J

    .line 24
    .line 25
    sget-object v6, Lxhss/ᛵᛶᲀᲇ;->ᛸᛲᲀᛵ:Lxhss/ᛳᛵᲁᛵ;

    .line 26
    .line 27
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    goto :goto_4

    .line 34
    :cond_2
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eq v0, v5, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_3
    instance-of v0, v5, Lxhss/ᛲᲀᛵᛳ;

    .line 42
    .line 43
    if-eqz v0, :cond_9

    .line 44
    .line 45
    check-cast v5, Lxhss/ᛲᲀᛵᛳ;

    .line 46
    .line 47
    invoke-interface {v5}, Lxhss/ᛲᲀᛵᛳ;->ᲇᛴᲇᛵ()Lxhss/ᛴᲁᛶᛲ;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-eqz v0, :cond_9

    .line 52
    .line 53
    :goto_2
    invoke-virtual {p0}, Lxhss/ᛱᛸᛲᛴ;->ᛸᛴᛶᛳ()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    instance-of v0, v5, Lxhss/ᲇᛲᲈᲀ;

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    if-ne v5, p0, :cond_5

    .line 63
    .line 64
    check-cast v5, Lxhss/ᛱᛸᛲᛴ;

    .line 65
    .line 66
    return-void

    .line 67
    :cond_5
    move-object v0, v5

    .line 68
    check-cast v0, Lxhss/ᛱᛸᛲᛴ;

    .line 69
    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    sget-object v1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 74
    .line 75
    sget-wide v2, Lxhss/ᛱᛸᛲᛴ;->ᲇᛴᲇᛵ:J

    .line 76
    .line 77
    invoke-virtual {v1, v0, v2, v3}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Lxhss/ᲇᛲᲈᲀ;

    .line 82
    .line 83
    if-nez v4, :cond_6

    .line 84
    .line 85
    new-instance v4, Lxhss/ᲇᛲᲈᲀ;

    .line 86
    .line 87
    invoke-direct {v4, v0}, Lxhss/ᲇᛲᲈᲀ;-><init>(Lxhss/ᛱᛸᛲᛴ;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v0, v2, v3, v4}, Lsun/misc/Unsafe;->putObjectVolatile(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :cond_6
    move-object v6, v4

    .line 94
    :goto_3
    sget-object v1, Lxhss/ᲇᛸᛵᛵ;->ᛷᛵᛵᲈ:Lsun/misc/Unsafe;

    .line 95
    .line 96
    sget-wide v3, Lxhss/ᛱᛸᛲᛴ;->ᛱᛱᛲᲇ:J

    .line 97
    .line 98
    move-object v2, p0

    .line 99
    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->compareAndSwapObject(Ljava/lang/Object;JLjava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p0

    .line 103
    if-eqz p0, :cond_7

    .line 104
    .line 105
    invoke-virtual {v0}, Lxhss/ᛱᛸᛲᛴ;->ᲇᛶᛴᲀ()Lxhss/ᛱᛸᛲᛴ;

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_7
    invoke-virtual {v1, v2, v3, v4}, Lsun/misc/Unsafe;->getObjectVolatile(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    if-eq p0, v5, :cond_8

    .line 114
    .line 115
    move-object p0, v2

    .line 116
    goto :goto_2

    .line 117
    :cond_8
    move-object p0, v2

    .line 118
    goto :goto_3

    .line 119
    :cond_9
    :goto_4
    return-void
.end method

.method public abstract ᛷᲁᲁ()Z
.end method

.method public abstract ᛸᛶᲈᛶ(Ljava/lang/Throwable;)V
.end method

.method public final ᲇᛴᲇᛵ()Lxhss/ᛴᲁᛶᛲ;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method
