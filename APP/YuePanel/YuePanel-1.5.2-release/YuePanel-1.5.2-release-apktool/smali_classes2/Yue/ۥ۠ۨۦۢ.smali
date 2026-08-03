.class public final LYue/ۥ۠ۨۦۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,137:1\n1895#2,14:138\n*S KotlinDebug\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MainDispatcherLoader\n*L\n38#1:138,14\n*E\n"
.end annotation


# static fields
.field public static final ۥ:LYue/ۥ۠ۨۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:Z

.field public static final ۥ۟۟:LYue/ۥ۠ۨۥۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LYue/ۥ۠ۨۦۢ;

    invoke-direct {v0}, LYue/ۥ۠ۨۦۢ;-><init>()V

    sput-object v0, LYue/ۥ۠ۨۦۢ;->ۥ:LYue/ۥ۠ۨۦۢ;

    const-string v1, "kotlinx.coroutines.fast.service.loader"

    const/4 v2, 0x1

    invoke-static {v1, v2}, LYue/ۥۢ۠ۧ۟;->ۥ۟۟۟۟(Ljava/lang/String;Z)Z

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۢ;->ۥ()LYue/ۥ۠ۨۥۥ;

    move-result-object v0

    sput-object v0, LYue/ۥ۠ۨۦۢ;->ۥ۟۟:LYue/ۥ۠ۨۥۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥ۠ۨۥۥ;
    .locals 7

    const-class v0, LYue/ۥ۠ۨۦۡ;

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    invoke-static {v0, v2}, Ljava/util/ServiceLoader;->load(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/ServiceLoader;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ServiceLoader;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۨۢۤ;->ۥ۟۟۟۟(Ljava/util/Iterator;)LYue/ۥۡۨۢ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۨۢۦ;->ۥ۟۠ۧۦ(LYue/ۥۡۨۢ;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-nez v3, :cond_0

    move-object v3, v1

    goto :goto_0

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    move-object v4, v3

    check-cast v4, LYue/ۥ۠ۨۦۡ;

    invoke-interface {v4}, LYue/ۥ۠ۨۦۡ;->ۥ۟۟()I

    move-result v4

    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, LYue/ۥ۠ۨۦۡ;

    invoke-interface {v6}, LYue/ۥ۠ۨۦۡ;->ۥ۟۟()I

    move-result v6

    if-ge v4, v6, :cond_3

    move-object v3, v5

    move v4, v6

    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-nez v5, :cond_2

    :goto_0
    check-cast v3, LYue/ۥ۠ۨۦۡ;

    if-eqz v3, :cond_4

    invoke-static {v3, v0}, LYue/ۥ۠ۨۦۣ;->ۥ۟۟۟۠(LYue/ۥ۠ۨۦۡ;Ljava/util/List;)LYue/ۥ۠ۨۥۥ;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x3

    invoke-static {v1, v1, v0, v1}, LYue/ۥ۠ۨۦۣ;->ۥ۟(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)LYue/ۥۡۡۡۨ;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :goto_2
    const/4 v2, 0x2

    invoke-static {v0, v1, v2, v1}, LYue/ۥ۠ۨۦۣ;->ۥ۟(Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)LYue/ۥۡۡۡۨ;

    move-result-object v0

    :cond_5
    :goto_3
    return-object v0
.end method
