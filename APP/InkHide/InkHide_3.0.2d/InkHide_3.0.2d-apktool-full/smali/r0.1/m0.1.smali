.class public final synthetic Lr0/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/c;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Class;

.field public final synthetic c:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Ljava/lang/Class;I)V
    .locals 0

    .line 1
    iput p3, p0, Lr0/m0;->a:I

    iput-object p1, p0, Lr0/m0;->b:Ljava/lang/Class;

    iput-object p2, p0, Lr0/m0;->c:Ljava/lang/Class;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/reflect/AccessibleObject;)Z
    .locals 4

    .line 1
    iget v0, p0, Lr0/m0;->a:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/reflect/Method;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {p1, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz p1, :cond_0

    .line 24
    .line 25
    array-length p1, v0

    .line 26
    const/4 v2, 0x2

    .line 27
    if-lt p1, v2, :cond_0

    .line 28
    .line 29
    aget-object p1, v0, v1

    .line 30
    .line 31
    iget-object v2, p0, Lr0/m0;->b:Ljava/lang/Class;

    .line 32
    .line 33
    invoke-static {p1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    const/4 p1, 0x1

    .line 40
    aget-object v0, v0, p1

    .line 41
    .line 42
    iget-object v2, p0, Lr0/m0;->c:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    move v1, p1

    .line 51
    :cond_0
    return v1

    .line 52
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    iget-object v1, p0, Lr0/m0;->b:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-static {p1, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    const/4 v1, 0x0

    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    invoke-static {v0}, LN0/g;->b(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    array-length p1, v0

    .line 73
    if-nez p1, :cond_1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    aget-object p1, v0, v1

    .line 77
    .line 78
    iget-object v0, p0, Lr0/m0;->c:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-static {p1, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_2

    .line 85
    .line 86
    const/4 v1, 0x1

    .line 87
    :cond_2
    :goto_0
    return v1

    .line 88
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-class v1, Ljava/lang/CharSequence;

    .line 93
    .line 94
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    const/4 v1, 0x0

    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    array-length v0, v0

    .line 106
    const/4 v2, 0x3

    .line 107
    if-lt v0, v2, :cond_3

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    aget-object v0, v0, v1

    .line 114
    .line 115
    const-class v2, Landroid/content/Context;

    .line 116
    .line 117
    invoke-static {v0, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_3

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const/4 v2, 0x1

    .line 128
    aget-object v0, v0, v2

    .line 129
    .line 130
    iget-object v3, p0, Lr0/m0;->b:Ljava/lang/Class;

    .line 131
    .line 132
    invoke-static {v0, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_3

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    const/4 v0, 0x2

    .line 143
    aget-object p1, p1, v0

    .line 144
    .line 145
    iget-object v0, p0, Lr0/m0;->c:Ljava/lang/Class;

    .line 146
    .line 147
    invoke-static {p1, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    if-eqz p1, :cond_3

    .line 152
    .line 153
    move v1, v2

    .line 154
    :cond_3
    return v1

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
