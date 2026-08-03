.class public final LD/n0;
.super LD/m0;
.source "SourceFile"


# static fields
.field public static final q:LD/q0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    invoke-static {}, LD/v;->h()Landroid/view/WindowInsets;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, LD/q0;->d(Landroid/view/View;Landroid/view/WindowInsets;)LD/q0;

    move-result-object v0

    sput-object v0, LD/n0;->q:LD/q0;

    return-void
.end method

.method public constructor <init>(LD/q0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1, p2}, LD/m0;-><init>(LD/q0;Landroid/view/WindowInsets;)V

    return-void
.end method


# virtual methods
.method public final d(Landroid/view/View;)V
    .locals 0

    return-void
.end method

.method public f(I)Lv/c;
    .locals 1

    iget-object v0, p0, LD/j0;->c:Landroid/view/WindowInsets;

    invoke-static {p1}, LD/p0;->a(I)I

    move-result p1

    invoke-static {v0, p1}, LD/v;->f(Landroid/view/WindowInsets;I)Landroid/graphics/Insets;

    move-result-object p1

    invoke-static {p1}, Lv/c;->c(Landroid/graphics/Insets;)Lv/c;

    move-result-object p1

    return-object p1
.end method
