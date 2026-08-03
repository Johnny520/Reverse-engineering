.class public abstract LYue/ۥ۟۟ۨۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract ۥ()LYue/ۥ۟۟ۨۢ;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e2<",
            "TI;*>;"
        }
    .end annotation
.end method

.method public ۥ۟(Ljava/lang/Object;)V
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;)V"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, LYue/ۥ۟۟ۨۦ;->ۥ۟۟(Ljava/lang/Object;LYue/ۥ۟۟ۧۨ;)V

    return-void
.end method

.method public abstract ۥ۟۟(Ljava/lang/Object;LYue/ۥ۟۟ۧۨ;)V
    .param p1    # Ljava/lang/Object;
        .annotation build Landroid/annotation/SuppressLint;
            value = {
                "UnknownNullness"
            }
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟۟ۧۨ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;",
            "LYue/\u06e5\u06df\u06df\u06e7\u06e8;",
            ")V"
        }
    .end annotation
.end method

.method public abstract ۥ۟۟۟()V
    .annotation build LYue/ۥ۠ۨۦۤ;
    .end annotation
.end method
