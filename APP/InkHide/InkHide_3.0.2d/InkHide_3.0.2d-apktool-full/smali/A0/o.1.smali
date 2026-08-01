.class public final synthetic LA0/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ljava/util/ArrayList;

.field public final synthetic b:Landroid/widget/TextView;

.field public final synthetic c:Landroid/widget/LinearLayout;

.field public final synthetic d:Landroid/app/Activity;

.field public final synthetic e:Landroid/app/AlertDialog;


# direct methods
.method public synthetic constructor <init>(Ljava/util/ArrayList;Landroid/widget/TextView;Landroid/widget/LinearLayout;Landroid/app/Activity;Landroid/app/AlertDialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/o;->a:Ljava/util/ArrayList;

    iput-object p2, p0, LA0/o;->b:Landroid/widget/TextView;

    iput-object p3, p0, LA0/o;->c:Landroid/widget/LinearLayout;

    iput-object p4, p0, LA0/o;->d:Landroid/app/Activity;

    iput-object p5, p0, LA0/o;->e:Landroid/app/AlertDialog;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 12

    .line 1
    new-instance v1, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v6, p0, LA0/o;->a:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v8

    .line 12
    const/4 v9, 0x0

    .line 13
    move v5, v9

    .line 14
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    iget-object v10, p0, LA0/o;->d:Landroid/app/Activity;

    .line 19
    .line 20
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    add-int/lit8 v11, v5, 0x1

    .line 27
    .line 28
    if-ltz v5, :cond_1

    .line 29
    .line 30
    move-object v4, v0

    .line 31
    check-cast v4, LA0/u;

    .line 32
    .line 33
    new-instance v0, Landroid/os/Handler;

    .line 34
    .line 35
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 40
    .line 41
    .line 42
    new-instance v2, LA0/p;

    .line 43
    .line 44
    iget-object v3, p0, LA0/o;->b:Landroid/widget/TextView;

    .line 45
    .line 46
    iget-object v7, p0, LA0/o;->c:Landroid/widget/LinearLayout;

    .line 47
    .line 48
    invoke-direct/range {v2 .. v7}, LA0/p;-><init>(Landroid/widget/TextView;LA0/u;ILjava/util/ArrayList;Landroid/widget/LinearLayout;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 52
    .line 53
    .line 54
    :try_start_0
    iget-object v0, v4, LA0/u;->e:LM0/l;

    .line 55
    .line 56
    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "getApplicationContext(...)"

    .line 61
    .line 62
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v2}, LM0/l;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, LA0/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :catchall_0
    move-exception v0

    .line 73
    new-instance v2, LE0/d;

    .line 74
    .line 75
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    move-object v0, v2

    .line 79
    :goto_1
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    if-nez v2, :cond_0

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_0
    iget-object v0, v4, LA0/u;->a:Ljava/lang/String;

    .line 87
    .line 88
    const-string v3, "\u7edf\u4e00\u626b\u63cf\u5931\u8d25"

    .line 89
    .line 90
    filled-new-array {v3, v0, v2}, [Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    new-instance v0, LA0/t;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    new-instance v3, Ljava/lang/StringBuilder;

    .line 108
    .line 109
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 110
    .line 111
    .line 112
    iget-object v10, v4, LA0/u;->b:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    const-string v10, " \u626b\u63cf\u5f02\u5e38\uff1a"

    .line 118
    .line 119
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    const/4 v3, 0x1

    .line 130
    invoke-direct {v0, v9, v2, v3}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 131
    .line 132
    .line 133
    :goto_2
    check-cast v0, LA0/t;

    .line 134
    .line 135
    new-instance v2, LE0/c;

    .line 136
    .line 137
    invoke-direct {v2, v4, v0}, LE0/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    new-instance v0, Landroid/os/Handler;

    .line 144
    .line 145
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 150
    .line 151
    .line 152
    new-instance v2, LA0/q;

    .line 153
    .line 154
    const/4 v3, 0x0

    .line 155
    invoke-direct {v2, v7, v5, v3}, LA0/q;-><init>(Landroid/view/View;II)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 159
    .line 160
    .line 161
    move v5, v11

    .line 162
    goto/16 :goto_0

    .line 163
    .line 164
    :cond_1
    invoke-static {}, LF0/l;->b0()V

    .line 165
    .line 166
    .line 167
    const/4 v0, 0x0

    .line 168
    throw v0

    .line 169
    :cond_2
    new-instance v0, Landroid/os/Handler;

    .line 170
    .line 171
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-direct {v0, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 176
    .line 177
    .line 178
    new-instance v2, LA0/r;

    .line 179
    .line 180
    iget-object v3, p0, LA0/o;->e:Landroid/app/AlertDialog;

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    invoke-direct {v2, v3, v10, v1, v4}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 187
    .line 188
    .line 189
    return-void
.end method
