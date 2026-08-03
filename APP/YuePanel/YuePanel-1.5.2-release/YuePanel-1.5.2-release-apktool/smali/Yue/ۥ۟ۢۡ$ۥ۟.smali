.class public LYue/ۥ۟ۢۡ$ۥ۟;
.super Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public ۥ:Landroid/widget/TextView;

.field public ۥ۟:Landroid/widget/TextView;

.field public ۥ۟۟:Landroid/widget/TextView;

.field public ۥ۟۟۟:Landroid/widget/LinearLayout;

.field public ۥ۟۟۟۟:Landroid/widget/Button;

.field public ۥ۟۟۟۠:Landroid/widget/Button;

.field public ۥ۟۟۟ۡ:Landroid/widget/Button;

.field public ۥ۟۟۟ۢ:Landroid/widget/ImageView;

.field public ۥۣ۟۟۟:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ۥ۟۟ۡۤ;-><init>(Landroid/view/View;)V

    sget v0, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥ۟۟۟ۧ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LYue/ۥ۟ۢۡ$ۥ۟;->ۥ:Landroid/widget/TextView;

    sget v0, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥ۟۟۟ۨ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LYue/ۥ۟ۢۡ$ۥ۟;->ۥ۟:Landroid/widget/TextView;

    sget v0, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥ۟۟۟ۦ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, LYue/ۥ۟ۢۡ$ۥ۟;->ۥ۟۟:Landroid/widget/TextView;

    sget v0, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥ۟۟۟ۤ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, LYue/ۥ۟ۢۡ$ۥ۟;->ۥ۟۟۟:Landroid/widget/LinearLayout;

    sget v0, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥ۟۟۟۟:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, LYue/ۥ۟ۢۡ$ۥ۟;->ۥ۟۟۟ۡ:Landroid/widget/Button;

    sget v0, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥ۟۟۟:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, LYue/ۥ۟ۢۡ$ۥ۟;->ۥ۟۟۟۠:Landroid/widget/Button;

    sget v0, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥۣ۟۟۟:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, LYue/ۥ۟ۢۡ$ۥ۟;->ۥ۟۟۟ۢ:Landroid/widget/ImageView;

    sget v0, Lcom/yuexin/panel/R$ۥ۟۟۟;->ۥ۟۟۟۠:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/LinearLayout;

    iput-object p1, p0, LYue/ۥ۟ۢۡ$ۥ۟;->ۥۣ۟۟۟:Landroid/widget/LinearLayout;

    return-void
.end method
