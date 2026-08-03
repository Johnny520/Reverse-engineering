.class public final La/We;
.super La/a2;
.source "SourceFile"


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Landroid/text/TextPaint;

.field public final synthetic c:La/a2;

.field public final synthetic d:La/Ve;


# direct methods
.method public constructor <init>(La/Ve;Landroid/content/Context;Landroid/text/TextPaint;La/a2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/We;->d:La/Ve;

    iput-object p2, p0, La/We;->a:Landroid/content/Context;

    iput-object p3, p0, La/We;->b:Landroid/text/TextPaint;

    iput-object p4, p0, La/We;->c:La/a2;

    return-void
.end method


# virtual methods
.method public final d(I)V
    .locals 1

    iget-object v0, p0, La/We;->c:La/a2;

    invoke-virtual {v0, p1}, La/a2;->d(I)V

    return-void
.end method

.method public final e(Landroid/graphics/Typeface;Z)V
    .locals 3

    iget-object v0, p0, La/We;->b:Landroid/text/TextPaint;

    iget-object v1, p0, La/We;->d:La/Ve;

    iget-object v2, p0, La/We;->a:Landroid/content/Context;

    invoke-virtual {v1, v2, v0, p1}, La/Ve;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, La/We;->c:La/a2;

    invoke-virtual {v0, p1, p2}, La/a2;->e(Landroid/graphics/Typeface;Z)V

    return-void
.end method
