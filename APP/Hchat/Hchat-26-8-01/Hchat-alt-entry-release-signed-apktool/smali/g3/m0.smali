.class public final Lg3/m0;
.super Lg3/l0;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final s:Lg3/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lg3/h;->g()Landroid/view/WindowInsets;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v0, v1}, Lg3/r0;->c(Landroid/view/WindowInsets;Landroid/view/View;)Lg3/r0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lg3/m0;->s:Lg3/r0;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lg3/r0;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lg3/l0;-><init>(Lg3/r0;Landroid/view/WindowInsets;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public constructor <init>(Lg3/r0;Lg3/m0;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lg3/l0;-><init>(Lg3/r0;Lg3/l0;)V

    return-void
.end method


# virtual methods
.method public g(I)Lb3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/h0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lg3/q0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, Lg3/h;->u(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lb3/a;->c(Landroid/graphics/Insets;)Lb3/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public h(I)Lb3/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/h0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lg3/q0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, Lg3/h;->e(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lb3/a;->c(Landroid/graphics/Insets;)Lb3/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public q(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/h0;->c:Landroid/view/WindowInsets;

    .line 2
    .line 3
    invoke-static {p1}, Lg3/q0;->a(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {v0, p1}, Lg3/h;->r(Landroid/view/WindowInsets;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
