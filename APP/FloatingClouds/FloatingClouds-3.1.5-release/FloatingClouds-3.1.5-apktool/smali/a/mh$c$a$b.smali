.class public final La/mh$c$a$b;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/mh$c$a;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:La/mh;

.field public final synthetic b:Landroid/view/View;


# direct methods
.method public constructor <init>(La/mh;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, La/mh$c$a$b;->a:La/mh;

    iput-object p2, p0, La/mh$c$a$b;->b:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2

    iget-object p1, p0, La/mh$c$a$b;->a:La/mh;

    iget-object v0, p1, La/mh;->a:La/mh$e;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v0, v1}, La/mh$e;->d(F)V

    iget-object v0, p0, La/mh$c$a$b;->b:Landroid/view/View;

    invoke-static {p1, v0}, La/mh$c;->e(La/mh;Landroid/view/View;)V

    return-void
.end method
