.class public final LYue/ۥ۟ۦۨ۠$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۦۨ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۨۥۢ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥ۟ۦۨ۠$ۥ;-><init>()V

    return-void
.end method

.method public static synthetic ۥ۟(LYue/ۥ۟ۦۨ۠$ۥ;IIIILjava/lang/Object;)Z
    .locals 1

    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p2, v0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    move p3, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟ۦۨ۠$ۥ;->ۥ(III)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final ۥ(III)Z
    .locals 4

    invoke-static {}, Lorg/conscrypt/Conscrypt;->version()Lorg/conscrypt/Conscrypt$Version;

    move-result-object v0

    invoke-virtual {v0}, Lorg/conscrypt/Conscrypt$Version;->major()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, p1, :cond_1

    invoke-virtual {v0}, Lorg/conscrypt/Conscrypt$Version;->major()I

    move-result p2

    if-le p2, p1, :cond_0

    move v2, v3

    :cond_0
    return v2

    :cond_1
    invoke-virtual {v0}, Lorg/conscrypt/Conscrypt$Version;->minor()I

    move-result p1

    if-eq p1, p2, :cond_3

    invoke-virtual {v0}, Lorg/conscrypt/Conscrypt$Version;->minor()I

    move-result p1

    if-le p1, p2, :cond_2

    move v2, v3

    :cond_2
    return v2

    :cond_3
    invoke-virtual {v0}, Lorg/conscrypt/Conscrypt$Version;->patch()I

    move-result p1

    if-lt p1, p3, :cond_4

    move v2, v3

    :cond_4
    return v2
.end method

.method public final ۥ۟۟()LYue/ۥ۟ۦۨ۠;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟ۦۨ۠$ۥ;->ۥ۟۟۟()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v0, LYue/ۥ۟ۦۨ۠;

    invoke-direct {v0, v1}, LYue/ۥ۟ۦۨ۠;-><init>(LYue/ۥ۟ۨۥۢ;)V

    move-object v1, v0

    :cond_0
    return-object v1
.end method

.method public final ۥ۟۟۟()Z
    .locals 1

    invoke-static {}, LYue/ۥ۟ۦۨ۠;->ۥۣ۟۟۠()Z

    move-result v0

    return v0
.end method
