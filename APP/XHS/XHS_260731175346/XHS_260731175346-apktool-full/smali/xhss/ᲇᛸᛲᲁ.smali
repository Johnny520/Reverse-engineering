.class public final Lxhss/ᲇᛸᛲᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:Z

.field public ᛳᲁᲇᛸ:Landroid/os/Bundle;

.field public ᛷᛴᛷᛱ:Z

.field public final ᛷᛵᛵᲈ:Lxhss/ᲈᲀᲀᛵ;

.field public ᲇᛴᲇᛵ:Lxhss/ᛳᛷᲀᛱ;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᲈᲀᲀᛵ;

    .line 5
    .line 6
    invoke-direct {v0}, Lxhss/ᲈᲀᲀᛵ;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᲇᛸᛲᲁ;->ᛷᛵᛵᲈ:Lxhss/ᲈᲀᲀᛵ;

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    iput-boolean v0, p0, Lxhss/ᲇᛸᛲᲁ;->ᛷᛴᛷᛱ:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Ljava/lang/String;)Landroid/os/Bundle;
    .locals 0

    .line 1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 2
    .line 3
    const-string p1, "You can consumeRestoredStateForKey only after super.onCreate of corresponding component"

    .line 4
    .line 5
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method
