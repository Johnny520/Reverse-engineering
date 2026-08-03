.class public final La/mh$c$a$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La/mh$c$a;->onApplyWindowInsets(Landroid/view/View;Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/view/View;

.field public final synthetic b:La/mh;

.field public final synthetic c:La/mh$a;

.field public final synthetic d:Landroid/animation/ValueAnimator;


# direct methods
.method public constructor <init>(Landroid/view/View;La/mh;La/mh$a;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mh$c$a$c;->a:Landroid/view/View;

    iput-object p2, p0, La/mh$c$a$c;->b:La/mh;

    iput-object p3, p0, La/mh$c$a$c;->c:La/mh$a;

    iput-object p4, p0, La/mh$c$a$c;->d:Landroid/animation/ValueAnimator;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, La/mh$c$a$c;->b:La/mh;

    iget-object v1, p0, La/mh$c$a$c;->c:La/mh$a;

    iget-object v2, p0, La/mh$c$a$c;->a:Landroid/view/View;

    invoke-static {v2, v0, v1}, La/mh$c;->h(Landroid/view/View;La/mh;La/mh$a;)V

    iget-object v0, p0, La/mh$c$a$c;->d:Landroid/animation/ValueAnimator;

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    return-void
.end method
