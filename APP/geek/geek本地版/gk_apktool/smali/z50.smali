.class public final Lz50;
.super Lgt;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/text/TextPaint;

.field public final synthetic c:Lgt;

.field public final synthetic d:La60;


# direct methods
.method public constructor <init>(La60;Landroid/content/Context;Landroid/text/TextPaint;Lgt;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz50;->d:La60;

    .line 5
    .line 6
    iput-object p2, p0, Lz50;->a:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Lz50;->b:Landroid/text/TextPaint;

    .line 9
    .line 10
    iput-object p4, p0, Lz50;->c:Lgt;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final p(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz50;->c:Lgt;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lgt;->p(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final q(Landroid/graphics/Typeface;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lz50;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lz50;->b:Landroid/text/TextPaint;

    .line 4
    .line 5
    iget-object v2, p0, Lz50;->d:La60;

    .line 6
    .line 7
    invoke-virtual {v2, v0, v1, p1}, La60;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lz50;->c:Lgt;

    .line 11
    .line 12
    invoke-virtual {v0, p1, p2}, Lgt;->q(Landroid/graphics/Typeface;Z)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
