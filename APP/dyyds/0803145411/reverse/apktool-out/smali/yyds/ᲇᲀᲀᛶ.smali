.class public final Lyyds/ᲇᲀᲀᛶ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛷᛴᲈᲀ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛲᛳ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛴᛸᛲᛳ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᲇᲀᲀᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲇᲀᲀᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛲᛳ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛲᛳᛶᲁ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lyyds/ᲇᲀᲀᛶ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iget-object p0, p0, Lyyds/ᲇᲀᲀᛶ;->ᲇᲈᛵᛷ:Lyyds/ᛴᛸᛲᛳ;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/reflect/Member;

    .line 9
    .line 10
    new-instance v0, Lyyds/ᛷᛵᛶᛳ;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/reflect/Field;

    .line 13
    .line 14
    invoke-direct {v0, p1}, Lyyds/ᛷᛵᛶᛳ;-><init>(Ljava/lang/reflect/Field;)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lyyds/ᛷᛵᛶᛳ;->ᛷᛸᲇᛶ(Ljava/lang/Object;)Lyyds/ᛳᛶᲇᛴ;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object v0

    .line 25
    :pswitch_0
    check-cast p1, Ljava/lang/reflect/Member;

    .line 26
    .line 27
    new-instance v0, Lyyds/ᲀᛳᛲᛷ;

    .line 28
    .line 29
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 30
    .line 31
    invoke-direct {v0, p1}, Lyyds/ᲀᛳᛲᛷ;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_1
    check-cast p1, Ljava/lang/reflect/Member;

    .line 38
    .line 39
    new-instance v0, Lyyds/ᛳᛲᛶᛴ;

    .line 40
    .line 41
    check-cast p1, Ljava/lang/reflect/Method;

    .line 42
    .line 43
    invoke-direct {v0, p1}, Lyyds/ᛳᛲᛶᛴ;-><init>(Ljava/lang/reflect/Method;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 47
    .line 48
    if-eqz p0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0, p0}, Lyyds/ᛳᛲᛶᛴ;->ᛷᛸᲇᛶ(Ljava/lang/Object;)Lyyds/ᛳᛶᲇᛴ;

    .line 51
    .line 52
    .line 53
    :cond_1
    return-object v0

    .line 54
    :pswitch_2
    check-cast p1, Ljava/lang/reflect/Member;

    .line 55
    .line 56
    new-instance v0, Lyyds/ᛷᛵᛶᛳ;

    .line 57
    .line 58
    check-cast p1, Ljava/lang/reflect/Field;

    .line 59
    .line 60
    invoke-direct {v0, p1}, Lyyds/ᛷᛵᛶᛳ;-><init>(Ljava/lang/reflect/Field;)V

    .line 61
    .line 62
    .line 63
    iget-object p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 64
    .line 65
    if-eqz p0, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0, p0}, Lyyds/ᛷᛵᛶᛳ;->ᛷᛸᲇᛶ(Ljava/lang/Object;)Lyyds/ᛳᛶᲇᛴ;

    .line 68
    .line 69
    .line 70
    :cond_2
    return-object v0

    .line 71
    :pswitch_3
    check-cast p1, Ljava/lang/reflect/Member;

    .line 72
    .line 73
    new-instance v0, Lyyds/ᲀᛳᛲᛷ;

    .line 74
    .line 75
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 76
    .line 77
    invoke-direct {v0, p1}, Lyyds/ᲀᛳᛲᛷ;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 78
    .line 79
    .line 80
    iget-object p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_4
    check-cast p1, Ljava/lang/reflect/Member;

    .line 84
    .line 85
    new-instance v0, Lyyds/ᛳᛲᛶᛴ;

    .line 86
    .line 87
    check-cast p1, Ljava/lang/reflect/Method;

    .line 88
    .line 89
    invoke-direct {v0, p1}, Lyyds/ᛳᛲᛶᛴ;-><init>(Ljava/lang/reflect/Method;)V

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 93
    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Lyyds/ᛳᛲᛶᛴ;->ᛷᛸᲇᛶ(Ljava/lang/Object;)Lyyds/ᛳᛶᲇᛴ;

    .line 97
    .line 98
    .line 99
    :cond_3
    return-object v0

    .line 100
    :pswitch_5
    check-cast p1, Ljava/lang/reflect/Member;

    .line 101
    .line 102
    new-instance v0, Lyyds/ᛷᛵᛶᛳ;

    .line 103
    .line 104
    check-cast p1, Ljava/lang/reflect/Field;

    .line 105
    .line 106
    invoke-direct {v0, p1}, Lyyds/ᛷᛵᛶᛳ;-><init>(Ljava/lang/reflect/Field;)V

    .line 107
    .line 108
    .line 109
    iget-object p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 110
    .line 111
    if-eqz p0, :cond_4

    .line 112
    .line 113
    invoke-virtual {v0, p0}, Lyyds/ᛷᛵᛶᛳ;->ᛷᛸᲇᛶ(Ljava/lang/Object;)Lyyds/ᛳᛶᲇᛴ;

    .line 114
    .line 115
    .line 116
    :cond_4
    return-object v0

    .line 117
    :pswitch_6
    check-cast p1, Ljava/lang/reflect/Member;

    .line 118
    .line 119
    new-instance v0, Lyyds/ᲀᛳᛲᛷ;

    .line 120
    .line 121
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 122
    .line 123
    invoke-direct {v0, p1}, Lyyds/ᲀᛳᛲᛷ;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 124
    .line 125
    .line 126
    iget-object p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_7
    check-cast p1, Ljava/lang/reflect/Member;

    .line 130
    .line 131
    new-instance v0, Lyyds/ᛳᛲᛶᛴ;

    .line 132
    .line 133
    check-cast p1, Ljava/lang/reflect/Method;

    .line 134
    .line 135
    invoke-direct {v0, p1}, Lyyds/ᛳᛲᛶᛴ;-><init>(Ljava/lang/reflect/Method;)V

    .line 136
    .line 137
    .line 138
    iget-object p0, p0, Lyyds/ᛴᛸᛲᛳ;->ᛵᛸᛸᛷ:Ljava/lang/Object;

    .line 139
    .line 140
    if-eqz p0, :cond_5

    .line 141
    .line 142
    invoke-virtual {v0, p0}, Lyyds/ᛳᛲᛶᛴ;->ᛷᛸᲇᛶ(Ljava/lang/Object;)Lyyds/ᛳᛶᲇᛴ;

    .line 143
    .line 144
    .line 145
    :cond_5
    return-object v0

    .line 146
    nop

    .line 147
    :pswitch_data_0
    .packed-switch 0x0
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
