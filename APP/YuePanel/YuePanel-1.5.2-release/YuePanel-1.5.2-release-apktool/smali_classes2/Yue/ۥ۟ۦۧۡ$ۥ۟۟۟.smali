.class public final LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;
.super LYue/ۥ۟ۦۧۢ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۦۡۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۦۧۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e6\u06e7\u06e2<",
        "TE;>;",
        "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۠ۨ:LYue/ۥ۟ۦۧۡ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟ۦۧۡ;)V
    .locals 1
    .param p1    # LYue/ۥ۟ۦۧۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e6\u06e7\u06e1<",
            "TE;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥ۟ۦۧۢ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    iput-object p1, p0, LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;->ۥ۟۟۠ۨ:LYue/ۥ۟ۦۧۡ;

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۢ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-super {p0, p1}, LYue/ۥ۟ۦۧۢ;->ۥ۟۟ۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۤ۠(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;->ۥ۟۟۠ۨ:LYue/ۥ۟ۦۧۡ;

    invoke-static {p1, p0}, LYue/ۥ۟ۦۧۡ;->ۥ۟(LYue/ۥ۟ۦۧۡ;LYue/ۥ۟ۦۧۡ$ۥ۟۟۟;)V

    :cond_0
    return-void
.end method
