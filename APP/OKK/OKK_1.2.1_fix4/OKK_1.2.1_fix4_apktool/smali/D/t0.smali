.class public final LD/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LA0/p;


# direct methods
.method public constructor <init>(Landroid/view/Window;Landroid/view/View;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, LD/d;

    invoke-direct {v0, p2}, LD/d;-><init>(Landroid/view/View;)V

    .line 5
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt p2, v1, :cond_0

    .line 6
    new-instance p2, LD/s0;

    .line 7
    invoke-static {p1}, LD/v;->m(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    move-result-object p1

    invoke-direct {p2, p1, v0}, LD/s0;-><init>(Landroid/view/WindowInsetsController;LD/d;)V

    .line 8
    iput-object p2, p0, LD/t0;->a:LA0/p;

    goto :goto_0

    .line 9
    :cond_0
    new-instance p2, LD/r0;

    .line 10
    invoke-direct {p2, p1, v0}, LD/r0;-><init>(Landroid/view/Window;LD/d;)V

    .line 11
    iput-object p2, p0, LD/t0;->a:LA0/p;

    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LD/s0;

    new-instance v1, LD/d;

    invoke-direct {v1, p1}, LD/d;-><init>(Landroid/view/WindowInsetsController;)V

    invoke-direct {v0, p1, v1}, LD/s0;-><init>(Landroid/view/WindowInsetsController;LD/d;)V

    iput-object v0, p0, LD/t0;->a:LA0/p;

    return-void
.end method
