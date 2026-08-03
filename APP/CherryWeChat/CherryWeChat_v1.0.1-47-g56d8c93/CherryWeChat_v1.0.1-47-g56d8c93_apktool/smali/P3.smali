.class public LP3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements LH0;
.implements Lm4;
.implements Lvw;
.implements LNd;
.implements Lzf;


# static fields
.field public static final d:[I


# instance fields
.field public final synthetic a:I

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const v0, 0x101013b

    const v1, 0x101013c

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, LP3;->d:[I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    iput p1, p0, LP3;->a:I

    sparse-switch p1, :sswitch_data_0

    .line 85
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 86
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    .line 87
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p1

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void

    .line 88
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 89
    new-instance p1, LCp;

    const-wide/16 v0, 0x3e8

    invoke-direct {p1, v0, v1}, LCp;-><init>(J)V

    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    .line 90
    new-instance p1, Lhw;

    const/4 v0, 0x1

    .line 91
    invoke-direct {p1, v0}, Lhw;-><init>(I)V

    const/16 v0, 0xa

    .line 92
    invoke-static {v0, p1}, LQj;->I(ILYg;)Lw4;

    move-result-object p1

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void

    .line 93
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    .line 95
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void

    .line 96
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 97
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    .line 98
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void

    .line 99
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    .line 101
    new-instance p1, LM4;

    const/4 v0, 0x0

    .line 102
    invoke-direct {p1, v0}, Lsy;-><init>(I)V

    .line 103
    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void

    .line 104
    :sswitch_4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 105
    new-instance p1, Lik;

    const/4 v0, 0x0

    .line 106
    invoke-direct {p1, v0}, Lik;-><init>(LVt;)V

    .line 107
    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    .line 108
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void

    .line 109
    :sswitch_5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    .line 111
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void

    .line 112
    :sswitch_6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    .line 114
    new-instance p1, Ln6;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ln6;-><init>(I)V

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void

    .line 115
    :sswitch_7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xc -> :sswitch_7
        0xd -> :sswitch_6
        0x14 -> :sswitch_5
        0x15 -> :sswitch_4
        0x19 -> :sswitch_3
        0x1a -> :sswitch_2
        0x1c -> :sswitch_1
        0x1d -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(II)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, LP3;->a:I

    .line 82
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    filled-new-array {p1, p2}, [I

    move-result-object p1

    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    const/4 p1, 0x2

    .line 84
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public constructor <init>(III)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, LP3;->a:I

    .line 116
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 117
    filled-new-array {p1, p2, p3}, [I

    move-result-object p1

    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    const/4 p1, 0x3

    .line 118
    new-array p1, p1, [F

    fill-array-data p1, :array_0

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f000000    # 0.5f
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LP3;->a:I

    iput-object p2, p0, LP3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, LP3;->a:I

    iput-object p2, p0, LP3;->b:Ljava/lang/Object;

    iput-object p3, p0, LP3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LE3;LH0;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LP3;->a:I

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    .line 122
    iput-object p2, p0, LP3;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/animation/Animator;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, LP3;->a:I

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 74
    iput-object v0, p0, LP3;->b:Ljava/lang/Object;

    .line 75
    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const/16 v0, 0x8

    iput v0, p0, LP3;->a:I

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const-class v0, LMq;

    .line 48
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    const v1, 0x5504035e

    .line 49
    invoke-static {p1, v1, v0}, Lcr;->R(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    move-result-object v0

    iget v0, v0, Landroid/util/TypedValue;->data:I

    .line 50
    sget-object v1, LVu;->m:[I

    .line 51
    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v0

    const/4 v1, 0x4

    const/4 v2, 0x0

    .line 52
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 53
    invoke-static {p1, v1}, Lm6;->e(Landroid/content/Context;I)Lm6;

    const/4 v1, 0x2

    .line 54
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 55
    invoke-static {p1, v1}, Lm6;->e(Landroid/content/Context;I)Lm6;

    const/4 v1, 0x3

    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 57
    invoke-static {p1, v1}, Lm6;->e(Landroid/content/Context;I)Lm6;

    const/4 v1, 0x5

    .line 58
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    .line 59
    invoke-static {p1, v1}, Lm6;->e(Landroid/content/Context;I)Lm6;

    const/4 v1, 0x7

    .line 60
    invoke-static {p1, v0, v1}, LTB;->j(Landroid/content/Context;Landroid/content/res/TypedArray;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    const/16 v3, 0x9

    .line 61
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 62
    invoke-static {p1, v3}, Lm6;->e(Landroid/content/Context;I)Lm6;

    move-result-object v3

    iput-object v3, p0, LP3;->b:Ljava/lang/Object;

    const/16 v3, 0x8

    .line 63
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 64
    invoke-static {p1, v3}, Lm6;->e(Landroid/content/Context;I)Lm6;

    const/16 v3, 0xa

    .line 65
    invoke-virtual {v0, v3, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    .line 66
    invoke-static {p1, v2}, Lm6;->e(Landroid/content/Context;I)Lm6;

    move-result-object p1

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    .line 67
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 68
    invoke-virtual {v1}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 69
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public constructor <init>(Landroid/view/animation/Animation;)V
    .locals 1

    const/16 v0, 0x10

    iput v0, p0, LP3;->a:I

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    .line 72
    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/AbsSeekBar;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LP3;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/EditText;I)V
    .locals 4

    iput p2, p0, LP3;->a:I

    packed-switch p2, :pswitch_data_0

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    .line 27
    new-instance p2, LD2;

    invoke-direct {p2, p1}, LD2;-><init>(Landroid/widget/EditText;)V

    iput-object p2, p0, LP3;->c:Ljava/lang/Object;

    return-void

    .line 28
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    .line 30
    new-instance p2, LEf;

    invoke-direct {p2, p1}, LEf;-><init>(Landroid/widget/EditText;)V

    iput-object p2, p0, LP3;->c:Ljava/lang/Object;

    .line 31
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 32
    sget-object p2, Ltf;->b:Ltf;

    if-nez p2, :cond_1

    .line 33
    sget-object p2, Ltf;->a:Ljava/lang/Object;

    monitor-enter p2

    .line 34
    :try_start_0
    sget-object v0, Ltf;->b:Ltf;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Ltf;

    .line 36
    invoke-direct {v0}, Landroid/text/Editable$Factory;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 37
    :try_start_1
    const-string v1, "android.text.DynamicLayout$ChangeWatcher"

    .line 38
    const-class v2, Ltf;

    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v1, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, Ltf;->c:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    :catchall_0
    :try_start_2
    sput-object v0, Ltf;->b:Ltf;

    goto :goto_0

    :catchall_1
    move-exception p1

    goto :goto_1

    .line 40
    :cond_0
    :goto_0
    monitor-exit p2

    goto :goto_2

    :goto_1
    monitor-exit p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1

    .line 41
    :cond_1
    :goto_2
    sget-object p2, Ltf;->b:Ltf;

    .line 42
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setEditableFactory(Landroid/text/Editable$Factory;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lhw;)V
    .locals 1

    const/16 v0, 0x17

    iput v0, p0, LP3;->a:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, LP3;->b:Ljava/lang/Object;

    .line 5
    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 4

    const/16 v0, 0x13

    iput v0, p0, LP3;->a:I

    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 77
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 78
    new-array v1, v0, [I

    iput-object v1, p0, LP3;->b:Ljava/lang/Object;

    .line 79
    new-array v1, v0, [F

    iput-object v1, p0, LP3;->c:Ljava/lang/Object;

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 80
    iget-object v2, p0, LP3;->b:Ljava/lang/Object;

    check-cast v2, [I

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aput v3, v2, v1

    .line 81
    iget-object v2, p0, LP3;->c:Ljava/lang/Object;

    check-cast v2, [F

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Float;

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    aput v3, v2, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public constructor <init>(Lo4;)V
    .locals 1

    const/4 v0, 0x6

    iput v0, p0, LP3;->a:I

    .line 119
    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    iput v0, p0, LP3;->a:I

    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LP3;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lqu;)V
    .locals 2

    const/16 v0, 0x1a

    iput v0, p0, LP3;->a:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    new-instance v0, Ljava/util/HashMap;

    .line 18
    iget-object v1, p1, Lqu;->a:Ljava/util/HashMap;

    .line 19
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, LP3;->b:Ljava/lang/Object;

    .line 20
    new-instance v0, Ljava/util/HashMap;

    .line 21
    iget-object p1, p1, Lqu;->b:Ljava/util/HashMap;

    .line 22
    invoke-direct {v0, p1}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, LP3;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lw4;)V
    .locals 3

    const/16 v0, 0x18

    iput v0, p0, LP3;->a:I

    .line 6
    new-instance v0, Lqs;

    .line 7
    sget-object v1, Lqs;->e:LPg;

    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Lqs;->a:Ljava/lang/Object;

    .line 10
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    iput-object v2, v0, Lqs;->c:Ljava/lang/Object;

    .line 11
    iput-object p1, v0, Lqs;->d:Ljava/lang/Object;

    .line 12
    iput-object v1, v0, Lqs;->b:Ljava/lang/Object;

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance p1, Lyc;

    const/4 v1, 0x3

    invoke-direct {p1, v1}, Lyc;-><init>(I)V

    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    .line 15
    iput-object v0, p0, LP3;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzi;)V
    .locals 1

    const/16 v0, 0x11

    iput v0, p0, LP3;->a:I

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, LP3;->b:Ljava/lang/Object;

    .line 45
    iput-object p1, p0, LP3;->c:Ljava/lang/Object;

    return-void
.end method

.method public static H(II)I
    .locals 5

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v1, p0, :cond_2

    add-int/lit8 v2, v2, 0x1

    if-ne v2, p1, :cond_0

    add-int/lit8 v3, v3, 0x1

    move v2, v0

    goto :goto_1

    :cond_0
    if-le v2, p1, :cond_1

    add-int/lit8 v3, v3, 0x1

    move v2, v4

    :cond_1
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    add-int/2addr v2, v4

    if-le v2, p1, :cond_3

    add-int/2addr v3, v4

    :cond_3
    return v3
.end method

.method public static l(Landroid/graphics/ImageDecoder$Source;IILvt;)LH2;
    .locals 1

    new-instance v0, Lgd;

    invoke-direct {v0, p1, p2, p3}, Lgd;-><init>(IILvt;)V

    invoke-static {p0, v0}, Landroid/graphics/ImageDecoder;->decodeDrawable(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    instance-of p1, p0, Landroid/graphics/drawable/AnimatedImageDrawable;

    if-eqz p1, :cond_0

    new-instance p1, LH2;

    check-cast p0, Landroid/graphics/drawable/AnimatedImageDrawable;

    const/4 p2, 0x0

    invoke-direct {p1, p2, p0}, LH2;-><init>(ILjava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/io/IOException;

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "Received unexpected drawable type for animated image, failing: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public A(Lhi;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, LP3;->A(Lhi;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1}, Lvi;->onFragmentViewDestroyed(Lzi;Lhi;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public B(LVt;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lik;

    if-nez v1, :cond_0

    new-instance v1, Lik;

    invoke-direct {v1, p1}, Lik;-><init>(LVt;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LVt;->a()V

    :goto_0
    iget-object p1, v1, Lik;->d:Lik;

    iget-object v0, v1, Lik;->c:Lik;

    iput-object v0, p1, Lik;->c:Lik;

    iget-object v0, v1, Lik;->c:Lik;

    iput-object p1, v0, Lik;->d:Lik;

    iget-object p1, p0, LP3;->b:Ljava/lang/Object;

    check-cast p1, Lik;

    iput-object p1, v1, Lik;->d:Lik;

    iget-object p1, p1, Lik;->c:Lik;

    iput-object p1, v1, Lik;->c:Lik;

    iput-object v1, p1, Lik;->d:Lik;

    iget-object p1, v1, Lik;->d:Lik;

    iput-object v1, p1, Lik;->c:Lik;

    iget-object p1, v1, Lik;->b:Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    if-lez p1, :cond_2

    iget-object v0, v1, Lik;->b:Ljava/util/ArrayList;

    add-int/lit8 p1, p1, -0x1

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method

.method public C(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 1

    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    if-nez v0, :cond_3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, LP3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p1, Lyf;

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    instance-of v0, p1, Landroid/text/method/NumberKeyListener;

    if-eqz v0, :cond_2

    return-object p1

    :cond_2
    new-instance v0, Lyf;

    invoke-direct {v0, p1}, Lyf;-><init>(Landroid/text/method/KeyListener;)V

    return-object v0

    :cond_3
    return-object p1
.end method

.method public declared-synchronized D(Ljava/lang/String;)Ljava/util/List;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LP3;->c:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit p0

    return-object v0

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public E(Landroid/content/Context;Lcom/bumptech/glide/a;LRn;Lzi;Z)Lgw;
    .locals 4

    invoke-static {}, LvD;->a()V

    invoke-static {}, LvD;->a()V

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgw;

    if-nez v1, :cond_1

    new-instance v1, LVn;

    invoke-direct {v1, p3}, LVn;-><init>(LRn;)V

    iget-object v2, p0, LP3;->c:Ljava/lang/Object;

    check-cast v2, Lhw;

    new-instance v3, LPg;

    invoke-direct {v3, p0, p4}, LPg;-><init>(LP3;Lzi;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p4, Lgw;

    invoke-direct {p4, p2, v1, v3, p1}, Lgw;-><init>(Lcom/bumptech/glide/a;LQn;Llw;Landroid/content/Context;)V

    invoke-virtual {v0, p3, p4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lbo;

    invoke-direct {p1, p0, p3}, Lbo;-><init>(LP3;LRn;)V

    invoke-virtual {v1, p1}, LVn;->l(LWn;)V

    if-eqz p5, :cond_0

    invoke-virtual {p4}, Lgw;->k()V

    :cond_0
    return-object p4

    :cond_1
    return-object v1
.end method

.method public declared-synchronized F(Ljava/lang/Class;Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 5

    monitor-enter p0

    :try_start_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    iget-object v3, p0, LP3;->c:Ljava/lang/Object;

    check-cast v3, Ljava/util/HashMap;

    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ltw;

    iget-object v4, v3, Ltw;->a:Ljava/lang/Class;

    invoke-virtual {v4, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object v4, v3, Ltw;->b:Ljava/lang/Class;

    invoke-virtual {p2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_2

    iget-object v4, v3, Ltw;->b:Ljava/lang/Class;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v3, v3, Ltw;->b:Ljava/lang/Class;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_4
    monitor-exit p0

    return-object v0

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public G(LSm;)Ljava/lang/String;
    .locals 8

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, LCp;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, LCp;

    invoke-virtual {v1, p1}, LCp;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    if-nez v1, :cond_1

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lw4;

    invoke-virtual {v0}, Lw4;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYw;

    :try_start_1
    iget-object v1, v0, LYw;->a:Ljava/security/MessageDigest;

    invoke-interface {p1, v1}, LSm;->b(Ljava/security/MessageDigest;)V

    iget-object v1, v0, LYw;->a:Ljava/security/MessageDigest;

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v1

    sget-object v2, LvD;->b:[C

    monitor-enter v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    const/4 v3, 0x0

    :goto_0
    :try_start_2
    array-length v4, v1

    if-ge v3, v4, :cond_0

    aget-byte v4, v1, v3

    and-int/lit16 v5, v4, 0xff

    mul-int/lit8 v6, v3, 0x2

    sget-object v7, LvD;->a:[C

    ushr-int/lit8 v5, v5, 0x4

    aget-char v5, v7, v5

    aput-char v5, v2, v6

    add-int/lit8 v6, v6, 0x1

    and-int/lit8 v4, v4, 0xf

    aget-char v4, v7, v4

    aput-char v4, v2, v6

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/String;-><init>([C)V

    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v2, p0, LP3;->c:Ljava/lang/Object;

    check-cast v2, Lw4;

    invoke-virtual {v2, v0}, Lw4;->a(Ljava/lang/Object;)Z

    goto :goto_1

    :catchall_0
    move-exception p1

    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception p1

    iget-object v1, p0, LP3;->c:Ljava/lang/Object;

    check-cast v1, Lw4;

    invoke-virtual {v1, v0}, Lw4;->a(Ljava/lang/Object;)Z

    throw p1

    :cond_1
    :goto_1
    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, LCp;

    monitor-enter v2

    :try_start_5
    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, LCp;

    invoke-virtual {v0, p1, v1}, LCp;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    monitor-exit v2

    return-object v1

    :catchall_2
    move-exception p1

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    throw p1

    :catchall_3
    move-exception p1

    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    throw p1
.end method

.method public I()V
    .locals 1

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/util/SparseIntArray;

    invoke-virtual {v0}, Landroid/util/SparseIntArray;->clear()V

    return-void
.end method

.method public J(Landroid/util/AttributeSet;I)V
    .locals 8

    iget v0, p0, LP3;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LWu;->i:[I

    const/4 v2, 0x0

    invoke-virtual {v0, p1, v1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    const/16 p2, 0xe

    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p2

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual {p0, v1}, LP3;->S(Z)V

    return-void

    :goto_1
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw p2

    :pswitch_0
    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/AbsSeekBar;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, LP3;->d:[I

    invoke-static {v1, p1, v2, p2}, Lw4;->A(Landroid/content/Context;Landroid/util/AttributeSet;[II)Lw4;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lw4;->r(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_3

    instance-of v3, v1, Landroid/graphics/drawable/AnimationDrawable;

    if-eqz v3, :cond_2

    check-cast v1, Landroid/graphics/drawable/AnimationDrawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result v3

    new-instance v4, Landroid/graphics/drawable/AnimationDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->isOneShot()Z

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V

    move v5, p2

    :goto_2
    const/16 v6, 0x2710

    if-ge v5, v3, :cond_1

    invoke-virtual {v1, v5}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {p0, v7, v2}, LP3;->U(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v7, v6}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    invoke-virtual {v1, v5}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I

    move-result v6

    invoke-virtual {v4, v7, v6}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_1
    invoke-virtual {v4, v6}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    move-object v1, v4

    :cond_2
    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    invoke-virtual {p1, v2}, Lw4;->r(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {p0, v1, p2}, LP3;->U(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/ProgressBar;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_4
    invoke-virtual {p1}, Lw4;->E()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public K(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)Lvf;
    .locals 2

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, LD2;

    if-nez p1, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, LP3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v1, p1, Lvf;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    new-instance v1, Lvf;

    iget-object v0, v0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/widget/EditText;

    invoke-direct {v1, v0, p1, p2}, Lvf;-><init>(Landroid/widget/EditText;Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/EditorInfo;)V

    move-object p1, v1

    :goto_0
    check-cast p1, Lvf;

    return-object p1
.end method

.method public L(LSh;)V
    .locals 5

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Ldw;

    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, LXm;

    iget v2, p1, LSh;->b:I

    if-nez v2, :cond_0

    iget-object p1, p1, LSh;->a:Landroid/graphics/Typeface;

    new-instance v2, LB0;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct {v2, v1, p1, v3, v4}, LB0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IZ)V

    invoke-virtual {v0, v2}, Ldw;->execute(Ljava/lang/Runnable;)V

    return-void

    :cond_0
    new-instance p1, LH6;

    const/4 v3, 0x0

    invoke-direct {p1, v2, v3, v1}, LH6;-><init>(IILjava/lang/Object;)V

    invoke-virtual {v0, p1}, Ldw;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

.method public M(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V
    .locals 9

    new-instance v0, Lqb;

    invoke-direct {v0}, Lqb;-><init>()V

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeCount()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_e

    invoke-interface {p2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeName(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v3}, Lorg/xmlpull/v1/XmlPullParser;->getAttributeValue(I)Ljava/lang/String;

    move-result-object v5

    if-eqz v4, :cond_d

    if-nez v5, :cond_0

    goto/16 :goto_7

    :cond_0
    const-string v6, "id"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_d

    const-string v1, "/"

    invoke-virtual {v5, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v3, -0x1

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    const/16 v1, 0x2f

    invoke-virtual {v5, v1}, Ljava/lang/String;->indexOf(I)I

    move-result v1

    add-int/2addr v1, v4

    invoke-virtual {v5, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v1, v6, v8}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    goto :goto_1

    :cond_1
    move v1, v3

    :goto_1
    if-ne v1, v3, :cond_2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-le v3, v4, :cond_2

    invoke-virtual {v5, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    :cond_2
    :try_start_0
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v3

    const/4 v5, 0x0

    move-object v6, v5

    :goto_2
    if-eq v3, v4, :cond_c

    if-eqz v3, :cond_a

    const/4 v7, 0x2

    if-eq v3, v7, :cond_4

    const/4 v7, 0x3

    if-eq v3, v7, :cond_3

    goto/16 :goto_5

    :cond_3
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    goto/16 :goto_5

    :sswitch_0
    const-string v7, "constraintset"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto/16 :goto_6

    :sswitch_1
    const-string v7, "constraintoverride"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_3

    :sswitch_2
    const-string v7, "constraint"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_3

    :sswitch_3
    const-string v7, "guideline"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    :goto_3
    iget-object v3, v0, Lqb;->c:Ljava/util/HashMap;

    iget v7, v6, Llb;->a:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v6, v5

    goto/16 :goto_5

    :cond_4
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v7
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v8, "XML parser error must be within a Constraint "

    sparse-switch v7, :sswitch_data_1

    goto/16 :goto_5

    :sswitch_4
    :try_start_1
    const-string v7, "Constraint"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v3

    invoke-static {p1, v3, v2}, Lqb;->d(Landroid/content/Context;Landroid/util/AttributeSet;Z)Llb;

    move-result-object v6

    goto/16 :goto_5

    :sswitch_5
    const-string v7, "CustomAttribute"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_4

    :sswitch_6
    const-string v7, "Barrier"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v3

    invoke-static {p1, v3, v2}, Lqb;->d(Landroid/content/Context;Landroid/util/AttributeSet;Z)Llb;

    move-result-object v6

    iget-object v3, v6, Llb;->d:Lmb;

    iput v4, v3, Lmb;->h0:I

    goto/16 :goto_5

    :sswitch_7
    const-string v7, "CustomMethod"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    :goto_4
    if-eqz v6, :cond_5

    iget-object v3, v6, Llb;->f:Ljava/util/HashMap;

    invoke-static {p1, p2, v3}, Ldb;->a(Landroid/content/Context;Landroid/content/res/XmlResourceParser;Ljava/util/HashMap;)V

    goto/16 :goto_5

    :cond_5
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_8
    const-string v7, "Guideline"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v3

    invoke-static {p1, v3, v2}, Lqb;->d(Landroid/content/Context;Landroid/util/AttributeSet;Z)Llb;

    move-result-object v6

    iget-object v3, v6, Llb;->d:Lmb;

    iput-boolean v4, v3, Lmb;->a:Z

    goto/16 :goto_5

    :sswitch_9
    const-string v7, "Transform"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    if-eqz v6, :cond_6

    iget-object v3, v6, Llb;->e:Lpb;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v7

    invoke-virtual {v3, p1, v7}, Lpb;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_5

    :cond_6
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_a
    const-string v7, "PropertySet"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    if-eqz v6, :cond_7

    iget-object v3, v6, Llb;->b:Lob;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v7

    invoke-virtual {v3, p1, v7}, Lob;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto/16 :goto_5

    :cond_7
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_b
    const-string v7, "ConstraintOverride"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v3

    invoke-static {p1, v3, v4}, Lqb;->d(Landroid/content/Context;Landroid/util/AttributeSet;Z)Llb;

    move-result-object v6

    goto :goto_5

    :sswitch_c
    const-string v7, "Motion"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    if-eqz v6, :cond_8

    iget-object v3, v6, Llb;->c:Lnb;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v7

    invoke-virtual {v3, p1, v7}, Lnb;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_5

    :cond_8
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :sswitch_d
    const-string v7, "Layout"

    invoke-virtual {v3, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_b

    if-eqz v6, :cond_9

    iget-object v3, v6, Llb;->d:Lmb;

    invoke-static {p2}, Landroid/util/Xml;->asAttributeSet(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;

    move-result-object v7

    invoke-virtual {v3, p1, v7}, Lmb;->a(Landroid/content/Context;Landroid/util/AttributeSet;)V

    goto :goto_5

    :cond_9
    new-instance p1, Ljava/lang/RuntimeException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getLineNumber()I

    move-result p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :cond_b
    :goto_5
    invoke-interface {p2}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v3
    :try_end_1
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    :catch_0
    :cond_c
    :goto_6
    iget-object p1, p0, LP3;->c:Ljava/lang/Object;

    check-cast p1, Landroid/util/SparseArray;

    invoke-virtual {p1, v1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void

    :cond_d
    :goto_7
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_e
    return-void

    :sswitch_data_0
    .sparse-switch
        -0x7bb8f310 -> :sswitch_3
        -0xb58ea23 -> :sswitch_2
        0x196d04a9 -> :sswitch_1
        0x7feafd65 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x78c018b6 -> :sswitch_d
        -0x7648542a -> :sswitch_c
        -0x74f4db17 -> :sswitch_b
        -0x4bab3dd3 -> :sswitch_a
        -0x49cf74b4 -> :sswitch_9
        -0x446d330 -> :sswitch_8
        0x15d883d2 -> :sswitch_7
        0x4f5d3b97 -> :sswitch_6
        0x6acd460b -> :sswitch_5
        0x6b78f1fd -> :sswitch_4
    .end sparse-switch
.end method

.method public N(LVt;Ljava/lang/Object;)V
    .locals 4

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lik;

    if-nez v1, :cond_0

    new-instance v1, Lik;

    invoke-direct {v1, p1}, Lik;-><init>(LVt;)V

    iput-object v1, v1, Lik;->d:Lik;

    iget-object v2, p0, LP3;->b:Ljava/lang/Object;

    check-cast v2, Lik;

    iget-object v3, v2, Lik;->d:Lik;

    iput-object v3, v1, Lik;->d:Lik;

    iput-object v2, v1, Lik;->c:Lik;

    iput-object v1, v2, Lik;->d:Lik;

    iget-object v2, v1, Lik;->d:Lik;

    iput-object v1, v2, Lik;->c:Lik;

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LVt;->a()V

    :goto_0
    iget-object p1, v1, Lik;->b:Ljava/util/ArrayList;

    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, v1, Lik;->b:Ljava/util/ArrayList;

    :cond_1
    iget-object p1, v1, Lik;->b:Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public O(Llu;)V
    .locals 4

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    new-instance v1, Lpu;

    iget-object v2, p1, Llu;->a:Ljava/lang/Class;

    const-class v3, Lp9;

    invoke-direct {v1, v2, v3}, Lpu;-><init>(Ljava/lang/Class;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llu;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal PrimitiveConstructor object for already existing object of type: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public P(Luu;)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/HashMap;

    if-eqz p1, :cond_2

    invoke-interface {p1}, Luu;->c()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luu;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "wrapper must be non-null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Q(Ljava/lang/String;)V
    .locals 5

    const-string v0, "Removed the wrong lock, expected to remove: "

    const-string v1, "Cannot release a lock that is not held, safeKey: "

    monitor-enter p0

    :try_start_0
    iget-object v2, p0, LP3;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LWd;

    const-string v3, "Argument must not be null"

    invoke-static {v3, v2}, LQj;->j(Ljava/lang/String;Ljava/lang/Object;)V

    iget v3, v2, LWd;->b:I

    const/4 v4, 0x1

    if-lt v3, v4, :cond_3

    sub-int/2addr v3, v4

    iput v3, v2, LWd;->b:I

    if-nez v3, :cond_2

    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LWd;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    iget-object p1, p0, LP3;->c:Ljava/lang/Object;

    check-cast p1, Ln6;

    iget-object v0, p1, Ln6;->a:Ljava/util/ArrayDeque;

    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v3, p1, Ln6;->a:Ljava/util/ArrayDeque;

    invoke-virtual {v3}, Ljava/util/ArrayDeque;->size()I

    move-result v3

    const/16 v4, 0xa

    if-ge v3, v4, :cond_0

    iget-object p1, p1, Ln6;->a:Ljava/util/ArrayDeque;

    invoke-virtual {p1, v1}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    throw p1

    :cond_1
    new-instance v3, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", but actually removed: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", safeKey: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v3

    :catchall_1
    move-exception p1

    goto :goto_3

    :cond_2
    :goto_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object p1, v2, LWd;->a:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    return-void

    :cond_3
    :try_start_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", interestedThreads: "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, v2, LWd;->b:I

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    throw p1
.end method

.method public R()Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Lik;

    iget-object v1, v0, Lik;->d:Lik;

    :goto_0
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    iget-object v3, v1, Lik;->a:Ljava/lang/Object;

    const/4 v4, 0x0

    if-nez v2, :cond_3

    iget-object v2, v1, Lik;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_1
    if-lez v2, :cond_1

    iget-object v4, v1, Lik;->b:Ljava/util/ArrayList;

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v4

    :cond_1
    if-eqz v4, :cond_2

    return-object v4

    :cond_2
    iget-object v2, v1, Lik;->d:Lik;

    iget-object v4, v1, Lik;->c:Lik;

    iput-object v4, v2, Lik;->c:Lik;

    iget-object v4, v1, Lik;->c:Lik;

    iput-object v2, v4, Lik;->d:Lik;

    iget-object v2, p0, LP3;->c:Ljava/lang/Object;

    check-cast v2, Ljava/util/HashMap;

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, LVt;

    invoke-interface {v3}, LVt;->a()V

    iget-object v1, v1, Lik;->d:Lik;

    goto :goto_0

    :cond_3
    return-object v4
.end method

.method public S(Z)V
    .locals 5

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, LD2;

    iget-object v0, v0, LD2;->b:Ljava/lang/Object;

    check-cast v0, LP3;

    iget-object v0, v0, LP3;->c:Ljava/lang/Object;

    check-cast v0, LEf;

    iget-boolean v1, v0, LEf;->c:Z

    if-eq v1, p1, :cond_1

    iget-object v1, v0, LEf;->b:LDf;

    if-eqz v1, :cond_0

    invoke-static {}, Lpf;->a()Lpf;

    move-result-object v1

    iget-object v2, v0, LEf;->b:LDf;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v3, "initCallback cannot be null"

    invoke-static {v3, v2}, Lcr;->g(Ljava/lang/String;Ljava/lang/Object;)V

    iget-object v3, v1, Lpf;->a:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/concurrent/locks/Lock;->lock()V

    :try_start_0
    iget-object v1, v1, Lpf;->b:LO4;

    invoke-virtual {v1, v2}, LO4;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    throw p1

    :cond_0
    :goto_0
    iput-boolean p1, v0, LEf;->c:Z

    if-eqz p1, :cond_1

    iget-object p1, v0, LEf;->a:Landroid/widget/EditText;

    invoke-static {}, Lpf;->a()Lpf;

    move-result-object v0

    invoke-virtual {v0}, Lpf;->b()I

    move-result v0

    invoke-static {p1, v0}, LEf;->a(Landroid/widget/EditText;I)V

    :cond_1
    return-void
.end method

.method public T(IIII)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, LS6;

    iget-object v1, v0, LS6;->d:Landroid/graphics/Rect;

    invoke-virtual {v1, p1, p2, p3, p4}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v1, v0, LS6;->c:Landroid/graphics/Rect;

    iget v2, v1, Landroid/graphics/Rect;->left:I

    add-int/2addr p1, v2

    iget v2, v1, Landroid/graphics/Rect;->top:I

    add-int/2addr p2, v2

    iget v2, v1, Landroid/graphics/Rect;->right:I

    add-int/2addr p3, v2

    iget v1, v1, Landroid/graphics/Rect;->bottom:I

    add-int/2addr p4, v1

    invoke-static {v0, p1, p2, p3, p4}, LS6;->a(LS6;IIII)V

    return-void
.end method

.method public U(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
    .locals 7

    instance-of v0, p1, LQF;

    if-eqz v0, :cond_0

    move-object p2, p1

    check-cast p2, LQF;

    check-cast p2, LRF;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto/16 :goto_4

    :cond_0
    instance-of v0, p1, Landroid/graphics/drawable/LayerDrawable;

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    check-cast p1, Landroid/graphics/drawable/LayerDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result p2

    new-array v0, p2, [Landroid/graphics/drawable/Drawable;

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, p2, :cond_3

    invoke-virtual {p1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I

    move-result v4

    invoke-virtual {p1, v3}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    const v6, 0x102000d

    if-eq v4, v6, :cond_2

    const v6, 0x102000f

    if-ne v4, v6, :cond_1

    goto :goto_1

    :cond_1
    move v4, v2

    goto :goto_2

    :cond_2
    :goto_1
    move v4, v1

    :goto_2
    invoke-virtual {p0, v5, v4}, LP3;->U(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    aput-object v4, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    new-instance v1, Landroid/graphics/drawable/LayerDrawable;

    invoke-direct {v1, v0}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    :goto_3
    if-ge v2, p2, :cond_4

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerGravity(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerGravity(II)V

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerWidth(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerWidth(II)V

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerHeight(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerHeight(II)V

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetLeft(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetLeft(II)V

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetRight(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetRight(II)V

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetTop(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetTop(II)V

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetBottom(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetBottom(II)V

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetStart(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetStart(II)V

    invoke-virtual {p1, v2}, Landroid/graphics/drawable/LayerDrawable;->getLayerInsetEnd(I)I

    move-result v0

    invoke-virtual {v1, v2, v0}, Landroid/graphics/drawable/LayerDrawable;->setLayerInsetEnd(II)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_4
    return-object v1

    :cond_5
    instance-of v0, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v0, :cond_8

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v0

    iget-object v2, p0, LP3;->c:Ljava/lang/Object;

    check-cast v2, Landroid/graphics/Bitmap;

    if-nez v2, :cond_6

    iput-object v0, p0, LP3;->c:Ljava/lang/Object;

    :cond_6
    new-instance v2, Landroid/graphics/drawable/ShapeDrawable;

    const/16 v3, 0x8

    new-array v3, v3, [F

    fill-array-data v3, :array_0

    new-instance v4, Landroid/graphics/drawable/shapes/RoundRectShape;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5, v5}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    invoke-direct {v2, v4}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    new-instance v3, Landroid/graphics/BitmapShader;

    sget-object v4, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    sget-object v5, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v3, v0, v4, v5}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    invoke-virtual {v2}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v0

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Paint;->getColorFilter()Landroid/graphics/ColorFilter;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    if-eqz p2, :cond_7

    new-instance p1, Landroid/graphics/drawable/ClipDrawable;

    const/4 p2, 0x3

    invoke-direct {p1, v2, p2, v1}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    return-object p1

    :cond_7
    return-object v2

    :cond_8
    :goto_4
    return-object p1

    nop

    :array_0
    .array-data 4
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
        0x40a00000    # 5.0f
    .end array-data
.end method

.method public a()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, LdD;

    return-object v0
.end method

.method public b(LI0;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, LH0;

    invoke-interface {v0, p1, p2}, LH0;->b(LI0;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public c(Ljava/lang/Object;Ljava/io/File;Lvt;)Z
    .locals 3

    check-cast p1, Lpw;

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, LK5;

    new-instance v1, LO5;

    invoke-interface {p1}, Lpw;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object p1

    iget-object v2, p0, LP3;->b:Ljava/lang/Object;

    check-cast v2, LN5;

    invoke-direct {v1, v2, p1}, LO5;-><init>(LN5;Landroid/graphics/Bitmap;)V

    invoke-virtual {v0, v1, p2, p3}, LK5;->c(Ljava/lang/Object;Ljava/io/File;Lvt;)Z

    move-result p1

    return p1
.end method

.method public d(LI0;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, LH0;

    invoke-interface {v0, p1, p2}, LH0;->d(LI0;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public e(I)V
    .locals 1

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lo4;

    invoke-static {v0, p1}, Lo4;->e(Lo4;I)V

    return-void
.end method

.method public f(Lvt;)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method

.method public g(LI0;Landroid/view/Menu;)Z
    .locals 2

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, LE3;

    iget-object v0, v0, LE3;->A:Landroid/view/ViewGroup;

    sget-object v1, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LcE;->c(Landroid/view/View;)V

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, LH0;

    invoke-interface {v0, p1, p2}, LH0;->g(LI0;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public h(LI0;)V
    .locals 3

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, LH0;

    invoke-interface {v0, p1}, LH0;->h(LI0;)V

    iget-object p1, p0, LP3;->c:Ljava/lang/Object;

    check-cast p1, LE3;

    iget-object v0, p1, LE3;->w:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p1, LE3;->l:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p1, LE3;->x:Lr3;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object v0, p1, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_2

    iget-object v0, p1, LE3;->y:LGE;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, LGE;->b()V

    :cond_1
    iget-object v0, p1, LE3;->v:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, LlE;->a(Landroid/view/View;)LGE;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, LGE;->a(F)V

    iput-object v0, p1, LE3;->y:LGE;

    new-instance v1, Lt3;

    const/4 v2, 0x2

    invoke-direct {v1, v2, p0}, Lt3;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, LGE;->d(LIE;)V

    :cond_2
    iget-object v0, p1, LE3;->n:Ljava/lang/Object;

    iget-object v1, p1, LE3;->u:LI0;

    invoke-interface {v0, v1}, Lg3;->onSupportActionModeFinished(LI0;)V

    const/4 v0, 0x0

    iput-object v0, p1, LE3;->u:LI0;

    iget-object v0, p1, LE3;->A:Landroid/view/ViewGroup;

    sget-object v1, LlE;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, LcE;->c(Landroid/view/View;)V

    invoke-virtual {p1}, LE3;->I()V

    return-void
.end method

.method public i(Ljava/lang/CharSequence;IILYB;)Z
    .locals 3

    iget v0, p4, LYB;->c:I

    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x1

    if-lez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, LdD;

    if-nez v0, :cond_2

    new-instance v0, LdD;

    instance-of v2, p1, Landroid/text/Spannable;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/text/Spannable;

    goto :goto_0

    :cond_1
    new-instance v2, Landroid/text/SpannableString;

    invoke-direct {v2, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    move-object p1, v2

    :goto_0
    invoke-direct {v0, p1}, LdD;-><init>(Landroid/text/Spannable;)V

    iput-object v0, p0, LP3;->b:Ljava/lang/Object;

    :cond_2
    iget-object p1, p0, LP3;->c:Ljava/lang/Object;

    check-cast p1, Lm6;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p1, LZB;

    invoke-direct {p1, p4}, LZB;-><init>(LYB;)V

    iget-object p4, p0, LP3;->b:Ljava/lang/Object;

    check-cast p4, LdD;

    const/16 v0, 0x21

    invoke-virtual {p4, p1, p2, p3, v0}, LdD;->setSpan(Ljava/lang/Object;III)V

    return v1
.end method

.method public j(I)V
    .locals 1

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lo4;

    invoke-static {v0, p1}, Lo4;->d(Lo4;I)V

    return-void
.end method

.method public k(IF)V
    .locals 0

    return-void
.end method

.method public m(Lhi;Landroid/os/Bundle;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, v2}, LP3;->m(Lhi;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p3, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1, p2}, Lvi;->onFragmentActivityCreated(Lzi;Lhi;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public n(Lhi;Z)V
    .locals 4

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->u:Lji;

    iget-object v1, v1, Lji;->m:Lc3;

    iget-object v2, v0, Lzi;->w:Lhi;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lhi;->f()Lzi;

    move-result-object v2

    iget-object v2, v2, Lzi;->m:LP3;

    const/4 v3, 0x1

    invoke-virtual {v2, p1, v3}, LP3;->n(Lhi;Z)V

    :cond_0
    iget-object v2, p0, LP3;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Loi;

    if-eqz p2, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v3, v3, Loi;->a:Lvi;

    invoke-virtual {v3, v0, p1, v1}, Lvi;->onFragmentAttached(Lzi;Lhi;Landroid/content/Context;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public o(Lhi;Landroid/os/Bundle;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, v2}, LP3;->o(Lhi;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p3, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1, p2}, Lvi;->onFragmentCreated(Lzi;Lhi;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public p(Lhi;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, LP3;->p(Lhi;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1}, Lvi;->onFragmentDestroyed(Lzi;Lhi;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public q(Lhi;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, LP3;->q(Lhi;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1}, Lvi;->onFragmentDetached(Lzi;Lhi;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public r(Landroid/widget/EditText;)V
    .locals 5

    iget v0, p0, LP3;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Lvx;

    iget-object v0, v0, Lvx;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, p1}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Landroid/view/View;

    instance-of v1, v0, LyA;

    if-eqz v1, :cond_0

    check-cast v0, LyA;

    invoke-virtual {v0, p1}, LyA;->setValue(Ljava/lang/String;)V

    :cond_0
    return-void

    :pswitch_0
    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Ltz;->e0(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const-wide v1, -0x50befffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_3

    sget-object v1, Lhe;->a:Lhd;

    sget-object v1, LVc;->b:LVc;

    invoke-static {v1}, LPj;->a(Lac;)LCb;

    move-result-object v1

    new-instance v2, Lga;

    iget-object v3, p0, LP3;->c:Ljava/lang/Object;

    check-cast v3, Lha;

    const/4 v4, 0x0

    invoke-direct {v2, p1, v0, v3, v4}, Lga;-><init>(Ljava/lang/String;Landroid/app/Activity;Lha;LEb;)V

    const/4 p1, 0x3

    invoke-static {v1, v2, p1}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    goto :goto_0

    :cond_3
    const-wide v1, -0x50bffffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0xb
        :pswitch_0
    .end packed-switch
.end method

.method public s(Lhi;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, LP3;->s(Lhi;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1}, Lvi;->onFragmentPaused(Lzi;Lhi;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public t(Lhi;Z)V
    .locals 4

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->u:Lji;

    iget-object v1, v1, Lji;->m:Lc3;

    iget-object v2, v0, Lzi;->w:Lhi;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lhi;->f()Lzi;

    move-result-object v2

    iget-object v2, v2, Lzi;->m:LP3;

    const/4 v3, 0x1

    invoke-virtual {v2, p1, v3}, LP3;->t(Lhi;Z)V

    :cond_0
    iget-object v2, p0, LP3;->b:Ljava/lang/Object;

    check-cast v2, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Loi;

    if-eqz p2, :cond_1

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v3, v3, Loi;->a:Lvi;

    invoke-virtual {v3, v0, p1, v1}, Lvi;->onFragmentPreAttached(Lzi;Lhi;Landroid/content/Context;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, LP3;->a:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_0
    iget-object v0, p0, LP3;->b:Ljava/lang/Object;

    check-cast v0, LFy;

    const-string v1, "[ "

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    const/16 v2, 0x9

    if-ge v0, v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, LFy;

    iget-object v1, v1, LFy;->h:[F

    aget v1, v1, v0

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, LFy;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "GroupedLinkedMap( "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Lik;

    iget-object v2, v1, Lik;->c:Lik;

    const/4 v3, 0x0

    move v4, v3

    :goto_1
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    const/16 v4, 0x7b

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v4, v2, Lik;->a:Ljava/lang/Object;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v4, 0x3a

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v4, v2, Lik;->b:Ljava/util/ArrayList;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    goto :goto_2

    :cond_1
    move v4, v3

    :goto_2
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "}, "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, Lik;->c:Lik;

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    if-eqz v4, :cond_3

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->delete(II)Ljava/lang/StringBuilder;

    :cond_3
    const-string v1, " )"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public u(Lhi;Landroid/os/Bundle;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, v2}, LP3;->u(Lhi;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p3, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1, p2}, Lvi;->onFragmentPreCreated(Lzi;Lhi;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public v(Lhi;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, LP3;->v(Lhi;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1}, Lvi;->onFragmentResumed(Lzi;Lhi;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public w(Lhi;Landroid/os/Bundle;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, v2}, LP3;->w(Lhi;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p3, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1, p2}, Lvi;->onFragmentSaveInstanceState(Lzi;Lhi;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public x(Lhi;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, LP3;->x(Lhi;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1}, Lvi;->onFragmentStarted(Lzi;Lhi;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public y(Lhi;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, v2}, LP3;->y(Lhi;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1}, Lvi;->onFragmentStopped(Lzi;Lhi;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public z(Lhi;Landroid/view/View;Landroid/os/Bundle;Z)V
    .locals 3

    iget-object v0, p0, LP3;->c:Ljava/lang/Object;

    check-cast v0, Lzi;

    iget-object v1, v0, Lzi;->w:Lhi;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lhi;->f()Lzi;

    move-result-object v1

    iget-object v1, v1, Lzi;->m:LP3;

    const/4 v2, 0x1

    invoke-virtual {v1, p1, p2, p3, v2}, LP3;->z(Lhi;Landroid/view/View;Landroid/os/Bundle;Z)V

    :cond_0
    iget-object v1, p0, LP3;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loi;

    if-eqz p4, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_0

    :cond_1
    iget-object v2, v2, Loi;->a:Lvi;

    invoke-virtual {v2, v0, p1, p2, p3}, Lvi;->onFragmentViewCreated(Lzi;Lhi;Landroid/view/View;Landroid/os/Bundle;)V

    goto :goto_0

    :cond_2
    return-void
.end method
