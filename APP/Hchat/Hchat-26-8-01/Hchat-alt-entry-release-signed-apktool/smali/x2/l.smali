.class public final Lx2/l;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:Landroid/content/Context;

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Li0/f0;

.field public final synthetic j:Lv0/f;

.field public final synthetic k:I

.field public final synthetic l:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lfg/l;Li0/f0;Lv0/f;ILandroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx2/l;->g:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lx2/l;->h:Lfg/l;

    .line 4
    .line 5
    iput-object p3, p0, Lx2/l;->i:Li0/f0;

    .line 6
    .line 7
    iput-object p4, p0, Lx2/l;->j:Lv0/f;

    .line 8
    .line 9
    iput p5, p0, Lx2/l;->k:I

    .line 10
    .line 11
    iput-object p6, p0, Lx2/l;->l:Landroid/view/View;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, Lx2/v;

    .line 2
    .line 3
    iget-object v1, p0, Lx2/l;->l:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object v6, v1

    .line 9
    check-cast v6, Lx1/r1;

    .line 10
    .line 11
    iget-object v1, p0, Lx2/l;->g:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v2, p0, Lx2/l;->h:Lfg/l;

    .line 14
    .line 15
    iget-object v3, p0, Lx2/l;->i:Li0/f0;

    .line 16
    .line 17
    iget-object v4, p0, Lx2/l;->j:Lv0/f;

    .line 18
    .line 19
    iget v5, p0, Lx2/l;->k:I

    .line 20
    .line 21
    invoke-direct/range {v0 .. v6}, Lx2/v;-><init>(Landroid/content/Context;Lfg/l;Li0/f0;Lv0/f;ILx1/r1;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lx2/h;->getLayoutNode()Lx1/f0;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    return-object v0
.end method
