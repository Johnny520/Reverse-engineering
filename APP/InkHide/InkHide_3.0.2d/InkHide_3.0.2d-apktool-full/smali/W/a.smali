.class public final LW/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT/z;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LW/a;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LT/l;La0/a;)LT/y;
    .locals 2

    .line 1
    iget v0, p0, LW/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p2, p2, La0/a;->a:Ljava/lang/Class;

    .line 7
    .line 8
    const-class v0, Ljava/sql/Timestamp;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    new-instance p2, La0/a;

    .line 16
    .line 17
    const-class v0, Ljava/util/Date;

    .line 18
    .line 19
    invoke-direct {p2, v0}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p2}, LT/l;->d(La0/a;)LT/y;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    new-instance p2, LZ/a;

    .line 27
    .line 28
    invoke-direct {p2, p1}, LZ/a;-><init>(LT/y;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p2, 0x0

    .line 33
    :goto_0
    return-object p2

    .line 34
    :pswitch_0
    iget-object p1, p2, La0/a;->a:Ljava/lang/Class;

    .line 35
    .line 36
    const-class p2, Ljava/sql/Time;

    .line 37
    .line 38
    if-ne p1, p2, :cond_1

    .line 39
    .line 40
    new-instance p1, LZ/a;

    .line 41
    .line 42
    const/4 p2, 0x1

    .line 43
    invoke-direct {p1, p2}, LZ/a;-><init>(I)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 p1, 0x0

    .line 48
    :goto_1
    return-object p1

    .line 49
    :pswitch_1
    iget-object p1, p2, La0/a;->a:Ljava/lang/Class;

    .line 50
    .line 51
    const-class p2, Ljava/sql/Date;

    .line 52
    .line 53
    if-ne p1, p2, :cond_2

    .line 54
    .line 55
    new-instance p1, LZ/a;

    .line 56
    .line 57
    const/4 p2, 0x0

    .line 58
    invoke-direct {p1, p2}, LZ/a;-><init>(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/4 p1, 0x0

    .line 63
    :goto_2
    return-object p1

    .line 64
    :pswitch_2
    const-class p1, Ljava/lang/Enum;

    .line 65
    .line 66
    iget-object p2, p2, La0/a;->a:Ljava/lang/Class;

    .line 67
    .line 68
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    if-ne p2, p1, :cond_3

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_3
    invoke-virtual {p2}, Ljava/lang/Class;->isEnum()Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-nez p1, :cond_4

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    :cond_4
    new-instance p1, LW/s;

    .line 88
    .line 89
    invoke-direct {p1, p2}, LW/s;-><init>(Ljava/lang/Class;)V

    .line 90
    .line 91
    .line 92
    goto :goto_4

    .line 93
    :cond_5
    :goto_3
    const/4 p1, 0x0

    .line 94
    :goto_4
    return-object p1

    .line 95
    :pswitch_3
    const-class p1, Ljava/util/Date;

    .line 96
    .line 97
    iget-object p2, p2, La0/a;->a:Ljava/lang/Class;

    .line 98
    .line 99
    if-ne p2, p1, :cond_6

    .line 100
    .line 101
    new-instance p1, LW/d;

    .line 102
    .line 103
    invoke-direct {p1}, LW/d;-><init>()V

    .line 104
    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_6
    const/4 p1, 0x0

    .line 108
    :goto_5
    return-object p1

    .line 109
    :pswitch_4
    iget-object p2, p2, La0/a;->b:Ljava/lang/reflect/Type;

    .line 110
    .line 111
    instance-of v0, p2, Ljava/lang/reflect/GenericArrayType;

    .line 112
    .line 113
    if-nez v0, :cond_8

    .line 114
    .line 115
    instance-of v1, p2, Ljava/lang/Class;

    .line 116
    .line 117
    if-eqz v1, :cond_7

    .line 118
    .line 119
    move-object v1, p2

    .line 120
    check-cast v1, Ljava/lang/Class;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    if-nez v1, :cond_8

    .line 127
    .line 128
    :cond_7
    const/4 p1, 0x0

    .line 129
    goto :goto_7

    .line 130
    :cond_8
    if-eqz v0, :cond_9

    .line 131
    .line 132
    check-cast p2, Ljava/lang/reflect/GenericArrayType;

    .line 133
    .line 134
    invoke-interface {p2}, Ljava/lang/reflect/GenericArrayType;->getGenericComponentType()Ljava/lang/reflect/Type;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    goto :goto_6

    .line 139
    :cond_9
    check-cast p2, Ljava/lang/Class;

    .line 140
    .line 141
    invoke-virtual {p2}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    :goto_6
    new-instance v0, La0/a;

    .line 146
    .line 147
    invoke-direct {v0, p2}, La0/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1, v0}, LT/l;->d(La0/a;)LT/y;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-instance v1, LW/b;

    .line 155
    .line 156
    invoke-static {p2}, LV/d;->g(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-direct {v1, p1, v0, p2}, LW/b;-><init>(LT/l;LT/y;Ljava/lang/Class;)V

    .line 161
    .line 162
    .line 163
    move-object p1, v1

    .line 164
    :goto_7
    return-object p1

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
