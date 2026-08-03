.class public LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;
.super Landroid/view/WindowInsetsAnimation$Callback;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1e
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۣۥ$ۥ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۢۥۣۥ$ۥ۟;

.field public ۥ۟:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public ۥ۟۟:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06e5;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Landroid/view/WindowInsetsAnimation;",
            "LYue/\u06e5\u06e2\u06e5\u06e3\u06e5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۢۥۣۥ$ۥ۟;)V
    .locals 1
    .param p1    # LYue/ۥۢۥۣۥ$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1}, LYue/ۥۢۥۣۥ$ۥ۟;->getDispatchMode()I

    move-result v0

    invoke-direct {p0, v0}, Landroid/view/WindowInsetsAnimation$Callback;-><init>(I)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ۟۟۟:Ljava/util/HashMap;

    iput-object p1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟;

    return-void
.end method


# virtual methods
.method public onEnd(Landroid/view/WindowInsetsAnimation;)V
    .locals 2
    .param p1    # Landroid/view/WindowInsetsAnimation;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟;

    invoke-virtual {p0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ(Landroid/view/WindowInsetsAnimation;)LYue/ۥۢۥۣۥ;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۢۥۣۥ$ۥ۟;->onEnd(LYue/ۥۢۥۣۥ;)V

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ۟۟۟:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public onPrepare(Landroid/view/WindowInsetsAnimation;)V
    .locals 1
    .param p1    # Landroid/view/WindowInsetsAnimation;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟;

    invoke-virtual {p0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ(Landroid/view/WindowInsetsAnimation;)LYue/ۥۢۥۣۥ;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢۥۣۥ$ۥ۟;->onPrepare(LYue/ۥۢۥۣۥ;)V

    return-void
.end method

.method public onProgress(Landroid/view/WindowInsets;Ljava/util/List;)Landroid/view/WindowInsets;
    .locals 3
    .param p1    # Landroid/view/WindowInsets;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/WindowInsets;",
            "Ljava/util/List<",
            "Landroid/view/WindowInsetsAnimation;",
            ">;)",
            "Landroid/view/WindowInsets;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ۟۟:Ljava/util/ArrayList;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ۟:Ljava/util/List;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_1
    if-ltz v0, :cond_1

    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۢۥۤۧ;->ۥ(Ljava/lang/Object;)Landroid/view/WindowInsetsAnimation;

    move-result-object v1

    invoke-virtual {p0, v1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ(Landroid/view/WindowInsetsAnimation;)LYue/ۥۢۥۣۥ;

    move-result-object v2

    invoke-static {v1}, LYue/ۥۢۥۤۡ;->ۥ(Landroid/view/WindowInsetsAnimation;)F

    move-result v1

    invoke-virtual {v2, v1}, LYue/ۥۢۥۣۥ;->ۥۣ۟۟۟(F)V

    iget-object v1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ۟۟:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, -0x1

    goto :goto_1

    :cond_1
    iget-object p2, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟;

    invoke-static {p1}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ(Landroid/view/WindowInsets;)LYue/ۥۢۥۦ;

    move-result-object p1

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ۟:Ljava/util/List;

    invoke-virtual {p2, p1, v0}, LYue/ۥۢۥۣۥ$ۥ۟;->onProgress(LYue/ۥۢۥۦ;Ljava/util/List;)LYue/ۥۢۥۦ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۢۥۦ;->ۥ۟۟ۡۨ()Landroid/view/WindowInsets;

    move-result-object p1

    return-object p1
.end method

.method public onStart(Landroid/view/WindowInsetsAnimation;Landroid/view/WindowInsetsAnimation$Bounds;)Landroid/view/WindowInsetsAnimation$Bounds;
    .locals 1
    .param p1    # Landroid/view/WindowInsetsAnimation;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/WindowInsetsAnimation$Bounds;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ:LYue/ۥۢۥۣۥ$ۥ۟;

    invoke-virtual {p0, p1}, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ(Landroid/view/WindowInsetsAnimation;)LYue/ۥۢۥۣۥ;

    move-result-object p1

    invoke-static {p2}, LYue/ۥۢۥۣۥ$ۥ;->ۥ۟۟۟۟(Landroid/view/WindowInsetsAnimation$Bounds;)LYue/ۥۢۥۣۥ$ۥ;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, LYue/ۥۢۥۣۥ$ۥ۟;->onStart(LYue/ۥۢۥۣۥ;LYue/ۥۢۥۣۥ$ۥ;)LYue/ۥۢۥۣۥ$ۥ;

    move-result-object p1

    invoke-virtual {p1}, LYue/ۥۢۥۣۥ$ۥ;->ۥ۟۟۟()Landroid/view/WindowInsetsAnimation$Bounds;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ(Landroid/view/WindowInsetsAnimation;)LYue/ۥۢۥۣۥ;
    .locals 2
    .param p1    # Landroid/view/WindowInsetsAnimation;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ۟۟۟:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۢۥۣۥ;

    if-nez v0, :cond_0

    invoke-static {p1}, LYue/ۥۢۥۣۥ;->ۥ۟۟۟ۤ(Landroid/view/WindowInsetsAnimation;)LYue/ۥۢۥۣۥ;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۢۥۣۥ$ۥ۟۟۟$ۥ;->ۥ۟۟۟:Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method
