.class public final L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;
.super L飘花落叶言世兰楪哲子苏/飘花落叶言子世苏哲楪兰;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/io/File;

.field public final synthetic 飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;


# direct methods
.method public constructor <init>(L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/io/File;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰哲苏;)V
    .locals 2

    .line 1
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;

    .line 7
    .line 8
    new-instance v1, Ljava/io/FileInputStream;

    .line 9
    .line 10
    invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲苏世;

    .line 14
    .line 15
    invoke-direct {v0, v1, p0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;-><init>(Ljava/io/InputStream;L飘花落叶言苏子楪哲兰世/飘花落叶言子世楪苏哲兰;)V

    .line 16
    .line 17
    .line 18
    :try_start_0
    invoke-interface {p1, v0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰苏哲(L飘花落叶言苏子楪哲兰世/飘花落叶言子楪兰哲世苏;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, L飘花落叶言苏子楪哲兰世/飘花落叶言子楪哲世兰苏;->close()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    :catchall_1
    move-exception p1

    .line 28
    invoke-static {v0, p0}, Lcom/alibaba/fastjson2/飘花落叶言子哲苏世兰楪;->飘花落叶言子楪苏世兰哲(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    throw p1
.end method

.method public final 飘花落叶言子楪世苏兰哲()L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世兰楪哲子苏/飘花落叶言子楪兰哲世苏;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()J
    .locals 2

    .line 1
    iget-object p0, p0, L飘花落叶言世兰楪哲子苏/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世哲苏兰:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/io/File;->length()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method
