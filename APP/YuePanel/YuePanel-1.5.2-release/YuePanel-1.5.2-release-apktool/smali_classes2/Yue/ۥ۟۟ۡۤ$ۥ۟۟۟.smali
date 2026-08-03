.class public final LYue/ۥ۟۟ۡۤ$ۥ۟۟۟;
.super LYue/ۥ۟۟۠ۦ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۟ۡۤ;->ۥ۟۟۟۠()Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e0\u06e6<",
        "TV;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟۟ۡۤ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e1\u06e4<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۟ۡۤ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06df\u06e1\u06e4<",
            "TK;+TV;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟ۡۤ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۤ;

    invoke-direct {p0}, LYue/ۥ۟۟۠ۦ;-><init>()V

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۡۤ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۤ;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟ۡۤ;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TV;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟ۡۤ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۤ;

    invoke-virtual {v0}, LYue/ۥ۟۟ۡۤ;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    new-instance v1, LYue/ۥ۟۟ۡۤ$ۥ۟۟۟$ۥ;

    invoke-direct {v1, v0}, LYue/ۥ۟۟ۡۤ$ۥ۟۟۟$ۥ;-><init>(Ljava/util/Iterator;)V

    return-object v1
.end method

.method public ۥ()I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۡۤ$ۥ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۤ;

    invoke-virtual {v0}, LYue/ۥ۟۟ۡۤ;->size()I

    move-result v0

    return v0
.end method
