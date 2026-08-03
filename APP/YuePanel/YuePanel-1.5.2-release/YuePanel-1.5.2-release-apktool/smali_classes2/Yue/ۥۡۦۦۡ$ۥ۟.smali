.class public final LYue/ۥۡۦۦۡ$ۥ۟;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡۦۦۡ;-><init>(Ljava/lang/ClassLoader;ZLYue/ۥ۠ۡۨۤ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Ljava/util/List<",
        "+",
        "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
        "+",
        "LYue/\u06e5\u06e0\u06e1\u06e8\u06e4;",
        "+",
        "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
        ">;>;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۦۦۡ;


# direct methods
.method public constructor <init>(LYue/ۥۡۦۦۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡۦۦۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡۦۦۡ;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LYue/ۥۡۦۦۡ$ۥ۟;->invoke()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()Ljava/util/List;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LYue/\u06e5\u06e1\u06e3\u06e6\u06e0<",
            "LYue/\u06e5\u06e0\u06e1\u06e8\u06e4;",
            "LYue/\u06e5\u06e1\u06e3\u06e7\u06e7;",
            ">;>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, LYue/ۥۡۦۦۡ$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۡۦۦۡ;

    invoke-static {v0}, LYue/ۥۡۦۦۡ;->ۥ۟۟ۢۡ(LYue/ۥۡۦۦۡ;)Ljava/lang/ClassLoader;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥۡۦۦۡ;->ۥ۟۟ۢۤ(LYue/ۥۡۦۦۡ;Ljava/lang/ClassLoader;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
