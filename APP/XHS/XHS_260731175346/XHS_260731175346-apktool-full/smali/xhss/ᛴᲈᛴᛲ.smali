.class public final Lxhss/ᛴᲈᛴᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛸᲈᛷ;

.field public final ᛳᲁᲇᛸ:[B

.field public final ᛷᛴᛷᛱ:Ljava/lang/String;

.field public final ᛷᛵᛵᲈ:Ljava/util/concurrent/Executor;

.field public ᛸᛴᛶᛳ:[B

.field public ᲀᲇᛳᲁ:[Lxhss/ᛶᲇᲈᛴ;

.field public final ᲇᛴᲇᛵ:Ljava/io/File;

.field public ᲇᛶᛴᲀ:Z


# direct methods
.method public constructor <init>(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Lxhss/ᛸᲈᛷ;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, Lxhss/ᛴᲈᛴᛲ;->ᲇᛶᛴᲀ:Z

    .line 6
    .line 7
    iput-object p2, p0, Lxhss/ᛴᲈᛴᛲ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/Executor;

    .line 8
    .line 9
    iput-object p3, p0, Lxhss/ᛴᲈᛴᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲈᛷ;

    .line 10
    .line 11
    iput-object p4, p0, Lxhss/ᛴᲈᛴᛲ;->ᛷᛴᛷᛱ:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p5, p0, Lxhss/ᛴᲈᛴᛲ;->ᲇᛴᲇᛵ:Ljava/io/File;

    .line 14
    .line 15
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 p2, 0x22

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    if-le p1, p2, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :pswitch_0
    sget-object p3, Lxhss/ᛵᛵᛲᲈ;->ᛳᲁᲇᛸ:[B

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :pswitch_1
    sget-object p3, Lxhss/ᛵᛵᛲᲈ;->ᲇᛴᲇᛵ:[B

    .line 31
    .line 32
    :goto_0
    iput-object p3, p0, Lxhss/ᛴᲈᛴᛲ;->ᛳᲁᲇᛸ:[B

    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_data_0
    .packed-switch 0x1e
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(ILjava/io/Serializable;)V
    .locals 1

    .line 1
    new-instance v0, Lxhss/ᛲᛵᲀᛲ;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, Lxhss/ᛲᛵᲀᛲ;-><init>(Lxhss/ᛴᲈᛴᛲ;ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lxhss/ᛴᲈᛴᛲ;->ᛷᛵᛵᲈ:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    invoke-interface {p0, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final ᛷᛵᛵᲈ(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    .locals 0

    .line 1
    :try_start_0
    invoke-virtual {p1, p2}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/AssetFileDescriptor;->createInputStream()Ljava/io/FileInputStream;

    .line 6
    .line 7
    .line 8
    move-result-object p0
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p0

    .line 10
    :catch_0
    move-exception p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const-string p1, "compressed"

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method
