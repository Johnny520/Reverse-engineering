.class Landroidx/emoji2/text/EmojiCompatInitializer$1;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᲁᛱᛷᛸ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;


# direct methods
.method public constructor <init>(Landroidx/emoji2/text/EmojiCompatInitializer;Landroidx/lifecycle/ᛲᲈᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/emoji2/text/EmojiCompatInitializer$1;->ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ()V
    .locals 4

    .line 1
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lyyds/ᛴᲇᲀᛲ;->ᛲᲈᲁ(Landroid/os/Looper;)Landroid/os/Handler;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lyyds/ᛵᛶᲇᛳ;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-direct {v1, v2}, Lyyds/ᛵᛶᲇᛳ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v2, 0x1f4

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 18
    .line 19
    .line 20
    iget-object v0, p0, Landroidx/emoji2/text/EmojiCompatInitializer$1;->ᲀᛲᛳᲀ:Landroidx/lifecycle/ᛲᲈᲁ;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroidx/lifecycle/ᛲᲈᲁ;->ᲇᲇᲇᛱ(Lyyds/ᛳᛶᲁᛴ;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
