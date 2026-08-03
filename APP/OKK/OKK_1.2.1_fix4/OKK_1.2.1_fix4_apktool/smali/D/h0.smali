.class public final LD/h0;
.super LD/g0;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LD/g0;-><init>()V

    return-void
.end method

.method public constructor <init>(LD/q0;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LD/g0;-><init>(LD/q0;)V

    return-void
.end method


# virtual methods
.method public c(ILv/c;)V
    .locals 1

    iget-object v0, p0, LD/g0;->c:Landroid/view/WindowInsets$Builder;

    invoke-static {p1}, LD/p0;->a(I)I

    move-result p1

    invoke-virtual {p2}, Lv/c;->d()Landroid/graphics/Insets;

    move-result-object p2

    invoke-static {v0, p1, p2}, LD/v;->q(Landroid/view/WindowInsets$Builder;ILandroid/graphics/Insets;)V

    return-void
.end method
