.class public final L۟/r4$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/r4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field public final ۥ:Landroid/widget/TextView;

.field public final ۥ۟:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(L۟/r4;Landroid/widget/LinearLayout;)V
    .locals 5

    const/16 v4, 0x11

    const/4 v3, 0x6

    const/16 v0, 0xa

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    new-array v1, v3, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    invoke-direct {p0, p2}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    invoke-virtual {p1}, L۟/r4;->ۥ۠ۤ()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-array v1, v4, [B

    fill-array-data v1, :array_2

    new-array v2, v3, [B

    fill-array-data v2, :array_3

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, L۟/r4$b;->ۥ:Landroid/widget/TextView;

    invoke-virtual {p1}, L۟/r4;->ۥۣ۠()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-array v1, v4, [B

    fill-array-data v1, :array_4

    new-array v2, v3, [B

    fill-array-data v2, :array_5

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, L۟/r4$b;->ۥ۟:Landroid/widget/TextView;

    return-void

    :array_0
    .array-data 1
        -0x5ct
        0x6dt
        0x60t
        0x1t
        0x72t
        0x2ct
        -0x7et
        0x65t
        0x77t
        0x13t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x2ct
        0xct
        0x12t
        0x64t
        0x1ct
        0x58t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x76t
        0x1ct
        0xat
        -0x2et
        0x41t
        0x55t
        0x75t
        0x2t
        0x26t
        -0x31t
        0x5et
        0x58t
        0x38t
        0x5bt
        0x4at
        -0x68t
        0x3et
    .end array-data

    nop

    :array_3
    .array-data 1
        0x10t
        0x75t
        0x64t
        -0x4at
        0x17t
        0x3ct
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x5bt
        -0x1et
        -0x44t
        0x3ft
        0x44t
        -0x11t
        -0x5at
        -0x4t
        -0x70t
        0x22t
        0x5bt
        -0x1et
        -0x15t
        -0x5bt
        -0x4t
        0x75t
        0x3bt
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x3dt
        -0x75t
        -0x2et
        0x5bt
        0x12t
        -0x7at
    .end array-data
.end method
