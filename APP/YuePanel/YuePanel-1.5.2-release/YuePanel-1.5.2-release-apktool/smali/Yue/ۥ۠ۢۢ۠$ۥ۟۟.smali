.class public LYue/ۥ۠ۢۢ۠$ۥ۟۟;
.super LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۢۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation


# static fields
.field public static final ۥ۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ۟۟;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۠ۢۢ۠$ۥ۟۟;

    invoke-static {}, LYue/ۥ۠ۢۢ۠;->ۥ()LYue/ۥۡۦ۟ۢ;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, LYue/ۥ۠ۢۢ۠$ۥ۟۟;-><init>(LYue/ۥۡۦ۟ۢ;II)V

    sput-object v0, LYue/ۥ۠ۢۢ۠$ۥ۟۟;->ۥ۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ۟۟;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦ۟ۢ;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;-><init>(LYue/ۥۡۦ۟ۢ;II)V

    return-void
.end method

.method public static synthetic ۥ۟()LYue/ۥ۠ۢۢ۠$ۥ۟۟;
    .locals 1

    sget-object v0, LYue/ۥ۠ۢۢ۠$ۥ۟۟;->ۥ۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ۟۟;

    return-object v0
.end method

.method public static ۥ۟۟۟()LYue/ۥ۠ۢۢ۠$ۥ۟۟;
    .locals 1

    sget-object v0, LYue/ۥ۠ۢۢ۠$ۥ۟۟;->ۥ۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ۟۟;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, LYue/ۥ۠ۢۢ۠$ۥ۟۟;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LYue/ۥ۠ۢۢ۠$ۥ۟۟;

    iget v0, p1, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    iget v2, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    if-ne v0, v2, :cond_1

    iget p1, p1, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟۟:I

    iget v0, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟۟:I

    if-ne p1, v0, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    iget v1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟۟:I

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    :goto_0
    iget-object v1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    invoke-interface {v1, v0}, LYue/ۥۡۦ۟ۢ;->get(I)B

    move-result v1

    if-nez v1, :cond_0

    iget v1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    sub-int/2addr v0, v1

    iget-object v2, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    invoke-interface {v2, v1, v0}, LYue/ۥۡۦ۟ۢ;->getString(II)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public ۥ(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ۠$ۥ۟۟;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p1
.end method

.method public ۥ۟۟([B)I
    .locals 5

    iget v0, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    const/4 v1, 0x0

    :cond_0
    iget-object v2, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    invoke-interface {v2, v0}, LYue/ۥۡۦ۟ۢ;->get(I)B

    move-result v2

    aget-byte v3, p1, v1

    if-nez v2, :cond_1

    sub-int/2addr v2, v3

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    array-length v4, p1

    if-ne v1, v4, :cond_2

    sub-int/2addr v2, v3

    return v2

    :cond_2
    if-eq v2, v3, :cond_0

    sub-int/2addr v2, v3

    return v2
.end method
