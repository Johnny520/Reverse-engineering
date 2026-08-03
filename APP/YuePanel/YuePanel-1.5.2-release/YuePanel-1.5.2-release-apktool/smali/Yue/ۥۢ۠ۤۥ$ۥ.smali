.class public final LYue/ۥۢ۠ۤۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢ۠ۤۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public final ۥ:Landroid/widget/TextView;

.field public final ۥ۟:Landroid/widget/TextView;

.field public final ۥ۟۟:Landroid/widget/ImageView;

.field public final ۥ۟۟۟:Landroid/widget/ImageView;

.field public final ۥ۟۟۟۟:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x1020014

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LYue/ۥۢ۠ۤۥ$ۥ;->ۥ:Landroid/widget/TextView;

    const v0, 0x1020015

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LYue/ۥۢ۠ۤۥ$ۥ;->ۥ۟:Landroid/widget/TextView;

    const v0, 0x1020007

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, LYue/ۥۢ۠ۤۥ$ۥ;->ۥ۟۟:Landroid/widget/ImageView;

    const v0, 0x1020008

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, LYue/ۥۢ۠ۤۥ$ۥ;->ۥ۟۟۟:Landroid/widget/ImageView;

    sget v0, LYue/ۥۡۥۦۢ$ۥ۟۟۟ۡ;->ۥ۟۟ۡ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/ImageView;

    iput-object p1, p0, LYue/ۥۢ۠ۤۥ$ۥ;->ۥ۟۟۟۟:Landroid/widget/ImageView;

    return-void
.end method
