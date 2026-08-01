.class public final Lde;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:[Lw6;

.field public final synthetic b:Lw6;

.field public final synthetic c:Ln9;

.field public final synthetic d:Landroid/app/Activity;

.field public final synthetic e:[I

.field public final synthetic f:Ljava/lang/ClassLoader;

.field public final synthetic g:Lpd;

.field public final synthetic h:Landroid/app/Dialog;

.field public final synthetic i:Landroid/widget/TextView;

.field public final synthetic j:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>([Lw6;Lw6;Ln9;Landroid/app/Activity;[ILjava/lang/ClassLoader;Lpd;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lde;->a:[Lw6;

    .line 5
    .line 6
    iput-object p2, p0, Lde;->b:Lw6;

    .line 7
    .line 8
    iput-object p3, p0, Lde;->c:Ln9;

    .line 9
    .line 10
    iput-object p4, p0, Lde;->d:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p5, p0, Lde;->e:[I

    .line 13
    .line 14
    iput-object p6, p0, Lde;->f:Ljava/lang/ClassLoader;

    .line 15
    .line 16
    iput-object p7, p0, Lde;->g:Lpd;

    .line 17
    .line 18
    iput-object p8, p0, Lde;->h:Landroid/app/Dialog;

    .line 19
    .line 20
    iput-object p9, p0, Lde;->i:Landroid/widget/TextView;

    .line 21
    .line 22
    iput-object p10, p0, Lde;->j:Landroid/widget/LinearLayout;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 10

    .line 1
    iget-object p1, p0, Lde;->c:Ln9;

    .line 2
    .line 3
    iget-boolean v0, p1, Ln9;->h:Z

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    iget-object v0, p0, Lde;->b:Lw6;

    .line 10
    .line 11
    invoke-virtual {v0}, Lw6;->e()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_2

    .line 16
    .line 17
    iget-object v2, p1, Ln9;->b:Landroid/net/Uri;

    .line 18
    .line 19
    if-nez v2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    new-instance v7, Ljava/util/ArrayList;

    .line 23
    .line 24
    iget-object v1, v0, Lw6;->d:Ljava/io/Serializable;

    .line 25
    .line 26
    check-cast v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, v0, Lw6;->c:Ljava/lang/Comparable;

    .line 32
    .line 33
    check-cast v1, Landroid/net/Uri;

    .line 34
    .line 35
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    new-instance v8, Ljava/util/ArrayList;

    .line 39
    .line 40
    iget-object v1, v0, Lw6;->e:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v8, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, p1, Ln9;->c:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    new-instance v3, Lw6;

    .line 53
    .line 54
    iget-object v0, v0, Lw6;->b:Ljava/lang/Object;

    .line 55
    .line 56
    move-object v5, v0

    .line 57
    check-cast v5, Landroid/net/Uri;

    .line 58
    .line 59
    iget-object v6, p1, Ln9;->b:Landroid/net/Uri;

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    invoke-direct/range {v3 .. v8}, Lw6;-><init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 63
    .line 64
    .line 65
    move-object v1, v3

    .line 66
    goto :goto_0

    .line 67
    :cond_2
    iget-object v5, p1, Ln9;->a:Ljava/io/File;

    .line 68
    .line 69
    if-nez v5, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    new-instance v4, Lw6;

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    const/4 v9, 0x0

    .line 76
    const/4 v6, 0x0

    .line 77
    const/4 v7, 0x0

    .line 78
    invoke-direct/range {v4 .. v9}, Lw6;-><init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 79
    .line 80
    .line 81
    move-object v1, v4

    .line 82
    :goto_0
    iget-object v9, p0, Lde;->a:[Lw6;

    .line 83
    .line 84
    const/4 p1, 0x0

    .line 85
    aput-object v1, v9, p1

    .line 86
    .line 87
    if-nez v1, :cond_4

    .line 88
    .line 89
    return-void

    .line 90
    :cond_4
    iget-object v0, p0, Lde;->d:Landroid/app/Activity;

    .line 91
    .line 92
    invoke-static {v0, v1}, Lcom/mr/elaris/w;->d(Landroid/content/Context;Lw6;)V

    .line 93
    .line 94
    .line 95
    iget-object v8, p0, Lde;->e:[I

    .line 96
    .line 97
    aput p1, v8, p1

    .line 98
    .line 99
    iget-object v6, p0, Lde;->i:Landroid/widget/TextView;

    .line 100
    .line 101
    iget-object v5, p0, Lde;->j:Landroid/widget/LinearLayout;

    .line 102
    .line 103
    iget-object v2, p0, Lde;->g:Lpd;

    .line 104
    .line 105
    iget-object v3, p0, Lde;->d:Landroid/app/Activity;

    .line 106
    .line 107
    iget-object v4, p0, Lde;->h:Landroid/app/Dialog;

    .line 108
    .line 109
    iget-object v7, p0, Lde;->f:Ljava/lang/ClassLoader;

    .line 110
    .line 111
    invoke-static/range {v2 .. v9}, Lcom/mr/elaris/w;->E0(Lpd;Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/ClassLoader;[I[Lw6;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method
