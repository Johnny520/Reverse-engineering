.class public final Lia;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic i:Ld22;

.field public final synthetic j:Lxm0;

.field public final synthetic k:Lh22;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Ld61;


# direct methods
.method public constructor <init>(Ld22;Lxm0;Lh22;Ljava/lang/String;Ld61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lia;->i:Ld22;

    .line 2
    .line 3
    iput-object p2, p0, Lia;->j:Lxm0;

    .line 4
    .line 5
    iput-object p3, p0, Lia;->k:Lh22;

    .line 6
    .line 7
    iput-object p4, p0, Lia;->l:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, Lia;->m:Ld61;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lba0;

    .line 2
    .line 3
    iget-object p1, p0, Lia;->i:Ld22;

    .line 4
    .line 5
    iget-object v0, p1, Ld22;->w:Landroid/view/WindowManager;

    .line 6
    .line 7
    iget-object v1, p1, Ld22;->x:Landroid/view/WindowManager$LayoutParams;

    .line 8
    .line 9
    invoke-interface {v0, p1, v1}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lia;->l:Ljava/lang/String;

    .line 13
    .line 14
    iget-object v1, p0, Lia;->m:Ld61;

    .line 15
    .line 16
    iget-object v2, p0, Lia;->j:Lxm0;

    .line 17
    .line 18
    iget-object p0, p0, Lia;->k:Lh22;

    .line 19
    .line 20
    invoke-virtual {p1, v2, p0, v0, v1}, Ld22;->o(Lxm0;Lh22;Ljava/lang/String;Ld61;)V

    .line 21
    .line 22
    .line 23
    new-instance p0, Lf8;

    .line 24
    .line 25
    const/4 v0, 0x1

    .line 26
    invoke-direct {p0, v0, p1}, Lf8;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method
