.class public final Lyyds/ᲈᛵᲀᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public final ᛲᲈᲁ:Landroid/content/res/ColorStateList;

.field public final ᛵᛸᛸᛷ:Landroid/content/res/Configuration;

.field public final ᲀᛲᛳᲀ:I


# direct methods
.method public constructor <init>(Landroid/content/res/ColorStateList;Landroid/content/res/Configuration;Landroid/content/res/Resources$Theme;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᛵᲀᛳ;->ᛲᲈᲁ:Landroid/content/res/ColorStateList;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᛵᲀᛳ;->ᛵᛸᛸᛷ:Landroid/content/res/Configuration;

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
    iput p1, p0, Lyyds/ᲈᛵᲀᛳ;->ᲀᛲᛳᲀ:I

    .line 17
    .line 18
    return-void
.end method
