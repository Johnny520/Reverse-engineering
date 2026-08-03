.class public final Lcom/bumptech/glide/util/pool/FactoryPools;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/util/pool/FactoryPools$Factory;,
        Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;,
        Lcom/bumptech/glide/util/pool/FactoryPools$FactoryPool;,
        Lcom/bumptech/glide/util/pool/FactoryPools$Poolable;
    }
.end annotation


# static fields
.field private static final DEFAULT_POOL_SIZE:I = 0x14

.field private static final EMPTY_RESETTER:Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/bumptech/glide/util/pool/FactoryPools$Resetter<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "FactoryPools"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/bumptech/glide/util/pool/FactoryPools$1;

    invoke-direct {v0}, Lcom/bumptech/glide/util/pool/FactoryPools$1;-><init>()V

    sput-object v0, Lcom/bumptech/glide/util/pool/FactoryPools;->EMPTY_RESETTER:Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static build(LYue/ۥۡۤۤ۠$ۥ;Lcom/bumptech/glide/util/pool/FactoryPools$Factory;)LYue/ۥۡۤۤ۠$ۥ;
    .locals 1
    .param p0    # LYue/ۥۡۤۤ۠$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Lcom/bumptech/glide/util/pool/FactoryPools$Factory;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Poolable;",
            ">(",
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "TT;>;",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Factory<",
            "TT;>;)",
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/bumptech/glide/util/pool/FactoryPools;->emptyResetter()Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;

    move-result-object v0

    invoke-static {p0, p1, v0}, Lcom/bumptech/glide/util/pool/FactoryPools;->build(LYue/ۥۡۤۤ۠$ۥ;Lcom/bumptech/glide/util/pool/FactoryPools$Factory;Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;)LYue/ۥۡۤۤ۠$ۥ;

    move-result-object p0

    return-object p0
.end method

.method private static build(LYue/ۥۡۤۤ۠$ۥ;Lcom/bumptech/glide/util/pool/FactoryPools$Factory;Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;)LYue/ۥۡۤۤ۠$ۥ;
    .locals 1
    .param p0    # LYue/ۥۡۤۤ۠$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Lcom/bumptech/glide/util/pool/FactoryPools$Factory;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "TT;>;",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Factory<",
            "TT;>;",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Resetter<",
            "TT;>;)",
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "TT;>;"
        }
    .end annotation

    .line 2
    new-instance v0, Lcom/bumptech/glide/util/pool/FactoryPools$FactoryPool;

    invoke-direct {v0, p0, p1, p2}, Lcom/bumptech/glide/util/pool/FactoryPools$FactoryPool;-><init>(LYue/ۥۡۤۤ۠$ۥ;Lcom/bumptech/glide/util/pool/FactoryPools$Factory;Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;)V

    return-object v0
.end method

.method private static emptyResetter()Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Resetter<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lcom/bumptech/glide/util/pool/FactoryPools;->EMPTY_RESETTER:Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;

    return-object v0
.end method

.method public static simple(ILcom/bumptech/glide/util/pool/FactoryPools$Factory;)LYue/ۥۡۤۤ۠$ۥ;
    .locals 1
    .param p1    # Lcom/bumptech/glide/util/pool/FactoryPools$Factory;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Poolable;",
            ">(I",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Factory<",
            "TT;>;)",
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡۤۤ۠$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۡۤۤ۠$ۥ۟;-><init>(I)V

    invoke-static {v0, p1}, Lcom/bumptech/glide/util/pool/FactoryPools;->build(LYue/ۥۡۤۤ۠$ۥ;Lcom/bumptech/glide/util/pool/FactoryPools$Factory;)LYue/ۥۡۤۤ۠$ۥ;

    move-result-object p0

    return-object p0
.end method

.method public static threadSafe(ILcom/bumptech/glide/util/pool/FactoryPools$Factory;)LYue/ۥۡۤۤ۠$ۥ;
    .locals 1
    .param p1    # Lcom/bumptech/glide/util/pool/FactoryPools$Factory;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Poolable;",
            ">(I",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Factory<",
            "TT;>;)",
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "TT;>;"
        }
    .end annotation

    .line 1
    new-instance v0, LYue/ۥۡۤۤ۠$ۥ۟۟;

    invoke-direct {v0, p0}, LYue/ۥۡۤۤ۠$ۥ۟۟;-><init>(I)V

    invoke-static {v0, p1}, Lcom/bumptech/glide/util/pool/FactoryPools;->build(LYue/ۥۡۤۤ۠$ۥ;Lcom/bumptech/glide/util/pool/FactoryPools$Factory;)LYue/ۥۡۤۤ۠$ۥ;

    move-result-object p0

    return-object p0
.end method

.method public static threadSafe(ILcom/bumptech/glide/util/pool/FactoryPools$Factory;Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;)LYue/ۥۡۤۤ۠$ۥ;
    .locals 1
    .param p1    # Lcom/bumptech/glide/util/pool/FactoryPools$Factory;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Poolable;",
            ">(I",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Factory<",
            "TT;>;",
            "Lcom/bumptech/glide/util/pool/FactoryPools$Resetter<",
            "TT;>;)",
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "TT;>;"
        }
    .end annotation

    .line 2
    new-instance v0, LYue/ۥۡۤۤ۠$ۥ۟۟;

    invoke-direct {v0, p0}, LYue/ۥۡۤۤ۠$ۥ۟۟;-><init>(I)V

    invoke-static {v0, p1, p2}, Lcom/bumptech/glide/util/pool/FactoryPools;->build(LYue/ۥۡۤۤ۠$ۥ;Lcom/bumptech/glide/util/pool/FactoryPools$Factory;Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;)LYue/ۥۡۤۤ۠$ۥ;

    move-result-object p0

    return-object p0
.end method

.method public static threadSafeList()LYue/ۥۡۤۤ۠$ۥ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    const/16 v0, 0x14

    .line 1
    invoke-static {v0}, Lcom/bumptech/glide/util/pool/FactoryPools;->threadSafeList(I)LYue/ۥۡۤۤ۠$ۥ;

    move-result-object v0

    return-object v0
.end method

.method public static threadSafeList(I)LYue/ۥۡۤۤ۠$ۥ;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(I)",
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "Ljava/util/List<",
            "TT;>;>;"
        }
    .end annotation

    .line 2
    new-instance v0, LYue/ۥۡۤۤ۠$ۥ۟۟;

    invoke-direct {v0, p0}, LYue/ۥۡۤۤ۠$ۥ۟۟;-><init>(I)V

    new-instance p0, Lcom/bumptech/glide/util/pool/FactoryPools$2;

    invoke-direct {p0}, Lcom/bumptech/glide/util/pool/FactoryPools$2;-><init>()V

    new-instance v1, Lcom/bumptech/glide/util/pool/FactoryPools$3;

    invoke-direct {v1}, Lcom/bumptech/glide/util/pool/FactoryPools$3;-><init>()V

    invoke-static {v0, p0, v1}, Lcom/bumptech/glide/util/pool/FactoryPools;->build(LYue/ۥۡۤۤ۠$ۥ;Lcom/bumptech/glide/util/pool/FactoryPools$Factory;Lcom/bumptech/glide/util/pool/FactoryPools$Resetter;)LYue/ۥۡۤۤ۠$ۥ;

    move-result-object p0

    return-object p0
.end method
