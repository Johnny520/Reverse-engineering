.class public final Lxhss/ᛴᲀᛵᛱ;
.super Landroid/content/ContextWrapper;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛷᛵᛵᲈ:Lxhss/ᲁᲁᛵᲇ;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroid/content/ContextWrapper;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᲁᲁᛵᲇ;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-direct {v0, p1}, Lxhss/ᲁᲁᛵᲇ;-><init>(Ljava/lang/ClassLoader;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lxhss/ᛴᲀᛵᛱ;->ᛷᛵᛵᲈ:Lxhss/ᲁᲁᛵᲇ;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getClassLoader()Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᛴᲀᛵᛱ;->ᛷᛵᛵᲈ:Lxhss/ᲁᲁᛵᲇ;

    .line 2
    .line 3
    return-object p0
.end method
