.class public final LYue/ۥۢ۟ۤ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic ۥ(Landroid/text/Spanned;II)[Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/text/Spanned;",
            "II)[TT;"
        }
    .end annotation

    const/4 v0, 0x4

    const-string v1, "T"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    const-class v0, Ljava/lang/Object;

    invoke-interface {p0, p1, p2, v0}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic ۥ۟(Landroid/text/Spanned;IIILjava/lang/Object;)[Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    :cond_1
    const/4 p3, 0x4

    const-string p4, "T"

    invoke-static {p3, p4}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    const-class p3, Ljava/lang/Object;

    invoke-interface {p0, p1, p2, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(Ljava/lang/CharSequence;)Landroid/text/Spanned;
    .locals 0
    .param p0    # Ljava/lang/CharSequence;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p0}, Landroid/text/SpannedString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannedString;

    move-result-object p0

    return-object p0
.end method
