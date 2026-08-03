.class public final LGF;
.super LFF;
.source ""


# static fields
.field public static final s:LLF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, LS;->g()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LLF;->h(Landroid/view/View;Landroid/view/WindowInsets;)LLF;

    move-result-object v0

    sput-object v0, LGF;->s:LLF;

    return-void
.end method

.method public constructor <init>(LLF;LGF;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, LFF;-><init>(LLF;LFF;)V

    return-void
.end method

.method public constructor <init>(LLF;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LFF;-><init>(LLF;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public g(I)Lyl;
    .locals 1

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, LKF;->a(I)I

    move-result p1

    invoke-static {v0, p1}, LS;->e(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lyl;->c(Landroid/graphics/Insets;)Lyl;

    move-result-object p1

    return-object p1
.end method
