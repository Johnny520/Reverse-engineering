.class public final LYue/ۥۡۥۡۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۥۡۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public static ۥ(LYue/ۥۡۥۡۤ;Ljava/lang/Object;)Z
    .locals 0
    .param p0    # LYue/ۥۡۥۡۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۤ:LYue/ۥ۠;
        message = "Deprecated in the favour of \'trySend\' method"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "trySend(element).isSuccess"
            imports = {}
        .end subannotation
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TE;>;TE;)Z"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۡۨۡ۠$ۥ;->ۥ۟۟(LYue/ۥۡۨۡ۠;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method
