.class public final Lcom/android/dx/util/IndentingWriter;
.super Ljava/io/FilterWriter;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field private collectingIndent:Z

.field private column:I

.field private indent:I

.field private final maxIndent:I

.field private final prefix:Ljava/lang/String;

.field private final width:I


# direct methods
.method public constructor <init>(Ljava/io/Writer;I)V
    .locals 1

    .line 55
    const-string v0, ""

    invoke-direct {p0, p1, p2, v0}, Lcom/android/dx/util/IndentingWriter;-><init>(Ljava/io/Writer;ILjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/Writer;ILjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterWriter;-><init>(Ljava/io/Writer;)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_4

    .line 6
    .line 7
    if-ltz p2, :cond_3

    .line 8
    .line 9
    if-eqz p3, :cond_2

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    move p1, p2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const p1, 0x7fffffff

    .line 16
    .line 17
    .line 18
    :goto_0
    iput p1, p0, Lcom/android/dx/util/IndentingWriter;->width:I

    .line 19
    .line 20
    shr-int/lit8 p1, p2, 0x1

    .line 21
    .line 22
    iput p1, p0, Lcom/android/dx/util/IndentingWriter;->maxIndent:I

    .line 23
    .line 24
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    move-object p3, v0

    .line 31
    :cond_1
    iput-object p3, p0, Lcom/android/dx/util/IndentingWriter;->prefix:Ljava/lang/String;

    .line 32
    .line 33
    invoke-direct {p0}, Lcom/android/dx/util/IndentingWriter;->bol()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_2
    const-string p0, "prefix == null"

    .line 38
    .line 39
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0

    .line 43
    :cond_3
    const-string p0, "width < 0"

    .line 44
    .line 45
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_4
    const-string p0, "out == null"

    .line 50
    .line 51
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method private bol()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/android/dx/util/IndentingWriter;->column:I

    .line 3
    .line 4
    iget v1, p0, Lcom/android/dx/util/IndentingWriter;->maxIndent:I

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v1, v0

    .line 11
    :goto_0
    iput-boolean v1, p0, Lcom/android/dx/util/IndentingWriter;->collectingIndent:Z

    .line 12
    .line 13
    iput v0, p0, Lcom/android/dx/util/IndentingWriter;->indent:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public write(I)V
    .locals 6

    .line 1
    iget-object v0, p0, Ljava/io/FilterWriter;->lock:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, Lcom/android/dx/util/IndentingWriter;->collectingIndent:Z

    .line 5
    .line 6
    const/16 v2, 0x20

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne p1, v2, :cond_0

    .line 12
    .line 13
    iget v1, p0, Lcom/android/dx/util/IndentingWriter;->indent:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    iput v1, p0, Lcom/android/dx/util/IndentingWriter;->indent:I

    .line 18
    .line 19
    iget v4, p0, Lcom/android/dx/util/IndentingWriter;->maxIndent:I

    .line 20
    .line 21
    if-lt v1, v4, :cond_1

    .line 22
    .line 23
    iput v4, p0, Lcom/android/dx/util/IndentingWriter;->indent:I

    .line 24
    .line 25
    iput-boolean v3, p0, Lcom/android/dx/util/IndentingWriter;->collectingIndent:Z

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p0

    .line 29
    goto :goto_3

    .line 30
    :cond_0
    iput-boolean v3, p0, Lcom/android/dx/util/IndentingWriter;->collectingIndent:Z

    .line 31
    .line 32
    :cond_1
    :goto_0
    iget v1, p0, Lcom/android/dx/util/IndentingWriter;->column:I

    .line 33
    .line 34
    iget v4, p0, Lcom/android/dx/util/IndentingWriter;->width:I

    .line 35
    .line 36
    const/16 v5, 0xa

    .line 37
    .line 38
    if-ne v1, v4, :cond_2

    .line 39
    .line 40
    if-eq p1, v5, :cond_2

    .line 41
    .line 42
    iget-object v1, p0, Ljava/io/FilterWriter;->out:Ljava/io/Writer;

    .line 43
    .line 44
    invoke-virtual {v1, v5}, Ljava/io/Writer;->write(I)V

    .line 45
    .line 46
    .line 47
    iput v3, p0, Lcom/android/dx/util/IndentingWriter;->column:I

    .line 48
    .line 49
    :cond_2
    iget v1, p0, Lcom/android/dx/util/IndentingWriter;->column:I

    .line 50
    .line 51
    if-nez v1, :cond_5

    .line 52
    .line 53
    iget-object v1, p0, Lcom/android/dx/util/IndentingWriter;->prefix:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v1, :cond_3

    .line 56
    .line 57
    iget-object v4, p0, Ljava/io/FilterWriter;->out:Ljava/io/Writer;

    .line 58
    .line 59
    invoke-virtual {v4, v1}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    iget-boolean v1, p0, Lcom/android/dx/util/IndentingWriter;->collectingIndent:Z

    .line 63
    .line 64
    if-nez v1, :cond_5

    .line 65
    .line 66
    :goto_1
    iget v1, p0, Lcom/android/dx/util/IndentingWriter;->indent:I

    .line 67
    .line 68
    if-ge v3, v1, :cond_4

    .line 69
    .line 70
    iget-object v1, p0, Ljava/io/FilterWriter;->out:Ljava/io/Writer;

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    .line 73
    .line 74
    .line 75
    add-int/lit8 v3, v3, 0x1

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_4
    iput v1, p0, Lcom/android/dx/util/IndentingWriter;->column:I

    .line 79
    .line 80
    :cond_5
    iget-object v1, p0, Ljava/io/FilterWriter;->out:Ljava/io/Writer;

    .line 81
    .line 82
    invoke-virtual {v1, p1}, Ljava/io/Writer;->write(I)V

    .line 83
    .line 84
    .line 85
    if-ne p1, v5, :cond_6

    .line 86
    .line 87
    invoke-direct {p0}, Lcom/android/dx/util/IndentingWriter;->bol()V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_6
    iget p1, p0, Lcom/android/dx/util/IndentingWriter;->column:I

    .line 92
    .line 93
    add-int/lit8 p1, p1, 0x1

    .line 94
    .line 95
    iput p1, p0, Lcom/android/dx/util/IndentingWriter;->column:I

    .line 96
    .line 97
    :goto_2
    monitor-exit v0

    .line 98
    return-void

    .line 99
    :goto_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 100
    throw p0
.end method

.method public write(Ljava/lang/String;II)V
    .locals 2

    .line 104
    iget-object v0, p0, Ljava/io/FilterWriter;->lock:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    if-lez p3, :cond_0

    .line 105
    :try_start_0
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    invoke-virtual {p0, v1}, Lcom/android/dx/util/IndentingWriter;->write(I)V

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 106
    :cond_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method

.method public write([CII)V
    .locals 2

    .line 101
    iget-object v0, p0, Ljava/io/FilterWriter;->lock:Ljava/lang/Object;

    monitor-enter v0

    :goto_0
    if-lez p3, :cond_0

    .line 102
    :try_start_0
    aget-char v1, p1, p2

    invoke-virtual {p0, v1}, Lcom/android/dx/util/IndentingWriter;->write(I)V

    add-int/lit8 p2, p2, 0x1

    add-int/lit8 p3, p3, -0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    .line 103
    :cond_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0
.end method
