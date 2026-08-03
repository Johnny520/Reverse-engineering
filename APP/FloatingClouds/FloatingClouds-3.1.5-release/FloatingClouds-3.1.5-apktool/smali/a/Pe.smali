.class public La/Pe;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:Ljava/nio/ByteBuffer;

.field public c:I

.field public d:I

.field public final e:La/ag;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, La/ag;->a:La/bg;

    if-nez v0, :cond_0

    new-instance v0, La/bg;

    invoke-direct {v0}, La/ag;-><init>()V

    sput-object v0, La/ag;->a:La/bg;

    :cond_0
    sget-object v0, La/ag;->a:La/bg;

    iput-object v0, p0, La/Pe;->e:La/ag;

    return-void
.end method


# virtual methods
.method public final a(I)I
    .locals 1

    iget-object v0, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    return v0
.end method

.method public final b(I)I
    .locals 2

    iget v0, p0, La/Pe;->d:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    iget v1, p0, La/Pe;->c:I

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(ILjava/nio/ByteBuffer;)V
    .locals 0

    iput-object p2, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    if-eqz p2, :cond_0

    iput p1, p0, La/Pe;->a:I

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p2

    sub-int/2addr p1, p2

    iput p1, p0, La/Pe;->c:I

    iget-object p2, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p1}, Ljava/nio/ByteBuffer;->getShort(I)S

    move-result p1

    iput p1, p0, La/Pe;->d:I

    return-void

    :cond_0
    const/4 p1, 0x0

    iput p1, p0, La/Pe;->a:I

    iput p1, p0, La/Pe;->c:I

    iput p1, p0, La/Pe;->d:I

    return-void
.end method

.method public final d(I)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v1

    add-int/2addr v1, p1

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    add-int/lit8 v1, v1, 0x4

    iget-object v2, p0, La/Pe;->e:La/ag;

    invoke-virtual {v2, v0, v1, p1}, La/ag;->a(Ljava/nio/ByteBuffer;II)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final e(I)I
    .locals 1

    iget v0, p0, La/Pe;->a:I

    add-int/2addr p1, v0

    iget-object v0, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    add-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public final f(I)I
    .locals 1

    iget v0, p0, La/Pe;->a:I

    add-int/2addr p1, v0

    iget-object v0, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result v0

    add-int/2addr v0, p1

    iget-object p1, p0, La/Pe;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1, v0}, Ljava/nio/ByteBuffer;->getInt(I)I

    move-result p1

    return p1
.end method
