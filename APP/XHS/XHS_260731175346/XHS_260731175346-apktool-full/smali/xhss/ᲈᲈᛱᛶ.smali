.class public abstract Lxhss/ᲈᲈᛱᛶ;
.super Lxhss/ᛸᛴᛳᛷ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᲀᛸᛳᲈ;


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lxhss/ᛷᛲᛳᛴ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛴᛶᛴ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lxhss/ᛳᛳᲀᲀ;->ᛷᛵᛵᲈ:Lxhss/ᛷᛸᲈᛳ;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lxhss/ᛷᛸᲈᛳ;->ᛷᛵᛵᲈ(Lxhss/ᲀᛸᛳᲈ;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-super {p0}, Lxhss/ᛷᛲᛳᛴ;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final ᛱᛱᛲᲇ()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method
