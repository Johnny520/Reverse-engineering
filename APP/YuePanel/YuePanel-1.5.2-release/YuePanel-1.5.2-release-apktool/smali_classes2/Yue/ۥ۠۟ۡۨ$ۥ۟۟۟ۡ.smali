.class public final LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۣ۠;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$snapshots$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1065:1\n1#2:1066\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠۟ۡۨ;->ۥۣ۟۟ۧ()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "LYue/\u06e5\u06e0\u06df\u06e1\u06e8$\u06e5\u06df\u06df\u06df;",
        ">;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e0;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$snapshots$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1065:1\n1#2:1066\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/util/Iterator;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "LYue/\u06e5\u06e0\u06df\u06e1\u06e8$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۦ:LYue/ۥ۠۟ۡۨ;


# direct methods
.method public constructor <init>(LYue/ۥ۠۟ۡۨ;)V
    .locals 1

    iput-object p1, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ:LYue/ۥ۠۟ۡۨ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟ۢۨ()Ljava/util/LinkedHashMap;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const-string v0, "ArrayList(lruEntries.values).iterator()"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 4

    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ:LYue/ۥ۠۟ۡۨ;

    monitor-enter v0

    :try_start_0
    invoke-virtual {v0}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟ۢ()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    monitor-exit v0

    return v3

    :cond_1
    :goto_0
    :try_start_1
    iget-object v2, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۠۟ۡۨ$ۥ۟۟;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, LYue/ۥ۠۟ۡۨ$ۥ۟۟;->ۥ۟۟۠ۡ()LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    move-result-object v2

    if-nez v2, :cond_2

    goto :goto_0

    :cond_2
    iput-object v2, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_3
    :try_start_2
    sget-object v1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return v3

    :goto_1
    monitor-exit v0

    throw v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ()LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ:LYue/ۥ۠۟ۡۨ;

    invoke-virtual {v0}, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, LYue/ۥ۠۟ۡۨ;->ۥ۟۟ۥۢ(Ljava/lang/String;)Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    iput-object v1, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    goto :goto_0

    :catchall_0
    move-exception v0

    iput-object v1, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    throw v0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() before next()"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ()LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    iput-object v0, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۤ:LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
