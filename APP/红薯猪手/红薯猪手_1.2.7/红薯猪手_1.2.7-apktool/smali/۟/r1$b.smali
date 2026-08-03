.class public final L۟/r1$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final ۥ:Landroid/widget/TextView;

.field public final ۥ۟:Landroid/widget/TextView;

.field public final ۥ۟۟:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

.field public final ۥ۟۠:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 3

    const/4 v2, 0x6

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v1, v2, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    sget v0, L۟/r1;->ۥ۟:I

    invoke-static {}, L۟/r1$a;->ۥ۟۠()V

    invoke-virtual {p1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, L۟/r1$b;->ۥ:Landroid/widget/TextView;

    invoke-static {}, L۟/r1$a;->ۥ۟()V

    const/16 v0, 0x66

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, L۟/r1$b;->ۥ۟:Landroid/widget/TextView;

    invoke-static {}, L۟/r1$a;->ۥ۟۟()V

    const/16 v0, 0x666

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    iput-object v0, p0, L۟/r1$b;->ۥ۟۟:Lcom/skyhand/hookhand/dialog/view/SwitchButton;

    invoke-static {}, L۟/r1$a;->ۥ()V

    const/16 v0, 0x6666

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, L۟/r1$b;->ۥ۟۠:Landroid/widget/TextView;

    return-void

    nop

    :array_0
    .array-data 1
        -0x33t
        0x56t
        0x34t
        -0x25t
    .end array-data

    :array_1
    .array-data 1
        -0x45t
        0x3ft
        0x51t
        -0x54t
        -0x38t
        -0x2ft
    .end array-data
.end method
