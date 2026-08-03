.class public LwF;
.super LvF;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LvF;-><init>()V

    return-void
.end method

.method public constructor <init>(LLF;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LvF;-><init>(LLF;)V

    return-void
.end method


# virtual methods
.method public c(ILyl;)V
    .locals 1

    iget-object v0, p0, LvF;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, LJF;->a(I)I

    move-result p1

    invoke-virtual {p2}, Lyl;->d()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {v0, p1, p2}, LS;->p(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)V

    return-void
.end method
