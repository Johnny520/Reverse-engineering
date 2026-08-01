.class public final Lge;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:[Lw6;

.field public final synthetic c:Landroid/app/Activity;

.field public final synthetic d:[I

.field public final synthetic e:Ljava/lang/ClassLoader;

.field public final synthetic f:Lpd;

.field public final synthetic g:Landroid/app/Dialog;

.field public final synthetic h:Landroid/widget/TextView;

.field public final synthetic i:Landroid/widget/LinearLayout;


# direct methods
.method public constructor <init>(Lpd;Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/ClassLoader;[I[Lw6;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lge;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p8, p0, Lge;->b:[Lw6;

    .line 8
    .line 9
    iput-object p2, p0, Lge;->c:Landroid/app/Activity;

    .line 10
    .line 11
    iput-object p7, p0, Lge;->d:[I

    .line 12
    .line 13
    iput-object p6, p0, Lge;->e:Ljava/lang/ClassLoader;

    .line 14
    .line 15
    iput-object p1, p0, Lge;->f:Lpd;

    .line 16
    .line 17
    iput-object p3, p0, Lge;->g:Landroid/app/Dialog;

    .line 18
    .line 19
    iput-object p5, p0, Lge;->h:Landroid/widget/TextView;

    .line 20
    .line 21
    iput-object p4, p0, Lge;->i:Landroid/widget/LinearLayout;

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>([ILandroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/LinearLayout;[Lw6;I)V
    .locals 0

    .line 24
    iput p9, p0, Lge;->a:I

    iput-object p1, p0, Lge;->d:[I

    iput-object p2, p0, Lge;->c:Landroid/app/Activity;

    iput-object p3, p0, Lge;->e:Ljava/lang/ClassLoader;

    iput-object p4, p0, Lge;->f:Lpd;

    iput-object p5, p0, Lge;->g:Landroid/app/Dialog;

    iput-object p6, p0, Lge;->h:Landroid/widget/TextView;

    iput-object p7, p0, Lge;->i:Landroid/widget/LinearLayout;

    iput-object p8, p0, Lge;->b:[Lw6;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lge;->a:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v9, v0, Lge;->d:[I

    .line 10
    .line 11
    aget v1, v9, v2

    .line 12
    .line 13
    add-int/lit8 v1, v1, -0x1

    .line 14
    .line 15
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    aput v1, v9, v2

    .line 20
    .line 21
    iget-object v6, v0, Lge;->i:Landroid/widget/LinearLayout;

    .line 22
    .line 23
    iget-object v10, v0, Lge;->b:[Lw6;

    .line 24
    .line 25
    iget-object v3, v0, Lge;->f:Lpd;

    .line 26
    .line 27
    iget-object v4, v0, Lge;->c:Landroid/app/Activity;

    .line 28
    .line 29
    iget-object v5, v0, Lge;->g:Landroid/app/Dialog;

    .line 30
    .line 31
    iget-object v7, v0, Lge;->h:Landroid/widget/TextView;

    .line 32
    .line 33
    iget-object v8, v0, Lge;->e:Ljava/lang/ClassLoader;

    .line 34
    .line 35
    invoke-static/range {v3 .. v10}, Lcom/mr/elaris/w;->E0(Lpd;Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/ClassLoader;[I[Lw6;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :pswitch_0
    iget-object v1, v0, Lge;->b:[Lw6;

    .line 40
    .line 41
    aget-object v3, v1, v2

    .line 42
    .line 43
    if-nez v3, :cond_0

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-virtual {v3}, Lw6;->f()Lw6;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    :goto_0
    if-eqz v3, :cond_1

    .line 52
    .line 53
    invoke-virtual {v3}, Lw6;->d()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    aput-object v3, v1, v2

    .line 60
    .line 61
    iget-object v4, v0, Lge;->c:Landroid/app/Activity;

    .line 62
    .line 63
    invoke-static {v4, v3}, Lcom/mr/elaris/w;->d(Landroid/content/Context;Lw6;)V

    .line 64
    .line 65
    .line 66
    iget-object v3, v0, Lge;->d:[I

    .line 67
    .line 68
    aput v2, v3, v2

    .line 69
    .line 70
    iget-object v15, v0, Lge;->h:Landroid/widget/TextView;

    .line 71
    .line 72
    iget-object v14, v0, Lge;->i:Landroid/widget/LinearLayout;

    .line 73
    .line 74
    iget-object v11, v0, Lge;->f:Lpd;

    .line 75
    .line 76
    iget-object v12, v0, Lge;->c:Landroid/app/Activity;

    .line 77
    .line 78
    iget-object v13, v0, Lge;->g:Landroid/app/Dialog;

    .line 79
    .line 80
    iget-object v0, v0, Lge;->e:Ljava/lang/ClassLoader;

    .line 81
    .line 82
    move-object/from16 v16, v0

    .line 83
    .line 84
    move-object/from16 v18, v1

    .line 85
    .line 86
    move-object/from16 v17, v3

    .line 87
    .line 88
    invoke-static/range {v11 .. v18}, Lcom/mr/elaris/w;->E0(Lpd;Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/ClassLoader;[I[Lw6;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    return-void

    .line 92
    :pswitch_1
    iget-object v1, v0, Lge;->d:[I

    .line 93
    .line 94
    aget v3, v1, v2

    .line 95
    .line 96
    add-int/lit8 v3, v3, 0x1

    .line 97
    .line 98
    aput v3, v1, v2

    .line 99
    .line 100
    iget-object v2, v0, Lge;->i:Landroid/widget/LinearLayout;

    .line 101
    .line 102
    iget-object v3, v0, Lge;->b:[Lw6;

    .line 103
    .line 104
    iget-object v4, v0, Lge;->f:Lpd;

    .line 105
    .line 106
    iget-object v5, v0, Lge;->c:Landroid/app/Activity;

    .line 107
    .line 108
    iget-object v6, v0, Lge;->g:Landroid/app/Dialog;

    .line 109
    .line 110
    iget-object v7, v0, Lge;->h:Landroid/widget/TextView;

    .line 111
    .line 112
    iget-object v0, v0, Lge;->e:Ljava/lang/ClassLoader;

    .line 113
    .line 114
    move-object/from16 v21, v0

    .line 115
    .line 116
    move-object/from16 v22, v1

    .line 117
    .line 118
    move-object/from16 v19, v2

    .line 119
    .line 120
    move-object/from16 v23, v3

    .line 121
    .line 122
    move-object/from16 v16, v4

    .line 123
    .line 124
    move-object/from16 v17, v5

    .line 125
    .line 126
    move-object/from16 v18, v6

    .line 127
    .line 128
    move-object/from16 v20, v7

    .line 129
    .line 130
    invoke-static/range {v16 .. v23}, Lcom/mr/elaris/w;->E0(Lpd;Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/ClassLoader;[I[Lw6;)V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
