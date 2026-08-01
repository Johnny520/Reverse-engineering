.class public final synthetic Lld1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:Landroid/app/AlertDialog;

.field public final synthetic ζ:Landroid/widget/TextView;

.field public final synthetic η:Z

.field public final synthetic θ:Landroid/app/Activity;

.field public final synthetic ι:Lum1;

.field public final synthetic κ:Ljava/util/LinkedHashMap;

.field public final synthetic λ:Lqm1;

.field public final synthetic μ:Landroid/widget/RadioGroup;

.field public final synthetic ν:Lum1;

.field public final synthetic ξ:I

.field public final synthetic ο:Ljava/lang/Integer;

.field public final synthetic π:Ljava/lang/Long;

.field public final synthetic ρ:Z

.field public final synthetic σ:Z

.field public final synthetic τ:Landroid/widget/TextView;

.field public final synthetic υ:Landroid/widget/TextView;

.field public final synthetic φ:Landroid/view/LayoutInflater;

.field public final synthetic χ:Lxx;


# direct methods
.method public synthetic constructor <init>(ILxx;Lqm1;Lum1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/Integer;Ljava/lang/Long;Ljava/util/LinkedHashMap;ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p7, p0, Lld1;->ε:Landroid/app/AlertDialog;

    .line 5
    .line 6
    iput-object p10, p0, Lld1;->ζ:Landroid/widget/TextView;

    .line 7
    .line 8
    move/from16 p7, p16

    .line 9
    .line 10
    iput-boolean p7, p0, Lld1;->η:Z

    .line 11
    .line 12
    iput-object p6, p0, Lld1;->θ:Landroid/app/Activity;

    .line 13
    .line 14
    iput-object p4, p0, Lld1;->ι:Lum1;

    .line 15
    .line 16
    iput-object p15, p0, Lld1;->κ:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    iput-object p3, p0, Lld1;->λ:Lqm1;

    .line 19
    .line 20
    iput-object p9, p0, Lld1;->μ:Landroid/widget/RadioGroup;

    .line 21
    .line 22
    iput-object p5, p0, Lld1;->ν:Lum1;

    .line 23
    .line 24
    iput p1, p0, Lld1;->ξ:I

    .line 25
    .line 26
    iput-object p13, p0, Lld1;->ο:Ljava/lang/Integer;

    .line 27
    .line 28
    iput-object p14, p0, Lld1;->π:Ljava/lang/Long;

    .line 29
    .line 30
    move/from16 p1, p17

    .line 31
    .line 32
    iput-boolean p1, p0, Lld1;->ρ:Z

    .line 33
    .line 34
    move/from16 p1, p18

    .line 35
    .line 36
    iput-boolean p1, p0, Lld1;->σ:Z

    .line 37
    .line 38
    iput-object p11, p0, Lld1;->τ:Landroid/widget/TextView;

    .line 39
    .line 40
    iput-object p12, p0, Lld1;->υ:Landroid/widget/TextView;

    .line 41
    .line 42
    iput-object p8, p0, Lld1;->φ:Landroid/view/LayoutInflater;

    .line 43
    .line 44
    iput-object p2, p0, Lld1;->χ:Lxx;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    check-cast v1, Lfo1;

    .line 6
    .line 7
    iget-object v2, v0, Lld1;->ε:Landroid/app/AlertDialog;

    .line 8
    .line 9
    invoke-virtual {v2}, Landroid/app/Dialog;->isShowing()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_0
    iget-object v2, v0, Lld1;->ζ:Landroid/widget/TextView;

    .line 18
    .line 19
    const/4 v3, 0x1

    .line 20
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 21
    .line 22
    .line 23
    const/high16 v4, 0x3f800000    # 1.0f

    .line 24
    .line 25
    invoke-virtual {v2, v4}, Landroid/view/View;->setAlpha(F)V

    .line 26
    .line 27
    .line 28
    const-string v4, "\u66f4\u65b0\u5217\u8868"

    .line 29
    .line 30
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 31
    .line 32
    .line 33
    iget-object v1, v1, Lfo1;->ε:Ljava/lang/Object;

    .line 34
    .line 35
    instance-of v2, v1, Leo1;

    .line 36
    .line 37
    iget-object v4, v0, Lld1;->θ:Landroid/app/Activity;

    .line 38
    .line 39
    move-object/from16 v18, v4

    .line 40
    .line 41
    iget-object v4, v0, Lld1;->ι:Lum1;

    .line 42
    .line 43
    iget-object v5, v0, Lld1;->κ:Ljava/util/LinkedHashMap;

    .line 44
    .line 45
    iget-object v6, v0, Lld1;->λ:Lqm1;

    .line 46
    .line 47
    iget-object v7, v0, Lld1;->μ:Landroid/widget/RadioGroup;

    .line 48
    .line 49
    iget-object v8, v0, Lld1;->ν:Lum1;

    .line 50
    .line 51
    iget v9, v0, Lld1;->ξ:I

    .line 52
    .line 53
    iget-object v10, v0, Lld1;->ο:Ljava/lang/Integer;

    .line 54
    .line 55
    iget-object v11, v0, Lld1;->π:Ljava/lang/Long;

    .line 56
    .line 57
    iget-boolean v12, v0, Lld1;->ρ:Z

    .line 58
    .line 59
    iget-boolean v13, v0, Lld1;->σ:Z

    .line 60
    .line 61
    iget-object v14, v0, Lld1;->τ:Landroid/widget/TextView;

    .line 62
    .line 63
    iget-object v15, v0, Lld1;->υ:Landroid/widget/TextView;

    .line 64
    .line 65
    iget-object v3, v0, Lld1;->φ:Landroid/view/LayoutInflater;

    .line 66
    .line 67
    move-object/from16 v20, v1

    .line 68
    .line 69
    iget-object v1, v0, Lld1;->χ:Lxx;

    .line 70
    .line 71
    if-nez v2, :cond_1

    .line 72
    .line 73
    move-object/from16 v19, v20

    .line 74
    .line 75
    check-cast v19, Ljava/util/List;

    .line 76
    .line 77
    move-object/from16 v17, v1

    .line 78
    .line 79
    move-object/from16 v16, v3

    .line 80
    .line 81
    invoke-static/range {v4 .. v19}, Lxd1;->ο(Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;Lum1;ILjava/lang/Integer;Ljava/lang/Long;ZZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Landroid/app/Activity;Ljava/util/List;)V

    .line 82
    .line 83
    .line 84
    move-object/from16 v1, v18

    .line 85
    .line 86
    iget-boolean v0, v0, Lld1;->η:Z

    .line 87
    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    invoke-interface/range {v19 .. v19}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    new-instance v2, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v3, "\u79cd\u5b50\u5217\u8868\u5df2\u66f4\u65b0\uff0c\u5171 "

    .line 97
    .line 98
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v0, " \u79cd"

    .line 105
    .line 106
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const/4 v2, 0x0

    .line 114
    invoke-static {v1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_1
    move-object/from16 v17, v1

    .line 123
    .line 124
    move-object/from16 v16, v3

    .line 125
    .line 126
    move-object/from16 v1, v18

    .line 127
    .line 128
    :cond_2
    :goto_0
    invoke-static/range {v20 .. v20}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-eqz v0, :cond_4

    .line 133
    .line 134
    iget-object v2, v4, Lum1;->ε:Ljava/lang/Object;

    .line 135
    .line 136
    move-object/from16 v19, v2

    .line 137
    .line 138
    check-cast v19, Ljava/util/List;

    .line 139
    .line 140
    move-object/from16 v18, v1

    .line 141
    .line 142
    invoke-static/range {v4 .. v19}, Lxd1;->ο(Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;Lum1;ILjava/lang/Integer;Ljava/lang/Long;ZZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Landroid/app/Activity;Ljava/util/List;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-nez v0, :cond_3

    .line 150
    .line 151
    const-string v0, ""

    .line 152
    .line 153
    :cond_3
    const-string v2, "\u79cd\u5b50\u5217\u8868\u66f4\u65b0\u5931\u8d25: "

    .line 154
    .line 155
    const/4 v3, 0x1

    .line 156
    invoke-static {v3, v1, v2, v0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_4
    :goto_1
    sget-object v0, Ls62;->α:Ls62;

    .line 160
    .line 161
    return-object v0
.end method
