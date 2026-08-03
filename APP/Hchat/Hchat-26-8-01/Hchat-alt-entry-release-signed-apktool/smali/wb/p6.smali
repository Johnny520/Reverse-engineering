.class public final Lwb/p6;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:Lgg/q;

.field public final synthetic h:Li0/j1;

.field public final synthetic i:Lgg/u;

.field public final synthetic j:Lgg/u;

.field public final synthetic k:Lgg/q;

.field public final synthetic l:Lwb/o6;

.field public final synthetic m:Ljava/util/ArrayList;

.field public final synthetic n:Landroid/view/ViewGroup;

.field public final synthetic o:Lc9/a1;


# direct methods
.method public constructor <init>(Landroid/app/Activity;Lgg/q;Li0/j1;Lgg/u;Lgg/u;Lgg/q;Lwb/o6;Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc9/a1;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lwb/p6;->g:Lgg/q;

    .line 2
    .line 3
    iput-object p3, p0, Lwb/p6;->h:Li0/j1;

    .line 4
    .line 5
    iput-object p4, p0, Lwb/p6;->i:Lgg/u;

    .line 6
    .line 7
    iput-object p5, p0, Lwb/p6;->j:Lgg/u;

    .line 8
    .line 9
    iput-object p6, p0, Lwb/p6;->k:Lgg/q;

    .line 10
    .line 11
    iput-object p7, p0, Lwb/p6;->l:Lwb/o6;

    .line 12
    .line 13
    iput-object p8, p0, Lwb/p6;->m:Ljava/util/ArrayList;

    .line 14
    .line 15
    iput-object p9, p0, Lwb/p6;->n:Landroid/view/ViewGroup;

    .line 16
    .line 17
    iput-object p10, p0, Lwb/p6;->o:Lc9/a1;

    .line 18
    .line 19
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 10

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x4

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const/4 v0, 0x1

    .line 16
    if-ne p1, v0, :cond_0

    .line 17
    .line 18
    iget-object v8, p0, Lwb/p6;->n:Landroid/view/ViewGroup;

    .line 19
    .line 20
    iget-object v9, p0, Lwb/p6;->o:Lc9/a1;

    .line 21
    .line 22
    iget-object v1, p0, Lwb/p6;->g:Lgg/q;

    .line 23
    .line 24
    iget-object v2, p0, Lwb/p6;->h:Li0/j1;

    .line 25
    .line 26
    iget-object v3, p0, Lwb/p6;->i:Lgg/u;

    .line 27
    .line 28
    iget-object v4, p0, Lwb/p6;->j:Lgg/u;

    .line 29
    .line 30
    iget-object v5, p0, Lwb/p6;->k:Lgg/q;

    .line 31
    .line 32
    iget-object v6, p0, Lwb/p6;->l:Lwb/o6;

    .line 33
    .line 34
    iget-object v7, p0, Lwb/p6;->m:Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-static/range {v1 .. v9}, La7/a;->c(Lgg/q;Li0/j1;Lgg/u;Lgg/u;Lgg/q;Lwb/o6;Ljava/util/ArrayList;Landroid/view/ViewGroup;Lc9/a1;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return v0

    .line 40
    :cond_1
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    return p1
.end method
