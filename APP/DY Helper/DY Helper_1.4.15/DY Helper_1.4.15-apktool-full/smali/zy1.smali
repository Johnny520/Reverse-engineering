.class public final synthetic Lzy1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic ε:Landroid/widget/EditText;

.field public final synthetic ζ:Lky1;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Landroid/app/Activity;

.field public final synthetic ι:Lg80;

.field public final synthetic κ:Lum1;

.field public final synthetic λ:Landroid/widget/EditText;

.field public final synthetic μ:Z

.field public final synthetic ν:Lum1;

.field public final synthetic ξ:Lum1;

.field public final synthetic ο:Lum1;

.field public final synthetic π:Lum1;

.field public final synthetic ρ:Lum1;

.field public final synthetic σ:Lum1;

.field public final synthetic τ:Lrd;

.field public final synthetic υ:Lum1;

.field public final synthetic φ:Lum1;

.field public final synthetic χ:Lum1;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/EditText;Lky1;Lum1;Landroid/app/Activity;Lg80;Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;Lrd;Lum1;Lum1;Lum1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzy1;->ε:Landroid/widget/EditText;

    .line 5
    .line 6
    iput-object p2, p0, Lzy1;->ζ:Lky1;

    .line 7
    .line 8
    iput-object p3, p0, Lzy1;->η:Lum1;

    .line 9
    .line 10
    iput-object p4, p0, Lzy1;->θ:Landroid/app/Activity;

    .line 11
    .line 12
    iput-object p5, p0, Lzy1;->ι:Lg80;

    .line 13
    .line 14
    iput-object p6, p0, Lzy1;->κ:Lum1;

    .line 15
    .line 16
    iput-object p7, p0, Lzy1;->λ:Landroid/widget/EditText;

    .line 17
    .line 18
    iput-boolean p8, p0, Lzy1;->μ:Z

    .line 19
    .line 20
    iput-object p9, p0, Lzy1;->ν:Lum1;

    .line 21
    .line 22
    iput-object p10, p0, Lzy1;->ξ:Lum1;

    .line 23
    .line 24
    iput-object p11, p0, Lzy1;->ο:Lum1;

    .line 25
    .line 26
    iput-object p12, p0, Lzy1;->π:Lum1;

    .line 27
    .line 28
    iput-object p13, p0, Lzy1;->ρ:Lum1;

    .line 29
    .line 30
    iput-object p14, p0, Lzy1;->σ:Lum1;

    .line 31
    .line 32
    iput-object p15, p0, Lzy1;->τ:Lrd;

    .line 33
    .line 34
    move-object/from16 p1, p16

    .line 35
    .line 36
    iput-object p1, p0, Lzy1;->υ:Lum1;

    .line 37
    .line 38
    move-object/from16 p1, p17

    .line 39
    .line 40
    iput-object p1, p0, Lzy1;->φ:Lum1;

    .line 41
    .line 42
    move-object/from16 p1, p18

    .line 43
    .line 44
    iput-object p1, p0, Lzy1;->χ:Lum1;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 9

    .line 1
    iget-object v0, p0, Lzy1;->η:Lum1;

    .line 2
    .line 3
    iget-object v1, p0, Lzy1;->λ:Landroid/widget/EditText;

    .line 4
    .line 5
    iget-boolean v2, p0, Lzy1;->μ:Z

    .line 6
    .line 7
    iget-object v3, p0, Lzy1;->ν:Lum1;

    .line 8
    .line 9
    iget-object v4, p0, Lzy1;->ξ:Lum1;

    .line 10
    .line 11
    iget-object v5, p0, Lzy1;->ο:Lum1;

    .line 12
    .line 13
    iget-object v6, p0, Lzy1;->π:Lum1;

    .line 14
    .line 15
    iget-object v7, p0, Lzy1;->ρ:Lum1;

    .line 16
    .line 17
    iget-object v8, p0, Lzy1;->σ:Lum1;

    .line 18
    .line 19
    invoke-static/range {v0 .. v8}, Ljz1;->χ(Lum1;Landroid/widget/EditText;ZLum1;Lum1;Lum1;Lum1;Lum1;Lum1;)Lmy1;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object p2, p0, Lzy1;->ε:Landroid/widget/EditText;

    .line 24
    .line 25
    invoke-virtual {p2}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move-object p2, v1

    .line 38
    :goto_0
    if-nez p2, :cond_1

    .line 39
    .line 40
    const-string p2, ""

    .line 41
    .line 42
    :cond_1
    invoke-static {p2}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    iget-object v2, p0, Lzy1;->ζ:Lky1;

    .line 51
    .line 52
    if-eqz v2, :cond_2

    .line 53
    .line 54
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-nez v3, :cond_2

    .line 59
    .line 60
    const/16 v3, 0xa

    .line 61
    .line 62
    invoke-static {p2, v3}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-eqz v3, :cond_2

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v5, 0x1

    .line 73
    if-gt v5, v4, :cond_2

    .line 74
    .line 75
    const/16 v5, 0x2710

    .line 76
    .line 77
    if-ge v4, v5, :cond_2

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    move-object v3, v1

    .line 81
    :goto_1
    iget-object v0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 82
    .line 83
    const-string v4, "custom"

    .line 84
    .line 85
    invoke-static {v0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget-object v4, p0, Lzy1;->θ:Landroid/app/Activity;

    .line 90
    .line 91
    const/4 v5, 0x0

    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    iget-object v0, p1, Lmy1;->α:Ljava/lang/String;

    .line 95
    .line 96
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    const-string p0, "\u56fa\u5b9a\u6587\u672c\u4e0d\u80fd\u4e3a\u7a7a"

    .line 103
    .line 104
    invoke-static {v4, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_3
    if-eqz v2, :cond_4

    .line 113
    .line 114
    invoke-static {p2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 115
    .line 116
    .line 117
    move-result p2

    .line 118
    if-nez p2, :cond_4

    .line 119
    .line 120
    if-nez v3, :cond_4

    .line 121
    .line 122
    const-string p0, "\u4f2a\u88c5\u5929\u6570\u8bf7\u8f93\u5165 1~9999 \u7684\u6574\u6570"

    .line 123
    .line 124
    invoke-static {v4, p0, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 129
    .line 130
    .line 131
    return-void

    .line 132
    :cond_4
    iget-object p2, p0, Lzy1;->κ:Lum1;

    .line 133
    .line 134
    iget-object p2, p2, Lum1;->ε:Ljava/lang/Object;

    .line 135
    .line 136
    iget-object v0, p0, Lzy1;->τ:Lrd;

    .line 137
    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    new-instance v1, Lrd;

    .line 141
    .line 142
    iget-object v0, p0, Lzy1;->υ:Lum1;

    .line 143
    .line 144
    iget-object v0, v0, Lum1;->ε:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v0, Ljava/lang/String;

    .line 147
    .line 148
    invoke-static {v0}, Ljz1;->υ(Ljava/lang/String;)Lip1;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iget-object v2, p0, Lzy1;->φ:Lum1;

    .line 153
    .line 154
    iget-object v2, v2, Lum1;->ε:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast v2, Ljava/lang/String;

    .line 157
    .line 158
    invoke-static {v2}, Ljz1;->υ(Ljava/lang/String;)Lip1;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    iget-object v4, p0, Lzy1;->χ:Lum1;

    .line 163
    .line 164
    iget-object v4, v4, Lum1;->ε:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast v4, Ljava/lang/String;

    .line 167
    .line 168
    invoke-static {v4}, Ljz1;->υ(Ljava/lang/String;)Lip1;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-direct {v1, v0, v2, v4}, Lrd;-><init>(Lip1;Lip1;Lip1;)V

    .line 173
    .line 174
    .line 175
    :cond_5
    iget-object p0, p0, Lzy1;->ι:Lg80;

    .line 176
    .line 177
    invoke-interface {p0, p1, p2, v3, v1}, Lg80;->ε(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    return-void
.end method
