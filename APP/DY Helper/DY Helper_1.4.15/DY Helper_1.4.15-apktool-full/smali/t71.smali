.class public final synthetic Lt71;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:Landroid/app/Activity;

.field public final synthetic ζ:Ljava/util/List;

.field public final synthetic η:I

.field public final synthetic θ:Ljava/util/List;

.field public final synthetic ι:I

.field public final synthetic κ:Lz71;

.field public final synthetic λ:I

.field public final synthetic μ:Lz71;

.field public final synthetic ν:I

.field public final synthetic ξ:Lz71;

.field public final synthetic ο:Lcc;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/util/List;ILjava/util/List;ILz71;ILz71;ILz71;Lcc;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt71;->ε:Landroid/app/Activity;

    .line 5
    .line 6
    iput-object p2, p0, Lt71;->ζ:Ljava/util/List;

    .line 7
    .line 8
    iput p3, p0, Lt71;->η:I

    .line 9
    .line 10
    iput-object p4, p0, Lt71;->θ:Ljava/util/List;

    .line 11
    .line 12
    iput p5, p0, Lt71;->ι:I

    .line 13
    .line 14
    iput-object p6, p0, Lt71;->κ:Lz71;

    .line 15
    .line 16
    iput p7, p0, Lt71;->λ:I

    .line 17
    .line 18
    iput-object p8, p0, Lt71;->μ:Lz71;

    .line 19
    .line 20
    iput p9, p0, Lt71;->ν:I

    .line 21
    .line 22
    iput-object p10, p0, Lt71;->ξ:Lz71;

    .line 23
    .line 24
    iput-object p11, p0, Lt71;->ο:Lcc;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 5

    .line 1
    iget-object p1, p0, Lt71;->ε:Landroid/app/Activity;

    .line 2
    .line 3
    if-ltz p2, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x4

    .line 6
    if-ge p2, v0, :cond_1

    .line 7
    .line 8
    add-int/lit8 v0, p2, 0x1

    .line 9
    .line 10
    iget v1, p0, Lt71;->η:I

    .line 11
    .line 12
    add-int v2, v1, p2

    .line 13
    .line 14
    iget-object v3, p0, Lt71;->ζ:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {v2, v3}, Lxh;->Л(ILjava/util/List;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/String;

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    .line 24
    const-string v2, ""

    .line 25
    .line 26
    :cond_0
    new-instance v3, Lu71;

    .line 27
    .line 28
    iget-object v4, p0, Lt71;->ο:Lcc;

    .line 29
    .line 30
    invoke-direct {v3, v4, v1, p2}, Lu71;-><init>(Lcc;II)V

    .line 31
    .line 32
    .line 33
    iget-object p0, p0, Lt71;->θ:Ljava/util/List;

    .line 34
    .line 35
    invoke-static {p1, v0, v2, p0, v3}, Lv71;->ρ(Landroid/app/Activity;ILjava/lang/String;Ljava/util/List;La80;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    iget v0, p0, Lt71;->ι:I

    .line 40
    .line 41
    if-ne p2, v0, :cond_2

    .line 42
    .line 43
    iget-object p0, p0, Lt71;->κ:Lz71;

    .line 44
    .line 45
    invoke-virtual {p0}, Lz71;->invoke()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_2
    iget v0, p0, Lt71;->λ:I

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    const-string v2, "\u53d6\u6d88"

    .line 53
    .line 54
    if-ne p2, v0, :cond_3

    .line 55
    .line 56
    new-instance p2, Landroid/app/AlertDialog$Builder;

    .line 57
    .line 58
    invoke-direct {p2, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 59
    .line 60
    .line 61
    const-string p1, "\u5220\u9664\u5f53\u524d\u7ec4"

    .line 62
    .line 63
    invoke-virtual {p2, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    const-string p2, "\u8be5\u7ec4\u7684\u56db\u4e2a\u5feb\u6377\u6309\u94ae\u4f1a\u88ab\u79fb\u9664\u3002"

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    new-instance p2, Lgd0;

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    iget-object p0, p0, Lt71;->μ:Lz71;

    .line 77
    .line 78
    invoke-direct {p2, v0, p0}, Lgd0;-><init>(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    const-string p0, "\u5220\u9664"

    .line 82
    .line 83
    invoke-virtual {p1, p0, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {p0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :cond_3
    iget v0, p0, Lt71;->ν:I

    .line 96
    .line 97
    if-ne p2, v0, :cond_4

    .line 98
    .line 99
    new-instance p2, Landroid/app/AlertDialog$Builder;

    .line 100
    .line 101
    invoke-direct {p2, p1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 102
    .line 103
    .line 104
    const-string p1, "\u6062\u590d\u9ed8\u8ba4"

    .line 105
    .line 106
    invoke-virtual {p2, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const-string p2, "\u6240\u6709\u81ea\u5b9a\u4e49\u5feb\u6377\u6309\u94ae\u548c\u65b0\u589e\u5206\u7ec4\u90fd\u4f1a\u88ab\u91cd\u7f6e\u3002"

    .line 111
    .line 112
    invoke-virtual {p1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance p2, Lgd0;

    .line 117
    .line 118
    const/4 v0, 0x3

    .line 119
    iget-object p0, p0, Lt71;->ξ:Lz71;

    .line 120
    .line 121
    invoke-direct {p2, v0, p0}, Lgd0;-><init>(ILjava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    const-string p0, "\u6062\u590d"

    .line 125
    .line 126
    invoke-virtual {p1, p0, p2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 127
    .line 128
    .line 129
    move-result-object p0

    .line 130
    invoke-virtual {p0, v2, v1}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 135
    .line 136
    .line 137
    :cond_4
    return-void
.end method
