.class public abstract Ljd1;
.super Lpd1;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public final c:Landroid/view/WindowInsets$Builder;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lpd1;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/view/WindowInsets$Builder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ljd1;->c:Landroid/view/WindowInsets$Builder;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public b()Lbe1;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lpd1;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Ljd1;->c:Landroid/view/WindowInsets$Builder;

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/WindowInsets$Builder;->build()Landroid/view/WindowInsets;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, Lbe1;->b(Landroid/view/View;Landroid/view/WindowInsets;)Lbe1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v2, v0, Lbe1;->a:Lyd1;

    .line 16
    .line 17
    invoke-virtual {v2, v1}, Lyd1;->s([Li20;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v1}, Lyd1;->r(Llo;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lpd1;->a:[[Landroid/graphics/Rect;

    .line 24
    .line 25
    invoke-virtual {v2, v1}, Lyd1;->v([[Landroid/graphics/Rect;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lpd1;->b:[[Landroid/graphics/Rect;

    .line 29
    .line 30
    invoke-virtual {v2, p0}, Lyd1;->w([[Landroid/graphics/Rect;)V

    .line 31
    .line 32
    .line 33
    return-object v0
.end method
