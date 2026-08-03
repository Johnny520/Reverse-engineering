.class public final LYue/ۥ۟۟۟ۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۦۡ۠;
    name = "-GzipSourceExtensions"
.end annotation


# static fields
.field public static final ۥ:I = 0x1

.field public static final ۥ۟:I = 0x2

.field public static final ۥ۟۟:I = 0x3

.field public static final ۥ۟۟۟:I = 0x4

.field public static final ۥ۟۟۟۟:B = 0x0t

.field public static final ۥ۟۟۟۠:B = 0x1t

.field public static final ۥ۟۟۟ۡ:B = 0x2t

.field public static final ۥ۟۟۟ۢ:B = 0x3t


# direct methods
.method public static final ۥ(II)Z
    .locals 0

    shr-int/2addr p0, p1

    const/4 p1, 0x1

    and-int/2addr p0, p1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public static final ۥ۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥ۠ۤ۠۠;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۤ۠۠;

    invoke-direct {v0, p0}, LYue/ۥ۠ۤ۠۠;-><init>(LYue/ۥۣۢ۟ۦ;)V

    return-object v0
.end method
