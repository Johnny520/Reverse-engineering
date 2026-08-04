.class public final Lyyds/ᛲᲈᲀᛵ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# instance fields
.field public ᛱᲈᲁ:Landroid/content/DialogInterface$OnClickListener;

.field public ᛲᛳᛶᲁ:Z

.field public ᛲᛴᛳᛲ:Landroid/view/View;

.field public final ᛲᲈᲁ:Landroid/view/ContextThemeWrapper;

.field public final ᛵᛸᛸᛷ:Landroid/view/LayoutInflater;

.field public ᛶᛷᛲᲁ:Landroid/widget/ListAdapter;

.field public ᛷᲈᲈᲁ:I

.field public ᲀᛲᛳᲀ:Landroid/graphics/drawable/Drawable;

.field public ᲇᲇᲇᛱ:Lyyds/ᲁᲇᛵᛱ;

.field public ᲇᲈᛵᛷ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, Lyyds/ᛲᲈᲀᛵ;->ᛷᲈᲈᲁ:I

    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛲᲈᲀᛵ;->ᛲᲈᲁ:Landroid/view/ContextThemeWrapper;

    .line 8
    .line 9
    const-string v0, "layout_inflater"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    check-cast p1, Landroid/view/LayoutInflater;

    .line 16
    .line 17
    iput-object p1, p0, Lyyds/ᛲᲈᲀᛵ;->ᛵᛸᛸᛷ:Landroid/view/LayoutInflater;

    .line 18
    .line 19
    return-void
.end method
