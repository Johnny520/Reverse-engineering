.class public final synthetic Lof1;
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

.field public final synthetic ν:Z

.field public final synthetic ξ:Landroid/widget/TextView;

.field public final synthetic ο:Landroid/widget/TextView;

.field public final synthetic π:Landroid/view/LayoutInflater;

.field public final synthetic ρ:Lxx;

.field public final synthetic σ:Lum1;


# direct methods
.method public synthetic constructor <init>(Landroid/app/AlertDialog;Landroid/widget/TextView;ZLandroid/app/Activity;Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;ZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Lum1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lof1;->ε:Landroid/app/AlertDialog;

    .line 5
    .line 6
    iput-object p2, p0, Lof1;->ζ:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-boolean p3, p0, Lof1;->η:Z

    .line 9
    .line 10
    iput-object p4, p0, Lof1;->θ:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p5, p0, Lof1;->ι:Lum1;

    .line 13
    .line 14
    iput-object p6, p0, Lof1;->κ:Ljava/util/LinkedHashMap;

    .line 15
    .line 16
    iput-object p7, p0, Lof1;->λ:Lqm1;

    .line 17
    .line 18
    iput-object p8, p0, Lof1;->μ:Landroid/widget/RadioGroup;

    .line 19
    .line 20
    iput-boolean p9, p0, Lof1;->ν:Z

    .line 21
    .line 22
    iput-object p10, p0, Lof1;->ξ:Landroid/widget/TextView;

    .line 23
    .line 24
    iput-object p11, p0, Lof1;->ο:Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object p12, p0, Lof1;->π:Landroid/view/LayoutInflater;

    .line 27
    .line 28
    iput-object p13, p0, Lof1;->ρ:Lxx;

    .line 29
    .line 30
    iput-object p14, p0, Lof1;->σ:Lum1;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    check-cast p1, Lfo1;

    .line 2
    .line 3
    iget-object v0, p0, Lof1;->ε:Landroid/app/AlertDialog;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-object v0, p0, Lof1;->ζ:Landroid/widget/TextView;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEnabled(Z)V

    .line 16
    .line 17
    .line 18
    const/high16 v2, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-virtual {v0, v2}, Landroid/view/View;->setAlpha(F)V

    .line 21
    .line 22
    .line 23
    const-string v2, "\u66f4\u65b0\u5217\u8868"

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p1, Lfo1;->ε:Ljava/lang/Object;

    .line 29
    .line 30
    instance-of v0, p1, Leo1;

    .line 31
    .line 32
    iget-object v11, p0, Lof1;->θ:Landroid/app/Activity;

    .line 33
    .line 34
    iget-object v2, p0, Lof1;->ι:Lum1;

    .line 35
    .line 36
    iget-object v3, p0, Lof1;->κ:Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    iget-object v4, p0, Lof1;->λ:Lqm1;

    .line 39
    .line 40
    iget-object v5, p0, Lof1;->μ:Landroid/widget/RadioGroup;

    .line 41
    .line 42
    iget-boolean v6, p0, Lof1;->ν:Z

    .line 43
    .line 44
    iget-object v7, p0, Lof1;->ξ:Landroid/widget/TextView;

    .line 45
    .line 46
    iget-object v8, p0, Lof1;->ο:Landroid/widget/TextView;

    .line 47
    .line 48
    iget-object v9, p0, Lof1;->π:Landroid/view/LayoutInflater;

    .line 49
    .line 50
    iget-object v10, p0, Lof1;->ρ:Lxx;

    .line 51
    .line 52
    iget-object v12, p0, Lof1;->σ:Lum1;

    .line 53
    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    move-object v13, p1

    .line 57
    check-cast v13, Lef1;

    .line 58
    .line 59
    invoke-static/range {v2 .. v13}, Lpf1;->θ(Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;ZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Landroid/app/Activity;Lum1;Lef1;)V

    .line 60
    .line 61
    .line 62
    iget-boolean p0, p0, Lof1;->η:Z

    .line 63
    .line 64
    if-eqz p0, :cond_1

    .line 65
    .line 66
    iget-object p0, v13, Lef1;->α:Ljava/util/List;

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    new-instance v0, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v13, "\u98df\u7269\u5217\u8868\u5df2\u66f4\u65b0\uff0c\u5171 "

    .line 75
    .line 76
    invoke-direct {v0, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string p0, " \u79cd"

    .line 83
    .line 84
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const/4 v0, 0x0

    .line 92
    invoke-static {v11, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 97
    .line 98
    .line 99
    :cond_1
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-eqz p0, :cond_3

    .line 104
    .line 105
    iget-object p1, v2, Lum1;->ε:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v13, p1

    .line 108
    check-cast v13, Lef1;

    .line 109
    .line 110
    invoke-static/range {v2 .. v13}, Lpf1;->θ(Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;ZLandroid/widget/TextView;Landroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Landroid/app/Activity;Lum1;Lef1;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-nez p0, :cond_2

    .line 118
    .line 119
    const-string p0, ""

    .line 120
    .line 121
    :cond_2
    const-string p1, "\u98df\u7269\u5217\u8868\u66f4\u65b0\u5931\u8d25: "

    .line 122
    .line 123
    invoke-static {v1, v11, p1, p0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_3
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 127
    .line 128
    return-object p0
.end method
