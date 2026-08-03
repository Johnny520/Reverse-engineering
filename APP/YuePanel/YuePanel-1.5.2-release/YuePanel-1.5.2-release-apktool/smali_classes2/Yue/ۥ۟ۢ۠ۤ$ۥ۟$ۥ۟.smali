.class public LYue/ۥ۟ۢ۠ۤ$ۥ۟$ۥ۟;
.super Ljava/util/AbstractSet;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۢ۠ۤ$ۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractSet<",
        "Ljava/util/Map$Entry<",
        "Ljava/lang/String;",
        "Ljava/lang/String;",
        ">;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟ۢ۠ۤ$ۥ۟;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۢ۠ۤ$ۥ۟;)V
    .locals 0

    .line 1
    iput-object p1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۟ۢ۠ۤ$ۥ۟;

    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۢ۠ۤ$ۥ۟;LYue/ۥ۟ۢ۠ۤ$ۥ;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LYue/ۥ۟ۢ۠ۤ$ۥ۟$ۥ۟;-><init>(LYue/ۥ۟ۢ۠ۤ$ۥ۟;)V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۢ۠ۤ$ۥ۟$ۥ;

    iget-object v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۟ۢ۠ۤ$ۥ۟;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۢ۠ۤ$ۥ۟$ۥ;-><init>(LYue/ۥ۟ۢ۠ۤ$ۥ۟;LYue/ۥ۟ۢ۠ۤ$ۥ;)V

    return-object v0
.end method

.method public size()I
    .locals 3

    new-instance v0, LYue/ۥ۟ۢ۠ۤ$ۥ۟$ۥ;

    iget-object v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥ۟ۢ۠ۤ$ۥ۟;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, LYue/ۥ۟ۢ۠ۤ$ۥ۟$ۥ;-><init>(LYue/ۥ۟ۢ۠ۤ$ۥ۟;LYue/ۥ۟ۢ۠ۤ$ۥ;)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return v1
.end method
