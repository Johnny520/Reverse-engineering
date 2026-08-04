.class public abstract Lyyds/ᛴᲇᛴᛲ;
.super Lyyds/ᛸᛴᛵᛶ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛶᛱᛴ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    sget-object v0, Lyyds/ᛱᛵᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲁ;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lyyds/ᛸᛴᛵᛶ;-><init>(Lyyds/ᲁᛸᛲᲁ;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
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
    invoke-static {p0}, Lyyds/ᲇᛲᲁᛱ;->ᛷᲈᲈᲁ(Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public ᛲᛱᲁᛳ(I)Lyyds/ᛴᲇᛴᛲ;
    .locals 1

    .line 1
    invoke-static {p1}, Lyyds/ᛲᛳᲁ;->ᛲᛴᛳᛲ(I)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lyyds/ᛵᛷᛱᲀ;

    .line 5
    .line 6
    invoke-direct {v0, p0, p1}, Lyyds/ᛵᛷᛱᲀ;-><init>(Lyyds/ᛴᲇᛴᛲ;I)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final ᛳᲁᲁᲇ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛴᛲ;
    .locals 1

    .line 1
    instance-of v0, p1, Lyyds/ᲁᛶᛴᛸ;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    check-cast p1, Lyyds/ᲁᛶᛴᛸ;

    .line 6
    .line 7
    iget-object v0, p0, Lyyds/ᛸᛴᛵᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛸᛲᲁ;

    .line 8
    .line 9
    if-eq v0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    throw p0

    .line 14
    :cond_1
    sget-object v0, Lyyds/ᛱᛵᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲁ;

    .line 15
    .line 16
    if-ne v0, p1, :cond_2

    .line 17
    .line 18
    sget-object p0, Lyyds/ᲈᛱᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛲ;

    .line 19
    .line 20
    :cond_2
    return-object p0
.end method

.method public final ᛷᛸᲇᛶ(Lyyds/ᲁᛸᛲᲁ;)Lyyds/ᲁᛶᛱᛴ;
    .locals 2

    .line 1
    instance-of v0, p1, Lyyds/ᲁᛶᛴᛸ;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    check-cast p1, Lyyds/ᲁᛶᛴᛸ;

    .line 7
    .line 8
    iget-object p0, p0, Lyyds/ᛸᛴᛵᛶ;->ᲀᛲᛳᲀ:Lyyds/ᲁᛸᛲᲁ;

    .line 9
    .line 10
    if-eq p0, p1, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    throw v1

    .line 14
    :cond_1
    sget-object v0, Lyyds/ᛱᛵᲈᲁ;->ᛲᛴᛳᛲ:Lyyds/ᛱᛵᲈᲁ;

    .line 15
    .line 16
    if-ne v0, p1, :cond_2

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_2
    return-object v1
.end method

.method public abstract ᛷᲇᛲᛱ(Lyyds/ᲁᛴᛲ;Ljava/lang/Runnable;)V
.end method

.method public ᲈᛷᲈᛶ(Lyyds/ᲁᛴᛲ;)Z
    .locals 0

    .line 1
    instance-of p0, p0, Lyyds/ᛸᛳᛸᛱ;

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method
