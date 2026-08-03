.class public LYue/ۥۣ۟۟ۨ$ۥ۟۟۟;
.super LYue/ۥ۟۟ۨۢ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x12
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟۟ۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟۟ۨ$ۥ۟۟۟$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e8\u06e2<",
        "Ljava/lang/String;",
        "Ljava/util/List<",
        "Landroid/net/Uri;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟۟ۨۢ;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟;->ۥ۟۟۟(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ;
    .locals 0

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟;->ۥ۟۟۟۟(Landroid/content/Context;Ljava/lang/String;)LYue/ۥ۟۟ۨۢ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟;->ۥ۟۟۟۠(ILandroid/content/Intent;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
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

    const-string v0, "android.intent.action.GET_CONTENT"

    invoke-direct {p1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v0, "android.intent.category.OPENABLE"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "android.intent.extra.ALLOW_MULTIPLE"

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    move-result-object p1

    const-string p2, "Intent(Intent.ACTION_GET\u2026TRA_ALLOW_MULTIPLE, true)"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final ۥ۟۟۟۟(Landroid/content/Context;Ljava/lang/String;)LYue/ۥ۟۟ۨۢ$ۥ;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            ")",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e2$\u06e5<",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "input"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۥ۟۟۟۠(ILandroid/content/Intent;)Ljava/util/List;
    .locals 1
    .param p2    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    sget-object p1, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟$ۥ;

    invoke-virtual {p1, p2}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟$ۥ;->ۥ(Landroid/content/Intent;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object p1

    :goto_1
    return-object p1
.end method
