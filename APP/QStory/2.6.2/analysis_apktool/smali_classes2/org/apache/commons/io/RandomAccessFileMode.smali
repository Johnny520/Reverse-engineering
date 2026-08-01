.class public final enum Lorg/apache/commons/io/RandomAccessFileMode;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lorg/apache/commons/io/RandomAccessFileMode;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/commons/io/RandomAccessFileMode;

.field private static final R:Ljava/lang/String; = "r"

.field public static final enum READ_ONLY:Lorg/apache/commons/io/RandomAccessFileMode;

.field public static final enum READ_WRITE:Lorg/apache/commons/io/RandomAccessFileMode;

.field public static final enum READ_WRITE_SYNC_ALL:Lorg/apache/commons/io/RandomAccessFileMode;

.field public static final enum READ_WRITE_SYNC_CONTENT:Lorg/apache/commons/io/RandomAccessFileMode;

.field private static final RW:Ljava/lang/String; = "rw"

.field private static final RWD:Ljava/lang/String; = "rwd"

.field private static final RWS:Ljava/lang/String; = "rws"


# instance fields
.field private final level:I

.field private final mode:Ljava/lang/String;


# direct methods
.method private static synthetic $values()[Lorg/apache/commons/io/RandomAccessFileMode;
    .locals 4

    .line 1
    sget-object v0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_ONLY:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 2
    .line 3
    sget-object v1, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 4
    .line 5
    sget-object v2, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE_SYNC_ALL:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 6
    .line 7
    sget-object v3, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE_SYNC_CONTENT:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lorg/apache/commons/io/RandomAccessFileMode;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lorg/apache/commons/io/RandomAccessFileMode;

    .line 2
    .line 3
    const-string v1, "READ_ONLY"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "r"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    invoke-direct {v0, v1, v2, v3, v4}, Lorg/apache/commons/io/RandomAccessFileMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_ONLY:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 13
    .line 14
    new-instance v0, Lorg/apache/commons/io/RandomAccessFileMode;

    .line 15
    .line 16
    const-string v1, "READ_WRITE"

    .line 17
    .line 18
    const-string v2, "rw"

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    invoke-direct {v0, v1, v4, v2, v3}, Lorg/apache/commons/io/RandomAccessFileMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 25
    .line 26
    new-instance v0, Lorg/apache/commons/io/RandomAccessFileMode;

    .line 27
    .line 28
    const-string v1, "rws"

    .line 29
    .line 30
    const/4 v2, 0x4

    .line 31
    const-string v4, "READ_WRITE_SYNC_ALL"

    .line 32
    .line 33
    invoke-direct {v0, v4, v3, v1, v2}, Lorg/apache/commons/io/RandomAccessFileMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 34
    .line 35
    .line 36
    sput-object v0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE_SYNC_ALL:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 37
    .line 38
    new-instance v0, Lorg/apache/commons/io/RandomAccessFileMode;

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    const-string v2, "rwd"

    .line 42
    .line 43
    const-string v3, "READ_WRITE_SYNC_CONTENT"

    .line 44
    .line 45
    invoke-direct {v0, v3, v1, v2, v1}, Lorg/apache/commons/io/RandomAccessFileMode;-><init>(Ljava/lang/String;ILjava/lang/String;I)V

    .line 46
    .line 47
    .line 48
    sput-object v0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE_SYNC_CONTENT:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 49
    .line 50
    invoke-static {}, Lorg/apache/commons/io/RandomAccessFileMode;->$values()[Lorg/apache/commons/io/RandomAccessFileMode;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lorg/apache/commons/io/RandomAccessFileMode;->$VALUES:[Lorg/apache/commons/io/RandomAccessFileMode;

    .line 55
    .line 56
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lorg/apache/commons/io/RandomAccessFileMode;->mode:Ljava/lang/String;

    .line 5
    .line 6
    iput p4, p0, Lorg/apache/commons/io/RandomAccessFileMode;->level:I

    .line 7
    .line 8
    return-void
.end method

.method private getLevel()I
    .locals 0

    .line 1
    iget p0, p0, Lorg/apache/commons/io/RandomAccessFileMode;->level:I

    .line 2
    .line 3
    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/commons/io/RandomAccessFileMode;
    .locals 1

    .line 65
    const-class v0, Lorg/apache/commons/io/RandomAccessFileMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lorg/apache/commons/io/RandomAccessFileMode;

    return-object p0
.end method

.method public static varargs valueOf([Ljava/nio/file/OpenOption;)Lorg/apache/commons/io/RandomAccessFileMode;
    .locals 5

    .line 1
    sget-object v0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_ONLY:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 2
    .line 3
    array-length v1, p0

    .line 4
    const/4 v2, 0x0

    .line 5
    :goto_0
    if-ge v2, v1, :cond_4

    .line 6
    .line 7
    aget-object v3, p0, v2

    .line 8
    .line 9
    instance-of v4, v3, Ljava/nio/file/StandardOpenOption;

    .line 10
    .line 11
    if-eqz v4, :cond_3

    .line 12
    .line 13
    sget-object v4, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:[I

    .line 14
    .line 15
    check-cast v3, Ljava/nio/file/StandardOpenOption;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    aget v3, v4, v3

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    if-eq v3, v4, :cond_2

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    if-eq v3, v4, :cond_1

    .line 28
    .line 29
    const/4 v4, 0x3

    .line 30
    if-eq v3, v4, :cond_0

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    sget-object v3, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE_SYNC_ALL:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 34
    .line 35
    invoke-virtual {v0, v3}, Lorg/apache/commons/io/RandomAccessFileMode;->implies(Lorg/apache/commons/io/RandomAccessFileMode;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_3

    .line 40
    .line 41
    :goto_1
    move-object v0, v3

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    sget-object v3, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE_SYNC_CONTENT:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Lorg/apache/commons/io/RandomAccessFileMode;->implies(Lorg/apache/commons/io/RandomAccessFileMode;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_3

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    sget-object v3, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Lorg/apache/commons/io/RandomAccessFileMode;->implies(Lorg/apache/commons/io/RandomAccessFileMode;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-nez v4, :cond_3

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    return-object v0
.end method

.method public static valueOfMode(Ljava/lang/String;)Lorg/apache/commons/io/RandomAccessFileMode;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, -0x1

    .line 9
    sparse-switch v0, :sswitch_data_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :sswitch_0
    const-string v0, "rws"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x3

    .line 23
    goto :goto_0

    .line 24
    :sswitch_1
    const-string v0, "rwd"

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x2

    .line 34
    goto :goto_0

    .line 35
    :sswitch_2
    const-string v0, "rw"

    .line 36
    .line 37
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v1, 0x1

    .line 45
    goto :goto_0

    .line 46
    :sswitch_3
    const-string v0, "r"

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_3
    const/4 v1, 0x0

    .line 56
    :goto_0
    packed-switch v1, :pswitch_data_0

    .line 57
    .line 58
    .line 59
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/4 p0, 0x0

    .line 63
    return-object p0

    .line 64
    :pswitch_0
    sget-object p0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE_SYNC_ALL:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 65
    .line 66
    return-object p0

    .line 67
    :pswitch_1
    sget-object p0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE_SYNC_CONTENT:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_2
    sget-object p0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_WRITE:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 71
    .line 72
    return-object p0

    .line 73
    :pswitch_3
    sget-object p0, Lorg/apache/commons/io/RandomAccessFileMode;->READ_ONLY:Lorg/apache/commons/io/RandomAccessFileMode;

    .line 74
    .line 75
    return-object p0

    .line 76
    nop

    .line 77
    :sswitch_data_0
    .sparse-switch
        0x72 -> :sswitch_3
        0xe45 -> :sswitch_2
        0x1babf -> :sswitch_1
        0x1bace -> :sswitch_0
    .end sparse-switch

    .line 78
    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static values()[Lorg/apache/commons/io/RandomAccessFileMode;
    .locals 1

    .line 1
    sget-object v0, Lorg/apache/commons/io/RandomAccessFileMode;->$VALUES:[Lorg/apache/commons/io/RandomAccessFileMode;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lorg/apache/commons/io/RandomAccessFileMode;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lorg/apache/commons/io/RandomAccessFileMode;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public accept(Ljava/nio/file/Path;L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世苏兰哲;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/nio/file/Path;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u5b50\u4e16\u5170\u696a\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/RandomAccessFileMode;->create(Ljava/nio/file/Path;)Ljava/io/RandomAccessFile;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_0
    invoke-interface {p2, p0}, L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世苏兰哲;->accept(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void

    .line 14
    :catchall_0
    move-exception p1

    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    :try_start_1
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_1
    move-exception p0

    .line 22
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    :goto_0
    throw p1
.end method

.method public apply(Ljava/nio/file/Path;L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世哲苏兰;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/nio/file/Path;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u82cf\u5b50\u4e16\u5170\u696a\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u54f2\u82cf\u5170;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/RandomAccessFileMode;->create(Ljava/nio/file/Path;)Ljava/io/RandomAccessFile;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :try_start_0
    invoke-interface {p2, p0}, L飘花落叶言苏子世兰楪哲/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/io/RandomAccessFile;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-object p1

    .line 15
    :catchall_0
    move-exception p1

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    :try_start_1
    invoke-virtual {p0}, Ljava/io/RandomAccessFile;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catchall_1
    move-exception p0

    .line 23
    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    throw p1
.end method

.method public create(Ljava/io/File;)Ljava/io/RandomAccessFile;
    .locals 1

    .line 15
    new-instance v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世哲兰;

    iget-object p0, p0, Lorg/apache/commons/io/RandomAccessFileMode;->mode:Ljava/lang/String;

    invoke-direct {v0, p1, p0}, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世哲兰;-><init>(Ljava/io/File;Ljava/lang/String;)V

    return-object v0
.end method

.method public create(Ljava/lang/String;)Ljava/io/RandomAccessFile;
    .locals 1

    .line 16
    new-instance v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世哲兰;

    iget-object p0, p0, Lorg/apache/commons/io/RandomAccessFileMode;->mode:Ljava/lang/String;

    invoke-direct {v0, p1, p0}, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public create(Ljava/nio/file/Path;)Ljava/io/RandomAccessFile;
    .locals 1

    .line 1
    invoke-interface {p1}, Ljava/nio/file/Path;->toFile()Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "file"

    .line 6
    .line 7
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lorg/apache/commons/io/RandomAccessFileMode;->create(Ljava/io/File;)Ljava/io/RandomAccessFile;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public getMode()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/apache/commons/io/RandomAccessFileMode;->mode:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public implies(Lorg/apache/commons/io/RandomAccessFileMode;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/apache/commons/io/RandomAccessFileMode;->getLevel()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-direct {p1}, Lorg/apache/commons/io/RandomAccessFileMode;->getLevel()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-lt p0, p1, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public io(Ljava/lang/String;)L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世哲兰;
    .locals 1

    .line 1
    new-instance v0, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世哲兰;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/apache/commons/io/RandomAccessFileMode;->mode:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {v0, p1, p0}, L飘花落叶言苏子楪兰哲世/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
