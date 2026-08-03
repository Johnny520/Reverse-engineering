.class public final LD/r0;
.super LA0/p;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/Window;

.field public final b:LD/d;


# direct methods
.method public constructor <init>(Landroid/view/Window;LD/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/r0;->a:Landroid/view/Window;

    iput-object p2, p0, LD/r0;->b:LD/d;

    return-void
.end method


# virtual methods
.method public final Y()V
    .locals 4

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_4

    const/16 v2, 0x8

    and-int v3, v2, v1

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    if-eq v1, v0, :cond_3

    const/4 v3, 0x2

    if-eq v1, v3, :cond_2

    if-eq v1, v2, :cond_1

    goto :goto_1

    :cond_1
    iget-object v2, p0, LD/r0;->b:LD/d;

    iget-object v2, v2, LD/d;->b:Ljava/lang/Object;

    check-cast v2, LD/d;

    invoke-virtual {v2}, LD/d;->A()V

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v3}, LD/r0;->g0(I)V

    goto :goto_1

    :cond_3
    const/4 v2, 0x4

    invoke-virtual {p0, v2}, LD/r0;->g0(I)V

    iget-object v2, p0, LD/r0;->a:Landroid/view/Window;

    const/16 v3, 0x400

    invoke-virtual {v2, v3}, Landroid/view/Window;->clearFlags(I)V

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    return-void
.end method

.method public final g0(I)V
    .locals 2

    iget-object v0, p0, LD/r0;->a:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    not-int p1, p1

    and-int/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/view/View;->setSystemUiVisibility(I)V

    return-void
.end method
