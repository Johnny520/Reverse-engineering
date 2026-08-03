.class public LYue/ۥۢۢۦۡ;
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

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    :goto_0
    return p0
.end method

.method public static ۥ۟(II)I
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

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    :goto_0
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

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    :goto_0
    return p0
.end method

.method public static final varargs ۥ۟۟۟(I[I)I
    .locals 3
    .param p1    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۢۢۦۤ;->ۥ۟۟۟ۧ([I)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {p1, v1}, LYue/ۥۢۢۦۤ;->ۥ۟۟۟ۥ([II)I

    move-result v2

    invoke-static {p0, v2}, LYue/ۥۢۢۦۡ;->ۥ۟(II)I

    move-result p0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return p0
.end method

.method public static final varargs ۥ۟۟۟۟(J[J)J
    .locals 4
    .param p2    # [J
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    const-string v0, "other"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۢۢۧ۠;->ۥ۟۟۟ۧ([J)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {p2, v1}, LYue/ۥۢۢۧ۠;->ۥ۟۟۟ۥ([JI)J

    move-result-wide v2

    invoke-static {p0, p1, v2, v3}, LYue/ۥۢۢۦۡ;->ۥ۟۟۟ۤ(JJ)J

    move-result-wide p0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-wide p0
.end method

.method public static final ۥ۟۟۟۠(SSS)S
    .locals 0
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

    invoke-static {p1, p2}, LYue/ۥۢۢۦۡ;->ۥ(SS)S

    move-result p1

    invoke-static {p0, p1}, LYue/ۥۢۢۦۡ;->ۥ(SS)S

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۡ(III)I
    .locals 0
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

    invoke-static {p1, p2}, LYue/ۥۢۢۦۡ;->ۥ۟(II)I

    move-result p1

    invoke-static {p0, p1}, LYue/ۥۢۢۦۡ;->ۥ۟(II)I

    move-result p0

    return p0
.end method

.method public static final varargs ۥ۟۟۟ۢ(B[B)B
    .locals 3
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟ۧ([B)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {p1, v1}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟ۥ([BI)B

    move-result v2

    invoke-static {p0, v2}, LYue/ۥۢۢۦۡ;->ۥ۟۟(BB)B

    move-result p0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return p0
.end method

.method public static final ۥۣ۟۟۟(BBB)B
    .locals 0
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

    invoke-static {p1, p2}, LYue/ۥۢۢۦۡ;->ۥ۟۟(BB)B

    move-result p1

    invoke-static {p0, p1}, LYue/ۥۢۢۦۡ;->ۥ۟۟(BB)B

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۤ(JJ)J
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

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    move-wide p0, p2

    :goto_0
    return-wide p0
.end method

.method public static final ۥ۟۟۟ۥ(JJJ)J
    .locals 0
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

    invoke-static {p2, p3, p4, p5}, LYue/ۥۢۢۦۡ;->ۥ۟۟۟ۤ(JJ)J

    move-result-wide p2

    invoke-static {p0, p1, p2, p3}, LYue/ۥۢۢۦۡ;->ۥ۟۟۟ۤ(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final varargs ۥ۟۟۟ۦ(S[S)S
    .locals 3
    .param p1    # [S
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۢۢۨۥ;->ۥ۟۟۟ۧ([S)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {p1, v1}, LYue/ۥۢۢۨۥ;->ۥ۟۟۟ۥ([SI)S

    move-result v2

    invoke-static {p0, v2}, LYue/ۥۢۢۦۡ;->ۥ(SS)S

    move-result p0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟۟ۧ(SS)S
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

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    :goto_0
    return p0
.end method

.method public static ۥ۟۟۟ۨ(II)I
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

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۠(BB)B
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

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    move p0, p1

    :goto_0
    return p0
.end method

.method public static final varargs ۥ۟۟۠۟(I[I)I
    .locals 3
    .param p1    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۢۢۦۤ;->ۥ۟۟۟ۧ([I)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {p1, v1}, LYue/ۥۢۢۦۤ;->ۥ۟۟۟ۥ([II)I

    move-result v2

    invoke-static {p0, v2}, LYue/ۥۢۢۦۡ;->ۥ۟۟۟ۨ(II)I

    move-result p0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return p0
.end method

.method public static final varargs ۥ۟۟۠۠(J[J)J
    .locals 4
    .param p2    # [J
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    const-string v0, "other"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, LYue/ۥۢۢۧ۠;->ۥ۟۟۟ۧ([J)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {p2, v1}, LYue/ۥۢۢۧ۠;->ۥ۟۟۟ۥ([JI)J

    move-result-wide v2

    invoke-static {p0, p1, v2, v3}, LYue/ۥۢۢۦۡ;->ۥ۟۟۠ۥ(JJ)J

    move-result-wide p0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-wide p0
.end method

.method public static final ۥ۟۟۠ۡ(SSS)S
    .locals 0
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

    invoke-static {p1, p2}, LYue/ۥۢۢۦۡ;->ۥ۟۟۟ۧ(SS)S

    move-result p1

    invoke-static {p0, p1}, LYue/ۥۢۢۦۡ;->ۥ۟۟۟ۧ(SS)S

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۢ(III)I
    .locals 0
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

    invoke-static {p1, p2}, LYue/ۥۢۢۦۡ;->ۥ۟۟۟ۨ(II)I

    move-result p1

    invoke-static {p0, p1}, LYue/ۥۢۢۦۡ;->ۥ۟۟۟ۨ(II)I

    move-result p0

    return p0
.end method

.method public static final varargs ۥۣ۟۟۠(B[B)B
    .locals 3
    .param p1    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟ۧ([B)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {p1, v1}, LYue/ۥۢۢۥۦ;->ۥ۟۟۟ۥ([BI)B

    move-result v2

    invoke-static {p0, v2}, LYue/ۥۢۢۦۡ;->ۥ۟۟۠(BB)B

    move-result p0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟۠ۤ(BBB)B
    .locals 0
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

    invoke-static {p1, p2}, LYue/ۥۢۢۦۡ;->ۥ۟۟۠(BB)B

    move-result p1

    invoke-static {p0, p1}, LYue/ۥۢۢۦۡ;->ۥ۟۟۠(BB)B

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۠ۥ(JJ)J
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

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    move-wide p0, p2

    :goto_0
    return-wide p0
.end method

.method public static final ۥ۟۟۠ۦ(JJJ)J
    .locals 0
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

    invoke-static {p2, p3, p4, p5}, LYue/ۥۢۢۦۡ;->ۥ۟۟۠ۥ(JJ)J

    move-result-wide p2

    invoke-static {p0, p1, p2, p3}, LYue/ۥۢۢۦۡ;->ۥ۟۟۠ۥ(JJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final varargs ۥ۟۟۠ۧ(S[S)S
    .locals 3
    .param p1    # [S
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۡۥۣ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۢۢۨۥ;->ۥ۟۟۟ۧ([S)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {p1, v1}, LYue/ۥۢۢۨۥ;->ۥ۟۟۟ۥ([SI)S

    move-result v2

    invoke-static {p0, v2}, LYue/ۥۢۢۦۡ;->ۥ۟۟۟ۧ(SS)S

    move-result p0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return p0
.end method
