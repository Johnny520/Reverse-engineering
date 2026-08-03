.class public LYue/ۥۣ۟۟ۨ$ۥ۟۟۠;
.super LYue/ۥ۟۟ۨۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟۟ۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06e0"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e8\u06e2<",
        "Landroid/net/Uri;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟۟ۨۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۠;->ۥ۟۟۟(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ;
    .locals 0

    check-cast p2, Landroid/net/Uri;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۠;->ۥ۟۟۟۟(Landroid/content/Context;Landroid/net/Uri;)LYue/ۥ۟۟ۨۢ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۠;->ۥ۟۟۟۠(ILandroid/content/Intent;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "input"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Landroid/content/Intent;

    const-string v0, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "output"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "Intent(MediaStore.ACTION\u2026tore.EXTRA_OUTPUT, input)"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ۥ۟۟۟۟(Landroid/content/Context;Landroid/net/Uri;)LYue/ۥ۟۟ۨۢ$ۥ;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Landroid/net/Uri;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/net/Uri;",
            ")",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e2$\u06e5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "input"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۥ۟۟۟۠(ILandroid/content/Intent;)Ljava/lang/Boolean;
    .locals 0
    .param p2    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const/4 p2, -0x1

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
