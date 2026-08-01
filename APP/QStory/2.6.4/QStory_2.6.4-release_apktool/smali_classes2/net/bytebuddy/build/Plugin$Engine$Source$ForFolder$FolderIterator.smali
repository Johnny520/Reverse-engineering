.class public Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder$FolderIterator;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "FolderIterator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lnet/bytebuddy/build/Plugin$Engine$Source$Element;",
        ">;"
    }
.end annotation


# instance fields
.field private final files:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "Ljava/io/File;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;Ljava/io/File;)V
    .locals 5

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder$FolderIterator;->this$0:Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lnet/bytebuddy/utility/QueueFactory;->make()Ljava/util/Queue;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder$FolderIterator;->files:Ljava/util/Queue;

    .line 11
    .line 12
    invoke-virtual {p2}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    array-length v0, p1

    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    if-ge v1, v0, :cond_1

    .line 21
    .line 22
    aget-object v2, p1, v1

    .line 23
    .line 24
    new-instance v3, Ljava/io/File;

    .line 25
    .line 26
    const-string v4, "META-INF/MANIFEST.MF"

    .line 27
    .line 28
    invoke-direct {v3, p2, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    iget-object v3, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder$FolderIterator;->files:Ljava/util/Queue;

    .line 38
    .line 39
    invoke-interface {v3, v2}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder$FolderIterator;->files:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    xor-int/lit8 p0, p0, 0x1

    .line 8
    .line 9
    return p0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 0

    .line 66
    invoke-virtual {p0}, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder$FolderIterator;->next()Lnet/bytebuddy/build/Plugin$Engine$Source$Element;

    move-result-object p0

    return-object p0
.end method

.method public next()Lnet/bytebuddy/build/Plugin$Engine$Source$Element;
    .locals 8

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder$FolderIterator;->files:Ljava/util/Queue;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Queue;->remove()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/io/File;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    array-length v2, v1

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    if-ge v3, v2, :cond_1

    .line 24
    .line 25
    aget-object v4, v1, v3

    .line 26
    .line 27
    new-instance v5, Ljava/io/File;

    .line 28
    .line 29
    iget-object v6, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder$FolderIterator;->this$0:Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;

    .line 30
    .line 31
    invoke-static {v6}, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;->access$600(Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;)Ljava/io/File;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    const-string v7, "META-INF/MANIFEST.MF"

    .line 36
    .line 37
    invoke-direct {v5, v6, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/io/File;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_0

    .line 45
    .line 46
    iget-object v5, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder$FolderIterator;->files:Ljava/util/Queue;

    .line 47
    .line 48
    invoke-interface {v5, v4}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    new-instance v1, Lnet/bytebuddy/build/Plugin$Engine$Source$Element$ForFile;

    .line 55
    .line 56
    iget-object p0, p0, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder$FolderIterator;->this$0:Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;

    .line 57
    .line 58
    invoke-static {p0}, Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;->access$600(Lnet/bytebuddy/build/Plugin$Engine$Source$ForFolder;)Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-direct {v1, p0, v0}, Lnet/bytebuddy/build/Plugin$Engine$Source$Element$ForFile;-><init>(Ljava/io/File;Ljava/io/File;)V

    .line 63
    .line 64
    .line 65
    return-object v1
.end method

.method public remove()V
    .locals 1

    .line 1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    const-string v0, "remove"

    .line 4
    .line 5
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
