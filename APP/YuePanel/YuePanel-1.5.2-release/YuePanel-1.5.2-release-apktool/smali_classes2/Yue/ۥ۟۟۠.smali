.class public final LYue/ۥ۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۦۡ۠;
    name = "-SegmentedByteString"
.end annotation

.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"
.end annotation


# direct methods
.method public static final ۥ([IIII)I
    .locals 2
    .param p0    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    add-int/lit8 p3, p3, -0x1

    :goto_0
    if-gt p2, p3, :cond_2

    add-int v0, p2, p3

    ushr-int/lit8 v0, v0, 0x1

    aget v1, p0, v0

    if-ge v1, p1, :cond_0

    add-int/lit8 p2, v0, 0x1

    goto :goto_0

    :cond_0
    if-le v1, p1, :cond_1

    add-int/lit8 p3, v0, -0x1

    goto :goto_0

    :cond_1
    return v0

    :cond_2
    neg-int p0, p2

    add-int/lit8 p0, p0, -0x1

    return p0
.end method

.method public static final ۥ۟(LYue/ۥۡۧۨۢ;I[BII)V
    .locals 11
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "target"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v0

    int-to-long v1, v0

    int-to-long v3, p1

    int-to-long v9, p4

    move-wide v5, v9

    invoke-static/range {v1 .. v6}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟۟(JJJ)V

    array-length v0, p2

    int-to-long v5, v0

    int-to-long v7, p3

    invoke-static/range {v5 .. v10}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟۟(JJJ)V

    add-int/2addr p4, p1

    invoke-static {p0, p1}, LYue/ۥ۟۟۠;->ۥ۟۟۟ۨ(LYue/ۥۡۧۨۢ;I)I

    move-result v0

    :goto_0
    if-ge p1, p4, :cond_1

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v1

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    :goto_1
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v2

    aget v2, v2, v0

    sub-int/2addr v2, v1

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v3

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v4

    array-length v4, v4

    add-int/2addr v4, v0

    aget v3, v3, v4

    add-int/2addr v2, v1

    invoke-static {p4, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int/2addr v2, p1

    sub-int v1, p1, v1

    add-int/2addr v3, v1

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v1

    aget-object v1, v1, v0

    add-int v4, v3, v2

    invoke-static {v1, p2, p3, v3, v4}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟ۥۢ([B[BIII)[B

    add-int/2addr p3, v2

    add-int/2addr p1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final ۥ۟۟(LYue/ۥۡۧۨۢ;Ljava/lang/Object;)Z
    .locals 4
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v1, p1, LYue/ۥۣ۟ۥۤ;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast p1, LYue/ۥۣ۟ۥۤ;

    invoke-virtual {p1}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v1

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v3

    if-ne v1, v3, :cond_1

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v1

    invoke-virtual {p0, v2, p1, v2, v1}, LYue/ۥۡۧۨۢ;->ۥۣ۟۟ۡ(ILYue/ۥۣ۟ۥۤ;II)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    move v0, v2

    :goto_0
    return v0
.end method

.method public static final ۥ۟۟۟(LYue/ۥۡۧۨۢ;)I
    .locals 1
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object p0

    array-length p0, p0

    add-int/lit8 p0, p0, -0x1

    aget p0, v0, p0

    return p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۡۧۨۢ;)I
    .locals 8
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟۠ۥ()I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    move v3, v2

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v4

    add-int v5, v0, v1

    aget v4, v4, v5

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v5

    aget v5, v5, v1

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v6

    aget-object v6, v6, v1

    sub-int v2, v5, v2

    add-int/2addr v2, v4

    :goto_1
    if-ge v4, v2, :cond_1

    mul-int/lit8 v3, v3, 0x1f

    aget-byte v7, v6, v4

    add-int/2addr v3, v7

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    move v2, v5

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v3}, LYue/ۥۣ۟ۥۤ;->ۥۣ۟۟ۦ(I)V

    return v3
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥۡۧۨۢ;I)B
    .locals 7
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v1

    array-length v1, v1

    add-int/lit8 v1, v1, -0x1

    aget v0, v0, v1

    int-to-long v1, v0

    int-to-long v3, p1

    const-wide/16 v5, 0x1

    invoke-static/range {v1 .. v6}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟۟(JJJ)V

    invoke-static {p0, p1}, LYue/ۥ۟۟۠;->ۥ۟۟۟ۨ(LYue/ۥۡۧۨۢ;I)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v1

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    :goto_0
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v2

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v3

    array-length v3, v3

    add-int/2addr v3, v0

    aget v2, v2, v3

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object p0

    aget-object p0, p0, v0

    sub-int/2addr p1, v1

    add-int/2addr p1, v2

    aget-byte p0, p0, p1

    return p0
.end method

.method public static final ۥ۟۟۟ۡ(LYue/ۥۡۧۨۢ;ILYue/ۥۣ۟ۥۤ;II)Z
    .locals 6
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۟ۥۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ltz p1, :cond_4

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v1

    sub-int/2addr v1, p4

    if-le p1, v1, :cond_0

    goto :goto_2

    :cond_0
    add-int/2addr p4, p1

    invoke-static {p0, p1}, LYue/ۥ۟۟۠;->ۥ۟۟۟ۨ(LYue/ۥۡۧۨۢ;I)I

    move-result v1

    :goto_0
    if-ge p1, p4, :cond_3

    if-nez v1, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v2

    add-int/lit8 v3, v1, -0x1

    aget v2, v2, v3

    :goto_1
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v3

    aget v3, v3, v1

    sub-int/2addr v3, v2

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v4

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v5

    array-length v5, v5

    add-int/2addr v5, v1

    aget v4, v4, v5

    add-int/2addr v3, v2

    invoke-static {p4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, p1

    sub-int v2, p1, v2

    add-int/2addr v4, v2

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v2

    aget-object v2, v2, v1

    invoke-virtual {p2, p3, v2, v4, v3}, LYue/ۥۣ۟ۥۤ;->ۥۣ۟۟ۢ(I[BII)Z

    move-result v2

    if-nez v2, :cond_2

    return v0

    :cond_2
    add-int/2addr p3, v3

    add-int/2addr p1, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_2
    return v0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۡۧۨۢ;I[BII)Z
    .locals 6
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [B
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "other"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ltz p1, :cond_4

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v1

    sub-int/2addr v1, p4

    if-gt p1, v1, :cond_4

    if-ltz p3, :cond_4

    array-length v1, p2

    sub-int/2addr v1, p4

    if-le p3, v1, :cond_0

    goto :goto_2

    :cond_0
    add-int/2addr p4, p1

    invoke-static {p0, p1}, LYue/ۥ۟۟۠;->ۥ۟۟۟ۨ(LYue/ۥۡۧۨۢ;I)I

    move-result v1

    :goto_0
    if-ge p1, p4, :cond_3

    if-nez v1, :cond_1

    move v2, v0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v2

    add-int/lit8 v3, v1, -0x1

    aget v2, v2, v3

    :goto_1
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v3

    aget v3, v3, v1

    sub-int/2addr v3, v2

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v4

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v5

    array-length v5, v5

    add-int/2addr v5, v1

    aget v4, v4, v5

    add-int/2addr v3, v2

    invoke-static {p4, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, p1

    sub-int v2, p1, v2

    add-int/2addr v4, v2

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v2

    aget-object v2, v2, v1

    invoke-static {v2, v4, p2, p3, v3}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟([BI[BII)Z

    move-result v2

    if-nez v2, :cond_2

    return v0

    :cond_2
    add-int/2addr p3, v3

    add-int/2addr p1, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p0, 0x1

    return p0

    :cond_4
    :goto_2
    return v0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۡۧۨۢ;II)LYue/ۥۣ۟ۥۤ;
    .locals 10
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2}, LYue/ۥ۟۟۠۟;->ۥ۟۟۟ۦ(LYue/ۥۣ۟ۥۤ;I)I

    move-result p2

    if-ltz p1, :cond_6

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v0

    const-string v1, "endIndex="

    if-gt p2, v0, :cond_5

    sub-int v0, p2, p1

    if-ltz v0, :cond_4

    if-nez p1, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v1

    if-ne p2, v1, :cond_0

    return-object p0

    :cond_0
    if-ne p1, p2, :cond_1

    sget-object p0, LYue/ۥۣ۟ۥۤ;->ۥ۟۟۠ۨ:LYue/ۥۣ۟ۥۤ;

    return-object p0

    :cond_1
    invoke-static {p0, p1}, LYue/ۥ۟۟۠;->ۥ۟۟۟ۨ(LYue/ۥۡۧۨۢ;I)I

    move-result v1

    add-int/lit8 p2, p2, -0x1

    invoke-static {p0, p2}, LYue/ۥ۟۟۠;->ۥ۟۟۟ۨ(LYue/ۥۡۧۨۢ;I)I

    move-result p2

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v2

    add-int/lit8 v3, p2, 0x1

    invoke-static {v2, v1, v3}, LYue/ۥ۟ۢ۟۟;->ۥ۟۠۟۟([Ljava/lang/Object;II)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[B

    array-length v3, v2

    mul-int/lit8 v3, v3, 0x2

    new-array v3, v3, [I

    const/4 v4, 0x0

    if-gt v1, p2, :cond_2

    move v6, v1

    move v5, v4

    :goto_0
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v7

    aget v7, v7, v6

    sub-int/2addr v7, p1

    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    move-result v7

    aput v7, v3, v5

    add-int/lit8 v7, v5, 0x1

    array-length v8, v2

    add-int/2addr v5, v8

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v8

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v9

    array-length v9, v9

    add-int/2addr v9, v6

    aget v8, v8, v9

    aput v8, v3, v5

    if-eq v6, p2, :cond_2

    add-int/lit8 v6, v6, 0x1

    move v5, v7

    goto :goto_0

    :cond_2
    if-nez v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object p0

    add-int/lit8 v1, v1, -0x1

    aget v4, p0, v1

    :goto_1
    array-length p0, v2

    aget p2, v3, p0

    sub-int/2addr p1, v4

    add-int/2addr p2, p1

    aput p2, v3, p0

    new-instance p0, LYue/ۥۡۧۨۢ;

    invoke-direct {p0, v2, v3}, LYue/ۥۡۧۨۢ;-><init>([[B[I)V

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " < beginIndex="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " > length("

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "beginIndex="

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " < 0"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final ۥ۟۟۟ۤ(LYue/ۥۡۧۨۢ;)[B
    .locals 9
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۤ;->ۥ۟۟ۤ۠()I

    move-result v0

    new-array v0, v0, [B

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v1

    array-length v1, v1

    const/4 v2, 0x0

    move v3, v2

    move v4, v3

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v5

    add-int v6, v1, v2

    aget v5, v5, v6

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v6

    aget v6, v6, v2

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v7

    aget-object v7, v7, v2

    sub-int v3, v6, v3

    add-int v8, v5, v3

    invoke-static {v7, v0, v4, v5, v8}, LYue/ۥ۟ۢ۟۟;->ۥ۟۟ۥۢ([B[BIII)[B

    add-int/2addr v4, v3

    add-int/lit8 v2, v2, 0x1

    move v3, v6

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final ۥ۟۟۟ۥ(LYue/ۥۡۧۨۢ;LYue/ۥۣ۟ۢۨ;II)V
    .locals 11
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۟ۢۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    add-int v0, p2, p3

    invoke-static {p0, p2}, LYue/ۥ۟۟۠;->ۥ۟۟۟ۨ(LYue/ۥۡۧۨۢ;I)I

    move-result v1

    :goto_0
    if-ge p2, v0, :cond_2

    if-nez v1, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v2

    add-int/lit8 v3, v1, -0x1

    aget v2, v2, v3

    :goto_1
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v3

    aget v3, v3, v1

    sub-int/2addr v3, v2

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v4

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v5

    array-length v5, v5

    add-int/2addr v5, v1

    aget v4, v4, v5

    add-int/2addr v3, v2

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, p2

    sub-int v2, p2, v2

    add-int v7, v4, v2

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v2

    aget-object v6, v2, v1

    new-instance v2, LYue/ۥۡۧۨ;

    add-int v8, v7, v3

    const/4 v9, 0x1

    const/4 v10, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, LYue/ۥۡۧۨ;-><init>([BIIZZ)V

    iget-object v4, p1, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    if-nez v4, :cond_1

    iput-object v2, v2, LYue/ۥۡۧۨ;->ۥ۟۟۟ۡ:LYue/ۥۡۧۨ;

    iput-object v2, v2, LYue/ۥۡۧۨ;->ۥ۟۟۟۠:LYue/ۥۡۧۨ;

    iput-object v2, p1, LYue/ۥۣ۟ۢۨ;->ۥۣ۟۟۠:LYue/ۥۡۧۨ;

    goto :goto_2

    :cond_1
    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget-object v4, v4, LYue/ۥۡۧۨ;->ۥ۟۟۟ۡ:LYue/ۥۡۧۨ;

    invoke-static {v4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, LYue/ۥۡۧۨ;->ۥ۟۟(LYue/ۥۡۧۨ;)LYue/ۥۡۧۨ;

    :goto_2
    add-int/2addr p2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۨ()J

    move-result-wide v0

    int-to-long p2, p3

    add-long/2addr v0, p2

    invoke-virtual {p1, v0, v1}, LYue/ۥۣ۟ۢۨ;->ۥ۟۟ۧۥ(J)V

    return-void
.end method

.method public static final ۥ۟۟۟ۦ(LYue/ۥۡۧۨۢ;IILYue/ۥۣ۠ۢۤ;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e2;",
            "II",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-[B-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟۟۠;->ۥ۟۟۟ۨ(LYue/ۥۡۧۨۢ;I)I

    move-result v0

    :goto_0
    if-ge p1, p2, :cond_1

    if-nez v0, :cond_0

    const/4 v1, 0x0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v1

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    :goto_1
    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v2

    aget v2, v2, v0

    sub-int/2addr v2, v1

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v3

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v4

    array-length v4, v4

    add-int/2addr v4, v0

    aget v3, v3, v4

    add-int/2addr v2, v1

    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    sub-int/2addr v2, p1

    sub-int v1, p1, v1

    add-int/2addr v3, v1

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v1

    aget-object v1, v1, v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {p3, v1, v3, v4}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/2addr p1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static final ۥ۟۟۟ۧ(LYue/ۥۡۧۨۢ;LYue/ۥۣ۠ۢۤ;)V
    .locals 6
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06e2;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-[B-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v0

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v3

    add-int v4, v0, v1

    aget v3, v3, v4

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v4

    aget v4, v4, v1

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object v5

    aget-object v5, v5, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    sub-int v2, v4, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1, v5, v3, v2}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    move v2, v4

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۨ(LYue/ۥۡۧۨۢ;I)I
    .locals 2
    .param p0    # LYue/ۥۡۧۨۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۥ()[I

    move-result-object v0

    add-int/lit8 p1, p1, 0x1

    invoke-virtual {p0}, LYue/ۥۡۧۨۢ;->ۥ۟۟ۥۦ()[[B

    move-result-object p0

    array-length p0, p0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, p0}, LYue/ۥ۟۟۠;->ۥ([IIII)I

    move-result p0

    if-ltz p0, :cond_0

    goto :goto_0

    :cond_0
    not-int p0, p0

    :goto_0
    return p0
.end method
