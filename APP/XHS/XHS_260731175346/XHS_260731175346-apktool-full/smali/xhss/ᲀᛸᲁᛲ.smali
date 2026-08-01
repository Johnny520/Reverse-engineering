.class public final Lxhss/ᲀᛸᲁᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lxhss/ᲀᛸᲁᛲ;->ᛱᛱᛲᲇ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Lxhss/ᲇᛵᛲᲁ;I)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lxhss/ᲀᛸᲁᛲ;->ᛱᛱᛲᲇ:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final ᛷᛵᛵᲈ()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    .line 1
    iget p0, p0, Lxhss/ᲀᛸᲁᛲ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :try_start_0
    const-string p0, "EmojiCompat.EmojiCompatInitializer.run"

    .line 7
    .line 8
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lxhss/ᛵᲁᛱᲁ;->ᲈᛳᲀ:Lxhss/ᛵᲁᛱᲁ;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    :goto_0
    if-eqz p0, :cond_1

    .line 19
    .line 20
    invoke-static {}, Lxhss/ᛵᲁᛱᲁ;->ᛷᛵᛵᲈ()Lxhss/ᛵᲁᛱᲁ;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {p0}, Lxhss/ᛵᲁᛱᲁ;->ᛳᲁᲇᛸ()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    .line 26
    .line 27
    :cond_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catchall_0
    move-exception p0

    .line 32
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :pswitch_0
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
