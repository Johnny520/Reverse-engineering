.class public final Landroidx/emoji2/text/ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/emoji2/text/ۥ$ۥ;,
        Landroidx/emoji2/text/ۥ$ۥ۟;,
        Landroidx/emoji2/text/ۥ$ۥ۟۟۟;,
        Landroidx/emoji2/text/ۥ$ۥ۟۟;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/content/Context;)Landroidx/emoji2/text/ۥ۟۟۟۟;
    .locals 2
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    new-instance v0, Landroidx/emoji2/text/ۥ$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/emoji2/text/ۥ$ۥ;-><init>(Landroidx/emoji2/text/ۥ$ۥ۟;)V

    invoke-virtual {v0, p0}, Landroidx/emoji2/text/ۥ$ۥ;->ۥ۟۟(Landroid/content/Context;)Landroidx/emoji2/text/ۥ۟۟$ۥ۟۟۟;

    move-result-object p0

    check-cast p0, Landroidx/emoji2/text/ۥ۟۟۟۟;

    return-object p0
.end method
