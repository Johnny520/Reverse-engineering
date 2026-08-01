.class public final Lm6;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Llx1;
.implements Lp6;


# static fields
.field public static volatile ι:Lm6;

.field public static final κ:Ljava/lang/Object;

.field public static λ:Lm6;


# instance fields
.field public final synthetic ε:I

.field public ζ:Ljava/lang/Object;

.field public η:Ljava/lang/Object;

.field public θ:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lm6;->κ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 1
    iput p1, p0, Lm6;->ε:I

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
    new-instance p1, Lzz1;

    .line 10
    .line 11
    const/4 v0, 0x4

    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-direct {p1, v0, v1}, Lzz1;-><init>(IZ)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 17
    .line 18
    return-void

    .line 19
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance p1, Ljava/util/WeakHashMap;

    .line 23
    .line 24
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 28
    .line 29
    new-instance p1, Ljava/util/WeakHashMap;

    .line 30
    .line 31
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lm6;->η:Ljava/lang/Object;

    .line 35
    .line 36
    new-instance p1, Ljava/util/WeakHashMap;

    .line 37
    .line 38
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 42
    .line 43
    return-void

    .line 44
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    .line 46
    .line 47
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 48
    .line 49
    sget-object v0, Lyh;->ξ:Le42;

    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 55
    .line 56
    new-instance p1, Ljava/lang/Object;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lm6;->η:Ljava/lang/Object;

    .line 62
    .line 63
    return-void

    .line 64
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    new-instance p1, Ln;

    .line 68
    .line 69
    const/16 v0, 0xb

    .line 70
    .line 71
    invoke-direct {p1, v0}, Ln;-><init>(I)V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 75
    .line 76
    new-instance p1, Ln;

    .line 77
    .line 78
    invoke-direct {p1, v0}, Ln;-><init>(I)V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Lm6;->η:Ljava/lang/Object;

    .line 82
    .line 83
    new-instance p1, Ln;

    .line 84
    .line 85
    invoke-direct {p1, v0}, Ln;-><init>(I)V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 89
    .line 90
    return-void

    .line 91
    :sswitch_data_0
    .sparse-switch
        0x6 -> :sswitch_2
        0xb -> :sswitch_1
        0xf -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm6;->ε:I

    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 133
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 134
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lm6;->η:Ljava/lang/Object;

    .line 135
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/16 v0, 0xc

    iput v0, p0, Lm6;->ε:I

    .line 115
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 116
    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 117
    iput-object p2, p0, Lm6;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/location/LocationManager;)V
    .locals 1

    const/16 v0, 0xd

    iput v0, p0, Lm6;->ε:I

    .line 122
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 123
    new-instance v0, Lf62;

    .line 124
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 125
    iput-object v0, p0, Lm6;->η:Ljava/lang/Object;

    .line 126
    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 127
    iput-object p2, p0, Lm6;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ldl1;)V
    .locals 2

    const/16 v0, 0xa

    iput v0, p0, Lm6;->ε:I

    .line 91
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 92
    new-instance v0, Lj7;

    const/4 v1, 0x0

    .line 93
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 94
    iput-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 95
    new-instance v0, Lb8;

    invoke-direct {v0, v1}, Lb8;-><init>(I)V

    iput-object v0, p0, Lm6;->η:Ljava/lang/Object;

    .line 96
    new-instance v0, Lp3;

    const/16 v1, 0x1c

    invoke-direct {v0, p0, v1, p1}, Lp3;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    iput-object v0, p0, Lm6;->θ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfe;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lm6;->ε:I

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 112
    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 113
    new-instance p1, Ln;

    invoke-direct {p1, v0, p0}, Ln;-><init>(ILjava/lang/Object;)V

    .line 114
    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li0;)V
    .locals 2

    const/4 v0, 0x3

    iput v0, p0, Lm6;->ε:I

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 98
    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 99
    iget-object v0, p1, Li0;->θ:Ljava/lang/Object;

    check-cast v0, Llr;

    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    new-instance v1, Lrk1;

    invoke-direct {v1, v0}, Lrk1;-><init>(Lrx1;)V

    .line 102
    iput-object v1, p0, Lm6;->η:Ljava/lang/Object;

    .line 103
    iget-object p1, p1, Li0;->ι:Ljava/lang/Object;

    check-cast p1, Lkr;

    .line 104
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    new-instance v0, Lqk1;

    invoke-direct {v0, p1}, Lqk1;-><init>(Liw1;)V

    .line 106
    iput-object v0, p0, Lm6;->θ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Li0;Li2;Lcr;Ljava/util/Set;)V
    .locals 7

    const/4 v0, 0x7

    iput v0, p0, Lm6;->ε:I

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 142
    iput-object p2, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 143
    iput-object p1, p0, Lm6;->η:Ljava/lang/Object;

    .line 144
    iput-object p3, p0, Lm6;->θ:Ljava/lang/Object;

    .line 145
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 146
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 147
    new-instance v1, Ljava/lang/String;

    const/4 p3, 0x0

    array-length p4, p2

    invoke-direct {v1, p2, p3, p4}, Ljava/lang/String;-><init>([III)V

    .line 148
    new-instance v6, Luy;

    const/4 p2, 0x0

    invoke-direct {v6, v1, p2}, Luy;-><init>(Ljava/lang/String;I)V

    .line 149
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v2, 0x0

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, Lm6;->Ν(Ljava/lang/CharSequence;IIIZLty;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(Ljava/lang/Runnable;)V
    .locals 1

    const/16 v0, 0x8

    iput v0, p0, Lm6;->ε:I

    .line 118
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 119
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 120
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 121
    iput-object p1, p0, Lm6;->η:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lm6;->ε:I

    .line 107
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 108
    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 109
    iput-object p2, p0, Lm6;->η:Ljava/lang/Object;

    .line 110
    iput-object p3, p0, Lm6;->θ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln62;Lm6;)V
    .locals 1

    const/16 v0, 0xe

    iput v0, p0, Lm6;->ε:I

    .line 150
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 151
    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 152
    iput-object p2, p0, Lm6;->η:Ljava/lang/Object;

    .line 153
    iget-object p1, p1, Ln62;->ε:Ljava/lang/Object;

    .line 154
    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lrk0;)V
    .locals 1

    const/4 p1, 0x1

    iput p1, p0, Lm6;->ε:I

    .line 136
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    new-instance p1, Lv;

    const/16 v0, 0x1e

    invoke-direct {p1, v0}, Lv;-><init>(I)V

    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 138
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm6;->η:Ljava/lang/Object;

    .line 139
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 140
    new-instance p1, Lrk0;

    const/4 v0, 0x6

    invoke-direct {p1, v0, p0}, Lrk0;-><init>(ILjava/lang/Object;)V

    return-void
.end method

.method public constructor <init>(Lsl1;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, Lm6;->ε:I

    .line 128
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 129
    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 130
    new-instance p1, Lrf;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Lrf;-><init>(I)V

    iput-object p1, p0, Lm6;->η:Ljava/lang/Object;

    .line 131
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lyp0;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, Lm6;->ε:I

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 156
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 157
    iput-object v0, p0, Lm6;->η:Ljava/lang/Object;

    .line 158
    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    return-void
.end method

.method public static Δ(Landroid/content/Context;)Lm6;
    .locals 2

    .line 1
    sget-object v0, Lm6;->ι:Lm6;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    sget-object v0, Lm6;->κ:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    sget-object v1, Lm6;->ι:Lm6;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lm6;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lm6;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    sput-object v1, Lm6;->ι:Lm6;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_2
    sget-object p0, Lm6;->ι:Lm6;

    .line 27
    .line 28
    return-object p0
.end method

.method public static Μ(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lm6;
    .locals 2

    .line 1
    new-instance v0, Lm6;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, p2, p3, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-direct {v0, p0, p1}, Lm6;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static ο(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, -0x1

    .line 22
    if-eq p1, v2, :cond_6

    .line 23
    .line 24
    if-eq v1, v2, :cond_6

    .line 25
    .line 26
    if-eq p1, v1, :cond_1

    .line 27
    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const-class v2, Ll62;

    .line 30
    .line 31
    invoke-interface {p0, p1, v1, v2}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, [Ll62;

    .line 36
    .line 37
    if-eqz v1, :cond_6

    .line 38
    .line 39
    array-length v2, v1

    .line 40
    if-lez v2, :cond_6

    .line 41
    .line 42
    array-length v2, v1

    .line 43
    move v3, v0

    .line 44
    :goto_0
    if-ge v3, v2, :cond_6

    .line 45
    .line 46
    aget-object v4, v1, v3

    .line 47
    .line 48
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-interface {p0, v4}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    if-eq v5, p1, :cond_4

    .line 59
    .line 60
    :cond_2
    if-nez p2, :cond_3

    .line 61
    .line 62
    if-eq v4, p1, :cond_4

    .line 63
    .line 64
    :cond_3
    if-le p1, v5, :cond_5

    .line 65
    .line 66
    if-ge p1, v4, :cond_5

    .line 67
    .line 68
    :cond_4
    invoke-interface {p0, v5, v4}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 69
    .line 70
    .line 71
    const/4 p0, 0x1

    .line 72
    return p0

    .line 73
    :cond_5
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_6
    :goto_1
    return v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lm6;->ε:I

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
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lm6;->η:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Lrf;

    .line 19
    .line 20
    invoke-virtual {v1}, Lrf;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", hidden list:"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x5
        :pswitch_0
    .end packed-switch
.end method

.method public Α(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    .line 1
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p0, v1}, Lln0;->Κ(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public Β(I)Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroid/content/res/TypedArray;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-static {}, Lj5;->α()Lj5;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast p0, Landroid/content/Context;

    .line 29
    .line 30
    monitor-enter v0

    .line 31
    :try_start_0
    iget-object v1, v0, Lj5;->α:Ltn1;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v1, p0, p1, v2}, Ltn1;->ε(Landroid/content/Context;IZ)Landroid/graphics/drawable/Drawable;

    .line 35
    .line 36
    .line 37
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    monitor-exit v0

    .line 39
    return-object p0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 42
    throw p0

    .line 43
    :cond_0
    const/4 p0, 0x0

    .line 44
    return-object p0
.end method

.method public Γ(IILy5;)Landroid/graphics/Typeface;
    .locals 12

    .line 1
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 7
    .line 8
    .line 9
    move-result v5

    .line 10
    const/4 p1, 0x0

    .line 11
    if-nez v5, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Lm6;->η:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroid/util/TypedValue;

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    new-instance v0, Landroid/util/TypedValue;

    .line 21
    .line 22
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lm6;->η:Ljava/lang/Object;

    .line 26
    .line 27
    :cond_1
    iget-object v0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 28
    .line 29
    move-object v2, v0

    .line 30
    check-cast v2, Landroid/content/Context;

    .line 31
    .line 32
    iget-object p0, p0, Lm6;->η:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Landroid/util/TypedValue;

    .line 35
    .line 36
    sget-object v0, Lwn1;->α:Ljava/lang/ThreadLocal;

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    :goto_0
    return-object p1

    .line 45
    :cond_2
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    const/4 v0, 0x1

    .line 50
    invoke-virtual {v4, v5, p0, v0}, Landroid/content/res/Resources;->getValue(ILandroid/util/TypedValue;Z)V

    .line 51
    .line 52
    .line 53
    const-string v1, "ResourcesCompat"

    .line 54
    .line 55
    iget-object v0, p0, Landroid/util/TypedValue;->string:Ljava/lang/CharSequence;

    .line 56
    .line 57
    if-eqz v0, :cond_8

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const-string v0, "res/"

    .line 64
    .line 65
    invoke-virtual {v6, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v11, -0x3

    .line 70
    if-nez v0, :cond_3

    .line 71
    .line 72
    invoke-virtual {p3, v11}, Ly5;->α(I)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_7

    .line 76
    .line 77
    :cond_3
    iget v0, p0, Landroid/util/TypedValue;->assetCookie:I

    .line 78
    .line 79
    sget-object v3, Li62;->β:Lkw0;

    .line 80
    .line 81
    invoke-static {v4, v5, v6, v0, p2}, Li62;->δ(Landroid/content/res/Resources;ILjava/lang/String;II)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v3, v0}, Lkw0;->α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Landroid/graphics/Typeface;

    .line 90
    .line 91
    const/16 v3, 0x15

    .line 92
    .line 93
    if-eqz v0, :cond_4

    .line 94
    .line 95
    new-instance p0, Landroid/os/Handler;

    .line 96
    .line 97
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 102
    .line 103
    .line 104
    new-instance p1, Lii0;

    .line 105
    .line 106
    invoke-direct {p1, p3, v3, v0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 110
    .line 111
    .line 112
    move-object p1, v0

    .line 113
    goto/16 :goto_7

    .line 114
    .line 115
    :cond_4
    :try_start_0
    invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-string v7, ".xml"

    .line 120
    .line 121
    invoke-virtual {v0, v7}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_6

    .line 126
    .line 127
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-static {v0, v4}, Lh62;->о(Landroid/content/res/XmlResourceParser;Landroid/content/res/Resources;)Lu50;

    .line 132
    .line 133
    .line 134
    move-result-object v3
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_5
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_4

    .line 135
    if-nez v3, :cond_5

    .line 136
    .line 137
    :try_start_1
    const-string p0, "Failed to find font-family tag"

    .line 138
    .line 139
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    invoke-virtual {p3, v11}, Ly5;->α(I)V
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 143
    .line 144
    .line 145
    goto/16 :goto_7

    .line 146
    .line 147
    :catch_0
    move-exception v0

    .line 148
    move-object p0, v0

    .line 149
    move-object v9, p3

    .line 150
    goto :goto_4

    .line 151
    :catch_1
    move-exception v0

    .line 152
    move-object p0, v0

    .line 153
    move-object v9, p3

    .line 154
    goto :goto_5

    .line 155
    :cond_5
    :try_start_2
    iget v7, p0, Landroid/util/TypedValue;->assetCookie:I
    :try_end_2
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_2 .. :try_end_2} :catch_5
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_4

    .line 156
    .line 157
    const/4 v10, 0x1

    .line 158
    move v8, p2

    .line 159
    move-object v9, p3

    .line 160
    :try_start_3
    invoke-static/range {v2 .. v10}, Li62;->β(Landroid/content/Context;Lu50;Landroid/content/res/Resources;ILjava/lang/String;IILy5;Z)Landroid/graphics/Typeface;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    goto :goto_7

    .line 165
    :catch_2
    move-exception v0

    .line 166
    :goto_1
    move-object p0, v0

    .line 167
    goto :goto_4

    .line 168
    :catch_3
    move-exception v0

    .line 169
    :goto_2
    move-object p0, v0

    .line 170
    goto :goto_5

    .line 171
    :catch_4
    move-exception v0

    .line 172
    move-object v9, p3

    .line 173
    goto :goto_1

    .line 174
    :catch_5
    move-exception v0

    .line 175
    move-object v9, p3

    .line 176
    goto :goto_2

    .line 177
    :cond_6
    move v8, p2

    .line 178
    move-object v9, p3

    .line 179
    iget p0, p0, Landroid/util/TypedValue;->assetCookie:I

    .line 180
    .line 181
    invoke-static {v4, v5, v6, p0, v8}, Li62;->γ(Landroid/content/res/Resources;ILjava/lang/String;II)Landroid/graphics/Typeface;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    if-eqz p0, :cond_7

    .line 186
    .line 187
    new-instance p2, Landroid/os/Handler;

    .line 188
    .line 189
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 190
    .line 191
    .line 192
    move-result-object p3

    .line 193
    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 194
    .line 195
    .line 196
    new-instance p3, Lii0;

    .line 197
    .line 198
    invoke-direct {p3, v9, v3, p0}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 202
    .line 203
    .line 204
    :goto_3
    move-object p1, p0

    .line 205
    goto :goto_7

    .line 206
    :cond_7
    invoke-virtual {v9, v11}, Ly5;->α(I)V
    :try_end_3
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :goto_4
    const-string p2, "Failed to read xml resource "

    .line 211
    .line 212
    invoke-virtual {p2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p2

    .line 216
    invoke-static {v1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 217
    .line 218
    .line 219
    goto :goto_6

    .line 220
    :goto_5
    const-string p2, "Failed to parse xml resource "

    .line 221
    .line 222
    invoke-virtual {p2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    invoke-static {v1, p2, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 227
    .line 228
    .line 229
    :goto_6
    invoke-virtual {v9, v11}, Ly5;->α(I)V

    .line 230
    .line 231
    .line 232
    :goto_7
    return-object p1

    .line 233
    :cond_8
    new-instance p1, Landroid/content/res/Resources$NotFoundException;

    .line 234
    .line 235
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    invoke-static {v5}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p3

    .line 243
    new-instance v0, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    const-string v1, "Resource \""

    .line 246
    .line 247
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    const-string p2, "\" ("

    .line 254
    .line 255
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    const-string p2, ") is not a Font: "

    .line 262
    .line 263
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 267
    .line 268
    .line 269
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    invoke-direct {p1, p0}, Landroid/content/res/Resources$NotFoundException;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    throw p1
.end method

.method public Ε()Lnp0;
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lfe;

    .line 4
    .line 5
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 6
    .line 7
    iget-object p0, p0, Lee;->β:Lnp0;

    .line 8
    .line 9
    return-object p0
.end method

.method public Ζ()J
    .locals 2

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lfe;

    .line 4
    .line 5
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 6
    .line 7
    iget-wide v0, p0, Lee;->δ:J

    .line 8
    .line 9
    return-wide v0
.end method

.method public Η(I)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsl1;

    .line 4
    .line 5
    iget-object p0, p0, Lsl1;->ε:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public Θ()I
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lsl1;

    .line 4
    .line 5
    iget-object p0, p0, Lsl1;->ε:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public Ι(Ljava/lang/CharSequence;IILk62;)Z
    .locals 6

    .line 1
    iget v0, p4, Lk62;->γ:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x3

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    if-nez v0, :cond_4

    .line 9
    .line 10
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lcr;

    .line 13
    .line 14
    invoke-virtual {p4}, Lk62;->β()Lg01;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/16 v4, 0x8

    .line 19
    .line 20
    invoke-virtual {v0, v4}, Lyw0;->α(I)I

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    iget-object v5, v0, Lyw0;->θ:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v5, Ljava/nio/ByteBuffer;

    .line 29
    .line 30
    iget v0, v0, Lyw0;->ε:I

    .line 31
    .line 32
    add-int/2addr v4, v0

    .line 33
    invoke-virtual {v5, v4}, Ljava/nio/ByteBuffer;->getShort(I)S

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    sget-object v0, Lcr;->β:Ljava/lang/ThreadLocal;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    new-instance v4, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v4}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :cond_1
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    check-cast v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    if-ge p2, p3, :cond_2

    .line 65
    .line 66
    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    add-int/lit8 p2, p2, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_2
    iget-object p0, p0, Lcr;->α:Landroid/text/TextPaint;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    sget p2, Lh91;->α:I

    .line 83
    .line 84
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    iget p1, p4, Lk62;->γ:I

    .line 89
    .line 90
    and-int/lit8 p1, p1, 0x4

    .line 91
    .line 92
    if-eqz p0, :cond_3

    .line 93
    .line 94
    or-int/lit8 p0, p1, 0x2

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_3
    or-int/lit8 p0, p1, 0x1

    .line 98
    .line 99
    :goto_1
    iput p0, p4, Lk62;->γ:I

    .line 100
    .line 101
    :cond_4
    iget p0, p4, Lk62;->γ:I

    .line 102
    .line 103
    and-int/lit8 p0, p0, 0x3

    .line 104
    .line 105
    if-ne p0, v1, :cond_5

    .line 106
    .line 107
    return v3

    .line 108
    :cond_5
    return v2
.end method

.method public Κ()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln;

    .line 4
    .line 5
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lqx1;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Ln;

    .line 19
    .line 20
    iget-object v0, v0, Ln;->ζ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lqx1;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, Lm6;->η:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, Ln;

    .line 33
    .line 34
    iget-object p0, p0, Ln;->ζ:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lqx1;

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result p0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    move p0, v1

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const/4 p0, 0x0

    .line 47
    :goto_0
    xor-int/2addr p0, v1

    .line 48
    return p0
.end method

.method public Λ()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lc02;

    .line 4
    .line 5
    invoke-interface {v0}, Lc02;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lm6;->η:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lm6;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Lm6;->Λ()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 p0, 0x0

    .line 27
    return p0

    .line 28
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 29
    return p0
.end method

.method public Ν(Ljava/lang/CharSequence;IIIZLty;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p6

    .line 10
    .line 11
    new-instance v5, Lvy;

    .line 12
    .line 13
    iget-object v6, v0, Lm6;->η:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v6, Li0;

    .line 16
    .line 17
    iget-object v6, v6, Li0;->θ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v6, Li01;

    .line 20
    .line 21
    invoke-direct {v5, v6}, Lvy;-><init>(Li01;)V

    .line 22
    .line 23
    .line 24
    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v7, 0x0

    .line 29
    const/4 v8, 0x1

    .line 30
    move v9, v6

    .line 31
    move v10, v7

    .line 32
    move v11, v8

    .line 33
    move/from16 v6, p2

    .line 34
    .line 35
    :cond_0
    :goto_0
    move v7, v6

    .line 36
    :goto_1
    const/4 v12, 0x2

    .line 37
    if-ge v6, v2, :cond_f

    .line 38
    .line 39
    if-ge v10, v3, :cond_f

    .line 40
    .line 41
    if-eqz v11, :cond_f

    .line 42
    .line 43
    iget-object v13, v5, Lvy;->γ:Li01;

    .line 44
    .line 45
    iget-object v13, v13, Li01;->α:Landroid/util/SparseArray;

    .line 46
    .line 47
    if-nez v13, :cond_1

    .line 48
    .line 49
    const/4 v13, 0x0

    .line 50
    goto :goto_2

    .line 51
    :cond_1
    invoke-virtual {v13, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v13

    .line 55
    check-cast v13, Li01;

    .line 56
    .line 57
    :goto_2
    iget v14, v5, Lvy;->α:I

    .line 58
    .line 59
    const/4 v15, 0x3

    .line 60
    if-eq v14, v12, :cond_3

    .line 61
    .line 62
    if-nez v13, :cond_2

    .line 63
    .line 64
    invoke-virtual {v5}, Lvy;->α()V

    .line 65
    .line 66
    .line 67
    :goto_3
    move v13, v8

    .line 68
    goto :goto_6

    .line 69
    :cond_2
    iput v12, v5, Lvy;->α:I

    .line 70
    .line 71
    iput-object v13, v5, Lvy;->γ:Li01;

    .line 72
    .line 73
    iput v8, v5, Lvy;->ζ:I

    .line 74
    .line 75
    :goto_4
    move v13, v12

    .line 76
    goto :goto_6

    .line 77
    :cond_3
    if-eqz v13, :cond_4

    .line 78
    .line 79
    iput-object v13, v5, Lvy;->γ:Li01;

    .line 80
    .line 81
    iget v13, v5, Lvy;->ζ:I

    .line 82
    .line 83
    add-int/2addr v13, v8

    .line 84
    iput v13, v5, Lvy;->ζ:I

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_4
    const v13, 0xfe0e

    .line 88
    .line 89
    .line 90
    if-ne v9, v13, :cond_5

    .line 91
    .line 92
    invoke-virtual {v5}, Lvy;->α()V

    .line 93
    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    const v13, 0xfe0f

    .line 97
    .line 98
    .line 99
    if-ne v9, v13, :cond_6

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_6
    iget-object v13, v5, Lvy;->γ:Li01;

    .line 103
    .line 104
    iget-object v14, v13, Li01;->β:Lk62;

    .line 105
    .line 106
    if-eqz v14, :cond_9

    .line 107
    .line 108
    iget v14, v5, Lvy;->ζ:I

    .line 109
    .line 110
    if-ne v14, v8, :cond_8

    .line 111
    .line 112
    invoke-virtual {v5}, Lvy;->β()Z

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-eqz v13, :cond_7

    .line 117
    .line 118
    iget-object v13, v5, Lvy;->γ:Li01;

    .line 119
    .line 120
    iput-object v13, v5, Lvy;->δ:Li01;

    .line 121
    .line 122
    invoke-virtual {v5}, Lvy;->α()V

    .line 123
    .line 124
    .line 125
    :goto_5
    move v13, v15

    .line 126
    goto :goto_6

    .line 127
    :cond_7
    invoke-virtual {v5}, Lvy;->α()V

    .line 128
    .line 129
    .line 130
    goto :goto_3

    .line 131
    :cond_8
    iput-object v13, v5, Lvy;->δ:Li01;

    .line 132
    .line 133
    invoke-virtual {v5}, Lvy;->α()V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_9
    invoke-virtual {v5}, Lvy;->α()V

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :goto_6
    iput v9, v5, Lvy;->ε:I

    .line 142
    .line 143
    if-eq v13, v8, :cond_e

    .line 144
    .line 145
    if-eq v13, v12, :cond_c

    .line 146
    .line 147
    if-eq v13, v15, :cond_a

    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_a
    if-nez p5, :cond_b

    .line 151
    .line 152
    iget-object v12, v5, Lvy;->δ:Li01;

    .line 153
    .line 154
    iget-object v12, v12, Li01;->β:Lk62;

    .line 155
    .line 156
    invoke-virtual {v0, v1, v7, v6, v12}, Lm6;->Ι(Ljava/lang/CharSequence;IILk62;)Z

    .line 157
    .line 158
    .line 159
    move-result v12

    .line 160
    if-nez v12, :cond_0

    .line 161
    .line 162
    :cond_b
    iget-object v11, v5, Lvy;->δ:Li01;

    .line 163
    .line 164
    iget-object v11, v11, Li01;->β:Lk62;

    .line 165
    .line 166
    invoke-interface {v4, v1, v7, v6, v11}, Lty;->ζ(Ljava/lang/CharSequence;IILk62;)Z

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    add-int/lit8 v10, v10, 0x1

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_c
    invoke-static {v9}, Ljava/lang/Character;->charCount(I)I

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    add-int/2addr v12, v6

    .line 179
    if-ge v12, v2, :cond_d

    .line 180
    .line 181
    invoke-static {v1, v12}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    move v9, v6

    .line 186
    :cond_d
    move v6, v12

    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 190
    .line 191
    .line 192
    move-result v6

    .line 193
    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    add-int/2addr v6, v7

    .line 198
    if-ge v6, v2, :cond_0

    .line 199
    .line 200
    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    move v9, v7

    .line 205
    goto/16 :goto_0

    .line 206
    .line 207
    :cond_f
    iget v2, v5, Lvy;->α:I

    .line 208
    .line 209
    if-ne v2, v12, :cond_12

    .line 210
    .line 211
    iget-object v2, v5, Lvy;->γ:Li01;

    .line 212
    .line 213
    iget-object v2, v2, Li01;->β:Lk62;

    .line 214
    .line 215
    if-eqz v2, :cond_12

    .line 216
    .line 217
    iget v2, v5, Lvy;->ζ:I

    .line 218
    .line 219
    if-gt v2, v8, :cond_10

    .line 220
    .line 221
    invoke-virtual {v5}, Lvy;->β()Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_12

    .line 226
    .line 227
    :cond_10
    if-ge v10, v3, :cond_12

    .line 228
    .line 229
    if-eqz v11, :cond_12

    .line 230
    .line 231
    if-nez p5, :cond_11

    .line 232
    .line 233
    iget-object v2, v5, Lvy;->γ:Li01;

    .line 234
    .line 235
    iget-object v2, v2, Li01;->β:Lk62;

    .line 236
    .line 237
    invoke-virtual {v0, v1, v7, v6, v2}, Lm6;->Ι(Ljava/lang/CharSequence;IILk62;)Z

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    if-nez v0, :cond_12

    .line 242
    .line 243
    :cond_11
    iget-object v0, v5, Lvy;->γ:Li01;

    .line 244
    .line 245
    iget-object v0, v0, Li01;->β:Lk62;

    .line 246
    .line 247
    invoke-interface {v4, v1, v7, v6, v0}, Lty;->ζ(Ljava/lang/CharSequence;IILk62;)Z

    .line 248
    .line 249
    .line 250
    :cond_12
    invoke-interface {v4}, Lty;->α()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    return-object v0
.end method

.method public Ξ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public Ο(Ljava/util/ArrayList;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_3

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lo;

    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v3, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Lv;

    .line 20
    .line 21
    iget-object v4, v3, Lv;->β:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v4, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget v5, v3, Lv;->α:I

    .line 29
    .line 30
    const/4 v6, 0x0

    .line 31
    :goto_1
    if-ge v6, v5, :cond_1

    .line 32
    .line 33
    aget-object v7, v4, v6

    .line 34
    .line 35
    if-eq v7, v2, :cond_0

    .line 36
    .line 37
    add-int/lit8 v6, v6, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    const-string v2, "Already in the pool!"

    .line 41
    .line 42
    invoke-static {v2}, Lγ;->ρ(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_1
    iget v5, v3, Lv;->α:I

    .line 47
    .line 48
    array-length v6, v4

    .line 49
    if-ge v5, v6, :cond_2

    .line 50
    .line 51
    aput-object v2, v4, v5

    .line 52
    .line 53
    add-int/lit8 v5, v5, 0x1

    .line 54
    .line 55
    iput v5, v3, Lv;->α:I

    .line 56
    .line 57
    :cond_2
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public Π(Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-static {}, Li91;->θ()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Lh42;->α:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v2, p0, Lm6;->η:Ljava/lang/Object;

    .line 15
    .line 16
    monitor-enter v2

    .line 17
    :try_start_0
    iget-object v3, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Le42;

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, Le42;->α(J)I

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    if-gez v4, :cond_1

    .line 32
    .line 33
    iget-object p0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    invoke-virtual {v3, v0, v1, p1}, Le42;->β(JLjava/lang/Object;)Le42;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    monitor-exit v2

    .line 45
    return-void

    .line 46
    :catchall_0
    move-exception p0

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    :try_start_1
    iget-object p0, v3, Le42;->γ:[Ljava/lang/Object;

    .line 49
    .line 50
    aput-object p1, p0, v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 51
    .line 52
    monitor-exit v2

    .line 53
    return-void

    .line 54
    :goto_0
    monitor-exit v2

    .line 55
    throw p0
.end method

.method public Ρ(Lde;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lfe;

    .line 4
    .line 5
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 6
    .line 7
    iput-object p1, p0, Lee;->γ:Lde;

    .line 8
    .line 9
    return-void
.end method

.method public Σ(Lyr;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lfe;

    .line 4
    .line 5
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 6
    .line 7
    iput-object p1, p0, Lee;->α:Lyr;

    .line 8
    .line 9
    return-void
.end method

.method public Τ(Lnp0;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lfe;

    .line 4
    .line 5
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 6
    .line 7
    iput-object p1, p0, Lee;->β:Lnp0;

    .line 8
    .line 9
    return-void
.end method

.method public Υ(J)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lfe;

    .line 4
    .line 5
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 6
    .line 7
    iput-wide p1, p0, Lee;->δ:J

    .line 8
    .line 9
    return-void
.end method

.method public α(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lyp0;

    .line 2
    .line 3
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lyp0;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lyp0;->Α(ILyp0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public β()Lrx1;
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lrk1;

    .line 4
    .line 5
    return-object p0
.end method

.method public γ(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm6;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    iget-object v1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public δ()V
    .locals 7

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyp0;

    .line 4
    .line 5
    iget-object v0, p0, Lyp0;->Κ:Lk31;

    .line 6
    .line 7
    invoke-virtual {p0}, Lyp0;->Η()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    const-string v1, "onReuse is only expected on attached node"

    .line 14
    .line 15
    invoke-static {v1}, Lam0;->α(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v1, p0, Lyp0;->Μ:Lkq0;

    .line 19
    .line 20
    const/4 v2, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Lkq0;->δ(Z)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iput-boolean v2, p0, Lyp0;->ψ:Z

    .line 27
    .line 28
    iget-boolean v1, p0, Lyp0;->Τ:Z

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    iput-boolean v2, p0, Lyp0;->Τ:Z

    .line 33
    .line 34
    goto :goto_3

    .line 35
    :cond_2
    iget-object v1, p0, Lyp0;->Κ:Lk31;

    .line 36
    .line 37
    iget-object v1, v1, Lk31;->ε:Lq22;

    .line 38
    .line 39
    move-object v3, v1

    .line 40
    :goto_0
    if-eqz v3, :cond_4

    .line 41
    .line 42
    iget-boolean v4, v3, Lq01;->σ:Z

    .line 43
    .line 44
    if-eqz v4, :cond_3

    .line 45
    .line 46
    invoke-virtual {v3}, Lq01;->э()V

    .line 47
    .line 48
    .line 49
    :cond_3
    iget-object v3, v3, Lq01;->ι:Lq01;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_4
    move-object v3, v1

    .line 53
    :goto_1
    if-eqz v3, :cond_6

    .line 54
    .line 55
    iget-boolean v4, v3, Lq01;->σ:Z

    .line 56
    .line 57
    if-eqz v4, :cond_5

    .line 58
    .line 59
    invoke-virtual {v3}, Lq01;->я()V

    .line 60
    .line 61
    .line 62
    :cond_5
    iget-object v3, v3, Lq01;->ι:Lq01;

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_6
    :goto_2
    if-eqz v1, :cond_8

    .line 66
    .line 67
    iget-boolean v3, v1, Lq01;->σ:Z

    .line 68
    .line 69
    if-eqz v3, :cond_7

    .line 70
    .line 71
    invoke-virtual {v1}, Lq01;->ц()V

    .line 72
    .line 73
    .line 74
    :cond_7
    iget-object v1, v1, Lq01;->ι:Lq01;

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_8
    :goto_3
    iget v1, p0, Lyp0;->ζ:I

    .line 78
    .line 79
    iget-object v3, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 80
    .line 81
    if-eqz v3, :cond_9

    .line 82
    .line 83
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    if-eqz v3, :cond_9

    .line 88
    .line 89
    invoke-virtual {v3, p0}, Lol1;->ζ(Lyp0;)V

    .line 90
    .line 91
    .line 92
    :cond_9
    sget-object v3, Lyr1;->α:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 93
    .line 94
    const/4 v4, 0x1

    .line 95
    invoke-virtual {v3, v4}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    iput v3, p0, Lyp0;->ζ:I

    .line 100
    .line 101
    iget-object v3, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 102
    .line 103
    if-eqz v3, :cond_a

    .line 104
    .line 105
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()Ln11;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-virtual {v5, v1}, Ln11;->ζ(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3}, Landroidx/compose/ui/platform/AndroidComposeView;->getLayoutNodes()Ln11;

    .line 113
    .line 114
    .line 115
    move-result-object v3

    .line 116
    iget v5, p0, Lyp0;->ζ:I

    .line 117
    .line 118
    invoke-virtual {v3, v5, p0}, Ln11;->η(ILjava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_a
    iget-object v3, v0, Lk31;->ζ:Lq01;

    .line 122
    .line 123
    :goto_4
    if-eqz v3, :cond_b

    .line 124
    .line 125
    invoke-virtual {v3}, Lq01;->х()V

    .line 126
    .line 127
    .line 128
    iget-object v3, v3, Lq01;->κ:Lq01;

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_b
    invoke-virtual {v0}, Lk31;->ε()V

    .line 132
    .line 133
    .line 134
    const/16 v3, 0x8

    .line 135
    .line 136
    invoke-virtual {v0, v3}, Lk31;->δ(I)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_c

    .line 141
    .line 142
    invoke-virtual {p0}, Lyp0;->Ε()V

    .line 143
    .line 144
    .line 145
    :cond_c
    invoke-static {p0}, Lyp0;->Φ(Lyp0;)V

    .line 146
    .line 147
    .line 148
    iget-object v0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 149
    .line 150
    if-eqz v0, :cond_e

    .line 151
    .line 152
    iget-object v0, v0, Landroidx/compose/ui/platform/AndroidComposeView;->Σ:Lk0;

    .line 153
    .line 154
    if-eqz v0, :cond_e

    .line 155
    .line 156
    iget-object v3, v0, Lk0;->η:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 157
    .line 158
    iget-object v5, v0, Lk0;->ε:Ly21;

    .line 159
    .line 160
    iget-object v0, v0, Lk0;->λ:Lo11;

    .line 161
    .line 162
    invoke-virtual {v0, v1}, Lo11;->ε(I)Z

    .line 163
    .line 164
    .line 165
    move-result v6

    .line 166
    if-eqz v6, :cond_d

    .line 167
    .line 168
    invoke-virtual {v5, v3, v1, v2}, Ly21;->ο(Landroid/view/View;IZ)V

    .line 169
    .line 170
    .line 171
    :cond_d
    invoke-virtual {p0}, Lyp0;->υ()Lxr1;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    if-eqz v1, :cond_e

    .line 176
    .line 177
    iget-object v1, v1, Lxr1;->ε:Lb21;

    .line 178
    .line 179
    sget-object v2, Lfs1;->ρ:Lis1;

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Lb21;->β(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-ne v1, v4, :cond_e

    .line 186
    .line 187
    iget v1, p0, Lyp0;->ζ:I

    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lo11;->α(I)Z

    .line 190
    .line 191
    .line 192
    iget v0, p0, Lyp0;->ζ:I

    .line 193
    .line 194
    invoke-virtual {v5, v3, v0, v4}, Ly21;->ο(Landroid/view/View;IZ)V

    .line 195
    .line 196
    .line 197
    :cond_e
    iget-object v0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 198
    .line 199
    if-eqz v0, :cond_f

    .line 200
    .line 201
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getRectManager()Lol1;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    if-eqz v0, :cond_f

    .line 206
    .line 207
    invoke-virtual {v0, p0}, Lol1;->ε(Lyp0;)V

    .line 208
    .line 209
    .line 210
    :cond_f
    return-void
.end method

.method public bridge synthetic ε(ILjava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lyp0;

    .line 2
    .line 3
    return-void
.end method

.method public ζ()V
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyp0;

    .line 4
    .line 5
    iget-object p0, p0, Lyp0;->σ:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroidx/compose/ui/platform/AndroidComposeView;->φ()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public η(III)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyp0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lyp0;->Κ(III)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public θ()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public ι(II)V
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lyp0;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lyp0;->Π(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public λ()Liw1;
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lqk1;

    .line 4
    .line 5
    return-object p0
.end method

.method public μ()V
    .locals 2

    .line 1
    iget-object v0, p0, Lm6;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/lit8 v1, v1, -0x1

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public ν(Lyp0;Lqn0;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln;

    .line 4
    .line 5
    iget-object v1, p0, Lm6;->η:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ln;

    .line 8
    .line 9
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Ln;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-eqz p2, :cond_5

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    if-eq p2, v2, :cond_4

    .line 21
    .line 22
    const/4 v2, 0x2

    .line 23
    if-eq p2, v2, :cond_2

    .line 24
    .line 25
    const/4 v0, 0x3

    .line 26
    if-ne p2, v0, :cond_1

    .line 27
    .line 28
    iget-object p2, p1, Lyp0;->μ:Lyp0;

    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Ln;->ν(Lyp0;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {v1, p1}, Ln;->ν(Lyp0;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-static {}, Lγ;->κ()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iget-object p2, p1, Lyp0;->μ:Lyp0;

    .line 45
    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ln;->ν(Lyp0;)V

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_3
    invoke-virtual {v0, p1}, Ln;->ν(Lyp0;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_4
    invoke-virtual {v1, p1}, Ln;->ν(Lyp0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1}, Ln;->ν(Lyp0;)V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_5
    invoke-virtual {v0, p1}, Ln;->ν(Lyp0;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, p1}, Ln;->ν(Lyp0;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public ξ()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm6;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lyp0;

    .line 15
    .line 16
    invoke-virtual {p0}, Lyp0;->Ο()V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public π(Landroid/os/Bundle;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lm6;->η:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashSet;

    .line 4
    .line 5
    iget-object v1, p0, Lm6;->θ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroid/content/Context;

    .line 8
    .line 9
    const v2, 0x7f0f001d

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    :try_start_0
    new-instance v2, Ljava/util/HashSet;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :cond_0
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    check-cast v4, Ljava/lang/String;

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-virtual {p1, v4, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {v1, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    const-class v5, Lxl0;

    .line 59
    .line 60
    invoke-virtual {v5, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_0

    .line 65
    .line 66
    invoke-virtual {v0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/lang/Class;

    .line 85
    .line 86
    invoke-virtual {p0, v0, v2}, Lm6;->ρ(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 87
    .line 88
    .line 89
    goto :goto_1

    .line 90
    :catch_0
    move-exception p0

    .line 91
    new-instance p1, Lpm;

    .line 92
    .line 93
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_2
    return-void
.end method

.method public ρ(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/HashMap;

    .line 4
    .line 5
    const-string v1, "Cannot initialize "

    .line 6
    .line 7
    invoke-static {}, Lo52;->α()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-static {v2}, Le81;->β(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_4

    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 33
    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-virtual {v2, v1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lxl0;

    .line 45
    .line 46
    invoke-interface {v1}, Lxl0;->α()Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-nez v3, :cond_2

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    :cond_1
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-eqz v3, :cond_2

    .line 65
    .line 66
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    check-cast v3, Ljava/lang/Class;

    .line 71
    .line 72
    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_1

    .line 77
    .line 78
    invoke-virtual {p0, v3, p2}, Lm6;->ρ(Ljava/lang/Class;Ljava/util/HashSet;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast p0, Landroid/content/Context;

    .line 85
    .line 86
    invoke-interface {v1, p0}, Lxl0;->β(Landroid/content/Context;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {p2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :catchall_0
    move-exception p0

    .line 98
    :try_start_2
    new-instance p1, Lpm;

    .line 99
    .line 100
    invoke-direct {p1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 101
    .line 102
    .line 103
    throw p1

    .line 104
    :cond_3
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 108
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 109
    .line 110
    .line 111
    return-object p0

    .line 112
    :cond_4
    :try_start_3
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    new-instance p1, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p0, ". Cycle detected."

    .line 125
    .line 126
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 134
    .line 135
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 139
    :catchall_1
    move-exception p0

    .line 140
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 141
    .line 142
    .line 143
    throw p0
.end method

.method public σ(II)I
    .locals 2

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    :goto_0
    if-ge p2, v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Lo;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    add-int/lit8 p2, p2, 0x1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return p1
.end method

.method public τ()Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Li91;->θ()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget-wide v2, Lh42;->α:J

    .line 6
    .line 7
    cmp-long v2, v0, v2

    .line 8
    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    iget-object p0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Le42;

    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Le42;->α(J)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-ltz v0, :cond_1

    .line 29
    .line 30
    iget-object p0, p0, Le42;->γ:[Ljava/lang/Object;

    .line 31
    .line 32
    aget-object p0, p0, v0

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public υ()Lde;
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lfe;

    .line 4
    .line 5
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 6
    .line 7
    iget-object p0, p0, Lee;->γ:Lde;

    .line 8
    .line 9
    return-object p0
.end method

.method public φ(I)Landroid/view/View;
    .locals 4

    .line 1
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsl1;

    .line 4
    .line 5
    iget-object p0, p0, Lm6;->η:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lrf;

    .line 8
    .line 9
    if-gez p1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v1, v0, Lsl1;->ε:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    move v2, p1

    .line 19
    :goto_0
    if-ge v2, v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Lrf;->α(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    sub-int v3, v2, v3

    .line 26
    .line 27
    sub-int v3, p1, v3

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    :goto_1
    invoke-virtual {p0, v2}, Lrf;->β(I)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    add-int/2addr v2, v3

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    :goto_2
    const/4 v2, -0x1

    .line 43
    :cond_3
    iget-object p0, v0, Lsl1;->ε:Landroidx/recyclerview/widget/RecyclerView;

    .line 44
    .line 45
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public χ()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lsl1;

    .line 4
    .line 5
    iget-object v0, v0, Lsl1;->ε:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    sub-int/2addr v0, p0

    .line 20
    return v0
.end method

.method public ψ(I)Landroid/content/res/ColorStateList;
    .locals 2

    .line 1
    iget-object v0, p0, Lm6;->ζ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/content/res/TypedArray;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/content/Context;

    .line 21
    .line 22
    invoke-static {p0, v1}, Lln0;->Η(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public ω()Lyr;
    .locals 0

    .line 1
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lfe;

    .line 4
    .line 5
    iget-object p0, p0, Lfe;->ε:Lee;

    .line 6
    .line 7
    iget-object p0, p0, Lee;->α:Lyr;

    .line 8
    .line 9
    return-object p0
.end method
