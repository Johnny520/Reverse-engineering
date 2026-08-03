.class public final LYue/ۥ۟ۢۥ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥ۟ۢۥ;Ljava/lang/CharSequence;II)[B
    .locals 1
    .annotation build LYue/ۥۣ۠ۡۤ;
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    invoke-virtual {p0, v0, p2, p3}, LYue/ۥ۟ۢۥ;->ۥ۟۟۟ۡ(III)V

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1, p2, p3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p0

    const-string p1, "this as java.lang.String\u2026ing(startIndex, endIndex)"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, LYue/ۥ۟ۤۤ۠;->ۥ۟۟۟ۡ:Ljava/nio/charset/Charset;

    const-string p2, "null cannot be cast to non-null type java.lang.String"

    invoke-static {p0, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    const-string p1, "this as java.lang.String).getBytes(charset)"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟ۢۥ;->ۥ۟۟۟۟(Ljava/lang/CharSequence;II)[B

    move-result-object p0

    :goto_0
    return-object p0
.end method

.method public static final ۥ۟(LYue/ۥ۟ۢۥ;[B[BIII)I
    .locals 1
    .annotation build LYue/ۥۣ۠ۡۤ;
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p5}, LYue/ۥ۟ۢۥ;->ۥ۟۟۠ۥ([B[BIII)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟(LYue/ۥ۟ۢۥ;[BII)[B
    .locals 1
    .annotation build LYue/ۥۣ۠ۡۤ;
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟ۢۥ;->ۥ۟۟ۡ۠([BII)[B

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥ۟ۢۥ;[BII)Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۣ۠ۡۤ;
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "source"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟ۢۥ;->ۥ۟۟ۡ۠([BII)[B

    move-result-object p0

    new-instance p1, Ljava/lang/String;

    sget-object p2, LYue/ۥ۟ۤۤ۠;->ۥ۟۟۟ۡ:Ljava/nio/charset/Charset;

    invoke-direct {p1, p0, p2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p1
.end method
