.class public final Lwb;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Lhc;


# instance fields
.field public final synthetic a:Lx2;

.field public final synthetic b:Landroid/view/View;

.field public final synthetic c:Landroid/view/View;


# direct methods
.method public constructor <init>(Lx2;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb;->a:Lx2;

    .line 5
    .line 6
    iput-object p2, p0, Lwb;->b:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, Lwb;->c:Landroid/view/View;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lwb;->a:Lx2;

    .line 2
    .line 3
    invoke-static {v0}, Lu9;->a(Lx2;)V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lwb;->b:Landroid/view/View;

    .line 7
    .line 8
    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    .line 10
    .line 11
    :catchall_0
    :try_start_1
    invoke-virtual {v1}, Landroid/view/View;->requestLayout()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 12
    .line 13
    .line 14
    :catchall_1
    :try_start_2
    invoke-virtual {v1}, Landroid/view/View;->forceLayout()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 15
    .line 16
    .line 17
    :catchall_2
    iget-object p0, p0, Lwb;->c:Landroid/view/View;

    .line 18
    .line 19
    if-nez p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    :try_start_3
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 23
    .line 24
    .line 25
    :catchall_3
    :try_start_4
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 26
    .line 27
    .line 28
    :catchall_4
    :try_start_5
    invoke-virtual {p0}, Landroid/view/View;->forceLayout()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 29
    .line 30
    .line 31
    :catchall_5
    :goto_0
    invoke-static {v0}, Lu9;->a(Lx2;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
