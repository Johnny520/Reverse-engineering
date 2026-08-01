.class public final Lxhss/ᛷᛶᛳᛷ;
.super Lxhss/ᛳᛱᛲᲈ;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Lxhss/ᛲᛸᛳᛳ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lxhss/ᛷᛶᛳᛷ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ()V
    .locals 1

    .line 1
    iget-object p0, p0, Lxhss/ᛷᛶᛳᛷ;->ᛷᛵᛵᲈ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/EditText;

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {p0, v0}, Lxhss/ᲁᲇᲇᛸ;->ᛷᛵᛵᲈ(Landroid/widget/EditText;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
