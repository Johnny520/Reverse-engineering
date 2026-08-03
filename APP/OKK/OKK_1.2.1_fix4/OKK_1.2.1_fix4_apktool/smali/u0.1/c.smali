.class public final Lu0/c;
.super Lf0/P;
.source "SourceFile"


# instance fields
.field public final synthetic b:Landroid/content/Context;

.field public final synthetic c:Landroid/text/TextPaint;

.field public final synthetic d:Lf0/P;

.field public final synthetic e:Lu0/d;


# direct methods
.method public constructor <init>(Lu0/d;Landroid/content/Context;Landroid/text/TextPaint;Lf0/P;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/c;->e:Lu0/d;

    iput-object p2, p0, Lu0/c;->b:Landroid/content/Context;

    iput-object p3, p0, Lu0/c;->c:Landroid/text/TextPaint;

    iput-object p4, p0, Lu0/c;->d:Lf0/P;

    return-void
.end method


# virtual methods
.method public final M(I)V
    .locals 1

    iget-object v0, p0, Lu0/c;->d:Lf0/P;

    invoke-virtual {v0, p1}, Lf0/P;->M(I)V

    return-void
.end method

.method public final N(Landroid/graphics/Typeface;Z)V
    .locals 3

    iget-object v0, p0, Lu0/c;->c:Landroid/text/TextPaint;

    iget-object v1, p0, Lu0/c;->e:Lu0/d;

    iget-object v2, p0, Lu0/c;->b:Landroid/content/Context;

    invoke-virtual {v1, v2, v0, p1}, Lu0/d;->g(Landroid/content/Context;Landroid/text/TextPaint;Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lu0/c;->d:Lf0/P;

    invoke-virtual {v0, p1, p2}, Lf0/P;->N(Landroid/graphics/Typeface;Z)V

    return-void
.end method
