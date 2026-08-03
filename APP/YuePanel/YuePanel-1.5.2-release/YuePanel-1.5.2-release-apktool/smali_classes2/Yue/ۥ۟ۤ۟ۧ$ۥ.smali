.class public final LYue/ۥ۟ۤ۟ۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۤ۟ۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Ljava/util/List;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e4\u06df\u06e7$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LYue/ۥ۟ۤ۟ۧ$ۥ;->ۥ:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final varargs ۥ(Ljava/lang/String;[Ljava/lang/String;)LYue/ۥ۟ۤ۟ۧ$ۥ;
    .locals 5
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # [Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "pattern"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pins"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length v0, p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p2, v1

    iget-object v3, p0, LYue/ۥ۟ۤ۟ۧ$ۥ;->ۥ:Ljava/util/List;

    new-instance v4, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;

    invoke-direct {v4, p1, v2}, LYue/ۥ۟ۤ۟ۧ$ۥ۟۟;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object p0
.end method

.method public final ۥ۟()LYue/ۥ۟ۤ۟ۧ;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥ۟ۤ۟ۧ;

    iget-object v1, p0, LYue/ۥ۟ۤ۟ۧ$ۥ;->ۥ:Ljava/util/List;

    invoke-static {v1}, LYue/ۥ۟ۥۢ۠;->ۥ۟ۢۡۡ(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, LYue/ۥ۟ۤ۟ۧ;-><init>(Ljava/util/Set;LYue/ۥ۟ۤ۟ۦ;ILYue/ۥ۟ۨۥۢ;)V

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/util/List;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06df\u06e4\u06df\u06e7$\u06e5\u06df\u06df;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤ۟ۧ$ۥ;->ۥ:Ljava/util/List;

    return-object v0
.end method
