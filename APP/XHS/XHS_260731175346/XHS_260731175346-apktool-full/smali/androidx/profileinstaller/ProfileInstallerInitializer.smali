.class public Landroidx/profileinstaller/ProfileInstallerInitializer;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛶᛲᛵᲁ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lxhss/\u16f6\u16f2\u16f5\u1c81;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Landroid/content/Context;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Lxhss/ᛷᛳᛴᛸ;

    .line 6
    .line 7
    invoke-direct {v0, p0, p1}, Lxhss/ᛷᛳᛴᛸ;-><init>(Landroidx/profileinstaller/ProfileInstallerInitializer;Landroid/content/Context;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lxhss/ᛴᛵᛱᲇ;->ᛷᛵᛵᲈ(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    new-instance p0, Lxhss/ᛶᛵᲇᛸ;

    .line 14
    .line 15
    const/16 p1, 0xf

    .line 16
    .line 17
    invoke-direct {p0, p1}, Lxhss/ᛶᛵᲇᛸ;-><init>(I)V

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public final ᛷᛵᛵᲈ()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method
