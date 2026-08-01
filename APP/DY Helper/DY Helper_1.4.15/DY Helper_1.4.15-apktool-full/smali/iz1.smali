.class public final Liz1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;

.field public final synthetic γ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Comparator;Ljava/util/LinkedHashMap;I)V
    .locals 0

    .line 12
    iput p3, p0, Liz1;->α:I

    iput-object p1, p0, Liz1;->γ:Ljava/lang/Object;

    iput-object p2, p0, Liz1;->β:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lp22;Ljava/nio/ByteBuffer;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Liz1;->α:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Liz1;->β:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Liz1;->γ:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, Liz1;->α:I

    .line 2
    .line 3
    iget-object v1, p0, Liz1;->γ:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Liz1;->β:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Integer;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    check-cast p0, Lp22;

    .line 15
    .line 16
    check-cast v1, Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, v1}, Lp22;->keysCompare(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/nio/ByteBuffer;)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_0
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    check-cast v1, Lqy1;

    .line 26
    .line 27
    invoke-virtual {v1, p1, p2}, Lqy1;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    check-cast p2, Lky1;

    .line 35
    .line 36
    sget-object v0, Lry1;->α:Lry1;

    .line 37
    .line 38
    invoke-static {p2}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    check-cast p2, Lhz1;

    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    const/4 v1, 0x1

    .line 50
    if-eqz p2, :cond_1

    .line 51
    .line 52
    iget-object p2, p2, Lhz1;->γ:Lgy1;

    .line 53
    .line 54
    iget-boolean p2, p2, Lgy1;->β:Z

    .line 55
    .line 56
    if-ne p2, v1, :cond_1

    .line 57
    .line 58
    move p2, v1

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move p2, v0

    .line 61
    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 62
    .line 63
    .line 64
    move-result-object p2

    .line 65
    check-cast p1, Lky1;

    .line 66
    .line 67
    invoke-static {p1}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, Lhz1;

    .line 76
    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    iget-object p0, p0, Lhz1;->γ:Lgy1;

    .line 80
    .line 81
    iget-boolean p0, p0, Lgy1;->β:Z

    .line 82
    .line 83
    if-ne p0, v1, :cond_2

    .line 84
    .line 85
    move v0, v1

    .line 86
    :cond_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p2, p0}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    :goto_1
    return v0

    .line 95
    :pswitch_1
    check-cast p0, Ljava/util/LinkedHashMap;

    .line 96
    .line 97
    check-cast v1, Ljd1;

    .line 98
    .line 99
    invoke-virtual {v1, p1, p2}, Ljd1;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_3

    .line 104
    .line 105
    goto :goto_4

    .line 106
    :cond_3
    check-cast p1, Lky1;

    .line 107
    .line 108
    sget-object v0, Lry1;->α:Lry1;

    .line 109
    .line 110
    invoke-static {p1}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Lhz1;

    .line 119
    .line 120
    const/4 v0, 0x0

    .line 121
    if-eqz p1, :cond_4

    .line 122
    .line 123
    iget-object p1, p1, Lhz1;->β:Ljava/lang/String;

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_4
    move-object p1, v0

    .line 127
    :goto_2
    const-string v1, ""

    .line 128
    .line 129
    if-nez p1, :cond_5

    .line 130
    .line 131
    move-object p1, v1

    .line 132
    :cond_5
    check-cast p2, Lky1;

    .line 133
    .line 134
    invoke-static {p2}, Lry1;->ｐ(Lky1;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    check-cast p0, Lhz1;

    .line 143
    .line 144
    if-eqz p0, :cond_6

    .line 145
    .line 146
    iget-object v0, p0, Lhz1;->β:Ljava/lang/String;

    .line 147
    .line 148
    :cond_6
    if-nez v0, :cond_7

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_7
    move-object v1, v0

    .line 152
    :goto_3
    invoke-static {p1, v1}, Lbd;->κ(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    :goto_4
    return v0

    .line 157
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
