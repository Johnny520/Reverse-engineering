.class public LYue/ۥۢۢۦ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ۥ(Ljava/lang/Iterable;)I
    .locals 2
    .param p0    # Ljava/lang/Iterable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "sumOfUByte"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "LYue/\u06e5\u06e2\u06e2\u06e5\u06e5;",
            ">;)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢۥۥ;

    invoke-virtual {v1}, LYue/ۥۢۢۥۥ;->ۥ۟۟ۤۡ()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    invoke-static {v1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result v0

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static final ۥ۟(Ljava/lang/Iterable;)I
    .locals 2
    .param p0    # Ljava/lang/Iterable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "sumOfUInt"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "LYue/\u06e5\u06e2\u06e2\u06e6\u06e3;",
            ">;)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢۦۣ;

    invoke-virtual {v1}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result v0

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static final ۥ۟۟(Ljava/lang/Iterable;)J
    .locals 4
    .param p0    # Ljava/lang/Iterable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "sumOfULong"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "LYue/\u06e5\u06e2\u06e2\u06e7\u06df;",
            ">;)J"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢۧ۟;

    invoke-virtual {v2}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v2

    add-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    goto :goto_0

    :cond_0
    return-wide v0
.end method

.method public static final ۥ۟۟۟(Ljava/lang/Iterable;)I
    .locals 3
    .param p0    # Ljava/lang/Iterable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "sumOfUShort"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "LYue/\u06e5\u06e2\u06e2\u06e8\u06e4;",
            ">;)I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۢۢۨۤ;

    invoke-virtual {v1}, LYue/ۥۢۢۨۤ;->ۥ۟۟ۤۡ()S

    move-result v1

    const v2, 0xffff

    and-int/2addr v1, v2

    invoke-static {v1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result v1

    add-int/2addr v0, v1

    invoke-static {v0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result v0

    goto :goto_0

    :cond_0
    return v0
.end method

.method public static ۥ۟۟۟۟(Ljava/util/Collection;)[B
    .locals 4
    .param p0    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e2\u06e2\u06e5\u06e5;",
            ">;)[B"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v0}, LYue/ۥۢۢۥۦ;->ۥ۟۟(I)[B

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢۥۥ;

    invoke-virtual {v2}, LYue/ۥۢۢۥۥ;->ۥ۟۟ۤۡ()B

    move-result v2

    add-int/lit8 v3, v1, 0x1

    invoke-static {v0, v1, v2}, LYue/ۥۢۢۥۦ;->ۥ۟۟۠ۡ([BIB)V

    move v1, v3

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final ۥ۟۟۟۠(Ljava/util/Collection;)[I
    .locals 4
    .param p0    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e2\u06e2\u06e6\u06e3;",
            ">;)[I"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v0}, LYue/ۥۢۢۦۤ;->ۥ۟۟(I)[I

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢۦۣ;

    invoke-virtual {v2}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result v2

    add-int/lit8 v3, v1, 0x1

    invoke-static {v0, v1, v2}, LYue/ۥۢۢۦۤ;->ۥ۟۟۠ۡ([III)V

    move v1, v3

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final ۥ۟۟۟ۡ(Ljava/util/Collection;)[J
    .locals 5
    .param p0    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e2\u06e2\u06e7\u06df;",
            ">;)[J"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v0}, LYue/ۥۢۢۧ۠;->ۥ۟۟(I)[J

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢۧ۟;

    invoke-virtual {v2}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v2

    add-int/lit8 v4, v1, 0x1

    invoke-static {v0, v1, v2, v3}, LYue/ۥۢۢۧ۠;->ۥ۟۟۠ۡ([JIJ)V

    move v1, v4

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final ۥ۟۟۟ۢ(Ljava/util/Collection;)[S
    .locals 4
    .param p0    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "LYue/\u06e5\u06e2\u06e2\u06e8\u06e4;",
            ">;)[S"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    invoke-static {v0}, LYue/ۥۢۢۨۥ;->ۥ۟۟(I)[S

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥۢۢۨۤ;

    invoke-virtual {v2}, LYue/ۥۢۢۨۤ;->ۥ۟۟ۤۡ()S

    move-result v2

    add-int/lit8 v3, v1, 0x1

    invoke-static {v0, v1, v2}, LYue/ۥۢۢۨۥ;->ۥ۟۟۠ۡ([SIS)V

    move v1, v3

    goto :goto_0

    :cond_0
    return-object v0
.end method
