.class public final Ly2/g;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Ly2/x;

.field public final synthetic h:Lfg/a;

.field public final synthetic i:Ly2/c0;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lu2/m;


# direct methods
.method public constructor <init>(Ly2/x;Lfg/a;Ly2/c0;Ljava/lang/String;Lu2/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ly2/g;->g:Ly2/x;

    .line 2
    .line 3
    iput-object p2, p0, Ly2/g;->h:Lfg/a;

    .line 4
    .line 5
    iput-object p3, p0, Ly2/g;->i:Ly2/c0;

    .line 6
    .line 7
    iput-object p4, p0, Ly2/g;->j:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Ly2/g;->k:Lu2/m;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    check-cast p1, Li0/a0;

    .line 2
    .line 3
    iget-object p1, p0, Ly2/g;->g:Ly2/x;

    .line 4
    .line 5
    iget-object v0, p1, Ly2/x;->v:Landroid/view/WindowManager;

    .line 6
    .line 7
    iget-object v1, p1, Ly2/x;->w:Landroid/view/WindowManager$LayoutParams;

    .line 8
    .line 9
    invoke-interface {v0, p1, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ly2/g;->j:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p0, Ly2/g;->k:Lu2/m;

    .line 15
    .line 16
    iget-object v2, p0, Ly2/g;->h:Lfg/a;

    .line 17
    .line 18
    iget-object v3, p0, Ly2/g;->i:Ly2/c0;

    .line 19
    .line 20
    invoke-virtual {p1, v2, v3, v0, v1}, Ly2/x;->o(Lfg/a;Ly2/c0;Ljava/lang/String;Lu2/m;)V

    .line 21
    .line 22
    .line 23
    new-instance v0, Lb0/m;

    .line 24
    .line 25
    const/16 v1, 0x9

    .line 26
    .line 27
    invoke-direct {v0, p1, v1}, Lb0/m;-><init>(Ljava/lang/Object;I)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method
