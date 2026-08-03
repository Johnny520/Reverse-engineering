.class public LYue/ۥۡۦ۟;
.super LYue/ۥۡۦ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1537:1\n1#2:1538\n*E\n"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۡۦ;-><init>()V

    return-void
.end method

.method public static final synthetic ۥ۟۟۟ۤ(LYue/ۥ۟ۥ۟ۡ;D)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "byteRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥۡۦ۟;->ۥ۟۠۠ۦ(D)Ljava/lang/Byte;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final synthetic ۥ۟۟۟ۥ(LYue/ۥ۟ۥ۟ۡ;F)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "byteRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۦ۟;->ۥ۟۠۠ۧ(F)Ljava/lang/Byte;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۦ(LYue/ۥ۟ۥ۟ۡ;I)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "byteRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Byte;",
            ">;I)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۦ۟;->ۥ۟۠۠ۨ(I)Ljava/lang/Byte;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۧ(LYue/ۥ۟ۥ۟ۡ;J)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "byteRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Byte;",
            ">;J)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥۡۦ۟;->ۥ۟۠ۡ(J)Ljava/lang/Byte;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۨ(LYue/ۥ۟ۥ۟ۡ;S)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "byteRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Byte;",
            ">;S)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۦ۟;->ۥ۟۠ۡ۟(S)Ljava/lang/Byte;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۠(LYue/ۥۣۣۡۥ;I)Z
    .locals 1
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "byteRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Byte;",
            ">;I)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۦ۟;->ۥ۟۠۠ۨ(I)Ljava/lang/Byte;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۠۟(LYue/ۥۣۣۡۥ;J)Z
    .locals 1
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "byteRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Byte;",
            ">;J)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥۡۦ۟;->ۥ۟۠ۡ(J)Ljava/lang/Byte;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۠۠(LYue/ۥۣۣۡۥ;S)Z
    .locals 1
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "byteRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Byte;",
            ">;S)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۦ۟;->ۥ۟۠ۡ۟(S)Ljava/lang/Byte;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۠ۡ(BB)B
    .locals 0

    if-ge p0, p1, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟۠ۢ(DD)D
    .locals 1

    cmpg-double v0, p0, p2

    if-gez v0, :cond_0

    move-wide p0, p2

    :cond_0
    return-wide p0
.end method

.method public static final ۥۣ۟۟۠(FF)F
    .locals 1

    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static ۥ۟۟۠ۤ(II)I
    .locals 0

    if-ge p0, p1, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static ۥ۟۟۠ۥ(JJ)J
    .locals 1

    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    move-wide p0, p2

    :cond_0
    return-wide p0
.end method

.method public static final ۥ۟۟۠ۦ(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;
    .locals 1
    .param p0    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(TT;TT;)TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "minimumValue"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    move-object p0, p1

    :cond_0
    return-object p0
.end method

.method public static final ۥ۟۟۠ۧ(SS)S
    .locals 0

    if-ge p0, p1, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟۠ۨ(BB)B
    .locals 0

    if-le p0, p1, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟ۡ(DD)D
    .locals 1

    cmpl-double v0, p0, p2

    if-lez v0, :cond_0

    move-wide p0, p2

    :cond_0
    return-wide p0
.end method

.method public static final ۥ۟۟ۡ۟(FF)F
    .locals 1

    cmpl-float v0, p0, p1

    if-lez v0, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static ۥ۟۟ۡ۠(II)I
    .locals 0

    if-le p0, p1, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static ۥ۟۟ۡۡ(JJ)J
    .locals 1

    cmp-long v0, p0, p2

    if-lez v0, :cond_0

    move-wide p0, p2

    :cond_0
    return-wide p0
.end method

.method public static final ۥ۟۟ۡۢ(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;
    .locals 1
    .param p0    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(TT;TT;)TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "maximumValue"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_0

    move-object p0, p1

    :cond_0
    return-object p0
.end method

.method public static final ۥۣ۟۟ۡ(SS)S
    .locals 0

    if-le p0, p1, :cond_0

    move p0, p1

    :cond_0
    return p0
.end method

.method public static final ۥ۟۟ۡۤ(BBB)B
    .locals 2

    if-gt p1, p2, :cond_2

    if-ge p0, p1, :cond_0

    return p1

    :cond_0
    if-le p0, p2, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟ۡۥ(DDD)D
    .locals 1

    cmpl-double v0, p2, p4

    if-gtz v0, :cond_2

    cmpg-double v0, p0, p2

    if-gez v0, :cond_0

    return-wide p2

    :cond_0
    cmpl-double p2, p0, p4

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

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string p4, " is less than minimum "

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟ۡۦ(FFF)F
    .locals 2

    cmpl-float v0, p1, p2

    if-gtz v0, :cond_2

    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    return p1

    :cond_0
    cmpl-float p1, p0, p2

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

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟ۡۧ(III)I
    .locals 2

    if-gt p1, p2, :cond_2

    if-ge p0, p1, :cond_0

    return p1

    :cond_0
    if-le p0, p2, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟ۡۨ(ILYue/ۥ۟ۥ۟ۡ;)I
    .locals 2
    .param p1    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    const-string v0, "range"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYue/ۥ۟ۥ۟۠;

    if-eqz v0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    check-cast p1, LYue/ۥ۟ۥ۟۠;

    invoke-static {p0, p1}, LYue/ۥۡۦ۟;->ۥ۟۟ۢ۠(Ljava/lang/Comparable;LYue/ۥ۟ۥ۟۠;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0

    :cond_0
    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-ge p0, v0, :cond_1

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    if-le p0, v0, :cond_2

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

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

.method public static ۥ۟۟ۢ(JJJ)J
    .locals 1

    cmp-long v0, p2, p4

    if-gtz v0, :cond_2

    cmp-long v0, p0, p2

    if-gez v0, :cond_0

    return-wide p2

    :cond_0
    cmp-long p2, p0, p4

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

    invoke-virtual {p1, p4, p5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p4, " is less than minimum "

    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 p2, 0x2e

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟ۢ۟(JLYue/ۥ۟ۥ۟ۡ;)J
    .locals 2
    .param p2    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Long;",
            ">;)J"
        }
    .end annotation

    const-string v0, "range"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, LYue/ۥ۟ۥ۟۠;

    if-eqz v0, :cond_0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    check-cast p2, LYue/ۥ۟ۥ۟۠;

    invoke-static {p0, p2}, LYue/ۥۡۦ۟;->ۥ۟۟ۢ۠(Ljava/lang/Comparable;LYue/ۥ۟ۥ۟۠;)Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    return-wide p0

    :cond_0
    invoke-interface {p2}, LYue/ۥ۟ۥ۟ۡ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p2}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v0, p0, v0

    if-gez v0, :cond_1

    invoke-interface {p2}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    goto :goto_0

    :cond_1
    invoke-interface {p2}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    cmp-long v0, p0, v0

    if-lez v0, :cond_2

    invoke-interface {p2}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

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

.method public static final ۥ۟۟ۢ۠(Ljava/lang/Comparable;LYue/ۥ۟ۥ۟۠;)Ljava/lang/Comparable;
    .locals 2
    .param p0    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۥ۟۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.1"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(TT;",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e0<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "range"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, LYue/ۥ۟ۥ۟۠;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, p0, v0}, LYue/ۥ۟ۥ۟۠;->ۥ۟۟(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, v0, p0}, LYue/ۥ۟ۥ۟۠;->ۥ۟۟(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, v0, p0}, LYue/ۥ۟ۥ۟۠;->ۥ۟۟(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p1, p0, v0}, LYue/ۥ۟ۥ۟۠;->ۥ۟۟(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object p0

    :cond_1
    :goto_0
    return-object p0

    :cond_2
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

.method public static final ۥ۟۟ۢۡ(Ljava/lang/Comparable;LYue/ۥ۟ۥ۟ۡ;)Ljava/lang/Comparable;
    .locals 2
    .param p0    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(TT;",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "range"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, LYue/ۥ۟ۥ۟۠;

    if-eqz v0, :cond_0

    check-cast p1, LYue/ۥ۟ۥ۟۠;

    invoke-static {p0, p1}, LYue/ۥۡۦ۟;->ۥ۟۟ۢ۠(Ljava/lang/Comparable;LYue/ۥ۟ۥ۟۠;)Ljava/lang/Comparable;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_1

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟()Ljava/lang/Comparable;

    move-result-object p0

    goto :goto_0

    :cond_1
    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object v0

    invoke-interface {p0, v0}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-lez v0, :cond_2

    invoke-interface {p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ۟۟۟۟()Ljava/lang/Comparable;

    move-result-object p0

    :cond_2
    :goto_0
    return-object p0

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

.method public static final ۥ۟۟ۢۢ(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;
    .locals 2
    .param p0    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Comparable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "-TT;>;>(TT;TT;TT;)TT;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    if-eqz p2, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_1

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_0

    return-object p1

    :cond_0
    invoke-interface {p0, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    if-lez p1, :cond_4

    return-object p2

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    if-eqz p1, :cond_3

    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-gez v0, :cond_3

    return-object p1

    :cond_3
    if-eqz p2, :cond_4

    invoke-interface {p0, p2}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p1

    if-lez p1, :cond_4

    return-object p2

    :cond_4
    return-object p0
.end method

.method public static final ۥۣ۟۟ۢ(SSS)S
    .locals 2

    if-gt p1, p2, :cond_2

    if-ge p0, p1, :cond_0

    return p1

    :cond_0
    if-le p0, p2, :cond_1

    return p2

    :cond_1
    return p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Cannot coerce value to an empty range: maximum "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, " is less than minimum "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x2e

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟۟ۢۤ(LYue/ۥۣ۟ۤۡ;Ljava/lang/Character;)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥۣ۟ۤۡ;->ۥ۟۟۟ۦ(C)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟ۢۥ(LYue/ۥ۠ۥۣۨ;B)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥۡۦ۟;->ۥ۟۟ۦۣ(LYue/ۥ۟ۥ۟ۡ;B)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۦ(LYue/ۥ۠ۥۣۨ;J)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, LYue/ۥۡۦ۟;->ۥ۟۟ۦۦ(LYue/ۥ۟ۥ۟ۡ;J)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢۧ(LYue/ۥ۠ۥۣۨ;Ljava/lang/Integer;)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۟ۦ(I)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟ۢۨ(LYue/ۥ۠ۥۣۨ;S)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥۡۦ۟;->ۥ۟۟ۦۧ(LYue/ۥ۟ۥ۟ۡ;S)Z

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟(LYue/ۥۣ۠ۨ۠;B)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥۡۦ۟;->ۥ۟۟ۧۦ(LYue/ۥ۟ۥ۟ۡ;B)Z

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۣ۠ۨ۠;I)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥۡۦ۟;->ۥ۟۟ۨ(LYue/ۥ۟ۥ۟ۡ;I)Z

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟۠(LYue/ۥۣ۠ۨ۠;Ljava/lang/Long;)Z
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, LYue/ۥۣ۠ۨ۠;->ۥ۟۟۟ۦ(J)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥۣ۟۟ۡ(LYue/ۥۣ۠ۨ۠;S)Z
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, LYue/ۥۡۦ۟;->ۥ۟۟ۨ۟(LYue/ۥ۟ۥ۟ۡ;S)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥۣ۟۟ۢ(LYue/ۥ۟ۥ۟ۡ;B)Z
    .locals 2
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "doubleRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥۣۣ۟۟(LYue/ۥ۟ۥ۟ۡ;F)Z
    .locals 2
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "doubleRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Double;",
            ">;F)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥۣ۟۟ۤ(LYue/ۥ۟ۥ۟ۡ;I)Z
    .locals 2
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "doubleRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥۣ۟۟ۥ(LYue/ۥ۟ۥ۟ۡ;J)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "doubleRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    long-to-double p1, p1

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥۣ۟۟ۦ(LYue/ۥ۟ۥ۟ۡ;S)Z
    .locals 2
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "doubleRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟ۧ(LYue/ۥۣۣۡۥ;F)Z
    .locals 2
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "doubleRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Double;",
            ">;F)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟ۨ(CC)LYue/ۥۣ۟ۤ۟;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۤ۟$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥۣ۟ۤ۟$ۥ;->ۥ(CCI)LYue/ۥۣ۟ۤ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤ(BB)LYue/ۥ۠ۥۣۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤ۟(BI)LYue/ۥ۠ۥۣۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤ۠(BS)LYue/ۥ۠ۥۣۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤۡ(IB)LYue/ۥ۠ۥۣۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟ۤۢ(II)LYue/ۥ۠ۥۣۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۟ۤ(IS)LYue/ۥ۠ۥۣۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤۤ(SB)LYue/ۥ۠ۥۣۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤۥ(SI)LYue/ۥ۠ۥۣۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤۦ(SS)LYue/ۥ۠ۥۣۦ;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    const/4 v1, -0x1

    invoke-virtual {v0, p0, p1, v1}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤۧ(BJ)LYue/ۥۣ۠ۨ;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;

    int-to-long v1, p0

    const-wide/16 v5, -0x1

    move-wide v3, p1

    invoke-virtual/range {v0 .. v6}, LYue/ۥۣ۠ۨ$ۥ;->ۥ(JJJ)LYue/ۥۣ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۤۨ(IJ)LYue/ۥۣ۠ۨ;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;

    int-to-long v1, p0

    const-wide/16 v5, -0x1

    move-wide v3, p1

    invoke-virtual/range {v0 .. v6}, LYue/ۥۣ۠ۨ$ۥ;->ۥ(JJJ)LYue/ۥۣ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۥ(JB)LYue/ۥۣ۠ۨ;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;

    int-to-long v3, p2

    const-wide/16 v5, -0x1

    move-wide v1, p0

    invoke-virtual/range {v0 .. v6}, LYue/ۥۣ۠ۨ$ۥ;->ۥ(JJJ)LYue/ۥۣ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۥ۟(JI)LYue/ۥۣ۠ۨ;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;

    int-to-long v3, p2

    const-wide/16 v5, -0x1

    move-wide v1, p0

    invoke-virtual/range {v0 .. v6}, LYue/ۥۣ۠ۨ$ۥ;->ۥ(JJJ)LYue/ۥۣ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۥ۠(JJ)LYue/ۥۣ۠ۨ;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;

    const-wide/16 v5, -0x1

    move-wide v1, p0

    move-wide v3, p2

    invoke-virtual/range {v0 .. v6}, LYue/ۥۣ۠ۨ$ۥ;->ۥ(JJJ)LYue/ۥۣ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۥۡ(JS)LYue/ۥۣ۠ۨ;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;

    int-to-long v3, p2

    const-wide/16 v5, -0x1

    move-wide v1, p0

    invoke-virtual/range {v0 .. v6}, LYue/ۥۣ۠ۨ$ۥ;->ۥ(JJJ)LYue/ۥۣ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۥۢ(SJ)LYue/ۥۣ۠ۨ;
    .locals 7
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;

    int-to-long v1, p0

    const-wide/16 v5, -0x1

    move-wide v3, p1

    invoke-virtual/range {v0 .. v6}, LYue/ۥۣ۠ۨ$ۥ;->ۥ(JJJ)LYue/ۥۣ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۥۣ(LYue/ۥۣ۟ۤ۟;)C
    .locals 3
    .param p0    # LYue/ۥۣ۟ۤ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟۠()C

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

.method public static final ۥ۟۟ۥۤ(LYue/ۥ۠ۥۣۦ;)I
    .locals 3
    .param p0    # LYue/ۥ۠ۥۣۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

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

.method public static final ۥ۟۟ۥۥ(LYue/ۥۣ۠ۨ;)J
    .locals 3
    .param p0    # LYue/ۥۣ۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥ۟۟۟۠()J

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

.method public static final ۥ۟۟ۥۦ(LYue/ۥۣ۟ۤ۟;)Ljava/lang/Character;
    .locals 1
    .param p0    # LYue/ۥۣ۟ۤ۟;
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

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟۠()C

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟ۥۧ(LYue/ۥ۠ۥۣۦ;)Ljava/lang/Integer;
    .locals 1
    .param p0    # LYue/ۥ۠ۥۣۦ;
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

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟ۥۨ(LYue/ۥۣ۠ۨ;)Ljava/lang/Long;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۨ;
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

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥ۟۟۟۠()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final synthetic ۥ۟۟ۦ(LYue/ۥ۟ۥ۟ۡ;B)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "floatRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۦ۟(LYue/ۥ۟ۥ۟ۡ;D)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "floatRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Float;",
            ">;D)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    double-to-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۟ۦ۠(LYue/ۥ۟ۥ۟ۡ;I)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "floatRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۟ۦۡ(LYue/ۥ۟ۥ۟ۡ;J)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "floatRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    long-to-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۟ۦۢ(LYue/ۥ۟ۥ۟ۡ;S)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "floatRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float p1, p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۦۣ(LYue/ۥ۟ۥ۟ۡ;B)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "intRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Integer;",
            ">;B)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۟ۦۤ(LYue/ۥ۟ۥ۟ۡ;D)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "intRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥۡۦ۟;->ۥ۟۠ۡ۠(D)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final synthetic ۥ۟۟ۦۥ(LYue/ۥ۟ۥ۟ۡ;F)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "intRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۦ۟;->ۥ۟۠ۡۡ(F)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥ۟۟ۦۦ(LYue/ۥ۟ۥ۟ۡ;J)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "intRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Integer;",
            ">;J)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥۡۦ۟;->ۥ۟۠ۡۢ(J)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟ۦۧ(LYue/ۥ۟ۥ۟ۡ;S)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "intRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Integer;",
            ">;S)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۦۨ(LYue/ۥۣۣۡۥ;B)Z
    .locals 1
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "intRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Integer;",
            ">;B)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۧ(LYue/ۥۣۣۡۥ;J)Z
    .locals 1
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "intRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Integer;",
            ">;J)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥۡۦ۟;->ۥ۟۠ۡۢ(J)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟ۧ۟(LYue/ۥۣۣۡۥ;S)Z
    .locals 1
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "intRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Integer;",
            ">;S)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۧ۠(LYue/ۥۣ۟ۤ۟;)C
    .locals 3
    .param p0    # LYue/ۥۣ۟ۤ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟ۢ()C

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

.method public static final ۥ۟۟ۧۡ(LYue/ۥ۠ۥۣۦ;)I
    .locals 3
    .param p0    # LYue/ۥ۠ۥۣۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

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

.method public static final ۥ۟۟ۧۢ(LYue/ۥۣ۠ۨ;)J
    .locals 3
    .param p0    # LYue/ۥۣ۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.7"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥ۟۟۟ۢ()J

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

.method public static final ۥۣ۟۟ۧ(LYue/ۥۣ۟ۤ۟;)Ljava/lang/Character;
    .locals 1
    .param p0    # LYue/ۥۣ۟ۤ۟;
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

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟ۢ()C

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟ۧۤ(LYue/ۥ۠ۥۣۦ;)Ljava/lang/Integer;
    .locals 1
    .param p0    # LYue/ۥ۠ۥۣۦ;
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

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟ۧۥ(LYue/ۥۣ۠ۨ;)Ljava/lang/Long;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۨ;
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

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥ۟۟۟ۢ()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۟ۧۦ(LYue/ۥ۟ۥ۟ۡ;B)Z
    .locals 2
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "longRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Long;",
            ">;B)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۟ۧۧ(LYue/ۥ۟ۥ۟ۡ;D)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "longRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥۡۦ۟;->ۥۣ۟۠ۡ(D)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final synthetic ۥ۟۟ۧۨ(LYue/ۥ۟ۥ۟ۡ;F)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "longRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۦ۟;->ۥ۟۠ۡۤ(F)Ljava/lang/Long;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟ۨ(LYue/ۥ۟ۥ۟ۡ;I)Z
    .locals 2
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "longRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Long;",
            ">;I)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۨ۟(LYue/ۥ۟ۥ۟ۡ;S)Z
    .locals 2
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "longRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Long;",
            ">;S)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۨ۠(LYue/ۥۣۣۡۥ;B)Z
    .locals 2
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "longRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Long;",
            ">;B)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۨۡ(LYue/ۥۣۣۡۥ;I)Z
    .locals 2
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "longRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Long;",
            ">;I)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۨۢ(LYue/ۥۣۣۡۥ;S)Z
    .locals 2
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "longRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Long;",
            ">;S)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long v0, p1

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟ۨ(LYue/ۥۣ۟ۤۡ;)C
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۡۦ۟;->ۥ۟۟ۨۤ(LYue/ۥۣ۟ۤۡ;LYue/ۥۡۥۨۤ;)C

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۨۤ(LYue/ۥۣ۟ۤۡ;LYue/ۥۡۥۨۤ;)C
    .locals 1
    .param p0    # LYue/ۥۣ۟ۤۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۥۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟۠()C

    move-result v0

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟ۢ()C

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-virtual {p1, v0, p0}, LYue/ۥۡۥۨۤ;->ۥ۟۟۟ۨ(II)I

    move-result p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    int-to-char p0, p0

    return p0

    :catch_0
    move-exception p0

    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static final ۥ۟۟ۨۥ(LYue/ۥ۠ۥۣۨ;)I
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۡۦ۟;->ۥ۟۟ۨۦ(LYue/ۥ۠ۥۣۨ;LYue/ۥۡۥۨۤ;)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۨۦ(LYue/ۥ۠ۥۣۨ;LYue/ۥۡۥۨۤ;)I
    .locals 1
    .param p0    # LYue/ۥ۠ۥۣۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۥۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1, p0}, LYue/ۥۡۥۨۥ;->ۥ۟۟۟ۢ(LYue/ۥۡۥۨۤ;LYue/ۥ۠ۥۣۨ;)I

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

.method public static final ۥ۟۟ۨۧ(LYue/ۥۣ۠ۨ۠;)J
    .locals 2
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۡۦ۟;->ۥ۟۟ۨۨ(LYue/ۥۣ۠ۨ۠;LYue/ۥۡۥۨۤ;)J

    move-result-wide v0

    return-wide v0
.end method

.method public static final ۥ۟۟ۨۨ(LYue/ۥۣ۠ۨ۠;LYue/ۥۡۥۨۤ;)J
    .locals 1
    .param p0    # LYue/ۥۣ۠ۨ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۥۨۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.3"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p1, p0}, LYue/ۥۡۥۨۥ;->ۥۣ۟۟۟(LYue/ۥۡۥۨۤ;LYue/ۥۣ۠ۨ۠;)J

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

.method public static final ۥ۟۠(LYue/ۥۣ۟ۤۡ;)Ljava/lang/Character;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۡۦ۟;->ۥ۟۠۟(LYue/ۥۣ۟ۤۡ;LYue/ۥۡۥۨۤ;)Ljava/lang/Character;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۠۟(LYue/ۥۣ۟ۤۡ;LYue/ۥۡۥۨۤ;)Ljava/lang/Character;
    .locals 1
    .param p0    # LYue/ۥۣ۟ۤۡ;
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
        version = "1.4"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۟ۤۡ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟۠()C

    move-result v0

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟ۢ()C

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-virtual {p1, v0, p0}, LYue/ۥۡۥۨۤ;->ۥ۟۟۟ۨ(II)I

    move-result p0

    int-to-char p0, p0

    invoke-static {p0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۠۟۟(LYue/ۥ۠ۥۣۨ;)Ljava/lang/Integer;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۡۦ۟;->ۥ۟۠۟۠(LYue/ۥ۠ۥۣۨ;LYue/ۥۡۥۨۤ;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۠۟۠(LYue/ۥ۠ۥۣۨ;LYue/ۥۡۥۨۤ;)Ljava/lang/Integer;
    .locals 1
    .param p0    # LYue/ۥ۠ۥۣۨ;
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
        version = "1.4"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۨ;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p1, p0}, LYue/ۥۡۥۨۥ;->ۥ۟۟۟ۢ(LYue/ۥۡۥۨۤ;LYue/ۥ۠ۥۣۨ;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۠۟ۡ(LYue/ۥۣ۠ۨ۠;)Ljava/lang/Long;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.4"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۡۥۨۤ;->ۥۣ۟۟۠:LYue/ۥۡۥۨۤ$ۥ;

    invoke-static {p0, v0}, LYue/ۥۡۦ۟;->ۥ۟۠۟ۢ(LYue/ۥۣ۠ۨ۠;LYue/ۥۡۥۨۤ;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۠۟ۢ(LYue/ۥۣ۠ۨ۠;LYue/ۥۡۥۨۤ;)Ljava/lang/Long;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۨ۠;
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
        version = "1.4"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "random"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ۠;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    invoke-static {p1, p0}, LYue/ۥۡۥۨۥ;->ۥۣ۟۟۟(LYue/ۥۡۥۨۤ;LYue/ۥۣ۠ۨ۠;)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥۣ۟۠۟(LYue/ۥۣ۟ۤ۟;)LYue/ۥۣ۟ۤ۟;
    .locals 3
    .param p0    # LYue/ۥۣ۟ۤ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۤ۟$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟ۢ()C

    move-result v1

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟۠()C

    move-result v2

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥۣ۟۟۟()I

    move-result p0

    neg-int p0, p0

    invoke-virtual {v0, v1, v2, p0}, LYue/ۥۣ۟ۤ۟$ۥ;->ۥ(CCI)LYue/ۥۣ۟ۤ۟;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۠۟ۤ(LYue/ۥ۠ۥۣۦ;)LYue/ۥ۠ۥۣۦ;
    .locals 3
    .param p0    # LYue/ۥ۠ۥۣۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result v1

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result v2

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥۣ۟۟۟()I

    move-result p0

    neg-int p0, p0

    invoke-virtual {v0, v1, v2, p0}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۠۟ۥ(LYue/ۥۣ۠ۨ;)LYue/ۥۣ۠ۨ;
    .locals 8
    .param p0    # LYue/ۥۣ۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥ۟۟۟ۢ()J

    move-result-wide v2

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥ۟۟۟۠()J

    move-result-wide v4

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۟()J

    move-result-wide v6

    neg-long v6, v6

    invoke-virtual/range {v1 .. v7}, LYue/ۥۣ۠ۨ$ۥ;->ۥ(JJJ)LYue/ۥۣ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۠۟ۦ(LYue/ۥ۟ۥ۟ۡ;B)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "shortRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Short;",
            ">;B)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-short p1, p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟۠۟ۧ(LYue/ۥ۟ۥ۟ۡ;D)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "shortRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥۡۦ۟;->ۥ۟۠ۡۥ(D)Ljava/lang/Short;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final synthetic ۥ۟۠۟ۨ(LYue/ۥ۟ۥ۟ۡ;F)Z
    .locals 1
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed."
    .end annotation

    .annotation runtime LYue/ۥ۟ۨۨۨ;
        errorSince = "1.4"
        hiddenSince = "1.5"
        warningSince = "1.3"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "shortRangeContains"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۦ۟;->ۥ۟۠ۡۦ(F)Ljava/lang/Short;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۠۠(LYue/ۥ۟ۥ۟ۡ;I)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "shortRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Short;",
            ">;I)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۦ۟;->ۥ۟۠ۡۧ(I)Ljava/lang/Short;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۠۠۟(LYue/ۥ۟ۥ۟ۡ;J)Z
    .locals 1
    .param p0    # LYue/ۥ۟ۥ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "shortRangeContains"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5\u06df\u06e1<",
            "Ljava/lang/Short;",
            ">;J)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥۡۦ۟;->ۥ۟۠ۡۨ(J)Ljava/lang/Short;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥ۟ۥ۟ۡ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۠۠۠(LYue/ۥۣۣۡۥ;B)Z
    .locals 1
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "shortRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Short;",
            ">;B)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-short p1, p1

    invoke-static {p1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p1

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۠۠ۡ(LYue/ۥۣۣۡۥ;I)Z
    .locals 1
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "shortRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Short;",
            ">;I)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LYue/ۥۡۦ۟;->ۥ۟۠ۡۧ(I)Ljava/lang/Short;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۠۠ۢ(LYue/ۥۣۣۡۥ;J)Z
    .locals 1
    .param p0    # LYue/ۥۣۣۡۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "shortRangeContains"
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation build LYue/ۥۢۥ۠ۧ;
        markerClass = {
            LYue/ۥ۠ۡۥ۟;
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e3\u06e3\u06e5<",
            "Ljava/lang/Short;",
            ">;J)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, LYue/ۥۡۦ۟;->ۥ۟۠ۡۨ(J)Ljava/lang/Short;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, LYue/ۥۣۣۡۥ;->ۥ(Ljava/lang/Comparable;)Z

    move-result p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥۣ۟۠۠(LYue/ۥۣ۟ۤ۟;I)LYue/ۥۣ۟ۤ۟;
    .locals 3
    .param p0    # LYue/ۥۣ۟ۤ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
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

    sget-object v0, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۠ۦ:LYue/ۥۣ۟ۤ۟$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟۠()C

    move-result v1

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥ۟۟۟ۢ()C

    move-result v2

    invoke-virtual {p0}, LYue/ۥۣ۟ۤ۟;->ۥۣ۟۟۟()I

    move-result p0

    if-lez p0, :cond_1

    goto :goto_1

    :cond_1
    neg-int p1, p1

    :goto_1
    invoke-virtual {v0, v1, v2, p1}, LYue/ۥۣ۟ۤ۟$ۥ;->ۥ(CCI)LYue/ۥۣ۟ۤ۟;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۠۠ۤ(LYue/ۥ۠ۥۣۦ;I)LYue/ۥ۠ۥۣۦ;
    .locals 3
    .param p0    # LYue/ۥ۠ۥۣۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
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

    sget-object v0, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۠ۦ:LYue/ۥ۠ۥۣۦ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟۠()I

    move-result v1

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥ۟۟۟ۢ()I

    move-result v2

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۦ;->ۥۣ۟۟۟()I

    move-result p0

    if-lez p0, :cond_1

    goto :goto_1

    :cond_1
    neg-int p1, p1

    :goto_1
    invoke-virtual {v0, v1, v2, p1}, LYue/ۥ۠ۥۣۦ$ۥ;->ۥ(III)LYue/ۥ۠ۥۣۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۠۠ۥ(LYue/ۥۣ۠ۨ;J)LYue/ۥۣ۠ۨ;
    .locals 11
    .param p0    # LYue/ۥۣ۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
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

    sget-object v4, LYue/ۥۣ۠ۨ;->ۥ۟۟۠ۦ:LYue/ۥۣ۠ۨ$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥ۟۟۟۠()J

    move-result-wide v5

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥ۟۟۟ۢ()J

    move-result-wide v7

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ;->ۥۣ۟۟۟()J

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
    invoke-virtual/range {v4 .. v10}, LYue/ۥۣ۠ۨ$ۥ;->ۥ(JJJ)LYue/ۥۣ۠ۨ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۠۠ۦ(D)Ljava/lang/Byte;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-wide/high16 v0, -0x3fa0000000000000L    # -128.0

    cmpg-double v0, v0, p0

    if-gtz v0, :cond_0

    const-wide v0, 0x405fc00000000000L    # 127.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_0

    double-to-int p0, p0

    int-to-byte p0, p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠۠ۧ(F)Ljava/lang/Byte;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/high16 v0, -0x3d000000    # -128.0f

    cmpg-float v0, v0, p0

    if-gtz v0, :cond_0

    const/high16 v0, 0x42fe0000    # 127.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    float-to-int p0, p0

    int-to-byte p0, p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠۠ۨ(I)Ljava/lang/Byte;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    const/16 v1, -0x80

    const/16 v2, 0x7f

    invoke-direct {v0, v1, v2}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    invoke-virtual {v0, p0}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۟ۦ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    int-to-byte p0, p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۡ(J)Ljava/lang/Byte;
    .locals 5
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۨ۠;

    const-wide/16 v1, -0x80

    const-wide/16 v3, 0x7f

    invoke-direct {v0, v1, v2, v3, v4}, LYue/ۥۣ۠ۨ۠;-><init>(JJ)V

    invoke-virtual {v0, p0, p1}, LYue/ۥۣ۠ۨ۠;->ۥ۟۟۟ۦ(J)Z

    move-result v0

    if-eqz v0, :cond_0

    long-to-int p0, p0

    int-to-byte p0, p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۡ۟(S)Ljava/lang/Byte;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    const/16 v1, -0x80

    const/16 v2, 0x7f

    invoke-direct {v0, v1, v2}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    invoke-static {v0, p0}, LYue/ۥۡۦ۟;->ۥ۟۟ۦۧ(LYue/ۥ۟ۥ۟ۡ;S)Z

    move-result v0

    if-eqz v0, :cond_0

    int-to-byte p0, p0

    invoke-static {p0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۡ۠(D)Ljava/lang/Integer;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-wide/high16 v0, -0x3e20000000000000L    # -2.147483648E9

    cmpg-double v0, v0, p0

    if-gtz v0, :cond_0

    const-wide v0, 0x41dfffffffc00000L    # 2.147483647E9

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_0

    double-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۡۡ(F)Ljava/lang/Integer;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/high16 v0, -0x31000000

    cmpg-float v0, v0, p0

    if-gtz v0, :cond_0

    const/high16 v0, 0x4f000000

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    float-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۡۢ(J)Ljava/lang/Integer;
    .locals 5
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۨ۠;

    const-wide/32 v1, -0x80000000

    const-wide/32 v3, 0x7fffffff

    invoke-direct {v0, v1, v2, v3, v4}, LYue/ۥۣ۠ۨ۠;-><init>(JJ)V

    invoke-virtual {v0, p0, p1}, LYue/ۥۣ۠ۨ۠;->ۥ۟۟۟ۦ(J)Z

    move-result v0

    if-eqz v0, :cond_0

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥۣ۟۠ۡ(D)Ljava/lang/Long;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-wide/high16 v0, -0x3c20000000000000L    # -9.223372036854776E18

    cmpg-double v0, v0, p0

    if-gtz v0, :cond_0

    const-wide/high16 v0, 0x43e0000000000000L    # 9.223372036854776E18

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_0

    double-to-long p0, p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۡۤ(F)Ljava/lang/Long;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/high16 v0, -0x21000000

    cmpg-float v0, v0, p0

    if-gtz v0, :cond_0

    const/high16 v0, 0x5f000000

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    float-to-long v0, p0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۡۥ(D)Ljava/lang/Short;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const-wide/high16 v0, -0x3f20000000000000L    # -32768.0

    cmpg-double v0, v0, p0

    if-gtz v0, :cond_0

    const-wide v0, 0x40dfffc000000000L    # 32767.0

    cmpg-double v0, p0, v0

    if-gtz v0, :cond_0

    double-to-int p0, p0

    int-to-short p0, p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۡۦ(F)Ljava/lang/Short;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/high16 v0, -0x39000000    # -32768.0f

    cmpg-float v0, v0, p0

    if-gtz v0, :cond_0

    const v0, 0x46fffe00    # 32767.0f

    cmpg-float v0, p0, v0

    if-gtz v0, :cond_0

    float-to-int p0, p0

    int-to-short p0, p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۡۧ(I)Ljava/lang/Short;
    .locals 3
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    const/16 v1, -0x8000

    const/16 v2, 0x7fff

    invoke-direct {v0, v1, v2}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    invoke-virtual {v0, p0}, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۟ۦ(I)Z

    move-result v0

    if-eqz v0, :cond_0

    int-to-short p0, p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۡۨ(J)Ljava/lang/Short;
    .locals 5
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۨ۠;

    const-wide/16 v1, -0x8000

    const-wide/16 v3, 0x7fff

    invoke-direct {v0, v1, v2, v3, v4}, LYue/ۥۣ۠ۨ۠;-><init>(JJ)V

    invoke-virtual {v0, p0, p1}, LYue/ۥۣ۠ۨ۠;->ۥ۟۟۟ۦ(J)Z

    move-result v0

    if-eqz v0, :cond_0

    long-to-int p0, p0

    int-to-short p0, p0

    invoke-static {p0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟۠ۢ(CC)LYue/ۥۣ۟ۤۡ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 v0, 0x0

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥۣ۟۟۠(II)I

    move-result v0

    if-gtz v0, :cond_0

    sget-object p0, LYue/ۥۣ۟ۤۡ;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۤۡ$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۟ۤۡ$ۥ;->ۥ()LYue/ۥۣ۟ۤۡ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۤۡ;

    add-int/lit8 p1, p1, -0x1

    int-to-char p1, p1

    invoke-direct {v0, p0, p1}, LYue/ۥۣ۟ۤۡ;-><init>(CC)V

    return-object v0
.end method

.method public static final ۥ۟۠ۢ۟(BB)LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    return-object v0
.end method

.method public static final ۥ۟۠ۢ۠(BI)LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/high16 v0, -0x80000000

    if-gt p1, v0, :cond_0

    sget-object p0, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۥۣۨ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۨ$ۥ;->ۥ()LYue/ۥ۠ۥۣۨ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥ۠ۥۣۨ;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    return-object v0
.end method

.method public static final ۥ۟۠ۢۡ(BS)LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    return-object v0
.end method

.method public static final ۥ۟۠ۢۢ(IB)LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    return-object v0
.end method

.method public static ۥۣ۟۠ۢ(II)LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/high16 v0, -0x80000000

    if-gt p1, v0, :cond_0

    sget-object p0, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۥۣۨ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۨ$ۥ;->ۥ()LYue/ۥ۠ۥۣۨ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥ۠ۥۣۨ;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    return-object v0
.end method

.method public static final ۥ۟۠ۢۤ(IS)LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    return-object v0
.end method

.method public static final ۥ۟۠ۢۥ(SB)LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    return-object v0
.end method

.method public static final ۥ۟۠ۢۦ(SI)LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/high16 v0, -0x80000000

    if-gt p1, v0, :cond_0

    sget-object p0, LYue/ۥ۠ۥۣۨ;->ۥ۟۟۠ۧ:LYue/ۥ۠ۥۣۨ$ۥ;

    invoke-virtual {p0}, LYue/ۥ۠ۥۣۨ$ۥ;->ۥ()LYue/ۥ۠ۥۣۨ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥ۠ۥۣۨ;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    return-object v0
.end method

.method public static final ۥ۟۠ۢۧ(SS)LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۣۨ;

    add-int/lit8 p1, p1, -0x1

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۥۣۨ;-><init>(II)V

    return-object v0
.end method

.method public static final ۥ۟۠ۢۨ(BJ)LYue/ۥۣ۠ۨ۠;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    sget-object p0, LYue/ۥۣ۠ۨ۠;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۨ۠$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ۠$ۥ;->ۥ()LYue/ۥۣ۠ۨ۠;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۠ۨ۠;

    int-to-long v1, p0

    const-wide/16 v3, 0x1

    sub-long/2addr p1, v3

    invoke-direct {v0, v1, v2, p1, p2}, LYue/ۥۣ۠ۨ۠;-><init>(JJ)V

    return-object v0
.end method

.method public static final ۥۣ۟۠(IJ)LYue/ۥۣ۠ۨ۠;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    sget-object p0, LYue/ۥۣ۠ۨ۠;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۨ۠$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ۠$ۥ;->ۥ()LYue/ۥۣ۠ۨ۠;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۠ۨ۠;

    int-to-long v1, p0

    const-wide/16 v3, 0x1

    sub-long/2addr p1, v3

    invoke-direct {v0, v1, v2, p1, p2}, LYue/ۥۣ۠ۨ۠;-><init>(JJ)V

    return-object v0
.end method

.method public static final ۥۣ۟۠۟(JB)LYue/ۥۣ۠ۨ۠;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۨ۠;

    int-to-long v1, p2

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-direct {v0, p0, p1, v1, v2}, LYue/ۥۣ۠ۨ۠;-><init>(JJ)V

    return-object v0
.end method

.method public static final ۥۣ۟۠۠(JI)LYue/ۥۣ۠ۨ۠;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۨ۠;

    int-to-long v1, p2

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-direct {v0, p0, p1, v1, v2}, LYue/ۥۣ۠ۨ۠;-><init>(JJ)V

    return-object v0
.end method

.method public static final ۥۣ۟۠ۡ(JJ)LYue/ۥۣ۠ۨ۠;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p2, v0

    if-gtz v0, :cond_0

    sget-object p0, LYue/ۥۣ۠ۨ۠;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۨ۠$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ۠$ۥ;->ۥ()LYue/ۥۣ۠ۨ۠;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۠ۨ۠;

    const-wide/16 v1, 0x1

    sub-long/2addr p2, v1

    invoke-direct {v0, p0, p1, p2, p3}, LYue/ۥۣ۠ۨ۠;-><init>(JJ)V

    return-object v0
.end method

.method public static final ۥۣ۟۠ۢ(JS)LYue/ۥۣ۠ۨ۠;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۨ۠;

    int-to-long v1, p2

    const-wide/16 v3, 0x1

    sub-long/2addr v1, v3

    invoke-direct {v0, p0, p1, v1, v2}, LYue/ۥۣ۠ۨ۠;-><init>(JJ)V

    return-object v0
.end method

.method public static final ۥۣۣ۟۠(SJ)LYue/ۥۣ۠ۨ۠;
    .locals 5
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-wide/high16 v0, -0x8000000000000000L

    cmp-long v0, p1, v0

    if-gtz v0, :cond_0

    sget-object p0, LYue/ۥۣ۠ۨ۠;->ۥ۟۟۠ۧ:LYue/ۥۣ۠ۨ۠$ۥ;

    invoke-virtual {p0}, LYue/ۥۣ۠ۨ۠$ۥ;->ۥ()LYue/ۥۣ۠ۨ۠;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۠ۨ۠;

    int-to-long v1, p0

    const-wide/16 v3, 0x1

    sub-long/2addr p1, v3

    invoke-direct {v0, v1, v2, p1, p2}, LYue/ۥۣ۠ۨ۠;-><init>(JJ)V

    return-object v0
.end method
