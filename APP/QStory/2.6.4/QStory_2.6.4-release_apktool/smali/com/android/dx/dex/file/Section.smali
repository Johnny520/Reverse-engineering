.class public abstract Lcom/android/dx/dex/file/Section;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final alignment:I

.field private final file:Lcom/android/dx/dex/file/DexFile;

.field private fileOffset:I

.field private final name:Ljava/lang/String;

.field private prepared:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/android/dx/dex/file/DexFile;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-static {p3}, Lcom/android/dx/dex/file/Section;->validateAlignment(I)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/android/dx/dex/file/Section;->name:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/dex/file/Section;->file:Lcom/android/dx/dex/file/DexFile;

    .line 12
    .line 13
    iput p3, p0, Lcom/android/dx/dex/file/Section;->alignment:I

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    iput p1, p0, Lcom/android/dx/dex/file/Section;->fileOffset:I

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-boolean p1, p0, Lcom/android/dx/dex/file/Section;->prepared:Z

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "file == null"

    .line 23
    .line 24
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    throw p0
.end method

.method public static validateAlignment(I)V
    .locals 1

    .line 1
    if-lez p0, :cond_0

    .line 2
    .line 3
    add-int/lit8 v0, p0, -0x1

    .line 4
    .line 5
    and-int/2addr p0, v0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "invalid alignment"

    .line 10
    .line 11
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final align(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/file/Section;->alignment:I

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lcom/android/dx/util/Output;->alignTo(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public abstract getAbsoluteItemOffset(Lcom/android/dx/dex/file/Item;)I
.end method

.method public final getAbsoluteOffset(I)I
    .locals 0

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget p0, p0, Lcom/android/dx/dex/file/Section;->fileOffset:I

    .line 4
    .line 5
    if-ltz p0, :cond_0

    .line 6
    .line 7
    add-int/2addr p0, p1

    .line 8
    return p0

    .line 9
    :cond_0
    const-string p0, "fileOffset not yet set"

    .line 10
    .line 11
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    const-string p0, "relative < 0"

    .line 17
    .line 18
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0
.end method

.method public final getAlignment()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/file/Section;->alignment:I

    .line 2
    .line 3
    return p0
.end method

.method public final getFile()Lcom/android/dx/dex/file/DexFile;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/Section;->file:Lcom/android/dx/dex/file/DexFile;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getFileOffset()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/file/Section;->fileOffset:I

    .line 2
    .line 3
    if-ltz p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const-string p0, "fileOffset not set"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/Section;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract items()Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "+",
            "Lcom/android/dx/dex/file/Item;",
            ">;"
        }
    .end annotation
.end method

.method public final prepare()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfPrepared()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->prepare0()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Lcom/android/dx/dex/file/Section;->prepared:Z

    .line 9
    .line 10
    return-void
.end method

.method public abstract prepare0()V
.end method

.method public final setFileOffset(I)I
    .locals 1

    .line 1
    if-ltz p1, :cond_1

    .line 2
    .line 3
    iget v0, p0, Lcom/android/dx/dex/file/Section;->fileOffset:I

    .line 4
    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lcom/android/dx/dex/file/Section;->alignment:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x1

    .line 10
    .line 11
    add-int/2addr p1, v0

    .line 12
    not-int v0, v0

    .line 13
    and-int/2addr p1, v0

    .line 14
    iput p1, p0, Lcom/android/dx/dex/file/Section;->fileOffset:I

    .line 15
    .line 16
    return p1

    .line 17
    :cond_0
    const-string p0, "fileOffset already set"

    .line 18
    .line 19
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    const-string p0, "fileOffset < 0"

    .line 25
    .line 26
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0
.end method

.method public final throwIfNotPrepared()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/dex/file/Section;->prepared:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "not prepared"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final throwIfPrepared()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/dex/file/Section;->prepared:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "already prepared"

    .line 7
    .line 8
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public abstract writeSize()I
.end method

.method public final writeTo(Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/Section;->throwIfNotPrepared()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/Section;->align(Lcom/android/dx/util/AnnotatedOutput;)V

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lcom/android/dx/util/Output;->getCursor()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget v1, p0, Lcom/android/dx/dex/file/Section;->fileOffset:I

    .line 12
    .line 13
    if-gez v1, :cond_0

    .line 14
    .line 15
    iput v0, p0, Lcom/android/dx/dex/file/Section;->fileOffset:I

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-ne v1, v0, :cond_3

    .line 19
    .line 20
    :goto_0
    invoke-interface {p1}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    iget-object v1, p0, Lcom/android/dx/dex/file/Section;->name:Ljava/lang/String;

    .line 27
    .line 28
    const-string v2, "\n"

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/android/dx/dex/file/Section;->name:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ":"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {p1, v3, v0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    if-eqz v0, :cond_2

    .line 57
    .line 58
    invoke-interface {p1, v3, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :cond_2
    :goto_1
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/Section;->writeTo0(Lcom/android/dx/util/AnnotatedOutput;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :cond_3
    new-instance p1, Ljava/lang/RuntimeException;

    .line 66
    .line 67
    new-instance v1, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    const-string v2, "alignment mismatch: for "

    .line 70
    .line 71
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget p0, p0, Lcom/android/dx/dex/file/Section;->fileOffset:I

    .line 78
    .line 79
    const-string v2, ", at "

    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v0, ", but expected "

    .line 88
    .line 89
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw p1
.end method

.method public abstract writeTo0(Lcom/android/dx/util/AnnotatedOutput;)V
.end method
