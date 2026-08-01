.class public final synthetic Lrb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;

.field public final synthetic η:Landroid/widget/Button;

.field public final synthetic θ:Landroid/widget/Button;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/Button;Landroid/widget/Button;I)V
    .locals 0

    .line 1
    iput p4, p0, Lrb1;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lrb1;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    iput-object p2, p0, Lrb1;->η:Landroid/widget/Button;

    .line 6
    .line 7
    iput-object p3, p0, Lrb1;->θ:Landroid/widget/Button;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lrb1;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lrb1;->θ:Landroid/widget/Button;

    .line 7
    .line 8
    iget-object v4, p0, Lrb1;->η:Landroid/widget/Button;

    .line 9
    .line 10
    iget-object p0, p0, Lrb1;->ζ:Landroid/app/Activity;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p1, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    invoke-static {}, Lui1;->Α()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const v0, 0xf4240

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v2, v0}, Lj81;->μ(III)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const-string v0, "pet_elf_camp_smart_seed_max_price"

    .line 36
    .line 37
    invoke-static {v0, p1}, Lui1;->Η(Ljava/lang/String;I)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, Lxn0;->Ψ()V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-static {v4, v3}, Lxn0;->ρ(Landroid/widget/Button;Landroid/widget/Button;)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Ldd1;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 47
    .line 48
    sget-object p1, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    invoke-static {}, Ljc1;->κ()Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    xor-int/lit8 p1, p1, 0x1

    .line 59
    .line 60
    invoke-static {p0, p1}, Ldd1;->ε(Landroid/app/Activity;Z)V

    .line 61
    .line 62
    .line 63
    return-object v1

    .line 64
    :pswitch_0
    check-cast p1, Lvd1;

    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v0, p1, Lvd1;->α:Ltd;

    .line 70
    .line 71
    iget-object p1, p1, Lvd1;->β:Ljava/lang/Integer;

    .line 72
    .line 73
    invoke-static {}, Lui1;->Α()Z

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    if-nez v5, :cond_1

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_1
    const/4 v5, 0x0

    .line 81
    sget-object v6, Ltd;->η:Ltd;

    .line 82
    .line 83
    sget-object v7, Ltd;->ζ:Ltd;

    .line 84
    .line 85
    if-ne v0, v7, :cond_2

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    if-ne v0, v6, :cond_3

    .line 89
    .line 90
    if-eqz p1, :cond_3

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-lez v0, :cond_3

    .line 97
    .line 98
    move-object v7, v6

    .line 99
    goto :goto_1

    .line 100
    :cond_3
    move-object v7, v5

    .line 101
    :goto_1
    if-eqz v7, :cond_4

    .line 102
    .line 103
    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    goto :goto_2

    .line 108
    :cond_4
    move-object v0, v5

    .line 109
    :goto_2
    if-nez v0, :cond_5

    .line 110
    .line 111
    const-string v0, ""

    .line 112
    .line 113
    :cond_5
    const-string v8, "pet_elf_camp_global_plant_seed_mode"

    .line 114
    .line 115
    invoke-static {v8, v0}, Lui1;->Ι(Ljava/lang/String;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    if-ne v7, v6, :cond_7

    .line 119
    .line 120
    if-eqz p1, :cond_6

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 123
    .line 124
    .line 125
    move-result v2

    .line 126
    goto :goto_3

    .line 127
    :cond_6
    const-string p0, "Required value was null."

    .line 128
    .line 129
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    move-object v1, v5

    .line 133
    goto :goto_5

    .line 134
    :cond_7
    :goto_3
    const-string p1, "pet_elf_camp_global_plant_seed_id"

    .line 135
    .line 136
    invoke-static {p1, v2}, Lui1;->Η(Ljava/lang/String;I)V

    .line 137
    .line 138
    .line 139
    invoke-static {}, Lxn0;->Ψ()V

    .line 140
    .line 141
    .line 142
    :goto_4
    invoke-static {v4, v3}, Lxn0;->ρ(Landroid/widget/Button;Landroid/widget/Button;)V

    .line 143
    .line 144
    .line 145
    sget-object p1, Ldd1;->α:Ljava/util/concurrent/atomic/AtomicReference;

    .line 146
    .line 147
    sget-object p1, Ljc1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 148
    .line 149
    invoke-static {}, Ljc1;->κ()Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    xor-int/lit8 p1, p1, 0x1

    .line 158
    .line 159
    invoke-static {p0, p1}, Ldd1;->ε(Landroid/app/Activity;Z)V

    .line 160
    .line 161
    .line 162
    :goto_5
    return-object v1

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
