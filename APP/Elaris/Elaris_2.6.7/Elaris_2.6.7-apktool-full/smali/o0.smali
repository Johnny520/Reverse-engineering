.class public final Lo0;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic a:Lm0;

.field public final synthetic b:Lp0;


# direct methods
.method public constructor <init>(Lp0;Lm0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo0;->b:Lp0;

    .line 5
    .line 6
    iput-object p2, p0, Lo0;->a:Lm0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    iget-object p1, p0, Lo0;->b:Lp0;

    .line 2
    .line 3
    const/4 p2, 0x1

    .line 4
    iput-boolean p2, p1, Lp0;->i:Z

    .line 5
    .line 6
    iget-object p0, p0, Lo0;->a:Lm0;

    .line 7
    .line 8
    invoke-static {p0}, Lr0;->l(Lm0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
