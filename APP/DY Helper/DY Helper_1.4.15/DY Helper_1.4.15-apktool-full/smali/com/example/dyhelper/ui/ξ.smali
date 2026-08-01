.class public final synthetic Lcom/example/dyhelper/ui/ξ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Lum1;

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Lum1;

.field public final synthetic ι:Lcom/example/dyhelper/ui/GestureAreaView;

.field public final synthetic κ:Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;

.field public final synthetic λ:Lla0;

.field public final synthetic μ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lum1;Lum1;Lum1;Lum1;Lcom/example/dyhelper/ui/GestureAreaView;Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;Lla0;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/ξ;->ε:Lum1;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/example/dyhelper/ui/ξ;->ζ:Lum1;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/example/dyhelper/ui/ξ;->η:Lum1;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/example/dyhelper/ui/ξ;->θ:Lum1;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/example/dyhelper/ui/ξ;->ι:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/example/dyhelper/ui/ξ;->κ:Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/example/dyhelper/ui/ξ;->λ:Lla0;

    .line 17
    .line 18
    iput-object p8, p0, Lcom/example/dyhelper/ui/ξ;->μ:Landroid/app/Activity;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    iget-object p1, p0, Lcom/example/dyhelper/ui/ξ;->ε:Lum1;

    .line 2
    .line 3
    iget-object v0, p1, Lum1;->ε:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Lw90;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/example/dyhelper/ui/ξ;->ζ:Lum1;

    .line 8
    .line 9
    iget-object v2, v1, Lum1;->ε:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Lw90;

    .line 12
    .line 13
    invoke-static {v0, v2}, Lw90;->β(Lw90;Lw90;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v2, p0, Lcom/example/dyhelper/ui/ξ;->η:Lum1;

    .line 18
    .line 19
    iget-object v3, p0, Lcom/example/dyhelper/ui/ξ;->θ:Lum1;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v2, Lum1;->ε:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v4, v3, Lum1;->ε:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {v0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    :try_start_0
    sget-object v4, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 35
    .line 36
    iget-object v4, p1, Lum1;->ε:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v4, Lw90;

    .line 39
    .line 40
    iget-object v5, v2, Lum1;->ε:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v5, Lx90;

    .line 43
    .line 44
    invoke-static {v4, v5}, Li2;->Α(Lw90;Lx90;)Z

    .line 45
    .line 46
    .line 47
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception v4

    .line 50
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    new-instance v6, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v7, "\u4fdd\u5b58\u624b\u52bf\u533a\u57df\u8fb9\u8ddd\u5931\u8d25: "

    .line 57
    .line 58
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    const-string v6, "GesturePositionPreview"

    .line 69
    .line 70
    invoke-static {v6, v5, v4}, Lux;->τ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    move v4, v0

    .line 74
    :goto_0
    iget-object v5, p0, Lcom/example/dyhelper/ui/ξ;->μ:Landroid/app/Activity;

    .line 75
    .line 76
    if-eqz v4, :cond_1

    .line 77
    .line 78
    sget-object v4, Lcom/example/dyhelper/ui/GestureAreaView;->ξ:Lw90;

    .line 79
    .line 80
    invoke-static {}, Li2;->σ()Lw90;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    iput-object v4, v1, Lum1;->ε:Ljava/lang/Object;

    .line 85
    .line 86
    iput-object v4, p1, Lum1;->ε:Ljava/lang/Object;

    .line 87
    .line 88
    invoke-static {}, Li2;->τ()Lx90;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iput-object p1, v3, Lum1;->ε:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object p1, v2, Lum1;->ε:Ljava/lang/Object;

    .line 95
    .line 96
    iget-object p1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p1, Lw90;

    .line 99
    .line 100
    iget-object v2, p0, Lcom/example/dyhelper/ui/ξ;->ι:Lcom/example/dyhelper/ui/GestureAreaView;

    .line 101
    .line 102
    invoke-virtual {v2, p1}, Lcom/example/dyhelper/ui/GestureAreaView;->setGridBounds(Lw90;)V

    .line 103
    .line 104
    .line 105
    iget-object p1, v1, Lum1;->ε:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, Lw90;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    iget-object v1, p0, Lcom/example/dyhelper/ui/ξ;->κ:Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;

    .line 113
    .line 114
    iget-object v2, v1, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->η:Lx90;

    .line 115
    .line 116
    invoke-static {p1, v2}, Li2;->Β(Lw90;Lx90;)Lw90;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    iput-object p1, v1, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->ζ:Lw90;

    .line 121
    .line 122
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 123
    .line 124
    .line 125
    iget-object p1, v3, Lum1;->ε:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast p1, Lx90;

    .line 128
    .line 129
    invoke-virtual {v1, p1}, Lcom/example/dyhelper/ui/GesturePositionPreviewOverlay$GestureGridDividerEditorView;->η(Lx90;)V

    .line 130
    .line 131
    .line 132
    iget-object p0, p0, Lcom/example/dyhelper/ui/ξ;->λ:Lla0;

    .line 133
    .line 134
    invoke-virtual {p0}, Lla0;->invoke()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    const-string p0, "\u624b\u52bf\u533a\u57df\u4f4d\u7f6e\u5df2\u4fdd\u5b58"

    .line 138
    .line 139
    invoke-static {v5, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_1
    const-string p0, "\u4fdd\u5b58\u624b\u52bf\u533a\u57df\u4f4d\u7f6e\u5931\u8d25"

    .line 148
    .line 149
    invoke-static {v5, p0, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 154
    .line 155
    .line 156
    :cond_2
    :goto_1
    return-void
.end method
