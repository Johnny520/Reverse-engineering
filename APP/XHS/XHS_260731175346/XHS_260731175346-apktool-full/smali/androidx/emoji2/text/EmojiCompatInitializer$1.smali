.class Landroidx/emoji2/text/EmojiCompatInitializer$1;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛶᲇᲈᲈ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Landroidx/lifecycle/ᛷᛵᛵᲈ;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/EmojiCompatInitializer;Landroidx/lifecycle/ᛷᛵᛵᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/emoji2/text/EmojiCompatInitializer$1;->ᛱᛱᛲᲇ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛳᲁᲇᛸ()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lxhss/ᲇᲇᛵᛶ;->ᛷᛵᛵᲈ(Landroid/os/Looper;)Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lxhss/ᲀᛸᲁᛲ;

    .line 10
    .line 11
    invoke-direct {v1}, Lxhss/ᲀᛸᲁᛲ;-><init>()V

    .line 12
    .line 13
    .line 14
    const-wide/16 v2, 0x1f4

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/emoji2/text/EmojiCompatInitializer$1;->ᛱᛱᛲᲇ:Landroidx/lifecycle/ᛷᛵᛵᲈ;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ(Lxhss/ᛱᲀᛲᲁ;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
