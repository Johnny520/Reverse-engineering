.class public final La/s0;
.super Landroid/graphics/drawable/Animatable2$AnimationCallback;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/t0;


# direct methods
.method public constructor <init>(La/t0;)V
    .locals 0

    iput-object p1, p0, La/s0;->a:La/t0;

    invoke-direct {p0}, Landroid/graphics/drawable/Animatable2$AnimationCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, La/s0;->a:La/t0;

    invoke-virtual {v0, p1}, La/t0;->a(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final onAnimationStart(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    iget-object v0, p0, La/s0;->a:La/t0;

    invoke-virtual {v0, p1}, La/t0;->b(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method
