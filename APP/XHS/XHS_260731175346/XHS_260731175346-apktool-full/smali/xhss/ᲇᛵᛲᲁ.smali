.class public final Lxhss/ᲇᛵᛲᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛱᛱᲇᲁ;
.implements Lxhss/ᛳᛶᛸᛷ;
.implements Lxhss/ᛲᛳᛳᛲ;
.implements Lxhss/ᛸᲈᛷ;
.implements Lxhss/ᲇᛸᛲᲀ;
.implements Lxhss/ᛵᲇᛷᲀ;


# static fields
.field public static final ᲇᛴᲇᛵ:Ljava/lang/Object;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public ᛳᲁᲇᛸ:Ljava/lang/Object;


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
    sput-object v0, Lxhss/ᲇᛵᛲᲁ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3

    .line 1
    iput p1, p0, Lxhss/ᲇᛵᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    sparse-switch p1, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object p1, Lxhss/ᛵᲇᛶ;->ᛳᲁᲇᛸ:Lxhss/ᛷᛱᛳᲁ;

    .line 7
    .line 8
    iget-object p1, p1, Lxhss/ᛷᛱᛳᲁ;->ᛷᛴᛷᛱ:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lxhss/ᛸᛵᛷᲁ;

    .line 11
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 16
    .line 17
    return-void

    .line 18
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 31
    .line 32
    return-void

    .line 33
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 34
    .line 35
    .line 36
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 37
    .line 38
    const/4 v0, 0x1

    .line 39
    const/4 v1, 0x0

    .line 40
    const/high16 v2, 0x3f400000    # 0.75f

    .line 41
    .line 42
    invoke-direct {p1, v1, v2, v0}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 43
    .line 44
    .line 45
    iput-object p1, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 46
    .line 47
    return-void

    .line 48
    :sswitch_3
    sget-object p1, Lxhss/ᛸᛱᛴᛳ;->ᛷᲁᲁ:Lxhss/ᛸᛱᛴᛳ;

    .line 49
    .line 50
    new-instance v0, Lxhss/ᲈᛲᲀᛵ;

    .line 51
    .line 52
    invoke-direct {v0, p1}, Lxhss/ᲈᛲᲀᛵ;-><init>(Lxhss/ᛸᛱᛴᛳ;)V

    .line 53
    .line 54
    .line 55
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 59
    .line 60
    return-void

    .line 61
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_3
        0xd -> :sswitch_2
        0x13 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 63
    iput p1, p0, Lxhss/ᲇᛵᛲᲁ;->ᛱᛱᛲᲇ:I

    iput-object p2, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x7

    iput v0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/widget/LinearLayout;Landroid/widget/Button;Landroid/widget/Button;)V
    .locals 0

    const/16 p1, 0x10

    iput p1, p0, Lxhss/ᲇᛵᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p3, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxhss/ᛲᛸᛳᛳ;I)V
    .locals 1

    iput p2, p0, Lxhss/ᲇᛵᛲᲁ;->ᛱᛱᛲᲇ:I

    packed-switch p2, :pswitch_data_0

    .line 64
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    new-instance p2, Lxhss/ᲇᛵᛲᲁ;

    const/16 v0, 0x8

    invoke-direct {p2, p1, v0}, Lxhss/ᲇᛵᛲᲁ;-><init>(Lxhss/ᛲᛸᛳᛳ;I)V

    iput-object p2, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void

    .line 66
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 67
    new-instance p2, Lxhss/ᛳᛱᛲᲀ;

    invoke-direct {p2, p1}, Lxhss/ᛳᛱᛲᲀ;-><init>(Lxhss/ᛲᛸᛳᛳ;)V

    iput-object p2, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lxhss/ᛸᛴᲇᛵ;)V
    .locals 9

    const/16 v0, 0x16

    iput v0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 72
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 73
    new-instance v1, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 74
    new-instance v7, Ljava/util/concurrent/SynchronousQueue;

    invoke-direct {v7}, Ljava/util/concurrent/SynchronousQueue;-><init>()V

    const/4 v2, 0x0

    const v3, 0x7fffffff

    const-wide/16 v4, 0x3c

    .line 75
    sget-object v6, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    move-object v8, p1

    invoke-direct/range {v1 .. v8}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    iput-object v1, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lxhss/ᛸᲀᛲᛴ;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    new-instance v0, Lxhss/ᲈᛸᛷᲁ;

    invoke-direct {v0, p1}, Lxhss/ᲈᛸᛷᲁ;-><init>(Lxhss/ᛸᲀᛲᛴ;)V

    iput-object v0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public ᛱᛱᛲᲇ()Lxhss/ᲁᛴᛶᛸ;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᲁᛴᛶᛸ;

    .line 4
    .line 5
    return-object p0
.end method

.method public ᛳᲁᲇᛸ(Lxhss/ᛸᲀᲇᛱ;)V
    .locals 2

    .line 1
    const-wide v0, -0x139221b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lxhss/ᛳᛱᛲᲀ;

    .line 12
    .line 13
    :try_start_0
    iget-object p0, p0, Lxhss/ᛳᛱᛲᲀ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lxhss/ᛷᛴᛲᛲ;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, p1}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    goto :goto_1

    .line 29
    :goto_0
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p0, p1

    .line 35
    :goto_1
    invoke-static {p0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    const-wide v0, -0x1392b1b858845L

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-wide v0, -0xfd181b858845L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    const-wide v0, -0xfd201b858845L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    return-void
.end method

.method public ᛳᲈᲈᛲ()Lxhss/ᛷᛴᲀᛳ;
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛷᛴᲀᛳ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛷᛴᲀᛳ;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lxhss/ᛸᛵᲇᲈ;

    .line 9
    .line 10
    iput-object p0, v0, Lxhss/ᛵᛷᛴᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛵᲇᲈ;

    .line 11
    .line 12
    return-object v0
.end method

.method public ᛴᲈᛱᛴ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    instance-of p0, p1, Ljava/util/Map;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/util/Map;

    .line 6
    .line 7
    sget-object p0, Lxhss/ᲇᛳᛶ;->ᲇᛶᛴᲀ:Lxhss/ᲇᛳᛶ;

    .line 8
    .line 9
    invoke-static {p1, p0}, Lxhss/ᛸᛲᛷᲇ;->ᛷᛴᛷᛱ(Ljava/util/Map;Lxhss/ᲇᛳᛶ;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    instance-of p0, p1, Ljava/util/List;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    check-cast p1, Ljava/util/List;

    .line 19
    .line 20
    sget-object p0, Lxhss/ᲇᛳᛶ;->ᲇᛶᛴᲀ:Lxhss/ᲇᛳᛶ;

    .line 21
    .line 22
    invoke-static {p1, p0}, Lxhss/ᛸᛱᲈᛵ;->ᛷᛴᛷᛱ(Ljava/util/List;Lxhss/ᲇᛳᛶ;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    instance-of p0, p1, Ljava/lang/Number;

    .line 28
    .line 29
    if-nez p0, :cond_3

    .line 30
    .line 31
    instance-of p0, p1, Ljava/lang/Boolean;

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    const-string v0, " can not be converted to JSON"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0

    .line 56
    :cond_3
    :goto_0
    sget-object p0, Lxhss/ᛵᲇᛶ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛳᛶ;

    .line 57
    .line 58
    new-instance v0, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    .line 62
    .line 63
    :try_start_0
    invoke-static {p1, v0, p0}, Lxhss/ᛵᲇᛶ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/StringBuilder;Lxhss/ᲇᛳᛶ;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 64
    .line 65
    .line 66
    :catch_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    return-object p0
.end method

.method public ᛶᲇᲈᛸ(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    instance-of p0, p2, Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    check-cast p2, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-ne p1, p0, :cond_0

    .line 12
    .line 13
    invoke-interface {p2, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-interface {p2, p1, p3}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public ᛷᛴᛷᛱ(ILjava/lang/Object;)V
    .locals 2

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
    if-eq p1, v1, :cond_0

    .line 38
    .line 39
    const/4 v1, 0x7

    .line 40
    if-eq p1, v1, :cond_0

    .line 41
    .line 42
    const/16 v1, 0x8

    .line 43
    .line 44
    if-eq p1, v1, :cond_0

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_0
    const-string v1, "ProfileInstaller"

    .line 48
    .line 49
    check-cast p2, Ljava/lang/Throwable;

    .line 50
    .line 51
    invoke-static {v1, v0, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 52
    .line 53
    .line 54
    :goto_1
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p0, Landroidx/profileinstaller/ProfileInstallReceiver;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Landroid/content/BroadcastReceiver;->setResultCode(I)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    nop

    .line 63
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

.method public ᛷᛵᛵᲈ()Lxhss/ᲈᲁᛲᲇ;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, v0

    .line 3
    :goto_0
    iget-object v2, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lxhss/ᲁᛴᛶᛸ;

    .line 6
    .line 7
    iget-object v2, v2, Lxhss/ᲁᛴᛶᛸ;->ᲈᛳᲀ:Lxhss/ᛸᲇᲇᛶ;

    .line 8
    .line 9
    iget-boolean v2, v2, Lxhss/ᛸᲇᲇᛶ;->ᛸᛲᛷᛱ:Z

    .line 10
    .line 11
    if-nez v2, :cond_6

    .line 12
    .line 13
    :try_start_0
    iget-object v2, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lxhss/ᲁᛴᛶᛸ;

    .line 16
    .line 17
    invoke-virtual {v2}, Lxhss/ᲁᛴᛶᛸ;->ᛱᛱᛲᲇ()Lxhss/ᛱᛸᲁᛶ;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Lxhss/ᛱᛸᲁᛶ;->ᲇᛴᲇᛵ()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_3

    .line 26
    .line 27
    invoke-interface {v2}, Lxhss/ᛱᛸᲁᛶ;->ᲀᲇᛳᲁ()Lxhss/ᛲᛷᛷᛵ;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iget-object v4, v3, Lxhss/ᛲᛷᛷᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛸᲁᛶ;

    .line 32
    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    iget-object v4, v3, Lxhss/ᛲᛷᛷᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Throwable;

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
    invoke-interface {v2}, Lxhss/ᛱᛸᲁᛶ;->ᛱᛱᛲᲇ()Lxhss/ᛲᛷᛷᛵ;

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
    iget-object v4, v3, Lxhss/ᛲᛷᛷᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛸᲁᛶ;

    .line 52
    .line 53
    iget-object v3, v3, Lxhss/ᛲᛷᛷᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Throwable;

    .line 54
    .line 55
    if-nez v3, :cond_2

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    iget-object v2, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v2, Lxhss/ᲁᛴᛶᛸ;

    .line 62
    .line 63
    iget-object v2, v2, Lxhss/ᲁᛴᛶᛸ;->ᛶᲇᲈᛸ:Lxhss/ᛸᲀᛷᛷ;

    .line 64
    .line 65
    invoke-virtual {v2, v4}, Lxhss/ᛸᲀᛷᛷ;->addFirst(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    throw v3

    .line 70
    :cond_3
    invoke-interface {v2}, Lxhss/ᛱᛸᲁᛶ;->ᛳᲁᲇᛸ()Lxhss/ᲈᲁᛲᲇ;

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
    invoke-static {v1, v2}, Lxhss/ᲈᲀᲀᛱ;->ᛷᛵᛵᲈ(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_4
    iget-object v2, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v2, Lxhss/ᲁᛴᛶᛸ;

    .line 85
    .line 86
    invoke-virtual {v2, v0}, Lxhss/ᲁᛴᛶᛸ;->ᛷᛵᛵᲈ(Lxhss/ᲈᲁᛲᲇ;)Z

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
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return-object v0
.end method

.method public ᛷᲁᲁ(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    .line 1
    instance-of p0, p1, Ljava/util/List;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 15
    .line 16
    .line 17
    throw p0
.end method

.method public ᛸᛲᛷᛱ(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 2

    .line 1
    instance-of p0, p1, Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    .line 7
    return-object p1

    .line 8
    :cond_0
    new-instance p0, Lxhss/ᛵᛲᛲᲇ;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    const-string v1, "Cannot iterate over "

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method

.method public ᛸᛲᲀᛵ(Lxhss/ᛳᛳᛵᛱ;)V
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᲀᛷᲈᛳ;

    .line 4
    .line 5
    iget-object v0, p0, Lxhss/ᲀᛷᲈᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛳᛵᛱ;

    .line 6
    .line 7
    iput-object p1, v0, Lxhss/ᛳᛳᛵᛱ;->ᛱᛱᛲᲇ:Lxhss/ᛳᛳᛵᛱ;

    .line 8
    .line 9
    iput-object v0, p1, Lxhss/ᛳᛳᛵᛱ;->ᛷᛵᛵᲈ:Lxhss/ᛳᛳᛵᛱ;

    .line 10
    .line 11
    iput-object p1, p0, Lxhss/ᲀᛷᲈᛳ;->ᲇᛶᛴᲀ:Lxhss/ᛳᛳᛵᛱ;

    .line 12
    .line 13
    return-void
.end method

.method public ᛸᛴᛶᛳ(Lxhss/ᛱᛱᛷᛸ;)V
    .locals 8

    .line 1
    new-instance v7, Lxhss/ᛱᛴᲁᲇ;

    .line 2
    .line 3
    const-string v0, "EmojiCompatInitializer"

    .line 4
    .line 5
    invoke-direct {v7, v0}, Lxhss/ᛱᛴᲁᲇ;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 9
    .line 10
    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 11
    .line 12
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    const-wide/16 v3, 0xf

    .line 18
    .line 19
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 20
    .line 21
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 22
    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lxhss/ᛲᛶᛴᛳ;

    .line 29
    .line 30
    invoke-direct {v1, p0, p1, v0}, Lxhss/ᛲᛶᛴᛳ;-><init>(Lxhss/ᲇᛵᛲᲁ;Lxhss/ᛱᛱᛷᛸ;Ljava/util/concurrent/ThreadPoolExecutor;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public ᛸᛶᛴᲈ(Z)V
    .locals 4

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᲇᛵᛲᲁ;

    .line 4
    .line 5
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lxhss/ᛳᛱᛲᲀ;

    .line 8
    .line 9
    iget-object p0, p0, Lxhss/ᛳᛱᛲᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lxhss/ᲁᲇᲇᛸ;

    .line 12
    .line 13
    iget-boolean v0, p0, Lxhss/ᲁᲇᲇᛸ;->ᛳᲁᲇᛸ:Z

    .line 14
    .line 15
    if-eq v0, p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lxhss/ᲁᲇᲇᛸ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛶᛳᛷ;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-static {}, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ()Lxhss/ᛵᲁᛱᲁ;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lxhss/ᲁᲇᲇᛸ;->ᛱᛱᛲᲇ:Lxhss/ᛷᛶᛳᛷ;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    const-string v2, "initCallback cannot be null"

    .line 31
    .line 32
    invoke-static {v1, v2}, Lxhss/ᛱᛷᛵᛷ;->ᲇᛴᲇᛵ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object v2, v0, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/locks/ReentrantReadWriteLock;

    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-interface {v3}, Ljava/util/concurrent/locks/Lock;->lock()V

    .line 42
    .line 43
    .line 44
    :try_start_0
    iget-object v0, v0, Lxhss/ᛵᲁᛱᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛲᛴᲇ;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lxhss/ᛴᛲᛴᲇ;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-interface {v0}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catchall_0
    move-exception p0

    .line 58
    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantReadWriteLock;->writeLock()Ljava/util/concurrent/locks/Lock;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-interface {p1}, Ljava/util/concurrent/locks/Lock;->unlock()V

    .line 63
    .line 64
    .line 65
    throw p0

    .line 66
    :cond_0
    :goto_0
    iput-boolean p1, p0, Lxhss/ᲁᲇᲇᛸ;->ᛳᲁᲇᛸ:Z

    .line 67
    .line 68
    if-eqz p1, :cond_1

    .line 69
    .line 70
    iget-object p0, p0, Lxhss/ᲁᲇᲇᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛲᛸᛳᛳ;

    .line 71
    .line 72
    invoke-static {}, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ()Lxhss/ᛵᲁᛱᲁ;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1}, Lxhss/ᛵᲁᛱᲁ;->ᛱᛱᛲᲇ()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-static {p0, p1}, Lxhss/ᲁᲇᲇᛸ;->ᛷᛵᛵᲈ(Landroid/widget/EditText;I)V

    .line 81
    .line 82
    .line 83
    :cond_1
    return-void
.end method

.method public ᛸᛶᲈᛶ(I)I
    .locals 2

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛸᛲᛷᛱ:[I

    .line 6
    .line 7
    invoke-static {p1}, Lxhss/ᛴᛸᛲᛳ;->ᲀᛷᲁᲀ(I)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_3

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    if-eq p1, v1, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x2

    .line 18
    if-eq p1, v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    if-eq p1, v1, :cond_0

    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    aget p0, p0, v1

    .line 25
    .line 26
    return p0

    .line 27
    :cond_1
    aget p0, p0, v1

    .line 28
    .line 29
    return p0

    .line 30
    :cond_2
    aget p0, p0, v1

    .line 31
    .line 32
    return p0

    .line 33
    :cond_3
    aget p0, p0, v0

    .line 34
    .line 35
    return p0
.end method

.method public ᛸᛷᲈᲈ()Lxhss/ᛵᛸᲈᛲ;
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛵᛸᲈᛲ;

    .line 2
    .line 3
    invoke-direct {v0}, Lxhss/ᛵᛷᛴᲁ;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lxhss/ᛸᛵᲇᲈ;

    .line 9
    .line 10
    iput-object p0, v0, Lxhss/ᛵᛷᛴᲁ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛵᲇᲈ;

    .line 11
    .line 12
    return-object v0
.end method

.method public ᲀᲇᛳᲁ(Lxhss/ᛵᛴᛲᛵ;)V
    .locals 2

    .line 1
    const-wide v0, -0x1393f1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Lxhss/ᛳᛱᛲᲀ;

    .line 12
    .line 13
    :try_start_0
    iget-object p0, p0, Lxhss/ᛳᛱᛲᲀ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Lxhss/ᛷᛴᛲᛲ;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0, p1}, Lxhss/ᛷᛴᛲᛲ;->ᲇᛴᲇᛵ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :catchall_0
    move-exception p0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    goto :goto_1

    .line 29
    :goto_0
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    move-object p0, p1

    .line 35
    :goto_1
    invoke-static {p0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    const-wide v0, -0x139481b858845L

    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    const-wide v0, -0xfd181b858845L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    const-wide v0, -0xfd201b858845L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {p1, p0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    :cond_1
    return-void
.end method

.method public ᲇᛴᲇᛵ()V
    .locals 2

    .line 1
    iget v0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, Lxhss/ᲁᛳᛵᛷ;

    .line 9
    .line 10
    iget-object p0, p0, Lxhss/ᲁᛳᛵᛷ;->ᛶᲇᲈᛸ:Lxhss/ᛱᛴᛳᛴ;

    .line 11
    .line 12
    invoke-virtual {p0}, Lxhss/ᛱᛴᛳᛴ;->ᛱᛲᛸᲇ()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lxhss/ᛱᛴᛳᛴ;->ᛱᲁᛳᛲ()Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    new-instance v0, Lxhss/ᲇᛶᲈᛸ;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p0, v1}, Lxhss/ᲇᛶᲈᛸ;-><init>(Lxhss/ᛱᛴᛳᛴ;I)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᛴᛴᛸ(Ljava/lang/Runnable;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    :goto_0
    return-void

    .line 35
    :pswitch_0
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p0, Lxhss/ᛲᛵᛶᲁ;

    .line 38
    .line 39
    iget-object p0, p0, Lxhss/ᛲᛵᛶᲁ;->ᲁᛲᛴᛴ:Lxhss/ᛵᲇᲀᛳ;

    .line 40
    .line 41
    iget-boolean v0, p0, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛸᛲᲀᛵ:Z

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    invoke-virtual {p0}, Lxhss/ᛵᲇᲀᛳ;->ᛱᛱᛴᲀ()V

    .line 46
    .line 47
    .line 48
    :cond_2
    return-void

    .line 49
    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public ᲇᛶᛴᲀ(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lxhss/ᛵᲈᛷ;

    .line 4
    .line 5
    iget-object p0, p0, Lxhss/ᛵᲈᛷ;->ᛷᛵᛵᲈ:Lxhss/ᲀᛲᲇ;

    .line 6
    .line 7
    iget-object p0, p0, Lxhss/ᲀᛲᲇ;->ᛷᛵᛵᲈ:Lxhss/ᲇᛵᛲᲁ;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    instance-of p0, p1, Ljava/util/List;

    .line 13
    .line 14
    return p0
.end method

.method public ᲇᛸᛳᲁ(Ljava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/util/List;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    instance-of v0, p1, Ljava/util/Map;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lxhss/ᲇᛵᛲᲁ;->ᛷᲁᲁ(Ljava/lang/Object;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/Collection;->size()I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_1
    instance-of p0, p1, Ljava/lang/String;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    check-cast p1, Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0

    .line 36
    :cond_2
    new-instance p0, Lxhss/ᛵᛲᛲᲇ;

    .line 37
    .line 38
    if-eqz p1, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_0

    .line 49
    :cond_3
    const-string p1, "null"

    .line 50
    .line 51
    :goto_0
    const-string v0, "length operation cannot be applied to "

    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p0
.end method

.method public ᲈᛳᲀ(Landroid/text/method/KeyListener;)Landroid/text/method/KeyListener;
    .locals 0

    .line 1
    instance-of p0, p1, Landroid/text/method/NumberKeyListener;

    .line 2
    .line 3
    if-nez p0, :cond_3

    .line 4
    .line 5
    instance-of p0, p1, Lxhss/ᛶᛷᛴᛸ;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    if-nez p1, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_1
    instance-of p0, p1, Landroid/text/method/NumberKeyListener;

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_2
    new-instance p0, Lxhss/ᛶᛷᛴᛸ;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Lxhss/ᛶᛷᛴᛸ;-><init>(Landroid/text/method/KeyListener;)V

    .line 22
    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_3
    return-object p1
.end method
