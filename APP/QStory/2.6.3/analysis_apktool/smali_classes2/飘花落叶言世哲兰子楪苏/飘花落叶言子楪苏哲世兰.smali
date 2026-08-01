.class public final L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/text/TextWatcher;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/io/File;

.field public final synthetic 飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;Ljava/io/File;L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/EditText;

    .line 5
    .line 6
    iput-object p2, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/io/File;

    .line 7
    .line 8
    iput-object p3, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final afterTextChanged(Landroid/text/Editable;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "\u55b5\u545c\u545c\u545c\u545c\u55b5\u55b5\u545c"

    .line 6
    .line 7
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, ""

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_2

    .line 28
    .line 29
    iget-object p1, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroid/widget/EditText;

    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v1, Ljava/io/File;

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 52
    .line 53
    .line 54
    iget-object v3, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/io/File;

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v4, "\u55b5\u545c\u55b5\u545c\u545c\u545c\u55b5\u55b5"

    .line 64
    .line 65
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    iget-object p0, p0, L飘花落叶言世哲兰子楪苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言世哲子兰楪苏/飘花落叶言子楪世苏哲兰;

    .line 87
    .line 88
    if-eqz v1, :cond_0

    .line 89
    .line 90
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0, v0}, L飘花落叶言楪苏子兰哲世/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_0
    new-instance v1, Ljava/io/File;

    .line 102
    .line 103
    new-instance v2, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-static {v4}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, v1}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    if-eqz v1, :cond_1

    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 139
    .line 140
    .line 141
    return-void

    .line 142
    :cond_1
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    const/16 p0, 0x22e

    .line 146
    .line 147
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_2
    return-void
.end method

.method public final beforeTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    return-void
.end method
