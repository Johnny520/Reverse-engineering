.class public final LYue/ۥ۠ۨۦۨ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨۦۨ;
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
    invoke-direct {p0}, LYue/ۥ۠ۨۦۨ$ۥ;-><init>()V

    return-void
.end method

.method public static final synthetic ۥ(LYue/ۥ۠ۨۦۨ$ۥ;I)I
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۨۦۨ$ۥ;->ۥ۟۟(I)I

    move-result p0

    return p0
.end method

.method public static final synthetic ۥ۟(LYue/ۥ۠ۨۦۨ$ۥ;I)I
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۨۦۨ$ۥ;->ۥ۟۟۟(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final ۥ۟۟(I)I
    .locals 1

    const/4 v0, 0x1

    invoke-static {p1, v0}, LYue/ۥۡۦ۟;->ۥ۟۟۠ۤ(II)I

    move-result p1

    mul-int/lit8 p1, p1, 0x3

    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟(I)I
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    return p1
.end method

.method public final ۥ۟۟۟۟()LYue/ۥ۠ۨۦۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۨۦۨ;->ۥ۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v0

    return-object v0
.end method
