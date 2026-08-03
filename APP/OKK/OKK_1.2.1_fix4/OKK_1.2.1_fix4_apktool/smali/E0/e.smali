.class public final LE0/e;
.super LE0/f;
.source "SourceFile"

# interfaces
.implements Ljava/util/RandomAccess;


# instance fields
.field public final a:LE0/f;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(LE0/f;II)V
    .locals 1

    const-string v0, "list"

    invoke-static {p1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LE0/f;-><init>()V

    iput-object p1, p0, LE0/e;->a:LE0/f;

    iput p2, p0, LE0/e;->b:I

    invoke-virtual {p1}, LE0/f;->a()I

    move-result p1

    invoke-static {p2, p3, p1}, LA0/p;->j(III)V

    sub-int/2addr p3, p2

    iput p3, p0, LE0/e;->c:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, LE0/e;->c:I

    return v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 4

    iget v0, p0, LE0/e;->c:I

    if-ltz p1, :cond_0

    if-ge p1, v0, :cond_0

    iget v0, p0, LE0/e;->b:I

    add-int/2addr v0, p1

    iget-object p1, p0, LE0/e;->a:LE0/f;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    const-string v2, "index: "

    const-string v3, ", size: "

    invoke-static {v2, p1, v3, v0}, LS/d;->d(Ljava/lang/String;ILjava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
