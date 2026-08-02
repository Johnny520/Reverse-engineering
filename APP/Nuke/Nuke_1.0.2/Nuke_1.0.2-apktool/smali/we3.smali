.class public Lwe3;
.super Lve3;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final x:Lcf3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lce3;->f()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Lcf3;->c(Landroid/view/View;Landroid/view/WindowInsets;)Lcf3;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lwe3;->x:Lcf3;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lcf3;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lve3;-><init>(Lcf3;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Lcf3;Lwe3;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lve3;-><init>(Lcf3;Lve3;)V

    return-void
.end method


# virtual methods
.method public i(I)Lzz0;
    .locals 0

    .line 1
    iget-object p0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lbf3;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p1}, Lce3;->n(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lzz0;->c(Landroid/graphics/Insets;)Lzz0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public j(I)Lzz0;
    .locals 0

    .line 1
    iget-object p0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lbf3;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p1}, Lce3;->d(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lzz0;->c(Landroid/graphics/Insets;)Lzz0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public p(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public u(I)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lqe3;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lbf3;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p0, p1}, Lce3;->l(Landroid/view/WindowInsets;I)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
