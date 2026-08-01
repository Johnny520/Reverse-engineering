.class public final Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;
.super L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏哲兰;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Ltop/suzhelan/qstory/hook/api/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u696a\u5b50/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u54f2\u5170\u82cf\u5b50\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;",
        "<init>",
        "()V",
        "app_publishRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# static fields
.field public static 飘花落叶言子楪哲兰苏世:I


# instance fields
.field public 飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$Unhook;

.field public final 飘花落叶言子楪哲苏兰世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    const-wide v1, -0x36a5930b051405a7L    # -2.3572434578888855E45

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 19
    .line 20
    return-void
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    :try_start_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 2
    .line 3
    const-class v0, Landroid/view/View;

    .line 4
    .line 5
    sget v1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲兰世:I

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iput-object v0, v1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Class;

    .line 16
    .line 17
    invoke-virtual {v1, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/view/View;

    .line 22
    .line 23
    const-wide v1, -0x36a50a19051405a7L    # -2.4049619347669426E45

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-static {v2}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    iput-object v1, v2, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:Ljava/lang/Class;

    .line 45
    .line 46
    invoke-virtual {v2, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    if-nez v0, :cond_0

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-static {v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-wide v2, -0x36a50923051405a7L    # -2.4052967726159928E45

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    iget-object v3, v1, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;

    .line 73
    .line 74
    iput-object v2, v3, Landroidx/compose/runtime/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 75
    .line 76
    const/4 v2, 0x0

    .line 77
    new-array v2, v2, [Ljava/lang/Object;

    .line 78
    .line 79
    invoke-virtual {v1, p1, v2}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-wide v1, -0x36a50910051405a7L    # -2.4053226340758788E45

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    const-class v2, Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-static {v2, v1, p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const-wide v1, -0x36a57fc1051405a7L    # -2.363964715200308E45

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_2

    .line 120
    .line 121
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    const-wide v2, -0x36a57fb7051405a7L    # -2.3639783264949847E45

    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    const-wide v2, -0x36a50919051405a7L    # -2.4053103839106696E45

    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 146
    .line 147
    invoke-static {v3, v2, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    check-cast v1, Ljava/lang/Integer;

    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 154
    .line 155
    .line 156
    move-result v1

    .line 157
    const/4 v2, 0x2

    .line 158
    if-gt v1, v2, :cond_1

    .line 159
    .line 160
    check-cast v0, Landroid/view/ViewGroup;

    .line 161
    .line 162
    invoke-virtual {p0, v0}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Landroid/view/ViewGroup;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 163
    .line 164
    .line 165
    return-void

    .line 166
    :catch_0
    move-exception p1

    .line 167
    goto :goto_1

    .line 168
    :cond_2
    :goto_0
    return-void

    .line 169
    :goto_1
    invoke-virtual {p0}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p0, p1}, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 174
    .line 175
    .line 176
    return-void
.end method


# virtual methods
.method public final loadHook(Ljava/lang/ClassLoader;)V
    .locals 6

    .line 1
    const-wide v0, -0x36a57f99051405a7L    # -2.3640191603790152E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const-wide v0, -0x36a52314051405a7L    # -2.396257511821105E45

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 22
    .line 23
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    invoke-virtual {v1, v0, p1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, Ljava/lang/Boolean;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 v0, 0x0

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    const-wide p0, -0x36a52317051405a7L    # -2.396253428432702E45

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v1, p1, p0}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-wide v0, -0x36a592e4051405a7L    # -2.3572965419381252E45

    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    check-cast p0, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    sput p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    sget p1, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲:I

    .line 76
    .line 77
    const/16 v1, 0x3002

    .line 78
    .line 79
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    const-wide v3, -0x36a524e8051405a7L    # -2.395620503230229E45

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    if-lt p1, v1, :cond_1

    .line 87
    .line 88
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    const-wide v0, -0x36a592d0051405a7L    # -2.357323764527479E45

    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iput-object v0, p1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 106
    .line 107
    const-wide v0, -0x36a592c6051405a7L    # -2.3573373758221557E45

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {p1, v0}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 125
    .line 126
    .line 127
    iput-object v2, p1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 128
    .line 129
    invoke-virtual {p1}, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    check-cast p1, Ljava/lang/reflect/Method;

    .line 134
    .line 135
    new-instance v0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏哲兰;

    .line 136
    .line 137
    const/4 v1, 0x1

    .line 138
    invoke-direct {v0, p0, v1}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏哲兰;-><init>(Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;I)V

    .line 139
    .line 140
    .line 141
    invoke-static {p1, v0}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_1
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-static {p1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    const-class v1, Ljava/util/List;

    .line 158
    .line 159
    const-class v3, Landroid/os/Bundle;

    .line 160
    .line 161
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 162
    .line 163
    const-class v5, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏世哲兰;

    .line 164
    .line 165
    filled-new-array {v4, v5, v1, v3}, [Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    invoke-virtual {p1, v1}, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰世哲([Ljava/lang/Class;)V

    .line 170
    .line 171
    .line 172
    iput-object v2, p1, L飘花落叶言苏楪哲兰子世/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 173
    .line 174
    invoke-virtual {p1}, L飘花落叶言苏楪哲子世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏()Ljava/lang/reflect/Member;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    const-wide v1, -0x36a592ed051405a7L    # -2.357284291772916E45

    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    check-cast p1, Ljava/lang/reflect/Method;

    .line 190
    .line 191
    new-instance v1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏哲兰;

    .line 192
    .line 193
    invoke-direct {v1, p0, v0}, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏哲兰;-><init>(Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;I)V

    .line 194
    .line 195
    .line 196
    invoke-static {p1, v1}, Lde/robv/android/xposed/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 201
    .line 202
    return-void
.end method

.method public final run()V
    .locals 1

    .line 1
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 7
    .line 8
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Lcom/alibaba/fastjson2/JSONObject;

    .line 12
    .line 13
    invoke-virtual {p0}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(Landroid/view/ViewGroup;)V
    .locals 9

    .line 1
    const-wide v0, -0x36a57a2c051405a7L    # -2.365909769209628E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    move v2, v1

    .line 15
    :goto_0
    if-ge v2, v0, :cond_3

    .line 16
    .line 17
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-wide v5, -0x36a52312051405a7L    # -2.3962602340800403E45

    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    const-wide v4, -0x36a52314051405a7L    # -2.396257511821105E45

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    invoke-static {v4, v5}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 58
    .line 59
    iget-object v4, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 60
    .line 61
    invoke-virtual {v4, v2, v0}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-wide v5, -0x36a52317051405a7L    # -2.396253428432702E45

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {v4, p1, v0}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    const-wide v7, -0x36a522cd051405a7L    # -2.3963541520133105E45

    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    invoke-static {v7, v8}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    sget-object v0, L飘花落叶言世哲楪子兰苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v4, v0, p1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 98
    .line 99
    if-eqz p1, :cond_1

    .line 100
    .line 101
    invoke-static {v5, v6}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {v4, v0, p1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    const-wide v0, -0x36a592e4051405a7L    # -2.3572965419381252E45

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    check-cast p1, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    sput p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 131
    .line 132
    if-nez p1, :cond_0

    .line 133
    .line 134
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    sput p1, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 139
    .line 140
    :cond_0
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/api/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 141
    .line 142
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$Unhook;->unhook()V

    .line 146
    .line 147
    .line 148
    :cond_1
    const-wide p0, -0x36a592a2051405a7L    # -2.3573863764829923E45

    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_3
    return-void
.end method
