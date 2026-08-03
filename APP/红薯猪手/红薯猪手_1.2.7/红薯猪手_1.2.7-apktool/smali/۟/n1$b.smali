.class public final L۟/n1$b;
.super Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/n1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field public final ۥ:Landroid/widget/TextView;

.field public final ۥ۟:L۟/h8;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 5

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    invoke-direct {p0, p1}, Landroidx/recyclerview/widget/RecyclerView$ViewHolder;-><init>(Landroid/view/View;)V

    sget v0, L۟/n1;->ۥ۟۟:I

    invoke-static {}, L۟/n1$a;->ۥ۟()V

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v2, 0x11

    new-array v3, v2, [B

    fill-array-data v3, :array_2

    new-array v4, v1, [B

    fill-array-data v4, :array_3

    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, L۟/n1$b;->ۥ:Landroid/widget/TextView;

    invoke-static {}, L۟/n1$a;->ۥ()V

    const/16 v0, 0x666

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    new-array v0, v2, [B

    fill-array-data v0, :array_4

    new-array v1, v1, [B

    fill-array-data v1, :array_5

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast p1, L۟/h8;

    iput-object p1, p0, L۟/n1$b;->ۥ۟:L۟/h8;

    return-void

    nop

    :array_0
    .array-data 1
        0x79t
        -0x62t
        -0x76t
        -0x43t
    .end array-data

    :array_1
    .array-data 1
        0xft
        -0x9t
        -0x11t
        -0x36t
        0xet
        -0xat
    .end array-data

    nop

    :array_2
    .array-data 1
        0x61t
        -0x5ft
        -0x1et
        0x6ct
        -0x5bt
        -0x54t
        0x62t
        -0x41t
        -0x32t
        0x71t
        -0x46t
        -0x5ft
        0x2ft
        -0x1at
        -0x5et
        0x26t
        -0x26t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x7t
        -0x38t
        -0x74t
        0x8t
        -0xdt
        -0x3bt
    .end array-data

    nop

    :array_4
    .array-data 1
        0x12t
        0x5bt
        0x38t
        0x1dt
        -0x52t
        -0x6et
        0x11t
        0x45t
        0x14t
        0x0t
        -0x4ft
        -0x61t
        0x5ct
        0x1ct
        0x78t
        0x57t
        -0x2ft
    .end array-data

    nop

    :array_5
    .array-data 1
        0x74t
        0x32t
        0x56t
        0x79t
        -0x8t
        -0x5t
    .end array-data
.end method
