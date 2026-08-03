.class public LYue/ۥۣۡۤۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣۡۤۤ$ۥ۟۟۟۟;,
        LYue/ۥۣۡۤۤ$ۥ۟۟۟;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/content/Context;

.field public final ۥ۟:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

.field public final ۥ۟۟:Landroid/view/View;

.field public final ۥ۟۟۟:Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

.field public ۥ۟۟۟۟:LYue/ۥۣۡۤۤ$ۥ۟۟۟۟;

.field public ۥ۟۟۟۠:LYue/ۥۣۡۤۤ$ۥ۟۟۟;

.field public ۥ۟۟۟ۡ:Landroid/view/View$OnTouchListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, LYue/ۥۣۡۤۤ;-><init>(Landroid/content/Context;Landroid/view/View;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;I)V
    .locals 6
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 2
    sget v4, LYue/ۥۡۥۦۢ$ۥ۟;->ۥ۟۠ۥ۟:I

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, LYue/ۥۣۡۤۤ;-><init>(Landroid/content/Context;Landroid/view/View;III)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/View;III)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # I
        .annotation build LYue/ۥ۟ۢ۠۟;
        .end annotation
    .end param
    .param p5    # I
        .annotation build LYue/ۥۣۢ۠ۡ;
        .end annotation
    .end param

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LYue/ۥۣۡۤۤ;->ۥ:Landroid/content/Context;

    .line 5
    iput-object p2, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟:Landroid/view/View;

    .line 6
    new-instance v2, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-direct {v2, p1}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;-><init>(Landroid/content/Context;)V

    iput-object v2, p0, LYue/ۥۣۡۤۤ;->ۥ۟:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    .line 7
    new-instance v0, LYue/ۥۣۡۤۤ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۣۡۤۤ$ۥ;-><init>(LYue/ۥۣۡۤۤ;)V

    invoke-virtual {v2, v0}, Landroidx/appcompat/view/menu/ۥ۟۟۟۟;->setCallback(Landroidx/appcompat/view/menu/ۥ۟۟۟۟$ۥ;)V

    .line 8
    new-instance v7, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    const/4 v4, 0x0

    move-object v0, v7

    move-object v1, p1

    move-object v3, p2

    move v5, p4

    move v6, p5

    invoke-direct/range {v0 .. v6}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;-><init>(Landroid/content/Context;Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/View;ZII)V

    iput-object v7, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟:Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    .line 9
    invoke-virtual {v7, p3}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟ۤ(I)V

    .line 10
    new-instance p1, LYue/ۥۣۡۤۤ$ۥ۟;

    invoke-direct {p1, p0}, LYue/ۥۣۡۤۤ$ۥ۟;-><init>(LYue/ۥۣۡۤۤ;)V

    invoke-virtual {v7, p1}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟ۥ(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟:Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->dismiss()V

    return-void
.end method

.method public ۥ۟()Landroid/view/View$OnTouchListener;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟ۡ:Landroid/view/View$OnTouchListener;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥۣۡۤۤ$ۥ۟۟;

    iget-object v1, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟:Landroid/view/View;

    invoke-direct {v0, p0, v1}, LYue/ۥۣۡۤۤ$ۥ۟۟;-><init>(LYue/ۥۣۡۤۤ;Landroid/view/View;)V

    iput-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟ۡ:Landroid/view/View$OnTouchListener;

    :cond_0
    iget-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟ۡ:Landroid/view/View$OnTouchListener;

    return-object v0
.end method

.method public ۥ۟۟()I
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟:Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()Landroid/view/Menu;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Landroid/view/MenuInflater;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۢ۠ۥۢ;

    iget-object v1, p0, LYue/ۥۣۡۤۤ;->ۥ:Landroid/content/Context;

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۥۢ;-><init>(Landroid/content/Context;)V

    return-object v0
.end method

.method public ۥ۟۟۟۠()Landroid/widget/ListView;
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟:Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟۠()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟:Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟()Landroid/widget/ListView;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۡ(I)V
    .locals 2
    .param p1    # I
        .annotation build LYue/ۥۡ۠ۧ۟;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥۣۡۤۤ;->ۥ۟۟۟۟()Landroid/view/MenuInflater;

    move-result-object v0

    iget-object v1, p0, LYue/ۥۣۡۤۤ;->ۥ۟:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    invoke-virtual {v0, p1, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void
.end method

.method public ۥ۟۟۟ۢ(Z)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟:Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥۣ۟۟۟(Z)V

    return-void
.end method

.method public ۥۣ۟۟۟(I)V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟:Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    invoke-virtual {v0, p1}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟ۤ(I)V

    return-void
.end method

.method public ۥ۟۟۟ۤ(LYue/ۥۣۡۤۤ$ۥ۟۟۟;)V
    .locals 0
    .param p1    # LYue/ۥۣۡۤۤ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟۠:LYue/ۥۣۡۤۤ$ۥ۟۟۟;

    return-void
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥۣۡۤۤ$ۥ۟۟۟۟;)V
    .locals 0
    .param p1    # LYue/ۥۣۡۤۤ$ۥ۟۟۟۟;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟۟:LYue/ۥۣۡۤۤ$ۥ۟۟۟۟;

    return-void
.end method

.method public ۥ۟۟۟ۦ()V
    .locals 1

    iget-object v0, p0, LYue/ۥۣۡۤۤ;->ۥ۟۟۟:Landroidx/appcompat/view/menu/ۥۣ۟۟۟;

    invoke-virtual {v0}, Landroidx/appcompat/view/menu/ۥۣ۟۟۟;->ۥ۟۟۟ۦ()V

    return-void
.end method
