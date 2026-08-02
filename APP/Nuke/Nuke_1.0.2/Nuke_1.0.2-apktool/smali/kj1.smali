.class public Lkj1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Loi;
.implements Lys2;
.implements Lhi2;
.implements Lh01;
.implements Laa3;


# static fields
.field public static final m:Li51;

.field public static final n:Lb83;


# instance fields
.field public final synthetic h:I

.field public i:Ljava/lang/Object;

.field public j:Ljava/lang/Object;

.field public k:Ljava/lang/Object;

.field public l:Ljava/lang/Object;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li51;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Li51;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lkj1;->m:Li51;

    .line 8
    .line 9
    new-instance v0, Lb83;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Lb83;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lkj1;->n:Lb83;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(I)V
    .locals 11

    .line 1
    iput p1, p0, Lkj1;->h:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance p1, Ljava/util/HashMap;

    .line 17
    .line 18
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lkj1;->k:Ljava/lang/Object;

    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_1
    sget-object p1, Lte;->h:Luc3;

    .line 25
    .line 26
    new-instance v0, Lhn1;

    .line 27
    .line 28
    const/4 v1, 0x2

    .line 29
    invoke-direct {v0, v1}, Lhn1;-><init>(I)V

    .line 30
    .line 31
    .line 32
    sget-object v1, Lfq1;->o:Lfq1;

    .line 33
    .line 34
    new-instance v2, Lr6;

    .line 35
    .line 36
    sget-object v4, Lpp1;->a:Lpp1;

    .line 37
    .line 38
    const/4 v9, 0x0

    .line 39
    const/4 v10, 0x4

    .line 40
    const/4 v3, 0x0

    .line 41
    const-class v5, Lpp1;

    .line 42
    .line 43
    const-string v6, "isSecurityMode"

    .line 44
    .line 45
    const-string v7, "isSecurityMode()Z"

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    invoke-direct/range {v2 .. v10}, Lr6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object v1, p0, Lkj1;->k:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v2, p0, Lkj1;->l:Ljava/lang/Object;

    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance p1, Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 69
    .line 70
    .line 71
    iput-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    .line 72
    .line 73
    new-instance p1, Ljava/util/ArrayDeque;

    .line 74
    .line 75
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, Lkj1;->k:Ljava/lang/Object;

    .line 79
    .line 80
    new-instance p1, Ljava/util/ArrayDeque;

    .line 81
    .line 82
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 83
    .line 84
    .line 85
    iput-object p1, p0, Lkj1;->l:Ljava/lang/Object;

    .line 86
    .line 87
    return-void

    .line 88
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :pswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 96
    .line 97
    const/4 v0, 0x0

    .line 98
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 99
    .line 100
    .line 101
    iput-object p1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 102
    .line 103
    new-instance p1, Ljava/util/concurrent/CountDownLatch;

    .line 104
    .line 105
    const/4 v0, 0x1

    .line 106
    invoke-direct {p1, v0}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    .line 107
    .line 108
    .line 109
    iput-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    .line 110
    .line 111
    const-string p1, "PublicSuffixDatabase.list"

    .line 112
    .line 113
    iput-object p1, p0, Lkj1;->l:Ljava/lang/Object;

    .line 114
    .line 115
    return-void

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 133
    iput p1, p0, Lkj1;->h:I

    iput-object p2, p0, Lkj1;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lb5;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lkj1;->h:I

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 143
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 144
    iput-object p1, p0, Lkj1;->l:Ljava/lang/Object;

    .line 145
    sget-object p1, Lkj1;->m:Li51;

    iput-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lb7;Lti;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lkj1;->h:I

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    iput-object p1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 152
    iput-object p2, p0, Lkj1;->j:Ljava/lang/Object;

    .line 153
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-class v0, Landroid/view/autofill/AutofillManager;

    invoke-virtual {p2, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/view/autofill/AutofillManager;

    if-eqz p2, :cond_1

    iput-object p2, p0, Lkj1;->k:Ljava/lang/Object;

    const/4 p2, 0x1

    .line 154
    invoke-virtual {p1, p2}, Landroid/view/View;->setImportantForAutofill(I)V

    .line 155
    invoke-virtual {p1}, Landroid/view/View;->getAutofillId()Landroid/view/autofill/AutofillId;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 156
    iput-object p1, p0, Lkj1;->l:Ljava/lang/Object;

    return-void

    .line 157
    :cond_0
    const-string p0, "Required value was null."

    .line 158
    invoke-static {p0}, Lvi0;->e(Ljava/lang/String;)Lpv;

    move-result-object p0

    .line 159
    throw p0

    .line 160
    :cond_1
    const-string p0, "Autofill service could not be located."

    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lbb2;Ldq1;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lkj1;->h:I

    .line 171
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj1;->l:Ljava/lang/Object;

    .line 172
    iput-object p2, p0, Lkj1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldf2;I)V
    .locals 10

    const/16 v0, 0xe

    iput v0, p0, Lkj1;->h:I

    .line 117
    new-instance v0, Leg2;

    .line 118
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    .line 119
    new-instance v1, Ldf2;

    const/4 v8, 0x0

    const/16 v9, 0x3ff

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Ldf2;-><init>(Lb5;Lhh1;Lhq1;Lb5;Lhi2;Lsz0;Lb5;I)V

    move-object p1, v1

    .line 120
    :cond_0
    sget-object p2, Lo90;->a:Lc60;

    .line 121
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    iput-object v0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 124
    iput-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    .line 125
    iput-object p2, p0, Lkj1;->k:Ljava/lang/Object;

    .line 126
    new-instance p1, Ldq1;

    invoke-direct {p1, v0}, Ldq1;-><init>(Leg2;)V

    iput-object p1, p0, Lkj1;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;I)V
    .locals 0

    iput p2, p0, Lkj1;->h:I

    packed-switch p2, :pswitch_data_0

    .line 127
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 128
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    .line 129
    new-instance p1, Lvi1;

    const/16 p2, 0x1d

    invoke-direct {p1, p2}, Lvi1;-><init>(I)V

    invoke-static {p1}, Lse;->o(Lin0;)Lv31;

    move-result-object p1

    iput-object p1, p0, Lkj1;->k:Ljava/lang/Object;

    return-void

    .line 130
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 131
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    .line 132
    new-instance p1, Leq1;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Leq1;-><init>(I)V

    invoke-static {p1}, Lse;->o(Lin0;)Lv31;

    move-result-object p1

    iput-object p1, p0, Lkj1;->k:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/net/Socket;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, Lkj1;->h:I

    .line 146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 147
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    .line 148
    new-instance p1, Lg60;

    invoke-direct {p1, p0}, Lg60;-><init>(Lkj1;)V

    iput-object p1, p0, Lkj1;->k:Ljava/lang/Object;

    .line 149
    new-instance p1, Lf60;

    invoke-direct {p1, p0}, Lf60;-><init>(Lkj1;)V

    iput-object p1, p0, Lkj1;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ll23;Ltd1;Landroid/content/ContentResolver;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lkj1;->h:I

    .line 164
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 165
    iput-object p2, p0, Lkj1;->j:Ljava/lang/Object;

    .line 166
    iput-object p3, p0, Lkj1;->k:Ljava/lang/Object;

    .line 167
    iput-object p4, p0, Lkj1;->l:Ljava/lang/Object;

    .line 168
    iput-object p1, p0, Lkj1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lkj1;->h:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkj1;->i:Ljava/lang/Object;

    iput-object p2, p0, Lkj1;->j:Ljava/lang/Object;

    .line 170
    new-instance p1, Lcf1;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0}, Lcf1;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lkj1;->k:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkb3;Lib3;Ls20;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, Lkj1;->h:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 135
    iput-object p1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 136
    iput-object p2, p0, Lkj1;->j:Ljava/lang/Object;

    .line 137
    iput-object p3, p0, Lkj1;->k:Ljava/lang/Object;

    .line 138
    new-instance p1, Lix2;

    const/4 p2, 0x0

    .line 139
    invoke-direct {p1, p2}, Lix2;-><init>(I)V

    .line 140
    iput-object p1, p0, Lkj1;->l:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lsj0;)V
    .locals 3

    const/16 v0, 0xf

    iput v0, p0, Lkj1;->h:I

    .line 173
    new-instance v1, Lhh1;

    const/16 v2, 0x1a

    invoke-direct {v1, v2, p1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 174
    invoke-direct {p0, v0, v1}, Lkj1;-><init>(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lu12;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lkj1;->h:I

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    iput-object p1, p0, Lkj1;->l:Ljava/lang/Object;

    .line 163
    sget-object p1, Lt12;->h:Lt12;

    iput-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    return-void
.end method

.method public static H(Lkj1;Lp52;Ls52;Lp52;I)V
    .locals 10

    .line 1
    and-int/lit8 v0, p4, 0x1

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object p1, v1

    .line 7
    :cond_0
    and-int/lit8 v0, p4, 0x2

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move-object p2, v1

    .line 12
    :cond_1
    and-int/lit8 p4, p4, 0x4

    .line 13
    .line 14
    if-eqz p4, :cond_2

    .line 15
    .line 16
    move-object p3, v1

    .line 17
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object p4, Lwg3;->a:Ljava/util/TimeZone;

    .line 21
    .line 22
    invoke-virtual {p0}, Lkj1;->p()Ljava/util/concurrent/ExecutorService;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    check-cast p4, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 27
    .line 28
    invoke-virtual {p4}, Ljava/util/concurrent/ThreadPoolExecutor;->isShutdown()Z

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    monitor-enter p0

    .line 33
    if-eqz p2, :cond_4

    .line 34
    .line 35
    :try_start_0
    iget-object v0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, Ljava/util/ArrayDeque;

    .line 38
    .line 39
    invoke-virtual {v0, p2}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const-string p1, "Call wasn\'t in-flight!"

    .line 47
    .line 48
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 49
    .line 50
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p2

    .line 54
    :catchall_0
    move-exception p1

    .line 55
    goto/16 :goto_8

    .line 56
    .line 57
    :cond_4
    :goto_0
    if-eqz p3, :cond_6

    .line 58
    .line 59
    iget-object v0, p3, Lp52;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Ljava/util/ArrayDeque;

    .line 67
    .line 68
    invoke-virtual {v0, p3}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_5

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_5
    const-string p1, "Call wasn\'t in-flight!"

    .line 76
    .line 77
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 78
    .line 79
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p2

    .line 83
    :cond_6
    :goto_1
    if-eqz p1, :cond_7

    .line 84
    .line 85
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v0, Ljava/util/ArrayDeque;

    .line 88
    .line 89
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    iget-object v0, p1, Lp52;->j:Ls52;

    .line 93
    .line 94
    iget-object v0, v0, Ls52;->i:Lk82;

    .line 95
    .line 96
    iget-object v0, v0, Lk82;->a:Lyw0;

    .line 97
    .line 98
    iget-object v0, v0, Lyw0;->d:Ljava/lang/String;

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Lkj1;->u(Ljava/lang/String;)Lp52;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    if-eqz v0, :cond_7

    .line 105
    .line 106
    iget-object v0, v0, Lp52;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 107
    .line 108
    iput-object v0, p1, Lp52;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 109
    .line 110
    :cond_7
    if-nez p2, :cond_8

    .line 111
    .line 112
    if-eqz p3, :cond_a

    .line 113
    .line 114
    :cond_8
    if-nez p4, :cond_9

    .line 115
    .line 116
    iget-object p2, p0, Lkj1;->k:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast p2, Ljava/util/ArrayDeque;

    .line 119
    .line 120
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result p2

    .line 124
    if-eqz p2, :cond_a

    .line 125
    .line 126
    :cond_9
    iget-object p2, p0, Lkj1;->l:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p2, Ljava/util/ArrayDeque;

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    :cond_a
    const/16 p2, 0xd

    .line 134
    .line 135
    if-eqz p4, :cond_b

    .line 136
    .line 137
    iget-object p3, p0, Lkj1;->j:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast p3, Ljava/util/ArrayDeque;

    .line 140
    .line 141
    invoke-static {p3}, Ldu;->F0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 142
    .line 143
    .line 144
    move-result-object p3

    .line 145
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v0, Ljava/util/ArrayDeque;

    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->clear()V

    .line 150
    .line 151
    .line 152
    new-instance v0, Ln4;

    .line 153
    .line 154
    invoke-direct {v0, p2, p3}, Ln4;-><init>(ILjava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_b
    new-instance p3, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 161
    .line 162
    .line 163
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Ljava/util/ArrayDeque;

    .line 166
    .line 167
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    :cond_c
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    if-eqz v2, :cond_d

    .line 179
    .line 180
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    check-cast v2, Lp52;

    .line 185
    .line 186
    iget-object v3, p0, Lkj1;->k:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast v3, Ljava/util/ArrayDeque;

    .line 189
    .line 190
    invoke-virtual {v3}, Ljava/util/ArrayDeque;->size()I

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    const/16 v4, 0x40

    .line 195
    .line 196
    if-ge v3, v4, :cond_d

    .line 197
    .line 198
    iget-object v3, v2, Lp52;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 199
    .line 200
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    const/4 v4, 0x5

    .line 205
    if-ge v3, v4, :cond_c

    .line 206
    .line 207
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 208
    .line 209
    .line 210
    iget-object v3, v2, Lp52;->i:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 211
    .line 212
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 213
    .line 214
    .line 215
    invoke-virtual {p3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    iget-object v3, p0, Lkj1;->k:Ljava/lang/Object;

    .line 219
    .line 220
    check-cast v3, Ljava/util/ArrayDeque;

    .line 221
    .line 222
    invoke-virtual {v3, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_d
    new-instance v0, Ln4;

    .line 227
    .line 228
    invoke-direct {v0, p2, p3}, Ln4;-><init>(ILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 229
    .line 230
    .line 231
    :goto_3
    monitor-exit p0

    .line 232
    iget-object p2, v0, Ln4;->i:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast p2, Ljava/util/List;

    .line 235
    .line 236
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 237
    .line 238
    .line 239
    move-result p2

    .line 240
    const/4 p3, 0x1

    .line 241
    const/4 v2, 0x0

    .line 242
    move v3, v2

    .line 243
    :goto_4
    if-ge v3, p2, :cond_10

    .line 244
    .line 245
    iget-object v4, v0, Ln4;->i:Ljava/lang/Object;

    .line 246
    .line 247
    check-cast v4, Ljava/util/List;

    .line 248
    .line 249
    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v4

    .line 253
    check-cast v4, Lp52;

    .line 254
    .line 255
    if-ne v4, p1, :cond_e

    .line 256
    .line 257
    move p3, v2

    .line 258
    goto :goto_5

    .line 259
    :cond_e
    iget-object v5, v4, Lp52;->j:Ls52;

    .line 260
    .line 261
    iget-object v5, v5, Ls52;->k:Lkg0;

    .line 262
    .line 263
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    :goto_5
    if-eqz p4, :cond_f

    .line 267
    .line 268
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    new-instance v5, Ljava/io/InterruptedIOException;

    .line 272
    .line 273
    const-string v6, "executor rejected"

    .line 274
    .line 275
    invoke-direct {v5, v6}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 279
    .line 280
    .line 281
    iget-object v6, v4, Lp52;->j:Ls52;

    .line 282
    .line 283
    invoke-virtual {v6, v5}, Ls52;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 284
    .line 285
    .line 286
    iget-object v4, v4, Lp52;->h:Ldp;

    .line 287
    .line 288
    invoke-interface {v4, v6, v5}, Ldp;->j(Ls52;Ljava/io/IOException;)V

    .line 289
    .line 290
    .line 291
    goto :goto_6

    .line 292
    :cond_f
    invoke-virtual {p0}, Lkj1;->p()Ljava/util/concurrent/ExecutorService;

    .line 293
    .line 294
    .line 295
    move-result-object v5

    .line 296
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    .line 298
    .line 299
    iget-object v6, v4, Lp52;->j:Ls52;

    .line 300
    .line 301
    iget-object v7, v6, Ls52;->h:Let1;

    .line 302
    .line 303
    iget-object v7, v7, Let1;->a:Lkj1;

    .line 304
    .line 305
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    const/4 v7, 0x3

    .line 309
    :try_start_1
    check-cast v5, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 310
    .line 311
    invoke-virtual {v5, v4}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V
    :try_end_1
    .catch Ljava/util/concurrent/RejectedExecutionException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 312
    .line 313
    .line 314
    goto :goto_6

    .line 315
    :catchall_1
    move-exception p0

    .line 316
    goto :goto_7

    .line 317
    :catch_0
    move-exception v5

    .line 318
    :try_start_2
    new-instance v8, Ljava/io/InterruptedIOException;

    .line 319
    .line 320
    const-string v9, "executor rejected"

    .line 321
    .line 322
    invoke-direct {v8, v9}, Ljava/io/InterruptedIOException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v8, v5}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 326
    .line 327
    .line 328
    iget-object v5, v4, Lp52;->j:Ls52;

    .line 329
    .line 330
    invoke-virtual {v5, v8}, Ls52;->l(Ljava/io/IOException;)Ljava/io/IOException;

    .line 331
    .line 332
    .line 333
    iget-object v9, v4, Lp52;->h:Ldp;

    .line 334
    .line 335
    invoke-interface {v9, v5, v8}, Ldp;->j(Ls52;Ljava/io/IOException;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 336
    .line 337
    .line 338
    iget-object v5, v6, Ls52;->h:Let1;

    .line 339
    .line 340
    iget-object v5, v5, Let1;->a:Lkj1;

    .line 341
    .line 342
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    invoke-static {v5, v1, v1, v4, v7}, Lkj1;->H(Lkj1;Lp52;Ls52;Lp52;I)V

    .line 346
    .line 347
    .line 348
    :goto_6
    add-int/lit8 v3, v3, 0x1

    .line 349
    .line 350
    goto :goto_4

    .line 351
    :goto_7
    iget-object p1, v6, Ls52;->h:Let1;

    .line 352
    .line 353
    iget-object p1, p1, Let1;->a:Lkj1;

    .line 354
    .line 355
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 356
    .line 357
    .line 358
    invoke-static {p1, v1, v1, v4, v7}, Lkj1;->H(Lkj1;Lp52;Ls52;Lp52;I)V

    .line 359
    .line 360
    .line 361
    throw p0

    .line 362
    :cond_10
    if-eqz p3, :cond_11

    .line 363
    .line 364
    if-eqz p1, :cond_11

    .line 365
    .line 366
    iget-object p0, p1, Lp52;->j:Ls52;

    .line 367
    .line 368
    iget-object p0, p0, Ls52;->k:Lkg0;

    .line 369
    .line 370
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    :cond_11
    return-void

    .line 374
    :goto_8
    monitor-exit p0

    .line 375
    throw p1
.end method


# virtual methods
.method public A(JLnd;Lnd;)Lnd;
    .locals 14

    .line 1
    iget-object v0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnd;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Lnd;->c()Lnd;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lnd;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "velocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_5

    .line 21
    .line 22
    invoke-virtual {v0}, Lnd;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Lkj1;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lnd;

    .line 30
    .line 31
    if-ge v3, v0, :cond_3

    .line 32
    .line 33
    if-eqz v4, :cond_2

    .line 34
    .line 35
    iget-object v5, p0, Lkj1;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lhh1;

    .line 38
    .line 39
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-object/from16 v6, p4

    .line 43
    .line 44
    invoke-virtual {v6, v3}, Lnd;->a(I)F

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    const-wide/32 v8, 0xf4240

    .line 49
    .line 50
    .line 51
    div-long v8, p1, v8

    .line 52
    .line 53
    iget-object v5, v5, Lhh1;->i:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Loj0;

    .line 56
    .line 57
    invoke-virtual {v5, v7}, Loj0;->a(F)Lnj0;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    iget-wide v10, v5, Lnj0;->c:J

    .line 62
    .line 63
    const-wide/16 v12, 0x0

    .line 64
    .line 65
    cmp-long v7, v10, v12

    .line 66
    .line 67
    if-lez v7, :cond_1

    .line 68
    .line 69
    long-to-float v7, v8

    .line 70
    long-to-float v8, v10

    .line 71
    div-float/2addr v7, v8

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    const/high16 v7, 0x3f800000    # 1.0f

    .line 74
    .line 75
    :goto_1
    invoke-static {v7}, Lx8;->a(F)Lw8;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    iget v7, v7, Lw8;->b:F

    .line 80
    .line 81
    iget v8, v5, Lnj0;->a:F

    .line 82
    .line 83
    invoke-static {v8}, Ljava/lang/Math;->signum(F)F

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    mul-float/2addr v8, v7

    .line 88
    iget v5, v5, Lnj0;->b:F

    .line 89
    .line 90
    mul-float/2addr v8, v5

    .line 91
    long-to-float v5, v10

    .line 92
    div-float/2addr v8, v5

    .line 93
    const/high16 v5, 0x447a0000    # 1000.0f

    .line 94
    .line 95
    mul-float/2addr v8, v5

    .line 96
    invoke-virtual {v4, v8, v3}, Lnd;->e(FI)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v3, v3, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    throw v1

    .line 106
    :cond_3
    if-eqz v4, :cond_4

    .line 107
    .line 108
    return-object v4

    .line 109
    :cond_4
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v1

    .line 113
    :cond_5
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v1
.end method

.method public B(Lbt;Ljava/lang/String;)Lfb3;
    .locals 4

    .line 1
    iget-object v0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lix2;

    .line 4
    .line 5
    monitor-enter v0

    .line 6
    :try_start_0
    iget-object v1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lkb3;

    .line 9
    .line 10
    iget-object v1, v1, Lkb3;->a:Ljava/util/LinkedHashMap;

    .line 11
    .line 12
    invoke-virtual {v1, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lfb3;

    .line 17
    .line 18
    invoke-virtual {p1, v1}, Lbt;->d(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Lib3;

    .line 27
    .line 28
    instance-of p1, p0, Luc2;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    check-cast p0, Luc2;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Luc2;->d:Lba1;

    .line 38
    .line 39
    if-eqz p1, :cond_0

    .line 40
    .line 41
    iget-object p0, p0, Luc2;->e:Lqc2;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {v1, p0, p1}, Lrp0;->T(Lfb3;Lqc2;Lba1;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p0

    .line 51
    goto :goto_4

    .line 52
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_1
    new-instance v1, Lwj1;

    .line 57
    .line 58
    iget-object v2, p0, Lkj1;->k:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v2, Ls20;

    .line 61
    .line 62
    invoke-direct {v1, v2}, Lwj1;-><init>(Ls20;)V

    .line 63
    .line 64
    .line 65
    sget-object v2, Lp7;->g:Ljx2;

    .line 66
    .line 67
    iget-object v3, v1, Ls20;->a:Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-interface {v3, v2, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    iget-object v2, p0, Lkj1;->j:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v2, Lib3;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    :try_start_1
    invoke-interface {v2, p1, v1}, Lib3;->c(Lbt;Lwj1;)Lfb3;

    .line 77
    .line 78
    .line 79
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/AbstractMethodError; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 80
    :goto_1
    move-object v1, p1

    .line 81
    goto :goto_2

    .line 82
    :catch_0
    :try_start_2
    invoke-static {p1}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    invoke-interface {v2, v3, v1}, Lib3;->b(Ljava/lang/Class;Lwj1;)Lfb3;

    .line 87
    .line 88
    .line 89
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/AbstractMethodError; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 90
    goto :goto_1

    .line 91
    :catch_1
    :try_start_3
    invoke-static {p1}, Lp40;->y(Lbt;)Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-interface {v2, p1}, Lib3;->a(Ljava/lang/Class;)Lfb3;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    goto :goto_1

    .line 100
    :goto_2
    iget-object p0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p0, Lkb3;

    .line 103
    .line 104
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    iget-object p0, p0, Lkb3;->a:Ljava/util/LinkedHashMap;

    .line 111
    .line 112
    invoke-interface {p0, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Lfb3;

    .line 117
    .line 118
    if-eqz p0, :cond_2

    .line 119
    .line 120
    invoke-virtual {p0}, Lfb3;->a()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 121
    .line 122
    .line 123
    :cond_2
    :goto_3
    monitor-exit v0

    .line 124
    return-object v1

    .line 125
    :goto_4
    monitor-exit v0

    .line 126
    throw p0
.end method

.method public C(Lth2;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Lth2;->k:Lri2;

    .line 5
    .line 6
    invoke-virtual {v0}, Lri2;->a()Ljava/util/LinkedHashSet;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 19
    .line 20
    monitor-enter v0

    .line 21
    :try_start_0
    invoke-virtual {p0}, Lkj1;->D()Ljava/util/Map;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object v1, p1, Lth2;->c:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    monitor-exit v0

    .line 34
    invoke-static {p1}, Lrp0;->b0(Lth2;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    return p0

    .line 43
    :catchall_0
    move-exception p0

    .line 44
    monitor-exit v0

    .line 45
    throw p0
.end method

.method public D()Ljava/util/Map;
    .locals 6

    .line 1
    iget-object v0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/File;

    .line 4
    .line 5
    iget-object v1, p0, Lkj1;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Map;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Lkj1;->k:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lv31;

    .line 31
    .line 32
    invoke-static {v0}, Lwi0;->f0(Ljava/io/File;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v2, Lo31;->a:Lo31;

    .line 40
    .line 41
    invoke-virtual {v1, v2, v0}, Lu21;->a(Lw41;Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lj31;

    .line 46
    .line 47
    instance-of v1, v0, Ld41;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    check-cast v0, Ld41;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move-object v0, v2

    .line 56
    :goto_0
    if-nez v0, :cond_3

    .line 57
    .line 58
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 61
    .line 62
    .line 63
    goto :goto_6

    .line 64
    :cond_3
    iget-object v0, v0, Ld41;->h:Ljava/util/Map;

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    check-cast v0, Ljava/lang/Iterable;

    .line 71
    .line 72
    new-instance v1, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eqz v3, :cond_8

    .line 86
    .line 87
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    check-cast v3, Ljava/util/Map$Entry;

    .line 92
    .line 93
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Ljava/lang/String;

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, Lj31;

    .line 104
    .line 105
    instance-of v5, v3, Li41;

    .line 106
    .line 107
    if-eqz v5, :cond_5

    .line 108
    .line 109
    check-cast v3, Li41;

    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_5
    move-object v3, v2

    .line 113
    :goto_2
    if-eqz v3, :cond_7

    .line 114
    .line 115
    sget-object v5, Ll31;->a:Lgz0;

    .line 116
    .line 117
    instance-of v5, v3, Lz31;

    .line 118
    .line 119
    if-eqz v5, :cond_6

    .line 120
    .line 121
    move-object v3, v2

    .line 122
    goto :goto_3

    .line 123
    :cond_6
    invoke-virtual {v3}, Li41;->a()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    :goto_3
    if-eqz v3, :cond_7

    .line 128
    .line 129
    new-instance v5, Low1;

    .line 130
    .line 131
    invoke-direct {v5, v4, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_7
    move-object v5, v2

    .line 136
    :goto_4
    if-eqz v5, :cond_4

    .line 137
    .line 138
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 143
    .line 144
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v0}, Lwe1;->w0(Ljava/util/ArrayList;Ljava/util/LinkedHashMap;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 148
    .line 149
    .line 150
    goto :goto_6

    .line 151
    :goto_5
    new-instance v1, Lx92;

    .line 152
    .line 153
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    move-object v0, v1

    .line 157
    :goto_6
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    if-nez v1, :cond_9

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_9
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 165
    .line 166
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 167
    .line 168
    .line 169
    :goto_7
    check-cast v0, Ljava/util/Map;

    .line 170
    .line 171
    iput-object v0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 172
    .line 173
    return-object v0
.end method

.method public E()Ljava/util/Set;
    .locals 5

    .line 1
    iget-object v0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/File;

    .line 4
    .line 5
    iget-object v1, p0, Lkj1;->l:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/util/Set;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    :try_start_0
    invoke-virtual {v0}, Ljava/io/File;->isFile()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :catchall_0
    move-exception v0

    .line 26
    goto/16 :goto_5

    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Lkj1;->k:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Lv31;

    .line 31
    .line 32
    invoke-static {v0}, Lwi0;->f0(Ljava/io/File;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v2, Lo31;->a:Lo31;

    .line 40
    .line 41
    invoke-virtual {v1, v2, v0}, Lu21;->a(Lw41;Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lj31;

    .line 46
    .line 47
    instance-of v1, v0, Lz21;

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    check-cast v0, Lz21;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    move-object v0, v2

    .line 56
    :goto_0
    if-nez v0, :cond_3

    .line 57
    .line 58
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 61
    .line 62
    .line 63
    goto :goto_6

    .line 64
    :cond_3
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, Lz21;->h:Ljava/util/List;

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_8

    .line 80
    .line 81
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Lj31;

    .line 86
    .line 87
    instance-of v4, v3, Li41;

    .line 88
    .line 89
    if-eqz v4, :cond_5

    .line 90
    .line 91
    check-cast v3, Li41;

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_5
    move-object v3, v2

    .line 95
    :goto_2
    if-eqz v3, :cond_7

    .line 96
    .line 97
    sget-object v4, Ll31;->a:Lgz0;

    .line 98
    .line 99
    instance-of v4, v3, Lz31;

    .line 100
    .line 101
    if-eqz v4, :cond_6

    .line 102
    .line 103
    move-object v3, v2

    .line 104
    goto :goto_3

    .line 105
    :cond_6
    invoke-virtual {v3}, Li41;->a()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    :goto_3
    if-eqz v3, :cond_7

    .line 110
    .line 111
    invoke-static {v3}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-nez v4, :cond_7

    .line 116
    .line 117
    goto :goto_4

    .line 118
    :cond_7
    move-object v3, v2

    .line 119
    :goto_4
    if-eqz v3, :cond_4

    .line 120
    .line 121
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :goto_5
    new-instance v1, Lx92;

    .line 126
    .line 127
    invoke-direct {v1, v0}, Lx92;-><init>(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    :cond_8
    move-object v0, v1

    .line 131
    :goto_6
    invoke-static {v0}, Ly92;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    if-nez v1, :cond_9

    .line 136
    .line 137
    goto :goto_7

    .line 138
    :cond_9
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 139
    .line 140
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 141
    .line 142
    .line 143
    :goto_7
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 144
    .line 145
    iput-object v0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 146
    .line 147
    return-object v0
.end method

.method public F(Ljava/util/Map;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "Unable to create the script permission directory."

    .line 25
    .line 26
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 31
    .line 32
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    check-cast v4, Ljava/util/Map$Entry;

    .line 54
    .line 55
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    check-cast v5, Ljava/lang/String;

    .line 60
    .line 61
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v4}, Ll31;->c(Ljava/lang/String;)Li41;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-interface {v2, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    check-cast v4, Lj31;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    new-instance v3, Ld41;

    .line 85
    .line 86
    invoke-direct {v3, v2}, Ld41;-><init>(Ljava/util/Map;)V

    .line 87
    .line 88
    .line 89
    const-string v2, "perm"

    .line 90
    .line 91
    const-string v4, ".tmp"

    .line 92
    .line 93
    invoke-static {v2, v4, v1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    iget-object v2, p0, Lkj1;->k:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v2, Lv31;

    .line 103
    .line 104
    sget-object v4, Ld41;->Companion:Lc41;

    .line 105
    .line 106
    invoke-virtual {v4}, Lc41;->serializer()Lw41;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, Lw41;

    .line 111
    .line 112
    invoke-virtual {v2, v4, v3}, Lu21;->b(Lw41;Ljava/lang/Object;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v2

    .line 116
    invoke-static {v1, v2}, Lwi0;->h0(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    .line 118
    .line 119
    const/4 v2, 0x1

    .line 120
    const/4 v3, 0x0

    .line 121
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    const/4 v6, 0x2

    .line 130
    new-array v6, v6, [Ljava/nio/file/CopyOption;

    .line 131
    .line 132
    sget-object v7, Ljava/nio/file/StandardCopyOption;->ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;

    .line 133
    .line 134
    aput-object v7, v6, v3

    .line 135
    .line 136
    sget-object v7, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 137
    .line 138
    aput-object v7, v6, v2

    .line 139
    .line 140
    invoke-static {v4, v5, v6}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_1
    .catch Ljava/nio/file/AtomicMoveNotSupportedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    .line 142
    .line 143
    goto :goto_2

    .line 144
    :catchall_0
    move-exception p0

    .line 145
    goto :goto_3

    .line 146
    :catch_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 147
    .line 148
    .line 149
    move-result-object v4

    .line 150
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    new-array v2, v2, [Ljava/nio/file/CopyOption;

    .line 155
    .line 156
    sget-object v5, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 157
    .line 158
    aput-object v5, v2, v3

    .line 159
    .line 160
    invoke-static {v4, v0, v2}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    .line 161
    .line 162
    .line 163
    :goto_2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 164
    .line 165
    invoke-direct {v0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 166
    .line 167
    .line 168
    iput-object v0, p0, Lkj1;->l:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    :goto_3
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 175
    .line 176
    .line 177
    throw p0

    .line 178
    :cond_3
    const-string p0, "Permission store file must have a parent directory."

    .line 179
    .line 180
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    return-void
.end method

.method public G(Ljava/util/Set;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/io/File;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_3

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const-string p0, "Unable to create the enabled script store directory."

    .line 25
    .line 26
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    :goto_0
    move-object v2, p1

    .line 31
    check-cast v2, Ljava/lang/Iterable;

    .line 32
    .line 33
    invoke-static {v2}, Ldu;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    new-instance v3, Ljava/util/ArrayList;

    .line 38
    .line 39
    const/16 v4, 0xa

    .line 40
    .line 41
    invoke-static {v2, v4}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    check-cast v4, Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v4}, Ll31;->c(Ljava/lang/String;)Li41;

    .line 65
    .line 66
    .line 67
    move-result-object v4

    .line 68
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-instance v2, Lz21;

    .line 73
    .line 74
    invoke-direct {v2, v3}, Lz21;-><init>(Ljava/util/List;)V

    .line 75
    .line 76
    .line 77
    const-string v3, "script-enabled"

    .line 78
    .line 79
    const-string v4, ".tmp"

    .line 80
    .line 81
    invoke-static {v3, v4, v1}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    :try_start_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v3, p0, Lkj1;->k:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v3, Lv31;

    .line 91
    .line 92
    sget-object v4, Lz21;->Companion:Ly21;

    .line 93
    .line 94
    invoke-virtual {v4}, Ly21;->serializer()Lw41;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    check-cast v4, Lw41;

    .line 99
    .line 100
    invoke-virtual {v3, v4, v2}, Lu21;->b(Lw41;Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    invoke-static {v1, v2}, Lwi0;->h0(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    const/4 v2, 0x1

    .line 108
    const/4 v3, 0x0

    .line 109
    :try_start_1
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    const/4 v6, 0x2

    .line 118
    new-array v6, v6, [Ljava/nio/file/CopyOption;

    .line 119
    .line 120
    sget-object v7, Ljava/nio/file/StandardCopyOption;->ATOMIC_MOVE:Ljava/nio/file/StandardCopyOption;

    .line 121
    .line 122
    aput-object v7, v6, v3

    .line 123
    .line 124
    sget-object v7, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 125
    .line 126
    aput-object v7, v6, v2

    .line 127
    .line 128
    invoke-static {v4, v5, v6}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;
    :try_end_1
    .catch Ljava/nio/file/AtomicMoveNotSupportedException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :catchall_0
    move-exception p0

    .line 133
    goto :goto_3

    .line 134
    :catch_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v0}, Ljava/io/File;->toPath()Ljava/nio/file/Path;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    new-array v2, v2, [Ljava/nio/file/CopyOption;

    .line 143
    .line 144
    sget-object v5, Ljava/nio/file/StandardCopyOption;->REPLACE_EXISTING:Ljava/nio/file/StandardCopyOption;

    .line 145
    .line 146
    aput-object v5, v2, v3

    .line 147
    .line 148
    invoke-static {v4, v0, v2}, Ljava/nio/file/Files;->move(Ljava/nio/file/Path;Ljava/nio/file/Path;[Ljava/nio/file/CopyOption;)Ljava/nio/file/Path;

    .line 149
    .line 150
    .line 151
    :goto_2
    check-cast p1, Ljava/lang/Iterable;

    .line 152
    .line 153
    invoke-static {p1}, Ldu;->J0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    iput-object p1, p0, Lkj1;->l:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :goto_3
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 164
    .line 165
    .line 166
    throw p0

    .line 167
    :cond_3
    const-string p0, "Enabled script store file must have a parent directory."

    .line 168
    .line 169
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    return-void
.end method

.method public I()V
    .locals 2

    .line 1
    :try_start_0
    sget-object v0, Lzz1;->a:Lzz1;

    .line 2
    .line 3
    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Ljava/io/IOException;

    .line 8
    .line 9
    const-string v1, "Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test"

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw v0

    .line 15
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 16
    .line 17
    const-string v1, "Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test."

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    iget-object p0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ljava/util/concurrent/CountDownLatch;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 29
    .line 30
    .line 31
    throw v0
.end method

.method public J(Ljava/lang/String;Z)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    invoke-virtual {p0}, Lkj1;->E()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, Ljava/lang/Iterable;

    .line 12
    .line 13
    invoke-static {v1}, Ldu;->J0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    if-eqz p2, :cond_0

    .line 18
    .line 19
    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p0

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    :goto_0
    if-eqz p1, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Lkj1;->G(Ljava/util/Set;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    .line 34
    .line 35
    :cond_1
    monitor-exit v0

    .line 36
    return-void

    .line 37
    :goto_1
    monitor-exit v0

    .line 38
    throw p0
.end method

.method public K(Lh12;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lt12;

    .line 4
    .line 5
    sget-object v1, Lt12;->i:Lt12;

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lc61;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const-wide/16 v1, 0x0

    .line 16
    .line 17
    invoke-interface {v0, v1, v2}, Lc61;->M(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    new-instance v2, Lv5;

    .line 22
    .line 23
    iget-object v3, p0, Lkj1;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v3, Lu12;

    .line 26
    .line 27
    const/16 v4, 0x11

    .line 28
    .line 29
    invoke-direct {v2, v4, v3}, Lv5;-><init>(ILjava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    const/4 v3, 0x1

    .line 33
    invoke-static {p1, v0, v1, v2, v3}, Ls11;->p0(Lh12;JLin0;Z)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p0, "layoutCoordinates not set"

    .line 38
    .line 39
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_1
    :goto_0
    sget-object p1, Lt12;->j:Lt12;

    .line 44
    .line 45
    iput-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    .line 46
    .line 47
    return-void
.end method

.method public b(Lnd;Lnd;Lnd;)J
    .locals 8

    .line 1
    invoke-virtual {p1}, Lnd;->b()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :goto_0
    if-ge v3, v0, :cond_0

    .line 9
    .line 10
    iget-object v4, p0, Lkj1;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v4, Lhh1;

    .line 13
    .line 14
    invoke-virtual {v4, v3}, Lhh1;->z(I)Lsj0;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {p1, v3}, Lnd;->a(I)F

    .line 19
    .line 20
    .line 21
    move-result v5

    .line 22
    invoke-virtual {p2, v3}, Lnd;->a(I)F

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    invoke-virtual {p3, v3}, Lnd;->a(I)F

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    invoke-interface {v4, v5, v6, v7}, Lsj0;->d(FFF)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->max(JJ)J

    .line 35
    .line 36
    .line 37
    move-result-wide v1

    .line 38
    add-int/lit8 v3, v3, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-wide v1
.end method

.method public c(Lj23;)V
    .locals 9

    .line 1
    iget-object v0, p1, Li01;->i:Lkt2;

    .line 2
    .line 3
    invoke-static {p1}, Lab2;->a(Li01;)Loa0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Li01;->h:Lza2;

    .line 8
    .line 9
    iget-object v3, p1, Le30;->l:Ldz;

    .line 10
    .line 11
    iget v4, v2, Lza2;->e:I

    .line 12
    .line 13
    iget v5, v2, Lza2;->a:I

    .line 14
    .line 15
    const/4 v6, 0x6

    .line 16
    if-ne v4, v6, :cond_6

    .line 17
    .line 18
    iget-object v4, p0, Lkj1;->k:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v4, Lxt;

    .line 21
    .line 22
    invoke-virtual {p0, v4}, Lkj1;->f(La40;)V

    .line 23
    .line 24
    .line 25
    iget-boolean v2, v2, Lza2;->f:Z

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    iget-object p1, p1, Li01;->k:Ls72;

    .line 30
    .line 31
    new-instance v2, Lf30;

    .line 32
    .line 33
    invoke-direct {v2, v1, v0, p1, v3}, Lf30;-><init>(Loa0;Lkt2;Ls72;Ldz;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v2}, Lkj1;->f(La40;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    invoke-virtual {p0}, Lkj1;->y()Lr72;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {p1, v2}, Lbb2;->c(Li01;Lr72;)Ls72;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iget-boolean v6, v1, Loa0;->e:Z

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    const/4 v8, 0x0

    .line 52
    if-nez v6, :cond_2

    .line 53
    .line 54
    const/16 v6, 0x2b

    .line 55
    .line 56
    if-ne v5, v6, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move v6, v8

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    :goto_0
    move v6, v7

    .line 62
    :goto_1
    if-eqz v2, :cond_3

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    move v7, v8

    .line 66
    :goto_2
    if-ne v6, v7, :cond_5

    .line 67
    .line 68
    const/16 p1, 0x29

    .line 69
    .line 70
    if-ne v5, p1, :cond_4

    .line 71
    .line 72
    iget p1, v1, Loa0;->a:I

    .line 73
    .line 74
    const/16 v2, 0x23

    .line 75
    .line 76
    if-eq p1, v2, :cond_4

    .line 77
    .line 78
    new-instance p1, Lwq2;

    .line 79
    .line 80
    invoke-direct {p1, v1, v0, v4}, La40;-><init>(Loa0;Lkt2;Ls72;)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    new-instance p1, Lf30;

    .line 85
    .line 86
    invoke-direct {p1, v1, v0, v4, v3}, Lf30;-><init>(Loa0;Lkt2;Ls72;Ldz;)V

    .line 87
    .line 88
    .line 89
    :goto_3
    invoke-virtual {p0, p1}, Lkj1;->f(La40;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :cond_5
    const-string p0, "Insn with result/move-result-pseudo mismatch "

    .line 94
    .line 95
    invoke-static {p0, p1}, Lc80;->A(Ljava/lang/String;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_6
    new-instance p0, Ljava/lang/RuntimeException;

    .line 100
    .line 101
    iget p1, v2, Lza2;->e:I

    .line 102
    .line 103
    new-instance v0, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v1, "Expected BRANCH_THROW got "

    .line 106
    .line 107
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0
.end method

.method public d(Lxz1;)V
    .locals 6

    .line 1
    iget-object v0, p1, Li01;->h:Lza2;

    .line 2
    .line 3
    iget-object v1, p1, Li01;->j:Lr72;

    .line 4
    .line 5
    iget v2, v0, Lza2;->a:I

    .line 6
    .line 7
    const/16 v3, 0x36

    .line 8
    .line 9
    if-ne v2, v3, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/16 v3, 0x38

    .line 13
    .line 14
    if-ne v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v2, p1, Li01;->i:Lkt2;

    .line 18
    .line 19
    invoke-static {p1}, Lab2;->a(Li01;)Loa0;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget v0, v0, Lza2;->e:I

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    if-eq v0, v4, :cond_5

    .line 27
    .line 28
    const/4 v5, 0x2

    .line 29
    if-eq v0, v5, :cond_5

    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    if-eq v0, v5, :cond_4

    .line 33
    .line 34
    const/4 v5, 0x4

    .line 35
    if-eq v0, v5, :cond_3

    .line 36
    .line 37
    const/4 v4, 0x6

    .line 38
    if-ne v0, v4, :cond_2

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_2
    const-string p0, "shouldn\'t happen"

    .line 42
    .line 43
    invoke-static {p0}, Lc80;->j(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_3
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lzj;

    .line 50
    .line 51
    iget-object v0, v0, Lzj;->c:Lv01;

    .line 52
    .line 53
    invoke-virtual {v0, v4}, Lv01;->f(I)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    new-instance v4, Ldy2;

    .line 58
    .line 59
    invoke-static {p1, v1}, Lbb2;->c(Li01;Lr72;)Ls72;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iget-object v1, p0, Lkj1;->l:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v1, Lbb2;

    .line 66
    .line 67
    iget-object v1, v1, Lbb2;->e:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lb5;

    .line 70
    .line 71
    iget-object v1, v1, Lb5;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v1, [Lxt;

    .line 74
    .line 75
    aget-object v0, v1, v0

    .line 76
    .line 77
    invoke-direct {v4, v3, v2, p1, v0}, Ldy2;-><init>(Loa0;Lkt2;Ls72;Lxt;)V

    .line 78
    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    :goto_0
    return-void

    .line 82
    :cond_5
    :goto_1
    new-instance v4, Lwq2;

    .line 83
    .line 84
    invoke-static {p1, v1}, Lbb2;->c(Li01;Lr72;)Ls72;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {v4, v3, v2, p1}, La40;-><init>(Loa0;Lkt2;Ls72;)V

    .line 89
    .line 90
    .line 91
    :goto_2
    invoke-virtual {p0, v4}, Lkj1;->f(La40;)V

    .line 92
    .line 93
    .line 94
    return-void
.end method

.method public e(Lwz1;)V
    .locals 7

    .line 1
    iget-object v0, p1, Li01;->i:Lkt2;

    .line 2
    .line 3
    iget-object v1, p1, Le30;->l:Ldz;

    .line 4
    .line 5
    iget-object v2, p1, Li01;->j:Lr72;

    .line 6
    .line 7
    invoke-static {p1}, Lab2;->a(Li01;)Loa0;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    iget-object v4, p1, Li01;->h:Lza2;

    .line 12
    .line 13
    iget v5, v4, Lza2;->a:I

    .line 14
    .line 15
    iget v4, v4, Lza2;->e:I

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    if-ne v4, v6, :cond_2

    .line 19
    .line 20
    const/4 v4, 0x3

    .line 21
    if-ne v5, v4, :cond_1

    .line 22
    .line 23
    iget-object p1, p0, Lkj1;->l:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p1, Lbb2;

    .line 26
    .line 27
    iget-boolean v4, p1, Lbb2;->a:Z

    .line 28
    .line 29
    if-nez v4, :cond_0

    .line 30
    .line 31
    check-cast v1, Lg30;

    .line 32
    .line 33
    iget v1, v1, Li30;->h:I

    .line 34
    .line 35
    iget v4, p1, Lbb2;->b:I

    .line 36
    .line 37
    iget p1, p1, Lbb2;->c:I

    .line 38
    .line 39
    sub-int/2addr v4, p1

    .line 40
    add-int/2addr v4, v1

    .line 41
    iget-object p1, v2, Lr72;->i:Lw53;

    .line 42
    .line 43
    invoke-interface {p1}, Lw53;->a()Lo43;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {v4, p1}, Lr72;->e(ILw53;)Lr72;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance v1, Lwq2;

    .line 52
    .line 53
    invoke-static {v2, p1}, Ls72;->i(Lr72;Lr72;)Ls72;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {v1, v3, v0, p1}, La40;-><init>(Loa0;Lkt2;Ls72;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, v1}, Lkj1;->f(La40;)V

    .line 61
    .line 62
    .line 63
    :cond_0
    return-void

    .line 64
    :cond_1
    invoke-static {p1, v2}, Lbb2;->c(Li01;Lr72;)Ls72;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    new-instance v2, Lf30;

    .line 69
    .line 70
    invoke-direct {v2, v3, v0, p1, v1}, Lf30;-><init>(Loa0;Lkt2;Ls72;Ldz;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v2}, Lkj1;->f(La40;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :cond_2
    const-string p0, "shouldn\'t happen"

    .line 78
    .line 79
    invoke-static {p0}, Lc80;->j(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public f(La40;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldq1;

    .line 4
    .line 5
    iget-object p0, p0, Ldq1;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lsd0;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lsd0;->a(La40;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public declared-synchronized g(Ljava/lang/Class;Ljava/lang/Class;)Ljh1;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v2, 0x0

    .line 16
    move v3, v2

    .line 17
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    const/4 v5, 0x1

    .line 22
    if-eqz v4, :cond_2

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, Ljj1;

    .line 29
    .line 30
    iget-object v6, p0, Lkj1;->k:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v6, Ljava/util/HashSet;

    .line 33
    .line 34
    invoke-virtual {v6, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    move v3, v5

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iget-object v5, v4, Ljj1;->a:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {v5, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-eqz v5, :cond_0

    .line 49
    .line 50
    iget-object v5, v4, Ljj1;->b:Ljava/lang/Class;

    .line 51
    .line 52
    invoke-virtual {v5, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    iget-object v5, p0, Lkj1;->k:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v5, Ljava/util/HashSet;

    .line 61
    .line 62
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    iget-object v5, v4, Ljj1;->c:Lkh1;

    .line 66
    .line 67
    invoke-interface {v5, p0}, Lkh1;->q(Lkj1;)Ljh1;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    iget-object v5, p0, Lkj1;->k:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v5, Ljava/util/HashSet;

    .line 77
    .line 78
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-le v1, v5, :cond_3

    .line 89
    .line 90
    iget-object p1, p0, Lkj1;->j:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p1, Li51;

    .line 93
    .line 94
    iget-object p2, p0, Lkj1;->l:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p2, Lb5;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    new-instance p1, Ltg;

    .line 102
    .line 103
    const/4 v1, 0x2

    .line 104
    invoke-direct {p1, v1, v0, p2}, Ltg;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    monitor-exit p0

    .line 108
    return-object p1

    .line 109
    :cond_3
    :try_start_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-ne v1, v5, :cond_4

    .line 114
    .line 115
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Ljh1;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    .line 121
    monitor-exit p0

    .line 122
    return-object p1

    .line 123
    :cond_4
    if-eqz v3, :cond_5

    .line 124
    .line 125
    :try_start_2
    sget-object p1, Lkj1;->n:Lb83;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 126
    .line 127
    monitor-exit p0

    .line 128
    return-object p1

    .line 129
    :cond_5
    :try_start_3
    new-instance v0, Lu72;

    .line 130
    .line 131
    new-instance v1, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v2, "Failed to find any ModelLoaders for model: "

    .line 134
    .line 135
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string p1, " and data: "

    .line 142
    .line 143
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 157
    :goto_1
    :try_start_4
    iget-object p2, p0, Lkj1;->k:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast p2, Ljava/util/HashSet;

    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/util/HashSet;->clear()V

    .line 162
    .line 163
    .line 164
    throw p1

    .line 165
    :catchall_1
    move-exception p1

    .line 166
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 167
    throw p1
.end method

.method public h(Lk23;)V
    .locals 5

    .line 1
    iget-object v0, p1, Li01;->i:Lkt2;

    .line 2
    .line 3
    invoke-static {p1}, Lab2;->a(Li01;)Loa0;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p1, Li01;->h:Lza2;

    .line 8
    .line 9
    iget v2, v2, Lza2;->e:I

    .line 10
    .line 11
    const/4 v3, 0x6

    .line 12
    if-ne v2, v3, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Lkj1;->y()Lr72;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    iget-boolean v3, v1, Loa0;->e:Z

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v4, 0x0

    .line 25
    :goto_0
    if-ne v3, v4, :cond_1

    .line 26
    .line 27
    iget-object v3, p0, Lkj1;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Lxt;

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Lkj1;->f(La40;)V

    .line 32
    .line 33
    .line 34
    new-instance v3, Lwq2;

    .line 35
    .line 36
    invoke-static {p1, v2}, Lbb2;->c(Li01;Lr72;)Ls72;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-direct {v3, v1, v0, p1}, La40;-><init>(Loa0;Lkt2;Ls72;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v3}, Lkj1;->f(La40;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    const-string p0, "Insn with result/move-result-pseudo mismatch"

    .line 48
    .line 49
    invoke-static {p0, p1}, Lc80;->A(Ljava/lang/String;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    const-string p0, "shouldn\'t happen"

    .line 54
    .line 55
    invoke-static {p0}, Lc80;->j(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public i()Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance p0, Lfi2;

    .line 2
    .line 3
    const/16 v0, 0x8

    .line 4
    .line 5
    const-string v1, "NOT_SUPPORTED"

    .line 6
    .line 7
    const-string v2, "Media download is not supported by the current WeChat adapter."

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {p0, v1, v2, v0, v3}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public j(Lzj2;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "WeChat messaging is unavailable in the current host version."

    .line 6
    .line 7
    iget-object v3, v0, Lkj1;->l:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, Lxm0;

    .line 10
    .line 11
    invoke-interface {v3}, Lxm0;->a()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    const/16 v4, 0x8

    .line 22
    .line 23
    const-string v5, "MESSAGING_UNAVAILABLE"

    .line 24
    .line 25
    const/4 v6, 0x0

    .line 26
    if-nez v3, :cond_e

    .line 27
    .line 28
    iget-object v3, v1, Lzj2;->a:Lyf2;

    .line 29
    .line 30
    iget-object v7, v3, Lyf2;->a:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v8, v3, Lyf2;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v9, v3, Lyf2;->b:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v10, v3, Lyf2;->d:Ljava/lang/String;

    .line 37
    .line 38
    const-string v11, "wechat"

    .line 39
    .line 40
    invoke-virtual {v7, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    const-string v11, "NOT_SUPPORTED"

    .line 45
    .line 46
    if-eqz v7, :cond_d

    .line 47
    .line 48
    iget-object v7, v0, Lkj1;->j:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v7, Lxm0;

    .line 51
    .line 52
    invoke-interface {v7}, Lxm0;->a()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    check-cast v7, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v7}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    const/4 v13, 0x1

    .line 63
    if-nez v12, :cond_c

    .line 64
    .line 65
    invoke-virtual {v9, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    if-eqz v7, :cond_b

    .line 70
    .line 71
    invoke-static {v8}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    const-string v9, "INVALID_ARGUMENT"

    .line 76
    .line 77
    if-nez v7, :cond_a

    .line 78
    .line 79
    move v7, v6

    .line 80
    :goto_0
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 81
    .line 82
    .line 83
    move-result v12

    .line 84
    if-ge v7, v12, :cond_0

    .line 85
    .line 86
    invoke-virtual {v8, v7}, Ljava/lang/String;->charAt(I)C

    .line 87
    .line 88
    .line 89
    move-result v12

    .line 90
    invoke-static {v12}, Ljava/lang/Character;->isISOControl(C)Z

    .line 91
    .line 92
    .line 93
    move-result v12

    .line 94
    if-nez v12, :cond_a

    .line 95
    .line 96
    add-int/lit8 v7, v7, 0x1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    const-string v7, "@chatroom"

    .line 100
    .line 101
    invoke-static {v8, v7, v6}, Lwv2;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    if-eqz v7, :cond_1

    .line 106
    .line 107
    const-string v7, "group"

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_1
    const-string v7, "private"

    .line 111
    .line 112
    :goto_1
    invoke-virtual {v10, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-eqz v7, :cond_9

    .line 117
    .line 118
    iget-object v7, v1, Lzj2;->c:Ljava/lang/String;

    .line 119
    .line 120
    if-nez v7, :cond_8

    .line 121
    .line 122
    iget-object v14, v1, Lzj2;->b:Ljava/util/ArrayList;

    .line 123
    .line 124
    new-instance v1, Leq1;

    .line 125
    .line 126
    invoke-direct {v1, v0}, Leq1;-><init>(Lkj1;)V

    .line 127
    .line 128
    .line 129
    const/16 v19, 0x1e

    .line 130
    .line 131
    const-string v15, ""

    .line 132
    .line 133
    const/16 v16, 0x0

    .line 134
    .line 135
    const/16 v17, 0x0

    .line 136
    .line 137
    move-object/from16 v18, v1

    .line 138
    .line 139
    invoke-static/range {v14 .. v19}, Ldu;->u0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lin0;I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-static {v1}, Lpv2;->s0(Ljava/lang/CharSequence;)Z

    .line 144
    .line 145
    .line 146
    move-result v7

    .line 147
    if-nez v7, :cond_7

    .line 148
    .line 149
    :try_start_0
    iget-object v7, v0, Lkj1;->i:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v7, Luc3;

    .line 152
    .line 153
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-static {v8, v1}, Lgd3;->l(Ljava/lang/String;Ljava/lang/String;)Lso2;

    .line 157
    .line 158
    .line 159
    move-result-object v1
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 160
    instance-of v7, v1, Lro2;

    .line 161
    .line 162
    if-eqz v7, :cond_2

    .line 163
    .line 164
    new-instance v1, Lak2;

    .line 165
    .line 166
    iget-object v0, v0, Lkj1;->k:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Lxm0;

    .line 169
    .line 170
    invoke-interface {v0}, Lxm0;->a()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 177
    .line 178
    .line 179
    move-result-wide v4

    .line 180
    invoke-direct {v1, v4, v5, v3}, Lak2;-><init>(JLyf2;)V

    .line 181
    .line 182
    .line 183
    return-object v1

    .line 184
    :cond_2
    instance-of v0, v1, Lqo2;

    .line 185
    .line 186
    if-eqz v0, :cond_6

    .line 187
    .line 188
    check-cast v1, Lqo2;

    .line 189
    .line 190
    iget-object v0, v1, Lqo2;->a:Ljo2;

    .line 191
    .line 192
    iget-object v0, v0, Ljo2;->b:Lio2;

    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_5

    .line 199
    .line 200
    if-eq v0, v13, :cond_5

    .line 201
    .line 202
    const/4 v1, 0x7

    .line 203
    if-eq v0, v1, :cond_4

    .line 204
    .line 205
    const/16 v1, 0xa

    .line 206
    .line 207
    if-eq v0, v1, :cond_3

    .line 208
    .line 209
    const/16 v1, 0xb

    .line 210
    .line 211
    if-eq v0, v1, :cond_3

    .line 212
    .line 213
    new-instance v0, Lfi2;

    .line 214
    .line 215
    const-string v1, "SEND_FAILED"

    .line 216
    .line 217
    const-string v2, "WeChat could not send the message."

    .line 218
    .line 219
    invoke-direct {v0, v1, v2, v4, v13}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 220
    .line 221
    .line 222
    goto :goto_2

    .line 223
    :cond_3
    new-instance v0, Lfi2;

    .line 224
    .line 225
    invoke-direct {v0, v5, v2, v4, v13}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 226
    .line 227
    .line 228
    goto :goto_2

    .line 229
    :cond_4
    new-instance v0, Lfi2;

    .line 230
    .line 231
    const-string v1, "SEND_REJECTED"

    .line 232
    .line 233
    const-string v2, "WeChat did not accept the message task."

    .line 234
    .line 235
    invoke-direct {v0, v1, v2, v4, v13}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 236
    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_5
    new-instance v0, Lfi2;

    .line 240
    .line 241
    const-string v1, "WeChat rejected the message input."

    .line 242
    .line 243
    const/16 v2, 0xc

    .line 244
    .line 245
    invoke-direct {v0, v9, v1, v2, v6}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 246
    .line 247
    .line 248
    :goto_2
    throw v0

    .line 249
    :cond_6
    invoke-static {}, Lc80;->s()V

    .line 250
    .line 251
    .line 252
    const/4 v0, 0x0

    .line 253
    return-object v0

    .line 254
    :catch_0
    move-exception v0

    .line 255
    goto :goto_3

    .line 256
    :catch_1
    new-instance v0, Lfi2;

    .line 257
    .line 258
    invoke-direct {v0, v5, v2, v4, v13}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :goto_3
    throw v0

    .line 263
    :cond_7
    new-instance v0, Lfi2;

    .line 264
    .line 265
    const-string v1, "Text message content must not be blank."

    .line 266
    .line 267
    invoke-direct {v0, v9, v1, v4, v6}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 268
    .line 269
    .line 270
    throw v0

    .line 271
    :cond_8
    new-instance v0, Lfi2;

    .line 272
    .line 273
    const-string v1, "WeChat quoted replies are not supported yet."

    .line 274
    .line 275
    invoke-direct {v0, v11, v1, v4, v6}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 276
    .line 277
    .line 278
    throw v0

    .line 279
    :cond_9
    new-instance v0, Lfi2;

    .line 280
    .line 281
    const-string v1, "Conversation type does not match the WeChat conversation."

    .line 282
    .line 283
    invoke-direct {v0, v9, v1, v4, v6}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 284
    .line 285
    .line 286
    throw v0

    .line 287
    :cond_a
    new-instance v0, Lfi2;

    .line 288
    .line 289
    const-string v1, "Conversation id is invalid."

    .line 290
    .line 291
    invoke-direct {v0, v9, v1, v4, v6}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 292
    .line 293
    .line 294
    throw v0

    .line 295
    :cond_b
    new-instance v0, Lfi2;

    .line 296
    .line 297
    const-string v1, "NOT_FOUND"

    .line 298
    .line 299
    const-string v2, "The requested WeChat account is not active."

    .line 300
    .line 301
    invoke-direct {v0, v1, v2, v4, v6}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 302
    .line 303
    .line 304
    throw v0

    .line 305
    :cond_c
    new-instance v0, Lfi2;

    .line 306
    .line 307
    const-string v1, "No active WeChat account is available."

    .line 308
    .line 309
    invoke-direct {v0, v5, v1, v4, v13}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :cond_d
    new-instance v0, Lfi2;

    .line 314
    .line 315
    const-string v1, "Only the WeChat platform is supported."

    .line 316
    .line 317
    invoke-direct {v0, v11, v1, v4, v6}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 318
    .line 319
    .line 320
    throw v0

    .line 321
    :cond_e
    new-instance v0, Lfi2;

    .line 322
    .line 323
    const-string v1, "Messaging is disabled while security mode is enabled."

    .line 324
    .line 325
    invoke-direct {v0, v5, v1, v4, v6}, Lfi2;-><init>(Ljava/lang/String;Ljava/lang/String;IZ)V

    .line 326
    .line 327
    .line 328
    throw v0
.end method

.method public l()Lfr2;
    .locals 0

    .line 1
    iget-object p0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lf60;

    .line 4
    .line 5
    return-object p0
.end method

.method public declared-synchronized m(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_2

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljj1;

    .line 26
    .line 27
    iget-object v3, p0, Lkj1;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v3, Ljava/util/HashSet;

    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v3, v2, Ljj1;->a:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    iget-object v3, p0, Lkj1;->k:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v3, Ljava/util/HashSet;

    .line 49
    .line 50
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    iget-object v3, v2, Ljj1;->c:Lkh1;

    .line 54
    .line 55
    invoke-interface {v3, p0}, Lkh1;->q(Lkj1;)Ljh1;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    iget-object v3, p0, Lkj1;->k:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v3, Ljava/util/HashSet;

    .line 65
    .line 66
    invoke-virtual {v3, v2}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :catchall_0
    move-exception p1

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    monitor-exit p0

    .line 73
    return-object v0

    .line 74
    :goto_1
    :try_start_1
    iget-object v0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, Ljava/util/HashSet;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    .line 79
    .line 80
    .line 81
    throw p1

    .line 82
    :catchall_1
    move-exception p1

    .line 83
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 84
    throw p1
.end method

.method public n()Lht2;
    .locals 0

    .line 1
    iget-object p0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lg60;

    .line 4
    .line 5
    return-object p0
.end method

.method public o(Lh12;Z)V
    .locals 7

    .line 1
    iget-object v0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lu12;

    .line 4
    .line 5
    iget-object v1, p1, Lh12;->a:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v2, :cond_1

    .line 14
    .line 15
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    check-cast v5, Lo12;

    .line 20
    .line 21
    invoke-virtual {v5}, Lo12;->b()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0, p1}, Lkj1;->K(Lh12;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_0
    add-int/lit8 v4, v4, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    iget-object v2, p0, Lkj1;->i:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v2, Lc61;

    .line 37
    .line 38
    if-eqz v2, :cond_4

    .line 39
    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    invoke-interface {v2, v4, v5}, Lc61;->M(J)J

    .line 43
    .line 44
    .line 45
    move-result-wide v4

    .line 46
    new-instance v2, Lfa;

    .line 47
    .line 48
    const/4 v6, 0x7

    .line 49
    invoke-direct {v2, v6, p0, v0}, Lfa;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v4, v5, v2, v3}, Ls11;->p0(Lh12;JLin0;Z)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast p0, Lt12;

    .line 58
    .line 59
    sget-object v2, Lt12;->i:Lt12;

    .line 60
    .line 61
    if-ne p0, v2, :cond_3

    .line 62
    .line 63
    if-eqz p2, :cond_2

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    :goto_1
    if-ge v3, p0, :cond_2

    .line 70
    .line 71
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    check-cast p2, Lo12;

    .line 76
    .line 77
    invoke-virtual {p2}, Lo12;->a()V

    .line 78
    .line 79
    .line 80
    add-int/lit8 v3, v3, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    iget-object p0, p1, Lh12;->b:Ler2;

    .line 84
    .line 85
    if-eqz p0, :cond_3

    .line 86
    .line 87
    iget-boolean p1, v0, Lu12;->c:Z

    .line 88
    .line 89
    xor-int/lit8 p1, p1, 0x1

    .line 90
    .line 91
    iput-boolean p1, p0, Ler2;->i:Z

    .line 92
    .line 93
    :cond_3
    return-void

    .line 94
    :cond_4
    const-string p0, "layoutCoordinates not set"

    .line 95
    .line 96
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public declared-synchronized p()Ljava/util/concurrent/ExecutorService;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 3
    .line 4
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 11
    .line 12
    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    .line 13
    .line 14
    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    sget-object v2, Lwg3;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v2, " Dispatcher"

    .line 28
    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    new-instance v8, Lvg3;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {v8, v0, v2}, Lvg3;-><init>(Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    const/4 v2, 0x0

    .line 43
    const v3, 0x7fffffff

    .line 44
    .line 45
    .line 46
    const-wide/16 v4, 0x3c

    .line 47
    .line 48
    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    :goto_0
    iget-object v0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    .line 63
    monitor-exit p0

    .line 64
    return-object v0

    .line 65
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 66
    throw v0
.end method

.method public q(JLnd;Lnd;Lnd;)Lnd;
    .locals 14

    .line 1
    iget-object v0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnd;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p5 .. p5}, Lnd;->c()Lnd;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lnd;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "velocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Lnd;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Lkj1;->k:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lnd;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Lkj1;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lhh1;

    .line 38
    .line 39
    invoke-virtual {v5, v3}, Lhh1;->z(I)Lsj0;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move-object/from16 v5, p3

    .line 44
    .line 45
    invoke-virtual {v5, v3}, Lnd;->a(I)F

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    move-object/from16 v12, p4

    .line 50
    .line 51
    invoke-virtual {v12, v3}, Lnd;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    move-object/from16 v13, p5

    .line 56
    .line 57
    invoke-virtual {v13, v3}, Lnd;->a(I)F

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    move-wide v7, p1

    .line 62
    invoke-interface/range {v6 .. v11}, Lsj0;->c(JFFF)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v4, v6, v3}, Lnd;->e(FI)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    if-eqz v4, :cond_3

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_3
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method

.method public s(JLnd;Lnd;Lnd;)Lnd;
    .locals 14

    .line 1
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnd;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual/range {p3 .. p3}, Lnd;->c()Lnd;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lnd;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "valueVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Lnd;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Lkj1;->j:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lnd;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Lkj1;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lhh1;

    .line 38
    .line 39
    invoke-virtual {v5, v3}, Lhh1;->z(I)Lsj0;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    move-object/from16 v5, p3

    .line 44
    .line 45
    invoke-virtual {v5, v3}, Lnd;->a(I)F

    .line 46
    .line 47
    .line 48
    move-result v9

    .line 49
    move-object/from16 v12, p4

    .line 50
    .line 51
    invoke-virtual {v12, v3}, Lnd;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    move-object/from16 v13, p5

    .line 56
    .line 57
    invoke-virtual {v13, v3}, Lnd;->a(I)F

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    move-wide v7, p1

    .line 62
    invoke-interface/range {v6 .. v11}, Lsj0;->b(JFFF)F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-virtual {v4, v6, v3}, Lnd;->e(FI)V

    .line 67
    .line 68
    .line 69
    add-int/lit8 v3, v3, 0x1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_2
    if-eqz v4, :cond_3

    .line 77
    .line 78
    return-object v4

    .line 79
    :cond_3
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method

.method public t(Lnd;Lnd;Lnd;)Lnd;
    .locals 9

    .line 1
    iget-object v0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lnd;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3}, Lnd;->c()Lnd;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lnd;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    const-string v2, "endVelocityVector"

    .line 19
    .line 20
    if-eqz v0, :cond_4

    .line 21
    .line 22
    invoke-virtual {v0}, Lnd;->b()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v3, 0x0

    .line 27
    :goto_0
    iget-object v4, p0, Lkj1;->l:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v4, Lnd;

    .line 30
    .line 31
    if-ge v3, v0, :cond_2

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    iget-object v5, p0, Lkj1;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v5, Lhh1;

    .line 38
    .line 39
    invoke-virtual {v5, v3}, Lhh1;->z(I)Lsj0;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-virtual {p1, v3}, Lnd;->a(I)F

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    invoke-virtual {p2, v3}, Lnd;->a(I)F

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-virtual {p3, v3}, Lnd;->a(I)F

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    invoke-interface {v5, v6, v7, v8}, Lsj0;->e(FFF)F

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v4, v5, v3}, Lnd;->e(FI)V

    .line 60
    .line 61
    .line 62
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v1

    .line 69
    :cond_2
    if-eqz v4, :cond_3

    .line 70
    .line 71
    return-object v4

    .line 72
    :cond_3
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :cond_4
    invoke-static {v2}, Lt11;->S(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw v1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lkj1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/net/Socket;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/net/Socket;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x6
        :pswitch_0
    .end packed-switch
.end method

.method public u(Ljava/lang/String;)Lp52;
    .locals 3

    .line 1
    iget-object v0, p0, Lkj1;->k:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayDeque;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Lp52;

    .line 23
    .line 24
    iget-object v2, v1, Lp52;->j:Ls52;

    .line 25
    .line 26
    iget-object v2, v2, Ls52;->i:Lk82;

    .line 27
    .line 28
    iget-object v2, v2, Lk82;->a:Lyw0;

    .line 29
    .line 30
    iget-object v2, v2, Lyw0;->d:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v2, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    return-object v1

    .line 39
    :cond_1
    iget-object p0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Ljava/util/ArrayDeque;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/util/ArrayDeque;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Lp52;

    .line 61
    .line 62
    iget-object v1, v0, Lp52;->j:Ls52;

    .line 63
    .line 64
    iget-object v1, v1, Ls52;->i:Lk82;

    .line 65
    .line 66
    iget-object v1, v1, Lk82;->a:Lyw0;

    .line 67
    .line 68
    iget-object v1, v1, Lyw0;->d:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v1, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    return-object v0

    .line 77
    :cond_3
    const/4 p0, 0x0

    .line 78
    return-object p0
.end method

.method public v()V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lkj1;->l:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lb40;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v1, v0, Lkj1;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lsd0;

    .line 13
    .line 14
    iget v2, v1, Lsd0;->b:I

    .line 15
    .line 16
    iget v3, v1, Lsd0;->c:I

    .line 17
    .line 18
    if-gez v3, :cond_4d

    .line 19
    .line 20
    iget-object v3, v1, Lsd0;->f:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    new-array v4, v3, [Loa0;

    .line 29
    .line 30
    const/4 v5, 0x0

    .line 31
    move v6, v5

    .line 32
    :goto_0
    if-ge v6, v3, :cond_1

    .line 33
    .line 34
    iget-object v7, v1, Lsd0;->f:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v7, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v7

    .line 42
    check-cast v7, La40;

    .line 43
    .line 44
    iget-object v7, v7, La40;->b:Loa0;

    .line 45
    .line 46
    aput-object v7, v4, v6

    .line 47
    .line 48
    add-int/lit8 v6, v6, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-virtual {v1, v4}, Lsd0;->j([Loa0;)Z

    .line 52
    .line 53
    .line 54
    iget v3, v1, Lsd0;->e:I

    .line 55
    .line 56
    :cond_2
    iget v6, v1, Lsd0;->c:I

    .line 57
    .line 58
    add-int/2addr v6, v2

    .line 59
    iget v7, v1, Lsd0;->d:I

    .line 60
    .line 61
    add-int/2addr v6, v7

    .line 62
    sub-int/2addr v6, v3

    .line 63
    iget-object v7, v1, Lsd0;->f:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v7, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    move v8, v5

    .line 72
    move v9, v8

    .line 73
    move v10, v9

    .line 74
    move v11, v10

    .line 75
    :cond_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v12

    .line 79
    if-eqz v12, :cond_9

    .line 80
    .line 81
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v12

    .line 85
    check-cast v12, La40;

    .line 86
    .line 87
    iget-object v12, v12, La40;->d:Ls72;

    .line 88
    .line 89
    move v14, v5

    .line 90
    :goto_1
    iget-object v15, v12, Lkj0;->i:[Ljava/lang/Object;

    .line 91
    .line 92
    array-length v15, v15

    .line 93
    if-ge v14, v15, :cond_3

    .line 94
    .line 95
    invoke-virtual {v12, v14}, Lkj0;->e(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v15

    .line 99
    check-cast v15, Lr72;

    .line 100
    .line 101
    invoke-virtual {v15}, Lr72;->f()Z

    .line 102
    .line 103
    .line 104
    move-result v16

    .line 105
    if-eqz v16, :cond_8

    .line 106
    .line 107
    iget v15, v15, Lr72;->h:I

    .line 108
    .line 109
    if-lt v15, v6, :cond_4

    .line 110
    .line 111
    const/16 v16, 0x1

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_4
    move/from16 v16, v5

    .line 115
    .line 116
    :goto_2
    and-int/lit8 v15, v15, 0x1

    .line 117
    .line 118
    if-nez v15, :cond_6

    .line 119
    .line 120
    if-eqz v16, :cond_5

    .line 121
    .line 122
    add-int/lit8 v9, v9, 0x1

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :cond_5
    add-int/lit8 v11, v11, 0x1

    .line 126
    .line 127
    goto :goto_3

    .line 128
    :cond_6
    if-eqz v16, :cond_7

    .line 129
    .line 130
    add-int/lit8 v8, v8, 0x1

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    add-int/lit8 v10, v10, 0x1

    .line 134
    .line 135
    :cond_8
    :goto_3
    add-int/lit8 v14, v14, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_9
    if-le v8, v9, :cond_a

    .line 139
    .line 140
    if-le v10, v11, :cond_a

    .line 141
    .line 142
    invoke-virtual {v1}, Lsd0;->c()V

    .line 143
    .line 144
    .line 145
    goto :goto_4

    .line 146
    :cond_a
    if-le v8, v9, :cond_b

    .line 147
    .line 148
    invoke-virtual {v1}, Lsd0;->b()V

    .line 149
    .line 150
    .line 151
    goto :goto_4

    .line 152
    :cond_b
    if-le v10, v11, :cond_d

    .line 153
    .line 154
    invoke-virtual {v1}, Lsd0;->c()V

    .line 155
    .line 156
    .line 157
    if-eqz v3, :cond_c

    .line 158
    .line 159
    if-le v9, v8, :cond_c

    .line 160
    .line 161
    invoke-virtual {v1}, Lsd0;->b()V

    .line 162
    .line 163
    .line 164
    :cond_c
    :goto_4
    invoke-virtual {v1, v4}, Lsd0;->j([Loa0;)Z

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    if-nez v6, :cond_2

    .line 169
    .line 170
    :cond_d
    iget v3, v1, Lsd0;->c:I

    .line 171
    .line 172
    iget-object v6, v1, Lsd0;->f:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v6, Ljava/util/ArrayList;

    .line 175
    .line 176
    if-nez v3, :cond_10

    .line 177
    .line 178
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    move v6, v5

    .line 183
    :goto_5
    if-ge v6, v3, :cond_f

    .line 184
    .line 185
    iget-object v8, v1, Lsd0;->f:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v8, Ljava/util/ArrayList;

    .line 188
    .line 189
    invoke-virtual {v8, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    check-cast v8, La40;

    .line 194
    .line 195
    iget-object v9, v8, La40;->b:Loa0;

    .line 196
    .line 197
    aget-object v10, v4, v6

    .line 198
    .line 199
    if-eq v9, v10, :cond_e

    .line 200
    .line 201
    iget-object v9, v1, Lsd0;->f:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v9, Ljava/util/ArrayList;

    .line 204
    .line 205
    invoke-virtual {v8, v10}, La40;->i(Loa0;)La40;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-virtual {v9, v6, v8}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_f
    move/from16 v18, v2

    .line 216
    .line 217
    const/16 v16, 0x1

    .line 218
    .line 219
    goto/16 :goto_e

    .line 220
    .line 221
    :cond_10
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    new-instance v6, Ljava/util/ArrayList;

    .line 226
    .line 227
    mul-int/lit8 v8, v3, 0x2

    .line 228
    .line 229
    invoke-direct {v6, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 230
    .line 231
    .line 232
    new-instance v8, Ljava/util/ArrayList;

    .line 233
    .line 234
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 235
    .line 236
    .line 237
    move v9, v5

    .line 238
    :goto_6
    if-ge v9, v3, :cond_20

    .line 239
    .line 240
    iget-object v10, v1, Lsd0;->f:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast v10, Ljava/util/ArrayList;

    .line 243
    .line 244
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v10

    .line 248
    check-cast v10, La40;

    .line 249
    .line 250
    iget-object v11, v10, La40;->b:Loa0;

    .line 251
    .line 252
    iget-object v12, v10, La40;->c:Lkt2;

    .line 253
    .line 254
    iget-object v14, v10, La40;->d:Ls72;

    .line 255
    .line 256
    aget-object v15, v4, v9

    .line 257
    .line 258
    if-eqz v15, :cond_11

    .line 259
    .line 260
    move/from16 v18, v2

    .line 261
    .line 262
    move/from16 v19, v3

    .line 263
    .line 264
    move-object/from16 v20, v4

    .line 265
    .line 266
    move-object/from16 v21, v8

    .line 267
    .line 268
    move/from16 v22, v9

    .line 269
    .line 270
    const/4 v3, 0x0

    .line 271
    const/4 v5, 0x0

    .line 272
    const/16 v16, 0x1

    .line 273
    .line 274
    goto/16 :goto_c

    .line 275
    .line 276
    :cond_11
    invoke-virtual {v1, v10}, Lsd0;->e(La40;)Loa0;

    .line 277
    .line 278
    .line 279
    move-result-object v15

    .line 280
    const/16 v16, 0x1

    .line 281
    .line 282
    iget-object v13, v15, Loa0;->d:Lsp0;

    .line 283
    .line 284
    invoke-virtual {v13, v10}, Lsp0;->x(La40;)Ljava/util/BitSet;

    .line 285
    .line 286
    .line 287
    move-result-object v13

    .line 288
    invoke-virtual {v13, v5}, Ljava/util/BitSet;->get(I)Z

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    move/from16 v18, v2

    .line 293
    .line 294
    iget-boolean v2, v11, Loa0;->e:Z

    .line 295
    .line 296
    if-eqz v2, :cond_12

    .line 297
    .line 298
    invoke-virtual {v13, v5}, Ljava/util/BitSet;->set(I)V

    .line 299
    .line 300
    .line 301
    :cond_12
    iget-object v5, v14, Lkj0;->i:[Ljava/lang/Object;

    .line 302
    .line 303
    move/from16 v19, v3

    .line 304
    .line 305
    array-length v3, v5

    .line 306
    invoke-virtual {v13}, Ljava/util/BitSet;->cardinality()I

    .line 307
    .line 308
    .line 309
    move-result v20

    .line 310
    sub-int v3, v3, v20

    .line 311
    .line 312
    if-nez v3, :cond_14

    .line 313
    .line 314
    sget-object v3, Ls72;->j:Ls72;

    .line 315
    .line 316
    move-object/from16 v20, v4

    .line 317
    .line 318
    move-object/from16 v21, v8

    .line 319
    .line 320
    move/from16 v22, v9

    .line 321
    .line 322
    move-object v4, v3

    .line 323
    :cond_13
    const/4 v3, 0x0

    .line 324
    goto :goto_8

    .line 325
    :cond_14
    move-object/from16 v20, v4

    .line 326
    .line 327
    new-instance v4, Ls72;

    .line 328
    .line 329
    invoke-direct {v4, v3}, Lkj0;-><init>(I)V

    .line 330
    .line 331
    .line 332
    move-object/from16 v21, v8

    .line 333
    .line 334
    move/from16 v22, v9

    .line 335
    .line 336
    const/4 v3, 0x0

    .line 337
    const/4 v8, 0x0

    .line 338
    :goto_7
    array-length v9, v5

    .line 339
    if-ge v3, v9, :cond_16

    .line 340
    .line 341
    invoke-virtual {v13, v3}, Ljava/util/BitSet;->get(I)Z

    .line 342
    .line 343
    .line 344
    move-result v9

    .line 345
    if-nez v9, :cond_15

    .line 346
    .line 347
    invoke-virtual {v14, v3}, Lkj0;->e(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v9

    .line 351
    invoke-virtual {v4, v8, v9}, Lkj0;->f(ILjava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    add-int/lit8 v8, v8, 0x1

    .line 355
    .line 356
    :cond_15
    add-int/lit8 v3, v3, 0x1

    .line 357
    .line 358
    goto :goto_7

    .line 359
    :cond_16
    iget-boolean v3, v14, Lvj1;->h:Z

    .line 360
    .line 361
    if-nez v3, :cond_13

    .line 362
    .line 363
    const/4 v3, 0x0

    .line 364
    iput-boolean v3, v4, Lvj1;->h:Z

    .line 365
    .line 366
    :goto_8
    if-eqz v2, :cond_17

    .line 367
    .line 368
    invoke-virtual {v13, v3, v7}, Ljava/util/BitSet;->set(IZ)V

    .line 369
    .line 370
    .line 371
    :cond_17
    iget-object v5, v4, Lkj0;->i:[Ljava/lang/Object;

    .line 372
    .line 373
    array-length v5, v5

    .line 374
    if-nez v5, :cond_18

    .line 375
    .line 376
    const/4 v5, 0x0

    .line 377
    goto :goto_9

    .line 378
    :cond_18
    new-instance v5, Lss0;

    .line 379
    .line 380
    invoke-direct {v5, v12, v4}, Lss0;-><init>(Lkt2;Ls72;)V

    .line 381
    .line 382
    .line 383
    :goto_9
    if-eqz v2, :cond_1a

    .line 384
    .line 385
    invoke-virtual {v13, v3}, Ljava/util/BitSet;->get(I)Z

    .line 386
    .line 387
    .line 388
    move-result v4

    .line 389
    if-nez v4, :cond_1a

    .line 390
    .line 391
    invoke-virtual {v14, v3}, Lkj0;->e(I)Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v4

    .line 395
    check-cast v4, Lr72;

    .line 396
    .line 397
    iget v7, v4, Lr72;->h:I

    .line 398
    .line 399
    if-nez v7, :cond_19

    .line 400
    .line 401
    move-object v7, v4

    .line 402
    goto :goto_a

    .line 403
    :cond_19
    iget-object v7, v4, Lr72;->i:Lw53;

    .line 404
    .line 405
    invoke-static {v3, v7}, Lr72;->e(ILw53;)Lr72;

    .line 406
    .line 407
    .line 408
    move-result-object v7

    .line 409
    :goto_a
    invoke-static {v12, v4, v7}, La40;->h(Lkt2;Lr72;Lr72;)Lwq2;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    goto :goto_b

    .line 414
    :cond_1a
    const/4 v3, 0x0

    .line 415
    :goto_b
    invoke-virtual {v14, v2, v13}, Ls72;->j(ZLjava/util/BitSet;)Ls72;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    invoke-virtual {v10, v2}, La40;->k(Ls72;)La40;

    .line 420
    .line 421
    .line 422
    move-result-object v10

    .line 423
    :goto_c
    if-eqz v5, :cond_1b

    .line 424
    .line 425
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    :cond_1b
    instance-of v2, v10, Lqg3;

    .line 429
    .line 430
    if-nez v2, :cond_1d

    .line 431
    .line 432
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->size()I

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    if-lez v2, :cond_1d

    .line 437
    .line 438
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 443
    .line 444
    .line 445
    move-result v4

    .line 446
    if-eqz v4, :cond_1c

    .line 447
    .line 448
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v4

    .line 452
    check-cast v4, Lxt;

    .line 453
    .line 454
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    goto :goto_d

    .line 458
    :cond_1c
    invoke-virtual/range {v21 .. v21}, Ljava/util/ArrayList;->clear()V

    .line 459
    .line 460
    .line 461
    :cond_1d
    if-eq v15, v11, :cond_1e

    .line 462
    .line 463
    invoke-virtual {v10, v15}, La40;->i(Loa0;)La40;

    .line 464
    .line 465
    .line 466
    move-result-object v10

    .line 467
    :cond_1e
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 468
    .line 469
    .line 470
    if-eqz v3, :cond_1f

    .line 471
    .line 472
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    :cond_1f
    add-int/lit8 v9, v22, 0x1

    .line 476
    .line 477
    move/from16 v2, v18

    .line 478
    .line 479
    move/from16 v3, v19

    .line 480
    .line 481
    move-object/from16 v4, v20

    .line 482
    .line 483
    move-object/from16 v8, v21

    .line 484
    .line 485
    const/4 v5, 0x0

    .line 486
    goto/16 :goto_6

    .line 487
    .line 488
    :cond_20
    move/from16 v18, v2

    .line 489
    .line 490
    const/16 v16, 0x1

    .line 491
    .line 492
    iput-object v6, v1, Lsd0;->f:Ljava/lang/Object;

    .line 493
    .line 494
    :cond_21
    :goto_e
    iget-object v2, v1, Lsd0;->f:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v2, Ljava/util/ArrayList;

    .line 497
    .line 498
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 499
    .line 500
    .line 501
    move-result v2

    .line 502
    const/4 v3, 0x0

    .line 503
    const/4 v4, 0x0

    .line 504
    :goto_f
    iget-object v5, v1, Lsd0;->f:Ljava/lang/Object;

    .line 505
    .line 506
    check-cast v5, Ljava/util/ArrayList;

    .line 507
    .line 508
    if-ge v3, v2, :cond_23

    .line 509
    .line 510
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v5

    .line 514
    check-cast v5, La40;

    .line 515
    .line 516
    if-ltz v4, :cond_22

    .line 517
    .line 518
    iput v4, v5, La40;->a:I

    .line 519
    .line 520
    invoke-virtual {v5}, La40;->b()I

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    add-int/2addr v4, v5

    .line 525
    add-int/lit8 v3, v3, 0x1

    .line 526
    .line 527
    goto :goto_f

    .line 528
    :cond_22
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    const-string v0, "address < 0"

    .line 532
    .line 533
    invoke-static {v0}, Ls;->j(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    return-void

    .line 537
    :cond_23
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 538
    .line 539
    .line 540
    move-result v2

    .line 541
    const/4 v3, 0x0

    .line 542
    const/4 v4, 0x0

    .line 543
    :goto_10
    if-ge v3, v2, :cond_28

    .line 544
    .line 545
    iget-object v5, v1, Lsd0;->f:Ljava/lang/Object;

    .line 546
    .line 547
    check-cast v5, Ljava/util/ArrayList;

    .line 548
    .line 549
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v5

    .line 553
    check-cast v5, La40;

    .line 554
    .line 555
    instance-of v6, v5, Ldy2;

    .line 556
    .line 557
    if-nez v6, :cond_24

    .line 558
    .line 559
    goto :goto_12

    .line 560
    :cond_24
    iget-object v6, v5, La40;->b:Loa0;

    .line 561
    .line 562
    move-object v7, v5

    .line 563
    check-cast v7, Ldy2;

    .line 564
    .line 565
    iget-object v8, v6, Loa0;->d:Lsp0;

    .line 566
    .line 567
    invoke-virtual {v8, v7}, Lsp0;->r(Ldy2;)Z

    .line 568
    .line 569
    .line 570
    move-result v8

    .line 571
    if-eqz v8, :cond_25

    .line 572
    .line 573
    goto :goto_12

    .line 574
    :cond_25
    iget v4, v6, Loa0;->b:I

    .line 575
    .line 576
    const/16 v8, 0x28

    .line 577
    .line 578
    if-ne v4, v8, :cond_27

    .line 579
    .line 580
    invoke-virtual {v1, v5, v6}, Lsd0;->f(La40;Loa0;)Loa0;

    .line 581
    .line 582
    .line 583
    move-result-object v4

    .line 584
    if-eqz v4, :cond_26

    .line 585
    .line 586
    iget-object v6, v1, Lsd0;->f:Ljava/lang/Object;

    .line 587
    .line 588
    check-cast v6, Ljava/util/ArrayList;

    .line 589
    .line 590
    invoke-virtual {v5, v4}, La40;->i(Loa0;)La40;

    .line 591
    .line 592
    .line 593
    move-result-object v4

    .line 594
    invoke-virtual {v6, v3, v4}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    goto :goto_11

    .line 598
    :cond_26
    const-string v0, "method too long"

    .line 599
    .line 600
    invoke-static {v0}, Lc80;->t(Ljava/lang/String;)V

    .line 601
    .line 602
    .line 603
    return-void

    .line 604
    :cond_27
    :try_start_0
    iget-object v4, v1, Lsd0;->f:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast v4, Ljava/util/ArrayList;

    .line 607
    .line 608
    add-int/lit8 v5, v3, 0x1

    .line 609
    .line 610
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 611
    .line 612
    .line 613
    move-result-object v4

    .line 614
    check-cast v4, Lxt;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 615
    .line 616
    new-instance v6, Ldy2;

    .line 617
    .line 618
    sget-object v8, Lpa0;->I:Loa0;

    .line 619
    .line 620
    iget-object v9, v7, La40;->c:Lkt2;

    .line 621
    .line 622
    sget-object v10, Ls72;->j:Ls72;

    .line 623
    .line 624
    iget-object v11, v7, Ldy2;->e:Lxt;

    .line 625
    .line 626
    invoke-direct {v6, v8, v9, v10, v11}, Ldy2;-><init>(Loa0;Lkt2;Ls72;Lxt;)V

    .line 627
    .line 628
    .line 629
    iget-object v8, v1, Lsd0;->f:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v8, Ljava/util/ArrayList;

    .line 632
    .line 633
    invoke-virtual {v8, v3, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 634
    .line 635
    .line 636
    iget-object v6, v1, Lsd0;->f:Ljava/lang/Object;

    .line 637
    .line 638
    check-cast v6, Ljava/util/ArrayList;

    .line 639
    .line 640
    invoke-virtual {v7, v4}, Ldy2;->o(Lxt;)Ldy2;

    .line 641
    .line 642
    .line 643
    move-result-object v4

    .line 644
    invoke-virtual {v6, v3, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 645
    .line 646
    .line 647
    add-int/lit8 v2, v2, 0x1

    .line 648
    .line 649
    move v3, v5

    .line 650
    :goto_11
    move/from16 v4, v16

    .line 651
    .line 652
    :goto_12
    add-int/lit8 v3, v3, 0x1

    .line 653
    .line 654
    goto :goto_10

    .line 655
    :catch_0
    const-string v0, "unpaired TargetInsn"

    .line 656
    .line 657
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    return-void

    .line 661
    :catch_1
    const-string v0, "unpaired TargetInsn (dangling)"

    .line 662
    .line 663
    invoke-static {v0}, Ls;->l(Ljava/lang/String;)V

    .line 664
    .line 665
    .line 666
    return-void

    .line 667
    :cond_28
    if-nez v4, :cond_21

    .line 668
    .line 669
    iget-object v2, v1, Lsd0;->f:Ljava/lang/Object;

    .line 670
    .line 671
    check-cast v2, Ljava/util/ArrayList;

    .line 672
    .line 673
    iget v3, v1, Lsd0;->c:I

    .line 674
    .line 675
    add-int v3, v3, v18

    .line 676
    .line 677
    iget v1, v1, Lsd0;->d:I

    .line 678
    .line 679
    add-int/2addr v3, v1

    .line 680
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 681
    .line 682
    .line 683
    move-result v1

    .line 684
    new-instance v4, Lb40;

    .line 685
    .line 686
    invoke-direct {v4, v1, v3}, Lb40;-><init>(II)V

    .line 687
    .line 688
    .line 689
    const/4 v3, 0x0

    .line 690
    :goto_13
    if-ge v3, v1, :cond_29

    .line 691
    .line 692
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v5

    .line 696
    check-cast v5, La40;

    .line 697
    .line 698
    invoke-virtual {v4, v3, v5}, Lkj0;->f(ILjava/lang/Object;)V

    .line 699
    .line 700
    .line 701
    add-int/lit8 v3, v3, 0x1

    .line 702
    .line 703
    goto :goto_13

    .line 704
    :cond_29
    const/4 v3, 0x0

    .line 705
    iput-boolean v3, v4, Lvj1;->h:Z

    .line 706
    .line 707
    iput-object v4, v0, Lkj1;->l:Ljava/lang/Object;

    .line 708
    .line 709
    sget v1, Li22;->j:I

    .line 710
    .line 711
    sget v1, Lbc1;->j:I

    .line 712
    .line 713
    iget-object v1, v4, Lkj0;->i:[Ljava/lang/Object;

    .line 714
    .line 715
    array-length v1, v1

    .line 716
    new-instance v2, Lq9;

    .line 717
    .line 718
    invoke-direct {v2, v1}, Lq9;-><init>(I)V

    .line 719
    .line 720
    .line 721
    const/4 v3, 0x0

    .line 722
    :goto_14
    iget-object v5, v2, Lq9;->c:Ljava/lang/Object;

    .line 723
    .line 724
    if-ge v3, v1, :cond_38

    .line 725
    .line 726
    invoke-virtual {v4, v3}, Lkj0;->e(I)Ljava/lang/Object;

    .line 727
    .line 728
    .line 729
    move-result-object v6

    .line 730
    check-cast v6, La40;

    .line 731
    .line 732
    instance-of v7, v6, Lgc1;

    .line 733
    .line 734
    if-nez v7, :cond_37

    .line 735
    .line 736
    instance-of v7, v6, Lhc1;

    .line 737
    .line 738
    if-eqz v7, :cond_2c

    .line 739
    .line 740
    invoke-virtual {v6}, La40;->e()I

    .line 741
    .line 742
    .line 743
    move-result v6

    .line 744
    const/4 v7, 0x0

    .line 745
    iget v8, v7, Lr72;->h:I

    .line 746
    .line 747
    invoke-static {v7}, Lq9;->d(Lr72;)Lr72;

    .line 748
    .line 749
    .line 750
    move-result-object v9

    .line 751
    invoke-virtual {v2, v6, v8}, Lq9;->a(II)V

    .line 752
    .line 753
    .line 754
    iget-object v7, v2, Lq9;->d:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v7, Lt72;

    .line 757
    .line 758
    invoke-virtual {v7, v8}, Lt72;->e(I)Lr72;

    .line 759
    .line 760
    .line 761
    move-result-object v7

    .line 762
    if-nez v7, :cond_2a

    .line 763
    .line 764
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    goto :goto_15

    .line 768
    :cond_2a
    iget-object v10, v9, Lr72;->i:Lw53;

    .line 769
    .line 770
    invoke-interface {v10}, Lw53;->a()Lo43;

    .line 771
    .line 772
    .line 773
    move-result-object v10

    .line 774
    iget-object v11, v7, Lr72;->i:Lw53;

    .line 775
    .line 776
    invoke-interface {v11}, Lw53;->a()Lo43;

    .line 777
    .line 778
    .line 779
    move-result-object v11

    .line 780
    invoke-virtual {v10, v11}, Lo43;->equals(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    move-result v10

    .line 784
    if-eqz v10, :cond_2b

    .line 785
    .line 786
    iget v10, v9, Lr72;->h:I

    .line 787
    .line 788
    iget v11, v7, Lr72;->h:I

    .line 789
    .line 790
    if-ne v10, v11, :cond_2b

    .line 791
    .line 792
    move/from16 v10, v16

    .line 793
    .line 794
    goto :goto_16

    .line 795
    :cond_2b
    :goto_15
    const/4 v10, 0x0

    .line 796
    :goto_16
    if-eqz v10, :cond_2d

    .line 797
    .line 798
    :cond_2c
    move/from16 v5, v16

    .line 799
    .line 800
    const/16 v17, 0x0

    .line 801
    .line 802
    goto/16 :goto_1b

    .line 803
    .line 804
    :cond_2d
    iget-object v0, v2, Lq9;->d:Ljava/lang/Object;

    .line 805
    .line 806
    check-cast v0, Lt72;

    .line 807
    .line 808
    iget-object v0, v0, Lt72;->i:[Lr72;

    .line 809
    .line 810
    array-length v1, v0

    .line 811
    const/4 v3, 0x0

    .line 812
    :goto_17
    if-ge v3, v1, :cond_30

    .line 813
    .line 814
    aget-object v4, v0, v3

    .line 815
    .line 816
    if-nez v4, :cond_2e

    .line 817
    .line 818
    goto :goto_18

    .line 819
    :cond_2e
    iget-object v10, v9, Lr72;->i:Lw53;

    .line 820
    .line 821
    invoke-interface {v10}, Lw53;->a()Lo43;

    .line 822
    .line 823
    .line 824
    move-result-object v10

    .line 825
    iget-object v11, v4, Lr72;->i:Lw53;

    .line 826
    .line 827
    invoke-interface {v11}, Lw53;->a()Lo43;

    .line 828
    .line 829
    .line 830
    move-result-object v11

    .line 831
    invoke-virtual {v10, v11}, Lo43;->equals(Ljava/lang/Object;)Z

    .line 832
    .line 833
    .line 834
    move-result v10

    .line 835
    if-eqz v10, :cond_2f

    .line 836
    .line 837
    goto :goto_19

    .line 838
    :cond_2f
    :goto_18
    add-int/lit8 v3, v3, 0x1

    .line 839
    .line 840
    goto :goto_17

    .line 841
    :cond_30
    const/4 v4, 0x0

    .line 842
    :goto_19
    if-eqz v4, :cond_31

    .line 843
    .line 844
    const/4 v0, 0x4

    .line 845
    invoke-virtual {v2, v6, v0, v4}, Lq9;->c(IILr72;)V

    .line 846
    .line 847
    .line 848
    :cond_31
    iget-object v0, v2, Lq9;->e:Ljava/lang/Object;

    .line 849
    .line 850
    check-cast v0, [I

    .line 851
    .line 852
    aget v0, v0, v8

    .line 853
    .line 854
    if-nez v7, :cond_36

    .line 855
    .line 856
    if-ltz v0, :cond_33

    .line 857
    .line 858
    check-cast v5, Ljava/util/ArrayList;

    .line 859
    .line 860
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 861
    .line 862
    .line 863
    move-result-object v0

    .line 864
    check-cast v0, Lac1;

    .line 865
    .line 866
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 867
    .line 868
    .line 869
    if-eqz v6, :cond_32

    .line 870
    .line 871
    goto :goto_1a

    .line 872
    :cond_32
    const/16 v17, 0x0

    .line 873
    .line 874
    throw v17

    .line 875
    :cond_33
    :goto_1a
    if-lez v8, :cond_34

    .line 876
    .line 877
    iget-object v0, v2, Lq9;->d:Ljava/lang/Object;

    .line 878
    .line 879
    check-cast v0, Lt72;

    .line 880
    .line 881
    add-int/lit8 v1, v8, -0x1

    .line 882
    .line 883
    invoke-virtual {v0, v1}, Lt72;->e(I)Lr72;

    .line 884
    .line 885
    .line 886
    move-result-object v0

    .line 887
    if-eqz v0, :cond_34

    .line 888
    .line 889
    invoke-virtual {v0}, Lr72;->f()Z

    .line 890
    .line 891
    .line 892
    move-result v1

    .line 893
    if-eqz v1, :cond_34

    .line 894
    .line 895
    const/4 v1, 0x6

    .line 896
    invoke-virtual {v2, v6, v1, v0}, Lq9;->c(IILr72;)V

    .line 897
    .line 898
    .line 899
    :cond_34
    invoke-virtual {v9}, Lr72;->f()Z

    .line 900
    .line 901
    .line 902
    move-result v0

    .line 903
    if-eqz v0, :cond_35

    .line 904
    .line 905
    iget-object v0, v2, Lq9;->d:Ljava/lang/Object;

    .line 906
    .line 907
    check-cast v0, Lt72;

    .line 908
    .line 909
    add-int/lit8 v8, v8, 0x1

    .line 910
    .line 911
    invoke-virtual {v0, v8}, Lt72;->e(I)Lr72;

    .line 912
    .line 913
    .line 914
    move-result-object v0

    .line 915
    if-eqz v0, :cond_35

    .line 916
    .line 917
    const/4 v1, 0x5

    .line 918
    invoke-virtual {v2, v6, v1, v0}, Lq9;->c(IILr72;)V

    .line 919
    .line 920
    .line 921
    :cond_35
    move/from16 v5, v16

    .line 922
    .line 923
    invoke-static {v6, v5, v9}, Lq9;->b(IILr72;)V

    .line 924
    .line 925
    .line 926
    const/16 v17, 0x0

    .line 927
    .line 928
    throw v17

    .line 929
    :cond_36
    const/16 v17, 0x0

    .line 930
    .line 931
    const/4 v0, 0x3

    .line 932
    invoke-static {v6, v0, v7}, Lq9;->b(IILr72;)V

    .line 933
    .line 934
    .line 935
    throw v17

    .line 936
    :goto_1b
    add-int/lit8 v3, v3, 0x1

    .line 937
    .line 938
    move/from16 v16, v5

    .line 939
    .line 940
    goto/16 :goto_14

    .line 941
    .line 942
    :cond_37
    const/16 v17, 0x0

    .line 943
    .line 944
    invoke-virtual {v6}, La40;->e()I

    .line 945
    .line 946
    .line 947
    throw v17

    .line 948
    :cond_38
    const v1, 0x7fffffff

    .line 949
    .line 950
    .line 951
    const/4 v3, 0x0

    .line 952
    invoke-virtual {v2, v1, v3}, Lq9;->a(II)V

    .line 953
    .line 954
    .line 955
    check-cast v5, Ljava/util/ArrayList;

    .line 956
    .line 957
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 958
    .line 959
    .line 960
    move-result v1

    .line 961
    iget v2, v2, Lq9;->b:I

    .line 962
    .line 963
    sub-int v2, v1, v2

    .line 964
    .line 965
    if-nez v2, :cond_39

    .line 966
    .line 967
    sget v1, Lbc1;->j:I

    .line 968
    .line 969
    goto :goto_1f

    .line 970
    :cond_39
    new-array v3, v2, [Lac1;

    .line 971
    .line 972
    if-ne v1, v2, :cond_3a

    .line 973
    .line 974
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 975
    .line 976
    .line 977
    goto :goto_1d

    .line 978
    :cond_3a
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 979
    .line 980
    .line 981
    move-result-object v1

    .line 982
    :goto_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 983
    .line 984
    .line 985
    move-result v4

    .line 986
    if-eqz v4, :cond_3b

    .line 987
    .line 988
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 989
    .line 990
    .line 991
    move-result-object v4

    .line 992
    check-cast v4, Lac1;

    .line 993
    .line 994
    goto :goto_1c

    .line 995
    :cond_3b
    :goto_1d
    invoke-static {v3}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 996
    .line 997
    .line 998
    new-instance v1, Lbc1;

    .line 999
    .line 1000
    invoke-direct {v1, v2}, Lkj0;-><init>(I)V

    .line 1001
    .line 1002
    .line 1003
    const/4 v4, 0x0

    .line 1004
    :goto_1e
    if-ge v4, v2, :cond_3c

    .line 1005
    .line 1006
    aget-object v5, v3, v4

    .line 1007
    .line 1008
    const/4 v7, 0x0

    .line 1009
    invoke-virtual {v1, v4, v7}, Lkj0;->f(ILjava/lang/Object;)V

    .line 1010
    .line 1011
    .line 1012
    add-int/lit8 v4, v4, 0x1

    .line 1013
    .line 1014
    goto :goto_1e

    .line 1015
    :cond_3c
    const/4 v4, 0x0

    .line 1016
    iput-boolean v4, v1, Lvj1;->h:Z

    .line 1017
    .line 1018
    :goto_1f
    iget-object v1, v0, Lkj1;->j:Ljava/lang/Object;

    .line 1019
    .line 1020
    check-cast v1, Lvu2;

    .line 1021
    .line 1022
    iget-object v2, v1, Lvu2;->a:Ljava/lang/Object;

    .line 1023
    .line 1024
    check-cast v2, Lb5;

    .line 1025
    .line 1026
    iget-object v3, v1, Lvu2;->b:Ljava/lang/Object;

    .line 1027
    .line 1028
    check-cast v3, [I

    .line 1029
    .line 1030
    iget-object v1, v1, Lvu2;->c:Ljava/lang/Object;

    .line 1031
    .line 1032
    check-cast v1, Lb5;

    .line 1033
    .line 1034
    array-length v4, v3

    .line 1035
    iget-object v2, v2, Lb5;->i:Ljava/lang/Object;

    .line 1036
    .line 1037
    check-cast v2, Lbk;

    .line 1038
    .line 1039
    new-instance v5, Ljava/util/ArrayList;

    .line 1040
    .line 1041
    invoke-direct {v5, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 1042
    .line 1043
    .line 1044
    sget-object v6, Lwp;->j:Lwp;

    .line 1045
    .line 1046
    move-object v7, v6

    .line 1047
    const/4 v6, 0x0

    .line 1048
    const/4 v8, 0x0

    .line 1049
    const/4 v9, 0x0

    .line 1050
    :goto_20
    if-ge v6, v4, :cond_49

    .line 1051
    .line 1052
    aget v10, v3, v6

    .line 1053
    .line 1054
    invoke-virtual {v2, v10}, Lbk;->i(I)Lzj;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v10

    .line 1058
    iget-object v11, v10, Lzj;->b:Lj01;

    .line 1059
    .line 1060
    invoke-virtual {v11}, Lj01;->h()Li01;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v12

    .line 1064
    iget-object v12, v12, Li01;->h:Lza2;

    .line 1065
    .line 1066
    iget-object v12, v12, Lza2;->d:Ld63;

    .line 1067
    .line 1068
    check-cast v12, Lkj0;

    .line 1069
    .line 1070
    iget-object v12, v12, Lkj0;->i:[Ljava/lang/Object;

    .line 1071
    .line 1072
    array-length v12, v12

    .line 1073
    if-eqz v12, :cond_48

    .line 1074
    .line 1075
    iget-object v12, v10, Lzj;->c:Lv01;

    .line 1076
    .line 1077
    iget v13, v12, Lv01;->j:I

    .line 1078
    .line 1079
    iget v14, v10, Lzj;->d:I

    .line 1080
    .line 1081
    invoke-virtual {v11}, Lj01;->h()Li01;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v11

    .line 1085
    invoke-virtual {v11}, Li01;->e()Ld63;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v11

    .line 1089
    move-object v15, v11

    .line 1090
    check-cast v15, Lkj0;

    .line 1091
    .line 1092
    iget-object v15, v15, Lkj0;->i:[Ljava/lang/Object;

    .line 1093
    .line 1094
    array-length v15, v15

    .line 1095
    if-nez v15, :cond_3d

    .line 1096
    .line 1097
    sget-object v11, Lwp;->j:Lwp;

    .line 1098
    .line 1099
    move-object/from16 v16, v2

    .line 1100
    .line 1101
    move-object/from16 v18, v3

    .line 1102
    .line 1103
    move/from16 v19, v4

    .line 1104
    .line 1105
    goto/16 :goto_25

    .line 1106
    .line 1107
    :cond_3d
    move-object/from16 v16, v2

    .line 1108
    .line 1109
    const/4 v2, -0x1

    .line 1110
    if-ne v14, v2, :cond_3e

    .line 1111
    .line 1112
    if-ne v13, v15, :cond_3f

    .line 1113
    .line 1114
    :cond_3e
    if-eq v14, v2, :cond_40

    .line 1115
    .line 1116
    add-int/lit8 v2, v15, 0x1

    .line 1117
    .line 1118
    if-ne v13, v2, :cond_3f

    .line 1119
    .line 1120
    invoke-virtual {v12, v15}, Lv01;->f(I)I

    .line 1121
    .line 1122
    .line 1123
    move-result v2

    .line 1124
    if-ne v14, v2, :cond_3f

    .line 1125
    .line 1126
    goto :goto_21

    .line 1127
    :cond_3f
    const-string v0, "shouldn\'t happen: weird successors list"

    .line 1128
    .line 1129
    invoke-static {v0}, Lc80;->j(Ljava/lang/String;)V

    .line 1130
    .line 1131
    .line 1132
    return-void

    .line 1133
    :cond_40
    :goto_21
    const/4 v2, 0x0

    .line 1134
    :goto_22
    if-ge v2, v15, :cond_42

    .line 1135
    .line 1136
    invoke-interface {v11, v2}, Ld63;->getType(I)Lo43;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v13

    .line 1140
    sget-object v14, Lo43;->B:Lo43;

    .line 1141
    .line 1142
    invoke-virtual {v13, v14}, Lo43;->equals(Ljava/lang/Object;)Z

    .line 1143
    .line 1144
    .line 1145
    move-result v13

    .line 1146
    if-eqz v13, :cond_41

    .line 1147
    .line 1148
    add-int/lit8 v15, v2, 0x1

    .line 1149
    .line 1150
    goto :goto_23

    .line 1151
    :cond_41
    add-int/lit8 v2, v2, 0x1

    .line 1152
    .line 1153
    goto :goto_22

    .line 1154
    :cond_42
    :goto_23
    new-instance v2, Lwp;

    .line 1155
    .line 1156
    invoke-direct {v2, v15}, Lkj0;-><init>(I)V

    .line 1157
    .line 1158
    .line 1159
    const/4 v13, 0x0

    .line 1160
    :goto_24
    if-ge v13, v15, :cond_43

    .line 1161
    .line 1162
    new-instance v14, Lr30;

    .line 1163
    .line 1164
    move-object/from16 v18, v3

    .line 1165
    .line 1166
    invoke-interface {v11, v13}, Ld63;->getType(I)Lo43;

    .line 1167
    .line 1168
    .line 1169
    move-result-object v3

    .line 1170
    invoke-direct {v14, v3}, Lr30;-><init>(Lo43;)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v12, v13}, Lv01;->f(I)I

    .line 1174
    .line 1175
    .line 1176
    move-result v3

    .line 1177
    move/from16 v19, v3

    .line 1178
    .line 1179
    iget-object v3, v1, Lb5;->i:Ljava/lang/Object;

    .line 1180
    .line 1181
    check-cast v3, [Lxt;

    .line 1182
    .line 1183
    aget-object v3, v3, v19

    .line 1184
    .line 1185
    invoke-virtual {v3}, La40;->e()I

    .line 1186
    .line 1187
    .line 1188
    move-result v3

    .line 1189
    move/from16 v19, v4

    .line 1190
    .line 1191
    new-instance v4, Lvp;

    .line 1192
    .line 1193
    invoke-direct {v4, v14, v3}, Lvp;-><init>(Lr30;I)V

    .line 1194
    .line 1195
    .line 1196
    invoke-virtual {v2, v13, v4}, Lkj0;->f(ILjava/lang/Object;)V

    .line 1197
    .line 1198
    .line 1199
    add-int/lit8 v13, v13, 0x1

    .line 1200
    .line 1201
    move-object/from16 v3, v18

    .line 1202
    .line 1203
    move/from16 v4, v19

    .line 1204
    .line 1205
    goto :goto_24

    .line 1206
    :cond_43
    move-object/from16 v18, v3

    .line 1207
    .line 1208
    move/from16 v19, v4

    .line 1209
    .line 1210
    const/4 v3, 0x0

    .line 1211
    iput-boolean v3, v2, Lvj1;->h:Z

    .line 1212
    .line 1213
    move-object v11, v2

    .line 1214
    :goto_25
    iget-object v2, v7, Lkj0;->i:[Ljava/lang/Object;

    .line 1215
    .line 1216
    array-length v2, v2

    .line 1217
    if-nez v2, :cond_44

    .line 1218
    .line 1219
    goto :goto_26

    .line 1220
    :cond_44
    invoke-virtual {v7, v11}, Lkj0;->equals(Ljava/lang/Object;)Z

    .line 1221
    .line 1222
    .line 1223
    move-result v2

    .line 1224
    if-eqz v2, :cond_46

    .line 1225
    .line 1226
    if-eqz v8, :cond_45

    .line 1227
    .line 1228
    iget-object v2, v1, Lb5;->j:Ljava/lang/Object;

    .line 1229
    .line 1230
    check-cast v2, [Lxt;

    .line 1231
    .line 1232
    iget v3, v8, Lzj;->a:I

    .line 1233
    .line 1234
    aget-object v2, v2, v3

    .line 1235
    .line 1236
    invoke-virtual {v2}, La40;->e()I

    .line 1237
    .line 1238
    .line 1239
    move-result v2

    .line 1240
    iget-object v3, v1, Lb5;->k:Ljava/lang/Object;

    .line 1241
    .line 1242
    check-cast v3, [Lxt;

    .line 1243
    .line 1244
    iget v4, v10, Lzj;->a:I

    .line 1245
    .line 1246
    aget-object v3, v3, v4

    .line 1247
    .line 1248
    invoke-virtual {v3}, La40;->e()I

    .line 1249
    .line 1250
    .line 1251
    move-result v3

    .line 1252
    sub-int/2addr v3, v2

    .line 1253
    const v2, 0xffff

    .line 1254
    .line 1255
    .line 1256
    if-gt v3, v2, :cond_46

    .line 1257
    .line 1258
    move-object v9, v10

    .line 1259
    goto :goto_27

    .line 1260
    :cond_45
    const-string v0, "start == null"

    .line 1261
    .line 1262
    invoke-static {v0}, Lum2;->f(Ljava/lang/String;)V

    .line 1263
    .line 1264
    .line 1265
    return-void

    .line 1266
    :cond_46
    iget-object v2, v7, Lkj0;->i:[Ljava/lang/Object;

    .line 1267
    .line 1268
    array-length v2, v2

    .line 1269
    if-eqz v2, :cond_47

    .line 1270
    .line 1271
    iget-object v2, v1, Lb5;->j:Ljava/lang/Object;

    .line 1272
    .line 1273
    check-cast v2, [Lxt;

    .line 1274
    .line 1275
    iget v3, v8, Lzj;->a:I

    .line 1276
    .line 1277
    aget-object v2, v2, v3

    .line 1278
    .line 1279
    iget-object v3, v1, Lb5;->k:Ljava/lang/Object;

    .line 1280
    .line 1281
    check-cast v3, [Lxt;

    .line 1282
    .line 1283
    iget v4, v9, Lzj;->a:I

    .line 1284
    .line 1285
    aget-object v3, v3, v4

    .line 1286
    .line 1287
    new-instance v4, Lyp;

    .line 1288
    .line 1289
    invoke-virtual {v2}, La40;->e()I

    .line 1290
    .line 1291
    .line 1292
    move-result v2

    .line 1293
    invoke-virtual {v3}, La40;->e()I

    .line 1294
    .line 1295
    .line 1296
    move-result v3

    .line 1297
    invoke-direct {v4, v2, v3, v7}, Lyp;-><init>(IILwp;)V

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1301
    .line 1302
    .line 1303
    :cond_47
    :goto_26
    move-object v8, v10

    .line 1304
    move-object v9, v8

    .line 1305
    move-object v7, v11

    .line 1306
    goto :goto_27

    .line 1307
    :cond_48
    move-object/from16 v16, v2

    .line 1308
    .line 1309
    move-object/from16 v18, v3

    .line 1310
    .line 1311
    move/from16 v19, v4

    .line 1312
    .line 1313
    :goto_27
    add-int/lit8 v6, v6, 0x1

    .line 1314
    .line 1315
    move-object/from16 v2, v16

    .line 1316
    .line 1317
    move-object/from16 v3, v18

    .line 1318
    .line 1319
    move/from16 v4, v19

    .line 1320
    .line 1321
    goto/16 :goto_20

    .line 1322
    .line 1323
    :cond_49
    iget-object v2, v7, Lkj0;->i:[Ljava/lang/Object;

    .line 1324
    .line 1325
    array-length v2, v2

    .line 1326
    if-eqz v2, :cond_4a

    .line 1327
    .line 1328
    iget-object v2, v1, Lb5;->j:Ljava/lang/Object;

    .line 1329
    .line 1330
    check-cast v2, [Lxt;

    .line 1331
    .line 1332
    iget v3, v8, Lzj;->a:I

    .line 1333
    .line 1334
    aget-object v2, v2, v3

    .line 1335
    .line 1336
    iget-object v1, v1, Lb5;->k:Ljava/lang/Object;

    .line 1337
    .line 1338
    check-cast v1, [Lxt;

    .line 1339
    .line 1340
    iget v3, v9, Lzj;->a:I

    .line 1341
    .line 1342
    aget-object v1, v1, v3

    .line 1343
    .line 1344
    new-instance v3, Lyp;

    .line 1345
    .line 1346
    invoke-virtual {v2}, La40;->e()I

    .line 1347
    .line 1348
    .line 1349
    move-result v2

    .line 1350
    invoke-virtual {v1}, La40;->e()I

    .line 1351
    .line 1352
    .line 1353
    move-result v1

    .line 1354
    invoke-direct {v3, v2, v1, v7}, Lyp;-><init>(IILwp;)V

    .line 1355
    .line 1356
    .line 1357
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1358
    .line 1359
    .line 1360
    :cond_4a
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 1361
    .line 1362
    .line 1363
    move-result v1

    .line 1364
    if-nez v1, :cond_4b

    .line 1365
    .line 1366
    sget-object v1, Lzp;->j:Lzp;

    .line 1367
    .line 1368
    goto :goto_29

    .line 1369
    :cond_4b
    new-instance v2, Lzp;

    .line 1370
    .line 1371
    invoke-direct {v2, v1}, Lkj0;-><init>(I)V

    .line 1372
    .line 1373
    .line 1374
    const/4 v3, 0x0

    .line 1375
    :goto_28
    if-ge v3, v1, :cond_4c

    .line 1376
    .line 1377
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v4

    .line 1381
    check-cast v4, Lyp;

    .line 1382
    .line 1383
    invoke-virtual {v2, v3, v4}, Lkj0;->f(ILjava/lang/Object;)V

    .line 1384
    .line 1385
    .line 1386
    add-int/lit8 v3, v3, 0x1

    .line 1387
    .line 1388
    goto :goto_28

    .line 1389
    :cond_4c
    const/4 v3, 0x0

    .line 1390
    iput-boolean v3, v2, Lvj1;->h:Z

    .line 1391
    .line 1392
    move-object v1, v2

    .line 1393
    :goto_29
    iput-object v1, v0, Lkj1;->k:Ljava/lang/Object;

    .line 1394
    .line 1395
    const/4 v7, 0x0

    .line 1396
    iput-object v7, v0, Lkj1;->i:Ljava/lang/Object;

    .line 1397
    .line 1398
    iput-object v7, v0, Lkj1;->j:Ljava/lang/Object;

    .line 1399
    .line 1400
    return-void

    .line 1401
    :cond_4d
    const-string v0, "already processed"

    .line 1402
    .line 1403
    invoke-static {v0}, Lc80;->t(Ljava/lang/String;)V

    .line 1404
    .line 1405
    .line 1406
    return-void
.end method

.method public declared-synchronized w(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lkj1;->i:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljj1;

    .line 26
    .line 27
    iget-object v3, v2, Ljj1;->b:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    iget-object v3, v2, Ljj1;->a:Ljava/lang/Class;

    .line 36
    .line 37
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    iget-object v2, v2, Ljj1;->b:Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    monitor-exit p0

    .line 52
    return-object v0

    .line 53
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    throw p1
.end method

.method public x()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lbf1;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Lbf1;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lbf1;-><init>(Lkj1;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lbf1;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-object p0
.end method

.method public y()Lr72;
    .locals 2

    .line 1
    iget-object v0, p0, Lkj1;->j:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lzj;

    .line 4
    .line 5
    iget v0, v0, Lzj;->d:I

    .line 6
    .line 7
    if-gez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    iget-object p0, p0, Lkj1;->l:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lbb2;

    .line 13
    .line 14
    iget-object p0, p0, Lbb2;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lb5;

    .line 17
    .line 18
    iget-object p0, p0, Lb5;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Lbk;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Lbk;->i(I)Lzj;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    iget-object p0, p0, Lzj;->b:Lj01;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, v0}, Lkj0;->e(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Li01;

    .line 34
    .line 35
    iget-object v0, p0, Li01;->h:Lza2;

    .line 36
    .line 37
    iget v0, v0, Lza2;->a:I

    .line 38
    .line 39
    const/16 v1, 0x38

    .line 40
    .line 41
    if-eq v0, v1, :cond_1

    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return-object p0

    .line 45
    :cond_1
    iget-object p0, p0, Li01;->j:Lr72;

    .line 46
    .line 47
    return-object p0
.end method

.method public z()Lc11;
    .locals 1

    .line 1
    iget-object p0, p0, Lkj1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/regex/Matcher;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->start()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->end()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    invoke-static {v0, p0}, Lci0;->X(II)Lc11;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
