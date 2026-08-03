.class public abstract LYue/ۥ۟۟ۨۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟۟ۨۢ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<I:",
        "Ljava/lang/Object;",
        "O:",
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
.method public abstract ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TI;)",
            "Landroid/content/Intent;"
        }
    .end annotation
.end method

.method public ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ;
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "TI;)",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e2$\u06e5<",
            "TO;>;"
        }
    .end annotation

    const-string p2, "context"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public abstract ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object;
    .param p2    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/content/Intent;",
            ")TO;"
        }
    .end annotation
.end method
