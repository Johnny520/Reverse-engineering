.class public Lhh1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lqi2;
.implements Lx00;
.implements Lnu;
.implements Lyg0;
.implements Lwe0;
.implements Lga1;
.implements Laa3;
.implements Lya3;


# instance fields
.field public final synthetic h:I

.field public i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(FF)V
    .locals 2

    const/16 v0, 0x19

    iput v0, p0, Lhh1;->h:I

    .line 165
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 166
    new-instance v0, Lwj0;

    const v1, 0x3c23d70a    # 0.01f

    .line 167
    invoke-direct {v0, p1, p2, v1}, Lwj0;-><init>(FFF)V

    .line 168
    iput-object v0, p0, Lhh1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(FFLnd;)V
    .locals 1

    const/16 v0, 0x1b

    iput v0, p0, Lhh1;->h:I

    .line 156
    sget-object v0, Ly93;->a:[I

    if-eqz p3, :cond_0

    .line 157
    new-instance v0, Lhh1;

    invoke-direct {v0, p3, p1, p2}, Lhh1;-><init>(Lnd;FF)V

    goto :goto_0

    .line 158
    :cond_0
    new-instance v0, Lhh1;

    invoke-direct {v0, p1, p2}, Lhh1;-><init>(FF)V

    .line 159
    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 160
    new-instance p1, Lkj1;

    const/16 p2, 0xf

    invoke-direct {p1, p2, v0}, Lkj1;-><init>(ILjava/lang/Object;)V

    iput-object p1, p0, Lhh1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Lhh1;->h:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lfh1;

    .line 10
    .line 11
    const-wide/16 v0, 0x1f4

    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Lwd1;-><init>(J)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lhh1;->i:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Lm60;

    .line 23
    .line 24
    invoke-direct {p1}, Lm60;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lhh1;->i:Ljava/lang/Object;

    .line 28
    .line 29
    return-void

    .line 30
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    .line 32
    .line 33
    new-instance p1, Ljava/util/WeakHashMap;

    .line 34
    .line 35
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    iput-object p1, p0, Lhh1;->i:Ljava/lang/Object;

    .line 43
    .line 44
    return-void

    .line 45
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    new-instance p1, Landroid/graphics/Region;

    .line 49
    .line 50
    invoke-direct {p1}, Landroid/graphics/Region;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lhh1;->i:Ljava/lang/Object;

    .line 54
    .line 55
    return-void

    .line 56
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    .line 58
    .line 59
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-static {p1}, Lop0;->u(Ljava/lang/Object;)Lnx1;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    iput-object p1, p0, Lhh1;->i:Ljava/lang/Object;

    .line 66
    .line 67
    return-void

    .line 68
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 72
    .line 73
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lhh1;->i:Ljava/lang/Object;

    .line 77
    .line 78
    return-void

    .line 79
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 80
    .line 81
    .line 82
    new-instance p1, Lgd1;

    .line 83
    .line 84
    invoke-direct {p1}, Lgd1;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object p1, p0, Lhh1;->i:Ljava/lang/Object;

    .line 88
    .line 89
    return-void

    .line 90
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    .line 92
    .line 93
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 94
    .line 95
    const/16 v0, 0x1c

    .line 96
    .line 97
    if-lt p1, v0, :cond_0

    .line 98
    .line 99
    new-instance p1, Lj51;

    .line 100
    .line 101
    const/16 v0, 0xb

    .line 102
    .line 103
    invoke-direct {p1, v0}, Lj51;-><init>(I)V

    .line 104
    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_0
    new-instance p1, Li51;

    .line 108
    .line 109
    const/16 v0, 0xc

    .line 110
    .line 111
    invoke-direct {p1, v0}, Li51;-><init>(I)V

    .line 112
    .line 113
    .line 114
    :goto_0
    iput-object p1, p0, Lhh1;->i:Ljava/lang/Object;

    .line 115
    .line 116
    return-void

    .line 117
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_6
        0x5 -> :sswitch_5
        0x8 -> :sswitch_4
        0xa -> :sswitch_3
        0xb -> :sswitch_2
        0x14 -> :sswitch_1
        0x1c -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 124
    iput p1, p0, Lhh1;->h:I

    iput-object p2, p0, Lhh1;->i:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IZ)V
    .locals 0

    .line 117
    iput p1, p0, Lhh1;->h:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    const/16 v0, 0x10

    iput v0, p0, Lhh1;->h:I

    .line 125
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 126
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 127
    new-instance v0, Let2;

    const/16 v1, 0xf

    .line 128
    invoke-direct {v0, v1, p1}, Lhh1;-><init>(ILjava/lang/Object;)V

    .line 129
    iput-object p1, v0, Let2;->j:Landroid/view/View;

    .line 130
    iput-object v0, p0, Lhh1;->i:Ljava/lang/Object;

    goto :goto_0

    .line 131
    :cond_0
    new-instance v0, Lhh1;

    const/16 v1, 0xf

    invoke-direct {v0, v1, p1}, Lhh1;-><init>(ILjava/lang/Object;)V

    iput-object v0, p0, Lhh1;->i:Ljava/lang/Object;

    :goto_0
    return-void
.end method

.method public constructor <init>(Le70;)V
    .locals 2

    const/16 v0, 0x11

    iput v0, p0, Lhh1;->h:I

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    new-instance v0, Loj0;

    .line 122
    sget v1, Lot2;->a:F

    .line 123
    invoke-direct {v0, v1, p1}, Loj0;-><init>(FLe70;)V

    iput-object v0, p0, Lhh1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lkj1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lhh1;->h:I

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    iput-object p1, p0, Lhh1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lnd;FF)V
    .locals 5

    const/16 v0, 0x18

    iput v0, p0, Lhh1;->h:I

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    invoke-virtual {p1}, Lnd;->b()I

    move-result v0

    new-array v1, v0, [Lwj0;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 163
    new-instance v3, Lwj0;

    invoke-virtual {p1, v2}, Lnd;->a(I)F

    move-result v4

    invoke-direct {v3, p2, p3, v4}, Lwj0;-><init>(FFF)V

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 164
    :cond_0
    iput-object v1, p0, Lhh1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lvg3;)V
    .locals 9

    const/16 v0, 0x15

    iput v0, p0, Lhh1;->h:I

    .line 152
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 153
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 154
    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    .line 155
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v8, p1

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Lhh1;->i:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>([J)V
    .locals 5

    const/16 v0, 0xe

    iput v0, p0, Lhh1;->h:I

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p1, :cond_4

    .line 133
    array-length v0, p1

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    .line 134
    new-instance v0, Lck1;

    array-length v1, p1

    invoke-direct {v0, v1}, Lck1;-><init>(I)V

    .line 135
    iget v1, v0, Lck1;->b:I

    if-ltz v1, :cond_3

    .line 136
    array-length v2, p1

    if-nez v2, :cond_0

    goto :goto_0

    .line 137
    :cond_0
    array-length v2, p1

    add-int/2addr v2, v1

    .line 138
    iget-object v3, v0, Lck1;->a:[J

    .line 139
    array-length v4, v3

    if-ge v4, v2, :cond_1

    .line 140
    array-length v4, v3

    mul-int/lit8 v4, v4, 0x3

    div-int/lit8 v4, v4, 0x2

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 141
    invoke-static {v3, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v2

    iput-object v2, v0, Lck1;->a:[J

    .line 142
    :cond_1
    iget-object v2, v0, Lck1;->a:[J

    .line 143
    iget v3, v0, Lck1;->b:I

    if-eq v1, v3, :cond_2

    .line 144
    array-length v4, p1

    add-int/2addr v4, v1

    .line 145
    invoke-static {v2, v2, v4, v1, v3}, Lmg;->b0([J[JIII)V

    .line 146
    :cond_2
    array-length v3, p1

    const/4 v4, 0x0

    invoke-static {p1, v2, v1, v4, v3}, Lmg;->b0([J[JIII)V

    .line 147
    iget v1, v0, Lck1;->b:I

    array-length p1, p1

    add-int/2addr v1, p1

    iput v1, v0, Lck1;->b:I

    goto :goto_0

    .line 148
    :cond_3
    const-string p0, ""

    .line 149
    invoke-static {p0}, Ls;->d(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    .line 150
    :cond_4
    new-instance v0, Lck1;

    invoke-direct {v0}, Lck1;-><init>()V

    .line 151
    :goto_0
    iput-object v0, p0, Lhh1;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A()V
    .locals 2

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/View;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "input_method"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-virtual {v0, p0, v1}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 25
    .line 26
    .line 27
    :cond_0
    return-void
.end method

.method public B(Landroid/view/View;IZ)V
    .locals 0

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/autofill/AutofillManager;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/autofill/AutofillManager;->notifyViewVisibilityChanged(Landroid/view/View;IZ)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public C(ILjava/lang/Object;)V
    .locals 3

    .line 1
    packed-switch p1, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, ""

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "RESULT_DELETE_SKIP_FILE_SUCCESS"

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :pswitch_2
    const-string v0, "RESULT_INSTALL_SKIP_FILE_SUCCESS"

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :pswitch_3
    const-string v0, "RESULT_PARSE_EXCEPTION"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :pswitch_4
    const-string v0, "RESULT_IO_EXCEPTION"

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :pswitch_5
    const-string v0, "RESULT_BASELINE_PROFILE_NOT_FOUND"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :pswitch_6
    const-string v0, "RESULT_DESIRED_FORMAT_UNSUPPORTED"

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :pswitch_7
    const-string v0, "RESULT_NOT_WRITABLE"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :pswitch_8
    const-string v0, "RESULT_UNSUPPORTED_ART_VERSION"

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_9
    const-string v0, "RESULT_ALREADY_INSTALLED"

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :pswitch_a
    const-string v0, "RESULT_INSTALL_SUCCESS"

    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x6

    .line 37
    const-string v2, "ProfileInstaller"

    .line 38
    .line 39
    if-eq p1, v1, :cond_0

    .line 40
    .line 41
    const/4 v1, 0x7

    .line 42
    if-eq p1, v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0x8

    .line 45
    .line 46
    if-eq p1, v1, :cond_0

    .line 47
    .line 48
    invoke-static {v2, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    check-cast p2, Ljava/lang/Throwable;

    .line 53
    .line 54
    invoke-static {v2, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 55
    .line 56
    .line 57
    :goto_1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p0, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public D(Ldq1;Lb7;)Ler2;
    .locals 41

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p0

    .line 4
    .line 5
    iget-object v1, v1, Lhh1;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lgd1;

    .line 8
    .line 9
    new-instance v2, Lgd1;

    .line 10
    .line 11
    iget-object v3, v0, Ldq1;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-direct {v2, v4}, Lgd1;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    const/4 v6, 0x0

    .line 27
    :goto_0
    if-ge v6, v4, :cond_4

    .line 28
    .line 29
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    check-cast v7, Lq12;

    .line 34
    .line 35
    iget-wide v8, v7, Lq12;->a:J

    .line 36
    .line 37
    iget-object v10, v1, Lgd1;->i:[J

    .line 38
    .line 39
    iget v11, v1, Lgd1;->k:I

    .line 40
    .line 41
    invoke-static {v10, v11, v8, v9}, Lrg3;->q([JIJ)I

    .line 42
    .line 43
    .line 44
    move-result v10

    .line 45
    if-ltz v10, :cond_0

    .line 46
    .line 47
    iget-object v11, v1, Lgd1;->j:[Ljava/lang/Object;

    .line 48
    .line 49
    aget-object v10, v11, v10

    .line 50
    .line 51
    sget-object v11, Lte;->c:Ljava/lang/Object;

    .line 52
    .line 53
    if-ne v10, v11, :cond_1

    .line 54
    .line 55
    :cond_0
    const/4 v10, 0x0

    .line 56
    :cond_1
    check-cast v10, Lp12;

    .line 57
    .line 58
    if-nez v10, :cond_2

    .line 59
    .line 60
    iget-wide v10, v7, Lq12;->b:J

    .line 61
    .line 62
    iget-wide v12, v7, Lq12;->d:J

    .line 63
    .line 64
    move-wide/from16 v25, v10

    .line 65
    .line 66
    move-wide/from16 v27, v12

    .line 67
    .line 68
    const/16 v29, 0x0

    .line 69
    .line 70
    move-object/from16 v10, p2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    iget-wide v11, v10, Lp12;->a:J

    .line 74
    .line 75
    iget-boolean v13, v10, Lp12;->c:Z

    .line 76
    .line 77
    iget-wide v14, v10, Lp12;->b:J

    .line 78
    .line 79
    move-object/from16 v10, p2

    .line 80
    .line 81
    invoke-virtual {v10, v14, v15}, Lb7;->H(J)J

    .line 82
    .line 83
    .line 84
    move-result-wide v14

    .line 85
    move-wide/from16 v25, v11

    .line 86
    .line 87
    move/from16 v29, v13

    .line 88
    .line 89
    move-wide/from16 v27, v14

    .line 90
    .line 91
    :goto_1
    iget-wide v11, v7, Lq12;->a:J

    .line 92
    .line 93
    new-instance v16, Lo12;

    .line 94
    .line 95
    iget-wide v13, v7, Lq12;->b:J

    .line 96
    .line 97
    move v15, v6

    .line 98
    iget-wide v5, v7, Lq12;->d:J

    .line 99
    .line 100
    move-object/from16 v39, v3

    .line 101
    .line 102
    iget-boolean v3, v7, Lq12;->e:Z

    .line 103
    .line 104
    move/from16 v23, v3

    .line 105
    .line 106
    iget v3, v7, Lq12;->f:F

    .line 107
    .line 108
    move/from16 v24, v3

    .line 109
    .line 110
    iget v3, v7, Lq12;->g:I

    .line 111
    .line 112
    move/from16 v30, v3

    .line 113
    .line 114
    iget-object v3, v7, Lq12;->i:Ljava/util/ArrayList;

    .line 115
    .line 116
    move-object/from16 v31, v3

    .line 117
    .line 118
    move/from16 v40, v4

    .line 119
    .line 120
    iget-wide v3, v7, Lq12;->j:J

    .line 121
    .line 122
    move-wide/from16 v32, v3

    .line 123
    .line 124
    iget v3, v7, Lq12;->k:F

    .line 125
    .line 126
    move/from16 v34, v3

    .line 127
    .line 128
    iget-wide v3, v7, Lq12;->l:J

    .line 129
    .line 130
    move-wide/from16 v35, v3

    .line 131
    .line 132
    iget-wide v3, v7, Lq12;->m:J

    .line 133
    .line 134
    move-wide/from16 v37, v3

    .line 135
    .line 136
    move-wide/from16 v21, v5

    .line 137
    .line 138
    move-wide/from16 v17, v11

    .line 139
    .line 140
    move-wide/from16 v19, v13

    .line 141
    .line 142
    invoke-direct/range {v16 .. v38}, Lo12;-><init>(JJJZFJJZILjava/util/ArrayList;JFJJ)V

    .line 143
    .line 144
    .line 145
    move-object/from16 v5, v16

    .line 146
    .line 147
    move-wide/from16 v3, v17

    .line 148
    .line 149
    invoke-virtual {v2, v3, v4, v5}, Lgd1;->d(JLjava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-boolean v3, v7, Lq12;->e:Z

    .line 153
    .line 154
    if-eqz v3, :cond_3

    .line 155
    .line 156
    new-instance v16, Lp12;

    .line 157
    .line 158
    iget-wide v4, v7, Lq12;->b:J

    .line 159
    .line 160
    iget-wide v6, v7, Lq12;->c:J

    .line 161
    .line 162
    move/from16 v21, v3

    .line 163
    .line 164
    move-wide/from16 v17, v4

    .line 165
    .line 166
    move-wide/from16 v19, v6

    .line 167
    .line 168
    invoke-direct/range {v16 .. v21}, Lp12;-><init>(JJZ)V

    .line 169
    .line 170
    .line 171
    move-object/from16 v3, v16

    .line 172
    .line 173
    invoke-virtual {v1, v8, v9, v3}, Lgd1;->d(JLjava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :cond_3
    invoke-virtual {v1, v8, v9}, Lgd1;->f(J)V

    .line 178
    .line 179
    .line 180
    :goto_2
    add-int/lit8 v6, v15, 0x1

    .line 181
    .line 182
    move-object/from16 v3, v39

    .line 183
    .line 184
    move/from16 v4, v40

    .line 185
    .line 186
    goto/16 :goto_0

    .line 187
    .line 188
    :cond_4
    new-instance v1, Ler2;

    .line 189
    .line 190
    invoke-direct {v1, v2, v0}, Ler2;-><init>(Lgd1;Ldq1;)V

    .line 191
    .line 192
    .line 193
    return-object v1
.end method

.method public E(Lfq;Lxm0;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, Lhh1;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Lsj;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v2, "Called runAndWatch on a manager that has been disposed of"

    .line 13
    .line 14
    invoke-static {v2}, Lj22;->b(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :goto_0
    iget-object v2, v0, Lhh1;->i:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lsj;

    .line 20
    .line 21
    instance-of v3, v2, Lzq2;

    .line 22
    .line 23
    if-eqz v3, :cond_7

    .line 24
    .line 25
    check-cast v2, Lzq2;

    .line 26
    .line 27
    iget-object v3, v2, Lzq2;->m:Lho2;

    .line 28
    .line 29
    if-eqz v3, :cond_7

    .line 30
    .line 31
    invoke-virtual {v3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_7

    .line 36
    .line 37
    new-instance v3, Lqj1;

    .line 38
    .line 39
    invoke-direct {v3}, Lqj1;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-object v4, v2, Lzq2;->m:Lho2;

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string v5, "promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second"

    .line 48
    .line 49
    invoke-static {v5}, Lj22;->b(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_1
    iget-object v5, v2, Lzq2;->k:Lsk1;

    .line 53
    .line 54
    iget-object v6, v3, Lqj1;->j:Ljava/util/ArrayList;

    .line 55
    .line 56
    if-nez v5, :cond_2

    .line 57
    .line 58
    iget-object v5, v2, Lzq2;->i:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v7, Lnj1;

    .line 64
    .line 65
    invoke-direct {v7, v5, v4}, Lnj1;-><init>(Ljava/lang/Object;Lho2;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    goto :goto_5

    .line 72
    :cond_2
    iget-object v7, v5, Lsk1;->b:[Ljava/lang/Object;

    .line 73
    .line 74
    iget-object v5, v5, Lsk1;->a:[J

    .line 75
    .line 76
    array-length v8, v5

    .line 77
    add-int/lit8 v8, v8, -0x2

    .line 78
    .line 79
    if-ltz v8, :cond_6

    .line 80
    .line 81
    const/4 v10, 0x0

    .line 82
    :goto_2
    aget-wide v11, v5, v10

    .line 83
    .line 84
    not-long v13, v11

    .line 85
    const/4 v15, 0x7

    .line 86
    shl-long/2addr v13, v15

    .line 87
    and-long/2addr v13, v11

    .line 88
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    and-long/2addr v13, v15

    .line 94
    cmp-long v13, v13, v15

    .line 95
    .line 96
    if-eqz v13, :cond_5

    .line 97
    .line 98
    sub-int v13, v10, v8

    .line 99
    .line 100
    not-int v13, v13

    .line 101
    ushr-int/lit8 v13, v13, 0x1f

    .line 102
    .line 103
    const/16 v14, 0x8

    .line 104
    .line 105
    rsub-int/lit8 v13, v13, 0x8

    .line 106
    .line 107
    const/4 v15, 0x0

    .line 108
    :goto_3
    if-ge v15, v13, :cond_4

    .line 109
    .line 110
    const-wide/16 v16, 0xff

    .line 111
    .line 112
    and-long v16, v11, v16

    .line 113
    .line 114
    const-wide/16 v18, 0x80

    .line 115
    .line 116
    cmp-long v16, v16, v18

    .line 117
    .line 118
    if-gez v16, :cond_3

    .line 119
    .line 120
    shl-int/lit8 v16, v10, 0x3

    .line 121
    .line 122
    add-int v16, v16, v15

    .line 123
    .line 124
    aget-object v9, v7, v16

    .line 125
    .line 126
    move/from16 v16, v14

    .line 127
    .line 128
    new-instance v14, Lnj1;

    .line 129
    .line 130
    invoke-direct {v14, v9, v4}, Lnj1;-><init>(Ljava/lang/Object;Lho2;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_3
    move/from16 v16, v14

    .line 138
    .line 139
    :goto_4
    shr-long v11, v11, v16

    .line 140
    .line 141
    add-int/lit8 v15, v15, 0x1

    .line 142
    .line 143
    move/from16 v14, v16

    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_4
    move v9, v14

    .line 147
    if-ne v13, v9, :cond_6

    .line 148
    .line 149
    :cond_5
    if-eq v10, v8, :cond_6

    .line 150
    .line 151
    add-int/lit8 v10, v10, 0x1

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_6
    :goto_5
    invoke-virtual {v3}, Lqj1;->d()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2}, Lzq2;->e()V

    .line 158
    .line 159
    .line 160
    iput-object v3, v0, Lhh1;->i:Ljava/lang/Object;

    .line 161
    .line 162
    :cond_7
    iget-object v0, v0, Lhh1;->i:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v0, Lsj;

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0, v1}, Lsj;->i(Lho2;)Lin0;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-static {}, Lds2;->j()Lvr2;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    invoke-virtual {v3, v2}, Lvr2;->u(Lin0;)Lvr2;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v0, v1}, Lsj;->c(Lho2;)V

    .line 182
    .line 183
    .line 184
    :try_start_0
    invoke-virtual {v2}, Lvr2;->j()Lvr2;

    .line 185
    .line 186
    .line 187
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 188
    :try_start_1
    invoke-interface/range {p2 .. p2}, Lxm0;->a()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 192
    :try_start_2
    invoke-static {v1}, Lvr2;->q(Lvr2;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2}, Lvr2;->c()V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Lsj;->d()V

    .line 199
    .line 200
    .line 201
    return-object v3

    .line 202
    :catchall_0
    move-exception v0

    .line 203
    goto :goto_6

    .line 204
    :catchall_1
    move-exception v0

    .line 205
    :try_start_3
    invoke-static {v1}, Lvr2;->q(Lvr2;)V

    .line 206
    .line 207
    .line 208
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 209
    :goto_6
    invoke-virtual {v2}, Lvr2;->c()V

    .line 210
    .line 211
    .line 212
    throw v0
.end method

.method public F(Ld11;)V
    .locals 3

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/graphics/Region;

    .line 4
    .line 5
    iget v0, p1, Ld11;->a:I

    .line 6
    .line 7
    iget v1, p1, Ld11;->b:I

    .line 8
    .line 9
    iget v2, p1, Ld11;->c:I

    .line 10
    .line 11
    iget p1, p1, Ld11;->d:I

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/graphics/Region;->set(IIII)Z

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public G()V
    .locals 2

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/view/View;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->onCheckIsTextEditor()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Landroid/view/View;->findFocus()Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_1

    .line 30
    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 31
    .line 32
    .line 33
    move-object v0, p0

    .line 34
    :goto_1
    if-nez v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    const v0, 0x1020002

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    :cond_3
    if-eqz v0, :cond_4

    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->hasWindowFocus()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_4

    .line 54
    .line 55
    new-instance p0, Lct2;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-direct {p0, v0, v1}, Lct2;-><init>(Landroid/view/View;I)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_2
    return-void
.end method

.method public a()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkj1;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0
.end method

.method public b(Lnd;Lnd;Lnd;)J
    .locals 0

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkj1;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lkj1;->b(Lnd;Lnd;Lnd;)J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    return-wide p0
.end method

.method public c(Ljava/lang/Object;Ljava/io/File;Lov1;)Z
    .locals 4

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    const-string p3, "StreamEncoder"

    .line 4
    .line 5
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Ltd1;

    .line 8
    .line 9
    const/high16 v0, 0x10000

    .line 10
    .line 11
    const-class v1, [B

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, Ltd1;->c(ILjava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, [B

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    const/4 v2, 0x0

    .line 21
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    .line 22
    .line 23
    invoke-direct {v3, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    :goto_0
    :try_start_1
    invoke-virtual {p1, v0}, Ljava/io/InputStream;->read([B)I

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    const/4 v2, -0x1

    .line 31
    if-eq p2, v2, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3, v0, v1, p2}, Ljava/io/OutputStream;->write([BII)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-exception p1

    .line 38
    move-object v2, v3

    .line 39
    goto :goto_3

    .line 40
    :catch_0
    move-exception p1

    .line 41
    move-object v2, v3

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    .line 45
    .line 46
    :try_start_2
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 47
    .line 48
    .line 49
    :catch_1
    invoke-virtual {p0, v0}, Ltd1;->g(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    const/4 v1, 0x1

    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception p1

    .line 55
    goto :goto_3

    .line 56
    :catch_2
    move-exception p1

    .line 57
    :goto_1
    const/4 p2, 0x3

    .line 58
    :try_start_3
    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_1

    .line 63
    .line 64
    const-string p2, "Failed to encode data onto the OutputStream"

    .line 65
    .line 66
    invoke-static {p3, p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 67
    .line 68
    .line 69
    :cond_1
    if-eqz v2, :cond_2

    .line 70
    .line 71
    :try_start_4
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 72
    .line 73
    .line 74
    :catch_3
    :cond_2
    invoke-virtual {p0, v0}, Ltd1;->g(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :goto_2
    return v1

    .line 78
    :goto_3
    if-eqz v2, :cond_3

    .line 79
    .line 80
    :try_start_5
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    .line 81
    .line 82
    .line 83
    :catch_4
    :cond_3
    invoke-virtual {p0, v0}, Ltd1;->g(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    throw p1
.end method

.method public d()J
    .locals 2

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lua2;

    .line 4
    .line 5
    iget-wide v0, p0, Lua2;->b:J

    .line 6
    .line 7
    return-wide v0
.end method

.method public e()Lt52;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lhh1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lx52;

    .line 6
    .line 7
    iget-object v2, v2, Lx52;->k:Ls52;

    .line 8
    .line 9
    iget-boolean v2, v2, Ls52;->x:Z

    .line 10
    .line 11
    if-nez v2, :cond_6

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p0, Lhh1;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lx52;

    .line 16
    .line 17
    invoke-virtual {v2}, Lx52;->b()Ljb2;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Ljb2;->e()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_3

    .line 26
    .line 27
    invoke-interface {v2}, Ljb2;->g()Lib2;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, v3, Lib2;->b:Ljb2;

    .line 32
    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    iget-object v4, v3, Lib2;->c:Ljava/lang/Throwable;

    .line 36
    .line 37
    if-nez v4, :cond_0

    .line 38
    .line 39
    const/4 v4, 0x1

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const/4 v4, 0x0

    .line 42
    :goto_1
    if-eqz v4, :cond_1

    .line 43
    .line 44
    invoke-interface {v2}, Ljb2;->c()Lib2;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception v2

    .line 50
    goto :goto_3

    .line 51
    :cond_1
    :goto_2
    iget-object v4, v3, Lib2;->b:Ljb2;

    .line 52
    .line 53
    iget-object v3, v3, Lib2;->c:Ljava/lang/Throwable;

    .line 54
    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    iget-object v2, p0, Lhh1;->i:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lx52;

    .line 62
    .line 63
    iget-object v2, v2, Lx52;->p:Lag;

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Lag;->addFirst(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    throw v3

    .line 70
    :cond_3
    invoke-interface {v2}, Ljb2;->d()Lt52;

    .line 71
    .line 72
    .line 73
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    return-object p0

    .line 75
    :goto_3
    if-nez v1, :cond_4

    .line 76
    .line 77
    move-object v1, v2

    .line 78
    goto :goto_4

    .line 79
    :cond_4
    invoke-static {v1, v2}, Lfg1;->m(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_4
    iget-object v2, p0, Lhh1;->i:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lx52;

    .line 85
    .line 86
    invoke-virtual {v2, v0}, Lx52;->a(Lt52;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    if-eqz v2, :cond_5

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_5
    throw v1

    .line 94
    :cond_6
    const-string p0, "Canceled"

    .line 95
    .line 96
    invoke-static {p0}, Lc80;->v(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method public i()Lx52;
    .locals 0

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lx52;

    .line 4
    .line 5
    return-object p0
.end method

.method public j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lu92;

    .line 2
    .line 3
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lx00;

    .line 6
    .line 7
    invoke-interface {p0, p1}, Lx00;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Ljava/util/Optional;->ofNullable(Ljava/lang/Object;)Ljava/util/Optional;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public l(Lth2;)Lpi2;
    .locals 9

    .line 1
    iget-object v0, p1, Lth2;->k:Lri2;

    .line 2
    .line 3
    iget-object v1, v0, Lri2;->a:Lji2;

    .line 4
    .line 5
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lkj1;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lkj1;->C(Lth2;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object p1, v1, Lji2;->a:Ljava/util/List;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p1, 0x0

    .line 19
    :goto_0
    if-nez p1, :cond_1

    .line 20
    .line 21
    sget-object p1, Lbe0;->h:Lbe0;

    .line 22
    .line 23
    :cond_1
    invoke-static {p1}, Ldu;->K0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const/4 p1, 0x0

    .line 28
    const/4 v2, 0x1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    iget-boolean v4, v1, Lji2;->b:Z

    .line 32
    .line 33
    if-ne v4, v2, :cond_2

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    if-eqz v1, :cond_3

    .line 37
    .line 38
    iget-boolean v4, v1, Lji2;->c:Z

    .line 39
    .line 40
    if-ne v4, v2, :cond_3

    .line 41
    .line 42
    :goto_1
    move v4, v2

    .line 43
    goto :goto_2

    .line 44
    :cond_3
    move v4, p1

    .line 45
    :goto_2
    if-eqz v1, :cond_4

    .line 46
    .line 47
    iget-boolean v1, v1, Lji2;->c:Z

    .line 48
    .line 49
    if-ne v1, v2, :cond_4

    .line 50
    .line 51
    move v5, v2

    .line 52
    goto :goto_3

    .line 53
    :cond_4
    move v5, p1

    .line 54
    :goto_3
    iget-object v1, v0, Lri2;->c:Lch2;

    .line 55
    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    iget-boolean v6, v1, Lch2;->a:Z

    .line 59
    .line 60
    if-ne v6, v2, :cond_5

    .line 61
    .line 62
    move v7, v2

    .line 63
    goto :goto_4

    .line 64
    :cond_5
    move v7, p1

    .line 65
    :goto_4
    if-eqz p0, :cond_6

    .line 66
    .line 67
    iget-object v0, v0, Lri2;->b:Lkh2;

    .line 68
    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    iget-boolean v0, v0, Lkh2;->a:Z

    .line 72
    .line 73
    if-ne v0, v2, :cond_6

    .line 74
    .line 75
    move v6, v2

    .line 76
    goto :goto_5

    .line 77
    :cond_6
    move v6, p1

    .line 78
    :goto_5
    if-eqz p0, :cond_7

    .line 79
    .line 80
    if-eqz v1, :cond_7

    .line 81
    .line 82
    iget-boolean p0, v1, Lch2;->b:Z

    .line 83
    .line 84
    if-ne p0, v2, :cond_7

    .line 85
    .line 86
    move v8, v2

    .line 87
    goto :goto_6

    .line 88
    :cond_7
    move v8, p1

    .line 89
    :goto_6
    new-instance v2, Lpi2;

    .line 90
    .line 91
    invoke-direct/range {v2 .. v8}, Lpi2;-><init>(Ljava/util/Set;ZZZZZ)V

    .line 92
    .line 93
    .line 94
    return-object v2
.end method

.method public n(Lo2;)Lxm0;
    .locals 2

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lba1;

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Lla1;

    .line 7
    .line 8
    iget-object v0, v0, Lla1;->h:Laa1;

    .line 9
    .line 10
    sget-object v1, Laa1;->h:Laa1;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-lez v0, :cond_0

    .line 17
    .line 18
    new-instance v0, Llg1;

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    invoke-direct {v0, v1, p1}, Llg1;-><init>(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lba1;->a(Lha1;)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lt6;

    .line 28
    .line 29
    const/16 v1, 0xa

    .line 30
    .line 31
    invoke-direct {p1, v1, p0, v0}, Lt6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "Cannot configure "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p1, " to disposeComposition at Lifecycle ON_DESTROY: "

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string p0, "is already destroyed"

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw p1
.end method

.method public q(JLnd;Lnd;Lnd;)Lnd;
    .locals 6

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lkj1;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lkj1;->q(JLnd;Lnd;Lnd;)Lnd;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public s(JLnd;Lnd;Lnd;)Lnd;
    .locals 6

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lkj1;

    .line 5
    .line 6
    move-wide v1, p1

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lkj1;->s(JLnd;Lnd;Lnd;)Lnd;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public t(Lnd;Lnd;Lnd;)Lnd;
    .locals 0

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lkj1;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lkj1;->t(Lnd;Lnd;Lnd;)Lnd;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lhh1;->h:I

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "<"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    const/16 v1, 0x3e

    .line 23
    .line 24
    invoke-static {v0, p0, v1}, Lhk1;->i(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
    .end packed-switch
.end method

.method public x()V
    .locals 1

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/Set;

    .line 4
    .line 5
    invoke-static {p0}, Lb93;->e(Ljava/util/Collection;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Lby2;

    .line 24
    .line 25
    invoke-interface {v0}, Lga1;->x()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public y(J)J
    .locals 2

    .line 1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lm60;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p1, p2}, Lda3;->b(J)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    cmpl-float v0, v0, v1

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    invoke-static {p1, p2}, Lda3;->c(J)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    cmpl-float v0, v0, v1

    .line 22
    .line 23
    if-lez v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, "maximumVelocity should be a positive value. You specified="

    .line 29
    .line 30
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Lda3;->f(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v0}, Lkz0;->b(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    iget-object v0, p0, Lm60;->a:Lbb2;

    .line 48
    .line 49
    invoke-static {p1, p2}, Lda3;->b(J)F

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-virtual {v0, v1}, Lbb2;->b(F)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget-object p0, p0, Lm60;->b:Lbb2;

    .line 58
    .line 59
    invoke-static {p1, p2}, Lda3;->c(J)F

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {p0, p1}, Lbb2;->b(F)F

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    invoke-static {v0, p0}, Lea3;->a(FF)J

    .line 68
    .line 69
    .line 70
    move-result-wide p0

    .line 71
    return-wide p0
.end method

.method public z(I)Lsj0;
    .locals 1

    .line 1
    iget v0, p0, Lhh1;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lsj0;

    .line 9
    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lwj0;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_1
    iget-object p0, p0, Lhh1;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, [Lwj0;

    .line 19
    .line 20
    aget-object p0, p0, p1

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x18
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
