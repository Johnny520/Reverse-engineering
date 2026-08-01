.class public final Lv0/c;
.super Lf0/b;
.source "SourceFile"


# static fields
.field public static final synthetic V:[LN0/i;


# instance fields
.field public final S:Lcom/lu/magic/ui/LifecycleAutoViewBinding;

.field public final T:LC/h;

.field public final U:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN0/i;

    .line 2
    .line 3
    invoke-direct {v0}, LN0/i;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LN0/m;->a:LN0/n;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    filled-new-array {v0}, [LN0/i;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lv0/c;->V:[LN0/i;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>()V
    .locals 7

    .line 1
    invoke-direct {p0}, Lf0/b;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/lu/magic/ui/LifecycleAutoViewBinding;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/lu/magic/ui/LifecycleAutoViewBinding;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lv0/c;->S:Lcom/lu/magic/ui/LifecycleAutoViewBinding;

    .line 10
    .line 11
    new-instance v0, Lorg/json/JSONObject;

    .line 12
    .line 13
    const-string v1, "eyJjb21taXQiOiIxMDQ4ZTRhNTY5YzgwZTE5MTExZGVjMDg5YmI0MzUzMTQ5NzA5MjY4IiwidGltZSI6MTc4NTUwMjQ0MDg5NSwiYnJhbmNoIjoiIn0="

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-static {v1, v2}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v3, "decode(...)"

    .line 21
    .line 22
    invoke-static {v1, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    sget-object v3, LU0/a;->a:Ljava/nio/charset/Charset;

    .line 26
    .line 27
    new-instance v4, Ljava/lang/String;

    .line 28
    .line 29
    invoke-direct {v4, v1, v3}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v4}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, LC/h;

    .line 36
    .line 37
    new-instance v3, Ljava/text/SimpleDateFormat;

    .line 38
    .line 39
    const-string v4, "yyyy/MM/dd HH:mm:ss"

    .line 40
    .line 41
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-direct {v3, v4, v5}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 46
    .line 47
    .line 48
    const-string v4, "time"

    .line 49
    .line 50
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    .line 51
    .line 52
    .line 53
    move-result-wide v4

    .line 54
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v3, v4}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const-string v4, "format(...)"

    .line 63
    .line 64
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    const-string v4, "branch"

    .line 68
    .line 69
    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const-string v5, "optString(...)"

    .line 74
    .line 75
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v6, "commit"

    .line 79
    .line 80
    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/16 v5, 0xb

    .line 88
    .line 89
    invoke-virtual {v0, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    const-string v2, "substring(...)"

    .line 94
    .line 95
    invoke-static {v0, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {v1, v3, v4, v0}, LC/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    iput-object v1, p0, Lv0/c;->T:LC/h;

    .line 102
    .line 103
    const v0, -0xd0d0e

    .line 104
    .line 105
    .line 106
    iput v0, p0, Lv0/c;->U:I

    .line 107
    .line 108
    return-void
.end method


# virtual methods
.method public final i(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .line 1
    const v0, 0x7f0c001d

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const p2, 0x7f090063

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, LD/h;->l(Landroid/view/View;I)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v4, v0

    .line 17
    check-cast v4, Landroid/widget/ImageView;

    .line 18
    .line 19
    if-eqz v4, :cond_3

    .line 20
    .line 21
    const p2, 0x7f09006c

    .line 22
    .line 23
    .line 24
    invoke-static {p1, p2}, LD/h;->l(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Landroid/widget/LinearLayout;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    const p2, 0x7f0900af

    .line 33
    .line 34
    .line 35
    invoke-static {p1, p2}, LD/h;->l(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    move-object v5, v0

    .line 40
    check-cast v5, Landroid/widget/TextView;

    .line 41
    .line 42
    if-eqz v5, :cond_3

    .line 43
    .line 44
    const p2, 0x7f0900b0

    .line 45
    .line 46
    .line 47
    invoke-static {p1, p2}, LD/h;->l(Landroid/view/View;I)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    move-object v6, v0

    .line 52
    check-cast v6, Landroid/widget/TextView;

    .line 53
    .line 54
    if-eqz v6, :cond_3

    .line 55
    .line 56
    const p2, 0x7f0900b1

    .line 57
    .line 58
    .line 59
    invoke-static {p1, p2}, LD/h;->l(Landroid/view/View;I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    move-object v7, v0

    .line 64
    check-cast v7, Landroid/widget/TextView;

    .line 65
    .line 66
    if-eqz v7, :cond_3

    .line 67
    .line 68
    const p2, 0x7f0900b7

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p2}, LD/h;->l(Landroid/view/View;I)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Landroid/widget/TextView;

    .line 76
    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    const p2, 0x7f0900b8

    .line 80
    .line 81
    .line 82
    invoke-static {p1, p2}, LD/h;->l(Landroid/view/View;I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    move-object v8, v0

    .line 87
    check-cast v8, Landroid/widget/TextView;

    .line 88
    .line 89
    if-eqz v8, :cond_3

    .line 90
    .line 91
    const p2, 0x7f0900b9

    .line 92
    .line 93
    .line 94
    invoke-static {p1, p2}, LD/h;->l(Landroid/view/View;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    move-object v9, v0

    .line 99
    check-cast v9, Landroid/widget/TextView;

    .line 100
    .line 101
    if-eqz v9, :cond_3

    .line 102
    .line 103
    const p2, 0x7f0900ba

    .line 104
    .line 105
    .line 106
    invoke-static {p1, p2}, LD/h;->l(Landroid/view/View;I)Landroid/view/View;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    move-object v10, v0

    .line 111
    check-cast v10, Landroid/widget/TextView;

    .line 112
    .line 113
    if-eqz v10, :cond_3

    .line 114
    .line 115
    new-instance v2, Li/q1;

    .line 116
    .line 117
    move-object v3, p1

    .line 118
    check-cast v3, Landroid/widget/LinearLayout;

    .line 119
    .line 120
    invoke-direct/range {v2 .. v10}, Li/q1;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 121
    .line 122
    .line 123
    sget-object p1, Lv0/c;->V:[LN0/i;

    .line 124
    .line 125
    aget-object p1, p1, v1

    .line 126
    .line 127
    iget-object p2, p0, Lv0/c;->S:Lcom/lu/magic/ui/LifecycleAutoViewBinding;

    .line 128
    .line 129
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    const-string v0, "property"

    .line 133
    .line 134
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    iget-object p1, p0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 138
    .line 139
    const-string v0, "Can\'t access the Fragment View\'s LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()"

    .line 140
    .line 141
    if-eqz p1, :cond_2

    .line 142
    .line 143
    invoke-virtual {p1}, Landroidx/fragment/app/H;->e()V

    .line 144
    .line 145
    .line 146
    iget-object p1, p1, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 147
    .line 148
    iget-object p1, p1, Landroidx/lifecycle/u;->c:Landroidx/lifecycle/n;

    .line 149
    .line 150
    sget-object v1, Landroidx/lifecycle/n;->a:Landroidx/lifecycle/n;

    .line 151
    .line 152
    if-eq p1, v1, :cond_1

    .line 153
    .line 154
    iget-object p1, p0, Landroidx/fragment/app/l;->N:Landroidx/fragment/app/H;

    .line 155
    .line 156
    if-eqz p1, :cond_0

    .line 157
    .line 158
    invoke-virtual {p1}, Landroidx/fragment/app/H;->e()V

    .line 159
    .line 160
    .line 161
    iget-object p1, p1, Landroidx/fragment/app/H;->c:Landroidx/lifecycle/u;

    .line 162
    .line 163
    invoke-virtual {p1, p2}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 164
    .line 165
    .line 166
    iput-object v2, p2, Lcom/lu/magic/ui/LifecycleAutoViewBinding;->a:Li/q1;

    .line 167
    .line 168
    const-string p1, "let(...)"

    .line 169
    .line 170
    invoke-static {v3, p1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    return-object v3

    .line 174
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 175
    .line 176
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw p1

    .line 180
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 181
    .line 182
    const-string p2, "Can\'t set ViewBinding after onDestroyView!"

    .line 183
    .line 184
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    throw p1

    .line 188
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 189
    .line 190
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    throw p1

    .line 194
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object p1

    .line 202
    new-instance p2, Ljava/lang/NullPointerException;

    .line 203
    .line 204
    const-string v0, "Missing required view with ID: "

    .line 205
    .line 206
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p2
.end method

.method public final j(Landroid/view/View;)V
    .locals 3

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    move-object p1, v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object p1, p1, Landroidx/fragment/app/o;->d:Le/i;

    .line 14
    .line 15
    :goto_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    move-object v0, p1

    .line 18
    :cond_1
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-virtual {v0}, Le/i;->j()Le/E;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-boolean v0, p1, Le/E;->E:Z

    .line 27
    .line 28
    if-nez v0, :cond_2

    .line 29
    .line 30
    const/4 v0, 0x1

    .line 31
    iput-boolean v0, p1, Le/E;->E:Z

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    invoke-virtual {p1, v0}, Le/E;->V(Z)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/l;->m()Le/i;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget v0, p0, Lv0/c;->U:I

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroidx/fragment/app/l;->m()Le/i;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const-string v0, "getDecorView(...)"

    .line 63
    .line 64
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    or-int/lit16 v0, v0, 0x2000

    .line 72
    .line 73
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 74
    .line 75
    .line 76
    invoke-static {}, Lcom/lu/wxmask/SelfHook;->getInstance()Lcom/lu/wxmask/SelfHook;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Lcom/lu/wxmask/SelfHook;->isModuleEnable()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    invoke-virtual {p0}, Lv0/c;->p()Li/q1;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object p1, p1, Li/q1;->b:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Landroid/widget/ImageView;

    .line 93
    .line 94
    const v0, 0x7f08005f

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lv0/c;->p()Li/q1;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    iget-object p1, p1, Li/q1;->f:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p1, Landroid/widget/TextView;

    .line 107
    .line 108
    const-string v0, "\u6a21\u5757\u5df2\u6fc0\u6d3b"

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {p0}, Lv0/c;->p()Li/q1;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    iget-object p1, p1, Li/q1;->e:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast p1, Landroid/widget/TextView;

    .line 120
    .line 121
    const-string v0, "LSPosed \u5df2\u6b63\u786e\u52a0\u8f7d\u6a21\u5757"

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-virtual {p0}, Lv0/c;->p()Li/q1;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    iget-object p1, p1, Li/q1;->b:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast p1, Landroid/widget/ImageView;

    .line 134
    .line 135
    const v0, 0x7f080062

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0}, Lv0/c;->p()Li/q1;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget-object p1, p1, Li/q1;->f:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast p1, Landroid/widget/TextView;

    .line 148
    .line 149
    const-string v0, "\u6a21\u5757\u672a\u6fc0\u6d3b"

    .line 150
    .line 151
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lv0/c;->p()Li/q1;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    iget-object p1, p1, Li/q1;->e:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p1, Landroid/widget/TextView;

    .line 161
    .line 162
    const-string v0, "\u8bf7\u5728 LSPosed \u4e2d\u542f\u7528\u6a21\u5757\u5e76\u91cd\u542f\u5fae\u4fe1"

    .line 163
    .line 164
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 165
    .line 166
    .line 167
    :goto_1
    invoke-virtual {p0}, Lv0/c;->p()Li/q1;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    iget-object p1, p1, Li/q1;->g:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast p1, Landroid/widget/TextView;

    .line 174
    .line 175
    const-string v0, "\u6a21\u5757\u7248\u672c\uff1av3.0.2d-release"

    .line 176
    .line 177
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0}, Lv0/c;->p()Li/q1;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    iget-object v0, p0, Lv0/c;->T:LC/h;

    .line 185
    .line 186
    iget-object v1, v0, LC/h;->c:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v1, Ljava/lang/String;

    .line 189
    .line 190
    const-string v2, "\u4ee3\u7801\u5206\u652f\uff1a"

    .line 191
    .line 192
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    iget-object p1, p1, Li/q1;->a:Landroid/view/View;

    .line 197
    .line 198
    check-cast p1, Landroid/widget/TextView;

    .line 199
    .line 200
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lv0/c;->p()Li/q1;

    .line 204
    .line 205
    .line 206
    move-result-object p1

    .line 207
    iget-object v1, v0, LC/h;->d:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v1, Ljava/lang/String;

    .line 210
    .line 211
    const-string v2, "\u63d0\u4ea4\u54c8\u5e0c\uff1a"

    .line 212
    .line 213
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    iget-object p1, p1, Li/q1;->d:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast p1, Landroid/widget/TextView;

    .line 220
    .line 221
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0}, Lv0/c;->p()Li/q1;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iget-object v0, v0, LC/h;->b:Ljava/lang/Object;

    .line 229
    .line 230
    check-cast v0, Ljava/lang/String;

    .line 231
    .line 232
    const-string v1, "\u6784\u5efa\u65f6\u95f4\uff1a"

    .line 233
    .line 234
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    iget-object p1, p1, Li/q1;->c:Ljava/lang/Object;

    .line 239
    .line 240
    check-cast p1, Landroid/widget/TextView;

    .line 241
    .line 242
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 243
    .line 244
    .line 245
    return-void
.end method

.method public final p()Li/q1;
    .locals 3

    .line 1
    sget-object v0, Lv0/c;->V:[LN0/i;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-object v0, v0, v1

    .line 5
    .line 6
    iget-object v1, p0, Lv0/c;->S:Lcom/lu/magic/ui/LifecycleAutoViewBinding;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v2, "property"

    .line 12
    .line 13
    invoke-static {v0, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v1, Lcom/lu/magic/ui/LifecycleAutoViewBinding;->a:Li/q1;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 22
    .line 23
    const-string v1, "Can\'t access ViewBinding before onCreateView and after onDestroyView!"

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw v0
.end method
