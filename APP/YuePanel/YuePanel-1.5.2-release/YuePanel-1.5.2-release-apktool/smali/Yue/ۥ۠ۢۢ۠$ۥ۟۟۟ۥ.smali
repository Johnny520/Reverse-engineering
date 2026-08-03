.class public LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;
.super LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۢۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;

    invoke-static {}, LYue/ۥ۠ۢۢ۠;->ۥ()LYue/ۥۡۦ۟ۢ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;-><init>(LYue/ۥۡۦ۟ۢ;II)V

    sput-object v0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;->ۥ۟۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦ۟ۢ;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۢ;-><init>(LYue/ۥۡۦ۟ۢ;II)V

    return-void
.end method

.method public static ۥ۟۟()LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;
    .locals 1

    sget-object v0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;->ۥ۟۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;

    return-object v0
.end method


# virtual methods
.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 3

    const-string v0, "[ "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;->ۥ۟()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;->ۥ۟۟۟(I)LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;

    move-result-object v2

    invoke-virtual {v2, p1}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;->ۥ۟۟ۡ(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v0, -0x1

    if-eq v1, v2, :cond_0

    const-string v2, ", "

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    const-string v0, " ]"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p1
.end method

.method public bridge synthetic ۥ۟()I
    .locals 1

    invoke-super {p0}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۢ;->ۥ۟()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟(I)LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;
    .locals 9

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;->ۥ۟()I

    move-result v0

    int-to-long v0, v0

    int-to-long v2, p1

    cmp-long v4, v2, v0

    if-ltz v4, :cond_0

    invoke-static {}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;->ۥ()LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v4, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    iget v5, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    int-to-long v5, v5

    iget v7, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟۟:I

    int-to-long v7, v7

    mul-long/2addr v0, v7

    add-long/2addr v5, v0

    add-long/2addr v5, v2

    long-to-int v0, v5

    invoke-interface {v4, v0}, LYue/ۥۡۦ۟ۢ;->get(I)B

    move-result v0

    invoke-static {v0}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۤ;->ۥ(B)I

    move-result v0

    iget v1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    iget v2, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟۟:I

    mul-int/2addr p1, v2

    add-int/2addr v1, p1

    new-instance p1, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;

    iget-object v2, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    iget v3, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟۟:I

    invoke-direct {p1, v2, v1, v3, v0}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۡ;-><init>(LYue/ۥۡۦ۟ۢ;III)V

    return-object p1
.end method

.method public ۥ۟۟۟۟()Z
    .locals 1

    sget-object v0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;->ۥ۟۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۥ;

    if-ne p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
