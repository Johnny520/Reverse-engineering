.class Lcom/bumptech/glide/load/model/MultiModelLoaderFactory$Factory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/bumptech/glide/load/model/MultiModelLoaderFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Factory"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public build(Ljava/util/List;LYue/ۥۡۤۤ۠$ۥ;)Lcom/bumptech/glide/load/model/MultiModelLoader;
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۤۤ۠$ۥ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<Model:",
            "Ljava/lang/Object;",
            "Data:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "Lcom/bumptech/glide/load/model/ModelLoader<",
            "TModel;TData;>;>;",
            "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;>;)",
            "Lcom/bumptech/glide/load/model/MultiModelLoader<",
            "TModel;TData;>;"
        }
    .end annotation

    new-instance v0, Lcom/bumptech/glide/load/model/MultiModelLoader;

    invoke-direct {v0, p1, p2}, Lcom/bumptech/glide/load/model/MultiModelLoader;-><init>(Ljava/util/List;LYue/ۥۡۤۤ۠$ۥ;)V

    return-object v0
.end method
