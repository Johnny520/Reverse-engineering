.class public LYue/ۥۢۢۨۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ۥ(SS)S
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const v0, 0xffff

    and-int v1, p0, v0

    and-int/2addr v0, p1

    invoke-static {v1, v0}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v0

    if-gez v0, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final ۥ۟(II)I
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v0

    if-gez v0, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟(BB)B
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    and-int/lit16 v0, p0, 0xff

    and-int/lit16 v1, p1, 0xff

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v0

    if-gez v0, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟۟(JJ)J
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-gez v0, :cond_0

    move-wide p0, p2

    :cond_0
    return-wide p0
.end method

.method public static final ۥ۟۟۟۟(SS)S
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const v0, 0xffff

    and-int v1, p0, v0

    and-int/2addr v0, p1

    invoke-static {v1, v0}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v0

    if-lez v0, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟۟۠(II)I
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v0

    if-lez v0, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟۟ۡ(BB)B
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    and-int/lit16 v0, p0, 0xff

    and-int/lit16 v1, p1, 0xff

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v0

    if-lez v0, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟۟ۢ(JJ)J
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-lez v0, :cond_0

    move-wide p0, p2

    :cond_0
    return-wide p0
.end method

.method public static final ۥۣ۟۟۟(JLYue/ۥ۟ۥ۟ۡ;)J
    .locals 2
    .param p2    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
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
            "(J",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "LYue/\u06e5\u06e2\u06e2\u06e7\u06df;",
            ">;)J"
        }
    .end annotation

    const-string v0, "range"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LYue/ۥ۟ۥ۟۠;

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟(J)LYue/ۥۢۢۧ۟;

    move-result-object p0

    check-cast p2, LYue/ۥ۟ۥ۟۠;

    invoke-static {p0, p2}, LYue/ۥۡۦ۟;->ۥ۟۟ۢ۠(Ljava/lang/Comparable;LYue/ۥ۟ۥ۟۠;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, LYue/ۥۢۢۧ۟;

    invoke-virtual {p0}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-interface {p2}, LYue/ۥ۟ۥ۟ۡ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, LYue/ۥۢۢۧ۟;

    invoke-virtual {v0}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-gez v0, :cond_1

    invoke-interface {p2}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, LYue/ۥۢۢۧ۟;

    invoke-virtual {p0}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide p0

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, LYue/ۥۢۢۧ۟;

    invoke-virtual {v0}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-lez v0, :cond_2

    invoke-interface {p2}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, LYue/ۥۢۢۧ۟;

    invoke-virtual {p0}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide p0

    :cond_2
    :goto_0
    return-wide p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot coerce value to an empty range: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۤ(SSS)S
    .locals 4
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const v0, 0xffff

    and-int v1, p1, v0

    and-int v2, p2, v0

    invoke-static {v1, v2}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v3

    if-gtz v3, :cond_2

    and-int/2addr v0, p0

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v1

    if-gez v1, :cond_0

    return p1

    :cond_0
    invoke-static {v0, v2}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result p1

    if-lez p1, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, LYue/ۥۢۢۨۤ;->ۥۣ۟۟ۧ(S)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LYue/ۥۢۢۨۤ;->ۥۣ۟۟ۧ(S)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۥ(III)I
    .locals 2
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    invoke-static {p1, p2}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {p0, p1}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v0

    if-gez v0, :cond_0

    return p1

    :cond_0
    invoke-static {p0, p2}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result p1

    if-lez p1, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, LYue/ۥۢۢۦۣ;->ۥ۟۟ۤ(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟ۤ(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۦ(BBB)B
    .locals 3
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    and-int/lit16 v0, p1, 0xff

    and-int/lit16 v1, p2, 0xff

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v2

    if-gtz v2, :cond_2

    and-int/lit16 v2, p0, 0xff

    invoke-static {v2, v0}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v0

    if-gez v0, :cond_0

    return p1

    :cond_0
    invoke-static {v2, v1}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result p1

    if-lez p1, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2}, LYue/ۥۢۢۥۥ;->ۥۣ۟۟ۧ(B)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, LYue/ۥۢۢۥۥ;->ۥۣ۟۟ۧ(B)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۧ(JJJ)J
    .locals 1
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    invoke-static {p2, p3, p4, p5}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-gtz v0, :cond_2

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-gez v0, :cond_0

    return-wide p2

    :cond_0
    invoke-static {p0, p1, p4, p5}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result p2

    if-lez p2, :cond_1

    return-wide p4

    :cond_1
    return-wide p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p4, p5}, LYue/ۥۢۢۧ۟;->ۥ۟۟ۤ(J)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p4, " is less than minimum "

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p2, p3}, LYue/ۥۢۢۧ۟;->ۥ۟۟ۤ(J)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۟ۨ(ILYue/ۥ۟ۥ۟ۡ;)I
    .locals 2
    .param p1    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
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
            "(I",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "LYue/\u06e5\u06e2\u06e2\u06e6\u06e3;",
            ">;)I"
        }
    .end annotation

    const-string v0, "range"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYue/ۥ۟ۥ۟۠;

    if-eqz v0, :cond_0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟(I)LYue/ۥۢۢۦۣ;

    move-result-object p0

    check-cast p1, LYue/ۥ۟ۥ۟۠;

    invoke-static {p0, p1}, LYue/ۥۡۦ۟;->ۥ۟۟ۢ۠(Ljava/lang/Comparable;LYue/ۥ۟ۥ۟۠;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, LYue/ۥۢۢۦۣ;

    invoke-virtual {p0}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result p0

    return p0

    :cond_0
    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, LYue/ۥۢۢۦۣ;

    invoke-virtual {v0}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result v0

    invoke-static {p0, v0}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v0

    if-gez v0, :cond_1

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, LYue/ۥۢۢۦۣ;

    invoke-virtual {p0}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result p0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, LYue/ۥۢۢۦۣ;

    invoke-virtual {v0}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result v0

    invoke-static {p0, v0}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v0

    if-lez v0, :cond_2

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, LYue/ۥۢۢۦۣ;

    invoke-virtual {p0}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result p0

    :cond_2
    :goto_0
    return p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot coerce value to an empty range: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟۠(LYue/ۥۢۢۧ;B)Z
    .locals 1
    .param p0    # LYue/ۥۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "$this$contains"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢۢۧ;->ۥ۟۟۟ۥ(I)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠۟(LYue/ۥۢۢۧۥ;LYue/ۥۢۢۧ۟;)Z
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "$this$contains"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۢۢۧ۟;->ۥۣ۟۟ۤ()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥۢۢۧۥ;->ۥ۟۟۟ۥ(J)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۠۠(LYue/ۥۢۢۧۥ;I)Z
    .locals 4
    .param p0    # LYue/ۥۢۢۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "$this$contains"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥۢۢۧۥ;->ۥ۟۟۟ۥ(J)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۡ(LYue/ۥۢۢۧۥ;B)Z
    .locals 4
    .param p0    # LYue/ۥۢۢۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "$this$contains"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    const-wide/16 v2, 0xff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥۢۢۧۥ;->ۥ۟۟۟ۥ(J)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۢ(LYue/ۥۢۢۧ;S)Z
    .locals 1
    .param p0    # LYue/ۥۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "$this$contains"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0xffff

    and-int/2addr p1, v0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢۢۧ;->ۥ۟۟۟ۥ(I)Z

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟۠(LYue/ۥۢۢۧ;LYue/ۥۢۢۦۣ;)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "$this$contains"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥۢۢۦۣ;->ۥۣ۟۟ۤ()I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢۢۧ;->ۥ۟۟۟ۥ(I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۠ۤ(LYue/ۥۢۢۧ;J)Z
    .locals 4
    .param p0    # LYue/ۥۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "$this$contains"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x20

    ushr-long v0, p1, v0

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    long-to-int p1, p1

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۢۢۧ;->ۥ۟۟۟ۥ(I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۠ۥ(LYue/ۥۢۢۧۥ;S)Z
    .locals 4
    .param p0    # LYue/ۥۢۢۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "$this$contains"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    const-wide/32 v2, 0xffff

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥۢۢۧۥ;->ۥ۟۟۟ۥ(J)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۦ(SS)LYue/ۥۢۢۦۧ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    sget-object v0, LYue/ۥۢۢۦۧ;->ۥ۟۟۠ۦ:LYue/ۥۢۢۦۧ$ۥ;

    const v1, 0xffff

    and-int/2addr p0, v1

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/2addr p1, v1

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥۢۢۦۧ$ۥ;->ۥ(III)LYue/ۥۢۢۦۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۧ(II)LYue/ۥۢۢۦۧ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    sget-object v0, LYue/ۥۢۢۦۧ;->ۥ۟۟۠ۦ:LYue/ۥۢۢۦۧ$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥۢۢۦۧ$ۥ;->ۥ(III)LYue/ۥۢۢۦۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۨ(BB)LYue/ۥۢۢۦۧ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    sget-object v0, LYue/ۥۢۢۦۧ;->ۥ۟۟۠ۦ:LYue/ۥۢۢۦۧ$ۥ;

    and-int/lit16 p0, p0, 0xff

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    and-int/lit16 p1, p1, 0xff

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥۢۢۦۧ$ۥ;->ۥ(III)LYue/ۥۢۢۦۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡ(JJ)LYue/ۥۣۢۢۧ;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    sget-object v0, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۦ:LYue/ۥۣۢۢۧ$ۥ;

    const-wide/16 v5, -0x1

    move-wide v1, p0

    move-wide v3, p2

    invoke-virtual/range {v0 .. v6}, LYue/ۥۣۢۢۧ$ۥ;->ۥ(JJJ)LYue/ۥۣۢۢۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡ۟(LYue/ۥۢۢۦۧ;)I
    .locals 3
    .param p0    # LYue/ۥۢۢۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result p0

    return p0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Progression "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is empty."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۥ۟۟ۡ۠(LYue/ۥۣۢۢۧ;)J
    .locals 3
    .param p0    # LYue/ۥۣۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->ۥ۟۟۟۠()J

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Progression "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is empty."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۥ۟۟ۡۡ(LYue/ۥۢۢۦۧ;)LYue/ۥۢۢۦۣ;
    .locals 1
    .param p0    # LYue/ۥۢۢۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result p0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟(I)LYue/ۥۢۢۦۣ;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟ۡۢ(LYue/ۥۣۢۢۧ;)LYue/ۥۢۢۧ۟;
    .locals 2
    .param p0    # LYue/ۥۣۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->ۥ۟۟۟۠()J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟(J)LYue/ۥۢۢۧ۟;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥۣ۟۟ۡ(LYue/ۥۢۢۦۧ;)I
    .locals 3
    .param p0    # LYue/ۥۢۢۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result p0

    return p0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Progression "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is empty."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۥ۟۟ۡۤ(LYue/ۥۣۢۢۧ;)J
    .locals 3
    .param p0    # LYue/ۥۣۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->ۥ۟۟۟ۢ()J

    move-result-wide v0

    return-wide v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Progression "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, " is empty."

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final ۥ۟۟ۡۥ(LYue/ۥۢۢۦۧ;)LYue/ۥۢۢۦۣ;
    .locals 1
    .param p0    # LYue/ۥۢۢۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result p0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟(I)LYue/ۥۢۢۦۣ;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟ۡۦ(LYue/ۥۣۢۢۧ;)LYue/ۥۢۢۧ۟;
    .locals 2
    .param p0    # LYue/ۥۣۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->ۥ۟۟۟ۢ()J

    move-result-wide v0

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟(J)LYue/ۥۢۢۧ۟;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟ۡۧ(LYue/ۥۢۢۧ;)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۢۢۨۡ;->ۥ۟۟ۡۨ(LYue/ۥۢۢۧ;LYue/ۥۡۥۨۤ;)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۨ(LYue/ۥۢۢۧ;LYue/ۥۡۥۨۤ;)I
    .locals 1
    .param p0    # LYue/ۥۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۥۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1, p0}, LYue/ۥۢۢۨ۟;->ۥ۟۟۟ۢ(LYue/ۥۡۥۨۤ;LYue/ۥۢۢۧ;)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final ۥ۟۟ۢ(LYue/ۥۢۢۧۥ;)J
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۢۢۨۡ;->ۥ۟۟ۢ۟(LYue/ۥۢۢۧۥ;LYue/ۥۡۥۨۤ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final ۥ۟۟ۢ۟(LYue/ۥۢۢۧۥ;LYue/ۥۡۥۨۤ;)J
    .locals 1
    .param p0    # LYue/ۥۢۢۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۥۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1, p0}, LYue/ۥۢۢۨ۟;->ۥ۟۟۟ۦ(LYue/ۥۡۥۨۤ;LYue/ۥۢۢۧۥ;)J

    move-result-wide p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final ۥ۟۟ۢ۠(LYue/ۥۢۢۧ;)LYue/ۥۢۢۦۣ;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;,
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۢۢۨۡ;->ۥ۟۟ۢۡ(LYue/ۥۢۢۧ;LYue/ۥۡۥۨۤ;)LYue/ۥۢۢۦۣ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۡ(LYue/ۥۢۢۧ;LYue/ۥۡۥۨۤ;)LYue/ۥۢۢۦۣ;
    .locals 1
    .param p0    # LYue/ۥۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۥۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;,
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢۢۧ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p1, p0}, LYue/ۥۢۢۨ۟;->ۥ۟۟۟ۢ(LYue/ۥۡۥۨۤ;LYue/ۥۢۢۧ;)I

    move-result p0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟(I)LYue/ۥۢۢۦۣ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۢ(LYue/ۥۢۢۧۥ;)LYue/ۥۢۢۧ۟;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;,
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۢۢۨۡ;->ۥۣ۟۟ۢ(LYue/ۥۢۢۧۥ;LYue/ۥۡۥۨۤ;)LYue/ۥۢۢۧ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟ۢ(LYue/ۥۢۢۧۥ;LYue/ۥۡۥۨۤ;)LYue/ۥۢۢۧ۟;
    .locals 1
    .param p0    # LYue/ۥۢۢۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۥۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;,
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۢۢۧۥ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p1, p0}, LYue/ۥۢۢۨ۟;->ۥ۟۟۟ۦ(LYue/ۥۡۥۨۤ;LYue/ۥۢۢۧۥ;)J

    move-result-wide p0

    invoke-static {p0, p1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟(J)LYue/ۥۢۢۧ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۤ(LYue/ۥۢۢۦۧ;)LYue/ۥۢۢۦۧ;
    .locals 3
    .param p0    # LYue/ۥۢۢۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۢۢۦۧ;->ۥ۟۟۠ۦ:LYue/ۥۢۢۦۧ$ۥ;

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result v1

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result v2

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥۣ۟۟۟()I

    move-result p0

    neg-int p0, p0

    invoke-virtual {v0, v1, v2, p0}, LYue/ۥۢۢۦۧ$ۥ;->ۥ(III)LYue/ۥۢۢۦۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۥ(LYue/ۥۣۢۢۧ;)LYue/ۥۣۢۢۧ;
    .locals 8
    .param p0    # LYue/ۥۣۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۦ:LYue/ۥۣۢۢۧ$ۥ;

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->ۥ۟۟۟ۢ()J

    move-result-wide v2

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->ۥ۟۟۟۠()J

    move-result-wide v4

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۟()J

    move-result-wide v6

    neg-long v6, v6

    invoke-virtual/range {v1 .. v7}, LYue/ۥۣۢۢۧ$ۥ;->ۥ(JJJ)LYue/ۥۣۢۢۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۦ(LYue/ۥۢۢۦۧ;I)LYue/ۥۢۢۦۧ;
    .locals 3
    .param p0    # LYue/ۥۢۢۦۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥۡۦ;->ۥ(ZLjava/lang/Number;)V

    sget-object v0, LYue/ۥۢۢۦۧ;->ۥ۟۟۠ۦ:LYue/ۥۢۢۦۧ$ۥ;

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟۠()I

    move-result v1

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥ۟۟۟ۢ()I

    move-result v2

    invoke-virtual {p0}, LYue/ۥۢۢۦۧ;->ۥۣ۟۟۟()I

    move-result p0

    if-lez p0, :cond_1

    goto :goto_1

    :cond_1
    neg-int p1, p1

    :goto_1
    invoke-virtual {v0, v1, v2, p1}, LYue/ۥۢۢۦۧ$ۥ;->ۥ(III)LYue/ۥۢۢۦۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۧ(LYue/ۥۣۢۢۧ;J)LYue/ۥۣۢۢۧ;
    .locals 11
    .param p0    # LYue/ۥۣۢۢۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v2, v3}, LYue/ۥۡۦ;->ۥ(ZLjava/lang/Number;)V

    sget-object v4, LYue/ۥۣۢۢۧ;->ۥ۟۟۠ۦ:LYue/ۥۣۢۢۧ$ۥ;

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->ۥ۟۟۟۠()J

    move-result-wide v5

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->ۥ۟۟۟ۢ()J

    move-result-wide v7

    invoke-virtual {p0}, LYue/ۥۣۢۢۧ;->ۥۣ۟۟۟()J

    move-result-wide v2

    cmp-long p0, v2, v0

    if-lez p0, :cond_1

    :goto_1
    move-wide v9, p1

    goto :goto_2

    :cond_1
    neg-long p1, p1

    goto :goto_1

    :goto_2
    invoke-virtual/range {v4 .. v10}, LYue/ۥۣۢۢۧ$ۥ;->ۥ(JJJ)LYue/ۥۣۢۢۧ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢۨ(SS)LYue/ۥۢۢۧ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const v0, 0xffff

    and-int/2addr p1, v0

    const/4 v1, 0x0

    invoke-static {p1, v1}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v1

    if-gtz v1, :cond_0

    sget-object p0, LYue/ۥۢۢۧ;->ۥ۟۟۠ۧ:LYue/ۥۢۢۧ$ۥ;

    invoke-virtual {p0}, LYue/ۥۢۢۧ$ۥ;->ۥ()LYue/ۥۢۢۧ;

    move-result-object p0

    return-object p0

    :cond_0
    and-int/2addr p0, v0

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    new-instance v0, LYue/ۥۢۢۧ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥۢۢۧ;-><init>(IILYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public static ۥۣ۟۟(II)LYue/ۥۢۢۧ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const/4 v0, 0x0

    invoke-static {p1, v0}, Ljava/lang/Integer;->compareUnsigned(II)I

    move-result v0

    if-gtz v0, :cond_0

    sget-object p0, LYue/ۥۢۢۧ;->ۥ۟۟۠ۧ:LYue/ۥۢۢۧ$ۥ;

    invoke-virtual {p0}, LYue/ۥۢۢۧ$ۥ;->ۥ()LYue/ۥۢۢۧ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۢۢۧ;

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥۢۢۧ;-><init>(IILYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public static final ۥۣ۟۟۟(BB)LYue/ۥۢۢۧ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    and-int/lit16 p1, p1, 0xff

    const/4 v0, 0x0

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v0

    if-gtz v0, :cond_0

    sget-object p0, LYue/ۥۢۢۧ;->ۥ۟۟۠ۧ:LYue/ۥۢۢۧ$ۥ;

    invoke-virtual {p0}, LYue/ۥۢۢۧ$ۥ;->ۥ()LYue/ۥۢۢۧ;

    move-result-object p0

    return-object p0

    :cond_0
    and-int/lit16 p0, p0, 0xff

    invoke-static {p0}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p0

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    add-int/lit8 p1, p1, -0x1

    invoke-static {p1}, LYue/ۥۢۢۦۣ;->ۥ۟۟۟ۥ(I)I

    move-result p1

    new-instance v0, LYue/ۥۢۢۧ;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, LYue/ۥۢۢۧ;-><init>(IILYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public static ۥۣ۟۟۠(JJ)LYue/ۥۢۢۧۥ;
    .locals 6
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.5"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥۣ;
        }
    .end annotation

    const-wide/16 v0, 0x0

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v0

    if-gtz v0, :cond_0

    sget-object p0, LYue/ۥۢۢۧۥ;->ۥ۟۟۠ۧ:LYue/ۥۢۢۧۥ$ۥ;

    invoke-virtual {p0}, LYue/ۥۢۢۧۥ$ۥ;->ۥ()LYue/ۥۢۢۧۥ;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v0, 0x1

    int-to-long v0, v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    invoke-static {v0, v1}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v0

    sub-long/2addr p2, v0

    invoke-static {p2, p3}, LYue/ۥۢۢۧ۟;->ۥ۟۟۟ۥ(J)J

    move-result-wide v3

    new-instance p2, LYue/ۥۢۢۧۥ;

    const/4 v5, 0x0

    move-object v0, p2

    move-wide v1, p0

    invoke-direct/range {v0 .. v5}, LYue/ۥۢۢۧۥ;-><init>(JJLYue/ۥ۟ۨۥۢ;)V

    return-object p2
.end method
