.class public final LYue/ۥۣ۟ۥۧ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۣ۠;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$urls$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,788:1\n1#2:789\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣ۟ۥۧ;->ۥ۟۟ۤۤ()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/lang/String;",
        ">;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e0;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$urls$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,788:1\n1#2:789\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/util/Iterator;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "LYue/\u06e5\u06e0\u06df\u06e1\u06e8$\u06e5\u06df\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public ۥ۟۟۠ۥ:Z


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۥۧ;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, LYue/ۥۣ۟ۥۧ;->ۥ۟۟۟ۨ()LYue/ۥ۠۟ۡۨ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥ۠۟ۡۨ;->ۥۣ۟۟ۧ()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 5

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥ۟۟۠ۥ:Z

    :catch_0
    iget-object v2, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    :try_start_0
    iget-object v2, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/io/Closeable;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    move-object v3, v2

    check-cast v3, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;

    invoke-virtual {v3, v0}, LYue/ۥ۠۟ۡۨ$ۥ۟۟۟;->ۥ۟۟۟(I)LYue/ۥۣۢ۟ۦ;

    move-result-object v3

    invoke-static {v3}, LYue/ۥۣۡۡ;->ۥ۟۟۟۟(LYue/ۥۣۢ۟ۦ;)LYue/ۥۣۣ۟۠;

    move-result-object v3

    invoke-interface {v3}, LYue/ۥۣۣ۟۠;->ۥ۟۟ۤۧ()Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, 0x0

    :try_start_2
    invoke-static {v2, v3}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    return v1

    :catchall_0
    move-exception v3

    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v4

    :try_start_4
    invoke-static {v2, v3}, LYue/ۥ۟ۤۨۨ;->ۥ(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v4
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    :cond_1
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥ()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    iget-boolean v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥ۟۟۠ۥ:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "remove() before next()"

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥ۟۟۠ۤ:Ljava/lang/String;

    const/4 v1, 0x1

    iput-boolean v1, p0, LYue/ۥۣ۟ۥۧ$ۥ۟۟;->ۥ۟۟۠ۥ:Z

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
