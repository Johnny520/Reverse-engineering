.class public final Ly1/y;
.super Lgg/m;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly1/z;


# direct methods
.method public synthetic constructor <init>(Ly1/z;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly1/y;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ly1/y;->h:Ly1/z;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lgg/m;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Ly1/y;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ly1/e2;

    .line 7
    .line 8
    iget-object v0, p1, Ly1/e2;->h:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    iget-object v0, p0, Ly1/y;->h:Ly1/z;

    .line 18
    .line 19
    iget-object v1, v0, Ly1/z;->j:Ly1/t;

    .line 20
    .line 21
    invoke-virtual {v1}, Ly1/t;->getSnapshotObserver()Lx1/t1;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    iget-object v2, v0, Ly1/z;->S:Ly1/y;

    .line 26
    .line 27
    new-instance v3, Lc1/b;

    .line 28
    .line 29
    const/16 v4, 0x9

    .line 30
    .line 31
    invoke-direct {v3, p1, v4, v0}, Lc1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, v1, Lx1/t1;->a:Lw0/s;

    .line 35
    .line 36
    invoke-virtual {v0, p1, v2, v3}, Lw0/s;->c(Ljava/lang/Object;Lfg/l;Lfg/a;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_0
    check-cast p1, Landroid/view/accessibility/AccessibilityEvent;

    .line 43
    .line 44
    iget-object v0, p0, Ly1/y;->h:Ly1/z;

    .line 45
    .line 46
    iget-object v0, v0, Ly1/z;->j:Ly1/t;

    .line 47
    .line 48
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v1, v0, p1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    return-object p1

    .line 61
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
