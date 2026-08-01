.class public final Lcom/android/dx/util/ByteArrayAnnotatedOutput;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/util/AnnotatedOutput;
.implements L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;
    }
.end annotation


# static fields
.field private static final DEFAULT_SIZE:I = 0x3e8


# instance fields
.field private annotationWidth:I

.field private annotations:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;",
            ">;"
        }
    .end annotation
.end field

.field private cursor:I

.field private data:[B

.field private hexCols:I

.field private final stretchy:Z

.field private verbose:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x3e8

    .line 29
    invoke-direct {p0, v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 30
    new-array p1, p1, [B

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>([BZ)V

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    const/4 v0, 0x0

    .line 31
    invoke-direct {p0, p1, v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;-><init>([BZ)V

    return-void
.end method

.method private constructor <init>([BZ)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    iput-boolean p2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    iput p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->verbose:Z

    .line 15
    .line 16
    iput-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 17
    .line 18
    iput p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotationWidth:I

    .line 19
    .line 20
    iput p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->hexCols:I

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "data == null"

    .line 24
    .line 25
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method private ensureCapacity(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    if-ge v1, p1, :cond_0

    .line 5
    .line 6
    mul-int/lit8 p1, p1, 0x2

    .line 7
    .line 8
    add-int/lit16 p1, p1, 0x3e8

    .line 9
    .line 10
    new-array p1, p1, [B

    .line 11
    .line 12
    iget v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method private static throwBounds()V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 2
    .line 3
    const-string v1, "attempt to write past the end"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method


# virtual methods
.method public alignTo(I)V
    .locals 3

    .line 1
    add-int/lit8 v0, p1, -0x1

    .line 2
    .line 3
    if-ltz p1, :cond_2

    .line 4
    .line 5
    and-int/2addr p1, v0

    .line 6
    if-nez p1, :cond_2

    .line 7
    .line 8
    iget p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 9
    .line 10
    add-int/2addr p1, v0

    .line 11
    not-int v0, v0

    .line 12
    and-int/2addr p1, v0

    .line 13
    iget-boolean v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 22
    .line 23
    array-length v0, v0

    .line 24
    if-le p1, v0, :cond_1

    .line 25
    .line 26
    invoke-static {}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 31
    .line 32
    iget v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    invoke-static {v0, v1, p1, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 36
    .line 37
    .line 38
    iput p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    const-string p0, "bogus alignment"

    .line 42
    .line 43
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public annotate(ILjava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->endAnnotation()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 20
    .line 21
    add-int/lit8 v0, v0, -0x1

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;

    .line 28
    .line 29
    invoke-virtual {v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->getEnd()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    :goto_0
    iget v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 34
    .line 35
    if-gt v0, v1, :cond_2

    .line 36
    .line 37
    move v0, v1

    .line 38
    :cond_2
    iget-object p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 39
    .line 40
    new-instance v1, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;

    .line 41
    .line 42
    add-int/2addr p1, v0

    .line 43
    invoke-direct {v1, v0, p1, p2}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;-><init>(IILjava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    return-void
.end method

.method public annotate(Ljava/lang/String;)V
    .locals 2

    .line 50
    iget-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    return-void

    .line 51
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->endAnnotation()V

    .line 52
    iget-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    new-instance v1, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;

    iget p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    invoke-direct {v1, p0, p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;-><init>(ILjava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public annotates()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public assertCursor(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lcom/android/dex/util/ExceptionWithContext;

    .line 7
    .line 8
    const-string v1, "expected cursor "

    .line 9
    .line 10
    const-string v2, "; actual value: "

    .line 11
    .line 12
    invoke-static {p1, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-direct {v0, p0}, Lcom/android/dex/util/ExceptionWithContext;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method

.method public enableAnnotations(IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 6
    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    const/16 v0, 0x28

    .line 10
    .line 11
    if-lt p1, v0, :cond_2

    .line 12
    .line 13
    add-int/lit8 v0, p1, -0x7

    .line 14
    .line 15
    div-int/lit8 v0, v0, 0xf

    .line 16
    .line 17
    add-int/lit8 v0, v0, 0x1

    .line 18
    .line 19
    and-int/lit8 v0, v0, -0x2

    .line 20
    .line 21
    const/4 v1, 0x6

    .line 22
    if-ge v0, v1, :cond_0

    .line 23
    .line 24
    :goto_0
    move v0, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    const/16 v1, 0xa

    .line 27
    .line 28
    if-le v0, v1, :cond_1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    :goto_1
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    const/16 v2, 0x3e8

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    iput-object v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 39
    .line 40
    iput p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotationWidth:I

    .line 41
    .line 42
    iput v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->hexCols:I

    .line 43
    .line 44
    iput-boolean p2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->verbose:Z

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    const-string p0, "annotationWidth < 40"

    .line 48
    .line 49
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_3
    const-string p0, "cannot enable annotations"

    .line 54
    .line 55
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public endAnnotation()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 13
    .line 14
    add-int/lit8 v0, v0, -0x1

    .line 15
    .line 16
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;

    .line 21
    .line 22
    iget p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 23
    .line 24
    invoke-virtual {v0, p0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->setEndIfUnset(I)V

    .line 25
    .line 26
    .line 27
    :cond_1
    :goto_0
    return-void
.end method

.method public finishAnnotating()V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->endAnnotation()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    if-lez v0, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 15
    .line 16
    add-int/lit8 v2, v0, -0x1

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;

    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->getStart()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    iget v4, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 29
    .line 30
    if-le v3, v4, :cond_0

    .line 31
    .line 32
    iget-object v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->getEnd()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 45
    .line 46
    if-le v0, p0, :cond_1

    .line 47
    .line 48
    invoke-virtual {v1, p0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->setEnd(I)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public getAnnotationWidth()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->hexCols:I

    .line 2
    .line 3
    mul-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    add-int/lit8 v1, v1, 0x8

    .line 6
    .line 7
    div-int/lit8 v0, v0, 0x2

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iget p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotationWidth:I

    .line 11
    .line 12
    sub-int/2addr p0, v0

    .line 13
    return p0
.end method

.method public getArray()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 2
    .line 3
    return-object p0
.end method

.method public getCursor()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 2
    .line 3
    return p0
.end method

.method public isVerbose()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->verbose:Z

    .line 2
    .line 3
    return p0
.end method

.method public toByteArray()[B
    .locals 3

    .line 1
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 2
    .line 3
    new-array v1, v0, [B

    .line 4
    .line 5
    iget-object p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p0, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    .line 10
    .line 11
    return-object v1
.end method

.method public write(Lcom/android/dx/util/ByteArray;)V
    .locals 3

    .line 52
    invoke-virtual {p1}, Lcom/android/dx/util/ByteArray;->size()I

    move-result v0

    .line 53
    iget v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    add-int/2addr v0, v1

    .line 54
    iget-boolean v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    if-eqz v2, :cond_0

    .line 55
    invoke-direct {p0, v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    goto :goto_0

    .line 56
    :cond_0
    iget-object v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    array-length v2, v2

    if-le v0, v2, :cond_1

    .line 57
    invoke-static {}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    return-void

    .line 58
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    invoke-virtual {p1, v2, v1}, Lcom/android/dx/util/ByteArray;->getBytes([BI)V

    .line 59
    iput v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    return-void
.end method

.method public write([B)V
    .locals 2

    const/4 v0, 0x0

    .line 60
    array-length v1, p1

    invoke-virtual {p0, p1, v0, v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->write([BII)V

    return-void
.end method

.method public write([BII)V
    .locals 7

    .line 1
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 2
    .line 3
    add-int v6, v0, p3

    .line 4
    .line 5
    add-int v1, p2, p3

    .line 6
    .line 7
    or-int v2, p2, p3

    .line 8
    .line 9
    or-int/2addr v2, v6

    .line 10
    if-ltz v2, :cond_2

    .line 11
    .line 12
    array-length v2, p1

    .line 13
    if-gt v1, v2, :cond_2

    .line 14
    .line 15
    iget-boolean v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    invoke-direct {p0, v6}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 24
    .line 25
    array-length v1, v1

    .line 26
    if-le v6, v1, :cond_1

    .line 27
    .line 28
    invoke-static {}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    :goto_0
    iget-object v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 33
    .line 34
    invoke-static {p1, p2, v1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    iput v6, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 38
    .line 39
    return-void

    .line 40
    :cond_2
    array-length v2, p1

    .line 41
    const-string v3, "; "

    .line 42
    .line 43
    const-string v5, "..!"

    .line 44
    .line 45
    const-string v1, "bytes.length "

    .line 46
    .line 47
    move v4, p2

    .line 48
    invoke-static/range {v1 .. v6}, Lcom/alibaba/fastjson2/飘花落叶言子苏兰世楪哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;ILjava/lang/Object;ILjava/lang/Object;I)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public writeAnnotationsTo(Ljava/io/Writer;)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->getAnnotationWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotationWidth:I

    .line 6
    .line 7
    sub-int/2addr v1, v0

    .line 8
    add-int/lit8 v1, v1, -0x1

    .line 9
    .line 10
    new-instance v2, Lcom/android/dx/util/TwoColumnOutput;

    .line 11
    .line 12
    const-string v3, "|"

    .line 13
    .line 14
    invoke-direct {v2, p1, v1, v0, v3}, Lcom/android/dx/util/TwoColumnOutput;-><init>(Ljava/io/Writer;IILjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/android/dx/util/TwoColumnOutput;->getLeft()Ljava/io/Writer;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v2}, Lcom/android/dx/util/TwoColumnOutput;->getRight()Ljava/io/Writer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/4 v3, 0x0

    .line 32
    move v5, v3

    .line 33
    :goto_0
    iget v4, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 34
    .line 35
    if-ge v5, v4, :cond_1

    .line 36
    .line 37
    if-ge v3, v1, :cond_1

    .line 38
    .line 39
    iget-object v4, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;

    .line 46
    .line 47
    invoke-virtual {v4}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->getStart()I

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-ge v5, v6, :cond_0

    .line 52
    .line 53
    const-string v4, ""

    .line 54
    .line 55
    move v11, v6

    .line 56
    move v6, v5

    .line 57
    goto :goto_1

    .line 58
    :cond_0
    invoke-virtual {v4}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->getEnd()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-virtual {v4}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->getText()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    move v11, v5

    .line 69
    :goto_1
    iget-object v5, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 70
    .line 71
    sub-int v7, v11, v6

    .line 72
    .line 73
    iget v9, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->hexCols:I

    .line 74
    .line 75
    const/4 v10, 0x6

    .line 76
    move v8, v6

    .line 77
    invoke-static/range {v5 .. v10}, Lcom/android/dx/util/Hex;->dump([BIIIII)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {p1, v5}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Lcom/android/dx/util/TwoColumnOutput;->flush()V

    .line 88
    .line 89
    .line 90
    move v5, v11

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    if-ge v5, v4, :cond_2

    .line 93
    .line 94
    move v6, v4

    .line 95
    iget-object v4, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 96
    .line 97
    sub-int/2addr v6, v5

    .line 98
    iget v8, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->hexCols:I

    .line 99
    .line 100
    const/4 v9, 0x6

    .line 101
    move v7, v5

    .line 102
    invoke-static/range {v4 .. v9}, Lcom/android/dx/util/Hex;->dump([BIIIII)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-virtual {p1, v4}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    :cond_2
    :goto_2
    if-ge v3, v1, :cond_3

    .line 110
    .line 111
    iget-object p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->annotations:Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    check-cast p1, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;

    .line 118
    .line 119
    invoke-virtual {p1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput$Annotation;->getText()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {v0, p1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    add-int/lit8 v3, v3, 0x1

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :cond_3
    invoke-virtual {v2}, Lcom/android/dx/util/TwoColumnOutput;->flush()V

    .line 130
    .line 131
    .line 132
    return-void
.end method

.method public writeByte(I)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 14
    .line 15
    array-length v2, v2

    .line 16
    if-le v1, v2, :cond_1

    .line 17
    .line 18
    invoke-static {}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 23
    .line 24
    int-to-byte p1, p1

    .line 25
    aput-byte p1, v2, v0

    .line 26
    .line 27
    iput v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 28
    .line 29
    return-void
.end method

.method public writeInt(I)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x4

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 14
    .line 15
    array-length v2, v2

    .line 16
    if-le v1, v2, :cond_1

    .line 17
    .line 18
    invoke-static {}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 23
    .line 24
    int-to-byte v3, p1

    .line 25
    aput-byte v3, v2, v0

    .line 26
    .line 27
    add-int/lit8 v3, v0, 0x1

    .line 28
    .line 29
    shr-int/lit8 v4, p1, 0x8

    .line 30
    .line 31
    int-to-byte v4, v4

    .line 32
    aput-byte v4, v2, v3

    .line 33
    .line 34
    add-int/lit8 v3, v0, 0x2

    .line 35
    .line 36
    shr-int/lit8 v4, p1, 0x10

    .line 37
    .line 38
    int-to-byte v4, v4

    .line 39
    aput-byte v4, v2, v3

    .line 40
    .line 41
    add-int/lit8 v0, v0, 0x3

    .line 42
    .line 43
    shr-int/lit8 p1, p1, 0x18

    .line 44
    .line 45
    int-to-byte p1, p1

    .line 46
    aput-byte p1, v2, v0

    .line 47
    .line 48
    iput v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 49
    .line 50
    return-void
.end method

.method public writeLong(J)V
    .locals 6

    .line 1
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x8

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 14
    .line 15
    array-length v2, v2

    .line 16
    if-le v1, v2, :cond_1

    .line 17
    .line 18
    invoke-static {}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    :goto_0
    long-to-int v2, p1

    .line 23
    iget-object v3, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 24
    .line 25
    int-to-byte v4, v2

    .line 26
    aput-byte v4, v3, v0

    .line 27
    .line 28
    add-int/lit8 v4, v0, 0x1

    .line 29
    .line 30
    shr-int/lit8 v5, v2, 0x8

    .line 31
    .line 32
    int-to-byte v5, v5

    .line 33
    aput-byte v5, v3, v4

    .line 34
    .line 35
    add-int/lit8 v4, v0, 0x2

    .line 36
    .line 37
    shr-int/lit8 v5, v2, 0x10

    .line 38
    .line 39
    int-to-byte v5, v5

    .line 40
    aput-byte v5, v3, v4

    .line 41
    .line 42
    add-int/lit8 v4, v0, 0x3

    .line 43
    .line 44
    shr-int/lit8 v2, v2, 0x18

    .line 45
    .line 46
    int-to-byte v2, v2

    .line 47
    aput-byte v2, v3, v4

    .line 48
    .line 49
    const/16 v2, 0x20

    .line 50
    .line 51
    shr-long/2addr p1, v2

    .line 52
    long-to-int p1, p1

    .line 53
    add-int/lit8 p2, v0, 0x4

    .line 54
    .line 55
    int-to-byte v2, p1

    .line 56
    aput-byte v2, v3, p2

    .line 57
    .line 58
    add-int/lit8 p2, v0, 0x5

    .line 59
    .line 60
    shr-int/lit8 v2, p1, 0x8

    .line 61
    .line 62
    int-to-byte v2, v2

    .line 63
    aput-byte v2, v3, p2

    .line 64
    .line 65
    add-int/lit8 p2, v0, 0x6

    .line 66
    .line 67
    shr-int/lit8 v2, p1, 0x10

    .line 68
    .line 69
    int-to-byte v2, v2

    .line 70
    aput-byte v2, v3, p2

    .line 71
    .line 72
    add-int/lit8 v0, v0, 0x7

    .line 73
    .line 74
    shr-int/lit8 p1, p1, 0x18

    .line 75
    .line 76
    int-to-byte p1, p1

    .line 77
    aput-byte p1, v3, v0

    .line 78
    .line 79
    iput v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 80
    .line 81
    return-void
.end method

.method public writeShort(I)V
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x2

    .line 4
    .line 5
    iget-boolean v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-direct {p0, v1}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 14
    .line 15
    array-length v2, v2

    .line 16
    if-le v1, v2, :cond_1

    .line 17
    .line 18
    invoke-static {}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    :goto_0
    iget-object v2, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 23
    .line 24
    int-to-byte v3, p1

    .line 25
    aput-byte v3, v2, v0

    .line 26
    .line 27
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    shr-int/lit8 p1, p1, 0x8

    .line 30
    .line 31
    int-to-byte p1, p1

    .line 32
    aput-byte p1, v2, v0

    .line 33
    .line 34
    iput v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 35
    .line 36
    return-void
.end method

.method public writeSleb128(I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x5

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 13
    .line 14
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子哲楪世兰苏(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;I)V

    .line 15
    .line 16
    .line 17
    iget p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 18
    .line 19
    sub-int/2addr p0, v0

    .line 20
    return p0
.end method

.method public writeUleb128(I)I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x5

    .line 8
    .line 9
    invoke-direct {p0, v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 13
    .line 14
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子哲楪苏世兰(L飘花落叶言楪子兰世苏哲/飘花落叶言子楪世苏兰哲;I)V

    .line 15
    .line 16
    .line 17
    iget p0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 18
    .line 19
    sub-int/2addr p0, v0

    .line 20
    return p0
.end method

.method public writeZeroes(I)V
    .locals 3

    .line 1
    if-ltz p1, :cond_2

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 4
    .line 5
    add-int/2addr v0, p1

    .line 6
    iget-boolean p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->stretchy:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->ensureCapacity(I)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 15
    .line 16
    array-length p1, p1

    .line 17
    if-le v0, p1, :cond_1

    .line 18
    .line 19
    invoke-static {}, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->throwBounds()V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->data:[B

    .line 24
    .line 25
    iget v1, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    invoke-static {p1, v1, v0, v2}, Ljava/util/Arrays;->fill([BIIB)V

    .line 29
    .line 30
    .line 31
    iput v0, p0, Lcom/android/dx/util/ByteArrayAnnotatedOutput;->cursor:I

    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    const-string p0, "count < 0"

    .line 35
    .line 36
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
