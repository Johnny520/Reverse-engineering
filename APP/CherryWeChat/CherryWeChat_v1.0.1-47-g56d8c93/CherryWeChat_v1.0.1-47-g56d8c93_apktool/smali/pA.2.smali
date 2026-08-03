.class public final LpA;
.super LGu;
.source ""


# instance fields
.field public final synthetic n:Landroid/content/Context;

.field public final synthetic o:Landroid/text/TextPaint;

.field public final synthetic p:LGu;

.field public final synthetic q:LqA;


# direct methods
.method public constructor <init>(LqA;Landroid/content/Context;Landroid/text/TextPaint;LGu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LpA;->q:LqA;

    iput-object p2, p0, LpA;->n:Landroid/content/Context;

    iput-object p3, p0, LpA;->o:Landroid/text/TextPaint;

    iput-object p4, p0, LpA;->p:LGu;

    return-void
.end method


# virtual methods
.method public final y(I)V
    .locals 1

    iget-object v0, p0, LpA;->p:LGu;

    invoke-virtual {v0, p1}, LGu;->y(I)V

    return-void
.end method

.method public final z(Landroid/graphics/Typeface;Z)V
    .locals 3

    iget-object v0, p0, LpA;->n:Landroid/content/Context;

    iget-object v1, p0, LpA;->o:Landroid/text/TextPaint;

    iget-object v2, p0, LpA;->q:LqA;

    invoke-virtual {v2, v0, v1, p1}, LqA;->f(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, LpA;->p:LGu;

    invoke-virtual {v0, p1, p2}, LGu;->z(Landroid/graphics/Typeface;Z)V

    return-void
.end method
