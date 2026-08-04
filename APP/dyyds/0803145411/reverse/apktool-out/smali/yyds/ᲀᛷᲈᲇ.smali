.class public final synthetic Lyyds/ᲀᛷᲈᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Landroid/widget/SeekBar;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/SeekBar;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲀᛷᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲀᛷᲈᲇ;->ᲇᲈᛵᛷ:Landroid/widget/SeekBar;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget p1, p0, Lyyds/ᲀᛷᲈᲇ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    const/16 v0, 0x64

    .line 4
    .line 5
    iget-object p0, p0, Lyyds/ᲀᛷᲈᲇ;->ᲇᲈᛵᛷ:Landroid/widget/SeekBar;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-ge p1, v0, :cond_0

    .line 19
    .line 20
    add-int/lit8 p1, p1, 0x1

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-lez p1, :cond_1

    .line 31
    .line 32
    add-int/lit8 p1, p1, -0x1

    .line 33
    .line 34
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 35
    .line 36
    .line 37
    :cond_1
    return-void

    .line 38
    :pswitch_1
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-ge p1, v1, :cond_3

    .line 47
    .line 48
    add-int/lit8 p1, p1, 0x1

    .line 49
    .line 50
    if-le p1, v0, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move v0, p1

    .line 54
    :goto_0
    invoke-virtual {p0, v0}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void

    .line 58
    :pswitch_2
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-lez p1, :cond_5

    .line 63
    .line 64
    add-int/lit8 p1, p1, -0x1

    .line 65
    .line 66
    if-gez p1, :cond_4

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    :cond_4
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 70
    .line 71
    .line 72
    :cond_5
    return-void

    .line 73
    :pswitch_3
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-ge p1, v0, :cond_6

    .line 82
    .line 83
    add-int/lit8 p1, p1, 0x1

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 86
    .line 87
    .line 88
    :cond_6
    return-void

    .line 89
    :pswitch_4
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMin()I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-le p1, v0, :cond_7

    .line 98
    .line 99
    add-int/lit8 p1, p1, -0x1

    .line 100
    .line 101
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 102
    .line 103
    .line 104
    :cond_7
    return-void

    .line 105
    :pswitch_5
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getMax()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-ge p1, v0, :cond_8

    .line 114
    .line 115
    add-int/lit8 p1, p1, 0x1

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 118
    .line 119
    .line 120
    :cond_8
    return-void

    .line 121
    :pswitch_6
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    if-lez p1, :cond_9

    .line 126
    .line 127
    add-int/lit8 p1, p1, -0x1

    .line 128
    .line 129
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 130
    .line 131
    .line 132
    :cond_9
    return-void

    .line 133
    :pswitch_7
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    if-ge p1, v0, :cond_a

    .line 138
    .line 139
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    add-int/lit8 p1, p1, 0x1

    .line 144
    .line 145
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 146
    .line 147
    .line 148
    :cond_a
    return-void

    .line 149
    :pswitch_8
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-lez p1, :cond_b

    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    add-int/lit8 p1, p1, -0x1

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 162
    .line 163
    .line 164
    :cond_b
    return-void

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
