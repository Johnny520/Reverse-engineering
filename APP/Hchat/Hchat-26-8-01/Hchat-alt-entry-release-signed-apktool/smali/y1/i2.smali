.class public final Ly1/i2;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ly1/a;


# direct methods
.method public synthetic constructor <init>(Ly1/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Ly1/i2;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Ly1/i2;->h:Ly1/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final a(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final b(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Ly1/i2;->g:I

    .line 2
    .line 3
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 5

    .line 1
    iget p1, p0, Ly1/i2;->g:I

    .line 2
    .line 3
    iget-object v0, p0, Ly1/i2;->h:Ly1/a;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    sget-object v1, Lg3/r;->n:Lg3/r;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    sget-object p1, Lng/g;->a:Lng/g;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v3, Lng/c;

    .line 21
    .line 22
    new-instance v4, Lf9/b;

    .line 23
    .line 24
    invoke-direct {v4, p1, v2}, Lf9/b;-><init>(Ljava/lang/Object;I)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v4, v1}, Lng/c;-><init>(Lfg/a;Lfg/l;)V

    .line 28
    .line 29
    .line 30
    move-object p1, v3

    .line 31
    :goto_0
    invoke-interface {p1}, Lng/j;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v1, :cond_4

    .line 41
    .line 42
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Landroid/view/ViewParent;

    .line 47
    .line 48
    instance-of v4, v1, Landroid/view/View;

    .line 49
    .line 50
    if-eqz v4, :cond_1

    .line 51
    .line 52
    check-cast v1, Landroid/view/View;

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    const v4, 0x7f06004b

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    instance-of v4, v1, Ljava/lang/Boolean;

    .line 65
    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    check-cast v1, Ljava/lang/Boolean;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const/4 v1, 0x0

    .line 72
    :goto_1
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v3

    .line 78
    :cond_3
    if-eqz v3, :cond_1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move v2, v3

    .line 82
    :goto_2
    if-nez v2, :cond_5

    .line 83
    .line 84
    invoke-virtual {v0}, Ly1/a;->f()V

    .line 85
    .line 86
    .line 87
    :cond_5
    return-void

    .line 88
    :pswitch_0
    invoke-virtual {v0}, Ly1/a;->f()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
