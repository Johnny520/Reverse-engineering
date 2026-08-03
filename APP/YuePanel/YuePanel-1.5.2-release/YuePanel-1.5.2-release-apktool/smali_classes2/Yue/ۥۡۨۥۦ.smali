.class public final LYue/ۥۡۨۥۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۨۥۦ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟:LYue/ۥۡۨۥۦ$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟:I = 0xffff

.field public static final ۥ۟۟۟۟:I = 0x1

.field public static final ۥ۟۟۟۠:I = 0x2

.field public static final ۥ۟۟۟ۡ:I = 0x4

.field public static final ۥ۟۟۟ۢ:I = 0x5

.field public static final ۥۣ۟۟۟:I = 0x6

.field public static final ۥ۟۟۟ۤ:I = 0x7

.field public static final ۥ۟۟۟ۥ:I = 0xa


# instance fields
.field public ۥ:I

.field public final ۥ۟:[I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۡۨۥۦ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۡۨۥۦ$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۡۨۥۦ;->ۥ۟۟:LYue/ۥۡۨۥۦ$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xa

    new-array v0, v0, [I

    iput-object v0, p0, LYue/ۥۡۨۥۦ;->ۥ۟:[I

    return-void
.end method


# virtual methods
.method public final ۥ()V
    .locals 7

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    iget-object v1, p0, LYue/ۥۡۨۥۦ;->ۥ۟:[I

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, LYue/ۥ۟ۢ۟۟;->ۥ۟۠ۢ۠([IIIIILjava/lang/Object;)V

    return-void
.end method

.method public final ۥ۟(I)I
    .locals 1

    iget-object v0, p0, LYue/ۥۡۨۥۦ;->ۥ۟:[I

    aget p1, v0, p1

    return p1
.end method

.method public final ۥ۟۟(Z)Z
    .locals 1

    iget v0, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    iget-object p1, p0, LYue/ۥۡۨۥۦ;->ۥ۟:[I

    const/4 v0, 0x2

    aget p1, p1, v0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    move p1, v0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :cond_1
    :goto_0
    return p1
.end method

.method public final ۥ۟۟۟()I
    .locals 2

    iget v0, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۨۥۦ;->ۥ۟:[I

    const/4 v1, 0x1

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, -0x1

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟۟()I
    .locals 2

    iget v0, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۨۥۦ;->ۥ۟:[I

    const/4 v1, 0x7

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    const v0, 0xffff

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟۠()I
    .locals 2

    iget v0, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۡۨۥۦ;->ۥ۟:[I

    const/4 v1, 0x4

    aget v0, v0, v1

    goto :goto_0

    :cond_0
    const v0, 0x7fffffff

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۡ(I)I
    .locals 1

    iget v0, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    iget-object p1, p0, LYue/ۥۡۨۥۦ;->ۥ۟:[I

    const/4 v0, 0x5

    aget p1, p1, v0

    :cond_0
    return p1
.end method

.method public final ۥ۟۟۟ۢ(I)I
    .locals 1

    iget v0, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    iget-object p1, p0, LYue/ۥۡۨۥۦ;->ۥ۟:[I

    const/4 v0, 0x6

    aget p1, p1, v0

    :cond_0
    return p1
.end method

.method public final ۥۣ۟۟۟(I)Z
    .locals 2

    const/4 v0, 0x1

    shl-int p1, v0, p1

    iget v1, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    and-int/2addr p1, v1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۤ(LYue/ۥۡۨۥۦ;)V
    .locals 2
    .param p1    # LYue/ۥۡۨۥۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "other"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, LYue/ۥۡۨۥۦ;->ۥۣ۟۟۟(I)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, LYue/ۥۡۨۥۦ;->ۥ۟(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, LYue/ۥۡۨۥۦ;->ۥ۟۟۟ۥ(II)LYue/ۥۡۨۥۦ;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final ۥ۟۟۟ۥ(II)LYue/ۥۡۨۥۦ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    if-ltz p1, :cond_1

    iget-object v0, p0, LYue/ۥۡۨۥۦ;->ۥ۟:[I

    array-length v1, v0

    if-lt p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    shl-int/2addr v1, p1

    iget v2, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    or-int/2addr v1, v2

    iput v1, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    aput p2, v0, p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public final ۥ۟۟۟ۦ()I
    .locals 1

    iget v0, p0, LYue/ۥۡۨۥۦ;->ۥ:I

    invoke-static {v0}, Ljava/lang/Integer;->bitCount(I)I

    move-result v0

    return v0
.end method
