.class public final synthetic Lda0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lcom/example/dyhelper/ui/GestureAreaView;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Landroid/widget/LinearLayout;

.field public final synthetic ι:Landroid/widget/TextView;

.field public final synthetic κ:Landroid/widget/TextView;

.field public final synthetic λ:Landroid/widget/TextView;

.field public final synthetic μ:Landroid/widget/TextView;

.field public final synthetic ν:Landroid/widget/TextView;

.field public final synthetic ξ:Landroid/widget/TextView;

.field public final synthetic ο:Landroid/widget/Switch;

.field public final synthetic π:Landroid/widget/TextView;

.field public final synthetic ρ:Lxx;

.field public final synthetic σ:Landroid/widget/TextView;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/GestureAreaView;Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    iput p14, p0, Lda0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lda0;->ζ:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 4
    .line 5
    iput-object p2, p0, Lda0;->η:Landroid/app/Activity;

    .line 6
    .line 7
    iput-object p3, p0, Lda0;->θ:Landroid/widget/LinearLayout;

    .line 8
    .line 9
    iput-object p4, p0, Lda0;->ι:Landroid/widget/TextView;

    .line 10
    .line 11
    iput-object p5, p0, Lda0;->κ:Landroid/widget/TextView;

    .line 12
    .line 13
    iput-object p6, p0, Lda0;->λ:Landroid/widget/TextView;

    .line 14
    .line 15
    iput-object p7, p0, Lda0;->μ:Landroid/widget/TextView;

    .line 16
    .line 17
    iput-object p8, p0, Lda0;->ν:Landroid/widget/TextView;

    .line 18
    .line 19
    iput-object p9, p0, Lda0;->ξ:Landroid/widget/TextView;

    .line 20
    .line 21
    iput-object p10, p0, Lda0;->ο:Landroid/widget/Switch;

    .line 22
    .line 23
    iput-object p11, p0, Lda0;->π:Landroid/widget/TextView;

    .line 24
    .line 25
    iput-object p12, p0, Lda0;->ρ:Lxx;

    .line 26
    .line 27
    iput-object p13, p0, Lda0;->σ:Landroid/widget/TextView;

    .line 28
    .line 29
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lda0;->ε:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v4, v0, Lda0;->ζ:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 9
    .line 10
    invoke-virtual {v4}, Lcom/example/dyhelper/ui/GestureAreaView;->getSelectedArea()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v5

    .line 14
    iget-object v6, v0, Lda0;->η:Landroid/app/Activity;

    .line 15
    .line 16
    if-nez v5, :cond_0

    .line 17
    .line 18
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u4e00\u4e2a\u533a\u57df"

    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-static {v6, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const-string v1, "long_press"

    .line 30
    .line 31
    invoke-virtual {v4, v5, v1}, Lcom/example/dyhelper/ui/GestureAreaView;->δ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    new-instance v2, Lba0;

    .line 36
    .line 37
    const/16 v18, 0x0

    .line 38
    .line 39
    iget-object v7, v0, Lda0;->θ:Landroid/widget/LinearLayout;

    .line 40
    .line 41
    iget-object v8, v0, Lda0;->ι:Landroid/widget/TextView;

    .line 42
    .line 43
    iget-object v9, v0, Lda0;->κ:Landroid/widget/TextView;

    .line 44
    .line 45
    iget-object v10, v0, Lda0;->λ:Landroid/widget/TextView;

    .line 46
    .line 47
    iget-object v11, v0, Lda0;->μ:Landroid/widget/TextView;

    .line 48
    .line 49
    iget-object v12, v0, Lda0;->ν:Landroid/widget/TextView;

    .line 50
    .line 51
    iget-object v13, v0, Lda0;->ξ:Landroid/widget/TextView;

    .line 52
    .line 53
    iget-object v14, v0, Lda0;->ο:Landroid/widget/Switch;

    .line 54
    .line 55
    iget-object v15, v0, Lda0;->π:Landroid/widget/TextView;

    .line 56
    .line 57
    iget-object v1, v0, Lda0;->ρ:Lxx;

    .line 58
    .line 59
    iget-object v0, v0, Lda0;->σ:Landroid/widget/TextView;

    .line 60
    .line 61
    move-object/from16 v17, v0

    .line 62
    .line 63
    move-object/from16 v16, v1

    .line 64
    .line 65
    invoke-direct/range {v2 .. v18}, Lba0;-><init>(Ljava/lang/String;Lcom/example/dyhelper/ui/GestureAreaView;Ljava/lang/String;Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;I)V

    .line 66
    .line 67
    .line 68
    const-string v0, "\u957f\u6309\u52a8\u4f5c"

    .line 69
    .line 70
    invoke-static {v6, v0, v3, v2}, Lia0;->κ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;La80;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    return-void

    .line 74
    :pswitch_0
    iget-object v9, v0, Lda0;->ζ:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 75
    .line 76
    invoke-virtual {v9}, Lcom/example/dyhelper/ui/GestureAreaView;->getSelectedArea()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v10

    .line 80
    iget-object v11, v0, Lda0;->η:Landroid/app/Activity;

    .line 81
    .line 82
    if-nez v10, :cond_1

    .line 83
    .line 84
    const-string v0, "\u8bf7\u5148\u9009\u62e9\u4e00\u4e2a\u533a\u57df"

    .line 85
    .line 86
    const/4 v1, 0x0

    .line 87
    invoke-static {v11, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    const-string v1, "double_tap"

    .line 96
    .line 97
    invoke-virtual {v9, v10, v1}, Lcom/example/dyhelper/ui/GestureAreaView;->δ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    new-instance v7, Lba0;

    .line 102
    .line 103
    const/16 v23, 0x1

    .line 104
    .line 105
    iget-object v12, v0, Lda0;->θ:Landroid/widget/LinearLayout;

    .line 106
    .line 107
    iget-object v13, v0, Lda0;->ι:Landroid/widget/TextView;

    .line 108
    .line 109
    iget-object v14, v0, Lda0;->κ:Landroid/widget/TextView;

    .line 110
    .line 111
    iget-object v15, v0, Lda0;->λ:Landroid/widget/TextView;

    .line 112
    .line 113
    iget-object v1, v0, Lda0;->μ:Landroid/widget/TextView;

    .line 114
    .line 115
    iget-object v2, v0, Lda0;->ν:Landroid/widget/TextView;

    .line 116
    .line 117
    iget-object v3, v0, Lda0;->ξ:Landroid/widget/TextView;

    .line 118
    .line 119
    iget-object v4, v0, Lda0;->ο:Landroid/widget/Switch;

    .line 120
    .line 121
    iget-object v5, v0, Lda0;->π:Landroid/widget/TextView;

    .line 122
    .line 123
    iget-object v6, v0, Lda0;->ρ:Lxx;

    .line 124
    .line 125
    iget-object v0, v0, Lda0;->σ:Landroid/widget/TextView;

    .line 126
    .line 127
    move-object/from16 v22, v0

    .line 128
    .line 129
    move-object/from16 v16, v1

    .line 130
    .line 131
    move-object/from16 v17, v2

    .line 132
    .line 133
    move-object/from16 v18, v3

    .line 134
    .line 135
    move-object/from16 v19, v4

    .line 136
    .line 137
    move-object/from16 v20, v5

    .line 138
    .line 139
    move-object/from16 v21, v6

    .line 140
    .line 141
    invoke-direct/range {v7 .. v23}, Lba0;-><init>(Ljava/lang/String;Lcom/example/dyhelper/ui/GestureAreaView;Ljava/lang/String;Landroid/app/Activity;Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/Switch;Landroid/widget/TextView;Lxx;Landroid/widget/TextView;I)V

    .line 142
    .line 143
    .line 144
    const-string v0, "\u53cc\u51fb\u52a8\u4f5c"

    .line 145
    .line 146
    invoke-static {v11, v0, v8, v7}, Lia0;->κ(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;La80;)V

    .line 147
    .line 148
    .line 149
    :goto_1
    return-void

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
