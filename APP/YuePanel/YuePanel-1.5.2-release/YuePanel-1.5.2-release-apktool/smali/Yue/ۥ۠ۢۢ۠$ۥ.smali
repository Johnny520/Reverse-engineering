.class public LYue/ۥ۠ۢۢ۠$ۥ;
.super LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۢۢ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# static fields
.field public static final ۥ۟۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ;

.field public static final synthetic ۥ۟۟۟۠:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۠ۢۢ۠$ۥ;

    invoke-static {}, LYue/ۥ۠ۢۢ۠;->ۥ()LYue/ۥۡۦ۟ۢ;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, LYue/ۥ۠ۢۢ۠$ۥ;-><init>(LYue/ۥۡۦ۟ۢ;II)V

    sput-object v0, LYue/ۥ۠ۢۢ۠$ۥ;->ۥ۟۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۦ۟ۢ;II)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۢ;-><init>(LYue/ۥۡۦ۟ۢ;II)V

    return-void
.end method

.method public static ۥ۟۟۟()LYue/ۥ۠ۢۢ۠$ۥ;
    .locals 1

    sget-object v0, LYue/ۥ۠ۢۢ۠$ۥ;->ۥ۟۟۟۟:LYue/ۥ۠ۢۢ۠$ۥ;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    iget v1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ۠$ۥ;->ۥ۟()I

    move-result v2

    invoke-interface {v0, v1, v2}, LYue/ۥۡۦ۟ۢ;->getString(II)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(Ljava/lang/StringBuilder;)Ljava/lang/StringBuilder;
    .locals 4

    const/16 v0, 0x22

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    iget v2, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ۠$ۥ;->ۥ۟()I

    move-result v3

    invoke-interface {v1, v2, v3}, LYue/ۥۡۦ۟ۢ;->getString(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p1
.end method

.method public bridge synthetic ۥ۟()I
    .locals 1

    invoke-super {p0}, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟ۢ;->ۥ۟()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟()Ljava/nio/ByteBuffer;
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    invoke-interface {v0}, LYue/ۥۡۦ۟ۢ;->data()[B

    move-result-object v0

    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget v1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ۠$ۥ;->ۥ۟()I

    move-result v2

    add-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->limit(I)Ljava/nio/Buffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asReadOnlyBuffer()Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->slice()Ljava/nio/ByteBuffer;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟۟(I)B
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    iget v1, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    add-int/2addr v1, p1

    invoke-interface {v0, v1}, LYue/ۥۡۦ۟ۢ;->get(I)B

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟۠()[B
    .locals 5

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ۠$ۥ;->ۥ۟()I

    move-result v0

    new-array v1, v0, [B

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ:LYue/ۥۡۦ۟ۢ;

    iget v4, p0, LYue/ۥ۠ۢۢ۠$ۥ۟۟۟۠;->ۥ۟:I

    add-int/2addr v4, v2

    invoke-interface {v3, v4}, LYue/ۥۡۦ۟ۢ;->get(I)B

    move-result v3

    aput-byte v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method
