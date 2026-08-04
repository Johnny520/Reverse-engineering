.class public abstract Lyyds/ᛱᛷᛸᛲ;
.super Lyyds/ᛲᛴᛷᛳ;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛴᛷᛴᛶ;


# direct methods
.method public constructor <init>(Lyyds/ᛲᛱᛶᛸ;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lyyds/ᛲᛴᛷᛳ;-><init>(Lyyds/ᛲᛱᛶᛸ;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    invoke-interface {p1}, Lyyds/ᛲᛱᛶᛸ;->ᛲᛴᛳᛲ()Lyyds/ᲁᛴᛲ;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object p1, Lyyds/ᲈᛱᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛲ;

    .line 11
    .line 12
    if-ne p0, p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    .line 16
    .line 17
    invoke-static {p0}, Lyyds/ᛱᛸᛶᛲ;->ᛶᛷᛲᲁ(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0

    .line 22
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lyyds/ᛲᛴᛷᛳ;->ᲀᛲᛳᲀ:Lyyds/ᛲᛱᛶᛸ;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lyyds/ᛸᛱᛳᲈ;->ᛲᲈᲁ:Lyyds/ᛷᛱᛴᲈ;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {p0}, Lyyds/ᛷᛱᛴᲈ;->ᛲᲈᲁ(Lyyds/ᛴᛷᛴᛶ;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :cond_0
    invoke-super {p0}, Lyyds/ᛲᛴᛷᛳ;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final ᛲᛴᛳᛲ()Lyyds/ᲁᛴᛲ;
    .locals 0

    .line 1
    sget-object p0, Lyyds/ᲈᛱᛸᛲ;->ᲀᛲᛳᲀ:Lyyds/ᲈᛱᛸᛲ;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ᲀᛲᛳᲀ()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method
