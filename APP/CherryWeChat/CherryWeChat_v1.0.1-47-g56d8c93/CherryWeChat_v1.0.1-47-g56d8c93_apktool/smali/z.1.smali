.class public final Lz;
.super LA;
.source ""

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final a:LA;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(LA;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz;->a:LA;

    iput p2, p0, Lz;->b:I

    invoke-virtual {p1}, LA;->a()I

    move-result p1

    invoke-static {p2, p3, p1}, LNj;->d(III)V

    sub-int/2addr p3, p2

    iput p3, p0, Lz;->c:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lz;->c:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lz;->c:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    iget v0, p0, Lz;->b:I

    add-int/2addr v0, p1

    iget-object p1, p0, Lz;->a:LA;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "index: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", size: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    iget v0, p0, Lz;->c:I

    invoke-static {p1, p2, v0}, LNj;->d(III)V

    new-instance v0, Lz;

    iget v1, p0, Lz;->b:I

    add-int/2addr p1, v1

    add-int/2addr v1, p2

    iget-object p2, p0, Lz;->a:LA;

    invoke-direct {v0, p2, p1, v1}, Lz;-><init>(LA;II)V

    return-object v0
.end method
