.class public final synthetic Lod1;
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

.field public final synthetic κ:Landroid/widget/RadioGroup;

.field public final synthetic λ:Landroid/widget/TextView;

.field public final synthetic μ:Landroid/widget/TextView;

.field public final synthetic ν:I

.field public final synthetic ξ:Ljava/util/Set;

.field public final synthetic ο:Lec1;

.field public final synthetic π:Lxx;


# direct methods
.method public synthetic constructor <init>(ILxx;Lec1;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/Set;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p6, p0, Lod1;->ε:Landroid/app/AlertDialog;

    .line 5
    .line 6
    iput-object p8, p0, Lod1;->ζ:Landroid/widget/TextView;

    .line 7
    .line 8
    iput-boolean p12, p0, Lod1;->η:Z

    .line 9
    .line 10
    iput-object p5, p0, Lod1;->θ:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p4, p0, Lod1;->ι:Lum1;

    .line 13
    .line 14
    iput-object p7, p0, Lod1;->κ:Landroid/widget/RadioGroup;

    .line 15
    .line 16
    iput-object p9, p0, Lod1;->λ:Landroid/widget/TextView;

    .line 17
    .line 18
    iput-object p10, p0, Lod1;->μ:Landroid/widget/TextView;

    .line 19
    .line 20
    iput p1, p0, Lod1;->ν:I

    .line 21
    .line 22
    iput-object p11, p0, Lod1;->ξ:Ljava/util/Set;

    .line 23
    .line 24
    iput-object p3, p0, Lod1;->ο:Lec1;

    .line 25
    .line 26
    iput-object p2, p0, Lod1;->π:Lxx;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    check-cast p1, Lfo1;

    .line 2
    .line 3
    iget-object v0, p0, Lod1;->ε:Landroid/app/AlertDialog;

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
    iget-object v0, p0, Lod1;->ζ:Landroid/widget/TextView;

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
    iget-object v9, p0, Lod1;->θ:Landroid/app/Activity;

    .line 33
    .line 34
    iget-object v2, p0, Lod1;->ι:Lum1;

    .line 35
    .line 36
    iget-object v3, p0, Lod1;->κ:Landroid/widget/RadioGroup;

    .line 37
    .line 38
    iget-object v4, p0, Lod1;->λ:Landroid/widget/TextView;

    .line 39
    .line 40
    iget-object v5, p0, Lod1;->μ:Landroid/widget/TextView;

    .line 41
    .line 42
    iget v6, p0, Lod1;->ν:I

    .line 43
    .line 44
    iget-object v7, p0, Lod1;->ξ:Ljava/util/Set;

    .line 45
    .line 46
    iget-object v8, p0, Lod1;->ο:Lec1;

    .line 47
    .line 48
    iget-object v10, p0, Lod1;->π:Lxx;

    .line 49
    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    move-object v11, p1

    .line 53
    check-cast v11, Ljava/util/List;

    .line 54
    .line 55
    invoke-static/range {v2 .. v11}, Lxd1;->μ(Lum1;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;ILjava/util/Set;Lec1;Landroid/app/Activity;Lxx;Ljava/util/List;)V

    .line 56
    .line 57
    .line 58
    iget-boolean p0, p0, Lod1;->η:Z

    .line 59
    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    new-instance v0, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    const-string v11, "\u79cd\u5b50\u5217\u8868\u5df2\u66f4\u65b0\uff0c\u5171 "

    .line 69
    .line 70
    invoke-direct {v0, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string p0, " \u79cd"

    .line 77
    .line 78
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-static {v9, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 91
    .line 92
    .line 93
    :cond_1
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-eqz p0, :cond_3

    .line 98
    .line 99
    iget-object p1, v2, Lum1;->ε:Ljava/lang/Object;

    .line 100
    .line 101
    move-object v11, p1

    .line 102
    check-cast v11, Ljava/util/List;

    .line 103
    .line 104
    invoke-static/range {v2 .. v11}, Lxd1;->μ(Lum1;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;ILjava/util/Set;Lec1;Landroid/app/Activity;Lxx;Ljava/util/List;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-nez p0, :cond_2

    .line 112
    .line 113
    const-string p0, ""

    .line 114
    .line 115
    :cond_2
    const-string p1, "\u79cd\u5b50\u5217\u8868\u66f4\u65b0\u5931\u8d25: "

    .line 116
    .line 117
    invoke-static {v1, v9, p1, p0}, La12;->θ(ILandroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_3
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 121
    .line 122
    return-object p0
.end method
