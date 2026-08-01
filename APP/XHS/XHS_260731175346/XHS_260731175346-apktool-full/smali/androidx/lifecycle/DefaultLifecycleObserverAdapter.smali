.class public final Landroidx/lifecycle/DefaultLifecycleObserverAdapter;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᲁᲇᲀ;


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛶᲇᲈᲈ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛷᲁᲇᲀ;


# direct methods
.method public constructor <init>(Lxhss/ᛶᲇᲈᲈ;Lxhss/ᛷᲁᲇᲀ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->ᛱᛱᛲᲇ:Lxhss/ᛶᲇᲈᲈ;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->ᛳᲁᲇᛸ:Lxhss/ᛷᲁᲇᲀ;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V
    .locals 2

    .line 1
    sget-object v0, Lxhss/ᛳᛴᛲᲇ;->ᛷᛵᛵᲈ:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x7

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "ON_ANY must not been send by anybody"

    .line 17
    .line 18
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    iget-object v0, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->ᛱᛱᛲᲇ:Lxhss/ᛶᲇᲈᲈ;

    .line 23
    .line 24
    invoke-interface {v0}, Lxhss/ᛶᲇᲈᲈ;->ᛳᲁᲇᛸ()V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object p0, p0, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;->ᛳᲁᲇᛸ:Lxhss/ᛷᲁᲇᲀ;

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    invoke-interface {p0, p1, p2}, Lxhss/ᛷᲁᲇᲀ;->ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V

    .line 32
    .line 33
    .line 34
    :cond_2
    return-void
.end method
