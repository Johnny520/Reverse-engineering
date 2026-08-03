.class public final La/H2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/Mf$a;

.field public final b:Landroid/os/Handler;


# direct methods
.method public constructor <init>(La/Mf$a;Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/H2;->a:La/Mf$a;

    iput-object p2, p0, La/H2;->b:Landroid/os/Handler;

    return-void
.end method


# virtual methods
.method public final a(La/R6$a;)V
    .locals 4

    iget v0, p1, La/R6$a;->b:I

    iget-object v1, p0, La/H2;->b:Landroid/os/Handler;

    iget-object v2, p0, La/H2;->a:La/Mf$a;

    if-nez v0, :cond_0

    new-instance v0, La/F2;

    iget-object p1, p1, La/R6$a;->a:Landroid/graphics/Typeface;

    invoke-direct {v0, v2, p1}, La/F2;-><init>(La/Mf$a;Landroid/graphics/Typeface;)V

    invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :cond_0
    new-instance p1, La/G2;

    const/4 v3, 0x0

    invoke-direct {p1, v2, v0, v3}, La/G2;-><init>(Ljava/lang/Object;II)V

    invoke-virtual {v1, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
