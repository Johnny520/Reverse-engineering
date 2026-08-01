.class public final synthetic Lsf0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Landroid/content/SharedPreferences;

.field public final synthetic b:I

.field public final synthetic c:Landroid/content/Context;

.field public final synthetic d:Ljava/util/ArrayList;

.field public final synthetic e:I

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;ILandroid/content/Context;Ljava/util/ArrayList;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsf0;->a:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    iput p2, p0, Lsf0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, Lsf0;->c:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p4, p0, Lsf0;->d:Ljava/util/ArrayList;

    .line 11
    .line 12
    iput p5, p0, Lsf0;->e:I

    .line 13
    .line 14
    iput p6, p0, Lsf0;->f:I

    .line 15
    .line 16
    iput p7, p0, Lsf0;->g:I

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    iget v5, p0, Lsf0;->f:I

    .line 2
    .line 3
    iget v6, p0, Lsf0;->g:I

    .line 4
    .line 5
    iget-object v0, p0, Lsf0;->a:Landroid/content/SharedPreferences;

    .line 6
    .line 7
    iget v1, p0, Lsf0;->b:I

    .line 8
    .line 9
    iget-object v2, p0, Lsf0;->c:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v3, p0, Lsf0;->d:Ljava/util/ArrayList;

    .line 12
    .line 13
    iget v4, p0, Lsf0;->e:I

    .line 14
    .line 15
    move-object v7, p1

    .line 16
    invoke-static/range {v0 .. v7}, Lvf0;->N0(Landroid/content/SharedPreferences;ILandroid/content/Context;Ljava/util/ArrayList;IIILandroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
