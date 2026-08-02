.class public final Lmc;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lxm0;


# instance fields
.field public final synthetic i:Landroid/content/Context;

.field public final synthetic j:Lin0;

.field public final synthetic k:Leo0;

.field public final synthetic l:Lfc2;

.field public final synthetic m:I

.field public final synthetic n:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lin0;Leo0;Lfc2;ILandroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lmc;->i:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lmc;->j:Lin0;

    .line 4
    .line 5
    iput-object p3, p0, Lmc;->k:Leo0;

    .line 6
    .line 7
    iput-object p4, p0, Lmc;->l:Lfc2;

    .line 8
    .line 9
    iput p5, p0, Lmc;->m:I

    .line 10
    .line 11
    iput-object p6, p0, Lmc;->n:Landroid/view/View;

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 7

    .line 1
    new-instance v0, Lab3;

    .line 2
    .line 3
    iget-object v1, p0, Lmc;->n:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object v6, v1

    .line 9
    check-cast v6, Lzv1;

    .line 10
    .line 11
    iget-object v1, p0, Lmc;->i:Landroid/content/Context;

    .line 12
    .line 13
    iget-object v2, p0, Lmc;->j:Lin0;

    .line 14
    .line 15
    iget-object v3, p0, Lmc;->k:Leo0;

    .line 16
    .line 17
    iget-object v4, p0, Lmc;->l:Lfc2;

    .line 18
    .line 19
    iget v5, p0, Lmc;->m:I

    .line 20
    .line 21
    invoke-direct/range {v0 .. v6}, Lab3;-><init>(Landroid/content/Context;Lin0;Leo0;Lfc2;ILzv1;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lic;->getLayoutNode()Lr61;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
