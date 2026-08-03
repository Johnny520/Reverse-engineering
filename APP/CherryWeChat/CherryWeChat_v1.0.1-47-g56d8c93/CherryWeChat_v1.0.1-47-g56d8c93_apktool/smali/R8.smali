.class public final synthetic LR8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:LHv;

.field public final synthetic c:Landroid/view/WindowManager$LayoutParams;

.field public final synthetic d:LHv;

.field public final synthetic e:LGv;

.field public final synthetic f:LGv;

.field public final synthetic g:Landroid/widget/FrameLayout;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;LHv;Landroid/view/WindowManager$LayoutParams;LHv;LGv;LGv;Landroid/widget/FrameLayout;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LR8;->a:Landroid/content/Context;

    iput-object p2, p0, LR8;->b:LHv;

    iput-object p3, p0, LR8;->c:Landroid/view/WindowManager$LayoutParams;

    iput-object p4, p0, LR8;->d:LHv;

    iput-object p5, p0, LR8;->e:LGv;

    iput-object p6, p0, LR8;->f:LGv;

    iput-object p7, p0, LR8;->g:Landroid/widget/FrameLayout;

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 9

    iget-object v5, p0, LR8;->f:LGv;

    iget-object v6, p0, LR8;->g:Landroid/widget/FrameLayout;

    iget-object v0, p0, LR8;->a:Landroid/content/Context;

    iget-object v1, p0, LR8;->b:LHv;

    iget-object v2, p0, LR8;->c:Landroid/view/WindowManager$LayoutParams;

    iget-object v3, p0, LR8;->d:LHv;

    iget-object v4, p0, LR8;->e:LGv;

    move-object v7, p1

    move-object v8, p2

    invoke-static/range {v0 .. v8}, Lio/github/cherrywechat/lua/api/CherryViewAPI;->G0(Landroid/content/Context;LHv;Landroid/view/WindowManager$LayoutParams;LHv;LGv;LGv;Landroid/widget/FrameLayout;Landroid/view/View;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method
