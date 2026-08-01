.class public final Lxhss/ᛲᛶᛵᲇ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Landroid/content/res/Configuration;

.field public final ᛳᲁᲇᛸ:I

.field public final ᛷᛵᛵᲈ:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>(Landroid/content/res/ColorStateList;Landroid/content/res/Configuration;Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛲᛶᛵᲇ;->ᛷᛵᛵᲈ:Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    iput-object p2, p0, Lxhss/ᛲᛶᛵᲇ;->ᛱᛱᛲᲇ:Landroid/content/res/Configuration;

    .line 7
    .line 8
    if-nez p3, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p3}, Landroid/content/res/Resources$Theme;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    :goto_0
    iput p1, p0, Lxhss/ᛲᛶᛵᲇ;->ᛳᲁᲇᛸ:I

    .line 17
    .line 18
    return-void
.end method
