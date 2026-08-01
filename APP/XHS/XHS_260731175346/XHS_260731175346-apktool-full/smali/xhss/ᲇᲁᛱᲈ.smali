.class public final synthetic Lxhss/ᲇᲁᛱᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᲁᲇᲀ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᲇᛸᛲᲁ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᲇᛸᛲᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᲇᲁᛱᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛸᛲᲁ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V
    .locals 0

    .line 1
    sget-object p1, Lxhss/ᲈᲀᛵᛸ;->ON_START:Lxhss/ᲈᲀᛵᛸ;

    .line 2
    .line 3
    iget-object p0, p0, Lxhss/ᲇᲁᛱᲈ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛸᛲᲁ;

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lxhss/ᲇᛸᛲᲁ;->ᛷᛴᛷᛱ:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object p1, Lxhss/ᲈᲀᛵᛸ;->ON_STOP:Lxhss/ᲈᲀᛵᛸ;

    .line 12
    .line 13
    if-ne p2, p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, Lxhss/ᲇᛸᛲᲁ;->ᛷᛴᛷᛱ:Z

    .line 17
    .line 18
    :cond_1
    return-void
.end method
