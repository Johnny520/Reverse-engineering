.class Lcom/tendcloud/tenddata/cr$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tendcloud/tenddata/cr;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "c"
.end annotation


# instance fields
.field private callback:Lcom/tendcloud/tenddata/cs;

.field private features:Lcom/tendcloud/tenddata/a;

.field private mFolderPath:Ljava/lang/String;

.field private final mOperation:Lcom/tendcloud/tenddata/cq;

.field private final opm:Lcom/tendcloud/tenddata/cr;

.field public final synthetic this$0:Lcom/tendcloud/tenddata/cr;


# direct methods
.method private constructor <init>(Lcom/tendcloud/tenddata/cr;Lcom/tendcloud/tenddata/cq;Lcom/tendcloud/tenddata/bv;Lcom/tendcloud/tenddata/cr;)V
    .locals 2

    iput-object p1, p0, Lcom/tendcloud/tenddata/cr$c;->this$0:Lcom/tendcloud/tenddata/cr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object p1, Lcom/tendcloud/tenddata/ab;->g:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object p1

    iput-object p4, p0, Lcom/tendcloud/tenddata/cr$c;->opm:Lcom/tendcloud/tenddata/cr;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v0, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p3, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-virtual {v1}, Lcom/tendcloud/tenddata/a;->getDataFolder()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    iput-object p4, p0, Lcom/tendcloud/tenddata/cr$c;->mFolderPath:Ljava/lang/String;

    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/io/File;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p3, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getRootFolder()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p3, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    invoke-virtual {p1}, Lcom/tendcloud/tenddata/a;->getDataFolder()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tendcloud/tenddata/cr$c;->mFolderPath:Ljava/lang/String;

    iput-object p2, p0, Lcom/tendcloud/tenddata/cr$c;->mOperation:Lcom/tendcloud/tenddata/cq;

    iget-object p1, p3, Lcom/tendcloud/tenddata/bv;->f:Lcom/tendcloud/tenddata/cs;

    iput-object p1, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;

    iget-object p1, p3, Lcom/tendcloud/tenddata/bv;->a:Lcom/tendcloud/tenddata/a;

    iput-object p1, p0, Lcom/tendcloud/tenddata/cr$c;->features:Lcom/tendcloud/tenddata/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tendcloud/tenddata/cr;Lcom/tendcloud/tenddata/cq;Lcom/tendcloud/tenddata/bv;Lcom/tendcloud/tenddata/cr;Lcom/tendcloud/tenddata/cr$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tendcloud/tenddata/cr$c;-><init>(Lcom/tendcloud/tenddata/cr;Lcom/tendcloud/tenddata/cq;Lcom/tendcloud/tenddata/bv;Lcom/tendcloud/tenddata/cr;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lcom/tendcloud/tenddata/cr$c;->opm:Lcom/tendcloud/tenddata/cr;

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    :try_start_1
    new-instance v2, Ljava/io/File;

    iget-object v3, p0, Lcom/tendcloud/tenddata/cr$c;->mFolderPath:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->isDirectory()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    move-result v3

    if-nez v3, :cond_0

    monitor-exit v1

    return-void

    :cond_0
    iget-object v3, p0, Lcom/tendcloud/tenddata/cr$c;->this$0:Lcom/tendcloud/tenddata/cr;

    iget-object v4, p0, Lcom/tendcloud/tenddata/cr$c;->features:Lcom/tendcloud/tenddata/a;

    invoke-static {v3, v2, v4}, Lcom/tendcloud/tenddata/cr;->a(Lcom/tendcloud/tenddata/cr;Ljava/io/File;Lcom/tendcloud/tenddata/a;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/tendcloud/tenddata/cr$c;->mFolderPath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lcom/tendcloud/tenddata/cr$c;->mOperation:Lcom/tendcloud/tenddata/cq;

    invoke-virtual {v3}, Lcom/tendcloud/tenddata/cq;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    move-result v2

    if-nez v2, :cond_1

    monitor-exit v1

    return-void

    :cond_1
    new-instance v2, Ljava/io/RandomAccessFile;

    const-string v4, "rw"

    invoke-direct {v2, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;

    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-wide/16 v4, 0x1

    :try_start_3
    invoke-virtual {v2, v4, v5}, Ljava/io/RandomAccessFile;->seek(J)V

    iget-object v4, p0, Lcom/tendcloud/tenddata/cr$c;->mOperation:Lcom/tendcloud/tenddata/cq;

    invoke-virtual {v4}, Lcom/tendcloud/tenddata/cq;->d()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget-object v4, p0, Lcom/tendcloud/tenddata/cr$c;->mOperation:Lcom/tendcloud/tenddata/cq;

    invoke-virtual {v4}, Lcom/tendcloud/tenddata/cq;->e()I

    move-result v4

    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->writeInt(I)V

    iget-object v4, p0, Lcom/tendcloud/tenddata/cr$c;->mOperation:Lcom/tendcloud/tenddata/cq;

    invoke-virtual {v4}, Lcom/tendcloud/tenddata/cq;->c()[B

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/io/RandomAccessFile;->write([B)V

    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->getFD()Ljava/io/FileDescriptor;

    move-result-object v4

    invoke-virtual {v4}, Ljava/io/FileDescriptor;->sync()V

    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-eqz v3, :cond_2

    :try_start_4
    invoke-virtual {v3}, Ljava/nio/channels/FileLock;->release()V

    :cond_2
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->close()V

    iget-object v0, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;

    if-eqz v0, :cond_5

    :goto_0
    invoke-interface {v0}, Lcom/tendcloud/tenddata/cs;->onStoreSuccess()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_6

    goto :goto_2

    :catchall_0
    move-exception v4

    move-object v6, v3

    move-object v3, v2

    move-object v2, v4

    move-object v4, v6

    goto :goto_1

    :catchall_1
    move-exception v3

    move-object v4, v0

    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    goto :goto_1

    :catchall_2
    move-exception v2

    move-object v3, v0

    move-object v4, v3

    :goto_1
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    :catchall_3
    move-exception v2

    goto :goto_1

    :catchall_4
    move-object v3, v0

    move-object v4, v3

    :catchall_5
    :try_start_7
    iget-object v1, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;

    if-eqz v1, :cond_3

    invoke-interface {v1}, Lcom/tendcloud/tenddata/cs;->onStoreFailed()V

    iput-object v0, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    :cond_3
    if-eqz v4, :cond_4

    :try_start_8
    invoke-virtual {v4}, Ljava/nio/channels/FileLock;->release()V

    :cond_4
    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    iget-object v0, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    if-eqz v0, :cond_5

    goto :goto_0

    :catchall_6
    :cond_5
    :goto_2
    return-void

    :catchall_7
    move-exception v0

    if-eqz v4, :cond_6

    :try_start_9
    invoke-virtual {v4}, Ljava/nio/channels/FileLock;->release()V

    :cond_6
    if-eqz v3, :cond_7

    invoke-virtual {v3}, Ljava/io/RandomAccessFile;->close()V

    iget-object v1, p0, Lcom/tendcloud/tenddata/cr$c;->callback:Lcom/tendcloud/tenddata/cs;

    if-eqz v1, :cond_7

    invoke-interface {v1}, Lcom/tendcloud/tenddata/cs;->onStoreSuccess()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    :catchall_8
    :cond_7
    throw v0
.end method
