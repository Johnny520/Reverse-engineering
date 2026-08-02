.class public final Llw0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ldp;
.implements Lcp;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lmp;


# direct methods
.method public synthetic constructor <init>(Lmp;I)V
    .locals 0

    .line 1
    iput p2, p0, Llw0;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Llw0;->i:Lmp;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ls52;Lr92;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llw0;->i:Lmp;

    .line 2
    .line 3
    invoke-virtual {p0}, Lmp;->y()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2}, Lr92;->close()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    sget-object p1, Lkw0;->h:Lkw0;

    .line 14
    .line 15
    invoke-virtual {p0, p2, p1}, Lmp;->i(Ljava/lang/Object;Lnn0;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public b(Lwo;Lq92;)V
    .locals 2

    .line 1
    iget v0, p0, Llw0;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Llw0;->i:Lmp;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, Lmp;->h(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p1, p2, Lq92;->a:Lr92;

    .line 13
    .line 14
    iget-boolean p1, p1, Lr92;->w:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p2, Lq92;->b:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lmp;->h(Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Lpv;

    .line 25
    .line 26
    invoke-direct {p1, p2}, Lpv;-><init>(Lq92;)V

    .line 27
    .line 28
    .line 29
    new-instance p2, Lx92;

    .line 30
    .line 31
    invoke-direct {p2, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p2}, Lmp;->h(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    return-void

    .line 38
    :pswitch_1
    iget-object v0, p2, Lq92;->a:Lr92;

    .line 39
    .line 40
    iget-boolean v0, v0, Lr92;->w:Z

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object p2, p2, Lq92;->b:Ljava/lang/Object;

    .line 45
    .line 46
    if-nez p2, :cond_1

    .line 47
    .line 48
    invoke-interface {p1}, Lwo;->c()Lk82;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    const-class p2, Ld21;

    .line 56
    .line 57
    invoke-static {p2}, Ld72;->a(Ljava/lang/Class;)Lbt;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    invoke-static {p2}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object p1, p1, Lk82;->e:Lp40;

    .line 66
    .line 67
    invoke-virtual {p1, p2}, Lp40;->u(Lbt;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    check-cast p1, Ld21;

    .line 79
    .line 80
    iget-object p1, p1, Ld21;->b:Ljava/lang/reflect/Method;

    .line 81
    .line 82
    new-instance p2, Lt51;

    .line 83
    .line 84
    new-instance v0, Ljava/lang/StringBuilder;

    .line 85
    .line 86
    const-string v1, "Response from "

    .line 87
    .line 88
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const-class v1, Lip0;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const/16 v1, 0x2e

    .line 101
    .line 102
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string p1, " was null but response body type was declared as non-null"

    .line 113
    .line 114
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    new-instance p1, Lx92;

    .line 125
    .line 126
    invoke-direct {p1, p2}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0, p1}, Lmp;->h(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    goto :goto_1

    .line 133
    :cond_1
    invoke-virtual {p0, p2}, Lmp;->h(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_1

    .line 137
    :cond_2
    new-instance p1, Lpv;

    .line 138
    .line 139
    invoke-direct {p1, p2}, Lpv;-><init>(Lq92;)V

    .line 140
    .line 141
    .line 142
    new-instance p2, Lx92;

    .line 143
    .line 144
    invoke-direct {p2, p1}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0, p2}, Lmp;->h(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :goto_1
    return-void

    .line 151
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lwo;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p1, p0, Llw0;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Llw0;->i:Lmp;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, Lx92;

    .line 9
    .line 10
    invoke-direct {p1, p2}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lmp;->h(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :pswitch_0
    new-instance p1, Lx92;

    .line 18
    .line 19
    invoke-direct {p1, p2}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lmp;->h(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    new-instance p1, Lx92;

    .line 27
    .line 28
    invoke-direct {p1, p2}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lmp;->h(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public j(Ls52;Ljava/io/IOException;)V
    .locals 0

    .line 1
    iget-object p0, p0, Llw0;->i:Lmp;

    .line 2
    .line 3
    invoke-virtual {p0}, Lmp;->y()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Lx92;

    .line 10
    .line 11
    invoke-direct {p1, p2}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lmp;->h(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
